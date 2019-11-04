package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ag;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ab;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.p;
import kotlin.reflect.jvm.internal.impl.resolve.b;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: JavaPropertyDescriptor */
public class e extends z implements b {
    private final boolean fiv;
    private final Pair<a<?>, ?> fiw;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 13 || i == 19 || i == 22) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 13 || i == 19 || i == 22) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
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
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            case 17:
                objArr[0] = "kind";
                break;
            case 13:
            case 19:
            case 22:
                objArr[0] = str2;
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 15:
                objArr[0] = "newModality";
                break;
            case 16:
                objArr[0] = "newVisibility";
                break;
            case 18:
                objArr[0] = "newName";
                break;
            case 20:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 21:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "enhance";
        String str4 = "createSubstitutedCopy";
        String str5 = "create";
        if (i == 13) {
            objArr[1] = str5;
        } else if (i == 19) {
            objArr[1] = str4;
        } else if (i != 22) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = str5;
                break;
            case 13:
            case 19:
            case 22:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = str4;
                break;
            case 20:
            case 21:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 13 || i == 19 || i == 22) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public boolean bsQ() {
        return false;
    }

    private e(k kVar, f fVar, Modality modality, aw awVar, boolean z, kotlin.reflect.jvm.internal.impl.name.f fVar2, aj ajVar, ae aeVar, Kind kind, boolean z2, Pair<a<?>, ?> pair) {
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        if (modality == null) {
            $$$reportNull$$$0(2);
        }
        if (awVar == null) {
            $$$reportNull$$$0(3);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(4);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(5);
        }
        if (kind == null) {
            $$$reportNull$$$0(6);
        }
        super(kVar, aeVar, fVar, modality, awVar, z, fVar2, kind, ajVar, false, false, false, false, false, false);
        this.fiv = z2;
        this.fiw = pair;
    }

    public static e a(k kVar, f fVar, Modality modality, aw awVar, boolean z, kotlin.reflect.jvm.internal.impl.name.f fVar2, aj ajVar, boolean z2) {
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
        if (ajVar == null) {
            $$$reportNull$$$0(12);
        }
        return new e(kVar, fVar, modality, awVar, z, fVar2, ajVar, null, Kind.DECLARATION, z2, null);
    }

    /* Access modifiers changed, original: protected */
    public z a(k kVar, Modality modality, aw awVar, ae aeVar, Kind kind, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (kVar == null) {
            $$$reportNull$$$0(14);
        }
        if (modality == null) {
            $$$reportNull$$$0(15);
        }
        if (awVar == null) {
            $$$reportNull$$$0(16);
        }
        if (kind == null) {
            $$$reportNull$$$0(17);
        }
        if (fVar == null) {
            $$$reportNull$$$0(18);
        }
        return new e(kVar, brE(), modality, awVar, btW(), fVar, aj.fcV, aeVar, kind, this.fiv, this.fiw);
    }

    public b a(w wVar, List<i> list, w wVar2, Pair<a<?>, ?> pair) {
        aa aaVar;
        ag agVar;
        w wVar3 = wVar;
        w wVar4 = wVar2;
        if (list == null) {
            $$$reportNull$$$0(20);
        }
        if (wVar4 == null) {
            $$$reportNull$$$0(21);
        }
        ah ahVar = null;
        e eVar = new e(brj(), brE(), bru(), brx(), btW(), bsZ(), brF(), bul() == this ? null : bul(), bsT(), this.fiv, pair);
        aa buU = btG();
        if (buU != null) {
            aaVar = r4;
            aa aaVar2 = new aa(eVar, buU.brE(), buU.bru(), buU.brx(), buU.isDefault(), buU.brD(), buU.brA(), bsT(), buU, buU.brF());
            aaVar.g(buU.btj());
            aaVar.S(wVar4);
        } else {
            aaVar = null;
        }
        ag btH = btH();
        if (btH != null) {
            ab abVar = r4;
            ab abVar2 = new ab(eVar, btH.brE(), btH.bru(), btH.brx(), btH.isDefault(), btH.brD(), btH.brA(), bsT(), btH, btH.brF());
            agVar = abVar;
            agVar.g(abVar.btj());
            agVar.c((ar) btH.bsP().get(0));
        } else {
            agVar = null;
        }
        eVar.a(aaVar, agVar, btK(), btL());
        eVar.gI(buV());
        if (this.fgo != null) {
            eVar.a(this.fgo);
        }
        eVar.K(bsR());
        wVar3 = wVar;
        if (wVar3 != null) {
            ahVar = b.a(this, wVar3, f.fdA.bug());
        }
        eVar.a(wVar4, bsM(), bsL(), ahVar);
        return eVar;
    }

    public boolean btY() {
        w bpT = bpT();
        return this.fiv && h.M(bpT) && (!p.ae(bpT) || g.I(bpT));
    }

    public <V> V a(a<V> aVar) {
        Pair pair = this.fiw;
        return (pair == null || !((a) pair.getFirst()).equals(aVar)) ? null : this.fiw.bni();
    }
}
