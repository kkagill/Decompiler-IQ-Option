package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.ae;
import com.iqoption.view.SettingItemView;
import com.iqoption.x.R;

/* compiled from: FragmentTraderoomSettingsBindingImpl */
public class no extends nn {
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

    static {
        aos.put(R.id.backButton, 1);
        aos.put(R.id.contentScroll, 2);
        aos.put(R.id.contentLayout, 3);
        aos.put(R.id.expPanelSetting, 4);
        aos.put(R.id.tradersMoodSetting, 5);
        aos.put(R.id.liveDealsSetting, 6);
        aos.put(R.id.shareMyLiveDealsSetting, 7);
        aos.put(R.id.smallDealExpirableSetting, 8);
        aos.put(R.id.smallDealNonExpirableSetting, 9);
        aos.put(R.id.soundSetting, 10);
        aos.put(R.id.investmentAmountSetting, 11);
        aos.put(R.id.hiLowChartSetting, 12);
        aos.put(R.id.purchaseGroup, 13);
        aos.put(R.id.buyInClickClickSetting, 14);
        aos.put(R.id.sellWithConfirmationForexClickSetting, 15);
        aos.put(R.id.marginAddOnSetting, 16);
        aos.put(R.id.trailingStopSetting, 17);
        aos.put(R.id.inAppNotifications, 18);
        aos.put(R.id.tickNotificationSetting, 19);
        aos.put(R.id.latestMovementsSetting, 20);
        aos.put(R.id.fxOptionsNextExpirationPopupSetting, 21);
        aos.put(R.id.pushSettings, 22);
        aos.put(R.id.progressLoadPushSetting, 23);
        aos.put(R.id.pushSettingsContainer, 24);
        aos.put(R.id.openLicenses, 25);
    }

    public no(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 26, aor, aos));
    }

    private no(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (SettingItemView) objArr[14], (LinearLayout) objArr[3], (ScrollView) objArr[2], (SettingItemView) objArr[4], (SettingItemView) objArr[21], (SettingItemView) objArr[12], (LinearLayout) objArr[18], (SettingItemView) objArr[11], (SettingItemView) objArr[20], (SettingItemView) objArr[6], (SettingItemView) objArr[16], (LinearLayout) objArr[25], (ProgressBar) objArr[23], (LinearLayout) objArr[13], (LinearLayout) objArr[22], (LinearLayout) objArr[24], (SettingItemView) objArr[15], (SettingItemView) objArr[7], (SettingItemView) objArr[8], (SettingItemView) objArr[9], (SettingItemView) objArr[10], (SettingItemView) objArr[19], (SettingItemView) objArr[5], (SettingItemView) objArr[17]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
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
        if (4 != i) {
            return false;
        }
        a((ae) obj);
        return true;
    }

    public void a(@Nullable ae aeVar) {
        this.cku = aeVar;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
    }
}
