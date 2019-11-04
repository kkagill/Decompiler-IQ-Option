package com.iqoption.signals;

import android.view.View;
import android.view.View.OnClickListener;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.signals.a.e;
import com.iqoption.x.R;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/widget/window/OptionsWindow;", "invoke"})
/* compiled from: SignalsFragment.kt */
final class SignalsFragment$filtersWindow$2 extends Lambda implements kotlin.jvm.a.a<com.iqoption.core.ui.widget.i.a> {
    final /* synthetic */ q this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/signals/SignalsFragment$filtersWindow$2$1$listener$1"})
    /* compiled from: SignalsFragment.kt */
    static final class a implements OnClickListener {
        final /* synthetic */ com.iqoption.core.ui.widget.i.a dTG;
        final /* synthetic */ SignalsFragment$filtersWindow$2 dTH;

        a(com.iqoption.core.ui.widget.i.a aVar, SignalsFragment$filtersWindow$2 signalsFragment$filtersWindow$2) {
            this.dTG = aVar;
            this.dTH = signalsFragment$filtersWindow$2;
        }

        public final void onClick(View view) {
            SignalFilter signalFilter;
            double d;
            kotlin.jvm.internal.i.e(view, "v");
            int id = view.getId();
            if (id == R.id.gap) {
                signalFilter = SignalFilter.GAP;
                d = 1.0d;
            } else if (id != R.id.sharpJump) {
                signalFilter = SignalFilter.ALL;
                d = 0.0d;
            } else {
                signalFilter = SignalFilter.SHARP_JUMP;
                d = 2.0d;
            }
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "signals_set-filter").setValue(Double.valueOf(d)).build());
            q.a(this.dTH.this$0).b(signalFilter);
            this.dTG.dismiss();
        }
    }

    SignalsFragment$filtersWindow$2(q qVar) {
        this.this$0 = qVar;
        super(0);
    }

    /* renamed from: aUp */
    public final com.iqoption.core.ui.widget.i.a invoke() {
        com.iqoption.core.ui.widget.i.a aVar = new com.iqoption.core.ui.widget.i.a();
        e eVar = (e) com.iqoption.core.ext.a.a(this.this$0, (int) R.layout.price_movements_filter_options, null, false, 4, null);
        View root = eVar.getRoot();
        kotlin.jvm.internal.i.e(root, "b.root");
        if (root != null) {
            com.iqoption.core.ext.a.an(root);
            aVar.e(root, root.getMeasuredWidth(), root.getMeasuredHeight());
            OnClickListener aVar2 = new a(aVar, this);
            eVar.dUd.setOnClickListener(aVar2);
            eVar.dUe.setOnClickListener(aVar2);
            eVar.dUf.setOnClickListener(aVar2);
            return aVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }
}
