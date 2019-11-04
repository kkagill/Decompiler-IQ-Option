package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: AccountSecurityConfirmCodeExpiredFragmentBindingImpl */
public class b extends a implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;
    @Nullable
    private final OnClickListener bSu;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.confirmationCodeTitle, 2);
        aos.put(R.id.confirmationCodeSentText, 3);
    }

    public b(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private b(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (TextView) objArr[2], (ConfirmButtonView) objArr[1]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.bSs.setTag(null);
        setRootTag(view);
        this.bSu = new com.iqoption.g.a.a(this, 1);
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
        if (5 != i) {
            return false;
        }
        a((com.iqoption.fragment.account.security.phone.a) obj);
        return true;
    }

    public void a(@Nullable com.iqoption.fragment.account.security.phone.a aVar) {
        this.bSt = aVar;
        synchronized (this) {
            this.aot |= 1;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        com.iqoption.fragment.account.security.phone.a aVar = this.bSt;
        if ((j & 2) != 0) {
            this.bSs.setOnClickListener(this.bSu);
        }
    }

    public final void a(int i, View view) {
        com.iqoption.fragment.account.security.phone.a aVar = this.bSt;
        if ((aVar != null ? 1 : null) != null) {
            aVar.azA();
        }
    }
}
