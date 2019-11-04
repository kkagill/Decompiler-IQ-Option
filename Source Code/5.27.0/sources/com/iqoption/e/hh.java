package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;
import com.iqoption.x.R;

/* compiled from: DialogWhatsNewBindingImpl */
public class hh extends hg {
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
        aos.put(R.id.content, 3);
        aos.put(R.id.topBar, 4);
        aos.put(R.id.headerTitle, 5);
        aos.put(R.id.btnClose, 6);
        aos.put(R.id.mediaContent, 7);
        aos.put(R.id.title, 8);
        aos.put(R.id.message, 9);
        aos.put(R.id.bottomText, 10);
    }

    public hh(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, aor, aos));
    }

    private hh(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[10], (ImageView) objArr[6], (TextView) objArr[1], (TextView) objArr[2], (ConstraintLayout) objArr[3], (TextView) objArr[5], (FrameLayout) objArr[7], (TextView) objArr[9], (TextView) objArr[8], (LinearLayout) objArr[4], (FrameLayout) objArr[0]);
        this.aot = -1;
        this.cdF.setTag(null);
        this.cdG.setTag(null);
        this.cdJ.setTag(null);
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
            a.m(this.cdF, 0.5f);
            a.n(this.cdF, ViewDataBinding.getColorFromResource(this.cdF, R.color.grey_blue_10));
            a.m(this.cdG, 0.5f);
            a.n(this.cdG, ViewDataBinding.getColorFromResource(this.cdG, R.color.green));
        }
    }
}
