package com.google.android.gms.internal.gtm;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzux {
    public static <T extends zzuw> String zzc(T t) {
        String valueOf;
        String str = "Error printing proto: ";
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            zza(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (InvocationTargetException e2) {
            valueOf = String.valueOf(e2.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
    }

    private static void zza(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            int i;
            if (obj instanceof zzuw) {
                String str2;
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(zzde(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!("cachedSize".equals(name) || (modifiers & 1) != 1 || (modifiers & 8) == 8)) {
                        str2 = "_";
                        if (!(name.startsWith(str2) || name.endsWith(str2))) {
                            Class type = field.getType();
                            Object obj2 = field.get(obj);
                            if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                                zza(name, obj2, stringBuffer, stringBuffer2);
                            } else {
                                if (obj2 == null) {
                                    modifiers = 0;
                                } else {
                                    modifiers = Array.getLength(obj2);
                                }
                                for (int i2 = 0; i2 < modifiers; i2++) {
                                    zza(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                                }
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        name3 = name3.substring(3);
                        try {
                            String str3 = "has";
                            str2 = String.valueOf(name3);
                            if (((Boolean) cls.getMethod(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                str3 = "get";
                                str2 = String.valueOf(name3);
                                zza(name3, cls.getMethod(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
                return;
            }
            str = zzde(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(str);
            stringBuffer2.append(": ");
            int length2;
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!str4.startsWith("http") && str4.length() > 200) {
                    str4 = String.valueOf(str4.substring(0, 200)).concat("[...]");
                }
                length2 = str4.length();
                StringBuilder stringBuilder = new StringBuilder(length2);
                for (i = 0; i < length2; i++) {
                    char charAt = str4.charAt(i);
                    if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                        stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    } else {
                        stringBuilder.append(charAt);
                    }
                }
                str = stringBuilder.toString();
                str4 = "\"";
                stringBuffer2.append(str4);
                stringBuffer2.append(str);
                stringBuffer2.append(str4);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    stringBuffer2.append("\"\"");
                } else {
                    stringBuffer2.append('\"');
                    for (byte b : bArr) {
                        int i3 = b & 255;
                        if (i3 == 92 || i3 == 34) {
                            stringBuffer2.append('\\');
                            stringBuffer2.append((char) i3);
                        } else if (i3 < 32 || i3 >= 127) {
                            stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(i3)}));
                        } else {
                            stringBuffer2.append((char) i3);
                        }
                    }
                    stringBuffer2.append('\"');
                }
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    private static String zzde(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}
