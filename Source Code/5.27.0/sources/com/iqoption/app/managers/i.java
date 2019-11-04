package com.iqoption.app.managers;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.connect.e;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B7\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001c"}, bng = {"Lcom/iqoption/app/managers/SubscribeKey;", "Lcom/iqoption/core/connect/Executable;", "builder", "Lcom/iqoption/app/managers/SubscribeKey$Builder;", "(Lcom/iqoption/app/managers/SubscribeKey$Builder;)V", "name", "", "version", "params", "", "", "microService", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getMicroService", "()Ljava/lang/String;", "getName", "Ljava/util/HashMap;", "getParams", "()Ljava/util/HashMap;", "getVersion", "equals", "", "other", "exec", "isSubscribe", "hashCode", "", "Builder", "app_optionXRelease"})
/* compiled from: SubscribeKey.kt */
public final class i implements e {
    private final HashMap<String, Object> ava;
    private final String avb;
    private final String name;
    private final String version;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u001c\u0010\t\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, bng = {"Lcom/iqoption/app/managers/SubscribeKey$Builder;", "", "name", "", "microService", "(Ljava/lang/String;Ljava/lang/String;)V", "getMicroService", "()Ljava/lang/String;", "getName", "params", "Ljava/util/HashMap;", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "version", "getVersion", "setVersion", "(Ljava/lang/String;)V", "build", "Lcom/iqoption/app/managers/SubscribeKey;", "param", "value", "app_optionXRelease"})
    /* compiled from: SubscribeKey.kt */
    public static final class a {
        private HashMap<String, Object> ava;
        private final String avb;
        private final String name;
        private String version;

        public a(String str) {
            this(str, null, 2, null);
        }

        public a(String str, String str2) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            this.name = str;
            this.avb = str2;
            this.version = "1.0";
        }

        public /* synthetic */ a(String str, String str2, int i, f fVar) {
            if ((i & 2) != 0) {
                str2 = (String) null;
            }
            this(str, str2);
        }

        public final String HV() {
            return this.avb;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVersion() {
            return this.version;
        }

        public final HashMap<String, Object> HU() {
            return this.ava;
        }

        public final a ee(String str) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.VALUE);
            this.version = str;
            return this;
        }

        public final a j(String str, Object obj) {
            kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
            if (obj != null) {
                if (this.ava == null) {
                    this.ava = new HashMap();
                }
                HashMap hashMap = this.ava;
                if (hashMap == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                hashMap.put(str, obj);
            } else {
                HashMap hashMap2 = this.ava;
                if (hashMap2 != null) {
                    if (hashMap2 == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    hashMap2.remove(str);
                }
            }
            return this;
        }

        public final a a(HashMap<String, Object> hashMap) {
            this.ava = hashMap;
            return this;
        }

        public final i HW() {
            return new i(this);
        }
    }

    public i(String str, String str2, Map<String, ? extends Object> map, String str3) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, "version");
        this.name = str;
        this.version = str2;
        this.avb = str3;
        if (map != null) {
            this.ava = new HashMap();
            this.ava.putAll(map);
            return;
        }
        this.ava = (HashMap) null;
    }

    public final String HV() {
        return this.avb;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }

    public final HashMap<String, Object> HU() {
        return this.ava;
    }

    public i(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "builder");
        this(aVar.getName(), aVar.getVersion(), aVar.HU(), aVar.HV());
    }

    public boolean by(boolean z) {
        if (z) {
            return j.HX().a(this);
        }
        return j.HX().b(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            i iVar = (i) obj;
            if ((kotlin.jvm.internal.i.y(this.name, iVar.name) ^ 1) == 0 && (kotlin.jvm.internal.i.y(this.version, iVar.version) ^ 1) == 0 && (kotlin.jvm.internal.i.y(this.avb, iVar.avb) ^ 1) == 0 && (kotlin.jvm.internal.i.y(this.ava, iVar.ava) ^ 1) == 0) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.app.managers.SubscribeKey");
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.version.hashCode()) * 31;
        String str = this.avb;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        HashMap hashMap = this.ava;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return hashCode + i;
    }
}
