package com.neovisionaries.ws.client;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Misc */
class p {
    private static final SecureRandom ezS = new SecureRandom();

    public static byte[] kx(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String s(byte[] bArr) {
        return bArr == null ? null : h(bArr, 0, bArr.length);
    }

    public static String h(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, i, i2, "UTF-8");
        } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static byte[] t(byte[] bArr) {
        ezS.nextBytes(bArr);
        return bArr;
    }

    public static byte[] iA(int i) {
        return t(new byte[i]);
    }

    public static String iB(int i) {
        if (i == 0) {
            return "CONTINUATION";
        }
        if (i == 1) {
            return "TEXT";
        }
        if (i == 2) {
            return "BINARY";
        }
        switch (i) {
            case 8:
                return "CLOSE";
            case 9:
                return "PING";
            case 10:
                return "PONG";
            default:
                if (1 <= i && i <= 7) {
                    return String.format("DATA(0x%X)", new Object[]{Integer.valueOf(i)});
                } else if (8 > i || i > 15) {
                    return String.format("0x%X", new Object[]{Integer.valueOf(i)});
                } else {
                    return String.format("CONTROL(0x%X)", new Object[]{Integer.valueOf(i)});
                }
        }
    }

    public static String c(InputStream inputStream, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                if (read == 10) {
                    break;
                } else if (read != 13) {
                    byteArrayOutputStream.write(read);
                } else {
                    int read2 = inputStream.read();
                    if (read2 == -1) {
                        byteArrayOutputStream.write(read);
                        break;
                    } else if (read2 == 10) {
                        break;
                    } else {
                        byteArrayOutputStream.write(read);
                        byteArrayOutputStream.write(read2);
                    }
                }
            } else if (byteArrayOutputStream.size() == 0) {
                return null;
            }
        }
        return byteArrayOutputStream.toString(str);
    }

    public static int j(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    public static int d(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i < iArr[i2]) {
                i = iArr[i2];
            }
        }
        return i;
    }

    public static String d(Collection<?> collection, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        a(stringBuilder, (Collection) collection, str);
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, Collection<?> collection, String str) {
        Object obj = 1;
        for (Object next : collection) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(str);
            }
            stringBuilder.append(next.toString());
        }
    }

    public static String a(URI uri) {
        String host = uri.getHost();
        if (host != null) {
            return host;
        }
        host = ky(uri.getRawAuthority());
        if (host != null) {
            return host;
        }
        return kz(uri.toString());
    }

    static String ky(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("^(.*@)?([^:]+)(:\\d+)?$").matcher(str);
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        return matcher.group(2);
    }

    static String kz(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("^\\w+://([^@/]*@)?([^:/]+)(:\\d+)?(/.*)?$").matcher(str);
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        return matcher.group(2);
    }

    public static Constructor<?> b(String str, Class<?>[] clsArr) {
        try {
            return Class.forName(str).getConstructor(clsArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object a(Constructor<?> constructor, Object... objArr) {
        if (constructor == null) {
            return null;
        }
        try {
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Method b(String str, String str2, Class<?>[] clsArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
