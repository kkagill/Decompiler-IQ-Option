package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.aa;
import com.facebook.internal.q;
import com.facebook.internal.s;
import com.facebook.internal.x;
import com.facebook.internal.z;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.dto.Currencies;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GraphRequest */
public class g {
    public static final String TAG = "g";
    private static final String tQ;
    private static String tR;
    private static Pattern tS = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String userAgent;
    private a tT;
    private HttpMethod tU;
    private String tV;
    private JSONObject tW;
    private String tX;
    private String tY;
    private boolean tZ;
    private Object tag;
    private Bundle ua;
    private b ub;
    private String uc;
    private boolean ud;
    private String version;

    /* compiled from: GraphRequest */
    private static class a {
        private final g uk;
        private final Object value;

        public a(g gVar, Object obj) {
            this.uk = gVar;
            this.value = obj;
        }

        public g hw() {
            return this.uk;
        }

        public Object getValue() {
            return this.value;
        }
    }

    /* compiled from: GraphRequest */
    public interface b {
        void a(j jVar);
    }

    /* compiled from: GraphRequest */
    public interface c {
        void a(JSONObject jSONObject, j jVar);
    }

    /* compiled from: GraphRequest */
    private interface d {
        void y(String str, String str2);
    }

    /* compiled from: GraphRequest */
    public static class f<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<f> CREATOR = new Creator<f>() {
            /* renamed from: q */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            /* renamed from: S */
            public f[] newArray(int i) {
                return new f[i];
            }
        };
        private final String mimeType;
        private final RESOURCE ul;

        public int describeContents() {
            return 1;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public RESOURCE hx() {
            return this.ul;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mimeType);
            parcel.writeParcelable(this.ul, i);
        }

        public f(RESOURCE resource, String str) {
            this.mimeType = str;
            this.ul = resource;
        }

