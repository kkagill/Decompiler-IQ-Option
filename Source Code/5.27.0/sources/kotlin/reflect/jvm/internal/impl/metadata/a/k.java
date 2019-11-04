package kotlin.reflect.jvm.internal.impl.metadata.a;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable;

/* compiled from: VersionRequirement.kt */
public final class k {
    private static final k fom = new k(m.emptyList());
    public static final a fon = new a();
    private final List<VersionRequirement> fol;

    /* compiled from: VersionRequirement.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final k bHs() {
            return k.fom;
        }

        public final k g(VersionRequirementTable versionRequirementTable) {
            i.f(versionRequirementTable, "table");
            if (versionRequirementTable.bHe() == 0) {
                return bHs();
            }
            List bHd = versionRequirementTable.bHd();
            i.e(bHd, "table.requirementList");
            return new k(bHd, null);
        }
    }

    private k(List<VersionRequirement> list) {
        this.fol = list;
    }

    public /* synthetic */ k(List list, f fVar) {
        this(list);
    }

    public final VersionRequirement lH(int i) {
        return (VersionRequirement) u.h(this.fol, i);
    }
}
