package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;

/* compiled from: DeserializedClassDescriptor.kt */
final class DeserializedClassDescriptor$DeserializedClassMemberScope$computeNonDeclaredFunctions$1 extends Lambda implements b<ai, Boolean> {
    final /* synthetic */ a this$0;

    DeserializedClassDescriptor$DeserializedClassMemberScope$computeNonDeclaredFunctions$1(a aVar) {
        this.this$0 = aVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(j((ai) obj));
    }

    public final boolean j(ai aiVar) {
        i.f(aiVar, "it");
        return this.this$0.bOB().bys().bqx().a(d.this, aiVar);
    }
}
