package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ag;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.q;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.b;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.utils.i;

/* compiled from: PropertyDescriptorImpl */
public class z extends ak implements ae {
    private List<ao> fcP;
    private ah feE;
    private ah feF;
    private aw feG;
    private final boolean feL;
    private final Kind feU;
    private final boolean fek;
    private final Modality fel;
    private Collection<? extends ae> ffJ;
    private final ae ffK;
    private final boolean ffL;
    private final boolean ffM;
    private final boolean ffN;
    private aa ffO;
    private ag ffP;
    private boolean ffQ;
    private q ffR;
    private q ffS;
    private final boolean isActual;

    /* compiled from: PropertyDescriptorImpl */
    public class a {
        private f fdP = z.this.bsZ();
        private ah feF = z.this.feF;
        private aw feG = z.this.brx();
        private Kind feU = z.this.bsT();
        private as feZ = as.fxz;
        private Modality fel = z.this.bru();
        private ae ffK = null;
        private k ffT = z.this.brj();
        private boolean ffg = true;
        private List<ao> ffk = null;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            int i2 = i;
            String str = (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 8 || i2 == 16 || i2 == 10 || i2 == 11 || i2 == 13 || i2 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i3 = (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 8 || i2 == 16 || i2 == 10 || i2 == 11 || i2 == 13 || i2 == 14) ? 2 : 3;
            Object[] objArr = new Object[i3];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                case 11:
                case 13:
                case 14:
                case 16:
                    objArr[0] = str2;
                    break;
                case 3:
                    objArr[0] = "modality";
                    break;
                case 5:
                    objArr[0] = "visibility";
                    break;
                case 7:
                    objArr[0] = "kind";
                    break;
                case 9:
                    objArr[0] = "typeParameters";
                    break;
                case 12:
                    objArr[0] = "substitution";
                    break;
                case 15:
                    objArr[0] = ConditionalUserProperty.NAME;
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            String str3 = "setVisibility";
            String str4 = "setModality";
            String str5 = "setOwner";
            if (i2 == 1) {
                objArr[1] = str5;
            } else if (i2 == 2) {
                objArr[1] = "setOriginal";
            } else if (i2 == 4) {
                objArr[1] = str4;
            } else if (i2 == 6) {
                objArr[1] = str3;
            } else if (i2 == 8) {
                objArr[1] = "setKind";
            } else if (i2 == 16) {
                objArr[1] = "setName";
            } else if (i2 == 10) {
                objArr[1] = "setTypeParameters";
            } else if (i2 == 11) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i2 == 13) {
                objArr[1] = "setSubstitution";
            } else if (i2 != 14) {
                objArr[1] = str2;
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                case 11:
                case 13:
                case 14:
                case 16:
                    break;
                case 3:
                    objArr[2] = str4;
                    break;
                case 5:
                    objArr[2] = str3;
                    break;
                case 7:
                    objArr[2] = "setKind";
                    break;
                case 9:
                    objArr[2] = "setTypeParameters";
                    break;
                case 12:
                    objArr[2] = "setSubstitution";
                    break;
                case 15:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = str5;
                    break;
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 8 || i2 == 16 || i2 == 10 || i2 == 11 || i2 == 13 || i2 == 14) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public a o(k kVar) {
            if (kVar == null) {
                $$$reportNull$$$0(0);
            }
            this.ffT = kVar;
            return this;
        }

        public a i(CallableMemberDescriptor callableMemberDescriptor) {
            this.ffK = (ae) callableMemberDescriptor;
            return this;
        }

        public a d(Modality modality) {
            if (modality == null) {
                $$$reportNull$$$0(3);
            }
            this.fel = modality;
            return this;
        }

        public a f(aw awVar) {
            if (awVar == null) {
                $$$reportNull$$$0(5);
            }
            this.feG = awVar;
            return this;
        }

        public a c(Kind kind) {
            if (kind == null) {
                $$$reportNull$$$0(7);
            }
            this.feU = kind;
            return this;
        }

        public a d(as asVar) {
            if (asVar == null) {
                $$$reportNull$$$0(12);
            }
            this.feZ = asVar;
            return this;
        }

        public a gJ(boolean z) {
            this.ffg = z;
            return this;
        }

