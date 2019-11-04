package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: JavaTypeResolver.kt */
final class JavaTypeResolver$computeArguments$$inlined$map$lambda$1 extends Lambda implements a<w> {
    final /* synthetic */ a $attr$inlined;
    final /* synthetic */ an $constructor$inlined;
    final /* synthetic */ boolean $isRaw$inlined;
    final /* synthetic */ ao $parameter;
    final /* synthetic */ b this$0;

    /* compiled from: JavaTypeResolver.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeArguments$$inlined$map$lambda$1$1 */
    static final class AnonymousClass1 extends Lambda implements a<w> {
        final /* synthetic */ JavaTypeResolver$computeArguments$$inlined$map$lambda$1 this$0;

        AnonymousClass1(JavaTypeResolver$computeArguments$$inlined$map$lambda$1 javaTypeResolver$computeArguments$$inlined$map$lambda$1) {
            this.this$0 = javaTypeResolver$computeArguments$$inlined$map$lambda$1;
            super(0);
        }

        /* renamed from: bxc */
        public final w invoke() {
            f brQ = this.this$0.$constructor$inlined.brQ();
            if (brQ == null) {
                i.bnJ();
            }
            i.e(brQ, "constructor.declarationDescriptor!!");
            ad bsY = brQ.bsY();
            i.e(bsY, "constructor.declarationDescriptor!!.defaultType");
            return kotlin.reflect.jvm.internal.impl.types.b.a.bq(bsY);
        }
    }

    JavaTypeResolver$computeArguments$$inlined$map$lambda$1(ao aoVar, b bVar, a aVar, an anVar, boolean z) {
        this.$parameter = aoVar;
        this.this$0 = bVar;
        this.$attr$inlined = aVar;
        this.$constructor$inlined = anVar;
        this.$isRaw$inlined = z;
        super(0);
    }

    /* renamed from: bxc */
    public final w invoke() {
        ao aoVar = this.$parameter;
        i.e(aoVar, "parameter");
        return c.a(aoVar, this.$attr$inlined.bxb(), (a) new AnonymousClass1(this));
    }
}
