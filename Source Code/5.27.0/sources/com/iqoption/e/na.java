package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.ad;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: FragmentPushSettingsBindingImpl */
public class na extends mz implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener ciy;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.main_content, 2);
        aos.put(R.id.push_settings_list, 3);
        aos.put(R.id.alert_layout, 4);
        aos.put(R.id.alert_image, 5);
        aos.put(R.id.button_enable, 6);
        aos.put(R.id.progress_bar, 7);
    }

    public na(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private na(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0], (ImageView) objArr[5], (LinearLayout) objArr[4], (TextView) objArr[6], (ImageView) objArr[1], (LinearLayout) objArr[2], (ProgressBar) objArr[7], (RecyclerView) objArr[3]);
        this.aot = -1;
        this.ceG.setTag(null);
        this.ceM.setTag(null);
        setRootTag(view);
        this.ciy = new com.iqoption.g.a.a(this, 1);
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
        a((ad) obj);
        return true;
    }

    public void a(@Nullable ad adVar) {
        this.cix = adVar;
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
        ad adVar = this.cix;
        if ((j & 2) != 0) {
            this.ceM.setOnClickListener(this.ciy);
        }
    }

    public final void a(int i, View view) {
        ad adVar = this.cix;
        if ((adVar != null ? 1 : null) != null) {
            adVar.ayg();
        }
    }
}
