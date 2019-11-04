package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.b;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: FunctionDescriptorImpl */
public abstract class p extends k implements s {
    private List<ao> fcP;
    private List<ar> feC;
    private w feD;
    private ah feE;
    private ah feF;
    private aw feG;
    private boolean feH;
    private boolean feI;
    private boolean feJ;
    private boolean feK;
    private boolean feL;
    private boolean feM;
    private boolean feN;
    private boolean feO;
    private boolean feP;
    private boolean feQ;
    private Collection<? extends s> feR;
    private volatile kotlin.jvm.a.a<Collection<s>> feS;
    private final s feT;
    private final Kind feU;
    private s feV;
    protected Map<kotlin.reflect.jvm.internal.impl.descriptors.a.a<?>, Object> feW;
    private boolean fek;
    private Modality fel;
    private boolean isActual;

    /* compiled from: FunctionDescriptorImpl */
    public class a implements kotlin.reflect.jvm.internal.impl.descriptors.s.a<s> {
        protected f fdP;
        protected ah feF;
        private boolean feM;
        private boolean feN;
        protected s feT;
        protected Kind feU;
        private Map<kotlin.reflect.jvm.internal.impl.descriptors.a.a<?>, Object> feW;
        final /* synthetic */ p feY;
        protected as feZ;
        protected k ffa;
        protected Modality ffb;
        protected aw ffc;
        protected List<ar> ffd;
        protected ah ffe;
        protected w fff;
        protected boolean ffg;
        protected boolean ffh;
        protected boolean ffi;
        protected boolean ffj;
        private List<ao> ffk;
        private kotlin.reflect.jvm.internal.impl.descriptors.annotations.f ffl;
        private Boolean ffm;
        protected boolean ffn;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str;
            int i2;
            IllegalArgumentException illegalStateException;
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 13:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newReturnType";
                    break;
                case 7:
                    objArr[0] = "owner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    objArr[0] = str2;
                    break;
                case 9:
                    objArr[0] = "modality";
                    break;
                case 11:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = ConditionalUserProperty.NAME;
                    break;
                case 18:
                case 20:
                    objArr[0] = "parameters";
                    break;
                case 22:
                    objArr[0] = "type";
                    break;
                case 32:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 36:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            String str3 = "putUserData";
            String str4 = "setSubstitution";
            String str5 = "setAdditionalAnnotations";
            String str6 = "setReturnType";
            String str7 = "setTypeParameters";
            String str8 = "setValueParameters";
            String str9 = "setName";
            String str10 = "setKind";
            String str11 = "setVisibility";
            String str12 = "setModality";
            String str13 = "setOwner";
            switch (i) {
                case 8:
                    objArr[1] = str13;
                    break;
                case 10:
                    objArr[1] = str12;
                    break;
                case 12:
                    objArr[1] = str11;
                    break;
                case 14:
                    objArr[1] = str10;
                    break;
                case 15:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 17:
                    objArr[1] = str9;
                    break;
                case 19:
                    objArr[1] = str8;
                    break;
                case 21:
                    objArr[1] = str7;
                    break;
                case 23:
                    objArr[1] = str6;
                    break;
                case 24:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 25:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 26:
                    objArr[1] = "setOriginal";
                    break;
                case 27:
                    objArr[1] = "setSignatureChange";
                    break;
                case 28:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 29:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 30:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 31:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 33:
                    objArr[1] = str5;
                    break;
                case 35:
                    objArr[1] = str4;
                    break;
                case 37:
                    objArr[1] = str3;
                    break;
                case 38:
                    objArr[1] = "getSubstitution";
                    break;
                case 39:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
            switch (i) {
                case 7:
                    objArr[2] = str13;
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    break;
                case 9:
                    objArr[2] = str12;
                    break;
                case 11:
                    objArr[2] = str11;
                    break;
                case 13:
                    objArr[2] = str10;
                    break;
                case 16:
                    objArr[2] = str9;
                    break;
                case 18:
                    objArr[2] = str8;
                    break;
                case 20:
                    objArr[2] = str7;
                    break;
                case 22:
                    objArr[2] = str6;
                    break;
                case 32:
                    objArr[2] = str5;
                    break;
                case 34:
                    objArr[2] = str4;
                    break;
                case 36:
                    objArr[2] = str3;
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            str = String.format(str, objArr);
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    illegalStateException = new IllegalStateException(str);
                    break;
                default:
                    illegalStateException = new IllegalArgumentException(str);
                    break;
            }
            throw illegalStateException;
        }

