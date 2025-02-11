package com.iqoption.chat.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.e.g;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;

/* compiled from: ChatDialogUserInfoBindingImpl */
public class l extends k {
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
        aos.put(g.frame, 1);
        aos.put(g.avatar, 2);
        aos.put(g.vipBadge, 3);
        aos.put(g.nameLayout, 4);
        aos.put(g.name, 5);
        aos.put(g.countryLayout, 6);
        aos.put(g.country, 7);
        aos.put(g.dateLabel, 8);
        aos.put(g.date, 9);
        aos.put(g.btnClose, 10);
    }

    public l(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, aor, aos));
    }

    private l(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (TextView) objArr[10], (TextView) objArr[7], (FrameLayout) objArr[6], (TextView) objArr[9], (TextView) objArr[8], (MaxSizeCardViewLayout) objArr[1], (TextView) objArr[5], (FrameLayout) objArr[4], (FrameLayout) objArr[0], (TextView) objArr[3]);
        this.aot = -1;
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
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
    }
}
