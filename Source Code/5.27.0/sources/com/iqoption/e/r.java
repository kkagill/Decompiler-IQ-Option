package com.iqoption.e;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import com.iqoption.fragment.account.security.a.d;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: AccountSecurityResendEmailFragmentBindingImpl */
public class r extends q implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;
    @Nullable
    private final OnClickListener bTb;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.emailSentText, 3);
    }

    public r(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private r(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (ImageView) objArr[2], (TextView) objArr[1]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.bJZ.setTag(null);
        this.bSZ.setTag(null);
        setRootTag(view);
        this.bTb = new com.iqoption.g.a.a(this, 1);
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
        a((d) obj);
        return true;
    }

    public void a(@Nullable d dVar) {
        this.bTa = dVar;
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
        d dVar = this.bTa;
        Drawable drawable = null;
        long j2 = 3 & j;
        if (!(j2 == 0 || dVar == null)) {
            drawable = dVar.azz();
        }
        if (j2 != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.bJZ, drawable);
        }
        if ((j & 2) != 0) {
            this.bSZ.setOnClickListener(this.bTb);
        }
    }

    public final void a(int i, View view) {
        d dVar = this.bTa;
        if ((dVar != null ? 1 : null) != null) {
            dVar.azw();
        }
    }
}
