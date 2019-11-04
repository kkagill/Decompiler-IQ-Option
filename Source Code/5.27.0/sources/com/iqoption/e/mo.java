package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.ab;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.g.a.a.a;
import com.iqoption.view.RobotoEditText;
import com.iqoption.view.RobotoTextView;
import com.iqoption.widget.SmallNumPad;
import com.iqoption.x.R;

/* compiled from: FragmentPendingChooserBindingImpl */
public class mo extends mn implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final FrameLayout aow;
    @Nullable
    private final OnClickListener chZ;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 2);
        aos.put(R.id.content, 3);
        aos.put(R.id.main_title, 4);
        aos.put(R.id.editContainer, 5);
        aos.put(R.id.value, 6);
        aos.put(R.id.marketTitle, 7);
        aos.put(R.id.buttonContainer, 8);
        aos.put(R.id.minusButton, 9);
        aos.put(R.id.plusButton, 10);
        aos.put(R.id.numPad, 11);
    }

    public mo(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, aor, aos));
    }

    private mo(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RelativeLayout) objArr[8], (ImageView) objArr[1], (LinearLayout) objArr[3], (FrameLayout) objArr[2], (LinearLayout) objArr[5], (RobotoTextView) objArr[4], (TextView) objArr[7], (ImageView) objArr[9], (SmallNumPad) objArr[11], (ImageView) objArr[10], (RobotoEditText) objArr[6]);
        this.aot = -1;
        this.chQ.setTag(null);
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
        setRootTag(view);
        this.chZ = new com.iqoption.g.a.a(this, 1);
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
        a((ab) obj);
        return true;
    }

    public void a(@Nullable ab abVar) {
        this.chY = abVar;
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
        ab abVar = this.chY;
        if ((j & 2) != 0) {
            b.a(this.chQ, (Void) null);
            this.aow.setOnClickListener(this.chZ);
        }
    }

    public final void a(int i, View view) {
        ab abVar = this.chY;
        if ((abVar != null ? 1 : null) != null) {
            abVar.onBackPressed();
        }
    }
}
