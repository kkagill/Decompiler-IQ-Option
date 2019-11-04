package com.iqoption.alerts.ui.list;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.alerts.b.d;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.squareup.picasso.Picasso;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/alerts/databinding/AlertsListAlertItemBinding;", "Lcom/iqoption/alerts/ui/list/BaseAlertItem;", "callback", "Lcom/iqoption/alerts/ui/list/AlertItemViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/alerts/ui/list/AlertItemViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "alerts_release"})
/* compiled from: AlertItemViewHolder.kt */
public final class c extends e<com.iqoption.alerts.a.a, i> {
    private final a apf;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertItemViewHolder$Callback;", "", "onItemClick", "", "item", "Lcom/iqoption/alerts/ui/list/AlertItem;", "position", "", "onItemConfigureClick", "onItemDeleteClick", "alerts_release"})
    /* compiled from: AlertItemViewHolder.kt */
    public interface a {
        void a(b bVar);

        void a(b bVar, int i);

        void b(b bVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/alerts/ui/list/AlertItemViewHolder$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "alerts_release"})
    /* compiled from: AlertItemViewHolder.kt */
    public static final class b extends g {
        final /* synthetic */ c apg;

        b(c cVar) {
            this.apg = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            Object and = this.apg.and();
            if (!(and instanceof b)) {
                and = null;
            }
            b bVar = (b) and;
            if (bVar != null) {
                int id = view.getId();
                if (id == d.itemContent) {
                    this.apg.apf.a(bVar, this.apg.getAdapterPosition());
                } else if (id == d.btnDelete) {
                    this.apg.apf.a(bVar);
                } else if (id == d.btnConfigure) {
                    this.apg.apf.b(bVar);
                }
            }
        }
    }

    public c(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(com.iqoption.alerts.b.e.alerts_list_alert_item, viewGroup, aVar2);
        this.apf = aVar;
        com.iqoption.alerts.a.a aVar3 = (com.iqoption.alerts.a.a) getBinding();
        OnClickListener bVar = new b(this);
        aVar3.aon.setOnClickListener(bVar);
        aVar3.aoj.setOnClickListener(bVar);
        aVar3.aoi.setOnClickListener(bVar);
    }

    public void a(com.iqoption.alerts.a.a aVar, i iVar) {
        ImageView imageView;
        ConstraintLayout constraintLayout;
        kotlin.jvm.internal.i.f(aVar, "$this$bind");
        kotlin.jvm.internal.i.f(iVar, "item");
        if ((((CharSequence) iVar.Bd()).length() == 0 ? 1 : null) != null) {
            Picasso.with(getContext()).cancelRequest(aVar.aog);
            aVar.aog.setImageDrawable(null);
        } else {
            Picasso.with(getContext()).load(iVar.Bd()).into(aVar.aog);
        }
        String str = "assetImage";
        String str2 = "itemContent";
        if (iVar instanceof b) {
            imageView = aVar.aog;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setAlpha(1.0f);
            constraintLayout = aVar.aon;
            kotlin.jvm.internal.i.e(constraintLayout, str2);
            constraintLayout.setClickable(true);
        } else {
            imageView = aVar.aog;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setAlpha(0.5f);
            constraintLayout = aVar.aon;
            kotlin.jvm.internal.i.e(constraintLayout, str2);
            constraintLayout.setClickable(false);
        }
        TextView textView = aVar.aoh;
        kotlin.jvm.internal.i.e(textView, "assetName");
        textView.setText(iVar.Bc());
        textView = aVar.aol;
        kotlin.jvm.internal.i.e(textView, "instrumentType");
        textView.setText(iVar.Be());
        textView = aVar.aoq;
        kotlin.jvm.internal.i.e(textView, ConditionalUserProperty.VALUE);
        textView.setText(iVar.getValue());
        ViewDataBinding viewDataBinding = aVar;
        aVar.aoq.setTextColor(com.iqoption.core.ext.a.a(viewDataBinding, iVar.Bf()));
        textView = aVar.aoo;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CALL_TO_ACTION_LABEL);
        textView.setText(iVar.getLabel());
        aVar.aoo.setTextColor(com.iqoption.core.ext.a.a(viewDataBinding, iVar.Bg()));
        imageView = aVar.aop;
        kotlin.jvm.internal.i.e(imageView, "labelImage");
        com.iqoption.core.ext.a.a(imageView, com.iqoption.core.ext.a.a(viewDataBinding, iVar.Bh()));
        aVar.aop.setImageResource(iVar.Bi());
        constraintLayout = aVar.aon;
        kotlin.jvm.internal.i.e(constraintLayout, str2);
        constraintLayout.setSelected(iVar.nq());
        String str3 = "containerButtons";
        LinearLayout linearLayout;
        if (iVar.nq()) {
            linearLayout = aVar.aok;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            com.iqoption.core.ext.a.ak(linearLayout);
            return;
        }
        linearLayout = aVar.aok;
        kotlin.jvm.internal.i.e(linearLayout, str3);
        com.iqoption.core.ext.a.al(linearLayout);
    }
}
