package com.iqoption.charttools.tools.data;

import com.google.android.gms.plus.PlusShare;
import com.iqoption.charttools.model.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, bng = {"Lcom/iqoption/charttools/tools/data/CategoryItem;", "Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;", "category", "Lcom/iqoption/charttools/model/IndicatorCategory;", "title", "", "(Lcom/iqoption/charttools/model/IndicatorCategory;Ljava/lang/String;)V", "getCategory", "()Lcom/iqoption/charttools/model/IndicatorCategory;", "app_optionXRelease"})
/* compiled from: CategoryItem.kt */
public final class d extends c {
    private final a aMV;

    public d(a aVar, String str) {
        kotlin.jvm.internal.i.f(aVar, "category");
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        super(aVar.getId(), str, null);
        this.aMV = aVar;
    }

    public final a Qy() {
        return this.aMV;
    }
}
