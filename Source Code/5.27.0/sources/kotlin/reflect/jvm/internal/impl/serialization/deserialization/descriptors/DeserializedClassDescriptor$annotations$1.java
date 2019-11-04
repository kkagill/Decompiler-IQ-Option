package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;

/* compiled from: DeserializedClassDescriptor.kt */
final class DeserializedClassDescriptor$annotations$1 extends Lambda implements a<List<? extends c>> {
    final /* synthetic */ d this$0;

    DeserializedClassDescriptor$annotations$1(d dVar) {
        this.this$0 = dVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<c> invoke() {
        return u.T(this.this$0.bOB().bys().bOb().b(this.this$0.bOC()));
    }
}
