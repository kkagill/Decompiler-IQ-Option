package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.dto.ToastEntity;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: LocalToastLayoutBinding */
public abstract class qp extends ViewDataBinding {
    @NonNull
    public final LinearLayout aRl;
    @NonNull
    public final RobotoTextView cmU;
    @NonNull
    public final RobotoTextView cmV;
    @NonNull
    public final View cmW;
    @NonNull
    public final ImageView cmX;
    @Bindable
    protected ToastEntity cmY;

    public abstract void a(@Nullable ToastEntity toastEntity);

    protected qp(Object obj, View view, int i, RobotoTextView robotoTextView, LinearLayout linearLayout, RobotoTextView robotoTextView2, View view2, ImageView imageView) {
        super(obj, view, i);
        this.cmU = robotoTextView;
        this.aRl = linearLayout;
        this.cmV = robotoTextView2;
        this.cmW = view2;
        this.cmX = imageView;
    }

    @Nullable
    public ToastEntity aoa() {
        return this.cmY;
    }

    @NonNull
    public static qp t(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return t(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static qp t(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (qp) ViewDataBinding.inflateInternal(layoutInflater, R.layout.local_toast_layout, viewGroup, z, obj);
    }
}
