package com.iqoption.chat.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.chat.e.c;
import com.iqoption.chat.e.d;
import com.iqoption.chat.e.g;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.ui.widget.MaxSizeFrameLayout;

/* compiled from: ChatDialogFeedbackBindingImpl */
public class h extends g {
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
        aos.put(g.title, 3);
        aos.put(g.note, 4);
        aos.put(g.commentLayout, 5);
        aos.put(g.counter, 6);
        aos.put(g.btnSend, 7);
        aos.put(g.btnCancel, 8);
    }

    public h(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, aor, aos));
    }

    private h(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[8], (TextView) objArr[7], (IQTextInputEditText) objArr[2], (TextInputLayout) objArr[5], (TextView) objArr[6], (MaxSizeFrameLayout) objArr[1], (TextView) objArr[4], (FrameLayout) objArr[0], (TextView) objArr[3]);
        this.aot = -1;
        this.aQQ.setTag(null);
        this.aQT.setTag(null);
        this.aHP.setTag(null);
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
            a.a(this.aQQ, ViewDataBinding.getColorStateListFromResource(this.aQQ, c.chat_dialog_feedback_comment_bg_tint), this.aQQ.getResources().getDimension(d.text_input_line_width));
            a.n(this.aQT, ViewDataBinding.getColorFromResource(this.aQT, c.chat_dialog_bg_tint));
        }
    }
}
