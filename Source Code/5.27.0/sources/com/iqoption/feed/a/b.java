package com.iqoption.feed.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.iqoption.feed.i.e;

/* compiled from: FeedBottomPanelBindingImpl */
public class b extends a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final LinearLayout cdZ;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(e.button_title, 3);
        aos.put(e.price_and_gain, 4);
        aos.put(e.like_animation, 5);
        aos.put(e.like_counter, 6);
        aos.put(e.views_count, 7);
    }

    public b(@Nullable DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 8, aor, aos));
    }

    private b(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (LinearLayout) objArr[1], (Space) objArr[0], (TextView) objArr[3], (LottieAnimationView) objArr[5], (TextView) objArr[6], (TextView) objArr[4], (TextView) objArr[7]);
        this.aot = -1;
        this.cPG.setTag(null);
        this.cPH.setTag(null);
        this.cdZ = (LinearLayout) objArr[2];
        this.cdZ.setTag(null);
        setRootTag(viewArr);
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
