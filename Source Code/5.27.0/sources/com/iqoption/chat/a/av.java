package com.iqoption.chat.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
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

/* compiled from: ChatLikeDislikeMessageItemBindingImpl */
public class av extends au {
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
        aos.put(g.bubbleLayout, 4);
        aos.put(g.bubble, 5);
        aos.put(g.author, 6);
        aos.put(g.message, 7);
        aos.put(g.buttonsLayout, 8);
    }

    public av(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, aor, aos));
    }

    private av(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[6], (ImageView) objArr[3], (LinearLayout) objArr[5], (FrameLayout) objArr[4], (LinearLayout) objArr[8], (ImageView) objArr[2], (ImageView) objArr[1], (MessageView) objArr[7]);
        this.aot = -1;
        this.aQW.setTag(null);
        this.aRI.setTag(null);
        this.aRJ.setTag(null);
        this.aoV = (ConstraintLayout) objArr[0];
        this.aoV.setTag(null);
        View view2 = view;
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
            a.l(this.aRI, this.aRI.getResources().getDimension(d._dp4));
            a.l(this.aRJ, this.aRJ.getResources().getDimension(d._dp4));
        }
    }
}
