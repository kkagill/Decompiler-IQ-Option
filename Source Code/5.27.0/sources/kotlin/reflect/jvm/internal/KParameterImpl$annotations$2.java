package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "", "invoke"})
/* compiled from: KParameterImpl.kt */
final class KParameterImpl$annotations$2 extends Lambda implements a<List<? extends Annotation>> {
    final /* synthetic */ n this$0;

    KParameterImpl$annotations$2(n nVar) {
        this.this$0 = nVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<Annotation> invoke() {
        return ae.a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) this.this$0.bpw());
    }
}
