package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: FunctionClassDescriptor.kt */
final class FunctionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1 extends Lambda implements b<a, l> {
    final /* synthetic */ ArrayList $result;
    final /* synthetic */ b this$0;

    FunctionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1(b bVar, ArrayList arrayList) {
        this.this$0 = bVar;
        this.$result = arrayList;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        g((a) obj);
        return l.eVB;
    }

    public final void g(a aVar) {
        i.f(aVar, "id");
        d a = r.a(FunctionClassDescriptor.this.fbE.btA(), aVar);
        if (a != null) {
            an brm = a.brm();
            i.e(brm, "descriptor.typeConstructor");
            Iterable<ao> j = u.j(this.this$0.getParameters(), brm.getParameters().size());
            Collection arrayList = new ArrayList(n.e(j, 10));
            for (ao bsY : j) {
                arrayList.add(new ar(bsY.bsY()));
            }
            this.$result.add(x.a(f.fdA.bug(), a, (List) arrayList));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Built-in class ");
        stringBuilder.append(aVar);
        stringBuilder.append(" not found");
        throw new IllegalStateException(stringBuilder.toString().toString());
    }
}
