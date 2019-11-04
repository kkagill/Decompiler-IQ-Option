package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetInfoPriceCryptoItemBinding */
public abstract class ax extends ViewDataBinding {
    @NonNull
    public final TextView bVL;
    @NonNull
    public final TextView bVM;
    @NonNull
    public final TextView bVN;
    @NonNull
    public final TextView bVO;

    protected ax(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.bVL = textView;
        this.bVM = textView2;
        this.bVN = textView3;
        this.bVO = textView4;
    }
}