        public a(p pVar, as asVar, k kVar, Modality modality, aw awVar, Kind kind, List<ar> list, ah ahVar, w wVar, f fVar) {
            if (asVar == null) {
                $$$reportNull$$$0(0);
            }
            if (kVar == null) {
                $$$reportNull$$$0(1);
            }
            if (modality == null) {
                $$$reportNull$$$0(2);
            }
            if (awVar == null) {
                $$$reportNull$$$0(3);
            }
            if (kind == null) {
                $$$reportNull$$$0(4);
            }
            if (list == null) {
                $$$reportNull$$$0(5);
            }
            if (wVar == null) {
                $$$reportNull$$$0(6);
            }
            this.feY = pVar;
            this.feT = null;
            this.feF = this.feY.feF;
            this.ffg = true;
            this.ffh = false;
            this.ffi = false;
            this.ffj = false;
            this.feM = this.feY.btk();
            this.ffk = null;
            this.ffl = null;
            this.feN = this.feY.btn();
            this.feW = new LinkedHashMap();
            this.ffm = null;
            this.ffn = false;
            this.feZ = asVar;
            this.ffa = kVar;
            this.ffb = modality;
            this.ffc = awVar;
            this.feU = kind;
            this.ffd = list;
            this.ffe = ahVar;
            this.fff = wVar;
            this.fdP = fVar;
        }

        /* renamed from: n */
        public a i(k kVar) {
            if (kVar == null) {
                $$$reportNull$$$0(7);
            }
            this.ffa = kVar;
            return this;
        }

        /* renamed from: b */
        public a a(Modality modality) {
            if (modality == null) {
                $$$reportNull$$$0(9);
            }
            this.ffb = modality;
            return this;
        }

        /* renamed from: e */
        public a a(aw awVar) {
            if (awVar == null) {
                $$$reportNull$$$0(11);
            }
            this.ffc = awVar;
            return this;
        }

        /* renamed from: b */
        public a a(Kind kind) {
            if (kind == null) {
                $$$reportNull$$$0(13);
            }
            this.feU = kind;
            return this;
        }

        /* renamed from: gD */
        public a gq(boolean z) {
            this.ffg = z;
            return this;
        }

        /* renamed from: i */
        public a e(f fVar) {
            if (fVar == null) {
                $$$reportNull$$$0(16);
            }
            this.fdP = fVar;
            return this;
        }

        /* renamed from: ce */
        public a cb(List<ar> list) {
            if (list == null) {
                $$$reportNull$$$0(18);
            }
            this.ffd = list;
            return this;
        }

        /* renamed from: R */
        public a N(w wVar) {
            if (wVar == null) {
                $$$reportNull$$$0(22);
            }
            this.fff = wVar;
            return this;
        }

        /* renamed from: c */
        public a a(ah ahVar) {
            this.ffe = ahVar;
            return this;
        }

        /* renamed from: d */
        public a b(ah ahVar) {
            this.feF = ahVar;
            return this;
        }

        public a h(CallableMemberDescriptor callableMemberDescriptor) {
            this.feT = (s) callableMemberDescriptor;
            return this;
        }

        /* renamed from: buB */
        public a btq() {
            this.ffh = true;
            return this;
        }

        /* renamed from: buC */
        public a btr() {
            this.ffi = true;
            return this;
        }

        /* renamed from: buD */
        public a bts() {
            this.ffj = true;
            return this;
        }

        /* renamed from: buE */
        public a btt() {
            this.feM = true;
            return this;
        }

        /* renamed from: buF */
        public a btu() {
            this.feN = true;
            return this;
        }

        /* renamed from: d */
        public a a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar) {
            if (fVar == null) {
                $$$reportNull$$$0(32);
            }
            this.ffl = fVar;
            return this;
        }

