package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class zzir implements Cloneable {
    private Object value;
    private zzip<?, ?> zzaop;
    private List<zziy> zzaoq = new ArrayList();

    zzir() {
    }

    /* Access modifiers changed, original: final */
    public final void zza(zziy zziy) {
        List list = this.zzaoq;
        if (list != null) {
            list.add(zziy);
            return;
        }
        Object obj = this.value;
        if (obj instanceof zziw) {
            byte[] bArr = zziy.zzado;
            zzil zzj = zzil.zzj(bArr, 0, bArr.length);
            int zzta = zzj.zzta();
            if (zzta == bArr.length - zzio.zzbj(zzta)) {
                zziw zza = ((zziw) this.value).zza(zzj);
                this.zzaop = this.zzaop;
                this.value = zza;
                this.zzaoq = null;
                return;
            }
            throw zzit.zzxd();
        } else if (obj instanceof zziw[]) {
            Collections.singletonList(zziy);
            throw new NoSuchMethodError();
        } else if (obj instanceof zzgi) {
            Collections.singletonList(zziy);
            throw new NoSuchMethodError();
        } else if (obj instanceof zzgi[]) {
            Collections.singletonList(zziy);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(zziy);
            throw new NoSuchMethodError();
        }
    }

    /* Access modifiers changed, original: final */
    public final int zzqy() {
        if (this.value == null) {
            int i = 0;
            for (zziy zziy : this.zzaoq) {
                i += (zzio.zzbq(zziy.tag) + 0) + zziy.zzado.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzio zzio) {
        if (this.value == null) {
            for (zziy zziy : this.zzaoq) {
                zzio.zzck(zziy.tag);
                zzio.zzk(zziy.zzado);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzir)) {
            return false;
        }
        zzir zzir = (zzir) obj;
        if (this.value == null || zzir.value == null) {
            List list = this.zzaoq;
            if (list != null) {
                List list2 = zzir.zzaoq;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(toByteArray(), zzir.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        zzip zzip = this.zzaop;
        if (zzip != zzir.zzaop) {
            return false;
        }
        if (!zzip.zzaon.isArray()) {
            return this.value.equals(zzir.value);
        }
        Object obj2 = this.value;
        if (obj2 instanceof byte[]) {
            return Arrays.equals((byte[]) obj2, (byte[]) zzir.value);
        }
        if (obj2 instanceof int[]) {
            return Arrays.equals((int[]) obj2, (int[]) zzir.value);
        }
        if (obj2 instanceof long[]) {
            return Arrays.equals((long[]) obj2, (long[]) zzir.value);
        }
        if (obj2 instanceof float[]) {
            return Arrays.equals((float[]) obj2, (float[]) zzir.value);
        }
        if (obj2 instanceof double[]) {
            return Arrays.equals((double[]) obj2, (double[]) zzir.value);
        }
        if (obj2 instanceof boolean[]) {
            return Arrays.equals((boolean[]) obj2, (boolean[]) zzir.value);
        }
        return Arrays.deepEquals((Object[]) obj2, (Object[]) zzir.value);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] toByteArray() {
        byte[] bArr = new byte[zzqy()];
        zza(zzio.zzj(bArr));
        return bArr;
    }

    private final zzir zzxc() {
        zzir zzir = new zzir();
        try {
            zzir.zzaop = this.zzaop;
            if (this.zzaoq == null) {
                zzir.zzaoq = null;
            } else {
                zzir.zzaoq.addAll(this.zzaoq);
            }
            if (this.value != null) {
                if (this.value instanceof zziw) {
                    zzir.value = (zziw) ((zziw) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    zzir.value = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zzir.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.value instanceof boolean[]) {
                        zzir.value = ((boolean[]) this.value).clone();
                    } else if (this.value instanceof int[]) {
                        zzir.value = ((int[]) this.value).clone();
                    } else if (this.value instanceof long[]) {
                        zzir.value = ((long[]) this.value).clone();
                    } else if (this.value instanceof float[]) {
                        zzir.value = ((float[]) this.value).clone();
                    } else if (this.value instanceof double[]) {
                        zzir.value = ((double[]) this.value).clone();
                    } else if (this.value instanceof zziw[]) {
                        zziw[] zziwArr = (zziw[]) this.value;
                        zziw[] zziwArr2 = new zziw[zziwArr.length];
                        zzir.value = zziwArr2;
                        while (i < zziwArr.length) {
                            zziwArr2[i] = (zziw) zziwArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return zzir;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return zzxc();
    }
}
