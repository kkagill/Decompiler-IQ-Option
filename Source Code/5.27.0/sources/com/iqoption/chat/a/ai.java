package com.iqoption.chat.a;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: ChatFragmentSearchRoomBinding */
public abstract class ai extends ViewDataBinding {
    @NonNull
    public final ImageView aHK;
    @NonNull
    public final ConstraintLayout aRA;
    @NonNull
    public final FrameLayout aRB;
    @NonNull
    public final EditText aRC;
    @NonNull
    public final TextView aRD;
    @NonNull
    public final LottieAnimationView aRz;

    protected ai(Object obj, View view, int i, ImageView imageView, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout, FrameLayout frameLayout, EditText editText, TextView textView) {
        super(obj, view, i);
        this.aHK = imageView;
        this.aRz = lottieAnimationView;
        this.aRA = constraintLayout;
        this.aRB = frameLayout;
        this.aRC = editText;
        this.aRD = textView;
    }
}
