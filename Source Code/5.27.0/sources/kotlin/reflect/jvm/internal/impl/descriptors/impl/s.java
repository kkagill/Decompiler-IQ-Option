package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.l;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.e;
import kotlin.reflect.jvm.internal.impl.types.k;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: LazySubstitutingClassDescriptor */
public class s implements d {
    private an fen;
    private final d fft;
    private final TypeSubstitutor ffu;
    private TypeSubstitutor ffv;
    private List<ao> ffw;
    private List<ao> ffx;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 5 || i == 17) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int i2 = (i == 2 || i == 5 || i == 17) ? 3 : 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i != 17) {
            objArr[0] = str2;
        } else {
            objArr[0] = "substitutor";
        }
        String str3 = "substitute";
        String str4 = "getMemberScope";
        switch (i) {
            case 2:
            case 5:
            case 17:
                objArr[1] = str2;
                break;
            case 3:
            case 4:
            case 6:
            case 7:
                objArr[1] = str4;
                break;
            case 8:
            case 9:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 10:
                objArr[1] = "getStaticScope";
                break;
            case 11:
                objArr[1] = "getDefaultType";
                break;
            case 12:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getAnnotations";
                break;
            case 14:
                objArr[1] = "getName";
                break;
            case 15:
                objArr[1] = "getOriginal";
                break;
            case 16:
                objArr[1] = "getContainingDeclaration";
                break;
            case 18:
            case 19:
                objArr[1] = str3;
                break;
            case 20:
                objArr[1] = "getKind";
                break;
            case 21:
                objArr[1] = "getModality";
                break;
            case 22:
                objArr[1] = "getVisibility";
                break;
            case 23:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 24:
                objArr[1] = "getSource";
                break;
            case 25:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 26:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 5) {
            objArr[2] = str4;
        } else if (i == 17) {
            objArr[2] = str3;
        }
        str = String.format(str, objArr);
        IllegalStateException illegalArgumentException = (i == 2 || i == 5 || i == 17) ? new IllegalArgumentException(str) : new IllegalStateException(str);
        throw illegalArgumentException;
    }

    public s(d dVar, TypeSubstitutor typeSubstitutor) {
        this.fft = dVar;
        this.ffu = typeSubstitutor;
    }

    private TypeSubstitutor buI() {
        if (this.ffv == null) {
            if (this.ffu.isEmpty()) {
                this.ffv = this.ffu;
            } else {
                List parameters = this.fft.brm().getParameters();
                this.ffw = new ArrayList(parameters.size());
                this.ffv = k.a(parameters, this.ffu.bPG(), this, this.ffw);
                this.ffx = u.b((Iterable) this.ffw, (b) new b<ao, Boolean>() {
                    /* renamed from: b */
                    public Boolean invoke(ao aoVar) {
                        return Boolean.valueOf(aoVar.bsU() ^ 1);
                    }
                });
            }
        }
        return this.ffv;
    }

    public an brm() {
        an brm = this.fft.brm();
        if (this.ffu.isEmpty()) {
            if (brm == null) {
                $$$reportNull$$$0(0);
            }
            return brm;
        }
        if (this.fen == null) {
            TypeSubstitutor buI = buI();
            Collection<w> bup = brm.bup();
            ArrayList arrayList = new ArrayList(bup.size());
            for (w c : bup) {
                arrayList.add(buI.c(c, Variance.INVARIANT));
            }
            this.fen = new e(this, this.ffw, arrayList, LockBasedStorageManager.fwt);
        }
        brm = this.fen;
        if (brm == null) {
            $$$reportNull$$$0(1);
        }
        return brm;
    }

    public h a(as asVar) {
        if (asVar == null) {
            $$$reportNull$$$0(5);
        }
        h a = this.fft.a(asVar);
        if (!this.ffu.isEmpty()) {
            return new l(a, buI());
        }
        if (a == null) {
            $$$reportNull$$$0(6);
        }
        return a;
    }

    public h bro() {
        h bro = this.fft.bro();
        if (!this.ffu.isEmpty()) {
            return new l(bro, buI());
        }
        if (bro == null) {
            $$$reportNull$$$0(8);
        }
        return bro;
    }

    public h brl() {
        h brl = this.fft.brl();
        if (brl == null) {
            $$$reportNull$$$0(10);
        }
        return brl;
    }

    public ad bsY() {
        ad a = x.a(brE(), this, au.cn(brm().getParameters()));
        if (a == null) {
            $$$reportNull$$$0(11);
        }
        return a;
    }

    public ah bte() {
        throw new UnsupportedOperationException();
    }

    public Collection<c> brs() {
        Collection<c> brs = this.fft.brs();
        ArrayList arrayList = new ArrayList(brs.size());
        for (c cVar : brs) {
            arrayList.add(cVar.b(this, cVar.bru(), cVar.brx(), cVar.bsT(), false).a(buI()));
        }
        return arrayList;
    }

    public f brE() {
        f brE = this.fft.brE();
        if (brE == null) {
            $$$reportNull$$$0(13);
        }
        return brE;
    }

    public kotlin.reflect.jvm.internal.impl.name.f bsZ() {
        kotlin.reflect.jvm.internal.impl.name.f bsZ = this.fft.bsZ();
        if (bsZ == null) {
            $$$reportNull$$$0(14);
        }
        return bsZ;
    }

    /* renamed from: btf */
    public d bsX() {
        d btf = this.fft.btf();
        if (btf == null) {
            $$$reportNull$$$0(15);
        }
        return btf;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.k brj() {
        kotlin.reflect.jvm.internal.impl.descriptors.k brj = this.fft.brj();
        if (brj == null) {
            $$$reportNull$$$0(16);
        }
        return brj;
    }

    /* renamed from: g */
    public d f(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(17);
        }
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        return new s(this, TypeSubstitutor.b(typeSubstitutor.bPG(), buI().bPG()));
    }

    public d brq() {
        return this.fft.brq();
    }

    public ClassKind brt() {
        ClassKind brt = this.fft.brt();
        if (brt == null) {
            $$$reportNull$$$0(20);
        }
        return brt;
    }

    public Modality bru() {
        Modality bru = this.fft.bru();
        if (bru == null) {
            $$$reportNull$$$0(21);
        }
        return bru;
    }

    public aw brx() {
        aw brx = this.fft.brx();
        if (brx == null) {
            $$$reportNull$$$0(22);
        }
        return brx;
    }

    public boolean brz() {
        return this.fft.brz();
    }

    public boolean AZ() {
        return this.fft.AZ();
    }

    public boolean brA() {
        return this.fft.brA();
    }

    public boolean brD() {
        return this.fft.brD();
    }

    public boolean bry() {
        return this.fft.bry();
    }

    public boolean brB() {
        return this.fft.brB();
    }

    public boolean brC() {
        return this.fft.brC();
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        return mVar.a((d) this, (Object) d);
    }

    public h btd() {
        h btd = this.fft.btd();
        if (btd == null) {
            $$$reportNull$$$0(23);
        }
        return btd;
    }

    public c brw() {
        return this.fft.brw();
    }

    public aj brF() {
        aj ajVar = aj.fcV;
        if (ajVar == null) {
            $$$reportNull$$$0(24);
        }
        return ajVar;
    }

    public List<ao> brI() {
        buI();
        List list = this.ffx;
        if (list == null) {
            $$$reportNull$$$0(25);
        }
        return list;
    }

    public Collection<d> brH() {
        Collection brH = this.fft.brH();
        if (brH == null) {
            $$$reportNull$$$0(26);
        }
        return brH;
    }
}
