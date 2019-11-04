package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.dialog.popup.whatsnew.depositpage.d;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: WhatsNewDialogExperimentalDepositPageBindingImpl */
public class abc extends abb implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;
    @Nullable
    private final OnClickListener cuZ;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.whatsNewTittle, 2);
        aos.put(R.id.list, 3);
        aos.put(R.id.deposit, 4);
    }

    public abc(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, aor, aos));
    }

    private abc(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[4], (RecyclerView) objArr[3], (ImageView) objArr[1], (TextView) objArr[2]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.cle.setTag(null);
        setRootTag(view);
        this.cuZ = new com.iqoption.g.a.a(this, 1);
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
        a((d) obj);
        return true;
    }

    public void a(@Nullable d dVar) {
        this.cuY = dVar;
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
        d dVar = this.cuY;
        if ((j & 2) != 0) {
            this.cle.setOnClickListener(this.cuZ);
        }
    }

    public final void a(int i, View view) {
        d dVar = this.cuY;
        if ((dVar != null ? 1 : null) != null) {
            dVar.onClose();
        }
    }
}
