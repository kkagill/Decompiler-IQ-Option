package com.google.android.gms.internal.measurement;

final class zzdl {
    static int zza(byte[] bArr, int i, zzdk zzdk) {
        int i2 = i + 1;
        i = bArr[i];
        if (i < (byte) 0) {
            return zza(i, bArr, i2, zzdk);
        }
        zzdk.zzada = i;
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, zzdk zzdk) {
        i &= 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b >= (byte) 0) {
            zzdk.zzada = i | (b << 7);
            return i3;
        }
        i |= (b & 127) << 7;
        i2 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= (byte) 0) {
            zzdk.zzada = i | (b2 << 14);
            return i2;
        }
        i |= (b2 & 127) << 14;
        i3 = i2 + 1;
        b = bArr[i2];
        if (b >= (byte) 0) {
            zzdk.zzada = i | (b << 21);
            return i3;
        }
        i |= (b & 127) << 21;
        i2 = i3 + 1;
        b2 = bArr[i3];
        if (b2 >= (byte) 0) {
            zzdk.zzada = i | (b2 << 28);
            return i2;
        }
        i |= (b2 & 127) << 28;
        while (true) {
            i3 = i2 + 1;
            if (bArr[i2] >= (byte) 0) {
                zzdk.zzada = i;
                return i3;
            }
            i2 = i3;
        }
    }

    static int zzb(byte[] bArr, int i, zzdk zzdk) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzdk.zzadb = j;
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
        zzdk.zzadb = j;
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

    static int zzc(byte[] bArr, int i, zzdk zzdk) {
        i = zza(bArr, i, zzdk);
        int i2 = zzdk.zzada;
        if (i2 < 0) {
            throw zzfi.zzuu();
        } else if (i2 == 0) {
            zzdk.zzadc = "";
            return i;
        } else {
            zzdk.zzadc = new String(bArr, i, i2, zzez.UTF_8);
            return i + i2;
        }
    }

    static int zzd(byte[] bArr, int i, zzdk zzdk) {
        i = zza(bArr, i, zzdk);
        int i2 = zzdk.zzada;
        if (i2 < 0) {
            throw zzfi.zzuu();
        } else if (i2 == 0) {
            zzdk.zzadc = "";
            return i;
        } else {
            zzdk.zzadc = zzhy.zzh(bArr, i, i2);
            return i + i2;
        }
    }

    static int zze(byte[] bArr, int i, zzdk zzdk) {
        i = zza(bArr, i, zzdk);
        int i2 = zzdk.zzada;
        if (i2 < 0) {
            throw zzfi.zzuu();
        } else if (i2 > bArr.length - i) {
            throw zzfi.zzut();
        } else if (i2 == 0) {
            zzdk.zzadc = zzdp.zzadh;
            return i;
        } else {
            zzdk.zzadc = zzdp.zzb(bArr, i, i2);
            return i + i2;
        }
    }

    static int zza(zzgx zzgx, byte[] bArr, int i, int i2, zzdk zzdk) {
        int i3 = i + 1;
        i = bArr[i];
        if (i < 0) {
            i3 = zza(i, bArr, i3, zzdk);
            i = zzdk.zzada;
        }
        int i4 = i3;
        if (i < 0 || i > i2 - i4) {
            throw zzfi.zzut();
        }
        Object newInstance = zzgx.newInstance();
        i += i4;
        zzgx.zza(newInstance, bArr, i4, i, zzdk);
        zzgx.zzj(newInstance);
        zzdk.zzadc = newInstance;
        return i;
    }

    static int zza(zzgx zzgx, byte[] bArr, int i, int i2, int i3, zzdk zzdk) {
        zzgm zzgm = (zzgm) zzgx;
        Object newInstance = zzgm.newInstance();
        int zza = zzgm.zza(newInstance, bArr, i, i2, i3, zzdk);
        zzgm.zzj(newInstance);
        zzdk.zzadc = newInstance;
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzff<?> zzff, zzdk zzdk) {
        zzfa zzfa = (zzfa) zzff;
        i2 = zza(bArr, i2, zzdk);
        zzfa.zzbu(zzdk.zzada);
        while (i2 < i3) {
            int zza = zza(bArr, i2, zzdk);
            if (i != zzdk.zzada) {
                break;
            }
            i2 = zza(bArr, zza, zzdk);
            zzfa.zzbu(zzdk.zzada);
        }
        return i2;
    }

    static int zza(byte[] bArr, int i, zzff<?> zzff, zzdk zzdk) {
        zzfa zzfa = (zzfa) zzff;
        i = zza(bArr, i, zzdk);
        int i2 = zzdk.zzada + i;
        while (i < i2) {
            i = zza(bArr, i, zzdk);
            zzfa.zzbu(zzdk.zzada);
        }
        if (i == i2) {
            return i;
        }
        throw zzfi.zzut();
    }

    static int zza(zzgx<?> zzgx, int i, byte[] bArr, int i2, int i3, zzff<?> zzff, zzdk zzdk) {
        i2 = zza((zzgx) zzgx, bArr, i2, i3, zzdk);
        zzff.add(zzdk.zzadc);
        while (i2 < i3) {
            int zza = zza(bArr, i2, zzdk);
            if (i != zzdk.zzada) {
                break;
            }
            i2 = zza((zzgx) zzgx, bArr, zza, i3, zzdk);
            zzff.add(zzdk.zzadc);
        }
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzhs zzhs, zzdk zzdk) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzdk);
                zzhs.zzb(i, Long.valueOf(zzdk.zzadb));
                return zzb;
            } else if (i4 == 1) {
                zzhs.zzb(i, Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                i2 = zza(bArr, i2, zzdk);
                i3 = zzdk.zzada;
                if (i3 < 0) {
                    throw zzfi.zzuu();
                } else if (i3 <= bArr.length - i2) {
                    if (i3 == 0) {
                        zzhs.zzb(i, zzdp.zzadh);
                    } else {
                        zzhs.zzb(i, zzdp.zzb(bArr, i2, i3));
                    }
                    return i2 + i3;
                } else {
                    throw zzfi.zzut();
                }
            } else if (i4 == 3) {
                Object zzwr = zzhs.zzwr();
                int i5 = (i & -8) | 4;
                i4 = 0;
                while (i2 < i3) {
                    int zza = zza(bArr, i2, zzdk);
                    i2 = zzdk.zzada;
                    if (i2 == i5) {
                        i4 = i2;
                        i2 = zza;
                        break;
                    }
                    i4 = i2;
                    i2 = zza(i2, bArr, zza, i3, (zzhs) zzwr, zzdk);
                }
                if (i2 > i3 || r0 != i5) {
                    throw zzfi.zzva();
                }
                zzhs.zzb(i, zzwr);
                return i2;
            } else if (i4 == 5) {
                zzhs.zzb(i, Integer.valueOf(zza(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzfi.zzuw();
            }
        }
        throw zzfi.zzuw();
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzdk zzdk) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzb(bArr, i2, zzdk);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zza(bArr, i2, zzdk) + zzdk.zzada;
            }
            if (i4 == 3) {
                i = (i & -8) | 4;
                i4 = 0;
                while (i2 < i3) {
                    i2 = zza(bArr, i2, zzdk);
                    i4 = zzdk.zzada;
                    if (i4 == i) {
                        break;
                    }
                    i2 = zza(i4, bArr, i2, i3, zzdk);
                }
                if (i2 <= i3 && r0 == i) {
                    return i2;
                }
                throw zzfi.zzva();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzfi.zzuw();
            }
        }
        throw zzfi.zzuw();
    }
}
