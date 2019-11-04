package com.iqoption.core.data.model.user;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@JsonAdapter(nullSafe = false, value = a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/data/model/user/Gender;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "toKycGender", "Lcom/iqoption/core/microservices/kyc/response/Gender;", "MALE", "FEMALE", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: Gender.kt */
public enum Gender {
    MALE("male"),
    FEMALE("female"),
    UNKNOWN("_unknown");
    
    public static final b Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/data/model/user/Gender$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/data/model/user/Gender;", "value", "", "core_release"})
    /* compiled from: Gender.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final Gender fromServerValue(String str) {
            if (str == null) {
                return Gender.UNKNOWN;
            }
            Enum enumR = Gender.UNKNOWN;
            for (Gender gender : Gender.values()) {
                if (kotlin.jvm.internal.i.y(gender.getServerValue(), str)) {
                    break;
                }
            }
            Gender gender2 = null;
            Enum enumR2 = gender2;
            if (enumR2 == null) {
                enumR2 = enumR;
            }
            return (Gender) enumR2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/data/model/user/Gender$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/data/model/user/Gender;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "gender", "core_release"})
    /* compiled from: Gender.kt */
    public static final class a extends TypeAdapter<Gender> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Gender gender) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.jsonValue(gender != null ? gender.getServerValue() : null);
        }

        /* renamed from: i */
        public Gender read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return Gender.Companion.fromServerValue(jsonReader.nextString());
        }
    }

    public static final Gender fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private Gender(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }

    public final com.iqoption.core.microservices.kyc.response.Gender toKycGender() {
        int i = a.aob[ordinal()];
        if (i == 1) {
            return com.iqoption.core.microservices.kyc.response.Gender.MALE;
        }
        if (i == 2) {
            return com.iqoption.core.microservices.kyc.response.Gender.FEMALE;
        }
        if (i == 3) {
            return com.iqoption.core.microservices.kyc.response.Gender.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }
}
