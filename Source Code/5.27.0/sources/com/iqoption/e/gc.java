package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;
import com.iqoption.x.R;

/* compiled from: DialogMarginAddOnPositionBinding */
public abstract class gc extends ViewDataBinding {
    @NonNull
    public final MaxSizeCardViewLayout aQN;
    @NonNull
    public final TextView aQO;
    @NonNull
    public final TextView cbI;

    protected gc(Object obj, View view, int i, TextView textView, TextView textView2, MaxSizeCardViewLayout maxSizeCardViewLayout) {
        super(obj, view, i);
        this.aQO = textView;
        this.cbI = textView2;
        this.aQN = maxSizeCardViewLayout;
    }

    @NonNull
    public static gc m(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return m(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static gc m(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (gc) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_margin_add_on_position, viewGroup, z, obj);
    }
}
