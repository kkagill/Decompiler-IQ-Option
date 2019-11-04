package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;
import com.iqoption.x.R;

/* compiled from: FragmentToolsBindingImpl */
public class nk extends nj {
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
        aos.put(R.id.guidelineLeftPanel, 2);
        aos.put(R.id.guidelineTimeScaleBar, 3);
        aos.put(R.id.lineButton, 4);
        aos.put(R.id.trendLineButton, 5);
        aos.put(R.id.horizontalLineButton, 6);
        aos.put(R.id.verticalLineButton, 7);
        aos.put(R.id.fibonacciLinesButton, 8);
        aos.put(R.id.fibonacciArcButton, 9);
        aos.put(R.id.fibonacciSpiralButton, 10);
        aos.put(R.id.activesTools, 11);
        aos.put(R.id.activesToolsTitle, 12);
        aos.put(R.id.activesToolsCount, 13);
        aos.put(R.id.indicators, 14);
        aos.put(R.id.templatesTools, 15);
        aos.put(R.id.templatesTitle, 16);
        aos.put(R.id.activeTemplatesToolsCount, 17);
        aos.put(R.id.otherSettingsTools, 18);
        aos.put(R.id.otherSettingsTitle, 19);
    }

    public nk(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, aor, aos));
    }

    private nk(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[17], (LinearLayout) objArr[11], (TextView) objArr[13], (TextView) objArr[12], (ConstraintLayout) objArr[0], (ImageView) objArr[9], (ImageView) objArr[8], (ImageView) objArr[10], (Guideline) objArr[2], (Guideline) objArr[3], (ImageView) objArr[6], (LinearLayout) objArr[14], (ImageView) objArr[4], (LinearLayout) objArr[1], (TextView) objArr[19], (LinearLayout) objArr[18], (TextView) objArr[16], (LinearLayout) objArr[15], (ImageView) objArr[5], (ImageView) objArr[7]);
        this.aot = -1;
        this.cjH.setTag(null);
        this.bgn.setTag(null);
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
            a.n(this.bgn, ViewDataBinding.getColorFromResource(this.bgn, R.color.bg_second_level));
        }
    }
}
