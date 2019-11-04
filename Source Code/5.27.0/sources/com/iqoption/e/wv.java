package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.a.g.b;

/* compiled from: PushSettingsGroupItemBinding */
public abstract class wv extends ViewDataBinding {
    @NonNull
    public final TextView cqA;
    @NonNull
    public final TextView cqC;
    @NonNull
    public final SwitchCompat cqD;
    @NonNull
    public final ProgressBar cqE;
    @NonNull
    public final LinearLayout cqF;
    @Bindable
    protected b cqG;

    protected wv(Object obj, View view, int i, TextView textView, SwitchCompat switchCompat, ProgressBar progressBar, TextView textView2, LinearLayout linearLayout) {
        super(obj, view, i);
        this.cqC = textView;
        this.cqD = switchCompat;
        this.cqE = progressBar;
        this.cqA = textView2;
        this.cqF = linearLayout;
    }
}
