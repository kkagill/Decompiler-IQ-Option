package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.am;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.m;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.c;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: AbstractTypeParameterDescriptor */
public abstract class e extends k implements ao {
    private final kotlin.reflect.jvm.internal.impl.storage.e<ad> fdQ;
    private final Variance fdY;
    private final boolean fdZ;
    private final kotlin.reflect.jvm.internal.impl.storage.e<an> fea;
    private final int index;

    /* compiled from: AbstractTypeParameterDescriptor */
    private class a extends c {
        final /* synthetic */ e fed;
        private final am feg;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    objArr[0] = str2;
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i != 5) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getSupertypeLoopChecker";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public boolean brS() {
            return true;
        }

        public a(e eVar, h hVar, am amVar) {
            if (hVar == null) {
                $$$reportNull$$$0(0);
            }
            this.fed = eVar;
            super(hVar);
            this.feg = amVar;
        }

        /* Access modifiers changed, original: protected */
        public Collection<w> brO() {
            List buq = this.fed.buq();
            if (buq == null) {
                $$$reportNull$$$0(1);
            }
            return buq;
        }

        public List<ao> getParameters() {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                $$$reportNull$$$0(2);
            }
            return emptyList;
        }

        public f brQ() {
            e eVar = this.fed;
            if (eVar == null) {
                $$$reportNull$$$0(3);
            }
            return eVar;
        }

        public g btw() {
            g Q = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(this.fed);
            if (Q == null) {
                $$$reportNull$$$0(4);
            }
            return Q;
        }

        public String toString() {
            return this.fed.bsZ().toString();
        }

        /* Access modifiers changed, original: protected */
        public am brT() {
            am amVar = this.feg;
            if (amVar == null) {
                $$$reportNull$$$0(5);
            }
            return amVar;
        }

        /* Access modifiers changed, original: protected */
        public void P(w wVar) {
            if (wVar == null) {
                $$$reportNull$$$0(6);
            }
            this.fed.P(wVar);
        }

        /* Access modifiers changed, original: protected */
        public w bus() {
            return p.mK("Cyclic upper bounds");
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
    }

    public abstract void P(w wVar);

    public boolean bsU() {
        return false;
    }

    public abstract List<w> buq();

    protected e(final h hVar, k kVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, final kotlin.reflect.jvm.internal.impl.name.f fVar2, Variance variance, boolean z, int i, aj ajVar, final am amVar) {
        if (hVar == null) {
            $$$reportNull$$$0(0);
        }
        if (kVar == null) {
            $$$reportNull$$$0(1);
        }
        if (fVar == null) {
            $$$reportNull$$$0(2);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(3);
        }
        if (variance == null) {
            $$$reportNull$$$0(4);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(5);
        }
        if (amVar == null) {
            $$$reportNull$$$0(6);
        }
        super(kVar, fVar, fVar2, ajVar);
        this.fdY = variance;
        this.fdZ = z;
        this.index = i;
        this.fea = hVar.f(new kotlin.jvm.a.a<an>() {
            /* renamed from: bur */
            public an invoke() {
                return new a(e.this, hVar, amVar);
            }
        });
        this.fdQ = hVar.f(new kotlin.jvm.a.a<ad>() {
            /* renamed from: bsD */
            public ad invoke() {
                return x.a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), e.this.brm(), Collections.emptyList(), false, new kotlin.reflect.jvm.internal.impl.resolve.scopes.g(hVar.f(new kotlin.jvm.a.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h>() {
                    /* renamed from: brc */
                    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h invoke() {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Scope for type parameter ");
                        stringBuilder.append(fVar2.boi());
                        return m.a(stringBuilder.toString(), e.this.bod());
                    }
                })));
            }
        });
    }

    public Variance bta() {
        Variance variance = this.fdY;
        if (variance == null) {
            $$$reportNull$$$0(7);
        }
        return variance;
    }

    public boolean btb() {
        return this.fdZ;
    }

    public int getIndex() {
        return this.index;
    }

    public List<w> bod() {
        List bPh = ((a) brm()).bup();
        if (bPh == null) {
            $$$reportNull$$$0(8);
        }
        return bPh;
    }

    public final an brm() {
        an anVar = (an) this.fea.invoke();
        if (anVar == null) {
            $$$reportNull$$$0(9);
        }
        return anVar;
    }

    public ad bsY() {
        ad adVar = (ad) this.fdQ.invoke();
        if (adVar == null) {
            $$$reportNull$$$0(10);
        }
        return adVar;
    }

    /* renamed from: bsV */
    public ao bul() {
        ao aoVar = (ao) super.bsW();
        if (aoVar == null) {
            $$$reportNull$$$0(11);
        }
        return aoVar;
    }

    public <R, D> R a(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d) {
        return mVar.a((ao) this, (Object) d);
    }
}
