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
import com.iqoption.x.R;

/* compiled from: DialogWhatsNewWithoutBtnBindingImpl */
public class hn extends hm {
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
        aos.put(R.id.content, 1);
        aos.put(R.id.topBar, 2);
        aos.put(R.id.headerTitle, 3);
        aos.put(R.id.btnClose, 4);
        aos.put(R.id.message, 5);
        aos.put(R.id.mediaContent, 6);
    }

    public hn(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, aor, aos));
    }

    private hn(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[4], (ConstraintLayout) objArr[1], (TextView) objArr[3], (FrameLayout) objArr[6], (TextView) objArr[5], (LinearLayout) objArr[2], (FrameLayout) objArr[0]);
        this.aot = -1;
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
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
    }
}
