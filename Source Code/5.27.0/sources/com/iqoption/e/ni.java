package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.ag;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.g.a.a.a;
import com.iqoption.view.OtnLoyaltyTeaserView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.view.text.FormattedTextView;
import com.iqoption.x.R;

/* compiled from: FragmentTokenBalanceBindingImpl */
public class ni extends nh implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final NestedScrollView cjA;
    @Nullable
    private final OnClickListener cjB;
    @Nullable
    private final OnClickListener cjC;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentContainer, 9);
        aos.put(R.id.titleTextOtn, 10);
        aos.put(R.id.otnValueContainer, 11);
        aos.put(R.id.otnValue, 12);
        aos.put(R.id.traningBalanceInfo, 13);
        aos.put(R.id.withdrawButton, 14);
        aos.put(R.id.btnOtnWithdrawProgress, 15);
        aos.put(R.id.withdrawButtonTitle, 16);
        aos.put(R.id.balanceContainer, 17);
        aos.put(R.id.balanceToken, 18);
        aos.put(R.id.stockRateValue, 19);
        aos.put(R.id.internalContainer, 20);
        aos.put(R.id.internalRateValue, 21);
        aos.put(R.id.contentContainer2, 22);
        aos.put(R.id.weeklyGainInfo, 23);
        aos.put(R.id.infoContainer, 24);
        aos.put(R.id.turnoverContainer, 25);
        aos.put(R.id.turnoverValue, 26);
        aos.put(R.id.expectedTitle, 27);
        aos.put(R.id.expectedValue, 28);
        aos.put(R.id.distributeContainer, 29);
        aos.put(R.id.yourPosition, 30);
        aos.put(R.id.distributePercenteValue, 31);
        aos.put(R.id.reducingComissionInfo, 32);
        aos.put(R.id.otnCommissionTitle, 33);
        aos.put(R.id.otnRate, 34);
        aos.put(R.id.otnPayCommissionCheck, 35);
        aos.put(R.id.emissionInfo, 36);
        aos.put(R.id.emissionTitleContainer, 37);
        aos.put(R.id.emissionValueContainer, 38);
        aos.put(R.id.emissionLastWeekValue, 39);
        aos.put(R.id.emissionNextWeekValue, 40);
        aos.put(R.id.diviner, 41);
        aos.put(R.id.tokensLeftLayout, 42);
        aos.put(R.id.tokenLeftTitle, 43);
        aos.put(R.id.tokensLeftValue, 44);
    }

    public ni(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 45, aor, aos));
    }

    private ni(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[17], (LinearLayout) objArr[18], (ProgressBar) objArr[15], (LinearLayout) objArr[9], (LinearLayout) objArr[22], (FrameLayout) objArr[29], (RobotoTextView) objArr[31], (View) objArr[41], (RobotoTextView) objArr[8], (TextView) objArr[36], (RobotoTextView) objArr[39], (RobotoTextView) objArr[40], (LinearLayout) objArr[37], (LinearLayout) objArr[38], (LinearLayout) objArr[5], (RobotoTextView) objArr[27], (RobotoTextView) objArr[28], (TextView) objArr[4], (OtnLoyaltyTeaserView) objArr[24], (LinearLayout) objArr[20], (RobotoTextView) objArr[21], (RobotoTextView) objArr[1], (RobotoTextView) objArr[2], (RelativeLayout) objArr[7], (RobotoTextView) objArr[33], (AppCompatCheckBox) objArr[35], (RobotoTextView) objArr[34], (RobotoTextView) objArr[12], (LinearLayout) objArr[11], (RobotoTextView) objArr[6], (TextView) objArr[32], (RobotoTextView) objArr[19], (FormattedTextView) objArr[10], (RobotoTextView) objArr[43], (LinearLayout) objArr[42], (RobotoTextView) objArr[44], (TextView) objArr[13], (LinearLayout) objArr[25], (RobotoTextView) objArr[26], (RobotoTextView) objArr[3], (TextView) objArr[23], (FrameLayout) objArr[14], (RobotoTextView) objArr[16], (RobotoTextView) objArr[30]);
        this.aot = -1;
        this.ciP.setTag(null);
        this.ciV.setTag(null);
        this.ciY.setTag(null);
        this.cjc.setTag(null);
        this.cjA = (NestedScrollView) objArr[0];
        this.cjA.setTag(null);
        this.cjd.setTag(null);
        this.cje.setTag(null);
        this.cjk.setTag(null);
        this.cju.setTag(null);
        setRootTag(view);
        this.cjB = new com.iqoption.g.a.a(this, 2);
        this.cjC = new com.iqoption.g.a.a(this, 1);
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
        a((ag) obj);
        return true;
    }

    public void a(@Nullable ag agVar) {
        this.cjz = agVar;
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
        ag agVar = this.cjz;
        if ((j & 2) != 0) {
            Void voidR = (Void) null;
            b.a(this.ciP, voidR);
            this.ciV.setOnClickListener(this.cjB);
            b.a(this.ciV, voidR);
            this.ciY.setOnClickListener(this.cjC);
            b.a(this.cjc, voidR);
            b.a(this.cjd, voidR);
            b.a(this.cje, voidR);
            b.a(this.cjk, voidR);
            b.a(this.cju, voidR);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        ag agVar;
        if (i == 1) {
            agVar = this.cjz;
            if (agVar != null) {
                obj = 1;
            }
            if (obj != null) {
                agVar.ayr();
            }
        } else if (i == 2) {
            agVar = this.cjz;
            if (agVar != null) {
                obj = 1;
            }
            if (obj != null) {
                agVar.ayr();
            }
        }
    }
}
