package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;

/* compiled from: TypeSubstitution.kt */
public final class u extends as {
    private final ao[] fxk;
    private final ap[] fxl;
    private final boolean fxm;

    public final ao[] bPx() {
        return this.fxk;
    }

    public final ap[] bPy() {
        return this.fxl;
    }

    public /* synthetic */ u(ao[] aoVarArr, ap[] apVarArr, boolean z, int i, f fVar) {
        if ((i & 4) != 0) {
            z = false;
        }
        this(aoVarArr, apVarArr, z);
    }

    public u(ao[] aoVarArr, ap[] apVarArr, boolean z) {
        i.f(aoVarArr, "parameters");
        i.f(apVarArr, "arguments");
        this.fxk = aoVarArr;
        this.fxl = apVarArr;
        this.fxm = z;
        Object obj = this.fxk.length <= this.fxl.length ? 1 : null;
        if (m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Number of arguments should not be less then number of parameters, but: parameters=");
            stringBuilder.append(this.fxk.length);
            stringBuilder.append(", args=");
            stringBuilder.append(this.fxl.length);
            throw new AssertionError(stringBuilder.toString());
        }
    }

    public u(List<? extends ao> list, List<? extends ap> list2) {
        i.f(list, "parameters");
        i.f(list2, "argumentsList");
        Object[] toArray = list.toArray(new ao[0]);
        String str = "null cannot be cast to non-null type kotlin.Array<T>";
        if (toArray != null) {
            ao[] aoVarArr = (ao[]) toArray;
            toArray = list2.toArray(new ap[0]);
            if (toArray != null) {
                this(aoVarArr, (ap[]) toArray, false, 4, null);
                return;
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }

    public boolean isEmpty() {
        return this.fxl.length == 0;
    }

    public boolean bNd() {
        return this.fxm;
    }

    public ap Y(w wVar) {
        i.f(wVar, "key");
        f brQ = wVar.bMZ().brQ();
        if (!(brQ instanceof ao)) {
            brQ = null;
        }
        ao aoVar = (ao) brQ;
        if (aoVar != null) {
            int index = aoVar.getIndex();
            ao[] aoVarArr = this.fxk;
            if (index < aoVarArr.length && i.y(aoVarArr[index].brm(), aoVar.brm())) {
                return this.fxl[index];
            }
        }
        return null;
    }
}
