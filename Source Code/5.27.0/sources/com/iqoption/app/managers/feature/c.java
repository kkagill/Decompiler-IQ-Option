package com.iqoption.app.managers.feature;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.common.base.Suppliers;
import com.google.common.base.e;
import com.google.common.base.n;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.aj;
import com.google.common.collect.i;
import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.core.manager.ae;
import com.iqoption.core.microservices.features.a.a.b;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.dto.entity.FeaturesUpdateEvent;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.service.websocket.IQBusException;
import com.iqoption.util.g;
import com.iqoption.util.v;
import com.iqoption.util.w;
import io.reactivex.processors.PublishProcessor;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;

/* compiled from: FeaturesToggledManager */
public class c {
    private static final String TAG = "com.iqoption.app.managers.feature.c";
    private static ImmutableMap<String, String> avJ = ImmutableMap.sW();
    private static ImmutableSet<String> avK = ImmutableSet.tp().aI("digital-instrument").aI("cfd-instrument").aI("binary-instrument").aI("forex-instrument").aI("crypto-instrument").aI("fx-options-instrument").aI("multioptions-instrument").aI("tournaments").tq();
    private static ImmutableSet<String> avL = ImmutableSet.tp().aI("").tq();
    private static ImmutableMap<String, Integer> avM;
    private static final n<c> avQ = Suppliers.a(-$$Lambda$IajCkIsXQ9TKAKkGul40xm-PZ6w.INSTANCE);
    @SerializedName("features")
    private final ConcurrentMap<b, com.iqoption.core.microservices.features.a.a> avN = Maps.ul();
    private final PublishProcessor<List<com.iqoption.core.microservices.features.a.a>> avO = PublishProcessor.bmK();
    private final transient Set<a> avP;
    private volatile t<?> avR;

    /* compiled from: FeaturesToggledManager */
    public interface a {
        void onFeaturesUpdated();
    }

    @NonNull
    public static String Is() {
        return "android-x";
    }

    public c() {
        Iu();
        this.avP = Collections.newSetFromMap(new WeakHashMap());
    }

    private static List<com.iqoption.core.microservices.features.a.a> Ir() {
        return ImmutableList.aJ(a("fx-coefficient-x", "1.05", 1));
    }

    public String eh(String str) {
        com.iqoption.core.microservices.features.a.a ei = ei(str);
        if (ei == null) {
            return "disabled";
        }
        return ei.getStatus();
    }

    private void It() {
        com.google.common.collect.ImmutableMap.a aVar = new com.google.common.collect.ImmutableMap.a();
        aj sK = avK.iterator();
        while (sK.hasNext()) {
            String str = (String) sK.next();
            aVar.m(str, eh(str));
        }
        avJ = aVar.tf();
    }

    protected static boolean em(String str) {
        return "disabled".equalsIgnoreCase(str) ^ 1;
    }

    @NonNull
    public static String en(String str) {
        String str2 = "disabled";
        return (String) e.g(avL.contains(str) ? str2 : (String) avJ.get(str), str2);
    }

    static {
        com.google.common.collect.ImmutableMap.a m = ImmutableMap.sX().m("price-movements", Integer.valueOf(3));
        Integer valueOf = Integer.valueOf(2);
        avM = m.m("video-education", valueOf).m("otn-leaderboard", valueOf).m("pending-order", valueOf).m("experimental-deposit-page", Integer.valueOf(1)).m("popup-trending-now", valueOf).m("asset-info", valueOf).tf();
    }

    protected static int eo(String str) {
        return ((Integer) e.g(avM.get(str), Integer.valueOf(ae.bkV.fY(str)))).intValue();
    }

    private void Iu() {
        for (com.iqoption.core.microservices.features.a.a aVar : Ir()) {
            this.avN.put(new b(aVar.getName(), aVar.getVersion()), aVar);
        }
    }

    public static void a(a aVar) {
        Iw().b(aVar);
    }

    private void b(a aVar) {
        this.avP.add(aVar);
    }

