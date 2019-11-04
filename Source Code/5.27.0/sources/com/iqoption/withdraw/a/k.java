package com.iqoption.withdraw.a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.withdraw.WrapContentViewPager;
import com.rd.PageIndicatorView;

/* compiled from: FragmentWithdrawVerifyBinding */
public abstract class k extends ViewDataBinding {
    @NonNull
    public final LinearLayout eqk;
    @NonNull
    public final PageIndicatorView eql;
    @NonNull
    public final WrapContentViewPager eqm;

    protected k(Object obj, View view, int i, LinearLayout linearLayout, PageIndicatorView pageIndicatorView, WrapContentViewPager wrapContentViewPager) {
        super(obj, view, i);
        this.eqk = linearLayout;
        this.eql = pageIndicatorView;
        this.eqm = wrapContentViewPager;
    }
}
