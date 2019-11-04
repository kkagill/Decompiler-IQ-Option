package com.iqoption.service;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.aj;
import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.iqoption.analytics.EventManager;
import com.iqoption.analytics.sla.Sla;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.j;
import com.iqoption.app.managers.l;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.connect.bus.IQBusState;
import com.iqoption.core.connect.m;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.Balance;
import com.iqoption.dto.ChartTimeInterval;
import com.iqoption.dto.Currencies.ConversionCurrency.List;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.entity.FeaturesUpdateEvent;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.entity.position.PositionItem;
import com.iqoption.dto.entity.result.BalanceListResult;
import com.iqoption.dto.event.OtnEmissionExecuted;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.service.e.g;
import com.iqoption.service.e.h;
import com.iqoption.service.e.k;
import com.iqoption.service.websocket.IQBusException;
import com.iqoption.system.IQFirebaseMessagingService;
import com.iqoption.system.a.e;
import com.iqoption.util.Network;
import com.iqoption.util.i;
import com.iqoption.util.v;
import com.iqoption.util.w;
import io.reactivex.b.f;
import io.reactivex.processors.PublishProcessor;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Response;
import org.json.JSONObject;

public class WebSocketHandler extends a implements com.iqoption.m.a {
    private static final String TAG = "com.iqoption.service.WebSocketHandler";
    private static final n<com.iqoption.m.a> dRT = Suppliers.a(-$$Lambda$JqrCSdjZ8plhBvqj2-BhZ3vrs7s.INSTANCE);
    private final com.iqoption.core.rx.d<IQBusState> baj = com.iqoption.core.rx.d.bQ(IQBusState.DISCONNECTED);
    private String bgB = "";
    private com.iqoption.mobbtech.connect.request.a dRL = null;
    private volatile ExecutorService dRM;
    private Handler dRN;
    private volatile d dRO;
    private volatile boolean dRP;
    private b dRQ = new b(this);
    private Queue<com.iqoption.service.websocket.a.b> dRR = new ConcurrentLinkedQueue();
    private com.iqoption.app.managers.b dRS = new com.iqoption.app.managers.b();
    @Nullable
    private volatile Future<?> dRU;
    @NonNull
    private final AtomicInteger dRV = new AtomicInteger();
    @NonNull
    private final AtomicReference<Builder> dRW = new AtomicReference();
    private volatile State dRX = State.NONE;
    private volatile boolean dRY;
    private final com.iqoption.config.a dRZ = com.iqoption.core.d.Un();
    private Builder dSa;
    private final String dSb = "chat-client-manager-online-changed";
    private final String dSc = "chat-state-updated";
    private final String dSd = "chat-room-generated";
    private final String dSe = "chat-message-public-generated";
    private final String dSf = "chat-message-generated";
    private final String dSg = "chat-public-typing";
    private final String dSh = "chat-typing";
    private final Runnable dSi = new -$$Lambda$WebSocketHandler$VJhZW9wzA3xnMrIOVxN1FlwjQYA(this);
    private volatile aa<Object> dSj;
    private final Set<Pair<Integer, InstrumentType>> dSk = Sets.uw();
    private final Set<Pair<Integer, Integer>> dSl = Sets.uw();
    private final ConcurrentHashMap<String, com.iqoption.service.websocket.a.b> dSm = new ConcurrentHashMap();
    private io.reactivex.processors.a<m> dSn = PublishProcessor.bmK().bmJ();
    private io.reactivex.processors.a<String> dSo = PublishProcessor.bmK().bmJ();
    private final Object lock = new Object();

    public enum State {
        NONE,
        RECONNECT,
        AUTHORIZED
    }

    private final class d extends Handler {
        private AtomicInteger dSt = new AtomicInteger();

