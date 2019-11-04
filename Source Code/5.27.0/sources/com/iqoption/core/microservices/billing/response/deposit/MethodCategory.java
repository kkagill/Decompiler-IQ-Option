package com.iqoption.core.microservices.billing.response.deposit;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BANK_CARD", "BANK_TRANSFER", "E_WALLET", "CRYPTO", "CRYPTO_DEPOSITS", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: MethodCategory.kt */
public enum MethodCategory {
    BANK_CARD("bank_card"),
    BANK_TRANSFER("bank_transfer"),
    E_WALLET("e_wallet"),
    CRYPTO("crypto"),
    CRYPTO_DEPOSITS("_CRYPTO_DEPOSITS"),
    UNKNOWN("_UNKNOWN");
    
    public static final b Companion = null;
    private final String value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory$Companion;", "", "()V", "from", "Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;", "value", "", "core_release"})
    /* compiled from: MethodCategory.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final MethodCategory from(String str) {
            for (MethodCategory methodCategory : MethodCategory.values()) {
                if (u.v(methodCategory.getValue(), str, true)) {
                    break;
                }
            }
            MethodCategory methodCategory2 = null;
            return methodCategory2 != null ? methodCategory2 : MethodCategory.UNKNOWN;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "status", "core_release"})
    /* compiled from: MethodCategory.kt */
    public static final class a extends TypeAdapter<MethodCategory> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, MethodCategory methodCategory) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.jsonValue(methodCategory != null ? methodCategory.getValue() : null);
        }

        /* renamed from: n */
        public MethodCategory read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return MethodCategory.Companion.from(jsonReader.nextString());
        }
    }

    public static final MethodCategory from(String str) {
        return Companion.from(str);
    }

    private MethodCategory(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        Companion = new b();
    }
}
