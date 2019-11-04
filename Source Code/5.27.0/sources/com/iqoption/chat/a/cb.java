package com.iqoption.chat.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.e.d;
import com.iqoption.chat.e.g;
import com.iqoption.chat.fragment.MessageView;
import com.iqoption.core.ui.a;

/* compiled from: ChatTransferDialogMessageItemBindingImpl */
public class cb extends ca {
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
        aos.put(g.bubble, 3);
        aos.put(g.author, 4);
        aos.put(g.message, 5);
    }

    public cb(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, aor, aos));
    }

    private cb(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[4], (ImageView) objArr[2], (LinearLayout) objArr[3], (TextView) objArr[1], (MessageView) objArr[5]);
        this.aot = -1;
        this.aQW.setTag(null);
        this.aRV.setTag(null);
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
            a.k(this.aQW, 0.95f);
            a.l(this.aRV, this.aRV.getResources().getDimension(d._dp4));
        }
    }
}
