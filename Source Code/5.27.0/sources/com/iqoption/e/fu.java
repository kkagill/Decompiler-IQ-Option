package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.dialog.d;
import com.iqoption.view.RobotoTextView;
import com.iqoption.view.scoreboard.BalanceView;

/* compiled from: DialogCongratOtnEmissionExecutedBinding */
public abstract class fu extends ViewDataBinding {
    @NonNull
    public final ImageView aRO;
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final FrameLayout caT;
    @NonNull
    public final LinearLayout caX;
    @NonNull
    public final RobotoTextView caY;
    @NonNull
    public final LinearLayout caZ;
    @NonNull
    public final RobotoTextView cba;
    @NonNull
    public final TextView cbb;
    @NonNull
    public final RobotoTextView cbc;
    @NonNull
    public final RobotoTextView cbd;
    @NonNull
    public final ImageView cbe;
    @NonNull
    public final ImageView cbf;
    @NonNull
    public final TextView cbg;
    @NonNull
    public final FrameLayout cbh;
    @NonNull
    public final BalanceView cbi;
    @Bindable
    protected d cbj;

    public abstract void a(@Nullable d dVar);

    protected fu(Object obj, View view, int i, LinearLayout linearLayout, RobotoTextView robotoTextView, FrameLayout frameLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView2, TextView textView, ImageView imageView, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, ImageView imageView2, ImageView imageView3, TextView textView2, FrameLayout frameLayout2, FrameLayout frameLayout3, BalanceView balanceView) {
        super(obj, view, i);
        this.caX = linearLayout;
        this.caY = robotoTextView;
        this.bYN = frameLayout;
        this.caZ = linearLayout2;
        this.cba = robotoTextView2;
        this.cbb = textView;
        this.aRO = imageView;
        this.cbc = robotoTextView3;
        this.cbd = robotoTextView4;
        this.cbe = imageView2;
        this.cbf = imageView3;
        this.cbg = textView2;
        this.caT = frameLayout2;
        this.cbh = frameLayout3;
        this.cbi = balanceView;
    }
}
