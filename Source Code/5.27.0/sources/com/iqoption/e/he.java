package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: DialogWarningBinding */
public abstract class he extends ViewDataBinding {
    @NonNull
    public final ImageView bYq;
    @NonNull
    public final RelativeLayout bYw;
    @NonNull
    public final RobotoTextView cdC;
    @NonNull
    public final TextView cdD;

    protected he(Object obj, View view, int i, ImageView imageView, RobotoTextView robotoTextView, TextView textView, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.bYq = imageView;
        this.cdC = robotoTextView;
        this.cdD = textView;
        this.bYw = relativeLayout;
    }

    @NonNull
    public static he p(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return p(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static he p(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (he) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_warning, viewGroup, z, obj);
    }
}
