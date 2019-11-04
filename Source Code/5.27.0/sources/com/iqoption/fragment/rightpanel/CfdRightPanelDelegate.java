package com.iqoption.fragment.rightpanel;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.google.common.util.concurrent.t;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.analytics.m;
import com.iqoption.app.managers.l;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.risks.response.overnightfee.OvernightDay;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder.Type;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.af;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.ToastEntity;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.e.xb;
import com.iqoption.fragment.aa;
import com.iqoption.fragment.ab;
import com.iqoption.fragment.ah;
import com.iqoption.fragment.w;
import com.iqoption.fragment.x;
import com.iqoption.fragment.y;
import com.iqoption.fragment.z;
import com.iqoption.service.e.k;
import com.iqoption.system.a.e;
import com.iqoption.system.a.g;
import com.iqoption.util.ad;
import com.iqoption.util.ai;
import com.iqoption.util.ak;
import com.iqoption.util.j;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CfdRightPanelDelegate extends EnabledInstrumentDelegate implements com.iqoption.view.a.b.a {
    private static final String TAG = "CfdRightPanelDelegate";
    @ColorInt
    private int amj;
    @ColorInt
    private int amk;
    @ColorInt
    private int aml;
    private com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private int bBe;
    private double bmw;
    private final boolean cKL;
    private volatile Double cLb = null;
    private volatile Double cLc = null;
    private final DecimalFormat cXm = j.aWK();
    private r dkW;
    private e dkX;
    private volatile Boolean dlA = null;
    private volatile Boolean dlB = null;
    @Nullable
    private com.iqoption.core.microservices.risks.response.overnightfee.c dlC = null;
    private final Observer<com.iqoption.core.microservices.risks.response.overnightfee.c> dlD = new -$$Lambda$CfdRightPanelDelegate$8oK_ETMdIo6P0hhO5T-4ZLf2tME(this);
    private final a dlF = new a(this, null);
    private final b dlG = new b(this);
    private final DecimalFormat dlH = com.iqoption.core.util.j.fq(3);
    private final com.iqoption.view.d.d dlI = new com.iqoption.view.d.d();
    private r dlJ;
    private r dlK;
    private e dlL;
    private c dlM;
    private Expiration dlN;
    private volatile boolean dlO;
    private final boolean dlP;
    private final boolean dlQ;
    private final boolean dlR;
    xb dlS;
    private final com.iqoption.view.d.b dlT = new com.iqoption.view.d.b() {
        public void M(View view) {
            com.iqoption.fragment.d.a(CfdRightPanelDelegate.this.getFragmentManager(), R.id.fragment);
        }
    };
    private Builder dlU;
    private int dla;
    private boolean dlb;
    private final t dlt = new t();
    private volatile Double dlu;
    private double dlv;
    private s dlw;
    private s dlx;
    private final boolean dly;
    private final boolean dlz;
    private String mask;

    /* renamed from: com.iqoption.fragment.rightpanel.CfdRightPanelDelegate$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] akL = new int[ActiveType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.iqoption.core.data.model.ActiveType.values();
            r0 = r0.length;
            r0 = new int[r0];
            akL = r0;
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.data.model.ActiveType.INTRADAY_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.data.model.ActiveType.FOREX_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.rightpanel.CfdRightPanelDelegate$AnonymousClass3.<clinit>():void");
        }
    }

    private static class c {
        private final View dmj;
        private ObjectAnimator dmk;

        public c(View view) {
            this.dmj = view;
        }

        public void start() {
            ObjectAnimator objectAnimator = this.dmk;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            Keyframe ofFloat = Keyframe.ofFloat(0.5f, 1.0f);
            Keyframe ofFloat2 = Keyframe.ofFloat(1.0f, 0.0f);
            View view = this.dmj;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofKeyframe(View.ALPHA, new Keyframe[]{ofFloat, ofFloat2});
            this.dmk = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
            this.dmk.setRepeatMode(2);
            this.dmk.setRepeatCount(-1);
            this.dmk.setDuration(600);
            this.dmk.start();
        }

        public void stop() {
            ObjectAnimator objectAnimator = this.dmk;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.dmk = ObjectAnimator.ofFloat(this.dmj, View.ALPHA, new float[]{0.0f});
            this.dmk.start();
        }
    }

    public static final class d {
        private final c dlo;
        private final CfdRightPanelDelegate dml;

        public d(CfdRightPanelDelegate cfdRightPanelDelegate) {
            this.dml = cfdRightPanelDelegate;
            this.dlo = new c(cfdRightPanelDelegate);
        }

        public void aFv() {
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deal-keyboard_keyboard").setValue(Double.valueOf(com.iqoption.fragment.a.b.b(this.dml.getFragmentManager(), R.id.fragment, this.dml.ZC(), this.dml.aFd()[0]) ? 1.0d : 0.0d)).build());
        }

        public void aFw() {
            CfdRightPanelDelegate cfdRightPanelDelegate = this.dml;
            cfdRightPanelDelegate.K(cfdRightPanelDelegate.ZC() - 1.0d);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_deal-minus").build());
        }

        public void aFx() {
            CfdRightPanelDelegate cfdRightPanelDelegate = this.dml;
            cfdRightPanelDelegate.K(cfdRightPanelDelegate.ZC() + 1.0d);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_deal-plus").build());
        }

        public void aGl() {
            x.a(this.dml.getFragmentManager(), R.id.fragment, this.dml.getInstrumentType(), this.dml.getActiveId());
        }

        public void bB(View view) {
            if (this.dml.aFp() != null) {
                this.dml.bA(view);
            }
            this.dml.dQ(true);
            this.dlo.aFB();
        }

        public void bC(View view) {
            if (this.dml.aFp() != null) {
                this.dml.bA(view);
            }
            this.dml.dQ(false);
            this.dlo.aFB();
        }

        public void aFy() {
            this.dlo.aFC();
            this.dml.aFL();
            this.dml.aFZ();
            this.dml.aFK();
            this.dml.aGk();
        }

        public void aFG() {
            boolean aFC = this.dlo.aFC();
            this.dml.aFL();
            if (aFC) {
                this.dml.aFY();
            }
            this.dml.aFZ();
            this.dml.aFK();
            this.dml.ea(false);
        }

        public void aFJ() {
            this.dml.aFL();
            this.dml.aFZ();
            this.dml.aFK();
        }

        public void aFI() {
            this.dml.aFL();
            this.dml.aFY();
            this.dml.aFK();
            this.dml.ea(true);
        }

        public void aGm() {
            ab.b(this.dml.getFragmentManager(), this.dml.getInstrumentType(), this.dml.getActiveId(), this.dml.dlu, true);
        }

        public void aGn() {
            this.dml.aFY();
        }

        public void aGo() {
            this.dml.aFY();
            this.dml.aGa();
        }

        public void aGp() {
            com.iqoption.dialog.b.b.a(this.dml.getFragmentManager(), this.dml.getActiveId(), this.dml.getInstrumentType(), this.dml.dlb, this.dml.dlu, this.dml.cLb, this.dml.cLc, this.dml.dlA, this.dml.bBe, this.dml.bmw, this.dml.dlB);
            m.Ct();
        }

        public void aFA() {
            TabHelper.IM().Jg();
        }
    }

    public static final class a extends e<CfdRightPanelDelegate> {
        /* synthetic */ a(CfdRightPanelDelegate cfdRightPanelDelegate, AnonymousClass1 anonymousClass1) {
            this(cfdRightPanelDelegate);
        }

        private a(CfdRightPanelDelegate cfdRightPanelDelegate) {
            super(cfdRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onShowedExpirationFragmentEvent(final com.iqoption.app.managers.a.e.d dVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.dO(dVar.ajQ);
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onNativeChangeLimitOrderValueEvent(final com.iqoption.gl.NativeHandler.c cVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null && cfdRightPanelDelegate.dly) {
                        cfdRightPanelDelegate.k((Double) cVar.getValue());
                        cfdRightPanelDelegate.aGb();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeLimitOrderValueEvent(final com.iqoption.fragment.ab.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null && cfdRightPanelDelegate.dly) {
                        cfdRightPanelDelegate.k(aVar.value);
                        if (aVar.cWH) {
                            cfdRightPanelDelegate.aGa();
                        }
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onShowedPendingEdit(final com.iqoption.fragment.ab.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null && cfdRightPanelDelegate.dly) {
                        if (!bVar.ajQ) {
                            cfdRightPanelDelegate.k(bVar.value);
                            cfdRightPanelDelegate.aGa();
                        }
                        cfdRightPanelDelegate.dS(bVar.ajQ);
                        m.a(bVar.ajQ, cfdRightPanelDelegate.getInstrumentType(), com.iqoption.app.b.DG().DJ());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onShowedLimitsDialogEvent(final com.iqoption.dialog.b.b.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.dV(((Boolean) bVar.getValue()).booleanValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onLimitsChangeEvent(final com.iqoption.dialog.b.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.a(aVar.cLb, aVar.cLc, aVar.cKB, aVar.cKD);
                        cfdRightPanelDelegate.aFQ();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onInitializationCompletedEvent(TabHelper.e eVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.aFP();
                        cfdRightPanelDelegate.aFj();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onAmountChangedIQKeyboardEvent(final com.iqoption.fragment.a.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.J(((Double) aVar.getValue()).doubleValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onShowedIQKeyboardEvent(final com.iqoption.fragment.a.b.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.dP(((Boolean) bVar.getValue()).booleanValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onShowedMultiplierChooser(final com.iqoption.fragment.x.d dVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.dU(((Boolean) dVar.getValue()).booleanValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onShowedOtnChanged(final com.iqoption.fragment.y.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.dW(((Boolean) bVar.getValue()).booleanValue());
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onOtnCommissionChanged(com.iqoption.fragment.y.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CfdRightPanelDelegate$a$CSkoec9_rYBJ5wUDX5wC27QAxnk(this, aVar));
        }

        @com.google.common.b.e
        public void onShowedCommissionInfo(com.iqoption.fragment.g.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CfdRightPanelDelegate$a$eJ0wpKF7AQ1sjgZpe2_5KU9LBtE(this, aVar));
        }

        @com.google.common.b.e
        public void onShowedOvernightFeeInfo(com.iqoption.fragment.aa.c cVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CfdRightPanelDelegate$a$C8ut4HyWjcoK9hhRoyvS2FadsV0(this, cVar));
        }

        @com.google.common.b.e
        public void onShowedOtnRewardInfo(com.iqoption.fragment.z.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CfdRightPanelDelegate$a$rk3mou9Thbnuz0Ti_lya5EBhv0o(this, aVar));
        }

        @com.google.common.b.e
        public void onChosenMultiplierChooser(com.iqoption.fragment.x.c cVar) {
            i Jh = TabHelper.IM().Jh();
            if (Jh != null) {
                Jh.a("tabSetting.multiplier", Integer.valueOf(cVar.bBe));
            }
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CfdRightPanelDelegate$a$9TjaLB8KX0G3MO9F1jw5_eJEuQQ(this, cVar));
        }

        @com.google.common.b.e
        public void onShowedMultiplierConfirmDialog(final com.iqoption.fragment.w.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.dZ(aVar.cVc);
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onUpdateCommissionPaidEvent(final com.iqoption.app.helpers.a.e eVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) a.this.dUo.get();
                    if (cfdRightPanelDelegate != null && cfdRightPanelDelegate.anF != null && cfdRightPanelDelegate.anF.getInstrumentType() == eVar.getValue()) {
                        cfdRightPanelDelegate.aFN();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeExpirationEvent(com.iqoption.app.managers.a.e.a aVar) {
            if (aVar.avF == TabHelper.IM().Ji()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$CfdRightPanelDelegate$a$fZVp2s3oPcot6cSl1yCTDw5NpGY(this, aVar));
            }
        }
    }

    public static class b extends g<CfdRightPanelDelegate> {
        public b(CfdRightPanelDelegate cfdRightPanelDelegate) {
            super(cfdRightPanelDelegate);
        }

        @com.google.common.b.e
        public void onLeveragesChanged(final com.iqoption.service.e.d dVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) b.this.dUo.get();
                    if (cfdRightPanelDelegate != null && cfdRightPanelDelegate.getInstrumentType() == dVar.getValue()) {
                        cfdRightPanelDelegate.aGh();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeBalanceType(com.iqoption.service.e.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) b.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.K(cfdRightPanelDelegate.Fd());
                        cfdRightPanelDelegate.aGe();
                        cfdRightPanelDelegate.aFN();
                        cfdRightPanelDelegate.aFj();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onUpdateBalanceValue(k kVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) b.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.aFN();
                        cfdRightPanelDelegate.aFj();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onChangeCurrentCurrency(com.iqoption.service.e.c cVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    CfdRightPanelDelegate cfdRightPanelDelegate = (CfdRightPanelDelegate) b.this.dUo.get();
                    if (cfdRightPanelDelegate != null) {
                        cfdRightPanelDelegate.aFN();
                        cfdRightPanelDelegate.aFi();
                        cfdRightPanelDelegate.aFj();
                    }
                }
            });
        }
    }

    public boolean aFe() {
        return true;
    }

    public /* bridge */ /* synthetic */ boolean aFo() {
        return super.aFo();
    }

    @Nullable
    public /* bridge */ /* synthetic */ com.iqoption.core.microservices.kyc.response.restriction.b aFp() {
        return super.aFp();
    }

    public /* bridge */ /* synthetic */ LiveData aFq() {
        return super.aFq();
    }

    public /* bridge */ /* synthetic */ RightPanelFragment aFr() {
        return super.aFr();
    }

    public /* bridge */ /* synthetic */ TradeRoomActivity aFs() {
        return super.aFs();
    }

    public /* bridge */ /* synthetic */ void aFt() {
        super.aFt();
    }

    public /* bridge */ /* synthetic */ void bA(View view) {
        super.bA(view);
    }

    @NonNull
    public /* bridge */ /* synthetic */ Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    public /* bridge */ /* synthetic */ ah getTradeFragment() {
        return super.getTradeFragment();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x008b  */
    CfdRightPanelDelegate(com.iqoption.fragment.rightpanel.RightPanelFragment r5, com.iqoption.core.microservices.tradingengine.response.active.a r6) {
        /*
        r4 = this;
        r4.<init>(r5);
        r0 = new com.iqoption.fragment.rightpanel.CfdRightPanelDelegate$a;
        r1 = 0;
        r0.<init>(r4, r1);
        r4.dlF = r0;
        r0 = new com.iqoption.fragment.rightpanel.CfdRightPanelDelegate$b;
        r0.<init>(r4);
        r4.dlG = r0;
        r0 = 3;
        r0 = com.iqoption.core.util.j.fq(r0);
        r4.dlH = r0;
        r0 = com.iqoption.util.j.aWK();
        r4.cXm = r0;
        r0 = new com.iqoption.fragment.rightpanel.t;
        r0.<init>();
        r4.dlt = r0;
        r0 = new com.iqoption.view.d.d;
        r0.<init>();
        r4.dlI = r0;
        r4.cLb = r1;
        r4.cLc = r1;
        r4.dlA = r1;
        r4.dlB = r1;
        r4.dlC = r1;
        r0 = new com.iqoption.fragment.rightpanel.-$$Lambda$CfdRightPanelDelegate$8oK_ETMdIo6P0hhO5T-4ZLf2tME;
        r0.<init>(r4);
        r4.dlD = r0;
        r0 = new com.iqoption.fragment.rightpanel.CfdRightPanelDelegate$1;
        r0.<init>();
        r4.dlT = r0;
        r4.e(r6);
        r6 = com.iqoption.app.managers.feature.c.Iw();
        r0 = "hide-emission";
        r0 = r6.ep(r0);
        r1 = 1;
        r0 = r0 ^ r1;
        r4.dlP = r0;
        r0 = "otn-token";
        r0 = r6.ep(r0);
        r4.dlQ = r0;
        r0 = "pending-order";
        r0 = r6.ej(r0);
        r4.dly = r0;
        r0 = "trailing-stop";
        r0 = r6.ej(r0);
        r4.cKL = r0;
        r0 = "margin-add-on";
        r6 = r6.ei(r0);
        r0 = 0;
        if (r6 == 0) goto L_0x0086;
    L_0x0078:
        r2 = r6.getStatus();
        r3 = "disabled";
        r2 = r3.equals(r2);
        if (r2 != 0) goto L_0x0086;
    L_0x0084:
        r2 = 1;
        goto L_0x0087;
    L_0x0086:
        r2 = 0;
    L_0x0087:
        r4.dlz = r2;
        if (r6 == 0) goto L_0x0098;
    L_0x008b:
        r6 = r6.getStatus();
        r2 = "enabled-with-popup";
        r6 = r2.equals(r6);
        if (r6 == 0) goto L_0x0098;
    L_0x0097:
        r0 = 1;
    L_0x0098:
        r4.dlR = r0;
        r6 = r4.getContext();
        r0 = 2131099949; // 0x7f06012d float:1.7812266E38 double:1.0529032727E-314;
        r0 = androidx.core.content.ContextCompat.getColor(r6, r0);
        r4.amj = r0;
        r0 = 2131100187; // 0x7f06021b float:1.7812748E38 double:1.05290339E-314;
        r0 = androidx.core.content.ContextCompat.getColor(r6, r0);
        r4.amk = r0;
        r0 = 2131100286; // 0x7f06027e float:1.781295E38 double:1.052903439E-314;
        r6 = androidx.core.content.ContextCompat.getColor(r6, r0);
        r4.aml = r6;
        r6 = 2131165656; // 0x7f0701d8 float:1.7945535E38 double:1.052935736E-314;
        r5 = r5.fA(r6);
        r4.dla = r5;
        r5 = r4.dlF;
        r5.register();
        r5 = r4.dlG;
        r5.register();
        r4.aGe();
        r5 = com.iqoption.view.a.b.aYv();
        r5.a(r4);
        r5 = r4.aFq();
        r6 = r4.dlD;
        r5.observeForever(r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.rightpanel.CfdRightPanelDelegate.<init>(com.iqoption.fragment.rightpanel.RightPanelFragment, com.iqoption.core.microservices.tradingengine.response.active.a):void");
    }

    public void aFf() {
        aGi();
    }

    public boolean aFh() {
        return this.dlb;
    }

    public void J(double d) {
        K(d);
    }

    public double ZC() {
        return this.bmw;
    }

    public double[] aFd() {
        return j.ae(getInstrumentType());
    }

    public void onTick(long j) {
        aGd();
        if (!com.iqoption.util.c.a.d(this.anF, j) || this.anF.isSuspended()) {
            com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
            aFr().ac(this.anF);
            return;
        }
        if (this.anF.isExpired() && this.dlN != null) {
            bL(j);
            if (this.dlL.bE(this.dlS.cqW.crC)) {
                if (bJ(j)) {
                    this.dlS.cqW.crC.setTimeToClose(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.dlN.expValue.longValue() - j)));
                } else {
                    aFm();
                }
            } else if (bJ(j)) {
                aFn();
            } else {
                aGd();
            }
        }
        if (this.dpm) {
            if (l.HZ().Ie()) {
                RightPanelDelegate.bH(this.dlS.cqW.crA);
                RightPanelDelegate.bH(this.dlS.cqW.crB);
            } else {
                RightPanelDelegate.bI(this.dlS.cqW.crA);
                RightPanelDelegate.bI(this.dlS.cqW.crB);
            }
        }
    }

    private boolean bJ(long j) {
        if (j <= this.dlN.expValue.longValue() - com.iqoption.app.managers.a.e.Ig().c(this.anF, this.dlN) || j >= this.dlN.expValue.longValue()) {
            return false;
        }
        return com.iqoption.app.managers.c.GS().b(new com.iqoption.mobbtech.connect.response.options.d(Long.valueOf(this.dlN.expValue.longValue() / 1000), Integer.valueOf(this.anF.getActiveId()), this.anF.getInstrumentType())) ^ 1;
    }

    private boolean bK(long j) {
        t p = com.iqoption.app.managers.a.e.Ig().p(this.anF);
        if (p.isDone()) {
            try {
                Expiration expiration = (Expiration) p.get();
                if (j > expiration.expValue.longValue() - com.iqoption.app.managers.a.e.Ig().c(this.anF, expiration) && j < expiration.expValue.longValue()) {
                    return com.iqoption.app.managers.c.GS().b(new com.iqoption.mobbtech.connect.response.options.d(Long.valueOf(expiration.expValue.longValue() / 1000), Integer.valueOf(this.anF.getActiveId()), this.anF.getInstrumentType())) ^ 1;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return false;
    }

    private void bL(long j) {
        if (bK(j)) {
            this.dlS.cqW.crG.setBackgroundResource(R.drawable.grey_blur_15_spinner_selector);
            this.dlS.cqW.crG.setOnTouchListener(this.dlI);
            this.dlS.cqW.crG.setOnClickListener(this.dlT);
            this.dlS.cqW.crI.setVisibility(0);
            return;
        }
        this.dlS.cqW.crG.setBackground(null);
        this.dlS.cqW.crG.setOnTouchListener(null);
        this.dlS.cqW.crG.setOnClickListener(null);
        this.dlS.cqW.crI.setVisibility(8);
    }

    private int aGc() {
        int i = this.bBe;
        return i == 0 ? 1 : i;
    }

    private void aGd() {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.anF.getActiveId());
        if (dY == null) {
            this.dlS.cqW.crW.setText(null);
            this.dlS.cqW.cry.clear();
            this.dlS.cqW.crz.clear();
        } else if (!this.dkX.bE(this.dlS.cqV.getRoot())) {
            InstrumentType instrumentType = getInstrumentType();
            ActiveType activeType = getActiveType();
            int aGc = aGc();
            double spread = dY.getSpread(instrumentType, aGc);
            int i = AnonymousClass3.akL[activeType.ordinal()];
            if (i == 1 || i == 2) {
                this.dlS.cqW.crW.h("%.1f", m.doC.c(spread, this.anF));
            } else {
                this.dlS.cqW.crW.h(this.mask, spread);
            }
            if (this.dlu == null) {
                spread = dY.getAsk(instrumentType, aGc);
                double bid = dY.getBid(instrumentType, aGc);
                this.dlS.cqW.cry.h(this.mask, spread);
                this.dlS.cqW.crz.h(this.mask, bid);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 0;
        this.dlS = (xb) DataBindingUtil.inflate(layoutInflater, R.layout.right_panel_delegate_cfd, viewGroup, false);
        final d dVar = new d(this);
        this.dlJ = new r(this.dlS.cqW.crJ, this.dlS.cqW.crH);
        this.dkW = new r(this.dlS.cqW.crv, this.dlS.cqW.crs);
        this.dlK = new r(this.dlS.cqW.crQ, this.dlS.cqW.crM);
        this.dlw = new s(this.dlS.cqW.crn, this.dlS.cqW.crq, this.dlS.cqW.crF);
        this.dlx = new s(this.dlS.cqV.crn, this.dlS.cqV.crq, this.dlS.cqV.cqZ, getContext().getResources().getDimension(R.dimen.dp48));
        this.dkX = new e(new d(this.dlS.cqV.getRoot()), this.dlS.cqW.getRoot(), this.dlS.cqV.getRoot());
        this.dlL = new e(this.dla, this.dlS.cqW.crE, this.dlS.cqW.crC);
        this.dlM = new c(this.dlS.cqW.crL);
        this.dlS.cqW.crK.setLayoutTransition(ak.anP());
        this.dlS.cqV.crb.setLayoutTransition(ak.anP());
        if (!this.dly) {
            i = 8;
        }
        this.dlS.cqW.crT.setVisibility(i);
        this.dlS.cqV.cro.setVisibility(i);
        aFY();
        this.dlS.cqW.crC.setBuyNewListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                dVar.aFA();
            }
        });
        AnonymousClass5 anonymousClass5 = new com.iqoption.view.d.b() {
            public void M(View view) {
                switch (view.getId()) {
                    case R.id.amountLayout /*2131361900*/:
                        dVar.aFv();
                        return;
                    case R.id.amountMinus /*2131361901*/:
                        dVar.aFw();
                        return;
                    case R.id.amountPlus /*2131361903*/:
                        dVar.aFx();
                        return;
                    case R.id.buttonCall /*2131362103*/:
                        dVar.bB(view);
                        return;
                    case R.id.buttonPut /*2131362115*/:
                        dVar.bC(view);
                        return;
                    case R.id.cancelPendingOrder /*2131362161*/:
                        dVar.aGn();
                        return;
                    case R.id.cancelSubmitPendingOrder /*2131362162*/:
                        dVar.aGo();
                        return;
                    case R.id.limitsLayoutConfirm /*2131363201*/:
                        dVar.aGp();
                        return;
                    case R.id.multiplierLayout /*2131363321*/:
                        dVar.aGl();
                        return;
                    case R.id.pendingLayout /*2131363527*/:
                        dVar.aGm();
                        return;
                    case R.id.pendingLayoutConfirm /*2131363528*/:
                        dVar.aGm();
                        m.Cu();
                        return;
                    default:
                        return;
                }
            }
        };
        this.dlS.cqW.crt.setOnClickListener(anonymousClass5);
        this.dlS.cqW.crN.setOnClickListener(anonymousClass5);
        this.dlS.cqW.crA.setOnClickListener(anonymousClass5);
        this.dlS.cqW.crB.setOnClickListener(anonymousClass5);
        this.dlS.cqW.crT.setOnClickListener(anonymousClass5);
        this.dlS.cqW.crF.setOnClickListener(anonymousClass5);
        this.dlS.cqV.cqZ.setOnClickListener(anonymousClass5);
        this.dlS.cqV.cro.setOnClickListener(anonymousClass5);
        this.dlS.cqV.crg.setOnClickListener(anonymousClass5);
        this.dlS.cqV.cqX.setOnClickListener(new com.iqoption.view.d.b(1000) {
            public void M(View view) {
                if (CfdRightPanelDelegate.this.dlu == null) {
                    dVar.aFJ();
                } else {
                    dVar.aFI();
                }
            }
        });
        this.dlS.cqV.bZy.setOnClickListener(new com.iqoption.view.d.b(1000) {
            public void M(View view) {
                com.iqoption.marginaddon.b.aNC();
                if (CfdRightPanelDelegate.this.dlu == null) {
                    dVar.aFy();
                } else {
                    dVar.aFG();
                }
            }
        });
        this.dlS.cqV.bZv.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                Point ai = ak.ai(view);
                z.a(CfdRightPanelDelegate.this.getFragmentManager(), R.id.fragment, ai.x, ai.y);
            }
        });
        this.dlS.cqV.bZq.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                Point ai = ak.ai(view);
                com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(CfdRightPanelDelegate.this.anF.getInstrumentType(), Integer.valueOf(CfdRightPanelDelegate.this.anF.getActiveId()));
                com.iqoption.fragment.g.a(CfdRightPanelDelegate.this.getFragmentManager(), R.id.fragment, ai.x, ai.y, CfdRightPanelDelegate.this.dlH.format(a == null ? 0.0d : a.d(CfdRightPanelDelegate.this.bmw, j.aWI().doubleValue())));
            }
        });
        AnonymousClass10 anonymousClass10 = new com.iqoption.view.d.b() {
            public void M(View view) {
                Point ai = ak.ai(view);
                aa.a(CfdRightPanelDelegate.this.getFragmentManager(), R.id.fragment, ai.x, ai.y, CfdRightPanelDelegate.this.bmw, CfdRightPanelDelegate.this.bBe, CfdRightPanelDelegate.this.dlb, CfdRightPanelDelegate.this.dlC);
            }
        };
        this.dlS.cqV.crl.setText(new ai().jP(getContext().getString(R.string.overnight_fee).toUpperCase()).F(' ').cs(new ImageSpan(getContext(), R.drawable.ic_info_commission, 1)).F(' ').aWX().anA());
        this.dlS.cqV.crl.setOnClickListener(anonymousClass10);
        this.dlS.cqV.bZt.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                double d;
                com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(CfdRightPanelDelegate.this.anF.getInstrumentType(), Integer.valueOf(CfdRightPanelDelegate.this.anF.getActiveId()));
                if (a == null) {
                    d = 0.0d;
                } else {
                    d = a.c(CfdRightPanelDelegate.this.bmw, j.aWI().doubleValue());
                }
                if (!com.google.common.c.a.b(0.0d, d, 0.001d)) {
                    Point ai = ak.ai(view);
                    y.a(CfdRightPanelDelegate.this.aFs(), CfdRightPanelDelegate.this.getFragmentManager(), R.id.fragment, ai.x, ai.y, d);
                }
                m.Cs();
            }
        });
        K(Fd());
        aFR();
        if (com.iqoption.app.b.DG().Er() && !com.iqoption.app.d.dX("multiplier_confirmed")) {
            this.dlS.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    CfdRightPanelDelegate.this.dlS.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    com.iqoption.core.c.a.biN.postDelayed(new -$$Lambda$CfdRightPanelDelegate$2$y3DjH66FFIr7tDqYQ4NWTl-12ic(this, ak.ah(CfdRightPanelDelegate.this.dlS.cqW.crN)), ToastEntity.ERROR_TOAST_DURATION);
                }

                private /* synthetic */ void k(Rect rect) {
                    w.a(CfdRightPanelDelegate.this.aFs(), CfdRightPanelDelegate.this.getFragmentManager(), R.id.fragment, rect.left, rect.centerY());
                }
            });
        }
        aGe();
        aGg();
        return this.dlS.getRoot();
    }

    /* Access modifiers changed, original: protected */
    public double Fd() {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        double Fd = com.iqoption.app.d.Fa().Fd();
        double[] aFd = aFd();
        if (this.anF.getInstrumentType() == InstrumentType.FOREX_INSTRUMENT) {
            String str = "first-deal-forex";
            if (com.iqoption.app.d.dW(str)) {
                double i;
                com.iqoption.app.d.i(str, false);
                int Ik = com.iqoption.app.managers.feature.a.Ik();
                if (Ik > 0) {
                    i = com.iqoption.util.ab.i(com.iqoption.app.b.DG().DI().doubleValue(), (double) Ik);
                    if (i < aFd[0]) {
                        i = aFd[0];
                    }
                    if (i > aFd[1]) {
                        i = aFd[1];
                    }
                    com.iqoption.app.d.Fa().j(i);
                } else if (Fd != 0.0d) {
                    return Fd;
                } else {
                    if (DG.DJ() == 4) {
                        i = c(DG);
                    } else {
                        i = aFd[0];
                    }
                }
                return i;
            }
        }
        if (Fd != 0.0d) {
            return Fd;
        }
        if (DG.DJ() == 4) {
            return c(DG);
        }
        return aFd[0];
    }

    private void aFK() {
        this.cLb = null;
        this.cLc = null;
        this.dlA = null;
        this.dlB = null;
    }

    private void a(Double d, Double d2, Boolean bool, Boolean bool2) {
        this.cLb = d;
        this.cLc = d2;
        this.dlA = bool;
        this.dlB = bool2;
    }

    private void aGe() {
        boolean z = aGf() && com.iqoption.app.d.dX("otn_commmision");
        this.dlO = z;
    }

    private boolean aGf() {
        boolean z = false;
        if (this.anF.getInstrumentType() == InstrumentType.FOREX_INSTRUMENT) {
            return false;
        }
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        Object obj = DG.DJ() == 1 ? 1 : null;
        if (!((DG.DM() != null ? 1 : null) == null || obj == null || !this.dlQ)) {
            z = true;
        }
        return z;
    }

    private void c(boolean z, double d) {
        double doubleValue;
        CharSequence d2;
        boolean z2;
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        ConversionCurrency DQ = DG.DQ();
        double doubleValue2 = j.b(DQ).doubleValue();
        double d3 = 0.0d;
        if (z) {
            Balance DM = DG.DM();
            ConversionCurrency du = DG.du(Currencies.OTN_CURRENCY);
            String c = j.c(DQ);
            String c2 = j.c(du);
            double doubleValue3 = j.b(du).doubleValue();
            doubleValue = j.b(j.c(Double.valueOf(Balance.getBalanceValue(DM)), Double.valueOf(doubleValue3)), Double.valueOf(doubleValue2)).doubleValue() - d;
            if (com.google.common.c.a.b(Math.abs(doubleValue), d, 0.001d)) {
                d2 = j.d(DQ);
                z2 = false;
            } else {
                String a;
                if (doubleValue > 0.0d) {
                    a = j.a(c2, Double.valueOf(j.b(j.c(Double.valueOf(d), Double.valueOf(doubleValue2)), Double.valueOf(doubleValue3)).doubleValue()), this.cXm);
                } else {
                    a = j.a(c, Double.valueOf(Math.abs(doubleValue)), this.dkQ);
                    double doubleValue4 = j.b(j.c(Double.valueOf(d - Math.abs(doubleValue)), Double.valueOf(doubleValue2)), Double.valueOf(doubleValue3)).doubleValue();
                    a = String.format(Locale.US, "%s + %s", new Object[]{j.a(c2, Double.valueOf(doubleValue4), this.cXm), a});
                }
                d2 = a;
                z2 = z;
            }
        } else {
            d2 = j.d(DQ);
            z2 = z;
            doubleValue = d;
        }
        if (this.dlP) {
            Double l = com.iqoption.app.managers.e.Hv().l(doubleValue2);
            if (z2 || l == null || l.doubleValue() <= 0.0d || Math.abs(doubleValue) <= 0.0d) {
                this.dlS.cqV.bZv.setVisibility(8);
                this.dlS.cqV.bZx.setVisibility(8);
            } else {
                this.dlS.cqV.bZw.setText(this.cXm.format(Math.abs(doubleValue) * l.doubleValue()));
                this.dlS.cqV.bZv.setVisibility(0);
                this.dlS.cqV.bZx.setVisibility(0);
            }
        }
        this.dlO = z2;
        double d4 = this.bmw;
        if (doubleValue <= 0.0d || !z2) {
            d3 = Math.abs(doubleValue);
        }
        this.dlv = d4 + d3;
        this.dlS.cqV.cal.setText(j.a(this.dlv, this.dkQ));
        this.dlS.cqV.bZs.setText(d2);
    }

    private void dT(boolean z) {
        double d;
        com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(this.anF.getInstrumentType(), Integer.valueOf(this.anF.getActiveId()));
        if (a == null) {
            d = 0.0d;
        } else {
            d = a.c(this.bmw, j.aWI().doubleValue());
        }
        c(z, d);
    }

    private void aFR() {
        com.iqoption.core.microservices.tradingengine.response.b.a U = i.U(this.anF);
        if (U == null) {
            this.dlS.cqW.crN.setOnClickListener(null);
        }
        setMultiplier(i.b(U, getInstrumentType()));
    }

    /* Access modifiers changed, original: 0000 */
    public void T(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super.T(aVar);
        e(aVar);
        aGg();
        aFR();
        aFL();
        aGe();
        aFK();
        aFY();
        aFN();
    }

    private void aGg() {
        if (this.anF.isExpired()) {
            j(TabHelper.IM().Jd());
            this.dlS.cqW.crG.setVisibility(0);
            this.dlS.cqW.crX.setVisibility(8);
            return;
        }
        this.dlS.cqW.crG.setVisibility(8);
        this.dlS.cqW.crX.setVisibility(0);
    }

    private void j(Expiration expiration) {
        this.dlS.cqW.crJ.setText(com.iqoption.app.managers.a.e.ap(expiration.expValue.longValue()));
        this.dlN = expiration;
    }

    private void dO(boolean z) {
        this.dlS.cqW.crI.setSelected(z);
        this.dlS.cqW.crG.setSelected(z);
        if (z) {
            this.dlJ.select();
        } else {
            this.dlJ.aHN();
        }
    }

    public void e(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        this.anF = aVar;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("%.");
        stringBuilder.append(aVar.getPrecision());
        stringBuilder.append("f");
        this.mask = stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        super.destroy();
        this.dlF.unregister();
        this.dlG.unregister();
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
        aFq().removeObserver(this.dlD);
    }

    @Nullable
    public InstrumentType getInstrumentType() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        return aVar != null ? aVar.instrumentType : null;
    }

    @Nullable
    public ActiveType getActiveType() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        return aVar != null ? aVar.getActiveType() : null;
    }

    private int getActiveId() {
        return this.anF.getActiveId();
    }

    private void K(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        this.bmw = d;
        aFN();
        aFi();
        aFj();
        aFS();
    }

    private void aFi() {
        this.dlS.cqW.crv.setText(j.a(this.bmw, this.dkQ));
    }

    private void aFj() {
        double doubleValue = com.iqoption.app.b.DG().DI().doubleValue();
        double[] aFd = aFd();
        double d = this.dlv;
        if (d > doubleValue || d > aFd[1] || d < aFd[0]) {
            this.dlS.cqW.crv.setTextColor(this.amk);
        } else {
            this.dlS.cqW.crv.setTextColor(this.aml);
        }
    }

    private void aFS() {
        TextView textView = this.dlS.cqW.coj;
        double d = this.bmw;
        double d2 = (double) this.bBe;
        Double.isNaN(d2);
        textView.setText(j.a(d * d2, this.dkQ));
    }

    private void aGh() {
        aFR();
    }

    public void setMultiplier(int i) {
        this.bBe = i;
        aFT();
        aFS();
        i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            Jh.a("tabSetting.multiplier", Integer.valueOf(i));
        }
    }

    private void aFT() {
        this.dlS.cqW.crQ.setText(af.ft(this.bBe));
    }

    /* Access modifiers changed, original: 0000 */
    public void dP(boolean z) {
        this.dlS.cqW.crt.setSelected(z);
        if (z) {
            this.dkW.select();
        } else {
            this.dkW.aHN();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dQ(boolean z) {
        this.dlb = z;
    }

    /* Access modifiers changed, original: 0000 */
    public void aGi() {
        this.dlU = m.Cv();
        this.dkX.ak(this.dlS.cqV.getRoot());
        aGd();
        aFQ();
        aFO();
        aGa();
        aGj();
    }

    private void aGj() {
        if (this.dlR && com.iqoption.app.b.DG().Er() && com.iqoption.marginaddon.b.aNz()) {
            View root = this.dlS.getRoot();
            root.getClass();
            com.iqoption.core.ext.a.a(root, new -$$Lambda$TH8qdPaumxQjQZbzpggkcTQ1rM0(root), new -$$Lambda$CfdRightPanelDelegate$NIZtP9SSFzo-Ad6m_hyDUx2AuG8(this, root));
        }
    }

    private /* synthetic */ kotlin.l bD(View view) {
        com.iqoption.marginaddon.b.aNB();
        Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Point ai = ak.ai(this.dlS.cqV.crg);
        com.iqoption.marginaddon.a.a(aFs(), (int) R.id.other_fragment, (point.x - ai.x) + getContext().getResources().getDimensionPixelOffset(R.dimen.dp8));
        return kotlin.l.eVB;
    }

    /* Access modifiers changed, original: 0000 */
    public void aFO() {
        com.iqoption.core.microservices.risks.response.overnightfee.c cVar = this.dlC;
        if (cVar == null || this.bBe <= 1) {
            this.dlS.cqV.crk.setVisibility(8);
            return;
        }
        Double a = cVar.a(TimeUtil.bRM.anN(), OvernightDay.today(), this.dlb);
        if (a != null) {
            this.dlS.cqV.crm.setText(af.b(a.doubleValue(), a.doubleValue() < 0.0d ? "+" : "-", 4));
        } else {
            this.dlS.cqV.crm.setText(R.string.n_a);
        }
        this.dlS.cqV.crk.setVisibility(0);
    }

    /* Access modifiers changed, original: 0000 */
    public void aFQ() {
        if (this.dkX.bE(this.dlS.cqV.getRoot())) {
            this.dlS.cqV.bZP.setText(j.a(this.bmw, this.dkQ));
            this.dlS.cqV.crj.setText(af.ft(this.bBe));
            Context context = getContext();
            if (context != null) {
                this.dlS.cqV.bZy.setBackgroundResource(this.dlb ? R.drawable.btn_green_background : R.drawable.btn_red_background);
                RobotoTextView robotoTextView = this.dlS.cqV.bZy;
                Double d = this.dlu;
                int i = R.string.confirm;
                robotoTextView.setText(d == null ? R.string.confirm : R.string.submit);
                robotoTextView = this.dlS.cqV.cra;
                ai aiVar = new ai();
                if (this.dlu != null) {
                    i = R.string.pending;
                }
                aiVar = aiVar.jP(context.getString(i).toUpperCase());
                String str = " ";
                robotoTextView.setText(aiVar.jP(str).cs(new ForegroundColorSpan(this.dlb ? this.amj : this.amk)).jP(context.getString(this.dlb ? R.string.buy : R.string.sell).toUpperCase()).aWX().anA());
                if (this.cLb == null && this.cLc == null) {
                    this.dlS.cqV.cri.setText(getContext().getString(R.string.not_set).toUpperCase());
                } else {
                    this.dlS.cqV.cri.setText(new ai().cs(new ForegroundColorSpan(this.cLb == null ? this.aml : this.amj)).jP(this.cLb == null ? getContext().getString(R.string.n_a) : af.r(this.cLb.doubleValue())).aWX().jP(str).cs(new ForegroundColorSpan(this.cLc == null ? this.aml : this.amk)).jP(this.cLc == null ? getContext().getString(R.string.n_a) : af.r(this.cLc.doubleValue())).aWX().anA());
                }
                if (com.iqoption.app.helpers.a.Gs().d(this.anF.getInstrumentType())) {
                    double d2;
                    com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(this.anF.getInstrumentType(), Integer.valueOf(this.anF.getActiveId()));
                    if (a == null) {
                        d2 = 0.0d;
                    } else {
                        d2 = a.c(this.bmw, j.aWI().doubleValue());
                    }
                    if (com.google.common.c.a.b(0.0d, d2, 0.001d)) {
                        this.dlv = this.bmw;
                        this.dlS.cqV.bZs.setText(R.string.free);
                        this.dlS.cqV.bZo.setText(null);
                        this.dlS.cqV.cal.setText(j.a(this.dlv, this.dkQ));
                        this.dlS.cqV.bZu.setVisibility(8);
                        this.dlS.cqV.bZv.setVisibility(8);
                        this.dlS.cqV.bZx.setVisibility(8);
                        this.dlS.cqV.bZt.setClickable(false);
                        this.dlS.cqV.bZt.setOnTouchListener(null);
                    } else {
                        this.dlv = this.bmw + d2;
                        this.dlS.cqV.bZo.setText(j.a(d2, this.dkQ));
                        this.dlS.cqV.cal.setText(j.a(this.dlv, this.dkQ));
                        if (aGf()) {
                            this.dlS.cqV.bZu.setVisibility(0);
                            this.dlS.cqV.bZt.setClickable(true);
                            this.dlS.cqV.bZt.setOnTouchListener(new com.iqoption.view.d.c());
                            c(com.iqoption.app.d.dX("otn_commmision"), d2);
                            com.iqoption.app.managers.e.Hv().Hx();
                        } else {
                            this.dlO = false;
                            this.dlS.cqV.bZu.setVisibility(8);
                            this.dlS.cqV.bZt.setOnTouchListener(null);
                            this.dlS.cqV.bZt.setClickable(false);
                            this.dlS.cqV.bZs.setText(j.d(com.iqoption.app.b.DG().DQ()));
                            this.dlS.cqV.bZv.setVisibility(8);
                            this.dlS.cqV.bZx.setVisibility(8);
                        }
                        this.dlS.cqV.bZs.setVisibility(0);
                    }
                    this.dlS.cqV.bZt.setVisibility(0);
                } else {
                    this.dlS.cqV.bZt.setVisibility(8);
                }
            }
        }
    }

    private void aFP() {
        this.dlv = this.dlt.a(this.bmw, this.anF, this.dlO);
    }

    private void aFN() {
        if (this.dkX.bE(this.dlS.cqV.getRoot())) {
            aFQ();
        } else {
            aFP();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aFL() {
        this.dkX.ak(this.dlS.cqW.getRoot());
        m.a(this.dlU, this.anF.getInstrumentType(), com.iqoption.app.b.DG());
    }

    private void aFY() {
        if (this.dly) {
            if (this.dkX.bE(this.dlS.cqV.getRoot())) {
                aGa();
            } else {
                aFZ();
            }
            k(null);
            aGb();
        }
    }

    private void aFZ() {
        if (this.dly) {
            com.iqoption.gl.c.aIy().setLimitOrder(-1.0d, this.dlb, false);
        }
    }

    private void aGa() {
        if (this.dly && this.dkX.bE(this.dlS.cqV.getRoot())) {
            com.iqoption.gl.c.aIy().setLimitOrder(this.dlu == null ? -1.0d : this.dlu.doubleValue(), this.dlb, true);
        }
    }

    private void aFm() {
        this.dlL.ak(this.dlS.cqW.crE);
    }

    private void aFn() {
        this.dlL.ak(this.dlS.cqW.crC);
    }

    /* Access modifiers changed, original: 0000 */
    public void k(Double d) {
        if (this.dly) {
            if (d == null && this.dlu != null) {
                this.dlS.cqW.crq.setText(R.string.market);
                this.dlS.cqV.crq.setText(R.string.market);
                this.dlS.cqW.crR.animate().alpha(0.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dlS.cqW.crS.animate().alpha(0.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dlS.cqW.cry.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dlS.cqW.crz.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dlS.cqW.crw.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dlS.cqW.crx.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
            } else if (d != null) {
                this.dlS.cqW.crq.setText(String.format(Locale.US, this.mask, new Object[]{d}));
                this.dlS.cqV.crq.setText(String.format(Locale.US, this.mask, new Object[]{d}));
                if (this.dlu == null) {
                    this.dlS.cqW.crR.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dlS.cqW.crS.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dlS.cqW.crw.animate().alpha(0.45f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dlS.cqW.crx.animate().alpha(0.45f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dlS.cqW.cry.clear();
                    this.dlS.cqW.crz.clear();
                    this.dlS.cqW.cry.setText(R.string.pending);
                    this.dlS.cqW.crz.setText(R.string.pending);
                    this.dlS.cqW.cry.animate().alpha(0.45f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dlS.cqW.crz.animate().alpha(0.45f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                }
            }
            this.dlu = d;
            aFQ();
            aGd();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dS(boolean z) {
        this.dlS.cqW.crT.setSelected(z);
        this.dlS.cqV.cro.setSelected(z);
        if (z) {
            this.dlw.gh(1);
            this.dlx.gh(1);
            return;
        }
        aGb();
    }

    /* Access modifiers changed, original: 0000 */
    public void aGb() {
        if (this.dlu == null) {
            this.dlw.gh(0);
            this.dlx.gh(0);
            return;
        }
        this.dlw.gh(2);
        this.dlx.gh(2);
    }

    /* Access modifiers changed, original: 0000 */
    public void dU(boolean z) {
        this.dlS.cqW.crN.setSelected(z);
        if (z) {
            this.dlK.select();
        } else {
            this.dlK.aHN();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dV(boolean z) {
        this.dlS.cqV.crg.setSelected(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void dW(boolean z) {
        this.dlS.cqV.bZt.setSelected(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void dX(boolean z) {
        this.dlS.cqV.bZr.setSelected(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void dR(boolean z) {
        this.dlS.cqV.crl.setSelected(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void dY(boolean z) {
        this.dlS.cqV.bZv.setSelected(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void dZ(boolean z) {
        if (z) {
            this.dlM.start();
        } else {
            this.dlM.stop();
        }
    }

    private void aGk() {
        m.a(this.anF.getInstrumentType(), com.iqoption.app.b.DG());
    }

    private void ea(boolean z) {
        if (z) {
            m.Cr();
        } else {
            m.Cq();
        }
    }

    private Double aFV() {
        return this.cLb != null ? Double.valueOf(com.iqoption.util.ab.g(this.cLb.doubleValue(), 2)) : null;
    }

    private Double aFW() {
        return this.cLc != null ? Double.valueOf(com.iqoption.util.ab.g(-this.cLc.doubleValue(), 2)) : null;
    }

    public void aFg() {
        if (this.anF != null) {
            Balance DN = com.iqoption.app.b.DG().DN();
            ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.anF.getActiveId());
            if (!(DN == null || dY == null)) {
                Boolean valueOf;
                Boolean valueOf2;
                double w = ad.w(Double.valueOf(dY.getAsk(this.anF.getInstrumentType(), this.bBe)));
                double w2 = ad.w(Double.valueOf(dY.getBid(this.anF.getInstrumentType(), this.bBe)));
                double doubleValue = this.dlu != null ? this.dlu.doubleValue() : this.dlb ? w : w2;
                if (this.dlz) {
                    valueOf = Boolean.valueOf(this.dlA == null ? com.iqoption.l.b.aTS().Fn() : this.dlA.booleanValue());
                } else {
                    valueOf = null;
                }
                if (this.cKL) {
                    valueOf2 = Boolean.valueOf(this.dlB == null ? com.iqoption.l.b.aTS().Fo() : this.dlB.booleanValue());
                } else {
                    valueOf2 = null;
                }
                com.iqoption.mobbtech.connect.request.api.a.b.a(this.anF.getActiveId(), this.anF.getInstrumentId(), this.anF.getInstrumentType(), DN.id, (long) DN.type, this.dlb, this.bmw, this.bBe, doubleValue, w, w2, aFV(), aFW(), valueOf, valueOf2, Type.MARKET);
            }
        }
    }
}
