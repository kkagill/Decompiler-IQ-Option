package com.iqoption.core.microservices.billing.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@JsonAdapter(a.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0012\u0013B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/microservices/billing/response/PaymentStatusType;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getServerValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "NEW", "OPEN_CASHBOX", "INVOICE_CREATED", "INVOICE_SENT", "ANSWER_RECEIVED", "FAILED", "SUCCESS", "IQOPTION_SUCCESS", "IQOPTION_FAILED", "UNKNOWN", "Adapter", "Companion", "core_release"})
/* compiled from: PaymentStatusType.kt */
public enum PaymentStatusType {
    NEW(Integer.valueOf(0)),
    OPEN_CASHBOX(Integer.valueOf(5)),
    INVOICE_CREATED(Integer.valueOf(10)),
    INVOICE_SENT(Integer.valueOf(20)),
    ANSWER_RECEIVED(Integer.valueOf(30)),
    FAILED(Integer.valueOf(40)),
    SUCCESS(Integer.valueOf(50)),
    IQOPTION_SUCCESS(Integer.valueOf(60)),
    IQOPTION_FAILED(Integer.valueOf(70)),
    UNKNOWN(Integer.valueOf(-1));
    
    public static final b Companion = null;
    private final Integer serverValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/billing/response/PaymentStatusType$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/billing/response/PaymentStatusType;", "value", "", "(Ljava/lang/Integer;)Lcom/iqoption/core/microservices/billing/response/PaymentStatusType;", "core_release"})
    /* compiled from: PaymentStatusType.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final PaymentStatusType fromServerValue(Integer num) {
            for (PaymentStatusType paymentStatusType : PaymentStatusType.values()) {
                if (kotlin.jvm.internal.i.y(paymentStatusType.getServerValue(), num)) {
                    break;
                }
            }
            PaymentStatusType paymentStatusType2 = null;
            return paymentStatusType2 != null ? paymentStatusType2 : PaymentStatusType.UNKNOWN;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/billing/response/PaymentStatusType$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/billing/response/PaymentStatusType;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "gender", "core_release"})
    /* compiled from: PaymentStatusType.kt */
    public static final class a extends TypeAdapter<PaymentStatusType> {
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, PaymentStatusType paymentStatusType) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            jsonWriter.value((Number) paymentStatusType != null ? paymentStatusType.getServerValue() : null);
        }

        /* renamed from: k */
        public PaymentStatusType read(JsonReader jsonReader) {
            kotlin.jvm.internal.i.f(jsonReader, "reader");
            return PaymentStatusType.Companion.fromServerValue(Integer.valueOf(jsonReader.nextInt()));
        }
    }

    public static final PaymentStatusType fromServerValue(Integer num) {
        return Companion.fromServerValue(num);
    }

    private PaymentStatusType(Integer num) {
        this.serverValue = num;
    }

    public final Integer getServerValue() {
        return this.serverValue;
    }

    static {
        Companion = new b();
    }
}
