package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ag;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.b;
import kotlin.reflect.jvm.internal.r.d;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "R", "invoke"})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImpl$Setter$descriptor$2 extends Lambda implements a<ag> {
    final /* synthetic */ d this$0;

    KPropertyImpl$Setter$descriptor$2(d dVar) {
        this.this$0 = dVar;
        super(0);
    }

    /* renamed from: bpQ */
    public final ag invoke() {
        ag btH = this.this$0.bpg().box().btH();
        return btH != null ? btH : b.a(this.this$0.bpg().box(), f.fdA.bug(), f.fdA.bug());
    }
}
