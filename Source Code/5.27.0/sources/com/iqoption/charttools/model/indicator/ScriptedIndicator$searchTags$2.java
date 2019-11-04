package com.iqoption.charttools.model.indicator;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: MetaIndicator.kt */
final class ScriptedIndicator$searchTags$2 extends Lambda implements a<String> {
    final /* synthetic */ ae this$0;

    ScriptedIndicator$searchTags$2(ae aeVar) {
        this.this$0 = aeVar;
        super(0);
    }

    /* renamed from: Ot */
    public final String invoke() {
        String b = super.Os();
        String keywords = this.this$0.getKeywords();
        if (keywords == null) {
            return b;
        }
        if ((((CharSequence) keywords).length() > 0 ? 1 : 0) != 1) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b);
        stringBuilder.append(';');
        stringBuilder.append(this.this$0.getKeywords());
        return stringBuilder.toString();
    }
}
