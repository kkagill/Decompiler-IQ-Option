package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.n;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.e;

/* compiled from: LazyJavaClassMemberScope.kt */
final class LazyJavaClassMemberScope$nestedClasses$1 extends Lambda implements b<f, g> {
    final /* synthetic */ h $c;
    final /* synthetic */ g this$0;

    LazyJavaClassMemberScope$nestedClasses$1(g gVar, h hVar) {
        this.this$0 = gVar;
        this.$c = hVar;
        super(1);
    }

    /* renamed from: y */
    public final g invoke(f fVar) {
        f fVar2 = fVar;
        i.f(fVar2, ConditionalUserProperty.NAME);
        n nVar = null;
        if (((Set) this.this$0.fjG.invoke()).contains(fVar2)) {
            f fVar3;
            kotlin.reflect.jvm.internal.impl.load.java.h bvQ = this.$c.bwl().bvQ();
            a c = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.c(this.this$0.bwF());
            if (c == null) {
                i.bnJ();
            }
            c = c.B(fVar2);
            i.e(c, "ownerDescriptor.classId!…createNestedClassId(name)");
            kotlin.reflect.jvm.internal.impl.load.java.structure.g a = bvQ.a(new kotlin.reflect.jvm.internal.impl.load.java.h.a(c, null, this.this$0.fjm, 2, null));
            if (a != null) {
                f fVar4 = new f(this.$c, this.this$0.bwF(), a, null, 8, null);
                this.$c.bwl().bwe().a(fVar4);
            } else {
                fVar3 = null;
            }
            return fVar3;
        }
        kotlin.reflect.jvm.internal.impl.load.java.structure.n nVar2 = (kotlin.reflect.jvm.internal.impl.load.java.structure.n) ((Map) this.this$0.fjH.invoke()).get(fVar2);
        if (nVar2 != null) {
            e f = this.$c.bqz().f(new LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(this));
            nVar = n.a(this.$c.bqz(), this.this$0.bwF(), fVar, f, kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(this.$c, nVar2), this.$c.bwl().bvX().a(nVar2));
        }
        return nVar;
    }
}
