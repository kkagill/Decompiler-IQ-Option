package com.iqoption.mobbtech.connect.request.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.google.gson.JsonElement;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.feature.c;
import com.iqoption.core.connect.j;
import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.Currencies.ConversionCurrency.List;
import com.iqoption.dto.entity.iqbus.SignalLegacy;
import com.iqoption.dto.entity.iqbus.Subscriptions;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import com.iqoption.dto.entity.position.PositionAndOrder;
import com.iqoption.dto.entity.position.result.DeferredOrdersResult;
import com.iqoption.dto.entity.position.result.PositionResult;
import com.iqoption.dto.entity.position.result.PositionsResult;
import com.iqoption.dto.entity.result.ExpirationsResult;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.service.websocket.a.b;
import com.iqoption.util.v;
import com.iqoption.util.w;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: IQBusRequests */
public class e {
    private static final String TAG = "com.iqoption.mobbtech.connect.request.api.e";

    /* compiled from: IQBusRequests */
    /* renamed from: com.iqoption.mobbtech.connect.request.api.e$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$iqoption$core$data$model$InstrumentType = new int[InstrumentType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.core.data.model.InstrumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$iqoption$core$data$model$InstrumentType = r0;
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.data.model.InstrumentType.MULTI_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.core.data.model.InstrumentType.DIGITAL_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.mobbtech.connect.request.api.e$AnonymousClass2.<clinit>():void");
        }
    }

    /* compiled from: IQBusRequests */
    public static class a {
        private String auN = null;
        private HashMap<String, Object> ava;
        private String name;
        private final String type;
        private String version;

        public a(String str) {
            this.type = str;
        }

        public a ji(String str) {
            this.name = str;
            return this;
        }

        public a jj(String str) {
            this.version = str;
            return this;
        }

        public a jk(String str) {
            this.auN = str;
            return this;
        }

        public a e(HashMap<String, Object> hashMap) {
            this.ava = hashMap;
            return this;
        }

        public a p(String str, Object obj) {
            if (obj != null) {
                if (this.ava == null) {
                    this.ava = new HashMap();
                }
                this.ava.put(str, obj);
            }
            return this;
        }

        public boolean exec() {
            if (this.version == null) {
                this.version = "1.0";
            }
            return WebSocketHandler.aTn().c(b.b(this.type, this.name, this.ava).jL(this.version).jM(this.auN));
        }
    }

    public static boolean jd(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("provider", "google");
        hashMap.put("token", str);
        hashMap.put("app_id", Integer.valueOf(17));
        return WebSocketHandler.aTn().c(b.b("sendMessage", "register-token", hashMap));
    }

    public static boolean je(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("provider", "google");
        hashMap.put("token", str);
        hashMap.put("app_id", Integer.valueOf(17));
        return WebSocketHandler.aTn().c(b.b("sendMessage", "unregister-token", hashMap));
    }

    public static t<SignalLegacy[]> c(long j, boolean z) {
        HashMap hashMap = new HashMap();
        if (j > 0) {
            hashMap.put("created", Long.valueOf(j));
        }
        hashMap.put("recent", Boolean.valueOf(z));
        String str = "get-signals";
        return new com.iqoption.mobbtech.connect.request.a.a.b(SignalLegacy[].class, null, str).b(str, hashMap);
    }

    public static t<SignalLegacy[]> a(long j, boolean z, int i) {
        HashMap hashMap = new HashMap();
        if (j > 0) {
            hashMap.put("created", Long.valueOf(j));
        }
        hashMap.put("recent", Boolean.valueOf(z));
        hashMap.put("subtype", Integer.valueOf(i));
        String str = "get-hf-signals";
        return new com.iqoption.mobbtech.connect.request.a.a.b(SignalLegacy[].class, null, str).b(str, hashMap);
    }

    public static t<Subscriptions> aPw() {
        HashMap hashMap = new HashMap();
        hashMap.put("locale", d.getLocale());
        hashMap.put(NotificationCompat.CATEGORY_TRANSPORT, "push");
        hashMap.put("platform", Integer.valueOf(17));
        String str = "get-subscriptions";
        return new com.iqoption.mobbtech.connect.request.a.a.b(Subscriptions.class, null, str).b(str, hashMap);
    }