    private void Iv() {
        for (a onFeaturesUpdated : Sets.x(this.avP)) {
            onFeaturesUpdated.onFeaturesUpdated();
        }
    }

    public static synchronized c Iw() {
        c cVar;
        synchronized (c.class) {
            cVar = (c) avQ.get();
        }
        return cVar;
    }

    public synchronized t<?> Ix() {
        if (this.avR != null) {
            return this.avR;
        }
        this.avR = com.iqoption.core.c.a.biL.d(new -$$Lambda$c$SRCHd3TQcHlqjK8_SATURb2L8zs(this));
        return this.avR;
    }

    private synchronized void init() {
        String string = IQApp.Eu().getSharedPreferences("features_manager_pref_name", 0).getString("features_manager_pref_json", "");
        if (!TextUtils.isEmpty(string)) {
            a((com.iqoption.core.microservices.features.a.a[]) w.aWM().fromJson(string, com.iqoption.core.microservices.features.a.a[].class));
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public synchronized void save() {
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$c$am86Y7ipIW3A4f1tOSWdbxKL8D0(this));
    }

    private /* synthetic */ void IE() {
        IQApp.Eu().getSharedPreferences("features_manager_pref_name", 0).edit().putString("features_manager_pref_json", w.aWM().toJson(i.b(this.avN.values()).c(com.iqoption.core.microservices.features.a.a.class))).commit();
    }

    private synchronized void clear() {
        IQApp.Eu().getSharedPreferences("features_manager_pref_name", 0).edit().putString("features_manager_pref_json", "").apply();
    }

    public synchronized void Io() {
        this.avN.clear();
        Iu();
        clear();
    }

    public ImmutableList<com.iqoption.core.microservices.features.a.a> a(com.iqoption.core.microservices.features.a.a[] aVarArr) {
        for (com.iqoption.core.microservices.features.a.a aVar : aVarArr) {
            b D = com.iqoption.core.microservices.features.a.a.D(aVar.getName(), aVar.getVersion());
            if (this.avN.containsKey(D)) {
                this.avN.put(D, aVar);
            } else {
                this.avN.put(new b(aVar.getName(), aVar.getVersion()), aVar);
            }
            D.recycle();
        }
        It();
        return Iy();
    }

    public ImmutableList<com.iqoption.core.microservices.features.a.a> Iy() {
        return i.b(this.avN.values()).sC();
    }

    public io.reactivex.e<List<com.iqoption.core.microservices.features.a.a>> Iz() {
        return this.avO.c(com.iqoption.core.rx.i.aki());
    }

    public com.iqoption.core.microservices.features.a.a ei(String str) {
        return avL.contains(str) ? null : s(str, eo(str));
    }

    private com.iqoption.core.microservices.features.a.a s(String str, int i) {
        com.iqoption.core.microservices.features.a.a t = t(str, i);
        return t == null ? u(str, i) : t;
    }

    private com.iqoption.core.microservices.features.a.a t(String str, int i) {
        if (com.iqoption.core.util.w.C(this.avN)) {
            return null;
        }
        b D = com.iqoption.core.microservices.features.a.a.D(str, i);
        com.iqoption.core.microservices.features.a.a aVar = (com.iqoption.core.microservices.features.a.a) this.avN.get(D);
        D.recycle();
        return aVar;
    }

    private com.iqoption.core.microservices.features.a.a u(java.lang.String r4, int r5) {
        /*
        r3 = this;
        r0 = r4.hashCode();
        r1 = "video-education";
        switch(r0) {
            case -2042367621: goto L_0x0045;
            case -1918590323: goto L_0x003b;
            case -1306705706: goto L_0x0033;
            case -40334142: goto L_0x0029;
            case 113960: goto L_0x001f;
            case 229040601: goto L_0x0015;
            case 1127659230: goto L_0x000b;
            default: goto L_0x000a;
        };
    L_0x000a:
        goto L_0x004f;
    L_0x000b:
        r0 = "splash-log";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x004f;
    L_0x0013:
        r0 = 1;
        goto L_0x0050;
    L_0x0015:
        r0 = "show-social-login";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x004f;
    L_0x001d:
        r0 = 5;
        goto L_0x0050;
    L_0x001f:
        r0 = "sla";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x004f;
    L_0x0027:
        r0 = 2;
        goto L_0x0050;
    L_0x0029:
        r0 = "kyc-show-after-registration";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x004f;
    L_0x0031:
        r0 = 0;
        goto L_0x0050;
    L_0x0033:
        r0 = r4.equals(r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0039:
        r0 = 3;
        goto L_0x0050;
    L_0x003b:
        r0 = "more-trading-opportunities";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x004f;
    L_0x0043:
        r0 = 4;
        goto L_0x0050;
    L_0x0045:
        r0 = "digital-ms";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x004f;
    L_0x004d:
        r0 = 6;
        goto L_0x0050;
    L_0x004f:
        r0 = -1;
    L_0x0050:
        r2 = "enabled";
        switch(r0) {
            case 0: goto L_0x0077;
            case 1: goto L_0x0072;
            case 2: goto L_0x006d;
            case 3: goto L_0x0068;
            case 4: goto L_0x0061;
            case 5: goto L_0x005c;
            case 6: goto L_0x0057;
            default: goto L_0x0055;
        };
    L_0x0055:
        r4 = 0;
        return r4;
    L_0x0057:
        r4 = a(r4, r2, r5);
        return r4;
    L_0x005c:
        r4 = a(r4, r2, r5);
        return r4;
    L_0x0061:
        r0 = "disabled";
        r4 = a(r4, r0, r5);
        return r4;
    L_0x0068:
        r4 = a(r1, r2, r5);
        return r4;
    L_0x006d:
        r4 = a(r4, r2, r5);
        return r4;
    L_0x0072:
        r4 = a(r4, r2, r5);
        return r4;
    L_0x0077:
        r4 = a(r4, r2, r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.feature.c.u(java.lang.String, int):com.iqoption.core.microservices.features.a.a");
    }

    public boolean ej(String str) {
        return a(ei(str), false);
    }

    public boolean ep(String str) {
        return a(ei(str), true);
    }

    private boolean a(com.iqoption.core.microservices.features.a.a aVar, boolean z) {
        return aVar == null ? z : em(aVar.getStatus());
    }

    public static boolean IA() {
        return d.Fa().Gl();
    }

    public static t<?> IB() {
        return com.iqoption.core.c.a.biM.d(-$$Lambda$c$JB64o3uWULEPMgWYdDjy6uQE3Xw.INSTANCE);
    }

    private static /* synthetic */ void ID() {
        Builder Builder = Event.Builder(Event.CATEGORY_SYSTEM, "feature-toggling_request");
        String bD = RequestManager.bD(IQApp.Eu());
        HashMap hashMap = new HashMap();
        hashMap.put("category", Is());
        String Gm = d.Fa().Gm();
        if (!TextUtils.isEmpty(Gm)) {
            hashMap.put("identity", Gm);
        }
        Response response = null;
        try {
            Object obj;
            response = RequestManager.aOR().aOS().newCall(RequestManager.a(RequestManager.ad("features.", "api/v2/features"), hashMap, IQApp.Eu())).execute();
            ResponseBody body = response.body();
            if (body == null) {
                obj = "";
            } else {
                obj = body.string();
            }
            Builder.setParameters(u.anp().o("aff", bD).o("response_code", Integer.valueOf(response.code())).o("response", obj).anr());
            EventManager.BS().a(Builder.calcDuration().setTechnicalLogs(Boolean.valueOf(true)).build());
            if (!response.isSuccessful()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected code ");
                stringBuilder.append(response);
                throw new IOException(stringBuilder.toString());
            } else if (TextUtils.isEmpty(obj)) {
                throw new JSONException("Null string error.");
            } else {
                j(obj, false);
                if (response != null) {
                    response.close();
                }
            }
        } catch (Exception unused) {
            if (response == null) {
            }
        } catch (Throwable th) {
            if (response != null) {
                response.close();
            }
        }
    }

    @WorkerThread
    public static void j(String str, boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, "feature-toggling_server_response").setParameters(u.b.anq().o("response", str).anr()).setTechnicalLogs(Boolean.valueOf(true)).build());
        com.iqoption.core.microservices.features.a.a.c cVar = (com.iqoption.core.microservices.features.a.a.c) w.aWM().fromJson(str, com.iqoption.core.microservices.features.a.a.c.class);
        if (cVar != null) {
            d.Fa().dU(cVar.getIdentity());
            if (z) {
                d.Fa().bu(true);
            }
            b(cVar.adA());
            Iw().save();
        }
    }

