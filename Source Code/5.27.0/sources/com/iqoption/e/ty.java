package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.view.SelectionButton;
import com.iqoption.x.R;

/* compiled from: PersonalInfoDialogBindingImpl */
public class ty extends tx {
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
        aos.put(R.id.backButton, 2);
        aos.put(R.id.personalName, 3);
        aos.put(R.id.personalId, 4);
        aos.put(R.id.savePersonalInfo, 5);
        aos.put(R.id.kycStatusLayout, 6);
        aos.put(R.id.kycStatus, 7);
        aos.put(R.id.kycStatusIcon, 8);
        aos.put(R.id.kycDocumentStatus, 9);
        aos.put(R.id.infoTab, 10);
        aos.put(R.id.passTab, 11);
        aos.put(R.id.docTabContainer, 12);
        aos.put(R.id.docsTab, 13);
        aos.put(R.id.iconAlertDocs, 14);
        aos.put(R.id.cardsTabContainer, 15);
        aos.put(R.id.cardsTab, 16);
        aos.put(R.id.iconAlertCards, 17);
        aos.put(R.id.personalViewPager, 18);
    }

    public ty(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, aor, aos));
    }

    private ty(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageButton) objArr[2], (SelectionButton) objArr[16], (FrameLayout) objArr[15], (FrameLayout) objArr[12], (SelectionButton) objArr[13], (ImageView) objArr[17], (ImageView) objArr[14], (SelectionButton) objArr[10], (ConfirmButtonView) objArr[1], (TextView) objArr[9], (LinearLayout) objArr[7], (ImageView) objArr[8], (LinearLayout) objArr[6], (SelectionButton) objArr[11], (RobotoTextView) objArr[4], (RobotoTextView) objArr[3], (ViewPager) objArr[18], (TextView) objArr[5]);
        this.aot = -1;
        this.cpk.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 1) != 0) {
            this.cpk.setButtonImageSrc(ViewDataBinding.getDrawableFromResource(this.cpk, R.drawable.ic_kyc_next_selector_green));
        }
    }
}
