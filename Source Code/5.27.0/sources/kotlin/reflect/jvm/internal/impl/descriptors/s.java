package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: FunctionDescriptor */
public interface s extends CallableMemberDescriptor {

    /* compiled from: FunctionDescriptor */
    public interface a<D extends s> {
        a<D> N(w wVar);

        a<D> a(Kind kind);

        a<D> a(Modality modality);

        a<D> a(ah ahVar);

        a<D> a(f fVar);

        a<D> a(aw awVar);

        a<D> b(ah ahVar);

        a<D> b(as asVar);

        a<D> btq();

        a<D> btr();

        a<D> bts();

        a<D> btt();

        a<D> btu();

        D btv();

        a<D> cb(List<ar> list);

        a<D> e(kotlin.reflect.jvm.internal.impl.name.f fVar);

        a<D> gq(boolean z);

        a<D> i(k kVar);
    }

    boolean brA();

    boolean brV();

    k brj();

    Collection<? extends s> bsR();

    s bti();

    s btj();

    boolean btk();

    boolean btl();

    boolean btm();

    boolean btn();

    boolean bto();

    a<? extends s> btp();

    s c(TypeSubstitutor typeSubstitutor);
}
