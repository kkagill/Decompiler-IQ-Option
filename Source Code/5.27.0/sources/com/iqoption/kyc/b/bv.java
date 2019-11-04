package com.iqoption.kyc.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.kyc.o.d;

/* compiled from: LayoutKycPhoneKeyboardBindingImpl */
public class bv extends bu {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final ConstraintLayout aoV;
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(d.widget_numpad_item_1, 1);
        aos.put(d.widget_numpad_item_2, 2);
        aos.put(d.widget_numpad_item_3, 3);
        aos.put(d.widget_numpad_item_4, 4);
        aos.put(d.widget_numpad_item_5, 5);
        aos.put(d.widget_numpad_item_6, 6);
        aos.put(d.widget_numpad_item_7, 7);
        aos.put(d.widget_numpad_item_8, 8);
        aos.put(d.widget_numpad_item_9, 9);
        aos.put(d.widget_numpad_item_0, 10);
        aos.put(d.space, 11);
        aos.put(d.widget_numpad_item_delete, 12);
    }

    public bv(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private bv(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Space) objArr[11], (TextView) objArr[10], (TextView) objArr[1], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[9], (ImageView) objArr[12]);
        this.aot = -1;
        this.aoV = (ConstraintLayout) objArr[0];
        this.aoV.setTag(null);
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
