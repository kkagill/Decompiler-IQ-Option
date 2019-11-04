package com.iqoption.core.microservices.kyc.response.restriction;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000e\u000fB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "BLOCK_REAL_BALANCE_TRADE", "BLOCK_DEPOSIT", "AML_LIMIT_DEPOSUM_AMOUNT", "AML_LIMIT_PAYMENT_METHODS", "AML_LIMIT_CRYPTO_DEPOSIT", "BLOCK_WITHDRAW", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: RestrictionId.kt */
public enum RestrictionId {
    BLOCK_REAL_BALANCE_TRADE(r2),
    BLOCK_DEPOSIT(r2),
    AML_LIMIT_DEPOSUM_AMOUNT(r2),
    AML_LIMIT_PAYMENT_METHODS(r2),
    AML_LIMIT_CRYPTO_DEPOSIT(r2),
    BLOCK_WITHDRAW(r2),
    UNKNOWN("_UNKNOWN_TYPE");
    
    public static final b Companion = null;
    private final String serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId;", "value", "", "core_release"})
    /* compiled from: RestrictionId.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final RestrictionId fromServerValue(String str) {
            for (RestrictionId restrictionId : RestrictionId.values()) {
                if (u.v(restrictionId.getServerValue(), str, true)) {
                    return restrictionId;
                }
            }
            return null;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "status", "core_release"})
    /* compiled from: RestrictionId.kt */
    public static final class a extends TypeAdapter<RestrictionId> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, RestrictionId restrictionId) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.jsonValue(restrictionId != null ? restrictionId.getServerValue() : null);
        }

        /* renamed from: J */
        public RestrictionId read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return RestrictionId.Companion.fromServerValue(jsonReader.nextString());
        }
    }

    public static final RestrictionId fromServerValue(String str) {
        return Companion.fromServerValue(str);
    }

    private RestrictionId(String str) {
        this.serverValue = str;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }
}