        public a gE(boolean z) {
            this.ffm = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: c */
        public a b(as asVar) {
            if (asVar == null) {
                $$$reportNull$$$0(34);
            }
            this.feZ = asVar;
            return this;
        }

        public s btv() {
            return this.feY.a(this);
        }

        public a gF(boolean z) {
            this.ffn = z;
            return this;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "typeParameters";
                break;
            case 6:
            case 27:
            case 29:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 7:
            case 9:
                objArr[0] = "visibility";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
                objArr[0] = str2;
                break;
            case 10:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 11:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
            case 28:
            case 30:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "newCopyBuilder";
        String str4 = "initialize";
        switch (i) {
            case 8:
                objArr[1] = str4;
                break;
            case 12:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 13:
                objArr[1] = "getModality";
                break;
            case 14:
                objArr[1] = "getVisibility";
                break;
            case 16:
                objArr[1] = "getTypeParameters";
                break;
            case 17:
                objArr[1] = "getValueParameters";
                break;
            case 18:
                objArr[1] = "getOriginal";
                break;
            case 19:
                objArr[1] = "getKind";
                break;
            case 21:
            case 23:
                objArr[1] = str3;
                break;
            case 25:
                objArr[1] = "copy";
                break;
            case 26:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
                objArr[2] = str4;
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setReturnType";
                break;
            case 11:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = str3;
                break;
            case 24:
                objArr[2] = "doSubstitute";
                break;
            case 27:
            case 28:
            case 29:
            case 30:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
    }

    public abstract p a(k kVar, s sVar, Kind kind, f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar2, aj ajVar);

    protected p(k kVar, s sVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, f fVar2, Kind kind, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(2);
        }
        if (kind == null) {
            $$$reportNull$$$0(3);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(4);
        }
        super(kVar, fVar, fVar2, ajVar);
        this.feG = av.fdi;
        this.feH = false;
        this.feI = false;
        this.fek = false;
        this.feJ = false;
        this.feK = false;
        this.feL = false;
        this.isActual = false;
        this.feM = false;
        this.feN = false;
        this.feO = false;
        this.feP = true;
        this.feQ = false;
        this.feR = null;
        this.feS = null;
        this.feV = null;
        this.feW = null;
        if (sVar == null) {
            sVar = this;
        }
        this.feT = sVar;
        this.feU = kind;
    }

    public p a(ah ahVar, ah ahVar2, List<? extends ao> list, List<ar> list2, w wVar, Modality modality, aw awVar) {
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        if (list2 == null) {
            $$$reportNull$$$0(6);
        }
        if (awVar == null) {
            $$$reportNull$$$0(7);
        }
        this.fcP = u.T(list);
        this.feC = u.T(list2);
        this.feD = wVar;
        this.fel = modality;
        this.feG = awVar;
        this.feE = ahVar;
        this.feF = ahVar2;
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = " but position is ";
            if (i2 < list.size()) {
                ao aoVar = (ao) list.get(i2);
                if (aoVar.getIndex() == i2) {
                    i2++;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(aoVar);
                    stringBuilder.append(" index is ");
                    stringBuilder.append(aoVar.getIndex());
                    stringBuilder.append(str);
                    stringBuilder.append(i2);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            while (i < list2.size()) {
                ar arVar = (ar) list2.get(i);
                if (arVar.getIndex() == i + 0) {
                    i++;
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(arVar);
                    stringBuilder2.append("index is ");
                    stringBuilder2.append(arVar.getIndex());
                    stringBuilder2.append(str);
                    stringBuilder2.append(i);
                    throw new IllegalStateException(stringBuilder2.toString());
                }
            }
            return this;
        }
    }

    public void d(aw awVar) {
        if (awVar == null) {
            $$$reportNull$$$0(9);
        }
        this.feG = awVar;
    }

    public void gr(boolean z) {
        this.feH = z;
    }

    public void gs(boolean z) {
        this.feI = z;
    }

    public void gt(boolean z) {
        this.fek = z;
    }

    public void gu(boolean z) {
        this.feJ = z;
    }

    public void gv(boolean z) {
        this.feK = z;
    }

    public void gw(boolean z) {
        this.feL = z;
    }

    public void gx(boolean z) {
        this.isActual = z;
    }

    private void gy(boolean z) {
        this.feM = z;
    }

    private void gz(boolean z) {
        this.feN = z;
    }

    public void gA(boolean z) {
        this.feO = z;
    }

    public void Q(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(10);
        }
        w wVar2 = this.feD;
        this.feD = wVar;
    }

    public void gB(boolean z) {
        this.feP = z;
    }

    public void gC(boolean z) {
        this.feQ = z;
    }

    public ah bsK() {
        return this.feE;
    }

    public ah bsL() {
        return this.feF;
    }

    public Collection<? extends s> bsR() {
        buz();
        Collection<? extends s> collection = this.feR;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            $$$reportNull$$$0(12);
        }
        return collection;
    }

    private void buz() {
        kotlin.jvm.a.a aVar = this.feS;
        if (aVar != null) {
            this.feR = (Collection) aVar.invoke();
            this.feS = null;
        }
    }

    public Modality bru() {
        Modality modality = this.fel;
        if (modality == null) {
            $$$reportNull$$$0(13);
        }
        return modality;
    }

