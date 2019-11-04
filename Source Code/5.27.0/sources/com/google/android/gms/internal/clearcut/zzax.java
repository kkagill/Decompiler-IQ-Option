package com.google.android.gms.internal.clearcut;

final class zzax {
    static int zza(int i, byte[] bArr, int i2, int i3, zzay zzay) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzb(bArr, i2, zzay);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zza(bArr, i2, zzay) + zzay.zzfd;
            }
            if (i4 == 3) {
                i = (i & -8) | 4;
                i4 = 0;
                while (i2 < i3) {
                    i2 = zza(bArr, i2, zzay);
                    i4 = zzay.zzfd;
                    if (i4 == i) {
                        break;
                    }
                    i2 = zza(i4, bArr, i2, i3, zzay);
                }
                if (i2 <= i3 && r0 == i) {
                    return i2;
                }
                throw zzco.zzbo();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzco.zzbm();
            }
        }
        throw zzco.zzbm();
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzcn<?> zzcn, zzay zzay) {
        zzch zzch = (zzch) zzcn;
        i2 = zza(bArr, i2, zzay);
        while (true) {
            zzch.zzac(zzay.zzfd);
            if (i2 >= i3) {
                break;
            }
            int zza = zza(bArr, i2, zzay);
            if (i != zzay.zzfd) {
                break;
            }
            i2 = zza(bArr, zza, zzay);
        }
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzey zzey, zzay zzay) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzay);
                zzey.zzb(i, Long.valueOf(zzay.zzfe));
                return zzb;
            } else if (i4 == 1) {
                zzey.zzb(i, Long.valueOf(zzd(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                i2 = zza(bArr, i2, zzay);
                i3 = zzay.zzfd;
                zzey.zzb(i, i3 == 0 ? zzbb.zzfi : zzbb.zzb(bArr, i2, i3));
                return i2 + i3;
            } else if (i4 == 3) {
                zzey zzeb = zzey.zzeb();
                int i5 = (i & -8) | 4;
                i4 = 0;
                while (i2 < i3) {
                    int zza = zza(bArr, i2, zzay);
                    i2 = zzay.zzfd;
                    if (i2 == i5) {
                        i4 = i2;
                        i2 = zza;
                        break;
                    }
                    i4 = i2;
                    i2 = zza(i2, bArr, zza, i3, zzeb, zzay);
                }
                if (i2 > i3 || r0 != i5) {
                    throw zzco.zzbo();
                }
                zzey.zzb(i, zzeb);
                return i2;
            } else if (i4 == 5) {
                zzey.zzb(i, Integer.valueOf(zzc(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzco.zzbm();
            }
        }
        throw zzco.zzbm();
    }

    static int zza(int i, byte[] bArr, int i2, zzay zzay) {
        int i3;
        i &= 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= (byte) 0) {
            i3 = b << 7;
        } else {
            i |= (b & 127) << 7;
            i2 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 >= (byte) 0) {
                i3 = b2 << 14;
            } else {
                i |= (b2 & 127) << 14;
                i4 = i2 + 1;
                b = bArr[i2];
                if (b >= (byte) 0) {
                    i3 = b << 21;
                } else {
                    i |= (b & 127) << 21;
                    i2 = i4 + 1;
                    b2 = bArr[i4];
                    if (b2 >= (byte) 0) {
                        i3 = b2 << 28;
                    } else {
                        i |= (b2 & 127) << 28;
                        while (true) {
                            i4 = i2 + 1;
                            if (bArr[i2] >= (byte) 0) {
                                zzay.zzfd = i;
                                return i4;
                            }
                            i2 = i4;
                        }
                    }
                }
            }
            zzay.zzfd = i | i3;
            return i2;
        }
        zzay.zzfd = i | i3;
        return i4;
    }

    static int zza(byte[] bArr, int i, zzay zzay) {
        int i2 = i + 1;
        i = bArr[i];
        if (i < (byte) 0) {
            return zza(i, bArr, i2, zzay);
        }
        zzay.zzfd = i;
        return i2;
    }

    static int zza(byte[] bArr, int i, zzcn<?> zzcn, zzay zzay) {
        zzch zzch = (zzch) zzcn;
        i = zza(bArr, i, zzay);
        int i2 = zzay.zzfd + i;
        while (i < i2) {
            i = zza(bArr, i, zzay);
            zzch.zzac(zzay.zzfd);
        }
        if (i == i2) {
            return i;
        }
        throw zzco.zzbl();
    }

    static int zzb(byte[] bArr, int i, zzay zzay) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzay.zzfe = j;
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
        zzay.zzfe = j;
        return i;
    }

    static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    static int zzc(byte[] bArr, int i, zzay zzay) {
        i = zza(bArr, i, zzay);
        int i2 = zzay.zzfd;
        if (i2 == 0) {
            zzay.zzff = "";
            return i;
        }
        zzay.zzff = new String(bArr, i, i2, zzci.UTF_8);
        return i + i2;
    }

    static int zzd(byte[] bArr, int i, zzay zzay) {
        i = zza(bArr, i, zzay);
        int i2 = zzay.zzfd;
        if (i2 == 0) {
            zzay.zzff = "";
            return i;
        }
        int i3 = i + i2;
        if (zzff.zze(bArr, i, i3)) {
            zzay.zzff = new String(bArr, i, i2, zzci.UTF_8);
            return i3;
        }
        throw zzco.zzbp();
    }

    static long zzd(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    static double zze(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzd(bArr, i));
    }

    static int zze(byte[] bArr, int i, zzay zzay) {
        i = zza(bArr, i, zzay);
        int i2 = zzay.zzfd;
        if (i2 == 0) {
            zzay.zzff = zzbb.zzfi;
            return i;
        }
        zzay.zzff = zzbb.zzb(bArr, i, i2);
        return i + i2;
    }

    static float zzf(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzc(bArr, i));
    }
}
