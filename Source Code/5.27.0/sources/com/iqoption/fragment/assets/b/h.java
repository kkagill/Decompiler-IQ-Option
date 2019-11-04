package com.iqoption.fragment.assets.b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.iqoption.core.ext.a;
import com.iqoption.core.ext.g;
import com.iqoption.e.cv;
import com.iqoption.fragment.assets.model.k;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/fragment/assets/viewholder/AssetItemClickListener;", "Lcom/iqoption/core/ext/OnDelayClickListener;", "callback", "Lcom/iqoption/fragment/assets/viewholder/AssetItemCallback;", "assetViewHolder", "Lcom/iqoption/fragment/assets/viewholder/AssetViewHolder;", "(Lcom/iqoption/fragment/assets/viewholder/AssetItemCallback;Lcom/iqoption/fragment/assets/viewholder/AssetViewHolder;)V", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
/* compiled from: AssetItemClickListener.kt */
public final class h extends g {
    private final g dbJ;
    private final j<?> ddk;

    public h(g gVar, j<?> jVar) {
        kotlin.jvm.internal.i.f(gVar, "callback");
        kotlin.jvm.internal.i.f(jVar, "assetViewHolder");
        super(0, 1, null);
        this.dbJ = gVar;
        this.ddk = jVar;
        OnClickListener onClickListener = this;
        this.ddk.getBinding().getRoot().setOnClickListener(onClickListener);
        cv aBD = this.ddk.aBD();
        aBD.bWR.setOnClickListener(onClickListener);
        aBD.bYb.setOnClickListener(onClickListener);
        String str = "btnAlert";
        if (this.dbJ.aAk()) {
            ImageView imageView = aBD.bWQ;
            kotlin.jvm.internal.i.e(imageView, str);
            a.ak(imageView);
            aBD.bWQ.setOnClickListener(onClickListener);
            return;
        }
        ImageView imageView2 = aBD.bWQ;
        kotlin.jvm.internal.i.e(imageView2, str);
        a.al(imageView2);
    }

    public void M(View view) {
        kotlin.jvm.internal.i.f(view, "v");
        k aBC = this.ddk.aBC();
        if (aBC != null) {
            switch (view.getId()) {
                case R.id.btnAlert /*2131362034*/:
                    this.dbJ.d(aBC);
                    return;
                case R.id.btnFavorites /*2131362059*/:
                    this.dbJ.b(aBC);
                    return;
                case R.id.btnInfo /*2131362064*/:
                    this.dbJ.c(aBC);
                    return;
                case R.id.itemContent /*2131362990*/:
                    this.dbJ.a(aBC);
                    return;
                default:
                    return;
            }
        }
    }
}
