package com.iqoption.mobbtech.connect.request.a.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.google.common.base.Predicates;
import com.google.common.base.i;
import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.core.connect.j;
import com.iqoption.core.ext.c;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event.Builder;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.response.MobbErrorException;
import com.iqoption.mobbtech.connect.response.f;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.aj;
import com.iqoption.util.v;
import com.iqoption.util.w;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: RequestTask */
public class b<T> {
    private static final String TAG = "com.iqoption.mobbtech.connect.request.a.a.b";
    protected Class<T> acw;
    private kotlin.jvm.a.b<? super JsonReader, ? extends T> auS;
    private final String bgx;
    @Nullable
    private String bqc;
    protected Request dIs;
    protected String dIt;
    protected Builder dIu;
    private Type dIv;
    protected String errorMessage;
    protected int responseCode;
    protected boolean success;

    /* compiled from: RequestTask */
    public static class b<T> {
        private final Class<T> auR;
        private HashMap<String, Object> ava;
        private String dIA;
        private int dIy = 1;
        private HashMap<String, Object> dIz;
        private String host;
        private String path;
        private String qO;
        private final Type type;

        public b(Class<T> cls) {
            this.auR = cls;
            this.type = null;
        }

        public b<T> jo(String str) {
            this.host = aj.jQ(str);
            return this;
        }

        public b<T> jp(String str) {
            this.path = str;
            return this;
        }

        public b<T> gq(int i) {
            this.dIy = i;
            return this;
        }

        public b<T> q(String str, Object obj) {
            if (obj != null) {
                if (this.ava == null) {
                    this.ava = new HashMap();
                }
                this.ava.put(str, obj);
            }
            return this;
        }

        public t<T> aPF() {
            int i = this.dIy;
            if (i != 1) {
                if (i != 2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown requestType: ");
                    stringBuilder.append(this.dIy);
                    return p.m(new IllegalStateException(stringBuilder.toString()));
                }
                String str = this.dIA;
                if (str == null) {
                    if (this.auR != null) {
                        return RequestManager.a(this.host, this.path, this.dIz, this.ava, IQApp.Eu(), this.auR);
                    }
                    return RequestManager.a(this.host, this.path, this.dIz, this.ava, IQApp.Eu(), this.type);
                } else if (this.auR != null) {
                    return RequestManager.a(this.host, this.path, this.dIz, str, IQApp.Eu(), this.auR, this.qO);
                } else {
                    return RequestManager.a(this.host, this.path, this.dIz, str, IQApp.Eu(), this.type, this.qO);
                }
            } else if (this.dIA != null) {
                throw new RuntimeException("json is not supported for get request");
            } else if (this.auR != null) {
                return RequestManager.a(this.host, this.path, this.dIz, this.ava, IQApp.Eu(), this.auR, this.path);
            } else {
                return RequestManager.a(this.host, this.path, this.dIz, this.ava, IQApp.Eu(), this.type, this.path);
            }
        }
    }

    /* compiled from: RequestTask */
    public static class a<T> implements j<T> {
        private String auN;
        private final Class<T> auR;
        private final kotlin.jvm.a.b<? super JsonReader, ? extends T> auS;
        private HashMap<String, Object> ava;
        private String bqc;
        @Nullable
        private Request dIs;
        private int dIw;
        private JsonObject dIx;
        private String path;
        private int retryCount;
        private long timeout;
        private final Type type;
        private String version;

        public a(Class<T> cls) {
            this(cls, null, null, null);
        }

        public a(@NonNull Class<T> cls, @NonNull Request request) {
            this(cls);
            this.dIs = request;
        }

        public a(Class<T> cls, String str) {
            this(cls, null, null, str);
        }

        public a(Type type, String str) {
            this(null, type, null, str);
        }

        public a(kotlin.jvm.a.b<? super JsonReader, ? extends T> bVar, String str) {
            this(null, null, bVar, str);
        }

        private a(Class<T> cls, Type type, kotlin.jvm.a.b<? super JsonReader, ? extends T> bVar, String str) {
            this.dIw = 0;
            this.version = "1.0";
            this.auN = null;
            this.timeout = 15000;
            this.retryCount = 3;
            this.auR = cls;
            this.type = type;
            this.auS = bVar;
            this.path = str;
        }

