package com.iqoption.fragment.assets.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.ui.widget.recyclerview.a.a;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.ch;
import com.iqoption.e.cv;
import com.iqoption.fragment.assets.model.h;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, bng = {"Lcom/iqoption/fragment/assets/viewholder/AssetClosedViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetsClosedItemBinding;", "Lcom/iqoption/fragment/assets/model/AssetClosed;", "Lcom/iqoption/fragment/assets/viewholder/AssetViewHolder;", "callback", "Lcom/iqoption/fragment/assets/viewholder/AssetItemCallback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/assets/viewholder/AssetItemCallback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "actionsBinding", "Lcom/iqoption/databinding/AssetsItemActionsBinding;", "getActionsBinding", "()Lcom/iqoption/databinding/AssetsItemActionsBinding;", "asset", "getAsset", "()Lcom/iqoption/fragment/assets/model/AssetClosed;", "bind", "", "item", "app_optionXRelease"})
/* compiled from: AssetClosedViewHolder.kt */
public final class d extends e<ch, h> implements j<h> {
    public d(g gVar, ViewGroup viewGroup, a aVar) {
        kotlin.jvm.internal.i.f(gVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(R.layout.assets_closed_item, viewGroup, aVar);
        h hVar = new h(gVar, this);
    }

    /* renamed from: aBF */
    public h aBC() {
        return (h) and();
    }

    public cv aBD() {
        cv cvVar = ((ch) getBinding()).bXr;
        kotlin.jvm.internal.i.e(cvVar, "binding.actions");
        return cvVar;
    }

    public void a(ch chVar, h hVar) {
        kotlin.jvm.internal.i.f(chVar, "$this$bind");
        kotlin.jvm.internal.i.f(hVar, "item");
        String str = "itemView";
        View view;
        if (hVar.getImage() != null) {
            view = this.itemView;
            kotlin.jvm.internal.i.e(view, str);
            Picasso.with(view.getContext()).load(hVar.getImage()).into(chVar.aRh);
        } else {
            view = this.itemView;
            kotlin.jvm.internal.i.e(view, str);
            Picasso.with(view.getContext()).cancelRequest(chVar.aRh);
        }
        TextView textView = chVar.amZ;
        kotlin.jvm.internal.i.e(textView, ConditionalUserProperty.NAME);
        textView.setText(hVar.getName());
        textView = chVar.bXt;
        kotlin.jvm.internal.i.e(textView, "quote");
        textView.setText(hVar.mp());
        textView = chVar.bXx;
        kotlin.jvm.internal.i.e(textView, "openAt");
        textView.setText(hVar.aAZ());
        ImageView imageView = chVar.bXr.bWR;
        kotlin.jvm.internal.i.e(imageView, "actions.btnFavorites");
        imageView.setSelected(hVar.QE());
    }
}
