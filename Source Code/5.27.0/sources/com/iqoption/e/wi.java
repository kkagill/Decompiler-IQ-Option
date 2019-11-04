package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.a;
import com.iqoption.x.R;

/* compiled from: PriceMovementsFragmentBindingImpl */
public class wi extends wh {
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
        aos.put(R.id.toolbarBottom, 2);
        aos.put(R.id.headerLayout, 3);
        aos.put(R.id.signalsTitle, 4);
        aos.put(R.id.signalsList, 5);
    }

    public wi(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, aor, aos));
    }

    private wi(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[3], (TextView) objArr[1], (RecyclerView) objArr[5], (TextView) objArr[4], (Guideline) objArr[2]);
        this.aot = -1;
        this.aoV = (ConstraintLayout) objArr[0];
        this.aoV.setTag(null);
        this.cqh.setTag(null);
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
            TextViewBindingAdapter.setDrawableEnd(this.cqh, ViewDataBinding.getDrawableFromResource(this.cqh, R.drawable.ic_arrow_down));
            a.a(this.cqh, this.cqh.getResources().getDimension(R.dimen.dp12), ViewDataBinding.getColorFromResource(this.cqh, R.color.grey_blur_70));
        }
    }
}
