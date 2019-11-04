package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.widget.NumberAnimateTextView;
import com.iqoption.fragment.rightpanel.MultiRightPanelDelegate.c;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.g.a.a.a;
import com.iqoption.view.ConfirmDialogView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: RightPanelDelegateMultiBindingImpl */
public class yc extends yb implements a {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(24);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final FrameLayout aow;
    @NonNull
    private final FrameLayout ctn;
    @NonNull
    private final TextView cto;
    @Nullable
    private final OnClickListener ctp;
    @Nullable
    private final OnClickListener ctq;

    static {
        aor.setIncludes(3, new String[]{"right_panel_delegate_multi_spot"}, new int[]{5}, new int[]{R.layout.right_panel_delegate_multi_spot});
        aos.put(R.id.rootLayout, 6);
        aos.put(R.id.editLayout, 7);
        aos.put(R.id.amountLabel, 8);
        aos.put(R.id.amountValue, 9);
        aos.put(R.id.amountPicker, 10);
        aos.put(R.id.expLabel, 11);
        aos.put(R.id.expTime, 12);
        aos.put(R.id.expPicker, 13);
        aos.put(R.id.currProfitPercent, 14);
        aos.put(R.id.currProfitLabel, 15);
        aos.put(R.id.multiAssetList, 16);
        aos.put(R.id.multiProfitPercent, 17);
        aos.put(R.id.multiProfitLabel, 18);
        aos.put(R.id.freeDealDialog, 19);
        aos.put(R.id.freeDealValue, 20);
        aos.put(R.id.buyNewDialog, 21);
        aos.put(R.id.timeToClose, 22);
        aos.put(R.id.confirmDialog, 23);
    }

    public yc(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, aor, aos));
    }

    private yc(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (TextView) objArr[8], (FrameLayout) objArr[1], (ImageView) objArr[10], (TextView) objArr[9], (LinearLayout) objArr[21], (yd) objArr[5], (ConfirmDialogView) objArr[23], (TextView) objArr[15], (NumberAnimateTextView) objArr[14], (LinearLayout) objArr[7], (TextView) objArr[11], (FrameLayout) objArr[2], (ImageView) objArr[13], (RobotoTextView) objArr[12], (LinearLayout) objArr[19], (TextView) objArr[20], (RecyclerView) objArr[16], (TextView) objArr[18], (TextView) objArr[17], (LinearLayout) objArr[6], (TextView) objArr[22]);
        this.aot = -1;
        this.crt.setTag(null);
        this.ctg.setTag(null);
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
        this.ctn = (FrameLayout) objArr[3];
        this.ctn.setTag(null);
        this.cto = (TextView) objArr[4];
        this.cto.setTag(null);
        setRootTag(view);
        this.ctp = new com.iqoption.g.a.a(this, 1);
        this.ctq = new com.iqoption.g.a.a(this, 2);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 4;
        }
        this.ctc.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.ctc.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x0017, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x0018 }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x0018 }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x0018 }
        r0 = r6.ctc;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = 0;
        return r0;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0018 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.e.yc.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        if (2 != i) {
            return false;
        }
        a((c) obj);
        return true;
    }

    public void a(@Nullable c cVar) {
        this.ctm = cVar;
        synchronized (this) {
            this.aot |= 2;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.ctc.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return i != 0 ? false : a((yd) obj, i2);
    }

    private boolean a(yd ydVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        c cVar = this.ctm;
        if ((j & 4) != 0) {
            this.crt.setOnClickListener(this.ctp);
            b.j(this.crt, 0.5f);
            this.ctg.setOnClickListener(this.ctq);
            b.j(this.ctg, 0.5f);
            TextView textView = this.cto;
            TextViewBindingAdapter.setDrawableTop(textView, ViewDataBinding.getDrawableFromResource(textView, R.drawable.ic_plus_white_24dp));
        }
        ViewDataBinding.executeBindingsOn(this.ctc);
    }

    public final void a(int i, View view) {
        Object obj = null;
        c cVar;
        if (i == 1) {
            cVar = this.ctm;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aFv();
            }
        } else if (i == 2) {
            cVar = this.ctm;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aFu();
            }
        }
    }
}