    public static boolean a(Long l, Boolean bool) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_TRANSPORT, "push");
        hashMap.put("group", l);
        hashMap.put("enabled", bool);
        boolean c = WebSocketHandler.aTn().c(b.b("sendMessage", "set-group-state", hashMap));
        if (c) {
            com.iqoption.app.d.aP(IQApp.Eu().getApplicationContext()).a(l.longValue(), bool.booleanValue());
        }
        return c;
    }

    public static boolean a(Long l, Long l2) {
        if (l == null || l2 == null || l.longValue() == 0 || l2.longValue() == 0) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("token_id", l2);
        hashMap.put("push_id", l);
        return WebSocketHandler.aTn().c(b.b("sendMessage", "confirm-push", hashMap));
    }

    public static t<JsonElement> aPx() {
        HashMap hashMap = new HashMap();
        hashMap.put("category", c.Is());
        String Gm = com.iqoption.app.d.Fa().Gm();
        if (!TextUtils.isEmpty(Gm)) {
            hashMap.put("identity", Gm);
        }
        return com.iqoption.mobbtech.connect.request.a.a.b.z(JsonElement.class).fo("get-features").b(hashMap).fp("2.0").UA();
    }

    public static boolean aPy() {
        return WebSocketHandler.aTn().c(b.b("subscribeMessage", "signal-created", null).jL("1.0"));
    }

    public static boolean gp(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("subtype", Integer.valueOf(i));
        return WebSocketHandler.aTn().c(b.b("subscribeMessage", "hf-signal-created", hashMap).jL("1.0"));
    }

    public static t<List> aPz() {
        return com.iqoption.mobbtech.connect.request.a.a.b.z(List.class).fo("get-currencies-list").UA();
    }

    public static t<ExpirationsResult> a(InstrumentType instrumentType, String str, int i, String str2) {
        j fp = com.iqoption.mobbtech.connect.request.a.a.b.z(ExpirationsResult.class).fq(str2).k("type", instrumentType).k("underlying", str).fp("4.0");
        str2 = "get-expiration-list";
        t UA = fp.fo(str2).UA();
        com.iqoption.core.analytics.a.b.aZL.a(UA, new com.iqoption.core.analytics.a.b.e(str2, i, instrumentType));
        return UA;
    }

    public static t<PositionsResult> a(long j, InstrumentType instrumentType) {
        aa vM = aa.vM();
        a(vM, new ArrayList(), j, instrumentType);
        return vM;
    }

    @Nullable
    public static String Z(@NonNull InstrumentType instrumentType) {
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[instrumentType.ordinal()];
        if (i == 1) {
            return "multi-options";
        }
        if (i == 2) {
            return "trading-fx-option";
        }
        if (i != 3) {
            return null;
        }
        return com.iqoption.core.microservices.a.Zd();
    }

    private static void a(aa<PositionsResult> aaVar, ArrayList<PositionAndOrder> arrayList, long j, InstrumentType instrumentType) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_balance_id", Long.valueOf(j));
        hashMap.put("instrument_type", instrumentType);
        hashMap.put("skip", Integer.valueOf(arrayList.size()));
        hashMap.put(Order.LIMIT, Integer.valueOf(50));
        String str = "get-positions";
        t a = new com.iqoption.mobbtech.connect.request.a.a.b(PositionsResult.class, null, str).a(str, hashMap, Z(instrumentType));
        final aa<PositionsResult> aaVar2 = aaVar;
        final ArrayList<PositionAndOrder> arrayList2 = arrayList;
        final long j2 = j;
        final InstrumentType instrumentType2 = instrumentType;
        v.b(a, new o<PositionsResult>() {
            /* renamed from: a */
            public void onSuccess(PositionsResult positionsResult) {
                if (positionsResult == null || positionsResult.positions == null) {
                    aaVar2.setException(new Throwable("api GET_POSITIONS  - not valid result"));
                    return;
                }
                positionsResult.positions.addAll(arrayList2);
                if (positionsResult.total == null || positionsResult.total.equals(Integer.valueOf(positionsResult.positions.size()))) {
                    aaVar2.set(positionsResult);
                } else {
                    e.a(aaVar2, positionsResult.positions, j2, instrumentType2);
                }
            }

            public void l(Throwable th) {
                aaVar2.setException(th);
            }
        });
    }

    public static t<DeferredOrdersResult> b(long j, InstrumentType instrumentType) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_balance_id", Long.valueOf(j));
        hashMap.put("instrument_type", instrumentType);
        String str = "get-deferred-orders";
        return new com.iqoption.mobbtech.connect.request.a.a.b(DeferredOrdersResult.class, null, str).b(str, hashMap);
    }

    public static t<PositionResult> c(long j, @Nullable InstrumentType instrumentType) {
        return new com.iqoption.mobbtech.connect.request.a.a.b.a(PositionResult.class).fo("get-position").k(PendingOrderWrapper.POSITION_ID, Long.valueOf(j)).fq(Z(instrumentType)).UA();
    }

    public static t<com.iqoption.core.microservices.tradingengine.response.a.b> aa(InstrumentType instrumentType) {
        return new com.iqoption.mobbtech.connect.request.a.a.b.a(com.iqoption.core.microservices.tradingengine.response.a.b.class).fo("get-commission-settings").k("instrument_type", instrumentType).ch(false).UA();
    }

    public static t<com.iqoption.trading.history.a.a.a> a(long j, java.util.List<InstrumentType> list) {
        int size = list.size() * 50;
        if (size > 300) {
            size = 300;
        } else if (size < 50) {
            size = 50;
        }
        String str = "user_balance_id";
        j k = new com.iqoption.mobbtech.connect.request.a.a.b.a(com.iqoption.trading.history.a.a.a.class).fq("portfolio").fo("get-history").fp("2.0").k("user_id", Long.valueOf(com.iqoption.app.b.DG().getUserId())).k(str, Long.valueOf(j)).k("instrument_types", list);
        Integer valueOf = Integer.valueOf(size);
        return k.k(Order.LIMIT, valueOf).k("offset", Integer.valueOf(0)).ch(false).UA();
    }

    public static boolean jf(String str) {
        return aA(str, "1.0");
    }

    public static boolean aA(String str, @NonNull String str2) {
        return WebSocketHandler.aTn().c(b.b("subscribeMessage", str, null).jL(str2));
    }

    public static boolean jg(String str) {
        return WebSocketHandler.aTn().c(b.b("unsubscribeMessage", str, null).jL("1.0"));
    }

    public static boolean a(String str, HashMap<String, Object> hashMap) {
        return WebSocketHandler.aTn().c(b.b("subscribeMessage", str, hashMap).jL("1.0"));
    }

    public static boolean a(String str, String str2, HashMap<String, Object> hashMap) {
        return WebSocketHandler.aTn().c(b.b("subscribeMessage", str, hashMap).jL("1.0").jM(str2));
    }

    public static void v(long j, long j2) {
        WebSocketHandler.aTn().jH(w.aWL().toJson(new b(j, j2)));
    }

    public static a jh(String str) {
        return new a(str);
    }
}
