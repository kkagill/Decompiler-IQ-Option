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
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.chat.e.d;
import com.iqoption.chat.e.e;
import com.iqoption.chat.e.g;
import com.iqoption.core.ui.a;

/* compiled from: ChatFileMessageTailItemBindingImpl */
public class v extends u {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final FrameLayout aow;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(g.time, 3);
    }

    public v(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private v(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[3]);
        this.aot = -1;
        this.aQW.setTag(null);
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
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
            a.k(this.aQW, 0.95f);
            TextViewBindingAdapter.setDrawableStart(this.amZ, ViewDataBinding.getDrawableFromResource(this.amZ, e.chat_file_message_icon));
            a.l(this.amZ, this.amZ.getResources().getDimension(d._dp4));
        }
    }
}