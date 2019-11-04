package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;

/* compiled from: LazyJavaPackageFragment.kt */
final class LazyJavaPackageFragment$partToFacade$2 extends Lambda implements a<HashMap<c, c>> {
    final /* synthetic */ h this$0;

    LazyJavaPackageFragment$partToFacade$2(h hVar) {
        this.this$0 = hVar;
        super(0);
    }

    /* renamed from: aig */
    public final HashMap<c, c> invoke() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.this$0.bwH().entrySet()) {
            String str = (String) entry.getKey();
            n nVar = (n) entry.getValue();
            c mH = c.mH(str);
            i.e(mH, "JvmClassName.byInternalName(partInternalName)");
            KotlinClassHeader bqj = nVar.bqj();
            int i = i.aob[bqj.byV().ordinal()];
            if (i == 1) {
                Map map = hashMap;
                String byS = bqj.byS();
                if (byS != null) {
                    c mH2 = c.mH(byS);
                    i.e(mH2, "JvmClassName.byInternalN…: continue@kotlinClasses)");
                    map.put(mH, mH2);
                }
            } else if (i == 2) {
                hashMap.put(mH, mH);
            }
        }
        return hashMap;
    }
}
