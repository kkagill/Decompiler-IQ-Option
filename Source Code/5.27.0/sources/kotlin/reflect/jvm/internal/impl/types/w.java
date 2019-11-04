package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.a;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.checker.l;

/* compiled from: KotlinType.kt */
public abstract class w implements a {
    public abstract an bMZ();

    public abstract ay bPA();

    public abstract boolean boc();

    public abstract h bsF();

    public abstract List<ap> btD();

    private w() {
    }

    public /* synthetic */ w(f fVar) {
        this();
    }

    public final int hashCode() {
        if (y.aJ(this)) {
            return super.hashCode();
        }
        return (((bMZ().hashCode() * 31) + btD().hashCode()) * 31) + boc();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!(boc() == wVar.boc() && l.fxR.a(bPA(), wVar.bPA()))) {
            z = false;
        }
        return z;
    }
}
