package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.view.SelectionButton;

/* compiled from: PersonalInfoDialogBinding */
public abstract class tx extends ViewDataBinding {
    @NonNull
    public final ImageButton cpc;
    @NonNull
    public final SelectionButton cpd;
    @NonNull
    public final FrameLayout cpe;
    @NonNull
    public final FrameLayout cpf;
    @NonNull
    public final SelectionButton cpg;
    @NonNull
    public final ImageView cph;
    @NonNull
    public final ImageView cpi;
    @NonNull
    public final SelectionButton cpj;
    @NonNull
    public final ConfirmButtonView cpk;
    @NonNull
    public final TextView cpl;
    @NonNull
    public final LinearLayout cpm;
    @NonNull
    public final ImageView cpn;
    @NonNull
    public final LinearLayout cpo;
    @NonNull
    public final SelectionButton cpp;
    @NonNull
    public final RobotoTextView cpq;
    @NonNull
    public final RobotoTextView cpr;
    @NonNull
    public final ViewPager cps;
    @NonNull
    public final TextView cpt;

    protected tx(Object obj, View view, int i, ImageButton imageButton, SelectionButton selectionButton, FrameLayout frameLayout, FrameLayout frameLayout2, SelectionButton selectionButton2, ImageView imageView, ImageView imageView2, SelectionButton selectionButton3, ConfirmButtonView confirmButtonView, TextView textView, LinearLayout linearLayout, ImageView imageView3, LinearLayout linearLayout2, SelectionButton selectionButton4, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ViewPager viewPager, TextView textView2) {
        super(obj, view, i);
        this.cpc = imageButton;
        this.cpd = selectionButton;
        this.cpe = frameLayout;
        this.cpf = frameLayout2;
        this.cpg = selectionButton2;
        this.cph = imageView;
        this.cpi = imageView2;
        this.cpj = selectionButton3;
        this.cpk = confirmButtonView;
        this.cpl = textView;
        this.cpm = linearLayout;
        this.cpn = imageView3;
        this.cpo = linearLayout2;
        this.cpp = selectionButton4;
        this.cpq = robotoTextView;
        this.cpr = robotoTextView2;
        this.cps = viewPager;
        this.cpt = textView2;
    }
}
