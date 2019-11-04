package com.iqoption.gl;

import android.content.SharedPreferences;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.common.base.Predicates;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aj;
import com.google.common.primitives.Longs;
import com.google.gson.JsonObject;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.gl.DefaultChartCallback;
import com.iqoption.core.util.u;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.instruments.strikes.StrikeSelectionMode;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.TYPE_REMOVE_GROUP;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.MusicUtil;
import com.iqoption.util.MusicUtil.Sound;
import com.iqoption.util.w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NativeHandler extends DefaultChartCallback {
    private static final String TAG = "com.iqoption.gl.NativeHandler";
    private static final com.google.common.base.n<NativeHandler> nativeHandlerSupplier = Suppliers.a(-$$Lambda$NativeHandler$EF5ze1zAA4_8L6kgDTL8NuyA_ts.INSTANCE);
    private com.google.common.base.n<com.iqoption.core.gl.a> activeIdResolverSupplier = Suppliers.a(-$$Lambda$NativeHandler$ITTvrRY-GbBX8aztp3Y4r2IN01Y.INSTANCE);
    private Map<String, Builder> eventMap = new HashMap();
    private final j handlerEvent = new j();
    private com.iqoption.view.d.a<String> onAskForSelling = new com.iqoption.view.d.a<String>() {
        /* renamed from: iC */
        public void ca(String str) {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$2$cncv_wyE94-JWFtlZamnmPez2Bs(str));
        }

        private static /* synthetic */ void iD(String str) {
            Object[] parsePositionSplitId = Position.parsePositionSplitId(str);
            Long l = (Long) parsePositionSplitId[0];
            com.iqoption.mobbtech.connect.response.options.b a = com.iqoption.app.managers.c.GS().a((com.iqoption.mobbtech.connect.response.options.d) parsePositionSplitId[1]);
            if (a != null) {
                aj sK = a.aPX().iterator();
                while (sK.hasNext()) {
                    com.iqoption.mobbtech.connect.response.options.c cVar = (com.iqoption.mobbtech.connect.response.options.c) sK.next();
                    if (cVar.getId().equals(l)) {
                        if (!com.iqoption.mobbtech.connect.request.api.a.a.y(l)) {
                            IQApp.Ex().bd(new a((Position) cVar));
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    };
    private l onPriceAlertChangeListener;
    private com.iqoption.view.d.a<String> onSellClick = new com.iqoption.view.d.a<String>() {
        /* renamed from: iC */
        public void ca(String str) {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$1$Md-2KsZfe6mnKuycBLHq9oqn1Xo(str));
        }

        private static /* synthetic */ void iD(String str) {
            Object[] parsePositionSplitId = Position.parsePositionSplitId(str);
            Long l = (Long) parsePositionSplitId[0];
            com.iqoption.mobbtech.connect.response.options.b a = com.iqoption.app.managers.c.GS().a((com.iqoption.mobbtech.connect.response.options.d) parsePositionSplitId[1]);
            if (a != null) {
                aj sK = a.aPX().iterator();
                while (sK.hasNext()) {
                    com.iqoption.mobbtech.connect.response.options.c cVar = (com.iqoption.mobbtech.connect.response.options.c) sK.next();
                    if (cVar.getId().equals(l)) {
                        if (!com.iqoption.mobbtech.connect.request.api.a.a.y(l)) {
                            com.iqoption.mobbtech.connect.request.api.a.b.k((Position) cVar);
                            String str2 = "expiration_time";
                            String str3 = "balance_type_id";
                            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_sell-from-graph").setParameters(u.anp().o("instrument_type", cVar.getInstrumentType()).o(str2, Long.valueOf(cVar.getExpired())).o(str3, Integer.valueOf(Balance.getBalanceType(com.iqoption.app.b.DG().f(Long.valueOf(cVar.getUserBalanceId()))))).anr()).build());
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    };
    public final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();

    public static class a {
        public final Position position;

        public a(Position position) {
            this.position = position;
        }
    }

    public static class b {
    }

    public static class e {
        public final String drD;
        public final InstrumentType instrumentType;

        public e(InstrumentType instrumentType, String str) {
            this.instrumentType = instrumentType;
            this.drD = str;
        }
    }

    public static class f {
    }

    private static final class k {
        private static k drE = new k();
        private final SharedPreferences asQ = IQApp.Eu().getSharedPreferences("gl_pref_name", 0);

        k() {
        }

        static void c(String str, boolean z) {
            drE.asQ.edit().putBoolean(str, z).apply();
        }

        static boolean getBoolean(String str, boolean z) {
            return drE.asQ.getBoolean(str, z);
        }
    }

    public interface l {
        void L(double d);
    }

    public static class o {
        public final double drF;
        public final double drG;
        public final double drH;

        public o(double d, double d2, double d3) {
            this.drF = d;
            this.drG = d2;
            this.drH = d3;
        }
    }

    public static class p {
        public final int activeId;
        public final boolean bAP;
        public final String drI;
        public final long expiration;
        public final String id;

        public p(int i, long j, String str, String str2, boolean z) {
            this.activeId = i;
            this.expiration = j;
            this.drI = str;
            this.id = str2;
            this.bAP = z;
        }
    }

    public static class q {
        public String drJ;

        q(String str) {
            this.drJ = str;
        }
    }

    public static class r {
    }

    public static class s {
        public boolean blS;
        public String drK;
        public int drL;
        public int type;

        public s(String str, int i, boolean z, int i2) {
            this.drK = str;
            this.drL = i;
            this.blS = z;
            this.type = i2;
        }
    }

    private static class j extends com.iqoption.system.a.d {
        private j() {
        }

        /* synthetic */ j(AnonymousClass1 anonymousClass1) {
            this();
        }

        @com.google.common.b.e
        public void oHiLowChartChanged(com.iqoption.l.a.d dVar) {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$j$LbFPheuuNELVCXqkgw_lOQe_zpQ(dVar));
        }

        @com.google.common.b.e
        public void onOpenOptionGroups(com.iqoption.mobbtech.connect.response.options.OptionEvents.m mVar) {
            NativeHandler.instance().singleThreadExecutor.execute(-$$Lambda$NativeHandler$j$UEfJge63m0bF9FAnrrMlDsLky8k.INSTANCE);
        }

        private static /* synthetic */ void aIA() {
            c.aIy().clearBets();
            c.aIy().clearPositions();
            c.aIy().clearOrders();
            c.aIy().clearVisibleUnits();
        }

        @com.google.common.b.e
        public void onNewOpenOptionGroup(com.iqoption.mobbtech.connect.response.options.OptionEvents.h hVar) {
            if (hVar.dJr != null) {
                NativeHandler.instance().singleThreadExecutor.execute(new -$$Lambda$NativeHandler$j$mvx22fgk2Lnmt41_1cskp4k4Yt8(hVar));
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupOptionAdded(com.iqoption.mobbtech.connect.response.options.OptionEvents.i iVar) {
            if (iVar.dJt != null) {
                NativeHandler.instance().singleThreadExecutor.execute(new -$$Lambda$NativeHandler$j$KrYx2Bt7p-qbsxzlGOYnPFAwZCk(iVar));
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupOptionRemoved(com.iqoption.mobbtech.connect.response.options.OptionEvents.j jVar) {
            if (jVar.dJu != null) {
                NativeHandler.instance().singleThreadExecutor.execute(new -$$Lambda$NativeHandler$j$syr7Rk9RVuFD_thVzpAb5wdgRRw(jVar));
            }
        }

        @com.google.common.b.e
        public void onOpenOptionGroupRemoved(com.iqoption.mobbtech.connect.response.options.OptionEvents.k kVar) {
            if (kVar.dJv != null) {
                NativeHandler.instance().singleThreadExecutor.execute(new -$$Lambda$NativeHandler$j$5U6pQau2mXNbHFl5R9nBNfvWZUw(kVar));
            }
        }

        private static /* synthetic */ void b(com.iqoption.mobbtech.connect.response.options.OptionEvents.k kVar) {
            com.iqoption.mobbtech.connect.response.options.OptionEvents.k kVar2 = kVar;
            Object aPX = kVar2.dJv.aPX();
            switch (kVar2.dJv.instrumentType) {
                case TURBO_INSTRUMENT:
                case BINARY_INSTRUMENT:
                    if (kVar2.dJw != TYPE_REMOVE_GROUP.EXPIRED && kVar2.dJw != TYPE_REMOVE_GROUP.HOVERING) {
                        com.iqoption.app.managers.c.d((ImmutableList) aPX);
                        break;
                    } else {
                        com.iqoption.app.managers.c.c((ImmutableList) aPX);
                        break;
                    }
                    break;
                case MULTI_INSTRUMENT:
                case DIGITAL_INSTRUMENT:
                case FX_INSTRUMENT:
                case FOREX_INSTRUMENT:
                case CFD_INSTRUMENT:
                case CRYPTO_INSTRUMENT:
                    aj sK = aPX.iterator();
                    while (sK.hasNext()) {
                        Position position = (Position) ((com.iqoption.mobbtech.connect.response.options.c) sK.next());
                        com.iqoption.app.managers.c.g(position);
                        ImmutableList k = com.iqoption.app.managers.c.GS().k(position.getId());
                        if (k != null) {
                            aj sK2 = k.iterator();
                            while (sK2.hasNext()) {
                                com.iqoption.app.managers.c.k((Order) sK2.next());
                            }
                        }
                    }
                    break;
            }
            if (kVar2.dJv.instrumentType.isOption() && !com.iqoption.l.b.aTS().aTV()) {
                return;
            }
            if (!kVar2.dJv.instrumentType.isForexOrCFDorCrypto() || com.iqoption.l.b.aTS().aTW()) {
                boolean k2;
                String[] strArr;
                Object obj = kVar2.dJw == TYPE_REMOVE_GROUP.EXPIRED ? 1 : null;
                if (obj == null) {
                    String[] strArr2 = (String[]) com.google.common.collect.i.b(kVar2.dJv.aPX()).a(com.iqoption.mobbtech.connect.response.options.c.getIdSplitString).c(String.class);
                    k2 = com.iqoption.mobbtech.connect.request.api.a.b.k((ImmutableList) aPX);
                    strArr = strArr2;
                } else {
                    strArr = null;
                    k2 = false;
                }
                if (obj != null || k2) {
                    com.iqoption.core.microservices.tradingengine.response.active.a b = com.iqoption.app.helpers.a.Gs().b(Integer.valueOf(kVar2.dJv.activeId), kVar2.dJv.instrumentType);
                    String B = b != null ? com.iqoption.core.microservices.tradingengine.response.active.d.B(b) : "";
                    double investSum = kVar2.dJv.getInvestSum();
                    double winAmount = kVar2.dJv.getWinAmount();
                    String p = com.iqoption.util.j.p(Double.valueOf(winAmount - investSum));
                    String toJson = w.aWL().toJson(aPX);
                    if (k2) {
                        Position position2 = (Position) aPX.get(0);
                        c.aIy().addSmallDeal(kVar2.dJv.activeId, TimeUnit.MILLISECONDS.toSeconds(position2.getCloseTime()), position2.getExpValue(), winAmount, investSum, B, p, toJson, kVar2.dJv.instrumentType.getOptionActiveOrInstrumentValue(), strArr, 0);
                    } else {
                        String str = toJson;
                        if (kVar2.dJv.instrumentType == InstrumentType.MULTI_INSTRUMENT && TabHelper.IM().a(kVar2.dJv)) {
                            IQApp.Ex().bd(new e(InstrumentType.MULTI_INSTRUMENT, str));
                        } else {
                            c.aIy().addSmallDeal(kVar2.dJv.activeId, kVar2.dJv.getClosed(), kVar2.dJv.dJi, winAmount, investSum, B, p, str, kVar2.dJv.instrumentType.getOptionActiveOrInstrumentValue(), com.iqoption.core.ext.c.EMPTY_STRING_ARRAY, 0);
                        }
                        com.iqoption.app.d Fa = com.iqoption.app.d.Fa();
                        Fa.dM(Fa.Fr() + 1);
                    }
                    MusicUtil.a(IQApp.Eu(), winAmount >= investSum ? Sound.GAME_WIN : Sound.GAME_LOSE);
                }
            }
        }

        @com.google.common.b.e
        public void onPositionClosed(com.iqoption.mobbtech.connect.response.options.OptionEvents.n nVar) {
            Position position = (Position) nVar.getValue();
            if (position != null) {
                InstrumentType instrumentType = position.getInstrumentType();
                if (instrumentType != null) {
                    int i = AnonymousClass3.$SwitchMap$com$iqoption$core$data$model$InstrumentType[instrumentType.ordinal()];
                    if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && com.iqoption.l.b.aTS().aTW() && !com.iqoption.mobbtech.connect.request.api.a.b.z(position.getId())) {
                        double investSum = position.getInvestSum();
                        double winAmount = position.getWinAmount();
                        String p = com.iqoption.util.j.p(Double.valueOf(winAmount - investSum));
                        com.iqoption.core.microservices.tradingengine.response.active.a b = com.iqoption.app.helpers.a.Gs().b(Integer.valueOf(position.getActiveId()), instrumentType);
                        NativeHandler.instance().singleThreadExecutor.execute(new -$$Lambda$NativeHandler$j$13Ii8E6PVsqt86xva0DmpZCTNcQ(position, b != null ? com.iqoption.core.microservices.tradingengine.response.active.d.B(b) : "", p, instrumentType, winAmount, investSum));
                    }
                }
            }
        }

        private static /* synthetic */ void a(Position position, String str, String str2, InstrumentType instrumentType, double d, double d2) {
            c.aIy().addSmallDeal(position.getActiveId(), TimeUnit.MILLISECONDS.toSeconds(position.getCloseTime()), position.getExpValue(), position.getWinAmount(), position.getInvestSum(), str, str2, w.aWL().toJson(ImmutableList.aJ(position)), instrumentType.getOptionActiveOrInstrumentValue(), new String[]{position.getPositionSplitId()}, 0);
            MusicUtil.a(IQApp.Eu(), d >= d2 ? Sound.GAME_WIN : Sound.GAME_LOSE);
        }
    }

    public static class c extends com.iqoption.system.a.c<Double> {
    }

    public static class d extends com.iqoption.system.a.c<Double> {
    }

    public static class g extends com.iqoption.system.a.c<Double> {
    }

    public static class h extends com.iqoption.system.a.c<Boolean> {
    }

    public static class i extends com.iqoption.system.a.c<Long> {
    }

    public static class m extends com.iqoption.system.a.c<Integer> {
    }

    public static class n extends com.iqoption.system.a.c<Long> {
    }

    private NativeHandler() {
    }

    public static NativeHandler instance() {
        return (NativeHandler) nativeHandlerSupplier.get();
    }

    public void onStart() {
        this.handlerEvent.register();
    }

    public void onStop() {
        this.handlerEvent.unregister();
    }

    public void onChangeVisibleTimeDelta(double d) {
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$YdYI0Z0GVAusn9YkYCgo-Wy3vgo(d));
    }

    public void onCrossedReferenceTimeOnTimeScaleBar(double d) {
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$TQqLi7IPCK3SadHY83axyu4evqE(d));
    }

    public void onSelectChartQuote(double d, double d2, double d3) {
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$NJXPPmtSkpPrtkb3MJwFQ2VKgjE(d, d2, d3));
    }

    public void onCancelSelectChartQuote() {
        com.iqoption.core.c.a.biL.execute(-$$Lambda$NativeHandler$qW0cAzVqLSRSAUXPyjFPl6uTia0.INSTANCE);
    }

    public void onTapTimeScaleBar() {
        com.iqoption.core.c.a.biL.execute(-$$Lambda$NativeHandler$YvVf7-YfdR2wmc_AEYEc2qRe4wI.INSTANCE);
    }

    public void onSetStrikesAutoSelectionState(int i) {
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$r2_5kpG8H8Gfyb3-9xsFyAJf4yE(i));
    }

    static /* synthetic */ void lambda$onSetStrikesAutoSelectionState$5(int i) {
        com.iqoption.app.managers.tab.TabHelper.i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            Jh.a(StrikeSelectionMode.values()[i]);
        }
    }

    public void onRequestMarginCall(String str) {
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$CR2WLMhPVncLP1I9asa8RRVniqU(str));
    }

    public void onFeeInfoPressed(String str) {
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$GkowDlmseUg-kGEhPcXRW8VrDgs(str));
    }

    public void onChangeLimitOrderValue(double d, int i) {
        IQApp.Ex().bd(new c().setValue(Double.valueOf(d)));
    }

    public void onChangeTPSL(String str, String str2, String str3, double d, double d2) {
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$zEmEYp-0itnkXtTlwIKHpcgSIpQ(str, d, d2, str3));
    }

    static /* synthetic */ void lambda$onChangeTPSL$8(String str, double d, double d2, String str2) {
        Long l = (Long) Position.parsePositionSplitId(str)[0];
        Double valueOf = Double.valueOf(d);
        Double valueOf2 = Double.valueOf(d2);
        Boolean valueOf3 = Boolean.valueOf(com.iqoption.l.b.aTS().Fo());
        if (TextUtils.isEmpty(str2)) {
            valueOf3 = Boolean.valueOf(false);
        } else {
            Long bX = Longs.bX(str2);
            if (bX != null) {
                valueOf3 = Boolean.valueOf(Order.isTrailStoPOrder((Order) com.google.common.collect.i.b(com.iqoption.app.managers.c.GS().GR()).d(Predicates.a(Predicates.ao(bX), Order.getOrderId)).pN()));
            }
        }
        if (valueOf.doubleValue() < 0.0d) {
            valueOf = null;
        }
        if (valueOf2.doubleValue() < 0.0d) {
            valueOf2 = null;
        }
        com.iqoption.mobbtech.connect.request.api.a.b.a(l, valueOf, valueOf2, valueOf3.booleanValue());
    }

    public static void vibrate(long j) {
        try {
            Vibrator vibrator = (Vibrator) IQApp.Eu().getSystemService("vibrator");
            if (vibrator == null) {
                return;
            }
            if (com.iqoption.core.ext.a.Xe()) {
                vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
            } else {
                vibrator.vibrate(j);
            }
        } catch (Exception unused) {
        }
    }

    public void onNeedVibrate(int i) {
        if (i > 0) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$NativeHandler$3J1FdAL0wVmfQsv2cAiGbeR14UE(i));
        }
    }

    public void onUpdateInstrumentParams(int i) {
        IQApp.Ex().bd(new m().setValue(Integer.valueOf(i)));
    }

    public void onCloseInstrument(int i) {
        com.iqoption.charttools.f.aCQ.v(TabHelper.IM().Jj(), i).b(com.iqoption.core.rx.i.akl()).bkN();
    }

    public void onSellTradingPosition(String str) {
        this.onSellClick.cu(str);
    }

    public void onSelectTradingPosition(String str) {
        IQApp.Ex().bd(new q(str));
    }

    public void onEnlargeSellControl() {
        com.iqoption.app.d.i("first_do_sell_experience", true);
        com.iqoption.core.c.a.biL.execute(-$$Lambda$NativeHandler$BtfFC4xl3lU6cN4HuwrrKTiowxc.INSTANCE);
    }

    public void onAskForSellingTradingPosition(String str) {
        this.onAskForSelling.cu(str);
    }

    /* Access modifiers changed, original: 0000 */
    public void onPrefSet(String str, boolean z) {
        k.c(str, z);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean onPrefGet(String str, boolean z) {
        return k.getBoolean(str, z);
    }

    public void onLineInstrumentEditEnd(@NonNull String str) {
        com.iqoption.charttools.k.aDB.Mn().o(new -$$Lambda$NativeHandler$F-068HH8A43W2JwuuDyi-yUyc3w(str)).b(com.iqoption.core.rx.i.akl()).bkN();
    }

    static /* synthetic */ io.reactivex.c lambda$onLineInstrumentEditEnd$13(String str, com.iqoption.charttools.j jVar) {
        com.iqoption.charttools.model.indicator.h a = com.iqoption.charttools.k.aDB.a(jVar, (JsonObject) w.aWL().fromJson(str, JsonObject.class));
        if (a == null) {
            return io.reactivex.a.bkL();
        }
        return com.iqoption.charttools.f.aCQ.ey(TabHelper.IM().Jj()).o(new -$$Lambda$NativeHandler$t-4rdCtRrWLRwI9s8WJONdgcsDk(a));
    }

    static /* synthetic */ io.reactivex.c lambda$null$12(com.iqoption.charttools.model.indicator.h hVar, List list) {
        com.iqoption.charttools.model.indicator.h hVar2 = (com.iqoption.charttools.model.indicator.h) com.google.common.collect.i.b((Iterable) list).d(new -$$Lambda$NativeHandler$xxNRd2c9ZRkoBmi8l1opCHKBATQ(hVar)).pN();
        if (hVar2 == null) {
            return io.reactivex.a.bkL();
        }
        com.iqoption.charttools.tools.e.aLA.eT(hVar2.MH().getType());
        com.iqoption.charttools.model.indicator.k kVar = (com.iqoption.charttools.model.indicator.k) hVar.MH();
        kVar.b(kVar.b(hVar2.Oh()), hVar.Oh());
        return com.iqoption.charttools.f.aCQ.a(TabHelper.IM().Jj(), hVar.getIndex(), null, hVar.Oh(), true);
    }

    static /* synthetic */ boolean lambda$null$11(com.iqoption.charttools.model.indicator.h hVar, com.iqoption.charttools.model.indicator.h hVar2) {
        return hVar2 != null && hVar2.getIndex() == hVar.getIndex();
    }

    public void onSelectStrike(int i, long j, String str, String str2, boolean z) {
        IQApp.Ex().bd(new p(i, j, str, str2, z));
    }

    public void onSendRequestForFirstCandles(int i) {
        WebSocketHandler.a(WebSocketHandler.aTn(), i);
    }

    public void onVisibleCandlesSizeChanged(String str, int i, boolean z, int i2) {
        IQApp.Ex().bd(new s(str, i, z, i2));
    }

    public void onSendCandleRequest(int i, int i2, long j, long j2, int i3, int i4, int i5) {
        WebSocketHandler.a(WebSocketHandler.aTn(), i, i2, j, j2, i3, i4, i5);
    }

    public void onClickSmallDealView(String str, String str2, String str3, int i) {
        InstrumentType toInstrumentType;
        ActiveType fromServerValue = ActiveType.fromServerValue(str);
        if (fromServerValue != ActiveType.UNKNOWN) {
            toInstrumentType = fromServerValue.toInstrumentType();
        } else {
            toInstrumentType = InstrumentType.fromServerValue(str);
        }
        IQApp.Ex().bd(new e(toInstrumentType, str2));
    }

    public void onClickTradersMoodView() {
        IQApp.Ex().bd(new f());
    }

    public void onBestActivePushed(String str, int i) {
        com.iqoption.core.c.a.biN.execute(new -$$Lambda$NativeHandler$LdtK63Qz1YEJz32mKami9UI-3T8(i));
    }

    static /* synthetic */ void lambda$onBestActivePushed$14(int i) {
        InstrumentType IY = TabHelper.IM().IY();
        if (com.iqoption.core.ext.c.b((Object) IY, InstrumentType.BINARY_INSTRUMENT, InstrumentType.TURBO_INSTRUMENT)) {
            com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(i), IY);
            if (a != null) {
                TabHelper.IM().u(a);
                com.iqoption.app.managers.k.f(IQApp.Eu(), 128);
                EventManager.BS().a(Event.Builder(Event.CATEGORY_POPUP_SERVED, "traderoom_new-tab-top-asset").setValue(Double.valueOf((double) TabHelper.IM().getTabsCount())).setParameters(u.anp().o("instrument_type", a.getInstrumentType()).anr()).build());
            }
        }
    }

    public void onSignalPressed(int i, String str) {
        com.iqoption.core.c.a.biN.execute(new -$$Lambda$NativeHandler$EI0fMhuUA41YRbA0oeyJ5UiZYZk(i, str));
    }

    static /* synthetic */ void lambda$onSignalPressed$15(int i, String str) {
        com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(i), InstrumentType.fromServerValue(str));
        if (a != null) {
            TabHelper.IM().u(a);
            IQApp.Ex().bd(new com.iqoption.fragment.d.c.a());
        }
    }

    public void onAnalyticsEventPopupServed(String str, boolean z, double d) {
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$XvBGkWBth4CnoXndI5d8FnKLbOc(this, z, str, d));
    }

    public /* synthetic */ void lambda$onAnalyticsEventPopupServed$16$NativeHandler(boolean z, String str, double d) {
        Builder Builder;
        if (z) {
            Builder = Event.Builder(Event.CATEGORY_POPUP_SERVED, str);
            if (d != -1.0d) {
                Builder.setValue(Double.valueOf(d));
            }
            this.eventMap.put(str, Builder);
            return;
        }
        Builder = (Builder) this.eventMap.get(str);
        if (Builder != null) {
            this.eventMap.remove(str);
            EventManager.BS().a(Builder.calcDuration().build());
        }
    }

    public void onAnalyticsEventButtonPressed(String str, double d) {
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$NativeHandler$2ipXJ-mlPiw92rxNIUY3LYpI6gw(str, d));
    }

    static /* synthetic */ void lambda$onAnalyticsEventButtonPressed$17(String str, double d) {
        Builder Builder = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, str);
        if (d != -1.0d) {
            Builder.setValue(Double.valueOf(d));
        }
        EventManager.BS().a(Builder.build());
    }

    public void onLiveDealsRequestedForInterval(int i, @NonNull String str, long j, long j2) {
        com.iqoption.h.a.onLiveDealsRequestedForInterval(i, str, j, j2);
    }

    public void onLiveDealsRequestedForExpiration(int i, @NonNull String str, int i2) {
        com.iqoption.h.a.onLiveDealsRequestedForExpiration(i, str, i2);
    }

    public void onFlagImageRequested(@NonNull String str) {
        com.iqoption.h.a.iU(str);
    }

    public void onUserWeekPlaceAndProfitRequested(int i) {
        com.iqoption.h.a.bT((long) i);
    }

    public void onImageByUrlRequested(@NonNull String str) {
        com.iqoption.h.a.iV(str);
    }

    public void onActiveIdImageRequested(@NonNull String str) {
        a.iA(str);
    }

    public void onExpirationCrossScreenBorder(boolean z) {
        IQApp.Ex().bd(new h().setValue(Boolean.valueOf(z)));
    }

    public int onGetActiveIdByTicker(String str) {
        return ((com.iqoption.core.gl.a) this.activeIdResolverSupplier.get()).fV(str);
    }

    public void setOnPriceAlertChangeListener(l lVar) {
        this.onPriceAlertChangeListener = lVar;
    }

    public void onChangePriceAlertValue(double d) {
        l lVar = this.onPriceAlertChangeListener;
        if (lVar != null) {
            lVar.L(d);
        }
    }

    public void onRequestTabChange(int i, String str) {
        com.iqoption.core.c.a.biN.execute(new -$$Lambda$NativeHandler$g8aRqUTjN1fGTzNGcenkSRj79Z4(str, i));
    }

    static /* synthetic */ void lambda$onRequestTabChange$20(String str, int i) {
        com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(i), InstrumentType.fromServerValue(str));
        if (a != null) {
            TabHelper.IM().u(a);
        }
    }
}
