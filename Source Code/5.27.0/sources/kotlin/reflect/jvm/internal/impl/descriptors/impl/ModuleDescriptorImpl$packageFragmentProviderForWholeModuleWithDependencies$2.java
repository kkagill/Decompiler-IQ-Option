package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.z;

/* compiled from: ModuleDescriptorImpl.kt */
final class ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 extends Lambda implements a<i> {
    final /* synthetic */ v this$0;

    ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2(v vVar) {
        this.this$0 = vVar;
        super(0);
    }

    /* renamed from: buQ */
    public final i invoke() {
        t b = this.this$0.ffD;
        StringBuilder stringBuilder;
        if (b != null) {
            List buJ = b.buJ();
            boolean contains = buJ.contains(this.this$0);
            if (!m.eVC || contains) {
                Iterable<v> iterable = buJ;
                for (v vVar : iterable) {
                    boolean d = vVar.isInitialized();
                    if (m.eVC) {
                        if (!d) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Dependency module ");
                            stringBuilder.append(vVar.getId());
                            stringBuilder.append(" was not initialized by the time contents of dependent module ");
                            stringBuilder.append(this.this$0.getId());
                            stringBuilder.append(" were queried");
                            throw new AssertionError(stringBuilder.toString());
                        }
                    }
                }
                Collection arrayList = new ArrayList(n.e(iterable, 10));
                for (v vVar2 : iterable) {
                    z e = vVar2.ffE;
                    if (e == null) {
                        i.bnJ();
                    }
                    arrayList.add(e);
                }
                return new i((List) arrayList);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Module ");
            stringBuilder.append(this.this$0.getId());
            stringBuilder.append(" is not contained in his own dependencies, this is probably a misconfiguration");
            throw new AssertionError(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Dependencies of module ");
        stringBuilder.append(this.this$0.getId());
        stringBuilder.append(" were not set before querying module content");
        throw new AssertionError(stringBuilder.toString());
    }
}
