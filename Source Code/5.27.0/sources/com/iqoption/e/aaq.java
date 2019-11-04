package com.iqoption.e;

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
import com.iqoption.g.a.a.a;
import com.iqoption.view.SmoothViewPager;
import com.iqoption.x.R;

/* compiled from: ViewPagerWhatsNewDialogBindingImpl */
public class aaq extends aap implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;
    @Nullable
    private final OnClickListener cuH;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.whatsNewTitle, 2);
        aos.put(R.id.viewPager, 3);
        aos.put(R.id.navigateButton, 4);
        aos.put(R.id.dots, 5);
        aos.put(R.id.dot1, 6);
        aos.put(R.id.dot2, 7);
    }

    public aaq(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private aaq(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[6], (ImageView) objArr[7], (LinearLayout) objArr[5], (TextView) objArr[4], (SmoothViewPager) objArr[3], (ImageView) objArr[1], (TextView) objArr[2]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.cle.setTag(null);
        setRootTag(view);
        this.cuH = new com.iqoption.g.a.a(this, 1);
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
        a((com.iqoption.fragment.dialog.popup.whatsnew.a) obj);
        return true;
    }

    public void a(@Nullable com.iqoption.fragment.dialog.popup.whatsnew.a aVar) {
        this.clg = aVar;
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
        com.iqoption.fragment.dialog.popup.whatsnew.a aVar = this.clg;
        if ((j & 2) != 0) {
            this.cle.setOnClickListener(this.cuH);
        }
    }

    public final void a(int i, View view) {
        com.iqoption.fragment.dialog.popup.whatsnew.a aVar = this.clg;
        if ((aVar != null ? 1 : null) != null) {
            aVar.onClose();
        }
    }
}
