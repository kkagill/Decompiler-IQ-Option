package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.g.a.a.a;
import com.iqoption.view.text.FormattedTextView;
import com.iqoption.x.R;

/* compiled from: WhatsNewDialogSpotBindingImpl */
public class abe extends abd implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final ConstraintLayout aoV;
    private long aot;
    @Nullable
    private final OnClickListener cvb;
    @Nullable
    private final OnClickListener cvc;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.bottomBarBackground, 3);
        aos.put(R.id.whatsNewTittle, 4);
        aos.put(R.id.image, 5);
        aos.put(R.id.title, 6);
        aos.put(R.id.text, 7);
    }

    public abe(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private abe(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[3], (ImageView) objArr[5], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[2], (ImageView) objArr[1], (FormattedTextView) objArr[4]);
        this.aot = -1;
        this.aoV = (ConstraintLayout) objArr[0];
        this.aoV.setTag(null);
        this.cbl.setTag(null);
        this.cle.setTag(null);
        setRootTag(view);
        this.cvb = new com.iqoption.g.a.a(this, 2);
        this.cvc = new com.iqoption.g.a.a(this, 1);
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
            this.cbl.setOnClickListener(this.cvb);
            this.cle.setOnClickListener(this.cvc);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        com.iqoption.fragment.dialog.popup.whatsnew.a aVar;
        if (i == 1) {
            aVar = this.clg;
            if (aVar != null) {
                obj = 1;
            }
            if (obj != null) {
                aVar.onClose();
            }
        } else if (i == 2) {
            aVar = this.clg;
            if (aVar != null) {
                obj = 1;
            }
            if (obj != null) {
                aVar.aCx();
            }
        }
    }
}
