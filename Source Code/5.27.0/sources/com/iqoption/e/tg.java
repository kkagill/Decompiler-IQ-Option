package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.dialog.popup.a.b;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: NpsFeedbackFragmentBindingImpl */
public class tg extends tf implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener coK;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.rootContainer, 2);
        aos.put(R.id.toolbar, 3);
        aos.put(R.id.tittle, 4);
        aos.put(R.id.closeFrame, 5);
        aos.put(R.id.content, 6);
        aos.put(R.id.question, 7);
        aos.put(R.id.feedback, 8);
        aos.put(R.id.skip, 9);
        aos.put(R.id.send, 10);
    }

    public tg(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, aor, aos));
    }

    private tg(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (FrameLayout) objArr[5], (ConstraintLayout) objArr[6], (EditText) objArr[8], (TextView) objArr[7], (ConstraintLayout) objArr[2], (FrameLayout) objArr[0], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[4], (FrameLayout) objArr[3]);
        this.aot = -1;
        this.cbk.setTag(null);
        this.coD.setTag(null);
        setRootTag(view);
        this.coK = new com.iqoption.g.a.a(this, 1);
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
        a((b) obj);
        return true;
    }

    public void a(@Nullable b bVar) {
        this.coJ = bVar;
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
        b bVar = this.coJ;
        if ((j & 2) != 0) {
            this.cbk.setOnClickListener(this.coK);
        }
    }

    public final void a(int i, View view) {
        b bVar = this.coJ;
        if ((bVar != null ? 1 : null) != null) {
            bVar.aly();
        }
    }
}