    @WorkerThread
    public static void a(JsonReader jsonReader) {
        String str = "update";
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, "feature-toggling_server_update").setParameters(u.b.anq().o(str, ((com.iqoption.core.microservices.features.a.a) w.aWM().fromJson(jsonReader, (Type) com.iqoption.core.microservices.features.a.a.class)).toString()).anr()).setTechnicalLogs(Boolean.valueOf(true)).build());
        v.a(IC(), -$$Lambda$c$b7HEr0liLMJ8zItYo1mWHo7FyGc.INSTANCE);
    }

    @WorkerThread
    private static void b(com.iqoption.core.microservices.features.a.a[] aVarArr) {
        if (aVarArr != null && aVarArr.length != 0) {
            ImmutableList a = Iw().a(aVarArr);
            if (!g.isEmpty(a)) {
                IQApp.Ex().bd(new FeaturesUpdateEvent(a));
            }
            Iw().avO.onNext(a);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, "feature-toggling_actual").setParameters(w.aWM().toJsonTree(a).getAsJsonArray()).setTechnicalLogs(Boolean.valueOf(true)).build());
        }
    }

    public static t<Object> IC() {
        final aa vM = aa.vM();
        final Builder Builder = Event.Builder(Event.CATEGORY_SYSTEM, "feature-toggling_bus_request");
        v.b(com.iqoption.mobbtech.connect.request.api.e.aPx(), new o<JsonElement>() {
            /* renamed from: b */
            public void onSuccess(JsonElement jsonElement) {
                Boolean valueOf = Boolean.valueOf(true);
                if (jsonElement != null) {
                    String jsonElement2 = jsonElement.toString();
                    c.j(jsonElement2, true);
                    Builder.setParameters(u.anp().o("aff", RequestManager.bD(IQApp.Eu())).o("response", jsonElement2).anr());
                    EventManager.BS().a(Builder.calcDuration().setTechnicalLogs(valueOf).build());
                }
                vM.set(valueOf);
            }

            public void l(Throwable th) {
                String bD = RequestManager.bD(IQApp.Eu());
                String str = "response";
                String str2 = "response_code";
                String str3 = "aff";
                if (th instanceof IQBusException) {
                    Builder builder = Builder;
                    u.b o = u.anp().o(str3, bD);
                    IQBusException iQBusException = (IQBusException) th;
                    builder.setParameters(o.o(str2, Integer.valueOf(iQBusException.status)).o(str, iQBusException.socketMessage).anr());
                } else {
                    Builder.setParameters(u.anp().o(str3, bD).o(str2, Integer.valueOf(-1)).o(str, "error").anr());
                }
                EventManager.BS().a(Builder.calcDuration().setTechnicalLogs(Boolean.valueOf(true)).build());
                if (c.IA()) {
                    vM.set(Boolean.valueOf(false));
                } else {
                    vM.setException(th);
                }
            }
        });
        return vM;
    }

    private static com.iqoption.core.microservices.features.a.a a(String str, String str2, int i) {
        return new com.iqoption.core.microservices.features.a.a(str, str2, i);
    }
}
