package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.view.spinner.AwesomeTextSpinner;
import com.iqoption.x.R;

/* compiled from: PersonalInfoPageBindingImpl */
public class ua extends tz {
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
        aos.put(R.id.nameEdit, 3);
        aos.put(R.id.surnameEdit, 4);
        aos.put(R.id.tin, 5);
        aos.put(R.id.personalEmail, 6);
        aos.put(R.id.countryCode, 7);
        aos.put(R.id.phone, 8);
        aos.put(R.id.iconAlertConfirm, 9);
        aos.put(R.id.confirmLink, 10);
        aos.put(R.id.genderLayout, 11);
        aos.put(R.id.male, 12);
        aos.put(R.id.maleCheck, 13);
        aos.put(R.id.female, 14);
        aos.put(R.id.femaleCheck, 15);
        aos.put(R.id.birthDay, 16);
        aos.put(R.id.countrySpinner, 17);
        aos.put(R.id.nationalitySpinner, 18);
        aos.put(R.id.city, 19);
        aos.put(R.id.zip, 20);
        aos.put(R.id.address, 21);
        aos.put(R.id.deleteContainer, 22);
        aos.put(R.id.deleteAccountWarning, 23);
    }

    public ua(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, aor, aos));
    }

    private ua(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (EditText) objArr[21], (EditText) objArr[16], (EditText) objArr[19], (TextView) objArr[10], (EditText) objArr[7], (AwesomeTextSpinner) objArr[17], (TextView) objArr[2], (TextView) objArr[23], (LinearLayout) objArr[22], (LinearLayout) objArr[14], (ImageView) objArr[15], (FrameLayout) objArr[11], (ImageView) objArr[9], (LinearLayout) objArr[12], (ImageView) objArr[13], (EditText) objArr[3], (AwesomeTextSpinner) objArr[18], (EditText) objArr[6], (ScrollView) objArr[0], (EditText) objArr[8], (EditText) objArr[4], (EditText) objArr[5], (LinearLayout) objArr[1], (EditText) objArr[20]);
        this.aot = -1;
        this.cpA.setTag(null);
        this.cpM.setTag(null);
        this.cpQ.setTag(null);
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
            Void voidR = (Void) null;
            b.a(this.cpA, voidR);
            b.a(this.cpQ, voidR);
        }
    }
}
