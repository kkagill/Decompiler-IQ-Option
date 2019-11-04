package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.m;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.resolve.b;
import kotlin.reflect.jvm.internal.impl.storage.f;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.t;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: TypeAliasConstructorDescriptor.kt */
public final class ag extends p implements af {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(ag.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final a fgd = new a();
    private final h eZz;
    private final f fga;
    private c fgb;
    private final an fgc;

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final TypeSubstitutor a(an anVar) {
            if (anVar.btP() == null) {
                return null;
            }
            return TypeSubstitutor.aV(anVar.btO());
        }

        public final af a(h hVar, an anVar, c cVar) {
            an anVar2 = anVar;
            c cVar2 = cVar;
            i.f(hVar, "storageManager");
            i.f(anVar2, "typeAliasDescriptor");
            i.f(cVar2, "constructor");
            TypeSubstitutor a = a(anVar2);
            af afVar = null;
            if (a != null) {
                c a2 = cVar2.a(a);
                if (a2 != null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE = cVar.brE();
                    Kind bsT = cVar.bsT();
                    i.e(bsT, "constructor.kind");
                    aj brF = anVar.brF();
                    i.e(brF, "typeAliasDescriptor.source");
                    ag agVar = new ag(hVar, anVar, a2, null, brE, bsT, brF, null);
                    List a3 = p.a(agVar, cVar.bsP(), a);
                    if (a3 != null) {
                        i.e(a3, "FunctionDescriptorImpl.g…         ) ?: return null");
                        ad aG = t.aG(a2.bsN().bPA());
                        ad bsY = anVar.bsY();
                        i.e(bsY, "typeAliasDescriptor.defaultType");
                        aG = kotlin.reflect.jvm.internal.impl.types.ag.b(aG, bsY);
                        ah bsL = cVar.bsL();
                        if (bsL != null) {
                            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = agVar;
                            i.e(bsL, "it");
                            afVar = b.a(aVar, a.b(bsL.bpT(), Variance.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug());
                        }
                        agVar.a(afVar, null, anVar.brI(), a3, aG, Modality.FINAL, anVar.brx());
                        return agVar;
                    }
                }
            }
            return null;
        }
    }

    public /* synthetic */ ag(h hVar, an anVar, c cVar, af afVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, Kind kind, aj ajVar, f fVar2) {
        this(hVar, anVar, cVar, afVar, fVar, kind, ajVar);
    }

    public final h bqz() {
        return this.eZz;
    }

    public an bvf() {
        return this.fgc;
    }

    private ag(h hVar, an anVar, c cVar, af afVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, Kind kind, aj ajVar) {
        super(anVar, afVar, fVar, kotlin.reflect.jvm.internal.impl.name.f.mu("<init>"), kind, ajVar);
        this.eZz = hVar;
        this.fgc = anVar;
        gx(bvf().brC());
        this.fga = this.eZz.g(new TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(this, cVar));
        this.fgb = cVar;
    }

    public c bvc() {
        return this.fgb;
    }

    public boolean isPrimary() {
        return bvc().isPrimary();
    }

    /* renamed from: bvd */
    public an btg() {
        return bvf();
    }

    public d bth() {
        d bth = bvc().bth();
        i.e(bth, "underlyingConstructorDescriptor.constructedClass");
        return bth;
    }

    public w bsN() {
        w bsN = super.bsN();
        if (bsN == null) {
            i.bnJ();
        }
        return bsN;
    }

    /* renamed from: bve */
    public af bul() {
        s bti = super.bul();
        if (bti != null) {
            return (af) bti;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    /* renamed from: i */
    public af f(TypeSubstitutor typeSubstitutor) {
        i.f(typeSubstitutor, "substitutor");
        s c = super.f(typeSubstitutor);
        if (c != null) {
            ag agVar = (ag) c;
            TypeSubstitutor aV = TypeSubstitutor.aV(agVar.bsN());
            i.e(aV, "TypeSubstitutor.create(s…asConstructor.returnType)");
            c a = bvc().btc().a(aV);
            if (a == null) {
                return null;
            }
            agVar.fgb = a;
            return agVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
    }

    /* renamed from: g */
    public af c(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, Modality modality, aw awVar, Kind kind, boolean z) {
        i.f(kVar, "newOwner");
        i.f(modality, "modality");
        i.f(awVar, "visibility");
        i.f(kind, "kind");
        s btv = btp().i(kVar).a(modality).a(awVar).a(kind).gq(z).btv();
        if (btv != null) {
            return (af) btv;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: c */
    public ag a(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, s sVar, Kind kind, kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar2, aj ajVar) {
        i.f(kVar, "newOwner");
        i.f(kind, "kind");
        i.f(fVar2, "annotations");
        i.f(ajVar, "source");
        Object obj = null;
        Object obj2 = (kind == Kind.DECLARATION || kind == Kind.SYNTHESIZED) ? 1 : null;
        if (m.eVC && obj2 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Creating a type alias constructor that is not a declaration: \ncopy from: ");
            stringBuilder.append(this);
            stringBuilder.append("\nnewOwner: ");
            stringBuilder.append(kVar);
            stringBuilder.append("\nkind: ");
            stringBuilder.append(kind);
            throw new AssertionError(stringBuilder.toString());
        }
        if (fVar == null) {
            obj = 1;
        }
        if (m.eVC && obj == null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Renaming type alias constructor: ");
            stringBuilder2.append(this);
            throw new AssertionError(stringBuilder2.toString());
        }
        return new ag(this.eZz, bvf(), bvc(), this, fVar2, Kind.DECLARATION, ajVar);
    }
}
