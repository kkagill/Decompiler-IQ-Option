package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.ab;
import com.iqoption.view.RobotoEditText;
import com.iqoption.view.RobotoTextView;
import com.iqoption.widget.SmallNumPad;

/* compiled from: FragmentPendingChooserBinding */
public abstract class mn extends ViewDataBinding {
    @NonNull
    public final LinearLayout aGo;
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final RelativeLayout chP;
    @NonNull
    public final ImageView chQ;
    @NonNull
    public final LinearLayout chR;
    @NonNull
    public final RobotoTextView chS;
    @NonNull
    public final TextView chT;
    @NonNull
    public final ImageView chU;
    @NonNull
    public final SmallNumPad chV;
    @NonNull
    public final ImageView chW;
    @NonNull
    public final RobotoEditText chX;
    @Bindable
    protected ab chY;

    public abstract void a(@Nullable ab abVar);

    protected mn(Object obj, View view, int i, RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView, TextView textView, ImageView imageView2, SmallNumPad smallNumPad, ImageView imageView3, RobotoEditText robotoEditText) {
        super(obj, view, i);
        this.chP = relativeLayout;
        this.chQ = imageView;
        this.aGo = linearLayout;
        this.bYN = frameLayout;
        this.chR = linearLayout2;
        this.chS = robotoTextView;
        this.chT = textView;
        this.chU = imageView2;
        this.chV = smallNumPad;
        this.chW = imageView3;
        this.chX = robotoEditText;
    }
}
