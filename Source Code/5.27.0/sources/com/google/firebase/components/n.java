package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public final class n {
    private final Class<?> acf;
    private final int ach;
    private final int type;

    private n(Class<?> cls, int i, int i2) {
        this.acf = (Class) Preconditions.checkNotNull(cls, "Null dependency anInterface.");
        this.type = i;
        this.ach = i2;
    }

    @KeepForSdk
    public static n v(Class<?> cls) {
        return new n(cls, 1, 0);
    }

    @KeepForSdk
    public static n w(Class<?> cls) {
        return new n(cls, 2, 0);
    }

    public Class<?> wn() {
        return this.acf;
    }

    public boolean wo() {
        return this.type == 1;
    }

    public boolean wp() {
        return this.type == 2;
    }

    public boolean wq() {
        return this.ach == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.acf == nVar.acf && this.type == nVar.type && this.ach == nVar.ach) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.acf.hashCode() ^ 1000003) * 1000003) ^ this.type) * 1000003) ^ this.ach;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
        stringBuilder.append(this.acf);
        stringBuilder.append(", type=");
        int i = this.type;
        boolean z = true;
        String str = i == 1 ? "required" : i == 0 ? "optional" : "set";
        stringBuilder.append(str);
        stringBuilder.append(", direct=");
        if (this.ach != 0) {
            z = false;
        }
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
