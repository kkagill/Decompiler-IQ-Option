package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* compiled from: utils.kt */
final class UtilsKt$debugInfo$1$1 extends Lambda implements b<String, StringBuilder> {
    final /* synthetic */ StringBuilder $this_buildString;

    UtilsKt$debugInfo$1$1(StringBuilder stringBuilder) {
        this.$this_buildString = stringBuilder;
        super(1);
    }

    /* renamed from: mO */
    public final StringBuilder invoke(String str) {
        i.f(str, "$this$unaryPlus");
        StringBuilder stringBuilder = this.$this_buildString;
        stringBuilder.append(str);
        i.e(stringBuilder, "append(value)");
        return q.s(stringBuilder);
    }
}
