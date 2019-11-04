package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoEditText;
import com.iqoption.view.RobotoTextView;
import com.iqoption.widget.NumPad;
import com.iqoption.x.R;

/* compiled from: KeyboardTpslBinding */
public abstract class pd extends ViewDataBinding {
    @NonNull
    public final NumPad cgj;
    @NonNull
    public final RobotoEditText clr;
    @NonNull
    public final RobotoTextView cmn;
    @NonNull
    public final LinearLayout cmo;
    @NonNull
    public final ImageSwitcher cmp;
    @NonNull
    public final ImageView cmq;
    @NonNull
    public final ImageView cmr;

    protected pd(Object obj, View view, int i, RobotoEditText robotoEditText, RobotoTextView robotoTextView, LinearLayout linearLayout, NumPad numPad, ImageSwitcher imageSwitcher, ImageView imageView, ImageView imageView2) {
        super(obj, view, i);
        this.clr = robotoEditText;
        this.cmn = robotoTextView;
        this.cmo = linearLayout;
        this.cgj = numPad;
        this.cmp = imageSwitcher;
        this.cmq = imageView;
        this.cmr = imageView2;
    }

    @NonNull
    public static pd s(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return s(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static pd s(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (pd) ViewDataBinding.inflateInternal(layoutInflater, R.layout.keyboard_tpsl, viewGroup, z, obj);
    }
}
