package com.iqoption.fragment.c.d.b;

import android.animation.Animator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.d;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.core.util.af;
import com.iqoption.e.bj;
import com.iqoption.fragment.c.a.b.j;
import com.iqoption.x.R;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0014\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J$\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0014J\u0014\u0010\u0016\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/TitleViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/AssetInfoTitleItemBinding;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetTitle;", "callback", "Lcom/iqoption/fragment/infoasset/viewholder/info/TitleViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "uiConfig", "Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/fragment/infoasset/viewholder/info/TitleViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/fragment/infoasset/adapters/UIConfig;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getUiConfig", "()Lcom/iqoption/fragment/infoasset/adapters/UIConfig;", "animateBadge", "", "item", "bind", "payloads", "", "", "bindBadge", "Callback", "app_optionXRelease"})
/* compiled from: TitleViewHolder.kt */
public final class h extends e<bj, j> {
    private final com.iqoption.fragment.c.a.a dgU;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/infoasset/viewholder/info/TitleViewHolder$Callback;", "", "onItemAlertButtonClick", "", "item", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetTitle;", "onItemFavoriteButtonClick", "app_optionXRelease"})
    /* compiled from: TitleViewHolder.kt */
    public interface a {
        void a(j jVar);

        void b(j jVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/infoasset/viewholder/info/TitleViewHolder$animateBadge$1", "Lcom/iqoption/core/graphics/animation/CancelCompleteAnimatorListener;", "onCompleted", "", "animation", "Landroid/animation/Animator;", "app_optionXRelease"})
    /* compiled from: TitleViewHolder.kt */
    public static final class b extends com.iqoption.core.graphics.animation.b {
        final /* synthetic */ bj dii;

        b(bj bjVar) {
            this.dii = bjVar;
        }

        public void b(Animator animator) {
            super.b(animator);
            TextView textView = this.dii.bWP;
            kotlin.jvm.internal.i.e(textView, "alertsBadge");
            com.iqoption.core.ext.a.al(textView);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/infoasset/viewholder/info/TitleViewHolder$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: TitleViewHolder.kt */
    public static final class c extends g {
        final /* synthetic */ h dij;
        final /* synthetic */ a dik;

        c(h hVar, a aVar) {
            this.dij = hVar;
            this.dik = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            j jVar = (j) this.dij.and();
            if (jVar != null) {
                int id = view.getId();
                if (id == R.id.btnAlert) {
                    this.dik.b(jVar);
                } else if (id == R.id.btnFavorites) {
                    this.dik.a(jVar);
                }
            }
        }
    }

    public h(a aVar, ViewGroup viewGroup, com.iqoption.fragment.c.a.a aVar2, com.iqoption.core.ui.widget.recyclerview.a.a aVar3) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "uiConfig");
        kotlin.jvm.internal.i.f(aVar3, "data");
        super(R.layout.asset_info_title_item, viewGroup, aVar3);
        this.dgU = aVar2;
        OnClickListener cVar = new c(this, aVar);
        ((bj) getBinding()).bWR.setOnClickListener(cVar);
        ((bj) getBinding()).bWQ.setOnClickListener(cVar);
    }

    public void a(bj bjVar, j jVar) {
        kotlin.jvm.internal.i.f(bjVar, "$this$bind");
        kotlin.jvm.internal.i.f(jVar, "item");
        TextView textView = bjVar.alH;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        textView.setText(jVar.adZ());
        ImageView imageView = bjVar.bWR;
        String str = "btnFavorites";
        kotlin.jvm.internal.i.e(imageView, str);
        com.iqoption.core.ext.a.d((View) imageView, jVar.aDK() != null);
        Boolean aDK = jVar.aDK();
        if (aDK != null) {
            boolean booleanValue = aDK.booleanValue();
            ImageView imageView2 = bjVar.bWR;
            kotlin.jvm.internal.i.e(imageView2, str);
            imageView2.setSelected(booleanValue);
        }
        str = "rate";
        if (jVar.aDI() != null) {
            textView = bjVar.bWT;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(com.iqoption.core.util.j.fr(jVar.getPrecision()).format(jVar.aDI().doubleValue()));
        } else {
            textView = bjVar.bWT;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(this.dgU.aDm());
        }
        str = "changeValue";
        if (jVar.aDJ() != null) {
            com.iqoption.fragment.c.a.a aVar = this.dgU;
            TextView textView2 = bjVar.bWS;
            kotlin.jvm.internal.i.e(textView2, str);
            aVar.a(textView2, jVar.aDJ().doubleValue());
            textView = bjVar.bWS;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(af.h(jVar.aDJ().doubleValue(), 3));
        } else {
            bjVar.bWS.setTextColor(this.dgU.aDk());
            TextView textView3 = bjVar.bWS;
            kotlin.jvm.internal.i.e(textView3, str);
            textView3.setText(this.dgU.aDm());
        }
        String str2 = "btnAlert";
        ImageView imageView3;
        if (d.EH().ej("price-alerts")) {
            imageView3 = bjVar.bWQ;
            kotlin.jvm.internal.i.e(imageView3, str2);
            com.iqoption.core.ext.a.ak(imageView3);
            return;
        }
        imageView3 = bjVar.bWQ;
        kotlin.jvm.internal.i.e(imageView3, str2);
        com.iqoption.core.ext.a.al(imageView3);
    }

    /* Access modifiers changed, original: protected */
    public void a(bj bjVar, j jVar, List<? extends Object> list) {
        kotlin.jvm.internal.i.f(bjVar, "$this$bind");
        kotlin.jvm.internal.i.f(jVar, "item");
        kotlin.jvm.internal.i.f(list, "payloads");
        a(bjVar, jVar);
        if (list.isEmpty()) {
            b(bjVar, jVar);
        } else if (list.contains(Integer.valueOf(1))) {
            c(bjVar, jVar);
        }
    }

    private final void b(bj bjVar, j jVar) {
        String str = "alertsBadge";
        TextView textView;
        if ((((CharSequence) jVar.aDL()).length() == 0 ? 1 : null) != null) {
            textView = bjVar.bWP;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.al(textView);
            return;
        }
        TextView textView2 = bjVar.bWP;
        kotlin.jvm.internal.i.e(textView2, str);
        com.iqoption.core.ext.a.ak(textView2);
        textView = bjVar.bWP;
        kotlin.jvm.internal.i.e(textView, str);
        textView.setText(jVar.aDL());
    }

    private final void c(bj bjVar, j jVar) {
        if ((((CharSequence) jVar.aDL()).length() == 0 ? 1 : null) != null) {
            bjVar.bWP.animate().scaleX(0.3f).scaleY(0.3f).alpha(0.0f).setListener(new b(bjVar)).start();
            return;
        }
        TextView textView = bjVar.bWP;
        String str = "alertsBadge";
        kotlin.jvm.internal.i.e(textView, str);
        textView.setText(jVar.aDL());
        TextView textView2 = bjVar.bWP;
        kotlin.jvm.internal.i.e(textView2, str);
        textView2.setScaleX(0.3f);
        textView2 = bjVar.bWP;
        kotlin.jvm.internal.i.e(textView2, str);
        textView2.setScaleY(0.3f);
        textView2 = bjVar.bWP;
        kotlin.jvm.internal.i.e(textView2, str);
        textView2.setAlpha(0.0f);
        textView2 = bjVar.bWP;
        kotlin.jvm.internal.i.e(textView2, str);
        com.iqoption.core.ext.a.ak(textView2);
        bjVar.bWP.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(null).start();
    }
}
