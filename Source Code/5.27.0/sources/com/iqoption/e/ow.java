package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.CryptoBumperView;
import com.iqoption.x.R;

/* compiled from: ItemCryptoAssetBindingImpl */
public class ow extends ov {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final RelativeLayout cgo;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.imageLayout, 1);
        aos.put(R.id.touchLayout, 2);
        aos.put(R.id.bumper, 3);
        aos.put(R.id.image, 4);
        aos.put(R.id.sprite, 5);
        aos.put(R.id.disabler, 6);
        aos.put(R.id.label, 7);
    }

    public ow(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private ow(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CryptoBumperView) objArr[3], (View) objArr[6], (ImageView) objArr[4], (FrameLayout) objArr[1], (TextView) objArr[7], (ImageView) objArr[5], (FrameLayout) objArr[2]);
        this.aot = -1;
        this.cgo = (RelativeLayout) objArr[0];
        this.cgo.setTag(null);
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
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
    }
}
