package com.iqoption.core.microservices.billing.response.extraparams;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamProperty.PropertyType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 +2\u00020\u0001:\u0001+BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\fJV\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0003H\u0016J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\n\u0010%\u001a\u0004\u0018\u00010\u0003H\u0016J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\tHÖ\u0001R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006,"}, bng = {"Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamStringProperty;", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "_title", "", "placeholder", "pattern", "_validationErrorMessage", "_hint", "maxLength", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPattern", "()Ljava/lang/String;", "getPlaceholder", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamStringProperty;", "describeContents", "equals", "", "other", "", "getHint", "getTitle", "getType", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty$PropertyType;", "getTypeName", "hashCode", "toString", "validationErrorMessage", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "core_release"})
/* compiled from: ExtraParamStringProperty.kt */
public final class d implements ExtraParamProperty {
    public static final Creator CREATOR = new b();
    public static final a box = new a();
    private final String bol;
    private final String bom;
    private final String bou;
    private final String bov;
    private final Integer bow;
    private final String pattern;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamStringProperty$Companion;", "", "()V", "TYPE_NAME", "", "fromJson", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamStringProperty;", "jsonObject", "Lcom/google/gson/JsonObject;", "core_release"})
    /* compiled from: ExtraParamStringProperty.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d f(JsonObject jsonObject) {
            String str = "maxLength";
            d dVar = null;
            if (jsonObject != null) {
                String str2 = "type";
                if (jsonObject.has(str2)) {
                    JsonElement jsonElement = jsonObject.get(str2);
                    kotlin.jvm.internal.i.e(jsonElement, "jsonObject.get(\"type\")");
                    if (kotlin.jvm.internal.i.y("string", jsonElement.getAsString())) {
                        String asString;
                        String asString2;
                        String asString3;
                        String asString4;
                        String asString5;
                        Integer num;
                        str2 = PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE;
                        if (jsonObject.has(str2)) {
                            jsonElement = jsonObject.get(str2);
                            kotlin.jvm.internal.i.e(jsonElement, "jsonObject.get(\"title\")");
                            asString = jsonElement.getAsString();
                        } else {
                            asString = null;
                        }
                        str2 = "placeholder";
                        if (jsonObject.has(str2)) {
                            jsonElement = jsonObject.get(str2);
                            kotlin.jvm.internal.i.e(jsonElement, "jsonObject.get(\"placeholder\")");
                            asString2 = jsonElement.getAsString();
                        } else {
                            asString2 = null;
                        }
                        str2 = "pattern";
                        if (jsonObject.has(str2)) {
                            jsonElement = jsonObject.get(str2);
                            kotlin.jvm.internal.i.e(jsonElement, "jsonObject.get(\"pattern\")");
                            asString3 = jsonElement.getAsString();
                        } else {
                            asString3 = null;
                        }
                        str2 = "validation_err_msg";
                        if (jsonObject.has(str2)) {
                            jsonElement = jsonObject.get(str2);
                            kotlin.jvm.internal.i.e(jsonElement, "jsonObject.get(\"validation_err_msg\")");
                            asString4 = jsonElement.getAsString();
                        } else {
                            asString4 = null;
                        }
                        str2 = "hint";
                        if (jsonObject.has(str2)) {
                            jsonElement = jsonObject.get(str2);
                            kotlin.jvm.internal.i.e(jsonElement, "jsonObject.get(\"hint\")");
                            asString5 = jsonElement.getAsString();
                        } else {
                            asString5 = null;
                        }
                        try {
                            if (jsonObject.has(str)) {
                                JsonElement jsonElement2 = jsonObject.get(str);
                                kotlin.jvm.internal.i.e(jsonElement2, "jsonObject.get(\"maxLength\")");
                                dVar = Integer.valueOf(jsonElement2.getAsInt());
                            }
                            num = dVar;
                        } catch (Exception unused) {
                            num = (Integer) null;
                        }
                        return new d(asString, asString2, asString3, asString4, asString5, num);
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
            return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        public final Object[] newArray(int i) {
            return new d[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bow, r3.bow) != false) goto L_0x0047;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0047;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.billing.response.extraparams.d;
        if (r0 == 0) goto L_0x0045;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.billing.response.extraparams.d) r3;
        r0 = r2.bol;
        r1 = r3.bol;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0012:
        r0 = r2.bou;
        r1 = r3.bou;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x001c:
        r0 = r2.pattern;
        r1 = r3.pattern;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0026:
        r0 = r2.bov;
        r1 = r3.bov;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0030:
        r0 = r2.bom;
        r1 = r3.bom;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x003a:
        r0 = r2.bow;
        r3 = r3.bow;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0047;
    L_0x0045:
        r3 = 0;
        return r3;
    L_0x0047:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.extraparams.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.bol;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bou;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.pattern;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bov;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bom;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.bow;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExtraParamStringProperty(_title=");
        stringBuilder.append(this.bol);
        stringBuilder.append(", placeholder=");
        stringBuilder.append(this.bou);
        stringBuilder.append(", pattern=");
        stringBuilder.append(this.pattern);
        stringBuilder.append(", _validationErrorMessage=");
        stringBuilder.append(this.bov);
        stringBuilder.append(", _hint=");
        stringBuilder.append(this.bom);
        stringBuilder.append(", maxLength=");
        stringBuilder.append(this.bow);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bol);
        parcel.writeString(this.bou);
        parcel.writeString(this.pattern);
        parcel.writeString(this.bov);
        parcel.writeString(this.bom);
        Integer num = this.bow;
        if (num != null) {
            parcel.writeInt(1);
            i = num.intValue();
        } else {
            i = 0;
        }
        parcel.writeInt(i);
    }

    public d(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.bol = str;
        this.bou = str2;
        this.pattern = str3;
        this.bov = str4;
        this.bom = str5;
        this.bow = num;
    }

    public final String aaQ() {
        return this.bou;
    }

    public final String getPattern() {
        return this.pattern;
    }

    public final Integer aaR() {
        return this.bow;
    }

    public PropertyType aaK() {
        return PropertyType.stringType;
    }

    public String getTitle() {
        return this.bol;
    }

    public String getHint() {
        return this.bom;
    }

    public String aaL() {
        return this.bov;
    }
}
