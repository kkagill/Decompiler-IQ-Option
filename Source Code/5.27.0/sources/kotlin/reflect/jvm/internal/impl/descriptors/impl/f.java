package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* compiled from: ClassConstructorDescriptorImpl */
public class f extends p implements c {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final kotlin.reflect.jvm.internal.impl.name.f fei = kotlin.reflect.jvm.internal.impl.name.f.mu("<init>");
    protected final boolean feh;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalArgumentException;
        if (!(i == 7 || i == 11 || i == 21 || i == 27 || i == 28)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 7 || i == 11 || i == 21 || i == 27 || i == 28)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
            case 26:
                objArr[0] = "source";
                break;
            case 7:
            case 11:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
            case 28:
                objArr[0] = str2;
                break;
            case 12:
            case 15:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 13:
            case 16:
                objArr[0] = "visibility";
                break;
            case 14:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createSubstitutedCopy";
        String str4 = "createSynthesized";
        String str5 = "create";
        if (i == 7) {
            objArr[1] = str5;
        } else if (i == 11) {
            objArr[1] = str4;
        } else if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 27) {
            objArr[1] = str3;
        } else if (i != 28) {
            switch (i) {
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = str5;
                break;
            case 7:
            case 11:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
            case 28:
                break;
            case 8:
            case 9:
            case 10:
                objArr[2] = str4;
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "initialize";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        if (!(i == 7 || i == 11 || i == 21 || i == 27 || i == 28)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    illegalArgumentException = new IllegalArgumentException(str);
                    break;
            }
        }
        illegalArgumentException = new IllegalStateException(str);
        throw illegalArgumentException;
    }

    public void K(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(22);
        }
    }

    protected f(d dVar, j jVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, boolean z, Kind kind, aj ajVar) {
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
        super(dVar, jVar, fVar, fei, kind, ajVar);
        this.feh = z;
    }

    public static f a(d dVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, boolean z, aj ajVar) {
        if (dVar == null) {
            $$$reportNull$$$0(4);
        }
        if (fVar == null) {
            $$$reportNull$$$0(5);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(6);
        }
        return new f(dVar, null, fVar, z, Kind.DECLARATION, ajVar);
    }

    public f a(List<ar> list, aw awVar, List<ao> list2) {
        if (list == null) {
            $$$reportNull$$$0(12);
        }
        if (awVar == null) {
            $$$reportNull$$$0(13);
        }
        if (list2 == null) {
            $$$reportNull$$$0(14);
        }
        super.a(null, but(), list2, list, null, Modality.FINAL, awVar);
        return this;
    }

    public f a(List<ar> list, aw awVar) {
        if (list == null) {
            $$$reportNull$$$0(15);
        }
        if (awVar == null) {
            $$$reportNull$$$0(16);
        }
        a(list, awVar, btg().brI());
        return this;
    }

    public ah but() {
        d buu = btg();
        if (buu.brz()) {
            k brj = buu.brj();
            if (brj instanceof d) {
                return ((d) brj).bte();
            }
        }
        return null;
    }

    /* renamed from: buu */
    public d btg() {
        d dVar = (d) super.brj();
        if (dVar == null) {
            $$$reportNull$$$0(17);
        }
        return dVar;
    }

    public d bth() {
        d buu = btg();
        if (buu == null) {
            $$$reportNull$$$0(18);
        }
        return buu;
    }

    /* renamed from: btc */
    public c bul() {
        c cVar = (c) super.bul();
        if (cVar == null) {
            $$$reportNull$$$0(19);
        }
        return cVar;
    }

    /* renamed from: a */
    public c f(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(20);
        }
        return (c) super.f(typeSubstitutor);
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        return mVar.a((j) this, (Object) d);
    }

    public boolean isPrimary() {
        return this.feh;
    }

    public Collection<? extends s> bsR() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            $$$reportNull$$$0(21);
        }
        return emptySet;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: b */
    public f a(k kVar, s sVar, Kind kind, kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar2, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(23);
        }
        if (kind == null) {
            $$$reportNull$$$0(24);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(25);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(26);
        }
        if (kind == Kind.DECLARATION || kind == Kind.SYNTHESIZED) {
            return new f((d) kVar, this, fVar2, this.feh, Kind.DECLARATION, ajVar);
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

    /* renamed from: b */
    public c c(k kVar, Modality modality, aw awVar, Kind kind, boolean z) {
        c cVar = (c) super.a(kVar, modality, awVar, kind, z);
        if (cVar == null) {
            $$$reportNull$$$0(28);
        }
        return cVar;
    }
}
