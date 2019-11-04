package com.iqoption.core.microservices.binaryoptions.response;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonWriter;
import com.iqoption.core.Platform;
import com.iqoption.core.data.model.Direction;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001AB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ\u0013\u0010<\u001a\u00020,2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010>\u001a\u00020\fH\u0016J\b\u0010?\u001a\u00020@H\u0016R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010(\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\u001b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b+\u0010-R\u0011\u0010.\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u001a\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0016\u0010\u0012\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010 ¨\u0006B"}, bng = {"Lcom/iqoption/core/microservices/binaryoptions/response/TradingOption;", "", "()V", "optionId", "", "userId", "balanceId", "platform", "Lcom/iqoption/core/Platform;", "optionType", "Lcom/iqoption/core/microservices/binaryoptions/response/OptionType;", "assetId", "", "direction", "Lcom/iqoption/core/data/model/Direction;", "expirationTime", "amount", "", "profitPercent", "openTime", "openTimeMs", "value", "actualExpire", "expirationValue", "result", "Lcom/iqoption/core/microservices/binaryoptions/response/WinStatus;", "profitAmount", "index", "(JJJLcom/iqoption/core/Platform;Lcom/iqoption/core/microservices/binaryoptions/response/OptionType;ILcom/iqoption/core/data/model/Direction;JDIJJDJDLcom/iqoption/core/microservices/binaryoptions/response/WinStatus;DJ)V", "getActualExpire", "()J", "getAmount", "()D", "getAssetId", "()I", "getBalanceId", "getDirection", "()Lcom/iqoption/core/data/model/Direction;", "getExpirationTime", "getExpirationValue", "hash", "getHash", "getIndex", "isClosed", "", "()Z", "isOpen", "getOpenTime", "getOpenTimeMs", "getOptionId", "getOptionType", "()Lcom/iqoption/core/microservices/binaryoptions/response/OptionType;", "getPlatform", "()Lcom/iqoption/core/Platform;", "getProfitAmount", "getProfitPercent", "getResult", "()Lcom/iqoption/core/microservices/binaryoptions/response/WinStatus;", "getUserId", "getValue", "equals", "other", "hashCode", "toString", "", "OpenTimeAdapter", "core_release"})
/* compiled from: TradingOption.kt */
public final class b {
    @SerializedName("balance_id")
    private final long aZC;
    @SerializedName("active_id")
    private final int aqg;
    @SerializedName("amount")
    private final double bmw;
    private final long boY;
    @SerializedName("option_id")
    private final long boZ;
    @SerializedName("platform_id")
    private final Platform bpa;
    @SerializedName("option_type")
    private final OptionType bpb;
    @SerializedName("direction")
    private final Direction bpc;
    @SerializedName("expiration_time")
    private final long bpd;
    @SerializedName("open_time")
    @JsonAdapter(a.class)
    private final long bpe;
    @SerializedName("open_time_millisecond")
    private final long bpf;
    @SerializedName("actual_expire")
    private final long bpg;
    @SerializedName("expiration_value")
    private final double bph;
    @SerializedName("result")
    private final WinStatus bpi;
    @SerializedName("profit_amount")
    private final double bpj;
    @SerializedName("index")
    private final long index;
    @SerializedName("profit_percent")
    private final int profitPercent;
    @SerializedName("user_id")
    private final long userId;
    @SerializedName("value")
    private final double value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\r¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/microservices/binaryoptions/response/TradingOption$OpenTimeAdapter;", "Lcom/google/gson/TypeAdapter;", "", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Long;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Long;)V", "Companion", "core_release"})
    /* compiled from: TradingOption.kt */
    public static final class a extends TypeAdapter<Long> {
        private static final SimpleDateFormat bpk = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        public static final a bpl = new a();

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/binaryoptions/response/TradingOption$OpenTimeAdapter$Companion;", "", "()V", "DATE_FORMAT", "Ljava/text/SimpleDateFormat;", "getDATE_FORMAT", "()Ljava/text/SimpleDateFormat;", "core_release"})
        /* compiled from: TradingOption.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Long l) {
            kotlin.jvm.internal.i.f(jsonWriter, "out");
            if (l == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(l.longValue());
            }
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:5|6) */
        /* JADX WARNING: Missing block: B:6:?, code skipped:
            r7 = bpk.parse(r7.nextString());
            kotlin.jvm.internal.i.e(r7, "DATE_FORMAT.parse(reader.nextString())");
            r2 = r7.getTime() / ((long) 1000);
     */
        /* renamed from: t */
        public java.lang.Long read(com.google.gson.stream.JsonReader r7) {
            /*
            r6 = this;
            r0 = "reader";
            kotlin.jvm.internal.i.f(r7, r0);
            r0 = r7.peek();
            r1 = com.google.gson.stream.JsonToken.NULL;
            r2 = 0;
            if (r0 == r1) goto L_0x002e;
        L_0x000f:
            r0 = r7.nextLong();	 Catch:{ NumberFormatException -> 0x0015 }
            r2 = r0;
            goto L_0x0031;
        L_0x0015:
            r0 = bpk;	 Catch:{ Throwable -> 0x0031 }
            r7 = r7.nextString();	 Catch:{ Throwable -> 0x0031 }
            r7 = r0.parse(r7);	 Catch:{ Throwable -> 0x0031 }
            r0 = "DATE_FORMAT.parse(reader.nextString())";
            kotlin.jvm.internal.i.e(r7, r0);	 Catch:{ Throwable -> 0x0031 }
            r0 = r7.getTime();	 Catch:{ Throwable -> 0x0031 }
            r7 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r4 = (long) r7;	 Catch:{ Throwable -> 0x0031 }
            r2 = r0 / r4;
            goto L_0x0031;
        L_0x002e:
            r7.skipValue();
        L_0x0031:
            r7 = java.lang.Long.valueOf(r2);
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.binaryoptions.response.b$a.read(com.google.gson.stream.JsonReader):java.lang.Long");
        }
    }

    public b(long j, long j2, long j3, Platform platform, OptionType optionType, int i, Direction direction, long j4, double d, int i2, long j5, long j6, double d2, long j7, double d3, WinStatus winStatus, double d4, long j8) {
        Platform platform2 = platform;
        OptionType optionType2 = optionType;
        Direction direction2 = direction;
        WinStatus winStatus2 = winStatus;
        kotlin.jvm.internal.i.f(platform, "platform");
        kotlin.jvm.internal.i.f(optionType, "optionType");
        kotlin.jvm.internal.i.f(direction2, "direction");
        kotlin.jvm.internal.i.f(winStatus2, "result");
        this.boZ = j;
        this.userId = j2;
        this.aZC = j3;
        this.bpa = platform2;
        this.bpb = optionType2;
        this.aqg = i;
        this.bpc = direction2;
        this.bpd = j4;
        this.bmw = d;
        this.profitPercent = i2;
        this.bpe = j5;
        this.bpf = j6;
        this.value = d2;
        this.bpg = j7;
        this.bph = d3;
        this.bpi = winStatus2;
        this.bpj = d4;
        this.index = j8;
        this.boY = System.currentTimeMillis();
    }

    public final long abf() {
        return this.boZ;
    }

    public final long DH() {
        return this.aZC;
    }

    public /* synthetic */ b(long j, long j2, long j3, Platform platform, OptionType optionType, int i, Direction direction, long j4, double d, int i2, long j5, long j6, double d2, long j7, double d3, WinStatus winStatus, double d4, long j8, int i3, f fVar) {
        Direction direction2;
        int i4 = i3;
        long j9 = -1;
        long j10 = (i4 & 1) != 0 ? -1 : j;
        long j11 = (i4 & 2) != 0 ? -1 : j2;
        if ((i4 & 4) == 0) {
            j9 = j3;
        }
        Platform platform2 = (i4 & 8) != 0 ? Platform.UNKNOWN : platform;
        OptionType optionType2 = (i4 & 16) != 0 ? OptionType.UNKNOWN : optionType;
        int i5 = (i4 & 32) != 0 ? -1 : i;
        if ((i4 & 64) != 0) {
            direction2 = Direction.UNKNOWN;
        } else {
            direction2 = direction;
        }
        long j12 = (i4 & 128) != 0 ? 0 : j4;
        double d5 = 0.0d;
        double d6 = (i4 & 256) != 0 ? 0.0d : d;
        int i6 = (i4 & 512) != 0 ? 0 : i2;
        long j13 = (i4 & 1024) != 0 ? 0 : j5;
        long j14 = (i4 & 2048) != 0 ? 0 : j6;
        double d7 = (i4 & 4096) != 0 ? 0.0d : d2;
        long j15 = (i4 & 8192) != 0 ? 0 : j7;
        double d8 = (i4 & 16384) != 0 ? 0.0d : d3;
        WinStatus winStatus2 = (i4 & 32768) != 0 ? WinStatus.UNKNOWN : winStatus;
        if ((i4 & 65536) == 0) {
            d5 = d4;
        }
        this(j10, j11, j9, platform2, optionType2, i5, direction2, j12, d6, i6, j13, j14, d7, j15, d8, winStatus2, d5, (i4 & 131072) != 0 ? 0 : j8);
    }

    public final Platform abg() {
        return this.bpa;
    }

    public final OptionType abh() {
        return this.bpb;
    }

    public final int Bs() {
        return this.aqg;
    }

    public final Direction abi() {
        return this.bpc;
    }

    public final long abj() {
        return this.bpd;
    }

    public final double ZC() {
        return this.bmw;
    }

    public final int abk() {
        return this.profitPercent;
    }

    public final long abl() {
        return this.bpe;
    }

    public final long abm() {
        return this.bpf;
    }

    public final double getValue() {
        return this.value;
    }

    public final long abn() {
        return this.bpg;
    }

    public final double abo() {
        return this.bph;
    }

    public final WinStatus abp() {
        return this.bpi;
    }

    public final double abq() {
        return this.bpj;
    }

    public b() {
        this(-1, 0, 0, null, null, 0, null, 0, 0.0d, 0, 0, 0, 0.0d, 0, 0.0d, null, 0.0d, 0, 262142, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            b bVar = (b) obj;
            if (this.boZ == bVar.boZ && this.userId == bVar.userId && this.aZC == bVar.aZC && this.bpa == bVar.bpa && this.bpb == bVar.bpb && this.aqg == bVar.aqg && this.bpc == bVar.bpc && this.bpd == bVar.bpd && this.bmw == bVar.bmw && this.profitPercent == bVar.profitPercent && this.bpe == bVar.bpe && this.value == bVar.value && this.bpg == bVar.bpg && this.bph == bVar.bph && this.bpi == bVar.bpi && this.bpj == bVar.bpj) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.binaryoptions.response.TradingOption");
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Long.valueOf(this.boZ).hashCode() * 31) + Long.valueOf(this.userId).hashCode()) * 31) + Long.valueOf(this.aZC).hashCode()) * 31) + this.bpa.hashCode()) * 31) + this.bpb.hashCode()) * 31) + this.aqg) * 31) + this.bpc.hashCode()) * 31) + Long.valueOf(this.bpd).hashCode()) * 31) + Double.valueOf(this.bmw).hashCode()) * 31) + this.profitPercent) * 31) + Long.valueOf(this.bpe).hashCode()) * 31) + Double.valueOf(this.value).hashCode()) * 31) + Long.valueOf(this.bpg).hashCode()) * 31) + Double.valueOf(this.bph).hashCode()) * 31) + this.bpi.hashCode()) * 31) + Double.valueOf(this.bpj).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TradingOption(");
        stringBuilder.append("optionId=");
        stringBuilder.append(this.boZ);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append("userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(str);
        stringBuilder.append("balanceId=");
        stringBuilder.append(this.aZC);
        stringBuilder.append(str);
        stringBuilder.append("platform=");
        stringBuilder.append(this.bpa);
        stringBuilder.append(str);
        stringBuilder.append("optionType=");
        stringBuilder.append(this.bpb);
        stringBuilder.append(str);
        stringBuilder.append("assetId=");
        stringBuilder.append(this.aqg);
        stringBuilder.append(str);
        stringBuilder.append("direction=");
        stringBuilder.append(this.bpc);
        stringBuilder.append(str);
        stringBuilder.append("expirationTime=");
        stringBuilder.append(this.bpd);
        stringBuilder.append(str);
        stringBuilder.append("amount=");
        stringBuilder.append(this.bmw);
        stringBuilder.append(str);
        stringBuilder.append("profitPercent=");
        stringBuilder.append(this.profitPercent);
        stringBuilder.append(str);
        stringBuilder.append("openTime=");
        stringBuilder.append(this.bpe);
        stringBuilder.append(str);
        stringBuilder.append("value=");
        stringBuilder.append(this.value);
        stringBuilder.append(str);
        stringBuilder.append("actualExpire=");
        stringBuilder.append(this.bpg);
        stringBuilder.append(str);
        stringBuilder.append("expirationValue=");
        stringBuilder.append(this.bph);
        stringBuilder.append(str);
        stringBuilder.append("result=");
        stringBuilder.append(this.bpi);
        stringBuilder.append(str);
        stringBuilder.append("profitAmount=");
        stringBuilder.append(this.bpj);
        stringBuilder.append(str);
        stringBuilder.append("index=");
        stringBuilder.append(this.index);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
