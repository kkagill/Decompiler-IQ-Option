package com.iqoption.fragment;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.p;
import com.iqoption.activity.LicenseActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.d;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.PushSetting;
import com.iqoption.dto.entity.iqbus.Subscriptions;
import com.iqoption.dto.entity.iqbus.Subscriptions.Category;
import com.iqoption.dto.entity.iqbus.Subscriptions.Group;
import com.iqoption.e.nn;
import com.iqoption.fragment.b.e;
import com.iqoption.mobbtech.connect.response.f;
import com.iqoption.util.o;
import com.iqoption.view.SettingItemView;
import com.iqoption.x.R;
import java.util.Iterator;

/* compiled from: SettingsFragment */
public final class ae extends e implements OnClickListener, com.iqoption.view.SettingItemView.a, com.iqoption.view.SettingItemView.b {
    public static final String TAG = "com.iqoption.fragment.ae";
    private com.iqoption.l.b cWW;
    private com.iqoption.app.managers.feature.c cWX;
    private LayoutInflater cWY;
    private nn cWZ;
    private com.iqoption.l.c cXa;

    /* compiled from: SettingsFragment */
    private static class c {
        private final ae cXd;
        private final SettingItemView cXe;
        private final PushSetting cXf;

        /* synthetic */ c(ae aeVar, SettingItemView settingItemView, PushSetting pushSetting, AnonymousClass1 anonymousClass1) {
            this(aeVar, settingItemView, pushSetting);
        }

        private c(ae aeVar, SettingItemView settingItemView, PushSetting pushSetting) {
            this.cXd = aeVar;
            this.cXe = settingItemView;
            this.cXf = pushSetting;
        }
    }

    /* compiled from: SettingsFragment */
    private static class a extends com.iqoption.system.c.b<ae, Subscriptions> {
        /* synthetic */ a(ae aeVar, AnonymousClass1 anonymousClass1) {
            this(aeVar);
        }

        private a(ae aeVar) {
            super(aeVar);
        }

        /* renamed from: a */
        public void v(@NonNull ae aeVar, @NonNull Subscriptions subscriptions) {
            if (!aeVar.isDetached()) {
                aeVar.b(subscriptions);
            }
        }

        /* renamed from: a */
        public void c(@NonNull ae aeVar, Throwable th) {
            if (!aeVar.isDetached()) {
                aeVar.ayi();
            }
        }
    }

    /* compiled from: SettingsFragment */
    private static class b extends com.iqoption.system.c.b<c, Void> implements com.iqoption.mobbtech.connect.request.f.a {
        public b(c cVar) {
            super(cVar, Void.class);
        }

        public void onFinish() {
            c cVar = (c) aUE();
            if (cVar != null && !cVar.cXd.isDetached()) {
                cVar.cXd.a(cVar.cXe, cVar.cXf);
            }
        }

        public void a(f fVar) {
            c cVar = (c) aUE();
            if (cVar != null && !cVar.cXd.isDetached()) {
                cVar.cXd.a(cVar.cXe, cVar.cXf, fVar);
            }
        }
    }

    private static /* synthetic */ void A(Throwable th) {
    }

    private static /* synthetic */ void ayk() {
    }

    public String getEventName() {
        return "traderoom-settings";
    }

    public static void f(FragmentManager fragmentManager) {
        if (fragmentManager.findFragmentByTag(TAG) == null) {
            fragmentManager.beginTransaction().add(R.id.other_fragment, new ae(), TAG).addToBackStack(TAG).commit();
        }
    }

    public static void g(FragmentManager fragmentManager) {
        if (fragmentManager.findFragmentByTag(TAG) == null) {
            ae aeVar = new ae();
            aeVar.setArguments(new com.iqoption.util.e().z("arg_flag", true).toBundle());
            fragmentManager.beginTransaction().add(R.id.other_fragment, aeVar, TAG).addToBackStack(TAG).commit();
        }
    }

