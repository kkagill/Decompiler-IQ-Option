package com.iqoption.core.microservices.core.register.response;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\u0011HÖ\u0001J\u001e\u0010#\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u00110\u00110\u00102\u0006\u0010%\u001a\u00020&H\u0002R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, bng = {"Lcom/iqoption/core/microservices/core/register/response/RegisterResponse;", "", "()V", "isSuccessful", "", "_message", "Lcom/google/gson/JsonElement;", "result", "", "code", "", "(ZLcom/google/gson/JsonElement;Ljava/lang/Long;I)V", "getCode", "()I", "()Z", "messages", "", "", "getMessages", "()Ljava/util/List;", "messages$delegate", "Lkotlin/Lazy;", "getResult", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(ZLcom/google/gson/JsonElement;Ljava/lang/Long;I)Lcom/iqoption/core/microservices/core/register/response/RegisterResponse;", "equals", "other", "hashCode", "toString", "toStringList", "kotlin.jvm.PlatformType", "jsonArray", "Lcom/google/gson/JsonArray;", "Companion", "core_release"})
/* compiled from: RegisterResponse.kt */
public final class b {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "messages", "getMessages()Ljava/util/List;"))};
    public static final a bsf = new a();
    @SerializedName("isSuccessful")
    private final boolean blS;
    private final d bsc;
    @SerializedName("message")
    private final JsonElement bsd;
    @SerializedName("result")
    private final Long bse;
    @SerializedName("code")
    private final int code;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/core/register/response/RegisterResponse$Companion;", "", "()V", "CODE_ALREADY_REGISTERED", "", "CODE_UNAVAILABLE_FROM_YOUR_COUNTRY", "REGISTRATION_STATUS_USER_IS_NOT_REGISTERED", "REGISTRATION_STATUS_USER_IS_REGISTERED_AND_ACTIVATED", "REGISTRATION_STATUS_USER_IS_REGISTERED_BUT_NOT_ACTIVATED", "REGISTRATION_STATUS_USER_IS_REGISTERED_BUT_NOT_AUTHORIZED", "core_release"})
    /* compiled from: RegisterResponse.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if ((this.blS == bVar.blS ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bsd, bVar.bsd) && kotlin.jvm.internal.i.y(this.bse, bVar.bse)) {
                    if ((this.code == bVar.code ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<String> getMessages() {
        d dVar = this.bsc;
        j jVar = anY[0];
        return (List) dVar.getValue();
    }

    public int hashCode() {
        int i = this.blS;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        JsonElement jsonElement = this.bsd;
        int i2 = 0;
        i = (i + (jsonElement != null ? jsonElement.hashCode() : 0)) * 31;
        Long l = this.bse;
        if (l != null) {
            i2 = l.hashCode();
        }
        return ((i + i2) * 31) + this.code;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RegisterResponse(isSuccessful=");
        stringBuilder.append(this.blS);
        stringBuilder.append(", _message=");
        stringBuilder.append(this.bsd);
        stringBuilder.append(", result=");
        stringBuilder.append(this.bse);
        stringBuilder.append(", code=");
        stringBuilder.append(this.code);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(boolean z, JsonElement jsonElement, Long l, int i) {
        this.blS = z;
        this.bsd = jsonElement;
        this.bse = l;
        this.code = i;
        this.bsc = g.c(new RegisterResponse$messages$2(this));
    }

    public final boolean isSuccessful() {
        return this.blS;
    }

    public /* synthetic */ b(boolean z, JsonElement jsonElement, Long l, int i, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            jsonElement = (JsonElement) null;
        }
        if ((i2 & 4) != 0) {
            l = Long.valueOf(-1);
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        this(z, jsonElement, l, i);
    }

    public final int getCode() {
        return this.code;
    }

    public b() {
        this(false, null, null, 0, 14, null);
    }

    private final List<String> g(JsonArray jsonArray) {
        Iterable<JsonElement> iterable = jsonArray;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (JsonElement jsonElement : iterable) {
            kotlin.jvm.internal.i.e(jsonElement, "it");
            arrayList.add(jsonElement.getAsString());
        }
        return u.T((List) arrayList);
    }
}
