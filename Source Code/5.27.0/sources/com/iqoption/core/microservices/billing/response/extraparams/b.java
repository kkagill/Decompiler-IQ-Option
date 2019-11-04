package com.iqoption.core.microservices.billing.response.extraparams;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamProperty.PropertyType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÂ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\t\u0010\u0014\u001a\u00020\nHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nHÖ\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamIntegerProperty;", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "_title", "", "_hint", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "getHint", "getTitle", "getType", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty$PropertyType;", "getTypeName", "hashCode", "toString", "validationErrorMessage", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "core_release"})
/* compiled from: ExtraParamIntegerProperty.kt */
public final class b implements ExtraParamProperty {
    public static final Creator CREATOR = new b();
    public static final a boq = new a();
    private final String bol;
    private final String bom;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamIntegerProperty$Companion;", "", "()V", "TYPE_NAME", "", "fromJson", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamIntegerProperty;", "jsonObject", "Lcom/google/gson/JsonObject;", "core_release"})
    /* compiled from: ExtraParamIntegerProperty.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b e(JsonObject jsonObject) {
            String str = null;
            if (jsonObject != null) {
                String str2 = "type";
                if (jsonObject.has(str2)) {
                    JsonElement jsonElement = jsonObject.get(str2);
                    kotlin.jvm.internal.i.e(jsonElement, "jsonObject.get(\"type\")");
                    if (kotlin.jvm.internal.i.y("integer", jsonElement.getAsString())) {
                        str2 = PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE;
                        if (jsonObject.has(str2)) {
                            jsonElement = jsonObject.get(str2);
                            kotlin.jvm.internal.i.e(jsonElement, "jsonObject.get(\"title\")");
                            str2 = jsonElement.getAsString();
                        } else {
                            str2 = null;
                        }
                        String str3 = "hint";
                        if (jsonObject.has(str3)) {
                            JsonElement jsonElement2 = jsonObject.get(str3);
                            kotlin.jvm.internal.i.e(jsonElement2, "jsonObject.get(\"hint\")");
                            str = jsonElement2.getAsString();
                        }
                        return new b(str2, str);
                    }
                }
            }
            return null;
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new b(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public String aaL() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bom, r3.bom) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.billing.response.extraparams.b;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.billing.response.extraparams.b) r3;
        r0 = r2.bol;
        r1 = r3.bol;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bom;
        r3 = r3.bom;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.extraparams.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.bol;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bom;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExtraParamIntegerProperty(_title=");
        stringBuilder.append(this.bol);
        stringBuilder.append(", _hint=");
        stringBuilder.append(this.bom);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bol);
        parcel.writeString(this.bom);
    }

    public b(String str, String str2) {
        this.bol = str;
        this.bom = str2;
    }

    public PropertyType aaK() {
        return PropertyType.integerType;
    }

    public String getTitle() {
        return this.bol;
    }

    public String getHint() {
        return this.bom;
    }
}
