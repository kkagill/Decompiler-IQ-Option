package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.j;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;

/* compiled from: LazyJavaPackageFragment.kt */
final class LazyJavaPackageFragment$binaryClasses$2 extends Lambda implements a<Map<String, ? extends n>> {
    final /* synthetic */ h this$0;

    LazyJavaPackageFragment$binaryClasses$2(h hVar) {
        this.this$0 = hVar;
        super(0);
    }

    /* renamed from: aAU */
    public final Map<String, n> invoke() {
        t bvZ = this.this$0.fiV.bwl().bvZ();
        String boi = this.this$0.btB().boi();
        i.e(boi, "fqName.asString()");
        Iterable<String> lP = bvZ.lP(boi);
        Collection arrayList = new ArrayList();
        for (String str : lP) {
            c mH = c.mH(str);
            i.e(mH, "JvmClassName.byInternalName(partName)");
            kotlin.reflect.jvm.internal.impl.name.a s = kotlin.reflect.jvm.internal.impl.name.a.s(mH.bNm());
            i.e(s, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
            n a = m.a(this.this$0.fiV.bwl().bvR(), s);
            Object x = a != null ? j.x(str, a) : null;
            if (x != null) {
                arrayList.add(x);
            }
        }
        return af.ac((List) arrayList);
    }
}
