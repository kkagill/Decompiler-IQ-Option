package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* compiled from: TypeAliasConstructorDescriptor.kt */
final class TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2 extends Lambda implements a<ag> {
    final /* synthetic */ c $underlyingConstructorDescriptor;
    final /* synthetic */ ag this$0;

    TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(ag agVar, c cVar) {
        this.this$0 = agVar;
        this.$underlyingConstructorDescriptor = cVar;
        super(0);
    }

    /* renamed from: bvg */
    public final ag invoke() {
        h bqz = this.this$0.bqz();
        an bvf = this.this$0.bvf();
        c cVar = this.$underlyingConstructorDescriptor;
        af afVar = this.this$0;
        f brE = cVar.brE();
        Kind bsT = this.$underlyingConstructorDescriptor.bsT();
        i.e(bsT, "underlyingConstructorDescriptor.kind");
        aj brF = this.this$0.bvf().brF();
        i.e(brF, "typeAliasDescriptor.source");
        ag agVar = new ag(bqz, bvf, cVar, afVar, brE, bsT, brF, null);
        TypeSubstitutor a = ag.fgd.a(this.this$0.bvf());
        if (a == null) {
            return null;
        }
        ah bsL = this.$underlyingConstructorDescriptor.bsL();
        agVar.a(null, bsL != null ? bsL.e(a) : null, this.this$0.bvf().brI(), this.this$0.bsP(), this.this$0.bsN(), Modality.FINAL, this.this$0.bvf().brx());
        return agVar;
    }
}
