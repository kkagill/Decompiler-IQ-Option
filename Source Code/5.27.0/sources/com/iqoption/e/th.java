package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.nps.NpsRatingBar;
import com.iqoption.fragment.dialog.popup.a.c;

/* compiled from: NpsScoreFragmentBinding */
public abstract class th extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final FrameLayout cac;
    @NonNull
    public final ImageView cbk;
    @NonNull
    public final TextView cgm;
    @NonNull
    public final FrameLayout chw;
    @NonNull
    public final TextView cjW;
    @NonNull
    public final ImageView coL;
    @NonNull
    public final FrameLayout coM;
    @NonNull
    public final TextView coN;
    @NonNull
    public final TextView coO;
    @NonNull
    public final NpsRatingBar coP;
    @NonNull
    public final TextView coQ;
    @NonNull
    public final TextView coR;
    @NonNull
    public final TextView coS;
    @Bindable
    protected c coT;

    public abstract void a(@Nullable c cVar);

    protected th(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, NpsRatingBar npsRatingBar, TextView textView4, FrameLayout frameLayout2, TextView textView5, TextView textView6, FrameLayout frameLayout3, TextView textView7) {
        super(obj, view, i);
        this.cbk = imageView;
        this.coL = imageView2;
        this.aIv = constraintLayout;
        this.coM = frameLayout;
        this.coN = textView;
        this.coO = textView2;
        this.cgm = textView3;
        this.coP = npsRatingBar;
        this.coQ = textView4;
        this.chw = frameLayout2;
        this.coR = textView5;
        this.cjW = textView6;
        this.cac = frameLayout3;
        this.coS = textView7;
    }
}
