package com.iqoption.core.connect.http.cookie.persistence;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.i;
import okhttp3.Cookie;
import okhttp3.Cookie.Builder;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/connect/http/cookie/persistence/SerializableCookie;", "Ljava/io/Serializable;", "()V", "cookie", "Lokhttp3/Cookie;", "decode", "encodedCookie", "", "encode", "readObject", "", "in", "Ljava/io/ObjectInputStream;", "writeObject", "out", "Ljava/io/ObjectOutputStream;", "Companion", "core_release"})
/* compiled from: SerializableCookie.kt */
public final class SerializableCookie implements Serializable {
    private static final String TAG = SerializableCookie.class.getSimpleName();
    public static final a bbh = new a();
    private static final long serialVersionUID = -8594045714036645534L;
    private transient Cookie bbe;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/connect/http/cookie/persistence/SerializableCookie$Companion;", "", "()V", "NON_VALID_EXPIRES_AT", "", "TAG", "", "kotlin.jvm.PlatformType", "serialVersionUID", "byteArrayToHexString", "bytes", "", "hexStringToByteArray", "hexString", "core_release"})
    /* compiled from: SerializableCookie.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final String k(byte[] bArr) {
            StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
            for (byte b : bArr) {
                int i = b & 255;
                if (i < 16) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(Integer.toHexString(i));
            }
            String stringBuilder2 = stringBuilder.toString();
            kotlin.jvm.internal.i.e(stringBuilder2, "sb.toString()");
            return stringBuilder2;
        }

        private final byte[] fy(String str) {
            int length = str.length();
            byte[] bArr = new byte[(length / 2)];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d A:{SYNTHETIC, Splitter:B:22:0x003d} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A:{SYNTHETIC, Splitter:B:16:0x0036} */
    public final java.lang.String d(okhttp3.Cookie r5) {
        /*
        r4 = this;
        r0 = "cookie";
        kotlin.jvm.internal.i.f(r5, r0);
        r4.bbe = r5;
        r5 = new java.io.ByteArrayOutputStream;
        r5.<init>();
        r0 = 0;
        r1 = r0;
        r1 = (java.io.ObjectOutputStream) r1;
        r2 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x003a, all -> 0x0033 }
        r3 = r5;
        r3 = (java.io.OutputStream) r3;	 Catch:{ IOException -> 0x003a, all -> 0x0033 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x003a, all -> 0x0033 }
        r2.writeObject(r4);	 Catch:{ IOException -> 0x0031, all -> 0x002e }
        r2.close();	 Catch:{ IOException -> 0x001e }
    L_0x001e:
        r0 = bbh;
        r5 = r5.toByteArray();
        r1 = "byteArrayOutputStream.toByteArray()";
        kotlin.jvm.internal.i.e(r5, r1);
        r5 = r0.k(r5);
        return r5;
    L_0x002e:
        r5 = move-exception;
        r1 = r2;
        goto L_0x0034;
    L_0x0031:
        r1 = r2;
        goto L_0x003b;
    L_0x0033:
        r5 = move-exception;
    L_0x0034:
        if (r1 == 0) goto L_0x0039;
    L_0x0036:
        r1.close();	 Catch:{ IOException -> 0x0039 }
    L_0x0039:
        throw r5;
    L_0x003b:
        if (r1 == 0) goto L_0x0040;
    L_0x003d:
        r1.close();	 Catch:{ IOException -> 0x0040 }
    L_0x0040:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.connect.http.cookie.persistence.SerializableCookie.d(okhttp3.Cookie):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A:{SYNTHETIC, Splitter:B:18:0x003e} */
    /* JADX WARNING: Missing block: B:24:0x0043, code skipped:
            if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Missing block: B:27:0x0047, code skipped:
            if (r2 != null) goto L_0x0027;
     */
    public final okhttp3.Cookie fx(java.lang.String r4) {
        /*
        r3 = this;
        r0 = "encodedCookie";
        kotlin.jvm.internal.i.f(r4, r0);
        r0 = bbh;
        r4 = r0.fy(r4);
        r0 = new java.io.ByteArrayInputStream;
        r0.<init>(r4);
        r4 = 0;
        r1 = r4;
        r1 = (okhttp3.Cookie) r1;
        r4 = (java.io.ObjectInputStream) r4;
        r2 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x0046, ClassNotFoundException -> 0x0042, all -> 0x0039 }
        r0 = (java.io.InputStream) r0;	 Catch:{ IOException -> 0x0046, ClassNotFoundException -> 0x0042, all -> 0x0039 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0046, ClassNotFoundException -> 0x0042, all -> 0x0039 }
        r4 = r2.readObject();	 Catch:{ IOException -> 0x0037, ClassNotFoundException -> 0x0035, all -> 0x0033 }
        if (r4 == 0) goto L_0x002b;
    L_0x0023:
        r4 = (com.iqoption.core.connect.http.cookie.persistence.SerializableCookie) r4;	 Catch:{ IOException -> 0x0037, ClassNotFoundException -> 0x0035, all -> 0x0033 }
        r1 = r4.bbe;	 Catch:{ IOException -> 0x0037, ClassNotFoundException -> 0x0035, all -> 0x0033 }
    L_0x0027:
        r2.close();	 Catch:{ IOException -> 0x004a }
        goto L_0x004a;
    L_0x002b:
        r4 = new kotlin.TypeCastException;	 Catch:{ IOException -> 0x0037, ClassNotFoundException -> 0x0035, all -> 0x0033 }
        r0 = "null cannot be cast to non-null type com.iqoption.core.connect.http.cookie.persistence.SerializableCookie";
        r4.<init>(r0);	 Catch:{ IOException -> 0x0037, ClassNotFoundException -> 0x0035, all -> 0x0033 }
        throw r4;	 Catch:{ IOException -> 0x0037, ClassNotFoundException -> 0x0035, all -> 0x0033 }
    L_0x0033:
        r4 = move-exception;
        goto L_0x003c;
        goto L_0x0043;
        goto L_0x0047;
    L_0x0039:
        r0 = move-exception;
        r2 = r4;
        r4 = r0;
    L_0x003c:
        if (r2 == 0) goto L_0x0041;
    L_0x003e:
        r2.close();	 Catch:{ IOException -> 0x0041 }
    L_0x0041:
        throw r4;
    L_0x0042:
        r2 = r4;
    L_0x0043:
        if (r2 == 0) goto L_0x004a;
    L_0x0045:
        goto L_0x0027;
    L_0x0046:
        r2 = r4;
    L_0x0047:
        if (r2 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x0027;
    L_0x004a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.connect.http.cookie.persistence.SerializableCookie.fx(java.lang.String):okhttp3.Cookie");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        long expiresAt;
        Cookie cookie = this.bbe;
        if (cookie == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        objectOutputStream.writeObject(cookie.name());
        cookie = this.bbe;
        if (cookie == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        objectOutputStream.writeObject(cookie.value());
        cookie = this.bbe;
        if (cookie == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        if (cookie.persistent()) {
            cookie = this.bbe;
            if (cookie == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            expiresAt = cookie.expiresAt();
        } else {
            expiresAt = -1;
        }
        objectOutputStream.writeLong(expiresAt);
        cookie = this.bbe;
        if (cookie == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        objectOutputStream.writeObject(cookie.domain());
        cookie = this.bbe;
        if (cookie == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        objectOutputStream.writeObject(cookie.path());
        cookie = this.bbe;
        if (cookie == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        objectOutputStream.writeBoolean(cookie.secure());
        cookie = this.bbe;
        if (cookie == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        objectOutputStream.writeBoolean(cookie.httpOnly());
        cookie = this.bbe;
        if (cookie == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        objectOutputStream.writeBoolean(cookie.hostOnly());
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        Builder builder = new Builder();
        Object readObject = objectInputStream.readObject();
        String str = "null cannot be cast to non-null type kotlin.String";
        if (readObject != null) {
            builder.name((String) readObject);
            readObject = objectInputStream.readObject();
            if (readObject != null) {
                builder.value((String) readObject);
                long readLong = objectInputStream.readLong();
                if (readLong != -1) {
                    builder.expiresAt(readLong);
                }
                readObject = objectInputStream.readObject();
                if (readObject != null) {
                    String str2 = (String) readObject;
                    builder.domain(str2);
                    Object readObject2 = objectInputStream.readObject();
                    if (readObject2 != null) {
                        builder.path((String) readObject2);
                        if (objectInputStream.readBoolean()) {
                            builder.secure();
                        }
                        if (objectInputStream.readBoolean()) {
                            builder.httpOnly();
                        }
                        if (objectInputStream.readBoolean()) {
                            builder.hostOnlyDomain(str2);
                        }
                        this.bbe = builder.build();
                        return;
                    }
                    throw new TypeCastException(str);
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }
}
