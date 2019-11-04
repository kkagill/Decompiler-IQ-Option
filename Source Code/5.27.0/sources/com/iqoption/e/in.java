package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: FragmentAccountSecurityPasscodeErrorBindingImpl */
public class in extends im implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final ImageView cft;
    @Nullable
    private final OnClickListener cfu;
    @Nullable
    private final OnClickListener cfv;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.main_content, 3);
        aos.put(R.id.passcodeErrorText, 4);
    }

    public in(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, aor, aos));
    }

    private in(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[3], (FrameLayout) objArr[0], (TextView) objArr[4], (TextView) objArr[2]);
        this.aot = -1;
        this.cft = (ImageView) objArr[1];
        this.cft.setTag(null);
        this.cfa.setTag(null);
        this.cfr.setTag(null);
        setRootTag(view);
        this.cfu = new com.iqoption.g.a.a(this, 1);
        this.cfv = new com.iqoption.g.a.a(this, 2);
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
        a((com.iqoption.fragment.account.security.touchId.a) obj);
        return true;
    }

    public void a(@Nullable com.iqoption.fragment.account.security.touchId.a aVar) {
        this.cfs = aVar;
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
        com.iqoption.fragment.account.security.touchId.a aVar = this.cfs;
        if ((j & 2) != 0) {
            this.cft.setOnClickListener(this.cfu);
            this.cfr.setOnClickListener(this.cfv);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        com.iqoption.fragment.account.security.touchId.a aVar;
        if (i == 1) {
            aVar = this.cfs;
            if (aVar != null) {
                obj = 1;
            }
            if (obj != null) {
                aVar.azT();
            }
        } else if (i == 2) {
            aVar = this.cfs;
            if (aVar != null) {
                obj = 1;
            }
            if (obj != null) {
                aVar.azU();
            }
        }
    }
}
