package com.iqoption.core.microservices.transaction;

import androidx.core.app.NotificationCompat;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002,-BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, bng = {"Lcom/iqoption/core/microservices/transaction/Transaction;", "", "id", "", "type", "Lcom/iqoption/core/microservices/transaction/Transaction$Type;", "status", "Lcom/iqoption/core/microservices/transaction/Transaction$Status;", "amount", "", "commissionAmount", "currency", "", "created", "(JLcom/iqoption/core/microservices/transaction/Transaction$Type;Lcom/iqoption/core/microservices/transaction/Transaction$Status;DLjava/lang/Double;Ljava/lang/String;J)V", "getAmount", "()D", "getCommissionAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCreated", "()J", "getCurrency", "()Ljava/lang/String;", "getId", "getStatus", "()Lcom/iqoption/core/microservices/transaction/Transaction$Status;", "getType", "()Lcom/iqoption/core/microservices/transaction/Transaction$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JLcom/iqoption/core/microservices/transaction/Transaction$Type;Lcom/iqoption/core/microservices/transaction/Transaction$Status;DLjava/lang/Double;Ljava/lang/String;J)Lcom/iqoption/core/microservices/transaction/Transaction;", "equals", "", "other", "hashCode", "", "toString", "Status", "Type", "core_release"})
/* compiled from: Transaction.kt */
public final class Transaction {
    @SerializedName("type")
    private final Type bCR;
    @SerializedName("status")
    private final Status bCS;
    @SerializedName("commission_amount")
    private final Double bCT;
    @SerializedName("amount")
    private final double bmw;
    @SerializedName("created")
    private final long created;
    @SerializedName("currency")
    private final String currency;
    @SerializedName("id")
    private final long id;

    @JsonAdapter(a.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/microservices/transaction/Transaction$Status;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "IN_PROCESS", "CANCELLED", "FAILED", "COMPLETED", "UNKNOWN", "Adapter", "Companion", "core_release"})
    /* compiled from: Transaction.kt */
    public enum Status {
        IN_PROCESS("in_process"),
        CANCELLED("canceled"),
        FAILED("failed"),
        COMPLETED("completed"),
        UNKNOWN("_UNKNOWN_TYPE");
        
        public static final b Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/transaction/Transaction$Status$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/transaction/Transaction$Status;", "value", "", "core_release"})
        /* compiled from: Transaction.kt */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(f fVar) {
                this();
            }

            public final Status fromServerValue(String str) {
                for (Status status : Status.values()) {
                    if (u.v(status.getServerValue(), str, true)) {
                        break;
                    }
                }
                Status status2 = null;
                return status2 != null ? status2 : Status.UNKNOWN;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/transaction/Transaction$Status$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/transaction/Transaction$Status;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "status", "core_release"})
        /* compiled from: Transaction.kt */
        public static final class a extends TypeAdapter<Status> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Status status) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                jsonWriter.jsonValue(status != null ? status.getServerValue() : null);
            }

            /* renamed from: ag */
            public Status read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                return Status.Companion.fromServerValue(jsonReader.nextString());
            }
        }

        public static final Status fromServerValue(String str) {
            return Companion.fromServerValue(str);
        }

        private Status(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            Companion = new b();
        }
    }

    @JsonAdapter(a.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000e\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/transaction/Transaction$Type;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "DEPOSIT", "WITHDRAWAL", "TOURNAMENT_REBUY", "TOURNAMENT_REWARD", "COMMISSION", "QUIZ_REWARD", "UNKNOWN", "Adapter", "Companion", "core_release"})
    /* compiled from: Transaction.kt */
    public enum Type {
        DEPOSIT("deposit"),
        WITHDRAWAL("withdrawal"),
        TOURNAMENT_REBUY("tournament_rebuy"),
        TOURNAMENT_REWARD("tournament_reward"),
        COMMISSION("commission"),
        QUIZ_REWARD("quiz_reward"),
        UNKNOWN("_UNKNOWN_TYPE");
        
        public static final b Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/transaction/Transaction$Type$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/transaction/Transaction$Type;", "value", "", "core_release"})
        /* compiled from: Transaction.kt */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(f fVar) {
                this();
            }

            public final Type fromServerValue(String str) {
                for (Type type : Type.values()) {
                    if (u.v(type.getServerValue(), str, true)) {
                        break;
                    }
                }
                Type type2 = null;
                return type2 != null ? type2 : Type.UNKNOWN;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/transaction/Transaction$Type$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/transaction/Transaction$Type;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "status", "core_release"})
        /* compiled from: Transaction.kt */
        public static final class a extends TypeAdapter<Type> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Type type) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                jsonWriter.jsonValue(type != null ? type.getServerValue() : null);
            }

            /* renamed from: ah */
            public Type read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                return Type.Companion.fromServerValue(jsonReader.nextString());
            }
        }

        public static final Type fromServerValue(String str) {
            return Companion.fromServerValue(str);
        }

        private Type(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            Companion = new b();
        }
    }

    public Transaction() {
        this(0, null, null, 0.0d, null, null, 0, 127, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Transaction) {
                Transaction transaction = (Transaction) obj;
                if ((this.id == transaction.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bCR, transaction.bCR) && kotlin.jvm.internal.i.y(this.bCS, transaction.bCS) && Double.compare(this.bmw, transaction.bmw) == 0 && kotlin.jvm.internal.i.y(this.bCT, transaction.bCT) && kotlin.jvm.internal.i.y(this.currency, transaction.currency)) {
                    if ((this.created == transaction.created ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Type type = this.bCR;
        int i2 = 0;
        i = (i + (type != null ? type.hashCode() : 0)) * 31;
        Status status = this.bCS;
        i = (i + (status != null ? status.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bmw);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        Double d = this.bCT;
        i = (i + (d != null ? d.hashCode() : 0)) * 31;
        String str = this.currency;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i + i2) * 31;
        long j2 = this.created;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Transaction(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.bCR);
        stringBuilder.append(", status=");
        stringBuilder.append(this.bCS);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.bmw);
        stringBuilder.append(", commissionAmount=");
        stringBuilder.append(this.bCT);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.currency);
        stringBuilder.append(", created=");
        stringBuilder.append(this.created);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Transaction(long j, Type type, Status status, double d, Double d2, String str, long j2) {
        kotlin.jvm.internal.i.f(status, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.i.f(str, "currency");
        this.id = j;
        this.bCR = type;
        this.bCS = status;
        this.bmw = d;
        this.bCT = d2;
        this.currency = str;
        this.created = j2;
    }

    public final long getId() {
        return this.id;
    }

    public /* synthetic */ Transaction(long j, Type type, Status status, double d, Double d2, String str, long j2, int i, f fVar) {
        long j3 = 0;
        long j4 = (i & 1) != 0 ? 0 : j;
        Type type2 = (i & 2) != 0 ? Type.UNKNOWN : type;
        Status status2 = (i & 4) != 0 ? Status.FAILED : status;
        double d3 = (i & 8) != 0 ? 0.0d : d;
        Double valueOf = (i & 16) != 0 ? Double.valueOf(0.0d) : d2;
        String str2 = (i & 32) != 0 ? "" : str;
        if ((i & 64) == 0) {
            j3 = j2;
        }
        this(j4, type2, status2, d3, valueOf, str2, j3);
    }

    public final Type aiX() {
        return this.bCR;
    }

    public final Status aiY() {
        return this.bCS;
    }

    public final double ZC() {
        return this.bmw;
    }

    public final Double aiZ() {
        return this.bCT;
    }

    public final long getCreated() {
        return this.created;
    }
}
