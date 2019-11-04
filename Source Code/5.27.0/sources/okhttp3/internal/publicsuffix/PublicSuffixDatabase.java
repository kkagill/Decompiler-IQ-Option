package okhttp3.internal.publicsuffix;

import java.io.Closeable;
import java.io.InputStream;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.Util;
import okio.GzipSource;
import okio.Okio;

public final class PublicSuffixDatabase {
    private static final String[] EMPTY_RULE = new String[0];
    private static final byte EXCEPTION_MARKER = (byte) 33;
    private static final String[] PREVAILING_RULE = new String[]{"*"};
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = new byte[]{(byte) 42};
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static PublicSuffixDatabase get() {
        return instance;
    }

    public String getEffectiveTldPlusOne(String str) {
        if (str != null) {
            String str2 = "\\.";
            String[] split = IDN.toUnicode(str).split(str2);
            String[] findMatchingRule = findMatchingRule(split);
            if (split.length == findMatchingRule.length && findMatchingRule[0].charAt(0) != '!') {
                return null;
            }
            int length;
            int length2;
            if (findMatchingRule[0].charAt(0) == '!') {
                length = split.length;
                length2 = findMatchingRule.length;
            } else {
                length = split.length;
                length2 = findMatchingRule.length + 1;
            }
            StringBuilder stringBuilder = new StringBuilder();
            String[] split2 = str.split(str2);
            for (length -= length2; length < split2.length; length++) {
                stringBuilder.append(split2[length]);
                stringBuilder.append('.');
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            return stringBuilder.toString();
        }
        throw new NullPointerException("domain == null");
    }

    private String[] findMatchingRule(String[] strArr) {
        String binarySearchBytes;
        String binarySearchBytes2;
        String binarySearchBytes3;
        int i = 0;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        synchronized (this) {
            if (this.publicSuffixListBytes != null) {
            } else {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        byte[][] bArr = new byte[strArr.length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(Util.UTF_8);
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            binarySearchBytes = binarySearchBytes(this.publicSuffixListBytes, bArr, i3);
            if (binarySearchBytes != null) {
                break;
            }
        }
        binarySearchBytes = null;
        if (bArr.length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = WILDCARD_LABEL;
                binarySearchBytes2 = binarySearchBytes(this.publicSuffixListBytes, bArr2, i4);
                if (binarySearchBytes2 != null) {
                    break;
                }
            }
        }
        binarySearchBytes2 = null;
        if (binarySearchBytes2 != null) {
            while (i < bArr.length - 1) {
                binarySearchBytes3 = binarySearchBytes(this.publicSuffixExceptionListBytes, bArr, i);
                if (binarySearchBytes3 != null) {
                    break;
                }
                i++;
            }
        }
        binarySearchBytes3 = null;
        if (binarySearchBytes3 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("!");
            stringBuilder.append(binarySearchBytes3);
            return stringBuilder.toString().split("\\.");
        } else if (binarySearchBytes == null && binarySearchBytes2 == null) {
            return PREVAILING_RULE;
        } else {
            String[] split;
            if (binarySearchBytes != null) {
                strArr = binarySearchBytes.split("\\.");
            } else {
                strArr = EMPTY_RULE;
            }
            if (binarySearchBytes2 != null) {
                split = binarySearchBytes2.split("\\.");
            } else {
                split = EMPTY_RULE;
            }
            if (strArr.length <= split.length) {
                strArr = split;
            }
            return strArr;
        }
    }

    private static String binarySearchBytes(byte[] bArr, byte[][] bArr2, int i) {
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i2 = 0;
        while (i2 < length) {
            int i3;
            int i4;
            int i5 = (i2 + length) / 2;
            while (i5 > -1 && bArr3[i5] != (byte) 10) {
                i5--;
            }
            i5++;
            int i6 = 1;
            while (true) {
                i3 = i5 + i6;
                if (bArr3[i3] == (byte) 10) {
                    break;
                }
                i6++;
            }
            int i7 = i3 - i5;
            int i8 = i;
            Object obj = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (obj != null) {
                    obj = null;
                    i4 = 46;
                } else {
                    i4 = bArr4[i8][i9] & 255;
                }
                i4 -= bArr3[i5 + i10] & 255;
                if (i4 == 0) {
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    } else if (bArr4[i8].length == i9) {
                        if (i8 == bArr4.length - 1) {
                            break;
                        }
                        i8++;
                        obj = 1;
                        i9 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i11 = i7 - i10;
                    int length2 = bArr4[i8].length - i9;
                    while (true) {
                        i8++;
                        if (i8 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i8].length;
                    }
                    if (length2 >= i11) {
                        if (length2 <= i11) {
                            return new String(bArr3, i5, i7, Util.UTF_8);
                        }
                    }
                }
                i2 = i3 + 1;
            }
            length = i5 - 1;
        }
        return null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0025 */
    private void readTheListUninterruptibly() {
        /*
        r5 = this;
        r0 = 0;
    L_0x0001:
        r5.readTheList();	 Catch:{ InterruptedIOException -> 0x0025, IOException -> 0x0010 }
        if (r0 == 0) goto L_0x000d;
    L_0x0006:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x000d:
        return;
    L_0x000e:
        r1 = move-exception;
        goto L_0x002a;
    L_0x0010:
        r1 = move-exception;
        r2 = okhttp3.internal.platform.Platform.get();	 Catch:{ all -> 0x000e }
        r3 = 5;
        r4 = "Failed to read public suffix list";
        r2.log(r3, r4, r1);	 Catch:{ all -> 0x000e }
        if (r0 == 0) goto L_0x0024;
    L_0x001d:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0024:
        return;
    L_0x0025:
        java.lang.Thread.interrupted();	 Catch:{ all -> 0x000e }
        r0 = 1;
        goto L_0x0001;
    L_0x002a:
        if (r0 == 0) goto L_0x0033;
    L_0x002c:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0033:
        goto L_0x0035;
    L_0x0034:
        throw r1;
    L_0x0035:
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheListUninterruptibly():void");
    }

    private void readTheList() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream != null) {
            Closeable buffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
            try {
                byte[] bArr = new byte[buffer.readInt()];
                buffer.readFully(bArr);
                byte[] bArr2 = new byte[buffer.readInt()];
                buffer.readFully(bArr2);
                synchronized (this) {
                    this.publicSuffixListBytes = bArr;
                    this.publicSuffixExceptionListBytes = bArr2;
                }
                this.readCompleteLatch.countDown();
            } finally {
                Util.closeQuietly(buffer);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
