package com.iqoption.chat.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.chat.e.c;
import com.iqoption.chat.e.g;
import com.iqoption.chat.fragment.BadgeView;
import com.iqoption.core.ui.a;

/* compiled from: FragmentRoomBindingImpl */
public class cn extends cm {
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
        aos.put(g.messagesLayout, 2);
        aos.put(g.messageList, 3);
        aos.put(g.dateBadge, 4);
        aos.put(g.topBar, 5);
        aos.put(g.btnBack, 6);
        aos.put(g.topBarLayout, 7);
        aos.put(g.bottomBarLayout, 8);
    }

    public cn(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, aor, aos));
    }

    private cn(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[8], (ImageView) objArr[6], (FrameLayout) objArr[1], (BadgeView) objArr[4], (RecyclerView) objArr[3], (FrameLayout) objArr[2], (ConstraintLayout) objArr[0], (LinearLayout) objArr[5], (FrameLayout) objArr[7]);
        this.aot = -1;
        this.aSb.setTag(null);
        this.aSf.setTag(null);
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
            a.n(this.aSb, ViewDataBinding.getColorFromResource(this.aSb, c.chat_return_button_bg_tint));
        }
    }
}
