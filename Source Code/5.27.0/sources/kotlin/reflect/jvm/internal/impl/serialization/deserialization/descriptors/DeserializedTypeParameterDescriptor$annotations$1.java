package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
final class DeserializedTypeParameterDescriptor$annotations$1 extends Lambda implements a<List<? extends c>> {
    final /* synthetic */ k this$0;

    DeserializedTypeParameterDescriptor$annotations$1(k kVar) {
        this.this$0 = kVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<c> invoke() {
        return u.T(this.this$0.fvy.bys().bOb().a(this.this$0.fws, this.this$0.fvy.bot()));
    }
}
