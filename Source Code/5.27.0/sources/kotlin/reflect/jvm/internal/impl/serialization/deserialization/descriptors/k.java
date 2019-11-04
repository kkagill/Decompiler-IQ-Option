package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.am.a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance;
import kotlin.reflect.jvm.internal.impl.metadata.a.g;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.v;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
public final class k extends b {
    private final j fvy;
    private final a fwr = new a(this.fvy.bqz(), new DeserializedTypeParameterDescriptor$annotations$1(this));
    private final TypeParameter fws;

    public k(j jVar, TypeParameter typeParameter, int i) {
        i.f(jVar, "c");
        i.f(typeParameter, "proto");
        h bqz = jVar.bqz();
        kotlin.reflect.jvm.internal.impl.descriptors.k brj = jVar.brj();
        f b = q.b(jVar.bot(), typeParameter.bCg());
        s sVar = s.fvC;
        Variance bFQ = typeParameter.bFQ();
        i.e(bFQ, "proto.variance");
        super(bqz, brj, b, sVar.b(bFQ), typeParameter.bFO(), i, aj.fcV, a.fcX);
        this.fvy = jVar;
        this.fws = typeParameter;
    }

    /* renamed from: bOY */
    public a brE() {
        return this.fwr;
    }

    /* Access modifiers changed, original: protected */
    public List<w> buq() {
        List a = g.a(this.fws, this.fvy.bou());
        if (a.isEmpty()) {
            return l.listOf(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(this).bqO());
        }
        Iterable<Type> iterable = a;
        v bOm = this.fvy.bOm();
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Type r : iterable) {
            arrayList.add(bOm.r(r));
        }
        return (List) arrayList;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: az */
    public Void P(w wVar) {
        i.f(wVar, "type");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("There should be no cycles for deserialized type parameters, but found for: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
