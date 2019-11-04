package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.components.e;
import kotlin.reflect.jvm.internal.components.j;
import kotlin.reflect.jvm.internal.impl.descriptors.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.name.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PackageViewDescriptor;", "invoke"})
/* compiled from: KPackageImpl.kt */
final class KPackageImpl$Data$descriptor$2 extends Lambda implements a<aa> {
    final /* synthetic */ a this$0;

    KPackageImpl$Data$descriptor$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: bps */
    public final aa invoke() {
        j boZ = this.this$0.boZ();
        e a = this.this$0.bpp();
        if (a != null) {
            String a2 = ae.a(a);
            if (a2 != null) {
                boZ.bqn().lO(a2);
            }
        }
        v bql = boZ.bql();
        b packageFqName = kotlin.reflect.jvm.internal.structure.b.U(m.this.bnC()).getPackageFqName();
        kotlin.jvm.internal.i.e(packageFqName, "jClass.classId.packageFqName");
        return bql.f(packageFqName);
    }
}
