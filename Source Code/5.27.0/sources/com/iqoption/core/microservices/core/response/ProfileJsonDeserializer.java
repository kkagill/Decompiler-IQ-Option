package com.iqoption.core.microservices.core.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iqoption.core.data.model.user.Gender;
import com.iqoption.core.ext.d;
import com.iqoption.core.microservices.busapi.response.a;
import com.iqoption.core.microservices.busapi.response.b;
import java.lang.reflect.Type;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/core/response/ProfileJsonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/iqoption/core/microservices/core/response/Profile;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "core_release"})
/* compiled from: ProfileJsonDeserializer.kt */
public final class ProfileJsonDeserializer implements JsonDeserializer<g> {
    /* renamed from: f */
    public g deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonDeserializationContext jsonDeserializationContext2 = jsonDeserializationContext;
        if (jsonElement != null) {
            d dVar = null;
            JsonElement jsonElement2 = jsonElement.isJsonObject() ? jsonElement : null;
            if (jsonElement2 != null) {
                JsonObject asJsonObject = jsonElement2.getAsJsonObject();
                if (asJsonObject != null) {
                    long a = d.a(asJsonObject, "id", -1);
                    long a2 = d.a(asJsonObject, "balance_id", -1);
                    long a3 = d.a(asJsonObject, "group_id", -1);
                    int a4 = d.a(asJsonObject, "messages", 0, 2, null);
                    String b = d.b(asJsonObject, "first_name", null, 2, null);
                    String b2 = d.b(asJsonObject, "last_name", null, 2, null);
                    String b3 = d.b(asJsonObject, "nickname", null, 2, null);
                    long a5 = d.a(asJsonObject, "birthdate", 0, 2, null);
                    String b4 = d.b(asJsonObject, "email", null, 2, null);
                    String b5 = d.b(asJsonObject, "new_email", null, 2, null);
                    String b6 = d.b(asJsonObject, "tin", null, 2, null);
                    String b7 = d.b(asJsonObject, "city", null, 2, null);
                    String b8 = d.b(asJsonObject, "locale", null, 2, null);
                    boolean a6 = d.a(asJsonObject, "is_activated", false, 2, null);
                    boolean a7 = d.a(asJsonObject, "auth_two_factor", false, 2, null);
                    int a8 = d.a(asJsonObject, "deposit_count", 0, 2, null);
                    String b9 = d.b(asJsonObject, "flag", null, 2, null);
                    long a9 = d.a(asJsonObject, "country_id", -1);
                    String b10 = d.b(asJsonObject, "phone", null, 2, null);
                    String b11 = d.b(asJsonObject, "address", null, 2, null);
                    String b12 = d.b(asJsonObject, "postal_index", null, 2, null);
                    String b13 = d.b(asJsonObject, "nationality", null, 2, null);
                    String b14 = d.b(asJsonObject, "gender", null, 2, null);
                    Enum enumR = Gender.MALE;
                    for (Gender gender : Gender.values()) {
                        if (kotlin.jvm.internal.i.y(gender.name(), b14)) {
                            break;
                        }
                    }
                    Gender gender2 = null;
                    Enum enumR2 = gender2;
                    if (enumR2 == null) {
                        enumR2 = enumR;
                    }
                    Gender gender3 = (Gender) enumR2;
                    String b15 = d.b(asJsonObject, "skey", null, 2, null);
                    b14 = d.b(asJsonObject, "user_group", null, 2, null);
                    enumR = UserGroup.DEFAULT;
                    for (UserGroup userGroup : UserGroup.values()) {
                        if (kotlin.jvm.internal.i.y(userGroup.name(), b14)) {
                            break;
                        }
                    }
                    UserGroup userGroup2 = null;
                    enumR2 = userGroup2;
                    if (enumR2 == null) {
                        enumR2 = enumR;
                    }
                    UserGroup userGroup3 = (UserGroup) enumR2;
                    int a10 = d.a(asJsonObject, "client_category_id", 0, 2, null);
                    boolean a11 = d.a(asJsonObject, "trial", false, 2, null);
                    b bVar = jsonDeserializationContext2 != null ? (b) jsonDeserializationContext2.deserialize(asJsonObject.get("personal_data_policy"), b.class) : null;
                    a aVar = jsonDeserializationContext2 != null ? (a) jsonDeserializationContext2.deserialize(asJsonObject.get("forget_status"), a.class) : null;
                    if (jsonDeserializationContext2 != null) {
                        dVar = (d) jsonDeserializationContext2.deserialize(asJsonObject.get("kyc"), d.class);
                    }
                    return new g(a, a2, a3, a4, b, b2, b3, a5, b4, b5, b6, b7, b8, a6, a7, a8, b9, a9, b10, b11, b12, b13, gender3, b15, userGroup3, a10, a11, bVar, aVar, dVar, d.a(asJsonObject, "public", 0) == 1);
                }
            }
        }
        return new g(0, 0, 0, 0, null, null, null, 0, null, null, null, null, null, false, false, 0, null, 0, null, null, null, null, null, null, null, 0, false, null, null, null, false, Integer.MAX_VALUE, null);
    }
}
