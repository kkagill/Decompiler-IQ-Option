package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.am;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c;
import kotlin.reflect.jvm.internal.impl.load.java.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.reflect.jvm.internal.impl.resolve.constants.t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: LazyJavaClassDescriptor.kt */
public final class f extends g implements d {
    private static final Set<String> fjC = al.setOf("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    public static final a fjD = new a();
    private final boolean fcR;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fdr;
    private final aw feG;
    private final Modality fel;
    private final ClassKind fem;
    private final h fiV;
    private final h fjA;
    private final kotlin.reflect.jvm.internal.impl.descriptors.d fjB;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.g fjm;
    private final b fjv;
    private final g fjw;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.f fjx;
    private final l fjy;
    private final e<List<ao>> fjz;

    /* compiled from: LazyJavaClassDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b {
        private final e<List<ao>> fjE;

        public boolean brS() {
            return true;
        }

        public b() {
            super(f.this.fiV.bqz());
            this.fjE = f.this.fiV.bqz().f(new LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1(this));
        }

        public List<ao> getParameters() {
            return (List) this.fjE.invoke();
        }

        /* Access modifiers changed, original: protected */
        public Collection<w> brO() {
            Object obj;
            Collection bup = f.this.bwx().bup();
            ArrayList arrayList = new ArrayList(bup.size());
            ArrayList arrayList2 = new ArrayList(0);
            w bwy = bwy();
            Iterator it = bup.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                j jVar = (j) it.next();
                w a = f.this.fiV.bwk().a((v) jVar, c.a(TypeUsage.SUPERTYPE, false, null, 3, null));
                if (a.bMZ().brQ() instanceof kotlin.reflect.jvm.internal.impl.descriptors.x.b) {
                    arrayList2.add(jVar);
                }
                an bMZ = a.bMZ();
                if (bwy != null) {
                    obj = bwy.bMZ();
                }
                if (!i.y(bMZ, obj)) {
                    if (!kotlin.reflect.jvm.internal.impl.builtins.g.E(a)) {
                        arrayList.add(a);
                    }
                }
            }
            bup = arrayList;
            kotlin.reflect.jvm.internal.impl.descriptors.d b = f.this.fjB;
            if (b != null) {
                obj = kotlin.reflect.jvm.internal.impl.builtins.jvm.g.a(b, f.this).bPF().c(b.bsY(), Variance.INVARIANT);
            }
            kotlin.reflect.jvm.internal.impl.utils.a.j(bup, obj);
            kotlin.reflect.jvm.internal.impl.utils.a.j(bup, bwy);
            if ((arrayList2.isEmpty() ^ 1) != 0) {
                l bvU = f.this.fiV.bwl().bvU();
                kotlin.reflect.jvm.internal.impl.descriptors.d brR = brQ();
                Iterable<v> iterable = arrayList2;
                Collection arrayList3 = new ArrayList(n.e(iterable, 10));
                for (v vVar : iterable) {
                    if (vVar != null) {
                        arrayList3.add(((j) vVar).bxw());
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    }
                }
                bvU.a(brR, (List) arrayList3);
            }
            return (bup.isEmpty() ^ 1) != 0 ? u.T(arrayList) : l.listOf(f.this.fiV.bql().btw().bqM());
        }

