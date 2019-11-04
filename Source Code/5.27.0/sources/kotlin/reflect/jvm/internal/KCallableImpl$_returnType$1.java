package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.w;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "R", "invoke"})
/* compiled from: KCallableImpl.kt */
final class KCallableImpl$_returnType$1 extends Lambda implements a<t> {
    final /* synthetic */ e this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Ljava/lang/reflect/Type;", "R", "invoke"})
    /* compiled from: KCallableImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1$1 */
    static final class AnonymousClass1 extends Lambda implements a<Type> {
        final /* synthetic */ KCallableImpl$_returnType$1 this$0;

        AnonymousClass1(KCallableImpl$_returnType$1 kCallableImpl$_returnType$1) {
            this.this$0 = kCallableImpl$_returnType$1;
            super(0);
        }

        /* renamed from: boG */
        public final Type invoke() {
            Type c = this.this$0.this$0.boC();
            return c != null ? c : this.this$0.this$0.boy().bpZ();
        }
    }

    KCallableImpl$_returnType$1(e eVar) {
        this.this$0 = eVar;
        super(0);
    }

    /* renamed from: boF */
    public final t invoke() {
        w bsN = this.this$0.box().bsN();
        if (bsN == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(bsN, "descriptor.returnType!!");
        return new t(bsN, new AnonymousClass1(this));
    }
}
