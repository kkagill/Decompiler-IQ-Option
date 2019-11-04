package com.iqoption.fragment;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.o;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.b.b.p;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.charttools.f;
import com.iqoption.charttools.model.indicator.h;
import com.iqoption.config.Platform;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.microservices.popupserver.response.PopupAnchor;
import com.iqoption.core.microservices.popupserver.response.PopupFormat;
import com.iqoption.core.rx.i;
import com.iqoption.core.ui.widget.amountview.AmountView;
import com.iqoption.core.ui.widget.gl.GLChartSurfaceLifecycleObserver;
import com.iqoption.core.ui.widget.gl.GLChartSurfaceView;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.ToastEntity;
import com.iqoption.dto.entity.FeaturesUpdateEvent;
import com.iqoption.dto.entity.iqbus.SignalLegacy;
import com.iqoption.dto.event.OtnEmissionExecuted;
import com.iqoption.fragment.leftpanel.LeftPanelSection;
import com.iqoption.fragment.rightpanel.RightPanelFragment;
import com.iqoption.fragment.rightpanel.n;
import com.iqoption.gl.NativeHandler;
import com.iqoption.gl.NativeHandler.m;
import com.iqoption.gl.NativeHandler.s;
import com.iqoption.l.a.j;
import com.iqoption.mobbtech.connect.request.g;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.TYPE_REMOVE_GROUP;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.k;
import com.iqoption.service.e.l;
import com.iqoption.signals.r;
import com.iqoption.util.Network;
import com.iqoption.util.ak;
import com.iqoption.util.v;
import com.iqoption.view.ChartTypeView;
import com.iqoption.view.LocalToast;
import com.iqoption.view.MultiAssetSpinner;
import com.iqoption.view.toppanel.TopPanelFragment;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TradeFragment */
public class ah extends com.iqoption.core.ui.fragment.d implements com.iqoption.fragment.dialog.c.a, com.iqoption.fragment.restriction.a.c {
    public static final String TAG = "com.iqoption.fragment.ah";
    private com.iqoption.popup.c aju;
    private TextView alQ;
    private TextView bYh;
    public LocalToast cXA;
    private RightPanelFragment cXB;
    public TopPanelFragment cXC;
    public boolean cXD = false;
    public boolean cXE = false;
    public a cXF = new a(this, null);
    public d cXG = new d(this);
    private final g cXH = new g(this);
    public final aa<Boolean> cXI = aa.vM();
    private boolean cXJ = false;
    private boolean cXK;
    @NonNull
    private com.iqoption.o.d cXL;
    private n cXM;
    @Nullable
    private f cXN = null;
    private boolean cXO;
    private boolean cXP = false;
    public View cXQ;
    public ChartTypeView cXR;
    private long cXS = 0;
    public com.iqoption.gl.b cXT;
    private BroadcastReceiver cXU = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            ah.this.a(intent, true);
        }
    };
    private Pair<InstrumentType, long[]> cXV = null;
    Builder cXW;
    private e cXX = new e(this, null);
    private PopupWindow cXY;
    private long cXZ = 0;
    @NonNull
    private final io.reactivex.disposables.a cXt = new io.reactivex.disposables.a();
    public MultiAssetSpinner cXu;
    private View cXv;
    private AmountView cXw;
    private View cXx;
    protected ImageView cXy;
    protected ViewGroup cXz;

    /* compiled from: TradeFragment */
    /* renamed from: com.iqoption.fragment.ah$8 */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] cYd = new int[CardStatus.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.core.microservices.billing.verification.response.CardStatus.values();
            r0 = r0.length;
            r0 = new int[r0];
            cYd = r0;
            r0 = cYd;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.microservices.billing.verification.response.CardStatus.VERIFIED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = cYd;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.microservices.billing.verification.response.CardStatus.DECLINED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = cYd;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.core.microservices.billing.verification.response.CardStatus.FAILED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.ah$AnonymousClass8.<clinit>():void");
        }
    }

    /* compiled from: TradeFragment */
    public static class a extends com.iqoption.system.a.d {
        private final WeakReference<ah> bJf;
        private boolean cYe;
        private Runnable cYf;

        private static /* synthetic */ void F(Throwable th) {
        }

        /* synthetic */ a(ah ahVar, TradeFragment$1 tradeFragment$1) {
            this(ahVar);
        }

        private a(ah ahVar) {
            this.bJf = new WeakReference(ahVar);
        }

        @com.google.common.b.e
        public void onOpenOptionGroupRemoved(k kVar) {
            if (kVar.dJv != null && kVar.dJv.instrumentType == InstrumentType.FX_INSTRUMENT && kVar.dJw == TYPE_REMOVE_GROUP.EXPIRED) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$P2mqUaP52df3zO6Qk0QGcU9Iq74(this, kVar));
            }
        }

        @com.google.common.b.e
        public void changeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if (aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$dde0SdY95DFaBXQWZcJUp9V9sB4(this, aVar));
            }
        }

        @SuppressLint({"CheckResult"})
        @com.google.common.b.e
        public void onUpdateInstrumentParamstEvent(m mVar) {
            f.aCQ.ey(TabHelper.IM().Jj()).r(new -$$Lambda$ah$a$6Hv8ZnCsuCjVLwN0Cw8HLOJhVos(((Integer) mVar.getValue()).intValue())).f(i.aki()).e(i.akj()).a(new -$$Lambda$ah$a$QRHxRF2i2UL-FpYxRZnVNHkbSXg(this), -$$Lambda$ah$a$h2uNGg28HO5rir1t90U7FnBIT44.INSTANCE);
        }

        private static /* synthetic */ io.reactivex.k c(int i, List list) {
            for (Object obj : list) {
                if (obj.getIndex() == i) {
                    break;
                }
            }
            Object obj2 = null;
            if (obj2 != null) {
                return io.reactivex.i.cH(obj2);
            }
            return io.reactivex.i.bld();
        }

        private /* synthetic */ void u(h hVar) {
            ah ahVar = (ah) this.bJf.get();
            TabHelper.i Jh = TabHelper.IM().Jh();
            if (ahVar != null && ahVar.isAdded() && Jh != null) {
                com.iqoption.o.d.F(ahVar.requireActivity()).e(new com.iqoption.charttools.constructor.d(Jh.Ju(), Jh.Jv(), hVar, false, null));
            }
        }

        @com.google.common.b.e
        public void onAskForSellingPositionEvent(com.iqoption.gl.NativeHandler.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$7iUcKqXvxR9luqvi1TSaCpqr4Xc(this, aVar));
        }

        @com.google.common.b.e
        public void onRequestMarginCallEvent(NativeHandler.n nVar) {
            if (com.iqoption.app.managers.feature.c.Iw().ej("margin-add-on")) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$YAo6duOOYCir01cTc4lO-mcEvk8(this, nVar));
            }
        }

        @com.google.common.b.e
        public void onFeeInfoPressedEvent(NativeHandler.i iVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$5PCd2sFq-GZc8T5fppnj8OzBcTg(this, iVar));
        }

        @com.google.common.b.e
        public void onEmissionExecuted(OtnEmissionExecuted otnEmissionExecuted) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$uf2_3T_LlO7nFw_E9G2veKN8Fgg(this, otnEmissionExecuted));
        }

        @com.google.common.b.e
        public void onTotalPnl(com.iqoption.app.managers.c.h hVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$ubLHKCFCgIkmvtCezfbE_h7u440(this, hVar));
        }

        @com.google.common.b.e
        public void onTabChanged(TabHelper.k kVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$VxriuhoASjrvGb40sUwTFKVXmco(this));
        }

        private /* synthetic */ void ayY() {
            ah ahVar = (ah) this.bJf.get();
            if (ahVar != null) {
                ahVar.ayv();
            }
        }

        @com.google.common.b.e
        public void onAccountGroupIdChange(com.iqoption.app.b.b.i iVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$7QXiG-t4vZ2klbQlTuGyrUYgDIo(this));
        }

        private /* synthetic */ void ayX() {
            ah ahVar = (ah) this.bJf.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.cXH.aPe();
            }
        }

        @com.google.common.b.e
        public void onAccountActivated(com.iqoption.app.b.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$LhqUdJ8Zc2daWnKAtBoV3eN98hI(this, aVar));
        }

        @com.google.common.b.e
        public void onLocalToastTapEvent(com.iqoption.view.LocalToast.b bVar) {
            if (this.cYf == null) {
                this.cYf = new -$$Lambda$ah$a$oBkXYoue1HyTjreER9ViKy8VHwk(this, bVar);
                com.iqoption.core.c.a.biN.postDelayed(this.cYf, 200);
            }
        }

        @com.google.common.b.e
        public void onVisibleCandlesSizeChangedEvent(s sVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$akPqY3Mm-GnYD698l4lhldePcoA(this, sVar));
        }

        @com.google.common.b.e
        public void onClickSmallDealViewEvent(com.iqoption.gl.NativeHandler.e eVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$vcFindkUt4woMf0sDENu8k612BM(this, eVar));
        }

        @com.google.common.b.e
        public void onClickTradersMoodViewEvent(NativeHandler.f fVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$EIN_LyRtohuf4TRSwslnO6yYhQs(this));
        }

        private /* synthetic */ void ayW() {
            ah ahVar = (ah) this.bJf.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.onClickTradersMoodView();
            }
        }

        @com.google.common.b.e
        public void onDeferredOrderExecutedEvent(com.iqoption.mobbtech.connect.response.options.OptionEvents.e eVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$r_B3Si1_eOQK5KeNCeL3qDk16rY(this, eVar));
        }

        @com.google.common.b.e
        public void onDeferredOrderCreatedEvent(com.iqoption.mobbtech.connect.response.options.OptionEvents.d dVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$8MuikM5wYLvLZFW9PY20ZSva7qI(this, dVar));
        }

        @com.google.common.b.e
        public void onFeatureUpdateEvent(FeaturesUpdateEvent featuresUpdateEvent) {
            Optional d = com.google.common.collect.i.b(featuresUpdateEvent.features).d(-$$Lambda$ah$a$L7LpcLy76q0Zz-Ncty44hvON09k.INSTANCE);
            if (d.isPresent()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$JiQrZwaepozAhuTWEFLhPai6sWk(this, "disabled".equalsIgnoreCase(((com.iqoption.core.microservices.features.a.a) d.get()).getStatus()) ^ 1));
            }
        }

        private /* synthetic */ void dv(boolean z) {
            ah ahVar = (ah) this.bJf.get();
            if (ahVar != null && ahVar.isAdded()) {
                if (z) {
                    com.iqoption.dialog.i.d(ahVar.requireFragmentManager());
                } else {
                    com.iqoption.dialog.i.e(ahVar.requireFragmentManager());
                }
            }
        }

        @com.google.common.b.e
        public void onInvestmentAmountSettingChanged(final com.iqoption.l.a.e eVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    ah ahVar = (ah) a.this.bJf.get();
                    if (ahVar != null && ahVar.isAdded()) {
                        ahVar.cXT.eh(((Boolean) eVar.getValue()).booleanValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onTradersMoodSettingChanged(com.iqoption.l.a.n nVar) {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$ah$a$98a6lsoq55S522v6Iy0uGp4TPCE(nVar));
        }

        @com.google.common.b.e
        public void onLiveDealsSettingChanged(com.iqoption.l.a.g gVar) {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$ah$a$LtSrpiqzQGre97tJfuklkDdfaos(gVar));
        }

        @com.google.common.b.e
        public void onSmallDealExpirableEnabled(j jVar) {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$ah$a$474DJ5BSsMfv10dd5YGkyJvzNR4(jVar));
        }

        @com.google.common.b.e
        public void onSmallDealNonExpirableEnabled(com.iqoption.l.a.k kVar) {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$ah$a$2g6dZt2b4zGVfTAK7b5z4_8YFaE(kVar));
        }

        @com.google.common.b.e
        public void onExpirationPanelSettingChanged(final com.iqoption.l.a.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    ah ahVar = (ah) a.this.bJf.get();
                    if (ahVar != null && ahVar.isAdded()) {
                        ahVar.du(((Boolean) bVar.getValue()).booleanValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onTickedNotReadCount(p pVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    ah ahVar = (ah) a.this.bJf.get();
                    if (ahVar != null && ahVar.isAdded()) {
                        ahVar.ayL();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onUpdateKyc(l lVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    ah ahVar = (ah) a.this.bJf.get();
                    if (ahVar != null && ahVar.isAdded() && ahVar.getView() != null) {
                        ahVar.ayL();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onInitializationCompletedEvent(com.iqoption.app.managers.tab.TabHelper.e eVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$SK4SGSF6QXN2utmrd0CetLMmaUY(this));
        }

        private /* synthetic */ void ayV() {
            ah ahVar = (ah) this.bJf.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.ayF();
            }
        }

        @com.google.common.b.e
        public void onToastEntity(final ToastEntity toastEntity) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    ah ahVar = (ah) a.this.bJf.get();
                    if (ahVar != null && ahVar.isAdded() && ahVar.cXA != null) {
                        ahVar.cXA.c(toastEntity).aYa();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeCommissionPaidEvent(final com.iqoption.app.helpers.a.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    ah ahVar = (ah) a.this.bJf.get();
                    if (ahVar != null && ahVar.isAdded()) {
                        com.google.common.util.concurrent.p.a(ahVar.cXI, new com.iqoption.system.c.a<Boolean>() {
                            /* renamed from: o */
                            public void onSuccess(Boolean bool) {
                                ah ahVar = (ah) a.this.bJf.get();
                                if (ahVar != null && ahVar.isAdded()) {
                                    h.a(ahVar.getActivity(), ahVar.getFragmentManager(), R.id.fragment, aVar.instrumentType, aVar.atv);
                                }
                            }
                        }, com.iqoption.core.c.a.biN);
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onPersonalDataPolicyChanged(com.iqoption.app.b.b.m mVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$TVDCtwW4fMcffTHcGX1lUI45OWA(this, mVar));
        }

        @com.google.common.b.e
        public void onAccountIsTrial(final com.iqoption.app.b.b.k kVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    ah ahVar = (ah) a.this.bJf.get();
                    if (ahVar != null && ahVar.isAdded() && ahVar.getTradeRoomActivity() != null && !((Boolean) kVar.getValue()).booleanValue()) {
                        ahVar.a(ahVar.getTradeRoomActivity(), com.iqoption.app.b.aK(ahVar.getContext()).Ed());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onTemplateApplied(com.iqoption.charttools.tools.h.f fVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$A4oIampbxgLteSEzdWrdrwlCAV0(this));
        }

        private /* synthetic */ void ayU() {
            ah ahVar = (ah) this.bJf.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.ayv();
            }
        }

        @com.google.common.b.e
        public void onSignalIsShown(com.iqoption.fragment.d.c.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$a$v-M9VtIFSgNQ4JMfmAkYOP6AKlQ(this));
        }

        private /* synthetic */ void ayT() {
            ah ahVar = (ah) this.bJf.get();
            if (ahVar != null && ahVar.isAdded() && ahVar.getView() != null) {
                com.iqoption.fragment.d.a.aHX().a(ahVar.getContext(), ahVar.getView().getRootView(), 0);
            }
        }
    }

    /* compiled from: TradeFragment */
    private static class d extends com.iqoption.system.a.g<ah> {
        public d(ah ahVar) {
            super(ahVar);
        }

        @com.google.common.b.e
        public void onUpdateKYC(l lVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$d$pLoJwcZ-6miyuV1JCKU54O2GT3U(this));
        }

        private /* synthetic */ void azg() {
            ah ahVar = (ah) this.dUo.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.ayL();
            }
        }

        @com.google.common.b.e
        public void onLoyalShow(com.iqoption.service.e.e eVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$d$qInprJtIa69cC2RjdAl_xh847uk(this));
        }

        private /* synthetic */ void azf() {
            ah ahVar = (ah) this.dUo.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.ayC();
            }
        }

        @com.google.common.b.e
        public void onShowRelogin(com.iqoption.service.e.g gVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$d$NORTwllNjBBv3JQt4k51MftmSVk(this));
        }

        private /* synthetic */ void aze() {
            ah ahVar = (ah) this.dUo.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.getTradeRoomActivity().Am();
            }
        }

        @com.google.common.b.e
        public void onChangeBalanceType(com.iqoption.service.e.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$d$aYukiwOZ2QNVQ1mH_frwdE3lwrA(this, bVar));
        }

        private /* synthetic */ void a(com.iqoption.service.e.b bVar) {
            ah ahVar = (ah) this.dUo.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.ds(((Boolean) bVar.getValue()).booleanValue());
            }
        }

        @com.google.common.b.e
        public void onUpdateBalanceValue(com.iqoption.service.e.k kVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$d$hgsTDdRZZYX3VDTbGoLsnE0y4lw(this));
        }

        private /* synthetic */ void azd() {
            ah ahVar = (ah) this.dUo.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.axs();
            }
        }

        @com.google.common.b.e
        public void onChangeCurrentCurrency(com.iqoption.service.e.c cVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$d$6C4umJBOH41A6Vecx1FQx103YCA(this));
        }

        private /* synthetic */ void azc() {
            ah ahVar = (ah) this.dUo.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.ayz();
            }
        }

        @com.google.common.b.e
        public void onSocketClosedAfterForeground(com.iqoption.service.e.h hVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$ah$d$nQrRxsxGw4U-Kwz-ZdIgkL21Qvw(this));
        }

        private /* synthetic */ void azb() {
            ah ahVar = (ah) this.dUo.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.cXJ = true;
            }
        }
    }

    /* compiled from: TradeFragment */
    private static class e implements com.iqoption.view.a.b.a {
        private final WeakReference<ah> bJf;

        /* synthetic */ e(ah ahVar, TradeFragment$1 tradeFragment$1) {
            this(ahVar);
        }

        private e(ah ahVar) {
            this.bJf = new WeakReference(ahVar);
        }

        public void onTick(long j) {
            ah ahVar = (ah) this.bJf.get();
            if (ahVar != null && ahVar.isAdded()) {
                ahVar.bE(j);
            }
        }
    }

    /* compiled from: TradeFragment */
    private class b extends com.iqoption.system.c.b<ah, Boolean> {
        private final int activeId;
        private final InstrumentType instrumentType;

        b(ah ahVar, Bundle bundle) {
            super(ahVar, Boolean.class);
            this.activeId = Integer.parseInt(bundle.getString("active_id"));
            this.instrumentType = InstrumentType.fromServerValueNullable(bundle.getString("instrument_type"));
        }

        b(ah ahVar, InstrumentType instrumentType, int i) {
            super(ahVar, Boolean.class);
            this.activeId = i;
            this.instrumentType = instrumentType;
        }

        /* renamed from: a */
        public void v(@NonNull ah ahVar, @NonNull Boolean bool) {
            if (this.activeId != 0 && this.instrumentType != null) {
                com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(this.activeId), this.instrumentType);
                if (a != null) {
                    TabHelper.IM().u(a);
                }
            }
        }
    }

    /* compiled from: TradeFragment */
    private static class c extends com.iqoption.core.graphics.a.b {
        private ValueAnimator Le;
        private boolean cYn;
        private final int endColor;
        private final int startColor;

        c(Drawable drawable, int i, int i2) {
            super(com.iqoption.core.ext.a.wrap(drawable));
            this.startColor = i;
            this.endColor = i2;
        }

        public void dw(boolean z) {
            if (this.cYn != z) {
                this.cYn = z;
                if (this.cYn) {
                    ayZ();
                } else {
                    aza();
                }
            }
        }

        private void ayZ() {
            if (this.Le == null) {
                Keyframe ofInt = Keyframe.ofInt(0.0f, this.startColor);
                Keyframe ofInt2 = Keyframe.ofInt(0.3f, this.endColor);
                Keyframe ofInt3 = Keyframe.ofInt(0.7f, this.endColor);
                Keyframe ofInt4 = Keyframe.ofInt(1.0f, this.startColor);
                PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
                propertyValuesHolderArr[0] = PropertyValuesHolder.ofKeyframe("", new Keyframe[]{ofInt, ofInt2, ofInt3, ofInt4});
                this.Le = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderArr);
                this.Le.setEvaluator(com.iqoption.core.graphics.animation.a.XC());
                this.Le.setRepeatCount(-1);
                this.Le.addUpdateListener(new -$$Lambda$ah$c$d6dJc60z7F99ccxuKZs3sXZ6iVA(this));
                com.iqoption.core.ext.a.a(this.Le, 1500);
            }
            this.Le.start();
        }

        private /* synthetic */ void h(ValueAnimator valueAnimator) {
            DrawableCompat.setTint(XZ(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }

        private void aza() {
            ValueAnimator valueAnimator = this.Le;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                DrawableCompat.setTint(XZ(), this.startColor);
            }
        }
    }

    private static /* synthetic */ void B(Throwable th) {
    }

    private static /* synthetic */ void C(Throwable th) {
    }

    private static /* synthetic */ void D(Throwable th) {
    }

    private static /* synthetic */ void E(Throwable th) {
    }

    public void ayL() {
    }

    public void ayM() {
    }

    public static ah ayt() {
        return new ah();
    }

    @Nullable
    private TradeRoomActivity getTradeRoomActivity() {
        return (TradeRoomActivity) getActivity();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.cXH.f(getTradeRoomActivity());
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.trade_room, viewGroup, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        setRetainInstance(false);
        this.cXL = com.iqoption.o.d.F(requireActivity());
        this.aju = com.iqoption.popup.c.A(requireActivity());
        this.cXM = n.s(requireActivity());
        com.iqoption.o.c cVar = new com.iqoption.o.c(this);
        LiveData aCp = this.cXL.aCp();
        cVar.getClass();
        aCp.observe(this, new -$$Lambda$scMLHsWvyVA2sUBOK3qRWDQdP70(cVar));
        getLifecycle().addObserver(new TradeFragment$1(this));
        bi(view);
        bk(view);
        ayw();
        a(requireActivity().getIntent(), false);
        this.cXG.register();
        com.iqoption.app.helpers.a.Gs().clear();
        com.iqoption.app.managers.a.e.Ig().clear();
        TabHelper.IM().a(this);
        this.cXH.aPe();
        this.cXL.aUT().observe(this, new -$$Lambda$ah$5U-3gbM-cfV-f08w-8BkCzl42Bc(this));
        if (com.iqoption.app.b.DG().Ej()) {
            this.cXL.aUU().observe(this, new -$$Lambda$ah$Dn0FzTxP1AF2vVRnncJzyHl-KfQ(this));
        }
    }

    private /* synthetic */ void n(Boolean bool) {
        this.cXu.fn(bool.booleanValue());
    }

    private /* synthetic */ void ayS() {
        TradeRoomActivity tradeRoomActivity = getTradeRoomActivity();
        if (tradeRoomActivity != null) {
            tradeRoomActivity.a(null, com.iqoption.analytics.a.aqy);
            com.iqoption.analytics.a.aqy = false;
        }
    }

    private void aT(@NonNull List<com.iqoption.core.microservices.billing.verification.response.c> list) {
        for (com.iqoption.core.microservices.billing.verification.response.c k : list) {
            k(k);
        }
    }

    private void k(@NonNull com.iqoption.core.microservices.billing.verification.response.c cVar) {
        String str;
        int i;
        String number = cVar.getNumber();
        number = number.substring(number.length() - 4);
        CardStatus Lq = cVar.Lq();
        int i2 = AnonymousClass8.cYd[Lq.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                number = getString(R.string.your_verification_request_for_the_card_n1_declined, number);
            } else if (i2 == 3) {
                number = getString(R.string.your_card_verification_has_failed);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected status for toast: ");
                stringBuilder.append(Lq);
                throw new IllegalStateException(stringBuilder.toString());
            }
            str = number;
            i = R.drawable.local_toast_type_indicator_red;
        } else {
            str = getString(R.string.your_card_n1_has_been_verified, number);
            i = R.drawable.local_toast_type_indicator_green;
        }
        this.cXA.a(i, cVar.getId(), str, (long) ToastEntity.TOAST_DURATION, new -$$Lambda$ah$4AYL1k235mPpc213g0MSn_j_exw(this, cVar)).aYa();
    }

    private void bk(View view) {
        this.cXB = (RightPanelFragment) getChildFragmentManager().findFragmentById(R.id.instrumentFragment);
        this.cXC = (TopPanelFragment) getChildFragmentManager().findFragmentById(R.id.topPanel);
        AnonymousClass1 anonymousClass1 = new com.iqoption.core.ext.g() {
            public void M(View view) {
                switch (view.getId()) {
                    case R.id.buttonAlert /*2131362101*/:
                        if (view.isSelected()) {
                            ah.this.cXM.aHK();
                            return;
                        } else {
                            ah.this.cXM.aHH();
                            return;
                        }
                    case R.id.buttonChartType /*2131362108*/:
                        ah.this.getFragmentManager().beginTransaction().add(R.id.fragment, e.axv(), e.TAG).addToBackStack(e.TAG).commit();
                        ah.this.cXR.setSelected(true);
                        return;
                    case R.id.buttonTools /*2131362123*/:
                        view.setSelected(true);
                        ah.this.cXL.fj(false);
                        com.iqoption.charttools.tools.e.aLA.PF();
                        return;
                    case R.id.infoActive /*2131362924*/:
                        com.iqoption.fragment.leftpanel.i.r(ah.this.requireActivity()).d(LeftPanelSection.ASSET_INFO);
                        com.iqoption.fragment.c.a.dgs.aCZ();
                        return;
                    default:
                        return;
                }
            }
        };
        View findViewById = view.findViewById(R.id.infoActive);
        if (com.iqoption.core.d.EH().ej("asset-info")) {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(anonymousClass1);
        } else {
            findViewById.setVisibility(8);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.buttonAlert);
        if (com.iqoption.core.d.EH().ej("price-alerts")) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(anonymousClass1);
            int a = com.iqoption.core.ext.a.a((Fragment) this, (int) R.color.white);
            int a2 = com.iqoption.core.ext.a.a((Fragment) this, (int) R.color.gold);
            Drawable drawable = imageView.getDrawable();
            imageView.setImageDrawable(null);
            c cVar = new c(drawable, a, a2);
            imageView.setImageDrawable(cVar);
            this.cXM.aHy().observe(this, new -$$Lambda$ah$r5TxX-dCrc_mYOQpHBbSng9NbuQ(cVar));
        } else {
            imageView.setVisibility(8);
        }
        this.cXM.aHz().observe(this, new -$$Lambda$ah$QHwrJ5tkxz9xsk5FlA99WlZkIWk(imageView));
        this.cXQ = view.findViewById(R.id.buttonTools);
        this.cXQ.setOnClickListener(anonymousClass1);
        this.cXR = (ChartTypeView) view.findViewById(R.id.buttonChartType);
        this.cXR.setOnClickListener(anonymousClass1);
        ayK();
    }

    public void fZ(int i) {
        if (System.currentTimeMillis() - this.cXS >= 1000 && this.cXA != null) {
            this.cXS = System.currentTimeMillis();
            TabHelper.i Jh = TabHelper.IM().Jh();
            if (Jh != null) {
                String string = getString(Jh.JF().chartType == 3 ? R.string.bars : R.string.candles);
                final Builder Builder = Event.Builder(Event.CATEGORY_POPUP_SERVED, "traderoom_unable-to-scale");
                this.cXA.a(R.drawable.local_toast_type_indicator_red, 2131886398, getString(R.string.cannot_show_selected_scale_for_current_size, TimeUtil.formatElapsedTime((long) i), string), (long) ToastEntity.TOAST_DURATION, new com.iqoption.a.b.a() {
                    public void onItemClick(View view, int i) {
                        EventManager.BS().a(Builder.calcDuration().setValue(Double.valueOf((double) i)).build());
                    }
                }).aYa();
            }
        }
    }

    public void ayu() {
        this.cXA.a((int) R.drawable.local_toast_type_indicator_green, 2131889055, getString(R.string.your_email_address_has_been_linked_to_the_account), getString(R.string.security_settings), 30000).aYa();
    }

    public void ayv() {
        TabHelper.i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            TabHelper.j JF = Jh.JF();
            this.cXR.aF(JF.chartType, JF.candleSize);
            this.cXR.setIsShowDot(JF.awI);
        }
    }

    private void ayw() {
        String Ff = com.iqoption.app.d.aP(getActivity()).Ff();
        String Fg = com.iqoption.app.d.aP(getActivity()).Fg();
        if (!TextUtils.isEmpty(Fg) || !TextUtils.isEmpty(Ff)) {
            new com.iqoption.dialog.g(getTradeRoomActivity(), Fg, Ff).show();
        }
    }

    private void bi(View view) {
        GLChartSurfaceView gLChartSurfaceView = (GLChartSurfaceView) view.findViewById(R.id.glGraphView);
        getLifecycle().addObserver(new GLChartSurfaceLifecycleObserver(gLChartSurfaceView));
        this.cXT = new com.iqoption.gl.b(requireContext(), com.iqoption.gl.c.aIy());
        gLChartSurfaceView.setController(this.cXT);
        this.cXu = (MultiAssetSpinner) view.findViewById(R.id.multiAssetSpinner);
        this.cXz = (ViewGroup) view.findViewById(R.id.balanceCell);
        this.cXz.setLayoutTransition(ak.anP());
        this.cXz.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                com.iqoption.app.b aK = com.iqoption.app.b.aK(ah.this.getActivity());
                if (aK.DL() == null || aK.DL().size() == 0) {
                    ah.this.cXL.a(new -$$Lambda$ah$3$3zJWDv3OMPZJPAUwaOwb5zNqdc8(this, view));
                    return;
                }
                String str = "BalanceFragment";
                if (ah.this.cXz.isSelected()) {
                    ah.this.cXz.setSelected(false);
                    c cVar = (c) ah.this.getFragmentManager().findFragmentByTag(str);
                    if (cVar != null) {
                        cVar.onBackPressed();
                    }
                } else {
                    ah.this.cXz.setSelected(true);
                    ah.this.getFragmentManager().beginTransaction().add(R.id.fragment, c.fR(0), str).addToBackStack(str).commitAllowingStateLoss();
                }
                ah.this.cXy.animate().rotation(270.0f).setInterpolator(com.iqoption.view.a.a.c.egR).start();
            }

            private /* synthetic */ void bl(View view) {
                ah.this.axs();
                M(view);
            }
        });
        this.cXv = view.findViewById(R.id.badConnection);
        this.alQ = (TextView) view.findViewById(R.id.totalBalance);
        this.cXy = (ImageView) view.findViewById(R.id.arrow_balance);
        this.cXw = (AmountView) view.findViewById(R.id.balance);
        this.cXx = view.findViewById(R.id.balanceAuthIcon);
        this.bYh = (TextView) view.findViewById(R.id.deposit);
        this.bYh.setOnTouchListener(new com.iqoption.view.d.d());
        this.bYh.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                boolean Ej = com.iqoption.app.b.DG().Ej();
                String str = Event.CATEGORY_BUTTON_PRESSED;
                if (Ej) {
                    com.iqoption.analytics.a.aqy = true;
                    com.iqoption.welcomeonboarding.a.d(ah.this.getFragmentManager());
                    EventManager.BS().a(Event.Builder(str, "traderoom_open-account").build());
                    return;
                }
                ah.this.getTradeRoomActivity().Ao();
                EventManager.BS().a(Event.Builder(str, "traderoom_deposit").build());
            }
        });
        this.cXA = (LocalToast) view.findViewById(R.id.localToast);
        ds(false);
    }

    public void onNewIntent(Intent intent) {
        a(intent, false);
    }

    private void a(Intent intent, boolean z) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && !s(intent)) {
                a(extras, z);
                r(intent);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0220 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c6 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a4 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a A:{SYNTHETIC, Splitter:B:80:0x011a} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0220 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c6 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a4 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a A:{SYNTHETIC, Splitter:B:80:0x011a} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0220 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c6 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a4 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a A:{SYNTHETIC, Splitter:B:80:0x011a} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0220 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c6 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a4 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a A:{SYNTHETIC, Splitter:B:80:0x011a} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0220 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c6 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a4 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a A:{SYNTHETIC, Splitter:B:80:0x011a} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0220 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c6 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a4 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a A:{SYNTHETIC, Splitter:B:80:0x011a} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0220 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c6 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a4 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a A:{SYNTHETIC, Splitter:B:80:0x011a} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0220 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c6 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a4 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a A:{SYNTHETIC, Splitter:B:80:0x011a} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0220 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020c A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c6 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a4 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A:{Catch:{ Exception -> 0x02ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a A:{SYNTHETIC, Splitter:B:80:0x011a} */
    /* JADX WARNING: Missing block: B:76:0x010e, code skipped:
            if (r2.equals("1") != false) goto L_0x0112;
     */
    public void a(android.os.Bundle r13, boolean r14) {
        /*
        r12 = this;
        r0 = 0;
        r12.cXK = r0;
        if (r13 == 0) goto L_0x02ed;
    L_0x0005:
        r1 = r12.isAdded();
        if (r1 != 0) goto L_0x000d;
    L_0x000b:
        goto L_0x02ed;
    L_0x000d:
        r1 = "push_id";
        r1 = r13.getString(r1);	 Catch:{ Exception -> 0x02ed }
        r2 = "token_id";
        r2 = r13.getString(r2);	 Catch:{ Exception -> 0x02ed }
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ Exception -> 0x02ed }
        r4 = 0;
        if (r3 != 0) goto L_0x0037;
    L_0x0021:
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Exception -> 0x02ed }
        if (r3 != 0) goto L_0x0037;
    L_0x0027:
        r2 = com.google.common.primitives.Longs.bX(r2);	 Catch:{ Exception -> 0x02ed }
        r1 = com.google.common.primitives.Longs.bX(r1);	 Catch:{ Exception -> 0x02ed }
        if (r1 == 0) goto L_0x0038;
    L_0x0031:
        if (r2 == 0) goto L_0x0038;
    L_0x0033:
        com.iqoption.mobbtech.connect.request.api.e.a(r1, r2);	 Catch:{ Exception -> 0x02ed }
        goto L_0x0038;
    L_0x0037:
        r1 = r4;
    L_0x0038:
        r2 = "type";
        r2 = r13.getString(r2);	 Catch:{ Exception -> 0x02ed }
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Exception -> 0x02ed }
        if (r3 == 0) goto L_0x0046;
    L_0x0045:
        return;
    L_0x0046:
        r3 = "o_type";
        r3 = r13.getString(r3);	 Catch:{ Exception -> 0x02ed }
        r5 = "a_id";
        r5 = r13.getString(r5);	 Catch:{ Exception -> 0x02ed }
        r6 = com.iqoption.app.managers.feature.c.Iw();	 Catch:{ Exception -> 0x02ed }
        r7 = -1;
        r8 = r2.hashCode();	 Catch:{ Exception -> 0x02ed }
        r9 = 49;
        if (r8 == r9) goto L_0x0108;
    L_0x005f:
        r0 = 50;
        if (r8 == r0) goto L_0x00fe;
    L_0x0063:
        r0 = 1605; // 0x645 float:2.249E-42 double:7.93E-321;
        if (r8 == r0) goto L_0x00f4;
    L_0x0067:
        r0 = 1660; // 0x67c float:2.326E-42 double:8.2E-321;
        if (r8 == r0) goto L_0x00ea;
    L_0x006b:
        r0 = 1667; // 0x683 float:2.336E-42 double:8.236E-321;
        if (r8 == r0) goto L_0x00e0;
    L_0x006f:
        r0 = 1691; // 0x69b float:2.37E-42 double:8.355E-321;
        if (r8 == r0) goto L_0x00d6;
    L_0x0073:
        r0 = 1664; // 0x680 float:2.332E-42 double:8.22E-321;
        if (r8 == r0) goto L_0x00cb;
    L_0x0077:
        r0 = 1665; // 0x681 float:2.333E-42 double:8.226E-321;
        if (r8 == r0) goto L_0x00c0;
    L_0x007b:
        r0 = 1694; // 0x69e float:2.374E-42 double:8.37E-321;
        if (r8 == r0) goto L_0x00b5;
    L_0x007f:
        r0 = 1695; // 0x69f float:2.375E-42 double:8.374E-321;
        if (r8 == r0) goto L_0x00aa;
    L_0x0083:
        switch(r8) {
            case 1601: goto L_0x009e;
            case 1602: goto L_0x0093;
            case 1603: goto L_0x0088;
            default: goto L_0x0086;
        };	 Catch:{ Exception -> 0x02ed }
    L_0x0086:
        goto L_0x0111;
    L_0x0088:
        r0 = "25";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x0090:
        r0 = 3;
        goto L_0x0112;
    L_0x0093:
        r0 = "24";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x009b:
        r0 = 2;
        goto L_0x0112;
    L_0x009e:
        r0 = "23";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x00a6:
        r0 = 10;
        goto L_0x0112;
    L_0x00aa:
        r0 = "54";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x00b2:
        r0 = 12;
        goto L_0x0112;
    L_0x00b5:
        r0 = "53";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x00bd:
        r0 = 11;
        goto L_0x0112;
    L_0x00c0:
        r0 = "45";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x00c8:
        r0 = 9;
        goto L_0x0112;
    L_0x00cb:
        r0 = "44";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x00d3:
        r0 = 8;
        goto L_0x0112;
    L_0x00d6:
        r0 = "50";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x00de:
        r0 = 6;
        goto L_0x0112;
    L_0x00e0:
        r0 = "47";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x00e8:
        r0 = 4;
        goto L_0x0112;
    L_0x00ea:
        r0 = "40";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x00f2:
        r0 = 7;
        goto L_0x0112;
    L_0x00f4:
        r0 = "27";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x00fc:
        r0 = 5;
        goto L_0x0112;
    L_0x00fe:
        r0 = "2";
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x0111;
    L_0x0106:
        r0 = 1;
        goto L_0x0112;
    L_0x0108:
        r8 = "1";
        r8 = r2.equals(r8);	 Catch:{ Exception -> 0x02ed }
        if (r8 == 0) goto L_0x0111;
    L_0x0110:
        goto L_0x0112;
    L_0x0111:
        r0 = -1;
    L_0x0112:
        r7 = "text";
        switch(r0) {
            case 0: goto L_0x026b;
            case 1: goto L_0x026b;
            case 2: goto L_0x023e;
            case 3: goto L_0x022c;
            case 4: goto L_0x0220;
            case 5: goto L_0x020c;
            case 6: goto L_0x0202;
            case 7: goto L_0x0202;
            case 8: goto L_0x01d5;
            case 9: goto L_0x01c6;
            case 10: goto L_0x01a4;
            case 11: goto L_0x0187;
            case 12: goto L_0x011a;
            default: goto L_0x0118;
        };
    L_0x0118:
        goto L_0x0299;
    L_0x011a:
        r0 = "asset_id";
        r0 = r13.getString(r0);	 Catch:{ Exception -> 0x02ed }
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x02ed }
        if (r1 != 0) goto L_0x012f;
    L_0x0126:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Exception -> 0x02ed }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Exception -> 0x02ed }
        goto L_0x0130;
    L_0x012f:
        r0 = r4;
    L_0x0130:
        r1 = "instrument_type";
        r1 = r13.getString(r1);	 Catch:{ Exception -> 0x02ed }
        r7 = com.iqoption.core.data.model.InstrumentType.fromServerValue(r1);	 Catch:{ Exception -> 0x02ed }
        r1 = "timestamp";
        r1 = r13.getString(r1);	 Catch:{ Exception -> 0x02ed }
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ Exception -> 0x02ed }
        if (r2 != 0) goto L_0x0150;
    L_0x0147:
        r1 = java.lang.Long.parseLong(r1);	 Catch:{ Exception -> 0x02ed }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ Exception -> 0x02ed }
        goto L_0x0151;
    L_0x0150:
        r1 = r4;
    L_0x0151:
        r2 = "value";
        r13 = r13.getString(r2);	 Catch:{ Exception -> 0x02ed }
        r2 = android.text.TextUtils.isEmpty(r13);	 Catch:{ Exception -> 0x02ed }
        if (r2 != 0) goto L_0x0166;
    L_0x015e:
        r2 = java.lang.Double.parseDouble(r13);	 Catch:{ Exception -> 0x02ed }
        r4 = java.lang.Double.valueOf(r2);	 Catch:{ Exception -> 0x02ed }
    L_0x0166:
        if (r0 == 0) goto L_0x02ed;
    L_0x0168:
        if (r1 == 0) goto L_0x02ed;
    L_0x016a:
        if (r4 == 0) goto L_0x02ed;
    L_0x016c:
        if (r14 != 0) goto L_0x02ed;
    L_0x016e:
        r13 = r12.requireActivity();	 Catch:{ Exception -> 0x02ed }
        r5 = com.iqoption.fragment.rightpanel.n.s(r13);	 Catch:{ Exception -> 0x02ed }
        r6 = r0.intValue();	 Catch:{ Exception -> 0x02ed }
        r8 = r4.doubleValue();	 Catch:{ Exception -> 0x02ed }
        r10 = r1.longValue();	 Catch:{ Exception -> 0x02ed }
        r5.a(r6, r7, r8, r10);	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x0187:
        r0 = r13.getString(r7);	 Catch:{ Exception -> 0x02ed }
        r1 = "payment_method_id";
        r13 = r13.getString(r1);	 Catch:{ Exception -> 0x02ed }
        r1 = android.text.TextUtils.isEmpty(r13);	 Catch:{ Exception -> 0x02ed }
        if (r1 != 0) goto L_0x019f;
    L_0x0197:
        r1 = java.lang.Long.parseLong(r13);	 Catch:{ Exception -> 0x02ed }
        r4 = java.lang.Long.valueOf(r1);	 Catch:{ Exception -> 0x02ed }
    L_0x019f:
        r12.a(r0, r4, r14);	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x01a4:
        r13 = android.text.TextUtils.isEmpty(r5);	 Catch:{ Exception -> 0x02ed }
        if (r13 != 0) goto L_0x02ed;
    L_0x01aa:
        r13 = android.text.TextUtils.isEmpty(r3);	 Catch:{ Exception -> 0x02ed }
        if (r13 != 0) goto L_0x02ed;
    L_0x01b0:
        r13 = java.lang.Integer.parseInt(r5);	 Catch:{ Exception -> 0x02ed }
        r14 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x02ed }
        r14 = com.iqoption.core.microservices.tradingengine.response.active.a.eZ(r14);	 Catch:{ Exception -> 0x02ed }
        r0 = new com.iqoption.fragment.ah$b;	 Catch:{ Exception -> 0x02ed }
        r0.<init>(r12, r14, r13);	 Catch:{ Exception -> 0x02ed }
        r12.a(r0);	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x01c6:
        r0 = "invitation_type";
        r0 = r13.getString(r0);	 Catch:{ Exception -> 0x02ed }
        r13 = r13.getString(r7);	 Catch:{ Exception -> 0x02ed }
        r12.f(r0, r13, r14);	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x01d5:
        r0 = "id";
        r0 = r13.getString(r0);	 Catch:{ Exception -> 0x02ed }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ Exception -> 0x02ed }
        r0 = "card_number";
        r4 = r13.getString(r0);	 Catch:{ Exception -> 0x02ed }
        r0 = "expired";
        r5 = r13.getString(r0);	 Catch:{ Exception -> 0x02ed }
        r0 = "status";
        r13 = r13.getString(r0);	 Catch:{ Exception -> 0x02ed }
        r6 = com.iqoption.core.microservices.billing.verification.response.CardStatus.fromServerValue(r13);	 Catch:{ Exception -> 0x02ed }
        r13 = new com.iqoption.core.microservices.billing.verification.response.c;	 Catch:{ Exception -> 0x02ed }
        r7 = 0;
        r1 = r13;
        r1.<init>(r2, r4, r5, r6, r7);	 Catch:{ Exception -> 0x02ed }
        r12.c(r13, r14);	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x0202:
        r14 = new com.iqoption.fragment.ah$b;	 Catch:{ Exception -> 0x02ed }
        r14.<init>(r12, r13);	 Catch:{ Exception -> 0x02ed }
        r12.a(r14);	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x020c:
        r13 = "margin-add-on";
        r13 = r6.ej(r13);	 Catch:{ Exception -> 0x02ed }
        if (r13 == 0) goto L_0x02ed;
    L_0x0214:
        r13 = r12.getFragmentManager();	 Catch:{ Exception -> 0x02ed }
        r14 = 2131362798; // 0x7f0a03ee float:1.8345387E38 double:1.0530331373E-314;
        com.iqoption.fragment.s.a(r13, r14);	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x0220:
        r14 = r12.cXI;	 Catch:{ Exception -> 0x02ed }
        r0 = new com.iqoption.fragment.ah$b;	 Catch:{ Exception -> 0x02ed }
        r0.<init>(r12, r13);	 Catch:{ Exception -> 0x02ed }
        com.iqoption.util.v.a(r14, r0);	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x022c:
        r14 = "pending-order";
        r14 = r6.ej(r14);	 Catch:{ Exception -> 0x02ed }
        if (r14 == 0) goto L_0x02ed;
    L_0x0234:
        r14 = new com.iqoption.fragment.ah$b;	 Catch:{ Exception -> 0x02ed }
        r14.<init>(r12, r13);	 Catch:{ Exception -> 0x02ed }
        r12.a(r14);	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x023e:
        r14 = "otn-token";
        r14 = r6.ep(r14);	 Catch:{ Exception -> 0x02ed }
        if (r14 == 0) goto L_0x02ed;
    L_0x0246:
        r14 = "count";
        r14 = r13.getString(r14);	 Catch:{ Exception -> 0x02ed }
        r1 = com.iqoption.dto.event.OtnEmissionExecuted.parseCount(r14);	 Catch:{ Exception -> 0x02ed }
        r14 = "commission_volume_enrolled";
        r14 = r13.getString(r14);	 Catch:{ Exception -> 0x02ed }
        r3 = java.lang.Double.parseDouble(r14);	 Catch:{ Exception -> 0x02ed }
        r14 = "total_commissions_enrolled";
        r13 = r13.getString(r14);	 Catch:{ Exception -> 0x02ed }
        r5 = java.lang.Double.parseDouble(r13);	 Catch:{ Exception -> 0x02ed }
        r0 = r12;
        r0.h(r1, r3, r5);	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x026b:
        r14 = "positions";
        r13 = r13.getString(r14);	 Catch:{ Exception -> 0x02ed }
        r14 = android.text.TextUtils.isEmpty(r13);	 Catch:{ Exception -> 0x02ed }
        if (r14 != 0) goto L_0x02ed;
    L_0x0277:
        r14 = android.text.TextUtils.isEmpty(r3);	 Catch:{ Exception -> 0x02ed }
        if (r14 != 0) goto L_0x02ed;
    L_0x027d:
        r14 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x02ed }
        r14 = com.iqoption.core.microservices.tradingengine.response.active.a.eZ(r14);	 Catch:{ Exception -> 0x02ed }
        r0 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x02ed }
        r1 = long[].class;
        r13 = r0.fromJson(r13, r1);	 Catch:{ Exception -> 0x02ed }
        r13 = (long[]) r13;	 Catch:{ Exception -> 0x02ed }
        r0 = new androidx.core.util.Pair;	 Catch:{ Exception -> 0x02ed }
        r0.<init>(r14, r13);	 Catch:{ Exception -> 0x02ed }
        r12.cXV = r0;	 Catch:{ Exception -> 0x02ed }
        goto L_0x02ed;
    L_0x0299:
        r13 = r13.getString(r7);	 Catch:{ Exception -> 0x02ed }
        r14 = android.text.TextUtils.isEmpty(r13);	 Catch:{ Exception -> 0x02ed }
        if (r14 != 0) goto L_0x02ed;
    L_0x02a3:
        r6 = 2131888082; // 0x7f1207d2 float:1.941079E38 double:1.053292662E-314;
        r14 = android.text.TextUtils.isEmpty(r5);	 Catch:{ Exception -> 0x02ed }
        if (r14 != 0) goto L_0x02d6;
    L_0x02ac:
        r14 = android.text.TextUtils.isEmpty(r3);	 Catch:{ Exception -> 0x02ed }
        if (r14 != 0) goto L_0x02d6;
    L_0x02b2:
        r14 = java.lang.Integer.parseInt(r5);	 Catch:{ Exception -> 0x02ed }
        r0 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x02ed }
        r0 = com.iqoption.core.microservices.tradingengine.response.active.a.eZ(r0);	 Catch:{ Exception -> 0x02ed }
        if (r0 != 0) goto L_0x02c8;
    L_0x02c0:
        r0 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x02ed }
        r0 = r0.dW(r14);	 Catch:{ Exception -> 0x02ed }
    L_0x02c8:
        r3 = new com.iqoption.fragment.f;	 Catch:{ Exception -> 0x02ed }
        r3.<init>(r14, r0, r1, r2);	 Catch:{ Exception -> 0x02ed }
        r12.cXN = r3;	 Catch:{ Exception -> 0x02ed }
        r14 = 2131887824; // 0x7f1206d0 float:1.9410266E38 double:1.0532925346E-314;
        r4 = r12.getString(r14);	 Catch:{ Exception -> 0x02ed }
    L_0x02d6:
        r14 = r4;
        r0 = r12.cXA;	 Catch:{ Exception -> 0x02ed }
        if (r0 == 0) goto L_0x02ed;
    L_0x02db:
        r1 = r12.cXA;	 Catch:{ Exception -> 0x02ed }
        r2 = 2131231851; // 0x7f08046b float:1.8079795E38 double:1.052968441E-314;
        r8 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r3 = r6;
        r5 = r13;
        r6 = r14;
        r7 = r8;
        r13 = r1.a(r2, r3, r5, r6, r7);	 Catch:{ Exception -> 0x02ed }
        r13.aYa();	 Catch:{ Exception -> 0x02ed }
    L_0x02ed:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.ah.a(android.os.Bundle, boolean):void");
    }

    private void r(@Nullable Intent intent) {
        try {
            Uri h = com.iqoption.b.a.h(getContext(), intent);
            if (h != null && h.getHost() != null) {
                String host = h.getHost();
                Object obj = -1;
                if (host.hashCode() == 1548165862) {
                    if (host.equals("openasset")) {
                        obj = null;
                    }
                }
                if (obj == null) {
                    host = h.getQueryParameter("asset");
                    String queryParameter = h.getQueryParameter("type");
                    if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(queryParameter)) {
                        a(new b(this, InstrumentType.fromServerValue(queryParameter), Integer.parseInt(host)));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private void a(@NonNull b bVar) {
        this.cXK = true;
        v.a(this.cXI, (o) bVar);
    }

    private boolean s(Intent intent) {
        if (isAdded() && intent != null) {
            String str = "signal";
            if (intent.hasExtra(str)) {
                final SignalLegacy fromJson = SignalLegacy.fromJson(intent.getStringExtra(str));
                if (fromJson != null) {
                    com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
                        public void run() {
                            if (ah.this.isAdded() && ah.this.getView() != null) {
                                com.iqoption.a.e.a(fromJson, ah.this.getView());
                            }
                        }
                    }, 3000);
                    intent.removeExtra(str);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ayx() {
        return this.cXP;
    }

    public double ZC() {
        return this.cXB.ZC();
    }

    public void ayy() {
        com.iqoption.util.j.aWJ();
    }

    public void ayz() {
        ayy();
    }

    public void ih(String str) {
        AmountView amountView = this.cXw;
        if (amountView != null) {
            amountView.setText(str);
        }
    }

    public void ga(@ColorRes int i) {
        if (this.cXw != null) {
            i = com.iqoption.core.ext.a.a((Fragment) this, i);
            this.cXw.setTextColor(i);
            this.alQ.setTextColor(i);
        }
    }

    private void a(com.iqoption.app.managers.c.h hVar) {
        if (this.alQ != null) {
            this.alQ.setText(com.iqoption.util.j.q(Double.valueOf(com.iqoption.app.b.aK(getContext()).DI().doubleValue() + hVar.Hq())));
        }
    }

    public void axs() {
        if (isAdded()) {
            com.iqoption.app.b DG = com.iqoption.app.b.DG();
            ih(DG.DK());
            a(com.iqoption.app.managers.c.GS().Hf());
            b(DG);
            a(DG);
            if (this.cXx != null) {
                Balance DN = DG.DN();
                Double valueOf = Double.valueOf(0.0d);
                if (DN != null) {
                    valueOf = DN.getAuthAmount();
                }
                if (valueOf == null || valueOf.doubleValue() <= 0.0d) {
                    this.cXx.setVisibility(8);
                } else {
                    this.cXx.setVisibility(0);
                }
            }
        }
    }

    private void a(com.iqoption.app.b bVar) {
        com.iqoption.dialog.e.a(requireActivity(), requireFragmentManager(), bVar);
    }

    private void b(com.iqoption.app.b bVar) {
        com.iqoption.app.d Fa = com.iqoption.app.d.Fa();
        if (!Fa.Fx()) {
            if ((bVar.Ej() || bVar.DJ() == 4) && bVar.DI().doubleValue() >= 40000.0d) {
                IQApp.a("achieve_40000", null);
                Fa.aY(true);
            }
        }
    }

    public void ds(boolean z) {
        if (isAdded()) {
            com.iqoption.app.b aK = com.iqoption.app.b.aK(getActivity());
            if (aK.Ej()) {
                this.bYh.setText(getString(R.string.deposit_with_real_money));
                ga(R.color.selectable_orange_100_to_75);
            } else {
                SpannableString spannableString;
                this.bYh.setTextColor(ContextCompat.getColor(requireContext(), R.color.green));
                TextView textView = this.bYh;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("+ ");
                stringBuilder.append(getString(R.string.deposit));
                textView.setText(stringBuilder.toString());
                String string;
                if (aK.DJ() == 2) {
                    ga(R.color.selectable_purple_100_to_75);
                    string = getString(R.string.your_balance_type_has_been_changed_to, getString(R.string.tournament_balance));
                    spannableString = new SpannableString(string);
                    spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.purple)), string.indexOf(r0), string.length(), 33);
                } else if (aK.DJ() == 4) {
                    ga(R.color.selectable_orange_100_to_75);
                    string = getString(R.string.your_balance_type_has_been_changed_to, getString(R.string.practice_balance));
                    spannableString = new SpannableString(string);
                    spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.orange)), string.indexOf(r0), string.length(), 33);
                } else {
                    ga(R.color.selectable_green_100_to_75);
                    string = getString(R.string.your_balance_type_has_been_changed_to, getString(R.string.real_balance));
                    spannableString = new SpannableString(string);
                    spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.green)), string.indexOf(r0), string.length(), 33);
                }
                SpannableString spannableString2 = spannableString;
                if (z) {
                    this.cXA.a((int) R.drawable.local_toast_type_indicator_grey, 2131889038, spannableString2, (long) ToastEntity.TOAST_DURATION).aYa();
                }
            }
        }
    }

    public void ayA() {
        if (com.iqoption.app.managers.l.HZ().Ic()) {
            if (com.iqoption.app.managers.l.HZ().Id()) {
                if (this.cXv.getVisibility() == 8 && !Network.ebO.aWS()) {
                    this.cXv.setVisibility(0);
                    this.cXW = Event.Builder(Event.CATEGORY_POPUP_SERVED, "internet-connection-lost");
                }
            } else if (this.cXv.getVisibility() == 0) {
                this.cXv.setVisibility(8);
                if (this.cXW != null) {
                    EventManager.BS().a(this.cXW.calcDuration().setTechnicalLogs(Boolean.valueOf(true)).build());
                }
            }
        }
    }

    private void auo() {
        com.iqoption.view.a.b.aYv().a(this.cXX, Integer.valueOf(5));
    }

    private void aup() {
        com.iqoption.view.a.b.aYv().b(this.cXX);
    }

    private void bE(long j) {
        if (isAdded() && com.iqoption.app.helpers.a.Gs().GG()) {
            ayA();
        }
    }

    public void ayB() {
        com.iqoption.fragment.tradingtoday.e.dqJ.b(R.id.underLeftFragmentContainer, requireFragmentManager());
    }

    private void ayC() {
        if (com.iqoption.app.d.Fa().Fh() == 1 && 17 == Platform.ANDROID.getId()) {
            com.iqoption.dialog.d.a(requireActivity(), requireFragmentManager());
        }
    }

    public void onPause() {
        super.onPause();
        this.cXt.clear();
        aup();
        LocalBroadcastManager.getInstance(requireActivity()).unregisterReceiver(this.cXU);
    }

    public void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.iqoption.push.broadcast.event");
        LocalBroadcastManager.getInstance(requireActivity()).registerReceiver(this.cXU, intentFilter);
        Tracker aO = IQApp.aO(getContext());
        aO.setScreenName("Traderoom");
        aO.send(((ScreenViewBuilder) new ScreenViewBuilder().setCustomDimension(2, aO.get("&cid"))).build());
        s(requireActivity().getIntent());
        auo();
        ayG();
    }

    @Nullable
    public com.iqoption.core.microservices.kyc.response.restriction.b dt(boolean z) {
        Balance DN = com.iqoption.app.b.DG().DN();
        if (!z || (DN != null && DN.type == 1)) {
            return this.cXL.aUV();
        }
        return null;
    }

    private void ayD() {
        final LiveData aUW = this.cXL.aUW();
        aUW.observe(this, new Observer<List<com.iqoption.core.microservices.kyc.response.requirement.a>>() {
            /* renamed from: u */
            public void onChanged(List<com.iqoption.core.microservices.kyc.response.requirement.a> list) {
                FragmentActivity activity = ah.this.getActivity();
                FragmentManager fragmentManager = ah.this.getFragmentManager();
                if (!(activity == null || fragmentManager == null || list.isEmpty())) {
                    com.iqoption.fragment.restriction.a.a.dkF.b(activity, fragmentManager, R.id.fragment).ae(ah.this).aZ(list).show();
                }
                aUW.removeObserver(this);
            }
        });
    }

    public void d(@Nullable KycStepType kycStepType) {
        com.iqoption.kyc.e eVar = new com.iqoption.kyc.e();
        eVar.aIK();
        eVar.f(kycStepType);
        eVar.bA(getActivity());
    }

    public void onStart() {
        super.onStart();
        if (TabHelper.IM().isInitialized() && !this.cXP) {
            ayF();
        }
        this.cXF.register();
        if (this.cXJ) {
            this.cXJ = false;
            this.cXH.aPe();
        }
        axs();
        com.iqoption.fragment.leftmenu.e.aEi().onStart();
    }

    public void onStop() {
        super.onStop();
        this.cXF.unregister();
        com.iqoption.fragment.leftmenu.e.aEi().onStop();
    }

    public void onDestroyView() {
        super.onDestroyView();
        TabHelper.IM().onStop();
        com.iqoption.app.managers.a.GM().clear();
        this.cXG.unregister();
        this.cXF.unregister();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(@Nullable FragmentManager fragmentManager) {
        FragmentManager fragmentManager2 = getFragmentManager();
        if (fragmentManager2 == null || fragmentManager2.getBackStackEntryCount() <= 0) {
            return super.a(fragmentManager);
        }
        Fragment findFragmentByTag = fragmentManager2.findFragmentByTag(fragmentManager2.getBackStackEntryAt(fragmentManager2.getBackStackEntryCount() - 1).getName());
        if (!(((findFragmentByTag instanceof com.iqoption.fragment.b.d) && ((com.iqoption.fragment.b.d) findFragmentByTag).onBackPressed()) || fragmentManager2.isStateSaved() || fragmentManager2.isDestroyed())) {
            fragmentManager2.popBackStack();
        }
        return true;
    }

    private void c(@NonNull com.iqoption.core.microservices.billing.verification.response.c cVar, boolean z) {
        a(this.cXL.h(io.reactivex.e.cD(Collections.singletonList(cVar))).a(new -$$Lambda$ah$6vN8EMNzJzaemRjBvmppzgrPMRc(this, z), -$$Lambda$ah$tQ2QL8esSmUZN6w0zY7RFxVZ4p8.INSTANCE));
    }

    private void ayE() {
        a(this.cXL.aUP().a(new -$$Lambda$ah$jrrYY4Td7ff0HU6_jDJUkJfE6mY(this), -$$Lambda$ah$revT10rumyfFa8mK9PIEWrMakfQ.INSTANCE));
    }

    private void f(String str, String str2, boolean z) {
        if (z) {
            this.cXA.a((int) R.drawable.local_toast_type_indicator_green, -1, str2, 30000, new -$$Lambda$ah$qfT57bsz6sys1nc2TnfRoth1FkQ(this, str)).aYa();
            return;
        }
        ii(str);
    }

    private void a(String str, @Nullable Long l, boolean z) {
        if (z) {
            this.cXA.a((int) R.drawable.local_toast_type_indicator_green, -1, str, 30000, new -$$Lambda$ah$RPRY1wWTCIwugjJxNTM-jyikGcY(this, l)).aYa();
            return;
        }
        getTradeRoomActivity().a(l, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    private void ii(java.lang.String r6) {
        /*
        r5 = this;
        r0 = r5.getActivity();
        r1 = r6.hashCode();
        r2 = -268371060; // 0xfffffffff000fb8c float:-1.5967273E29 double:NaN;
        r3 = 2;
        r4 = 1;
        if (r1 == r2) goto L_0x002e;
    L_0x000f:
        r2 = 200040924; // 0xbec61dc float:9.1051136E-32 double:9.88333483E-316;
        if (r1 == r2) goto L_0x0024;
    L_0x0014:
        r2 = 354422628; // 0x15200f64 float:3.2323884E-26 double:1.751080446E-315;
        if (r1 == r2) goto L_0x001a;
    L_0x0019:
        goto L_0x0038;
    L_0x001a:
        r1 = "selected-reminder";
        r6 = r6.equals(r1);
        if (r6 == 0) goto L_0x0038;
    L_0x0022:
        r6 = 1;
        goto L_0x0039;
    L_0x0024:
        r1 = "pro-benefits";
        r6 = r6.equals(r1);
        if (r6 == 0) goto L_0x0038;
    L_0x002c:
        r6 = 0;
        goto L_0x0039;
    L_0x002e:
        r1 = "protrader_application";
        r6 = r6.equals(r1);
        if (r6 == 0) goto L_0x0038;
    L_0x0036:
        r6 = 2;
        goto L_0x0039;
    L_0x0038:
        r6 = -1;
    L_0x0039:
        if (r6 == 0) goto L_0x004a;
    L_0x003b:
        if (r6 == r4) goto L_0x0046;
    L_0x003d:
        if (r6 == r3) goto L_0x0040;
    L_0x003f:
        goto L_0x004d;
    L_0x0040:
        r6 = com.iqoption.protrader.web.ProTraderWebType.APPLY;
        com.iqoption.protrader.web.ProTraderWebActivity.a(r0, r6);
        goto L_0x004d;
    L_0x0046:
        com.iqoption.protrader.dialog.d.C(r0);
        goto L_0x004d;
    L_0x004a:
        com.iqoption.protrader.dialog.a.C(r0);
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.ah.ii(java.lang.String):void");
    }

    private void a(@NonNull TradeRoomActivity tradeRoomActivity, @NonNull com.iqoption.core.microservices.busapi.response.b bVar) {
        if (com.iqoption.gdpr.a.bz(getContext()) && bVar.abv() == null) {
            com.iqoption.gdpr.c.p(tradeRoomActivity);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        getTradeRoomActivity().onActivityResult(i, i2, intent);
    }

    private void ayF() {
        if (isAdded()) {
            this.cXP = true;
            ayy();
            axs();
            ds(false);
            ayv();
            com.iqoption.fragment.leftmenu.e.aEi().aEk();
            com.iqoption.app.managers.k.aR(getContext());
            if (ayI()) {
                com.iqoption.core.c.a.biN.postDelayed(new -$$Lambda$ah$23OdUqe5P1i1MXUkE1sX3V5t4yQ(new WeakReference(getTradeRoomActivity())), 1000);
            } else {
                getTradeRoomActivity().Ar();
            }
            if (com.iqoption.app.managers.feature.c.Iw().ej("platform-troubles")) {
                i.akj().m(new -$$Lambda$ah$9DPQINZDqQLjW_vTVnF5MgObg1M(this));
            } else {
                ayB();
                a(getTradeRoomActivity(), com.iqoption.app.b.aK(getContext()).Ed());
                ayE();
                if (!(com.iqoption.core.features.instrument.b.Xt() || com.iqoption.app.d.Fa().FZ())) {
                    com.iqoption.fragment.dialog.f.d(requireActivity(), requireActivity().getSupportFragmentManager());
                }
                com.iqoption.fragment.dialog.a.a.p(requireActivity());
                ayN();
                ayD();
                ayJ();
                ayC();
                com.iqoption.dialog.h.c(requireActivity(), requireFragmentManager());
                ayL();
                if (!com.iqoption.app.b.aK(getContext()).Ej()) {
                    ayG();
                    a(this.cXL.aUQ().a(new -$$Lambda$ah$yUlHvzP6EO82i64LjDMRfOiSGzY(this), -$$Lambda$ah$ToCghEyT-fdVGRdOqROQtUpxl0I.INSTANCE));
                }
            }
            ayH();
            com.iqoption.app.d.Fa().Fw();
            this.cXI.set(Boolean.valueOf(true));
        }
    }

    private /* synthetic */ void ayR() {
        com.iqoption.dialog.i.d(getFragmentManager());
    }

    private void ayG() {
        if (!com.iqoption.app.b.aK(getContext()).Ej() && com.iqoption.app.helpers.a.Gs().GG()) {
            this.cXt.e(this.cXL.aUO().a(new -$$Lambda$ah$SftugM-uDpuIyt74KTYbwsjswdA(this), -$$Lambda$ah$RvU4o5dAZuXhbbZICO9SD9BE-mo.INSTANCE));
        }
    }

    private void ayH() {
        r.E(requireActivity()).aUq().observe(this, new -$$Lambda$ah$yt1swT3Gw2nQIuPawn4-GYgBtxY(new AtomicLong()));
    }

    public boolean ayI() {
        if (this.cXK) {
            return false;
        }
        String str = "portfolio_check_background_time_on_start";
        long currentTimeMillis;
        if (com.iqoption.app.d.dX(str)) {
            currentTimeMillis = System.currentTimeMillis() - com.iqoption.app.d.getLong("finish_time");
            com.iqoption.app.d.i(str, false);
        } else {
            currentTimeMillis = 0;
        }
        String str2 = "portfolio_first_launch";
        String str3 = "portfolio_opened";
        if ((com.iqoption.app.d.get(str2, true) || com.iqoption.app.d.get(str3, false) || currentTimeMillis > com.iqoption.portfolio.f.dLm) && !com.iqoption.app.managers.c.GS().GV()) {
            com.iqoption.portfolio.fragment.k.c(getTradeRoomActivity());
            com.iqoption.app.d.i(str2, false);
            return true;
        }
        com.iqoption.app.d.i(str3, false);
        com.iqoption.app.d.i(str2, false);
        return false;
    }

    private void ayJ() {
        if (this.cXV != null) {
            com.iqoption.dialog.a.b.a(getFragmentManager(), (InstrumentType) this.cXV.first, (long[]) this.cXV.second);
        }
        this.cXV = null;
    }

    public void a(String str, int i, boolean z, int i2) {
        if (isAdded() && this.cXR != null) {
            if (z) {
                TabHelper.i eq = TabHelper.IM().eq(str);
                if (eq != null) {
                    eq.aa(i2, i);
                    if (TabHelper.IM().a(eq)) {
                        this.cXR.aF(i2, i);
                        EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, "chart_chart-scale-changed").setValue(Double.valueOf((double) i)).build());
                    }
                    com.iqoption.core.c.a.biM.execute(-$$Lambda$ah$x0pvepOlffy9837QLm9V5xDnp_g.INSTANCE);
                    return;
                }
                return;
            }
            fZ(i);
        }
    }

    public void f(InstrumentType instrumentType, String str) {
        if (isAdded() && !getTradeRoomActivity().zO()) {
            com.iqoption.dialog.a.b.a(getFragmentManager(), instrumentType, str);
        }
    }

    public void onClickTradersMoodView() {
        if (System.currentTimeMillis() - this.cXZ >= 1000 && isAdded()) {
            this.cXZ = System.currentTimeMillis();
            getResources().getDimensionPixelOffset(R.dimen.dp20);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp200);
            TextView textView = new TextView(getContext());
            textView.setLayoutParams(new LayoutParams(-1, -2));
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.grey_blur_50));
            textView.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.sp9));
            textView.setText(R.string.iq4_hint_traders_choise);
            PopupWindow popupWindow = this.cXY;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            this.cXY = new PopupWindow(textView, dimensionPixelOffset, -2);
            this.cXY.setAnimationStyle(R.style.TradeMoodInfoPopup);
            this.cXY.setBackgroundDrawable(ContextCompat.getDrawable(getContext(), R.drawable.cashback_left_bg));
            if (VERSION.SDK_INT >= 21) {
                this.cXY.setElevation((float) getResources().getDimensionPixelOffset(R.dimen.dp12));
            }
            this.cXY.setOutsideTouchable(true);
            this.cXY.setOnDismissListener(new -$$Lambda$ah$OVqekdXWVLPKAmjoyQIwt5maGH0(this));
            com.iqoption.core.c.a.biN.postDelayed(new -$$Lambda$ah$xQl8f5g2KBE3Ynr4k-sXZs646LQ(this), 10000);
        }
    }

    private /* synthetic */ void ayP() {
        this.cXY = null;
    }

    private /* synthetic */ void ayO() {
        if (isAdded()) {
            PopupWindow popupWindow = this.cXY;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        }
    }

    public void ij(String str) {
        if (this.cXA != null && !TextUtils.isEmpty(str)) {
            this.cXA.a((int) R.drawable.local_toast_type_indicator_red, (long) str.hashCode(), str, (long) ToastEntity.TOAST_DURATION).aYa();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ayK() {
        du(com.iqoption.l.b.aTS().aTT());
    }

    /* Access modifiers changed, original: 0000 */
    public void du(boolean z) {
        TopPanelFragment topPanelFragment = this.cXC;
        if (topPanelFragment != null) {
            if (z) {
                if (topPanelFragment.isHidden()) {
                    getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.appear_from_top_to_bottom_alpha_show, R.anim.appear_from_top_to_bottom_alpha_hide).show(this.cXC).commitNow();
                }
                this.cXC.oF();
            } else if (!topPanelFragment.isHidden()) {
                getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.appear_from_top_to_bottom_alpha_show, R.anim.appear_from_top_to_bottom_alpha_hide).hide(this.cXC).commitNow();
            }
        }
    }

    public void o(com.iqoption.mobbtech.connect.response.options.c cVar) {
        TopPanelFragment topPanelFragment = this.cXC;
        if (topPanelFragment != null) {
            topPanelFragment.o(cVar);
        }
    }

    public void b(com.iqoption.mobbtech.connect.response.options.b bVar) {
        TopPanelFragment topPanelFragment = this.cXC;
        if (topPanelFragment != null) {
            topPanelFragment.b(bVar);
        }
    }

    private void ayN() {
        if (!this.cXO) {
            this.cXO = true;
            this.aju.a(PopupFormat.NEW_BAKS_MOBILE).observe(this, new -$$Lambda$ah$pBtorkU-p9ZWsVhZh5PSWAb_kDU(this));
            this.aju.a(PopupAnchor.MOBILE_LEGAL_UPDATE).observe(this, new -$$Lambda$ah$tgDc5e01r7-ZqmV39VeHfZkUbOA(this));
            this.aju.a(PopupFormat.NPS).observe(this, new -$$Lambda$ah$ZV3pHKTNvWYoY7rc8Ku5Pu1uTL4(this));
            this.aju.a(PopupFormat.MOBILE_TOAST, PopupAnchor.WITH_ACTION_V1).observe(this, new -$$Lambda$ah$TPapUiRrmk0TqkiPgd4RPQMMLTc(this));
            this.aju.j(Arrays.asList(new PopupFormat[]{PopupFormat.WHATS_NEW}), Arrays.asList(new PopupAnchor[]{PopupAnchor.TWO_BUTTON_V1, PopupAnchor.ONE_BUTTON_V1, PopupAnchor.WITHOUT_ACTION_V1})).observe(this, new -$$Lambda$ah$OyT7xLu8vRa_FmX2hV1uYv1h-no(this));
        }
    }

    private void h(double d, double d2, double d3) {
        com.iqoption.fragment.dialog.d.a(getActivity(), R.id.fragment, getFragmentManager(), d, d2, d3);
    }

    public static void a(@DrawableRes int i, CharSequence charSequence, long j) {
        IQApp.Ex().bd(new ToastEntity(i, (long) charSequence.hashCode(), charSequence, null, j));
    }

    public void da(String str) {
        TradeRoomActivity tradeRoomActivity = getTradeRoomActivity();
        if (tradeRoomActivity != null) {
            tradeRoomActivity.da(str);
        }
    }
}
