package com.iqoption.core.a;

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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.i.g;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentSearchCountryBindingImpl */
public class e extends d {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final FrameLayout aow;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(g.countryBackground, 2);
        aos.put(g.countryContainer, 3);
        aos.put(g.searchCountryToolbar, 4);
        aos.put(g.searchCountryTitle, 5);
        aos.put(g.searchCountryClose, 6);
        aos.put(g.countryInputContainer, 7);
        aos.put(g.countryInput, 8);
        aos.put(g.countryEdit, 9);
        aos.put(g.countrySuggestList, 10);
    }

    public e(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, aor, aos));
    }

    private e(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[2], (LinearLayout) objArr[3], (IQTextInputEditText) objArr[9], (TextInputLayout) objArr[8], (FrameLayout) objArr[7], (ImageView) objArr[1], (RecyclerView) objArr[10], (ImageView) objArr[6], (TextView) objArr[5], (LinearLayout) objArr[4]);
        this.aot = -1;
        this.bfp.setTag(null);
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 1) != 0) {
            a.j(this.bfp, 0.5f);
        }
    }
}
