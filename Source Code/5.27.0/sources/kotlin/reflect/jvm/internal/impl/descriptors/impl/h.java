package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.e;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: ClassDescriptorImpl */
public class h extends g {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Modality fel;
    private final ClassKind fem;
    private final an fen;
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.h feo;
    private Set<c> fep;
    private c feq;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
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
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
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
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 13:
                objArr[1] = "getStaticScope";
                break;
            case 14:
                objArr[1] = "getKind";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 17:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 18:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
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

    public boolean bry() {
        return false;
    }

    public boolean brz() {
        return false;
    }

    public h(k kVar, f fVar, Modality modality, ClassKind classKind, Collection<w> collection, aj ajVar, boolean z, kotlin.reflect.jvm.internal.impl.storage.h hVar) {
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        if (modality == null) {
            $$$reportNull$$$0(2);
        }
        if (classKind == null) {
            $$$reportNull$$$0(3);
        }
        if (collection == null) {
            $$$reportNull$$$0(4);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(5);
        }
        if (hVar == null) {
            $$$reportNull$$$0(6);
        }
        super(hVar, kVar, fVar, ajVar, z);
        this.fel = modality;
        this.fem = classKind;
        this.fen = new e(this, Collections.emptyList(), collection, hVar);
    }

    public final void a(kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, Set<c> set, c cVar) {
        if (hVar == null) {
            $$$reportNull$$$0(7);
        }
        if (set == null) {
            $$$reportNull$$$0(8);
        }
        this.feo = hVar;
        this.fep = set;
        this.feq = cVar;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f bug = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug();
        if (bug == null) {
            $$$reportNull$$$0(9);
        }
        return bug;
    }

    public an brm() {
        an anVar = this.fen;
        if (anVar == null) {
            $$$reportNull$$$0(10);
        }
        return anVar;
    }

    public Collection<c> brs() {
        Set set = this.fep;
        if (set == null) {
            $$$reportNull$$$0(11);
        }
        return set;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h bro() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = this.feo;
        if (hVar == null) {
            $$$reportNull$$$0(12);
        }
        return hVar;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h brl() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c cVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c.fuD;
        if (cVar == null) {
            $$$reportNull$$$0(13);
        }
        return cVar;
    }

    public ClassKind brt() {
        ClassKind classKind = this.fem;
        if (classKind == null) {
            $$$reportNull$$$0(14);
        }
        return classKind;
    }

    public c brw() {
        return this.feq;
    }

    public Modality bru() {
        Modality modality = this.fel;
        if (modality == null) {
            $$$reportNull$$$0(15);
        }
        return modality;
    }

    public aw brx() {
        aw awVar = av.fde;
        if (awVar == null) {
            $$$reportNull$$$0(16);
        }
        return awVar;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("class ");
        stringBuilder.append(bsZ());
        return stringBuilder.toString();
    }

    public List<ao> brI() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(17);
        }
        return emptyList;
    }

    public Collection<d> brH() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(18);
        }
        return emptyList;
    }
}
