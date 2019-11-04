package com.iqoption.core.microservices.billing.verification.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.iqoption.core.d;
import java.lang.reflect.Type;
import kotlin.i;

@JsonAdapter(Deserializer.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult;", "Landroid/os/Parcelable;", "config", "", "(Ljava/lang/String;)V", "getConfig", "()Ljava/lang/String;", "component1", "copy", "decrypt", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitData;", "describeContents", "", "equals", "", "other", "", "hashCode", "parseConfig", "jsonString", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Deserializer", "core_release"})
/* compiled from: VerifyInitResult.kt */
public final class VerifyInitResult implements Parcelable {
    public static final Creator CREATOR = new b();
    private static final String TAG;
    public static final a boX = new a();
    private final String boW;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult$Companion;", "", "()V", "TAG", "", "core_release"})
    /* compiled from: VerifyInitResult.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new VerifyInitResult(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new VerifyInitResult[i];
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult$Deserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "core_release"})
    /* compiled from: VerifyInitResult.kt */
    public static final class Deserializer implements JsonDeserializer<VerifyInitResult> {
        /* renamed from: c */
        public VerifyInitResult deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            kotlin.jvm.internal.i.f(jsonElement, "json");
            kotlin.jvm.internal.i.f(type, "typeOfT");
            kotlin.jvm.internal.i.f(jsonDeserializationContext, "context");
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            if (asJsonArray.size() == 1) {
                jsonElement = asJsonArray.get(0);
                kotlin.jvm.internal.i.e(jsonElement, "array[0]");
                String asString = jsonElement.getAsString();
                kotlin.jvm.internal.i.e(asString, "array[0].asString");
                return new VerifyInitResult(asString);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected array size: ");
            stringBuilder.append(asJsonArray);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.boW, ((com.iqoption.core.microservices.billing.verification.response.VerifyInitResult) r2).boW) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.core.microservices.billing.verification.response.VerifyInitResult;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.core.microservices.billing.verification.response.VerifyInitResult) r2;
        r0 = r1.boW;
        r2 = r2.boW;
        r2 = kotlin.jvm.internal.i.y(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.verification.response.VerifyInitResult.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.boW;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerifyInitResult(config=");
        stringBuilder.append(this.boW);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.boW);
    }

    public VerifyInitResult(String str) {
        kotlin.jvm.internal.i.f(str, "config");
        this.boW = str;
    }

    static {
        String name = VerifyInitResult.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public final e abe() {
        String gk = f.gk(this.boW);
        CharSequence charSequence = gk;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj != null) {
            return null;
        }
        if (gk == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return gj(gk);
    }

    private final e gj(String str) {
        try {
            return (e) d.Ez().fromJson(str, e.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
