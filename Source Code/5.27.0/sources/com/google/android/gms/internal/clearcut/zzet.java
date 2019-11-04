package com.google.android.gms.internal.clearcut;

final class zzet {
    static String zzc(zzbb zzbb) {
        zzeu zzeu = new zzeu(zzbb);
        StringBuilder stringBuilder = new StringBuilder(zzeu.size());
        for (int i = 0; i < zzeu.size(); i++) {
            String str;
            int zzj = zzeu.zzj(i);
            if (zzj == 34) {
                str = "\\\"";
            } else if (zzj == 39) {
                str = "\\'";
            } else if (zzj != 92) {
                switch (zzj) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (zzj < 32 || zzj > 126) {
                            stringBuilder.append('\\');
                            stringBuilder.append((char) (((zzj >>> 6) & 3) + 48));
                            stringBuilder.append((char) (((zzj >>> 3) & 7) + 48));
                            zzj = (zzj & 7) + 48;
                        }
                        stringBuilder.append((char) zzj);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
