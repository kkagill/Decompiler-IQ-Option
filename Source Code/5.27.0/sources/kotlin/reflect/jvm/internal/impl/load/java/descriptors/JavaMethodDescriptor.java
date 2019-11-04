package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.resolve.b;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.util.i;

public class JavaMethodDescriptor extends ad implements b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final a<ar> fit = new a<ar>() {
    };
    private ParameterNamesStatus fiu;

    private enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        
        public final boolean isStable;
        public final boolean isSynthesized;

        private ParameterNamesStatus(boolean z, boolean z2) {
            this.isStable = z;
            this.isSynthesized = z2;
        }

        public static ParameterNamesStatus get(boolean z, boolean z2) {
            ParameterNamesStatus parameterNamesStatus = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (parameterNamesStatus == null) {
                $$$reportNull$$$0(0);
            }
            return parameterNamesStatus;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 9 || i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 9 || i == 13 || i == 18 || i == 21) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 9:
            case 13:
            case 18:
            case 21:
                objArr[0] = str2;
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "enhance";
        String str4 = "createSubstitutedCopy";
        String str5 = "initialize";
        String str6 = "createJavaMethod";
        if (i == 9) {
            objArr[1] = str6;
        } else if (i == 13) {
            objArr[1] = str5;
        } else if (i == 18) {
            objArr[1] = str4;
        } else if (i != 21) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = str6;
                break;
            case 9:
            case 13:
            case 18:
            case 21:
                break;
            case 10:
            case 11:
            case 12:
                objArr[2] = str5;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = str4;
                break;
            case 19:
            case 20:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 9 || i == 13 || i == 18 || i == 21) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    protected JavaMethodDescriptor(k kVar, ai aiVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, Kind kind, aj ajVar) {
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
        super(kVar, aiVar, fVar, fVar2, kind, ajVar);
        this.fiu = null;
    }

    public static JavaMethodDescriptor a(k kVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(5);
        }
        if (fVar == null) {
            $$$reportNull$$$0(6);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(7);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(8);
        }
        return new JavaMethodDescriptor(kVar, null, fVar, fVar2, Kind.DECLARATION, ajVar);
    }

    public ad a(ah ahVar, ah ahVar2, List<? extends ao> list, List<ar> list2, w wVar, Modality modality, aw awVar, Map<? extends a<?>, ?> map) {
        if (list == null) {
            $$$reportNull$$$0(10);
        }
        if (list2 == null) {
            $$$reportNull$$$0(11);
        }
        if (awVar == null) {
            $$$reportNull$$$0(12);
        }
        ad a = super.a(ahVar, ahVar2, list, list2, wVar, modality, awVar, map);
        gr(i.fyC.m(a).isSuccess());
        if (a == null) {
            $$$reportNull$$$0(13);
        }
        return a;
    }

    public boolean buA() {
        return this.fiu.isStable;
    }

    public boolean bsQ() {
        return this.fiu.isSynthesized;
    }

    public void q(boolean z, boolean z2) {
        this.fiu = ParameterNamesStatus.get(z, z2);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: e */
    public JavaMethodDescriptor a(k kVar, s sVar, Kind kind, kotlin.reflect.jvm.internal.impl.name.f fVar, f fVar2, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(14);
        }
        if (kind == null) {
            $$$reportNull$$$0(15);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(16);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(17);
        }
        ai aiVar = (ai) sVar;
        if (fVar == null) {
            fVar = bsZ();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(kVar, aiVar, fVar2, fVar, kind, ajVar);
        javaMethodDescriptor.q(buA(), bsQ());
        return javaMethodDescriptor;
    }

    /* renamed from: c */
    public JavaMethodDescriptor a(w wVar, List<i> list, w wVar2, Pair<a<?>, ?> pair) {
        ah ahVar;
        if (list == null) {
            $$$reportNull$$$0(19);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(20);
        }
        List a = h.a(list, bsP(), this);
        if (wVar == null) {
            ahVar = null;
        } else {
            ahVar = b.a((kotlin.reflect.jvm.internal.impl.descriptors.a) this, wVar, f.fdA.bug());
        }
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) btp().cb(a).N(wVar2).a(ahVar).bts().btr().btv();
        if (pair != null) {
            javaMethodDescriptor.a((a) pair.getFirst(), pair.bni());
        }
        if (javaMethodDescriptor == null) {
            $$$reportNull$$$0(21);
        }
        return javaMethodDescriptor;
    }
}
