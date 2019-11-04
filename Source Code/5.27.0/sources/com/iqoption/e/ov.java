package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.CryptoBumperView;
import com.iqoption.x.R;

/* compiled from: ItemCryptoAssetBinding */
public abstract class ov extends ViewDataBinding {
    @NonNull
    public final ImageView De;
    @NonNull
    public final TextView aoo;
    @NonNull
    public final FrameLayout ciq;
    @NonNull
    public final CryptoBumperView cmc;
    @NonNull
    public final View cme;
    @NonNull
    public final FrameLayout cmf;
    @NonNull
    public final ImageView cmg;

    protected ov(Object obj, View view, int i, CryptoBumperView cryptoBumperView, View view2, ImageView imageView, FrameLayout frameLayout, TextView textView, ImageView imageView2, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.cmc = cryptoBumperView;
        this.cme = view2;
        this.De = imageView;
        this.cmf = frameLayout;
        this.aoo = textView;
        this.cmg = imageView2;
        this.ciq = frameLayout2;
    }

    @NonNull
    public static ov q(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return q(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ov q(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ov) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_crypto_asset, viewGroup, z, obj);
    }
}
