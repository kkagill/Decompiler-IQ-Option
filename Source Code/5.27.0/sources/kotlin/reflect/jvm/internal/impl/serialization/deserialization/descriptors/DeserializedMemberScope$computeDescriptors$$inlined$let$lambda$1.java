package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.protobuf.p;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$1 extends Lambda implements a<M> {
    final /* synthetic */ ByteArrayInputStream $inputStream;
    final /* synthetic */ p $parser$inlined;
    final /* synthetic */ f this$0;

    public DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$1(ByteArrayInputStream byteArrayInputStream, f fVar, p pVar) {
        this.$inputStream = byteArrayInputStream;
        this.this$0 = fVar;
        this.$parser$inlined = pVar;
        super(0);
    }

    /* renamed from: bOV */
    public final M invoke() {
        return (n) this.$parser$inlined.j(this.$inputStream, this.this$0.bOB().bys().bOh());
    }
}
