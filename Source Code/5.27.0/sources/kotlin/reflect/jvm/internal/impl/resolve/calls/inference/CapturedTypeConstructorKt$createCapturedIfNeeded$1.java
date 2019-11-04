package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: CapturedTypeConstructor.kt */
final class CapturedTypeConstructorKt$createCapturedIfNeeded$1 extends Lambda implements a<w> {
    final /* synthetic */ ap $this_createCapturedIfNeeded;

    CapturedTypeConstructorKt$createCapturedIfNeeded$1(ap apVar) {
        this.$this_createCapturedIfNeeded = apVar;
        super(0);
    }

    /* renamed from: bxc */
    public final w invoke() {
        w bpT = this.$this_createCapturedIfNeeded.bpT();
        i.e(bpT, "this@createCapturedIfNeeded.type");
        return bpT;
    }
}
