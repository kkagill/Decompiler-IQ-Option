package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.j;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;

/* compiled from: JavaTypeResolver.kt */
final class JavaTypeResolver$transformJavaClassifierType$1 extends Lambda implements a<ad> {
    final /* synthetic */ j $javaType;

    JavaTypeResolver$transformJavaClassifierType$1(j jVar) {
        this.$javaType = jVar;
        super(0);
    }

    /* renamed from: bsD */
    public final ad invoke() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unresolved java class ");
        stringBuilder.append(this.$javaType.bxw());
        ad mK = p.mK(stringBuilder.toString());
        i.e(mK, "ErrorUtils.createErrorTy…vaType.presentableText}\")");
        return mK;
    }
}
