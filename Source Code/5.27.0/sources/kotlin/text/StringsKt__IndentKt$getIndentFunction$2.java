package kotlin.text;

import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "line", "invoke"})
/* compiled from: Indent.kt */
final class StringsKt__IndentKt$getIndentFunction$2 extends Lambda implements b<String, String> {
    final /* synthetic */ String $indent;

    StringsKt__IndentKt$getIndentFunction$2(String str) {
        this.$indent = str;
        super(1);
    }

    /* renamed from: fn */
    public final String invoke(String str) {
        kotlin.jvm.internal.i.f(str, "line");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.$indent);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
