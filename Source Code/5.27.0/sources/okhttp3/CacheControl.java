package okhttp3;

import java.util.concurrent.TimeUnit;

public final class CacheControl {
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    public static final class Builder {
        boolean immutable;
        int maxAgeSeconds = -1;
        int maxStaleSeconds = -1;
        int minFreshSeconds = -1;
        boolean noCache;
        boolean noStore;
        boolean noTransform;
        boolean onlyIfCached;

        public Builder noCache() {
            this.noCache = true;
            return this;
        }

        public Builder noStore() {
            this.noStore = true;
            return this;
        }

        public Builder maxAge(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long toSeconds = timeUnit.toSeconds((long) i);
                this.maxAgeSeconds = toSeconds > 2147483647L ? Integer.MAX_VALUE : (int) toSeconds;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("maxAge < 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder maxStale(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long toSeconds = timeUnit.toSeconds((long) i);
                this.maxStaleSeconds = toSeconds > 2147483647L ? Integer.MAX_VALUE : (int) toSeconds;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("maxStale < 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder minFresh(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long toSeconds = timeUnit.toSeconds((long) i);
                this.minFreshSeconds = toSeconds > 2147483647L ? Integer.MAX_VALUE : (int) toSeconds;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("minFresh < 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }

        public Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public Builder immutable() {
            this.immutable = true;
            return this;
        }

        public CacheControl build() {
            return new CacheControl(this);
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    CacheControl(Builder builder) {
        this.noCache = builder.noCache;
        this.noStore = builder.noStore;
        this.maxAgeSeconds = builder.maxAgeSeconds;
        this.sMaxAgeSeconds = -1;
        this.isPrivate = false;
        this.isPublic = false;
        this.mustRevalidate = false;
        this.maxStaleSeconds = builder.maxStaleSeconds;
        this.minFreshSeconds = builder.minFreshSeconds;
        this.onlyIfCached = builder.onlyIfCached;
        this.noTransform = builder.noTransform;
        this.immutable = builder.immutable;
    }

    public boolean noCache() {
        return this.noCache;
    }

    public boolean noStore() {
        return this.noStore;
    }

    public int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public boolean noTransform() {
        return this.noTransform;
    }

    public boolean immutable() {
        return this.immutable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    public static okhttp3.CacheControl parse(okhttp3.Headers r22) {
        /*
        r0 = r22;
        r1 = r22.size();
        r6 = 0;
        r7 = 1;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = -1;
        r12 = -1;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = -1;
        r17 = -1;
        r18 = 0;
        r19 = 0;
        r20 = 0;
    L_0x001a:
        if (r6 >= r1) goto L_0x0146;
    L_0x001c:
        r2 = r0.name(r6);
        r4 = r0.value(r6);
        r3 = "Cache-Control";
        r3 = r2.equalsIgnoreCase(r3);
        if (r3 == 0) goto L_0x0031;
    L_0x002c:
        if (r8 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0039;
    L_0x002f:
        r8 = r4;
        goto L_0x003a;
    L_0x0031:
        r3 = "Pragma";
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 == 0) goto L_0x013f;
    L_0x0039:
        r7 = 0;
    L_0x003a:
        r2 = 0;
    L_0x003b:
        r3 = r4.length();
        if (r2 >= r3) goto L_0x013f;
    L_0x0041:
        r3 = "=,;";
        r3 = okhttp3.internal.http.HttpHeaders.skipUntil(r4, r2, r3);
        r2 = r4.substring(r2, r3);
        r2 = r2.trim();
        r5 = r4.length();
        if (r3 == r5) goto L_0x0099;
    L_0x0055:
        r5 = r4.charAt(r3);
        r0 = 44;
        if (r5 == r0) goto L_0x0099;
    L_0x005d:
        r0 = r4.charAt(r3);
        r5 = 59;
        if (r0 != r5) goto L_0x0066;
    L_0x0065:
        goto L_0x0099;
    L_0x0066:
        r3 = r3 + 1;
        r0 = okhttp3.internal.http.HttpHeaders.skipWhitespace(r4, r3);
        r3 = r4.length();
        if (r0 >= r3) goto L_0x0089;
    L_0x0072:
        r3 = r4.charAt(r0);
        r5 = 34;
        if (r3 != r5) goto L_0x0089;
    L_0x007a:
        r0 = r0 + 1;
        r3 = "\"";
        r3 = okhttp3.internal.http.HttpHeaders.skipUntil(r4, r0, r3);
        r0 = r4.substring(r0, r3);
        r5 = 1;
        r3 = r3 + r5;
        goto L_0x009d;
    L_0x0089:
        r5 = 1;
        r3 = ",;";
        r3 = okhttp3.internal.http.HttpHeaders.skipUntil(r4, r0, r3);
        r0 = r4.substring(r0, r3);
        r0 = r0.trim();
        goto L_0x009d;
    L_0x0099:
        r5 = 1;
        r3 = r3 + 1;
        r0 = 0;
    L_0x009d:
        r5 = "no-cache";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00a9;
    L_0x00a5:
        r5 = -1;
        r9 = 1;
        goto L_0x013a;
    L_0x00a9:
        r5 = "no-store";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00b5;
    L_0x00b1:
        r5 = -1;
        r10 = 1;
        goto L_0x013a;
    L_0x00b5:
        r5 = "max-age";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00c5;
    L_0x00bd:
        r5 = -1;
        r0 = okhttp3.internal.http.HttpHeaders.parseSeconds(r0, r5);
        r11 = r0;
        goto L_0x013a;
    L_0x00c5:
        r5 = "s-maxage";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00d5;
    L_0x00cd:
        r5 = -1;
        r0 = okhttp3.internal.http.HttpHeaders.parseSeconds(r0, r5);
        r12 = r0;
        goto L_0x013a;
    L_0x00d5:
        r5 = "private";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00e0;
    L_0x00dd:
        r5 = -1;
        r13 = 1;
        goto L_0x013a;
    L_0x00e0:
        r5 = "public";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00eb;
    L_0x00e8:
        r5 = -1;
        r14 = 1;
        goto L_0x013a;
    L_0x00eb:
        r5 = "must-revalidate";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x00f6;
    L_0x00f3:
        r5 = -1;
        r15 = 1;
        goto L_0x013a;
    L_0x00f6:
        r5 = "max-stale";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x0109;
    L_0x00fe:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = okhttp3.internal.http.HttpHeaders.parseSeconds(r0, r2);
        r16 = r0;
        r5 = -1;
        goto L_0x013a;
    L_0x0109:
        r5 = "min-fresh";
        r5 = r5.equalsIgnoreCase(r2);
        if (r5 == 0) goto L_0x0119;
    L_0x0111:
        r5 = -1;
        r0 = okhttp3.internal.http.HttpHeaders.parseSeconds(r0, r5);
        r17 = r0;
        goto L_0x013a;
    L_0x0119:
        r5 = -1;
        r0 = "only-if-cached";
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x0125;
    L_0x0122:
        r18 = 1;
        goto L_0x013a;
    L_0x0125:
        r0 = "no-transform";
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x0130;
    L_0x012d:
        r19 = 1;
        goto L_0x013a;
    L_0x0130:
        r0 = "immutable";
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x013a;
    L_0x0138:
        r20 = 1;
    L_0x013a:
        r0 = r22;
        r2 = r3;
        goto L_0x003b;
    L_0x013f:
        r5 = -1;
        r6 = r6 + 1;
        r0 = r22;
        goto L_0x001a;
    L_0x0146:
        if (r7 != 0) goto L_0x014b;
    L_0x0148:
        r21 = 0;
        goto L_0x014d;
    L_0x014b:
        r21 = r8;
    L_0x014d:
        r0 = new okhttp3.CacheControl;
        r8 = r0;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.parse(okhttp3.Headers):okhttp3.CacheControl");
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        str = headerValue();
        this.headerValue = str;
        return str;
    }

    private String headerValue() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.noCache) {
            stringBuilder.append("no-cache, ");
        }
        if (this.noStore) {
            stringBuilder.append("no-store, ");
        }
        String str = ", ";
        if (this.maxAgeSeconds != -1) {
            stringBuilder.append("max-age=");
            stringBuilder.append(this.maxAgeSeconds);
            stringBuilder.append(str);
        }
        if (this.sMaxAgeSeconds != -1) {
            stringBuilder.append("s-maxage=");
            stringBuilder.append(this.sMaxAgeSeconds);
            stringBuilder.append(str);
        }
        if (this.isPrivate) {
            stringBuilder.append("private, ");
        }
        if (this.isPublic) {
            stringBuilder.append("public, ");
        }
        if (this.mustRevalidate) {
            stringBuilder.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            stringBuilder.append("max-stale=");
            stringBuilder.append(this.maxStaleSeconds);
            stringBuilder.append(str);
        }
        if (this.minFreshSeconds != -1) {
            stringBuilder.append("min-fresh=");
            stringBuilder.append(this.minFreshSeconds);
            stringBuilder.append(str);
        }
        if (this.onlyIfCached) {
            stringBuilder.append("only-if-cached, ");
        }
        if (this.noTransform) {
            stringBuilder.append("no-transform, ");
        }
        if (this.immutable) {
            stringBuilder.append("immutable, ");
        }
        if (stringBuilder.length() == 0) {
            return "";
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();
    }
}
