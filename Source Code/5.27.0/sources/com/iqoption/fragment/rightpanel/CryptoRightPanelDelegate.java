package com.iqoption.fragment.rightpanel;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Point;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.google.common.collect.ImmutableMap;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.analytics.m;
import com.iqoption.analytics.o;
import com.iqoption.app.managers.l;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.j;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder.Type;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.af;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.e.xl;
import com.iqoption.fragment.ab;
import com.iqoption.fragment.ah;
import com.iqoption.fragment.i;
import com.iqoption.fragment.y;
import com.iqoption.fragment.z;
import com.iqoption.service.e.k;
import com.iqoption.util.ad;
import com.iqoption.util.ae;
import com.iqoption.util.ai;
import com.iqoption.util.ak;
import com.iqoption.util.n;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Set;

public class CryptoRightPanelDelegate extends EnabledInstrumentDelegate implements com.iqoption.view.a.b.a {
    private static final int[] dmA = new int[]{R.drawable.bitcoin_na, R.drawable.ripple_na, R.drawable.ethereum_na, R.drawable.litecoin_na, R.drawable.iota_na, R.drawable.dash_na, R.drawable.ltcbtc_na, R.drawable.ethbtc_na, R.drawable.iq_coin_na, R.drawable.bitcoin_cash_na, R.drawable.eth_classic_na, R.drawable.monero_na, R.drawable.omise_go_na, R.drawable.santiment_na, R.drawable.z_cash_na, R.drawable.bitcoin_gold_na, R.drawable.stellar_na, R.drawable.neo_na, R.drawable.quantum_na, R.drawable.tron_na, R.drawable.eos_na};
    private static final ImmutableMap<String, com.iqoption.view.CryptoAssetPager.c> dmB;
    private static final Set<String> dmC = new ArraySet();
    private static final Set<String> dmD = new ArraySet();
    private static final String[] dmy = new String[]{"BTCUSD", "XRPUSD", "ETHUSD", "LTCUSD", "IOTUSD", "DSHUSD", "LTCBTC", "ETHBTC", "IQCOIN", "BCHUSD", "ETCUSD", "XMRUSD", "OMGUSD", "SANUSD", "ZECUSD", "BTGUSD", "XLMUSD", "NEOUSD", "QTMUSD", "TRXUSD", "EOSUSD"};
    private static final int[] dmz = new int[]{R.drawable.bitcoin, R.drawable.ripple, R.drawable.ethereum, R.drawable.litecoin, R.drawable.iota, R.drawable.dash, R.drawable.ltcbtc, R.drawable.ethbtc, R.drawable.iq_coin, R.drawable.bitcoin_cash, R.drawable.eth_classic, R.drawable.monero, R.drawable.omise_go, R.drawable.santiment, R.drawable.z_cash, R.drawable.bitcoin_gold, R.drawable.stellar, R.drawable.neo, R.drawable.quantum, R.drawable.tron, R.drawable.eos};
    @ColorInt
    private int amj;
    @ColorInt
    private int amk;
    @ColorInt
    private int aml;
    private double bmw;
    private j cHR;
    private final boolean cKL;
    private volatile Double cLb;
    private volatile Double cLc;
    private final DecimalFormat cXm;
    private r dkW;
    private e dkX;
    private volatile Boolean dlA;
    private volatile Boolean dlB;
    private final DecimalFormat dlH;
    private volatile boolean dlO;
    private final boolean dlP;
    private final boolean dlQ;
    private Builder dlU;
    private boolean dlb;
    private volatile Double dlu;
    private double dlv;
    private s dlw;
    private s dlx;
    private final boolean dly;
    private final boolean dlz;
    private final e dmE;
    private final g dmF;
    private final n dmG;
    private long dmH;
    private String dmI;
    private String dmJ;
    xl dmK;
    private Builder dmL;

