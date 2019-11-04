package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.af;
import kotlin.reflect.jvm.internal.impl.descriptors.ag;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.m;
import kotlin.reflect.jvm.internal.impl.load.java.q;
import kotlin.reflect.jvm.internal.impl.load.java.r;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class g extends k {
    private final e<List<c>> fjF;
    private final e<Set<f>> fjG;
    private final e<Map<f, n>> fjH;
    private final kotlin.reflect.jvm.internal.impl.storage.c<f, kotlin.reflect.jvm.internal.impl.descriptors.impl.g> fjI;
    private final d fjJ;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.g fjm;

    /* Access modifiers changed, original: protected */
    /* renamed from: bwE */
    public d bwF() {
        return this.fjJ;
    }

    public g(h hVar, d dVar, kotlin.reflect.jvm.internal.impl.load.java.structure.g gVar) {
        i.f(hVar, "c");
        i.f(dVar, "ownerDescriptor");
        i.f(gVar, "jClass");
        super(hVar);
        this.fjJ = dVar;
        this.fjm = gVar;
        this.fjF = hVar.bqz().f(new LazyJavaClassMemberScope$constructors$1(this, hVar));
        this.fjG = hVar.bqz().f(new LazyJavaClassMemberScope$nestedClassIndex$1(this));
        this.fjH = hVar.bqz().f(new LazyJavaClassMemberScope$enumEntryIndex$1(this));
        this.fjI = hVar.bqz().r(new LazyJavaClassMemberScope$nestedClasses$1(this, hVar));
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bwA */
    public a bwB() {
        return new a(this.fjm, LazyJavaClassMemberScope$computeMemberIndex$1.fjK);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: b */
    public HashSet<f> c(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, b<? super f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        an brm = bwF().brm();
        i.e(brm, "ownerDescriptor.typeConstructor");
        Collection<w> bup = brm.bup();
        i.e(bup, "ownerDescriptor.typeConstructor.supertypes");
        Collection hashSet = new HashSet();
        for (w bsF : bup) {
            r.a(hashSet, (Iterable) bsF.bsF().bux());
        }
        HashSet hashSet2 = (HashSet) hashSet;
        hashSet2.addAll(((b) bwM().invoke()).bwq());
        hashSet2.addAll(d(dVar, (b) bVar));
        return hashSet2;
    }

    public final e<List<c>> bwC() {
        return this.fjF;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(JavaMethodDescriptor javaMethodDescriptor) {
        i.f(javaMethodDescriptor, "$this$isVisibleAsFunction");
        if (this.fjm.bxn()) {
            return false;
        }
        return d((ai) javaMethodDescriptor);
    }

    private final boolean d(ai aiVar) {
        Object obj;
        f bsZ = aiVar.bsZ();
        i.e(bsZ, "function.name");
        Iterable<f> q = q.q(bsZ);
        boolean z = true;
        if (!((q instanceof Collection) && ((Collection) q).isEmpty())) {
            for (f x : q) {
                Object obj2;
                Iterable<ae> x2 = x(x);
                if (!((x2 instanceof Collection) && ((Collection) x2).isEmpty())) {
                    for (ae aeVar : x2) {
                        Object obj3;
                        if (!c(aeVar, (b) new LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$$inlined$any$lambda$1(this, aiVar)) || (!aeVar.btW() && m.ma(aiVar.bsZ().boi()))) {
                            obj3 = null;
                            continue;
                        } else {
                            obj3 = 1;
                            continue;
                        }
                        if (obj3 != null) {
                            obj2 = 1;
                            continue;
                            break;
                        }
                    }
                }
                obj2 = null;
                continue;
                if (obj2 != null) {
                    obj = 1;
                    break;
                }
            }
        }
        obj = null;
        if (obj != null) {
            return false;
        }
        if (f(aiVar) || e(aiVar) || g(aiVar)) {
            z = false;
        }
        return z;
    }

    private final boolean e(ai aiVar) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.fgP;
        f bsZ = aiVar.bsZ();
        String str = ConditionalUserProperty.NAME;
        i.e(bsZ, str);
        boolean m = builtinMethodsWithSpecialGenericSignature.m(bsZ);
        boolean z = false;
        if (!m) {
            return false;
        }
        f bsZ2 = aiVar.bsZ();
        i.e(bsZ2, str);
        Collection arrayList = new ArrayList();
        for (ai h : w(bsZ2)) {
            s h2 = BuiltinMethodsWithSpecialGenericSignature.h(h);
            if (h2 != null) {
                arrayList.add(h2);
            }
        }
        Iterable<s> iterable = (List) arrayList;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (s b : iterable) {
                if (b(aiVar, b)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    private final Collection<ai> u(f fVar) {
        Iterable<kotlin.reflect.jvm.internal.impl.load.java.structure.q> r = ((b) bwM().invoke()).r(fVar);
        Collection arrayList = new ArrayList(n.e(r, 10));
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.q c : r) {
            arrayList.add(c(c));
        }
        return (List) arrayList;
    }

    private final Collection<ai> v(f fVar) {
        Collection arrayList = new ArrayList();
        for (Object next : w(fVar)) {
            ai aiVar = (ai) next;
            Object obj = (r.q((CallableMemberDescriptor) aiVar) || BuiltinMethodsWithSpecialGenericSignature.h(aiVar) != null) ? 1 : null;
            if (obj == null) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    private final boolean f(ai aiVar) {
        kotlin.reflect.jvm.internal.impl.load.java.b bVar = kotlin.reflect.jvm.internal.impl.load.java.b.fgH;
        f bsZ = aiVar.bsZ();
        i.e(bsZ, ConditionalUserProperty.NAME);
        Iterable<f> l = bVar.l(bsZ);
        if ((l instanceof Collection) && ((Collection) l).isEmpty()) {
            return false;
        }
        for (f bsZ2 : l) {
            Object obj;
            Collection arrayList = new ArrayList();
            for (Object next : w(bsZ2)) {
                if (r.q((ai) next)) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            if (!list.isEmpty()) {
                ai a = a(aiVar, bsZ2);
                Iterable<ai> iterable = list;
                if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                    for (ai a2 : iterable) {
                        if (a(a2, (s) a)) {
                            obj = 1;
                            continue;
                            break;
                        }
                    }
                }
            }
            obj = null;
            continue;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean g(ai aiVar) {
        ai h = h(aiVar);
        if (h == null) {
            return false;
        }
        f bsZ = aiVar.bsZ();
        i.e(bsZ, ConditionalUserProperty.NAME);
        Iterable<ai> w = w(bsZ);
        if ((w instanceof Collection) && ((Collection) w).isEmpty()) {
            return false;
        }
        for (ai aiVar2 : w) {
            Object obj;
            if (aiVar2.bto() && b((a) h, (a) aiVar2)) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    private final kotlin.reflect.jvm.internal.impl.descriptors.ai h(kotlin.reflect.jvm.internal.impl.descriptors.ai r6) {
        /*
        r5 = this;
        r0 = r6.bsP();
        r1 = "valueParameters";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = kotlin.collections.u.bX(r0);
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ar) r0;
        r2 = 0;
        if (r0 == 0) goto L_0x008d;
    L_0x0013:
        r3 = r0.bpT();
        r3 = r3.bMZ();
        r3 = r3.brQ();
        if (r3 == 0) goto L_0x0038;
    L_0x0021:
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r3;
        r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.z(r3);
        if (r3 == 0) goto L_0x0038;
    L_0x0029:
        r4 = r3.bKe();
        if (r4 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0031;
    L_0x0030:
        r3 = r2;
    L_0x0031:
        if (r3 == 0) goto L_0x0038;
    L_0x0033:
        r3 = r3.bKf();
        goto L_0x0039;
    L_0x0038:
        r3 = r2;
    L_0x0039:
        r4 = r5.bwP();
        r4 = r4.bwl();
        r4 = r4.bwf();
        r4 = r4.bwg();
        r3 = kotlin.reflect.jvm.internal.impl.builtins.j.a(r3, r4);
        if (r3 == 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0051;
    L_0x0050:
        r0 = r2;
    L_0x0051:
        if (r0 == 0) goto L_0x008d;
    L_0x0053:
        r2 = r6.btp();
        r6 = r6.bsP();
        kotlin.jvm.internal.i.e(r6, r1);
        r1 = 1;
        r6 = kotlin.collections.u.i(r6, r1);
        r6 = r2.cb(r6);
        r0 = r0.bpT();
        r0 = r0.btD();
        r2 = 0;
        r0 = r0.get(r2);
        r0 = (kotlin.reflect.jvm.internal.impl.types.ap) r0;
        r0 = r0.bpT();
        r6 = r6.N(r0);
        r6 = r6.btv();
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.ai) r6;
        r0 = r6;
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.ad) r0;
        if (r0 == 0) goto L_0x008c;
    L_0x0089:
        r0.gA(r1);
    L_0x008c:
        return r6;
    L_0x008d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g.h(kotlin.reflect.jvm.internal.impl.descriptors.ai):kotlin.reflect.jvm.internal.impl.descriptors.ai");
    }

    private final ai a(ai aiVar, f fVar) {
        s.a btp = aiVar.btp();
        btp.e(fVar);
        btp.btq();
        btp.btr();
        s btv = btp.btv();
        if (btv == null) {
            i.bnJ();
        }
        return (ai) btv;
    }

    private final boolean a(ai aiVar, s sVar) {
        Object sVar2;
        if (kotlin.reflect.jvm.internal.impl.load.java.b.fgH.c(aiVar)) {
            sVar2 = sVar2.bti();
        }
        i.e(sVar2, "if (superDescriptor.isRe…iginal else subDescriptor");
        return b((a) sVar2, (a) aiVar);
    }

    private final boolean b(a aVar, a aVar2) {
        OverrideCompatibilityInfo b = OverridingUtil.ftd.b(aVar2, aVar, true);
        i.e(b, "OverridingUtil.DEFAULT.i…erDescriptor, this, true)");
        Result bMV = b.bMV();
        i.e(bMV, "OverridingUtil.DEFAULT.i…iptor, this, true).result");
        if (bMV != Result.OVERRIDABLE || k.fhe.a(aVar2, aVar)) {
            return false;
        }
        return true;
    }

    private final ai a(ae aeVar, b<? super f, ? extends Collection<? extends ai>> bVar) {
        af btG = aeVar.btG();
        String str = null;
        btG = btG != null ? (af) r.p(btG) : null;
        if (btG != null) {
            str = kotlin.reflect.jvm.internal.impl.load.java.c.fgW.n((CallableMemberDescriptor) btG);
        }
        if (str != null && !r.a(bwF(), btG)) {
            return a(aeVar, str, (b) bVar);
        }
        String mb = m.mb(aeVar.bsZ().boi());
        i.e(mb, "JvmAbi.getterName(name.asString())");
        return a(aeVar, mb, (b) bVar);
    }

    private final ai a(ae aeVar, String str, b<? super f, ? extends Collection<? extends ai>> bVar) {
        ai aiVar;
        f ms = f.ms(str);
        i.e(ms, "Name.identifier(getterName)");
        Iterator it = ((Iterable) bVar.invoke(ms)).iterator();
        do {
            aiVar = null;
            if (!it.hasNext()) {
                break;
            }
            ai aiVar2 = (ai) it.next();
            if (aiVar2.bsP().size() == 0) {
                kotlin.reflect.jvm.internal.impl.types.checker.b bVar2 = kotlin.reflect.jvm.internal.impl.types.checker.b.fxI;
                w bsN = aiVar2.bsN();
                if (bsN != null ? bVar2.c(bsN, aeVar.bpT()) : false) {
                    aiVar = aiVar2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (aiVar == null);
        return aiVar;
    }

    private final ai b(ae aeVar, b<? super f, ? extends Collection<? extends ai>> bVar) {
        ai aiVar;
        f ms = f.ms(m.mc(aeVar.bsZ().boi()));
        i.e(ms, "Name.identifier(JvmAbi.s…terName(name.asString()))");
        Iterator it = ((Iterable) bVar.invoke(ms)).iterator();
        do {
            aiVar = null;
            if (!it.hasNext()) {
                break;
            }
            ai aiVar2 = (ai) it.next();
            if (aiVar2.bsP().size() == 1) {
                w bsN = aiVar2.bsN();
                if (bsN != null && kotlin.reflect.jvm.internal.impl.builtins.g.H(bsN)) {
                    kotlin.reflect.jvm.internal.impl.types.checker.b bVar2 = kotlin.reflect.jvm.internal.impl.types.checker.b.fxI;
                    List bsP = aiVar2.bsP();
                    i.e(bsP, "descriptor.valueParameters");
                    Object bY = u.bY(bsP);
                    i.e(bY, "descriptor.valueParameters.single()");
                    if (bVar2.d(((ar) bY).bpT(), aeVar.bpT())) {
                        aiVar = aiVar2;
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } while (aiVar == null);
        return aiVar;
    }

    private final boolean c(ae aeVar, b<? super f, ? extends Collection<? extends ai>> bVar) {
        boolean z = false;
        if (c.h(aeVar)) {
            return false;
        }
        ai a = a(aeVar, (b) bVar);
        ai b = b(aeVar, (b) bVar);
        if (a == null) {
            return false;
        }
        if (!aeVar.btW()) {
            return true;
        }
        if (b != null && b.bru() == a.bru()) {
            z = true;
        }
        return z;
    }

    /* Access modifiers changed, original: protected */
    public void a(Collection<ai> collection, f fVar) {
        i.f(collection, "result");
        i.f(fVar, ConditionalUserProperty.NAME);
        Set w = w(fVar);
        if (!(kotlin.reflect.jvm.internal.impl.load.java.b.fgH.k(fVar) || BuiltinMethodsWithSpecialGenericSignature.fgP.m(fVar))) {
            Object obj;
            Iterable<s> iterable = w;
            if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                for (s bto : iterable) {
                    if (bto.bto()) {
                        obj = null;
                        break;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (d((ai) next)) {
                        arrayList.add(next);
                    }
                }
                a((Collection) collection, fVar, (Collection) (List) arrayList, false);
                return;
            }
        }
        kotlin.reflect.jvm.internal.impl.utils.i bQf = kotlin.reflect.jvm.internal.impl.utils.i.fAh.bQf();
        Collection a = kotlin.reflect.jvm.internal.impl.load.java.components.a.a(fVar, w, m.emptyList(), bwF(), l.fvt);
        i.e(a, "resolveOverridesForNonSt…rter.DO_NOTHING\n        )");
        g gVar = this;
        f fVar2 = fVar;
        Collection<ai> collection2 = collection;
        Collection collection3 = a;
        a(fVar2, collection2, collection3, collection, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(gVar));
        a(fVar2, collection2, collection3, bQf, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(gVar));
        a = new ArrayList();
        for (Object next2 : w) {
            if (d((ai) next2)) {
                a.add(next2);
            }
        }
        a((Collection) collection, fVar, (Collection) u.b((Collection) (List) a, (Iterable) bQf), true);
    }

    private final void a(Collection<ai> collection, f fVar, Collection<? extends ai> collection2, boolean z) {
        Collection a = kotlin.reflect.jvm.internal.impl.load.java.components.a.a(fVar, collection2, collection, bwF(), bwP().bwl().bvU());
        i.e(a, "resolveOverridesForNonSt…s.errorReporter\n        )");
        if (z) {
            Iterable<Object> iterable = a;
            List b = u.b((Collection) collection, (Iterable) iterable);
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (Object obj : iterable) {
                Object obj2;
                ai aiVar = (ai) r.r((CallableMemberDescriptor) obj2);
                if (aiVar != null) {
                    i.e(obj2, "resolvedOverride");
                    obj2 = a((ai) obj2, (a) aiVar, (Collection) b);
                }
                arrayList.add(obj2);
            }
            collection.addAll((List) arrayList);
            return;
        }
        collection.addAll(a);
    }

    private final void a(f fVar, Collection<? extends ai> collection, Collection<? extends ai> collection2, Collection<ai> collection3, b<? super f, ? extends Collection<? extends ai>> bVar) {
        for (ai aiVar : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.a.j(collection3, a(aiVar, (b) bVar, fVar, (Collection) collection));
            kotlin.reflect.jvm.internal.impl.utils.a.j(collection3, a(aiVar, (b) bVar, (Collection) collection));
            kotlin.reflect.jvm.internal.impl.utils.a.j(collection3, a(aiVar, (b) bVar));
        }
    }

    private final ai a(ai aiVar, b<? super f, ? extends Collection<? extends ai>> bVar, Collection<? extends ai> collection) {
        s h = BuiltinMethodsWithSpecialGenericSignature.h(aiVar);
        if (h == null) {
            return null;
        }
        ai a = a(h, (b) bVar);
        if (a == null) {
            return null;
        }
        if (!d(a)) {
            a = null;
        }
        if (a != null) {
            return a(a, (a) h, (Collection) collection);
        }
        return null;
    }

    private final ai a(ai aiVar, b<? super f, ? extends Collection<? extends ai>> bVar, f fVar, Collection<? extends ai> collection) {
        aiVar = (ai) r.p(aiVar);
        if (aiVar != null) {
            String s = r.s(aiVar);
            if (s == null) {
                i.bnJ();
            }
            f ms = f.ms(s);
            i.e(ms, "Name.identifier(nameInJava)");
            for (ai a : (Collection) bVar.invoke(ms)) {
                ai a2 = a(a2, fVar);
                if (a(aiVar, (s) a2)) {
                    return a(a2, (a) aiVar, (Collection) collection);
                }
            }
        }
        return null;
    }

    private final ai a(ai aiVar, b<? super f, ? extends Collection<? extends ai>> bVar) {
        if (!aiVar.bto()) {
            return null;
        }
        ai h;
        f bsZ = aiVar.bsZ();
        i.e(bsZ, "descriptor.name");
        for (ai h2 : (Iterable) bVar.invoke(bsZ)) {
            h2 = h(h2);
            if (h2 == null || !b((a) h2, (a) aiVar)) {
                h2 = null;
                continue;
            }
            if (h2 != null) {
                break;
            }
        }
        h2 = null;
        return h2;
    }

    private final ai a(ai aiVar, a aVar, Collection<? extends ai> collection) {
        Iterable<ai> iterable = collection;
        int i = 1;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (ai aiVar2 : iterable) {
                Object obj;
                if ((i.y(aiVar, aiVar2) ^ 1) != 0 && aiVar2.btj() == null && b((a) aiVar2, aVar)) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    i = 0;
                    break;
                }
            }
        }
        if (i != 0) {
            return aiVar;
        }
        s btv = aiVar.btp().btt().btv();
        if (btv == null) {
            i.bnJ();
        }
        return (ai) btv;
    }

    private final ai a(s sVar, b<? super f, ? extends Collection<? extends ai>> bVar) {
        f bsZ = sVar.bsZ();
        i.e(bsZ, "overridden.name");
        for (Object next : (Iterable) bVar.invoke(bsZ)) {
            if (b((ai) next, sVar)) {
                break;
            }
        }
        Object next2 = null;
        ai aiVar = (ai) next2;
        if (aiVar == null) {
            return null;
        }
        s.a btp = aiVar.btp();
        List bsP = sVar.bsP();
        i.e(bsP, "overridden.valueParameters");
        Iterable<ar> iterable = bsP;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (ar arVar : iterable) {
            i.e(arVar, "it");
            w bpT = arVar.bpT();
            i.e(bpT, "it.type");
            arrayList.add(new kotlin.reflect.jvm.internal.impl.load.java.descriptors.i(bpT, arVar.btR()));
        }
        arrayList = (List) arrayList;
        List bsP2 = aiVar.bsP();
        i.e(bsP2, "override.valueParameters");
        btp.cb(kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.a(arrayList, bsP2, sVar));
        btp.btq();
        btp.btr();
        return (ai) btp.btv();
    }

    private final Set<ai> w(f fVar) {
        an brm = bwF().brm();
        i.e(brm, "ownerDescriptor.typeConstructor");
        Collection<w> bup = brm.bup();
        i.e(bup, "ownerDescriptor.typeConstructor.supertypes");
        Collection linkedHashSet = new LinkedHashSet();
        for (w bsF : bup) {
            r.a(linkedHashSet, (Iterable) bsF.bsF().b(fVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return (Set) linkedHashSet;
    }

    /* Access modifiers changed, original: protected */
    public void b(f fVar, Collection<ae> collection) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(collection, "result");
        if (this.fjm.bxn()) {
            c(fVar, (Collection) collection);
        }
        Set x = x(fVar);
        if (!x.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.utils.i bQf = kotlin.reflect.jvm.internal.impl.utils.i.fAh.bQf();
            a(x, (Collection) collection, (b) new LazyJavaClassMemberScope$computeNonDeclaredProperties$1(this));
            a(x, (Collection) bQf, (b) new LazyJavaClassMemberScope$computeNonDeclaredProperties$2(this));
            Collection a = kotlin.reflect.jvm.internal.impl.load.java.components.a.a(fVar, am.a(x, bQf), collection, bwF(), bwP().bwl().bvU());
            i.e(a, "resolveOverridesForNonSt…rorReporter\n            )");
            collection.addAll(a);
        }
    }

    private final void a(Set<? extends ae> set, Collection<ae> collection, b<? super f, ? extends Collection<? extends ai>> bVar) {
        for (ae d : set) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e d2 = d(d, (b) bVar);
            if (d2 != null) {
                collection.add(d2);
                return;
            }
        }
    }

    private final void c(f fVar, Collection<ae> collection) {
        kotlin.reflect.jvm.internal.impl.load.java.structure.q qVar = (kotlin.reflect.jvm.internal.impl.load.java.structure.q) u.O(((b) bwM().invoke()).r(fVar));
        if (qVar != null) {
            collection.add(a(this, qVar, null, Modality.FINAL, 2, null));
        }
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e a(kotlin.reflect.jvm.internal.impl.load.java.structure.q qVar, w wVar, Modality modality) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e a = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.a(bwF(), kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(bwP(), qVar), modality, qVar.brx(), false, qVar.bsZ(), bwP().bwl().bvX().a(qVar), false);
        i.e(a, "JavaPropertyDescriptor.c…inal = */ false\n        )");
        aa a2 = kotlin.reflect.jvm.internal.impl.resolve.b.a((ae) a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug());
        i.e(a2, "DescriptorFactory.create…iptor, Annotations.EMPTY)");
        a.a(a2, null);
        if (wVar == null) {
            wVar = a(qVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.a.a(bwP(), (kotlin.reflect.jvm.internal.impl.descriptors.k) a, (x) qVar, 0, 4, null));
        }
        a.a(wVar, m.emptyList(), bsL(), null);
        a2.S(wVar);
        return a;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e d(ae aeVar, b<? super f, ? extends Collection<? extends ai>> bVar) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar = null;
        if (!c(aeVar, (b) bVar)) {
            return null;
        }
        ai b;
        ai a = a(aeVar, (b) bVar);
        if (a == null) {
            i.bnJ();
        }
        if (aeVar.btW()) {
            b = b(aeVar, (b) bVar);
            if (b == null) {
                i.bnJ();
            }
        } else {
            b = null;
        }
        Object obj = (b == null || b.bru() == a.bru()) ? 1 : null;
        if (kotlin.m.eVC && obj == null) {
            Object bru;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Different accessors modalities when creating overrides for ");
            stringBuilder.append(aeVar);
            stringBuilder.append(" in ");
            stringBuilder.append(bwF());
            stringBuilder.append("for getter is ");
            stringBuilder.append(a.bru());
            stringBuilder.append(", but for setter is ");
            if (b != null) {
                bru = b.bru();
            }
            stringBuilder.append(bru);
            throw new AssertionError(stringBuilder.toString());
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e a2 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.a(bwF(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), a.bru(), a.brx(), b != null, aeVar.bsZ(), a.brF(), false);
        i.e(a2, "JavaPropertyDescriptor.c…inal = */ false\n        )");
        w bsN = a.bsN();
        if (bsN == null) {
            i.bnJ();
        }
        a2.a(bsN, m.emptyList(), bsL(), null);
        ae aeVar2 = a2;
        aa a3 = kotlin.reflect.jvm.internal.impl.resolve.b.a(aeVar2, a.brE(), false, false, false, a.brF());
        a3.g(a);
        a3.S(a2.bpT());
        i.e(a3, "DescriptorFactory.create…escriptor.type)\n        }");
        if (b != null) {
            List bsP = b.bsP();
            i.e(bsP, "setterMethod.valueParameters");
            ar arVar = (ar) u.bV(bsP);
            if (arVar != null) {
                eVar = kotlin.reflect.jvm.internal.impl.resolve.b.a(aeVar2, b.brE(), arVar.brE(), false, false, false, b.brx(), b.brF());
                eVar.g(b);
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("No parameter found for ");
                stringBuilder2.append(b);
                throw new AssertionError(stringBuilder2.toString());
            }
        }
        a2.a(a3, (ag) eVar);
        return a2;
    }

    private final Set<ae> x(f fVar) {
        an brm = bwF().brm();
        i.e(brm, "ownerDescriptor.typeConstructor");
        Collection<w> bup = brm.bup();
        i.e(bup, "ownerDescriptor.typeConstructor.supertypes");
        Collection arrayList = new ArrayList();
        for (w bsF : bup) {
            Iterable<ae> a = bsF.bsF().a(fVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            Collection arrayList2 = new ArrayList(n.e(a, 10));
            for (ae add : a) {
                arrayList2.add(add);
            }
            r.a(arrayList, (Iterable) (List) arrayList2);
        }
        return u.V((List) arrayList);
    }

    /* Access modifiers changed, original: protected */
    public a a(kotlin.reflect.jvm.internal.impl.load.java.structure.q qVar, List<? extends ao> list, w wVar, List<? extends ar> list2) {
        i.f(qVar, "method");
        i.f(list, "methodTypeParameters");
        i.f(wVar, "returnType");
        i.f(list2, "valueParameters");
        kotlin.reflect.jvm.internal.impl.load.java.components.k.a a = bwP().bwl().bvT().a(qVar, bwF(), wVar, null, list2, list);
        i.e(a, "c.components.signaturePr…dTypeParameters\n        )");
        w bsN = a.bsN();
        i.e(bsN, "propagated.returnType");
        w bvN = a.bvN();
        List bsP = a.bsP();
        i.e(bsP, "propagated.valueParameters");
        List bsM = a.bsM();
        i.e(bsM, "propagated.typeParameters");
        boolean buA = a.buA();
        List Zh = a.Zh();
        i.e(Zh, "propagated.errors");
        return new a(bsN, bvN, bsP, bsM, buA, Zh);
    }

    private final boolean b(ai aiVar, s sVar) {
        String a = kotlin.reflect.jvm.internal.impl.load.kotlin.r.a(aiVar, false, false, 2, null);
        s bti = sVar.bti();
        i.e(bti, "builtinWithErasedParameters.original");
        return i.y(a, kotlin.reflect.jvm.internal.impl.load.kotlin.r.a(bti, false, false, 2, null)) && !b((a) aiVar, (a) sVar);
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.c a(kotlin.reflect.jvm.internal.impl.load.java.structure.k kVar) {
        d bwE = bwF();
        kotlin.reflect.jvm.internal.impl.load.java.structure.l lVar = kVar;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.c b = kotlin.reflect.jvm.internal.impl.load.java.descriptors.c.b(bwE, kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(bwP(), kVar), false, (aj) bwP().bwl().bvX().a(lVar));
        i.e(b, "JavaClassConstructorDesc…ce(constructor)\n        )");
        h a = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.a(bwP(), (kotlin.reflect.jvm.internal.impl.descriptors.k) b, (x) kVar, bwE.brI().size());
        b a2 = a(a, (s) b, kVar.bsP());
        List brI = bwE.brI();
        i.e(brI, "classDescriptor.declaredTypeParameters");
        Collection collection = brI;
        Iterable<kotlin.reflect.jvm.internal.impl.load.java.structure.w> bsM = kVar.bsM();
        Collection arrayList = new ArrayList(n.e(bsM, 10));
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.w a3 : bsM) {
            ao a4 = a.bwm().a(a3);
            if (a4 == null) {
                i.bnJ();
            }
            arrayList.add(a4);
        }
        b.a(a2.getDescriptors(), kVar.brx(), u.b(collection, (Iterable) (List) arrayList));
        b.gB(false);
        b.gC(a2.bwR());
        b.Q(bwE.bsY());
        a.bwl().bvV().a(lVar, (j) b);
        return b;
    }

    private final c bwD() {
        boolean bxn = this.fjm.bxn();
        if (this.fjm.isInterface() && !bxn) {
            return null;
        }
        List a;
        d bwE = bwF();
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.c b = kotlin.reflect.jvm.internal.impl.load.java.descriptors.c.b(bwE, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), true, (aj) bwP().bwl().bvX().a(this.fjm));
        i.e(b, "JavaClassConstructorDesc….source(jClass)\n        )");
        if (bxn) {
            a = a((kotlin.reflect.jvm.internal.impl.descriptors.impl.f) b);
        } else {
            a = Collections.emptyList();
        }
        b.gC(false);
        b.a(a, A(bwE));
        b.gB(true);
        b.Q(bwE.bsY());
        bwP().bwl().bvV().a((kotlin.reflect.jvm.internal.impl.load.java.structure.l) this.fjm, (j) b);
        return b;
    }

    private final aw A(d dVar) {
        aw brx = dVar.brx();
        i.e(brx, "classDescriptor.visibility");
        if (!i.y(brx, kotlin.reflect.jvm.internal.impl.load.java.l.fhg)) {
            return brx;
        }
        brx = kotlin.reflect.jvm.internal.impl.load.java.l.fhh;
        i.e(brx, "JavaVisibilities.PROTECTED_AND_PACKAGE");
        return brx;
    }

    private final List<ar> a(kotlin.reflect.jvm.internal.impl.descriptors.impl.f fVar) {
        Collection bxp = this.fjm.bxp();
        ArrayList arrayList = new ArrayList(bxp.size());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a a = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c.a(TypeUsage.COMMON, true, null, 2, null);
        Iterable iterable = bxp;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : iterable) {
            if (i.y(((kotlin.reflect.jvm.internal.impl.load.java.structure.q) next).bsZ(), kotlin.reflect.jvm.internal.impl.load.java.n.fhm)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list = (List) pair.bnj();
        List<kotlin.reflect.jvm.internal.impl.load.java.structure.q> list2 = (List) pair.bnk();
        int i = 0;
        Object obj = list.size() <= 1 ? 1 : null;
        if (kotlin.m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("There can't be more than one method named 'value' in annotation class: ");
            stringBuilder.append(this.fjm);
            throw new AssertionError(stringBuilder.toString());
        }
        kotlin.reflect.jvm.internal.impl.load.java.structure.q qVar = (kotlin.reflect.jvm.internal.impl.load.java.structure.q) u.bV(list);
        if (qVar != null) {
            Pair pair2;
            v bxD = qVar.bxD();
            if (bxD instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.f) {
                kotlin.reflect.jvm.internal.impl.load.java.structure.f fVar2 = (kotlin.reflect.jvm.internal.impl.load.java.structure.f) bxD;
                pair2 = new Pair(bwP().bwk().a(fVar2, a, true), bwP().bwk().a(fVar2.bxk(), a));
            } else {
                pair2 = new Pair(bwP().bwk().a(bxD, a), null);
            }
            a((List) arrayList, (j) fVar, 0, qVar, (w) pair2.bnj(), (w) pair2.bnk());
        }
        int i2 = qVar != null ? 1 : 0;
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.q qVar2 : list2) {
            a((List) arrayList, (j) fVar, i + i2, qVar2, bwP().bwk().a(qVar2.bxD(), a), null);
            i++;
        }
        return arrayList;
    }

    private final void a(List<ar> list, j jVar, int i, kotlin.reflect.jvm.internal.impl.load.java.structure.q qVar, w wVar, w wVar2) {
        a aVar = jVar;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f bug = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug();
        f bsZ = qVar.bsZ();
        w aZ = au.aZ(wVar);
        i.e(aZ, "TypeUtils.makeNotNullable(returnType)");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ai aiVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ai(aVar, null, i, bug, bsZ, aZ, qVar.bxF(), false, false, wVar2 != null ? au.aZ(wVar2) : null, bwP().bwl().bvX().a(qVar));
        List<ar> list2 = list;
        list.add(aiVar);
    }

    /* Access modifiers changed, original: protected */
    public ah bsL() {
        return kotlin.reflect.jvm.internal.impl.resolve.c.t(bwF());
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.f c(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        d(fVar, bVar);
        return (kotlin.reflect.jvm.internal.impl.descriptors.f) this.fjI.invoke(fVar);
    }

    public Collection<ai> b(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        d(fVar, bVar);
        return super.b(fVar, bVar);
    }

    public Collection<ae> a(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        d(fVar, bVar);
        return super.a(fVar, bVar);
    }

    /* Access modifiers changed, original: protected */
    public Set<f> d(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, b<? super f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        return am.a((Set) this.fjG.invoke(), ((Map) this.fjH.invoke()).keySet());
    }

    /* Access modifiers changed, original: protected */
    public Set<f> e(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, b<? super f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        if (this.fjm.bxn()) {
            return bux();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((b) bwM().invoke()).bwr());
        an brm = bwF().brm();
        i.e(brm, "ownerDescriptor.typeConstructor");
        Collection<w> bup = brm.bup();
        i.e(bup, "ownerDescriptor.typeConstructor.supertypes");
        for (w bsF : bup) {
            r.a((Collection) linkedHashSet, (Iterable) bsF.bsF().buy());
        }
        return linkedHashSet;
    }

    public void d(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        kotlin.reflect.jvm.internal.impl.incremental.a.a(bwP().bwl().bwa(), bVar, bwF(), fVar);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lazy Java member scope for ");
        stringBuilder.append(this.fjm.btB());
        return stringBuilder.toString();
    }
}