        public ae buY() {
            return z.this.a(this);
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalArgumentException;
        if (!(i == 14 || i == 24 || i == 37 || i == 38)) {
            switch (i) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i) {
                        case 33:
                        case 34:
                        case 35:
                            break;
                        default:
                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 14 || i == 24 || i == 37 || i == 38)) {
            switch (i) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i) {
                        case 33:
                        case 34:
                        case 35:
                            break;
                        default:
                            i2 = 3;
                            break;
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 17:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 5:
            case 12:
            case 31:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
                objArr[0] = "source";
                break;
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 33:
            case 34:
            case 35:
            case 37:
            case 38:
                objArr[0] = str2;
                break;
            case 15:
                objArr[0] = "outType";
                break;
            case 16:
                objArr[0] = "typeParameters";
                break;
            case 23:
                objArr[0] = "originalSubstitutor";
                break;
            case 25:
                objArr[0] = "copyConfiguration";
                break;
            case 26:
                objArr[0] = "substitutor";
                break;
            case 27:
                objArr[0] = "accessorDescriptor";
                break;
            case 28:
                objArr[0] = "newOwner";
                break;
            case 29:
                objArr[0] = "newModality";
                break;
            case 30:
                objArr[0] = "newVisibility";
                break;
            case 32:
                objArr[0] = "newName";
                break;
            case 36:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createSubstitutedCopy";
        String str4 = "create";
        if (i == 14) {
            objArr[1] = str4;
        } else if (i == 24) {
            objArr[1] = "newCopyBuilder";
        } else if (i == 37) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 38) {
            switch (i) {
                case 18:
                    objArr[1] = "getTypeParameters";
                    break;
                case 19:
                    objArr[1] = "getReturnType";
                    break;
                case 20:
                    objArr[1] = "getModality";
                    break;
                case 21:
                    objArr[1] = "getVisibility";
                    break;
                case 22:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    switch (i) {
                        case 33:
                            objArr[1] = str3;
                            break;
                        case 34:
                            objArr[1] = "getOriginal";
                            break;
                        case 35:
                            objArr[1] = "getKind";
                            break;
                        default:
                            objArr[1] = str2;
                            break;
                    }
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = str4;
                break;
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 33:
            case 34:
            case 35:
            case 37:
            case 38:
                break;
            case 15:
            case 16:
                objArr[2] = "setType";
                break;
            case 17:
                objArr[2] = "setVisibility";
                break;
            case 23:
                objArr[2] = "substitute";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 26:
            case 27:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                objArr[2] = str3;
                break;
            case 36:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        if (!(i == 14 || i == 24 || i == 37 || i == 38)) {
            switch (i) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i) {
                        case 33:
                        case 34:
                        case 35:
                            break;
                        default:
                            illegalArgumentException = new IllegalArgumentException(str);
                            break;
                    }
            }
        }
        illegalArgumentException = new IllegalStateException(str);
        throw illegalArgumentException;
    }

    public <V> V a(kotlin.reflect.jvm.internal.impl.descriptors.a.a<V> aVar) {
        return null;
    }

    protected z(k kVar, ae aeVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, Modality modality, aw awVar, boolean z, f fVar2, Kind kind, aj ajVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Modality modality2 = modality;
        aw awVar2 = awVar;
        Kind kind2 = kind;
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        if (modality2 == null) {
            $$$reportNull$$$0(2);
        }
        if (awVar2 == null) {
            $$$reportNull$$$0(3);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(4);
        }
        if (kind2 == null) {
            $$$reportNull$$$0(5);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(6);
        }
        super(kVar, fVar, fVar2, null, z, ajVar);
        this.ffJ = null;
        this.fel = modality2;
        this.feG = awVar2;
        this.ffK = aeVar == null ? this : aeVar;
        this.feU = kind2;
        this.ffL = z2;
        this.ffM = z3;
        this.feL = z4;
        this.isActual = z5;
        this.fek = z6;
        this.ffN = z7;
    }

    public static z a(k kVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, Modality modality, aw awVar, boolean z, f fVar2, Kind kind, aj ajVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (kVar == null) {
            $$$reportNull$$$0(7);
        }
        if (fVar == null) {
            $$$reportNull$$$0(8);
        }
        if (modality == null) {
            $$$reportNull$$$0(9);
        }
        if (awVar == null) {
            $$$reportNull$$$0(10);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(11);
        }
        if (kind == null) {
            $$$reportNull$$$0(12);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(13);
        }
        return new z(kVar, null, fVar, modality, awVar, z, fVar2, kind, ajVar, z2, z3, z4, z5, z6, z7);
    }