    /* renamed from: com.iqoption.fragment.rightpanel.CryptoRightPanelDelegate$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ CryptoRightPanelDelegate dmM;

        public void run() {
            this.dmM.aGv();
        }
    }

    private interface f {
        Animator aGC();

        Animator aGD();

        Interpolator getInterpolator();
    }

    public static final class h {
        private final c dlo;
        private final CryptoRightPanelDelegate dmT;

        public h(CryptoRightPanelDelegate cryptoRightPanelDelegate) {
            this.dmT = cryptoRightPanelDelegate;
            this.dlo = new c(cryptoRightPanelDelegate);
        }

        public void aFv() {
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deal-keyboard_keyboard").setValue(Double.valueOf(com.iqoption.fragment.a.b.b(this.dmT.getFragmentManager(), R.id.fragment, this.dmT.ZC(), this.dmT.aFd()[0]) ? 1.0d : 0.0d)).build());
        }

        public void aFw() {
            CryptoRightPanelDelegate cryptoRightPanelDelegate = this.dmT;
            cryptoRightPanelDelegate.K(cryptoRightPanelDelegate.ZC() - 1.0d);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_deal-minus").build());
        }

        public void aFx() {
            CryptoRightPanelDelegate cryptoRightPanelDelegate = this.dmT;
            cryptoRightPanelDelegate.K(cryptoRightPanelDelegate.ZC() + 1.0d);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_deal-plus").build());
        }

        public void bB(View view) {
            if (this.dmT.aFp() != null) {
                this.dmT.bA(view);
            }
            this.dmT.dQ(true);
            this.dlo.aFB();
        }

        public void bC(View view) {
            if (this.dmT.aFp() != null) {
                this.dmT.bA(view);
            }
            this.dmT.dQ(false);
            this.dlo.aFB();
        }

        public void axC() {
            boolean aFC = this.dlo.aFC();
            if (aFC) {
                this.dmT.showLoading();
            } else {
                this.dmT.aGv();
            }
            this.dmT.aFZ();
            this.dmT.aFK();
            this.dmT.eb(aFC);
            this.dmT.aGk();
        }

        public void aGJ() {
            boolean aFC = this.dlo.aFC();
            this.dmT.aGv();
            if (aFC) {
                this.dmT.aFY();
            }
            this.dmT.aFZ();
            this.dmT.aFK();
            this.dmT.ea(false);
        }

        public void aGK() {
            this.dmT.aGv();
            this.dmT.aFY();
            this.dmT.aFK();
            this.dmT.ea(true);
        }

        public void aGL() {
            this.dmT.aGv();
            this.dmT.aFZ();
            this.dmT.aFK();
            this.dmT.eb(false);
        }

        public void aGM() {
            this.dmT.aGv();
        }

        public void aGN() {
            this.dmT.aGv();
            this.dmT.aGy();
        }

        public void aGm() {
            if (this.dmT.cHR != null) {
                ab.b(this.dmT.getFragmentManager(), this.dmT.cHR.getInstrumentType(), this.dmT.cHR.getActiveId(), this.dmT.dlu, true);
            }
        }

        public void aGn() {
            this.dmT.aFY();
        }

        public void aGo() {
            this.dmT.aFY();
            this.dmT.aGa();
        }

        public void aGp() {
            com.iqoption.dialog.b.b.a(this.dmT.getFragmentManager(), this.dmT.cHR.getActiveId(), this.dmT.cHR.getInstrumentType(), this.dmT.dlb, this.dmT.dlu, this.dmT.cLb, this.dmT.cLc, this.dmT.dlA, 1, this.dmT.bmw, this.dmT.dlB);
            m.Ct();
        }
    }

    private static class a implements f {
        private final View dmO;
        private final View dmP;

        public a(View view, View view2) {
            this.dmO = view;
            this.dmP = view2;
            view.setAlpha(0.0f);
            view.setTranslationY(0.0f);
        }

        public Interpolator getInterpolator() {
            return com.iqoption.view.a.a.c.egR;
        }

        public Animator aGC() {
            return ObjectAnimator.ofFloat(this.dmO, View.ALPHA, new float[]{1.0f});
        }

        public Animator aGD() {
            return ObjectAnimator.ofFloat(this.dmP, View.ALPHA, new float[]{0.0f});
        }
    }

    private static class b implements f {
        private final View dmQ;
        private final View dmR;

        public b(View view, View view2) {
            this.dmQ = view;
            this.dmR = view2;
        }

        public Interpolator getInterpolator() {
            return com.iqoption.view.a.a.c.egR;
        }

        public Animator aGC() {
            View view = this.dmQ;
            r1 = new PropertyValuesHolder[3];
            r1[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            r1[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
            r1[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, r1);
            ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.egR);
            return ofPropertyValuesHolder;
        }

        public Animator aGD() {
            View view = this.dmR;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{(float) this.dmR.getHeight()});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
            ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.bhU);
            return ofPropertyValuesHolder;
        }
    }

    private static class c implements f {
        private final View dmQ;
        private final View dmR;

        public c(View view, View view2) {
            this.dmQ = view;
            this.dmR = view2;
            view2.setAlpha(0.0f);
            view2.setTranslationY((float) view2.getHeight());
        }

        public Interpolator getInterpolator() {
            return com.iqoption.view.a.a.c.egR;
        }

        public Animator aGC() {
            View view = this.dmR;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
            ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.bhT);
            return ofPropertyValuesHolder;
        }

        public Animator aGD() {
            View view = this.dmQ;
            r1 = new PropertyValuesHolder[3];
            r1[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
            r1[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.95f});
            r1[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.95f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, r1);
            ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.egR);
            return ofPropertyValuesHolder;
        }
    }

    private class d implements com.iqoption.fragment.rightpanel.e.a {
        private f dmS;

        private d() {
        }

        /* synthetic */ d(CryptoRightPanelDelegate cryptoRightPanelDelegate, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void i(View view, View view2) {
            if (view2 == CryptoRightPanelDelegate.this.dmK.csj.getRoot()) {
                this.dmS = new c(view2, view);
            } else if (view == CryptoRightPanelDelegate.this.dmK.csj.getRoot()) {
                this.dmS = new b(view, view2);
            } else {
                this.dmS = new a(view, view2);
            }
        }

        public void a(AnimatorSet animatorSet) {
            animatorSet.setInterpolator(this.dmS.getInterpolator());
        }

        public Animator j(View view, View view2) {
            return this.dmS.aGC();
        }

        public Animator k(View view, View view2) {
            return this.dmS.aGD();
        }
    }

    public static final class e extends com.iqoption.system.a.e<CryptoRightPanelDelegate> {
        @com.google.common.b.e
        public void onNativeChangeLimitOrderValueEvent(com.iqoption.gl.NativeHandler.c cVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$L2AlyLExyVPLvX2Yp9rcfHgFqNw(this, cVar));
        }

