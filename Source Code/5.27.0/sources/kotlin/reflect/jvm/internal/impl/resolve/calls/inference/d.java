package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.h;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.z;

/* compiled from: CapturedTypeConstructor.kt */
public final class d {

    /* compiled from: CapturedTypeConstructor.kt */
    public static final class a extends h {
        final /* synthetic */ as ftx;
        final /* synthetic */ boolean fty;

        a(as asVar, boolean z, as asVar2) {
            this.ftx = asVar;
            this.fty = z;
            super(asVar2);
        }

        public boolean bNd() {
            return this.fty;
        }

        public ap Y(w wVar) {
            i.f(wVar, "key");
            ap Y = super.Y(wVar);
            if (Y == null) {
                return null;
            }
            f brQ = wVar.bMZ().brQ();
            if (!(brQ instanceof ao)) {
                brQ = null;
            }
            return d.a(Y, (ao) brQ);
        }
    }

    public static final w c(ap apVar) {
        i.f(apVar, "typeProjection");
        return new a(apVar, null, false, null, 14, null);
    }

    public static final boolean as(w wVar) {
        i.f(wVar, "$this$isCaptured");
        return wVar.bMZ() instanceof b;
    }

    public static /* synthetic */ as a(as asVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return a(asVar, z);
    }

    public static final as a(as asVar, boolean z) {
        i.f(asVar, "$this$wrapWithCapturingSubstitution");
        if (!(asVar instanceof u)) {
            return new a(asVar, z, asVar);
        }
        u uVar = (u) asVar;
        ao[] bPx = uVar.bPx();
        Iterable<Pair> c = i.c((Object[]) uVar.bPy(), (Object[]) uVar.bPx());
        Collection arrayList = new ArrayList(n.e(c, 10));
        for (Pair pair : c) {
            arrayList.add(a((ap) pair.getFirst(), (ao) pair.bni()));
        }
        Object[] toArray = ((List) arrayList).toArray(new ap[0]);
        if (toArray != null) {
            return new u(bPx, (ap[]) toArray, z);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private static final ap a(ap apVar, ao aoVar) {
        if (aoVar == null || apVar.bPD() == Variance.INVARIANT) {
            return apVar;
        }
        if (aoVar.bta() != apVar.bPD()) {
            return new ar(c(apVar));
        }
        ap arVar;
        if (apVar.bPC()) {
            kotlin.reflect.jvm.internal.impl.storage.h hVar = LockBasedStorageManager.fwt;
            i.e(hVar, "LockBasedStorageManager.NO_LOCKS");
            arVar = new ar(new z(hVar, new CapturedTypeConstructorKt$createCapturedIfNeeded$1(apVar)));
        } else {
            arVar = new ar(apVar.bpT());
        }
        return arVar;
    }
}