        private f(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.ul = parcel.readParcelable(f.getApplicationContext().getClassLoader());
        }
    }

    /* compiled from: GraphRequest */
    public interface e extends b {
        void b(long j, long j2);
    }

    /* compiled from: GraphRequest */
    private static class g implements d {
        private final OutputStream outputStream;
        private final s um;
        private boolean un = true;
        private boolean uo = false;

        public g(OutputStream outputStream, s sVar, boolean z) {
            this.outputStream = outputStream;
            this.um = sVar;
            this.uo = z;
        }

        public void a(String str, Object obj, g gVar) {
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof q) {
                ((q) outputStream).d(gVar);
            }
            if (g.V(obj)) {
                y(str, g.W(obj));
            } else if (obj instanceof Bitmap) {
                b(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                b(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                a(str, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                a(str, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof f) {
                f fVar = (f) obj;
                Parcelable hx = fVar.hx();
                String mimeType = fVar.getMimeType();
                if (hx instanceof ParcelFileDescriptor) {
                    a(str, (ParcelFileDescriptor) hx, mimeType);
                } else if (hx instanceof Uri) {
                    a(str, (Uri) hx, mimeType);
                } else {
                    throw hy();
                }
            } else {
                throw hy();
            }
        }

        private RuntimeException hy() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public void a(String str, JSONArray jSONArray, Collection<g> collection) {
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof q) {
                q qVar = (q) outputStream;
                b(str, null, null);
                a("[", new Object[0]);
                int i = 0;
                for (g gVar : collection) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    qVar.d(gVar);
                    if (i > 0) {
                        a(",%s", jSONObject.toString());
                    } else {
                        a(Currencies.REPLACE_CURRENCY_MASK, jSONObject.toString());
                    }
                    i++;
                }
                a("]", new Object[0]);
                s sVar = this.um;
                if (sVar != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("    ");
                    stringBuilder.append(str);
                    sVar.a(stringBuilder.toString(), jSONArray.toString());
                }
                return;
            }
            y(str, jSONArray.toString());
        }

        public void y(String str, String str2) {
            b(str, null, null);
            b(Currencies.REPLACE_CURRENCY_MASK, str2);
            hz();
            s sVar = this.um;
            if (sVar != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("    ");
                stringBuilder.append(str);
                sVar.a(stringBuilder.toString(), str2);
            }
        }

        public void b(String str, Bitmap bitmap) {
            b(str, str, "image/png");
            bitmap.compress(CompressFormat.PNG, 100, this.outputStream);
            b("", new Object[0]);
            hz();
            s sVar = this.um;
            if (sVar != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("    ");
                stringBuilder.append(str);
                sVar.a(stringBuilder.toString(), "<Image>");
            }
        }

        public void b(String str, byte[] bArr) {
            b(str, str, "content/unknown");
            this.outputStream.write(bArr);
            b("", new Object[0]);
            hz();
            s sVar = this.um;
            if (sVar != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("    ");
                stringBuilder.append(str);
                sVar.a(stringBuilder.toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        public void a(String str, Uri uri, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            b(str, str, str2);
            if (this.outputStream instanceof o) {
                ((o) this.outputStream).o(z.i(uri));
                i = 0;
            } else {
                i = z.a(f.getApplicationContext().getContentResolver().openInputStream(uri), this.outputStream) + 0;
            }
            b("", new Object[0]);
            hz();
            s sVar = this.um;
            if (sVar != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("    ");
                stringBuilder.append(str);
                sVar.a(stringBuilder.toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        public void a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            b(str, str, str2);
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof o) {
                ((o) outputStream).o(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = z.a(new AutoCloseInputStream(parcelFileDescriptor), this.outputStream) + 0;
            }
            b("", new Object[0]);
            hz();
            s sVar = this.um;
            if (sVar != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("    ");
                stringBuilder.append(str);
                sVar.a(stringBuilder.toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        public void hz() {
            if (this.uo) {
                this.outputStream.write("&".getBytes());
                return;
            }
            b("--%s", g.tQ);
        }

        public void b(String str, String str2, String str3) {
            if (this.uo) {
                this.outputStream.write(String.format("%s=", new Object[]{str}).getBytes());
                return;
            }
            a("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                a("; filename=\"%s\"", str2);
            }
            str2 = "";
            b(str2, new Object[0]);
            if (str3 != null) {
                b("%s: %s", "Content-Type", str3);
            }
            b(str2, new Object[0]);
        }

        public void a(String str, Object... objArr) {
            if (this.uo) {
                this.outputStream.write(URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8").getBytes());
                return;
            }
            if (this.un) {
                this.outputStream.write("--".getBytes());
                this.outputStream.write(g.tQ.getBytes());
                this.outputStream.write("\r\n".getBytes());
                this.un = false;
            }
            this.outputStream.write(String.format(str, objArr).getBytes());
        }

        public void b(String str, Object... objArr) {
            a(str, objArr);
            if (!this.uo) {
                a("\r\n", new Object[0]);
            }
        }
    }

    static {
        char[] toCharArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            stringBuilder.append(toCharArray[secureRandom.nextInt(toCharArray.length)]);
        }
        tQ = stringBuilder.toString();
    }

    public g() {
        this(null, null, null, null, null);
    }

    public g(a aVar, String str, Bundle bundle, HttpMethod httpMethod, b bVar) {
        this(aVar, str, bundle, httpMethod, bVar, null);
    }

    public g(a aVar, String str, Bundle bundle, HttpMethod httpMethod, b bVar, String str2) {
        this.tZ = true;
        this.ud = false;
        this.tT = aVar;
        this.tV = str;
        this.version = str2;
        a(bVar);
        a(httpMethod);
        if (bundle != null) {
            this.ua = new Bundle(bundle);
        } else {
            this.ua = new Bundle();
        }
        if (this.version == null) {
            this.version = f.gU();
        }
    }

    public static g a(a aVar, final c cVar) {
        return new g(aVar, "me", null, null, new b() {
            public void a(j jVar) {
                c cVar = cVar;
                if (cVar != null) {
                    cVar.a(jVar.hH(), jVar);
                }
            }
        });
    }

    public static g a(a aVar, String str, JSONObject jSONObject, b bVar) {
        g gVar = new g(aVar, str, null, HttpMethod.POST, bVar);
        gVar.d(jSONObject);
        return gVar;
    }

    public static g a(a aVar, String str, b bVar) {
        return new g(aVar, str, null, null, bVar);
    }

    public final JSONObject hi() {
        return this.tW;
    }

    public final void d(JSONObject jSONObject) {
        this.tW = jSONObject;
    }

    public final String hj() {
        return this.tV;
    }

    public final HttpMethod hk() {
        return this.tU;
    }

    public final void a(HttpMethod httpMethod) {
        if (this.uc == null || httpMethod == HttpMethod.GET) {
            if (httpMethod == null) {
                httpMethod = HttpMethod.GET;
            }
            this.tU = httpMethod;
            return;
        }
        throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }

    public final String getVersion() {
        return this.version;
    }

    public final void C(boolean z) {
        this.ud = z;
    }

    public final Bundle getParameters() {
        return this.ua;
    }

    public final void setParameters(Bundle bundle) {
        this.ua = bundle;
    }

    public final a hl() {
        return this.tT;
    }

    public final b hm() {
        return this.ub;
    }

    public final void a(final b bVar) {
        if (f.a(LoggingBehavior.GRAPH_API_DEBUG_INFO) || f.a(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.ub = new b() {
                public void a(j jVar) {
                    JSONObject hH = jVar.hH();
                    hH = hH != null ? hH.optJSONObject("__debug__") : null;
                    JSONArray optJSONArray = hH != null ? hH.optJSONArray("messages") : null;
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            String optString = optJSONObject != null ? optJSONObject.optString("message") : null;
                            String optString2 = optJSONObject != null ? optJSONObject.optString("type") : null;
                            String optString3 = optJSONObject != null ? optJSONObject.optString("link") : null;
                            if (!(optString == null || optString2 == null)) {
                                LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                                if (optString2.equals("warning")) {
                                    loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                                }
                                if (!z.aB(optString3)) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(optString);
                                    stringBuilder.append(" Link: ");
                                    stringBuilder.append(optString3);
                                    optString = stringBuilder.toString();
                                }
                                s.a(loggingBehavior, g.TAG, optString);
                            }
                        }
                    }
                    b bVar = bVar;
                    if (bVar != null) {
                        bVar.a(jVar);
                    }
                }
            };
        } else {
            this.ub = bVar;
        }
    }

    public final void setTag(Object obj) {
        this.tag = obj;
    }

    public final Object getTag() {
        return this.tag;
    }

    public final j hn() {
        return a(this);
    }

    public final h ho() {
        return b(this);
    }

    public static HttpURLConnection b(i iVar) {
        g(iVar);
        try {
            URL url;
            if (iVar.size() == 1) {
                url = new URL(iVar.get(0).hr());
            } else {
                url = new URL(x.kI());
            }
            URLConnection uRLConnection = null;
            try {
                uRLConnection = a(url);
                a(iVar, (HttpURLConnection) uRLConnection);
                return uRLConnection;
            } catch (IOException | JSONException e) {
                z.a(uRLConnection);
                throw new FacebookException("could not construct request body", e);
            }
        } catch (MalformedURLException e2) {
            throw new FacebookException("could not construct URL for request", e2);
        }
    }

    public static j a(g gVar) {
        List a = a(gVar);
        if (a != null && a.size() == 1) {
            return (j) a.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public static List<j> a(g... gVarArr) {
        aa.b((Object) gVarArr, "requests");
        return a(Arrays.asList(gVarArr));
    }

    public static List<j> a(Collection<g> collection) {
        return c(new i((Collection) collection));
    }

    public static List<j> c(i iVar) {
        aa.c(iVar, "requests");
        URLConnection uRLConnection = null;
        try {
            uRLConnection = b(iVar);
            List<j> iVar2 = a((HttpURLConnection) uRLConnection, iVar2);
            return iVar2;
        } catch (Exception e) {
            Throwable e2 = e;
            List<j> a = j.a(iVar2.hB(), (HttpURLConnection) uRLConnection, new FacebookException(e2));
            a(iVar2, (List) a);
            return a;
        } finally {
            z.a(uRLConnection);
        }
    }

    public static h b(g... gVarArr) {
        aa.b((Object) gVarArr, "requests");
        return b(Arrays.asList(gVarArr));
    }

    public static h b(Collection<g> collection) {
        return d(new i((Collection) collection));
    }

    public static h d(i iVar) {
        aa.c(iVar, "requests");
        h hVar = new h(iVar);
        hVar.executeOnExecutor(f.getExecutor(), new Void[0]);
        return hVar;
    }

    public static List<j> a(HttpURLConnection httpURLConnection, i iVar) {
        List b = j.b(httpURLConnection, iVar);
        z.a(httpURLConnection);
        if (iVar.size() == b.size()) {
            a(iVar, b);
            c.gz().gD();
            return b;
        }
        throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(b.size()), Integer.valueOf(r4)}));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{Request: ");
        stringBuilder.append(" accessToken: ");
        Object obj = this.tT;
        if (obj == null) {
            obj = "null";
        }
        stringBuilder.append(obj);
        stringBuilder.append(", graphPath: ");
        stringBuilder.append(this.tV);
        stringBuilder.append(", graphObject: ");
        stringBuilder.append(this.tW);
        stringBuilder.append(", httpMethod: ");
        stringBuilder.append(this.tU);
        stringBuilder.append(", parameters: ");
        stringBuilder.append(this.ua);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static void a(final i iVar, List<j> list) {
        int size = iVar.size();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            b bVar = iVar.get(i).ub;
            if (bVar != null) {
                arrayList.add(new Pair(bVar, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            AnonymousClass3 anonymousClass3 = new Runnable() {
                public void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((b) pair.first).a((j) pair.second);
                    }
                    for (com.facebook.i.a a : iVar.u()) {
                        a.a(iVar);
                    }
                }
            };
            Handler hA = iVar.hA();
            if (hA == null) {
                anonymousClass3.run();
            } else {
                hA.post(anonymousClass3);
            }
        }
    }

    private static HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", hu());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    private void hp() {
        String str = "access_token";
        String token;
        if (this.tT != null) {
            if (!this.ua.containsKey(str)) {
                token = this.tT.getToken();
                s.bk(token);
                this.ua.putString(str, token);
            }
        } else if (!(this.ud || this.ua.containsKey(str))) {
            token = f.go();
            String gX = f.gX();
            if (z.aB(token) || z.aB(gX)) {
                z.G(TAG, "Warning: Request without access token missing application ID or client token.");
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(token);
                stringBuilder.append("|");
                stringBuilder.append(gX);
                this.ua.putString(str, stringBuilder.toString());
            }
        }
        this.ua.putString("sdk", "android");
        this.ua.putString("format", "json");
        str = "debug";
        if (f.a(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            this.ua.putString(str, "info");
        } else if (f.a(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.ua.putString(str, "warning");
        }
    }

    private String a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.tU == HttpMethod.POST) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.ua.keySet()) {
            Object obj = this.ua.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (V(obj)) {
                buildUpon.appendQueryParameter(str2, W(obj).toString());
            } else if (this.tU == HttpMethod.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* Access modifiers changed, original: final */
    public final String hq() {
        if (this.uc == null) {
            String format = String.format("%s/%s", new Object[]{x.kI(), hs()});
            hp();
            Uri parse = Uri.parse(a(format, Boolean.valueOf(true)));
            return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    /* Access modifiers changed, original: final */
    public final String hr() {
        String str = this.uc;
        if (str != null) {
            return str.toString();
        }
        if (hk() == HttpMethod.POST) {
            str = this.tV;
            if (str != null && str.endsWith("/videos")) {
                str = x.kJ();
                str = String.format("%s/%s", new Object[]{str, hs()});
                hp();
                return a(str, Boolean.valueOf(false));
            }
        }
        str = x.kI();
        str = String.format("%s/%s", new Object[]{str, hs()});
        hp();
        return a(str, Boolean.valueOf(false));
    }

    private String hs() {
        if (tS.matcher(this.tV).matches()) {
            return this.tV;
        }
        return String.format("%s/%s", new Object[]{this.version, this.tV});
    }

    private void a(JSONArray jSONArray, Map<String, a> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.tX;
        if (str != null) {
            jSONObject.put(ConditionalUserProperty.NAME, str);
            jSONObject.put("omit_response_on_success", this.tZ);
        }
        str = this.tY;
        if (str != null) {
            jSONObject.put("depends_on", str);
        }
        str = hq();
        jSONObject.put("relative_url", str);
        jSONObject.put("method", this.tU);
        a aVar = this.tT;
        if (aVar != null) {
            s.bk(aVar.getToken());
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.ua.keySet()) {
            Object obj = this.ua.get(str2);
            if (U(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.tW != null) {
            final ArrayList arrayList2 = new ArrayList();
            a(this.tW, str, new d() {
                public void y(String str, String str2) {
                    arrayList2.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private static boolean e(i iVar) {
        for (com.facebook.i.a aVar : iVar.u()) {
            if (aVar instanceof com.facebook.i.b) {
                return true;
            }
        }
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            if (((g) it.next()).hm() instanceof e) {
                return true;
            }
        }
        return false;
    }

    private static void a(HttpURLConnection httpURLConnection, boolean z) {
        String str = "Content-Type";
        if (z) {
            httpURLConnection.setRequestProperty(str, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        }
        httpURLConnection.setRequestProperty(str, ht());
    }

    private static boolean f(i iVar) {
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            for (String str : gVar.ua.keySet()) {
                if (U(gVar.ua.get(str))) {
                    return false;
                }
            }
        }
        return true;
    }

    static final boolean b(g gVar) {
        String version = gVar.getVersion();
        boolean z = true;
        if (z.aB(version)) {
            return true;
        }
        if (version.startsWith("v")) {
            version = version.substring(1);
        }
        String[] split = version.split("\\.");
        if ((split.length < 2 || Integer.parseInt(split[0]) <= 2) && (Integer.parseInt(split[0]) < 2 || Integer.parseInt(split[1]) < 4)) {
            z = false;
        }
        return z;
    }

    static final void g(i iVar) {
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (HttpMethod.GET.equals(gVar.hk()) && b(gVar)) {
                Bundle parameters = gVar.getParameters();
                String str = "fields";
                if (!parameters.containsKey(str) || z.aB(parameters.getString(str))) {
                    s.a(LoggingBehavior.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", gVar.hj());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    static final void a(com.facebook.i r13, java.net.HttpURLConnection r14) {
        /*
        r6 = new com.facebook.internal.s;
        r0 = com.facebook.LoggingBehavior.REQUESTS;
        r1 = "Request";
        r6.<init>(r0, r1);
        r2 = r13.size();
        r5 = f(r13);
        r0 = 0;
        r1 = 1;
        if (r2 != r1) goto L_0x001c;
    L_0x0015:
        r3 = r13.get(r0);
        r3 = r3.tU;
        goto L_0x001e;
    L_0x001c:
        r3 = com.facebook.HttpMethod.POST;
    L_0x001e:
        r4 = r3.name();
        r14.setRequestMethod(r4);
        a(r14, r5);
        r4 = r14.getURL();
        r7 = "Request:\n";
        r6.append(r7);
        r7 = r13.getId();
        r8 = "Id";
        r6.a(r8, r7);
        r7 = "URL";
        r6.a(r7, r4);
        r7 = r14.getRequestMethod();
        r8 = "Method";
        r6.a(r8, r7);
        r7 = "User-Agent";
        r8 = r14.getRequestProperty(r7);
        r6.a(r7, r8);
        r7 = "Content-Type";
        r8 = r14.getRequestProperty(r7);
        r6.a(r7, r8);
        r7 = r13.getTimeout();
        r14.setConnectTimeout(r7);
        r7 = r13.getTimeout();
        r14.setReadTimeout(r7);
        r7 = com.facebook.HttpMethod.POST;
        if (r3 != r7) goto L_0x006d;
    L_0x006c:
        r0 = 1;
    L_0x006d:
        if (r0 != 0) goto L_0x0073;
    L_0x006f:
        r6.log();
        return;
    L_0x0073:
        r14.setDoOutput(r1);
        r0 = 0;
        r1 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x00c6 }
        r14 = r14.getOutputStream();	 Catch:{ all -> 0x00c6 }
        r1.<init>(r14);	 Catch:{ all -> 0x00c6 }
        if (r5 == 0) goto L_0x008b;
    L_0x0082:
        r14 = new java.util.zip.GZIPOutputStream;	 Catch:{ all -> 0x0088 }
        r14.<init>(r1);	 Catch:{ all -> 0x0088 }
        goto L_0x008c;
    L_0x0088:
        r13 = move-exception;
        r14 = r1;
        goto L_0x00c8;
    L_0x008b:
        r14 = r1;
    L_0x008c:
        r0 = e(r13);	 Catch:{ all -> 0x00c4 }
        if (r0 == 0) goto L_0x00b6;
    L_0x0092:
        r0 = new com.facebook.o;	 Catch:{ all -> 0x00c4 }
        r1 = r13.hA();	 Catch:{ all -> 0x00c4 }
        r0.<init>(r1);	 Catch:{ all -> 0x00c4 }
        r8 = 0;
        r7 = r13;
        r9 = r2;
        r10 = r4;
        r11 = r0;
        r12 = r5;
        a(r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x00c4 }
        r1 = r0.hP();	 Catch:{ all -> 0x00c4 }
        r10 = r0.hQ();	 Catch:{ all -> 0x00c4 }
        r0 = new com.facebook.p;	 Catch:{ all -> 0x00c4 }
        r11 = (long) r1;	 Catch:{ all -> 0x00c4 }
        r7 = r0;
        r8 = r14;
        r9 = r13;
        r7.<init>(r8, r9, r10, r11);	 Catch:{ all -> 0x00c4 }
        r14 = r0;
    L_0x00b6:
        r0 = r13;
        r1 = r6;
        r3 = r4;
        r4 = r14;
        a(r0, r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00c4 }
        r14.close();
        r6.log();
        return;
    L_0x00c4:
        r13 = move-exception;
        goto L_0x00c8;
    L_0x00c6:
        r13 = move-exception;
        r14 = r0;
    L_0x00c8:
        if (r14 == 0) goto L_0x00cd;
    L_0x00ca:
        r14.close();
    L_0x00cd:
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.g.a(com.facebook.i, java.net.HttpURLConnection):void");
    }

    private static void a(i iVar, s sVar, int i, URL url, OutputStream outputStream, boolean z) {
        g gVar = new g(outputStream, sVar, z);
        String str = "  Attachments:\n";
        Map hashMap;
        if (i == 1) {
            g T = iVar.get(0);
            hashMap = new HashMap();
            for (String str2 : T.ua.keySet()) {
                Object obj = T.ua.get(str2);
                if (U(obj)) {
                    hashMap.put(str2, new a(T, obj));
                }
            }
            if (sVar != null) {
                sVar.append("  Parameters:\n");
            }
            a(T.ua, gVar, T);
            if (sVar != null) {
                sVar.append(str);
            }
            a(hashMap, gVar);
            JSONObject jSONObject = T.tW;
            if (jSONObject != null) {
                a(jSONObject, url.getPath(), (d) gVar);
                return;
            }
            return;
        }
        String h = h(iVar);
        if (z.aB(h)) {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        gVar.y("batch_app_id", h);
        hashMap = new HashMap();
        a(gVar, (Collection) iVar, hashMap);
        if (sVar != null) {
            sVar.append(str);
        }
        a(hashMap, gVar);
    }

    private static boolean aL(String str) {
        Matcher matcher = tS.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        if (str.startsWith("me/") || str.startsWith("/me/")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    private static void a(org.json.JSONObject r6, java.lang.String r7, com.facebook.g.d r8) {
        /*
        r0 = aL(r7);
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x001e;
    L_0x0008:
        r0 = ":";
        r0 = r7.indexOf(r0);
        r3 = "?";
        r7 = r7.indexOf(r3);
        r3 = 3;
        if (r0 <= r3) goto L_0x001e;
    L_0x0017:
        r3 = -1;
        if (r7 == r3) goto L_0x001c;
    L_0x001a:
        if (r0 >= r7) goto L_0x001e;
    L_0x001c:
        r7 = 1;
        goto L_0x001f;
    L_0x001e:
        r7 = 0;
    L_0x001f:
        r0 = r6.keys();
    L_0x0023:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x0044;
    L_0x0029:
        r3 = r0.next();
        r3 = (java.lang.String) r3;
        r4 = r6.opt(r3);
        if (r7 == 0) goto L_0x003f;
    L_0x0035:
        r5 = "image";
        r5 = r3.equalsIgnoreCase(r5);
        if (r5 == 0) goto L_0x003f;
    L_0x003d:
        r5 = 1;
        goto L_0x0040;
    L_0x003f:
        r5 = 0;
    L_0x0040:
        a(r3, r4, r8, r5);
        goto L_0x0023;
    L_0x0044:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.g.a(org.json.JSONObject, java.lang.String, com.facebook.g$d):void");
    }

    private static void a(String str, Object obj, d dVar, boolean z) {
        Class cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    Object[] objArr = new Object[]{str, (String) keys.next()};
                    a(String.format("%s[%s]", objArr), jSONObject.opt((String) keys.next()), dVar, z);
                }
                return;
            }
            String str2 = "id";
            if (jSONObject.has(str2)) {
                a(str, jSONObject.optString(str2), dVar, z);
                return;
            }
            str2 = "url";
            if (jSONObject.has(str2)) {
                a(str, jSONObject.optString(str2), dVar, z);
            } else if (jSONObject.has("fbsdk:create_object")) {
                a(str, jSONObject.toString(), dVar, z);
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                a(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), dVar, z);
            }
        } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            dVar.y(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            dVar.y(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    private static void a(Bundle bundle, g gVar, g gVar2) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (V(obj)) {
                gVar.a(str, obj, gVar2);
            }
        }
    }

    private static void a(Map<String, a> map, g gVar) {
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            if (U(aVar.getValue())) {
                gVar.a(str, aVar.getValue(), aVar.hw());
            }
        }
    }

    private static void a(g gVar, Collection<g> collection, Map<String, a> map) {
        JSONArray jSONArray = new JSONArray();
        for (g a : collection) {
            a.a(jSONArray, (Map) map);
        }
        gVar.a("batch", jSONArray, (Collection) collection);
    }

    private static String ht() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{tQ});
    }

    private static String hu() {
        if (userAgent == null) {
            userAgent = String.format("%s.%s", new Object[]{"FBAndroidSDK", "5.0.1"});
            if (!z.aB(q.kr())) {
                userAgent = String.format(Locale.ROOT, "%s/%s", new Object[]{userAgent, r1});
            }
        }
        return userAgent;
    }

    private static String h(i iVar) {
        if (!z.aB(iVar.hC())) {
            return iVar.hC();
        }
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            a aVar = ((g) it.next()).tT;
            if (aVar != null) {
                String go = aVar.go();
                if (go != null) {
                    return go;
                }
            }
        }
        if (z.aB(tR)) {
            return f.go();
        }
        return tR;
    }

    private static boolean U(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof f);
    }

    private static boolean V(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    private static String W(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }
}
