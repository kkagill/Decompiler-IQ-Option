package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: AbstractClassTypeConstructor */
public abstract class b extends c implements an {
    private int hashCode;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0046  */
    private static /* synthetic */ void $$$reportNull$$$0(int r9) {
        /*
        r0 = 4;
        r1 = 3;
        r2 = 1;
        if (r9 == r2) goto L_0x000c;
    L_0x0005:
        if (r9 == r1) goto L_0x000c;
    L_0x0007:
        if (r9 == r0) goto L_0x000c;
    L_0x0009:
        r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        goto L_0x000e;
    L_0x000c:
        r3 = "@NotNull method %s.%s must not return null";
    L_0x000e:
        r4 = 2;
        if (r9 == r2) goto L_0x0017;
    L_0x0011:
        if (r9 == r1) goto L_0x0017;
    L_0x0013:
        if (r9 == r0) goto L_0x0017;
    L_0x0015:
        r5 = 3;
        goto L_0x0018;
    L_0x0017:
        r5 = 2;
    L_0x0018:
        r5 = new java.lang.Object[r5];
        r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        r7 = 0;
        if (r9 == r2) goto L_0x0030;
    L_0x001f:
        if (r9 == r4) goto L_0x002b;
    L_0x0021:
        if (r9 == r1) goto L_0x0030;
    L_0x0023:
        if (r9 == r0) goto L_0x0030;
    L_0x0025:
        r8 = "storageManager";
        r5[r7] = r8;
        goto L_0x0032;
    L_0x002b:
        r8 = "descriptor";
        r5[r7] = r8;
        goto L_0x0032;
    L_0x0030:
        r5[r7] = r6;
    L_0x0032:
        if (r9 == r2) goto L_0x0040;
    L_0x0034:
        if (r9 == r1) goto L_0x003b;
    L_0x0036:
        if (r9 == r0) goto L_0x003b;
    L_0x0038:
        r5[r2] = r6;
        goto L_0x0044;
    L_0x003b:
        r6 = "getAdditionalNeighboursInSupertypeGraph";
        r5[r2] = r6;
        goto L_0x0044;
    L_0x0040:
        r6 = "getBuiltIns";
        r5[r2] = r6;
    L_0x0044:
        if (r9 == r2) goto L_0x0055;
    L_0x0046:
        if (r9 == r4) goto L_0x0051;
    L_0x0048:
        if (r9 == r1) goto L_0x0055;
    L_0x004a:
        if (r9 == r0) goto L_0x0055;
    L_0x004c:
        r6 = "<init>";
        r5[r4] = r6;
        goto L_0x0055;
    L_0x0051:
        r6 = "hasMeaningfulFqName";
        r5[r4] = r6;
    L_0x0055:
        r3 = java.lang.String.format(r3, r5);
        if (r9 == r2) goto L_0x0065;
    L_0x005b:
        if (r9 == r1) goto L_0x0065;
    L_0x005d:
        if (r9 == r0) goto L_0x0065;
    L_0x005f:
        r9 = new java.lang.IllegalArgumentException;
        r9.<init>(r3);
        goto L_0x006a;
    L_0x0065:
        r9 = new java.lang.IllegalStateException;
        r9.<init>(r3);
    L_0x006a:
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.b.$$$reportNull$$$0(int):void");
    }

    /* renamed from: brR */
    public abstract d brQ();

    public b(h hVar) {
        if (hVar == null) {
            $$$reportNull$$$0(0);
        }
        super(hVar);
        this.hashCode = 0;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        d brR = brQ();
        if (d(brR)) {
            i = c.w(brR).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.hashCode = i;
        return i;
    }

    public g btw() {
        g Q = a.Q(brQ());
        if (Q == null) {
            $$$reportNull$$$0(1);
        }
        return Q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an) || obj.hashCode() != hashCode()) {
            return false;
        }
        an anVar = (an) obj;
        if (anVar.getParameters().size() != getParameters().size()) {
            return false;
        }
        d brR = brQ();
        f brQ = anVar.brQ();
        if (d(brR) && ((brQ == null || d(brQ)) && (brQ instanceof d))) {
            return e(brR, (d) brQ);
        }
        return false;
    }

    private static boolean e(d dVar, d dVar2) {
        if (!dVar.bsZ().equals(dVar2.bsZ())) {
            return false;
        }
        k brj = dVar.brj();
        k brj2 = dVar2.brj();
        while (true) {
            boolean z = true;
            if (brj == null || brj2 == null) {
                return true;
            }
            if (brj instanceof v) {
                return brj2 instanceof v;
            }
            if (brj2 instanceof v) {
                return false;
            }
            if (brj instanceof y) {
                if (!((brj2 instanceof y) && ((y) brj).btB().equals(((y) brj2).btB()))) {
                    z = false;
                }
                return z;
            } else if ((brj2 instanceof y) || !brj.bsZ().equals(brj2.bsZ())) {
                return false;
            } else {
                brj = brj.brj();
                brj2 = brj2.brj();
            }
        }
        return true;
    }

    private static boolean d(f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(2);
        }
        return (p.Y(fVar) || c.u(fVar)) ? false : true;
    }

    /* Access modifiers changed, original: protected */
    public Collection<w> hc(boolean z) {
        k brj = brQ().brj();
        if (brj instanceof d) {
            kotlin.reflect.jvm.internal.impl.utils.h hVar = new kotlin.reflect.jvm.internal.impl.utils.h();
            d dVar = (d) brj;
            hVar.add(dVar.bsY());
            dVar = dVar.brq();
            if (z && dVar != null) {
                hVar.add(dVar.bsY());
            }
            return hVar;
        }
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(3);
        }
        return emptyList;
    }

    /* Access modifiers changed, original: protected */
    public w bus() {
        if (g.e(brQ())) {
            return null;
        }
        return btw().bqM();
    }
}
