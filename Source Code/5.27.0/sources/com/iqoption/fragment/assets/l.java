package com.iqoption.fragment.assets;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.transition.Transition;
import com.iqoption.core.ext.g;
import com.iqoption.e.ct;
import com.iqoption.fragment.assets.model.AssetSortType;
import com.iqoption.fragment.assets.model.p;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0014J\u0014\u0010\u000e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014¨\u0006\u0011"}, bng = {"Lcom/iqoption/fragment/assets/FxHeaderDelegate;", "Lcom/iqoption/fragment/assets/HeaderDelegate;", "Lcom/iqoption/databinding/AssetsHeaderFxBinding;", "container", "Landroid/view/ViewGroup;", "endPadding", "", "transition", "Landroidx/transition/Transition;", "viewModel", "Lcom/iqoption/fragment/assets/AssetsViewModel;", "(Landroid/view/ViewGroup;ILandroidx/transition/Transition;Lcom/iqoption/fragment/assets/AssetsViewModel;)V", "onCreateBinding", "", "onUpdateState", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
/* compiled from: HeaderDelegate.kt */
public final class l extends n<ct> {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/assets/FxHeaderDelegate$onCreateBinding$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: HeaderDelegate.kt */
    public static final class a extends g {
        final /* synthetic */ l dbz;

        a(l lVar) {
            this.dbz = lVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            switch (view.getId()) {
                case R.id.sortIndicatorDiff /*2131363902*/:
                case R.id.sortLabelDiff /*2131363910*/:
                    this.dbz.aAD().a(AssetSortType.BY_DIFF);
                    return;
                case R.id.sortIndicatorExpiration /*2131363903*/:
                case R.id.sortLabelExpiration /*2131363911*/:
                    this.dbz.aAD().a(AssetSortType.BY_EXPIRATION);
                    return;
                case R.id.sortIndicatorName /*2131363905*/:
                case R.id.sortLabelName /*2131363913*/:
                    this.dbz.aAD().a(AssetSortType.BY_NAME);
                    return;
                default:
                    return;
            }
        }
    }

    public l(ViewGroup viewGroup, int i, Transition transition, e eVar) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        kotlin.jvm.internal.i.f(transition, "transition");
        kotlin.jvm.internal.i.f(eVar, "viewModel");
        super(R.layout.assets_header_fx, viewGroup, i, transition, eVar, null);
    }

    /* Access modifiers changed, original: protected */
    public void a(ct ctVar) {
        kotlin.jvm.internal.i.f(ctVar, "$this$onCreateBinding");
        r0 = new View[6];
        TextView textView = ctVar.bXD;
        kotlin.jvm.internal.i.e(textView, "sortLabelName");
        r0[0] = textView;
        ImageView imageView = ctVar.bXB;
        kotlin.jvm.internal.i.e(imageView, "sortIndicatorName");
        r0[1] = imageView;
        textView = ctVar.bXO;
        kotlin.jvm.internal.i.e(textView, "sortLabelDiff");
        r0[2] = textView;
        imageView = ctVar.bXK;
        kotlin.jvm.internal.i.e(imageView, "sortIndicatorDiff");
        r0[3] = imageView;
        textView = ctVar.bYa;
        kotlin.jvm.internal.i.e(textView, "sortLabelExpiration");
        r0[4] = textView;
        ImageView imageView2 = ctVar.bXZ;
        kotlin.jvm.internal.i.e(imageView2, "sortIndicatorExpiration");
        r0[5] = imageView2;
        com.iqoption.core.ext.a.a(r0, (OnClickListener) new a(this));
    }

    /* Access modifiers changed, original: protected */
    public void a(ct ctVar, p pVar) {
        ImageView imageView;
        kotlin.jvm.internal.i.f(ctVar, "$this$onUpdateState");
        kotlin.jvm.internal.i.f(pVar, "sorting");
        int i = m.aob[pVar.aBv().ordinal()];
        String str = "sortIndicatorExpiration";
        String str2 = "sortIndicatorDiff";
        String str3 = "sortIndicatorName";
        if (i == 1) {
            imageView = ctVar.bXB;
            kotlin.jvm.internal.i.e(imageView, str3);
            imageView.setSelected(false);
            imageView = ctVar.bXK;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setSelected(true);
            imageView = ctVar.bXZ;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setSelected(false);
        } else if (i != 2) {
            imageView = ctVar.bXB;
            kotlin.jvm.internal.i.e(imageView, str3);
            imageView.setSelected(true);
            imageView = ctVar.bXK;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setSelected(false);
            imageView = ctVar.bXZ;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setSelected(false);
        } else {
            imageView = ctVar.bXB;
            kotlin.jvm.internal.i.e(imageView, str3);
            imageView.setSelected(false);
            imageView = ctVar.bXK;
            kotlin.jvm.internal.i.e(imageView, str2);
            imageView.setSelected(false);
            imageView = ctVar.bXZ;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setSelected(true);
        }
        imageView = ctVar.bXB;
        kotlin.jvm.internal.i.e(imageView, str3);
        imageView.setRotation(a(pVar, AssetSortType.BY_NAME));
        imageView = ctVar.bXK;
        kotlin.jvm.internal.i.e(imageView, str2);
        imageView.setRotation(a(pVar, AssetSortType.BY_DIFF));
        ImageView imageView2 = ctVar.bXZ;
        kotlin.jvm.internal.i.e(imageView2, str);
        imageView2.setRotation(a(pVar, AssetSortType.BY_EXPIRATION));
    }
}
