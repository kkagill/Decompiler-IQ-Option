package org.yaml.snakeyaml.a.b.a.a.a.a.a;

import androidx.core.internal.view.SupportMenu;

/* compiled from: PercentEscaper */
public class b extends c {
    private static final char[] YZ = "0123456789ABCDEF".toCharArray();
    private static final char[] fKR = new char[]{'+'};
    private final boolean Za;
    private final boolean[] Zb;

    public b(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        } else if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        } else if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        } else {
            this.Za = z;
            this.Zb = bU(str);
        }
    }

    private static boolean[] bU(String str) {
        char[] toCharArray = str.toCharArray();
        int i = 122;
        for (char max : toCharArray) {
            i = Math.max(max, i);
        }
        boolean[] zArr = new boolean[(i + 1)];
        for (i = 48; i <= 57; i++) {
            zArr[i] = true;
        }
        for (i = 65; i <= 90; i++) {
            zArr[i] = true;
        }
        for (i = 97; i <= 122; i++) {
            zArr[i] = true;
        }
        for (char c : toCharArray) {
            zArr[c] = true;
        }
        return zArr;
    }

    /* Access modifiers changed, original: protected */
    public int a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.Zb;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    public String escape(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.Zb;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return l(str, i);
            }
        }
        return str;
    }

    /* Access modifiers changed, original: protected */
    public char[] ct(int i) {
        boolean[] zArr = this.Zb;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.Za) {
            return fKR;
        }
        char[] cArr;
        char[] cArr2;
        if (i <= 127) {
            cArr = new char[3];
            cArr2 = YZ;
            cArr[2] = cArr2[i & 15];
            cArr[1] = cArr2[i >>> 4];
            return cArr;
        } else if (i <= 2047) {
            cArr = new char[6];
            cArr2 = YZ;
            cArr[5] = cArr2[i & 15];
            i >>>= 4;
            cArr[4] = cArr2[(i & 3) | 8];
            i >>>= 2;
            cArr[2] = cArr2[i & 15];
            cArr[1] = cArr2[(i >>> 4) | 12];
            return cArr;
        } else if (i <= SupportMenu.USER_MASK) {
            cArr = new char[9];
            cArr[0] = '%';
            cArr[1] = 'E';
            cArr[3] = '%';
            cArr[6] = '%';
            char[] cArr3 = YZ;
            cArr[8] = cArr3[i & 15];
            i >>>= 4;
            cArr[7] = cArr3[(i & 3) | 8];
            i >>>= 2;
            cArr[5] = cArr3[i & 15];
            i >>>= 4;
            cArr[4] = cArr3[(i & 3) | 8];
            cArr[2] = cArr3[i >>> 2];
            return cArr;
        } else if (i <= 1114111) {
            cArr = new char[12];
            cArr[0] = '%';
            cArr[1] = 'F';
            cArr[3] = '%';
            cArr[6] = '%';
            cArr[9] = '%';
            cArr2 = YZ;
            cArr[11] = cArr2[i & 15];
            i >>>= 4;
            cArr[10] = cArr2[(i & 3) | 8];
            i >>>= 2;
            cArr[8] = cArr2[i & 15];
            i >>>= 4;
            cArr[7] = cArr2[(i & 3) | 8];
            i >>>= 2;
            cArr[5] = cArr2[i & 15];
            i >>>= 4;
            cArr[4] = cArr2[(i & 3) | 8];
            cArr[2] = cArr2[(i >>> 2) & 7];
            return cArr;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid unicode character value ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
