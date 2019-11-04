package com.iqoption.charttools.tools.delegate;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.charttools.tools.a.c;
import com.iqoption.charttools.tools.data.k;
import com.iqoption.e.zz;
import com.iqoption.x.R;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/charttools/tools/delegate/SettingsDelegate;", "Lcom/iqoption/charttools/tools/delegate/ContentDelegate;", "Lcom/iqoption/databinding/ToolsContentSettingsBinding;", "context", "Lcom/iqoption/charttools/tools/delegate/DelegateContext;", "(Lcom/iqoption/charttools/tools/delegate/DelegateContext;)V", "app_optionXRelease"})
/* compiled from: SettingsDelegate.kt */
public final class e extends b<zz> {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/tools/delegate/SettingsDelegate$adapter$1", "Lcom/iqoption/charttools/tools/adapters/SettingsAdapter$Callbacks;", "onItemToggled", "", "item", "Lcom/iqoption/charttools/tools/data/SettingItem;", "app_optionXRelease"})
    /* compiled from: SettingsDelegate.kt */
    public static final class a implements com.iqoption.charttools.tools.a.c.a {
        final /* synthetic */ e aNB;

        a(e eVar) {
            this.aNB = eVar;
        }

        public void b(k kVar) {
            kotlin.jvm.internal.i.f(kVar, "item");
            this.aNB.PL().a(kVar);
        }
    }

    public e(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "context");
        super(R.layout.tools_content_settings, cVar);
        final c cVar2 = new c(new a(this));
        PL().Qj().observe(this, new Observer<List<? extends k>>() {
            /* renamed from: u */
            public final void onChanged(List<k> list) {
                if (list != null) {
                    com.iqoption.core.ui.widget.recyclerview.adapter.a.a(cVar2, list, null, 2, null);
                }
            }
        });
        zz zzVar = (zz) getBinding();
        RecyclerView recyclerView = zzVar.apj;
        kotlin.jvm.internal.i.e(recyclerView, "listView");
        recyclerView.setAdapter(cVar2);
        zzVar.apj.addItemDecoration(PO());
    }
}
