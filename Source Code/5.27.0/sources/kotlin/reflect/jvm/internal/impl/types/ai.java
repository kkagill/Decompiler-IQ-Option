package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.descriptors.k;

/* compiled from: StarProjectionImpl.kt */
public final class ai {

    /* compiled from: StarProjectionImpl.kt */
    public static final class a extends ao {
        final /* synthetic */ List fxs;

        a(List list) {
            this.fxs = list;
        }

        public ap d(an anVar) {
            i.f(anVar, "key");
            if (!this.fxs.contains(anVar)) {
                return null;
            }
            f brQ = anVar.brQ();
            if (brQ != null) {
                return au.d((ao) brQ);
            }
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    public static final w c(ao aoVar) {
        i.f(aoVar, "$this$starProjectionType");
        k brj = aoVar.brj();
        if (brj != null) {
            an brm = ((g) brj).brm();
            i.e(brm, "classDescriptor.typeConstructor");
            List parameters = brm.getParameters();
            i.e(parameters, "classDescriptor.typeConstructor.parameters");
            Iterable<ao> iterable = parameters;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (ao aoVar2 : iterable) {
                i.e(aoVar2, "it");
                arrayList.add(aoVar2.brm());
            }
            TypeSubstitutor e = TypeSubstitutor.e((as) new a((List) arrayList));
            List bod = aoVar.bod();
            i.e(bod, "this.upperBounds");
            w c = e.c((w) u.bU(bod), Variance.OUT_VARIANCE);
            if (c != null) {
                return c;
            }
            ad bqO = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(aoVar).bqO();
            i.e(bqO, "builtIns.defaultBound");
            return bqO;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
    }
}
