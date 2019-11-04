package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.account.security.AccountSecurityFragment;
import com.iqoption.g.a.a.a;
import com.iqoption.view.SmoothViewPager;
import com.iqoption.x.R;

/* compiled from: FragmentAccountSecurityBindingImpl */
public class ih extends ig implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener ceV;
    @Nullable
    private final OnClickListener ceW;
    @Nullable
    private final OnClickListener ceX;
    @Nullable
    private final OnClickListener ceY;
    @Nullable
    private final OnClickListener ceZ;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.main_content, 6);
        aos.put(R.id.securityTitle, 7);
        aos.put(R.id.securityTabs, 8);
        aos.put(R.id.viewPager, 9);
        aos.put(R.id.dots, 10);
        aos.put(R.id.dot1, 11);
        aos.put(R.id.dot2, 12);
        aos.put(R.id.dot3, 13);
        aos.put(R.id.dot4, 14);
    }

    public ih(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, aor, aos));
    }

    private ih(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0], (ImageView) objArr[11], (ImageView) objArr[12], (ImageView) objArr[13], (ImageView) objArr[14], (LinearLayout) objArr[10], (ImageView) objArr[1], (ImageView) objArr[2], (LinearLayout) objArr[6], (ImageView) objArr[3], (LinearLayout) objArr[8], (FrameLayout) objArr[7], (ImageView) objArr[4], (ImageView) objArr[5], (SmoothViewPager) objArr[9]);
        this.aot = -1;
        this.ceG.setTag(null);
        this.ceM.setTag(null);
        this.ceN.setTag(null);
        this.ceO.setTag(null);
        this.ceR.setTag(null);
        this.ceS.setTag(null);
        setRootTag(view);
        this.ceV = new com.iqoption.g.a.a(this, 3);
        this.ceW = new com.iqoption.g.a.a(this, 4);
        this.ceX = new com.iqoption.g.a.a(this, 1);
        this.ceY = new com.iqoption.g.a.a(this, 2);
        this.ceZ = new com.iqoption.g.a.a(this, 5);
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
        a((AccountSecurityFragment) obj);
        return true;
    }

    public void a(@Nullable AccountSecurityFragment accountSecurityFragment) {
        this.ceU = accountSecurityFragment;
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
        AccountSecurityFragment accountSecurityFragment = this.ceU;
        if ((j & 2) != 0) {
            this.ceM.setOnClickListener(this.ceX);
            this.ceN.setOnClickListener(this.ceY);
            this.ceO.setOnClickListener(this.ceV);
            this.ceR.setOnClickListener(this.ceW);
            this.ceS.setOnClickListener(this.ceZ);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        AccountSecurityFragment accountSecurityFragment;
        if (i == 1) {
            accountSecurityFragment = this.ceU;
            if (accountSecurityFragment != null) {
                obj = 1;
            }
            if (obj != null) {
                accountSecurityFragment.ayg();
            }
        } else if (i == 2) {
            accountSecurityFragment = this.ceU;
            if (accountSecurityFragment != null) {
                obj = 1;
            }
            if (obj != null) {
                accountSecurityFragment.bo(view);
            }
        } else if (i == 3) {
            accountSecurityFragment = this.ceU;
            if (accountSecurityFragment != null) {
                obj = 1;
            }
            if (obj != null) {
                accountSecurityFragment.bo(view);
            }
        } else if (i == 4) {
            accountSecurityFragment = this.ceU;
            if (accountSecurityFragment != null) {
                obj = 1;
            }
            if (obj != null) {
                accountSecurityFragment.bo(view);
            }
        } else if (i == 5) {
            accountSecurityFragment = this.ceU;
            if (accountSecurityFragment != null) {
                obj = 1;
            }
            if (obj != null) {
                accountSecurityFragment.bo(view);
            }
        }
    }
}
