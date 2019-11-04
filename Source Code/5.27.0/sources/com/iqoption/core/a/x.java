package com.iqoption.core.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.g.b;

/* compiled from: TimerViewBinding */
public abstract class x extends ViewDataBinding {
    @NonNull
    public final TextView bgq;
    @NonNull
    public final b bgr;

    protected x(Object obj, View view, int i, TextView textView, b bVar) {
        super(obj, view, i);
        this.bgq = textView;
        this.bgr = bVar;
    }
}
