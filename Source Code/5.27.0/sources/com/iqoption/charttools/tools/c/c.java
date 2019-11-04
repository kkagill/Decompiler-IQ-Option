package com.iqoption.charttools.tools.c;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.charttools.tools.data.n;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.op;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0014\u0010\u000e\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/IndicatorTitleViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/IndicatorTitleItemBinding;", "Lcom/iqoption/charttools/tools/data/TitleIndicatorItem;", "callback", "Lcom/iqoption/charttools/tools/viewholder/IndicatorTitleViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/tools/viewholder/IndicatorTitleViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "bindImage", "Landroid/widget/ImageView;", "icon", "Lcom/iqoption/core/data/model/UrlOrRes;", "Callback", "app_optionXRelease"})
/* compiled from: IndicatorTitleViewHolder.kt */
public final class c extends e<op, n> {
    private final a aNO;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, bng = {"Lcom/iqoption/charttools/tools/viewholder/IndicatorTitleViewHolder$Callback;", "", "onItemClick", "", "item", "Lcom/iqoption/charttools/tools/data/TitleIndicatorItem;", "onItemFavoriteButtonClick", "onItemInfoButtonClick", "app_optionXRelease"})
    /* compiled from: IndicatorTitleViewHolder.kt */
    public interface a {
        void c(n nVar);

        void d(n nVar);

        void e(n nVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/tools/viewholder/IndicatorTitleViewHolder$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: IndicatorTitleViewHolder.kt */
    public static final class b extends g {
        final /* synthetic */ c aNP;

        b(c cVar) {
            this.aNP = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            n nVar = (n) this.aNP.and();
            if (nVar != null) {
                int id = view.getId();
                if (id == R.id.btnFavorites) {
                    this.aNP.aNO.e(nVar);
                } else if (id == R.id.btnInfo) {
                    this.aNP.aNO.d(nVar);
                } else if (id == R.id.content) {
                    this.aNP.aNO.c(nVar);
                }
            }
        }
    }

    public c(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(R.layout.indicator_title_item, viewGroup, aVar2);
        this.aNO = aVar;
        OnClickListener bVar = new b(this);
        ((op) getBinding()).aGo.setOnClickListener(bVar);
        ((op) getBinding()).bYb.setOnClickListener(bVar);
        ((op) getBinding()).bWR.setOnClickListener(bVar);
    }

    public void a(op opVar, n nVar) {
        kotlin.jvm.internal.i.f(opVar, "$this$bind");
        kotlin.jvm.internal.i.f(nVar, "item");
        ImageView imageView = opVar.aRh;
        kotlin.jvm.internal.i.e(imageView, "icon");
        a(imageView, nVar.Op());
        TextView textView = opVar.alH;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        textView.setText(nVar.getTitle());
        LinearLayout linearLayout = opVar.aGo;
        kotlin.jvm.internal.i.e(linearLayout, "content");
        linearLayout.setEnabled(nVar.isAvailable());
        imageView = opVar.bYb;
        String str = "btnInfo";
        kotlin.jvm.internal.i.e(imageView, str);
        imageView.setSelected(nVar.nq());
        imageView = opVar.bWR;
        kotlin.jvm.internal.i.e(imageView, "btnFavorites");
        imageView.setSelected(nVar.QE());
        ImageView imageView2;
        if (nVar.getInfo() != null) {
            imageView2 = opVar.bYb;
            kotlin.jvm.internal.i.e(imageView2, str);
            com.iqoption.core.ext.a.ak(imageView2);
            return;
        }
        imageView2 = opVar.bYb;
        kotlin.jvm.internal.i.e(imageView2, str);
        com.iqoption.core.ext.a.al(imageView2);
    }

    private final void a(ImageView imageView, com.iqoption.core.data.model.e eVar) {
        if (eVar.getUrl() != null) {
            Picasso.with(imageView.getContext()).load(eVar.getUrl()).placeholder((int) R.drawable.circle_grey_blur_10).into(imageView);
            return;
        }
        Picasso.with(imageView.getContext()).cancelRequest(imageView);
        imageView.setImageResource(eVar.getResId());
    }
}
