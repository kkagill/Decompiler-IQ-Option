package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: VipAboutInfoBindingImpl */
public class aas extends aar {
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
        aos.put(R.id.avatar, 1);
        aos.put(R.id.name_title, 2);
        aos.put(R.id.name, 3);
        aos.put(R.id.language_title, 4);
        aos.put(R.id.languages, 5);
        aos.put(R.id.information_title, 6);
        aos.put(R.id.information, 7);
        aos.put(R.id.logo, 8);
        aos.put(R.id.iq_work_duration, 9);
        aos.put(R.id.years, 10);
        aos.put(R.id.working_hours_title, 11);
        aos.put(R.id.time_icon, 12);
        aos.put(R.id.working_hours, 13);
    }

    public aas(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, aor, aos));
    }

    private aas(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[9], (TextView) objArr[4], (TextView) objArr[5], (ImageView) objArr[8], (TextView) objArr[3], (TextView) objArr[2], (ImageView) objArr[12], (TextView) objArr[13], (TextView) objArr[11], (TextView) objArr[10]);
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
