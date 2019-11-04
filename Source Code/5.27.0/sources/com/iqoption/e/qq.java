package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.dto.ToastEntity;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: LocalToastLayoutBindingImpl */
public class qq extends qp {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.localToastTypeIndicator, 3);
        aos.put(R.id.toastActionIcon, 4);
    }

    public qq(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, aor, aos));
    }

    private qq(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RobotoTextView) objArr[2], (LinearLayout) objArr[0], (RobotoTextView) objArr[1], (View) objArr[3], (ImageView) objArr[4]);
        this.aot = -1;
        this.cmU.setTag(null);
        this.aRl.setTag(null);
        this.cmV.setTag(null);
        setRootTag(view);
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
        if (3 != i) {
            return false;
        }
        a((ToastEntity) obj);
        return true;
    }

    public void a(@Nullable ToastEntity toastEntity) {
        this.cmY = toastEntity;
        synchronized (this) {
            this.aot |= 1;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        CharSequence charSequence;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        ToastEntity toastEntity = this.cmY;
        j &= 3;
        CharSequence charSequence2 = null;
        if (j == 0 || toastEntity == null) {
            charSequence = null;
        } else {
            charSequence2 = toastEntity.getTitle();
            charSequence = toastEntity.getActionText();
        }
        if (j != 0) {
            TextViewBindingAdapter.setText(this.cmU, charSequence);
            TextViewBindingAdapter.setText(this.cmV, charSequence2);
        }
    }
}