    public aw brx() {
        aw awVar = this.feG;
        if (awVar == null) {
            $$$reportNull$$$0(14);
        }
        return awVar;
    }

    public boolean btl() {
        if (this.feH) {
            return true;
        }
        for (s btl : bul().bsR()) {
            if (btl.btl()) {
                return true;
            }
        }
        return false;
    }

    public boolean btm() {
        if (this.feI) {
            return true;
        }
        for (s btm : bul().bsR()) {
            if (btm.btm()) {
                return true;
            }
        }
        return false;
    }

    public boolean brD() {
        return this.fek;
    }

    public boolean brA() {
        return this.feJ;
    }

    public boolean brV() {
        return this.feK;
    }

    public boolean bto() {
        return this.feO;
    }

    public boolean brB() {
        return this.feL;
    }

    public boolean brC() {
        return this.isActual;
    }

    public <V> V a(kotlin.reflect.jvm.internal.impl.descriptors.a.a<V> aVar) {
        Map map = this.feW;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public boolean btk() {
        return this.feM;
    }

    public void K(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(15);
        }
        this.feR = collection;
        for (s btn : this.feR) {
            if (btn.btn()) {
                this.feN = true;
                return;
            }
        }
    }

    public List<ao> bsM() {
        List list = this.fcP;
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        return list;
    }

    public List<ar> bsP() {
        List list = this.feC;
        if (list == null) {
            $$$reportNull$$$0(17);
        }
        return list;
    }

    public boolean buA() {
        return this.feP;
    }

    public boolean bsQ() {
        return this.feQ;
    }

    public w bsN() {
        return this.feD;
    }

    /* renamed from: bti */
    public s bul() {
        p pVar = this.feT;
        s bti = pVar == this ? this : pVar.bti();
        if (bti == null) {
            $$$reportNull$$$0(18);
        }
        return bti;
    }

    public Kind bsT() {
        Kind kind = this.feU;
        if (kind == null) {
            $$$reportNull$$$0(19);
        }
        return kind;
    }