        @NonNull
        public j<T> fo(@NonNull String str) {
            this.path = str;
            return this;
        }

        @NonNull
        public j<T> fp(@NonNull String str) {
            this.version = str;
            return this;
        }

        @NonNull
        public j<T> fq(@Nullable String str) {
            this.auN = str;
            return this;
        }

        @NonNull
        public j<T> ch(boolean z) {
            this.retryCount = z ? 3 : 0;
            return this;
        }

        @NonNull
        public j<T> eG(int i) {
            this.retryCount = i;
            return this;
        }

        @NonNull
        public j<T> c(@NonNull JsonObject jsonObject) {
            this.dIx = jsonObject;
            return this;
        }

        @NonNull
        public j<T> b(@NonNull HashMap<String, Object> hashMap) {
            this.ava = hashMap;
            return this;
        }

        @NonNull
        public j<T> k(@NonNull String str, Object obj) {
            if (obj != null) {
                aPL();
                this.ava.put(str, obj);
            }
            return this;
        }

        @NonNull
        public j<T> fr(String str) {
            this.bqc = str;
            return this;
        }

        @NonNull
        public t<T> UA() {
            boolean z = this.dIx == null || this.ava == null;
            i.checkArgument(z, "two types params are not allowed at the same time");
            return aPK();
        }

        private t<T> aPK() {
            Request request = this.dIs;
            if (request != null) {
                return new b(this.auR, this.dIs, request.url() == null ? "null" : this.dIs.url().toString()).aPG();
            }
            t<T> a;
            if (this.dIw != 1) {
                b bVar;
                Class cls = this.auR;
                if (cls != null) {
                    bVar = new b(cls, null, this.path);
                } else {
                    Type type = this.type;
                    if (type != null) {
                        bVar = new b(type, this.path);
                    } else {
                        bVar = new b(null, this.path).n(this.auS);
                    }
                }
                b bVar2 = bVar;
                bVar2.jn(this.bqc);
                a = bVar2.a(this.path, this.version, this.ava, this.dIx, this.timeout, this.retryCount, this.auN);
            } else {
                a = new e(this.auR, null, this.path).jn(this.bqc).a(this.path, this.version, this.ava, this.dIx, this.timeout, this.retryCount, this.auN);
            }
            return a;
        }

        public io.reactivex.p<T> UB() {
            return c.b(new -$$Lambda$xlOf2qziD717RqYQRDzmTnpgj7M(this));
        }