    public void a(w wVar, List<? extends ao> list, ah ahVar, ah ahVar2) {
        if (wVar == null) {
            $$$reportNull$$$0(15);
        }
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        V(wVar);
        this.fcP = new ArrayList(list);
        this.feE = ahVar2;
        this.feF = ahVar;
    }

    public void a(aa aaVar, ag agVar) {
        a(aaVar, agVar, null, null);
    }

    public void a(aa aaVar, ag agVar, q qVar, q qVar2) {
        this.ffO = aaVar;
        this.ffP = agVar;
        this.ffR = qVar;
        this.ffS = qVar2;
    }

    public void gI(boolean z) {
        this.ffQ = z;
    }

    public void d(aw awVar) {
        if (awVar == null) {
            $$$reportNull$$$0(17);
        }
        this.feG = awVar;
    }

    public List<ao> bsM() {
        List list = this.fcP;
        if (list == null) {
            $$$reportNull$$$0(18);
        }
        return list;
    }

    public ah bsK() {
        return this.feE;
    }

    public ah bsL() {
        return this.feF;
    }

    public w bsN() {
        w bpT = bpT();
        if (bpT == null) {
            $$$reportNull$$$0(19);
        }
        return bpT;
    }

    public Modality bru() {
        Modality modality = this.fel;
        if (modality == null) {
            $$$reportNull$$$0(20);
        }
        return modality;
    }

    public aw brx() {
        aw awVar = this.feG;
        if (awVar == null) {
            $$$reportNull$$$0(21);
        }
        return awVar;
    }

    /* renamed from: buU */
    public aa btG() {
        return this.ffO;
    }

    public ag btH() {
        return this.ffP;
    }

    public boolean buV() {
        return this.ffQ;
    }

    public boolean btZ() {
        return this.ffL;
    }

    public boolean btY() {
        return this.ffM;
    }

    public boolean brD() {
        return this.fek;
    }

    public boolean bua() {
        return this.ffN;
    }

    public List<ad> btI() {
        ArrayList arrayList = new ArrayList(2);
        aa aaVar = this.ffO;
        if (aaVar != null) {
            arrayList.add(aaVar);
        }
        ag agVar = this.ffP;
        if (agVar != null) {
            arrayList.add(agVar);
        }
        return arrayList;
    }

