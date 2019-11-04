package com.google.android.gms.internal.vision;

final class zzik {
    static String zzd(zzeo zzeo) {
        zzil zzil = new zzil(zzeo);
        StringBuilder stringBuilder = new StringBuilder(zzil.size());
        for (int i = 0; i < zzil.size(); i++) {
            byte zzai = zzil.zzai(i);
            if (zzai == (byte) 34) {
                stringBuilder.append("\\\"");
            } else if (zzai == (byte) 39) {
                stringBuilder.append("\\'");
            } else if (zzai != (byte) 92) {
                switch (zzai) {
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
                        if (zzai >= (byte) 32 && zzai <= (byte) 126) {
                            stringBuilder.append((char) zzai);
                            break;
                        }
                        stringBuilder.append('\\');
                        stringBuilder.append((char) (((zzai >>> 6) & 3) + 48));
                        stringBuilder.append((char) (((zzai >>> 3) & 7) + 48));
                        stringBuilder.append((char) ((zzai & 7) + 48));
                        break;
                }
            } else {
                stringBuilder.append("\\\\");
            }
        }
        return stringBuilder.toString();
    }
}
