package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.account.security.touchId.a;

/* compiled from: FragmentAccountSecurityPasscodeErrorBinding */
public abstract class im extends ViewDataBinding {
    @NonNull
    public final LinearLayout bgn;
    @NonNull
    public final FrameLayout cfa;
    @NonNull
    public final TextView cfq;
    @NonNull
    public final TextView cfr;
    @Bindable
    protected a cfs;

    public abstract void a(@Nullable a aVar);

    protected im(Object obj, View view, int i, LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.bgn = linearLayout;
        this.cfa = frameLayout;
        this.cfq = textView;
        this.cfr = textView2;
    }
}