    /* renamed from: d */
    public ae f(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(23);
        }
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        return buW().d(typeSubstitutor.bPG()).i(bul()).buY();
    }

    public a buW() {
        return new a();
    }

    /* Access modifiers changed, original: protected */
    public ae a(a aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(25);
        }
        z a = a(aVar.ffT, aVar.fel, aVar.feG, aVar.ffK, aVar.feU, aVar.fdP);
        List bsM = aVar.ffk == null ? bsM() : aVar.ffk;
        List arrayList = new ArrayList(bsM.size());
        TypeSubstitutor a2 = kotlin.reflect.jvm.internal.impl.types.k.a(bsM, aVar.feZ, a, arrayList);
        w c = a2.c(bpT(), Variance.OUT_VARIANCE);
        q qVar = null;
        if (c == null) {
            return null;
        }
        ah acVar;
        aa aaVar;
        ag agVar;
        ah j = aVar.feF;
        if (j != null) {
            j = j.e(a2);
            if (j == null) {
                return null;
            }
        }
        j = null;
        ah ahVar = this.feE;
        if (ahVar != null) {
            w c2 = a2.c(ahVar.bpT(), Variance.IN_VARIANCE);
            if (c2 == null) {
                return null;
            }
            acVar = new ac(a, new b(a, c2, this.feE.btM()), this.feE.brE());
        } else {
            acVar = null;
        }
        a.a(c, arrayList, j, acVar);
        aa aaVar2 = this.ffO;
        if (aaVar2 == null) {
            aaVar = null;
        } else {
            aa aaVar3 = new aa(a, aaVar2.brE(), aVar.fel, a(this.ffO.brx(), aVar.feU), this.ffO.isDefault(), this.ffO.brD(), this.ffO.brA(), aVar.feU, aVar.ffK == null ? null : aVar.ffK.btG(), aj.fcV);
        }
        if (aaVar != null) {
            w bsN = this.ffO.bsN();
            aaVar.g(a(a2, this.ffO));
            aaVar.S(bsN != null ? a2.c(bsN, Variance.OUT_VARIANCE) : null);
        }
        ag agVar2 = this.ffP;
        if (agVar2 == null) {
            agVar = null;
        } else {
            ag abVar = new ab(a, agVar2.brE(), aVar.fel, a(this.ffP.brx(), aVar.feU), this.ffP.isDefault(), this.ffP.brD(), this.ffP.brA(), aVar.feU, aVar.ffK == null ? null : aVar.ffK.btH(), aj.fcV);
        }
        if (agVar != null) {
            arrayList = p.a((s) agVar, this.ffP.bsP(), a2, false, false, null);
            if (arrayList == null) {
                a.gI(true);
                arrayList = Collections.singletonList(ab.a(agVar, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(aVar.ffT).bqK(), ((ar) this.ffP.bsP().get(0)).brE()));
            }
            if (arrayList.size() == 1) {
                agVar.g(a(a2, this.ffP));
                agVar.c((ar) arrayList.get(0));
            } else {
                throw new IllegalStateException();
            }
        }
        q qVar2 = this.ffR;
        q oVar = qVar2 == null ? null : new o(qVar2.brE(), a);
        qVar2 = this.ffS;
        if (qVar2 != null) {
            qVar = new o(qVar2.brE(), a);
        }
        a.a(aaVar, agVar, oVar, qVar);
        if (aVar.ffg) {
            i bQf = i.bQf();
            for (ae d : bsR()) {
                bQf.add(d.d(a2));
            }
            a.K(bQf);
        }
        if (btY() && this.fgo != null) {
            a.a(this.fgo);
        }
        return a;
    }

    private static aw a(aw awVar, Kind kind) {
        return (kind == Kind.FAKE_OVERRIDE && av.b(awVar.bud())) ? av.fdh : awVar;
    }

    private static s a(TypeSubstitutor typeSubstitutor, ad adVar) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(26);
        }
        if (adVar == null) {
            $$$reportNull$$$0(27);
        }
        return adVar.btj() != null ? adVar.btj().c(typeSubstitutor) : null;
    }

    /* Access modifiers changed, original: protected */
    public z a(k kVar, Modality modality, aw awVar, ae aeVar, Kind kind, f fVar) {
        if (kVar == null) {
            $$$reportNull$$$0(28);
        }
        if (modality == null) {
            $$$reportNull$$$0(29);
        }
        if (awVar == null) {
            $$$reportNull$$$0(30);
        }
        if (kind == null) {
            $$$reportNull$$$0(31);
        }
        if (fVar == null) {
            $$$reportNull$$$0(32);
        }
        return new z(kVar, aeVar, brE(), modality, awVar, btW(), fVar, kind, aj.fcV, btZ(), btY(), brB(), brC(), brD(), bua());
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        return mVar.a((ae) this, (Object) d);
    }

    /* renamed from: btJ */
    public ae bul() {
        z zVar = this.ffK;
        ae btJ = zVar == this ? this : zVar.btJ();
        if (btJ == null) {
            $$$reportNull$$$0(34);
        }
        return btJ;
    }

    public Kind bsT() {
        Kind kind = this.feU;
        if (kind == null) {
            $$$reportNull$$$0(35);
        }
        return kind;
    }

    public boolean brB() {
        return this.feL;
    }

    public boolean brC() {
        return this.isActual;
    }

    public q btK() {
        return this.ffR;
    }

    public q btL() {
        return this.ffS;
    }

    public void K(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(36);
        }
        this.ffJ = collection;
    }

    public Collection<? extends ae> bsR() {
        Collection<? extends ae> collection = this.ffJ;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            $$$reportNull$$$0(37);
        }
        return collection;
    }

    /* renamed from: e */
    public ae a(k kVar, Modality modality, aw awVar, Kind kind, boolean z) {
        ae buY = buW().o(kVar).i(null).d(modality).f(awVar).c(kind).gJ(z).buY();
        if (buY == null) {
            $$$reportNull$$$0(38);
        }
        return buY;
    }
}