        public d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(IQApp.Ev().Vc());
                stringBuilder.append("echo/websocket");
                String stringBuilder2 = stringBuilder.toString();
                final aa vM = aa.vM();
                t tVar = vM;
                com.iqoption.analytics.d.BZ().a(tVar, "echo/websocket", 60000, false, WebSocketHandler.aTn().Xd());
                if (WebSocketHandler.this.dRO != null) {
                    WebSocketHandler.this.dRO.a(stringBuilder2, this.dSt.incrementAndGet(), new com.iqoption.service.d.a() {
                        public void ha(int i) {
                            vM.set(Boolean.TRUE);
                            WebSocketHandler.this.dRV.set(0);
                            WebSocketHandler.this.aTx();
                            EventManager.BS().a(WebSocketHandler.this.dSa.calcDuration().setTechnicalLogs(Boolean.valueOf(true)).build());
                            Builder builder = (Builder) WebSocketHandler.this.dRW.get();
                            if (builder != null) {
                                EventManager.BS().a(builder.calcDuration().setValue(Double.valueOf(1.0d)).build());
                                WebSocketHandler.this.dRW.compareAndSet(builder, null);
                            }
                        }

                        public void a(int i, String str, StringReader stringReader) {
                            WebSocketHandler.this.dRY;
                            WebSocketHandler.this.a(str, stringReader);
                        }

                        public void a(int i, Throwable th, Response response) {
                            vM.setException(th);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("connecting to socket error  (socketId: ");
                            stringBuilder.append(i);
                            stringBuilder.append(") Exception:");
                            stringBuilder.append(th == null ? "" : th.getMessage());
                            stringBuilder.toString();
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("connecting to socket error Response:");
                            stringBuilder2.append(response == null ? " " : response.toString());
                            stringBuilder2.toString();
                            if (i != d.this.dSt.get()) {
                                return;
                            }
                            if (WebSocketHandler.this.dRV.incrementAndGet() < 100) {
                                WebSocketHandler.this.reconnect();
                                return;
                            }
                            WebSocketHandler.this.closeConnection();
                            Builder builder = (Builder) WebSocketHandler.this.dRW.get();
                            if (builder != null) {
                                EventManager.BS().a(builder.calcDuration().setValue(Double.valueOf(0.0d)).build());
                                WebSocketHandler.this.dRW.compareAndSet(builder, null);
                            }
                        }

                        public void hb(int i) {
                            if (i == d.this.dSt.get()) {
                                WebSocketHandler.this.baj.onNext(IQBusState.DISCONNECTED);
                                if (WebSocketHandler.this.dRP) {
                                    WebSocketHandler.this.aTy();
                                    WebSocketHandler.this.aTu();
                                    WebSocketHandler.this.dRX = State.NONE;
                                    return;
                                }
                                WebSocketHandler.this.aTw();
                            }
                        }
                    });
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        removeMessages(1);
                        removeMessages(2);
                        removeMessages(3);
                        WebSocketHandler.this.dRO = null;
                        getLooper().quit();
                    }
                } else if (WebSocketHandler.this.dRO != null) {
                    WebSocketHandler.this.dRO.aTm();
                }
            } else if (WebSocketHandler.this.dRO != null) {
                WebSocketHandler.this.dRO.fk((String) message.obj);
            }
        }
    }

    private static class b extends e<WebSocketHandler> {
        public b(WebSocketHandler webSocketHandler) {
            super(webSocketHandler);
        }

        @com.google.common.b.e
        public void onFcmToken(com.iqoption.core.b.b bVar) {
            com.iqoption.core.c.a.biM.execute(new -$$Lambda$WebSocketHandler$b$T-Ty3RIetFH4sorApDMQh9OIoqM(this));
        }

        private /* synthetic */ void aTE() {
            if (((WebSocketHandler) this.dUo.get()) != null) {
                IQFirebaseMessagingService.aUz();
            }
        }

        @com.google.common.b.e
        public void onFeatureUpdateEvent(FeaturesUpdateEvent featuresUpdateEvent) {
            com.iqoption.core.c.a.biM.execute(new -$$Lambda$WebSocketHandler$b$h7eDN0zQVnvsGrDl5gtJR60ce34(this));
        }

        private /* synthetic */ void aTD() {
            WebSocketHandler webSocketHandler = (WebSocketHandler) this.dUo.get();
            if (webSocketHandler != null) {
                com.iqoption.app.b DG = com.iqoption.app.b.DG();
                int groupId = DG.getGroupId();
                boolean Er = DG.Er();
                if (com.iqoption.core.features.instrument.b.Xq()) {
                    webSocketHandler.p(groupId, Er);
                }
                if (com.iqoption.core.features.instrument.b.Xr()) {
                    webSocketHandler.q(groupId, Er);
                }
                if (com.iqoption.core.features.instrument.b.Xu()) {
                    webSocketHandler.s(groupId, Er);
                }
                if (com.iqoption.core.features.instrument.b.Xv()) {
                    webSocketHandler.r(groupId, Er);
                }
                if (com.iqoption.core.features.instrument.b.Xw()) {
                    webSocketHandler.t(groupId, Er);
                }
                if (com.iqoption.core.features.instrument.b.Xs()) {
                    webSocketHandler.n(groupId, DG.Er());
                }
            }
        }

        @com.google.common.b.e
        public void onDebugShowWebSocketLogChanged(com.iqoption.app.b.e.a aVar) {
            WebSocketHandler webSocketHandler = (WebSocketHandler) this.dUo.get();
            if (webSocketHandler != null) {
                webSocketHandler.dRY = ((Boolean) aVar.getValue()).booleanValue();
            }
        }
    }

    private static class a extends com.iqoption.system.c.a<com.iqoption.core.microservices.quoteshistory.response.a> {
        private final int activeId;
        private final int drL;

        a(int i, int i2) {
            this.activeId = i;
            this.drL = i2;
        }

        /* renamed from: a */
        public void cl(com.iqoption.core.microservices.quoteshistory.response.a aVar) {
            if (aVar.agN().length != 0) {
                com.iqoption.gl.c.aIy().addCandles(this.activeId, this.drL, aVar.agN().length, aVar.agN(), aVar.agK(), aVar.agL(), aVar.agO(), aVar.agP(), aVar.agR(), aVar.agQ(), aVar.agS(), aVar.agM());
            }
        }
    }

    private static class c extends com.iqoption.system.c.a<com.iqoption.microservice.quotes.history.response.a> {
        private final int activeId;

        c(int i) {
            this.activeId = i;
        }

        /* renamed from: a */
        public void cl(@NonNull com.iqoption.microservice.quotes.history.response.a aVar) {
            if (aVar.bxB.length != 0) {
                com.iqoption.gl.c.aIy().addFirstCandles(this.activeId, aVar.bxB.length, aVar.bxB, aVar.bxy, aVar.bxz, aVar.bxC, aVar.bxD, aVar.bxF, aVar.bxE, aVar.bxG);
                com.iqoption.core.c.a.biL.execute(new -$$Lambda$WebSocketHandler$c$f_ophkZ1GTzjQMJZhI6uoh61oa8(this, aVar));
            }
        }

        private /* synthetic */ void b(com.iqoption.microservice.quotes.history.response.a aVar) {
            int min = Math.min(aVar.bxF.length, aVar.bxE.length);
            Set uw = Sets.uw();
            for (int i = 0; i < min; i++) {
                uw.add(Integer.valueOf(ChartTimeInterval.clampToCandleDuration((int) (aVar.bxz[i] - aVar.bxy[i]))));
            }
            com.iqoption.app.managers.a.GM().a(Integer.valueOf(this.activeId), uw);
        }
    }

    public static com.iqoption.m.a aTn() {
        return (com.iqoption.m.a) dRT.get();
    }

    public io.reactivex.e<IQBusState> Ux() {
        return this.baj;
    }

    public IQBusState Uy() {
        IQBusState iQBusState = (IQBusState) this.baj.getValue();
        return iQBusState != null ? iQBusState : IQBusState.DISCONNECTED;
    }

    public boolean jH(String str) {
        return x(str, false);
    }

    public boolean x(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            com.iqoption.i.b.N(new IllegalStateException("silent: try to send null message"));
            return true;
        } else if ((!z && this.dRX != State.AUTHORIZED) || this.dRN == null) {
            return false;
        } else {
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = str;
            this.dRN.sendMessage(obtain);
            return true;
        }
    }

    @SuppressLint({"CheckResult"})
    public WebSocketHandler() {
        aTA().e(new f<Boolean>() {
            boolean dSp = false;

            /* renamed from: j */
            public void accept(Boolean bool) {
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    boolean z = this.dSp;
                    if (booleanValue != z) {
                        com.iqoption.analytics.d.BZ().h(Boolean.valueOf(z).booleanValue() ? "socket-connected" : "socket-disconnected", true);
                    }
                }
            }
        });
        this.dRQ.register();
        this.dRY = com.iqoption.core.data.d.a.bdi.Wl();
    }

    private void a(String str, StringReader stringReader) {
        try {
            JsonReader jsonReader = new JsonReader(stringReader);
            jsonReader.setLenient(true);
            jsonReader.beginObject();
            CharSequence charSequence = null;
            String str2 = null;
            int i = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (nextName.equals(ConditionalUserProperty.NAME)) {
                    str2 = jsonReader.nextString();
                } else if (nextName.equals("request_id")) {
                    charSequence = jsonReader.nextString();
                } else if (nextName.equals(NotificationCompat.CATEGORY_STATUS)) {
                    i = jsonReader.nextInt();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            if (TextUtils.isEmpty(charSequence)) {
                synchronized (this.lock) {
                    if (this.dRM != null) {
                        this.dRM.execute(new -$$Lambda$WebSocketHandler$BsE-mtbj0orVZajSLSyPYFGhe1E(this, str2, str));
                    }
                }
                return;
            }
            com.iqoption.core.c.a.biM.execute(new -$$Lambda$WebSocketHandler$7ispP0x4jMLwFbw9K59XmnzPEAY(this, charSequence, i, str));
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Socket, onTextMessage error: ");
            stringBuilder.append(str);
            i.ag(stringBuilder.toString());
            i.d(e);
        }
    }

    private /* synthetic */ void aE(String str, String str2) {
        aD(str, str2);
    }

    private void aTo() {
        synchronized (this.lock) {
            if (this.dRM != null) {
                this.dRM.shutdownNow();
            }
            this.dRM = Executors.newSingleThreadExecutor();
        }
    }

    private void aTp() {
        synchronized (this.lock) {
            if (this.dRM == null) {
                return;
            }
            this.dRM.shutdownNow();
            this.dRM = null;
        }
    }

    private void d(String str, int i, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                com.iqoption.service.websocket.a.b jJ = jJ(str);
                if (jJ == null) {
                    throw new NullPointerException("WebSocketEvents.RequestHandler == null");
                } else if (jJ.dSx != null && jJ.dSy != null) {
                    if (i < 0 || i >= 4000) {
                        jJ.dSy.setException(new IQBusException(i, str2));
                        return;
                    }
                    try {
                        JsonReader jsonReader = new JsonReader(new StringReader(str2));
                        jsonReader.setLenient(true);
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            if (jsonReader.nextName().equals(NotificationCompat.CATEGORY_MESSAGE)) {
                                jJ.dSy.set(jJ.dSx.an(jsonReader));
                                break;
                            }
                            jsonReader.skipValue();
                        }
                        jsonReader.close();
                    } catch (Exception e) {
                        jJ.dSy.setException(e);
                    }
                }
            }
        } catch (Exception e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Socket, onTextMessage error: ");
            stringBuilder.append(str2);
            i.ag(stringBuilder.toString());
            i.d(e2);
        }
    }

    private void aD(String str, String str2) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str2));
            jsonReader.setLenient(true);
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals(NotificationCompat.CATEGORY_MESSAGE)) {
                    a(str, jsonReader);
                    break;
                }
                jsonReader.skipValue();
            }
            jsonReader.close();
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Socket, _parseSocketResponse error: ");
            stringBuilder.append(str2);
            i.ag(stringBuilder.toString());
            i.d(e);
        }
    }

    private JSONObject ao(JsonReader jsonReader) {
        return new JSONObject(w.aWN().parse(jsonReader).toString());
    }

    /* JADX WARNING: Missing block: B:115:0x01d2, code skipped:
            r11 = -1;
     */
    /* JADX WARNING: Missing block: B:116:0x01d3, code skipped:
            r12 = "message";
            r17 = null;
     */
    /* JADX WARNING: Missing block: B:117:0x01d7, code skipped:
            switch(r11) {
                case 0: goto L_0x0c3e;
                case 1: goto L_0x0c36;
                case 2: goto L_0x0bef;
                case 3: goto L_0x0b5b;
                case 4: goto L_0x0b08;
                case 5: goto L_0x0a72;
                case 6: goto L_0x0614;
                case 7: goto L_0x05ff;
                case 8: goto L_0x05ee;
                case 9: goto L_0x05e9;
                case 10: goto L_0x05a5;
                case 11: goto L_0x0584;
                case 12: goto L_0x056f;
                case 13: goto L_0x056f;
                case 14: goto L_0x0caa;
                case 15: goto L_0x0523;
                case 16: goto L_0x0513;
                case 17: goto L_0x04ce;
                case 18: goto L_0x04ce;
                case 19: goto L_0x0499;
                case 20: goto L_0x047e;
                case 21: goto L_0x047e;
                case 22: goto L_0x0479;
                case 23: goto L_0x0435;
                case 24: goto L_0x0435;
                case 25: goto L_0x0406;
                case 26: goto L_0x0312;
                case 27: goto L_0x02df;
                case 28: goto L_0x02c7;
                case 29: goto L_0x02a4;
                case 30: goto L_0x028d;
                case 31: goto L_0x026e;
                case 32: goto L_0x024b;
                case 33: goto L_0x022c;
                case 34: goto L_0x01f7;
                case 35: goto L_0x01e0;
                default: goto L_0x01da;
            };
     */
    /* JADX WARNING: Missing block: B:120:0x01e0, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:121:0x01e2, code skipped:
            r3 = (com.iqoption.core.microservices.feed.response.d) com.iqoption.util.w.aWL().fromJson(r3, (java.lang.reflect.Type) com.iqoption.core.microservices.feed.response.d.class);
     */
    /* JADX WARNING: Missing block: B:122:0x01ee, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:123:0x01f0, code skipped:
            com.iqoption.feed.e.cOv.a(r3);
     */
    /* JADX WARNING: Missing block: B:124:0x01f7, code skipped:
            r3 = (com.iqoption.core.microservices.tradingengine.response.b.b) com.iqoption.util.w.aWL().fromJson(b(r19, r20), com.iqoption.core.microservices.tradingengine.response.b.b.class);
            com.iqoption.app.helpers.a.Gs().b(r3.getInstrumentType(), r3.aiJ());
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.d().setValue(r3.getInstrumentType()));
     */
    /* JADX WARNING: Missing block: B:125:0x022c, code skipped:
            r3 = com.iqoption.util.w.aWN().parse(r3).getAsLong();
     */
    /* JADX WARNING: Missing block: B:126:0x023c, code skipped:
            if (r3 <= 0) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:127:0x023e, code skipped:
            com.iqoption.mobbtech.connect.request.api.e.v(r3, com.iqoption.app.managers.l.HZ().Ib());
     */
    /* JADX WARNING: Missing block: B:129:0x024f, code skipped:
            if (com.iqoption.app.managers.feature.a.Ih() == false) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:131:0x0255, code skipped:
            if (com.iqoption.app.managers.feature.a.Ii() == false) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:132:0x0257, code skipped:
            r3 = (com.iqoption.dto.event.OtnEmissionExecuted) com.iqoption.util.w.aWL().fromJson(r3, (java.lang.reflect.Type) com.iqoption.dto.event.OtnEmissionExecuted.class);
     */
    /* JADX WARNING: Missing block: B:133:0x0263, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:134:0x0265, code skipped:
            com.iqoption.app.managers.e.Hv().onEmissionExecuted(r3);
     */
    /* JADX WARNING: Missing block: B:135:0x026e, code skipped:
            r3 = (com.iqoption.core.microservices.tradingengine.response.a.b) com.iqoption.util.w.aWL().fromJson(r3, (java.lang.reflect.Type) com.iqoption.core.microservices.tradingengine.response.a.b.class);
     */
    /* JADX WARNING: Missing block: B:136:0x027a, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:137:0x027c, code skipped:
            com.iqoption.app.helpers.a.Gs().b(r3.getInstrumentType(), r3.aiu());
     */
    /* JADX WARNING: Missing block: B:138:0x028d, code skipped:
            r3 = (com.iqoption.dto.Currencies.ConversionCurrency) com.iqoption.util.w.aWL().fromJson(r3, (java.lang.reflect.Type) com.iqoption.dto.Currencies.ConversionCurrency.class);
     */
    /* JADX WARNING: Missing block: B:139:0x0299, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:140:0x029b, code skipped:
            com.iqoption.app.b.DG().a(r3);
     */
    /* JADX WARNING: Missing block: B:141:0x02a4, code skipped:
            r3 = (com.iqoption.core.microservices.f.a.a.b) com.iqoption.util.w.aWL().fromJson(b(r19, r20), com.iqoption.core.microservices.f.a.a.b.class);
     */
    /* JADX WARNING: Missing block: B:142:0x02b4, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:143:0x02b6, code skipped:
            com.iqoption.app.helpers.a.Gs().c(r3.getInstrumentType(), r3.ahE());
     */
    /* JADX WARNING: Missing block: B:144:0x02c7, code skipped:
            com.iqoption.app.IQApp.Ev().k(java.lang.Boolean.valueOf(ao(r3).optBoolean("tc")));
     */
    /* JADX WARNING: Missing block: B:145:0x02df, code skipped:
            r3 = (com.iqoption.dto.entity.position.Position) com.iqoption.util.w.aWL().fromJson(r3, (java.lang.reflect.Type) com.iqoption.dto.entity.position.Position.class);
            com.iqoption.core.analytics.a.b.aZL.a((long) r3.getActiveId(), r3.getOrderIds(), r3.getInstrumentType(), r3.getId().longValue(), r3.getStatus());
            com.iqoption.app.managers.c.GS().e(r3);
     */
    /* JADX WARNING: Missing block: B:146:0x0312, code skipped:
            r3 = (com.iqoption.dto.entity.position.Order) com.iqoption.util.w.aWL().fromJson(r3, (java.lang.reflect.Type) com.iqoption.dto.entity.position.Order.class);
            r4 = "";
            com.iqoption.app.managers.c.GS().i(r3);
     */
    /* JADX WARNING: Missing block: B:147:0x0331, code skipped:
            if (com.iqoption.dto.entity.position.Order.MARKET.equalsIgnoreCase(r3.getType()) == false) goto L_0x0348;
     */
    /* JADX WARNING: Missing block: B:148:0x0333, code skipped:
            com.iqoption.core.analytics.a.b.aZL.a(r3.getId().longValue(), r3.getStatus(), r3.getRejectStatus());
     */
    /* JADX WARNING: Missing block: B:149:0x0348, code skipped:
            r6 = com.iqoption.dto.entity.position.Order.isMarketOrderFilled(r3);
            r7 = 10000;
            r9 = com.iqoption.x.R.drawable.local_toast_type_indicator_grey;
     */
    /* JADX WARNING: Missing block: B:150:0x0351, code skipped:
            if (r6 == false) goto L_0x03a0;
     */
    /* JADX WARNING: Missing block: B:152:0x0357, code skipped:
            if (com.iqoption.app.d.dW(r5) == false) goto L_0x03fb;
     */
    /* JADX WARNING: Missing block: B:154:0x036d, code skipped:
            if ((r3.getCount() * r3.getAvgPrice()) >= com.iqoption.app.d.Fa().Fd()) goto L_0x03fb;
     */
    /* JADX WARNING: Missing block: B:155:0x036f, code skipped:
            com.iqoption.core.util.j.I(com.iqoption.core.util.j.bQB.anl(), 2).setRoundingMode(java.math.RoundingMode.DOWN);
            r3 = com.iqoption.app.IQApp.Eu().getString(com.iqoption.x.R.string.options_purchased_for_the_wrong_amount, new java.lang.Object[]{r3.format(r10), com.iqoption.util.j.u(java.lang.Double.valueOf(r16))});
            com.iqoption.app.d.i(r5, false);
            r4 = r3;
     */
    /* JADX WARNING: Missing block: B:157:0x03aa, code skipped:
            if ("rejected".equals(r3.getStatus()) == false) goto L_0x03fb;
     */
    /* JADX WARNING: Missing block: B:158:0x03ac, code skipped:
            r4 = r3.getRejectStatus();
     */
    /* JADX WARNING: Missing block: B:159:0x03b4, code skipped:
            switch(r4.hashCode()) {
                case -1364918149: goto L_0x03d7;
                case -538734959: goto L_0x03d3;
                case -284840886: goto L_0x03cf;
                case -282863361: goto L_0x03cc;
                case 6908744: goto L_0x03c9;
                case 410402527: goto L_0x03c6;
                case 688092859: goto L_0x03c3;
                case 1848962578: goto L_0x03bf;
                case 1919658633: goto L_0x03b8;
                default: goto L_0x03b7;
            };
     */
    /* JADX WARNING: Missing block: B:161:0x03b8, code skipped:
            r5 = com.iqoption.dto.entity.position.Order.ORDER_REJECT_STATUS_INTERNAL_BILLING_EXCEPTION;
     */
    /* JADX WARNING: Missing block: B:162:0x03ba, code skipped:
            r4 = r4.equals(r5);
     */
    /* JADX WARNING: Missing block: B:163:0x03bf, code skipped:
            r5 = com.iqoption.dto.entity.position.Order.ORDER_REJECT_STATUS_SYMBOL_FORBIDDEN;
     */
    /* JADX WARNING: Missing block: B:164:0x03c3, code skipped:
            r5 = com.iqoption.dto.entity.position.Order.ORDER_REJECT_STATUS_EXCEEDS_LIMIT;
     */
    /* JADX WARNING: Missing block: B:165:0x03c6, code skipped:
            r5 = com.iqoption.dto.entity.position.Order.ORDER_REJECT_STATUS_RISK_EXCEPTION;
     */
    /* JADX WARNING: Missing block: B:166:0x03c9, code skipped:
            r5 = com.iqoption.dto.entity.position.Order.ORDER_REJECT_STATUS_INSTRUMENT_PRICE_NOT_FOUND;
     */
    /* JADX WARNING: Missing block: B:167:0x03cc, code skipped:
            r5 = com.iqoption.dto.entity.position.Order.ORDER_REJECT_STATUS_INTERNAL_BILLING_NOT_ENOUGH_BALANCE;
     */
    /* JADX WARNING: Missing block: B:168:0x03cf, code skipped:
            r5 = "unknown";
     */
    /* JADX WARNING: Missing block: B:169:0x03d3, code skipped:
            r5 = com.iqoption.dto.entity.position.Order.ORDER_REJECT_STATUS_USER_BALANCE_NOT_FOUND_OR_WRONG;
     */
    /* JADX WARNING: Missing block: B:170:0x03d7, code skipped:
            r5 = com.iqoption.dto.entity.position.Order.ORDER_REJECT_STATUS_TOO_MUCH_TIME_PASSED;
     */
    /* JADX WARNING: Missing block: B:172:0x03e5, code skipped:
            if (com.iqoption.dto.entity.position.Order.BUY.equals(r3.getSide()) == false) goto L_0x03eb;
     */
    /* JADX WARNING: Missing block: B:173:0x03e7, code skipped:
            r3 = com.iqoption.x.R.string.purchase_failed;
     */
    /* JADX WARNING: Missing block: B:174:0x03eb, code skipped:
            r3 = com.iqoption.x.R.string.selling_failed;
     */
    /* JADX WARNING: Missing block: B:175:0x03ee, code skipped:
            r4 = com.iqoption.app.IQApp.Eu().getString(r3);
            r9 = com.iqoption.x.R.drawable.local_toast_type_indicator_red;
            r7 = com.iqoption.dto.ToastEntity.ERROR_TOAST_DURATION;
     */
    /* JADX WARNING: Missing block: B:177:0x03ff, code skipped:
            if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:178:0x0401, code skipped:
            com.iqoption.fragment.ah.a(r9, r4, r7);
     */
    /* JADX WARNING: Missing block: B:179:0x0406, code skipped:
            r3 = (com.iqoption.dto.entity.result.ExpirationsResult) com.iqoption.util.w.aWL().fromJson(r3, (java.lang.reflect.Type) com.iqoption.dto.entity.result.ExpirationsResult.class);
            r4 = com.iqoption.app.helpers.a.Gs().a(r3.type, r3.underlying);
            r5 = com.iqoption.app.managers.a.e.Ig().h(r3.type);
     */
    /* JADX WARNING: Missing block: B:180:0x0428, code skipped:
            if (r4 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:181:0x042a, code skipped:
            if (r5 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:182:0x042c, code skipped:
            r5.a(r4, r3.getExpirations());
     */
    /* JADX WARNING: Missing block: B:183:0x0435, code skipped:
            r3 = b(r19, r20).getAsJsonObject();
            r4 = com.iqoption.core.data.model.InstrumentType.fromServerValue(r3.get("type").getAsString());
     */
    /* JADX WARNING: Missing block: B:184:0x0450, code skipped:
            if (r3.has(r10) == false) goto L_0x045b;
     */
    /* JADX WARNING: Missing block: B:185:0x0452, code skipped:
            r17 = r3.get(r10).getAsJsonArray();
     */
    /* JADX WARNING: Missing block: B:187:0x045f, code skipped:
            if (r3.has(r7) == false) goto L_0x0469;
     */
    /* JADX WARNING: Missing block: B:188:0x0461, code skipped:
            r17 = r3.get(r7).getAsJsonArray();
     */
    /* JADX WARNING: Missing block: B:189:0x0469, code skipped:
            r3 = r17;
     */
    /* JADX WARNING: Missing block: B:190:0x046b, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:191:0x046d, code skipped:
            com.iqoption.core.c.a.biM.execute(new com.iqoption.service.-$$Lambda$WebSocketHandler$9MdD5HkeFIOGvDOmUeqixyZDx3I(r3, r4));
     */
    /* JADX WARNING: Missing block: B:192:0x0479, code skipped:
            com.iqoption.app.managers.feature.c.a(r20);
     */
    /* JADX WARNING: Missing block: B:193:0x047e, code skipped:
            r4 = new com.iqoption.dto.entity.iqbus.SignalLegacy.SignalsEvent();
            r4.setValue(com.iqoption.util.w.aWL().fromJson(r3, (java.lang.reflect.Type) com.iqoption.dto.entity.iqbus.SignalLegacy[].class));
            com.iqoption.app.IQApp.Ew().bd(r4);
     */
    /* JADX WARNING: Missing block: B:194:0x0499, code skipped:
            r3 = (com.iqoption.core.microservices.risks.response.a.b) com.iqoption.util.w.aWL().fromJson(r3, (java.lang.reflect.Type) com.iqoption.core.microservices.risks.response.a.b.class);
     */
    /* JADX WARNING: Missing block: B:195:0x04a5, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:197:0x04af, code skipped:
            if (r3.ahe().ahd() == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:198:0x04b1, code skipped:
            com.iqoption.app.helpers.a.Gs().a(r3.getInstrumentType(), r3.getActiveId(), r3.ahe().ahd().intValue());
     */
    /* JADX WARNING: Missing block: B:199:0x04ce, code skipped:
            r3 = b(r19, r20).getAsJsonObject();
     */
    /* JADX WARNING: Missing block: B:200:0x04dc, code skipped:
            if (r3.has("error") != false) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:201:0x04de, code skipped:
            r4 = com.iqoption.core.util.u.i(r3.get("instrument"));
            com.iqoption.gl.c.aIy().setTradersMoodCallPercentage(com.iqoption.core.util.u.g(r3.get("asset_id")), com.iqoption.core.data.model.ActiveType.convertToActiveName(r4), (int) java.lang.Math.round(com.iqoption.core.util.u.e(r3.get(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.VALUE)) * 100.0d));
     */
    /* JADX WARNING: Missing block: B:202:0x0513, code skipped:
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.g("socket-reconnect-msg"));
     */
    /* JADX WARNING: Missing block: B:203:0x0523, code skipped:
            r3 = (com.iqoption.dto.entity.Tournament) com.iqoption.util.w.aWL().fromJson(r3, (java.lang.reflect.Type) com.iqoption.dto.entity.Tournament.class);
            r4 = com.iqoption.app.managers.a.GM().GP();
            r5 = r4.iterator();
     */
    /* JADX WARNING: Missing block: B:205:0x053f, code skipped:
            if (r5.hasNext() == false) goto L_0x0556;
     */
    /* JADX WARNING: Missing block: B:206:0x0541, code skipped:
            r6 = (com.iqoption.dto.entity.Tournament) r5.next();
     */
    /* JADX WARNING: Missing block: B:207:0x0553, code skipped:
            if (r6.getId().equals(r3.getId()) == false) goto L_0x053b;
     */
    /* JADX WARNING: Missing block: B:209:0x0556, code skipped:
            r6 = null;
     */
    /* JADX WARNING: Missing block: B:210:0x0558, code skipped:
            if (r6 != null) goto L_0x055e;
     */
    /* JADX WARNING: Missing block: B:211:0x055a, code skipped:
            r4.add(r3);
     */
    /* JADX WARNING: Missing block: B:212:0x055e, code skipped:
            r6.merge(r3);
     */
    /* JADX WARNING: Missing block: B:213:0x0561, code skipped:
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.m());
     */
    /* JADX WARNING: Missing block: B:214:0x056f, code skipped:
            com.iqoption.app.managers.c.GS().g(com.iqoption.mobbtech.connect.response.options.c.jsonCore2Option(com.iqoption.util.w.aWN().parse(r3)));
     */
    /* JADX WARNING: Missing block: B:215:0x0584, code skipped:
            r3 = ao(r3);
     */
    /* JADX WARNING: Missing block: B:216:0x058e, code skipped:
            if (r3.optBoolean("isSuccessful", true) != false) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:218:0x0594, code skipped:
            if (r3.has(r12) == false) goto L_0x059e;
     */
    /* JADX WARNING: Missing block: B:219:0x0596, code skipped:
            r17 = r3.getJSONArray(r12).getString(0);
     */
    /* JADX WARNING: Missing block: B:220:0x059e, code skipped:
            jI(r17);
     */
    /* JADX WARNING: Missing block: B:221:0x05a5, code skipped:
            r4 = java.lang.String.valueOf(com.iqoption.app.b.DG().getGroupId());
            r3 = ao(r3);
            r5 = com.iqoption.core.data.model.ActiveType.BINARY_ACTIVE.getServerValue();
     */
    /* JADX WARNING: Missing block: B:222:0x05bf, code skipped:
            if (r3.has(r5) == false) goto L_0x05ce;
     */
    /* JADX WARNING: Missing block: B:223:0x05c1, code skipped:
            a(r3.getJSONObject(r5).getJSONObject(r4), com.iqoption.core.data.model.InstrumentType.BINARY_INSTRUMENT);
     */
    /* JADX WARNING: Missing block: B:224:0x05ce, code skipped:
            r5 = com.iqoption.core.data.model.ActiveType.TURBO_ACTIVE.getServerValue();
     */
    /* JADX WARNING: Missing block: B:225:0x05d8, code skipped:
            if (r3.has(r5) == false) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:226:0x05da, code skipped:
            a(r3.getJSONObject(r5).getJSONObject(r4), com.iqoption.core.data.model.InstrumentType.TURBO_INSTRUMENT);
     */
    /* JADX WARNING: Missing block: B:227:0x05e9, code skipped:
            aq(r3);
     */
    /* JADX WARNING: Missing block: B:228:0x05ee, code skipped:
            ce(com.iqoption.util.w.aWN().parse(r3).getAsLong());
     */
    /* JADX WARNING: Missing block: B:229:0x05ff, code skipped:
            com.iqoption.app.d.Fa().dK(1);
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.e());
     */
    /* JADX WARNING: Missing block: B:230:0x0614, code skipped:
            r3 = b(r19, r20);
     */
    /* JADX WARNING: Missing block: B:231:0x061c, code skipped:
            if (r3.isJsonObject() == false) goto L_0x0a5f;
     */
    /* JADX WARNING: Missing block: B:232:0x061e, code skipped:
            r3 = r3.getAsJsonObject();
            r5 = com.iqoption.app.b.DG();
     */
    /* JADX WARNING: Missing block: B:233:0x062c, code skipped:
            if (r3.has("id") == false) goto L_0x0645;
     */
    /* JADX WARNING: Missing block: B:235:0x0632, code skipped:
            if (r3.has(r8) == false) goto L_0x0645;
     */
    /* JADX WARNING: Missing block: B:236:0x0634, code skipped:
            C(java.lang.Long.valueOf(com.iqoption.core.util.u.a(r3.get(r8), -1)));
     */
    /* JADX WARNING: Missing block: B:238:0x0649, code skipped:
            if (r3.has(r9) == false) goto L_0x0734;
     */
    /* JADX WARNING: Missing block: B:239:0x064b, code skipped:
            r7 = r3.getAsJsonObject(r9);
     */
    /* JADX WARNING: Missing block: B:240:0x0651, code skipped:
            if (r5.asc != false) goto L_0x0655;
     */
    /* JADX WARNING: Missing block: B:241:0x0653, code skipped:
            r8 = 1;
     */
    /* JADX WARNING: Missing block: B:242:0x0655, code skipped:
            r8 = null;
     */
    /* JADX WARNING: Missing block: B:243:0x0656, code skipped:
            r5.asc = true;
            r5.asd = com.iqoption.core.util.u.g(r7.get(androidx.core.app.NotificationCompat.CATEGORY_STATUS));
            r5.aS(com.iqoption.core.util.u.a(r7.get("isRegulatedUser"), false));
            r5.asg = com.iqoption.core.util.u.a(r7.get("isProfileNeeded"), false);
            r5.ash = com.iqoption.core.util.u.a(r7.get("isPhoneNeeded"), false);
            r5.asi = com.iqoption.core.util.u.a(r7.get("isDocumentsNeeded"), false);
            r5.asj = com.iqoption.core.util.u.a(r7.get("isDocumentsDeclined"), false);
            r5.asl = com.iqoption.core.util.u.a(r7.get("isProfileFilled"), false);
            r5.asm = com.iqoption.core.util.u.a(r7.get("isPhoneFilled"), false);
            r5.asn = com.iqoption.core.util.u.a(r7.get("isDocumentsUploaded"), false);
            r5.aso = com.iqoption.core.util.u.a(r7.get("isPhoneConfirmationSkipped"), false);
            r5.aQ(com.iqoption.core.util.u.a(r7.get("isPhoneConfirmed"), false));
            r5.asq = com.iqoption.core.util.u.a(r7.get("isDocumentsUploadSkipped"), false);
     */
    /* JADX WARNING: Missing block: B:244:0x06eb, code skipped:
            if (r8 == null) goto L_0x0701;
     */
    /* JADX WARNING: Missing block: B:245:0x06ed, code skipped:
            r5.asr.cn(java.lang.Boolean.valueOf(com.iqoption.core.util.u.a(r7.get("isDocumentsApproved"), false)));
     */
    /* JADX WARNING: Missing block: B:246:0x0701, code skipped:
            r5.asr.cm(java.lang.Boolean.valueOf(com.iqoption.core.util.u.a(r7.get("isDocumentsApproved"), false)));
     */
    /* JADX WARNING: Missing block: B:247:0x0714, code skipped:
            r5.ase.cm(java.lang.Integer.valueOf(com.iqoption.core.util.u.a(r7.get("daysLeftToVerify"), -1)));
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.l());
     */
    /* JADX WARNING: Missing block: B:249:0x0738, code skipped:
            if (r3.has(r6) == false) goto L_0x0776;
     */
    /* JADX WARNING: Missing block: B:250:0x073a, code skipped:
            r5.i(java.lang.Long.valueOf(com.iqoption.core.util.u.f(r3.get(r6))));
            r6 = com.iqoption.app.IQApp.aO(com.iqoption.app.IQApp.Eu());
            r6.set("&uid", java.lang.Long.toString(r5.getUserId()));
            r6.send(((com.google.android.gms.analytics.HitBuilders.AppViewBuilder) new com.google.android.gms.analytics.HitBuilders.AppViewBuilder().setCustomDimension(1, r6.get("&uid"))).build());
     */
    /* JADX WARNING: Missing block: B:252:0x077a, code skipped:
            if (r3.has(r4) == false) goto L_0x0787;
     */
    /* JADX WARNING: Missing block: B:253:0x077c, code skipped:
            r5.U(com.iqoption.core.util.u.f(r3.get(r4)));
     */
    /* JADX WARNING: Missing block: B:255:0x078d, code skipped:
            if (r3.has("email") == false) goto L_0x079c;
     */
    /* JADX WARNING: Missing block: B:256:0x078f, code skipped:
            r5.dB(com.iqoption.core.util.u.i(r3.get("email")));
     */
    /* JADX WARNING: Missing block: B:258:0x07a2, code skipped:
            if (r3.has("new_email") == false) goto L_0x07b1;
     */
    /* JADX WARNING: Missing block: B:259:0x07a4, code skipped:
            r5.dC(com.iqoption.core.util.u.i(r3.get("new_email")));
     */
    /* JADX WARNING: Missing block: B:261:0x07b8, code skipped:
            if (r3.has("tin") == false) goto L_0x07c8;
     */
    /* JADX WARNING: Missing block: B:262:0x07ba, code skipped:
            r5.dA(com.iqoption.core.util.u.i(r3.get("tin")));
     */
    /* JADX WARNING: Missing block: B:264:0x07ce, code skipped:
            if (r3.has("is_activated") == false) goto L_0x07dd;
     */
    /* JADX WARNING: Missing block: B:265:0x07d0, code skipped:
            r5.setActivated(com.iqoption.core.util.u.h(r3.get("is_activated")));
     */
    /* JADX WARNING: Missing block: B:267:0x07e3, code skipped:
            if (r3.has("auth_two_factor") == false) goto L_0x07f2;
     */
    /* JADX WARNING: Missing block: B:268:0x07e5, code skipped:
            r5.aN(com.iqoption.core.util.u.h(r3.get("auth_two_factor")));
     */
    /* JADX WARNING: Missing block: B:270:0x07f8, code skipped:
            if (r3.has("first_name") == false) goto L_0x0807;
     */
    /* JADX WARNING: Missing block: B:271:0x07fa, code skipped:
            r5.setFirstName(com.iqoption.core.util.u.i(r3.get("first_name")));
     */
    /* JADX WARNING: Missing block: B:273:0x080d, code skipped:
            if (r3.has("last_name") == false) goto L_0x081c;
     */
    /* JADX WARNING: Missing block: B:274:0x080f, code skipped:
            r5.setLastName(com.iqoption.core.util.u.i(r3.get("last_name")));
     */
    /* JADX WARNING: Missing block: B:276:0x0822, code skipped:
            if (r3.has("nickname") == false) goto L_0x0831;
     */
    /* JADX WARNING: Missing block: B:277:0x0824, code skipped:
            r5.dx(com.iqoption.core.util.u.i(r3.get("nickname")));
     */
    /* JADX WARNING: Missing block: B:279:0x0837, code skipped:
            if (r3.has("messages") == false) goto L_0x084c;
     */
    /* JADX WARNING: Missing block: B:280:0x0839, code skipped:
            r5.asb.cm(java.lang.Integer.valueOf(com.iqoption.core.util.u.g(r3.get("messages"))));
     */
    /* JADX WARNING: Missing block: B:282:0x0852, code skipped:
            if (r3.has("group_id") == false) goto L_0x0861;
     */
    /* JADX WARNING: Missing block: B:283:0x0854, code skipped:
            r5.dI(com.iqoption.core.util.u.g(r3.get("group_id")));
     */
    /* JADX WARNING: Missing block: B:285:0x0867, code skipped:
            if (r3.has("locale") == false) goto L_0x0876;
     */
    /* JADX WARNING: Missing block: B:286:0x0869, code skipped:
            r5.dE(com.iqoption.core.util.u.i(r3.get("locale")));
     */
    /* JADX WARNING: Missing block: B:288:0x087c, code skipped:
            if (r3.has("deposit_count") == false) goto L_0x088b;
     */
    /* JADX WARNING: Missing block: B:289:0x087e, code skipped:
            r5.dJ(com.iqoption.core.util.u.g(r3.get("deposit_count")));
     */
    /* JADX WARNING: Missing block: B:291:0x0891, code skipped:
            if (r3.has("flag") == false) goto L_0x08a0;
     */
    /* JADX WARNING: Missing block: B:292:0x0893, code skipped:
            r5.dG(com.iqoption.core.util.u.i(r3.get("flag")));
     */
    /* JADX WARNING: Missing block: B:294:0x08a6, code skipped:
            if (r3.has("public") == false) goto L_0x08ba;
     */
    /* JADX WARNING: Missing block: B:296:0x08b2, code skipped:
            if (com.iqoption.core.util.u.a(r3.get("public"), 0) != 1) goto L_0x08b6;
     */
    /* JADX WARNING: Missing block: B:297:0x08b4, code skipped:
            r4 = true;
     */
    /* JADX WARNING: Missing block: B:298:0x08b6, code skipped:
            r4 = false;
     */
    /* JADX WARNING: Missing block: B:299:0x08b7, code skipped:
            r5.aM(r4);
     */
    /* JADX WARNING: Missing block: B:301:0x08c0, code skipped:
            if (r3.has("personal_data_policy") == false) goto L_0x08d9;
     */
    /* JADX WARNING: Missing block: B:302:0x08c2, code skipped:
            r4 = r3.getAsJsonObject("personal_data_policy");
            r6 = r5.Ed();
            r4 = r6.g(r4);
     */
    /* JADX WARNING: Missing block: B:303:0x08d4, code skipped:
            if (r6.equals(r4) != false) goto L_0x08d9;
     */
    /* JADX WARNING: Missing block: B:304:0x08d6, code skipped:
            r5.a(r4);
     */
    /* JADX WARNING: Missing block: B:306:0x08df, code skipped:
            if (r3.has("forget_status") == false) goto L_0x08f6;
     */
    /* JADX WARNING: Missing block: B:307:0x08e1, code skipped:
            r5.b((com.iqoption.core.microservices.busapi.response.a) com.iqoption.util.w.aWM().fromJson(r3.get("forget_status"), com.iqoption.core.microservices.busapi.response.a.class));
     */
    /* JADX WARNING: Missing block: B:309:0x08fc, code skipped:
            if (r3.has("country_id") == false) goto L_0x090b;
     */
    /* JADX WARNING: Missing block: B:310:0x08fe, code skipped:
            r5.V(com.iqoption.core.util.u.f(r3.get("country_id")));
     */
    /* JADX WARNING: Missing block: B:312:0x0911, code skipped:
            if (r3.has("phone") == false) goto L_0x0930;
     */
    /* JADX WARNING: Missing block: B:313:0x0913, code skipped:
            r4 = com.iqoption.core.util.u.i(r3.get("phone")).split(" ");
     */
    /* JADX WARNING: Missing block: B:314:0x0924, code skipped:
            if (r4.length <= 1) goto L_0x0930;
     */
    /* JADX WARNING: Missing block: B:315:0x0926, code skipped:
            r5.setCountryCode(r4[0]);
            r5.setPhone(r4[1]);
     */
    /* JADX WARNING: Missing block: B:317:0x0936, code skipped:
            if (r3.has("city") == false) goto L_0x0945;
     */
    /* JADX WARNING: Missing block: B:318:0x0938, code skipped:
            r5.setCity(com.iqoption.core.util.u.i(r3.get("city")));
     */
    /* JADX WARNING: Missing block: B:320:0x094b, code skipped:
            if (r3.has("address") == false) goto L_0x095a;
     */
    /* JADX WARNING: Missing block: B:321:0x094d, code skipped:
            r5.setAddress(com.iqoption.core.util.u.i(r3.get("address")));
     */
    /* JADX WARNING: Missing block: B:323:0x0960, code skipped:
            if (r3.has("postal_index") == false) goto L_0x096f;
     */
    /* JADX WARNING: Missing block: B:324:0x0962, code skipped:
            r5.dy(com.iqoption.core.util.u.i(r3.get("postal_index")));
     */
    /* JADX WARNING: Missing block: B:326:0x0975, code skipped:
            if (r3.has("nationality") == false) goto L_0x0984;
     */
    /* JADX WARNING: Missing block: B:327:0x0977, code skipped:
            r5.dz(com.iqoption.core.util.u.i(r3.get("nationality")));
     */
    /* JADX WARNING: Missing block: B:329:0x098a, code skipped:
            if (r3.has("gender") == false) goto L_0x099d;
     */
    /* JADX WARNING: Missing block: B:330:0x098c, code skipped:
            r5.a(com.iqoption.core.data.model.user.Gender.fromServerValue(com.iqoption.core.util.u.i(r3.get("gender"))));
     */
    /* JADX WARNING: Missing block: B:332:0x09a3, code skipped:
            if (r3.has("skey") == false) goto L_0x09b2;
     */
    /* JADX WARNING: Missing block: B:333:0x09a5, code skipped:
            r5.dF(com.iqoption.core.util.u.i(r3.get("skey")));
     */
    /* JADX WARNING: Missing block: B:335:0x09b9, code skipped:
            if (r3.has("user_group") == false) goto L_0x09cf;
     */
    /* JADX WARNING: Missing block: B:336:0x09bb, code skipped:
            r5.aP(com.iqoption.core.util.u.i(r3.get("user_group")).equals("VIP"));
     */
    /* JADX WARNING: Missing block: B:338:0x09d5, code skipped:
            if (r3.has("client_category_id") == false) goto L_0x09ec;
     */
    /* JADX WARNING: Missing block: B:339:0x09d7, code skipped:
            r5.a(com.iqoption.protrader.a.q(java.lang.Integer.valueOf(com.iqoption.core.util.u.g(r3.get("client_category_id")))));
     */
    /* JADX WARNING: Missing block: B:341:0x09f3, code skipped:
            if (r3.has("trial") == false) goto L_0x0a05;
     */
    /* JADX WARNING: Missing block: B:342:0x09f5, code skipped:
            r3 = r5.aO(com.iqoption.core.util.u.h(r3.get("trial")));
     */
    /* JADX WARNING: Missing block: B:343:0x0a05, code skipped:
            r3 = false;
     */
    /* JADX WARNING: Missing block: B:344:0x0a06, code skipped:
            if (r3 == false) goto L_0x0a1c;
     */
    /* JADX WARNING: Missing block: B:345:0x0a08, code skipped:
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.b().setValue(java.lang.Boolean.valueOf(false)));
     */
    /* JADX WARNING: Missing block: B:346:0x0a1c, code skipped:
            r5.aR(true);
            r5.aM(com.iqoption.app.IQApp.Eu());
     */
    /* JADX WARNING: Missing block: B:347:0x0a2e, code skipped:
            if (android.text.TextUtils.isEmpty(r5.getLocale()) != false) goto L_0x0a48;
     */
    /* JADX WARNING: Missing block: B:349:0x0a3c, code skipped:
            if (r5.getLocale().equals(com.iqoption.core.d.getLocale()) != false) goto L_0x0a43;
     */
    /* JADX WARNING: Missing block: B:351:0x0a40, code skipped:
            if (r1.dRL != null) goto L_0x0a43;
     */
    /* JADX WARNING: Missing block: B:353:0x0a43, code skipped:
            aTs();
     */
    /* JADX WARNING: Missing block: B:354:0x0a48, code skipped:
            r1.dRL = new com.iqoption.mobbtech.connect.request.a();
            r1.dRL.a(com.iqoption.app.IQApp.Eu(), new com.iqoption.service.-$$Lambda$WebSocketHandler$wZyDRxYo5iB5rYQEUqMo-riiUJA(r1));
     */
    /* JADX WARNING: Missing block: B:355:0x0a5f, code skipped:
            com.iqoption.util.v.b(com.iqoption.c.b.Kd(), new com.iqoption.service.-$$Lambda$WebSocketHandler$UzkpCCcao2jyy5M7y8rPasdCK4k(r1), new com.iqoption.service.-$$Lambda$WebSocketHandler$R9XoajHykB5jmVr3raE7K1Eii1Q(r1));
     */
    /* JADX WARNING: Missing block: B:356:0x0a72, code skipped:
            r3 = (com.iqoption.core.microservices.internalbilling.a.a) com.iqoption.util.w.aWL().fromJson(b(r19, r20), com.iqoption.core.microservices.internalbilling.a.a.class);
     */
    /* JADX WARNING: Missing block: B:357:0x0a82, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:358:0x0a84, code skipped:
            C(java.lang.Long.valueOf(r3.getId()));
            r4 = com.iqoption.app.b.DG();
            r6 = r4.f(java.lang.Long.valueOf(r3.getId()));
     */
    /* JADX WARNING: Missing block: B:359:0x0a9f, code skipped:
            if (r6 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:360:0x0aa1, code skipped:
            r5 = r3.aeo();
            r15 = r4.DL();
            r13 = java.lang.Long.valueOf(r3.getId());
            r7 = r6.id;
            r9 = r3.getType();
            r10 = r6.amount;
     */
    /* JADX WARNING: Missing block: B:361:0x0ab9, code skipped:
            if (r5 == null) goto L_0x0ac3;
     */
    /* JADX WARNING: Missing block: B:362:0x0abb, code skipped:
            r17 = java.lang.Double.valueOf(r5.doubleValue());
     */
    /* JADX WARNING: Missing block: B:363:0x0ac3, code skipped:
            r15.put(r13, r6.copy(r7, r9, r10, r17, r3.getCurrency(), r6.index));
     */
    /* JADX WARNING: Missing block: B:364:0x0aea, code skipped:
            if (java.util.Objects.equals(java.lang.Long.valueOf(r4.DH()), java.lang.Long.valueOf(r3.getId())) == false) goto L_0x0afa;
     */
    /* JADX WARNING: Missing block: B:365:0x0aec, code skipped:
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.k());
     */
    /* JADX WARNING: Missing block: B:366:0x0afa, code skipped:
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.j());
     */
    /* JADX WARNING: Missing block: B:367:0x0b08, code skipped:
            r3 = (com.iqoption.dto.Balance) com.iqoption.util.w.aWL().fromJson(b(r19, r20), com.iqoption.dto.Balance.class);
     */
    /* JADX WARNING: Missing block: B:368:0x0b18, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:369:0x0b1a, code skipped:
            r4 = com.iqoption.app.b.DG();
            r4.DL().put(java.lang.Long.valueOf(r3.id), r3);
     */
    /* JADX WARNING: Missing block: B:370:0x0b3d, code skipped:
            if (java.util.Objects.equals(java.lang.Long.valueOf(r4.DH()), java.lang.Long.valueOf(r3.id)) == false) goto L_0x0b4d;
     */
    /* JADX WARNING: Missing block: B:371:0x0b3f, code skipped:
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.k());
     */
    /* JADX WARNING: Missing block: B:372:0x0b4d, code skipped:
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.j());
     */
    /* JADX WARNING: Missing block: B:373:0x0b5b, code skipped:
            r3 = (com.iqoption.dto.BalanceChanged) com.iqoption.util.w.aWL().fromJson(b(r19, r20), com.iqoption.dto.BalanceChanged.class);
     */
    /* JADX WARNING: Missing block: B:374:0x0b6b, code skipped:
            if (r3 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:376:0x0b71, code skipped:
            if (r3.getCurrentBalance() == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:377:0x0b73, code skipped:
            r4 = com.iqoption.app.b.DG();
            r5 = r4.f(java.lang.Long.valueOf(r3.getId()));
            r6 = r3.getCurrentBalance();
     */
    /* JADX WARNING: Missing block: B:378:0x0b87, code skipped:
            if (r5 == null) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:380:0x0b8f, code skipped:
            if (r5.index > r6.index) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:381:0x0b91, code skipped:
            r5 = (com.iqoption.dto.Balance) r4.DL().get(java.lang.Long.valueOf(r3.getId()));
     */
    /* JADX WARNING: Missing block: B:382:0x0ba3, code skipped:
            if (r5 == null) goto L_0x0ba9;
     */
    /* JADX WARNING: Missing block: B:383:0x0ba5, code skipped:
            r17 = r5.getAuthAmount();
     */
    /* JADX WARNING: Missing block: B:384:0x0ba9, code skipped:
            r6.setAuthAmount(r17);
            r4.DL().put(java.lang.Long.valueOf(r3.getId()), r6);
     */
    /* JADX WARNING: Missing block: B:385:0x0bd1, code skipped:
            if (java.util.Objects.equals(java.lang.Long.valueOf(r4.DH()), java.lang.Long.valueOf(r3.getId())) == false) goto L_0x0be1;
     */
    /* JADX WARNING: Missing block: B:386:0x0bd3, code skipped:
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.k());
     */
    /* JADX WARNING: Missing block: B:387:0x0be1, code skipped:
            com.iqoption.app.IQApp.Ew().bd(new com.iqoption.service.e.j());
     */
    /* JADX WARNING: Missing block: B:388:0x0bef, code skipped:
            r1.bgB = com.iqoption.util.w.aWN().parse(r3).getAsString();
            com.iqoption.app.IQApp.Ex().bt(new com.iqoption.core.b.c(r1.bgB));
            com.iqoption.analytics.EventManager.BS().a(com.iqoption.dto.Event.Builder(com.iqoption.dto.Event.CATEGORY_SYSTEM, "connection-ws").setParameters(com.iqoption.core.util.u.anp().o("ws_front", r1.bgB).anr()).build());
     */
    /* JADX WARNING: Missing block: B:389:0x0c36, code skipped:
            m(ao(r3));
     */
    /* JADX WARNING: Missing block: B:390:0x0c3e, code skipped:
            ap(r3);
     */
    /* JADX WARNING: Missing block: B:391:0x0c42, code skipped:
            r3 = com.iqoption.util.w.aWN().parse(r3);
     */
    /* JADX WARNING: Missing block: B:392:0x0c4a, code skipped:
            if (r3.isJsonNull() != false) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:393:0x0c4c, code skipped:
            r1.dSn.onNext(new com.iqoption.core.connect.m(r2, r3));
     */
    /* JADX WARNING: Missing block: B:394:0x0c5a, code skipped:
            if (r3.isJsonObject() == false) goto L_0x0c8d;
     */
    /* JADX WARNING: Missing block: B:395:0x0c5c, code skipped:
            r3 = r3.getAsJsonObject();
     */
    /* JADX WARNING: Missing block: B:396:0x0c64, code skipped:
            if (r3.has(r12) == false) goto L_0x0caa;
     */
    /* JADX WARNING: Missing block: B:397:0x0c66, code skipped:
            r3 = r3.get(r12);
     */
    /* JADX WARNING: Missing block: B:398:0x0c6e, code skipped:
            if (r3.isJsonArray() == false) goto L_0x0c7d;
     */
    /* JADX WARNING: Missing block: B:399:0x0c70, code skipped:
            r3 = r3.getAsJsonArray().get(0).getAsString();
     */
    /* JADX WARNING: Missing block: B:400:0x0c7d, code skipped:
            r3 = r3.getAsString();
     */
    /* JADX WARNING: Missing block: B:401:0x0c81, code skipped:
            com.iqoption.app.a.b.b(r3.trim(), com.iqoption.app.IQApp.Eu());
     */
    /* JADX WARNING: Missing block: B:402:0x0c8d, code skipped:
            r3.isJsonPrimitive();
     */
    private void a(java.lang.String r19, com.google.gson.stream.JsonReader r20) {
        /*
        r18 = this;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r4 = "birthdate";
        r5 = "show_error_position_price";
        r6 = "user_id";
        r7 = "underlying";
        r8 = "balance_id";
        r9 = "kyc";
        r10 = "instruments";
        r11 = android.text.TextUtils.isEmpty(r19);
        if (r11 == 0) goto L_0x001d;
    L_0x001c:
        return;
    L_0x001d:
        r11 = r19.hashCode();	 Catch:{ Exception -> 0x0c91 }
        r13 = 2;
        r14 = 1;
        r15 = 0;
        switch(r11) {
            case -2077379832: goto L_0x01c6;
            case -2013495359: goto L_0x01bb;
            case -1916875860: goto L_0x01b0;
            case -1904237040: goto L_0x01a5;
            case -1775401697: goto L_0x0199;
            case -1755879709: goto L_0x018e;
            case -1718276641: goto L_0x0183;
            case -1635920301: goto L_0x0179;
            case -1427658798: goto L_0x016e;
            case -1401094566: goto L_0x0162;
            case -841665709: goto L_0x0156;
            case -682320075: goto L_0x014a;
            case -627183028: goto L_0x013d;
            case -595389697: goto L_0x0131;
            case -454420285: goto L_0x0126;
            case -343701767: goto L_0x0119;
            case -309425751: goto L_0x010e;
            case -189629463: goto L_0x0101;
            case -164809481: goto L_0x00f6;
            case 89921373: goto L_0x00ea;
            case 97705513: goto L_0x00df;
            case 163724294: goto L_0x00d2;
            case 200896764: goto L_0x00c6;
            case 245420141: goto L_0x00bb;
            case 271022332: goto L_0x00af;
            case 323634397: goto L_0x00a2;
            case 635152030: goto L_0x0097;
            case 643209284: goto L_0x008b;
            case 925957011: goto L_0x007e;
            case 1110373621: goto L_0x0071;
            case 1261262902: goto L_0x0065;
            case 1323755748: goto L_0x0059;
            case 1514423748: goto L_0x004d;
            case 1861364929: goto L_0x0041;
            case 2088265419: goto L_0x0035;
            case 2134311631: goto L_0x0029;
            default: goto L_0x0027;
        };	 Catch:{ Exception -> 0x0c91 }
    L_0x0027:
        goto L_0x01d2;
    L_0x0029:
        r11 = "candle-generated";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0031:
        r11 = 9;
        goto L_0x01d3;
    L_0x0035:
        r11 = "signals";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x003d:
        r11 = 20;
        goto L_0x01d3;
    L_0x0041:
        r11 = "option-opened";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0049:
        r11 = 12;
        goto L_0x01d3;
    L_0x004d:
        r11 = "option-closed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0055:
        r11 = 13;
        goto L_0x01d3;
    L_0x0059:
        r11 = "feature-updated";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0061:
        r11 = 22;
        goto L_0x01d3;
    L_0x0065:
        r11 = "listInfoData";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x006d:
        r11 = 14;
        goto L_0x01d3;
    L_0x0071:
        r11 = "underlying-list-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x007a:
        r11 = 24;
        goto L_0x01d3;
    L_0x007e:
        r11 = "user-emission-executed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0087:
        r11 = 32;
        goto L_0x01d3;
    L_0x008b:
        r11 = "user-loyalty";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0094:
        r11 = 7;
        goto L_0x01d3;
    L_0x0097:
        r11 = "auth-balance-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x009f:
        r11 = 5;
        goto L_0x01d3;
    L_0x00a2:
        r11 = "timeChange";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x00ab:
        r11 = 10;
        goto L_0x01d3;
    L_0x00af:
        r11 = "hf-signals";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x00b7:
        r11 = 21;
        goto L_0x01d3;
    L_0x00bb:
        r11 = "buyback";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x00c3:
        r11 = 1;
        goto L_0x01d3;
    L_0x00c6:
        r11 = "heartbeat";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x00ce:
        r11 = 33;
        goto L_0x01d3;
    L_0x00d2:
        r11 = "traders-mood-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x00db:
        r11 = 18;
        goto L_0x01d3;
    L_0x00df:
        r11 = "front";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x00e7:
        r11 = 2;
        goto L_0x01d3;
    L_0x00ea:
        r11 = "feed-item-info-update";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x00f2:
        r11 = 35;
        goto L_0x01d3;
    L_0x00f6:
        r11 = "balance-created";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x00fe:
        r11 = 4;
        goto L_0x01d3;
    L_0x0101:
        r11 = "top-assets-updated";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x010a:
        r11 = 29;
        goto L_0x01d3;
    L_0x010e:
        r11 = "profile";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0116:
        r11 = 6;
        goto L_0x01d3;
    L_0x0119:
        r11 = "tournamentChange";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0122:
        r11 = 15;
        goto L_0x01d3;
    L_0x0126:
        r11 = "balance-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x012e:
        r11 = 3;
        goto L_0x01d3;
    L_0x0131:
        r11 = "currency-updated";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0139:
        r11 = 30;
        goto L_0x01d3;
    L_0x013d:
        r11 = "user-routed-to-trading-cluster";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0146:
        r11 = 28;
        goto L_0x01d3;
    L_0x014a:
        r11 = "order-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0152:
        r11 = 26;
        goto L_0x01d3;
    L_0x0156:
        r11 = "instruments-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x015e:
        r11 = 23;
        goto L_0x01d3;
    L_0x0162:
        r11 = "recconnect";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x016a:
        r11 = 16;
        goto L_0x01d3;
    L_0x016e:
        r11 = "commission-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0176:
        r11 = 19;
        goto L_0x01d3;
    L_0x0179:
        r11 = "spot-buyback-quote-generated";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0181:
        r11 = 0;
        goto L_0x01d3;
    L_0x0183:
        r11 = "buyComplete";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x018b:
        r11 = 11;
        goto L_0x01d3;
    L_0x018e:
        r11 = "expiration-list-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x0196:
        r11 = 25;
        goto L_0x01d3;
    L_0x0199:
        r11 = "traders-mood";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x01a2:
        r11 = 17;
        goto L_0x01d3;
    L_0x01a5:
        r11 = "position-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x01ad:
        r11 = 27;
        goto L_0x01d3;
    L_0x01b0:
        r11 = "commission-settings-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x01b8:
        r11 = 31;
        goto L_0x01d3;
    L_0x01bb:
        r11 = "available-leverages-changed";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x01c3:
        r11 = 34;
        goto L_0x01d3;
    L_0x01c6:
        r11 = "timeSync";
        r11 = r2.equals(r11);	 Catch:{ Exception -> 0x0c91 }
        if (r11 == 0) goto L_0x01d2;
    L_0x01cf:
        r11 = 8;
        goto L_0x01d3;
    L_0x01d2:
        r11 = -1;
    L_0x01d3:
        r12 = "message";
        r17 = 0;
        switch(r11) {
            case 0: goto L_0x0c3e;
            case 1: goto L_0x0c36;
            case 2: goto L_0x0bef;
            case 3: goto L_0x0b5b;
            case 4: goto L_0x0b08;
            case 5: goto L_0x0a72;
            case 6: goto L_0x0614;
            case 7: goto L_0x05ff;
            case 8: goto L_0x05ee;
            case 9: goto L_0x05e9;
            case 10: goto L_0x05a5;
            case 11: goto L_0x0584;
            case 12: goto L_0x056f;
            case 13: goto L_0x056f;
            case 14: goto L_0x0caa;
            case 15: goto L_0x0523;
            case 16: goto L_0x0513;
            case 17: goto L_0x04ce;
            case 18: goto L_0x04ce;
            case 19: goto L_0x0499;
            case 20: goto L_0x047e;
            case 21: goto L_0x047e;
            case 22: goto L_0x0479;
            case 23: goto L_0x0435;
            case 24: goto L_0x0435;
            case 25: goto L_0x0406;
            case 26: goto L_0x0312;
            case 27: goto L_0x02df;
            case 28: goto L_0x02c7;
            case 29: goto L_0x02a4;
            case 30: goto L_0x028d;
            case 31: goto L_0x026e;
            case 32: goto L_0x024b;
            case 33: goto L_0x022c;
            case 34: goto L_0x01f7;
            case 35: goto L_0x01e0;
            default: goto L_0x01da;
        };
    L_0x01da:
        r4 = com.iqoption.util.w.aWN();	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0c42;
    L_0x01e0:
        if (r3 == 0) goto L_0x0caa;
    L_0x01e2:
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.core.microservices.feed.response.d.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.core.microservices.feed.response.d) r3;	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0caa;
    L_0x01f0:
        r4 = com.iqoption.feed.e.cOv;	 Catch:{ Exception -> 0x0c91 }
        r4.a(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x01f7:
        r3 = r18.b(r19, r20);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.core.microservices.tradingengine.response.b.b.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.core.microservices.tradingengine.response.b.b) r3;	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.getInstrumentType();	 Catch:{ Exception -> 0x0c91 }
        r6 = r3.aiJ();	 Catch:{ Exception -> 0x0c91 }
        r4.b(r5, r6);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r5 = new com.iqoption.service.e$d;	 Catch:{ Exception -> 0x0c91 }
        r5.<init>();	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.getInstrumentType();	 Catch:{ Exception -> 0x0c91 }
        r3 = r5.setValue(r3);	 Catch:{ Exception -> 0x0c91 }
        r4.bd(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x022c:
        r4 = com.iqoption.util.w.aWN();	 Catch:{ Exception -> 0x0c91 }
        r3 = r4.parse(r3);	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.getAsLong();	 Catch:{ Exception -> 0x0c91 }
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x0caa;
    L_0x023e:
        r5 = com.iqoption.app.managers.l.HZ();	 Catch:{ Exception -> 0x0c91 }
        r5 = r5.Ib();	 Catch:{ Exception -> 0x0c91 }
        com.iqoption.mobbtech.connect.request.api.e.v(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x024b:
        r4 = com.iqoption.app.managers.feature.a.Ih();	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0caa;
    L_0x0251:
        r4 = com.iqoption.app.managers.feature.a.Ii();	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0caa;
    L_0x0257:
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.dto.event.OtnEmissionExecuted.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.dto.event.OtnEmissionExecuted) r3;	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0caa;
    L_0x0265:
        r4 = com.iqoption.app.managers.e.Hv();	 Catch:{ Exception -> 0x0c91 }
        r4.onEmissionExecuted(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x026e:
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.core.microservices.tradingengine.response.a.b.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.core.microservices.tradingengine.response.a.b) r3;	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0caa;
    L_0x027c:
        r4 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.getInstrumentType();	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.aiu();	 Catch:{ Exception -> 0x0c91 }
        r4.b(r5, r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x028d:
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.dto.Currencies.ConversionCurrency.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.dto.Currencies.ConversionCurrency) r3;	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0caa;
    L_0x029b:
        r4 = com.iqoption.app.b.DG();	 Catch:{ Exception -> 0x0c91 }
        r4.a(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x02a4:
        r3 = r18.b(r19, r20);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.core.microservices.f.a.a.b.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.core.microservices.f.a.a.b) r3;	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0caa;
    L_0x02b6:
        r4 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.getInstrumentType();	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.ahE();	 Catch:{ Exception -> 0x0c91 }
        r4.c(r5, r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x02c7:
        r4 = com.iqoption.app.IQApp.Ev();	 Catch:{ Exception -> 0x0c91 }
        r3 = r1.ao(r3);	 Catch:{ Exception -> 0x0c91 }
        r5 = "tc";
        r3 = r3.optBoolean(r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x0c91 }
        r4.k(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x02df:
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.dto.entity.position.Position.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.dto.entity.position.Position) r3;	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.analytics.a.b.aZL;	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.getActiveId();	 Catch:{ Exception -> 0x0c91 }
        r5 = (long) r5;	 Catch:{ Exception -> 0x0c91 }
        r7 = r3.getOrderIds();	 Catch:{ Exception -> 0x0c91 }
        r8 = r3.getInstrumentType();	 Catch:{ Exception -> 0x0c91 }
        r9 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r9 = r9.longValue();	 Catch:{ Exception -> 0x0c91 }
        r11 = r3.getStatus();	 Catch:{ Exception -> 0x0c91 }
        r4.a(r5, r7, r8, r9, r11);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.app.managers.c.GS();	 Catch:{ Exception -> 0x0c91 }
        r4.e(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0312:
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r6 = com.iqoption.dto.entity.position.Order.class;
        r3 = r4.fromJson(r3, r6);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.dto.entity.position.Order) r3;	 Catch:{ Exception -> 0x0c91 }
        r4 = "";
        r6 = com.iqoption.app.managers.c.GS();	 Catch:{ Exception -> 0x0c91 }
        r6.i(r3);	 Catch:{ Exception -> 0x0c91 }
        r6 = "market";
        r7 = r3.getType();	 Catch:{ Exception -> 0x0c91 }
        r6 = r6.equalsIgnoreCase(r7);	 Catch:{ Exception -> 0x0c91 }
        if (r6 == 0) goto L_0x0348;
    L_0x0333:
        r6 = com.iqoption.core.analytics.a.b.aZL;	 Catch:{ Exception -> 0x0c91 }
        r7 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r7 = r7.longValue();	 Catch:{ Exception -> 0x0c91 }
        r9 = r3.getStatus();	 Catch:{ Exception -> 0x0c91 }
        r10 = r3.getRejectStatus();	 Catch:{ Exception -> 0x0c91 }
        r6.a(r7, r9, r10);	 Catch:{ Exception -> 0x0c91 }
    L_0x0348:
        r6 = com.iqoption.dto.entity.position.Order.isMarketOrderFilled(r3);	 Catch:{ Exception -> 0x0c91 }
        r7 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r9 = 2131231852; // 0x7f08046c float:1.8079797E38 double:1.0529684414E-314;
        if (r6 == 0) goto L_0x03a0;
    L_0x0353:
        r6 = com.iqoption.app.d.dW(r5);	 Catch:{ Exception -> 0x0c91 }
        if (r6 == 0) goto L_0x03fb;
    L_0x0359:
        r10 = r3.getCount();	 Catch:{ Exception -> 0x0c91 }
        r16 = r3.getAvgPrice();	 Catch:{ Exception -> 0x0c91 }
        r10 = r10 * r16;
        r3 = com.iqoption.app.d.Fa();	 Catch:{ Exception -> 0x0c91 }
        r16 = r3.Fd();	 Catch:{ Exception -> 0x0c91 }
        r3 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1));
        if (r3 >= 0) goto L_0x03fb;
    L_0x036f:
        r3 = com.iqoption.core.util.j.bQB;	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.anl();	 Catch:{ Exception -> 0x0c91 }
        r3 = com.iqoption.core.util.j.I(r3, r13);	 Catch:{ Exception -> 0x0c91 }
        r4 = java.math.RoundingMode.DOWN;	 Catch:{ Exception -> 0x0c91 }
        r3.setRoundingMode(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.app.IQApp.Eu();	 Catch:{ Exception -> 0x0c91 }
        r6 = 2131887861; // 0x7f1206f5 float:1.9410341E38 double:1.053292553E-314;
        r12 = new java.lang.Object[r13];	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.format(r10);	 Catch:{ Exception -> 0x0c91 }
        r12[r15] = r3;	 Catch:{ Exception -> 0x0c91 }
        r3 = java.lang.Double.valueOf(r16);	 Catch:{ Exception -> 0x0c91 }
        r3 = com.iqoption.util.j.u(r3);	 Catch:{ Exception -> 0x0c91 }
        r12[r14] = r3;	 Catch:{ Exception -> 0x0c91 }
        r3 = r4.getString(r6, r12);	 Catch:{ Exception -> 0x0c91 }
        com.iqoption.app.d.i(r5, r15);	 Catch:{ Exception -> 0x0c91 }
        r4 = r3;
        goto L_0x03fb;
    L_0x03a0:
        r5 = "rejected";
        r6 = r3.getStatus();	 Catch:{ Exception -> 0x0c91 }
        r5 = r5.equals(r6);	 Catch:{ Exception -> 0x0c91 }
        if (r5 == 0) goto L_0x03fb;
    L_0x03ac:
        r4 = r3.getRejectStatus();	 Catch:{ Exception -> 0x0c91 }
        r5 = r4.hashCode();	 Catch:{ Exception -> 0x0c91 }
        switch(r5) {
            case -1364918149: goto L_0x03d7;
            case -538734959: goto L_0x03d3;
            case -284840886: goto L_0x03cf;
            case -282863361: goto L_0x03cc;
            case 6908744: goto L_0x03c9;
            case 410402527: goto L_0x03c6;
            case 688092859: goto L_0x03c3;
            case 1848962578: goto L_0x03bf;
            case 1919658633: goto L_0x03b8;
            default: goto L_0x03b7;
        };	 Catch:{ Exception -> 0x0c91 }
    L_0x03b7:
        goto L_0x03db;
    L_0x03b8:
        r5 = "internal_billing_exception";
    L_0x03ba:
        r4 = r4.equals(r5);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x03db;
    L_0x03bf:
        r5 = "symbol_forbidden";
        goto L_0x03ba;
    L_0x03c3:
        r5 = "exceeds_limit";
        goto L_0x03ba;
    L_0x03c6:
        r5 = "risk_exception";
        goto L_0x03ba;
    L_0x03c9:
        r5 = "instrument_price_not_found";
        goto L_0x03ba;
    L_0x03cc:
        r5 = "internal_billing_not_enough_balance";
        goto L_0x03ba;
    L_0x03cf:
        r5 = "unknown";
        goto L_0x03ba;
    L_0x03d3:
        r5 = "user_balance_not_found_or_wrong";
        goto L_0x03ba;
    L_0x03d7:
        r5 = "too_much_time_passed";
        goto L_0x03ba;
    L_0x03db:
        r4 = "buy";
        r3 = r3.getSide();	 Catch:{ Exception -> 0x0c91 }
        r3 = r4.equals(r3);	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x03eb;
    L_0x03e7:
        r3 = 2131888077; // 0x7f1207cd float:1.941078E38 double:1.0532926596E-314;
        goto L_0x03ee;
    L_0x03eb:
        r3 = 2131888251; // 0x7f12087b float:1.9411132E38 double:1.0532927456E-314;
    L_0x03ee:
        r4 = com.iqoption.app.IQApp.Eu();	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.getString(r3);	 Catch:{ Exception -> 0x0c91 }
        r9 = 2131231853; // 0x7f08046d float:1.8079799E38 double:1.052968442E-314;
        r7 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
    L_0x03fb:
        r3 = android.text.TextUtils.isEmpty(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r3 != 0) goto L_0x0caa;
    L_0x0401:
        com.iqoption.fragment.ah.a(r9, r4, r7);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0406:
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.dto.entity.result.ExpirationsResult.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.dto.entity.result.ExpirationsResult) r3;	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.type;	 Catch:{ Exception -> 0x0c91 }
        r6 = r3.underlying;	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.a(r5, r6);	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.app.managers.a.e.Ig();	 Catch:{ Exception -> 0x0c91 }
        r6 = r3.type;	 Catch:{ Exception -> 0x0c91 }
        r5 = r5.h(r6);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0caa;
    L_0x042a:
        if (r5 == 0) goto L_0x0caa;
    L_0x042c:
        r3 = r3.getExpirations();	 Catch:{ Exception -> 0x0c91 }
        r5.a(r4, r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0435:
        r3 = r18.b(r19, r20);	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.getAsJsonObject();	 Catch:{ Exception -> 0x0c91 }
        r4 = "type";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.getAsString();	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.data.model.InstrumentType.fromServerValue(r4);	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.has(r10);	 Catch:{ Exception -> 0x0c91 }
        if (r5 == 0) goto L_0x045b;
    L_0x0452:
        r3 = r3.get(r10);	 Catch:{ Exception -> 0x0c91 }
        r17 = r3.getAsJsonArray();	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0469;
    L_0x045b:
        r5 = r3.has(r7);	 Catch:{ Exception -> 0x0c91 }
        if (r5 == 0) goto L_0x0469;
    L_0x0461:
        r3 = r3.get(r7);	 Catch:{ Exception -> 0x0c91 }
        r17 = r3.getAsJsonArray();	 Catch:{ Exception -> 0x0c91 }
    L_0x0469:
        r3 = r17;
        if (r3 == 0) goto L_0x0caa;
    L_0x046d:
        r5 = com.iqoption.core.c.a.biM;	 Catch:{ Exception -> 0x0c91 }
        r6 = new com.iqoption.service.-$$Lambda$WebSocketHandler$9MdD5HkeFIOGvDOmUeqixyZDx3I;	 Catch:{ Exception -> 0x0c91 }
        r6.<init>(r3, r4);	 Catch:{ Exception -> 0x0c91 }
        r5.execute(r6);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0479:
        com.iqoption.app.managers.feature.c.a(r20);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x047e:
        r4 = new com.iqoption.dto.entity.iqbus.SignalLegacy$SignalsEvent;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r6 = com.iqoption.dto.entity.iqbus.SignalLegacy[].class;
        r3 = r5.fromJson(r3, r6);	 Catch:{ Exception -> 0x0c91 }
        r4.setValue(r3);	 Catch:{ Exception -> 0x0c91 }
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0499:
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.core.microservices.risks.response.a.b.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.core.microservices.risks.response.a.b) r3;	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0caa;
    L_0x04a7:
        r4 = r3.ahe();	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.ahd();	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0caa;
    L_0x04b1:
        r4 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.getInstrumentType();	 Catch:{ Exception -> 0x0c91 }
        r6 = r3.getActiveId();	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.ahe();	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.ahd();	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.intValue();	 Catch:{ Exception -> 0x0c91 }
        r4.a(r5, r6, r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x04ce:
        r3 = r18.b(r19, r20);	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.getAsJsonObject();	 Catch:{ Exception -> 0x0c91 }
        r4 = "error";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 != 0) goto L_0x0caa;
    L_0x04de:
        r4 = "instrument";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5 = "asset_id";
        r5 = r3.get(r5);	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.core.util.u.g(r5);	 Catch:{ Exception -> 0x0c91 }
        r6 = "value";
        r3 = r3.get(r6);	 Catch:{ Exception -> 0x0c91 }
        r6 = com.iqoption.core.util.u.e(r3);	 Catch:{ Exception -> 0x0c91 }
        r3 = com.iqoption.gl.c.aIy();	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.data.model.ActiveType.convertToActiveName(r4);	 Catch:{ Exception -> 0x0c91 }
        r8 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r6 = r6 * r8;
        r6 = java.lang.Math.round(r6);	 Catch:{ Exception -> 0x0c91 }
        r7 = (int) r6;	 Catch:{ Exception -> 0x0c91 }
        r3.setTradersMoodCallPercentage(r5, r4, r7);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0513:
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.e$g;	 Catch:{ Exception -> 0x0c91 }
        r5 = "socket-reconnect-msg";
        r4.<init>(r5);	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0523:
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.dto.entity.Tournament.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.dto.entity.Tournament) r3;	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.app.managers.a.GM();	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.GP();	 Catch:{ Exception -> 0x0c91 }
        r5 = r4.iterator();	 Catch:{ Exception -> 0x0c91 }
    L_0x053b:
        r6 = r5.hasNext();	 Catch:{ Exception -> 0x0c91 }
        if (r6 == 0) goto L_0x0556;
    L_0x0541:
        r6 = r5.next();	 Catch:{ Exception -> 0x0c91 }
        r6 = (com.iqoption.dto.entity.Tournament) r6;	 Catch:{ Exception -> 0x0c91 }
        r7 = r6.getId();	 Catch:{ Exception -> 0x0c91 }
        r8 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r7 = r7.equals(r8);	 Catch:{ Exception -> 0x0c91 }
        if (r7 == 0) goto L_0x053b;
    L_0x0555:
        goto L_0x0558;
    L_0x0556:
        r6 = r17;
    L_0x0558:
        if (r6 != 0) goto L_0x055e;
    L_0x055a:
        r4.add(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0561;
    L_0x055e:
        r6.merge(r3);	 Catch:{ Exception -> 0x0c91 }
    L_0x0561:
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.e$m;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>();	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x056f:
        r4 = com.iqoption.app.managers.c.GS();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.util.w.aWN();	 Catch:{ Exception -> 0x0c91 }
        r3 = r5.parse(r3);	 Catch:{ Exception -> 0x0c91 }
        r3 = com.iqoption.mobbtech.connect.response.options.c.jsonCore2Option(r3);	 Catch:{ Exception -> 0x0c91 }
        r4.g(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0584:
        r3 = r1.ao(r3);	 Catch:{ Exception -> 0x0c91 }
        r4 = "isSuccessful";
        r4 = r3.optBoolean(r4, r14);	 Catch:{ Exception -> 0x0c91 }
        if (r4 != 0) goto L_0x0caa;
    L_0x0590:
        r4 = r3.has(r12);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x059e;
    L_0x0596:
        r3 = r3.getJSONArray(r12);	 Catch:{ Exception -> 0x0c91 }
        r17 = r3.getString(r15);	 Catch:{ Exception -> 0x0c91 }
    L_0x059e:
        r3 = r17;
        r1.jI(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x05a5:
        r4 = com.iqoption.app.b.DG();	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.getGroupId();	 Catch:{ Exception -> 0x0c91 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ Exception -> 0x0c91 }
        r3 = r1.ao(r3);	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.core.data.model.ActiveType.BINARY_ACTIVE;	 Catch:{ Exception -> 0x0c91 }
        r5 = r5.getServerValue();	 Catch:{ Exception -> 0x0c91 }
        r6 = r3.has(r5);	 Catch:{ Exception -> 0x0c91 }
        if (r6 == 0) goto L_0x05ce;
    L_0x05c1:
        r5 = r3.getJSONObject(r5);	 Catch:{ Exception -> 0x0c91 }
        r5 = r5.getJSONObject(r4);	 Catch:{ Exception -> 0x0c91 }
        r6 = com.iqoption.core.data.model.InstrumentType.BINARY_INSTRUMENT;	 Catch:{ Exception -> 0x0c91 }
        r1.a(r5, r6);	 Catch:{ Exception -> 0x0c91 }
    L_0x05ce:
        r5 = com.iqoption.core.data.model.ActiveType.TURBO_ACTIVE;	 Catch:{ Exception -> 0x0c91 }
        r5 = r5.getServerValue();	 Catch:{ Exception -> 0x0c91 }
        r6 = r3.has(r5);	 Catch:{ Exception -> 0x0c91 }
        if (r6 == 0) goto L_0x0caa;
    L_0x05da:
        r3 = r3.getJSONObject(r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.getJSONObject(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.data.model.InstrumentType.TURBO_INSTRUMENT;	 Catch:{ Exception -> 0x0c91 }
        r1.a(r3, r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x05e9:
        r1.aq(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x05ee:
        r4 = com.iqoption.util.w.aWN();	 Catch:{ Exception -> 0x0c91 }
        r3 = r4.parse(r3);	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.getAsLong();	 Catch:{ Exception -> 0x0c91 }
        r1.ce(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x05ff:
        r3 = com.iqoption.app.d.Fa();	 Catch:{ Exception -> 0x0c91 }
        r3.dK(r14);	 Catch:{ Exception -> 0x0c91 }
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.e$e;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>();	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0614:
        r3 = r18.b(r19, r20);	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.isJsonObject();	 Catch:{ Exception -> 0x0c91 }
        if (r5 == 0) goto L_0x0a5f;
    L_0x061e:
        r3 = r3.getAsJsonObject();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.app.b.DG();	 Catch:{ Exception -> 0x0c91 }
        r7 = "id";
        r7 = r3.has(r7);	 Catch:{ Exception -> 0x0c91 }
        if (r7 == 0) goto L_0x0645;
    L_0x062e:
        r7 = r3.has(r8);	 Catch:{ Exception -> 0x0c91 }
        if (r7 == 0) goto L_0x0645;
    L_0x0634:
        r7 = r3.get(r8);	 Catch:{ Exception -> 0x0c91 }
        r10 = -1;
        r7 = com.iqoption.core.util.u.a(r7, r10);	 Catch:{ Exception -> 0x0c91 }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ Exception -> 0x0c91 }
        r1.C(r7);	 Catch:{ Exception -> 0x0c91 }
    L_0x0645:
        r7 = r3.has(r9);	 Catch:{ Exception -> 0x0c91 }
        if (r7 == 0) goto L_0x0734;
    L_0x064b:
        r7 = r3.getAsJsonObject(r9);	 Catch:{ Exception -> 0x0c91 }
        r8 = r5.asc;	 Catch:{ Exception -> 0x0c91 }
        if (r8 != 0) goto L_0x0655;
    L_0x0653:
        r8 = 1;
        goto L_0x0656;
    L_0x0655:
        r8 = 0;
    L_0x0656:
        r5.asc = r14;	 Catch:{ Exception -> 0x0c91 }
        r9 = "status";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.g(r9);	 Catch:{ Exception -> 0x0c91 }
        r5.asd = r9;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isRegulatedUser";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.aS(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = "isProfileNeeded";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.asg = r9;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isPhoneNeeded";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.ash = r9;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isDocumentsNeeded";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.asi = r9;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isDocumentsDeclined";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.asj = r9;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isProfileFilled";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.asl = r9;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isPhoneFilled";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.asm = r9;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isDocumentsUploaded";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.asn = r9;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isPhoneConfirmationSkipped";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.aso = r9;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isPhoneConfirmed";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.aQ(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = "isDocumentsUploadSkipped";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r5.asq = r9;	 Catch:{ Exception -> 0x0c91 }
        if (r8 == 0) goto L_0x0701;
    L_0x06ed:
        r8 = r5.asr;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isDocumentsApproved";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r9 = java.lang.Boolean.valueOf(r9);	 Catch:{ Exception -> 0x0c91 }
        r8.cn(r9);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0714;
    L_0x0701:
        r8 = r5.asr;	 Catch:{ Exception -> 0x0c91 }
        r9 = "isDocumentsApproved";
        r9 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = com.iqoption.core.util.u.a(r9, r15);	 Catch:{ Exception -> 0x0c91 }
        r9 = java.lang.Boolean.valueOf(r9);	 Catch:{ Exception -> 0x0c91 }
        r8.cm(r9);	 Catch:{ Exception -> 0x0c91 }
    L_0x0714:
        r8 = r5.ase;	 Catch:{ Exception -> 0x0c91 }
        r9 = "daysLeftToVerify";
        r7 = r7.get(r9);	 Catch:{ Exception -> 0x0c91 }
        r9 = -1;
        r7 = com.iqoption.core.util.u.a(r7, r9);	 Catch:{ Exception -> 0x0c91 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ Exception -> 0x0c91 }
        r8.cm(r7);	 Catch:{ Exception -> 0x0c91 }
        r7 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r8 = new com.iqoption.service.e$l;	 Catch:{ Exception -> 0x0c91 }
        r8.<init>();	 Catch:{ Exception -> 0x0c91 }
        r7.bd(r8);	 Catch:{ Exception -> 0x0c91 }
    L_0x0734:
        r7 = r3.has(r6);	 Catch:{ Exception -> 0x0c91 }
        if (r7 == 0) goto L_0x0776;
    L_0x073a:
        r6 = r3.get(r6);	 Catch:{ Exception -> 0x0c91 }
        r6 = com.iqoption.core.util.u.f(r6);	 Catch:{ Exception -> 0x0c91 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x0c91 }
        r5.i(r6);	 Catch:{ Exception -> 0x0c91 }
        r6 = com.iqoption.app.IQApp.Eu();	 Catch:{ Exception -> 0x0c91 }
        r6 = com.iqoption.app.IQApp.aO(r6);	 Catch:{ Exception -> 0x0c91 }
        r7 = "&uid";
        r8 = r5.getUserId();	 Catch:{ Exception -> 0x0c91 }
        r8 = java.lang.Long.toString(r8);	 Catch:{ Exception -> 0x0c91 }
        r6.set(r7, r8);	 Catch:{ Exception -> 0x0c91 }
        r7 = new com.google.android.gms.analytics.HitBuilders$AppViewBuilder;	 Catch:{ Exception -> 0x0c91 }
        r7.<init>();	 Catch:{ Exception -> 0x0c91 }
        r8 = "&uid";
        r8 = r6.get(r8);	 Catch:{ Exception -> 0x0c91 }
        r7 = r7.setCustomDimension(r14, r8);	 Catch:{ Exception -> 0x0c91 }
        r7 = (com.google.android.gms.analytics.HitBuilders.AppViewBuilder) r7;	 Catch:{ Exception -> 0x0c91 }
        r7 = r7.build();	 Catch:{ Exception -> 0x0c91 }
        r6.send(r7);	 Catch:{ Exception -> 0x0c91 }
    L_0x0776:
        r6 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r6 == 0) goto L_0x0787;
    L_0x077c:
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r6 = com.iqoption.core.util.u.f(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.U(r6);	 Catch:{ Exception -> 0x0c91 }
    L_0x0787:
        r4 = "email";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x079c;
    L_0x078f:
        r4 = "email";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dB(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x079c:
        r4 = "new_email";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x07b1;
    L_0x07a4:
        r4 = "new_email";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dC(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x07b1:
        r4 = "tin";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x07c8;
    L_0x07ba:
        r4 = "tin";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dA(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x07c8:
        r4 = "is_activated";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x07dd;
    L_0x07d0:
        r4 = "is_activated";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.h(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.setActivated(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x07dd:
        r4 = "auth_two_factor";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x07f2;
    L_0x07e5:
        r4 = "auth_two_factor";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.h(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.aN(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x07f2:
        r4 = "first_name";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0807;
    L_0x07fa:
        r4 = "first_name";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.setFirstName(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x0807:
        r4 = "last_name";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x081c;
    L_0x080f:
        r4 = "last_name";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.setLastName(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x081c:
        r4 = "nickname";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0831;
    L_0x0824:
        r4 = "nickname";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dx(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x0831:
        r4 = "messages";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x084c;
    L_0x0839:
        r4 = r5.asb;	 Catch:{ Exception -> 0x0c91 }
        r6 = "messages";
        r6 = r3.get(r6);	 Catch:{ Exception -> 0x0c91 }
        r6 = com.iqoption.core.util.u.g(r6);	 Catch:{ Exception -> 0x0c91 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x0c91 }
        r4.cm(r6);	 Catch:{ Exception -> 0x0c91 }
    L_0x084c:
        r4 = "group_id";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0861;
    L_0x0854:
        r4 = "group_id";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.g(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dI(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x0861:
        r4 = "locale";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0876;
    L_0x0869:
        r4 = "locale";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dE(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x0876:
        r4 = "deposit_count";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x088b;
    L_0x087e:
        r4 = "deposit_count";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.g(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dJ(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x088b:
        r4 = "flag";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x08a0;
    L_0x0893:
        r4 = "flag";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dG(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x08a0:
        r4 = "public";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x08ba;
    L_0x08a8:
        r4 = "public";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.a(r4, r15);	 Catch:{ Exception -> 0x0c91 }
        if (r4 != r14) goto L_0x08b6;
    L_0x08b4:
        r4 = 1;
        goto L_0x08b7;
    L_0x08b6:
        r4 = 0;
    L_0x08b7:
        r5.aM(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x08ba:
        r4 = "personal_data_policy";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x08d9;
    L_0x08c2:
        r4 = "personal_data_policy";
        r4 = r3.getAsJsonObject(r4);	 Catch:{ Exception -> 0x0c91 }
        r6 = r5.Ed();	 Catch:{ Exception -> 0x0c91 }
        r4 = r6.g(r4);	 Catch:{ Exception -> 0x0c91 }
        r6 = r6.equals(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r6 != 0) goto L_0x08d9;
    L_0x08d6:
        r5.a(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x08d9:
        r4 = "forget_status";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x08f6;
    L_0x08e1:
        r4 = com.iqoption.util.w.aWM();	 Catch:{ Exception -> 0x0c91 }
        r6 = "forget_status";
        r6 = r3.get(r6);	 Catch:{ Exception -> 0x0c91 }
        r7 = com.iqoption.core.microservices.busapi.response.a.class;
        r4 = r4.fromJson(r6, r7);	 Catch:{ Exception -> 0x0c91 }
        r4 = (com.iqoption.core.microservices.busapi.response.a) r4;	 Catch:{ Exception -> 0x0c91 }
        r5.b(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x08f6:
        r4 = "country_id";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x090b;
    L_0x08fe:
        r4 = "country_id";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r6 = com.iqoption.core.util.u.f(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.V(r6);	 Catch:{ Exception -> 0x0c91 }
    L_0x090b:
        r4 = "phone";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0930;
    L_0x0913:
        r4 = "phone";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r6 = " ";
        r4 = r4.split(r6);	 Catch:{ Exception -> 0x0c91 }
        r6 = r4.length;	 Catch:{ Exception -> 0x0c91 }
        if (r6 <= r14) goto L_0x0930;
    L_0x0926:
        r6 = r4[r15];	 Catch:{ Exception -> 0x0c91 }
        r5.setCountryCode(r6);	 Catch:{ Exception -> 0x0c91 }
        r4 = r4[r14];	 Catch:{ Exception -> 0x0c91 }
        r5.setPhone(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x0930:
        r4 = "city";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0945;
    L_0x0938:
        r4 = "city";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.setCity(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x0945:
        r4 = "address";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x095a;
    L_0x094d:
        r4 = "address";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.setAddress(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x095a:
        r4 = "postal_index";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x096f;
    L_0x0962:
        r4 = "postal_index";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dy(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x096f:
        r4 = "nationality";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0984;
    L_0x0977:
        r4 = "nationality";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dz(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x0984:
        r4 = "gender";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x099d;
    L_0x098c:
        r4 = "gender";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.data.model.user.Gender.fromServerValue(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.a(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x099d:
        r4 = "skey";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x09b2;
    L_0x09a5:
        r4 = "skey";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.dF(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x09b2:
        r4 = "user_group";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x09cf;
    L_0x09bb:
        r4 = "user_group";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.i(r4);	 Catch:{ Exception -> 0x0c91 }
        r6 = "VIP";
        r4 = r4.equals(r6);	 Catch:{ Exception -> 0x0c91 }
        r5.aP(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x09cf:
        r4 = "client_category_id";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x09ec;
    L_0x09d7:
        r4 = "client_category_id";
        r4 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.util.u.g(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.protrader.a.q(r4);	 Catch:{ Exception -> 0x0c91 }
        r5.a(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x09ec:
        r4 = "trial";
        r4 = r3.has(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0a05;
    L_0x09f5:
        r4 = "trial";
        r3 = r3.get(r4);	 Catch:{ Exception -> 0x0c91 }
        r3 = com.iqoption.core.util.u.h(r3);	 Catch:{ Exception -> 0x0c91 }
        r3 = r5.aO(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0a06;
    L_0x0a05:
        r3 = 0;
    L_0x0a06:
        if (r3 == 0) goto L_0x0a1c;
    L_0x0a08:
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.e$b;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>();	 Catch:{ Exception -> 0x0c91 }
        r6 = java.lang.Boolean.valueOf(r15);	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.setValue(r6);	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
    L_0x0a1c:
        r5.aR(r14);	 Catch:{ Exception -> 0x0c91 }
        r3 = com.iqoption.app.IQApp.Eu();	 Catch:{ Exception -> 0x0c91 }
        r5.aM(r3);	 Catch:{ Exception -> 0x0c91 }
        r3 = r5.getLocale();	 Catch:{ Exception -> 0x0c91 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ Exception -> 0x0c91 }
        if (r3 != 0) goto L_0x0a48;
    L_0x0a30:
        r3 = r5.getLocale();	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.core.d.getLocale();	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.equals(r4);	 Catch:{ Exception -> 0x0c91 }
        if (r3 != 0) goto L_0x0a43;
    L_0x0a3e:
        r3 = r1.dRL;	 Catch:{ Exception -> 0x0c91 }
        if (r3 != 0) goto L_0x0a43;
    L_0x0a42:
        goto L_0x0a48;
    L_0x0a43:
        r18.aTs();	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0a48:
        r3 = new com.iqoption.mobbtech.connect.request.a;	 Catch:{ Exception -> 0x0c91 }
        r3.<init>();	 Catch:{ Exception -> 0x0c91 }
        r1.dRL = r3;	 Catch:{ Exception -> 0x0c91 }
        r3 = r1.dRL;	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.app.IQApp.Eu();	 Catch:{ Exception -> 0x0c91 }
        r5 = new com.iqoption.service.-$$Lambda$WebSocketHandler$wZyDRxYo5iB5rYQEUqMo-riiUJA;	 Catch:{ Exception -> 0x0c91 }
        r5.<init>(r1);	 Catch:{ Exception -> 0x0c91 }
        r3.a(r4, r5);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0a5f:
        r3 = com.iqoption.c.b.Kd();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.-$$Lambda$WebSocketHandler$UzkpCCcao2jyy5M7y8rPasdCK4k;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>(r1);	 Catch:{ Exception -> 0x0c91 }
        r5 = new com.iqoption.service.-$$Lambda$WebSocketHandler$R9XoajHykB5jmVr3raE7K1Eii1Q;	 Catch:{ Exception -> 0x0c91 }
        r5.<init>(r1);	 Catch:{ Exception -> 0x0c91 }
        com.iqoption.util.v.b(r3, r4, r5);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0a72:
        r3 = r18.b(r19, r20);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.core.microservices.internalbilling.a.a.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.core.microservices.internalbilling.a.a) r3;	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0caa;
    L_0x0a84:
        r4 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x0c91 }
        r1.C(r4);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.app.b.DG();	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ Exception -> 0x0c91 }
        r6 = r4.f(r5);	 Catch:{ Exception -> 0x0c91 }
        if (r6 == 0) goto L_0x0caa;
    L_0x0aa1:
        r5 = r3.aeo();	 Catch:{ Exception -> 0x0c91 }
        r15 = r4.DL();	 Catch:{ Exception -> 0x0c91 }
        r7 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r13 = java.lang.Long.valueOf(r7);	 Catch:{ Exception -> 0x0c91 }
        r7 = r6.id;	 Catch:{ Exception -> 0x0c91 }
        r9 = r3.getType();	 Catch:{ Exception -> 0x0c91 }
        r10 = r6.amount;	 Catch:{ Exception -> 0x0c91 }
        if (r5 == 0) goto L_0x0ac3;
    L_0x0abb:
        r11 = r5.doubleValue();	 Catch:{ Exception -> 0x0c91 }
        r17 = java.lang.Double.valueOf(r11);	 Catch:{ Exception -> 0x0c91 }
    L_0x0ac3:
        r11 = r17;
        r12 = r3.getCurrency();	 Catch:{ Exception -> 0x0c91 }
        r20 = r13;
        r13 = r6.index;	 Catch:{ Exception -> 0x0c91 }
        r5 = r20;
        r6 = r6.copy(r7, r9, r10, r11, r12, r13);	 Catch:{ Exception -> 0x0c91 }
        r15.put(r5, r6);	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.DH();	 Catch:{ Exception -> 0x0c91 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r3 = java.lang.Long.valueOf(r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = java.util.Objects.equals(r4, r3);	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0afa;
    L_0x0aec:
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.e$k;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>();	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0afa:
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.e$j;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>();	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0b08:
        r3 = r18.b(r19, r20);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.dto.Balance.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.dto.Balance) r3;	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0caa;
    L_0x0b1a:
        r4 = com.iqoption.app.b.DG();	 Catch:{ Exception -> 0x0c91 }
        r5 = r4.DL();	 Catch:{ Exception -> 0x0c91 }
        r6 = r3.id;	 Catch:{ Exception -> 0x0c91 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x0c91 }
        r5.put(r6, r3);	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.DH();	 Catch:{ Exception -> 0x0c91 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.id;	 Catch:{ Exception -> 0x0c91 }
        r3 = java.lang.Long.valueOf(r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = java.util.Objects.equals(r4, r3);	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0b4d;
    L_0x0b3f:
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.e$k;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>();	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0b4d:
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.e$j;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>();	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0b5b:
        r3 = r18.b(r19, r20);	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.util.w.aWL();	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.dto.BalanceChanged.class;
        r3 = r4.fromJson(r3, r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = (com.iqoption.dto.BalanceChanged) r3;	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0caa;
    L_0x0b6d:
        r4 = r3.getCurrentBalance();	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0caa;
    L_0x0b73:
        r4 = com.iqoption.app.b.DG();	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ Exception -> 0x0c91 }
        r5 = r4.f(r5);	 Catch:{ Exception -> 0x0c91 }
        r6 = r3.getCurrentBalance();	 Catch:{ Exception -> 0x0c91 }
        if (r5 == 0) goto L_0x0caa;
    L_0x0b89:
        r7 = r5.index;	 Catch:{ Exception -> 0x0c91 }
        r9 = r6.index;	 Catch:{ Exception -> 0x0c91 }
        r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r5 > 0) goto L_0x0caa;
    L_0x0b91:
        r5 = r4.DL();	 Catch:{ Exception -> 0x0c91 }
        r7 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ Exception -> 0x0c91 }
        r5 = r5.get(r7);	 Catch:{ Exception -> 0x0c91 }
        r5 = (com.iqoption.dto.Balance) r5;	 Catch:{ Exception -> 0x0c91 }
        if (r5 == 0) goto L_0x0ba9;
    L_0x0ba5:
        r17 = r5.getAuthAmount();	 Catch:{ Exception -> 0x0c91 }
    L_0x0ba9:
        r5 = r17;
        r6.setAuthAmount(r5);	 Catch:{ Exception -> 0x0c91 }
        r5 = r4.DL();	 Catch:{ Exception -> 0x0c91 }
        r7 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ Exception -> 0x0c91 }
        r5.put(r7, r6);	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.DH();	 Catch:{ Exception -> 0x0c91 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x0c91 }
        r5 = r3.getId();	 Catch:{ Exception -> 0x0c91 }
        r3 = java.lang.Long.valueOf(r5);	 Catch:{ Exception -> 0x0c91 }
        r3 = java.util.Objects.equals(r4, r3);	 Catch:{ Exception -> 0x0c91 }
        if (r3 == 0) goto L_0x0be1;
    L_0x0bd3:
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.e$k;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>();	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0be1:
        r3 = com.iqoption.app.IQApp.Ew();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.service.e$j;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>();	 Catch:{ Exception -> 0x0c91 }
        r3.bd(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0bef:
        r4 = com.iqoption.util.w.aWN();	 Catch:{ Exception -> 0x0c91 }
        r3 = r4.parse(r3);	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.getAsString();	 Catch:{ Exception -> 0x0c91 }
        r1.bgB = r3;	 Catch:{ Exception -> 0x0c91 }
        r3 = com.iqoption.app.IQApp.Ex();	 Catch:{ Exception -> 0x0c91 }
        r4 = new com.iqoption.core.b.c;	 Catch:{ Exception -> 0x0c91 }
        r5 = r1.bgB;	 Catch:{ Exception -> 0x0c91 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x0c91 }
        r3.bt(r4);	 Catch:{ Exception -> 0x0c91 }
        r3 = com.iqoption.analytics.EventManager.BS();	 Catch:{ Exception -> 0x0c91 }
        r4 = "system";
        r5 = "connection-ws";
        r4 = com.iqoption.dto.Event.Builder(r4, r5);	 Catch:{ Exception -> 0x0c91 }
        r5 = com.iqoption.core.util.u.anp();	 Catch:{ Exception -> 0x0c91 }
        r6 = "ws_front";
        r7 = r1.bgB;	 Catch:{ Exception -> 0x0c91 }
        r5 = r5.o(r6, r7);	 Catch:{ Exception -> 0x0c91 }
        r5 = r5.anr();	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.setParameters(r5);	 Catch:{ Exception -> 0x0c91 }
        r4 = r4.build();	 Catch:{ Exception -> 0x0c91 }
        r3.a(r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0c36:
        r3 = r1.ao(r3);	 Catch:{ Exception -> 0x0c91 }
        r1.m(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0c3e:
        r1.ap(r3);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0c42:
        r3 = r4.parse(r3);	 Catch:{ Exception -> 0x0c91 }
        r4 = r3.isJsonNull();	 Catch:{ Exception -> 0x0c91 }
        if (r4 != 0) goto L_0x0caa;
    L_0x0c4c:
        r4 = r1.dSn;	 Catch:{ Exception -> 0x0c91 }
        r5 = new com.iqoption.core.connect.m;	 Catch:{ Exception -> 0x0c91 }
        r5.<init>(r2, r3);	 Catch:{ Exception -> 0x0c91 }
        r4.onNext(r5);	 Catch:{ Exception -> 0x0c91 }
        r4 = r3.isJsonObject();	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0c8d;
    L_0x0c5c:
        r3 = r3.getAsJsonObject();	 Catch:{ Exception -> 0x0c91 }
        r4 = r3.has(r12);	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0caa;
    L_0x0c66:
        r3 = r3.get(r12);	 Catch:{ Exception -> 0x0c91 }
        r4 = r3.isJsonArray();	 Catch:{ Exception -> 0x0c91 }
        if (r4 == 0) goto L_0x0c7d;
    L_0x0c70:
        r3 = r3.getAsJsonArray();	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.get(r15);	 Catch:{ Exception -> 0x0c91 }
        r3 = r3.getAsString();	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0c81;
    L_0x0c7d:
        r3 = r3.getAsString();	 Catch:{ Exception -> 0x0c91 }
    L_0x0c81:
        r3 = r3.trim();	 Catch:{ Exception -> 0x0c91 }
        r4 = com.iqoption.app.IQApp.Eu();	 Catch:{ Exception -> 0x0c91 }
        com.iqoption.app.a.b.b(r3, r4);	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0c8d:
        r3.isJsonPrimitive();	 Catch:{ Exception -> 0x0c91 }
        goto L_0x0caa;
    L_0x0c91:
        r0 = move-exception;
        r3 = r0;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Socket, onTextMessage error: ";
        r4.append(r5);
        r4.append(r2);
        r2 = r4.toString();
        com.iqoption.util.i.ag(r2);
        com.iqoption.util.i.d(r3);
    L_0x0caa:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.service.WebSocketHandler.a(java.lang.String, com.google.gson.stream.JsonReader):void");
    }

    private /* synthetic */ void t(Object[] objArr) {
        aTs();
    }

    private /* synthetic */ void T(Throwable th) {
        azk();
        IQApp.Ew().bd(new g("empty-profile-msg"));
    }

    private void C(@Nullable Long l) {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        Object obj = null;
        boolean z = DG.DH() == -1;
        Object obj2;
        if (l != null) {
            Object obj3;
            Balance f = DG.f(Long.valueOf(DG.DH()));
            Balance f2 = DG.f(l);
            DG.setBalanceId(l);
            if (f2 != null) {
                Object obj4 = f != null ? 1 : null;
                obj2 = (obj4 == null || !Objects.equals(Long.valueOf(f.id), Long.valueOf(f2.id))) ? 1 : null;
                obj3 = (obj4 == null || !Objects.equals(f.currency, f2.currency)) ? 1 : null;
                if (obj4 == null || !Objects.equals(Integer.valueOf(f.type), Integer.valueOf(f2.type))) {
                    obj = 1;
                }
            } else {
                obj2 = null;
                obj3 = null;
            }
            if (obj != null) {
                IQApp.Ew().bd(new com.iqoption.service.e.b().setValue(Boolean.valueOf(z)));
            }
            if (obj3 != null) {
                IQApp.Ew().bd(new com.iqoption.service.e.c());
            }
            if (obj2 != null) {
                IQApp.Ew().bd(new com.iqoption.service.e.a());
            }
        } else {
            obj2 = null;
        }
        if (z || r0 != null) {
            IQApp.Ew().bd(new k());
        }
    }

    @NonNull
    private JsonElement b(@NonNull String str, @NonNull JsonReader jsonReader) {
        JsonElement parse = w.aWN().parse(jsonReader);
        this.dSn.onNext(new m(str, parse));
        return parse;
    }

    private void ap(JsonReader jsonReader) {
        if (jsonReader != null) {
            com.iqoption.mobbtech.connect.response.d dVar = (com.iqoption.mobbtech.connect.response.d) w.aWL().fromJson(jsonReader, (Type) com.iqoption.mobbtech.connect.response.d.class);
            if (dVar != null) {
                com.iqoption.app.managers.c.GS().a(dVar);
                Sla.CV().dn("pricing");
            }
        }
    }

    private void m(JSONObject jSONObject) {
        com.iqoption.core.c.a.biM.execute(new -$$Lambda$WebSocketHandler$SqDBvck7KLipg3IW4gqx2NvffIQ(jSONObject));
    }

    private void jI(String str) {
        com.iqoption.core.c.a.biN.post(new -$$Lambda$WebSocketHandler$NcIyIjzvqJs5ohaJmEA-qq5bYS8(str));
    }

    private static /* synthetic */ void jK(String str) {
        IQApp Eu = IQApp.Eu();
        if (TextUtils.isEmpty(str)) {
            com.iqoption.app.a.b.aQ(Eu);
        } else {
            com.iqoption.app.a.b.b(str, Eu);
        }
    }

    private void ce(long j) {
        l.HZ().ao(j);
    }

    private void aq(com.google.gson.stream.JsonReader r36) {
        /*
        r35 = this;
        r36.beginObject();
        r0 = 0;
        r2 = 0;
        r3 = 0;
        r5 = "T";
        r17 = r0;
        r19 = r17;
        r21 = r19;
        r10 = r3;
        r12 = r10;
        r23 = r12;
        r25 = r23;
        r27 = r25;
        r29 = r27;
        r31 = r29;
        r0 = 0;
        r16 = 0;
    L_0x001f:
        r1 = r36.hasNext();
        if (r1 == 0) goto L_0x0165;
    L_0x0025:
        r1 = r36.nextName();
        r3 = -1;
        r4 = r1.hashCode();
        switch(r4) {
            case -810883302: goto L_0x00b3;
            case 3123: goto L_0x00a9;
            case 3355: goto L_0x009f;
            case 3707: goto L_0x0094;
            case 96889: goto L_0x0089;
            case 97533: goto L_0x007e;
            case 107876: goto L_0x0073;
            case 108114: goto L_0x0069;
            case 3151786: goto L_0x005f;
            case 3417674: goto L_0x0055;
            case 94756344: goto L_0x004a;
            case 106629499: goto L_0x003e;
            case 204492020: goto L_0x0033;
            default: goto L_0x0031;
        };
    L_0x0031:
        goto L_0x00bf;
    L_0x0033:
        r4 = "active_id";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x003b:
        r1 = 0;
        goto L_0x00c0;
    L_0x003e:
        r4 = "phase";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x0046:
        r1 = 12;
        goto L_0x00c0;
    L_0x004a:
        r4 = "close";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x0052:
        r1 = 6;
        goto L_0x00c0;
    L_0x0055:
        r4 = "open";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x005d:
        r1 = 5;
        goto L_0x00c0;
    L_0x005f:
        r4 = "from";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x0067:
        r1 = 3;
        goto L_0x00c0;
    L_0x0069:
        r4 = "min";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x0071:
        r1 = 7;
        goto L_0x00c0;
    L_0x0073:
        r4 = "max";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x007b:
        r1 = 8;
        goto L_0x00c0;
    L_0x007e:
        r4 = "bid";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x0086:
        r1 = 9;
        goto L_0x00c0;
    L_0x0089:
        r4 = "ask";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x0091:
        r1 = 10;
        goto L_0x00c0;
    L_0x0094:
        r4 = "to";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x009d:
        r1 = 4;
        goto L_0x00c0;
    L_0x009f:
        r4 = "id";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x00a7:
        r1 = 1;
        goto L_0x00c0;
    L_0x00a9:
        r4 = "at";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x00b1:
        r1 = 2;
        goto L_0x00c0;
    L_0x00b3:
        r4 = "volume";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x00bf;
    L_0x00bc:
        r1 = 11;
        goto L_0x00c0;
    L_0x00bf:
        r1 = -1;
    L_0x00c0:
        switch(r1) {
            case 0: goto L_0x015d;
            case 1: goto L_0x0153;
            case 2: goto L_0x0149;
            case 3: goto L_0x013f;
            case 4: goto L_0x0135;
            case 5: goto L_0x012b;
            case 6: goto L_0x0121;
            case 7: goto L_0x0117;
            case 8: goto L_0x010d;
            case 9: goto L_0x0104;
            case 10: goto L_0x00fb;
            case 11: goto L_0x00f1;
            case 12: goto L_0x00ca;
            default: goto L_0x00c3;
        };
    L_0x00c3:
        r1 = r35;
        r36.skipValue();
        goto L_0x001f;
    L_0x00ca:
        r1 = r35;
        r3 = r1.dRZ;
        r3 = r3.Dr();
        if (r3 == 0) goto L_0x00ea;
    L_0x00d4:
        r3 = com.iqoption.core.data.d.a.bdi;
        r3 = r3.Wq();
        if (r3 == 0) goto L_0x00ea;
    L_0x00dc:
        r3 = com.iqoption.debugmenu.debugmenu.e.cwm;
        r3 = r3.aog();
        r3 = r3.getServerValue();
        r36.skipValue();
        goto L_0x00ee;
    L_0x00ea:
        r3 = r36.nextString();
    L_0x00ee:
        r5 = r3;
        goto L_0x001f;
    L_0x00f1:
        r1 = r35;
        r3 = r36.nextDouble();
        r31 = r3;
        goto L_0x001f;
    L_0x00fb:
        r1 = r35;
        r3 = r36.nextDouble();
        r12 = r3;
        goto L_0x001f;
    L_0x0104:
        r1 = r35;
        r3 = r36.nextDouble();
        r10 = r3;
        goto L_0x001f;
    L_0x010d:
        r1 = r35;
        r3 = r36.nextDouble();
        r29 = r3;
        goto L_0x001f;
    L_0x0117:
        r1 = r35;
        r3 = r36.nextDouble();
        r27 = r3;
        goto L_0x001f;
    L_0x0121:
        r1 = r35;
        r3 = r36.nextDouble();
        r25 = r3;
        goto L_0x001f;
    L_0x012b:
        r1 = r35;
        r3 = r36.nextDouble();
        r23 = r3;
        goto L_0x001f;
    L_0x0135:
        r1 = r35;
        r3 = r36.nextLong();
        r21 = r3;
        goto L_0x001f;
    L_0x013f:
        r1 = r35;
        r3 = r36.nextLong();
        r19 = r3;
        goto L_0x001f;
    L_0x0149:
        r1 = r35;
        r3 = r36.nextLong();
        r17 = r3;
        goto L_0x001f;
    L_0x0153:
        r1 = r35;
        r3 = r36.nextInt();
        r16 = r3;
        goto L_0x001f;
    L_0x015d:
        r1 = r35;
        r0 = r36.nextInt();
        goto L_0x001f;
    L_0x0165:
        r1 = r35;
        r36.endObject();
        r2 = r12 + r10;
        r6 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r2 = r2 / r6;
        r6 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r8 = r17 / r6;
        r14 = com.iqoption.gl.c.aIy();
        r15 = r0;
        r14.addValueTimeId(r15, r16, r17, r19, r21, r23, r25, r27, r29, r31);
        r6 = com.iqoption.app.managers.c.GS();
        r7 = r0;
        r14 = r8;
        r8 = r2;
        r33 = r14;
        r14 = r5;
        r6.a(r7, r8, r10, r12, r14);
        r4 = com.iqoption.app.managers.tab.TabHelper.IM();
        r4.b(r0, r2);
        r2 = com.iqoption.app.managers.l.HZ();
        r3 = r33;
        r2.e(r0, r3);
        r0 = com.iqoption.analytics.sla.Sla.CV();
        r2 = "quotes";
        r0.dn(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.service.WebSocketHandler.aq(com.google.gson.stream.JsonReader):void");
    }

    private aa<Object> aTq() {
        final aa vM = aa.vM();
        v.b(com.iqoption.mobbtech.connect.request.a.a.b.z(BalanceListResult.class).fo("get-balances").UA(), new com.iqoption.system.c.a<BalanceListResult>() {
            /* renamed from: a */
            public void cl(@NonNull BalanceListResult balanceListResult) {
                com.iqoption.app.b.DG().a(balanceListResult.getMapBalance());
                vM.set(Boolean.valueOf(true));
            }

            public void U(Throwable th) {
                vM.setException(th);
            }
        });
        if (!com.iqoption.app.b.DG().DL().isEmpty()) {
            vM.set(Boolean.valueOf(true));
        }
        return vM;
    }

    private aa<Object> aTr() {
        final aa vM = aa.vM();
        v.b(com.iqoption.mobbtech.connect.request.api.e.aPz(), new com.iqoption.system.c.a<List>() {
            /* renamed from: a */
            public void cl(@NonNull List list) {
                com.iqoption.app.b.DG().x(list);
                vM.set(Boolean.valueOf(true));
            }

            public void U(Throwable th) {
                vM.setException(th);
            }
        });
        if (!com.iqoption.app.b.DG().DP()) {
            vM.set(Boolean.valueOf(true));
        }
        return vM;
    }

    private void aTs() {
        if (this.dRX != State.AUTHORIZED) {
            if (this.dRX == State.NONE || this.dRX == State.RECONNECT) {
                this.dRX = State.AUTHORIZED;
                aTt();
                t IC = com.iqoption.app.managers.feature.c.IC();
                aa aTr = aTr();
                aa aTq = aTq();
                v.b(p.a(IC, aTr, aTq), new o<java.util.List<Object>>() {
                    /* renamed from: B */
                    public void onSuccess(java.util.List<Object> list) {
                        WebSocketHandler.this.aTv();
                        WebSocketHandler.this.eZ(true);
                        WebSocketHandler.this.baj.onNext(IQBusState.CONNECTED);
                        IQApp.Ew().bd(new e.f().setValue(new WeakReference(WebSocketHandler.this)));
                        com.iqoption.analytics.d.BZ().h("socket-connected", true);
                    }

                    public void l(Throwable th) {
                        WebSocketHandler.this.eZ(false);
                        com.iqoption.analytics.b.clear();
                        WebSocketHandler.this.closeConnection();
                    }
                });
            }
            IQFirebaseMessagingService.aUz();
            ((com.iqoption.b.a) IQApp.Eu().asx.get()).as(0);
        }
    }

    private void aTt() {
        aTu();
        this.dRU = com.iqoption.core.c.a.biL.d(new -$$Lambda$WebSocketHandler$EYaCISIngsp2k6T8KxAWdoXmiCU(this));
    }

    private /* synthetic */ void aTC() {
        com.iqoption.service.websocket.a.b bVar = (com.iqoption.service.websocket.a.b) this.dRR.poll();
        while (bVar != null) {
            c(bVar);
            bVar = (com.iqoption.service.websocket.a.b) this.dRR.poll();
        }
    }

    private void aTu() {
        Future future = this.dRU;
        if (future != null && !future.isCancelled() && !future.isDone()) {
            future.cancel(true);
        }
    }

    public void a(JSONObject jSONObject, InstrumentType instrumentType) {
        String str = "special";
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                Object next = keys.next();
                if (next instanceof String) {
                    int parseInt = Integer.parseInt((String) next);
                    com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(parseInt), instrumentType);
                    if (a != null && (a instanceof com.iqoption.core.microservices.tradingengine.response.active.n)) {
                        com.iqoption.core.microservices.tradingengine.response.active.n nVar = (com.iqoption.core.microservices.tradingengine.response.active.n) a;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(parseInt);
                        stringBuilder.append("");
                        JSONObject jSONObject2 = jSONObject.getJSONObject(stringBuilder.toString());
                        com.iqoption.core.microservices.tradingengine.response.active.n.d aij = nVar.aij();
                        aij.setCount(jSONObject2.getInt(OtnEmissionExecuted.COUNT));
                        aij.setStartTime(jSONObject2.getLong("start_time"));
                        aij.aZ(jSONObject2.getLong("exp_time"));
                        if (jSONObject2.has(str) && (jSONObject2.get(str) instanceof JSONObject)) {
                            aij.ain().putAll((HashMap) w.aWL().fromJson(jSONObject2.getJSONObject(str).toString(), new TypeToken<HashMap<Long, com.iqoption.core.microservices.tradingengine.response.active.n.d.c>>() {
                            }.getType()));
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private void aTv() {
        j.bz(true);
        synchronized (this.dSl) {
            this.dSl.clear();
        }
        a((com.iqoption.m.a) this);
        com.iqoption.mobbtech.connect.request.api.e.jf("user-loyalty");
        com.iqoption.mobbtech.connect.request.api.e.jf("feature-updated");
        com.iqoption.mobbtech.connect.request.api.e.jf("currency-updated");
        com.iqoption.mobbtech.connect.request.api.e.aA("feed-item-info-update", "2.0");
        if (com.iqoption.app.managers.feature.c.Iw().ep("commission-popup")) {
            com.iqoption.mobbtech.connect.request.api.e.jf("commission-settings-changed");
        }
        if (com.iqoption.app.managers.feature.a.Ih() && com.iqoption.app.managers.feature.a.Ii()) {
            com.iqoption.mobbtech.connect.request.api.e.jf("user-emission-executed");
        }
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        int groupId = DG.getGroupId();
        boolean Er = DG.Er();
        o(groupId, Er);
        p(groupId, Er);
        q(groupId, Er);
        s(groupId, Er);
        r(groupId, Er);
        t(groupId, Er);
        n(groupId, Er);
        j.HX().HY();
        com.iqoption.analytics.b.BO();
    }

    private void n(int i, boolean z) {
        if (com.iqoption.core.features.instrument.b.Xs()) {
            String str = "user_group_id";
            String str2 = "is_regulated";
            com.iqoption.mobbtech.connect.request.api.e.jh("subscribeMessage").ji("underlying-list-changed").jj("4.0").p("type", InstrumentType.FX_INSTRUMENT).p(str, Integer.valueOf(i)).p(str2, Boolean.valueOf(z)).jk("trading-instruments-fx-option").exec();
            HashMap hashMap = new HashMap();
            hashMap.put("instrument_type", InstrumentType.FX_INSTRUMENT);
            hashMap.put(str, Integer.valueOf(i));
            String str3 = "trading-fx-option";
            com.iqoption.mobbtech.connect.request.api.e.a("order-changed", str3, hashMap);
            com.iqoption.mobbtech.connect.request.api.e.a("position-changed", str3, hashMap);
        }
    }

    private void o(int i, boolean z) {
        if (com.iqoption.core.features.instrument.b.Xt()) {
            HashMap hashMap = new HashMap();
            String str = "instrument_type";
            hashMap.put(str, InstrumentType.TURBO_INSTRUMENT);
            String str2 = "user_group_id";
            hashMap.put(str2, Integer.valueOf(i));
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, InstrumentType.BINARY_INSTRUMENT);
            hashMap2.put(str2, Integer.valueOf(i));
            String str3 = "commission-changed";
            com.iqoption.mobbtech.connect.request.api.e.a(str3, hashMap);
            com.iqoption.mobbtech.connect.request.api.e.a(str3, hashMap2);
            com.iqoption.mobbtech.connect.request.api.e.jg("socket-option-opened");
            com.iqoption.mobbtech.connect.request.api.e.jg("socket-option-closed");
        }
    }

    private void p(int i, boolean z) {
        if (com.iqoption.core.features.instrument.b.Xq()) {
            String str = "user_group_id";
            String str2 = "is_regulated";
            com.iqoption.mobbtech.connect.request.api.e.jh("subscribeMessage").ji("underlying-list-changed").jj("4.0").p("type", InstrumentType.MULTI_INSTRUMENT).p(str, Integer.valueOf(i)).p(str2, Boolean.valueOf(z)).exec();
            HashMap hashMap = new HashMap();
            hashMap.put("instrument_type", InstrumentType.MULTI_INSTRUMENT);
            hashMap.put(str, Integer.valueOf(i));
            String str3 = "multi-options";
            com.iqoption.mobbtech.connect.request.api.e.a("order-changed", str3, hashMap);
            com.iqoption.mobbtech.connect.request.api.e.a("position-changed", str3, hashMap);
        }
    }

    private void q(int i, boolean z) {
        if (com.iqoption.core.features.instrument.b.Xr()) {
            String str = "user_group_id";
            String str2 = "is_regulated";
            com.iqoption.mobbtech.connect.request.api.e.jh("subscribeMessage").ji("underlying-list-changed").jj("4.0").p("type", InstrumentType.DIGITAL_INSTRUMENT).p(str, Integer.valueOf(i)).p(str2, Boolean.valueOf(z)).exec();
            HashMap hashMap = new HashMap();
            hashMap.put("instrument_type", InstrumentType.DIGITAL_INSTRUMENT);
            hashMap.put(str, Integer.valueOf(i));
            com.iqoption.mobbtech.connect.request.api.e.a("order-changed", com.iqoption.core.microservices.a.Zd(), hashMap);
            com.iqoption.mobbtech.connect.request.api.e.a("position-changed", com.iqoption.core.microservices.a.Zd(), hashMap);
        }
    }

    private void r(int i, boolean z) {
        if (com.iqoption.core.features.instrument.b.Xv()) {
            String str = "subscribeMessage";
            String str2 = "user_group_id";
            String str3 = "is_regulated";
            com.iqoption.mobbtech.connect.request.api.e.jh(str).ji("instruments-changed").jj("5.0").p("type", InstrumentType.FOREX_INSTRUMENT).p(str2, Integer.valueOf(i)).p(str3, Boolean.valueOf(z)).exec();
            HashMap hashMap = new HashMap();
            hashMap.put("instrument_type", InstrumentType.FOREX_INSTRUMENT);
            hashMap.put(str2, Integer.valueOf(i));
            com.iqoption.mobbtech.connect.request.api.e.a("order-changed", hashMap);
            com.iqoption.mobbtech.connect.request.api.e.a("position-changed", hashMap);
            com.iqoption.mobbtech.connect.request.api.e.jh(str).ji("available-leverages-changed").jj("2.0").e(hashMap).exec();
        }
    }

    private void s(int i, boolean z) {
        if (com.iqoption.core.features.instrument.b.Xu()) {
            String str = "subscribeMessage";
            String str2 = "user_group_id";
            String str3 = "is_regulated";
            com.iqoption.mobbtech.connect.request.api.e.jh(str).ji("instruments-changed").jj("5.0").p("type", InstrumentType.CFD_INSTRUMENT).p(str2, Integer.valueOf(i)).p(str3, Boolean.valueOf(z)).exec();
            HashMap hashMap = new HashMap();
            hashMap.put("instrument_type", InstrumentType.CFD_INSTRUMENT);
            hashMap.put(str2, Integer.valueOf(i));
            com.iqoption.mobbtech.connect.request.api.e.a("order-changed", hashMap);
            com.iqoption.mobbtech.connect.request.api.e.a("position-changed", hashMap);
            com.iqoption.mobbtech.connect.request.api.e.jh(str).ji("available-leverages-changed").jj("4.0").e(hashMap).exec();
        }
    }

    private void t(int i, boolean z) {
        if (com.iqoption.core.features.instrument.b.Xw()) {
            String str = "subscribeMessage";
            String str2 = "user_group_id";
            String str3 = "is_regulated";
            com.iqoption.mobbtech.connect.request.api.e.jh(str).ji("instruments-changed").jj("5.0").p("type", InstrumentType.CRYPTO_INSTRUMENT).p(str2, Integer.valueOf(i)).p(str3, Boolean.valueOf(z)).exec();
            HashMap hashMap = new HashMap();
            hashMap.put("instrument_type", InstrumentType.CRYPTO_INSTRUMENT);
            hashMap.put(str2, Integer.valueOf(i));
            com.iqoption.mobbtech.connect.request.api.e.a("order-changed", hashMap);
            com.iqoption.mobbtech.connect.request.api.e.a("position-changed", hashMap);
            com.iqoption.mobbtech.connect.request.api.e.jh(str).ji("available-leverages-changed").jj("2.0").e(hashMap).exec();
        }
    }

    private /* synthetic */ void aTB() {
        closeConnection();
        IQApp.Ew().bd(new h());
    }

    public boolean n(Object obj, int i) {
        this.dRS.bv(obj);
        if (!this.dRS.isEmpty()) {
            return false;
        }
        if (this.dRX == State.NONE) {
            return true;
        }
        Handler handler = this.dRN;
        if (handler == null || i <= 0) {
            closeConnection();
        } else {
            handler.removeCallbacks(this.dSi);
            this.dRN.postDelayed(this.dSi, (long) i);
        }
        return true;
    }

    public void azk() {
        closeConnection();
    }

    private void closeConnection() {
        this.dRS.clear();
        this.dRX = State.NONE;
        this.dRQ.unregister();
        eZ(false);
        aTy();
        aTu();
        this.dRP = true;
        aTp();
        Handler handler = this.dRN;
        if (handler != null) {
            handler.removeCallbacks(this.dSi);
            this.dRN.sendEmptyMessage(3);
            this.dRN.sendEmptyMessage(4);
            this.dRN = null;
        }
        synchronized (this.dSl) {
            this.dSl.clear();
        }
        this.dSk.clear();
        j.HX().clear();
        l.HZ().clear();
    }

    public t<Object> cj(Object obj) {
        this.dRS.bu(obj);
        Handler handler = this.dRN;
        if (handler != null) {
            handler.removeCallbacks(this.dSi);
        }
        if (DR()) {
            return p.bo(Boolean.valueOf(true));
        }
        if (this.dSj != null && !this.dSj.isDone() && !this.dSj.isCancelled()) {
            return this.dSj;
        }
        if (this.dRO == null) {
            this.dRO = com.iqoption.app.managers.feature.c.Iw().ej("ws-new-lib") ? new b() : new c();
        }
        this.dSa = Event.Builder(Event.CATEGORY_SYSTEM, "open-socket_request");
        this.dRQ.register();
        this.dSj = aa.vM();
        this.dRP = false;
        this.bgB = "";
        aTo();
        HandlerThread handlerThread = new HandlerThread("WebSocket Looper");
        handlerThread.start();
        this.dRN = new d(handlerThread.getLooper());
        IQApp.Ev().release();
        v.b(com.iqoption.core.rx.g.a(IQApp.Ev().UZ()), new -$$Lambda$WebSocketHandler$VN5mD2-lvIwYgPC17KH_jvNJsVM(this), new -$$Lambda$WebSocketHandler$mYBPMYWbEXQuMnH-6UpLoJYKwXA(this));
        this.baj.onNext(IQBusState.CONNECTING);
        return this.dSj;
    }

    private /* synthetic */ void ck(Object obj) {
        this.dRN.sendEmptyMessage(1);
    }

    private /* synthetic */ void S(Throwable th) {
        eZ(false);
    }

    private synchronized void eZ(boolean z) {
        if (this.dSj != null) {
            if (z) {
                this.dSj.set(Boolean.valueOf(true));
            } else {
                this.dSj.setException(new Throwable("Socket not connecting"));
                this.dSj = null;
            }
        }
    }

    public boolean DR() {
        return this.dRX == State.AUTHORIZED;
    }

    private void aTw() {
        if (!com.iqoption.app.b.DG().DR()) {
            return;
        }
        if (com.iqoption.app.a.b.Gp()) {
            if (Network.ebO.aWS()) {
                this.dRX = State.RECONNECT;
            } else {
                this.dRX = State.NONE;
            }
            reconnect();
            aTu();
            return;
        }
        closeConnection();
    }

    private void reconnect() {
        if (this.dRW.get() == null) {
            this.dRW.compareAndSet(null, Event.Builder(Event.CATEGORY_SYSTEM, "socket-reconnect").setTechnicalLogs(Boolean.valueOf(true)));
        }
        this.dRX = State.RECONNECT;
        Handler handler = this.dRN;
        if (handler != null) {
            handler.sendEmptyMessage(3);
            this.dRN.sendEmptyMessageDelayed(1, (long) ((new Random().nextInt(400) + 100) + 500));
        }
        IQApp.Ex().bd(new e.i());
    }

    @WorkerThread
    public static void a(com.iqoption.m.a aVar) {
        TabHelper IM = TabHelper.IM();
        Set IV = IM.IV();
        Set IW = IM.IW();
        synchronized (WebSocketHandler.class) {
            HashSet uw = Sets.uw();
            aj sK = com.iqoption.app.managers.c.GS().GQ().iterator();
            while (sK.hasNext()) {
                uw.add(Pair.create(((Order) sK.next()).getInstrumentActiveId(), Integer.valueOf(1)));
            }
            sK = com.iqoption.app.managers.c.GS().GU().iterator();
            while (sK.hasNext()) {
                com.iqoption.mobbtech.connect.response.options.b bVar = (com.iqoption.mobbtech.connect.response.options.b) sK.next();
                if (bVar.instrumentType == InstrumentType.MULTI_INSTRUMENT) {
                    Iterator it = ((Position) bVar.aPX().get(0)).getPositionItems().iterator();
                    while (it.hasNext()) {
                        uw.add(Pair.create(Integer.valueOf(((PositionItem) it.next()).getActiveId()), Integer.valueOf(1)));
                    }
                } else {
                    uw.add(Pair.create(Integer.valueOf(bVar.activeId), Integer.valueOf(1)));
                }
            }
            uw.addAll(IV);
            aVar.m(IW);
            aVar.l(uw);
        }
    }

    public void l(Set<Pair<Integer, Integer>> set) {
        if (!com.iqoption.util.g.isEmpty(set)) {
            synchronized (this.dSl) {
                Iterator it = this.dSl.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    if (!set.contains(pair)) {
                        it.remove();
                        a("unsubscribeMessage", pair);
                    }
                }
                for (Pair pair2 : set) {
                    if (!this.dSl.contains(pair2)) {
                        this.dSl.add(pair2);
                        a("subscribeMessage", pair2);
                    }
                }
            }
        }
    }

    private void a(String str, Pair<Integer, Integer> pair) {
        String str2 = "size";
        com.iqoption.mobbtech.connect.request.api.e.jh(str).ji("candle-generated").jj("1.0").p("active_id", pair.first).p(str2, pair.second).exec();
        Sla.CV().a("quotes", str.equalsIgnoreCase("subscribeMessage"), pair);
    }

    public void m(Set<Pair<Integer, InstrumentType>> set) {
        if (!com.iqoption.util.g.isEmpty(set)) {
            Iterator it = this.dSk.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (!set.contains(pair)) {
                    it.remove();
                    b("unsubscribeMessage", pair);
                }
            }
            for (Pair pair2 : set) {
                if (!this.dSk.contains(pair2)) {
                    this.dSk.add(pair2);
                    a(pair2);
                    b("subscribeMessage", pair2);
                }
            }
        }
    }

    private void a(Pair<Integer, InstrumentType> pair) {
        String str = "instrument";
        com.iqoption.mobbtech.connect.request.api.e.jh("sendMessage").ji("get-traders-mood").jj("1.0").p("asset_id", pair.first).p(str, pair.second).exec();
    }

    private void b(String str, Pair<Integer, InstrumentType> pair) {
        String str2 = "instrument";
        com.iqoption.mobbtech.connect.request.api.e.jh(str).ji("traders-mood-changed").jj("1.0").p("asset_id", pair.first).p(str2, pair.second).exec();
    }

    private void aTx() {
        String aOU = RequestManager.aOR().aOU();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(ConditionalUserProperty.NAME, "ssid");
        jsonObject.addProperty(NotificationCompat.CATEGORY_MESSAGE, aOU);
        x(jsonObject.toString(), true);
    }

    private void aTy() {
        ImmutableList m = ImmutableList.m(this.dSm.values());
        this.dSm.clear();
        aj sK = m.iterator();
        while (sK.hasNext()) {
            com.iqoption.service.websocket.a.b bVar = (com.iqoption.service.websocket.a.b) sK.next();
            if (bVar.dSy != null) {
                bVar.dSy.setException(new Throwable("Socket close"));
            }
        }
    }

    @Nullable
    private com.iqoption.service.websocket.a.b jJ(String str) {
        return (com.iqoption.service.websocket.a.b) this.dSm.remove(str);
    }

    private void a(com.iqoption.service.websocket.a.b bVar) {
        if (bVar != null && bVar.bqc != null) {
            this.dSm.put(bVar.bqc, bVar);
        }
    }

    private void b(com.iqoption.service.websocket.a.b bVar) {
        if (this.dRX != State.AUTHORIZED) {
            if (bVar.dSy != null) {
                bVar.dSy.setException(new RuntimeException("Socket not authorized"));
            }
            return;
        }
        if (bVar.bqc != null) {
            a(bVar);
        }
        JsonObject jsonObject = new JsonObject();
        if (bVar.bqc != null) {
            jsonObject.addProperty("request_id", bVar.bqc);
        }
        jsonObject.addProperty(ConditionalUserProperty.NAME, bVar.aTF());
        jsonObject.add(NotificationCompat.CATEGORY_MESSAGE, bVar.aTH());
        jH(jsonObject.toString());
    }

    public boolean c(com.iqoption.service.websocket.a.b bVar) {
        if (this.dRX == State.AUTHORIZED) {
            com.iqoption.core.c.a.biM.execute(new -$$Lambda$WebSocketHandler$jZ1Q9dIUhzXsEgZZMF8iCYc9y2A(this, bVar));
            return true;
        }
        this.dRR.offer(bVar);
        return false;
    }

    public static boolean a(com.iqoption.m.a aVar, int i) {
        if (!aVar.DR()) {
            return false;
        }
        p.a(com.iqoption.microservice.quotes.history.a.go(i), new c(i), com.iqoption.core.c.a.biM);
        return true;
    }

    public static boolean a(com.iqoption.m.a aVar, int i, int i2, long j, long j2, int i3, int i4, int i5) {
        if (!aVar.DR()) {
            return false;
        }
        int i6 = i;
        int i7 = i2;
        p.a(com.iqoption.microservice.quotes.history.a.a(i, j, j2, i2, i3, i4, i5), new a(i, i2), com.iqoption.core.c.a.biM);
        if (!com.iqoption.app.managers.k.d(IQApp.Eu(), 65536) && l.HZ().Ib() - (1000 * j) > 7200000) {
            com.iqoption.app.managers.k.j(IQApp.Eu(), 65536);
        }
        return true;
    }

    public String Xd() {
        return this.bgB;
    }

    public io.reactivex.e<m> aTz() {
        return this.dSn;
    }

    public io.reactivex.e<Boolean> aTA() {
        return this.baj.g(-$$Lambda$WebSocketHandler$9vRylqapujiU0k8oaKwOdM892y4.INSTANCE);
    }
}