        private void aPL() {
            if (this.ava == null) {
                this.ava = new HashMap();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean aOa() {
        return true;
    }

    public static String aPB() {
        return UUID.randomUUID().toString();
    }

    public b(Class<T> cls, Request request, String str) {
        this.success = false;
        this.responseCode = -100;
        this.dIs = request;
        this.acw = cls;
        this.bgx = str;
    }

    public b(Type type, String str) {
        this(type, null, str);
    }

    public b(Type type, Request request, String str) {
        this.success = false;
        this.responseCode = -100;
        this.dIs = request;
        this.dIv = type;
        this.bgx = str;
    }

    public String aPC() {
        return this.bgx;
    }

    public b<T> jn(@Nullable String str) {
        this.bqc = str;
        return this;
    }

    public b<T> n(@Nullable kotlin.jvm.a.b<? super JsonReader, ? extends T> bVar) {
        this.auS = bVar;
        return this;
    }

    @Nullable
    public String aPD() {
        return this.bqc;
    }

    private t<T> aPE() {
        return com.iqoption.core.c.a.biL.c(new -$$Lambda$b$TfJBKueX6hB_X_t757k8mlpDZOU(this));
    }

    public t<T> aPF() {
        return aPE();
    }

    public t<T> aPG() {
        Request request = this.dIs;
        String httpUrl = (request == null || request.url() == null) ? "null" : this.dIs.url().toString();
        return v.a(new -$$Lambda$b$zbxwqwVovOq8dwMAk0-l6fhoy7s(this), Predicates.pZ(), com.iqoption.core.c.a.biM, 3, -1, httpUrl);
    }

    private /* synthetic */ t aPJ() {
        aa vM = aa.vM();
        WebSocketHandler.aTn().c(com.iqoption.service.websocket.a.b.a(this, vM, 60000));
        return p.a(vM, 60000, TimeUnit.MILLISECONDS, com.iqoption.core.c.a.biM);
    }

    public t<T> b(String str, HashMap<String, Object> hashMap) {
        return a(str, (HashMap) hashMap, 15000);
    }

    public t<T> a(String str, HashMap<String, Object> hashMap, String str2) {
        return a(str, "1.0", hashMap, null, 15000, 3, str2);
    }

    public t<T> a(String str, HashMap<String, Object> hashMap, long j) {
        return a(str, "1.0", hashMap, null, j, 3, null);
    }

    public t<T> a(String str, String str2, HashMap<String, Object> hashMap, JsonObject jsonObject, long j, int i, @Nullable String str3) {
        boolean z = hashMap == null || jsonObject == null;
        i.checkArgument(z);
        aa vM = aa.vM();
        String str4 = "sendMessage";
        if (jsonObject != null) {
            WebSocketHandler.aTn().c(com.iqoption.service.websocket.a.b.a(str4, this, vM, str, jsonObject).jL(str2).jM(str3));
        } else {
            WebSocketHandler.aTn().c(com.iqoption.service.websocket.a.b.a(str4, this, vM, str, (Map) hashMap).jL(str2).jM(str3));
        }
        if (i > 0) {
            return v.a(new -$$Lambda$b$CRd7mROWtiiJ8bBX-O6mH7cd6yQ(vM, j), Predicates.pZ(), com.iqoption.core.c.a.biM, i, -1, str);
        }
        return p.a(vM, j, TimeUnit.MILLISECONDS, com.iqoption.core.c.a.biM);
    }

    public Request aPH() {
        return this.dIs;
    }

    /* Access modifiers changed, original: protected */
    public T iY(String str) {
        if (this.acw != null) {
            return w.aWL().fromJson(str, this.acw);
        }
        if (this.dIv != null) {
            return w.aWL().fromJson(str, this.dIv);
        }
        kotlin.jvm.a.b bVar = this.auS;
        if (bVar != null) {
            return bVar.invoke(new JsonReader(new StringReader(str)));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not parse response of api call ");
        stringBuilder.append(this.bgx);
        throw new RuntimeException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    public Pair<T, String> am(JsonReader jsonReader) {
        if (this.acw != null) {
            return new Pair(w.aWL().fromJson(jsonReader, this.acw), null);
        }
        if (this.dIv != null) {
            return new Pair(w.aWL().fromJson(jsonReader, this.dIv), null);
        }
        kotlin.jvm.a.b bVar = this.auS;
        if (bVar != null) {
            return new Pair(bVar.invoke(jsonReader), null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not parse response of api call ");
        stringBuilder.append(this.bgx);
        throw new RuntimeException(stringBuilder.toString());
    }

    private T ec() {
        return an(null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A:{SYNTHETIC, Splitter:B:23:0x0059} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091 A:{Catch:{ all -> 0x0081 }} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2 A:{Catch:{ all -> 0x0081 }} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af A:{Catch:{ all -> 0x0081 }} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091 A:{Catch:{ all -> 0x0081 }} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2 A:{Catch:{ all -> 0x0081 }} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af A:{Catch:{ all -> 0x0081 }} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091 A:{Catch:{ all -> 0x0081 }} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2 A:{Catch:{ all -> 0x0081 }} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af A:{Catch:{ all -> 0x0081 }} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b6  */
    public final T an(com.google.gson.stream.JsonReader r13) {
        /*
        r12 = this;
        r0 = 0;
        r12.success = r0;
        r1 = 0;
        r12.errorMessage = r1;
        r12.dIt = r1;
        r2 = 1;
        if (r13 == 0) goto L_0x000d;
    L_0x000b:
        r10 = 1;
        goto L_0x000e;
    L_0x000d:
        r10 = 0;
    L_0x000e:
        r3 = "system";
        r4 = "response_error";
        r3 = com.iqoption.dto.Event.Builder(r3, r4);
        r12.dIu = r3;
        if (r10 != 0) goto L_0x0046;
    L_0x001b:
        r3 = r12.dIs;	 Catch:{ Exception -> 0x0042, all -> 0x003e }
        r3 = a(r3);	 Catch:{ Exception -> 0x0042, all -> 0x003e }
        if (r3 == 0) goto L_0x0046;
    L_0x0023:
        r11 = com.google.common.util.concurrent.aa.vM();	 Catch:{ Exception -> 0x0042, all -> 0x003e }
        r3 = com.iqoption.analytics.d.BZ();	 Catch:{ Exception -> 0x0083 }
        r5 = r12.bgx;	 Catch:{ Exception -> 0x0083 }
        r6 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r4 = com.iqoption.service.WebSocketHandler.aTn();	 Catch:{ Exception -> 0x0083 }
        r9 = r4.Xd();	 Catch:{ Exception -> 0x0083 }
        r4 = r11;
        r8 = r10;
        r3.a(r4, r5, r6, r8, r9);	 Catch:{ Exception -> 0x0083 }
        goto L_0x0047;
    L_0x003e:
        r13 = move-exception;
        r11 = r1;
        goto L_0x00c1;
    L_0x0042:
        r13 = move-exception;
        r3 = r1;
        r11 = r3;
        goto L_0x0085;
    L_0x0046:
        r11 = r1;
    L_0x0047:
        if (r10 == 0) goto L_0x0059;
    L_0x0049:
        r13 = r12.am(r13);	 Catch:{ Exception -> 0x0083 }
        r3 = r13.first;	 Catch:{ Exception -> 0x0083 }
        r13 = r13.second;	 Catch:{ Exception -> 0x0057 }
        r13 = (java.lang.String) r13;	 Catch:{ Exception -> 0x0057 }
        r12.dIt = r13;	 Catch:{ Exception -> 0x0057 }
        r13 = r3;
        goto L_0x0071;
    L_0x0057:
        r13 = move-exception;
        goto L_0x0085;
    L_0x0059:
        r13 = com.iqoption.mobbtech.connect.RequestManager.aOR();	 Catch:{ Exception -> 0x0083 }
        r3 = r12.dIs;	 Catch:{ Exception -> 0x0083 }
        r4 = r12.aOa();	 Catch:{ Exception -> 0x0083 }
        r13 = r13.a(r3, r4);	 Catch:{ Exception -> 0x0083 }
        r13 = r12.b(r13);	 Catch:{ Exception -> 0x0083 }
        r12.dIt = r13;	 Catch:{ Exception -> 0x0083 }
        r13 = r12.iY(r13);	 Catch:{ Exception -> 0x0083 }
    L_0x0071:
        if (r13 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x0075;
    L_0x0074:
        r2 = 0;
    L_0x0075:
        r12.success = r2;	 Catch:{ Exception -> 0x007d }
        if (r11 == 0) goto L_0x00ba;
    L_0x0079:
        r11.set(r1);
        goto L_0x00ba;
    L_0x007d:
        r2 = move-exception;
        r3 = r13;
        r13 = r2;
        goto L_0x0085;
    L_0x0081:
        r13 = move-exception;
        goto L_0x00c1;
    L_0x0083:
        r13 = move-exception;
        r3 = r1;
    L_0x0085:
        r2 = r12.responseCode;	 Catch:{ all -> 0x0081 }
        if (r2 >= 0) goto L_0x008f;
    L_0x0089:
        r2 = r13 instanceof java.net.SocketTimeoutException;	 Catch:{ all -> 0x0081 }
        if (r2 == 0) goto L_0x008f;
    L_0x008d:
        r12.responseCode = r0;	 Catch:{ all -> 0x0081 }
    L_0x008f:
        if (r11 == 0) goto L_0x0095;
    L_0x0091:
        r11.setException(r13);	 Catch:{ all -> 0x0081 }
        r11 = r1;
    L_0x0095:
        r12.success = r0;	 Catch:{ all -> 0x0081 }
        r13 = r13.getMessage();	 Catch:{ all -> 0x0081 }
        com.iqoption.util.i.ag(r13);	 Catch:{ all -> 0x0081 }
        r13 = r12.dIs;	 Catch:{ all -> 0x0081 }
        if (r13 == 0) goto L_0x00ab;
    L_0x00a2:
        r13 = r12.dIs;	 Catch:{ all -> 0x0081 }
        r13 = r13.toString();	 Catch:{ all -> 0x0081 }
        com.iqoption.util.i.ag(r13);	 Catch:{ all -> 0x0081 }
    L_0x00ab:
        r13 = r12.dIt;	 Catch:{ all -> 0x0081 }
        if (r13 == 0) goto L_0x00b4;
    L_0x00af:
        r13 = r12.dIt;	 Catch:{ all -> 0x0081 }
        com.iqoption.util.i.ag(r13);	 Catch:{ all -> 0x0081 }
    L_0x00b4:
        if (r11 == 0) goto L_0x00b9;
    L_0x00b6:
        r11.set(r1);
    L_0x00b9:
        r13 = r3;
    L_0x00ba:
        r12.ch(r13);
        r12.aPI();
        return r13;
    L_0x00c1:
        if (r11 == 0) goto L_0x00c6;
    L_0x00c3:
        r11.set(r1);
    L_0x00c6:
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.mobbtech.connect.request.a.a.b.an(com.google.gson.stream.JsonReader):java.lang.Object");
    }

    private static boolean a(Request request) {
        if (request == null) {
            return false;
        }
        String str;
        HttpUrl url = request.url();
        if (url == null) {
            str = "";
        } else {
            str = url.toString();
        }
        return str.contains("api/users-stat") ^ 1;
    }

    /* Access modifiers changed, original: protected */
    public String b(Response response) {
        if (response.isSuccessful()) {
            String string = response.body().string();
            response.close();
            return string;
        }
        this.responseCode = response.code();
        response.close();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected code ");
        stringBuilder.append(response.code());
        stringBuilder.append(" url=");
        Request request = this.dIs;
        stringBuilder.append(request != null ? request.toString() : "");
        stringBuilder.append(", response: ");
        stringBuilder.append(response);
        throw new IOException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    public void ch(T t) {
        if (t == null || !this.success) {
            f fVar = new f(this.dIt);
            fVar.ci(t);
            throw new MobbErrorException(fVar);
        }
    }

    private void aPI() {
        if (!this.success) {
            EventManager BS = EventManager.BS();
            Builder technicalLogs = this.dIu.calcDuration().setTechnicalLogs(Boolean.valueOf(true));
            String str = "\\\"";
            String str2 = "\"";
            com.iqoption.core.util.u.b o = u.anp().o("request", this.dIs.toString().replace(str2, str));
            Object replace = !TextUtils.isEmpty(this.dIt) ? this.dIt.toString().replace(str2, str) : !TextUtils.isEmpty(this.errorMessage) ? this.errorMessage.toString().replace(str2, str) : "";
            BS.a(technicalLogs.setParameters(o.o("responce", replace).anr()).build());
        }
    }

    public static <T> a<T> z(Class<T> cls) {
        return new a(cls);
    }

    public static <T> a<T> c(Class<T> cls, String str) {
        return new a((Class) cls, str);
    }

    public static <T> a<T> a(Type type, String str) {
        return new a(type, str);
    }

    public static <T> a<T> a(kotlin.jvm.a.b<? super JsonReader, ? extends T> bVar, String str) {
        return new a((kotlin.jvm.a.b) bVar, str);
    }

    public static <T> a<T> b(@NonNull Request request, @NonNull Class<T> cls) {
        return new a((Class) cls, request);
    }

    public static <T> b<T> A(Class<T> cls) {
        return new b(cls);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RequestTask{requestBase=");
        stringBuilder.append(this.dIs);
        stringBuilder.append(", type=");
        stringBuilder.append(this.acw);
        stringBuilder.append(", success=");
        stringBuilder.append(this.success);
        stringBuilder.append(", errorJson='");
        stringBuilder.append(this.dIt);
        stringBuilder.append('\'');
        stringBuilder.append(", errorMessage='");
        stringBuilder.append(this.errorMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", responseCode=");
        stringBuilder.append(this.responseCode);
        stringBuilder.append(", mEventError=");
        stringBuilder.append(this.dIu);
        stringBuilder.append(", typeOfT=");
        stringBuilder.append(this.dIv);
        stringBuilder.append(", apiName='");
        stringBuilder.append(this.bgx);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
