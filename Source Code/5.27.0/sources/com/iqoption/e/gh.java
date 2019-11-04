package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.y;
import com.iqoption.g.a.a.a;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: DialogOtnCommisionChangedBindingImpl */
public class gh extends gg implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener cbW;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 1);
        aos.put(R.id.content, 2);
        aos.put(R.id.currentBalance, 3);
        aos.put(R.id.currentCurrency, 4);
        aos.put(R.id.currentValueBalance, 5);
        aos.put(R.id.otnBalance, 6);
        aos.put(R.id.otnCurrency, 7);
        aos.put(R.id.otnInfoValueTitle, 8);
        aos.put(R.id.otnValueBalance, 9);
        aos.put(R.id.otnInfoValue, 10);
        aos.put(R.id.info, 11);
    }

    public gh(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, aor, aos));
    }

    private gh(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[2], (FrameLayout) objArr[1], (LinearLayout) objArr[3], (TextView) objArr[4], (RobotoTextView) objArr[5], (RobotoTextView) objArr[11], (LinearLayout) objArr[6], (TextView) objArr[7], (RobotoTextView) objArr[10], (RobotoTextView) objArr[8], (RobotoTextView) objArr[9], (FrameLayout) objArr[0]);
        this.aot = -1;
        this.caT.setTag(null);
        setRootTag(view);
        this.cbW = new com.iqoption.g.a.a(this, 1);
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
        a((y) obj);
        return true;
    }

    public void a(@Nullable y yVar) {
        this.cbV = yVar;
        synchronized (this) {
            this.aot |= 1;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        y yVar = this.cbV;
        if ((j & 2) != 0) {
            this.caT.setOnClickListener(this.cbW);
        }
    }

    public final void a(int i, View view) {
        y yVar = this.cbV;
        if ((yVar != null ? 1 : null) != null) {
            yVar.onClose();
        }
    }
}
