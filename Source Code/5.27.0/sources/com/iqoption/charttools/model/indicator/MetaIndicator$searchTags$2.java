package com.iqoption.charttools.model.indicator;

import java.util.ArrayList;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: MetaIndicator.kt */
final class MetaIndicator$searchTags$2 extends Lambda implements a<String> {
    final /* synthetic */ x this$0;

    MetaIndicator$searchTags$2(x xVar) {
        this.this$0 = xVar;
        super(0);
    }

    /* renamed from: Ot */
    public final String invoke() {
        List arrayList = new ArrayList();
        String On = this.this$0.On();
        Object obj = 1;
        if ((((CharSequence) On).length() > 0 ? 1 : null) != null) {
            arrayList.add(On);
            On = y.eO(On);
            if (On != null) {
                arrayList.add(On);
            }
        }
        On = this.this$0.Oo();
        if (On.length() <= 0) {
            obj = null;
        }
        if (obj != null) {
            arrayList.add(On);
            On = y.eO(On);
            if (On != null) {
                arrayList.add(On);
            }
        }
        return u.a(arrayList, ";", null, null, 0, null, null, 62, null);
    }
}
