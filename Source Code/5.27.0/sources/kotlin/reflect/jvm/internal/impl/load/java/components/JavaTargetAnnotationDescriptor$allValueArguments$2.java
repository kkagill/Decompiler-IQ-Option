package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.j;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.structure.b;
import kotlin.reflect.jvm.internal.impl.load.java.structure.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.m;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;

/* compiled from: JavaAnnotationMapper.kt */
final class JavaTargetAnnotationDescriptor$allValueArguments$2 extends Lambda implements a<Map<f, ? extends g<?>>> {
    final /* synthetic */ i this$0;

    JavaTargetAnnotationDescriptor$allValueArguments$2(i iVar) {
        this.this$0 = iVar;
        super(0);
    }

    /* renamed from: aAU */
    public final Map<f, g<?>> invoke() {
        b bvJ = this.this$0.bvJ();
        Map<f, g<?>> map = null;
        Object ch = bvJ instanceof e ? d.fig.ch(((e) this.this$0.bvJ()).bxj()) : bvJ instanceof m ? d.fig.ch(l.listOf(this.this$0.bvJ())) : null;
        if (ch != null) {
            map = ae.m(j.x(c.fic.bvL(), ch));
        }
        return map != null ? map : af.emptyMap();
    }
}
