package com.iqoption.fragment.assets;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.transition.Transition;
import com.iqoption.core.ext.g;
import com.iqoption.e.cp;
import com.iqoption.fragment.assets.model.AssetSortType;
import com.iqoption.fragment.assets.model.p;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0014J\u0014\u0010\u000e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014¨\u0006\u0011"}, bng = {"Lcom/iqoption/fragment/assets/CfdHeaderBinding;", "Lcom/iqoption/fragment/assets/HeaderDelegate;", "Lcom/iqoption/databinding/AssetsHeaderCfdBinding;", "container", "Landroid/view/ViewGroup;", "endPadding", "", "transition", "Landroidx/transition/Transition;", "viewModel", "Lcom/iqoption/fragment/assets/AssetsViewModel;", "(Landroid/view/ViewGroup;ILandroidx/transition/Transition;Lcom/iqoption/fragment/assets/AssetsViewModel;)V", "onCreateBinding", "", "onUpdateState", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
/* compiled from: HeaderDelegate.kt */
public final class h extends n<cp> {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/assets/CfdHeaderBinding$onCreateBinding$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: HeaderDelegate.kt */
    public static final class a extends g {
        final /* synthetic */ h dbx;

        a(h hVar) {
            this.dbx = hVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            switch (view.getId()) {
                case R.id.sortIndicatorDiff /*2131363902*/:
                case R.id.sortLabelDiff /*2131363910*/:
                    this.dbx.aAD().a(AssetSortType.BY_DIFF);
                    return;
                case R.id.sortIndicatorLeverage /*2131363904*/:
                case R.id.sortLabelLeverage /*2131363912*/:
                    this.dbx.aAD().a(AssetSortType.BY_LEVERAGE);
                    return;
                case R.id.sortIndicatorSpread /*2131363908*/:
                case R.id.sortLabelSpread /*2131363916*/:
                    this.dbx.aAD().a(AssetSortType.BY_SPREAD);
                    return;
                case R.id.sortIndicatorVolume /*2131363909*/:
                case R.id.sortLabelVolume /*2131363917*/:
                    this.dbx.aAD().a(AssetSortType.BY_VOLUME);
                    return;
                default:
                    return;
            }
        }
    }

    public h(ViewGroup viewGroup, int i, Transition transition, e eVar) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        kotlin.jvm.internal.i.f(transition, "transition");
        kotlin.jvm.internal.i.f(eVar, "viewModel");
        super(R.layout.assets_header_cfd, viewGroup, i, transition, eVar, null);
    }

    /* Access modifiers changed, original: protected */
    public void a(cp cpVar) {
        kotlin.jvm.internal.i.f(cpVar, "$this$onCreateBinding");
        View[] viewArr = new View[8];
        TextView textView = cpVar.bXR;
        kotlin.jvm.internal.i.e(textView, "sortLabelVolume");
        viewArr[0] = textView;
        ImageView imageView = cpVar.bXN;
        kotlin.jvm.internal.i.e(imageView, "sortIndicatorVolume");
        viewArr[1] = imageView;
        textView = cpVar.bXO;
        kotlin.jvm.internal.i.e(textView, "sortLabelDiff");
        viewArr[2] = textView;
        imageView = cpVar.bXK;
        kotlin.jvm.internal.i.e(imageView, "sortIndicatorDiff");
        viewArr[3] = imageView;
        textView = cpVar.bXQ;
        kotlin.jvm.internal.i.e(textView, "sortLabelSpread");
        viewArr[4] = textView;
        imageView = cpVar.bXM;
        kotlin.jvm.internal.i.e(imageView, "sortIndicatorSpread");
        viewArr[5] = imageView;
        textView = cpVar.bXP;
        kotlin.jvm.internal.i.e(textView, "sortLabelLeverage");
        viewArr[6] = textView;
        ImageView imageView2 = cpVar.bXL;
        kotlin.jvm.internal.i.e(imageView2, "sortIndicatorLeverage");
        viewArr[7] = imageView2;
        com.iqoption.core.ext.a.a(viewArr, (OnClickListener) new a(this));
    }

    /* Access modifiers changed, original: protected */
    public void a(cp cpVar, p pVar) {
        ImageView imageView;
        kotlin.jvm.internal.i.f(cpVar, "$this$onUpdateState");
        kotlin.jvm.internal.i.f(pVar, "sorting");
        int i = i.aob[pVar.aBv().ordinal()];
        String str = "sortIndicatorLeverage";
        String str2 = "sortIndicatorSpread";
        String str3 = "sortIndicatorDiff";
        String str4 = "sortIndicatorVolume";
        if (i == 1) {
            imageView = cpVar.bXN;
            kotlin.jvm.internal.i.e(imageView, str4);
            imageView.setSelected(false);
            imageView = cpVar.bXK;
            kotlin.jvm.internal.i.e(imageView, str3);
            imageView.setSelected(true);
            imageView = cpVar.bXM;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setSelected(false);
            imageView = cpVar.bXL;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setSelected(false);
        } else if (i == 2) {
            imageView = cpVar.bXN;
            kotlin.jvm.internal.i.e(imageView, str4);
            imageView.setSelected(false);
            imageView = cpVar.bXK;
            kotlin.jvm.internal.i.e(imageView, str3);
            imageView.setSelected(false);
            imageView = cpVar.bXM;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setSelected(true);
            imageView = cpVar.bXL;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setSelected(false);
        } else if (i != 3) {
            imageView = cpVar.bXN;
            kotlin.jvm.internal.i.e(imageView, str4);
            imageView.setSelected(true);
            imageView = cpVar.bXK;
            kotlin.jvm.internal.i.e(imageView, str3);
            imageView.setSelected(false);
            imageView = cpVar.bXM;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setSelected(false);
            imageView = cpVar.bXL;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setSelected(false);
        } else {
            imageView = cpVar.bXN;
            kotlin.jvm.internal.i.e(imageView, str4);
            imageView.setSelected(false);
            imageView = cpVar.bXK;
            kotlin.jvm.internal.i.e(imageView, str3);
            imageView.setSelected(false);
            imageView = cpVar.bXM;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setSelected(false);
            imageView = cpVar.bXL;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setSelected(true);
        }
        imageView = cpVar.bXN;
        kotlin.jvm.internal.i.e(imageView, str4);
        imageView.setRotation(a(pVar, AssetSortType.BY_VOLUME));
        imageView = cpVar.bXK;
        kotlin.jvm.internal.i.e(imageView, str3);
        imageView.setRotation(a(pVar, AssetSortType.BY_DIFF));
        imageView = cpVar.bXM;
        kotlin.jvm.internal.i.e(imageView, str2);
        imageView.setRotation(a(pVar, AssetSortType.BY_SPREAD));
        ImageView imageView2 = cpVar.bXL;
        kotlin.jvm.internal.i.e(imageView2, str);
        imageView2.setRotation(a(pVar, AssetSortType.BY_LEVERAGE));
    }
}
