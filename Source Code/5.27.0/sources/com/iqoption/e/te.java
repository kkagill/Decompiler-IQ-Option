package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: NpsCompletedFragmentBindingImpl */
public class te extends td implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener coF;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.rootContainer, 2);
        aos.put(R.id.closeFrame, 3);
        aos.put(R.id.icon, 4);
        aos.put(R.id.text, 5);
    }

    public te(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, aor, aos));
    }

    private te(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (FrameLayout) objArr[3], (ImageView) objArr[4], (ConstraintLayout) objArr[2], (FrameLayout) objArr[0], (TextView) objArr[5]);
        this.aot = -1;
        this.cbk.setTag(null);
        this.coD.setTag(null);
        setRootTag(view);
        this.coF = new com.iqoption.g.a.a(this, 1);
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
        if (4 != i) {
            return false;
        }
        a((com.iqoption.fragment.dialog.popup.a.a) obj);
        return true;
    }

    public void a(@Nullable com.iqoption.fragment.dialog.popup.a.a aVar) {
        this.coE = aVar;
        synchronized (this) {
            this.aot |= 1;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        com.iqoption.fragment.dialog.popup.a.a aVar = this.coE;
        if ((j & 2) != 0) {
            this.cbk.setOnClickListener(this.coF);
        }
    }

    public final void a(int i, View view) {
        com.iqoption.fragment.dialog.popup.a.a aVar = this.coE;
        if ((aVar != null ? 1 : null) != null) {
            aVar.aly();
        }
    }
}
