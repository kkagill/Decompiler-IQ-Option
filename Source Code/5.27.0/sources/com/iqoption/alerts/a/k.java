package com.iqoption.alerts.a;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.clippinglayout.ClipConstrainedLayout;
import com.iqoption.widget.numpad.NumPad;

/* compiled from: AlertsPricePickerFragmentBinding */
public abstract class k extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView aoB;
    @NonNull
    public final ImageView aoC;
    @NonNull
    public final ImageView aoD;
    @NonNull
    public final ClipConstrainedLayout aoE;
    @NonNull
    public final TextView aoF;
    @NonNull
    public final FrameLayout aoG;
    @NonNull
    public final NumPad aoH;
    @NonNull
    public final EditText aoI;

    protected k(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ClipConstrainedLayout clipConstrainedLayout, TextView textView, FrameLayout frameLayout, NumPad numPad, TextView textView2, EditText editText) {
        super(obj, view, i);
        this.aoB = imageView;
        this.aoC = imageView2;
        this.aoD = imageView3;
        this.aoE = clipConstrainedLayout;
        this.aoF = textView;
        this.aoG = frameLayout;
        this.aoH = numPad;
        this.alH = textView2;
        this.aoI = editText;
    }
}
