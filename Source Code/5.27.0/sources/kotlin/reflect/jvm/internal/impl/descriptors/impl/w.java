package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.e;

/* compiled from: MutableClassDescriptor */
public class w extends g {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final h eZz;
    private List<ao> fcP;
    private final boolean fcR;
    private aw feG;
    private Modality fel;
    private final ClassKind fem;
    private an fen;
    private final Collection<kotlin.reflect.jvm.internal.impl.types.w> ffI;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[0] = str2;
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 16:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 17:
                objArr[1] = "getStaticScope";
                break;
            case 18:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
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

    public d brq() {
        return null;
    }

    public c brw() {
        return null;
    }

    public boolean bry() {
        return false;
    }

    public w(k kVar, ClassKind classKind, boolean z, boolean z2, f fVar, aj ajVar, h hVar) {
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (classKind == null) {
            $$$reportNull$$$0(1);
        }
        if (fVar == null) {
            $$$reportNull$$$0(2);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(3);
        }
        if (hVar == null) {
            $$$reportNull$$$0(4);
        }
        super(hVar, kVar, fVar, ajVar, z2);
        this.ffI = new ArrayList();
        this.eZz = hVar;
        this.fem = classKind;
        this.fcR = z;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f bug = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug();
        if (bug == null) {
            $$$reportNull$$$0(5);
        }
        return bug;
    }

    public void c(Modality modality) {
        if (modality == null) {
            $$$reportNull$$$0(6);
        }
        this.fel = modality;
    }

    public Modality bru() {
        Modality modality = this.fel;
        if (modality == null) {
            $$$reportNull$$$0(7);
        }
        return modality;
    }

    public ClassKind brt() {
        ClassKind classKind = this.fem;
        if (classKind == null) {
            $$$reportNull$$$0(8);
        }
        return classKind;
    }

    public void d(aw awVar) {
        if (awVar == null) {
            $$$reportNull$$$0(9);
        }
        this.feG = awVar;
    }

    public aw brx() {
        aw awVar = this.feG;
        if (awVar == null) {
            $$$reportNull$$$0(10);
        }
        return awVar;
    }

    public boolean brz() {
        return this.fcR;
    }

    public an brm() {
        an anVar = this.fen;
        if (anVar == null) {
            $$$reportNull$$$0(11);
        }
        return anVar;
    }

    /* renamed from: buR */
    public Set<c> brs() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            $$$reportNull$$$0(13);
        }
        return emptySet;
    }

    public void cg(List<ao> list) {
        if (list == null) {
            $$$reportNull$$$0(14);
        }
        if (this.fcP == null) {
            this.fcP = new ArrayList(list);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type parameters are already set for ");
        stringBuilder.append(bsZ());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public List<ao> brI() {
        List list = this.fcP;
        if (list == null) {
            $$$reportNull$$$0(15);
        }
        return list;
    }

    public void buS() {
        this.fen = new e(this, this.fcP, this.ffI, this.eZz);
        for (c cVar : brs()) {
            ((f) cVar).Q(bsY());
        }
    }

    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h bro() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c cVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c.fuD;
        if (cVar == null) {
            $$$reportNull$$$0(16);
        }
        return cVar;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h brl() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c cVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c.fuD;
        if (cVar == null) {
            $$$reportNull$$$0(17);
        }
        return cVar;
    }

    public Collection<d> brH() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(18);
        }
        return emptyList;
    }

    public String toString() {
        return j.m(this);
    }
}
