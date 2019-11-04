package com.iqoption.charttools.tools.c;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.iqoption.charttools.tools.data.k;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.zh;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/SwitcherViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/StringBasketSwitchItemBinding;", "Lcom/iqoption/charttools/tools/data/SettingItem;", "callback", "Lcom/iqoption/charttools/tools/viewholder/SwitcherViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/tools/viewholder/SwitcherViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: SwitcherViewHolder.kt */
public final class d extends e<zh, k> {
    private final a aNQ;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: SwitcherViewHolder.kt */
    /* renamed from: com.iqoption.charttools.tools.c.d$1 */
    static final class AnonymousClass1 implements OnCheckedChangeListener {
        final /* synthetic */ d aNR;

        AnonymousClass1(d dVar) {
            this.aNR = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            k kVar = (k) this.aNR.and();
            if (kVar != null && z != kVar.isEnabled()) {
                this.aNR.aNQ.b(kVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/SwitcherViewHolder$Callback;", "", "onItemToggled", "", "item", "Lcom/iqoption/charttools/tools/data/SettingItem;", "app_optionXRelease"})
    /* compiled from: SwitcherViewHolder.kt */
    public interface a {
        void b(k kVar);
    }

    public d(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(R.layout.string_basket_switch_item, viewGroup, aVar2);
        this.aNQ = aVar;
        ((zh) getBinding()).aIt.setOnCheckedChangeListener(new AnonymousClass1(this));
    }

    public void a(zh zhVar, k kVar) {
        kotlin.jvm.internal.i.f(zhVar, "$this$bind");
        kotlin.jvm.internal.i.f(kVar, "item");
        zhVar.aIt.setText(kVar.QA().getText());
        SwitchCompat switchCompat = zhVar.aIt;
        kotlin.jvm.internal.i.e(switchCompat, "switcher");
        if (switchCompat.isChecked() != kVar.isEnabled()) {
            zhVar.aIt.toggle();
        }
    }
}
