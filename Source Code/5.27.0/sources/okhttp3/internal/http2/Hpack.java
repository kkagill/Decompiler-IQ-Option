package okhttp3.internal.http2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

final class Hpack {
    static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX = nameToFirstIndex();
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    static final Header[] STATIC_HEADER_TABLE;

    static final class Reader {
        Header[] dynamicTable;
        int dynamicTableByteCount;
        int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final BufferedSource source;

        Reader(int i, Source source) {
            this(i, i, source);
        }

        Reader(int i, int i2, Source source) {
            this.headerList = new ArrayList();
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.source = Okio.buffer(source);
        }

        /* Access modifiers changed, original: 0000 */
        public int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        private void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int i) {
            int i2 = 0;
            if (i > 0) {
                Header[] headerArr;
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    if (length < this.nextHeaderIndex || i <= 0) {
                        headerArr = this.dynamicTable;
                        length = this.nextHeaderIndex;
                        System.arraycopy(headerArr, length + 1, headerArr, (length + 1) + i2, this.headerCount);
                        this.nextHeaderIndex += i2;
                    } else {
                        i -= this.dynamicTable[length].hpackSize;
                        this.dynamicTableByteCount -= this.dynamicTable[length].hpackSize;
                        this.headerCount--;
                        i2++;
                    }
                }
                headerArr = this.dynamicTable;
                length = this.nextHeaderIndex;
                System.arraycopy(headerArr, length + 1, headerArr, (length + 1) + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        /* Access modifiers changed, original: 0000 */
        public void readHeaders() {
            while (!this.source.exhausted()) {
                int readByte = this.source.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    readIndexedHeader(readInt(readByte, Hpack.PREFIX_7_BITS) - 1);
                } else if (readByte == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((readByte & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    this.maxDynamicTableByteCount = readInt(readByte, 31);
                    readByte = this.maxDynamicTableByteCount;
                    if (readByte < 0 || readByte > this.headerTableSizeSetting) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid dynamic table size update ");
                        stringBuilder.append(this.maxDynamicTableByteCount);
                        throw new IOException(stringBuilder.toString());
                    }
                    adjustDynamicTableByteCount();
                } else if (readByte == 16 || readByte == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(readByte, 15) - 1);
                }
            }
        }

        public List<Header> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.headerList);
            this.headerList.clear();
            return arrayList;
        }

        private void readIndexedHeader(int i) {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.STATIC_HEADER_TABLE[i]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    this.headerList.add(headerArr[dynamicTableIndex]);
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Header index too large ");
            stringBuilder.append(i + 1);
            throw new IOException(stringBuilder.toString());
        }

        private int dynamicTableIndex(int i) {
            return (this.nextHeaderIndex + 1) + i;
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i) {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingNewName() {
            this.headerList.add(new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private ByteString getName(int i) {
            if (isStaticHeader(i)) {
                return Hpack.STATIC_HEADER_TABLE[i].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    return headerArr[dynamicTableIndex].name;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Header index too large ");
            stringBuilder.append(i + 1);
            throw new IOException(stringBuilder.toString());
        }

        private boolean isStaticHeader(int i) {
            return i >= 0 && i <= Hpack.STATIC_HEADER_TABLE.length - 1;
        }

        private void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                i2 -= this.dynamicTable[dynamicTableIndex(i)].hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            i3 = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                i = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i > headerArr.length) {
                    Header[] headerArr2 = new Header[(headerArr.length * 2)];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                i = this.nextHeaderIndex;
                this.nextHeaderIndex = i - 1;
                this.dynamicTable[i] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i + (dynamicTableIndex(i) + i3)] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private int readByte() {
            return this.source.readByte() & 255;
        }

        /* Access modifiers changed, original: 0000 */
        public int readInt(int i, int i2) {
            i &= i2;
            if (i < i2) {
                return i;
            }
            i = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i);
                }
                i2 += (readByte & Hpack.PREFIX_7_BITS) << i;
                i += 7;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public ByteString readByteString() {
            int readByte = readByte();
            Object obj = (readByte & 128) == 128 ? 1 : null;
            readByte = readInt(readByte, Hpack.PREFIX_7_BITS);
            if (obj != null) {
                return ByteString.of(Huffman.get().decode(this.source.readByteArray((long) readByte)));
            }
            return this.source.readByteString((long) readByte);
        }
    }

    static final class Writer {
        private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
        private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
        Header[] dynamicTable;
        int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        int headerCount;
        int headerTableSizeSetting;
        int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        Writer(Buffer buffer) {
            this(4096, true, buffer);
        }

        Writer(int i, boolean z, Buffer buffer) {
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i;
            this.useCompression = z;
            this.out = buffer;
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int i) {
            int i2 = 0;
            if (i > 0) {
                Header[] headerArr;
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    if (length < this.nextHeaderIndex || i <= 0) {
                        headerArr = this.dynamicTable;
                        length = this.nextHeaderIndex;
                        System.arraycopy(headerArr, length + 1, headerArr, (length + 1) + i2, this.headerCount);
                        headerArr = this.dynamicTable;
                        length = this.nextHeaderIndex;
                        Arrays.fill(headerArr, length + 1, (length + 1) + i2, null);
                        this.nextHeaderIndex += i2;
                    } else {
                        i -= this.dynamicTable[length].hpackSize;
                        this.dynamicTableByteCount -= this.dynamicTable[length].hpackSize;
                        this.headerCount--;
                        i2++;
                    }
                }
                headerArr = this.dynamicTable;
                length = this.nextHeaderIndex;
                System.arraycopy(headerArr, length + 1, headerArr, (length + 1) + i2, this.headerCount);
                headerArr = this.dynamicTable;
                length = this.nextHeaderIndex;
                Arrays.fill(headerArr, length + 1, (length + 1) + i2, null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            i2 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i2 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            i2 = this.nextHeaderIndex;
            this.nextHeaderIndex = i2 - 1;
            this.dynamicTable[i2] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        /* Access modifiers changed, original: 0000 */
        public void writeHeaders(List<Header> list) {
            int i;
            if (this.emitDynamicTableSizeUpdate) {
                i = this.smallestHeaderTableSizeSetting;
                if (i < this.maxDynamicTableByteCount) {
                    writeInt(i, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            i = list.size();
            for (int i2 = 0; i2 < i; i2++) {
                int intValue;
                int i3;
                Header header = (Header) list.get(i2);
                ByteString toAsciiLowercase = header.name.toAsciiLowercase();
                ByteString byteString = header.value;
                Integer num = (Integer) Hpack.NAME_TO_FIRST_INDEX.get(toAsciiLowercase);
                if (num != null) {
                    intValue = num.intValue() + 1;
                    if (intValue > 1 && intValue < 8) {
                        if (Util.equal(Hpack.STATIC_HEADER_TABLE[intValue - 1].value, byteString)) {
                            i3 = intValue;
                        } else if (Util.equal(Hpack.STATIC_HEADER_TABLE[intValue].value, byteString)) {
                            i3 = intValue;
                            intValue++;
                        }
                    }
                    i3 = intValue;
                    intValue = -1;
                } else {
                    intValue = -1;
                    i3 = -1;
                }
                if (intValue == -1) {
                    int length = this.dynamicTable.length;
                    for (int i4 = this.nextHeaderIndex + 1; i4 < length; i4++) {
                        if (Util.equal(this.dynamicTable[i4].name, toAsciiLowercase)) {
                            if (Util.equal(this.dynamicTable[i4].value, byteString)) {
                                intValue = Hpack.STATIC_HEADER_TABLE.length + (i4 - this.nextHeaderIndex);
                                break;
                            } else if (i3 == -1) {
                                i3 = (i4 - this.nextHeaderIndex) + Hpack.STATIC_HEADER_TABLE.length;
                            }
                        }
                    }
                }
                if (intValue != -1) {
                    writeInt(intValue, Hpack.PREFIX_7_BITS, 128);
                } else if (i3 == -1) {
                    this.out.writeByte(64);
                    writeByteString(toAsciiLowercase);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                } else if (!toAsciiLowercase.startsWith(Header.PSEUDO_PREFIX) || Header.TARGET_AUTHORITY.equals(toAsciiLowercase)) {
                    writeInt(i3, 63, 64);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                } else {
                    writeInt(i3, 15, 0);
                    writeByteString(byteString);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.writeByte(i | i3);
                return;
            }
            this.out.writeByte(i3 | i2);
            i -= i2;
            while (i >= 128) {
                this.out.writeByte(128 | (i & Hpack.PREFIX_7_BITS));
                i >>>= 7;
            }
            this.out.writeByte(i);
        }

        /* Access modifiers changed, original: 0000 */
        public void writeByteString(ByteString byteString) {
            if (!this.useCompression || Huffman.get().encodedLength(byteString) >= byteString.size()) {
                writeInt(byteString.size(), Hpack.PREFIX_7_BITS, 0);
                this.out.write(byteString);
                return;
            }
            Buffer buffer = new Buffer();
            Huffman.get().encode(byteString, buffer);
            byteString = buffer.readByteString();
            writeInt(byteString.size(), Hpack.PREFIX_7_BITS, 128);
            this.out.write(byteString);
        }

        /* Access modifiers changed, original: 0000 */
        public void setHeaderTableSizeSetting(int i) {
            this.headerTableSizeSetting = i;
            i = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 != i) {
                if (i < i2) {
                    this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, i);
                }
                this.emitDynamicTableSizeUpdate = true;
                this.maxDynamicTableByteCount = i;
                adjustDynamicTableByteCount();
            }
        }

        private void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }
    }

    static {
        r0 = new Header[61];
        String str = "";
        r0[0] = new Header(Header.TARGET_AUTHORITY, str);
        r0[1] = new Header(Header.TARGET_METHOD, "GET");
        r0[2] = new Header(Header.TARGET_METHOD, "POST");
        r0[3] = new Header(Header.TARGET_PATH, "/");
        r0[4] = new Header(Header.TARGET_PATH, "/index.html");
        r0[5] = new Header(Header.TARGET_SCHEME, "http");
        r0[6] = new Header(Header.TARGET_SCHEME, "https");
        r0[7] = new Header(Header.RESPONSE_STATUS, "200");
        r0[8] = new Header(Header.RESPONSE_STATUS, "204");
        r0[9] = new Header(Header.RESPONSE_STATUS, "206");
        r0[10] = new Header(Header.RESPONSE_STATUS, "304");
        r0[11] = new Header(Header.RESPONSE_STATUS, "400");
        r0[12] = new Header(Header.RESPONSE_STATUS, "404");
        r0[13] = new Header(Header.RESPONSE_STATUS, "500");
        r0[14] = new Header("accept-charset", str);
        r0[15] = new Header("accept-encoding", "gzip, deflate");
        r0[16] = new Header("accept-language", str);
        r0[17] = new Header("accept-ranges", str);
        r0[18] = new Header("accept", str);
        r0[19] = new Header("access-control-allow-origin", str);
        r0[20] = new Header("age", str);
        r0[21] = new Header("allow", str);
        r0[22] = new Header("authorization", str);
        r0[23] = new Header("cache-control", str);
        r0[24] = new Header("content-disposition", str);
        r0[25] = new Header("content-encoding", str);
        r0[26] = new Header("content-language", str);
        r0[27] = new Header("content-length", str);
        r0[28] = new Header("content-location", str);
        r0[29] = new Header("content-range", str);
        r0[30] = new Header("content-type", str);
        r0[31] = new Header("cookie", str);
        r0[32] = new Header("date", str);
        r0[33] = new Header("etag", str);
        r0[34] = new Header("expect", str);
        r0[35] = new Header("expires", str);
        r0[36] = new Header("from", str);
        r0[37] = new Header("host", str);
        r0[38] = new Header("if-match", str);
        r0[39] = new Header("if-modified-since", str);
        r0[40] = new Header("if-none-match", str);
        r0[41] = new Header("if-range", str);
        r0[42] = new Header("if-unmodified-since", str);
        r0[43] = new Header("last-modified", str);
        r0[44] = new Header("link", str);
        r0[45] = new Header("location", str);
        r0[46] = new Header("max-forwards", str);
        r0[47] = new Header("proxy-authenticate", str);
        r0[48] = new Header("proxy-authorization", str);
        r0[49] = new Header("range", str);
        r0[50] = new Header("referer", str);
        r0[51] = new Header("refresh", str);
        r0[52] = new Header("retry-after", str);
        r0[53] = new Header("server", str);
        r0[54] = new Header("set-cookie", str);
        r0[55] = new Header("strict-transport-security", str);
        r0[56] = new Header("transfer-encoding", str);
        r0[57] = new Header("user-agent", str);
        r0[58] = new Header("vary", str);
        r0[59] = new Header("via", str);
        r0[60] = new Header("www-authenticate", str);
        STATIC_HEADER_TABLE = r0;
    }

    private Hpack() {
    }

    private static Map<ByteString, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(STATIC_HEADER_TABLE.length);
        int i = 0;
        while (true) {
            Header[] headerArr = STATIC_HEADER_TABLE;
            if (i >= headerArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(headerArr[i].name)) {
                linkedHashMap.put(STATIC_HEADER_TABLE[i].name, Integer.valueOf(i));
            }
            i++;
        }
    }

    static ByteString checkLowercase(ByteString byteString) {
        int size = byteString.size();
        int i = 0;
        while (i < size) {
            byte b = byteString.getByte(i);
            if (b < (byte) 65 || b > (byte) 90) {
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                stringBuilder.append(byteString.utf8());
                throw new IOException(stringBuilder.toString());
            }
        }
        return byteString;
    }
}
