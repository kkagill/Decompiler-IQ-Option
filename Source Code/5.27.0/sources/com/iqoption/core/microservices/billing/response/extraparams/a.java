package com.iqoption.core.microservices.billing.response.extraparams;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamProperty.PropertyType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007HÖ\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\""}, bng = {"Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamEnumProperty;", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "_title", "", "_hint", "enumValues", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEnumValues", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "getHint", "getTitle", "getType", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty$PropertyType;", "getTypeName", "hashCode", "toString", "validationErrorMessage", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "core_release"})
/* compiled from: ExtraParamEnumProperty.kt */
public final class a implements ExtraParamProperty {
    public static final Creator CREATOR = new c();
    private static final String TAG = a.class.getName();
    private static final Type boo = new b().getType();
    public static final a bop = new a();
    private final String bol;
    private final String bom;
    private final List<Integer> bon;

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamEnumProperty$Companion;", "", "()V", "LIST_TYPE", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "TAG", "", "TYPE_NAME", "fromJson", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamEnumProperty;", "jsonObject", "Lcom/google/gson/JsonObject;", "context", "Lcom/google/gson/JsonDeserializationContext;", "core_release"})
    /* compiled from: ExtraParamEnumProperty.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            kotlin.jvm.internal.i.f(jsonDeserializationContext, "context");
            if (jsonObject != null) {
                String str = "type";
                if (jsonObject.has(str)) {
                    JsonElement jsonElement = jsonObject.get(str);
                    kotlin.jvm.internal.i.e(jsonElement, "jsonObject.get(\"type\")");
                    if (jsonElement.isJsonObject()) {
                        jsonElement = jsonObject.get(str);
                        String str2 = "null cannot be cast to non-null type com.google.gson.JsonObject";
                        if (jsonElement != null) {
                            String str3 = "enum";
                            if (((JsonObject) jsonElement).has(str3)) {
                                String str4 = PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE;
                                if (jsonObject.has(str4)) {
                                    jsonElement = jsonObject.get(str4);
                                    kotlin.jvm.internal.i.e(jsonElement, "jsonObject.get(\"title\")");
                                    str4 = jsonElement.getAsString();
                                } else {
                                    str4 = null;
                                }
                                String str5 = "hint";
                                if (jsonObject.has(str5)) {
                                    JsonElement jsonElement2 = jsonObject.get(str5);
                                    kotlin.jvm.internal.i.e(jsonElement2, "jsonObject.get(\"hint\")");
                                    str5 = jsonElement2.getAsString();
                                } else {
                                    str5 = null;
                                }
                                List list = (List) null;
                                try {
                                    JsonElement jsonElement3 = jsonObject.get(str);
                                    if (jsonElement3 != null) {
                                        List list2;
                                        jsonElement3 = ((JsonObject) jsonElement3).get(str3);
                                        kotlin.jvm.internal.i.e(jsonElement3, "jsonEnumElement");
                                        if (jsonElement3.isJsonArray()) {
                                            list2 = (List) jsonDeserializationContext.deserialize(jsonElement3, a.boo);
                                            return new a(str4, str5, list2);
                                        }
                                        list2 = list;
                                        return new a(str4, str5, list2);
                                    }
                                    throw new TypeCastException(str2);
                                } catch (Exception unused) {
                                }
                            }
                        } else {
                            throw new TypeCastException(str2);
                        }
                    }
                }
            }
            return null;
        }
    }

    @i(bne = {1, 1, 15})
    public static class c implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            List arrayList;
            kotlin.jvm.internal.i.f(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new a(readString, readString2, arrayList);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, bng = {"com/iqoption/core/microservices/billing/response/extraparams/ExtraParamEnumProperty$Companion$LIST_TYPE$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "core_release"})
    /* compiled from: ExtraParamEnumProperty.kt */
    public static final class b extends TypeToken<List<? extends Integer>> {
        b() {
        }
    }

    public String aaL() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bon, r3.bon) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.billing.response.extraparams.a;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.billing.response.extraparams.a) r3;
        r0 = r2.bol;
        r1 = r3.bol;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.bom;
        r1 = r3.bom;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.bon;
        r3 = r3.bon;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.extraparams.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.bol;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bom;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.bon;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExtraParamEnumProperty(_title=");
        stringBuilder.append(this.bol);
        stringBuilder.append(", _hint=");
        stringBuilder.append(this.bom);
        stringBuilder.append(", enumValues=");
        stringBuilder.append(this.bon);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bol);
        parcel.writeString(this.bom);
        List<Integer> list = this.bon;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Integer intValue : list) {
                parcel.writeInt(intValue.intValue());
            }
            return;
        }
        parcel.writeInt(0);
    }

    public a(String str, String str2, List<Integer> list) {
        this.bol = str;
        this.bom = str2;
        this.bon = list;
    }

    public final List<Integer> aaM() {
        return this.bon;
    }

    public PropertyType aaK() {
        return PropertyType.enumType;
    }

    public String getTitle() {
        return this.bol;
    }

    public String getHint() {
        return this.bom;
    }
}
