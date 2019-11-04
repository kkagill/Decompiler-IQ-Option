package com.iqoption.fragment.assets.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.cb;
import com.iqoption.e.cv;
import com.iqoption.fragment.assets.model.d;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, bng = {"Lcom/iqoption/fragment/assets/viewholder/AssetBoViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetsBoItemBinding;", "Lcom/iqoption/fragment/assets/model/AssetBo;", "Lcom/iqoption/fragment/assets/viewholder/AssetViewHolder;", "callback", "Lcom/iqoption/fragment/assets/viewholder/AssetItemCallback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/assets/viewholder/AssetItemCallback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "actionsBinding", "Lcom/iqoption/databinding/AssetsItemActionsBinding;", "getActionsBinding", "()Lcom/iqoption/databinding/AssetsItemActionsBinding;", "asset", "getAsset", "()Lcom/iqoption/fragment/assets/model/AssetBo;", "bind", "", "item", "app_optionXRelease"})
/* compiled from: AssetBoViewHolder.kt */
public final class a extends e<cb, d> implements j<d> {
    public a(g gVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(gVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(R.layout.assets_bo_item, viewGroup, aVar);
        h hVar = new h(gVar, this);
    }

    /* renamed from: aBB */
    public d aBC() {
        return (d) and();
    }

    public cv aBD() {
        cv cvVar = ((cb) getBinding()).bXr;
        kotlin.jvm.internal.i.e(cvVar, "binding.actions");
        return cvVar;
    }

    public void a(cb cbVar, d dVar) {
        kotlin.jvm.internal.i.f(cbVar, "$this$bind");
        kotlin.jvm.internal.i.f(dVar, "item");
        String str = "itemView";
        View view;
        if (dVar.getImage() != null) {
            view = this.itemView;
            kotlin.jvm.internal.i.e(view, str);
            Picasso.with(view.getContext()).load(dVar.getImage()).into(cbVar.aRh);
        } else {
            view = this.itemView;
            kotlin.jvm.internal.i.e(view, str);
            Picasso.with(view.getContext()).cancelRequest(cbVar.aRh);
        }
        TextView textView = cbVar.amZ;
        kotlin.jvm.internal.i.e(textView, ConditionalUserProperty.NAME);
        textView.setText(dVar.getName());
        textView = cbVar.bXt;
        kotlin.jvm.internal.i.e(textView, "quote");
        textView.setText(dVar.mp());
        textView = cbVar.alW;
        kotlin.jvm.internal.i.e(textView, "profit");
        textView.setText(dVar.aAM());
        ImageView imageView = cbVar.bXr.bWR;
        kotlin.jvm.internal.i.e(imageView, "actions.btnFavorites");
        imageView.setSelected(dVar.QE());
    }
}
