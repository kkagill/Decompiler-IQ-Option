package okhttp3;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;

public final class Cookie {
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;

    public static final class Builder {
        String domain;
        long expiresAt = HttpDate.MAX_DATE;
        boolean hostOnly;
        boolean httpOnly;
        String name;
        String path = "/";
        boolean persistent;
        boolean secure;
        String value;

        public Builder name(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.trim().equals(str)) {
                this.name = str;
                return this;
            } else {
                throw new IllegalArgumentException("name is not trimmed");
            }
        }

        public Builder value(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            } else if (str.trim().equals(str)) {
                this.value = str;
                return this;
            } else {
                throw new IllegalArgumentException("value is not trimmed");
            }
        }

        public Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > HttpDate.MAX_DATE) {
                j = HttpDate.MAX_DATE;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        public Builder domain(String str) {
            return domain(str, false);
        }

        public Builder hostOnlyDomain(String str) {
            return domain(str, true);
        }

        private Builder domain(String str, boolean z) {
            if (str != null) {
                String canonicalizeHost = Util.canonicalizeHost(str);
                if (canonicalizeHost != null) {
                    this.domain = canonicalizeHost;
                    this.hostOnly = z;
                    return this;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected domain: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new NullPointerException("domain == null");
        }

        public Builder path(String str) {
            if (str.startsWith("/")) {
                this.path = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        public Builder secure() {
            this.secure = true;
            return this;
        }

        public Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public Cookie build() {
            return new Cookie(this);
        }
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.hostOnly = z3;
        this.persistent = z4;
    }

    Cookie(Builder builder) {
        if (builder.name == null) {
            throw new NullPointerException("builder.name == null");
        } else if (builder.value == null) {
            throw new NullPointerException("builder.value == null");
        } else if (builder.domain != null) {
            this.name = builder.name;
            this.value = builder.value;
            this.expiresAt = builder.expiresAt;
            this.domain = builder.domain;
            this.path = builder.path;
            this.secure = builder.secure;
            this.httpOnly = builder.httpOnly;
            this.persistent = builder.persistent;
            this.hostOnly = builder.hostOnly;
        } else {
            throw new NullPointerException("builder.domain == null");
        }
    }

    public String name() {
        return this.name;
    }

    public String value() {
        return this.value;
    }

    public boolean persistent() {
        return this.persistent;
    }

    public long expiresAt() {
        return this.expiresAt;
    }

    public boolean hostOnly() {
        return this.hostOnly;
    }

    public String domain() {
        return this.domain;
    }

    public String path() {
        return this.path;
    }

    public boolean httpOnly() {
        return this.httpOnly;
    }

    public boolean secure() {
        return this.secure;
    }

    public boolean matches(HttpUrl httpUrl) {
        boolean equals;
        if (this.hostOnly) {
            equals = httpUrl.host().equals(this.domain);
        } else {
            equals = domainMatch(httpUrl.host(), this.domain);
        }
        if (!equals || !pathMatch(httpUrl, this.path)) {
            return false;
        }
        if (!this.secure || httpUrl.isHttps()) {
            return true;
        }
        return false;
    }

    private static boolean domainMatch(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.verifyAsIpAddress(str)) {
            return true;
        }
        return false;
    }

    private static boolean pathMatch(HttpUrl httpUrl, String str) {
        String encodedPath = httpUrl.encodedPath();
        if (encodedPath.equals(str)) {
            return true;
        }
        if (encodedPath.startsWith(str) && (str.endsWith("/") || encodedPath.charAt(str.length()) == '/')) {
            return true;
        }
        return false;
    }

    public static Cookie parse(HttpUrl httpUrl, String str) {
        return parse(System.currentTimeMillis(), httpUrl, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    static okhttp3.Cookie parse(long r24, okhttp3.HttpUrl r26, java.lang.String r27) {
        /*
        r0 = r27;
        r1 = r27.length();
        r2 = 59;
        r3 = 0;
        r4 = okhttp3.internal.Util.delimiterOffset(r0, r3, r1, r2);
        r5 = 61;
        r6 = okhttp3.internal.Util.delimiterOffset(r0, r3, r4, r5);
        r7 = 0;
        if (r6 != r4) goto L_0x0017;
    L_0x0016:
        return r7;
    L_0x0017:
        r9 = okhttp3.internal.Util.trimSubstring(r0, r3, r6);
        r8 = r9.isEmpty();
        if (r8 != 0) goto L_0x0146;
    L_0x0021:
        r8 = okhttp3.internal.Util.indexOfControlOrNonAscii(r9);
        r10 = -1;
        if (r8 == r10) goto L_0x002a;
    L_0x0028:
        goto L_0x0146;
    L_0x002a:
        r8 = 1;
        r6 = r6 + r8;
        r6 = okhttp3.internal.Util.trimSubstring(r0, r6, r4);
        r11 = okhttp3.internal.Util.indexOfControlOrNonAscii(r6);
        if (r11 == r10) goto L_0x0037;
    L_0x0036:
        return r7;
    L_0x0037:
        r4 = r4 + r8;
        r10 = -1;
        r12 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
        r8 = r7;
        r19 = r8;
        r14 = r10;
        r21 = r12;
        r17 = 0;
        r18 = 0;
        r20 = 1;
        r23 = 0;
    L_0x004d:
        if (r4 >= r1) goto L_0x00c1;
    L_0x004f:
        r7 = okhttp3.internal.Util.delimiterOffset(r0, r4, r1, r2);
        r2 = okhttp3.internal.Util.delimiterOffset(r0, r4, r7, r5);
        r4 = okhttp3.internal.Util.trimSubstring(r0, r4, r2);
        if (r2 >= r7) goto L_0x0064;
    L_0x005d:
        r2 = r2 + 1;
        r2 = okhttp3.internal.Util.trimSubstring(r0, r2, r7);
        goto L_0x0066;
    L_0x0064:
        r2 = "";
    L_0x0066:
        r5 = "expires";
        r5 = r4.equalsIgnoreCase(r5);
        if (r5 == 0) goto L_0x0079;
    L_0x006e:
        r4 = r2.length();	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r4 = parseExpires(r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r21 = r4;
        goto L_0x0086;
    L_0x0079:
        r5 = "max-age";
        r5 = r4.equalsIgnoreCase(r5);
        if (r5 == 0) goto L_0x0089;
    L_0x0081:
        r4 = parseMaxAge(r2);	 Catch:{  }
        r14 = r4;
    L_0x0086:
        r23 = 1;
        goto L_0x00b9;
    L_0x0089:
        r5 = "domain";
        r5 = r4.equalsIgnoreCase(r5);
        if (r5 == 0) goto L_0x0099;
    L_0x0091:
        r2 = parseDomain(r2);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r8 = r2;
        r20 = 0;
        goto L_0x00b9;
    L_0x0099:
        r5 = "path";
        r5 = r4.equalsIgnoreCase(r5);
        if (r5 == 0) goto L_0x00a4;
    L_0x00a1:
        r19 = r2;
        goto L_0x00b9;
    L_0x00a4:
        r2 = "secure";
        r2 = r4.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x00af;
    L_0x00ac:
        r17 = 1;
        goto L_0x00b9;
    L_0x00af:
        r2 = "httponly";
        r2 = r4.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x00b9;
    L_0x00b7:
        r18 = 1;
    L_0x00b9:
        r4 = r7 + 1;
        r2 = 59;
        r5 = 61;
        r7 = 0;
        goto L_0x004d;
    L_0x00c1:
        r0 = -9223372036854775808;
        r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x00c9;
    L_0x00c7:
        r11 = r0;
        goto L_0x00ee;
    L_0x00c9:
        r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));
        if (r0 == 0) goto L_0x00ec;
    L_0x00cd:
        r0 = 9223372036854775; // 0x20c49ba5e353f7 float:-3.943512E-16 double:4.663754807431093E-308;
        r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x00db;
    L_0x00d6:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r14 = r14 * r0;
        goto L_0x00e0;
    L_0x00db:
        r14 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x00e0:
        r0 = r24 + r14;
        r2 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1));
        if (r2 < 0) goto L_0x00ea;
    L_0x00e6:
        r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1));
        if (r2 <= 0) goto L_0x00c7;
    L_0x00ea:
        r11 = r12;
        goto L_0x00ee;
    L_0x00ec:
        r11 = r21;
    L_0x00ee:
        r0 = r26.host();
        if (r8 != 0) goto L_0x00f7;
    L_0x00f4:
        r13 = r0;
        r1 = 0;
        goto L_0x0101;
    L_0x00f7:
        r1 = domainMatch(r0, r8);
        if (r1 != 0) goto L_0x00ff;
    L_0x00fd:
        r1 = 0;
        return r1;
    L_0x00ff:
        r1 = 0;
        r13 = r8;
    L_0x0101:
        r0 = r0.length();
        r2 = r13.length();
        if (r0 == r2) goto L_0x0116;
    L_0x010b:
        r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.get();
        r0 = r0.getEffectiveTldPlusOne(r13);
        if (r0 != 0) goto L_0x0116;
    L_0x0115:
        return r1;
    L_0x0116:
        r0 = "/";
        r7 = r19;
        if (r7 == 0) goto L_0x0125;
    L_0x011c:
        r1 = r7.startsWith(r0);
        if (r1 != 0) goto L_0x0123;
    L_0x0122:
        goto L_0x0125;
    L_0x0123:
        r14 = r7;
        goto L_0x0136;
    L_0x0125:
        r1 = r26.encodedPath();
        r2 = 47;
        r2 = r1.lastIndexOf(r2);
        if (r2 == 0) goto L_0x0135;
    L_0x0131:
        r0 = r1.substring(r3, r2);
    L_0x0135:
        r14 = r0;
    L_0x0136:
        r0 = new okhttp3.Cookie;
        r8 = r0;
        r10 = r6;
        r15 = r17;
        r16 = r18;
        r17 = r20;
        r18 = r23;
        r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18);
        return r0;
    L_0x0146:
        r0 = r7;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.parse(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
    }

    private static long parseExpires(String str, int i, int i2) {
        i = dateCharacterOffset(str, i, i2, false);
        Matcher matcher = TIME_PATTERN.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (i < i2) {
            int dateCharacterOffset = dateCharacterOffset(str, i + 1, i2, true);
            matcher.region(i, dateCharacterOffset);
            if (i4 == -1 && matcher.usePattern(TIME_PATTERN).matches()) {
                i = Integer.parseInt(matcher.group(1));
                i4 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
                i7 = i4;
                i4 = i;
            } else if (i5 == -1 && matcher.usePattern(DAY_OF_MONTH_PATTERN).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(MONTH_PATTERN).matches()) {
                i6 = MONTH_PATTERN.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i3 == -1 && matcher.usePattern(YEAR_PATTERN).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
            }
            i = dateCharacterOffset(str, dateCharacterOffset + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    private static int dateCharacterOffset(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            int i3 = ((charAt >= ' ' || charAt == 9) && charAt < 127 && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':')))) ? 0 : 1;
            if (i3 == (z ^ 1)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static long parseMaxAge(String str) {
        long j = Long.MIN_VALUE;
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                j = parseLong;
            }
            return j;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                if (!str.startsWith("-")) {
                    j = Long.MAX_VALUE;
                }
                return j;
            }
            throw e;
        }
    }

    private static String parseDomain(String str) {
        String str2 = ".";
        if (str.endsWith(str2)) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(str2)) {
            str = str.substring(1);
        }
        str = Util.canonicalizeHost(str);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        List values = headers.values("Set-Cookie");
        int size = values.size();
        List list = null;
        for (int i = 0; i < size; i++) {
            Cookie parse = parse(httpUrl, (String) values.get(i));
            if (parse != null) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(parse);
            }
        }
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return Collections.emptyList();
    }

    public String toString() {
        return toString(false);
    }

    /* Access modifiers changed, original: 0000 */
    public String toString(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        stringBuilder.append('=');
        stringBuilder.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                stringBuilder.append("; max-age=0");
            } else {
                stringBuilder.append("; expires=");
                stringBuilder.append(HttpDate.format(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            stringBuilder.append("; domain=");
            if (z) {
                stringBuilder.append(".");
            }
            stringBuilder.append(this.domain);
        }
        stringBuilder.append("; path=");
        stringBuilder.append(this.path);
        if (this.secure) {
            stringBuilder.append("; secure");
        }
        if (this.httpOnly) {
            stringBuilder.append("; httponly");
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        if (cookie.name.equals(this.name) && cookie.value.equals(this.value) && cookie.domain.equals(this.domain) && cookie.path.equals(this.path) && cookie.expiresAt == this.expiresAt && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31;
        long j = this.expiresAt;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.secure ^ 1)) * 31) + (this.httpOnly ^ 1)) * 31) + (this.persistent ^ 1)) * 31) + (this.hostOnly ^ 1);
    }
}
