package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.view.text.FormattedTextView;
import com.iqoption.x.R;

/* compiled from: AssetInfoInfoItemBindingImpl */
public class aw extends av {
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
        aos.put(R.id.separator, 2);
        aos.put(R.id.infoTxt, 3);
        aos.put(R.id.baseContainer, 4);
        aos.put(R.id.base, 5);
        aos.put(R.id.secondContainer, 6);
        aos.put(R.id.second, 7);
    }

    public aw(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private aw(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[5], (LinearLayout) objArr[4], (FormattedTextView) objArr[1], (TextView) objArr[3], (TextView) objArr[7], (LinearLayout) objArr[6], (View) objArr[2]);
        this.aot = -1;
        this.bVG.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 1) != 0) {
            TextViewBindingAdapter.setDrawableLeft(this.bVG, ViewDataBinding.getDrawableFromResource(this.bVG, R.drawable.ic_full_information));
            b.j(this.bVG, 0.5f);
        }
    }
}
