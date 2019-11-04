package com.iqoption.fragment.assets.model;

import com.iqoption.core.features.a.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "", "", "invoke"})
/* compiled from: AssetsModelImpl.kt */
final class AssetsModelImplKt$getMaxLeverageSupplier$thresholds$2 extends Lambda implements a<Map<String, Integer>> {
    final /* synthetic */ b $leveragesLimitParams;

    AssetsModelImplKt$getMaxLeverageSupplier$thresholds$2(b bVar) {
        this.$leveragesLimitParams = bVar;
        super(0);
    }

    /* renamed from: aAU */
    public final Map<String, Integer> invoke() {
        Map linkedHashMap = new LinkedHashMap();
        b bVar = this.$leveragesLimitParams;
        if (bVar != null) {
            List<String> Pe = bVar.Pe();
            if (Pe != null) {
                for (String put : Pe) {
                    linkedHashMap.put(put, Integer.valueOf(this.$leveragesLimitParams.Xn()));
                }
            }
        }
        return linkedHashMap;
    }
}
