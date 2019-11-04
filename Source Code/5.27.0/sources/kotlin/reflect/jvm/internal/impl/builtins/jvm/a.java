package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.e;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: CloneableClassScope.kt */
public final class a extends e {
    private static final f fbK;
    public static final a fbL = new a();

    /* compiled from: CloneableClassScope.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f brX() {
            return a.fbK;
        }
    }

    public a(h hVar, d dVar) {
        i.f(hVar, "storageManager");
        i.f(dVar, "containingClass");
        super(hVar, dVar);
    }

    /* Access modifiers changed, original: protected */
    public List<s> brU() {
        ad a = ad.a((k) bNL(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), fbK, Kind.DECLARATION, aj.fcV);
        a.a(null, bNL().bte(), m.emptyList(), m.emptyList(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(bNL()).bqM(), Modality.OPEN, av.fdc);
        return l.listOf(a);
    }

    static {
        f ms = f.ms("clone");
        i.e(ms, "Name.identifier(\"clone\")");
        fbK = ms;
    }
}
