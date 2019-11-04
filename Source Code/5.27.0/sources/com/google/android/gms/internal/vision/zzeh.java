package com.google.android.gms.internal.vision;

final class zzeh {
    static int zza(byte[] bArr, int i, zzei zzei) {
        int i2 = i + 1;
        i = bArr[i];
        if (i < (byte) 0) {
            return zza(i, bArr, i2, zzei);
        }
        zzei.zzro = i;
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, zzei zzei) {
        i &= 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b >= (byte) 0) {
            zzei.zzro = i | (b << 7);
            return i3;
        }
        i |= (b & 127) << 7;
        i2 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= (byte) 0) {
            zzei.zzro = i | (b2 << 14);
            return i2;
        }
        i |= (b2 & 127) << 14;
        i3 = i2 + 1;
        b = bArr[i2];
        if (b >= (byte) 0) {
            zzei.zzro = i | (b << 21);
            return i3;
        }
        i |= (b & 127) << 21;
        i2 = i3 + 1;
        b2 = bArr[i3];
        if (b2 >= (byte) 0) {
            zzei.zzro = i | (b2 << 28);
            return i2;
        }
        i |= (b2 & 127) << 28;
        while (true) {
            i3 = i2 + 1;
            if (bArr[i2] >= (byte) 0) {
                zzei.zzro = i;
                return i3;
            }
            i2 = i3;
        }
    }

    static int zzb(byte[] bArr, int i, zzei zzei) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzei.zzrp = j;
            return i2;
        }
        j &= 127;
        i = i2 + 1;
        byte b = bArr[i2];
        j |= ((long) (b & 127)) << 7;
        int i3 = 7;
        while (b < (byte) 0) {
            i2 = i + 1;
            byte b2 = bArr[i];
            i3 += 7;
            j |= ((long) (b2 & 127)) << i3;
            int i4 = i2;
            b = b2;
            i = i4;
        }
        zzei.zzrp = j;
        return i;
    }

    static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    static long zzb(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    static int zzc(byte[] bArr, int i, zzei zzei) {
        i = zza(bArr, i, zzei);
        int i2 = zzei.zzro;
        if (i2 < 0) {
            throw zzgf.zzfi();
        } else if (i2 == 0) {
            zzei.zzrq = "";
            return i;
        } else {
            zzei.zzrq = new String(bArr, i, i2, zzga.UTF_8);
            return i + i2;
        }
    }

    static int zzd(byte[] bArr, int i, zzei zzei) {
        i = zza(bArr, i, zzei);
        int i2 = zzei.zzro;
        if (i2 < 0) {
            throw zzgf.zzfi();
        } else if (i2 == 0) {
            zzei.zzrq = "";
            return i;
        } else {
            zzei.zzrq = zziw.zzi(bArr, i, i2);
            return i + i2;
        }
    }

    static int zze(byte[] bArr, int i, zzei zzei) {
        i = zza(bArr, i, zzei);
        int i2 = zzei.zzro;
        if (i2 < 0) {
            throw zzgf.zzfi();
        } else if (i2 > bArr.length - i) {
            throw zzgf.zzfh();
        } else if (i2 == 0) {
            zzei.zzrq = zzeo.zzrx;
            return i;
        } else {
            zzei.zzrq = zzeo.zzb(bArr, i, i2);
            return i + i2;
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzge<?> zzge, zzei zzei) {
        zzfz zzfz = (zzfz) zzge;
        i2 = zza(bArr, i2, zzei);
        zzfz.zzbg(zzei.zzro);
        while (i2 < i3) {
            int zza = zza(bArr, i2, zzei);
            if (i != zzei.zzro) {
                break;
            }
            i2 = zza(bArr, zza, zzei);
            zzfz.zzbg(zzei.zzro);
        }
        return i2;
    }

    static int zza(byte[] bArr, int i, zzge<?> zzge, zzei zzei) {
        zzfz zzfz = (zzfz) zzge;
        i = zza(bArr, i, zzei);
        int i2 = zzei.zzro + i;
        while (i < i2) {
            i = zza(bArr, i, zzei);
            zzfz.zzbg(zzei.zzro);
        }
        if (i == i2) {
            return i;
        }
        throw zzgf.zzfh();
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzip zzip, zzei zzei) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzei);
                zzip.zzb(i, Long.valueOf(zzei.zzrp));
                return zzb;
            } else if (i4 == 1) {
                zzip.zzb(i, Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                i2 = zza(bArr, i2, zzei);
                i3 = zzei.zzro;
                if (i3 < 0) {
                    throw zzgf.zzfi();
                } else if (i3 <= bArr.length - i2) {
                    if (i3 == 0) {
                        zzip.zzb(i, zzeo.zzrx);
                    } else {
                        zzip.zzb(i, zzeo.zzb(bArr, i2, i3));
                    }
                    return i2 + i3;
                } else {
                    throw zzgf.zzfh();
                }
            } else if (i4 == 3) {
                zzip zzhf = zzip.zzhf();
                int i5 = (i & -8) | 4;
                i4 = 0;
                while (i2 < i3) {
                    int zza = zza(bArr, i2, zzei);
                    i2 = zzei.zzro;
                    if (i2 == i5) {
                        i4 = i2;
                        i2 = zza;
                        break;
                    }
                    i4 = i2;
                    i2 = zza(i2, bArr, zza, i3, zzhf, zzei);
                }
                if (i2 > i3 || r0 != i5) {
                    throw zzgf.zzfo();
                }
                zzip.zzb(i, zzhf);
                return i2;
            } else if (i4 == 5) {
                zzip.zzb(i, Integer.valueOf(zza(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzgf.zzfk();
            }
        }
        throw zzgf.zzfk();
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzei zzei) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzb(bArr, i2, zzei);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zza(bArr, i2, zzei) + zzei.zzro;
            }
            if (i4 == 3) {
                i = (i & -8) | 4;
                i4 = 0;
                while (i2 < i3) {
                    i2 = zza(bArr, i2, zzei);
                    i4 = zzei.zzro;
                    if (i4 == i) {
                        break;
                    }
                    i2 = zza(i4, bArr, i2, i3, zzei);
                }
                if (i2 <= i3 && r0 == i) {
                    return i2;
                }
                throw zzgf.zzfo();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzgf.zzfk();
            }
        }
        throw zzgf.zzfk();
    }
}
