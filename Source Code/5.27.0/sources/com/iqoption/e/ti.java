package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.core.ui.widget.nps.NpsRatingBar;
import com.iqoption.fragment.dialog.popup.a.c;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: NpsScoreFragmentBindingImpl */
public class ti extends th implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener coU;
    @Nullable
    private final OnClickListener coV;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.toolbar, 4);
        aos.put(R.id.tittle, 5);
        aos.put(R.id.content, 6);
        aos.put(R.id.question, 7);
        aos.put(R.id.ratingBarTitle, 8);
        aos.put(R.id.ratingBar, 9);
        aos.put(R.id.submit, 10);
        aos.put(R.id.error, 11);
        aos.put(R.id.cnErrorIcon, 12);
        aos.put(R.id.errorText, 13);
    }

    public ti(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, aor, aos));
    }

    private ti(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (ImageView) objArr[12], (ConstraintLayout) objArr[6], (FrameLayout) objArr[11], (TextView) objArr[13], (TextView) objArr[2], (TextView) objArr[7], (NpsRatingBar) objArr[9], (TextView) objArr[8], (FrameLayout) objArr[0], (TextView) objArr[10], (TextView) objArr[5], (FrameLayout) objArr[4], (TextView) objArr[3]);
        this.aot = -1;
        this.cbk.setTag(null);
        this.coO.setTag(null);
        this.chw.setTag(null);
        this.coS.setTag(null);
        setRootTag(view);
        this.coU = new com.iqoption.g.a.a(this, 2);
        this.coV = new com.iqoption.g.a.a(this, 1);
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
        a((c) obj);
        return true;
    }

    public void a(@Nullable c cVar) {
        this.coT = cVar;
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
        c cVar = this.coT;
        if ((j & 2) != 0) {
            this.cbk.setOnClickListener(this.coU);
            TextViewBindingAdapter.setDrawableStart(this.coO, ViewDataBinding.getDrawableFromResource(this.coO, R.drawable.ic_not_likely));
            Void voidR = (Void) null;
            b.a(this.coO, voidR);
            this.chw.setOnClickListener(this.coV);
            TextViewBindingAdapter.setDrawableStart(this.coS, ViewDataBinding.getDrawableFromResource(this.coS, R.drawable.ic_likely));
            b.a(this.coS, voidR);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        c cVar;
        if (i == 1) {
            cVar = this.coT;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aly();
            }
        } else if (i == 2) {
            cVar = this.coT;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aly();
            }
        }
    }
}
