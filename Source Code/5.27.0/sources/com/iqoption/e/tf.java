package com.iqoption.e;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.dialog.popup.a.b;

/* compiled from: NpsFeedbackFragmentBinding */
public abstract class tf extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final FrameLayout cac;
    @NonNull
    public final ImageView cbk;
    @NonNull
    public final TextView cgm;
    @NonNull
    public final TextView cjW;
    @NonNull
    public final FrameLayout coB;
    @NonNull
    public final ConstraintLayout coC;
    @NonNull
    public final FrameLayout coD;
    @NonNull
    public final EditText coG;
    @NonNull
    public final TextView coH;
    @NonNull
    public final TextView coI;
    @Bindable
    protected b coJ;

    public abstract void a(@Nullable b bVar);

    protected tf(Object obj, View view, int i, ImageView imageView, FrameLayout frameLayout, ConstraintLayout constraintLayout, EditText editText, TextView textView, ConstraintLayout constraintLayout2, FrameLayout frameLayout2, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout3) {
        super(obj, view, i);
        this.cbk = imageView;
        this.coB = frameLayout;
        this.aIv = constraintLayout;
        this.coG = editText;
        this.cgm = textView;
        this.coC = constraintLayout2;
        this.coD = frameLayout2;
        this.coH = textView2;
        this.coI = textView3;
        this.cjW = textView4;
        this.cac = frameLayout3;
    }
}
