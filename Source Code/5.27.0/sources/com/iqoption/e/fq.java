package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: DialogClosedDealsItemMultiBinding */
public abstract class fq extends ViewDataBinding {
    @NonNull
    public final ImageView caB;
    @NonNull
    public final ImageView caC;
    @NonNull
    public final ImageView caD;
    @NonNull
    public final RobotoTextView caE;
    @NonNull
    public final RobotoTextView caF;
    @NonNull
    public final RobotoTextView caG;
    @NonNull
    public final TextView caH;
    @NonNull
    public final TextView caI;
    @NonNull
    public final TextView caJ;
    @NonNull
    public final LinearLayout caK;
    @NonNull
    public final LinearLayout caL;
    @NonNull
    public final LinearLayout caM;
    @NonNull
    public final TextView caN;
    @NonNull
    public final TextView caO;
    @NonNull
    public final TextView caP;
    @NonNull
    public final RobotoTextView caQ;
    @NonNull
    public final RobotoTextView caR;
    @NonNull
    public final RobotoTextView caS;

    protected fq(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView4, TextView textView5, TextView textView6, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6) {
        super(obj, view, i);
        this.caB = imageView;
        this.caC = imageView2;
        this.caD = imageView3;
        this.caE = robotoTextView;
        this.caF = robotoTextView2;
        this.caG = robotoTextView3;
        this.caH = textView;
        this.caI = textView2;
        this.caJ = textView3;
        this.caK = linearLayout;
        this.caL = linearLayout2;
        this.caM = linearLayout3;
        this.caN = textView4;
        this.caO = textView5;
        this.caP = textView6;
        this.caQ = robotoTextView4;
        this.caR = robotoTextView5;
        this.caS = robotoTextView6;
    }

    @NonNull
    public static fq l(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return l(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static fq l(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (fq) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_closed_deals_item_multi, viewGroup, z, obj);
    }
}
