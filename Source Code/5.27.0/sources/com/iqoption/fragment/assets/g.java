package com.iqoption.fragment.assets;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.transition.Transition;
import com.iqoption.e.cn;
import com.iqoption.fragment.assets.model.AssetSortType;
import com.iqoption.fragment.assets.model.p;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0014J\u0014\u0010\u000e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014¨\u0006\u0011"}, bng = {"Lcom/iqoption/fragment/assets/BoHeaderDelegate;", "Lcom/iqoption/fragment/assets/HeaderDelegate;", "Lcom/iqoption/databinding/AssetsHeaderBoBinding;", "container", "Landroid/view/ViewGroup;", "endPadding", "", "transition", "Landroidx/transition/Transition;", "viewModel", "Lcom/iqoption/fragment/assets/AssetsViewModel;", "(Landroid/view/ViewGroup;ILandroidx/transition/Transition;Lcom/iqoption/fragment/assets/AssetsViewModel;)V", "onCreateBinding", "", "onUpdateState", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
/* compiled from: HeaderDelegate.kt */
public final class g extends n<cn> {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/assets/BoHeaderDelegate$onCreateBinding$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: HeaderDelegate.kt */
    public static final class a extends com.iqoption.core.ext.g {
        final /* synthetic */ g dbw;

        a(g gVar) {
            this.dbw = gVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            switch (view.getId()) {
                case R.id.sortIndicatorName /*2131363905*/:
                case R.id.sortLabelName /*2131363913*/:
                    this.dbw.aAD().a(AssetSortType.BY_NAME);
                    return;
                case R.id.sortIndicatorProfit /*2131363906*/:
                case R.id.sortLabelProfit /*2131363914*/:
                    this.dbw.aAD().a(AssetSortType.BY_PROFIT);
                    return;
                default:
                    return;
            }
        }
    }

    public g(ViewGroup viewGroup, int i, Transition transition, e eVar) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        kotlin.jvm.internal.i.f(transition, "transition");
        kotlin.jvm.internal.i.f(eVar, "viewModel");
        super(R.layout.assets_header_bo, viewGroup, i, transition, eVar, null);
    }

    /* Access modifiers changed, original: protected */
    public void a(cn cnVar) {
        kotlin.jvm.internal.i.f(cnVar, "$this$onCreateBinding");
        View[] viewArr = new View[4];
        TextView textView = cnVar.bXD;
        kotlin.jvm.internal.i.e(textView, "sortLabelName");
        viewArr[0] = textView;
        ImageView imageView = cnVar.bXB;
        kotlin.jvm.internal.i.e(imageView, "sortIndicatorName");
        viewArr[1] = imageView;
        textView = cnVar.bXE;
        kotlin.jvm.internal.i.e(textView, "sortLabelProfit");
        viewArr[2] = textView;
        ImageView imageView2 = cnVar.bXC;
        kotlin.jvm.internal.i.e(imageView2, "sortIndicatorProfit");
        viewArr[3] = imageView2;
        com.iqoption.core.ext.a.a(viewArr, (OnClickListener) new a(this));
    }

    /* Access modifiers changed, original: protected */
    public void a(cn cnVar, p pVar) {
        ImageView imageView;
        kotlin.jvm.internal.i.f(cnVar, "$this$onUpdateState");
        kotlin.jvm.internal.i.f(pVar, "sorting");
        String str = "sortIndicatorProfit";
        String str2 = "sortIndicatorName";
        if (pVar.aBv() == AssetSortType.BY_PROFIT) {
            imageView = cnVar.bXB;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setSelected(false);
            imageView = cnVar.bXC;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setSelected(true);
        } else {
            imageView = cnVar.bXB;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setSelected(true);
            imageView = cnVar.bXC;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setSelected(false);
        }
        imageView = cnVar.bXB;
        kotlin.jvm.internal.i.e(imageView, str2);
        imageView.setRotation(a(pVar, AssetSortType.BY_NAME));
        ImageView imageView2 = cnVar.bXC;
        kotlin.jvm.internal.i.e(imageView2, str);
        imageView2.setRotation(a(pVar, AssetSortType.BY_PROFIT));
    }
}
