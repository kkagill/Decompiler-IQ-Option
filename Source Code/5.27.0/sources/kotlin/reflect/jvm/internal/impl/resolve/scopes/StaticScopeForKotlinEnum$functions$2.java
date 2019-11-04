package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.resolve.b;

/* compiled from: StaticScopeForKotlinEnum.kt */
final class StaticScopeForKotlinEnum$functions$2 extends Lambda implements a<List<? extends ai>> {
    final /* synthetic */ k this$0;

    StaticScopeForKotlinEnum$functions$2(k kVar) {
        this.this$0 = kVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<ai> invoke() {
        return m.listOf(b.H(this.this$0.fuw), b.G(this.this$0.fuw));
    }
}
