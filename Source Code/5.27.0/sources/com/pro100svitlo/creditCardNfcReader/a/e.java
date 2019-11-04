package com.pro100svitlo.creditCardNfcReader.a;

import com.pro100svitlo.creditCardNfcReader.exception.TlvException;
import com.pro100svitlo.creditCardNfcReader.iso7816emv.ITag;
import com.pro100svitlo.creditCardNfcReader.iso7816emv.b;
import com.pro100svitlo.creditCardNfcReader.iso7816emv.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.a;

/* compiled from: TlvUtil */
public final class e {
    private static ITag R(byte[] bArr) {
        return b.D(bArr);
    }

    public static byte[] a(ByteArrayInputStream byteArrayInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte read = (byte) byteArrayInputStream.read();
        byteArrayOutputStream.write(read);
        if ((read & 31) == 31) {
            while (true) {
                int read2 = byteArrayInputStream.read();
                if (read2 >= 0) {
                    read = (byte) read2;
                    byteArrayOutputStream.write(read);
                    if (!b.a.a.b.aL(read, 7) || (b.a.a.b.aL(read, 7) && (read & 127) == 0)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int b(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read();
        if (read < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Negative length: ");
            stringBuilder.append(read);
            throw new TlvException(stringBuilder.toString());
        } else if (read <= 127 || read == 128) {
            return read;
        } else {
            read &= 127;
            int i = 0;
            int i2 = 0;
            while (i < read) {
                int read2 = byteArrayInputStream.read();
                if (read2 >= 0) {
                    i2 = (i2 << 8) | read2;
                    i++;
                } else {
                    throw new TlvException("EOS when reading length bytes");
                }
            }
            return i2;
        }
    }

    public static d c(ByteArrayInputStream byteArrayInputStream) {
        String str = "Error parsing data. Available bytes < 2 . Length=";
        StringBuilder stringBuilder;
        if (byteArrayInputStream.available() >= 2) {
            byteArrayInputStream.mark(0);
            int read = byteArrayInputStream.read();
            while (true) {
                byte b = (byte) read;
                if (read == -1 || !(b == (byte) -1 || b == (byte) 0)) {
                    byteArrayInputStream.reset();
                } else {
                    byteArrayInputStream.mark(0);
                    read = byteArrayInputStream.read();
                }
            }
            byteArrayInputStream.reset();
            if (byteArrayInputStream.available() >= 2) {
                byte[] a = a(byteArrayInputStream);
                byteArrayInputStream.mark(0);
                int available = byteArrayInputStream.available();
                read = b(byteArrayInputStream);
                int available2 = byteArrayInputStream.available();
                byteArrayInputStream.reset();
                byte[] bArr = new byte[(available - available2)];
                if (bArr.length < 1 || bArr.length > 4) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Number of length bytes must be from 1 to 4. Found ");
                    stringBuilder2.append(bArr.length);
                    throw new TlvException(stringBuilder2.toString());
                }
                byte[] bArr2;
                byteArrayInputStream.read(bArr, 0, bArr.length);
                available2 = b.a.a.b.T(bArr);
                ITag R = R(a);
                StringBuilder stringBuilder3;
                if (available2 == 128) {
                    byteArrayInputStream.mark(0);
                    read = 0;
                    available2 = 1;
                    while (true) {
                        read++;
                        int read2 = byteArrayInputStream.read();
                        if (read2 >= 0) {
                            if (available2 == 0 && read2 == 0) {
                                read -= 2;
                                bArr2 = new byte[read];
                                byteArrayInputStream.reset();
                                byteArrayInputStream.read(bArr2, 0, read);
                                break;
                            }
                            available2 = read2;
                        } else {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Error parsing data. TLV length byte indicated indefinite length, but EOS was reached before 0x0000 was found");
                            stringBuilder3.append(byteArrayInputStream.available());
                            throw new TlvException(stringBuilder3.toString());
                        }
                    }
                } else if (byteArrayInputStream.available() < read) {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Length byte(s) indicated ");
                    stringBuilder3.append(read);
                    stringBuilder3.append(" value bytes, but only ");
                    stringBuilder3.append(byteArrayInputStream.available());
                    stringBuilder3.append(" ");
                    stringBuilder3.append(byteArrayInputStream.available() > 1 ? "are" : "is");
                    stringBuilder3.append(" available");
                    throw new TlvException(stringBuilder3.toString());
                } else {
                    bArr2 = new byte[read];
                    byteArrayInputStream.read(bArr2, 0, read);
                }
                byteArrayInputStream.mark(0);
                int read3 = byteArrayInputStream.read();
                while (true) {
                    byte b2 = (byte) read3;
                    if (read3 == -1 || !(b2 == (byte) -1 || b2 == (byte) 0)) {
                        byteArrayInputStream.reset();
                    } else {
                        byteArrayInputStream.mark(0);
                        read3 = byteArrayInputStream.read();
                    }
                }
                byteArrayInputStream.reset();
                return new d(R, read, bArr, bArr2);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(byteArrayInputStream.available());
            throw new TlvException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(byteArrayInputStream.available());
        throw new TlvException(stringBuilder.toString());
    }

    public static List<com.pro100svitlo.creditCardNfcReader.iso7816emv.e> S(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (byteArrayInputStream.available() > 0) {
                if (byteArrayInputStream.available() >= 2) {
                    arrayList.add(new com.pro100svitlo.creditCardNfcReader.iso7816emv.e(R(a(byteArrayInputStream)), b(byteArrayInputStream)));
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Data length < 2 : ");
                    stringBuilder.append(byteArrayInputStream.available());
                    throw new TlvException(stringBuilder.toString());
                }
            }
        }
        return arrayList;
    }

    public static List<d> a(byte[] bArr, ITag... iTagArr) {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() > 0) {
            d c = c(byteArrayInputStream);
            if (a.contains(iTagArr, c.bgy())) {
                arrayList.add(c);
            } else if (c.bgy().bgw()) {
                arrayList.addAll(a(c.bgz(), iTagArr));
            }
        }
        return arrayList;
    }

    public static byte[] b(byte[] bArr, ITag... iTagArr) {
        byte[] bArr2 = null;
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (byteArrayInputStream.available() > 0) {
                d c = c(byteArrayInputStream);
                if (a.contains(iTagArr, c.bgy())) {
                    return c.bgz();
                }
                if (c.bgy().bgw()) {
                    bArr2 = b(c.bgz(), iTagArr);
                    if (bArr2 != null) {
                        break;
                    }
                }
            }
        }
        return bArr2;
    }

    public static int bM(List<com.pro100svitlo.creditCardNfcReader.iso7816emv.e> list) {
        int i = 0;
        if (list != null) {
            for (com.pro100svitlo.creditCardNfcReader.iso7816emv.e length : list) {
                i += length.getLength();
            }
        }
        return i;
    }
}