    /* renamed from: c */
    public s f(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(20);
        }
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        return h(typeSubstitutor).h(bul()).gF(true).btv();
    }

    public boolean btn() {
        return this.feN;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.s.a<? extends s> btp() {
        a h = h(TypeSubstitutor.fxB);
        if (h == null) {
            $$$reportNull$$$0(21);
        }
        return h;
    }

    /* Access modifiers changed, original: protected */
    public a h(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(22);
        }
        return new a(this, typeSubstitutor.bPG(), brj(), bru(), brx(), bsT(), bsP(), bsK(), bsN(), null);
    }

    /* Access modifiers changed, original: protected */
    public s a(a aVar) {
        a aVar2 = aVar;
        if (aVar2 == null) {
            $$$reportNull$$$0(24);
        }
        boolean[] zArr = new boolean[1];
        p a = a(aVar2.ffa, aVar2.feT, aVar2.feU, aVar2.fdP, aVar.ffl != null ? h.a(brE(), aVar.ffl) : brE(), a(aVar2.ffi, aVar2.feT));
        List bsM = aVar.ffk == null ? bsM() : aVar.ffk;
        zArr[0] = zArr[0] | (bsM.isEmpty() ^ 1);
        ArrayList arrayList = new ArrayList(bsM.size());
        TypeSubstitutor a2 = kotlin.reflect.jvm.internal.impl.types.k.a(bsM, aVar2.feZ, a, arrayList, zArr);
        if (a2 == null) {
            return null;
        }
        ac acVar;
        ah ahVar;
        if (aVar2.ffe != null) {
            w c = a2.c(aVar2.ffe.bpT(), Variance.IN_VARIANCE);
            if (c == null) {
                return null;
            }
            ac acVar2 = new ac(a, new b(a, c, aVar2.ffe.btM()), aVar2.ffe.brE());
            zArr[0] = (c != aVar2.ffe.bpT() ? 1 : 0) | zArr[0];
            acVar = acVar2;
        } else {
            acVar = null;
        }
        if (aVar2.feF != null) {
            ah e = aVar2.feF.e(a2);
            if (e == null) {
                return null;
            }
            zArr[0] = zArr[0] | (e != aVar2.feF ? 1 : 0);
            ahVar = e;
        } else {
            ahVar = null;
        }
        bsM = a((s) a, aVar2.ffd, a2, aVar2.ffj, aVar2.ffi, zArr);
        if (bsM == null) {
            return null;
        }
        w c2 = a2.c(aVar2.fff, Variance.OUT_VARIANCE);
        if (c2 == null) {
            return null;
        }
        zArr[0] = zArr[0] | (c2 != aVar2.fff ? 1 : 0);
        if (!zArr[0] && aVar2.ffn) {
            return this;
        }
        final TypeSubstitutor typeSubstitutor = a2;
        a.a(acVar, ahVar, arrayList, bsM, c2, aVar2.ffb, aVar2.ffc);
        a.gr(this.feH);
        a.gs(this.feI);
        a.gt(this.fek);
        a.gu(this.feJ);
        a.gv(this.feK);
        a.gA(this.feO);
        a.gw(this.feL);
        a.gx(this.isActual);
        a.gB(this.feP);
        a.gy(aVar.feM);
        a.gz(aVar.feN);
        a.gC(aVar.ffm != null ? aVar.ffm.booleanValue() : this.feQ);
        if (!(aVar.feW.isEmpty() && this.feW == null)) {
            Map g = aVar.feW;
            Map map = this.feW;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    if (!g.containsKey(entry.getKey())) {
                        g.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (g.size() == 1) {
                a.feW = Collections.singletonMap(g.keySet().iterator().next(), g.values().iterator().next());
            } else {
                a.feW = g;
            }
        }
        if (aVar2.ffh || btj() != null) {
            a.g((btj() != null ? btj() : this).c(typeSubstitutor));
        }
        if (aVar2.ffg && !bul().bsR().isEmpty()) {
            if (aVar2.feZ.isEmpty()) {
                kotlin.jvm.a.a aVar3 = this.feS;
                if (aVar3 != null) {
                    a.feS = aVar3;
                } else {
                    a.K(bsR());
                }
            } else {
                a.feS = new kotlin.jvm.a.a<Collection<s>>() {
                    /* renamed from: boS */
                    public Collection<s> invoke() {
                        kotlin.reflect.jvm.internal.impl.utils.h hVar = new kotlin.reflect.jvm.internal.impl.utils.h();
                        for (s c : p.this.bsR()) {
                            hVar.add(c.c(typeSubstitutor));
                        }
                        return hVar;
                    }
                };
            }
        }
        return a;
    }

    /* renamed from: c */
    public s a(k kVar, Modality modality, aw awVar, Kind kind, boolean z) {
        s btv = btp().i(kVar).a(modality).a(awVar).a(kind).gq(z).btv();
        if (btv == null) {
            $$$reportNull$$$0(25);
        }
        return btv;
    }

    private aj a(boolean z, s sVar) {
        aj brF;
        if (z) {
            if (sVar == null) {
                sVar = bul();
            }
            brF = sVar.brF();
        } else {
            brF = aj.fcV;
        }
        if (brF == null) {
            $$$reportNull$$$0(26);
        }
        return brF;
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        return mVar.a((s) this, (Object) d);
    }

    public static List<ar> a(s sVar, List<ar> list, TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            $$$reportNull$$$0(27);
        }
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(28);
        }
        return a(sVar, (List) list, typeSubstitutor, false, false, null);
    }

    public static List<ar> a(s sVar, List<ar> list, TypeSubstitutor typeSubstitutor, boolean z, boolean z2, boolean[] zArr) {
        TypeSubstitutor typeSubstitutor2 = typeSubstitutor;
        if (list == null) {
            $$$reportNull$$$0(29);
        }
        if (typeSubstitutor2 == null) {
            $$$reportNull$$$0(30);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ar arVar : list) {
            w wVar;
            w c = typeSubstitutor2.c(arVar.bpT(), Variance.IN_VARIANCE);
            w btS = arVar.btS();
            if (btS == null) {
                wVar = null;
            } else {
                wVar = typeSubstitutor2.c(btS, Variance.IN_VARIANCE);
            }
            if (c == null) {
                return null;
            }
            if (!((c == arVar.bpT() && btS == wVar) || zArr == null)) {
                zArr[0] = true;
            }
            arrayList.add(new ai(sVar, z ? null : arVar, arVar.getIndex(), arVar.brE(), arVar.bsZ(), c, arVar.btR(), arVar.btU(), arVar.btV(), wVar, z2 ? arVar.brF() : aj.fcV));
        }
        return arrayList;
    }

    public s btj() {
        return this.feV;
    }

    private void g(s sVar) {
        this.feV = sVar;
    }

    public <V> void a(kotlin.reflect.jvm.internal.impl.descriptors.a.a<V> aVar, Object obj) {
        if (this.feW == null) {
            this.feW = new LinkedHashMap();
        }
        this.feW.put(aVar, obj);
    }
}
