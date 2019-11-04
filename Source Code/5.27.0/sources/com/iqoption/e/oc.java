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
import com.iqoption.x.R;

/* compiled from: FragmentVipRequestCallBindingImpl */
public class oc extends ob {
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
        aos.put(R.id.working_hours_title, 4);
        aos.put(R.id.working_hours, 5);
        aos.put(R.id.time_container, 6);
        aos.put(R.id.when_should_we_call_you, 7);
        aos.put(R.id.call_time, 8);
        aos.put(R.id.direct_call, 9);
        aos.put(R.id.manager_phone, 10);
        aos.put(R.id.cancel, 11);
        aos.put(R.id.action_button, 12);
    }

    public oc(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private oc(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[12], (FrameLayout) objArr[0], (TextView) objArr[8], (TextView) objArr[11], (ImageView) objArr[3], (TextView) objArr[9], (LinearLayout) objArr[1], (TextView) objArr[10], (LinearLayout) objArr[6], (TextView) objArr[2], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[4]);
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
