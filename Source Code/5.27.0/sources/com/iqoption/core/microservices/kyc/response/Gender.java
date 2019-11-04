package com.iqoption.core.microservices.kyc.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(nullSafe = false, value = a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/Gender;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getServerValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "MALE", "FEMALE", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: Gender.kt */
public enum Gender {
    MALE(Integer.valueOf(1)),
    FEMALE(Integer.valueOf(2)),
    UNKNOWN(Integer.valueOf(-1));
    
    public static final b Companion = null;
    private final Integer serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/Gender$Companion;", "", "()V", "fromBoolean", "Lcom/iqoption/core/microservices/kyc/response/Gender;", "isMale", "", "(Ljava/lang/Boolean;)Lcom/iqoption/core/microservices/kyc/response/Gender;", "fromServerValue", "value", "", "(Ljava/lang/Integer;)Lcom/iqoption/core/microservices/kyc/response/Gender;", "core_release"})
    /* compiled from: Gender.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final Gender fromServerValue(Integer num) {
            for (Gender gender : Gender.values()) {
                if (kotlin.jvm.internal.i.y(gender.getServerValue(), num)) {
                    break;
                }
            }
            Gender gender2 = null;
            return gender2 != null ? gender2 : Gender.UNKNOWN;
        }

        public final Gender fromBoolean(Boolean bool) {
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                return Gender.MALE;
            }
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(false))) {
                return Gender.FEMALE;
            }
            return Gender.UNKNOWN;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/Gender$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/kyc/response/Gender;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "gender", "core_release"})
    /* compiled from: Gender.kt */
    public static final class a extends TypeAdapter<Gender> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Gender gender) {
            String valueOf;
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            if (gender != null) {
                Integer serverValue = gender.getServerValue();
                if (serverValue != null) {
                    valueOf = String.valueOf(serverValue.intValue());
                    jsonWriter.jsonValue(valueOf);
                }
            }
            valueOf = null;
            jsonWriter.jsonValue(valueOf);
        }

        /* renamed from: v */
        public Gender read(JsonReader jsonReader) {
            Integer valueOf;
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            if (jsonReader.peek() != JsonToken.NULL) {
                valueOf = Integer.valueOf(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
                valueOf = null;
            }
            return Gender.Companion.fromServerValue(valueOf);
        }
    }

    public static final Gender fromBoolean(Boolean bool) {
        return Companion.fromBoolean(bool);
    }

    public static final Gender fromServerValue(Integer num) {
        return Companion.fromServerValue(num);
    }

    private Gender(Integer num) {
        this.serverValue = num;
    }

    public final Integer getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }
}
