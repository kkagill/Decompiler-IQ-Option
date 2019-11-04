package com.iqoption.charttools.b;

import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.charttools.n;
import com.iqoption.charttools.n.c;
import com.iqoption.charttools.n.g;
import com.iqoption.charttools.n.i;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.b;

/* compiled from: FragmentTemplateBindingLandImpl */
public class f extends d {
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
        aos.put(g.topBar, 8);
        aos.put(g.btnBack, 9);
        aos.put(g.title, 10);
        aos.put(g.btnSave, 11);
        aos.put(g.templateFrame, 12);
        aos.put(g.templateContent, 13);
        aos.put(g.inputName, 14);
        aos.put(g.instrumentsList, 15);
        aos.put(g.linesSnippet, 16);
        aos.put(g.switchChartSettings, 17);
        aos.put(g.containerChartType, 18);
        aos.put(g.chartType, 19);
        aos.put(g.containerCandleSize, 20);
        aos.put(g.candleSize, 21);
        aos.put(g.switchHeikenAshi, 22);
        aos.put(g.switchAutoScale, 23);
        aos.put(g.switchTradersMood, 24);
        aos.put(g.switchLiveDeals, 25);
        aos.put(g.switchVolume, 26);
    }

    public f(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 27, aor, aos));
    }

    private f(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[9], (View) objArr[3], (View) objArr[1], (View) objArr[6], (FrameLayout) objArr[11], (TextView) objArr[4], (ProgressBar) objArr[5], (TextView) objArr[21], (TextView) objArr[19], (FrameLayout) objArr[20], (FrameLayout) objArr[18], (FrameLayout) objArr[0], (EditText) objArr[14], (RecyclerView) objArr[15], (TextView) objArr[16], (ProgressBar) objArr[2], (ProgressBar) objArr[7], (SwitchCompat) objArr[23], (SwitchCompat) objArr[17], (SwitchCompat) objArr[22], (SwitchCompat) objArr[25], (SwitchCompat) objArr[24], (SwitchCompat) objArr[26], (LinearLayout) objArr[13], (FrameLayout) objArr[12], (TextView) objArr[10], (View) objArr[8]);
        this.aot = -1;
        this.aHR.setTag(null);
        this.aHS.setTag(null);
        this.aHT.setTag(null);
        this.aHV.setTag(null);
        this.aHW.setTag(null);
        this.aIb.setTag(null);
        this.aIf.setTag(null);
        this.aIg.setTag(null);
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
            a.m((TextView) this.aHR, 0.5f);
            a.m((TextView) this.aHS, 0.5f);
            a.m((TextView) this.aHT, 0.5f);
            a.a(this.aHV, b.hf(this.aHV.getResources().getString(i.spec_templates_item_button_states)), this.aHV.getResources().obtainTypedArray(n.a.spec_templates_item_button_text_colors), (long[]) null, (TimeInterpolator[]) null);
            a.a(this.aHW, ViewDataBinding.getColorFromResource(this.aHW, c.white));
            a.a(this.aIf, ViewDataBinding.getColorFromResource(this.aIf, c.white));
            a.a(this.aIg, ViewDataBinding.getColorFromResource(this.aIg, c.white));
        }
    }
}
