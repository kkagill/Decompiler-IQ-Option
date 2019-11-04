package com.iqoption.charttools.tools;

import com.google.common.base.Optional;
import com.iqoption.charttools.model.indicator.x;
import com.iqoption.charttools.tools.data.c;
import com.iqoption.charttools.tools.data.d;
import com.iqoption.charttools.tools.data.h;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "results", "", "invoke", "([Ljava/lang/Object;)Ljava/util/List;"})
/* compiled from: ToolsViewModel.kt */
final class ToolsViewModel$createIndicatorsStream$combiner$3 extends Lambda implements b<Object[], List<? extends h>> {
    final /* synthetic */ c $item;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "meta", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "invoke"})
    /* compiled from: ToolsViewModel.kt */
    /* renamed from: com.iqoption.charttools.tools.ToolsViewModel$createIndicatorsStream$combiner$3$1 */
    static final class AnonymousClass1 extends Lambda implements b<x, Boolean> {
        final /* synthetic */ ToolsViewModel$createIndicatorsStream$combiner$3 this$0;

        AnonymousClass1(ToolsViewModel$createIndicatorsStream$combiner$3 toolsViewModel$createIndicatorsStream$combiner$3) {
            this.this$0 = toolsViewModel$createIndicatorsStream$combiner$3;
            super(1);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(f((x) obj));
        }

        public final boolean f(x xVar) {
            kotlin.jvm.internal.i.f(xVar, "meta");
            return xVar.getCategories().contains(((d) this.this$0.$item).Qy());
        }
    }

    ToolsViewModel$createIndicatorsStream$combiner$3(c cVar) {
        this.$item = cVar;
        super(1);
    }

    /* renamed from: n */
    public final List<h> invoke(Object[] objArr) {
        kotlin.jvm.internal.i.f(objArr, "results");
        Object obj = objArr[0];
        String str = "null cannot be cast to non-null type kotlin.collections.List<com.iqoption.charttools.model.indicator.MetaIndicator>";
        if (obj != null) {
            List list = (List) obj;
            Object obj2 = objArr[1];
            if (obj2 != null) {
                List list2 = (List) obj2;
                Object obj3 = objArr[2];
                if (obj3 != null) {
                    List list3 = (List) obj3;
                    Object obj4 = objArr[3];
                    if (obj4 != null) {
                        return h.aMs.a(n.b(u.Z(list), (b) new AnonymousClass1(this)), (e) ((Optional) obj4).pN(), this.$item, list2, list3);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.google.common.base.Optional<com.iqoption.charttools.tools.ToolsViewModel.ExpandedMeta>");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.iqoption.charttools.model.indicator.ChartIndicator>");
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }
}
