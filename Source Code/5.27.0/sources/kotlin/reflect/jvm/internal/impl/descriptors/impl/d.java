package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: AbstractTypeAliasDescriptor.kt */
public abstract class d extends k implements an {
    private List<? extends ao> fdV;
    private final a fdW = new a(this);
    private final aw fdX;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    public static final class a implements kotlin.reflect.jvm.internal.impl.types.an {
        final /* synthetic */ d this$0;

        public boolean brS() {
            return true;
        }

        a(d dVar) {
            this.this$0 = dVar;
        }

        /* renamed from: buo */
        public an brQ() {
            return this.this$0;
        }

        public List<ao> getParameters() {
            return this.this$0.bum();
        }

        public Collection<w> bup() {
            Collection bup = brQ().btN().bMZ().bup();
            i.e(bup, "declarationDescriptor.un…pe.constructor.supertypes");
            return bup;
        }

        public g btw() {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(brQ());
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[typealias ");
            stringBuilder.append(brQ().bsZ().boi());
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    public abstract h bqz();

    public boolean brB() {
        return false;
    }

    public boolean brC() {
        return false;
    }

    public boolean brD() {
        return false;
    }

    public abstract List<ao> bum();

    public d(k kVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, aj ajVar, aw awVar) {
        i.f(kVar, "containingDeclaration");
        i.f(fVar, "annotations");
        i.f(fVar2, ConditionalUserProperty.NAME);
        i.f(ajVar, "sourceElement");
        i.f(awVar, "visibilityImpl");
        super(kVar, fVar, fVar2, ajVar);
        this.fdX = awVar;
    }

    public final void cd(List<? extends ao> list) {
        i.f(list, "declaredTypeParameters");
        this.fdV = list;
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        i.f(mVar, "visitor");
        return mVar.a((an) this, (Object) d);
    }

    public boolean brz() {
        return au.b((w) btN(), (b) new AbstractTypeAliasDescriptor$isInner$1(this));
    }

    public final Collection<af> buj() {
        kotlin.reflect.jvm.internal.impl.descriptors.d btP = btP();
        if (btP == null) {
            return m.emptyList();
        }
        Collection<c> brs = btP.brs();
        i.e(brs, "classDescriptor.constructors");
        Collection arrayList = new ArrayList();
        for (c cVar : brs) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ag.a aVar = ag.fgd;
            h bqz = bqz();
            an anVar = this;
            i.e(cVar, "it");
            af a = aVar.a(bqz, anVar, cVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return (List) arrayList;
    }

    public List<ao> brI() {
        List list = this.fdV;
        if (list == null) {
            i.lG("declaredTypeParametersImpl");
        }
        return list;
    }

    public Modality bru() {
        return Modality.FINAL;
    }

    public aw brx() {
        return this.fdX;
    }

    public kotlin.reflect.jvm.internal.impl.types.an brm() {
        return this.fdW;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("typealias ");
        stringBuilder.append(bsZ().boi());
        return stringBuilder.toString();
    }

    /* renamed from: buk */
    public an bul() {
        n bul = super.bsW();
        if (bul != null) {
            return (an) bul;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:3:0x000d, code skipped:
            if (r1 != null) goto L_0x0014;
     */
    public final kotlin.reflect.jvm.internal.impl.types.ad bun() {
        /*
        r2 = this;
        r0 = r2;
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r0;
        r1 = r2.btP();
        if (r1 == 0) goto L_0x0010;
    L_0x0009:
        r1 = r1.bro();
        if (r1 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0014;
    L_0x0010:
        r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c.fuD;
        r1 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.h) r1;
    L_0x0014:
        r0 = kotlin.reflect.jvm.internal.impl.types.au.a(r0, r1);
        r1 = "TypeUtils.makeUnsubstitu…ope ?: MemberScope.Empty)";
        kotlin.jvm.internal.i.e(r0, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.d.bun():kotlin.reflect.jvm.internal.impl.types.ad");
    }
}