        @com.google.common.b.e
        public void onChangeLimitOrderValueEvent(com.iqoption.fragment.ab.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$kwiQ0aGNUiQbfSotJOdI7cMjAag(this, aVar));
        }

        @com.google.common.b.e
        public void onShowedPendingEdit(com.iqoption.fragment.ab.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$tBKfuQuhqm3N4M-gDVTijqpmCr0(this, bVar));
        }

        @com.google.common.b.e
        public void onShowedLimitsDialogEvent(com.iqoption.dialog.b.b.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$StVjRFe2KQVpq_ZFzlLfMqClaSk(this, bVar));
        }

        @com.google.common.b.e
        public void onLimitsChangeEvent(com.iqoption.dialog.b.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$SykEB7-56tXWZs5WAXzsOuN6ZQg(this, aVar));
        }

        @com.google.common.b.e
        public void onInitializationCompletedEvent(com.iqoption.app.managers.tab.TabHelper.e eVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$K7DJ8DTuPZ6TXaODKo0q_jnCR_g(this));
        }

        private /* synthetic */ void aGF() {
            CryptoRightPanelDelegate cryptoRightPanelDelegate = (CryptoRightPanelDelegate) this.dUo.get();
            if (cryptoRightPanelDelegate != null) {
                cryptoRightPanelDelegate.aFP();
                cryptoRightPanelDelegate.aFj();
            }
        }

        @com.google.common.b.e
        public void onShowedOtnChanged(com.iqoption.fragment.y.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$8BgKakSvoAJvbVu31Xc_0MuyxTc(this, bVar));
        }

        @com.google.common.b.e
        public void onOtnCommissionChanged(com.iqoption.fragment.y.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$aNWO9Pflj_s67B6i600UD2w6Kqo(this, aVar));
        }

        @com.google.common.b.e
        public void onShowedCommissionInfo(com.iqoption.fragment.g.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$tOgdbQCAIZALCq1PcNDFGQJTMyA(this, aVar));
        }

        @com.google.common.b.e
        public void onShowedOtnRewardInfo(com.iqoption.fragment.z.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$K_Jzr6kqMOU6FLYjrDjCX-HktvQ(this, aVar));
        }

        @com.google.common.b.e
        public void onAmountChangedIQKeyboardEvent(com.iqoption.fragment.a.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$lN4SkueBJwrO0lRS5PUhEHKuqFU(this, aVar));
        }

        @com.google.common.b.e
        public void onShowedIQKeyboardEvent(com.iqoption.fragment.a.b.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$cvNyodAsvjz0229yosjkWkgVNyM(this, bVar));
        }

        @com.google.common.b.e
        public void onShowedVideoPlayerEvent(com.iqoption.fragment.i.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$fHxl7O3hIdXMnmFKv4kjh6noydA(this, bVar));
        }

        @com.google.common.b.e
        public void onShowedVideoPlayerEvent(com.iqoption.fragment.i.a aVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$arNZuEUpybH_tpzBru-YKqVSBm8(this));
        }

        private /* synthetic */ void aGE() {
            CryptoRightPanelDelegate cryptoRightPanelDelegate = (CryptoRightPanelDelegate) this.dUo.get();
            if (cryptoRightPanelDelegate != null) {
                cryptoRightPanelDelegate.aGA();
                cryptoRightPanelDelegate.aGB();
            }
        }

        @com.google.common.b.e
        public void onUpdateCommissionPaidEvent(com.iqoption.app.helpers.a.e eVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$e$Hs1b88nzstX-l9JIsKCiGpi-nxY(this, eVar));
        }
    }

    public static class g extends com.iqoption.system.a.g<CryptoRightPanelDelegate> {
        @com.google.common.b.e
        public void onUpdateBalanceValue(k kVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$g$g8KNuS_TWNBsswluLPKTi0HXlk8(this));
        }

        private /* synthetic */ void aGI() {
            CryptoRightPanelDelegate cryptoRightPanelDelegate = (CryptoRightPanelDelegate) this.dUo.get();
            if (cryptoRightPanelDelegate != null) {
                cryptoRightPanelDelegate.aFN();
                cryptoRightPanelDelegate.aFj();
            }
        }

        @com.google.common.b.e
        public void onChangeCurrentCurrency(com.iqoption.service.e.c cVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$g$sFc2nnVExJpHY_r_tMyL4ACNbxY(this));
        }

        private /* synthetic */ void aGH() {
            CryptoRightPanelDelegate cryptoRightPanelDelegate = (CryptoRightPanelDelegate) this.dUo.get();
            if (cryptoRightPanelDelegate != null) {
                cryptoRightPanelDelegate.aFN();
                cryptoRightPanelDelegate.aFi();
                cryptoRightPanelDelegate.aFj();
            }
        }

        @com.google.common.b.e
        public void onChangeBalanceType(com.iqoption.service.e.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$CryptoRightPanelDelegate$g$n2C1dBG_K0be6Ek0dtGiAPbS7C8(this));
        }

        private /* synthetic */ void aGG() {
            CryptoRightPanelDelegate cryptoRightPanelDelegate = (CryptoRightPanelDelegate) this.dUo.get();
            if (cryptoRightPanelDelegate != null) {
                cryptoRightPanelDelegate.K(cryptoRightPanelDelegate.Fd());
                cryptoRightPanelDelegate.aGe();
                cryptoRightPanelDelegate.aFN();
                cryptoRightPanelDelegate.aFj();
            }
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

    static {
        com.google.common.collect.ImmutableMap.a aVar = new com.google.common.collect.ImmutableMap.a();
        com.google.common.collect.ImmutableMap.a aVar2 = new com.google.common.collect.ImmutableMap.a();
        int i = 0;
        while (true) {
            String[] strArr = dmy;
            if (i < strArr.length) {
                Object obj = strArr[i];
                aVar2.m(obj, new com.iqoption.view.CryptoAssetPager.c(dmz[i], dmA[i]));
                String a = f.a(obj, Locale.getDefault());
                if (a != null) {
                    aVar.m(obj, a);
                    if (com.iqoption.app.d.get(String.format("bumper_for_%s", new Object[]{obj}), true)) {
                        dmC.add(obj);
                    }
                    dmD.add(obj);
                }
                i++;
            } else {
                dmB = aVar2.tf();
                return;
            }
        }
    }

    public void aFf() {
        aGw();
    }

    public void aFt() {
        super.aFt();
        if (aGx()) {
            aGv();
        }
    }

    private Double aFV() {
        return this.cLb != null ? Double.valueOf(com.iqoption.util.ab.g(this.cLb.doubleValue(), 2)) : null;
    }

    private Double aFW() {
        return this.cLc != null ? Double.valueOf(com.iqoption.util.ab.g(-this.cLc.doubleValue(), 2)) : null;
    }

    public void aFg() {
        if (this.cHR != null) {
            Balance DN = com.iqoption.app.b.DG().DN();
            ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.cHR.getActiveId());
            if (!(DN == null || dY == null)) {
                Boolean valueOf;
                Boolean valueOf2;
                double w = ad.w(Double.valueOf(dY.getAsk(this.cHR.getInstrumentType(), 1)));
                double w2 = ad.w(Double.valueOf(dY.getBid(this.cHR.getInstrumentType(), 1)));
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
                com.iqoption.mobbtech.connect.request.api.a.b.a(this.cHR.getActiveId(), this.cHR.getInstrumentId(), this.cHR.getInstrumentType(), DN.id, (long) DN.type, this.dlb, this.bmw, 1, doubleValue, w, w2, aFV(), aFW(), valueOf, valueOf2, Type.MARKET);
            }
        }
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
        return com.iqoption.util.j.ae(getInstrumentType());
    }

    public void onTick(long j) {
        if (!this.dkX.bE(this.dmK.csi.getRoot()) && !this.dkX.bE(this.dmK.csk.getRoot())) {
            aGu();
            if (com.iqoption.util.c.a.d(this.cHR, j)) {
                aGd();
            } else {
                bM(j);
            }
            if (this.dpm) {
                if (l.HZ().Ie()) {
                    RightPanelDelegate.bH(this.dmK.csj.crA);
                    RightPanelDelegate.bH(this.dmK.csj.crB);
                } else {
                    RightPanelDelegate.bI(this.dmK.csj.crA);
                    RightPanelDelegate.bI(this.dmK.csj.crB);
                }
            }
        }
    }

    private void aGd() {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.cHR.getActiveId());
        if (dY != null) {
            InstrumentType instrumentType = getInstrumentType();
            if (this.dkX.bE(this.dmK.csh.getRoot())) {
                this.dmK.csh.cso.h(this.dmJ, this.bmw / (this.dlu == null ? dY.getAskPrice(instrumentType, 1) : com.iqoption.util.j.v(this.dlu).doubleValue()));
                return;
            }
            this.dmK.csj.crW.h(this.dmI, dY.getSpread(instrumentType, 1));
            if (this.dlu == null) {
                this.dmK.csj.cry.h(this.dmI, dY.getAsk(instrumentType, 1));
                this.dmK.csj.crz.h(this.dmI, dY.getBid(instrumentType, 1));
                return;
            }
            return;
        }
        this.dmK.csj.crW.setText(null);
        this.dmK.csj.cry.clear();
        this.dmK.csj.crz.clear();
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        this.dmK = (xl) DataBindingUtil.inflate(layoutInflater, R.layout.right_panel_delegate_crypto, viewGroup, false);
        this.dmK.csf.setIconsMap(dmB);
        this.dmK.csh.crb.setLayoutTransition(ak.anP());
        this.dkW = new r(this.dmK.csj.csb, this.dmK.csj.crs);
        this.dlw = new s(this.dmK.csj.crn, this.dmK.csj.crq, this.dmK.csj.crF);
        this.dlx = new s(this.dmK.csh.crn, this.dmK.csh.crq, this.dmK.csh.cqZ, getContext().getResources().getDimension(R.dimen.dp46));
        this.dkX = new e(new d(this, null), this.dmK.csj.getRoot(), this.dmK.csh.getRoot(), this.dmK.csi.getRoot(), this.dmK.csk.getRoot(), this.dmK.csg.getRoot());
        int i = this.dly ? 0 : 8;
        this.dmK.csj.crT.setVisibility(i);
        this.dmK.csh.cro.setVisibility(i);
        aFY();
        final h hVar = new h(this);
        AnonymousClass2 anonymousClass2 = new com.iqoption.view.d.b() {
            public void M(View view) {
                switch (view.getId()) {
                    case R.id.amountLayout /*2131361900*/:
                        hVar.aFv();
                        return;
                    case R.id.amountMinus /*2131361901*/:
                        hVar.aFw();
                        return;
                    case R.id.amountPlus /*2131361903*/:
                        hVar.aFx();
                        return;
                    case R.id.btnHideLoading /*2131362062*/:
                        hVar.aGM();
                        return;
                    case R.id.btnHideSuccess /*2131362063*/:
                        hVar.aGN();
                        return;
                    case R.id.buttonCall /*2131362103*/:
                        hVar.bB(view);
                        return;
                    case R.id.buttonPut /*2131362115*/:
                        hVar.bC(view);
                        return;
                    case R.id.cancelPendingOrder /*2131362161*/:
                        hVar.aGn();
                        return;
                    case R.id.cancelSubmitPendingOrder /*2131362162*/:
                        hVar.aGo();
                        return;
                    case R.id.limitsLayoutConfirm /*2131363201*/:
                        hVar.aGp();
                        return;
                    case R.id.pendingLayout /*2131363527*/:
                        hVar.aGm();
                        return;
                    case R.id.pendingLayoutConfirm /*2131363528*/:
                        hVar.aGm();
                        m.Cu();
                        return;
                    default:
                        return;
                }
            }
        };
        this.dmK.csh.bZy.setOnClickListener(new com.iqoption.view.d.b(1000) {
            public void M(View view) {
                if (CryptoRightPanelDelegate.this.dlu == null) {
                    hVar.axC();
                } else {
                    hVar.aGJ();
                }
            }
        });
        this.dmK.csh.cqX.setOnClickListener(new com.iqoption.view.d.b(1000) {
            public void M(View view) {
                if (CryptoRightPanelDelegate.this.dlu == null) {
                    hVar.aGL();
                } else {
                    hVar.aGK();
                }
            }
        });
        this.dmK.csj.crT.setOnClickListener(anonymousClass2);
        this.dmK.csj.crF.setOnClickListener(anonymousClass2);
        this.dmK.csh.cqZ.setOnClickListener(anonymousClass2);
        this.dmK.csh.cro.setOnClickListener(anonymousClass2);
        this.dmK.csh.crg.setOnClickListener(anonymousClass2);
        this.dmK.csj.crA.setOnClickListener(anonymousClass2);
        this.dmK.csj.crB.setOnClickListener(anonymousClass2);
        this.dmK.csj.crt.setOnClickListener(anonymousClass2);
        this.dmK.csi.csp.setOnClickListener(anonymousClass2);
        this.dmK.csk.csq.setOnClickListener(anonymousClass2);
        this.dmK.csf.setActives(com.iqoption.app.helpers.a.Gs().a(InstrumentType.CRYPTO_INSTRUMENT, false));
        this.dmK.csf.setSelectedAsset(this.cHR.getActiveId());
        this.dmK.csf.setAssetChangeListener(new com.iqoption.view.CryptoAssetPager.f() {
            public void e(@NonNull j jVar) {
                if (!ae.equals(CryptoRightPanelDelegate.this.cHR, jVar)) {
                    TabHelper.IM().t(jVar);
                    o.a(jVar);
                }
            }
        });
        this.dmK.csf.setAssetClickListener(new com.iqoption.view.CryptoAssetPager.g() {
            public void f(@NonNull j jVar) {
                if (f.a(jVar.getInstrumentId(), Locale.getDefault()) != null) {
                    i.a(CryptoRightPanelDelegate.this.aFs(), CryptoRightPanelDelegate.this.getFragmentManager(), jVar.getActiveId(), CryptoRightPanelDelegate.this.dmK.csf.getCoinRect());
                }
                o.c(jVar);
            }
        });
        this.dmK.csh.bZv.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                Point ai = ak.ai(view);
                z.a(CryptoRightPanelDelegate.this.getFragmentManager(), R.id.fragment, ai.x, ai.y);
            }
        });
        this.dmK.csh.bZq.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                Point ai = ak.ai(view);
                com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(CryptoRightPanelDelegate.this.cHR.getInstrumentType(), Integer.valueOf(CryptoRightPanelDelegate.this.cHR.getActiveId()));
                com.iqoption.fragment.g.a(CryptoRightPanelDelegate.this.getFragmentManager(), R.id.fragment, ai.x, ai.y, CryptoRightPanelDelegate.this.dlH.format(a == null ? 0.0d : a.d(CryptoRightPanelDelegate.this.bmw, com.iqoption.util.j.aWI().doubleValue())));
            }
        });
        this.dmK.csh.bZt.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                double d;
                com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(CryptoRightPanelDelegate.this.cHR.getInstrumentType(), Integer.valueOf(CryptoRightPanelDelegate.this.cHR.getActiveId()));
                if (a == null) {
                    d = 0.0d;
                } else {
                    d = a.c(CryptoRightPanelDelegate.this.bmw, com.iqoption.util.j.aWI().doubleValue());
                }
                if (!com.google.common.c.a.b(0.0d, d, 0.001d)) {
                    Point ai = ak.ai(view);
                    y.a(CryptoRightPanelDelegate.this.aFs(), CryptoRightPanelDelegate.this.getFragmentManager(), R.id.fragment, ai.x, ai.y, d);
                    m.Cs();
                }
            }
        });
        K(Fd());
        aGe();
        aGu();
        return this.dmK.getRoot();
    }

    private void aFK() {
        this.cLb = null;
        this.cLc = null;
        this.dlA = null;
        this.dlB = null;
    }

    private void a(Double d, Double d2, Boolean bool, boolean z) {
        this.cLb = d;
        this.cLc = d2;
        this.dlA = bool;
        this.dlB = Boolean.valueOf(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void T(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super.T(aVar);
        this.dmK.csf.setSelectedAsset(aVar.getActiveId());
        d((j) aVar);
        aGe();
        aGv();
        aFK();
        aFY();
        aFN();
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        super.destroy();
        this.dmE.unregister();
        this.dmF.unregister();
        this.dmG.cancel();
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
    }

    private void d(@NonNull j jVar) {
        this.cHR = jVar;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("%.");
        stringBuilder.append(jVar.getPrecision());
        stringBuilder.append("f");
        this.dmI = stringBuilder.toString();
        this.dmJ = "%.4f";
        aGu();
    }

    private void aGu() {
        if (this.dmK != null) {
            long Ib = l.HZ().Ib();
            if (com.iqoption.util.c.a.d(this.cHR, Ib)) {
                if (this.dkX.bE(this.dmK.csg.getRoot())) {
                    bG(this.dmK.csj.getRoot());
                }
            } else if (!this.dkX.bE(this.dmK.csg.getRoot())) {
                bG(this.dmK.csg.getRoot());
                this.dmH = this.cHR.aY(Ib);
                bM(Ib);
            }
        }
    }

    private void bM(long j) {
        if (this.dmH == Long.MAX_VALUE) {
            this.dmK.csg.csm.setVisibility(8);
            return;
        }
        this.dmK.csg.csm.setVisibility(0);
        this.dmK.csg.csm.setText(TimeUtil.r(j, this.dmH));
    }

    private void K(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        this.bmw = d;
        aFP();
        aFi();
        aFj();
    }

    private void aFi() {
        this.dmK.csj.csb.setText(com.iqoption.util.j.a(this.bmw, this.dkQ));
    }

    private void aFj() {
        if (this.dmK != null) {
            double doubleValue = com.iqoption.app.b.DG().DI().doubleValue();
            double[] aFd = aFd();
            double d = this.dlv;
            if (d > doubleValue || d > aFd[1] || d < aFd[0]) {
                this.dmK.csj.csb.setTextColor(this.amk);
            } else {
                this.dmK.csj.csb.setTextColor(this.aml);
            }
        }
    }

    private void dP(boolean z) {
        this.dmK.csj.cru.setSelected(z);
        this.dmK.csj.crt.setSelected(z);
        if (z) {
            this.dkW.select();
        } else {
            this.dkW.aHN();
        }
    }

    private void bG(View view) {
        this.dkX.ak(view);
        if (view == this.dmK.csh.getRoot()) {
            this.dmK.csf.animate().alpha(0.0f).setDuration(400).setInterpolator(com.iqoption.view.a.a.c.egR).setListener(com.iqoption.view.a.a.a.a.cf(this.dmK.csf)).start();
        } else if (this.dmK.csf.getAlpha() < 1.0f) {
            this.dmK.csf.animate().alpha(1.0f).setDuration(400).setInterpolator(com.iqoption.view.a.a.c.egR).setListener(com.iqoption.view.a.a.a.a.cg(this.dmK.csf)).start();
        }
    }

    private void aGv() {
        bG(this.dmK.csj.getRoot());
    }

    private void aFY() {
        if (this.dly) {
            if (this.dkX.bE(this.dmK.csh.getRoot())) {
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
        if (this.dly && this.dkX.bE(this.dmK.csh.getRoot())) {
            com.iqoption.gl.c.aIy().setLimitOrder(this.dlu == null ? -1.0d : this.dlu.doubleValue(), this.dlb, true);
        }
    }

    private void aGw() {
        this.dmL = m.Cp();
        this.dlU = m.Cv();
        bG(this.dmK.csh.getRoot());
        aGd();
        aFQ();
        aGa();
    }

    private void aFQ() {
        if (this.dkX.bE(this.dmK.csh.getRoot())) {
            this.dmK.csh.csn.setText(com.iqoption.util.j.a(this.bmw, this.dkQ));
            Context context = getContext();
            this.dmK.csh.bZy.setBackgroundResource(this.dlb ? R.drawable.btn_green_background : R.drawable.btn_red_background);
            RobotoTextView robotoTextView = this.dmK.csh.bZy;
            Double d = this.dlu;
            int i = R.string.confirm;
            robotoTextView.setText(d == null ? R.string.confirm : R.string.submit);
            robotoTextView = this.dmK.csh.cra;
            ai aiVar = new ai();
            if (this.dlu != null) {
                i = R.string.pending;
            }
            aiVar = aiVar.jP(context.getString(i).toUpperCase());
            String str = " ";
            robotoTextView.setText(aiVar.jP(str).cs(this.dlb ? new ForegroundColorSpan(ContextCompat.getColor(context, R.color.green)) : new ForegroundColorSpan(ContextCompat.getColor(context, R.color.red))).jP(context.getString(this.dlb ? R.string.buy : R.string.sell).toUpperCase()).aWX().anA());
            if (this.cLb == null && this.cLc == null) {
                this.dmK.csh.cri.setText(getContext().getString(R.string.not_set).toUpperCase());
            } else {
                this.dmK.csh.cri.setText(new ai().cs(new ForegroundColorSpan(this.cLb == null ? this.aml : this.amj)).jP(this.cLb == null ? getContext().getString(R.string.n_a) : af.r(this.cLb.doubleValue())).aWX().jP(str).cs(new ForegroundColorSpan(this.cLc == null ? this.aml : this.amk)).jP(this.cLc == null ? getContext().getString(R.string.n_a) : af.r(this.cLc.doubleValue())).aWX().anA());
            }
            if (com.iqoption.app.helpers.a.Gs().d(this.cHR.getInstrumentType())) {
                double d2;
                com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(this.cHR.getInstrumentType(), Integer.valueOf(this.cHR.getActiveId()));
                if (a == null) {
                    d2 = 0.0d;
                } else {
                    d2 = a.c(this.bmw, com.iqoption.util.j.aWI().doubleValue());
                }
                if (com.google.common.c.a.b(0.0d, d2, 0.001d)) {
                    this.dlv = this.bmw;
                    this.dmK.csh.bZs.setText(R.string.free);
                    this.dmK.csh.bZo.setText(null);
                    this.dmK.csh.cal.setText(com.iqoption.util.j.a(this.dlv, this.dkQ));
                    this.dmK.csh.bZu.setVisibility(8);
                    this.dmK.csh.bZv.setVisibility(8);
                    this.dmK.csh.bZx.setVisibility(8);
                    this.dmK.csh.bZt.setClickable(false);
                    this.dmK.csh.bZt.setOnTouchListener(null);
                } else {
                    this.dlv = this.bmw + d2;
                    this.dmK.csh.bZo.setText(com.iqoption.util.j.a(d2, this.dkQ));
                    this.dmK.csh.cal.setText(com.iqoption.util.j.a(this.dlv, this.dkQ));
                    if (aGf()) {
                        this.dmK.csh.bZu.setVisibility(0);
                        this.dmK.csh.bZt.setClickable(true);
                        this.dmK.csh.bZt.setOnTouchListener(new com.iqoption.view.d.c());
                        c(com.iqoption.app.d.dX("otn_commmision"), d2);
                        com.iqoption.app.managers.e.Hv().Hx();
                    } else {
                        this.dlO = false;
                        this.dmK.csh.bZu.setVisibility(8);
                        this.dmK.csh.bZt.setOnTouchListener(null);
                        this.dmK.csh.bZt.setClickable(false);
                        this.dmK.csh.bZs.setText(com.iqoption.util.j.d(com.iqoption.app.b.DG().DQ()));
                        this.dmK.csh.bZv.setVisibility(8);
                        this.dmK.csh.bZx.setVisibility(8);
                    }
                    this.dmK.csh.bZs.setVisibility(0);
                }
                this.dmK.csh.bZt.setVisibility(0);
                return;
            }
            this.dmK.csh.bZt.setVisibility(8);
        }
    }

    private void aFP() {
        double d = this.bmw;
        if (this.cHR != null && com.iqoption.app.helpers.a.Gs().d(this.cHR.getInstrumentType())) {
            double d2;
            com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(this.cHR.getInstrumentType(), Integer.valueOf(this.cHR.getActiveId()));
            if (a == null) {
                d2 = 0.0d;
            } else {
                d2 = a.c(d, com.iqoption.util.j.aWI().doubleValue());
            }
            if (!com.google.common.c.a.b(0.0d, d2, 0.001d)) {
                if (this.dlO) {
                    com.iqoption.app.b DG = com.iqoption.app.b.DG();
                    Balance DM = DG.DM();
                    ConversionCurrency DQ = DG.DQ();
                    ConversionCurrency du = DG.du(Currencies.OTN_CURRENCY);
                    double doubleValue = com.iqoption.util.j.b(DQ).doubleValue();
                    double doubleValue2 = com.iqoption.util.j.b(com.iqoption.util.j.c(Double.valueOf(Balance.getBalanceValue(DM)), Double.valueOf(com.iqoption.util.j.b(du).doubleValue())), Double.valueOf(doubleValue)).doubleValue() - d2;
                    if (doubleValue2 < 0.0d) {
                        d += Math.abs(doubleValue2);
                    }
                }
                d += d2;
            }
        }
        this.dlv = d;
    }

    private void aFN() {
        if (this.dkX.bE(this.dmK.csh.getRoot())) {
            aFQ();
        } else {
            aFP();
        }
    }

    private void aGe() {
        boolean z = aGf() && com.iqoption.app.d.dX("otn_commmision");
        this.dlO = z;
    }

    private boolean aGf() {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        Object obj = DG.DJ() == 1 ? 1 : null;
        if ((DG.DM() != null ? 1 : null) == null || obj == null || !this.dlQ) {
            return false;
        }
        return true;
    }

    private void c(boolean z, double d) {
        double doubleValue;
        CharSequence d2;
        boolean z2;
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        ConversionCurrency DQ = DG.DQ();
        double doubleValue2 = com.iqoption.util.j.b(DQ).doubleValue();
        double d3 = 0.0d;
        if (z) {
            Balance DM = DG.DM();
            ConversionCurrency du = DG.du(Currencies.OTN_CURRENCY);
            String c = com.iqoption.util.j.c(DQ);
            String c2 = com.iqoption.util.j.c(du);
            double doubleValue3 = com.iqoption.util.j.b(du).doubleValue();
            doubleValue = com.iqoption.util.j.b(com.iqoption.util.j.c(Double.valueOf(Balance.getBalanceValue(DM)), Double.valueOf(doubleValue3)), Double.valueOf(doubleValue2)).doubleValue() - d;
            if (com.google.common.c.a.b(Math.abs(doubleValue), d, 0.001d)) {
                d2 = com.iqoption.util.j.d(DQ);
                z2 = false;
            } else {
                String a;
                if (doubleValue > 0.0d) {
                    a = com.iqoption.util.j.a(c2, Double.valueOf(com.iqoption.util.j.b(com.iqoption.util.j.c(Double.valueOf(d), Double.valueOf(doubleValue2)), Double.valueOf(doubleValue3)).doubleValue()), this.cXm);
                } else {
                    a = com.iqoption.util.j.a(c, Double.valueOf(Math.abs(doubleValue)), this.dkQ);
                    double doubleValue4 = com.iqoption.util.j.b(com.iqoption.util.j.c(Double.valueOf(d - Math.abs(doubleValue)), Double.valueOf(doubleValue2)), Double.valueOf(doubleValue3)).doubleValue();
                    a = String.format(Locale.US, "%s + %s", new Object[]{com.iqoption.util.j.a(c2, Double.valueOf(doubleValue4), this.cXm), a});
                }
                d2 = a;
                z2 = z;
            }
        } else {
            d2 = com.iqoption.util.j.d(DQ);
            z2 = z;
            doubleValue = d;
        }
        if (this.dlP) {
            Double l = com.iqoption.app.managers.e.Hv().l(doubleValue2);
            if (z2 || l == null || l.doubleValue() <= 0.0d || Math.abs(doubleValue) <= 0.0d) {
                this.dmK.csh.bZv.setVisibility(8);
                this.dmK.csh.bZx.setVisibility(8);
            } else {
                this.dmK.csh.bZw.setText(this.cXm.format(Math.abs(doubleValue) * l.doubleValue()));
                this.dmK.csh.bZv.setVisibility(0);
                this.dmK.csh.bZx.setVisibility(0);
            }
        }
        this.dlO = z2;
        double d4 = this.bmw;
        if (doubleValue <= 0.0d || !z2) {
            d3 = Math.abs(doubleValue);
        }
        this.dlv = d4 + d3;
        this.dmK.csh.cal.setText(com.iqoption.util.j.a(this.dlv, this.dkQ));
        this.dmK.csh.bZs.setText(d2);
    }

    private void dT(boolean z) {
        double d;
        com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(this.cHR.getInstrumentType(), Integer.valueOf(this.cHR.getActiveId()));
        if (a == null) {
            d = 0.0d;
        } else {
            d = a.c(this.bmw, com.iqoption.util.j.aWI().doubleValue());
        }
        c(z, d);
    }

    private void showLoading() {
        bG(this.dmK.csi.getRoot());
    }

    private boolean aGx() {
        return this.dkX.bE(this.dmK.csi.getRoot());
    }

    private void aGy() {
        this.dmG.cancel();
    }

    private void dQ(boolean z) {
        this.dlb = z;
        int Er = com.iqoption.app.b.DG().Er() ^ 1;
        if (z) {
            if (Er != 0) {
                this.dmK.csk.cst.setText(R.string.you_have_just_bought);
            } else {
                this.dmK.csk.cst.setText(R.string.you_have_invested_in);
            }
        } else if (Er != 0) {
            this.dmK.csk.cst.setText(R.string.you_have_just_sold);
        } else {
            this.dmK.csk.cst.setText(R.string.you_have_invested_in);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void k(Double d) {
        if (this.dly) {
            if (d == null && this.dlu != null) {
                this.dmK.csj.crq.setText(R.string.market);
                this.dmK.csh.crq.setText(R.string.market);
                this.dmK.csj.crR.animate().alpha(0.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dmK.csj.crS.animate().alpha(0.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dmK.csj.cry.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dmK.csj.crz.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dmK.csj.crw.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                this.dmK.csj.crx.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
            } else if (d != null) {
                this.dmK.csj.crq.setText(String.format(Locale.US, this.dmI, new Object[]{d}));
                this.dmK.csh.crq.setText(String.format(Locale.US, this.dmI, new Object[]{d}));
                if (this.dlu == null) {
                    this.dmK.csj.crR.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dmK.csj.crS.animate().alpha(1.0f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dmK.csj.crw.animate().alpha(0.45f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dmK.csj.crx.animate().alpha(0.45f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dmK.csj.cry.clear();
                    this.dmK.csj.crz.clear();
                    this.dmK.csj.cry.setText(R.string.pending);
                    this.dmK.csj.crz.setText(R.string.pending);
                    this.dmK.csj.cry.animate().alpha(0.45f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                    this.dmK.csj.crz.animate().alpha(0.45f).setDuration(200).setInterpolator(com.iqoption.view.a.a.c.egR);
                }
            }
            this.dlu = d;
            aGd();
            aFQ();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dS(boolean z) {
        this.dmK.csj.crT.setSelected(z);
        this.dmK.csh.cro.setSelected(z);
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
    public void dV(boolean z) {
        this.dmK.csh.crg.setSelected(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void dW(boolean z) {
        this.dmK.csh.bZt.setSelected(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void dX(boolean z) {
        this.dmK.csh.bZp.setSelected(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void dY(boolean z) {
        this.dmK.csh.bZv.setSelected(z);
    }

    private void aGz() {
        this.dmK.csf.aXT();
    }

    private void aGA() {
        this.dmK.csf.aLa();
    }

    private void aGB() {
        com.iqoption.app.d.i(String.format("bumper_for_%s", new Object[]{this.cHR.getInstrumentId()}), false);
        dmC.remove(r0);
        this.dmK.csf.setBumperedAssets(dmC);
    }

    private void ea(boolean z) {
        if (z) {
            m.Cr();
        } else {
            m.Cq();
        }
    }

    private void eb(boolean z) {
        String d;
        m.aF(z);
        if (this.dlO) {
            d = com.iqoption.util.j.d(com.iqoption.app.b.DG().du(Currencies.OTN_CURRENCY));
        } else {
            d = com.iqoption.util.j.d(com.iqoption.app.b.DG().DQ());
        }
        m.a(this.dmL, d, aFh() ? Order.BUY : Order.SELL);
        m.a(this.dlU, this.cHR.getInstrumentType(), com.iqoption.app.b.DG());
    }

    private void aGk() {
        m.a(this.cHR.getInstrumentType(), com.iqoption.app.b.DG());
    }

    @Nullable
    public InstrumentType getInstrumentType() {
        j jVar = this.cHR;
        return jVar != null ? jVar.instrumentType : null;
    }
}
