package kotlin.reflect.jvm.internal.impl.metadata.a;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e;

/* compiled from: ProtoBufUtil.kt */
public final class f {
    public static final <M extends ExtendableMessage<M>, T> T a(ExtendableMessage<M> extendableMessage, e<M, T> eVar) {
        i.f(extendableMessage, "$this$getExtensionOrNull");
        i.f(eVar, "extension");
        return extendableMessage.c(eVar) ? extendableMessage.e(eVar) : null;
    }

    public static final <M extends ExtendableMessage<M>, T> T a(ExtendableMessage<M> extendableMessage, e<M, List<T>> eVar, int i) {
        i.f(extendableMessage, "$this$getExtensionOrNull");
        i.f(eVar, "extension");
        return i < extendableMessage.d(eVar) ? extendableMessage.a(eVar, i) : null;
    }
}
