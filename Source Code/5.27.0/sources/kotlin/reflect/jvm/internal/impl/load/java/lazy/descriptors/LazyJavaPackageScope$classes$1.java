package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.b.c;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.l.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;

/* compiled from: LazyJavaPackageScope.kt */
final class LazyJavaPackageScope$classes$1 extends Lambda implements b<a, d> {
    final /* synthetic */ h $c;
    final /* synthetic */ j this$0;

    LazyJavaPackageScope$classes$1(j jVar, h hVar) {
        this.this$0 = jVar;
        this.$c = hVar;
        super(1);
    }

    /* renamed from: a */
    public final d invoke(a aVar) {
        a a;
        i.f(aVar, "request");
        kotlin.reflect.jvm.internal.impl.name.a aVar2 = new kotlin.reflect.jvm.internal.impl.name.a(this.this$0.bwF().btB(), aVar.bsZ());
        if (aVar.bwL() != null) {
            a = this.$c.bwl().bvR().a(aVar.bwL());
        } else {
            a = this.$c.bwl().bvR().a(aVar2);
        }
        d dVar = null;
        n byI = a != null ? a.byI() : null;
        kotlin.reflect.jvm.internal.impl.name.a classId = byI != null ? byI.getClassId() : null;
        if (classId != null && (classId.bJY() || classId.bJW())) {
            return null;
        }
        b a2 = this.this$0.a(byI);
        if (a2 instanceof b.a) {
            dVar = ((b.a) a2).boI();
        } else if (!(a2 instanceof c)) {
            if (a2 instanceof b.b) {
                g bwL = aVar.bwL();
                if (bwL == null) {
                    byte[] byJ;
                    kotlin.reflect.jvm.internal.impl.load.java.h bvQ = this.$c.bwl().bvQ();
                    if (a != null) {
                        if (!(a instanceof a.a)) {
                            a = null;
                        }
                        a.a aVar3 = (a.a) a;
                        if (aVar3 != null) {
                            byJ = aVar3.byJ();
                            bwL = bvQ.a(new kotlin.reflect.jvm.internal.impl.load.java.h.a(aVar2, byJ, null, 4, null));
                        }
                    }
                    byJ = null;
                    bwL = bvQ.a(new kotlin.reflect.jvm.internal.impl.load.java.h.a(aVar2, byJ, null, 4, null));
                }
                g gVar = bwL;
                if ((gVar != null ? gVar.bxo() : null) != LightClassOriginKind.BINARY) {
                    f fVar;
                    kotlin.reflect.jvm.internal.impl.name.b btB = gVar != null ? gVar.btB() : null;
                    if (btB == null || btB.isRoot() || (i.y(btB.bKb(), this.this$0.bwF().btB()) ^ 1) != 0) {
                        fVar = null;
                    } else {
                        f fVar2 = new f(this.$c, this.this$0.bwF(), gVar, null, 8, null);
                        this.$c.bwl().bwe().a(fVar2);
                    }
                    dVar = fVar;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Couldn't find kotlin binary class for light class created by kotlin binary file\n");
                    stringBuilder.append("JavaClass: ");
                    stringBuilder.append(gVar);
                    stringBuilder.append(10);
                    stringBuilder.append("ClassId: ");
                    stringBuilder.append(aVar2);
                    stringBuilder.append(10);
                    stringBuilder.append("findKotlinClass(JavaClass) = ");
                    stringBuilder.append(m.a(this.$c.bwl().bvR(), gVar));
                    stringBuilder.append(10);
                    stringBuilder.append("findKotlinClass(ClassId) = ");
                    stringBuilder.append(m.a(this.$c.bwl().bvR(), aVar2));
                    stringBuilder.append(10);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            throw new NoWhenBranchMatchedException();
        }
        return dVar;
    }
}
