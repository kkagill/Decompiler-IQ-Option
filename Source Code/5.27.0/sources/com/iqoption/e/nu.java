package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.x.R;

/* compiled from: FragmentVideoEducationVideosBindingImpl */
public class nu extends nt {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.headerLayout, 1);
        aos.put(R.id.btnBack, 2);
        aos.put(R.id.btnSearch, 3);
        aos.put(R.id.titleLayout, 4);
        aos.put(R.id.title, 5);
        aos.put(R.id.searchLayout, 6);
        aos.put(R.id.searchInput, 7);
        aos.put(R.id.btnCloseSearch, 8);
        aos.put(R.id.tagsList, 9);
        aos.put(R.id.videosList, 10);
    }

    public nu(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, aor, aos));
    }

    private nu(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (TextView) objArr[8], (ImageView) objArr[3], (FrameLayout) objArr[1], (EditText) objArr[7], (LinearLayout) objArr[6], (RecyclerView) objArr[9], (TextView) objArr[5], (FrameLayout) objArr[4], (RecyclerView) objArr[10]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
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
