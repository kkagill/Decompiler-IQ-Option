package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.dialog.d;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.view.RobotoTextView;
import com.iqoption.view.scoreboard.BalanceView;
import com.iqoption.x.R;

/* compiled from: DialogCongratOtnEmissionExecutedBindingImpl */
public class fv extends fu {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.swapConteiner, 2);
        aos.put(R.id.contentLayout, 3);
        aos.put(R.id.info, 4);
        aos.put(R.id.firstScreen, 5);
        aos.put(R.id.infoTitle, 6);
        aos.put(R.id.congratTitle, 7);
        aos.put(R.id.cashContainer, 8);
        aos.put(R.id.plus, 9);
        aos.put(R.id.value, 10);
        aos.put(R.id.fromBalanceValue, 11);
        aos.put(R.id.getit, 12);
        aos.put(R.id.light, 13);
        aos.put(R.id.logo, 14);
    }

    public fv(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, aor, aos));
    }

    private fv(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[8], (RobotoTextView) objArr[7], (FrameLayout) objArr[3], (LinearLayout) objArr[5], (RobotoTextView) objArr[11], (TextView) objArr[12], (ImageView) objArr[4], (RobotoTextView) objArr[6], (RobotoTextView) objArr[1], (ImageView) objArr[13], (ImageView) objArr[14], (TextView) objArr[9], (FrameLayout) objArr[0], (FrameLayout) objArr[2], (BalanceView) objArr[10]);
        this.aot = -1;
        this.cbd.setTag(null);
        this.caT.setTag(null);
        setRootTag(view);
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
        if (1 != i) {
            return false;
        }
        a((d) obj);
        return true;
    }

    public void a(@Nullable d dVar) {
        this.cbj = dVar;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 2) != 0) {
            b.a(this.cbd, (Void) null);
        }
    }
}
