package kotlin.text;

import kotlin.g.f;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"})
/* compiled from: Strings.kt */
final class StringsKt__StringsKt$splitToSequence$1 extends Lambda implements b<f, String> {
    final /* synthetic */ CharSequence $this_splitToSequence;

    StringsKt__StringsKt$splitToSequence$1(CharSequence charSequence) {
        this.$this_splitToSequence = charSequence;
        super(1);
    }

    /* renamed from: a */
    public final String invoke(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "it");
        return v.a(this.$this_splitToSequence, fVar);
    }
}
