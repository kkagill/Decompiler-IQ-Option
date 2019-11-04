package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.account.security.a.d;

/* compiled from: AccountSecurityResendEmailFragmentBinding */
public abstract class q extends ViewDataBinding {
    @NonNull
    public final ImageView bJZ;
    @NonNull
    public final TextView bSY;
    @NonNull
    public final TextView bSZ;
    @Bindable
    protected d bTa;

    public abstract void a(@Nullable d dVar);

    protected q(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.bSY = textView;
        this.bJZ = imageView;
        this.bSZ = textView2;
    }
}
