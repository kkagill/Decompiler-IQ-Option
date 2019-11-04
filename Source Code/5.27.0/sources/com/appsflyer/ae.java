package com.appsflyer;

import java.security.MessageDigest;
import java.util.Formatter;

final class ae {
    ae() {
    }

    public static String U(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            str = a(instance.digest());
            return str;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Error turning ");
            stringBuilder.append(str.substring(0, 6));
            stringBuilder.append(".. to SHA1");
            AFLogger.c(stringBuilder.toString(), e);
            return null;
        }
    }

    public static String ab(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            str = a(instance.digest());
            return str;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Error turning ");
            stringBuilder.append(str.substring(0, 6));
            stringBuilder.append(".. to MD5");
            AFLogger.c(stringBuilder.toString(), e);
            return null;
        }
    }

    public static String R(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Error turning ");
            stringBuilder.append(str.substring(0, 6));
            stringBuilder.append(".. to SHA-256");
            AFLogger.c(stringBuilder.toString(), e);
            return null;
        }
    }

    private static String a(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }
}
