package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 extends Lambda implements b<Integer, d> {
    final /* synthetic */ d[] $computedResult;

    SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1(d[] dVarArr) {
        this.$computedResult = dVarArr;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return jR(((Number) obj).intValue());
    }

    public final d jR(int i) {
        d[] dVarArr = this.$computedResult;
        return (i < 0 || i > i.D(dVarArr)) ? d.fkG.bxV() : dVarArr[i];
    }
}
