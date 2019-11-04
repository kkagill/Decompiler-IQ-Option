package com.iqoption.charttools.b;

import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.charttools.n;
import com.iqoption.charttools.n.g;
import com.iqoption.charttools.n.i;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.b;

/* compiled from: FragmentIndicatorSettingsBindingLandImpl */
public class c extends a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(g.content, 4);
        aos.put(g.title, 5);
        aos.put(g.btnBack, 6);
        aos.put(g.buttonBarTop, 7);
    }

    public c(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private c(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (ImageView) objArr[6], (TextView) objArr[2], (Guideline) objArr[7], (View) objArr[4], (RecyclerView) objArr[1], (FrameLayout) objArr[0], (TextView) objArr[5], null);
        this.aot = -1;
        this.aHJ.setTag(null);
        this.aHL.setTag(null);
        this.aHO.setTag(null);
        this.aHP.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 1;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.aot != 0) {
                return true;
            }
            return false;
        }
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 1) != 0) {
            a.m(this.aHJ, 0.5f);
            a.n(this.aHJ, ViewDataBinding.getColorFromResource(this.aHJ, com.iqoption.charttools.n.c.green));
            long[] jArr = (long[]) null;
            TimeInterpolator[] timeInterpolatorArr = (TimeInterpolator[]) null;
            a.a(this.aHJ, b.hf(this.aHJ.getResources().getString(i.spec_indicator_constructor_button_text_states)), this.aHJ.getResources().obtainTypedArray(n.a.spec_indicator_constructor_button_apply_text_colors), jArr, timeInterpolatorArr);
            a.m(this.aHL, 0.5f);
            a.n(this.aHL, ViewDataBinding.getColorFromResource(this.aHL, com.iqoption.charttools.n.c.bg_dialog));
            a.a(this.aHL, b.hf(this.aHL.getResources().getString(i.spec_indicator_constructor_button_text_states)), this.aHL.getResources().obtainTypedArray(n.a.spec_indicator_constructor_button_restore_text_colors), jArr, timeInterpolatorArr);
            a.a(this.aHO, this.aHO.getResources().getBoolean(n.b.isTrue));
        }
    }
}
