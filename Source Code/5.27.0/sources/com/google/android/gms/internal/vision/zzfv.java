package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzfv extends zzef<Float> implements zzge<Float>, zzhr, RandomAccess {
    private static final zzfv zzwf;
    private int size;
    private float[] zzwg;

    zzfv() {
        this(new float[10], 0);
    }

    private zzfv(float[] fArr, int i) {
        this.zzwg = fArr;
        this.size = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void removeRange(int i, int i2) {
        zzcj();
        if (i2 >= i) {
            float[] fArr = this.zzwg;
            System.arraycopy(fArr, i2, fArr, i, this.size - i2);
            this.size -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfv)) {
            return super.equals(obj);
        }
        zzfv zzfv = (zzfv) obj;
        if (this.size != zzfv.size) {
            return false;
        }
        float[] fArr = zzfv.zzwg;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.zzwg[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzwg[i2]);
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zzh(float f) {
        zzc(this.size, f);
    }

    private final void zzc(int i, float f) {
        zzcj();
        if (i >= 0) {
            int i2 = this.size;
            if (i <= i2) {
                float[] fArr = this.zzwg;
                if (i2 < fArr.length) {
                    System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                } else {
                    float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(fArr, 0, fArr2, 0, i);
                    System.arraycopy(this.zzwg, i, fArr2, i + 1, this.size - i);
                    this.zzwg = fArr2;
                }
                this.zzwg[i] = f;
                this.size++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(zzag(i));
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        zzcj();
        zzga.checkNotNull(collection);
        if (!(collection instanceof zzfv)) {
            return super.addAll(collection);
        }
        zzfv zzfv = (zzfv) collection;
        int i = zzfv.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            i2 += i;
            float[] fArr = this.zzwg;
            if (i2 > fArr.length) {
                this.zzwg = Arrays.copyOf(fArr, i2);
            }
            System.arraycopy(zzfv.zzwg, 0, this.zzwg, this.size, zzfv.size);
            this.size = i2;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzcj();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Float.valueOf(this.zzwg[i]))) {
                float[] fArr = this.zzwg;
                System.arraycopy(fArr, i + 1, fArr, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzaf(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzag(i));
        }
    }

    private final String zzag(int i) {
        int i2 = this.size;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzcj();
        zzaf(i);
        float[] fArr = this.zzwg;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzc(i, ((Float) obj).floatValue());
    }

    public final /* synthetic */ zzge zzah(int i) {
        if (i >= this.size) {
            return new zzfv(Arrays.copyOf(this.zzwg, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzaf(i);
        return Float.valueOf(this.zzwg[i]);
    }

    static {
        zzfv zzfv = new zzfv();
        zzwf = zzfv;
        zzfv.zzci();
    }
}
