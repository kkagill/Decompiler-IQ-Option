package com.iqoption.chat.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.iqoption.chat.e.c;
import com.iqoption.chat.e.e;
import com.iqoption.chat.e.g;
import com.iqoption.core.ui.a;

/* compiled from: ChatFragmentAttachmentPickerBindingImpl */
public class ab extends aa {
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
        aos.put(g.contentLayout, 2);
        aos.put(g.previewList, 3);
        aos.put(g.btnGalleryOrSend, 4);
        aos.put(g.iconAddSend, 5);
        aos.put(g.labelAddSend, 6);
    }

    public ab(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, aor, aos));
    }

    private ab(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1], (LinearLayout) objArr[4], (LinearLayout) objArr[2], (LottieAnimationView) objArr[5], (TextView) objArr[6], (RecyclerView) objArr[3], (CoordinatorLayout) objArr[0]);
        this.aot = -1;
        this.aRj.setTag(null);
        this.aRp.setTag(null);
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
            TextViewBindingAdapter.setDrawableStart(this.aRj, ViewDataBinding.getDrawableFromResource(this.aRj, e.ic_clip_white_24dp));
            a.f(this.aRj, ViewDataBinding.getColorFromResource(this.aRj, c.chat_attachment_picker_button_icon));
        }
    }
}
