package com.iqoption.core.microservices.features.a;

import androidx.core.app.NotificationCompat;
import androidx.core.util.Pools.SynchronizedPool;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.ab;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 (2\u00020\u0001:\u0003()*B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bBC\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JG\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, bng = {"Lcom/iqoption/core/microservices/features/response/Feature;", "", "()V", "name", "", "status", "version", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "id", "", "category", "params", "Lcom/google/gson/JsonElement;", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/google/gson/JsonElement;)V", "getCategory", "()Ljava/lang/String;", "getId", "()J", "isDisabled", "", "()Z", "isEnabled", "getName", "getParams", "()Lcom/google/gson/JsonElement;", "getStatus", "getVersion", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "Key", "Response", "core_release"})
/* compiled from: Feature.kt */
public final class a {
    private static final SynchronizedPool<b> btb = new SynchronizedPool(50);
    public static final a btc = new a();
    @SerializedName("params")
    private final JsonElement bta;
    @SerializedName("category")
    private final String category;
    @SerializedName("id")
    private final long id;
    @SerializedName("name")
    private final String name;
    @SerializedName("status")
    private final String status;
    @SerializedName("version")
    private final int version;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/microservices/features/response/Feature$Companion;", "", "()V", "DEFAULT_VERSION", "", "STATUS_DISABLED", "", "STATUS_ENABLED", "keysPool", "Landroidx/core/util/Pools$SynchronizedPool;", "Lcom/iqoption/core/microservices/features/response/Feature$Key;", "obtainKey", "name", "version", "core_release"})
    /* compiled from: Feature.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b D(String str, int i) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            b bVar = (b) a.btb.acquire();
            if (bVar == null) {
                bVar = new b(null, 0, 3, null);
            }
            bVar.setName(str);
            bVar.setVersion(i);
            kotlin.jvm.internal.i.e(bVar, "(keysPool.acquire() ?: K…n = version\n            }");
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/features/response/Feature$Key;", "Lcom/iqoption/core/util/Recyclable;", "name", "", "version", "", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getVersion", "()I", "setVersion", "(I)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "recycle", "", "toString", "core_release"})
    /* compiled from: Feature.kt */
    public static final class b implements ab {
        private String name;
        private int version;

        public b() {
            this(null, 0, 3, null);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (kotlin.jvm.internal.i.y(this.name, bVar.name)) {
                        if ((this.version == bVar.version ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.name;
            return ((str != null ? str.hashCode() : 0) * 31) + this.version;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Key(name=");
            stringBuilder.append(this.name);
            stringBuilder.append(", version=");
            stringBuilder.append(this.version);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(String str, int i) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            this.name = str;
            this.version = i;
        }

        public final void setName(String str) {
            kotlin.jvm.internal.i.f(str, "<set-?>");
            this.name = str;
        }

        public /* synthetic */ b(String str, int i, int i2, f fVar) {
            if ((i2 & 1) != 0) {
                str = "";
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            this(str, i);
        }

        public final void setVersion(int i) {
            this.version = i;
        }

        public void recycle() {
            a.btb.release(this);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/microservices/features/response/Feature$Response;", "", "()V", "identity", "", "features", "", "Lcom/iqoption/core/microservices/features/response/Feature;", "(Ljava/lang/String;[Lcom/iqoption/core/microservices/features/response/Feature;)V", "getFeatures", "()[Lcom/iqoption/core/microservices/features/response/Feature;", "[Lcom/iqoption/core/microservices/features/response/Feature;", "getIdentity", "()Ljava/lang/String;", "core_release"})
    /* compiled from: Feature.kt */
    public static final class c {
        @SerializedName("identity")
        private final String bkO;
        @SerializedName("features")
        private final a[] btd;

        public c(String str, a[] aVarArr) {
            kotlin.jvm.internal.i.f(str, "identity");
            kotlin.jvm.internal.i.f(aVarArr, "features");
            this.bkO = str;
            this.btd = aVarArr;
        }

        public final String getIdentity() {
            return this.bkO;
        }

        public final a[] adA() {
            return this.btd;
        }

        public c() {
            this("", null, 2, null);
        }

        public /* synthetic */ c(String str, a[] aVarArr, int i, f fVar) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                aVarArr = new a[0];
            }
            this(str, aVarArr);
        }
    }

    public static final b D(String str, int i) {
        return btc.D(str, i);
    }

    public static /* synthetic */ a a(a aVar, long j, String str, String str2, int i, String str3, JsonElement jsonElement, int i2, Object obj) {
        a aVar2 = aVar;
        return aVar.a((i2 & 1) != 0 ? aVar2.id : j, (i2 & 2) != 0 ? aVar2.name : str, (i2 & 4) != 0 ? aVar2.status : str2, (i2 & 8) != 0 ? aVar2.version : i, (i2 & 16) != 0 ? aVar2.category : str3, (i2 & 32) != 0 ? aVar2.bta : jsonElement);
    }

    public final a a(long j, String str, String str2, int i, String str3, JsonElement jsonElement) {
        String str4 = str;
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        String str5 = str2;
        kotlin.jvm.internal.i.f(str2, NotificationCompat.CATEGORY_STATUS);
        JsonElement jsonElement2 = jsonElement;
        kotlin.jvm.internal.i.f(jsonElement2, "params");
        return new a(j, str4, str5, i, str3, jsonElement2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.id == aVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.name, aVar.name) && kotlin.jvm.internal.i.y(this.status, aVar.status)) {
                    if (!((this.version == aVar.version ? 1 : null) != null && kotlin.jvm.internal.i.y(this.category, aVar.category) && kotlin.jvm.internal.i.y(this.bta, aVar.bta))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.status;
        i = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.version) * 31;
        str = this.category;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        JsonElement jsonElement = this.bta;
        if (jsonElement != null) {
            i2 = jsonElement.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Feature(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", version=");
        stringBuilder.append(this.version);
        stringBuilder.append(", category=");
        stringBuilder.append(this.category);
        stringBuilder.append(", params=");
        stringBuilder.append(this.bta);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(long j, String str, String str2, int i, String str3, JsonElement jsonElement) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.i.f(jsonElement, "params");
        this.id = j;
        this.name = str;
        this.status = str2;
        this.version = i;
        this.category = str3;
        this.bta = jsonElement;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ a(long j, String str, String str2, int i, String str3, JsonElement jsonElement, int i2, f fVar) {
        JsonElement jsonElement2;
        long j2 = (i2 & 1) != 0 ? -1 : j;
        String str4 = (i2 & 2) != 0 ? "" : str;
        String str5 = (i2 & 4) != 0 ? "disabled" : str2;
        int i3 = (i2 & 8) != 0 ? 1 : i;
        String str6 = (i2 & 16) != 0 ? (String) null : str3;
        if ((i2 & 32) != 0) {
            JsonNull jsonNull = JsonNull.INSTANCE;
            kotlin.jvm.internal.i.e(jsonNull, "JsonNull.INSTANCE");
            jsonElement2 = jsonNull;
        } else {
            jsonElement2 = jsonElement;
        }
        this(j2, str4, str5, i3, str6, jsonElement2);
    }

    public final JsonElement ady() {
        return this.bta;
    }

    public final boolean isEnabled() {
        return kotlin.jvm.internal.i.y(this.status, "disabled") ^ 1;
    }

    public final boolean ZY() {
        return kotlin.jvm.internal.i.y(this.status, "disabled");
    }

    public a() {
        this(-1, null, null, 0, null, null, 62, null);
    }

    public a(String str, String str2, int i) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, NotificationCompat.CATEGORY_STATUS);
        this(-1, str, str2, i, null, null, 48, null);
    }
}
