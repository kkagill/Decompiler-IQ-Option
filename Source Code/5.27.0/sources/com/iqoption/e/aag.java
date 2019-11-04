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
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.g.a.a.a;
import com.iqoption.view.text.FormattedTextView;
import com.iqoption.x.R;

/* compiled from: TrailingWhatsNewDialogBindingImpl */
public class aag extends aaf implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;
    @Nullable
    private final OnClickListener cuz;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.whatsNewTittle, 3);
    }

    public aag(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private aag(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (ImageView) objArr[1], (FormattedTextView) objArr[3]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.cuy.setTag(null);
        this.cle.setTag(null);
        setRootTag(view);
        this.cuz = new com.iqoption.g.a.a(this, 1);
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
            b.a(this.cuy, (Void) null);
            this.cle.setOnClickListener(this.cuz);
        }
    }

    public final void a(int i, View view) {
        com.iqoption.fragment.dialog.popup.whatsnew.a aVar = this.clg;
        if ((aVar != null ? 1 : null) != null) {
            aVar.onClose();
        }
    }
}