    public View getContentView() {
        return this.cWZ.getRoot();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.backButton) {
            onClose();
        } else if (id == R.id.openLicenses) {
            getContext().startActivity(LicenseActivity.aH(getContext()));
        }
    }

    public boolean a(@NonNull SettingItemView settingItemView, boolean z) {
        if (z) {
            return false;
        }
        o.b(getContext(), new -$$Lambda$ae$H3tKg6BFjXbAY8oHmQ8BCrKv4UU(settingItemView));
        return true;
    }

    public void onToggled(@NonNull SettingItemView settingItemView, boolean z) {
        int id = settingItemView.getId();
        double d = 1.0d;
        String str = Event.CATEGORY_BUTTON_PRESSED;
        EventManager BS;
        Builder Builder;
        switch (id) {
            case R.id.buyInClickClickSetting /*2131362134*/:
                this.cWW.fg(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_purchase-buy-oneclick");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.expPanelSetting /*2131362699*/:
                this.cWW.fa(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_traderoom-expirations-panel");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.fxOptionsNextExpirationPopupSetting /*2131362813*/:
                this.cWW.fe(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_fx_options_next_expiration_popup");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.hiLowChartSetting /*2131362881*/:
                this.cWW.aX(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_hi-low-chart");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.investmentAmountSetting /*2131362977*/:
                this.cWW.eh(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_investment-amount");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.latestMovementsSetting /*2131363172*/:
                this.cWW.fb(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_latest-movements");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.liveDealsSetting /*2131363224*/:
                this.cWW.setLiveDealsEnabled(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_traderoom-live-deals");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.marginAddOnSetting /*2131363256*/:
                this.cWW.aV(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "settings_enable-margin-add-on");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.sellWithConfirmationForexClickSetting /*2131363832*/:
                this.cWW.fh(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_purchase-sell-with-confirmation-forex");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.shareMyLiveDealsSetting /*2131363847*/:
                this.cXa.fi(z).a(-$$Lambda$ae$SdcmlmjmRPcb3Wmco6MZJlJxTVk.INSTANCE, -$$Lambda$ae$f3tCaxh4e9VoMj1lJ4aZE9mMs4k.INSTANCE);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_traderoom-share-my-live-deals");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.smallDealExpirableSetting /*2131363884*/:
                this.cWW.fc(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_small_deal_expirable");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.smallDealNonExpirableSetting /*2131363885*/:
                this.cWW.fd(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_small_deal_non_expirable");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.soundSetting /*2131363920*/:
                this.cWW.ff(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_sound");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.tickNotificationSetting /*2131364100*/:
                this.cWW.bc(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_purchase-tick-notification");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.tradersMoodSetting /*2131364240*/:
                this.cWW.setTradersMoodEnabled(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "trading-settings_traderoom-traders-mood");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            case R.id.trailingStopSetting /*2131364267*/:
                this.cWW.aW(z);
                BS = EventManager.BS();
                Builder = Event.Builder(str, "settings_enable-trailing-stop-Setting");
                if (!z) {
                    d = 0.0d;
                }
                BS.a(Builder.setValue(Double.valueOf(d)).build());
                return;
            default:
                return;
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.cWW = com.iqoption.l.b.aTS();
        this.cWX = com.iqoption.app.managers.feature.c.Iw();
    }

    public void onDestroy() {
        super.onDestroy();
        this.cWW = null;
        this.cWX = null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cWY = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), (int) R.style.PushSettingsTheme));
        boolean z = false;
        this.cWZ = (nn) DataBindingUtil.inflate(this.cWY, R.layout.fragment_traderoom_settings, viewGroup, false);
        this.cWZ.a(this);
        this.cWZ.cjX.setLabel(getString(com.iqoption.core.util.ae.anD()));
        this.cWZ.cko.setLabel(getString(com.iqoption.core.util.ae.anB()));
        this.cWZ.cjY.setSmoothScrollingEnabled(true);
        this.cWZ.bfR.setOnClickListener(this);
        this.cWZ.ckh.setOnClickListener(this);
        this.cWZ.cjZ.setChecked(this.cWW.aTT());
        this.cWZ.cjZ.setOnToggleListener(this);
        this.cWZ.cks.setChecked(this.cWW.Pk());
        this.cWZ.cks.setOnToggleListener(this);
        if (com.iqoption.h.a.aNv()) {
            this.cWZ.ckf.setVisibility(0);
            this.cWZ.ckn.setVisibility(0);
            this.cWZ.ckf.setChecked(this.cWW.Pl());
            this.cWZ.ckf.setOnToggleListener(this);
            this.cWZ.ckn.setEnabled(false);
        } else {
            this.cWZ.ckf.setVisibility(8);
            this.cWZ.ckn.setVisibility(8);
        }
        this.cWZ.cko.setChecked(this.cWW.aTV());
        this.cWZ.cko.setOnToggleListener(this);
        this.cWZ.ckp.setChecked(this.cWW.aTW());
        this.cWZ.ckp.setOnToggleListener(this);
        this.cWZ.cka.setChecked(this.cWW.aTX());
        this.cWZ.cka.setOnToggleListener(this);
        this.cWZ.cka.setVisibility(com.iqoption.core.features.instrument.b.Xs() ? 0 : 8);
        this.cWZ.ckq.setChecked(this.cWW.aTY());
        this.cWZ.ckq.setOnToggleListener(this);
        this.cWZ.ckd.setChecked(this.cWW.aTZ());
        this.cWZ.ckd.setOnToggleListener(this);
        this.cWZ.cjX.setChecked(this.cWW.aUa());
        this.cWZ.cjX.setToggleHandler(this);
        this.cWZ.cjX.setOnToggleListener(this);
        if (d.EH().ej("tick-deals")) {
            this.cWZ.ckr.setChecked(this.cWW.FB());
            this.cWZ.ckr.setOnToggleListener(this);
            this.cWZ.ckr.setVisibility(0);
        } else {
            this.cWZ.ckr.setVisibility(8);
        }
        this.cWZ.ckm.setChecked(this.cWW.Gd());
        this.cWZ.ckm.setOnToggleListener(this);
        this.cWZ.ckm.setVisibility(com.iqoption.core.features.instrument.b.Xv() ? 0 : 8);
        boolean ej = this.cWX.ej("margin-add-on");
        if (ej) {
            this.cWZ.ckg.setChecked(this.cWW.Fn());
            this.cWZ.ckg.setOnToggleListener(this);
        }
        this.cWZ.ckg.setVisibility(ej ? 0 : 8);
        ej = this.cWX.ej("trailing-stop");
        if (ej) {
            this.cWZ.ckt.setChecked(this.cWW.Fo());
            this.cWZ.ckt.setOnToggleListener(this);
        }
        this.cWZ.ckt.setVisibility(ej ? 0 : 8);
        this.cWZ.cke.setChecked(this.cWW.aTU());
        this.cWZ.cke.setOnToggleListener(this);
        this.cWZ.ckc.setVisibility(this.cWX.ej("price-movements") ? 0 : 8);
        if (!(com.iqoption.core.features.instrument.b.Xt() || com.iqoption.core.features.instrument.b.Xr() || com.iqoption.core.features.instrument.b.Xs())) {
            this.cWZ.cko.setVisibility(8);
            this.cWZ.cjX.setVisibility(8);
        }
        if (!(com.iqoption.core.features.instrument.b.Xv() || com.iqoption.core.features.instrument.b.Xu() || com.iqoption.core.features.instrument.b.Xw())) {
            this.cWZ.ckp.setVisibility(8);
            this.cWZ.ckg.setVisibility(8);
            this.cWZ.ckt.setVisibility(8);
        }
        ayh();
        if (getArguments() != null && getArguments().getBoolean("arg_flag", false)) {
            z = true;
        }
        if (ej && z) {
            this.cWZ.ckj.post(new -$$Lambda$ae$DHXqfnTn31NWaFsosa4Ga-LyyaI(this));
        }
        this.cWZ.ckb.setChecked(this.cWW.Fp());
        this.cWZ.ckb.setOnToggleListener(this);
        if (d.Un().Dq()) {
            this.cWZ.cka.setVisibility(8);
            this.cWZ.ckp.setVisibility(8);
            this.cWZ.ckm.setVisibility(8);
            this.cWZ.ckg.setVisibility(8);
            this.cWZ.ckt.setVisibility(8);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    private /* synthetic */ void ayj() {
        this.cWZ.cjY.smoothScrollTo(0, this.cWZ.ckj.getTop());
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.cWZ.ckt, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 1.05f, 1.0f, 1.05f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 1.05f, 1.0f, 1.05f, 1.0f})});
        ofPropertyValuesHolder.setDuration(1200);
        ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.bhU);
        ofPropertyValuesHolder.start();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.cXa = com.iqoption.l.c.aT(this);
        a(this.cXa.aUb().a(new -$$Lambda$ae$DeNC6Qs5GqzYcmM75r8nOmOf_4w(this), new -$$Lambda$ae$-b238Z-kYOwKryNnvG4R9aPIWSA(this)));
    }

    private /* synthetic */ void c(Optional optional) {
        boolean z = true;
        this.cWZ.ckn.setEnabled(true);
        Boolean aji = optional.isPresent() ? ((com.iqoption.core.microservices.usersettings.b.a.a) optional.get()).aji() : null;
        this.cWZ.ckn.setOnToggleListener(null);
        SettingItemView settingItemView = this.cWZ.ckn;
        if (aji != null) {
            z = aji.booleanValue();
        }
        settingItemView.setChecked(z);
        this.cWZ.ckn.setOnToggleListener(this);
    }

    private /* synthetic */ void z(Throwable th) {
        this.cWZ.ckn.setEnabled(true);
        this.cWZ.ckn.setOnToggleListener(this);
    }

    private void ayh() {
        if (this.cWX.ej("price-movements")) {
            this.cWZ.ckk.setVisibility(8);
            return;
        }
        this.cWZ.ckk.setVisibility(0);
        this.cWZ.ckl.removeAllViews();
        if (com.iqoption.app.managers.feature.c.Iw().ej("notification-subscription-ms")) {
            this.cWZ.cki.setVisibility(0);
            p.a(com.iqoption.mobbtech.connect.request.api.e.aPw(), new a(this, null), com.iqoption.core.c.a.biN);
            return;
        }
        this.cWZ.cki.setVisibility(8);
        for (PushSetting pushSetting : com.iqoption.app.managers.a.GM().GO()) {
            if (pushSetting.id.intValue() < 5) {
                SettingItemView settingItemView = (SettingItemView) this.cWY.inflate(R.layout.push_setting_item_view, this.cWZ.ckl, false);
                settingItemView.setTag(pushSetting.id);
                settingItemView.setLabel(pushSetting.name);
                settingItemView.setChecked(pushSetting.enabled.booleanValue());
                settingItemView.setOnToggleListener(new -$$Lambda$ae$EjwW7luMOhpL4OYXsnXgiFRUQrk(this, pushSetting, settingItemView));
                this.cWZ.ckl.addView(settingItemView, new LayoutParams(-1, -2));
            }
        }
    }

    private /* synthetic */ void a(PushSetting pushSetting, SettingItemView settingItemView, SettingItemView settingItemView2, boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "settings_push").setParameters(u.anp().o("push_id", pushSetting.id).anr()).setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
        com.iqoption.mobbtech.connect.request.f.a((long) pushSetting.id.intValue(), z, new b(new c(this, settingItemView, pushSetting, null)), getContext());
        settingItemView.setProgressVisible(true);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(@Nullable Subscriptions subscriptions) {
        this.cWZ.cki.setVisibility(8);
        if (subscriptions == null || subscriptions.categories == null) {
            this.cWZ.cki.setVisibility(8);
            return;
        }
        this.cWZ.ckl.removeAllViews();
        Iterator it = subscriptions.categories.iterator();
        while (it.hasNext()) {
            Category category = (Category) it.next();
            if (category.groups != null) {
                Iterator it2 = category.groups.iterator();
                while (it2.hasNext()) {
                    final Group group = (Group) it2.next();
                    if (group.id.longValue() < 5) {
                        SettingItemView settingItemView = (SettingItemView) this.cWY.inflate(R.layout.push_setting_item_view, this.cWZ.ckl, false);
                        settingItemView.setTag(group.id);
                        settingItemView.setLabel(group.title);
                        settingItemView.setChecked(group.enabled.booleanValue());
                        settingItemView.setOnToggleListener(new com.iqoption.view.SettingItemView.a() {
                            public void onToggled(@NonNull SettingItemView settingItemView, boolean z) {
                                EventManager BS = EventManager.BS();
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("push-settings_");
                                stringBuilder.append(group.id);
                                BS.a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, stringBuilder.toString()).setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
                                group.enabled = Boolean.valueOf(z);
                                com.iqoption.app.d.aP(ae.this.getContext()).a(group.id.longValue(), group.enabled.booleanValue());
                                com.iqoption.mobbtech.connect.request.api.e.a(group.id, group.enabled);
                            }
                        });
                        this.cWZ.ckl.addView(settingItemView, new LayoutParams(-1, -2));
                    }
                }
            }
        }
        this.cWZ.cki.setVisibility(8);
    }

    /* Access modifiers changed, original: 0000 */
    public void ayi() {
        this.cWZ.cki.setVisibility(8);
        com.iqoption.app.a.b.aQ(getContext());
    }

    /* Access modifiers changed, original: 0000 */
    public void a(@NonNull SettingItemView settingItemView, @NonNull PushSetting pushSetting) {
        Iterator it = com.iqoption.app.managers.a.GM().GO().iterator();
        while (it.hasNext()) {
            PushSetting pushSetting2 = (PushSetting) it.next();
            if (com.iqoption.util.ae.equals(pushSetting2.id, pushSetting.id)) {
                pushSetting2.enabled = pushSetting.enabled;
                break;
            }
        }
        settingItemView.setProgressVisible(false);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(@NonNull SettingItemView settingItemView, @NonNull PushSetting pushSetting, @NonNull f fVar) {
        Iterator it = com.iqoption.app.managers.a.GM().GO().iterator();
        while (it.hasNext()) {
            PushSetting pushSetting2 = (PushSetting) it.next();
            if (pushSetting2.id.intValue() == 16842960) {
                pushSetting2.enabled = Boolean.valueOf(pushSetting.enabled.booleanValue() ^ 1);
                break;
            }
        }
        settingItemView.setChecked(pushSetting.enabled.booleanValue() ^ 1);
        settingItemView.setProgressVisible(false);
        fVar.bF(getContext());
    }
}
