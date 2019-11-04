package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy.zzg;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class zzhj<T> implements zzhw<T> {
    private static final int[] zzzb = new int[0];
    private static final Unsafe zzzc = zziu.zzhj();
    private final int[] zzzd;
    private final Object[] zzze;
    private final int zzzf;
    private final int zzzg;
    private final zzhf zzzh;
    private final boolean zzzi;
    private final boolean zzzj;
    private final boolean zzzk;
    private final boolean zzzl;
    private final int[] zzzm;
    private final int zzzn;
    private final int zzzo;
    private final zzhn zzzp;
    private final zzgp zzzq;
    private final zzio<?, ?> zzzr;
    private final zzfl<?> zzzs;
    private final zzha zzzt;

    private zzhj(int[] iArr, Object[] objArr, int i, int i2, zzhf zzhf, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzhn zzhn, zzgp zzgp, zzio<?, ?> zzio, zzfl<?> zzfl, zzha zzha) {
        this.zzzd = iArr;
        this.zzze = objArr;
        this.zzzf = i;
        this.zzzg = i2;
        this.zzzj = zzhf instanceof zzfy;
        this.zzzk = z;
        boolean z3 = zzfl != null && zzfl.zze(zzhf);
        this.zzzi = z3;
        this.zzzl = false;
        this.zzzm = iArr2;
        this.zzzn = i3;
        this.zzzo = i4;
        this.zzzp = zzhn;
        this.zzzq = zzgp;
        this.zzzr = zzio;
        this.zzzs = zzfl;
        this.zzzh = zzhf;
        this.zzzt = zzha;
    }

    private static boolean zzbm(int i) {
        return (i & 536870912) != 0;
    }

    static <T> zzhj<T> zza(Class<T> cls, zzhd zzhd, zzhn zzhn, zzgp zzgp, zzio<?, ?> zzio, zzfl<?> zzfl, zzha zzha) {
        zzhd zzhd2 = zzhd;
        if (zzhd2 instanceof zzhu) {
            int i;
            int i2;
            int i3;
            int i4;
            char charAt;
            int[] iArr;
            char c;
            char c2;
            int i5;
            int i6;
            int i7;
            char charAt2;
            int i8;
            int i9;
            boolean z;
            zzhu zzhu = (zzhu) zzhd2;
            int i10 = 0;
            boolean z2 = zzhu.zzge() == zzg.zzxg;
            String zzgn = zzhu.zzgn();
            int length = zzgn.length();
            int charAt3 = zzgn.charAt(0);
            if (charAt3 >= 55296) {
                char charAt4;
                i = charAt3 & 8191;
                charAt3 = 1;
                i2 = 13;
                while (true) {
                    i3 = charAt3 + 1;
                    charAt4 = zzgn.charAt(charAt3);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i |= (charAt4 & 8191) << i2;
                    i2 += 13;
                    charAt3 = i3;
                }
                charAt3 = (charAt4 << i2) | i;
            } else {
                i3 = 1;
            }
            i = i3 + 1;
            i2 = zzgn.charAt(i3);
            if (i2 >= 55296) {
                i2 &= 8191;
                i3 = 13;
                while (true) {
                    i4 = i + 1;
                    charAt = zzgn.charAt(i);
                    if (charAt < 55296) {
                        break;
                    }
                    i2 |= (charAt & 8191) << i3;
                    i3 += 13;
                    i = i4;
                }
                i2 |= charAt << i3;
            } else {
                i4 = i;
            }
            if (i2 == 0) {
                iArr = zzzb;
                i = 0;
                c = 0;
                i3 = 0;
                c2 = 0;
                i5 = 0;
                i6 = 0;
            } else {
                int i11;
                int i12;
                char charAt5;
                i = i4 + 1;
                i2 = zzgn.charAt(i4);
                if (i2 >= 55296) {
                    i2 &= 8191;
                    i3 = 13;
                    while (true) {
                        i4 = i + 1;
                        charAt = zzgn.charAt(i);
                        if (charAt < 55296) {
                            break;
                        }
                        i2 |= (charAt & 8191) << i3;
                        i3 += 13;
                        i = i4;
                    }
                    i2 = (charAt << i3) | i2;
                } else {
                    i4 = i;
                }
                i = i4 + 1;
                i3 = zzgn.charAt(i4);
                if (i3 >= 55296) {
                    i3 &= 8191;
                    i4 = 13;
                    while (true) {
                        i7 = i + 1;
                        charAt = zzgn.charAt(i);
                        if (charAt < 55296) {
                            break;
                        }
                        i3 |= (charAt & 8191) << i4;
                        i4 += 13;
                        i = i7;
                    }
                    i3 |= charAt << i4;
                } else {
                    i7 = i;
                }
                i = i7 + 1;
                charAt2 = zzgn.charAt(i7);
                if (charAt2 >= 55296) {
                    i4 = charAt2 & 8191;
                    i7 = 13;
                    while (true) {
                        i5 = i + 1;
                        charAt = zzgn.charAt(i);
                        if (charAt < 55296) {
                            break;
                        }
                        i4 |= (charAt & 8191) << i7;
                        i7 += 13;
                        i = i5;
                    }
                    charAt2 = (charAt << i7) | i4;
                } else {
                    i5 = i;
                }
                i = i5 + 1;
                c2 = zzgn.charAt(i5);
                if (c2 >= 55296) {
                    i7 = c2 & 8191;
                    i5 = 13;
                    while (true) {
                        i11 = i + 1;
                        charAt = zzgn.charAt(i);
                        if (charAt < 55296) {
                            break;
                        }
                        i7 |= (charAt & 8191) << i5;
                        i5 += 13;
                        i = i11;
                    }
                    c2 = (charAt << i5) | i7;
                } else {
                    i11 = i;
                }
                i = i11 + 1;
                i5 = zzgn.charAt(i11);
                if (i5 >= 55296) {
                    i5 &= 8191;
                    i11 = 13;
                    while (true) {
                        i6 = i + 1;
                        charAt = zzgn.charAt(i);
                        if (charAt < 55296) {
                            break;
                        }
                        i5 |= (charAt & 8191) << i11;
                        i11 += 13;
                        i = i6;
                    }
                    i5 = (charAt << i11) | i5;
                    i = i6;
                }
                i11 = i + 1;
                i = zzgn.charAt(i);
                if (i >= 55296) {
                    i &= 8191;
                    i6 = 13;
                    while (true) {
                        i12 = i11 + 1;
                        charAt5 = zzgn.charAt(i11);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i |= (charAt5 & 8191) << i6;
                        i6 += 13;
                        i11 = i12;
                    }
                    i |= charAt5 << i6;
                    i11 = i12;
                }
                i6 = i11 + 1;
                i11 = zzgn.charAt(i11);
                if (i11 >= 55296) {
                    i12 = 13;
                    i8 = i6;
                    i6 = i11 & 8191;
                    i11 = i8;
                    while (true) {
                        i9 = i11 + 1;
                        charAt5 = zzgn.charAt(i11);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i6 |= (charAt5 & 8191) << i12;
                        i12 += 13;
                        i11 = i9;
                    }
                    i11 = i6 | (charAt5 << i12);
                    i10 = i9;
                } else {
                    i10 = i6;
                }
                i6 = i10 + 1;
                i10 = zzgn.charAt(i10);
                if (i10 >= 55296) {
                    char charAt6;
                    i12 = 13;
                    i8 = i6;
                    i6 = i10 & 8191;
                    i10 = i8;
                    while (true) {
                        i9 = i10 + 1;
                        charAt6 = zzgn.charAt(i10);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i6 |= (charAt6 & 8191) << i12;
                        i12 += 13;
                        i10 = i9;
                    }
                    i10 = i6 | (charAt6 << i12);
                    i6 = i9;
                }
                iArr = new int[((i10 + i) + i11)];
                i3 = (i2 << 1) + i3;
                i8 = i6;
                i6 = i2;
                c = charAt2;
                i4 = i8;
            }
            Unsafe unsafe = zzzc;
            Object[] zzgo = zzhu.zzgo();
            Class cls2 = zzhu.zzgg().getClass();
            i9 = i3;
            int[] iArr2 = new int[(i5 * 3)];
            Object[] objArr = new Object[(i5 << 1)];
            int i13 = i10 + i;
            int i14 = i10;
            int i15 = i13;
            i = 0;
            int i16 = 0;
            while (i4 < length) {
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                String str;
                Class cls3;
                char c3;
                char c4;
                int i23;
                int i24 = i4 + 1;
                i4 = zzgn.charAt(i4);
                char c5 = 55296;
                if (i4 >= 55296) {
                    i17 = 13;
                    i8 = i24;
                    i24 = i4 & 8191;
                    i4 = i8;
                    while (true) {
                        i18 = i4 + 1;
                        charAt2 = zzgn.charAt(i4);
                        if (charAt2 < c5) {
                            break;
                        }
                        i24 |= (charAt2 & 8191) << i17;
                        i17 += 13;
                        i4 = i18;
                        c5 = 55296;
                    }
                    i4 = i24 | (charAt2 << i17);
                    i19 = i18;
                } else {
                    i19 = i24;
                }
                i24 = i19 + 1;
                i19 = zzgn.charAt(i19);
                i17 = length;
                char c6 = 55296;
                if (i19 >= 55296) {
                    i18 = 13;
                    i8 = i24;
                    i24 = i19 & 8191;
                    i19 = i8;
                    while (true) {
                        i20 = i19 + 1;
                        c5 = zzgn.charAt(i19);
                        if (c5 < c6) {
                            break;
                        }
                        i24 |= (c5 & 8191) << i18;
                        i18 += 13;
                        i19 = i20;
                        c6 = 55296;
                    }
                    i19 = i24 | (c5 << i18);
                    length = i20;
                } else {
                    length = i24;
                }
                i24 = i10;
                i10 = i19 & 255;
                z = z2;
                if ((i19 & 1024) != 0) {
                    i21 = i + 1;
                    iArr[i] = i16;
                    i = i21;
                }
                int i25 = i;
                char charAt7;
                if (i10 >= 51) {
                    int i26;
                    Field field;
                    i21 = length + 1;
                    length = zzgn.charAt(length);
                    charAt = 55296;
                    if (length >= 55296) {
                        int i27;
                        length &= 8191;
                        i26 = 13;
                        while (true) {
                            i27 = i21 + 1;
                            charAt7 = zzgn.charAt(i21);
                            if (charAt7 < charAt) {
                                break;
                            }
                            length |= (charAt7 & 8191) << i26;
                            i26 += 13;
                            i21 = i27;
                            charAt = 55296;
                        }
                        length |= charAt7 << i26;
                        i21 = i27;
                    }
                    i = i10 - 51;
                    i26 = i21;
                    if (i == 9 || i == 17) {
                        i21 = 1;
                        i22 = i9 + 1;
                        objArr[((i16 / 3) << 1) + 1] = zzgo[i9];
                        i9 = i22;
                    } else {
                        if (i == 12 && (charAt3 & 1) == 1) {
                            i21 = i9 + 1;
                            objArr[((i16 / 3) << 1) + 1] = zzgo[i9];
                            i9 = i21;
                        }
                        i21 = 1;
                    }
                    length <<= i21;
                    Object obj = zzgo[length];
                    if (obj instanceof Field) {
                        field = (Field) obj;
                    } else {
                        field = zza(cls2, (String) obj);
                        zzgo[length] = field;
                    }
                    charAt7 = c;
                    i2 = (int) unsafe.objectFieldOffset(field);
                    length++;
                    obj = zzgo[length];
                    i20 = i2;
                    if (obj instanceof Field) {
                        field = (Field) obj;
                    } else {
                        field = zza(cls2, (String) obj);
                        zzgo[length] = field;
                    }
                    str = zzgn;
                    i = (int) unsafe.objectFieldOffset(field);
                    cls3 = cls2;
                    i22 = i9;
                    i2 = i20;
                    length = 0;
                    c3 = charAt7;
                    c4 = c2;
                    i7 = i4;
                    i4 = i26;
                } else {
                    charAt7 = c;
                    i = i9 + 1;
                    Field zza = zza(cls2, (String) zzgo[i9]);
                    c4 = c2;
                    if (i10 == 9 || i10 == 17) {
                        c3 = charAt7;
                        objArr[((i16 / 3) << 1) + 1] = zza.getType();
                    } else {
                        if (i10 == 27 || i10 == 49) {
                            c3 = charAt7;
                            i22 = i + 1;
                            objArr[((i16 / 3) << 1) + 1] = zzgo[i];
                        } else if (i10 == 12 || i10 == 30 || i10 == 44) {
                            c3 = charAt7;
                            if ((charAt3 & 1) == 1) {
                                i22 = i + 1;
                                objArr[((i16 / 3) << 1) + 1] = zzgo[i];
                            }
                        } else if (i10 == 50) {
                            i7 = i14 + 1;
                            iArr[i14] = i16;
                            i14 = (i16 / 3) << 1;
                            i20 = i + 1;
                            objArr[i14] = zzgo[i];
                            if ((i19 & 2048) != 0) {
                                i = i20 + 1;
                                objArr[i14 + 1] = zzgo[i20];
                                c3 = charAt7;
                                i14 = i7;
                            } else {
                                i14 = i7;
                                i = i20;
                                c3 = charAt7;
                            }
                        } else {
                            c3 = charAt7;
                        }
                        i7 = i4;
                        i = i22;
                        i2 = (int) unsafe.objectFieldOffset(zza);
                        if ((charAt3 & 1) == 1 || i10 > 17) {
                            str = zzgn;
                            cls3 = cls2;
                            i22 = i;
                            i21 = length;
                            length = 0;
                            i = 0;
                        } else {
                            Field field2;
                            i21 = length + 1;
                            length = zzgn.charAt(length);
                            if (length >= 55296) {
                                int i28;
                                length &= 8191;
                                int i29 = 13;
                                while (true) {
                                    i28 = i21 + 1;
                                    charAt7 = zzgn.charAt(i21);
                                    if (charAt7 < 55296) {
                                        break;
                                    }
                                    length |= (charAt7 & 8191) << i29;
                                    i29 += 13;
                                    i21 = i28;
                                }
                                length |= charAt7 << i29;
                                i21 = i28;
                            }
                            i22 = (i6 << 1) + (length / 32);
                            Object obj2 = zzgo[i22];
                            str = zzgn;
                            if (obj2 instanceof Field) {
                                field2 = (Field) obj2;
                            } else {
                                field2 = zza(cls2, (String) obj2);
                                zzgo[i22] = field2;
                            }
                            cls3 = cls2;
                            i22 = i;
                            i = (int) unsafe.objectFieldOffset(field2);
                            length %= 32;
                        }
                        if (i10 >= 18 && i10 <= 49) {
                            i23 = i15 + 1;
                            iArr[i15] = i2;
                            i15 = i23;
                        }
                        i4 = i21;
                    }
                    i7 = i4;
                    i2 = (int) unsafe.objectFieldOffset(zza);
                    if ((charAt3 & 1) == 1) {
                    }
                    str = zzgn;
                    cls3 = cls2;
                    i22 = i;
                    i21 = length;
                    length = 0;
                    i = 0;
                    i23 = i15 + 1;
                    iArr[i15] = i2;
                    i15 = i23;
                    i4 = i21;
                }
                i23 = i16 + 1;
                iArr2[i16] = i7;
                i21 = i23 + 1;
                iArr2[i23] = ((i10 << 20) | (((i19 & 256) != 0 ? 268435456 : 0) | ((i19 & 512) != 0 ? 536870912 : 0))) | i2;
                i16 = i21 + 1;
                iArr2[i21] = (length << 20) | i;
                cls2 = cls3;
                c2 = c4;
                i10 = i24;
                i9 = i22;
                length = i17;
                z2 = z;
                c = c3;
                i = i25;
                zzgn = str;
            }
            z = z2;
            return new zzhj(iArr2, objArr, c, c2, zzhu.zzgg(), z2, false, iArr, i10, i13, zzhn, zzgp, zzio, zzfl, zzha);
        }
        ((zzij) zzhd2).zzge();
        throw new NoSuchMethodError();
    }

    private static Field zza(Class<?> cls, String str) {
        Class cls2;
        try {
            cls2 = cls2.getDeclaredField(str);
            return cls2;
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls2.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls2.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 40) + String.valueOf(name).length()) + String.valueOf(arrays).length());
            stringBuilder.append("Field ");
            stringBuilder.append(str);
            stringBuilder.append(" for ");
            stringBuilder.append(name);
            stringBuilder.append(" not found. Known fields are ");
            stringBuilder.append(arrays);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final T newInstance() {
        return this.zzzp.newInstance(this.zzzh);
    }

    /* JADX WARNING: Missing block: B:8:0x0038, code skipped:
            if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:14:0x006a, code skipped:
            if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:18:0x007e, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:22:0x0090, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:26:0x00a4, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:30:0x00b6, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:34:0x00c8, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:38:0x00da, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:42:0x00f0, code skipped:
            if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:46:0x0106, code skipped:
            if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:50:0x011c, code skipped:
            if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:54:0x012e, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzm(r10, r6) == com.google.android.gms.internal.vision.zziu.zzm(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:58:0x0140, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:62:0x0154, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:66:0x0165, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:70:0x0178, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:74:0x018b, code skipped:
            if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:78:0x01a4, code skipped:
            if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zziu.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zziu.zzn(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:82:0x01bf, code skipped:
            if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zziu.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zziu.zzo(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:83:0x01c1, code skipped:
            r3 = false;
     */
    public final boolean equals(T r10, T r11) {
        /*
        r9 = this;
        r0 = r9.zzzd;
        r0 = r0.length;
        r1 = 0;
        r2 = 0;
    L_0x0005:
        r3 = 1;
        if (r2 >= r0) goto L_0x01c9;
    L_0x0008:
        r4 = r9.zzbk(r2);
        r5 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r6 = r4 & r5;
        r6 = (long) r6;
        r8 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r4 = r4 & r8;
        r4 = r4 >>> 20;
        switch(r4) {
            case 0: goto L_0x01a7;
            case 1: goto L_0x018e;
            case 2: goto L_0x017b;
            case 3: goto L_0x0168;
            case 4: goto L_0x0157;
            case 5: goto L_0x0144;
            case 6: goto L_0x0132;
            case 7: goto L_0x0120;
            case 8: goto L_0x010a;
            case 9: goto L_0x00f4;
            case 10: goto L_0x00de;
            case 11: goto L_0x00cc;
            case 12: goto L_0x00ba;
            case 13: goto L_0x00a8;
            case 14: goto L_0x0094;
            case 15: goto L_0x0082;
            case 16: goto L_0x006e;
            case 17: goto L_0x0058;
            case 18: goto L_0x004a;
            case 19: goto L_0x004a;
            case 20: goto L_0x004a;
            case 21: goto L_0x004a;
            case 22: goto L_0x004a;
            case 23: goto L_0x004a;
            case 24: goto L_0x004a;
            case 25: goto L_0x004a;
            case 26: goto L_0x004a;
            case 27: goto L_0x004a;
            case 28: goto L_0x004a;
            case 29: goto L_0x004a;
            case 30: goto L_0x004a;
            case 31: goto L_0x004a;
            case 32: goto L_0x004a;
            case 33: goto L_0x004a;
            case 34: goto L_0x004a;
            case 35: goto L_0x004a;
            case 36: goto L_0x004a;
            case 37: goto L_0x004a;
            case 38: goto L_0x004a;
            case 39: goto L_0x004a;
            case 40: goto L_0x004a;
            case 41: goto L_0x004a;
            case 42: goto L_0x004a;
            case 43: goto L_0x004a;
            case 44: goto L_0x004a;
            case 45: goto L_0x004a;
            case 46: goto L_0x004a;
            case 47: goto L_0x004a;
            case 48: goto L_0x004a;
            case 49: goto L_0x004a;
            case 50: goto L_0x003c;
            case 51: goto L_0x001c;
            case 52: goto L_0x001c;
            case 53: goto L_0x001c;
            case 54: goto L_0x001c;
            case 55: goto L_0x001c;
            case 56: goto L_0x001c;
            case 57: goto L_0x001c;
            case 58: goto L_0x001c;
            case 59: goto L_0x001c;
            case 60: goto L_0x001c;
            case 61: goto L_0x001c;
            case 62: goto L_0x001c;
            case 63: goto L_0x001c;
            case 64: goto L_0x001c;
            case 65: goto L_0x001c;
            case 66: goto L_0x001c;
            case 67: goto L_0x001c;
            case 68: goto L_0x001c;
            default: goto L_0x001a;
        };
    L_0x001a:
        goto L_0x01c2;
    L_0x001c:
        r4 = r9.zzbl(r2);
        r4 = r4 & r5;
        r4 = (long) r4;
        r8 = com.google.android.gms.internal.vision.zziu.zzk(r10, r4);
        r4 = com.google.android.gms.internal.vision.zziu.zzk(r11, r4);
        if (r8 != r4) goto L_0x01c1;
    L_0x002c:
        r4 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6);
        r4 = com.google.android.gms.internal.vision.zzhy.zzd(r4, r5);
        if (r4 != 0) goto L_0x01c2;
    L_0x003a:
        goto L_0x01c1;
    L_0x003c:
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6);
        r4 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6);
        r3 = com.google.android.gms.internal.vision.zzhy.zzd(r3, r4);
        goto L_0x01c2;
    L_0x004a:
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6);
        r4 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6);
        r3 = com.google.android.gms.internal.vision.zzhy.zzd(r3, r4);
        goto L_0x01c2;
    L_0x0058:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x005e:
        r4 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6);
        r4 = com.google.android.gms.internal.vision.zzhy.zzd(r4, r5);
        if (r4 != 0) goto L_0x01c2;
    L_0x006c:
        goto L_0x01c1;
    L_0x006e:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x0074:
        r4 = com.google.android.gms.internal.vision.zziu.zzl(r10, r6);
        r6 = com.google.android.gms.internal.vision.zziu.zzl(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01c2;
    L_0x0080:
        goto L_0x01c1;
    L_0x0082:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x0088:
        r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6);
        if (r4 == r5) goto L_0x01c2;
    L_0x0092:
        goto L_0x01c1;
    L_0x0094:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x009a:
        r4 = com.google.android.gms.internal.vision.zziu.zzl(r10, r6);
        r6 = com.google.android.gms.internal.vision.zziu.zzl(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01c2;
    L_0x00a6:
        goto L_0x01c1;
    L_0x00a8:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x00ae:
        r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6);
        if (r4 == r5) goto L_0x01c2;
    L_0x00b8:
        goto L_0x01c1;
    L_0x00ba:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x00c0:
        r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6);
        if (r4 == r5) goto L_0x01c2;
    L_0x00ca:
        goto L_0x01c1;
    L_0x00cc:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x00d2:
        r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6);
        if (r4 == r5) goto L_0x01c2;
    L_0x00dc:
        goto L_0x01c1;
    L_0x00de:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x00e4:
        r4 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6);
        r4 = com.google.android.gms.internal.vision.zzhy.zzd(r4, r5);
        if (r4 != 0) goto L_0x01c2;
    L_0x00f2:
        goto L_0x01c1;
    L_0x00f4:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x00fa:
        r4 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6);
        r4 = com.google.android.gms.internal.vision.zzhy.zzd(r4, r5);
        if (r4 != 0) goto L_0x01c2;
    L_0x0108:
        goto L_0x01c1;
    L_0x010a:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x0110:
        r4 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6);
        r4 = com.google.android.gms.internal.vision.zzhy.zzd(r4, r5);
        if (r4 != 0) goto L_0x01c2;
    L_0x011e:
        goto L_0x01c1;
    L_0x0120:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x0126:
        r4 = com.google.android.gms.internal.vision.zziu.zzm(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzm(r11, r6);
        if (r4 == r5) goto L_0x01c2;
    L_0x0130:
        goto L_0x01c1;
    L_0x0132:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x0138:
        r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6);
        if (r4 == r5) goto L_0x01c2;
    L_0x0142:
        goto L_0x01c1;
    L_0x0144:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x014a:
        r4 = com.google.android.gms.internal.vision.zziu.zzl(r10, r6);
        r6 = com.google.android.gms.internal.vision.zziu.zzl(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01c2;
    L_0x0156:
        goto L_0x01c1;
    L_0x0157:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x015d:
        r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6);
        r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6);
        if (r4 == r5) goto L_0x01c2;
    L_0x0167:
        goto L_0x01c1;
    L_0x0168:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x016e:
        r4 = com.google.android.gms.internal.vision.zziu.zzl(r10, r6);
        r6 = com.google.android.gms.internal.vision.zziu.zzl(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01c2;
    L_0x017a:
        goto L_0x01c1;
    L_0x017b:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x0181:
        r4 = com.google.android.gms.internal.vision.zziu.zzl(r10, r6);
        r6 = com.google.android.gms.internal.vision.zziu.zzl(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01c2;
    L_0x018d:
        goto L_0x01c1;
    L_0x018e:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x0194:
        r4 = com.google.android.gms.internal.vision.zziu.zzn(r10, r6);
        r4 = java.lang.Float.floatToIntBits(r4);
        r5 = com.google.android.gms.internal.vision.zziu.zzn(r11, r6);
        r5 = java.lang.Float.floatToIntBits(r5);
        if (r4 == r5) goto L_0x01c2;
    L_0x01a6:
        goto L_0x01c1;
    L_0x01a7:
        r4 = r9.zzc(r10, r11, r2);
        if (r4 == 0) goto L_0x01c1;
    L_0x01ad:
        r4 = com.google.android.gms.internal.vision.zziu.zzo(r10, r6);
        r4 = java.lang.Double.doubleToLongBits(r4);
        r6 = com.google.android.gms.internal.vision.zziu.zzo(r11, r6);
        r6 = java.lang.Double.doubleToLongBits(r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01c2;
    L_0x01c1:
        r3 = 0;
    L_0x01c2:
        if (r3 != 0) goto L_0x01c5;
    L_0x01c4:
        return r1;
    L_0x01c5:
        r2 = r2 + 3;
        goto L_0x0005;
    L_0x01c9:
        r0 = r9.zzzr;
        r0 = r0.zzt(r10);
        r2 = r9.zzzr;
        r2 = r2.zzt(r11);
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x01dc;
    L_0x01db:
        return r1;
    L_0x01dc:
        r0 = r9.zzzi;
        if (r0 == 0) goto L_0x01f1;
    L_0x01e0:
        r0 = r9.zzzs;
        r10 = r0.zzc(r10);
        r0 = r9.zzzs;
        r11 = r0.zzc(r11);
        r10 = r10.equals(r11);
        return r10;
    L_0x01f1:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Missing block: B:73:0x01c3, code skipped:
            r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Missing block: B:83:0x0227, code skipped:
            r2 = r2 + r3;
     */
    /* JADX WARNING: Missing block: B:84:0x0228, code skipped:
            r1 = r1 + 3;
     */
    public final int hashCode(T r9) {
        /*
        r8 = this;
        r0 = r8.zzzd;
        r0 = r0.length;
        r1 = 0;
        r2 = 0;
    L_0x0005:
        if (r1 >= r0) goto L_0x022c;
    L_0x0007:
        r3 = r8.zzbk(r1);
        r4 = r8.zzzd;
        r4 = r4[r1];
        r5 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r5 = r5 & r3;
        r5 = (long) r5;
        r7 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r3 = r3 & r7;
        r3 = r3 >>> 20;
        r7 = 37;
        switch(r3) {
            case 0: goto L_0x0219;
            case 1: goto L_0x020e;
            case 2: goto L_0x0203;
            case 3: goto L_0x01f8;
            case 4: goto L_0x01f1;
            case 5: goto L_0x01e6;
            case 6: goto L_0x01df;
            case 7: goto L_0x01d4;
            case 8: goto L_0x01c7;
            case 9: goto L_0x01b9;
            case 10: goto L_0x01ad;
            case 11: goto L_0x01a5;
            case 12: goto L_0x019d;
            case 13: goto L_0x0195;
            case 14: goto L_0x0189;
            case 15: goto L_0x0181;
            case 16: goto L_0x0175;
            case 17: goto L_0x016a;
            case 18: goto L_0x015e;
            case 19: goto L_0x015e;
            case 20: goto L_0x015e;
            case 21: goto L_0x015e;
            case 22: goto L_0x015e;
            case 23: goto L_0x015e;
            case 24: goto L_0x015e;
            case 25: goto L_0x015e;
            case 26: goto L_0x015e;
            case 27: goto L_0x015e;
            case 28: goto L_0x015e;
            case 29: goto L_0x015e;
            case 30: goto L_0x015e;
            case 31: goto L_0x015e;
            case 32: goto L_0x015e;
            case 33: goto L_0x015e;
            case 34: goto L_0x015e;
            case 35: goto L_0x015e;
            case 36: goto L_0x015e;
            case 37: goto L_0x015e;
            case 38: goto L_0x015e;
            case 39: goto L_0x015e;
            case 40: goto L_0x015e;
            case 41: goto L_0x015e;
            case 42: goto L_0x015e;
            case 43: goto L_0x015e;
            case 44: goto L_0x015e;
            case 45: goto L_0x015e;
            case 46: goto L_0x015e;
            case 47: goto L_0x015e;
            case 48: goto L_0x015e;
            case 49: goto L_0x015e;
            case 50: goto L_0x0152;
            case 51: goto L_0x013c;
            case 52: goto L_0x012a;
            case 53: goto L_0x0118;
            case 54: goto L_0x0106;
            case 55: goto L_0x00f8;
            case 56: goto L_0x00e6;
            case 57: goto L_0x00d8;
            case 58: goto L_0x00c6;
            case 59: goto L_0x00b2;
            case 60: goto L_0x00a0;
            case 61: goto L_0x008e;
            case 62: goto L_0x0080;
            case 63: goto L_0x0072;
            case 64: goto L_0x0064;
            case 65: goto L_0x0052;
            case 66: goto L_0x0044;
            case 67: goto L_0x0032;
            case 68: goto L_0x0020;
            default: goto L_0x001e;
        };
    L_0x001e:
        goto L_0x0228;
    L_0x0020:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x0026:
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5);
        r2 = r2 * 53;
        r3 = r3.hashCode();
        goto L_0x0227;
    L_0x0032:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x0038:
        r2 = r2 * 53;
        r3 = zzi(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x0044:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x004a:
        r2 = r2 * 53;
        r3 = zzh(r9, r5);
        goto L_0x0227;
    L_0x0052:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x0058:
        r2 = r2 * 53;
        r3 = zzi(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x0064:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x006a:
        r2 = r2 * 53;
        r3 = zzh(r9, r5);
        goto L_0x0227;
    L_0x0072:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x0078:
        r2 = r2 * 53;
        r3 = zzh(r9, r5);
        goto L_0x0227;
    L_0x0080:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x0086:
        r2 = r2 * 53;
        r3 = zzh(r9, r5);
        goto L_0x0227;
    L_0x008e:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x0094:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0227;
    L_0x00a0:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x00a6:
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5);
        r2 = r2 * 53;
        r3 = r3.hashCode();
        goto L_0x0227;
    L_0x00b2:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x00b8:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5);
        r3 = (java.lang.String) r3;
        r3 = r3.hashCode();
        goto L_0x0227;
    L_0x00c6:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x00cc:
        r2 = r2 * 53;
        r3 = zzj(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzj(r3);
        goto L_0x0227;
    L_0x00d8:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x00de:
        r2 = r2 * 53;
        r3 = zzh(r9, r5);
        goto L_0x0227;
    L_0x00e6:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x00ec:
        r2 = r2 * 53;
        r3 = zzi(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x00f8:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x00fe:
        r2 = r2 * 53;
        r3 = zzh(r9, r5);
        goto L_0x0227;
    L_0x0106:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x010c:
        r2 = r2 * 53;
        r3 = zzi(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x0118:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x011e:
        r2 = r2 * 53;
        r3 = zzi(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x012a:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x0130:
        r2 = r2 * 53;
        r3 = zzg(r9, r5);
        r3 = java.lang.Float.floatToIntBits(r3);
        goto L_0x0227;
    L_0x013c:
        r3 = r8.zza(r9, r4, r1);
        if (r3 == 0) goto L_0x0228;
    L_0x0142:
        r2 = r2 * 53;
        r3 = zzf(r9, r5);
        r3 = java.lang.Double.doubleToLongBits(r3);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x0152:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0227;
    L_0x015e:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0227;
    L_0x016a:
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5);
        if (r3 == 0) goto L_0x01c3;
    L_0x0170:
        r7 = r3.hashCode();
        goto L_0x01c3;
    L_0x0175:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzl(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x0181:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5);
        goto L_0x0227;
    L_0x0189:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzl(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x0195:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5);
        goto L_0x0227;
    L_0x019d:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5);
        goto L_0x0227;
    L_0x01a5:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5);
        goto L_0x0227;
    L_0x01ad:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0227;
    L_0x01b9:
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5);
        if (r3 == 0) goto L_0x01c3;
    L_0x01bf:
        r7 = r3.hashCode();
    L_0x01c3:
        r2 = r2 * 53;
        r2 = r2 + r7;
        goto L_0x0228;
    L_0x01c7:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5);
        r3 = (java.lang.String) r3;
        r3 = r3.hashCode();
        goto L_0x0227;
    L_0x01d4:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzm(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzj(r3);
        goto L_0x0227;
    L_0x01df:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5);
        goto L_0x0227;
    L_0x01e6:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzl(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x01f1:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5);
        goto L_0x0227;
    L_0x01f8:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzl(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x0203:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzl(r9, r5);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
        goto L_0x0227;
    L_0x020e:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzn(r9, r5);
        r3 = java.lang.Float.floatToIntBits(r3);
        goto L_0x0227;
    L_0x0219:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.vision.zziu.zzo(r9, r5);
        r3 = java.lang.Double.doubleToLongBits(r3);
        r3 = com.google.android.gms.internal.vision.zzga.zzo(r3);
    L_0x0227:
        r2 = r2 + r3;
    L_0x0228:
        r1 = r1 + 3;
        goto L_0x0005;
    L_0x022c:
        r2 = r2 * 53;
        r0 = r8.zzzr;
        r0 = r0.zzt(r9);
        r0 = r0.hashCode();
        r2 = r2 + r0;
        r0 = r8.zzzi;
        if (r0 == 0) goto L_0x024a;
    L_0x023d:
        r2 = r2 * 53;
        r0 = r8.zzzs;
        r9 = r0.zzc(r9);
        r9 = r9.hashCode();
        r2 = r2 + r9;
    L_0x024a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.hashCode(java.lang.Object):int");
    }

    public final void zzc(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzzd.length; i += 3) {
                int zzbk = zzbk(i);
                long j = (long) (1048575 & zzbk);
                int i2 = this.zzzd[i];
                switch ((zzbk & 267386880) >>> 20) {
                    case 0:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzo(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 1:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzn(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 2:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzl(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 3:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzl(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 4:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 5:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzl(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 6:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 7:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzm(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 8:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzp(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 9:
                        zza((Object) t, (Object) t2, i);
                        break;
                    case 10:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzp(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 11:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 12:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 13:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 14:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzl(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 15:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 16:
                        if (!zza((Object) t2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzl(t2, j));
                        zzb((Object) t, i);
                        break;
                    case 17:
                        zza((Object) t, (Object) t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.zzzq.zza(t, t2, j);
                        break;
                    case 50:
                        zzhy.zza(this.zzzt, (Object) t, (Object) t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zza((Object) t2, i2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzp(t2, j));
                        zzb((Object) t, i2, i);
                        break;
                    case 60:
                        zzb((Object) t, (Object) t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zza((Object) t2, i2, i)) {
                            break;
                        }
                        zziu.zza((Object) t, j, zziu.zzp(t2, j));
                        zzb((Object) t, i2, i);
                        break;
                    case 68:
                        zzb((Object) t, (Object) t2, i);
                        break;
                    default:
                        break;
                }
            }
            if (!this.zzzk) {
                zzhy.zza(this.zzzr, (Object) t, (Object) t2);
                if (this.zzzi) {
                    zzhy.zza(this.zzzs, (Object) t, (Object) t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    private final void zza(T t, T t2, int i) {
        long zzbk = (long) (zzbk(i) & 1048575);
        if (zza((Object) t2, i)) {
            Object zzp = zziu.zzp(t, zzbk);
            Object zzp2 = zziu.zzp(t2, zzbk);
            if (zzp == null || zzp2 == null) {
                if (zzp2 != null) {
                    zziu.zza((Object) t, zzbk, zzp2);
                    zzb((Object) t, i);
                }
                return;
            }
            zziu.zza((Object) t, zzbk, zzga.zza(zzp, zzp2));
            zzb((Object) t, i);
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzbk = zzbk(i);
        int i2 = this.zzzd[i];
        long j = (long) (zzbk & 1048575);
        if (zza((Object) t2, i2, i)) {
            Object zzp = zziu.zzp(t, j);
            Object zzp2 = zziu.zzp(t2, j);
            if (zzp == null || zzp2 == null) {
                if (zzp2 != null) {
                    zziu.zza((Object) t, j, zzp2);
                    zzb((Object) t, i2, i);
                }
                return;
            }
            zziu.zza((Object) t, j, zzga.zza(zzp, zzp2));
            zzb((Object) t, i2, i);
        }
    }

    /* JADX WARNING: Missing block: B:398:0x0833, code skipped:
            r9 = (r9 + r10) + r4;
     */
    /* JADX WARNING: Missing block: B:418:0x090c, code skipped:
            r13 = 0;
     */
    /* JADX WARNING: Missing block: B:434:0x0954, code skipped:
            r5 = r5 + r9;
     */
    /* JADX WARNING: Missing block: B:472:0x0a01, code skipped:
            r5 = r5 + r9;
     */
    /* JADX WARNING: Missing block: B:481:0x0a23, code skipped:
            r3 = r3 + 3;
            r9 = r13;
     */
    public final int zzp(T r20) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r0.zzzk;
        r3 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r4 = 0;
        r7 = 1;
        r8 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r9 = 0;
        r11 = 0;
        if (r2 == 0) goto L_0x04f2;
    L_0x0012:
        r2 = zzzc;
        r12 = 0;
        r13 = 0;
    L_0x0016:
        r14 = r0.zzzd;
        r14 = r14.length;
        if (r12 >= r14) goto L_0x04ea;
    L_0x001b:
        r14 = r0.zzbk(r12);
        r15 = r14 & r3;
        r15 = r15 >>> 20;
        r3 = r0.zzzd;
        r3 = r3[r12];
        r14 = r14 & r8;
        r5 = (long) r14;
        r14 = com.google.android.gms.internal.vision.zzfs.DOUBLE_LIST_PACKED;
        r14 = r14.id();
        if (r15 < r14) goto L_0x0041;
    L_0x0031:
        r14 = com.google.android.gms.internal.vision.zzfs.SINT64_LIST_PACKED;
        r14 = r14.id();
        if (r15 > r14) goto L_0x0041;
    L_0x0039:
        r14 = r0.zzzd;
        r17 = r12 + 2;
        r14 = r14[r17];
        r14 = r14 & r8;
        goto L_0x0042;
    L_0x0041:
        r14 = 0;
    L_0x0042:
        switch(r15) {
            case 0: goto L_0x04d6;
            case 1: goto L_0x04ca;
            case 2: goto L_0x04ba;
            case 3: goto L_0x04aa;
            case 4: goto L_0x049a;
            case 5: goto L_0x048e;
            case 6: goto L_0x0482;
            case 7: goto L_0x0476;
            case 8: goto L_0x0458;
            case 9: goto L_0x0444;
            case 10: goto L_0x0433;
            case 11: goto L_0x0424;
            case 12: goto L_0x0415;
            case 13: goto L_0x040a;
            case 14: goto L_0x03ff;
            case 15: goto L_0x03f0;
            case 16: goto L_0x03e1;
            case 17: goto L_0x03cc;
            case 18: goto L_0x03c1;
            case 19: goto L_0x03b8;
            case 20: goto L_0x03af;
            case 21: goto L_0x03a6;
            case 22: goto L_0x039d;
            case 23: goto L_0x0394;
            case 24: goto L_0x038b;
            case 25: goto L_0x0382;
            case 26: goto L_0x0379;
            case 27: goto L_0x036c;
            case 28: goto L_0x0363;
            case 29: goto L_0x035a;
            case 30: goto L_0x0350;
            case 31: goto L_0x0346;
            case 32: goto L_0x033c;
            case 33: goto L_0x0332;
            case 34: goto L_0x0328;
            case 35: goto L_0x0308;
            case 36: goto L_0x02eb;
            case 37: goto L_0x02ce;
            case 38: goto L_0x02b1;
            case 39: goto L_0x0293;
            case 40: goto L_0x0275;
            case 41: goto L_0x0257;
            case 42: goto L_0x0239;
            case 43: goto L_0x021b;
            case 44: goto L_0x01fd;
            case 45: goto L_0x01df;
            case 46: goto L_0x01c1;
            case 47: goto L_0x01a3;
            case 48: goto L_0x0185;
            case 49: goto L_0x0177;
            case 50: goto L_0x0167;
            case 51: goto L_0x0159;
            case 52: goto L_0x014d;
            case 53: goto L_0x013d;
            case 54: goto L_0x012d;
            case 55: goto L_0x011d;
            case 56: goto L_0x0111;
            case 57: goto L_0x0105;
            case 58: goto L_0x00f9;
            case 59: goto L_0x00db;
            case 60: goto L_0x00c7;
            case 61: goto L_0x00b5;
            case 62: goto L_0x00a5;
            case 63: goto L_0x0095;
            case 64: goto L_0x0089;
            case 65: goto L_0x007d;
            case 66: goto L_0x006d;
            case 67: goto L_0x005d;
            case 68: goto L_0x0047;
            default: goto L_0x0045;
        };
    L_0x0045:
        goto L_0x04e4;
    L_0x0047:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x004d:
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5);
        r5 = (com.google.android.gms.internal.vision.zzhf) r5;
        r6 = r0.zzbh(r12);
        r3 = com.google.android.gms.internal.vision.zzfe.zzc(r3, r5, r6);
        goto L_0x03c9;
    L_0x005d:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x0063:
        r5 = zzi(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzf(r3, r5);
        goto L_0x03c9;
    L_0x006d:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x0073:
        r5 = zzh(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzk(r3, r5);
        goto L_0x03c9;
    L_0x007d:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x0083:
        r3 = com.google.android.gms.internal.vision.zzfe.zzh(r3, r9);
        goto L_0x03c9;
    L_0x0089:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x008f:
        r3 = com.google.android.gms.internal.vision.zzfe.zzm(r3, r11);
        goto L_0x03c9;
    L_0x0095:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x009b:
        r5 = zzh(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzn(r3, r5);
        goto L_0x03c9;
    L_0x00a5:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x00ab:
        r5 = zzh(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzj(r3, r5);
        goto L_0x03c9;
    L_0x00b5:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x00bb:
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5);
        r5 = (com.google.android.gms.internal.vision.zzeo) r5;
        r3 = com.google.android.gms.internal.vision.zzfe.zzc(r3, r5);
        goto L_0x03c9;
    L_0x00c7:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x00cd:
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5);
        r6 = r0.zzbh(r12);
        r3 = com.google.android.gms.internal.vision.zzhy.zzc(r3, r5, r6);
        goto L_0x03c9;
    L_0x00db:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x00e1:
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5);
        r6 = r5 instanceof com.google.android.gms.internal.vision.zzeo;
        if (r6 == 0) goto L_0x00f1;
    L_0x00e9:
        r5 = (com.google.android.gms.internal.vision.zzeo) r5;
        r3 = com.google.android.gms.internal.vision.zzfe.zzc(r3, r5);
        goto L_0x03c9;
    L_0x00f1:
        r5 = (java.lang.String) r5;
        r3 = com.google.android.gms.internal.vision.zzfe.zzb(r3, r5);
        goto L_0x03c9;
    L_0x00f9:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x00ff:
        r3 = com.google.android.gms.internal.vision.zzfe.zzc(r3, r7);
        goto L_0x03c9;
    L_0x0105:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x010b:
        r3 = com.google.android.gms.internal.vision.zzfe.zzl(r3, r11);
        goto L_0x03c9;
    L_0x0111:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x0117:
        r3 = com.google.android.gms.internal.vision.zzfe.zzg(r3, r9);
        goto L_0x03c9;
    L_0x011d:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x0123:
        r5 = zzh(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzi(r3, r5);
        goto L_0x03c9;
    L_0x012d:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x0133:
        r5 = zzi(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zze(r3, r5);
        goto L_0x03c9;
    L_0x013d:
        r14 = r0.zza(r1, r3, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x0143:
        r5 = zzi(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzd(r3, r5);
        goto L_0x03c9;
    L_0x014d:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x0153:
        r3 = com.google.android.gms.internal.vision.zzfe.zzb(r3, r4);
        goto L_0x03c9;
    L_0x0159:
        r5 = r0.zza(r1, r3, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x015f:
        r5 = 0;
        r3 = com.google.android.gms.internal.vision.zzfe.zzb(r3, r5);
        goto L_0x03c9;
    L_0x0167:
        r14 = r0.zzzt;
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5);
        r6 = r0.zzbi(r12);
        r3 = r14.zzb(r3, r5, r6);
        goto L_0x03c9;
    L_0x0177:
        r5 = zze(r1, r5);
        r6 = r0.zzbh(r12);
        r3 = com.google.android.gms.internal.vision.zzhy.zzd(r3, r5, r6);
        goto L_0x03c9;
    L_0x0185:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzs(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x0191:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x0199;
    L_0x0195:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0199:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x01a3:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzw(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x01af:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x01b7;
    L_0x01b3:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x01b7:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x01c1:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzy(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x01cd:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x01d5;
    L_0x01d1:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x01d5:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x01df:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzx(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x01eb:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x01f3;
    L_0x01ef:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x01f3:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x01fd:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzt(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x0209:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x0211;
    L_0x020d:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0211:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x021b:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzv(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x0227:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x022f;
    L_0x022b:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x022f:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x0239:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzz(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x0245:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x024d;
    L_0x0249:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x024d:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x0257:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzx(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x0263:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x026b;
    L_0x0267:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x026b:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x0275:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzy(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x0281:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x0289;
    L_0x0285:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0289:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x0293:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzu(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x029f:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x02a7;
    L_0x02a3:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x02a7:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x02b1:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzr(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x02bd:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x02c5;
    L_0x02c1:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x02c5:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x02ce:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzq(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x02da:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x02e2;
    L_0x02de:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x02e2:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x02eb:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzx(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x02f7:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x02ff;
    L_0x02fb:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x02ff:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
        goto L_0x0324;
    L_0x0308:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.vision.zzhy.zzy(r5);
        if (r5 <= 0) goto L_0x04e4;
    L_0x0314:
        r6 = r0.zzzl;
        if (r6 == 0) goto L_0x031c;
    L_0x0318:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x031c:
        r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3);
        r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5);
    L_0x0324:
        r3 = r3 + r6;
        r3 = r3 + r5;
        goto L_0x03c9;
    L_0x0328:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzq(r3, r5, r11);
        goto L_0x03c9;
    L_0x0332:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzu(r3, r5, r11);
        goto L_0x03c9;
    L_0x033c:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzw(r3, r5, r11);
        goto L_0x03c9;
    L_0x0346:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzv(r3, r5, r11);
        goto L_0x03c9;
    L_0x0350:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzr(r3, r5, r11);
        goto L_0x03c9;
    L_0x035a:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzt(r3, r5, r11);
        goto L_0x03c9;
    L_0x0363:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzd(r3, r5);
        goto L_0x03c9;
    L_0x036c:
        r5 = zze(r1, r5);
        r6 = r0.zzbh(r12);
        r3 = com.google.android.gms.internal.vision.zzhy.zzc(r3, r5, r6);
        goto L_0x03c9;
    L_0x0379:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzc(r3, r5);
        goto L_0x03c9;
    L_0x0382:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzx(r3, r5, r11);
        goto L_0x03c9;
    L_0x038b:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzv(r3, r5, r11);
        goto L_0x03c9;
    L_0x0394:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzw(r3, r5, r11);
        goto L_0x03c9;
    L_0x039d:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzs(r3, r5, r11);
        goto L_0x03c9;
    L_0x03a6:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzp(r3, r5, r11);
        goto L_0x03c9;
    L_0x03af:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzo(r3, r5, r11);
        goto L_0x03c9;
    L_0x03b8:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzv(r3, r5, r11);
        goto L_0x03c9;
    L_0x03c1:
        r5 = zze(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzhy.zzw(r3, r5, r11);
    L_0x03c9:
        r13 = r13 + r3;
        goto L_0x04e4;
    L_0x03cc:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x03d2:
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5);
        r5 = (com.google.android.gms.internal.vision.zzhf) r5;
        r6 = r0.zzbh(r12);
        r3 = com.google.android.gms.internal.vision.zzfe.zzc(r3, r5, r6);
        goto L_0x03c9;
    L_0x03e1:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x03e7:
        r5 = com.google.android.gms.internal.vision.zziu.zzl(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzf(r3, r5);
        goto L_0x03c9;
    L_0x03f0:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x03f6:
        r5 = com.google.android.gms.internal.vision.zziu.zzk(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzk(r3, r5);
        goto L_0x03c9;
    L_0x03ff:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x0405:
        r3 = com.google.android.gms.internal.vision.zzfe.zzh(r3, r9);
        goto L_0x03c9;
    L_0x040a:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x0410:
        r3 = com.google.android.gms.internal.vision.zzfe.zzm(r3, r11);
        goto L_0x03c9;
    L_0x0415:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x041b:
        r5 = com.google.android.gms.internal.vision.zziu.zzk(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzn(r3, r5);
        goto L_0x03c9;
    L_0x0424:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x042a:
        r5 = com.google.android.gms.internal.vision.zziu.zzk(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzj(r3, r5);
        goto L_0x03c9;
    L_0x0433:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x0439:
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5);
        r5 = (com.google.android.gms.internal.vision.zzeo) r5;
        r3 = com.google.android.gms.internal.vision.zzfe.zzc(r3, r5);
        goto L_0x03c9;
    L_0x0444:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x044a:
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5);
        r6 = r0.zzbh(r12);
        r3 = com.google.android.gms.internal.vision.zzhy.zzc(r3, r5, r6);
        goto L_0x03c9;
    L_0x0458:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x045e:
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5);
        r6 = r5 instanceof com.google.android.gms.internal.vision.zzeo;
        if (r6 == 0) goto L_0x046e;
    L_0x0466:
        r5 = (com.google.android.gms.internal.vision.zzeo) r5;
        r3 = com.google.android.gms.internal.vision.zzfe.zzc(r3, r5);
        goto L_0x03c9;
    L_0x046e:
        r5 = (java.lang.String) r5;
        r3 = com.google.android.gms.internal.vision.zzfe.zzb(r3, r5);
        goto L_0x03c9;
    L_0x0476:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x047c:
        r3 = com.google.android.gms.internal.vision.zzfe.zzc(r3, r7);
        goto L_0x03c9;
    L_0x0482:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x0488:
        r3 = com.google.android.gms.internal.vision.zzfe.zzl(r3, r11);
        goto L_0x03c9;
    L_0x048e:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x0494:
        r3 = com.google.android.gms.internal.vision.zzfe.zzg(r3, r9);
        goto L_0x03c9;
    L_0x049a:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x04a0:
        r5 = com.google.android.gms.internal.vision.zziu.zzk(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzi(r3, r5);
        goto L_0x03c9;
    L_0x04aa:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x04b0:
        r5 = com.google.android.gms.internal.vision.zziu.zzl(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zze(r3, r5);
        goto L_0x03c9;
    L_0x04ba:
        r14 = r0.zza(r1, r12);
        if (r14 == 0) goto L_0x04e4;
    L_0x04c0:
        r5 = com.google.android.gms.internal.vision.zziu.zzl(r1, r5);
        r3 = com.google.android.gms.internal.vision.zzfe.zzd(r3, r5);
        goto L_0x03c9;
    L_0x04ca:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x04d0:
        r3 = com.google.android.gms.internal.vision.zzfe.zzb(r3, r4);
        goto L_0x03c9;
    L_0x04d6:
        r5 = r0.zza(r1, r12);
        if (r5 == 0) goto L_0x04e4;
    L_0x04dc:
        r5 = 0;
        r3 = com.google.android.gms.internal.vision.zzfe.zzb(r3, r5);
        goto L_0x03c9;
    L_0x04e4:
        r12 = r12 + 3;
        r3 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        goto L_0x0016;
    L_0x04ea:
        r2 = r0.zzzr;
        r1 = zza(r2, r1);
        r13 = r13 + r1;
        return r13;
    L_0x04f2:
        r2 = zzzc;
        r3 = -1;
        r3 = 0;
        r5 = 0;
        r6 = -1;
        r12 = 0;
    L_0x04f9:
        r13 = r0.zzzd;
        r13 = r13.length;
        if (r3 >= r13) goto L_0x0a2a;
    L_0x04fe:
        r13 = r0.zzbk(r3);
        r14 = r0.zzzd;
        r15 = r14[r3];
        r16 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r17 = r13 & r16;
        r4 = r17 >>> 20;
        r11 = 17;
        if (r4 > r11) goto L_0x0525;
    L_0x0510:
        r11 = r3 + 2;
        r11 = r14[r11];
        r14 = r11 & r8;
        r18 = r11 >>> 20;
        r18 = r7 << r18;
        if (r14 == r6) goto L_0x0522;
    L_0x051c:
        r9 = (long) r14;
        r12 = r2.getInt(r1, r9);
        goto L_0x0523;
    L_0x0522:
        r14 = r6;
    L_0x0523:
        r6 = r14;
        goto L_0x0545;
    L_0x0525:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x0542;
    L_0x0529:
        r9 = com.google.android.gms.internal.vision.zzfs.DOUBLE_LIST_PACKED;
        r9 = r9.id();
        if (r4 < r9) goto L_0x0542;
    L_0x0531:
        r9 = com.google.android.gms.internal.vision.zzfs.SINT64_LIST_PACKED;
        r9 = r9.id();
        if (r4 > r9) goto L_0x0542;
    L_0x0539:
        r9 = r0.zzzd;
        r10 = r3 + 2;
        r9 = r9[r10];
        r11 = r9 & r8;
        goto L_0x0543;
    L_0x0542:
        r11 = 0;
    L_0x0543:
        r18 = 0;
    L_0x0545:
        r9 = r13 & r8;
        r9 = (long) r9;
        switch(r4) {
            case 0: goto L_0x0a14;
            case 1: goto L_0x0a04;
            case 2: goto L_0x09f2;
            case 3: goto L_0x09e2;
            case 4: goto L_0x09d2;
            case 5: goto L_0x09c3;
            case 6: goto L_0x09b7;
            case 7: goto L_0x09ad;
            case 8: goto L_0x0991;
            case 9: goto L_0x097f;
            case 10: goto L_0x0970;
            case 11: goto L_0x0963;
            case 12: goto L_0x0956;
            case 13: goto L_0x094b;
            case 14: goto L_0x0940;
            case 15: goto L_0x0933;
            case 16: goto L_0x0926;
            case 17: goto L_0x0913;
            case 18: goto L_0x08ff;
            case 19: goto L_0x08f3;
            case 20: goto L_0x08e7;
            case 21: goto L_0x08db;
            case 22: goto L_0x08cf;
            case 23: goto L_0x08c3;
            case 24: goto L_0x08b7;
            case 25: goto L_0x08ab;
            case 26: goto L_0x08a0;
            case 27: goto L_0x0891;
            case 28: goto L_0x0885;
            case 29: goto L_0x0878;
            case 30: goto L_0x086b;
            case 31: goto L_0x085e;
            case 32: goto L_0x0851;
            case 33: goto L_0x0844;
            case 34: goto L_0x0837;
            case 35: goto L_0x0817;
            case 36: goto L_0x07fa;
            case 37: goto L_0x07dd;
            case 38: goto L_0x07c0;
            case 39: goto L_0x07a2;
            case 40: goto L_0x0784;
            case 41: goto L_0x0766;
            case 42: goto L_0x0748;
            case 43: goto L_0x072a;
            case 44: goto L_0x070c;
            case 45: goto L_0x06ee;
            case 46: goto L_0x06d0;
            case 47: goto L_0x06b2;
            case 48: goto L_0x0694;
            case 49: goto L_0x0684;
            case 50: goto L_0x0674;
            case 51: goto L_0x0666;
            case 52: goto L_0x0659;
            case 53: goto L_0x0649;
            case 54: goto L_0x0639;
            case 55: goto L_0x0629;
            case 56: goto L_0x061b;
            case 57: goto L_0x060e;
            case 58: goto L_0x0602;
            case 59: goto L_0x05e4;
            case 60: goto L_0x05d0;
            case 61: goto L_0x05be;
            case 62: goto L_0x05ae;
            case 63: goto L_0x059e;
            case 64: goto L_0x0591;
            case 65: goto L_0x0583;
            case 66: goto L_0x0573;
            case 67: goto L_0x0563;
            case 68: goto L_0x054d;
            default: goto L_0x054b;
        };
    L_0x054b:
        goto L_0x090b;
    L_0x054d:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x0553:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.vision.zzhf) r4;
        r9 = r0.zzbh(r3);
        r4 = com.google.android.gms.internal.vision.zzfe.zzc(r15, r4, r9);
        goto L_0x090a;
    L_0x0563:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x0569:
        r9 = zzi(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zzf(r15, r9);
        goto L_0x090a;
    L_0x0573:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x0579:
        r4 = zzh(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zzk(r15, r4);
        goto L_0x090a;
    L_0x0583:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x0589:
        r9 = 0;
        r4 = com.google.android.gms.internal.vision.zzfe.zzh(r15, r9);
        goto L_0x090a;
    L_0x0591:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x0597:
        r4 = 0;
        r9 = com.google.android.gms.internal.vision.zzfe.zzm(r15, r4);
        goto L_0x0954;
    L_0x059e:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x05a4:
        r4 = zzh(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zzn(r15, r4);
        goto L_0x090a;
    L_0x05ae:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x05b4:
        r4 = zzh(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zzj(r15, r4);
        goto L_0x090a;
    L_0x05be:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x05c4:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.vision.zzeo) r4;
        r4 = com.google.android.gms.internal.vision.zzfe.zzc(r15, r4);
        goto L_0x090a;
    L_0x05d0:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x05d6:
        r4 = r2.getObject(r1, r9);
        r9 = r0.zzbh(r3);
        r4 = com.google.android.gms.internal.vision.zzhy.zzc(r15, r4, r9);
        goto L_0x090a;
    L_0x05e4:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x05ea:
        r4 = r2.getObject(r1, r9);
        r9 = r4 instanceof com.google.android.gms.internal.vision.zzeo;
        if (r9 == 0) goto L_0x05fa;
    L_0x05f2:
        r4 = (com.google.android.gms.internal.vision.zzeo) r4;
        r4 = com.google.android.gms.internal.vision.zzfe.zzc(r15, r4);
        goto L_0x090a;
    L_0x05fa:
        r4 = (java.lang.String) r4;
        r4 = com.google.android.gms.internal.vision.zzfe.zzb(r15, r4);
        goto L_0x090a;
    L_0x0602:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x0608:
        r4 = com.google.android.gms.internal.vision.zzfe.zzc(r15, r7);
        goto L_0x090a;
    L_0x060e:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x0614:
        r4 = 0;
        r9 = com.google.android.gms.internal.vision.zzfe.zzl(r15, r4);
        goto L_0x0954;
    L_0x061b:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x0621:
        r9 = 0;
        r4 = com.google.android.gms.internal.vision.zzfe.zzg(r15, r9);
        goto L_0x090a;
    L_0x0629:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x062f:
        r4 = zzh(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zzi(r15, r4);
        goto L_0x090a;
    L_0x0639:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x063f:
        r9 = zzi(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zze(r15, r9);
        goto L_0x090a;
    L_0x0649:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x064f:
        r9 = zzi(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zzd(r15, r9);
        goto L_0x090a;
    L_0x0659:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x065f:
        r4 = 0;
        r9 = com.google.android.gms.internal.vision.zzfe.zzb(r15, r4);
        goto L_0x0954;
    L_0x0666:
        r4 = r0.zza(r1, r15, r3);
        if (r4 == 0) goto L_0x090b;
    L_0x066c:
        r9 = 0;
        r4 = com.google.android.gms.internal.vision.zzfe.zzb(r15, r9);
        goto L_0x090a;
    L_0x0674:
        r4 = r0.zzzt;
        r9 = r2.getObject(r1, r9);
        r10 = r0.zzbi(r3);
        r4 = r4.zzb(r15, r9, r10);
        goto L_0x090a;
    L_0x0684:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r9 = r0.zzbh(r3);
        r4 = com.google.android.gms.internal.vision.zzhy.zzd(r15, r4, r9);
        goto L_0x090a;
    L_0x0694:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzs(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x06a0:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x06a8;
    L_0x06a4:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x06a8:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x06b2:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzw(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x06be:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x06c6;
    L_0x06c2:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x06c6:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x06d0:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzy(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x06dc:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x06e4;
    L_0x06e0:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x06e4:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x06ee:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzx(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x06fa:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x0702;
    L_0x06fe:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x0702:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x070c:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzt(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x0718:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x0720;
    L_0x071c:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x0720:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x072a:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzv(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x0736:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x073e;
    L_0x073a:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x073e:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x0748:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzz(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x0754:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x075c;
    L_0x0758:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x075c:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x0766:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzx(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x0772:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x077a;
    L_0x0776:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x077a:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x0784:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzy(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x0790:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x0798;
    L_0x0794:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x0798:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x07a2:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzu(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x07ae:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x07b6;
    L_0x07b2:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x07b6:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x07c0:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzr(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x07cc:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x07d4;
    L_0x07d0:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x07d4:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x07dd:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzq(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x07e9:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x07f1;
    L_0x07ed:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x07f1:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x07fa:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzx(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x0806:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x080e;
    L_0x080a:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x080e:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
        goto L_0x0833;
    L_0x0817:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzy(r4);
        if (r4 <= 0) goto L_0x090b;
    L_0x0823:
        r9 = r0.zzzl;
        if (r9 == 0) goto L_0x082b;
    L_0x0827:
        r9 = (long) r11;
        r2.putInt(r1, r9, r4);
    L_0x082b:
        r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15);
        r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4);
    L_0x0833:
        r9 = r9 + r10;
        r9 = r9 + r4;
        goto L_0x0954;
    L_0x0837:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r11 = 0;
        r4 = com.google.android.gms.internal.vision.zzhy.zzq(r15, r4, r11);
        goto L_0x090a;
    L_0x0844:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzu(r15, r4, r11);
        goto L_0x090a;
    L_0x0851:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzw(r15, r4, r11);
        goto L_0x090a;
    L_0x085e:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzv(r15, r4, r11);
        goto L_0x090a;
    L_0x086b:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzr(r15, r4, r11);
        goto L_0x090a;
    L_0x0878:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzt(r15, r4, r11);
        goto L_0x090a;
    L_0x0885:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzd(r15, r4);
        goto L_0x090a;
    L_0x0891:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r9 = r0.zzbh(r3);
        r4 = com.google.android.gms.internal.vision.zzhy.zzc(r15, r4, r9);
        goto L_0x090a;
    L_0x08a0:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzc(r15, r4);
        goto L_0x090a;
    L_0x08ab:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r11 = 0;
        r4 = com.google.android.gms.internal.vision.zzhy.zzx(r15, r4, r11);
        goto L_0x090a;
    L_0x08b7:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzv(r15, r4, r11);
        goto L_0x090a;
    L_0x08c3:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzw(r15, r4, r11);
        goto L_0x090a;
    L_0x08cf:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzs(r15, r4, r11);
        goto L_0x090a;
    L_0x08db:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzp(r15, r4, r11);
        goto L_0x090a;
    L_0x08e7:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzo(r15, r4, r11);
        goto L_0x090a;
    L_0x08f3:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzv(r15, r4, r11);
        goto L_0x090a;
    L_0x08ff:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.vision.zzhy.zzw(r15, r4, r11);
    L_0x090a:
        r5 = r5 + r4;
    L_0x090b:
        r4 = 0;
    L_0x090c:
        r9 = 0;
        r10 = 0;
        r13 = 0;
        goto L_0x0a23;
    L_0x0913:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x0917:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.vision.zzhf) r4;
        r9 = r0.zzbh(r3);
        r4 = com.google.android.gms.internal.vision.zzfe.zzc(r15, r4, r9);
        goto L_0x090a;
    L_0x0926:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x092a:
        r9 = r2.getLong(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zzf(r15, r9);
        goto L_0x090a;
    L_0x0933:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x0937:
        r4 = r2.getInt(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zzk(r15, r4);
        goto L_0x090a;
    L_0x0940:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x0944:
        r9 = 0;
        r4 = com.google.android.gms.internal.vision.zzfe.zzh(r15, r9);
        goto L_0x090a;
    L_0x094b:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x094f:
        r4 = 0;
        r9 = com.google.android.gms.internal.vision.zzfe.zzm(r15, r4);
    L_0x0954:
        r5 = r5 + r9;
        goto L_0x090b;
    L_0x0956:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x095a:
        r4 = r2.getInt(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zzn(r15, r4);
        goto L_0x090a;
    L_0x0963:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x0967:
        r4 = r2.getInt(r1, r9);
        r4 = com.google.android.gms.internal.vision.zzfe.zzj(r15, r4);
        goto L_0x090a;
    L_0x0970:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x0974:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.vision.zzeo) r4;
        r4 = com.google.android.gms.internal.vision.zzfe.zzc(r15, r4);
        goto L_0x090a;
    L_0x097f:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x0983:
        r4 = r2.getObject(r1, r9);
        r9 = r0.zzbh(r3);
        r4 = com.google.android.gms.internal.vision.zzhy.zzc(r15, r4, r9);
        goto L_0x090a;
    L_0x0991:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x0995:
        r4 = r2.getObject(r1, r9);
        r9 = r4 instanceof com.google.android.gms.internal.vision.zzeo;
        if (r9 == 0) goto L_0x09a5;
    L_0x099d:
        r4 = (com.google.android.gms.internal.vision.zzeo) r4;
        r4 = com.google.android.gms.internal.vision.zzfe.zzc(r15, r4);
        goto L_0x090a;
    L_0x09a5:
        r4 = (java.lang.String) r4;
        r4 = com.google.android.gms.internal.vision.zzfe.zzb(r15, r4);
        goto L_0x090a;
    L_0x09ad:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x09b1:
        r4 = com.google.android.gms.internal.vision.zzfe.zzc(r15, r7);
        goto L_0x090a;
    L_0x09b7:
        r4 = r12 & r18;
        if (r4 == 0) goto L_0x090b;
    L_0x09bb:
        r4 = 0;
        r9 = com.google.android.gms.internal.vision.zzfe.zzl(r15, r4);
        r5 = r5 + r9;
        goto L_0x090c;
    L_0x09c3:
        r4 = 0;
        r9 = r12 & r18;
        if (r9 == 0) goto L_0x09cf;
    L_0x09c8:
        r13 = 0;
        r9 = com.google.android.gms.internal.vision.zzfe.zzg(r15, r13);
        goto L_0x0a01;
    L_0x09cf:
        r13 = 0;
        goto L_0x0a02;
    L_0x09d2:
        r4 = 0;
        r13 = 0;
        r11 = r12 & r18;
        if (r11 == 0) goto L_0x0a02;
    L_0x09d9:
        r9 = r2.getInt(r1, r9);
        r9 = com.google.android.gms.internal.vision.zzfe.zzi(r15, r9);
        goto L_0x0a01;
    L_0x09e2:
        r4 = 0;
        r13 = 0;
        r11 = r12 & r18;
        if (r11 == 0) goto L_0x0a02;
    L_0x09e9:
        r9 = r2.getLong(r1, r9);
        r9 = com.google.android.gms.internal.vision.zzfe.zze(r15, r9);
        goto L_0x0a01;
    L_0x09f2:
        r4 = 0;
        r13 = 0;
        r11 = r12 & r18;
        if (r11 == 0) goto L_0x0a02;
    L_0x09f9:
        r9 = r2.getLong(r1, r9);
        r9 = com.google.android.gms.internal.vision.zzfe.zzd(r15, r9);
    L_0x0a01:
        r5 = r5 + r9;
    L_0x0a02:
        r9 = 0;
        goto L_0x0a11;
    L_0x0a04:
        r4 = 0;
        r13 = 0;
        r9 = r12 & r18;
        if (r9 == 0) goto L_0x0a02;
    L_0x0a0b:
        r9 = 0;
        r10 = com.google.android.gms.internal.vision.zzfe.zzb(r15, r9);
        r5 = r5 + r10;
    L_0x0a11:
        r10 = 0;
        goto L_0x0a23;
    L_0x0a14:
        r4 = 0;
        r9 = 0;
        r13 = 0;
        r10 = r12 & r18;
        if (r10 == 0) goto L_0x0a11;
    L_0x0a1c:
        r10 = 0;
        r15 = com.google.android.gms.internal.vision.zzfe.zzb(r15, r10);
        r5 = r5 + r15;
    L_0x0a23:
        r3 = r3 + 3;
        r9 = r13;
        r4 = 0;
        r11 = 0;
        goto L_0x04f9;
    L_0x0a2a:
        r2 = r0.zzzr;
        r2 = zza(r2, r1);
        r5 = r5 + r2;
        r2 = r0.zzzi;
        if (r2 == 0) goto L_0x0a40;
    L_0x0a35:
        r2 = r0.zzzs;
        r1 = r2.zzc(r1);
        r1 = r1.zzeq();
        r5 = r5 + r1;
    L_0x0a40:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zzp(java.lang.Object):int");
    }

    private static <UT, UB> int zza(zzio<UT, UB> zzio, T t) {
        return zzio.zzp(zzio.zzt(t));
    }

    private static <E> List<E> zze(Object obj, long j) {
        return (List) zziu.zzp(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a27  */
    public final void zza(T r14, com.google.android.gms.internal.vision.zzjj r15) {
        /*
        r13 = this;
        r0 = r15.zzed();
        r1 = com.google.android.gms.internal.vision.zzfy.zzg.zzxj;
        r2 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r3 = 0;
        r4 = 1;
        r5 = 0;
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        if (r0 != r1) goto L_0x0527;
    L_0x0010:
        r0 = r13.zzzr;
        zza(r0, r14, r15);
        r0 = r13.zzzi;
        if (r0 == 0) goto L_0x0030;
    L_0x0019:
        r0 = r13.zzzs;
        r0 = r0.zzc(r14);
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x0030;
    L_0x0025:
        r0 = r0.descendingIterator();
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        goto L_0x0032;
    L_0x0030:
        r0 = r3;
        r1 = r0;
    L_0x0032:
        r7 = r13.zzzd;
        r7 = r7.length;
        r7 = r7 + -3;
    L_0x0037:
        if (r7 < 0) goto L_0x050f;
    L_0x0039:
        r8 = r13.zzbk(r7);
        r9 = r13.zzzd;
        r9 = r9[r7];
    L_0x0041:
        if (r1 == 0) goto L_0x005f;
    L_0x0043:
        r10 = r13.zzzs;
        r10 = r10.zza(r1);
        if (r10 <= r9) goto L_0x005f;
    L_0x004b:
        r10 = r13.zzzs;
        r10.zza(r15, r1);
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x005d;
    L_0x0056:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        goto L_0x0041;
    L_0x005d:
        r1 = r3;
        goto L_0x0041;
    L_0x005f:
        r10 = r8 & r2;
        r10 = r10 >>> 20;
        switch(r10) {
            case 0: goto L_0x04fc;
            case 1: goto L_0x04ec;
            case 2: goto L_0x04dc;
            case 3: goto L_0x04cc;
            case 4: goto L_0x04bc;
            case 5: goto L_0x04ac;
            case 6: goto L_0x049c;
            case 7: goto L_0x048b;
            case 8: goto L_0x047a;
            case 9: goto L_0x0465;
            case 10: goto L_0x0452;
            case 11: goto L_0x0441;
            case 12: goto L_0x0430;
            case 13: goto L_0x041f;
            case 14: goto L_0x040e;
            case 15: goto L_0x03fd;
            case 16: goto L_0x03ec;
            case 17: goto L_0x03d7;
            case 18: goto L_0x03c6;
            case 19: goto L_0x03b5;
            case 20: goto L_0x03a4;
            case 21: goto L_0x0393;
            case 22: goto L_0x0382;
            case 23: goto L_0x0371;
            case 24: goto L_0x0360;
            case 25: goto L_0x034f;
            case 26: goto L_0x033e;
            case 27: goto L_0x0329;
            case 28: goto L_0x0318;
            case 29: goto L_0x0307;
            case 30: goto L_0x02f6;
            case 31: goto L_0x02e5;
            case 32: goto L_0x02d4;
            case 33: goto L_0x02c3;
            case 34: goto L_0x02b2;
            case 35: goto L_0x02a1;
            case 36: goto L_0x0290;
            case 37: goto L_0x027f;
            case 38: goto L_0x026e;
            case 39: goto L_0x025d;
            case 40: goto L_0x024c;
            case 41: goto L_0x023b;
            case 42: goto L_0x022a;
            case 43: goto L_0x0219;
            case 44: goto L_0x0208;
            case 45: goto L_0x01f7;
            case 46: goto L_0x01e6;
            case 47: goto L_0x01d5;
            case 48: goto L_0x01c4;
            case 49: goto L_0x01af;
            case 50: goto L_0x01a4;
            case 51: goto L_0x0193;
            case 52: goto L_0x0182;
            case 53: goto L_0x0171;
            case 54: goto L_0x0160;
            case 55: goto L_0x014f;
            case 56: goto L_0x013e;
            case 57: goto L_0x012d;
            case 58: goto L_0x011c;
            case 59: goto L_0x010b;
            case 60: goto L_0x00f6;
            case 61: goto L_0x00e3;
            case 62: goto L_0x00d2;
            case 63: goto L_0x00c1;
            case 64: goto L_0x00b0;
            case 65: goto L_0x009f;
            case 66: goto L_0x008e;
            case 67: goto L_0x007d;
            case 68: goto L_0x0068;
            default: goto L_0x0066;
        };
    L_0x0066:
        goto L_0x050b;
    L_0x0068:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x006e:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r10 = r13.zzbh(r7);
        r15.zzb(r9, r8, r10);
        goto L_0x050b;
    L_0x007d:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0083:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzi(r14, r10);
        r15.zzb(r9, r10);
        goto L_0x050b;
    L_0x008e:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0094:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzh(r14, r10);
        r15.zzg(r9, r8);
        goto L_0x050b;
    L_0x009f:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x00a5:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzi(r14, r10);
        r15.zzj(r9, r10);
        goto L_0x050b;
    L_0x00b0:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x00b6:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzh(r14, r10);
        r15.zzo(r9, r8);
        goto L_0x050b;
    L_0x00c1:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x00c7:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzh(r14, r10);
        r15.zzp(r9, r8);
        goto L_0x050b;
    L_0x00d2:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x00d8:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzh(r14, r10);
        r15.zzf(r9, r8);
        goto L_0x050b;
    L_0x00e3:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x00e9:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (com.google.android.gms.internal.vision.zzeo) r8;
        r15.zza(r9, r8);
        goto L_0x050b;
    L_0x00f6:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x00fc:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r10 = r13.zzbh(r7);
        r15.zza(r9, r8, r10);
        goto L_0x050b;
    L_0x010b:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0111:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        zza(r9, r8, r15);
        goto L_0x050b;
    L_0x011c:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0122:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzj(r14, r10);
        r15.zzb(r9, r8);
        goto L_0x050b;
    L_0x012d:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0133:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzh(r14, r10);
        r15.zzh(r9, r8);
        goto L_0x050b;
    L_0x013e:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0144:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzi(r14, r10);
        r15.zzc(r9, r10);
        goto L_0x050b;
    L_0x014f:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0155:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzh(r14, r10);
        r15.zze(r9, r8);
        goto L_0x050b;
    L_0x0160:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0166:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzi(r14, r10);
        r15.zza(r9, r10);
        goto L_0x050b;
    L_0x0171:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0177:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzi(r14, r10);
        r15.zzi(r9, r10);
        goto L_0x050b;
    L_0x0182:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0188:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = zzg(r14, r10);
        r15.zza(r9, r8);
        goto L_0x050b;
    L_0x0193:
        r10 = r13.zza(r14, r9, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0199:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = zzf(r14, r10);
        r15.zza(r9, r10);
        goto L_0x050b;
    L_0x01a4:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r13.zza(r15, r9, r8, r7);
        goto L_0x050b;
    L_0x01af:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        r10 = r13.zzbh(r7);
        com.google.android.gms.internal.vision.zzhy.zzb(r9, r8, r15, r10);
        goto L_0x050b;
    L_0x01c4:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zze(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x01d5:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzj(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x01e6:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzg(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x01f7:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzl(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x0208:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzm(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x0219:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzi(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x022a:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzn(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x023b:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzk(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x024c:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzf(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x025d:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzh(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x026e:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzd(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x027f:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzc(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x0290:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzb(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x02a1:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zza(r9, r8, r15, r4);
        goto L_0x050b;
    L_0x02b2:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zze(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x02c3:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzj(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x02d4:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzg(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x02e5:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzl(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x02f6:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzm(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x0307:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzi(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x0318:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzb(r9, r8, r15);
        goto L_0x050b;
    L_0x0329:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        r10 = r13.zzbh(r7);
        com.google.android.gms.internal.vision.zzhy.zza(r9, r8, r15, r10);
        goto L_0x050b;
    L_0x033e:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zza(r9, r8, r15);
        goto L_0x050b;
    L_0x034f:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzn(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x0360:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzk(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x0371:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzf(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x0382:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzh(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x0393:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzd(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x03a4:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzc(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x03b5:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zzb(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x03c6:
        r9 = r13.zzzd;
        r9 = r9[r7];
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (java.util.List) r8;
        com.google.android.gms.internal.vision.zzhy.zza(r9, r8, r15, r5);
        goto L_0x050b;
    L_0x03d7:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x03dd:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r10 = r13.zzbh(r7);
        r15.zzb(r9, r8, r10);
        goto L_0x050b;
    L_0x03ec:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x03f2:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.vision.zziu.zzl(r14, r10);
        r15.zzb(r9, r10);
        goto L_0x050b;
    L_0x03fd:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0403:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10);
        r15.zzg(r9, r8);
        goto L_0x050b;
    L_0x040e:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0414:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.vision.zziu.zzl(r14, r10);
        r15.zzj(r9, r10);
        goto L_0x050b;
    L_0x041f:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0425:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10);
        r15.zzo(r9, r8);
        goto L_0x050b;
    L_0x0430:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0436:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10);
        r15.zzp(r9, r8);
        goto L_0x050b;
    L_0x0441:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0447:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10);
        r15.zzf(r9, r8);
        goto L_0x050b;
    L_0x0452:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0458:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r8 = (com.google.android.gms.internal.vision.zzeo) r8;
        r15.zza(r9, r8);
        goto L_0x050b;
    L_0x0465:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x046b:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        r10 = r13.zzbh(r7);
        r15.zza(r9, r8, r10);
        goto L_0x050b;
    L_0x047a:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0480:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10);
        zza(r9, r8, r15);
        goto L_0x050b;
    L_0x048b:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0491:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzm(r14, r10);
        r15.zzb(r9, r8);
        goto L_0x050b;
    L_0x049c:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x04a2:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10);
        r15.zzh(r9, r8);
        goto L_0x050b;
    L_0x04ac:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x04b2:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.vision.zziu.zzl(r14, r10);
        r15.zzc(r9, r10);
        goto L_0x050b;
    L_0x04bc:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x04c2:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10);
        r15.zze(r9, r8);
        goto L_0x050b;
    L_0x04cc:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x04d2:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.vision.zziu.zzl(r14, r10);
        r15.zza(r9, r10);
        goto L_0x050b;
    L_0x04dc:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x04e2:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.vision.zziu.zzl(r14, r10);
        r15.zzi(r9, r10);
        goto L_0x050b;
    L_0x04ec:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x04f2:
        r8 = r8 & r6;
        r10 = (long) r8;
        r8 = com.google.android.gms.internal.vision.zziu.zzn(r14, r10);
        r15.zza(r9, r8);
        goto L_0x050b;
    L_0x04fc:
        r10 = r13.zza(r14, r7);
        if (r10 == 0) goto L_0x050b;
    L_0x0502:
        r8 = r8 & r6;
        r10 = (long) r8;
        r10 = com.google.android.gms.internal.vision.zziu.zzo(r14, r10);
        r15.zza(r9, r10);
    L_0x050b:
        r7 = r7 + -3;
        goto L_0x0037;
    L_0x050f:
        if (r1 == 0) goto L_0x0526;
    L_0x0511:
        r14 = r13.zzzs;
        r14.zza(r15, r1);
        r14 = r0.hasNext();
        if (r14 == 0) goto L_0x0524;
    L_0x051c:
        r14 = r0.next();
        r14 = (java.util.Map.Entry) r14;
        r1 = r14;
        goto L_0x050f;
    L_0x0524:
        r1 = r3;
        goto L_0x050f;
    L_0x0526:
        return;
    L_0x0527:
        r0 = r13.zzzk;
        if (r0 == 0) goto L_0x0a42;
    L_0x052b:
        r0 = r13.zzzi;
        if (r0 == 0) goto L_0x0546;
    L_0x052f:
        r0 = r13.zzzs;
        r0 = r0.zzc(r14);
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x0546;
    L_0x053b:
        r0 = r0.iterator();
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        goto L_0x0548;
    L_0x0546:
        r0 = r3;
        r1 = r0;
    L_0x0548:
        r7 = r13.zzzd;
        r7 = r7.length;
        r8 = r1;
        r1 = 0;
    L_0x054d:
        if (r1 >= r7) goto L_0x0a25;
    L_0x054f:
        r9 = r13.zzbk(r1);
        r10 = r13.zzzd;
        r10 = r10[r1];
    L_0x0557:
        if (r8 == 0) goto L_0x0575;
    L_0x0559:
        r11 = r13.zzzs;
        r11 = r11.zza(r8);
        if (r11 > r10) goto L_0x0575;
    L_0x0561:
        r11 = r13.zzzs;
        r11.zza(r15, r8);
        r8 = r0.hasNext();
        if (r8 == 0) goto L_0x0573;
    L_0x056c:
        r8 = r0.next();
        r8 = (java.util.Map.Entry) r8;
        goto L_0x0557;
    L_0x0573:
        r8 = r3;
        goto L_0x0557;
    L_0x0575:
        r11 = r9 & r2;
        r11 = r11 >>> 20;
        switch(r11) {
            case 0: goto L_0x0a12;
            case 1: goto L_0x0a02;
            case 2: goto L_0x09f2;
            case 3: goto L_0x09e2;
            case 4: goto L_0x09d2;
            case 5: goto L_0x09c2;
            case 6: goto L_0x09b2;
            case 7: goto L_0x09a1;
            case 8: goto L_0x0990;
            case 9: goto L_0x097b;
            case 10: goto L_0x0968;
            case 11: goto L_0x0957;
            case 12: goto L_0x0946;
            case 13: goto L_0x0935;
            case 14: goto L_0x0924;
            case 15: goto L_0x0913;
            case 16: goto L_0x0902;
            case 17: goto L_0x08ed;
            case 18: goto L_0x08dc;
            case 19: goto L_0x08cb;
            case 20: goto L_0x08ba;
            case 21: goto L_0x08a9;
            case 22: goto L_0x0898;
            case 23: goto L_0x0887;
            case 24: goto L_0x0876;
            case 25: goto L_0x0865;
            case 26: goto L_0x0854;
            case 27: goto L_0x083f;
            case 28: goto L_0x082e;
            case 29: goto L_0x081d;
            case 30: goto L_0x080c;
            case 31: goto L_0x07fb;
            case 32: goto L_0x07ea;
            case 33: goto L_0x07d9;
            case 34: goto L_0x07c8;
            case 35: goto L_0x07b7;
            case 36: goto L_0x07a6;
            case 37: goto L_0x0795;
            case 38: goto L_0x0784;
            case 39: goto L_0x0773;
            case 40: goto L_0x0762;
            case 41: goto L_0x0751;
            case 42: goto L_0x0740;
            case 43: goto L_0x072f;
            case 44: goto L_0x071e;
            case 45: goto L_0x070d;
            case 46: goto L_0x06fc;
            case 47: goto L_0x06eb;
            case 48: goto L_0x06da;
            case 49: goto L_0x06c5;
            case 50: goto L_0x06ba;
            case 51: goto L_0x06a9;
            case 52: goto L_0x0698;
            case 53: goto L_0x0687;
            case 54: goto L_0x0676;
            case 55: goto L_0x0665;
            case 56: goto L_0x0654;
            case 57: goto L_0x0643;
            case 58: goto L_0x0632;
            case 59: goto L_0x0621;
            case 60: goto L_0x060c;
            case 61: goto L_0x05f9;
            case 62: goto L_0x05e8;
            case 63: goto L_0x05d7;
            case 64: goto L_0x05c6;
            case 65: goto L_0x05b5;
            case 66: goto L_0x05a4;
            case 67: goto L_0x0593;
            case 68: goto L_0x057e;
            default: goto L_0x057c;
        };
    L_0x057c:
        goto L_0x0a21;
    L_0x057e:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0584:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r11 = r13.zzbh(r1);
        r15.zzb(r10, r9, r11);
        goto L_0x0a21;
    L_0x0593:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0599:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzi(r14, r11);
        r15.zzb(r10, r11);
        goto L_0x0a21;
    L_0x05a4:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x05aa:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzh(r14, r11);
        r15.zzg(r10, r9);
        goto L_0x0a21;
    L_0x05b5:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x05bb:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzi(r14, r11);
        r15.zzj(r10, r11);
        goto L_0x0a21;
    L_0x05c6:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x05cc:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzh(r14, r11);
        r15.zzo(r10, r9);
        goto L_0x0a21;
    L_0x05d7:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x05dd:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzh(r14, r11);
        r15.zzp(r10, r9);
        goto L_0x0a21;
    L_0x05e8:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x05ee:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzh(r14, r11);
        r15.zzf(r10, r9);
        goto L_0x0a21;
    L_0x05f9:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x05ff:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (com.google.android.gms.internal.vision.zzeo) r9;
        r15.zza(r10, r9);
        goto L_0x0a21;
    L_0x060c:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0612:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r11 = r13.zzbh(r1);
        r15.zza(r10, r9, r11);
        goto L_0x0a21;
    L_0x0621:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0627:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        zza(r10, r9, r15);
        goto L_0x0a21;
    L_0x0632:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0638:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzj(r14, r11);
        r15.zzb(r10, r9);
        goto L_0x0a21;
    L_0x0643:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0649:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzh(r14, r11);
        r15.zzh(r10, r9);
        goto L_0x0a21;
    L_0x0654:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x065a:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzi(r14, r11);
        r15.zzc(r10, r11);
        goto L_0x0a21;
    L_0x0665:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x066b:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzh(r14, r11);
        r15.zze(r10, r9);
        goto L_0x0a21;
    L_0x0676:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x067c:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzi(r14, r11);
        r15.zza(r10, r11);
        goto L_0x0a21;
    L_0x0687:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x068d:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzi(r14, r11);
        r15.zzi(r10, r11);
        goto L_0x0a21;
    L_0x0698:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x069e:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = zzg(r14, r11);
        r15.zza(r10, r9);
        goto L_0x0a21;
    L_0x06a9:
        r11 = r13.zza(r14, r10, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x06af:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = zzf(r14, r11);
        r15.zza(r10, r11);
        goto L_0x0a21;
    L_0x06ba:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r13.zza(r15, r10, r9, r1);
        goto L_0x0a21;
    L_0x06c5:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        r11 = r13.zzbh(r1);
        com.google.android.gms.internal.vision.zzhy.zzb(r10, r9, r15, r11);
        goto L_0x0a21;
    L_0x06da:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zze(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x06eb:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzj(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x06fc:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzg(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x070d:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzl(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x071e:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzm(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x072f:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzi(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x0740:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzn(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x0751:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzk(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x0762:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzf(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x0773:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzh(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x0784:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzd(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x0795:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzc(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x07a6:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzb(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x07b7:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zza(r10, r9, r15, r4);
        goto L_0x0a21;
    L_0x07c8:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zze(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x07d9:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzj(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x07ea:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzg(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x07fb:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzl(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x080c:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzm(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x081d:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzi(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x082e:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzb(r10, r9, r15);
        goto L_0x0a21;
    L_0x083f:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        r11 = r13.zzbh(r1);
        com.google.android.gms.internal.vision.zzhy.zza(r10, r9, r15, r11);
        goto L_0x0a21;
    L_0x0854:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zza(r10, r9, r15);
        goto L_0x0a21;
    L_0x0865:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzn(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x0876:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzk(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x0887:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzf(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x0898:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzh(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x08a9:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzd(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x08ba:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzc(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x08cb:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzb(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x08dc:
        r10 = r13.zzzd;
        r10 = r10[r1];
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zza(r10, r9, r15, r5);
        goto L_0x0a21;
    L_0x08ed:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x08f3:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r11 = r13.zzbh(r1);
        r15.zzb(r10, r9, r11);
        goto L_0x0a21;
    L_0x0902:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0908:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.vision.zziu.zzl(r14, r11);
        r15.zzb(r10, r11);
        goto L_0x0a21;
    L_0x0913:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0919:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11);
        r15.zzg(r10, r9);
        goto L_0x0a21;
    L_0x0924:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x092a:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.vision.zziu.zzl(r14, r11);
        r15.zzj(r10, r11);
        goto L_0x0a21;
    L_0x0935:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x093b:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11);
        r15.zzo(r10, r9);
        goto L_0x0a21;
    L_0x0946:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x094c:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11);
        r15.zzp(r10, r9);
        goto L_0x0a21;
    L_0x0957:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x095d:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11);
        r15.zzf(r10, r9);
        goto L_0x0a21;
    L_0x0968:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x096e:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r9 = (com.google.android.gms.internal.vision.zzeo) r9;
        r15.zza(r10, r9);
        goto L_0x0a21;
    L_0x097b:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0981:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        r11 = r13.zzbh(r1);
        r15.zza(r10, r9, r11);
        goto L_0x0a21;
    L_0x0990:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0996:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11);
        zza(r10, r9, r15);
        goto L_0x0a21;
    L_0x09a1:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x09a7:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzm(r14, r11);
        r15.zzb(r10, r9);
        goto L_0x0a21;
    L_0x09b2:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x09b8:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11);
        r15.zzh(r10, r9);
        goto L_0x0a21;
    L_0x09c2:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x09c8:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.vision.zziu.zzl(r14, r11);
        r15.zzc(r10, r11);
        goto L_0x0a21;
    L_0x09d2:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x09d8:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11);
        r15.zze(r10, r9);
        goto L_0x0a21;
    L_0x09e2:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x09e8:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.vision.zziu.zzl(r14, r11);
        r15.zza(r10, r11);
        goto L_0x0a21;
    L_0x09f2:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x09f8:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.vision.zziu.zzl(r14, r11);
        r15.zzi(r10, r11);
        goto L_0x0a21;
    L_0x0a02:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0a08:
        r9 = r9 & r6;
        r11 = (long) r9;
        r9 = com.google.android.gms.internal.vision.zziu.zzn(r14, r11);
        r15.zza(r10, r9);
        goto L_0x0a21;
    L_0x0a12:
        r11 = r13.zza(r14, r1);
        if (r11 == 0) goto L_0x0a21;
    L_0x0a18:
        r9 = r9 & r6;
        r11 = (long) r9;
        r11 = com.google.android.gms.internal.vision.zziu.zzo(r14, r11);
        r15.zza(r10, r11);
    L_0x0a21:
        r1 = r1 + 3;
        goto L_0x054d;
    L_0x0a25:
        if (r8 == 0) goto L_0x0a3c;
    L_0x0a27:
        r1 = r13.zzzs;
        r1.zza(r15, r8);
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0a3a;
    L_0x0a32:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r8 = r1;
        goto L_0x0a25;
    L_0x0a3a:
        r8 = r3;
        goto L_0x0a25;
    L_0x0a3c:
        r0 = r13.zzzr;
        zza(r0, r14, r15);
        return;
    L_0x0a42:
        r13.zzb(r14, r15);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, com.google.android.gms.internal.vision.zzjj):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04b3  */
    private final void zzb(T r19, com.google.android.gms.internal.vision.zzjj r20) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r0.zzzi;
        if (r3 == 0) goto L_0x0021;
    L_0x000a:
        r3 = r0.zzzs;
        r3 = r3.zzc(r1);
        r5 = r3.isEmpty();
        if (r5 != 0) goto L_0x0021;
    L_0x0016:
        r3 = r3.iterator();
        r5 = r3.next();
        r5 = (java.util.Map.Entry) r5;
        goto L_0x0023;
    L_0x0021:
        r3 = 0;
        r5 = 0;
    L_0x0023:
        r6 = -1;
        r7 = r0.zzzd;
        r7 = r7.length;
        r8 = zzzc;
        r10 = r5;
        r5 = 0;
        r11 = 0;
    L_0x002c:
        if (r5 >= r7) goto L_0x04ad;
    L_0x002e:
        r12 = r0.zzbk(r5);
        r13 = r0.zzzd;
        r14 = r13[r5];
        r15 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r15 = r15 & r12;
        r15 = r15 >>> 20;
        r4 = r0.zzzk;
        r16 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        if (r4 != 0) goto L_0x0062;
    L_0x0042:
        r4 = 17;
        if (r15 > r4) goto L_0x0062;
    L_0x0046:
        r4 = r5 + 2;
        r4 = r13[r4];
        r13 = r4 & r16;
        if (r13 == r6) goto L_0x0056;
    L_0x004e:
        r17 = r10;
        r9 = (long) r13;
        r11 = r8.getInt(r1, r9);
        goto L_0x0059;
    L_0x0056:
        r17 = r10;
        r13 = r6;
    L_0x0059:
        r4 = r4 >>> 20;
        r6 = 1;
        r9 = r6 << r4;
        r6 = r13;
        r10 = r17;
        goto L_0x0067;
    L_0x0062:
        r17 = r10;
        r10 = r17;
        r9 = 0;
    L_0x0067:
        if (r10 == 0) goto L_0x0086;
    L_0x0069:
        r4 = r0.zzzs;
        r4 = r4.zza(r10);
        if (r4 > r14) goto L_0x0086;
    L_0x0071:
        r4 = r0.zzzs;
        r4.zza(r2, r10);
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0084;
    L_0x007c:
        r4 = r3.next();
        r4 = (java.util.Map.Entry) r4;
        r10 = r4;
        goto L_0x0067;
    L_0x0084:
        r10 = 0;
        goto L_0x0067;
    L_0x0086:
        r4 = r12 & r16;
        r12 = (long) r4;
        switch(r15) {
            case 0: goto L_0x049d;
            case 1: goto L_0x0490;
            case 2: goto L_0x0483;
            case 3: goto L_0x0476;
            case 4: goto L_0x0469;
            case 5: goto L_0x045c;
            case 6: goto L_0x044f;
            case 7: goto L_0x0442;
            case 8: goto L_0x0434;
            case 9: goto L_0x0422;
            case 10: goto L_0x0412;
            case 11: goto L_0x0404;
            case 12: goto L_0x03f6;
            case 13: goto L_0x03e8;
            case 14: goto L_0x03da;
            case 15: goto L_0x03cc;
            case 16: goto L_0x03be;
            case 17: goto L_0x03ac;
            case 18: goto L_0x039c;
            case 19: goto L_0x038c;
            case 20: goto L_0x037c;
            case 21: goto L_0x036c;
            case 22: goto L_0x035c;
            case 23: goto L_0x034c;
            case 24: goto L_0x033c;
            case 25: goto L_0x032c;
            case 26: goto L_0x031d;
            case 27: goto L_0x030a;
            case 28: goto L_0x02fb;
            case 29: goto L_0x02eb;
            case 30: goto L_0x02db;
            case 31: goto L_0x02cb;
            case 32: goto L_0x02bb;
            case 33: goto L_0x02ab;
            case 34: goto L_0x029b;
            case 35: goto L_0x028b;
            case 36: goto L_0x027b;
            case 37: goto L_0x026b;
            case 38: goto L_0x025b;
            case 39: goto L_0x024b;
            case 40: goto L_0x023b;
            case 41: goto L_0x022b;
            case 42: goto L_0x021b;
            case 43: goto L_0x020b;
            case 44: goto L_0x01fb;
            case 45: goto L_0x01eb;
            case 46: goto L_0x01db;
            case 47: goto L_0x01cb;
            case 48: goto L_0x01bb;
            case 49: goto L_0x01a8;
            case 50: goto L_0x019f;
            case 51: goto L_0x0190;
            case 52: goto L_0x0181;
            case 53: goto L_0x0172;
            case 54: goto L_0x0163;
            case 55: goto L_0x0154;
            case 56: goto L_0x0145;
            case 57: goto L_0x0136;
            case 58: goto L_0x0127;
            case 59: goto L_0x0118;
            case 60: goto L_0x0105;
            case 61: goto L_0x00f5;
            case 62: goto L_0x00e7;
            case 63: goto L_0x00d9;
            case 64: goto L_0x00cb;
            case 65: goto L_0x00bd;
            case 66: goto L_0x00af;
            case 67: goto L_0x00a1;
            case 68: goto L_0x008f;
            default: goto L_0x008c;
        };
    L_0x008c:
        r15 = 0;
        goto L_0x04a9;
    L_0x008f:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x0095:
        r4 = r8.getObject(r1, r12);
        r9 = r0.zzbh(r5);
        r2.zzb(r14, r4, r9);
        goto L_0x008c;
    L_0x00a1:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00a7:
        r12 = zzi(r1, r12);
        r2.zzb(r14, r12);
        goto L_0x008c;
    L_0x00af:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00b5:
        r4 = zzh(r1, r12);
        r2.zzg(r14, r4);
        goto L_0x008c;
    L_0x00bd:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00c3:
        r12 = zzi(r1, r12);
        r2.zzj(r14, r12);
        goto L_0x008c;
    L_0x00cb:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00d1:
        r4 = zzh(r1, r12);
        r2.zzo(r14, r4);
        goto L_0x008c;
    L_0x00d9:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00df:
        r4 = zzh(r1, r12);
        r2.zzp(r14, r4);
        goto L_0x008c;
    L_0x00e7:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00ed:
        r4 = zzh(r1, r12);
        r2.zzf(r14, r4);
        goto L_0x008c;
    L_0x00f5:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x00fb:
        r4 = r8.getObject(r1, r12);
        r4 = (com.google.android.gms.internal.vision.zzeo) r4;
        r2.zza(r14, r4);
        goto L_0x008c;
    L_0x0105:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x010b:
        r4 = r8.getObject(r1, r12);
        r9 = r0.zzbh(r5);
        r2.zza(r14, r4, r9);
        goto L_0x008c;
    L_0x0118:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x011e:
        r4 = r8.getObject(r1, r12);
        zza(r14, r4, r2);
        goto L_0x008c;
    L_0x0127:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x012d:
        r4 = zzj(r1, r12);
        r2.zzb(r14, r4);
        goto L_0x008c;
    L_0x0136:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x013c:
        r4 = zzh(r1, r12);
        r2.zzh(r14, r4);
        goto L_0x008c;
    L_0x0145:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x014b:
        r12 = zzi(r1, r12);
        r2.zzc(r14, r12);
        goto L_0x008c;
    L_0x0154:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x015a:
        r4 = zzh(r1, r12);
        r2.zze(r14, r4);
        goto L_0x008c;
    L_0x0163:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x0169:
        r12 = zzi(r1, r12);
        r2.zza(r14, r12);
        goto L_0x008c;
    L_0x0172:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x0178:
        r12 = zzi(r1, r12);
        r2.zzi(r14, r12);
        goto L_0x008c;
    L_0x0181:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x0187:
        r4 = zzg(r1, r12);
        r2.zza(r14, r4);
        goto L_0x008c;
    L_0x0190:
        r4 = r0.zza(r1, r14, r5);
        if (r4 == 0) goto L_0x008c;
    L_0x0196:
        r12 = zzf(r1, r12);
        r2.zza(r14, r12);
        goto L_0x008c;
    L_0x019f:
        r4 = r8.getObject(r1, r12);
        r0.zza(r2, r14, r4, r5);
        goto L_0x008c;
    L_0x01a8:
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r12 = r0.zzbh(r5);
        com.google.android.gms.internal.vision.zzhy.zzb(r4, r9, r2, r12);
        goto L_0x008c;
    L_0x01bb:
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r14 = 1;
        com.google.android.gms.internal.vision.zzhy.zze(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x01cb:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzj(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x01db:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzg(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x01eb:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzl(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x01fb:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzm(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x020b:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzi(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x021b:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzn(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x022b:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzk(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x023b:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzf(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x024b:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzh(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x025b:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzd(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x026b:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzc(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x027b:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzb(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x028b:
        r14 = 1;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zza(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x029b:
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r14 = 0;
        com.google.android.gms.internal.vision.zzhy.zze(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x02ab:
        r14 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzj(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x02bb:
        r14 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzg(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x02cb:
        r14 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzl(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x02db:
        r14 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzm(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x02eb:
        r14 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzi(r4, r9, r2, r14);
        goto L_0x008c;
    L_0x02fb:
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzb(r4, r9, r2);
        goto L_0x008c;
    L_0x030a:
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r12 = r0.zzbh(r5);
        com.google.android.gms.internal.vision.zzhy.zza(r4, r9, r2, r12);
        goto L_0x008c;
    L_0x031d:
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zza(r4, r9, r2);
        goto L_0x008c;
    L_0x032c:
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        r15 = 0;
        com.google.android.gms.internal.vision.zzhy.zzn(r4, r9, r2, r15);
        goto L_0x04a9;
    L_0x033c:
        r15 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzk(r4, r9, r2, r15);
        goto L_0x04a9;
    L_0x034c:
        r15 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzf(r4, r9, r2, r15);
        goto L_0x04a9;
    L_0x035c:
        r15 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzh(r4, r9, r2, r15);
        goto L_0x04a9;
    L_0x036c:
        r15 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzd(r4, r9, r2, r15);
        goto L_0x04a9;
    L_0x037c:
        r15 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzc(r4, r9, r2, r15);
        goto L_0x04a9;
    L_0x038c:
        r15 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zzb(r4, r9, r2, r15);
        goto L_0x04a9;
    L_0x039c:
        r15 = 0;
        r4 = r0.zzzd;
        r4 = r4[r5];
        r9 = r8.getObject(r1, r12);
        r9 = (java.util.List) r9;
        com.google.android.gms.internal.vision.zzhy.zza(r4, r9, r2, r15);
        goto L_0x04a9;
    L_0x03ac:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x03b1:
        r4 = r8.getObject(r1, r12);
        r9 = r0.zzbh(r5);
        r2.zzb(r14, r4, r9);
        goto L_0x04a9;
    L_0x03be:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x03c3:
        r12 = r8.getLong(r1, r12);
        r2.zzb(r14, r12);
        goto L_0x04a9;
    L_0x03cc:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x03d1:
        r4 = r8.getInt(r1, r12);
        r2.zzg(r14, r4);
        goto L_0x04a9;
    L_0x03da:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x03df:
        r12 = r8.getLong(r1, r12);
        r2.zzj(r14, r12);
        goto L_0x04a9;
    L_0x03e8:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x03ed:
        r4 = r8.getInt(r1, r12);
        r2.zzo(r14, r4);
        goto L_0x04a9;
    L_0x03f6:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x03fb:
        r4 = r8.getInt(r1, r12);
        r2.zzp(r14, r4);
        goto L_0x04a9;
    L_0x0404:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x0409:
        r4 = r8.getInt(r1, r12);
        r2.zzf(r14, r4);
        goto L_0x04a9;
    L_0x0412:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x0417:
        r4 = r8.getObject(r1, r12);
        r4 = (com.google.android.gms.internal.vision.zzeo) r4;
        r2.zza(r14, r4);
        goto L_0x04a9;
    L_0x0422:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x0427:
        r4 = r8.getObject(r1, r12);
        r9 = r0.zzbh(r5);
        r2.zza(r14, r4, r9);
        goto L_0x04a9;
    L_0x0434:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x0439:
        r4 = r8.getObject(r1, r12);
        zza(r14, r4, r2);
        goto L_0x04a9;
    L_0x0442:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x0447:
        r4 = com.google.android.gms.internal.vision.zziu.zzm(r1, r12);
        r2.zzb(r14, r4);
        goto L_0x04a9;
    L_0x044f:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x0454:
        r4 = r8.getInt(r1, r12);
        r2.zzh(r14, r4);
        goto L_0x04a9;
    L_0x045c:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x0461:
        r12 = r8.getLong(r1, r12);
        r2.zzc(r14, r12);
        goto L_0x04a9;
    L_0x0469:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x046e:
        r4 = r8.getInt(r1, r12);
        r2.zze(r14, r4);
        goto L_0x04a9;
    L_0x0476:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x047b:
        r12 = r8.getLong(r1, r12);
        r2.zza(r14, r12);
        goto L_0x04a9;
    L_0x0483:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x0488:
        r12 = r8.getLong(r1, r12);
        r2.zzi(r14, r12);
        goto L_0x04a9;
    L_0x0490:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x0495:
        r4 = com.google.android.gms.internal.vision.zziu.zzn(r1, r12);
        r2.zza(r14, r4);
        goto L_0x04a9;
    L_0x049d:
        r15 = 0;
        r4 = r11 & r9;
        if (r4 == 0) goto L_0x04a9;
    L_0x04a2:
        r12 = com.google.android.gms.internal.vision.zziu.zzo(r1, r12);
        r2.zza(r14, r12);
    L_0x04a9:
        r5 = r5 + 3;
        goto L_0x002c;
    L_0x04ad:
        r17 = r10;
        r4 = r17;
    L_0x04b1:
        if (r4 == 0) goto L_0x04c7;
    L_0x04b3:
        r5 = r0.zzzs;
        r5.zza(r2, r4);
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x04c5;
    L_0x04be:
        r4 = r3.next();
        r4 = (java.util.Map.Entry) r4;
        goto L_0x04b1;
    L_0x04c5:
        r4 = 0;
        goto L_0x04b1;
    L_0x04c7:
        r3 = r0.zzzr;
        zza(r3, r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zzb(java.lang.Object, com.google.android.gms.internal.vision.zzjj):void");
    }

    private final <K, V> void zza(zzjj zzjj, int i, Object obj, int i2) {
        if (obj != null) {
            zzjj.zza(i, this.zzzt.zzo(zzbi(i2)), this.zzzt.zzk(obj));
        }
    }

    private static <UT, UB> void zza(zzio<UT, UB> zzio, T t, zzjj zzjj) {
        zzio.zza(zzio.zzt(t), zzjj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x05db A:{REMOVE} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x059d */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:147|148|(1:150)|151|(6:173|153|(2:156|154)|255|(1:158)|159)(1:251)) */
    /* JADX WARNING: Missing block: B:148:?, code skipped:
            r7.zza(r14);
     */
    /* JADX WARNING: Missing block: B:149:0x05a0, code skipped:
            if (r10 == null) goto L_0x05a2;
     */
    /* JADX WARNING: Missing block: B:150:0x05a2, code skipped:
            r10 = r7.zzu(r13);
     */
    /* JADX WARNING: Missing block: B:152:0x05ab, code skipped:
            if (r7.zza(r10, r14) == false) goto L_0x05ad;
     */
    /* JADX WARNING: Missing block: B:153:0x05ad, code skipped:
            r14 = r12.zzzn;
     */
    /* JADX WARNING: Missing block: B:155:0x05b1, code skipped:
            if (r14 < r12.zzzo) goto L_0x05b3;
     */
    /* JADX WARNING: Missing block: B:156:0x05b3, code skipped:
            r10 = zza((java.lang.Object) r13, r12.zzzm[r14], r10, r7);
            r14 = r14 + 1;
     */
    /* JADX WARNING: Missing block: B:157:0x05be, code skipped:
            if (r10 != null) goto L_0x05c0;
     */
    /* JADX WARNING: Missing block: B:158:0x05c0, code skipped:
            r7.zzf(r13, r10);
     */
    /* JADX WARNING: Missing block: B:159:0x05c3, code skipped:
            return;
     */
    public final void zza(T r13, com.google.android.gms.internal.vision.zzhv r14, com.google.android.gms.internal.vision.zzfk r15) {
        /*
        r12 = this;
        if (r15 == 0) goto L_0x05dc;
    L_0x0002:
        r7 = r12.zzzr;
        r8 = r12.zzzs;
        r9 = 0;
        r0 = r9;
        r10 = r0;
    L_0x0009:
        r1 = r14.zzcn();	 Catch:{ all -> 0x05c4 }
        r2 = r12.zzbn(r1);	 Catch:{ all -> 0x05c4 }
        if (r2 >= 0) goto L_0x0077;
    L_0x0013:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 != r2) goto L_0x002f;
    L_0x0018:
        r14 = r12.zzzn;
    L_0x001a:
        r15 = r12.zzzo;
        if (r14 >= r15) goto L_0x0029;
    L_0x001e:
        r15 = r12.zzzm;
        r15 = r15[r14];
        r10 = r12.zza(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x001a;
    L_0x0029:
        if (r10 == 0) goto L_0x002e;
    L_0x002b:
        r7.zzf(r13, r10);
    L_0x002e:
        return;
    L_0x002f:
        r2 = r12.zzzi;	 Catch:{ all -> 0x05c4 }
        if (r2 != 0) goto L_0x0035;
    L_0x0033:
        r2 = r9;
        goto L_0x003c;
    L_0x0035:
        r2 = r12.zzzh;	 Catch:{ all -> 0x05c4 }
        r1 = r8.zza(r15, r2, r1);	 Catch:{ all -> 0x05c4 }
        r2 = r1;
    L_0x003c:
        if (r2 == 0) goto L_0x0051;
    L_0x003e:
        if (r0 != 0) goto L_0x0044;
    L_0x0040:
        r0 = r8.zzd(r13);	 Catch:{ all -> 0x05c4 }
    L_0x0044:
        r11 = r0;
        r0 = r8;
        r1 = r14;
        r3 = r15;
        r4 = r11;
        r5 = r10;
        r6 = r7;
        r10 = r0.zza(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x05c4 }
        r0 = r11;
        goto L_0x0009;
    L_0x0051:
        r7.zza(r14);	 Catch:{ all -> 0x05c4 }
        if (r10 != 0) goto L_0x005a;
    L_0x0056:
        r10 = r7.zzu(r13);	 Catch:{ all -> 0x05c4 }
    L_0x005a:
        r1 = r7.zza(r10, r14);	 Catch:{ all -> 0x05c4 }
        if (r1 != 0) goto L_0x0009;
    L_0x0060:
        r14 = r12.zzzn;
    L_0x0062:
        r15 = r12.zzzo;
        if (r14 >= r15) goto L_0x0071;
    L_0x0066:
        r15 = r12.zzzm;
        r15 = r15[r14];
        r10 = r12.zza(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x0062;
    L_0x0071:
        if (r10 == 0) goto L_0x0076;
    L_0x0073:
        r7.zzf(r13, r10);
    L_0x0076:
        return;
    L_0x0077:
        r3 = r12.zzbk(r2);	 Catch:{ all -> 0x05c4 }
        r4 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r4 = r4 & r3;
        r4 = r4 >>> 20;
        r5 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        switch(r4) {
            case 0: goto L_0x0571;
            case 1: goto L_0x0562;
            case 2: goto L_0x0553;
            case 3: goto L_0x0544;
            case 4: goto L_0x0535;
            case 5: goto L_0x0526;
            case 6: goto L_0x0517;
            case 7: goto L_0x0508;
            case 8: goto L_0x0500;
            case 9: goto L_0x04cf;
            case 10: goto L_0x04c0;
            case 11: goto L_0x04b1;
            case 12: goto L_0x048f;
            case 13: goto L_0x0480;
            case 14: goto L_0x0471;
            case 15: goto L_0x0462;
            case 16: goto L_0x0453;
            case 17: goto L_0x0422;
            case 18: goto L_0x0414;
            case 19: goto L_0x0406;
            case 20: goto L_0x03f8;
            case 21: goto L_0x03ea;
            case 22: goto L_0x03dc;
            case 23: goto L_0x03ce;
            case 24: goto L_0x03c0;
            case 25: goto L_0x03b2;
            case 26: goto L_0x0390;
            case 27: goto L_0x037e;
            case 28: goto L_0x0370;
            case 29: goto L_0x0362;
            case 30: goto L_0x034d;
            case 31: goto L_0x033f;
            case 32: goto L_0x0331;
            case 33: goto L_0x0323;
            case 34: goto L_0x0315;
            case 35: goto L_0x0307;
            case 36: goto L_0x02f9;
            case 37: goto L_0x02eb;
            case 38: goto L_0x02dd;
            case 39: goto L_0x02cf;
            case 40: goto L_0x02c1;
            case 41: goto L_0x02b3;
            case 42: goto L_0x02a5;
            case 43: goto L_0x0297;
            case 44: goto L_0x0282;
            case 45: goto L_0x0274;
            case 46: goto L_0x0266;
            case 47: goto L_0x0258;
            case 48: goto L_0x024a;
            case 49: goto L_0x0238;
            case 50: goto L_0x01f6;
            case 51: goto L_0x01e4;
            case 52: goto L_0x01d2;
            case 53: goto L_0x01c0;
            case 54: goto L_0x01ae;
            case 55: goto L_0x019c;
            case 56: goto L_0x018a;
            case 57: goto L_0x0178;
            case 58: goto L_0x0166;
            case 59: goto L_0x015e;
            case 60: goto L_0x012d;
            case 61: goto L_0x011f;
            case 62: goto L_0x010d;
            case 63: goto L_0x00e8;
            case 64: goto L_0x00d6;
            case 65: goto L_0x00c4;
            case 66: goto L_0x00b2;
            case 67: goto L_0x00a0;
            case 68: goto L_0x008e;
            default: goto L_0x0086;
        };
    L_0x0086:
        if (r10 != 0) goto L_0x0580;
    L_0x0088:
        r10 = r7.zzhd();	 Catch:{ zzgg -> 0x059d }
        goto L_0x0580;
    L_0x008e:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r12.zzbh(r2);	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzc(r5, r15);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x00a0:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzdc();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x00b2:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzdb();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x00c4:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzda();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x00d6:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcz();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x00e8:
        r4 = r14.zzcy();	 Catch:{ zzgg -> 0x059d }
        r6 = r12.zzbj(r2);	 Catch:{ zzgg -> 0x059d }
        if (r6 == 0) goto L_0x00ff;
    L_0x00f2:
        r6 = r6.zzh(r4);	 Catch:{ zzgg -> 0x059d }
        if (r6 == 0) goto L_0x00f9;
    L_0x00f8:
        goto L_0x00ff;
    L_0x00f9:
        r10 = com.google.android.gms.internal.vision.zzhy.zza(r1, r4, r10, r7);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x00ff:
        r3 = r3 & r5;
        r5 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r3 = java.lang.Integer.valueOf(r4);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r5, r3);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x010d:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcx();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x011f:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcw();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x012d:
        r4 = r12.zza(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        if (r4 == 0) goto L_0x0149;
    L_0x0133:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = com.google.android.gms.internal.vision.zziu.zzp(r13, r3);	 Catch:{ zzgg -> 0x059d }
        r6 = r12.zzbh(r2);	 Catch:{ zzgg -> 0x059d }
        r6 = r14.zza(r6, r15);	 Catch:{ zzgg -> 0x059d }
        r5 = com.google.android.gms.internal.vision.zzga.zza(r5, r6);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0159;
    L_0x0149:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r12.zzbh(r2);	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zza(r5, r15);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
    L_0x0159:
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x015e:
        r12.zza(r13, r3, r14);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0166:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcu();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0178:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzct();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x018a:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcs();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x019c:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcr();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x01ae:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcp();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x01c0:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcq();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x01d2:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.readFloat();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x01e4:
        r3 = r3 & r5;
        r3 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.readDouble();	 Catch:{ zzgg -> 0x059d }
        r5 = java.lang.Double.valueOf(r5);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r1, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x01f6:
        r1 = r12.zzbi(r2);	 Catch:{ zzgg -> 0x059d }
        r2 = r12.zzbk(r2);	 Catch:{ zzgg -> 0x059d }
        r2 = r2 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r4 = com.google.android.gms.internal.vision.zziu.zzp(r13, r2);	 Catch:{ zzgg -> 0x059d }
        if (r4 != 0) goto L_0x0210;
    L_0x0206:
        r4 = r12.zzzt;	 Catch:{ zzgg -> 0x059d }
        r4 = r4.zzn(r1);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r2, r4);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0227;
    L_0x0210:
        r5 = r12.zzzt;	 Catch:{ zzgg -> 0x059d }
        r5 = r5.zzl(r4);	 Catch:{ zzgg -> 0x059d }
        if (r5 == 0) goto L_0x0227;
    L_0x0218:
        r5 = r12.zzzt;	 Catch:{ zzgg -> 0x059d }
        r5 = r5.zzn(r1);	 Catch:{ zzgg -> 0x059d }
        r6 = r12.zzzt;	 Catch:{ zzgg -> 0x059d }
        r6.zzb(r5, r4);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r2, r5);	 Catch:{ zzgg -> 0x059d }
        r4 = r5;
    L_0x0227:
        r2 = r12.zzzt;	 Catch:{ zzgg -> 0x059d }
        r2 = r2.zzj(r4);	 Catch:{ zzgg -> 0x059d }
        r3 = r12.zzzt;	 Catch:{ zzgg -> 0x059d }
        r1 = r3.zzo(r1);	 Catch:{ zzgg -> 0x059d }
        r14.zza(r2, r1, r15);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0238:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r12.zzbh(r2);	 Catch:{ zzgg -> 0x059d }
        r2 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r2.zza(r13, r3);	 Catch:{ zzgg -> 0x059d }
        r14.zzb(r2, r1, r15);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x024a:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzp(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0258:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzo(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0266:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzn(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0274:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzm(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0282:
        r4 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r3 = r3 & r5;
        r5 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r3 = r4.zza(r13, r5);	 Catch:{ zzgg -> 0x059d }
        r14.zzl(r3);	 Catch:{ zzgg -> 0x059d }
        r2 = r12.zzbj(r2);	 Catch:{ zzgg -> 0x059d }
        r10 = com.google.android.gms.internal.vision.zzhy.zza(r1, r3, r2, r10, r7);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0297:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzk(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x02a5:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzh(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x02b3:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzg(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x02c1:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzf(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x02cf:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zze(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x02dd:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzc(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x02eb:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzd(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x02f9:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzb(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0307:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zza(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0315:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzp(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0323:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzo(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0331:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzn(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x033f:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzm(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x034d:
        r4 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r3 = r3 & r5;
        r5 = (long) r3;	 Catch:{ zzgg -> 0x059d }
        r3 = r4.zza(r13, r5);	 Catch:{ zzgg -> 0x059d }
        r14.zzl(r3);	 Catch:{ zzgg -> 0x059d }
        r2 = r12.zzbj(r2);	 Catch:{ zzgg -> 0x059d }
        r10 = com.google.android.gms.internal.vision.zzhy.zza(r1, r3, r2, r10, r7);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0362:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzk(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0370:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzj(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x037e:
        r1 = r12.zzbh(r2);	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r4 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r4.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zza(r2, r1, r15);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0390:
        r1 = zzbm(r3);	 Catch:{ zzgg -> 0x059d }
        if (r1 == 0) goto L_0x03a4;
    L_0x0396:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzi(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x03a4:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.readStringList(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x03b2:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzh(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x03c0:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzg(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x03ce:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzf(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x03dc:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zze(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x03ea:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzc(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x03f8:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzd(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0406:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zzb(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0414:
        r1 = r12.zzzq;	 Catch:{ zzgg -> 0x059d }
        r2 = r3 & r5;
        r2 = (long) r2;	 Catch:{ zzgg -> 0x059d }
        r1 = r1.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        r14.zza(r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0422:
        r1 = r12.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        if (r1 == 0) goto L_0x0440;
    L_0x0428:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = com.google.android.gms.internal.vision.zziu.zzp(r13, r3);	 Catch:{ zzgg -> 0x059d }
        r2 = r12.zzbh(r2);	 Catch:{ zzgg -> 0x059d }
        r2 = r14.zzc(r2, r15);	 Catch:{ zzgg -> 0x059d }
        r1 = com.google.android.gms.internal.vision.zzga.zza(r1, r2);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0440:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r12.zzbh(r2);	 Catch:{ zzgg -> 0x059d }
        r1 = r14.zzc(r1, r15);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0453:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzdc();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0462:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r14.zzdb();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zzb(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0471:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzda();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0480:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r14.zzcz();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zzb(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x048f:
        r4 = r14.zzcy();	 Catch:{ zzgg -> 0x059d }
        r6 = r12.zzbj(r2);	 Catch:{ zzgg -> 0x059d }
        if (r6 == 0) goto L_0x04a6;
    L_0x0499:
        r6 = r6.zzh(r4);	 Catch:{ zzgg -> 0x059d }
        if (r6 == 0) goto L_0x04a0;
    L_0x049f:
        goto L_0x04a6;
    L_0x04a0:
        r10 = com.google.android.gms.internal.vision.zzhy.zza(r1, r4, r10, r7);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x04a6:
        r1 = r3 & r5;
        r5 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zzb(r13, r5, r4);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x04b1:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r14.zzcx();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zzb(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x04c0:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r14.zzcw();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x04cf:
        r1 = r12.zza(r13, r2);	 Catch:{ zzgg -> 0x059d }
        if (r1 == 0) goto L_0x04ed;
    L_0x04d5:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = com.google.android.gms.internal.vision.zziu.zzp(r13, r3);	 Catch:{ zzgg -> 0x059d }
        r2 = r12.zzbh(r2);	 Catch:{ zzgg -> 0x059d }
        r2 = r14.zza(r2, r15);	 Catch:{ zzgg -> 0x059d }
        r1 = com.google.android.gms.internal.vision.zzga.zza(r1, r2);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x04ed:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r12.zzbh(r2);	 Catch:{ zzgg -> 0x059d }
        r1 = r14.zza(r1, r15);	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0500:
        r12.zza(r13, r3, r14);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0508:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r14.zzcu();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0517:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r14.zzct();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zzb(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0526:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcs();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0535:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r14.zzcr();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zzb(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0544:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcp();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0553:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.zzcq();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0562:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r1 = r14.readFloat();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r1);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0571:
        r1 = r3 & r5;
        r3 = (long) r1;	 Catch:{ zzgg -> 0x059d }
        r5 = r14.readDouble();	 Catch:{ zzgg -> 0x059d }
        com.google.android.gms.internal.vision.zziu.zza(r13, r3, r5);	 Catch:{ zzgg -> 0x059d }
        r12.zzb(r13, r2);	 Catch:{ zzgg -> 0x059d }
        goto L_0x0009;
    L_0x0580:
        r1 = r7.zza(r10, r14);	 Catch:{ zzgg -> 0x059d }
        if (r1 != 0) goto L_0x0009;
    L_0x0586:
        r14 = r12.zzzn;
    L_0x0588:
        r15 = r12.zzzo;
        if (r14 >= r15) goto L_0x0597;
    L_0x058c:
        r15 = r12.zzzm;
        r15 = r15[r14];
        r10 = r12.zza(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x0588;
    L_0x0597:
        if (r10 == 0) goto L_0x059c;
    L_0x0599:
        r7.zzf(r13, r10);
    L_0x059c:
        return;
    L_0x059d:
        r7.zza(r14);	 Catch:{ all -> 0x05c4 }
        if (r10 != 0) goto L_0x05a7;
    L_0x05a2:
        r1 = r7.zzu(r13);	 Catch:{ all -> 0x05c4 }
        r10 = r1;
    L_0x05a7:
        r1 = r7.zza(r10, r14);	 Catch:{ all -> 0x05c4 }
        if (r1 != 0) goto L_0x0009;
    L_0x05ad:
        r14 = r12.zzzn;
    L_0x05af:
        r15 = r12.zzzo;
        if (r14 >= r15) goto L_0x05be;
    L_0x05b3:
        r15 = r12.zzzm;
        r15 = r15[r14];
        r10 = r12.zza(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x05af;
    L_0x05be:
        if (r10 == 0) goto L_0x05c3;
    L_0x05c0:
        r7.zzf(r13, r10);
    L_0x05c3:
        return;
    L_0x05c4:
        r14 = move-exception;
        r15 = r12.zzzn;
    L_0x05c7:
        r0 = r12.zzzo;
        if (r15 >= r0) goto L_0x05d6;
    L_0x05cb:
        r0 = r12.zzzm;
        r0 = r0[r15];
        r10 = r12.zza(r13, r0, r10, r7);
        r15 = r15 + 1;
        goto L_0x05c7;
    L_0x05d6:
        if (r10 == 0) goto L_0x05db;
    L_0x05d8:
        r7.zzf(r13, r10);
    L_0x05db:
        throw r14;
    L_0x05dc:
        r13 = new java.lang.NullPointerException;
        r13.<init>();
        goto L_0x05e3;
    L_0x05e2:
        throw r13;
    L_0x05e3:
        goto L_0x05e2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, com.google.android.gms.internal.vision.zzhv, com.google.android.gms.internal.vision.zzfk):void");
    }

    private static zzip zzq(Object obj) {
        zzfy zzfy = (zzfy) obj;
        zzip zzip = zzfy.zzwj;
        if (zzip != zzip.zzhe()) {
            return zzip;
        }
        zzip = zzip.zzhf();
        zzfy.zzwj = zzip;
        return zzip;
    }

    private static int zza(zzhw zzhw, byte[] bArr, int i, int i2, zzei zzei) {
        int i3 = i + 1;
        i = bArr[i];
        if (i < 0) {
            i3 = zzeh.zza(i, bArr, i3, zzei);
            i = zzei.zzro;
        }
        int i4 = i3;
        if (i < 0 || i > i2 - i4) {
            throw zzgf.zzfh();
        }
        Object newInstance = zzhw.newInstance();
        i += i4;
        zzhw.zza(newInstance, bArr, i4, i, zzei);
        zzhw.zze(newInstance);
        zzei.zzrq = newInstance;
        return i;
    }

    private static int zza(zzhw zzhw, byte[] bArr, int i, int i2, int i3, zzei zzei) {
        zzhj zzhj = (zzhj) zzhw;
        Object newInstance = zzhj.newInstance();
        int zza = zzhj.zza(newInstance, bArr, i, i2, i3, zzei);
        zzhj.zze(newInstance);
        zzei.zzrq = newInstance;
        return zza;
    }

    private static int zza(zzhw<?> zzhw, int i, byte[] bArr, int i2, int i3, zzge<?> zzge, zzei zzei) {
        i2 = zza((zzhw) zzhw, bArr, i2, i3, zzei);
        zzge.add(zzei.zzrq);
        while (i2 < i3) {
            int zza = zzeh.zza(bArr, i2, zzei);
            if (i != zzei.zzro) {
                break;
            }
            i2 = zza((zzhw) zzhw, bArr, zza, i3, zzei);
            zzge.add(zzei.zzrq);
        }
        return i2;
    }

    /* JADX WARNING: Missing block: B:29:?, code skipped:
            return r2 + 4;
     */
    /* JADX WARNING: Missing block: B:30:?, code skipped:
            return r2 + 8;
     */
    private static int zza(byte[] r1, int r2, int r3, com.google.android.gms.internal.vision.zzjd r4, java.lang.Class<?> r5, com.google.android.gms.internal.vision.zzei r6) {
        /*
        r0 = com.google.android.gms.internal.vision.zzhk.zzrr;
        r4 = r4.ordinal();
        r4 = r0[r4];
        switch(r4) {
            case 1: goto L_0x009a;
            case 2: goto L_0x0095;
            case 3: goto L_0x0088;
            case 4: goto L_0x007b;
            case 5: goto L_0x007b;
            case 6: goto L_0x0070;
            case 7: goto L_0x0070;
            case 8: goto L_0x0065;
            case 9: goto L_0x0058;
            case 10: goto L_0x0058;
            case 11: goto L_0x0058;
            case 12: goto L_0x004b;
            case 13: goto L_0x004b;
            case 14: goto L_0x003e;
            case 15: goto L_0x002c;
            case 16: goto L_0x001a;
            case 17: goto L_0x0014;
            default: goto L_0x000b;
        };
    L_0x000b:
        r1 = new java.lang.RuntimeException;
        r2 = "unsupported field type.";
        r1.<init>(r2);
        throw r1;
    L_0x0014:
        r1 = com.google.android.gms.internal.vision.zzeh.zzd(r1, r2, r6);
        goto L_0x00af;
    L_0x001a:
        r1 = com.google.android.gms.internal.vision.zzeh.zzb(r1, r2, r6);
        r2 = r6.zzrp;
        r2 = com.google.android.gms.internal.vision.zzez.zzd(r2);
        r2 = java.lang.Long.valueOf(r2);
        r6.zzrq = r2;
        goto L_0x00af;
    L_0x002c:
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r1, r2, r6);
        r2 = r6.zzro;
        r2 = com.google.android.gms.internal.vision.zzez.zzaq(r2);
        r2 = java.lang.Integer.valueOf(r2);
        r6.zzrq = r2;
        goto L_0x00af;
    L_0x003e:
        r4 = com.google.android.gms.internal.vision.zzhs.zzgl();
        r4 = r4.zzf(r5);
        r1 = zza(r4, r1, r2, r3, r6);
        goto L_0x00af;
    L_0x004b:
        r1 = com.google.android.gms.internal.vision.zzeh.zzb(r1, r2, r6);
        r2 = r6.zzrp;
        r2 = java.lang.Long.valueOf(r2);
        r6.zzrq = r2;
        goto L_0x00af;
    L_0x0058:
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r1, r2, r6);
        r2 = r6.zzro;
        r2 = java.lang.Integer.valueOf(r2);
        r6.zzrq = r2;
        goto L_0x00af;
    L_0x0065:
        r1 = com.google.android.gms.internal.vision.zzeh.zzd(r1, r2);
        r1 = java.lang.Float.valueOf(r1);
        r6.zzrq = r1;
        goto L_0x0085;
    L_0x0070:
        r3 = com.google.android.gms.internal.vision.zzeh.zzb(r1, r2);
        r1 = java.lang.Long.valueOf(r3);
        r6.zzrq = r1;
        goto L_0x0092;
    L_0x007b:
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r1, r2);
        r1 = java.lang.Integer.valueOf(r1);
        r6.zzrq = r1;
    L_0x0085:
        r1 = r2 + 4;
        goto L_0x00af;
    L_0x0088:
        r3 = com.google.android.gms.internal.vision.zzeh.zzc(r1, r2);
        r1 = java.lang.Double.valueOf(r3);
        r6.zzrq = r1;
    L_0x0092:
        r1 = r2 + 8;
        goto L_0x00af;
    L_0x0095:
        r1 = com.google.android.gms.internal.vision.zzeh.zze(r1, r2, r6);
        goto L_0x00af;
    L_0x009a:
        r1 = com.google.android.gms.internal.vision.zzeh.zzb(r1, r2, r6);
        r2 = r6.zzrp;
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x00a8;
    L_0x00a6:
        r2 = 1;
        goto L_0x00a9;
    L_0x00a8:
        r2 = 0;
    L_0x00a9:
        r2 = java.lang.Boolean.valueOf(r2);
        r6.zzrq = r2;
    L_0x00af:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(byte[], int, int, com.google.android.gms.internal.vision.zzjd, java.lang.Class, com.google.android.gms.internal.vision.zzei):int");
    }

    private static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzei zzei) {
        return zzeh.zza(i, bArr, i2, i3, zzq(obj), zzei);
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARNING: Missing block: B:272:?, code skipped:
            return r4;
     */
    /* JADX WARNING: Missing block: B:273:?, code skipped:
            return r2;
     */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.vision.zzei r30) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r2 = r21;
        r6 = r23;
        r8 = r24;
        r9 = r28;
        r7 = r30;
        r11 = zzzc;
        r11 = r11.getObject(r1, r9);
        r11 = (com.google.android.gms.internal.vision.zzge) r11;
        r12 = r11.zzch();
        r13 = 1;
        if (r12 != 0) goto L_0x0036;
    L_0x0023:
        r12 = r11.size();
        if (r12 != 0) goto L_0x002c;
    L_0x0029:
        r12 = 10;
        goto L_0x002d;
    L_0x002c:
        r12 = r12 << r13;
    L_0x002d:
        r11 = r11.zzah(r12);
        r12 = zzzc;
        r12.putObject(r1, r9, r11);
    L_0x0036:
        r9 = 5;
        r14 = 0;
        r10 = 2;
        switch(r27) {
            case 18: goto L_0x03e4;
            case 19: goto L_0x03a6;
            case 20: goto L_0x0365;
            case 21: goto L_0x0365;
            case 22: goto L_0x034b;
            case 23: goto L_0x030c;
            case 24: goto L_0x02cd;
            case 25: goto L_0x0276;
            case 26: goto L_0x01c3;
            case 27: goto L_0x01a9;
            case 28: goto L_0x0151;
            case 29: goto L_0x034b;
            case 30: goto L_0x0119;
            case 31: goto L_0x02cd;
            case 32: goto L_0x030c;
            case 33: goto L_0x00cc;
            case 34: goto L_0x007f;
            case 35: goto L_0x03e4;
            case 36: goto L_0x03a6;
            case 37: goto L_0x0365;
            case 38: goto L_0x0365;
            case 39: goto L_0x034b;
            case 40: goto L_0x030c;
            case 41: goto L_0x02cd;
            case 42: goto L_0x0276;
            case 43: goto L_0x034b;
            case 44: goto L_0x0119;
            case 45: goto L_0x02cd;
            case 46: goto L_0x030c;
            case 47: goto L_0x00cc;
            case 48: goto L_0x007f;
            case 49: goto L_0x003f;
            default: goto L_0x003d;
        };
    L_0x003d:
        goto L_0x0422;
    L_0x003f:
        r1 = 3;
        if (r6 != r1) goto L_0x0422;
    L_0x0042:
        r1 = r0.zzbh(r8);
        r6 = r2 & -8;
        r6 = r6 | 4;
        r22 = r1;
        r23 = r18;
        r24 = r19;
        r25 = r20;
        r26 = r6;
        r27 = r30;
        r4 = zza(r22, r23, r24, r25, r26, r27);
        r8 = r7.zzrq;
        r11.add(r8);
    L_0x005f:
        if (r4 >= r5) goto L_0x0422;
    L_0x0061:
        r8 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r9 = r7.zzro;
        if (r2 != r9) goto L_0x0422;
    L_0x0069:
        r22 = r1;
        r23 = r18;
        r24 = r8;
        r25 = r20;
        r26 = r6;
        r27 = r30;
        r4 = zza(r22, r23, r24, r25, r26, r27);
        r8 = r7.zzrq;
        r11.add(r8);
        goto L_0x005f;
    L_0x007f:
        if (r6 != r10) goto L_0x00a3;
    L_0x0081:
        r11 = (com.google.android.gms.internal.vision.zzgt) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r2 = r7.zzro;
        r2 = r2 + r1;
    L_0x008a:
        if (r1 >= r2) goto L_0x009a;
    L_0x008c:
        r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r1, r7);
        r4 = r7.zzrp;
        r4 = com.google.android.gms.internal.vision.zzez.zzd(r4);
        r11.zzp(r4);
        goto L_0x008a;
    L_0x009a:
        if (r1 != r2) goto L_0x009e;
    L_0x009c:
        goto L_0x0423;
    L_0x009e:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfh();
        throw r1;
    L_0x00a3:
        if (r6 != 0) goto L_0x0422;
    L_0x00a5:
        r11 = (com.google.android.gms.internal.vision.zzgt) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r7);
        r8 = r7.zzrp;
        r8 = com.google.android.gms.internal.vision.zzez.zzd(r8);
        r11.zzp(r8);
    L_0x00b4:
        if (r1 >= r5) goto L_0x0423;
    L_0x00b6:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7);
        r6 = r7.zzro;
        if (r2 != r6) goto L_0x0423;
    L_0x00be:
        r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r7);
        r8 = r7.zzrp;
        r8 = com.google.android.gms.internal.vision.zzez.zzd(r8);
        r11.zzp(r8);
        goto L_0x00b4;
    L_0x00cc:
        if (r6 != r10) goto L_0x00f0;
    L_0x00ce:
        r11 = (com.google.android.gms.internal.vision.zzfz) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r2 = r7.zzro;
        r2 = r2 + r1;
    L_0x00d7:
        if (r1 >= r2) goto L_0x00e7;
    L_0x00d9:
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7);
        r4 = r7.zzro;
        r4 = com.google.android.gms.internal.vision.zzez.zzaq(r4);
        r11.zzbg(r4);
        goto L_0x00d7;
    L_0x00e7:
        if (r1 != r2) goto L_0x00eb;
    L_0x00e9:
        goto L_0x0423;
    L_0x00eb:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfh();
        throw r1;
    L_0x00f0:
        if (r6 != 0) goto L_0x0422;
    L_0x00f2:
        r11 = (com.google.android.gms.internal.vision.zzfz) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r4 = r7.zzro;
        r4 = com.google.android.gms.internal.vision.zzez.zzaq(r4);
        r11.zzbg(r4);
    L_0x0101:
        if (r1 >= r5) goto L_0x0423;
    L_0x0103:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7);
        r6 = r7.zzro;
        if (r2 != r6) goto L_0x0423;
    L_0x010b:
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r4 = r7.zzro;
        r4 = com.google.android.gms.internal.vision.zzez.zzaq(r4);
        r11.zzbg(r4);
        goto L_0x0101;
    L_0x0119:
        if (r6 != r10) goto L_0x0120;
    L_0x011b:
        r2 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r11, r7);
        goto L_0x0131;
    L_0x0120:
        if (r6 != 0) goto L_0x0422;
    L_0x0122:
        r2 = r21;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r6 = r11;
        r7 = r30;
        r2 = com.google.android.gms.internal.vision.zzeh.zza(r2, r3, r4, r5, r6, r7);
    L_0x0131:
        r1 = (com.google.android.gms.internal.vision.zzfy) r1;
        r3 = r1.zzwj;
        r4 = com.google.android.gms.internal.vision.zzip.zzhe();
        if (r3 != r4) goto L_0x013c;
    L_0x013b:
        r3 = 0;
    L_0x013c:
        r4 = r0.zzbj(r8);
        r5 = r0.zzzr;
        r6 = r22;
        r3 = com.google.android.gms.internal.vision.zzhy.zza(r6, r11, r4, r3, r5);
        r3 = (com.google.android.gms.internal.vision.zzip) r3;
        if (r3 == 0) goto L_0x014e;
    L_0x014c:
        r1.zzwj = r3;
    L_0x014e:
        r1 = r2;
        goto L_0x0423;
    L_0x0151:
        if (r6 != r10) goto L_0x0422;
    L_0x0153:
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r4 = r7.zzro;
        if (r4 < 0) goto L_0x01a4;
    L_0x015b:
        r6 = r3.length;
        r6 = r6 - r1;
        if (r4 > r6) goto L_0x019f;
    L_0x015f:
        if (r4 != 0) goto L_0x0167;
    L_0x0161:
        r4 = com.google.android.gms.internal.vision.zzeo.zzrx;
        r11.add(r4);
        goto L_0x016f;
    L_0x0167:
        r6 = com.google.android.gms.internal.vision.zzeo.zzb(r3, r1, r4);
        r11.add(r6);
    L_0x016e:
        r1 = r1 + r4;
    L_0x016f:
        if (r1 >= r5) goto L_0x0423;
    L_0x0171:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7);
        r6 = r7.zzro;
        if (r2 != r6) goto L_0x0423;
    L_0x0179:
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r4 = r7.zzro;
        if (r4 < 0) goto L_0x019a;
    L_0x0181:
        r6 = r3.length;
        r6 = r6 - r1;
        if (r4 > r6) goto L_0x0195;
    L_0x0185:
        if (r4 != 0) goto L_0x018d;
    L_0x0187:
        r4 = com.google.android.gms.internal.vision.zzeo.zzrx;
        r11.add(r4);
        goto L_0x016f;
    L_0x018d:
        r6 = com.google.android.gms.internal.vision.zzeo.zzb(r3, r1, r4);
        r11.add(r6);
        goto L_0x016e;
    L_0x0195:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfh();
        throw r1;
    L_0x019a:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfi();
        throw r1;
    L_0x019f:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfh();
        throw r1;
    L_0x01a4:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfi();
        throw r1;
    L_0x01a9:
        if (r6 != r10) goto L_0x0422;
    L_0x01ab:
        r1 = r0.zzbh(r8);
        r22 = r1;
        r23 = r21;
        r24 = r18;
        r25 = r19;
        r26 = r20;
        r27 = r11;
        r28 = r30;
        r1 = zza(r22, r23, r24, r25, r26, r27, r28);
        goto L_0x0423;
    L_0x01c3:
        if (r6 != r10) goto L_0x0422;
    L_0x01c5:
        r8 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r8 = r25 & r8;
        r1 = "";
        r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r6 != 0) goto L_0x0216;
    L_0x01d0:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r6 = r7.zzro;
        if (r6 < 0) goto L_0x0211;
    L_0x01d8:
        if (r6 != 0) goto L_0x01de;
    L_0x01da:
        r11.add(r1);
        goto L_0x01e9;
    L_0x01de:
        r8 = new java.lang.String;
        r9 = com.google.android.gms.internal.vision.zzga.UTF_8;
        r8.<init>(r3, r4, r6, r9);
        r11.add(r8);
    L_0x01e8:
        r4 = r4 + r6;
    L_0x01e9:
        if (r4 >= r5) goto L_0x0422;
    L_0x01eb:
        r6 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r8 = r7.zzro;
        if (r2 != r8) goto L_0x0422;
    L_0x01f3:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r6, r7);
        r6 = r7.zzro;
        if (r6 < 0) goto L_0x020c;
    L_0x01fb:
        if (r6 != 0) goto L_0x0201;
    L_0x01fd:
        r11.add(r1);
        goto L_0x01e9;
    L_0x0201:
        r8 = new java.lang.String;
        r9 = com.google.android.gms.internal.vision.zzga.UTF_8;
        r8.<init>(r3, r4, r6, r9);
        r11.add(r8);
        goto L_0x01e8;
    L_0x020c:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfi();
        throw r1;
    L_0x0211:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfi();
        throw r1;
    L_0x0216:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r6 = r7.zzro;
        if (r6 < 0) goto L_0x0271;
    L_0x021e:
        if (r6 != 0) goto L_0x0224;
    L_0x0220:
        r11.add(r1);
        goto L_0x0237;
    L_0x0224:
        r8 = r4 + r6;
        r9 = com.google.android.gms.internal.vision.zziw.zzg(r3, r4, r8);
        if (r9 == 0) goto L_0x026c;
    L_0x022c:
        r9 = new java.lang.String;
        r10 = com.google.android.gms.internal.vision.zzga.UTF_8;
        r9.<init>(r3, r4, r6, r10);
        r11.add(r9);
    L_0x0236:
        r4 = r8;
    L_0x0237:
        if (r4 >= r5) goto L_0x0422;
    L_0x0239:
        r6 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r8 = r7.zzro;
        if (r2 != r8) goto L_0x0422;
    L_0x0241:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r6, r7);
        r6 = r7.zzro;
        if (r6 < 0) goto L_0x0267;
    L_0x0249:
        if (r6 != 0) goto L_0x024f;
    L_0x024b:
        r11.add(r1);
        goto L_0x0237;
    L_0x024f:
        r8 = r4 + r6;
        r9 = com.google.android.gms.internal.vision.zziw.zzg(r3, r4, r8);
        if (r9 == 0) goto L_0x0262;
    L_0x0257:
        r9 = new java.lang.String;
        r10 = com.google.android.gms.internal.vision.zzga.UTF_8;
        r9.<init>(r3, r4, r6, r10);
        r11.add(r9);
        goto L_0x0236;
    L_0x0262:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfp();
        throw r1;
    L_0x0267:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfi();
        throw r1;
    L_0x026c:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfp();
        throw r1;
    L_0x0271:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfi();
        throw r1;
    L_0x0276:
        r1 = 0;
        if (r6 != r10) goto L_0x029e;
    L_0x0279:
        r11 = (com.google.android.gms.internal.vision.zzem) r11;
        r2 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r4 = r7.zzro;
        r4 = r4 + r2;
    L_0x0282:
        if (r2 >= r4) goto L_0x0295;
    L_0x0284:
        r2 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r2, r7);
        r5 = r7.zzrp;
        r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1));
        if (r8 == 0) goto L_0x0290;
    L_0x028e:
        r5 = 1;
        goto L_0x0291;
    L_0x0290:
        r5 = 0;
    L_0x0291:
        r11.addBoolean(r5);
        goto L_0x0282;
    L_0x0295:
        if (r2 != r4) goto L_0x0299;
    L_0x0297:
        goto L_0x014e;
    L_0x0299:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfh();
        throw r1;
    L_0x029e:
        if (r6 != 0) goto L_0x0422;
    L_0x02a0:
        r11 = (com.google.android.gms.internal.vision.zzem) r11;
        r4 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r7);
        r8 = r7.zzrp;
        r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r6 == 0) goto L_0x02ae;
    L_0x02ac:
        r6 = 1;
        goto L_0x02af;
    L_0x02ae:
        r6 = 0;
    L_0x02af:
        r11.addBoolean(r6);
    L_0x02b2:
        if (r4 >= r5) goto L_0x0422;
    L_0x02b4:
        r6 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r8 = r7.zzro;
        if (r2 != r8) goto L_0x0422;
    L_0x02bc:
        r4 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r6, r7);
        r8 = r7.zzrp;
        r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r6 == 0) goto L_0x02c8;
    L_0x02c6:
        r6 = 1;
        goto L_0x02c9;
    L_0x02c8:
        r6 = 0;
    L_0x02c9:
        r11.addBoolean(r6);
        goto L_0x02b2;
    L_0x02cd:
        if (r6 != r10) goto L_0x02ed;
    L_0x02cf:
        r11 = (com.google.android.gms.internal.vision.zzfz) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r2 = r7.zzro;
        r2 = r2 + r1;
    L_0x02d8:
        if (r1 >= r2) goto L_0x02e4;
    L_0x02da:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1);
        r11.zzbg(r4);
        r1 = r1 + 4;
        goto L_0x02d8;
    L_0x02e4:
        if (r1 != r2) goto L_0x02e8;
    L_0x02e6:
        goto L_0x0423;
    L_0x02e8:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfh();
        throw r1;
    L_0x02ed:
        if (r6 != r9) goto L_0x0422;
    L_0x02ef:
        r11 = (com.google.android.gms.internal.vision.zzfz) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r18, r19);
        r11.zzbg(r1);
    L_0x02f8:
        r1 = r4 + 4;
        if (r1 >= r5) goto L_0x0423;
    L_0x02fc:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7);
        r6 = r7.zzro;
        if (r2 != r6) goto L_0x0423;
    L_0x0304:
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4);
        r11.zzbg(r1);
        goto L_0x02f8;
    L_0x030c:
        if (r6 != r10) goto L_0x032c;
    L_0x030e:
        r11 = (com.google.android.gms.internal.vision.zzgt) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r2 = r7.zzro;
        r2 = r2 + r1;
    L_0x0317:
        if (r1 >= r2) goto L_0x0323;
    L_0x0319:
        r4 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r1);
        r11.zzp(r4);
        r1 = r1 + 8;
        goto L_0x0317;
    L_0x0323:
        if (r1 != r2) goto L_0x0327;
    L_0x0325:
        goto L_0x0423;
    L_0x0327:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfh();
        throw r1;
    L_0x032c:
        if (r6 != r13) goto L_0x0422;
    L_0x032e:
        r11 = (com.google.android.gms.internal.vision.zzgt) r11;
        r8 = com.google.android.gms.internal.vision.zzeh.zzb(r18, r19);
        r11.zzp(r8);
    L_0x0337:
        r1 = r4 + 8;
        if (r1 >= r5) goto L_0x0423;
    L_0x033b:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7);
        r6 = r7.zzro;
        if (r2 != r6) goto L_0x0423;
    L_0x0343:
        r8 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4);
        r11.zzp(r8);
        goto L_0x0337;
    L_0x034b:
        if (r6 != r10) goto L_0x0353;
    L_0x034d:
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r11, r7);
        goto L_0x0423;
    L_0x0353:
        if (r6 != 0) goto L_0x0422;
    L_0x0355:
        r22 = r18;
        r23 = r19;
        r24 = r20;
        r25 = r11;
        r26 = r30;
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r21, r22, r23, r24, r25, r26);
        goto L_0x0423;
    L_0x0365:
        if (r6 != r10) goto L_0x0385;
    L_0x0367:
        r11 = (com.google.android.gms.internal.vision.zzgt) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r2 = r7.zzro;
        r2 = r2 + r1;
    L_0x0370:
        if (r1 >= r2) goto L_0x037c;
    L_0x0372:
        r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r1, r7);
        r4 = r7.zzrp;
        r11.zzp(r4);
        goto L_0x0370;
    L_0x037c:
        if (r1 != r2) goto L_0x0380;
    L_0x037e:
        goto L_0x0423;
    L_0x0380:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfh();
        throw r1;
    L_0x0385:
        if (r6 != 0) goto L_0x0422;
    L_0x0387:
        r11 = (com.google.android.gms.internal.vision.zzgt) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r7);
        r8 = r7.zzrp;
        r11.zzp(r8);
    L_0x0392:
        if (r1 >= r5) goto L_0x0423;
    L_0x0394:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7);
        r6 = r7.zzro;
        if (r2 != r6) goto L_0x0423;
    L_0x039c:
        r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r7);
        r8 = r7.zzrp;
        r11.zzp(r8);
        goto L_0x0392;
    L_0x03a6:
        if (r6 != r10) goto L_0x03c5;
    L_0x03a8:
        r11 = (com.google.android.gms.internal.vision.zzfv) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r2 = r7.zzro;
        r2 = r2 + r1;
    L_0x03b1:
        if (r1 >= r2) goto L_0x03bd;
    L_0x03b3:
        r4 = com.google.android.gms.internal.vision.zzeh.zzd(r3, r1);
        r11.zzh(r4);
        r1 = r1 + 4;
        goto L_0x03b1;
    L_0x03bd:
        if (r1 != r2) goto L_0x03c0;
    L_0x03bf:
        goto L_0x0423;
    L_0x03c0:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfh();
        throw r1;
    L_0x03c5:
        if (r6 != r9) goto L_0x0422;
    L_0x03c7:
        r11 = (com.google.android.gms.internal.vision.zzfv) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zzd(r18, r19);
        r11.zzh(r1);
    L_0x03d0:
        r1 = r4 + 4;
        if (r1 >= r5) goto L_0x0423;
    L_0x03d4:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7);
        r6 = r7.zzro;
        if (r2 != r6) goto L_0x0423;
    L_0x03dc:
        r1 = com.google.android.gms.internal.vision.zzeh.zzd(r3, r4);
        r11.zzh(r1);
        goto L_0x03d0;
    L_0x03e4:
        if (r6 != r10) goto L_0x0403;
    L_0x03e6:
        r11 = (com.google.android.gms.internal.vision.zzfh) r11;
        r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7);
        r2 = r7.zzro;
        r2 = r2 + r1;
    L_0x03ef:
        if (r1 >= r2) goto L_0x03fb;
    L_0x03f1:
        r4 = com.google.android.gms.internal.vision.zzeh.zzc(r3, r1);
        r11.zzc(r4);
        r1 = r1 + 8;
        goto L_0x03ef;
    L_0x03fb:
        if (r1 != r2) goto L_0x03fe;
    L_0x03fd:
        goto L_0x0423;
    L_0x03fe:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfh();
        throw r1;
    L_0x0403:
        if (r6 != r13) goto L_0x0422;
    L_0x0405:
        r11 = (com.google.android.gms.internal.vision.zzfh) r11;
        r8 = com.google.android.gms.internal.vision.zzeh.zzc(r18, r19);
        r11.zzc(r8);
    L_0x040e:
        r1 = r4 + 8;
        if (r1 >= r5) goto L_0x0423;
    L_0x0412:
        r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7);
        r6 = r7.zzro;
        if (r2 != r6) goto L_0x0423;
    L_0x041a:
        r8 = com.google.android.gms.internal.vision.zzeh.zzc(r3, r4);
        r11.zzc(r8);
        goto L_0x040e;
    L_0x0422:
        r1 = r4;
    L_0x0423:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.vision.zzei):int");
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzei zzei) {
        Unsafe unsafe = zzzc;
        Object zzbi = zzbi(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzzt.zzl(object)) {
            Object zzn = this.zzzt.zzn(zzbi);
            this.zzzt.zzb(zzn, object);
            unsafe.putObject(t, j, zzn);
            object = zzn;
        }
        zzgy zzo = this.zzzt.zzo(zzbi);
        Map zzj = this.zzzt.zzj(object);
        i = zzeh.zza(bArr, i, zzei);
        int i4 = zzei.zzro;
        if (i4 < 0 || i4 > i2 - i) {
            throw zzgf.zzfh();
        }
        i4 += i;
        Object obj = zzo.zzyw;
        Object obj2 = zzo.zzgq;
        while (i < i4) {
            int i5 = i + 1;
            i = bArr[i];
            if (i < 0) {
                i5 = zzeh.zza(i, bArr, i5, zzei);
                i = zzei.zzro;
            }
            int i6 = i5;
            i5 = i >>> 3;
            int i7 = i & 7;
            if (i5 != 1) {
                if (i5 == 2 && i7 == zzo.zzyx.zzhp()) {
                    i = zza(bArr, i6, i2, zzo.zzyx, zzo.zzgq.getClass(), zzei);
                    obj2 = zzei.zzrq;
                }
            } else if (i7 == zzo.zzyv.zzhp()) {
                i = zza(bArr, i6, i2, zzo.zzyv, null, zzei);
                obj = zzei.zzrq;
            }
            i = zzeh.zza(i, bArr, i6, i2, zzei);
        }
        if (i == i4) {
            zzj.put(obj, obj2);
            return i4;
        }
        throw zzgf.zzfo();
    }

    /* JADX WARNING: Missing block: B:62:0x018a, code skipped:
            r2 = r4 + 4;
     */
    /* JADX WARNING: Missing block: B:66:0x019b, code skipped:
            r2 = r4 + 8;
     */
    /* JADX WARNING: Missing block: B:67:0x019d, code skipped:
            r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Missing block: B:69:?, code skipped:
            return r4;
     */
    /* JADX WARNING: Missing block: B:73:?, code skipped:
            return r2;
     */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.vision.zzei r29) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r3 = r18;
        r4 = r19;
        r2 = r21;
        r8 = r22;
        r5 = r23;
        r9 = r26;
        r6 = r28;
        r11 = r29;
        r12 = zzzc;
        r7 = r0.zzzd;
        r13 = r6 + 2;
        r7 = r7[r13];
        r13 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r7 = r7 & r13;
        r13 = (long) r7;
        r7 = 5;
        r15 = 2;
        switch(r25) {
            case 51: goto L_0x018d;
            case 52: goto L_0x017d;
            case 53: goto L_0x016d;
            case 54: goto L_0x016d;
            case 55: goto L_0x015d;
            case 56: goto L_0x014e;
            case 57: goto L_0x0140;
            case 58: goto L_0x0127;
            case 59: goto L_0x00f3;
            case 60: goto L_0x00c5;
            case 61: goto L_0x00b8;
            case 62: goto L_0x015d;
            case 63: goto L_0x008a;
            case 64: goto L_0x0140;
            case 65: goto L_0x014e;
            case 66: goto L_0x0075;
            case 67: goto L_0x0060;
            case 68: goto L_0x0028;
            default: goto L_0x0026;
        };
    L_0x0026:
        goto L_0x01a1;
    L_0x0028:
        r7 = 3;
        if (r5 != r7) goto L_0x01a1;
    L_0x002b:
        r2 = r2 & -8;
        r7 = r2 | 4;
        r2 = r0.zzbh(r6);
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r6 = r7;
        r7 = r29;
        r2 = zza(r2, r3, r4, r5, r6, r7);
        r3 = r12.getInt(r1, r13);
        if (r3 != r8) goto L_0x004b;
    L_0x0046:
        r15 = r12.getObject(r1, r9);
        goto L_0x004c;
    L_0x004b:
        r15 = 0;
    L_0x004c:
        if (r15 != 0) goto L_0x0055;
    L_0x004e:
        r3 = r11.zzrq;
        r12.putObject(r1, r9, r3);
        goto L_0x019d;
    L_0x0055:
        r3 = r11.zzrq;
        r3 = com.google.android.gms.internal.vision.zzga.zza(r15, r3);
        r12.putObject(r1, r9, r3);
        goto L_0x019d;
    L_0x0060:
        if (r5 != 0) goto L_0x01a1;
    L_0x0062:
        r2 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r11);
        r3 = r11.zzrp;
        r3 = com.google.android.gms.internal.vision.zzez.zzd(r3);
        r3 = java.lang.Long.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x019d;
    L_0x0075:
        if (r5 != 0) goto L_0x01a1;
    L_0x0077:
        r2 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r11);
        r3 = r11.zzro;
        r3 = com.google.android.gms.internal.vision.zzez.zzaq(r3);
        r3 = java.lang.Integer.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x019d;
    L_0x008a:
        if (r5 != 0) goto L_0x01a1;
    L_0x008c:
        r3 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r11);
        r4 = r11.zzro;
        r5 = r0.zzbj(r6);
        if (r5 == 0) goto L_0x00ae;
    L_0x0098:
        r5 = r5.zzh(r4);
        if (r5 == 0) goto L_0x009f;
    L_0x009e:
        goto L_0x00ae;
    L_0x009f:
        r1 = zzq(r17);
        r4 = (long) r4;
        r4 = java.lang.Long.valueOf(r4);
        r1.zzb(r2, r4);
        r2 = r3;
        goto L_0x01a2;
    L_0x00ae:
        r2 = java.lang.Integer.valueOf(r4);
        r12.putObject(r1, r9, r2);
        r2 = r3;
        goto L_0x019d;
    L_0x00b8:
        if (r5 != r15) goto L_0x01a1;
    L_0x00ba:
        r2 = com.google.android.gms.internal.vision.zzeh.zze(r3, r4, r11);
        r3 = r11.zzrq;
        r12.putObject(r1, r9, r3);
        goto L_0x019d;
    L_0x00c5:
        if (r5 != r15) goto L_0x01a1;
    L_0x00c7:
        r2 = r0.zzbh(r6);
        r5 = r20;
        r2 = zza(r2, r3, r4, r5, r11);
        r3 = r12.getInt(r1, r13);
        if (r3 != r8) goto L_0x00dc;
    L_0x00d7:
        r15 = r12.getObject(r1, r9);
        goto L_0x00dd;
    L_0x00dc:
        r15 = 0;
    L_0x00dd:
        if (r15 != 0) goto L_0x00e5;
    L_0x00df:
        r3 = r11.zzrq;
        r12.putObject(r1, r9, r3);
        goto L_0x00ee;
    L_0x00e5:
        r3 = r11.zzrq;
        r3 = com.google.android.gms.internal.vision.zzga.zza(r15, r3);
        r12.putObject(r1, r9, r3);
    L_0x00ee:
        r12.putInt(r1, r13, r8);
        goto L_0x01a2;
    L_0x00f3:
        if (r5 != r15) goto L_0x01a1;
    L_0x00f5:
        r2 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r11);
        r4 = r11.zzro;
        if (r4 != 0) goto L_0x0103;
    L_0x00fd:
        r3 = "";
        r12.putObject(r1, r9, r3);
        goto L_0x0122;
    L_0x0103:
        r5 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r5 = r24 & r5;
        if (r5 == 0) goto L_0x0117;
    L_0x0109:
        r5 = r2 + r4;
        r5 = com.google.android.gms.internal.vision.zziw.zzg(r3, r2, r5);
        if (r5 == 0) goto L_0x0112;
    L_0x0111:
        goto L_0x0117;
    L_0x0112:
        r1 = com.google.android.gms.internal.vision.zzgf.zzfp();
        throw r1;
    L_0x0117:
        r5 = new java.lang.String;
        r6 = com.google.android.gms.internal.vision.zzga.UTF_8;
        r5.<init>(r3, r2, r4, r6);
        r12.putObject(r1, r9, r5);
        r2 = r2 + r4;
    L_0x0122:
        r12.putInt(r1, r13, r8);
        goto L_0x01a2;
    L_0x0127:
        if (r5 != 0) goto L_0x01a1;
    L_0x0129:
        r2 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r11);
        r3 = r11.zzrp;
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0137;
    L_0x0135:
        r15 = 1;
        goto L_0x0138;
    L_0x0137:
        r15 = 0;
    L_0x0138:
        r3 = java.lang.Boolean.valueOf(r15);
        r12.putObject(r1, r9, r3);
        goto L_0x019d;
    L_0x0140:
        if (r5 != r7) goto L_0x01a1;
    L_0x0142:
        r2 = com.google.android.gms.internal.vision.zzeh.zza(r18, r19);
        r2 = java.lang.Integer.valueOf(r2);
        r12.putObject(r1, r9, r2);
        goto L_0x018a;
    L_0x014e:
        r2 = 1;
        if (r5 != r2) goto L_0x01a1;
    L_0x0151:
        r2 = com.google.android.gms.internal.vision.zzeh.zzb(r18, r19);
        r2 = java.lang.Long.valueOf(r2);
        r12.putObject(r1, r9, r2);
        goto L_0x019b;
    L_0x015d:
        if (r5 != 0) goto L_0x01a1;
    L_0x015f:
        r2 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r11);
        r3 = r11.zzro;
        r3 = java.lang.Integer.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x019d;
    L_0x016d:
        if (r5 != 0) goto L_0x01a1;
    L_0x016f:
        r2 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r11);
        r3 = r11.zzrp;
        r3 = java.lang.Long.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x019d;
    L_0x017d:
        if (r5 != r7) goto L_0x01a1;
    L_0x017f:
        r2 = com.google.android.gms.internal.vision.zzeh.zzd(r18, r19);
        r2 = java.lang.Float.valueOf(r2);
        r12.putObject(r1, r9, r2);
    L_0x018a:
        r2 = r4 + 4;
        goto L_0x019d;
    L_0x018d:
        r2 = 1;
        if (r5 != r2) goto L_0x01a1;
    L_0x0190:
        r2 = com.google.android.gms.internal.vision.zzeh.zzc(r18, r19);
        r2 = java.lang.Double.valueOf(r2);
        r12.putObject(r1, r9, r2);
    L_0x019b:
        r2 = r4 + 8;
    L_0x019d:
        r12.putInt(r1, r13, r8);
        goto L_0x01a2;
    L_0x01a1:
        r2 = r4;
    L_0x01a2:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.vision.zzei):int");
    }

    private final zzhw zzbh(int i) {
        i = (i / 3) << 1;
        zzhw zzhw = (zzhw) this.zzze[i];
        if (zzhw != null) {
            return zzhw;
        }
        zzhw = zzhs.zzgl().zzf((Class) this.zzze[i + 1]);
        this.zzze[i] = zzhw;
        return zzhw;
    }

    private final Object zzbi(int i) {
        return this.zzze[(i / 3) << 1];
    }

    private final zzgd zzbj(int i) {
        return (zzgd) this.zzze[((i / 3) << 1) + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x041d A:{LOOP_END, LOOP:1: B:141:0x0419->B:143:0x041d} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0435  */
    /* JADX WARNING: Missing block: B:36:0x00ff, code skipped:
            r12 = r29;
     */
    /* JADX WARNING: Missing block: B:75:0x0207, code skipped:
            r6 = r6 | r22;
     */
    /* JADX WARNING: Missing block: B:79:0x022b, code skipped:
            r13 = r4;
     */
    /* JADX WARNING: Missing block: B:86:0x0263, code skipped:
            r6 = r6 | r22;
            r3 = r8;
            r2 = r9;
            r9 = r11;
            r0 = r13;
            r1 = r18;
            r13 = r31;
     */
    /* JADX WARNING: Missing block: B:93:0x029e, code skipped:
            r0 = r13 + 8;
     */
    /* JADX WARNING: Missing block: B:94:0x02a0, code skipped:
            r6 = r6 | r22;
     */
    /* JADX WARNING: Missing block: B:95:0x02a2, code skipped:
            r13 = r31;
     */
    /* JADX WARNING: Missing block: B:96:0x02a4, code skipped:
            r3 = r8;
            r2 = r9;
            r9 = r11;
            r1 = r18;
     */
    /* JADX WARNING: Missing block: B:97:0x02a9, code skipped:
            r11 = r32;
     */
    /* JADX WARNING: Missing block: B:98:0x02ad, code skipped:
            r17 = r6;
            r24 = r7;
            r7 = r8;
            r19 = r9;
            r26 = r10;
            r2 = r13;
            r6 = r32;
     */
    /* JADX WARNING: Missing block: B:115:0x034e, code skipped:
            if (r0 == r15) goto L_0x03bb;
     */
    /* JADX WARNING: Missing block: B:122:0x0395, code skipped:
            if (r0 == r15) goto L_0x03bb;
     */
    private final int zza(T r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.vision.zzei r33) {
        /*
        r27 = this;
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r10 = zzzc;
        r16 = 0;
        r0 = r30;
        r1 = -1;
        r2 = 0;
        r3 = 0;
        r6 = 0;
        r7 = -1;
    L_0x0017:
        if (r0 >= r13) goto L_0x03fa;
    L_0x0019:
        r3 = r0 + 1;
        r0 = r12[r0];
        if (r0 >= 0) goto L_0x0028;
    L_0x001f:
        r0 = com.google.android.gms.internal.vision.zzeh.zza(r0, r12, r3, r9);
        r3 = r9.zzro;
        r4 = r0;
        r5 = r3;
        goto L_0x002a;
    L_0x0028:
        r5 = r0;
        r4 = r3;
    L_0x002a:
        r3 = r5 >>> 3;
        r0 = r5 & 7;
        r8 = 3;
        if (r3 <= r1) goto L_0x0037;
    L_0x0031:
        r2 = r2 / r8;
        r1 = r15.zzr(r3, r2);
        goto L_0x003b;
    L_0x0037:
        r1 = r15.zzbn(r3);
    L_0x003b:
        r2 = r1;
        r1 = -1;
        if (r2 != r1) goto L_0x004e;
    L_0x003f:
        r18 = r3;
        r2 = r4;
        r17 = r6;
        r24 = r7;
        r26 = r10;
        r6 = r11;
        r19 = 0;
        r7 = r5;
        goto L_0x03bf;
    L_0x004e:
        r1 = r15.zzzd;
        r18 = r2 + 1;
        r8 = r1[r18];
        r18 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r18 = r8 & r18;
        r11 = r18 >>> 20;
        r18 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r19 = r5;
        r5 = r8 & r18;
        r12 = (long) r5;
        r5 = 17;
        r20 = r8;
        if (r11 > r5) goto L_0x02bb;
    L_0x0068:
        r5 = r2 + 2;
        r1 = r1[r5];
        r5 = r1 >>> 20;
        r8 = 1;
        r22 = r8 << r5;
        r1 = r1 & r18;
        if (r1 == r7) goto L_0x0083;
    L_0x0075:
        r5 = -1;
        if (r7 == r5) goto L_0x007c;
    L_0x0078:
        r8 = (long) r7;
        r10.putInt(r14, r8, r6);
    L_0x007c:
        r6 = (long) r1;
        r6 = r10.getInt(r14, r6);
        r7 = r1;
        goto L_0x0084;
    L_0x0083:
        r5 = -1;
    L_0x0084:
        r1 = 5;
        switch(r11) {
            case 0: goto L_0x0287;
            case 1: goto L_0x026e;
            case 2: goto L_0x0248;
            case 3: goto L_0x0248;
            case 4: goto L_0x022e;
            case 5: goto L_0x020b;
            case 6: goto L_0x01ee;
            case 7: goto L_0x01cb;
            case 8: goto L_0x01a5;
            case 9: goto L_0x016e;
            case 10: goto L_0x0154;
            case 11: goto L_0x022e;
            case 12: goto L_0x0120;
            case 13: goto L_0x01ee;
            case 14: goto L_0x020b;
            case 15: goto L_0x0103;
            case 16: goto L_0x00df;
            case 17: goto L_0x0096;
            default: goto L_0x0088;
        };
    L_0x0088:
        r12 = r29;
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r13 = r4;
        r8 = r19;
        r19 = -1;
        goto L_0x02ad;
    L_0x0096:
        r8 = 3;
        if (r0 != r8) goto L_0x00d5;
    L_0x0099:
        r0 = r3 << 3;
        r8 = r0 | 4;
        r0 = r15.zzbh(r2);
        r1 = r29;
        r9 = r2;
        r2 = r4;
        r18 = r3;
        r3 = r31;
        r4 = r8;
        r8 = r19;
        r19 = -1;
        r5 = r33;
        r0 = zza(r0, r1, r2, r3, r4, r5);
        r1 = r6 & r22;
        if (r1 != 0) goto L_0x00c0;
    L_0x00b8:
        r11 = r33;
        r1 = r11.zzrq;
        r10.putObject(r14, r12, r1);
        goto L_0x00cf;
    L_0x00c0:
        r11 = r33;
        r1 = r10.getObject(r14, r12);
        r2 = r11.zzrq;
        r1 = com.google.android.gms.internal.vision.zzga.zza(r1, r2);
        r10.putObject(r14, r12, r1);
    L_0x00cf:
        r6 = r6 | r22;
        r12 = r29;
        goto L_0x02a2;
    L_0x00d5:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r8 = r19;
        r19 = -1;
        goto L_0x00ff;
    L_0x00df:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r8 = r19;
        r19 = -1;
        if (r0 != 0) goto L_0x00ff;
    L_0x00ea:
        r2 = r12;
        r12 = r29;
        r13 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r4, r11);
        r0 = r11.zzrp;
        r4 = com.google.android.gms.internal.vision.zzez.zzd(r0);
        r0 = r10;
        r1 = r28;
        r0.putLong(r1, r2, r4);
        goto L_0x0263;
    L_0x00ff:
        r12 = r29;
        goto L_0x022b;
    L_0x0103:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r19 = -1;
        r12 = r29;
        if (r0 != 0) goto L_0x022b;
    L_0x0111:
        r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r4, r11);
        r1 = r11.zzro;
        r1 = com.google.android.gms.internal.vision.zzez.zzaq(r1);
        r10.putInt(r14, r2, r1);
        goto L_0x02a0;
    L_0x0120:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r19 = -1;
        r12 = r29;
        if (r0 != 0) goto L_0x022b;
    L_0x012e:
        r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r4, r11);
        r1 = r11.zzro;
        r4 = r15.zzbj(r9);
        if (r4 == 0) goto L_0x014f;
    L_0x013a:
        r4 = r4.zzh(r1);
        if (r4 == 0) goto L_0x0141;
    L_0x0140:
        goto L_0x014f;
    L_0x0141:
        r2 = zzq(r28);
        r3 = (long) r1;
        r1 = java.lang.Long.valueOf(r3);
        r2.zzb(r8, r1);
        goto L_0x02a2;
    L_0x014f:
        r10.putInt(r14, r2, r1);
        goto L_0x02a0;
    L_0x0154:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r1 = 2;
        r19 = -1;
        r12 = r29;
        if (r0 != r1) goto L_0x022b;
    L_0x0163:
        r0 = com.google.android.gms.internal.vision.zzeh.zze(r12, r4, r11);
        r1 = r11.zzrq;
        r10.putObject(r14, r2, r1);
        goto L_0x02a0;
    L_0x016e:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r1 = 2;
        r19 = -1;
        r12 = r29;
        if (r0 != r1) goto L_0x01a1;
    L_0x017d:
        r0 = r15.zzbh(r9);
        r13 = r31;
        r0 = zza(r0, r12, r4, r13, r11);
        r1 = r6 & r22;
        if (r1 != 0) goto L_0x0192;
    L_0x018b:
        r1 = r11.zzrq;
        r10.putObject(r14, r2, r1);
        goto L_0x0207;
    L_0x0192:
        r1 = r10.getObject(r14, r2);
        r4 = r11.zzrq;
        r1 = com.google.android.gms.internal.vision.zzga.zza(r1, r4);
        r10.putObject(r14, r2, r1);
        goto L_0x0207;
    L_0x01a1:
        r13 = r31;
        goto L_0x022b;
    L_0x01a5:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r1 = 2;
        r19 = -1;
        r12 = r29;
        r13 = r31;
        if (r0 != r1) goto L_0x022b;
    L_0x01b6:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r20 & r0;
        if (r0 != 0) goto L_0x01c1;
    L_0x01bc:
        r0 = com.google.android.gms.internal.vision.zzeh.zzc(r12, r4, r11);
        goto L_0x01c5;
    L_0x01c1:
        r0 = com.google.android.gms.internal.vision.zzeh.zzd(r12, r4, r11);
    L_0x01c5:
        r1 = r11.zzrq;
        r10.putObject(r14, r2, r1);
        goto L_0x0207;
    L_0x01cb:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r19 = -1;
        r12 = r29;
        r13 = r31;
        if (r0 != 0) goto L_0x022b;
    L_0x01db:
        r0 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r4, r11);
        r4 = r11.zzrp;
        r20 = 0;
        r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1));
        if (r1 == 0) goto L_0x01e9;
    L_0x01e7:
        r1 = 1;
        goto L_0x01ea;
    L_0x01e9:
        r1 = 0;
    L_0x01ea:
        com.google.android.gms.internal.vision.zziu.zza(r14, r2, r1);
        goto L_0x0207;
    L_0x01ee:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r19 = -1;
        r12 = r29;
        r13 = r31;
        if (r0 != r1) goto L_0x022b;
    L_0x01fe:
        r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r4);
        r10.putInt(r14, r2, r0);
        r0 = r4 + 4;
    L_0x0207:
        r6 = r6 | r22;
        goto L_0x02a4;
    L_0x020b:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r1 = 1;
        r19 = -1;
        r12 = r29;
        r13 = r31;
        if (r0 != r1) goto L_0x022b;
    L_0x021c:
        r20 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r4);
        r0 = r10;
        r1 = r28;
        r13 = r4;
        r4 = r20;
        r0.putLong(r1, r2, r4);
        goto L_0x029e;
    L_0x022b:
        r13 = r4;
        goto L_0x02ad;
    L_0x022e:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r19 = -1;
        r12 = r29;
        r13 = r4;
        if (r0 != 0) goto L_0x02ad;
    L_0x023d:
        r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r13, r11);
        r1 = r11.zzro;
        r10.putInt(r14, r2, r1);
        goto L_0x02a0;
    L_0x0248:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r19 = -1;
        r12 = r29;
        r13 = r4;
        if (r0 != 0) goto L_0x02ad;
    L_0x0257:
        r13 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r13, r11);
        r4 = r11.zzrp;
        r0 = r10;
        r1 = r28;
        r0.putLong(r1, r2, r4);
    L_0x0263:
        r6 = r6 | r22;
        r3 = r8;
        r2 = r9;
        r9 = r11;
        r0 = r13;
        r1 = r18;
        r13 = r31;
        goto L_0x02a9;
    L_0x026e:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r19 = -1;
        r12 = r29;
        r13 = r4;
        if (r0 != r1) goto L_0x02ad;
    L_0x027d:
        r0 = com.google.android.gms.internal.vision.zzeh.zzd(r12, r13);
        com.google.android.gms.internal.vision.zziu.zza(r14, r2, r0);
        r0 = r13 + 4;
        goto L_0x02a0;
    L_0x0287:
        r11 = r33;
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r1 = 1;
        r19 = -1;
        r12 = r29;
        r13 = r4;
        if (r0 != r1) goto L_0x02ad;
    L_0x0297:
        r0 = com.google.android.gms.internal.vision.zzeh.zzc(r12, r13);
        com.google.android.gms.internal.vision.zziu.zza(r14, r2, r0);
    L_0x029e:
        r0 = r13 + 8;
    L_0x02a0:
        r6 = r6 | r22;
    L_0x02a2:
        r13 = r31;
    L_0x02a4:
        r3 = r8;
        r2 = r9;
        r9 = r11;
        r1 = r18;
    L_0x02a9:
        r11 = r32;
        goto L_0x0017;
    L_0x02ad:
        r17 = r6;
        r24 = r7;
        r7 = r8;
        r19 = r9;
        r26 = r10;
        r2 = r13;
        r6 = r32;
        goto L_0x03bf;
    L_0x02bb:
        r9 = r2;
        r18 = r3;
        r2 = r12;
        r8 = r19;
        r19 = -1;
        r12 = r29;
        r13 = r4;
        r1 = 27;
        if (r11 != r1) goto L_0x0319;
    L_0x02ca:
        r1 = 2;
        if (r0 != r1) goto L_0x030c;
    L_0x02cd:
        r0 = r10.getObject(r14, r2);
        r0 = (com.google.android.gms.internal.vision.zzge) r0;
        r1 = r0.zzch();
        if (r1 != 0) goto L_0x02eb;
    L_0x02d9:
        r1 = r0.size();
        if (r1 != 0) goto L_0x02e2;
    L_0x02df:
        r1 = 10;
        goto L_0x02e4;
    L_0x02e2:
        r1 = r1 << 1;
    L_0x02e4:
        r0 = r0.zzah(r1);
        r10.putObject(r14, r2, r0);
    L_0x02eb:
        r5 = r0;
        r0 = r15.zzbh(r9);
        r1 = r8;
        r2 = r29;
        r3 = r13;
        r4 = r31;
        r17 = r6;
        r6 = r33;
        r0 = zza(r0, r1, r2, r3, r4, r5, r6);
        r13 = r31;
        r11 = r32;
        r3 = r8;
        r2 = r9;
        r6 = r17;
        r1 = r18;
        r9 = r33;
        goto L_0x0017;
    L_0x030c:
        r17 = r6;
        r24 = r7;
        r25 = r8;
        r19 = r9;
        r26 = r10;
        r15 = r13;
        goto L_0x0398;
    L_0x0319:
        r17 = r6;
        r1 = 49;
        if (r11 > r1) goto L_0x036a;
    L_0x031f:
        r6 = r20;
        r5 = (long) r6;
        r4 = r0;
        r0 = r27;
        r1 = r28;
        r22 = r2;
        r2 = r29;
        r3 = r13;
        r30 = r4;
        r4 = r31;
        r20 = r5;
        r5 = r8;
        r6 = r18;
        r24 = r7;
        r7 = r30;
        r25 = r8;
        r15 = -1;
        r8 = r9;
        r19 = r9;
        r26 = r10;
        r9 = r20;
        r15 = r32;
        r15 = r13;
        r12 = r22;
        r14 = r33;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14);
        if (r0 != r15) goto L_0x0352;
    L_0x0350:
        goto L_0x03bb;
    L_0x0352:
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r6 = r17;
        r1 = r18;
        r2 = r19;
        r7 = r24;
        r3 = r25;
        goto L_0x03e7;
    L_0x036a:
        r30 = r0;
        r22 = r2;
        r24 = r7;
        r25 = r8;
        r19 = r9;
        r26 = r10;
        r15 = r13;
        r6 = r20;
        r0 = 50;
        if (r11 != r0) goto L_0x039e;
    L_0x037d:
        r7 = r30;
        r0 = 2;
        if (r7 != r0) goto L_0x0398;
    L_0x0382:
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r15;
        r4 = r31;
        r5 = r19;
        r6 = r22;
        r8 = r33;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r8);
        if (r0 != r15) goto L_0x0352;
    L_0x0397:
        goto L_0x03bb;
    L_0x0398:
        r6 = r32;
        r2 = r15;
    L_0x039b:
        r7 = r25;
        goto L_0x03bf;
    L_0x039e:
        r7 = r30;
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r15;
        r4 = r31;
        r5 = r25;
        r8 = r6;
        r6 = r18;
        r9 = r11;
        r10 = r22;
        r12 = r19;
        r13 = r33;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        if (r0 != r15) goto L_0x03eb;
    L_0x03bb:
        r6 = r32;
        r2 = r0;
        goto L_0x039b;
    L_0x03bf:
        if (r7 != r6) goto L_0x03c6;
    L_0x03c1:
        if (r6 != 0) goto L_0x03c4;
    L_0x03c3:
        goto L_0x03c6;
    L_0x03c4:
        r3 = r7;
        goto L_0x0402;
    L_0x03c6:
        r0 = r7;
        r1 = r29;
        r3 = r31;
        r4 = r28;
        r5 = r33;
        r0 = zza(r0, r1, r2, r3, r4, r5);
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r9 = r33;
        r11 = r6;
    L_0x03de:
        r3 = r7;
        r6 = r17;
        r1 = r18;
        r2 = r19;
        r7 = r24;
    L_0x03e7:
        r10 = r26;
        goto L_0x0017;
    L_0x03eb:
        r7 = r25;
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        goto L_0x03de;
    L_0x03fa:
        r17 = r6;
        r24 = r7;
        r26 = r10;
        r6 = r11;
        r2 = r0;
    L_0x0402:
        r1 = r17;
        r0 = r24;
        r4 = -1;
        if (r0 == r4) goto L_0x0412;
    L_0x0409:
        r4 = (long) r0;
        r0 = r28;
        r7 = r26;
        r7.putInt(r0, r4, r1);
        goto L_0x0414;
    L_0x0412:
        r0 = r28;
    L_0x0414:
        r1 = 0;
        r4 = r27;
        r5 = r4.zzzn;
    L_0x0419:
        r7 = r4.zzzo;
        if (r5 >= r7) goto L_0x042c;
    L_0x041d:
        r7 = r4.zzzm;
        r7 = r7[r5];
        r8 = r4.zzzr;
        r1 = r4.zza(r0, r7, r1, r8);
        r1 = (com.google.android.gms.internal.vision.zzip) r1;
        r5 = r5 + 1;
        goto L_0x0419;
    L_0x042c:
        if (r1 == 0) goto L_0x0433;
    L_0x042e:
        r5 = r4.zzzr;
        r5.zzf(r0, r1);
    L_0x0433:
        if (r6 != 0) goto L_0x043f;
    L_0x0435:
        r0 = r31;
        if (r2 != r0) goto L_0x043a;
    L_0x0439:
        goto L_0x0445;
    L_0x043a:
        r0 = com.google.android.gms.internal.vision.zzgf.zzfo();
        throw r0;
    L_0x043f:
        r0 = r31;
        if (r2 > r0) goto L_0x0446;
    L_0x0443:
        if (r3 != r6) goto L_0x0446;
    L_0x0445:
        return r2;
    L_0x0446:
        r0 = com.google.android.gms.internal.vision.zzgf.zzfo();
        goto L_0x044c;
    L_0x044b:
        throw r0;
    L_0x044c:
        goto L_0x044b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.zzei):int");
    }

    /* JADX WARNING: Missing block: B:52:0x010b, code skipped:
            r2 = r4;
            r1 = r7;
     */
    /* JADX WARNING: Missing block: B:62:0x013d, code skipped:
            r0 = r6;
     */
    /* JADX WARNING: Missing block: B:69:0x0159, code skipped:
            r0 = r8 + 8;
     */
    /* JADX WARNING: Missing block: B:70:0x015b, code skipped:
            r1 = r7;
            r2 = r10;
     */
    /* JADX WARNING: Missing block: B:71:0x015f, code skipped:
            r24 = r7;
            r15 = r8;
            r18 = r9;
            r19 = r10;
     */
    /* JADX WARNING: Missing block: B:88:0x01e2, code skipped:
            if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Missing block: B:94:0x020f, code skipped:
            if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Missing block: B:97:0x022e, code skipped:
            if (r0 == r15) goto L_0x0230;
     */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.vision.zzei r32) {
        /*
        r27 = this;
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r11 = r32;
        r0 = r15.zzzk;
        if (r0 == 0) goto L_0x025b;
    L_0x000e:
        r9 = zzzc;
        r10 = -1;
        r16 = 0;
        r0 = r30;
        r1 = -1;
        r2 = 0;
    L_0x0017:
        if (r0 >= r13) goto L_0x0252;
    L_0x0019:
        r3 = r0 + 1;
        r0 = r12[r0];
        if (r0 >= 0) goto L_0x0029;
    L_0x001f:
        r0 = com.google.android.gms.internal.vision.zzeh.zza(r0, r12, r3, r11);
        r3 = r11.zzro;
        r8 = r0;
        r17 = r3;
        goto L_0x002c;
    L_0x0029:
        r17 = r0;
        r8 = r3;
    L_0x002c:
        r7 = r17 >>> 3;
        r6 = r17 & 7;
        if (r7 <= r1) goto L_0x0039;
    L_0x0032:
        r2 = r2 / 3;
        r0 = r15.zzr(r7, r2);
        goto L_0x003d;
    L_0x0039:
        r0 = r15.zzbn(r7);
    L_0x003d:
        r4 = r0;
        if (r4 != r10) goto L_0x004b;
    L_0x0040:
        r24 = r7;
        r2 = r8;
        r18 = r9;
        r19 = 0;
        r26 = -1;
        goto L_0x0231;
    L_0x004b:
        r0 = r15.zzzd;
        r1 = r4 + 1;
        r5 = r0[r1];
        r0 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r0 = r0 & r5;
        r3 = r0 >>> 20;
        r0 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r0 = r0 & r5;
        r1 = (long) r0;
        r0 = 17;
        r10 = 2;
        if (r3 > r0) goto L_0x0167;
    L_0x0060:
        r0 = 1;
        switch(r3) {
            case 0: goto L_0x014e;
            case 1: goto L_0x013f;
            case 2: goto L_0x012d;
            case 3: goto L_0x012d;
            case 4: goto L_0x011f;
            case 5: goto L_0x010f;
            case 6: goto L_0x00fe;
            case 7: goto L_0x00e8;
            case 8: goto L_0x00d1;
            case 9: goto L_0x00b0;
            case 10: goto L_0x00a3;
            case 11: goto L_0x011f;
            case 12: goto L_0x0094;
            case 13: goto L_0x00fe;
            case 14: goto L_0x010f;
            case 15: goto L_0x0081;
            case 16: goto L_0x0066;
            default: goto L_0x0064;
        };
    L_0x0064:
        goto L_0x01a4;
    L_0x0066:
        if (r6 != 0) goto L_0x01a4;
    L_0x0068:
        r6 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r8, r11);
        r19 = r1;
        r0 = r11.zzrp;
        r21 = com.google.android.gms.internal.vision.zzez.zzd(r0);
        r0 = r9;
        r2 = r19;
        r1 = r28;
        r10 = r4;
        r4 = r21;
        r0.putLong(r1, r2, r4);
        goto L_0x013d;
    L_0x0081:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x015f;
    L_0x0085:
        r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r8, r11);
        r1 = r11.zzro;
        r1 = com.google.android.gms.internal.vision.zzez.zzaq(r1);
        r9.putInt(r14, r2, r1);
        goto L_0x015b;
    L_0x0094:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x015f;
    L_0x0098:
        r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r8, r11);
        r1 = r11.zzro;
        r9.putInt(r14, r2, r1);
        goto L_0x015b;
    L_0x00a3:
        r2 = r1;
        if (r6 != r10) goto L_0x01a4;
    L_0x00a6:
        r0 = com.google.android.gms.internal.vision.zzeh.zze(r12, r8, r11);
        r1 = r11.zzrq;
        r9.putObject(r14, r2, r1);
        goto L_0x010b;
    L_0x00b0:
        r2 = r1;
        if (r6 != r10) goto L_0x01a4;
    L_0x00b3:
        r0 = r15.zzbh(r4);
        r0 = zza(r0, r12, r8, r13, r11);
        r1 = r9.getObject(r14, r2);
        if (r1 != 0) goto L_0x00c7;
    L_0x00c1:
        r1 = r11.zzrq;
        r9.putObject(r14, r2, r1);
        goto L_0x010b;
    L_0x00c7:
        r5 = r11.zzrq;
        r1 = com.google.android.gms.internal.vision.zzga.zza(r1, r5);
        r9.putObject(r14, r2, r1);
        goto L_0x010b;
    L_0x00d1:
        r2 = r1;
        if (r6 != r10) goto L_0x01a4;
    L_0x00d4:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r0 & r5;
        if (r0 != 0) goto L_0x00de;
    L_0x00d9:
        r0 = com.google.android.gms.internal.vision.zzeh.zzc(r12, r8, r11);
        goto L_0x00e2;
    L_0x00de:
        r0 = com.google.android.gms.internal.vision.zzeh.zzd(r12, r8, r11);
    L_0x00e2:
        r1 = r11.zzrq;
        r9.putObject(r14, r2, r1);
        goto L_0x010b;
    L_0x00e8:
        r2 = r1;
        if (r6 != 0) goto L_0x01a4;
    L_0x00eb:
        r1 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r8, r11);
        r5 = r11.zzrp;
        r19 = 0;
        r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1));
        if (r8 == 0) goto L_0x00f8;
    L_0x00f7:
        goto L_0x00f9;
    L_0x00f8:
        r0 = 0;
    L_0x00f9:
        com.google.android.gms.internal.vision.zziu.zza(r14, r2, r0);
        r0 = r1;
        goto L_0x010b;
    L_0x00fe:
        r2 = r1;
        r0 = 5;
        if (r6 != r0) goto L_0x01a4;
    L_0x0102:
        r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r8);
        r9.putInt(r14, r2, r0);
        r0 = r8 + 4;
    L_0x010b:
        r2 = r4;
        r1 = r7;
        goto L_0x024f;
    L_0x010f:
        r2 = r1;
        if (r6 != r0) goto L_0x01a4;
    L_0x0112:
        r5 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r8);
        r0 = r9;
        r1 = r28;
        r10 = r4;
        r4 = r5;
        r0.putLong(r1, r2, r4);
        goto L_0x0159;
    L_0x011f:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x015f;
    L_0x0123:
        r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r8, r11);
        r1 = r11.zzro;
        r9.putInt(r14, r2, r1);
        goto L_0x015b;
    L_0x012d:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x015f;
    L_0x0131:
        r6 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r8, r11);
        r4 = r11.zzrp;
        r0 = r9;
        r1 = r28;
        r0.putLong(r1, r2, r4);
    L_0x013d:
        r0 = r6;
        goto L_0x015b;
    L_0x013f:
        r2 = r1;
        r10 = r4;
        r0 = 5;
        if (r6 != r0) goto L_0x015f;
    L_0x0144:
        r0 = com.google.android.gms.internal.vision.zzeh.zzd(r12, r8);
        com.google.android.gms.internal.vision.zziu.zza(r14, r2, r0);
        r0 = r8 + 4;
        goto L_0x015b;
    L_0x014e:
        r2 = r1;
        r10 = r4;
        if (r6 != r0) goto L_0x015f;
    L_0x0152:
        r0 = com.google.android.gms.internal.vision.zzeh.zzc(r12, r8);
        com.google.android.gms.internal.vision.zziu.zza(r14, r2, r0);
    L_0x0159:
        r0 = r8 + 8;
    L_0x015b:
        r1 = r7;
        r2 = r10;
        goto L_0x024f;
    L_0x015f:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
        goto L_0x01ab;
    L_0x0167:
        r0 = 27;
        if (r3 != r0) goto L_0x01af;
    L_0x016b:
        if (r6 != r10) goto L_0x01a4;
    L_0x016d:
        r0 = r9.getObject(r14, r1);
        r0 = (com.google.android.gms.internal.vision.zzge) r0;
        r3 = r0.zzch();
        if (r3 != 0) goto L_0x018b;
    L_0x0179:
        r3 = r0.size();
        if (r3 != 0) goto L_0x0182;
    L_0x017f:
        r3 = 10;
        goto L_0x0184;
    L_0x0182:
        r3 = r3 << 1;
    L_0x0184:
        r0 = r0.zzah(r3);
        r9.putObject(r14, r1, r0);
    L_0x018b:
        r5 = r0;
        r0 = r15.zzbh(r4);
        r1 = r17;
        r2 = r29;
        r3 = r8;
        r19 = r4;
        r4 = r31;
        r6 = r32;
        r0 = zza(r0, r1, r2, r3, r4, r5, r6);
        r1 = r7;
        r2 = r19;
        goto L_0x024f;
    L_0x01a4:
        r19 = r4;
        r24 = r7;
        r15 = r8;
        r18 = r9;
    L_0x01ab:
        r26 = -1;
        goto L_0x0212;
    L_0x01af:
        r19 = r4;
        r0 = 49;
        if (r3 > r0) goto L_0x01e5;
    L_0x01b5:
        r4 = (long) r5;
        r0 = r27;
        r20 = r1;
        r1 = r28;
        r2 = r29;
        r10 = r3;
        r3 = r8;
        r22 = r4;
        r4 = r31;
        r5 = r17;
        r30 = r6;
        r6 = r7;
        r24 = r7;
        r7 = r30;
        r15 = r8;
        r8 = r19;
        r18 = r9;
        r25 = r10;
        r26 = -1;
        r9 = r22;
        r11 = r25;
        r12 = r20;
        r14 = r32;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14);
        if (r0 != r15) goto L_0x023f;
    L_0x01e4:
        goto L_0x0230;
    L_0x01e5:
        r20 = r1;
        r25 = r3;
        r30 = r6;
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r26 = -1;
        r0 = 50;
        r9 = r25;
        if (r9 != r0) goto L_0x0214;
    L_0x01f8:
        r7 = r30;
        if (r7 != r10) goto L_0x0212;
    L_0x01fc:
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r15;
        r4 = r31;
        r5 = r19;
        r6 = r20;
        r8 = r32;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r8);
        if (r0 != r15) goto L_0x023f;
    L_0x0211:
        goto L_0x0230;
    L_0x0212:
        r2 = r15;
        goto L_0x0231;
    L_0x0214:
        r7 = r30;
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r15;
        r4 = r31;
        r8 = r5;
        r5 = r17;
        r6 = r24;
        r10 = r20;
        r12 = r19;
        r13 = r32;
        r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        if (r0 != r15) goto L_0x023f;
    L_0x0230:
        r2 = r0;
    L_0x0231:
        r0 = r17;
        r1 = r29;
        r3 = r31;
        r4 = r28;
        r5 = r32;
        r0 = zza(r0, r1, r2, r3, r4, r5);
    L_0x023f:
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r11 = r32;
        r9 = r18;
        r2 = r19;
        r1 = r24;
    L_0x024f:
        r10 = -1;
        goto L_0x0017;
    L_0x0252:
        r4 = r13;
        if (r0 != r4) goto L_0x0256;
    L_0x0255:
        return;
    L_0x0256:
        r0 = com.google.android.gms.internal.vision.zzgf.zzfo();
        throw r0;
    L_0x025b:
        r4 = r13;
        r5 = 0;
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r30;
        r4 = r31;
        r6 = r32;
        r0.zza(r1, r2, r3, r4, r5, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.zzei):void");
    }

    public final void zze(T t) {
        int i;
        int i2 = this.zzzn;
        while (true) {
            i = this.zzzo;
            if (i2 >= i) {
                break;
            }
            long zzbk = (long) (zzbk(this.zzzm[i2]) & 1048575);
            Object zzp = zziu.zzp(t, zzbk);
            if (zzp != null) {
                zziu.zza((Object) t, zzbk, this.zzzt.zzm(zzp));
            }
            i2++;
        }
        i2 = this.zzzm.length;
        while (i < i2) {
            this.zzzq.zzb(t, (long) this.zzzm[i]);
            i++;
        }
        this.zzzr.zze(t);
        if (this.zzzi) {
            this.zzzs.zze((Object) t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzio<UT, UB> zzio) {
        int i2 = this.zzzd[i];
        obj = zziu.zzp(obj, (long) (zzbk(i) & 1048575));
        if (obj == null) {
            return ub;
        }
        zzgd zzbj = zzbj(i);
        if (zzbj == null) {
            return ub;
        }
        return zza(i, i2, this.zzzt.zzj(obj), zzbj, (Object) ub, (zzio) zzio);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzgd zzgd, UB ub, zzio<UT, UB> zzio) {
        zzgy zzo = this.zzzt.zzo(zzbi(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!zzgd.zzh(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzio.zzhd();
                }
                zzev zzaj = zzeo.zzaj(zzgx.zza(zzo, entry.getKey(), entry.getValue()));
                try {
                    zzgx.zza(zzaj.zzdp(), zzo, entry.getKey(), entry.getValue());
                    zzio.zza((Object) ub, i2, zzaj.zzdo());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final boolean zzr(T t) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i >= this.zzzn) {
                return !this.zzzi || this.zzzs.zzc(t).isInitialized();
            } else {
                int i5;
                int i6;
                int i7 = this.zzzm[i];
                int i8 = this.zzzd[i7];
                int zzbk = zzbk(i7);
                if (this.zzzk) {
                    i5 = 0;
                } else {
                    i5 = this.zzzd[i7 + 2];
                    i6 = i5 & 1048575;
                    i5 = 1 << (i5 >>> 20);
                    if (i6 != i2) {
                        i3 = zzzc.getInt(t, (long) i6);
                        i2 = i6;
                    }
                }
                if (((268435456 & zzbk) != 0 ? 1 : null) != null && !zza((Object) t, i7, i3, i5)) {
                    return false;
                }
                i6 = (267386880 & zzbk) >>> 20;
                if (i6 != 9 && i6 != 17) {
                    zzhw zzhw;
                    if (i6 != 27) {
                        if (i6 == 60 || i6 == 68) {
                            if (zza((Object) t, i8, i7) && !zza((Object) t, zzbk, zzbh(i7))) {
                                return false;
                            }
                        } else if (i6 != 49) {
                            if (i6 != 50) {
                                continue;
                            } else {
                                Map zzk = this.zzzt.zzk(zziu.zzp(t, (long) (zzbk & 1048575)));
                                if (!zzk.isEmpty()) {
                                    if (this.zzzt.zzo(zzbi(i7)).zzyx.zzho() == zzji.MESSAGE) {
                                        zzhw = null;
                                        for (Object next : zzk.values()) {
                                            if (zzhw == null) {
                                                zzhw = zzhs.zzgl().zzf(next.getClass());
                                            }
                                            if (!zzhw.zzr(next)) {
                                                i4 = 0;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (i4 == 0) {
                                    return false;
                                }
                            }
                        }
                    }
                    List list = (List) zziu.zzp(t, (long) (zzbk & 1048575));
                    if (!list.isEmpty()) {
                        zzhw = zzbh(i7);
                        for (zzbk = 0; zzbk < list.size(); zzbk++) {
                            if (!zzhw.zzr(list.get(zzbk))) {
                                i4 = 0;
                                break;
                            }
                        }
                    }
                    if (i4 == 0) {
                        return false;
                    }
                } else if (zza((Object) t, i7, i3, i5) && !zza((Object) t, zzbk, zzbh(i7))) {
                    return false;
                }
                i++;
            }
        }
    }

    private static boolean zza(Object obj, int i, zzhw zzhw) {
        return zzhw.zzr(zziu.zzp(obj, (long) (i & 1048575)));
    }

    private static void zza(int i, Object obj, zzjj zzjj) {
        if (obj instanceof String) {
            zzjj.zza(i, (String) obj);
        } else {
            zzjj.zza(i, (zzeo) obj);
        }
    }

    private final void zza(Object obj, int i, zzhv zzhv) {
        if (zzbm(i)) {
            zziu.zza(obj, (long) (i & 1048575), zzhv.zzcv());
        } else if (this.zzzj) {
            zziu.zza(obj, (long) (i & 1048575), zzhv.readString());
        } else {
            zziu.zza(obj, (long) (i & 1048575), zzhv.zzcw());
        }
    }

    private final int zzbk(int i) {
        return this.zzzd[i + 1];
    }

    private final int zzbl(int i) {
        return this.zzzd[i + 2];
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zziu.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zziu.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zziu.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zziu.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zziu.zzp(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((Object) t, i) == zza((Object) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzzk) {
            return zza((Object) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzzk) {
            i = zzbk(i);
            long j = (long) (i & 1048575);
            switch ((i & 267386880) >>> 20) {
                case 0:
                    return zziu.zzo(t, j) != 0.0d;
                case 1:
                    return zziu.zzn(t, j) != 0.0f;
                case 2:
                    return zziu.zzl(t, j) != 0;
                case 3:
                    return zziu.zzl(t, j) != 0;
                case 4:
                    return zziu.zzk(t, j) != 0;
                case 5:
                    return zziu.zzl(t, j) != 0;
                case 6:
                    return zziu.zzk(t, j) != 0;
                case 7:
                    return zziu.zzm(t, j);
                case 8:
                    Object zzp = zziu.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    } else {
                        if (zzp instanceof zzeo) {
                            return !zzeo.zzrx.equals(zzp);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                case 9:
                    return zziu.zzp(t, j) != null;
                case 10:
                    return !zzeo.zzrx.equals(zziu.zzp(t, j));
                case 11:
                    return zziu.zzk(t, j) != 0;
                case 12:
                    return zziu.zzk(t, j) != 0;
                case 13:
                    return zziu.zzk(t, j) != 0;
                case 14:
                    return zziu.zzl(t, j) != 0;
                case 15:
                    return zziu.zzk(t, j) != 0;
                case 16:
                    return zziu.zzl(t, j) != 0;
                case 17:
                    return zziu.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        i = zzbl(i);
        return (zziu.zzk(t, (long) (i & 1048575)) & (1 << (i >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (!this.zzzk) {
            i = zzbl(i);
            long j = (long) (i & 1048575);
            zziu.zzb((Object) t, j, zziu.zzk(t, j) | (1 << (i >>> 20)));
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zziu.zzk(t, (long) (zzbl(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zziu.zzb((Object) t, (long) (zzbl(i2) & 1048575), i);
    }

    private final int zzbn(int i) {
        return (i < this.zzzf || i > this.zzzg) ? -1 : zzs(i, 0);
    }

    private final int zzr(int i, int i2) {
        return (i < this.zzzf || i > this.zzzg) ? -1 : zzs(i, i2);
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzzd.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzzd[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
