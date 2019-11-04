package com.google.android.gms.internal.gtm;

final class zztn {
    static String zzd(zzps zzps) {
        zzto zzto = new zzto(zzps);
        StringBuilder stringBuilder = new StringBuilder(zzto.size());
        for (int i = 0; i < zzto.size(); i++) {
            byte zzak = zzto.zzak(i);
            if (zzak == (byte) 34) {
                stringBuilder.append("\\\"");
            } else if (zzak == (byte) 39) {
                stringBuilder.append("\\'");
            } else if (zzak != (byte) 92) {
                switch (zzak) {
                    case (byte) 7:
                        stringBuilder.append("\\a");
                        break;
                    case (byte) 8:
                        stringBuilder.append("\\b");
                        break;
                    case (byte) 9:
                        stringBuilder.append("\\t");
                        break;
                    case (byte) 10:
                        stringBuilder.append("\\n");
                        break;
                    case (byte) 11:
                        stringBuilder.append("\\v");
                        break;
                    case (byte) 12:
                        stringBuilder.append("\\f");
                        break;
                    case (byte) 13:
                        stringBuilder.append("\\r");
                        break;
                    default:
                        if (zzak >= (byte) 32 && zzak <= (byte) 126) {
                            stringBuilder.append((char) zzak);
                            break;
                        }
                        stringBuilder.append('\\');
                        stringBuilder.append((char) (((zzak >>> 6) & 3) + 48));
                        stringBuilder.append((char) (((zzak >>> 3) & 7) + 48));
                        stringBuilder.append((char) ((zzak & 7) + 48));
                        break;
                }
            } else {
                stringBuilder.append("\\\\");
            }
        }
        return stringBuilder.toString();
    }
}
