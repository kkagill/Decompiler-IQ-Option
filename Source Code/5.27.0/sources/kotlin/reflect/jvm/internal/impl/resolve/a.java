package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.a.m;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.types.an;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
public final class a {
    public static final a fsJ = new a();

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class a implements kotlin.reflect.jvm.internal.impl.types.checker.b.a {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a fsL;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a fsM;

        a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            this.fsL = aVar;
            this.fsM = aVar2;
        }

        /* renamed from: b */
        public final boolean a(an anVar, an anVar2) {
            i.f(anVar, "c1");
            i.f(anVar2, "c2");
            if (i.y(anVar, anVar2)) {
                return true;
            }
            f brQ = anVar.brQ();
            f brQ2 = anVar2.brQ();
            return ((brQ instanceof ao) && (brQ2 instanceof ao)) ? a.fsJ.a((ao) brQ, (ao) brQ2, (m) new DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1(this)) : false;
        }
    }

    private a() {
    }

    public final boolean d(k kVar, k kVar2) {
        if ((kVar instanceof d) && (kVar2 instanceof d)) {
            return b((d) kVar, (d) kVar2);
        }
        if ((kVar instanceof ao) && (kVar2 instanceof ao)) {
            return a(this, (ao) kVar, (ao) kVar2, null, 4, null);
        } else if ((kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (kVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            return a(this, (kotlin.reflect.jvm.internal.impl.descriptors.a) kVar, (kotlin.reflect.jvm.internal.impl.descriptors.a) kVar2, false, 4, null);
        } else if ((kVar instanceof y) && (kVar2 instanceof y)) {
            return i.y(((y) kVar).btB(), ((y) kVar2).btB());
        } else {
            return i.y(kVar, kVar2);
        }
    }

    private final boolean b(d dVar, d dVar2) {
        return i.y(dVar.brm(), dVar2.brm());
    }

    private final boolean a(ao aoVar, ao aoVar2, m<? super k, ? super k, Boolean> mVar) {
        boolean z = true;
        if (i.y(aoVar, aoVar2)) {
            return true;
        }
        if (i.y(aoVar.brj(), aoVar2.brj()) || !a((k) aoVar, (k) aoVar2, (m) mVar)) {
            return false;
        }
        if (aoVar.getIndex() != aoVar2.getIndex()) {
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Missing block: B:19:0x0082, code skipped:
            if (r8.bMV() == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) goto L_0x0086;
     */
    public final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.a r8, kotlin.reflect.jvm.internal.impl.descriptors.a r9, boolean r10) {
        /*
        r7 = this;
        r0 = "a";
        kotlin.jvm.internal.i.f(r8, r0);
        r0 = "b";
        kotlin.jvm.internal.i.f(r9, r0);
        r0 = kotlin.jvm.internal.i.y(r8, r9);
        r1 = 1;
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r0 = r8.bsZ();
        r2 = r9.bsZ();
        r0 = kotlin.jvm.internal.i.y(r0, r2);
        r0 = r0 ^ r1;
        r2 = 0;
        if (r0 == 0) goto L_0x0023;
    L_0x0022:
        return r2;
    L_0x0023:
        r0 = r8.brj();
        r3 = r9.brj();
        r0 = kotlin.jvm.internal.i.y(r0, r3);
        if (r0 == 0) goto L_0x0032;
    L_0x0031:
        return r2;
    L_0x0032:
        r0 = r8;
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r0;
        r3 = kotlin.reflect.jvm.internal.impl.resolve.c.u(r0);
        if (r3 != 0) goto L_0x0087;
    L_0x003b:
        r3 = r9;
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r3;
        r4 = kotlin.reflect.jvm.internal.impl.resolve.c.u(r3);
        if (r4 == 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0087;
    L_0x0045:
        r4 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1.fsK;
        r4 = (kotlin.jvm.a.m) r4;
        r0 = r7.a(r0, r3, r4);
        if (r0 != 0) goto L_0x0050;
    L_0x004f:
        return r2;
    L_0x0050:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.a$a;
        r0.<init>(r8, r9);
        r0 = (kotlin.reflect.jvm.internal.impl.types.checker.b.a) r0;
        r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.a(r0);
        r3 = "OverridingUtil.createWit…= a && y == b})\n        }";
        kotlin.jvm.internal.i.e(r0, r3);
        r3 = r10 ^ 1;
        r4 = 0;
        r3 = r0.a(r8, r9, r4, r3);
        r5 = "overridingUtil.isOverrid… null, !ignoreReturnType)";
        kotlin.jvm.internal.i.e(r3, r5);
        r3 = r3.bMV();
        r6 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (r3 != r6) goto L_0x0085;
    L_0x0074:
        r10 = r10 ^ r1;
        r8 = r0.a(r9, r8, r4, r10);
        kotlin.jvm.internal.i.e(r8, r5);
        r8 = r8.bMV();
        r9 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (r8 != r9) goto L_0x0085;
    L_0x0084:
        goto L_0x0086;
    L_0x0085:
        r1 = 0;
    L_0x0086:
        return r1;
    L_0x0087:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.a.a(kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a, boolean):boolean");
    }

    private final boolean a(k kVar, k kVar2, m<? super k, ? super k, Boolean> mVar) {
        kVar = kVar.brj();
        kVar2 = kVar2.brj();
        if ((kVar instanceof CallableMemberDescriptor) || (kVar2 instanceof CallableMemberDescriptor)) {
            return ((Boolean) mVar.w(kVar, kVar2)).booleanValue();
        }
        return d(kVar, kVar2);
    }
}
