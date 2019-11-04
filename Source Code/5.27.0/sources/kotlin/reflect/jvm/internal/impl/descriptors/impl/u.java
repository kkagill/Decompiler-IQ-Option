package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;

/* compiled from: ModuleDescriptorImpl.kt */
public final class u implements t {
    private final Set<v> ffA;
    private final List<v> ffB;
    private final List<v> ffz;

    public u(List<v> list, Set<v> set, List<v> list2) {
        i.f(list, "allDependencies");
        i.f(set, "modulesWhoseInternalsAreVisible");
        i.f(list2, "expectedByDependencies");
        this.ffz = list;
        this.ffA = set;
        this.ffB = list2;
    }

    public List<v> buJ() {
        return this.ffz;
    }

    public Set<v> buK() {
        return this.ffA;
    }

    public List<v> buL() {
        return this.ffB;
    }
}
