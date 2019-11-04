package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.j;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;

/* compiled from: JavaAnnotationMapper.kt */
final class JavaRetentionAnnotationDescriptor$allValueArguments$2 extends Lambda implements a<Map<f, ? extends g<?>>> {
    final /* synthetic */ h this$0;

    JavaRetentionAnnotationDescriptor$allValueArguments$2(h hVar) {
        this.this$0 = hVar;
        super(0);
    }

    /* renamed from: aAU */
    public final Map<f, g<?>> invoke() {
        g a = d.fig.a(this.this$0.bvJ());
        Map<f, g<?>> m = a != null ? ae.m(j.x(c.fic.bvM(), a)) : null;
        return m != null ? m : af.emptyMap();
    }
}