        /* JADX WARNING: Missing block: B:8:0x0019, code skipped:
            if (r3 != null) goto L_0x001d;
     */
        private final kotlin.reflect.jvm.internal.impl.types.w bwy() {
            /*
            r8 = this;
            r0 = r8.bwz();
            r1 = 1;
            r2 = 0;
            if (r0 == 0) goto L_0x001c;
        L_0x0008:
            r3 = r0.isRoot();
            if (r3 != 0) goto L_0x0018;
        L_0x000e:
            r3 = kotlin.reflect.jvm.internal.impl.builtins.g.eZo;
            r3 = r0.D(r3);
            if (r3 == 0) goto L_0x0018;
        L_0x0016:
            r3 = 1;
            goto L_0x0019;
        L_0x0018:
            r3 = 0;
        L_0x0019:
            if (r3 == 0) goto L_0x001c;
        L_0x001b:
            goto L_0x001d;
        L_0x001c:
            r0 = r2;
        L_0x001d:
            if (r0 == 0) goto L_0x0021;
        L_0x001f:
            r3 = r0;
            goto L_0x002d;
        L_0x0021:
            r3 = kotlin.reflect.jvm.internal.impl.load.java.g.fha;
            r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.this;
            r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(r4);
            r3 = r3.m(r4);
        L_0x002d:
            if (r3 == 0) goto L_0x00f6;
        L_0x002f:
            r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.this;
            r4 = r4.fiV;
            r4 = r4.bql();
            r5 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_JAVA_LOADER;
            r5 = (kotlin.reflect.jvm.internal.impl.incremental.components.b) r5;
            r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.b(r4, r3, r5);
            if (r3 == 0) goto L_0x00f6;
        L_0x0043:
            r4 = r3.brm();
            r5 = "classDescriptor.typeConstructor";
            kotlin.jvm.internal.i.e(r4, r5);
            r4 = r4.getParameters();
            r4 = r4.size();
            r5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.this;
            r5 = r5.brm();
            r5 = r5.getParameters();
            r6 = "getTypeConstructor().parameters";
            kotlin.jvm.internal.i.e(r5, r6);
            r6 = r5.size();
            r7 = 10;
            if (r6 != r4) goto L_0x00a1;
        L_0x006b:
            r5 = (java.lang.Iterable) r5;
            r0 = new java.util.ArrayList;
            r1 = kotlin.collections.n.e(r5, r7);
            r0.<init>(r1);
            r0 = (java.util.Collection) r0;
            r1 = r5.iterator();
        L_0x007c:
            r2 = r1.hasNext();
            if (r2 == 0) goto L_0x009e;
        L_0x0082:
            r2 = r1.next();
            r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ao) r2;
            r4 = new kotlin.reflect.jvm.internal.impl.types.ar;
            r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
            r6 = "parameter";
            kotlin.jvm.internal.i.e(r2, r6);
            r2 = r2.bsY();
            r2 = (kotlin.reflect.jvm.internal.impl.types.w) r2;
            r4.<init>(r5, r2);
            r0.add(r4);
            goto L_0x007c;
        L_0x009e:
            r0 = (java.util.List) r0;
            goto L_0x00e9;
        L_0x00a1:
            if (r6 != r1) goto L_0x00f6;
        L_0x00a3:
            if (r4 <= r1) goto L_0x00f6;
        L_0x00a5:
            if (r0 != 0) goto L_0x00f6;
        L_0x00a7:
            r0 = new kotlin.reflect.jvm.internal.impl.types.ar;
            r2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
            r5 = kotlin.collections.u.bY(r5);
            r6 = "typeParameters.single()";
            kotlin.jvm.internal.i.e(r5, r6);
            r5 = (kotlin.reflect.jvm.internal.impl.descriptors.ao) r5;
            r5 = r5.bsY();
            r5 = (kotlin.reflect.jvm.internal.impl.types.w) r5;
            r0.<init>(r2, r5);
            r2 = new kotlin.g.f;
            r2.<init>(r1, r4);
            r2 = (java.lang.Iterable) r2;
            r1 = new java.util.ArrayList;
            r4 = kotlin.collections.n.e(r2, r7);
            r1.<init>(r4);
            r1 = (java.util.Collection) r1;
            r2 = r2.iterator();
        L_0x00d6:
            r4 = r2.hasNext();
            if (r4 == 0) goto L_0x00e6;
        L_0x00dc:
            r4 = r2;
            r4 = (kotlin.collections.z) r4;
            r4.nextInt();
            r1.add(r0);
            goto L_0x00d6;
        L_0x00e6:
            r0 = r1;
            r0 = (java.util.List) r0;
        L_0x00e9:
            r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA;
            r1 = r1.bug();
            r0 = kotlin.reflect.jvm.internal.impl.types.x.a(r1, r3, r0);
            r0 = (kotlin.reflect.jvm.internal.impl.types.w) r0;
            return r0;
        L_0x00f6:
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$b.bwy():kotlin.reflect.jvm.internal.impl.types.w");
        }

        private final kotlin.reflect.jvm.internal.impl.name.b bwz() {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE = f.this.brE();
            kotlin.reflect.jvm.internal.impl.name.b bVar = n.fht;
            i.e(bVar, "JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c i = brE.i(bVar);
            bVar = null;
            if (i != null) {
                Object O = u.O(i.buf().values());
                if (!(O instanceof t)) {
                    O = null;
                }
                t tVar = (t) O;
                if (tVar != null) {
                    String str = (String) tVar.getValue();
                    if (str != null) {
                        if (!kotlin.reflect.jvm.internal.impl.name.d.mr(str)) {
                            return null;
                        }
                        bVar = new kotlin.reflect.jvm.internal.impl.name.b(str);
                    }
                }
            }
            return bVar;
        }

        /* Access modifiers changed, original: protected */
        public am brT() {
            return f.this.fiV.bwl().brT();
        }

        /* renamed from: brR */
        public kotlin.reflect.jvm.internal.impl.descriptors.d brQ() {
            return f.this;
        }

        public String toString() {
            String boi = f.this.bsZ().boi();
            i.e(boi, "name.asString()");
            return boi;
        }
    }

