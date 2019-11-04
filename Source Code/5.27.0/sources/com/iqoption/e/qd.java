package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: LeftMenuItemProfileBinding */
public abstract class qd extends ViewDataBinding {
    @NonNull
    public final ImageView chM;
    @NonNull
    public final RobotoTextView cmN;
    @NonNull
    public final RobotoTextView cmO;

    protected qd(Object obj, View view, int i, ImageView imageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        super(obj, view, i);
        this.chM = imageView;
        this.cmN = robotoTextView;
        this.cmO = robotoTextView2;
    }
}
