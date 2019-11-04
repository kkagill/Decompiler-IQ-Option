package com.iqoption.charttools.tools.data;

import com.iqoption.charttools.model.b.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, bng = {"Lcom/iqoption/charttools/tools/data/TemplateItem;", "Lcom/iqoption/charttools/tools/data/TemplateAdapterItem;", "template", "Lcom/iqoption/charttools/model/template/ChartTemplate;", "indicators", "", "isApplied", "", "(Lcom/iqoption/charttools/model/template/ChartTemplate;Ljava/lang/String;Z)V", "id", "getId", "()Ljava/lang/String;", "getIndicators", "()Z", "getTemplate", "()Lcom/iqoption/charttools/model/template/ChartTemplate;", "app_optionXRelease"})
/* compiled from: TemplateAdapterItems.kt */
public final class m extends l {
    private final a aEv;
    private final String aNc;
    private final boolean aNd;
    private final String id;

    public m(a aVar, String str, boolean z) {
        kotlin.jvm.internal.i.f(aVar, "template");
        kotlin.jvm.internal.i.f(str, "indicators");
        super();
        this.aEv = aVar;
        this.aNc = str;
        this.aNd = z;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("template:");
        stringBuilder.append(this.aEv.getId());
        this.id = stringBuilder.toString();
    }

    public final a QB() {
        return this.aEv;
    }

    public final String QC() {
        return this.aNc;
    }

    public final boolean QD() {
        return this.aNd;
    }

    public String getId() {
        return this.id;
    }
}
