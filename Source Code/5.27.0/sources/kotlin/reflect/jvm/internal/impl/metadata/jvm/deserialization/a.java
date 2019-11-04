package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.List;
import kotlin.jvm.internal.i;

/* compiled from: BinaryModuleData.kt */
public final class a {
    private final List<String> fdD;

    public a(List<String> list) {
        i.f(list, "annotations");
        this.fdD = list;
    }
}
