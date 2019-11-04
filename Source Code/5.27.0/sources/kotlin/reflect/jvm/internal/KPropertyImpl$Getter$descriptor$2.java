package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.af;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.b;
import kotlin.reflect.jvm.internal.r.c;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "R", "invoke"})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImpl$Getter$descriptor$2 extends Lambda implements a<af> {
    final /* synthetic */ c this$0;

    KPropertyImpl$Getter$descriptor$2(c cVar) {
        this.this$0 = cVar;
        super(0);
    }

    /* renamed from: bpO */
    public final af invoke() {
        af btG = this.this$0.bpg().box().btG();
        return btG != null ? btG : b.a(this.this$0.bpg().box(), f.fdA.bug());
    }
}
