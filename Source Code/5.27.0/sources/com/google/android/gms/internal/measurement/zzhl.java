package com.google.android.gms.internal.measurement;

final class zzhl {
    static String zzd(zzdp zzdp) {
        zzho zzho = new zzho(zzdp);
        StringBuilder stringBuilder = new StringBuilder(zzho.size());
        for (int i = 0; i < zzho.size(); i++) {
            byte zzaq = zzho.zzaq(i);
            if (zzaq == (byte) 34) {
                stringBuilder.append("\\\"");
            } else if (zzaq == (byte) 39) {
                stringBuilder.append("\\'");
            } else if (zzaq != (byte) 92) {
                switch (zzaq) {
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
                        if (zzaq >= (byte) 32 && zzaq <= (byte) 126) {
                            stringBuilder.append((char) zzaq);
                            break;
                        }
                        stringBuilder.append('\\');
                        stringBuilder.append((char) (((zzaq >>> 6) & 3) + 48));
                        stringBuilder.append((char) (((zzaq >>> 3) & 7) + 48));
                        stringBuilder.append((char) ((zzaq & 7) + 48));
                        break;
                }
            } else {
                stringBuilder.append("\\\\");
            }
        }
        return stringBuilder.toString();
    }
}
