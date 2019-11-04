package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.a.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.resolve.b;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: JavaClassConstructorDescriptor */
public class c extends f implements b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Boolean fir;
    private Boolean fis;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 7 || i == 12 || i == 17 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 7 || i == 12 || i == 17 || i == 20) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        switch (i) {
            case 1:
            case 5:
            case 10:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
            case 14:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 11:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
            case 17:
            case 20:
                objArr[0] = str2;
                break;
            case 8:
            case 13:
                objArr[0] = "newOwner";
                break;
            case 15:
                objArr[0] = "sourceElement";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "enhance";
        String str4 = "createDescriptor";
        String str5 = "createSubstitutedCopy";
        String str6 = "createJavaConstructor";
        if (i == 7) {
            objArr[1] = str6;
        } else if (i == 12) {
            objArr[1] = str5;
        } else if (i == 17) {
            objArr[1] = str4;
        } else if (i != 20) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = str6;
                break;
            case 7:
            case 12:
            case 17:
            case 20:
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = str5;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = str4;
                break;
            case 18:
            case 19:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 7 || i == 12 || i == 17 || i == 20) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    protected c(d dVar, c cVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, boolean z, Kind kind, aj ajVar) {
        if (dVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        if (kind == null) {
            $$$reportNull$$$0(2);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(3);
        }
        super(dVar, cVar, fVar, z, kind, ajVar);
        this.fir = null;
        this.fis = null;
    }

    public static c b(d dVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, boolean z, aj ajVar) {
        if (dVar == null) {
            $$$reportNull$$$0(4);
        }
        if (fVar == null) {
            $$$reportNull$$$0(5);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(6);
        }
        return new c(dVar, null, fVar, z, Kind.DECLARATION, ajVar);
    }

    public boolean buA() {
        return this.fir.booleanValue();
    }

    public void gB(boolean z) {
        this.fir = Boolean.valueOf(z);
    }

    public boolean bsQ() {
        return this.fis.booleanValue();
    }

    public void gC(boolean z) {
        this.fis = Boolean.valueOf(z);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: d */
    public c b(k kVar, s sVar, Kind kind, kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar2, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(8);
        }
        if (kind == null) {
            $$$reportNull$$$0(9);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(10);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(11);
        }
        if (kind == Kind.DECLARATION || kind == Kind.SYNTHESIZED) {
            c a = a((d) kVar, (c) sVar, kind, ajVar, fVar2);
            a.gB(buA());
            a.gC(bsQ());
            if (a == null) {
                $$$reportNull$$$0(12);
            }
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        stringBuilder.append(this);
        String str = "\n";
        stringBuilder.append(str);
        stringBuilder.append("newOwner: ");
        stringBuilder.append(kVar);
        stringBuilder.append(str);
        stringBuilder.append("kind: ");
        stringBuilder.append(kind);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    public c a(d dVar, c cVar, Kind kind, aj ajVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar) {
        if (dVar == null) {
            $$$reportNull$$$0(13);
        }
        if (kind == null) {
            $$$reportNull$$$0(14);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(15);
        }
        if (fVar == null) {
            $$$reportNull$$$0(16);
        }
        return new c(dVar, cVar, fVar, this.feh, kind, ajVar);
    }

    /* renamed from: b */
    public c a(w wVar, List<i> list, w wVar2, Pair<a<?>, ?> pair) {
        ah ahVar;
        if (list == null) {
            $$$reportNull$$$0(18);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(19);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a d = b(btg(), null, bsT(), null, brE(), brF());
        if (wVar == null) {
            ahVar = null;
        } else {
            ahVar = b.a(d, wVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug());
        }
        d.a(ahVar, bsL(), bsM(), h.a(list, bsP(), d), wVar2, bru(), brx());
        if (pair != null) {
            d.a((a) pair.getFirst(), pair.bni());
        }
        if (d == null) {
            $$$reportNull$$$0(20);
        }
        return d;
    }
}
