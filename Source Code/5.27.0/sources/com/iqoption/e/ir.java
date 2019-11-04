package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.widget.DialogContentLayout;
import com.iqoption.core.ui.widget.MaxSizeConstraintLayout;
import com.iqoption.x.R;

/* compiled from: FragmentAssetsBindingImpl */
public class ir extends iq {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.contentAssets, 1);
        aos.put(R.id.categoriesList, 2);
        aos.put(R.id.categoriesSeparator, 3);
        aos.put(R.id.headerBottom, 4);
        aos.put(R.id.btnSearch, 5);
        aos.put(R.id.btnClearSearch, 6);
        aos.put(R.id.sortSettingsContainer, 7);
        aos.put(R.id.searchField, 8);
        aos.put(R.id.assetsList, 9);
    }

    public ir(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private ir(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[9], (ImageView) objArr[6], (ImageView) objArr[5], (RecyclerView) objArr[2], (View) objArr[3], (MaxSizeConstraintLayout) objArr[1], (DialogContentLayout) objArr[0], (Guideline) objArr[4], (EditText) objArr[8], (FrameLayout) objArr[7]);
        this.aot = -1;
        this.aoz.setTag(null);
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
