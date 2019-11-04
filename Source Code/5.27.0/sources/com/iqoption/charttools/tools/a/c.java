package com.iqoption.charttools.tools.a;

import android.view.ViewGroup;
import com.iqoption.charttools.tools.c.d;
import com.iqoption.charttools.tools.data.k;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/charttools/tools/adapters/SettingsAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/charttools/tools/viewholder/SwitcherViewHolder;", "Lcom/iqoption/charttools/tools/data/SettingItem;", "callbacks", "Lcom/iqoption/charttools/tools/adapters/SettingsAdapter$Callbacks;", "(Lcom/iqoption/charttools/tools/adapters/SettingsAdapter$Callbacks;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "app_optionXRelease"})
/* compiled from: SettingsAdapter.kt */
public final class c extends com.iqoption.core.ui.widget.recyclerview.adapter.a<d, k> {
    private final a aMP;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, bng = {"Lcom/iqoption/charttools/tools/adapters/SettingsAdapter$Callbacks;", "Lcom/iqoption/charttools/tools/viewholder/SwitcherViewHolder$Callback;", "app_optionXRelease"})
    /* compiled from: SettingsAdapter.kt */
    public interface a extends com.iqoption.charttools.tools.c.d.a {
    }

    public c(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.aMP = aVar;
    }

    /* renamed from: n */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new d(this.aMP, viewGroup, this);
    }

    /* renamed from: a */
    public void onBindViewHolder(d dVar, int i) {
        kotlin.jvm.internal.i.f(dVar, "holder");
        dVar.bV(fp(i));
    }
}
