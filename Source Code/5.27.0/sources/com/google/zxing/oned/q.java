package com.google.zxing.oned;

/* compiled from: UPCEReader */
public final class q extends o {
    private static final int[] ahR = new int[]{1, 1, 1, 1, 1, 1};
    static final int[][] ahS = new int[][]{new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    public static String cX(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder stringBuilder = new StringBuilder(12);
        stringBuilder.append(str.charAt(0));
        char c = cArr[5];
        String str2 = "00000";
        String str3 = "0000";
        switch (c) {
            case '0':
            case '1':
            case '2':
                stringBuilder.append(cArr, 0, 2);
                stringBuilder.append(c);
                stringBuilder.append(str3);
                stringBuilder.append(cArr, 2, 3);
                break;
            case '3':
                stringBuilder.append(cArr, 0, 3);
                stringBuilder.append(str2);
                stringBuilder.append(cArr, 3, 2);
                break;
            case '4':
                stringBuilder.append(cArr, 0, 4);
                stringBuilder.append(str2);
                stringBuilder.append(cArr[4]);
                break;
            default:
                stringBuilder.append(cArr, 0, 5);
                stringBuilder.append(str3);
                stringBuilder.append(c);
                break;
        }
        if (str.length() >= 8) {
            stringBuilder.append(str.charAt(7));
        }
        return stringBuilder.toString();
    }
}
