package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: KotlinType.kt */
public abstract class az extends w {
    public abstract w bPB();

    public boolean bPc() {
        return true;
    }

    public az() {
        super();
    }

    public f brE() {
        return bPB().brE();
    }

    public an bMZ() {
        return bPB().bMZ();
    }

    public List<ap> btD() {
        return bPB().btD();
    }

    public boolean boc() {
        return bPB().boc();
    }

    public h bsF() {
        return bPB().bsF();
    }

    public final ay bPA() {
        w bPB = bPB();
        while (bPB instanceof az) {
            bPB = ((az) bPB).bPB();
        }
        if (bPB != null) {
            return (ay) bPB;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
    }

    public String toString() {
        return bPc() ? bPB().toString() : "<Not computed yet>";
    }
}
