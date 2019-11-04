package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.d;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;

/* compiled from: DescriptorUtils.kt */
final /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements b<ar, Boolean> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 ftL = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    public final d RW() {
        return k.G(ar.class);
    }

    public final String RX() {
        return "declaresDefaultValue()Z";
    }

    public final String getName() {
        return "declaresDefaultValue";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(g((ar) obj));
    }

    public final boolean g(ar arVar) {
        i.f(arVar, "p1");
        return arVar.btR();
    }
}
