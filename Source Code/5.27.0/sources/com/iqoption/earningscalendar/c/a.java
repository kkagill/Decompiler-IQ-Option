package com.iqoption.earningscalendar.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.iqoption.core.microservices.a.a.b;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.earningscalendar.a.g;
import com.iqoption.earningscalendar.h;
import com.iqoption.earningscalendar.o.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/earningscalendar/micro/MicroEarningsCalendarItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/earningscalendar/databinding/MicroEarningsCalendarItemBinding;", "Lcom/iqoption/earningscalendar/EarningsCalendarItem;", "callback", "Lcom/iqoption/earningscalendar/EarningsCalendarAdapter$Callbacks;", "earningsCalendarItemBinder", "Lcom/iqoption/earningscalendar/EarningsCalendarItemBinder;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/earningscalendar/EarningsCalendarAdapter$Callbacks;Lcom/iqoption/earningscalendar/EarningsCalendarItemBinder;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "earningscalendar_release"})
/* compiled from: MicroEarningsCalendarItemViewHolder.kt */
public final class a extends e<g, h> {
    private final com.iqoption.earningscalendar.i cMY;
    private final com.iqoption.earningscalendar.d.a cNZ;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends com.iqoption.core.ext.g {
        final /* synthetic */ a cOb;

        public a(a aVar) {
            this.cOb = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            h hVar = (h) this.cOb.and();
            if (hVar != null) {
                this.cOb.cNZ.a(hVar);
            }
        }
    }

    public a(com.iqoption.earningscalendar.d.a aVar, com.iqoption.earningscalendar.i iVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(iVar, "earningsCalendarItemBinder");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(c.micro_earnings_calendar_item, viewGroup, aVar2);
        this.cNZ = aVar;
        this.cMY = iVar;
        ConstraintLayout constraintLayout = ((g) getBinding()).cNT;
        kotlin.jvm.internal.i.e(constraintLayout, "binding.earningItemContainer");
        constraintLayout.setOnClickListener(new a(this));
    }

    public void a(g gVar, h hVar) {
        kotlin.jvm.internal.i.f(gVar, "$this$bind");
        kotlin.jvm.internal.i.f(hVar, "item");
        b auW = hVar.auW();
        com.iqoption.asset.mediators.a auX = hVar.auX();
        Double d = null;
        com.iqoption.core.microservices.tradingengine.response.active.a Jt = auX != null ? auX.Jt() : null;
        com.iqoption.earningscalendar.i iVar = this.cMY;
        ImageView imageView = gVar.cNS;
        kotlin.jvm.internal.i.e(imageView, "earningIcon");
        iVar.a(imageView, Jt, auW);
        iVar = this.cMY;
        TextView textView = gVar.cNU;
        kotlin.jvm.internal.i.e(textView, "earningName");
        iVar.a(textView, auW);
        iVar = this.cMY;
        textView = gVar.cNQ;
        kotlin.jvm.internal.i.e(textView, "earningAnnounceTime");
        iVar.b(textView, auW);
        iVar = this.cMY;
        textView = gVar.cNR;
        kotlin.jvm.internal.i.e(textView, "earningDiff");
        if (auX != null) {
            com.iqoption.core.microservices.f.a.a.a JS = auX.JS();
            if (JS != null) {
                com.iqoption.core.microservices.f.a.a.a.c ahy = JS.ahy();
                if (ahy != null) {
                    d = ahy.ahD();
                }
            }
        }
        iVar.a(textView, d);
        iVar = this.cMY;
        textView = gVar.cNO;
        kotlin.jvm.internal.i.e(textView, "currently");
        TextView textView2 = gVar.cNV;
        kotlin.jvm.internal.i.e(textView2, "forecast");
        TextView textView3 = gVar.cNX;
        kotlin.jvm.internal.i.e(textView3, "previous");
        TextView textView4 = gVar.ale;
        kotlin.jvm.internal.i.e(textView4, "timeValue");
        LinearLayout linearLayout = gVar.ckT;
        kotlin.jvm.internal.i.e(linearLayout, "timeContainer");
        iVar.a(textView, textView2, textView3, textView4, linearLayout, auW, Jt, auW.adn());
    }
}
