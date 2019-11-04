package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.a;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.x.R;

/* compiled from: ToolsContentTemplatesBindingImpl */
public class aac extends aab {
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
        aos.put(R.id.title, 3);
    }

    public aac(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private aac(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1], (RecyclerView) objArr[2], (TextView) objArr[3], (ConstraintLayout) objArr[0]);
        this.aot = -1;
        this.cux.setTag(null);
        this.apj.setTag(null);
        this.cun.setTag(null);
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
            TextViewBindingAdapter.setDrawableStart(this.cux, ViewDataBinding.getDrawableFromResource(this.cux, R.drawable.ic_add_template_white_24dp));
            a.m(this.cux, 0.5f);
            b.f(this.cux, ViewDataBinding.getColorFromResource(this.cux, R.color.green));
            a.a(this.apj, this.apj.getResources().getBoolean(R.bool.isTrue));
        }
    }
}
