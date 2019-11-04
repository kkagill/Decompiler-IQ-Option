package com.iqoption.chat.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.chat.e.d;
import com.iqoption.chat.e.e;
import com.iqoption.chat.e.g;
import com.iqoption.core.ui.a;

/* compiled from: ChatFileMessageHeadItemBindingImpl */
public class t extends s {
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
        aos.put(g.author, 2);
        aos.put(g.time, 3);
    }

    public t(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private t(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (LinearLayout) objArr[0], (TextView) objArr[1], (TextView) objArr[3]);
        this.aot = -1;
        this.aRf.setTag(null);
        this.amZ.setTag(null);
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
            a.l(this.aRf, this.aRf.getResources().getDimension(d._dp4));
            TextViewBindingAdapter.setDrawableStart(this.amZ, ViewDataBinding.getDrawableFromResource(this.amZ, e.chat_file_message_icon));
        }
    }
}