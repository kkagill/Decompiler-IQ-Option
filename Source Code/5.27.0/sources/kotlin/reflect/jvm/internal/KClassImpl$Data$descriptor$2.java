package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.components.j;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.r;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "T", "", "invoke"})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$descriptor$2 extends Lambda implements a<d> {
    final /* synthetic */ g.a this$0;

    KClassImpl$Data$descriptor$2(g.a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: boT */
    public final d invoke() {
        d m;
        kotlin.reflect.jvm.internal.impl.name.a a = g.this.getClassId();
        j boZ = ((g.a) g.this.boH().invoke()).boZ();
        if (a.bJW()) {
            m = boZ.bqm().m(a);
        } else {
            m = r.a(boZ.bql(), a);
        }
        if (m != null) {
            return m;
        }
        g.this.boL();
        throw null;
    }
}