    public boolean AZ() {
        return false;
    }

    public boolean brA() {
        return false;
    }

    public boolean brB() {
        return false;
    }

    public boolean brC() {
        return false;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.d brq() {
        return null;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.c brw() {
        return null;
    }

    public boolean bry() {
        return false;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.structure.g bwx() {
        return this.fjm;
    }

    public /* synthetic */ f(h hVar, k kVar, kotlin.reflect.jvm.internal.impl.load.java.structure.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, int i, f fVar) {
        if ((i & 8) != 0) {
            dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) null;
        }
        this(hVar, kVar, gVar, dVar);
    }

    public f(h hVar, k kVar, kotlin.reflect.jvm.internal.impl.load.java.structure.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        i.f(hVar, "outerContext");
        i.f(kVar, "containingDeclaration");
        i.f(gVar, "jClass");
        super(hVar.bqz(), kVar, gVar.bsZ(), hVar.bwl().bvX().a(gVar), false);
        this.fjA = hVar;
        this.fjm = gVar;
        this.fjB = dVar;
        this.fiV = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.a(this.fjA, (kotlin.reflect.jvm.internal.impl.descriptors.e) this, (x) this.fjm, 0, 4, null);
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = this;
        this.fiV.bwl().bvV().a(this.fjm, dVar2);
        boolean z = false;
        Object obj = this.fjm.bxo() == null ? 1 : null;
        if (m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Creating LazyJavaClassDescriptor for light class ");
            stringBuilder.append(this.fjm);
            throw new AssertionError(stringBuilder.toString());
        }
        ClassKind classKind;
        Modality modality;
        if (this.fjm.bxn()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (this.fjm.isInterface()) {
            classKind = ClassKind.INTERFACE;
        } else if (this.fjm.isEnum()) {
            classKind = ClassKind.ENUM_CLASS;
        } else {
            classKind = ClassKind.CLASS;
        }
        this.fem = classKind;
        if (this.fjm.bxn()) {
            modality = Modality.FINAL;
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.Modality.a aVar = Modality.Companion;
            boolean z2 = this.fjm.bxG() || this.fjm.isInterface();
            modality = aVar.p(z2, this.fjm.bxH() ^ 1);
        }
        this.fel = modality;
        this.feG = this.fjm.brx();
        if (!(this.fjm.bxm() == null || this.fjm.bo())) {
            z = true;
        }
        this.fcR = z;
        this.fjv = new b();
        this.fjw = new g(this.fiV, dVar2, this.fjm);
        this.fjx = new kotlin.reflect.jvm.internal.impl.resolve.scopes.f(bro());
        this.fjy = new l(this.fiV, this.fjm, this);
        this.fdr = kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(this.fiV, this.fjm);
        this.fjz = this.fiV.bqz().f(new LazyJavaClassDescriptor$declaredParameters$1(this));
    }

    public ClassKind brt() {
        return this.fem;
    }

    public Modality bru() {
        return this.fel;
    }

    public aw brx() {
        Object obj = (i.y(this.feG, av.fda) && this.fjm.bxm() == null) ? kotlin.reflect.jvm.internal.impl.load.java.l.fhf : this.feG;
        i.e(obj, "if (visibility == Visibi…ISIBILITY else visibility");
        return obj;
    }

    public boolean brz() {
        return this.fcR;
    }

    public an brm() {
        return this.fjv;
    }

    /* renamed from: bww */
    public g bro() {
        return this.fjw;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h btd() {
        return this.fjx;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h brl() {
        return this.fjy;
    }

    /* renamed from: brr */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.c> brs() {
        return (List) this.fjw.bwC().invoke();
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE() {
        return this.fdr;
    }

    public List<ao> brI() {
        return (List) this.fjz.invoke();
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> brH() {
        return m.emptyList();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lazy Java class ");
        stringBuilder.append(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.z(this));
        return stringBuilder.toString();
    }

    public final f a(kotlin.reflect.jvm.internal.impl.load.java.components.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        i.f(gVar, "javaResolverCache");
        h hVar = this.fiV;
        h a = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.a(hVar, hVar.bwl().a(gVar));
        k brj = brj();
        i.e(brj, "containingDeclaration");
        return new f(a, brj, this.fjm, dVar);
    }
}
