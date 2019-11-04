package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.dialog.d;
import com.iqoption.x.R;

/* compiled from: RateUsDialogBindingImpl */
public class wy extends wx {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 1);
        aos.put(R.id.rateUsTitle, 2);
        aos.put(R.id.star1, 3);
        aos.put(R.id.star2, 4);
        aos.put(R.id.star3, 5);
        aos.put(R.id.star4, 6);
        aos.put(R.id.star5, 7);
        aos.put(R.id.count_star, 8);
        aos.put(R.id.info_text_rate_us, 9);
        aos.put(R.id.cancel, 10);
        aos.put(R.id.next, 11);
    }

    public wy(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, aor, aos));
    }

    private wy(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[10], (LinearLayout) objArr[1], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[11], (TextView) objArr[2], (FrameLayout) objArr[0], (ImageView) objArr[3], (ImageView) objArr[4], (ImageView) objArr[5], (ImageView) objArr[6], (ImageView) objArr[7]);
        this.aot = -1;
        this.caT.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
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

    public boolean setVariable(int i, @Nullable Object obj) {
        if (1 != i) {
            return false;
        }
        a((d) obj);
        return true;
    }

    public void a(@Nullable d dVar) {
        this.cqQ = dVar;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
    }
}
