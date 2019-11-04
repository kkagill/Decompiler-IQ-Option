package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.l;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.au;

/* compiled from: AbstractClassDescriptor */
public abstract class a implements d {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final f fdP;
    protected final e<ad> fdQ;
    private final e<h> fdR;
    private final e<ah> fdS;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        switch (i) {
            case 1:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                objArr[0] = str2;
                break;
            case 6:
                objArr[0] = "typeArguments";
                break;
            case 9:
                objArr[0] = "typeSubstitution";
                break;
            case 12:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        String str3 = "substitute";
        String str4 = "getMemberScope";
        switch (i) {
            case 2:
                objArr[1] = "getName";
                break;
            case 3:
                objArr[1] = "getOriginal";
                break;
            case 4:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 5:
                objArr[1] = "getThisAsReceiverParameter";
                break;
            case 7:
            case 8:
            case 10:
            case 11:
                objArr[1] = str4;
                break;
            case 13:
            case 14:
                objArr[1] = str3;
                break;
            case 15:
                objArr[1] = "getDefaultType";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                break;
            case 6:
            case 9:
                objArr[2] = str4;
                break;
            case 12:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
    }

    /* renamed from: btf */
    public d bsX() {
        return this;
    }

    public a(kotlin.reflect.jvm.internal.impl.storage.h hVar, f fVar) {
        if (hVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        this.fdP = fVar;
        this.fdQ = hVar.f(new kotlin.jvm.a.a<ad>() {
            /* renamed from: bsD */
            public ad invoke() {
                a aVar = a.this;
                return au.a(aVar, aVar.bro());
            }
        });
        this.fdR = hVar.f(new kotlin.jvm.a.a<h>() {
            /* renamed from: brc */
            public h invoke() {
                return new kotlin.reflect.jvm.internal.impl.resolve.scopes.f(a.this.bro());
            }
        });
        this.fdS = hVar.f(new kotlin.jvm.a.a<ah>() {
            /* renamed from: boD */
            public ah invoke() {
                return new q(a.this);
            }
        });
    }

    public f bsZ() {
        f fVar = this.fdP;
        if (fVar == null) {
            $$$reportNull$$$0(2);
        }
        return fVar;
    }

    public h btd() {
        h hVar = (h) this.fdR.invoke();
        if (hVar == null) {
            $$$reportNull$$$0(4);
        }
        return hVar;
    }

    public ah bte() {
        ah ahVar = (ah) this.fdS.invoke();
        if (ahVar == null) {
            $$$reportNull$$$0(5);
        }
        return ahVar;
    }

    public h a(as asVar) {
        if (asVar == null) {
            $$$reportNull$$$0(9);
        }
        if (asVar.isEmpty()) {
            h bro = bro();
            if (bro == null) {
                $$$reportNull$$$0(10);
            }
            return bro;
        }
        return new l(bro(), TypeSubstitutor.e(asVar));
    }

    /* renamed from: g */
    public d f(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(12);
        }
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        return new s(this, typeSubstitutor);
    }

    public ad bsY() {
        ad adVar = (ad) this.fdQ.invoke();
        if (adVar == null) {
            $$$reportNull$$$0(15);
        }
        return adVar;
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        return mVar.a((d) this, (Object) d);
    }
}
