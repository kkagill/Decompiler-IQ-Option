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
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.x.R;

/* compiled from: FragmentVipChooseTimeBindingImpl */
public class ny extends nx {
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
        aos.put(R.id.main, 1);
        aos.put(R.id.title, 2);
        aos.put(R.id.close_button, 3);
        aos.put(R.id.today_title, 4);
        aos.put(R.id.today_periods, 5);
        aos.put(R.id.next_day_title, 6);
        aos.put(R.id.next_day_periods, 7);
        aos.put(R.id.next_next_day_title, 8);
        aos.put(R.id.next_next_day_periods, 9);
        aos.put(R.id.cancel, 10);
        aos.put(R.id.action_button, 11);
    }

    public ny(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, aor, aos));
    }

    private ny(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[11], (FrameLayout) objArr[0], (TextView) objArr[10], (ImageView) objArr[3], (LinearLayout) objArr[1], (RecyclerView) objArr[7], (TextView) objArr[6], (RecyclerView) objArr[9], (TextView) objArr[8], (TextView) objArr[2], (RecyclerView) objArr[5], (TextView) objArr[4]);
        this.aot = -1;
        this.ckH.setTag(null);
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
