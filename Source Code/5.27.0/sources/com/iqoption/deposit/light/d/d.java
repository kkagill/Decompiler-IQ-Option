package com.iqoption.deposit.light.d;

import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.ui.widget.recyclerview.adapter.a;
import com.iqoption.deposit.b.ap;
import com.iqoption.deposit.o.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001e\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/deposit/light/presets/PresetsLightAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/deposit/light/presets/PresetLightViewHolder;", "Lcom/iqoption/deposit/light/presets/PresetItem;", "listener", "Lcom/iqoption/deposit/light/presets/OnPresetLightClickListener;", "(Lcom/iqoption/deposit/light/presets/OnPresetLightClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemsWithSelection", "items", "", "selectedAmount", "", "deposit_release"})
/* compiled from: PresetsLightAdapter.kt */
public final class d extends a<c, b> {
    private final a cGb;

    public d(a aVar) {
        kotlin.jvm.internal.i.f(aVar, CastExtraArgs.LISTENER);
        this.cGb = aVar;
    }

    /* renamed from: x */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new c((ap) com.iqoption.core.ext.a.a(viewGroup, f.item_preset_light, null, false, 6, null), this.cGb);
    }

    /* renamed from: a */
    public void onBindViewHolder(c cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        cVar.b((b) fp(i));
    }

    public final void c(List<b> list, String str) {
        kotlin.jvm.internal.i.f(list, "items");
        Iterable<Object> iterable = list;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Object obj : iterable) {
            Object obj2;
            boolean z = str != null && com.iqoption.deposit.f.a(obj2.asL(), str);
            if (z != obj2.asM()) {
                obj2 = b.a(obj2, null, null, z, 3, null);
            }
            arrayList.add(obj2);
        }
        aG((List) arrayList);
    }
}
