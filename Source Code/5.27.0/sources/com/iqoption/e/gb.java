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

/* compiled from: DialogMarginAddOnInfoBindingImpl */
public class gb extends ga {
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
        aos.put(R.id.dialogMarginClickable, 1);
        aos.put(R.id.dialogMarginContainer, 2);
        aos.put(R.id.dialogMarginToolbar, 3);
        aos.put(R.id.dialogMarginTitle, 4);
        aos.put(R.id.dialogMarginClose, 5);
        aos.put(R.id.dialogMarginTopMessage, 6);
        aos.put(R.id.dialogMarginButtonContainer, 7);
        aos.put(R.id.dialogMarginButtonLabel, 8);
        aos.put(R.id.dialogMarginButton, 9);
        aos.put(R.id.dialogMarginEnabledIcon, 10);
        aos.put(R.id.dialogMarginEnabledText, 11);
        aos.put(R.id.dialogMarginTouchablePart, 12);
    }

    public gb(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private gb(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[9], (LinearLayout) objArr[7], (TextView) objArr[8], (FrameLayout) objArr[1], (ImageView) objArr[5], (LinearLayout) objArr[2], (ImageView) objArr[10], (TextView) objArr[11], (TextView) objArr[4], (LinearLayout) objArr[3], (TextView) objArr[6], (View) objArr[12], (LinearLayout) objArr[0]);
        this.aot = -1;
        this.cbH.setTag(null);
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
