package com.iqoption.core.microservices.portfolio.response;

import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.core.Platform;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.binaryoptions.response.b;
import com.iqoption.core.microservices.tradingengine.response.position.CloseReason;
import com.iqoption.core.microservices.tradingengine.response.position.TradingPosition;
import com.iqoption.dto.entity.position.Position;
import kotlin.TypeCastException;
import kotlin.i;

@JsonAdapter(JsonAdapterFactory.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002STB÷\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0014\u0012\b\b\u0002\u0010 \u001a\u00020\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\"J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010Q\u001a\u00020\fH\u0016J\b\u0010R\u001a\u00020\u0003H\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u001f\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010 \u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u001b\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0011\u00106\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u00104R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u001a\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bH\u0010.R\u0011\u0010\u0019\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0011\u0010\u0018\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bK\u0010.R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u00104R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u00104¨\u0006U"}, bng = {"Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition;", "", "id", "", "userId", "", "userBalanceId", "platform", "Lcom/iqoption/core/Platform;", "externalId", "source", "activeId", "", "instrumentId", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "status", "Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition$Status;", "openTime", "openQuote", "", "invest", "investEnrolled", "takeProfitPrice", "takeProfitPercent", "stopLossPrice", "stopLossPercent", "closeQuote", "closeReason", "Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason;", "closeTime", "closeProfit", "closeProfitEnrolled", "rawEvent", "(Ljava/lang/String;JJLcom/iqoption/core/Platform;JLjava/lang/String;ILjava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition$Status;JDDDDDDDDLcom/iqoption/core/microservices/tradingengine/response/position/CloseReason;JDDLjava/lang/Object;)V", "getActiveId", "()I", "asTradingOption", "Lcom/iqoption/core/microservices/binaryoptions/response/TradingOption;", "getAsTradingOption", "()Lcom/iqoption/core/microservices/binaryoptions/response/TradingOption;", "asTradingPosition", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "getAsTradingPosition", "()Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "getCloseProfit", "()D", "getCloseProfitEnrolled", "getCloseQuote", "getCloseReason", "()Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason;", "getCloseTime", "()J", "getExternalId", "hash", "getHash", "getId", "()Ljava/lang/String;", "getInstrumentId", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getInvest", "getInvestEnrolled", "getOpenQuote", "getOpenTime", "getPlatform", "()Lcom/iqoption/core/Platform;", "getRawEvent", "()Ljava/lang/Object;", "getSource", "getStatus", "()Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition$Status;", "getStopLossPercent", "getStopLossPrice", "getTakeProfitPercent", "getTakeProfitPrice", "getUserBalanceId", "getUserId", "equals", "", "other", "hashCode", "toString", "JsonAdapterFactory", "Status", "core_release"})
/* compiled from: PortfolioPosition.kt */
public final class PortfolioPosition {
    private final int activeId;
    private final double auh;
    private final long boY;
    private final Platform bpa;
    private final long bpe;
    private final String bth;
    private final long bwR;
    private final long bwS;
    private final Status bwT;
    private final double bwU;
    private final double bwV;
    private final double bwW;
    private final double bwX;
    private final double bwY;
    private final double bwZ;
    private final double bxa;
    private final CloseReason bxb;
    private final long bxc;
    private final double bxd;
    private final double bxe;
    private final transient Object bxf;
    private final String id;
    private final String instrumentId;
    private final InstrumentType instrumentType;
    private final long userId;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition$Status;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "UNKNOWN", "OPEN", "CLOSED", "Companion", "core_release"})
    /* compiled from: PortfolioPosition.kt */
    public enum Status {
        UNKNOWN("_unknown"),
        OPEN(Position.STATUS_OPEN),
        CLOSED(Position.STATUS_CLOSED);
        
        public static final a Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition$Status$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition$Status;", "value", "", "core_release"})
        /* compiled from: PortfolioPosition.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final Status gO(String str) {
                for (Status status : Status.values()) {
                    if (kotlin.jvm.internal.i.y(status.serverValue, str)) {
                        break;
                    }
                }
                Status status2 = null;
                return status2 != null ? status2 : Status.UNKNOWN;
            }
        }

        private Status(String str) {
            this.serverValue = str;
        }

        static {
            Companion = new a();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\tH\u0016¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition$JsonAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "()V", "create", "Lcom/google/gson/TypeAdapter;", "T", "gson", "Lcom/google/gson/Gson;", "type", "Lcom/google/gson/reflect/TypeToken;", "core_release"})
    /* compiled from: PortfolioPosition.kt */
    public static final class JsonAdapterFactory implements TypeAdapterFactory {

        @i(bne = {1, 1, 15}, bnf = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0017\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, bng = {"com/iqoption/core/microservices/portfolio/response/PortfolioPosition$JsonAdapterFactory$create$1", "Lcom/google/gson/TypeAdapter;", "getRawEventTypeAdapter", "T", "gson", "Lcom/google/gson/Gson;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V", "core_release"})
        /* compiled from: PortfolioPosition.kt */
        public static final class a extends TypeAdapter<T> {
            final /* synthetic */ TypeAdapter blU;
            final /* synthetic */ Gson blV;

            a(TypeAdapter typeAdapter, Gson gson) {
                this.blU = typeAdapter;
                this.blV = gson;
            }

            public void write(JsonWriter jsonWriter, T t) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                PortfolioPosition portfolioPosition = (PortfolioPosition) (!(t instanceof PortfolioPosition) ? null : t);
                if (portfolioPosition != null) {
                    this.blU.write(jsonWriter, t);
                    a(this.blV, portfolioPosition.getInstrumentType()).write(jsonWriter, portfolioPosition.ags());
                }
            }

            public T read(com.google.gson.stream.JsonReader r58) {
                /*
                r57 = this;
                r0 = r57;
                r1 = r58;
                r2 = "reader";
                kotlin.jvm.internal.i.f(r1, r2);
                r2 = com.iqoption.core.Platform.UNKNOWN;
                r3 = com.iqoption.core.data.model.InstrumentType.UNKNOWN;
                r4 = com.iqoption.core.microservices.portfolio.response.PortfolioPosition.Status.UNKNOWN;
                r5 = com.iqoption.core.microservices.tradingengine.response.position.CloseReason.UNKNOWN;
                r58.beginObject();
                r6 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
                r8 = 0;
                r10 = -1;
                r12 = "";
                r13 = 0;
                r15 = -1;
                r16 = 0;
                r23 = r2;
                r30 = r4;
                r49 = r5;
                r39 = r6;
                r43 = r39;
                r31 = r8;
                r50 = r31;
                r19 = r10;
                r21 = r19;
                r24 = r21;
                r18 = r12;
                r26 = r18;
                r28 = r26;
                r33 = r13;
                r35 = r33;
                r37 = r35;
                r41 = r37;
                r45 = r41;
                r47 = r45;
                r52 = r47;
                r54 = r52;
                r56 = r16;
                r27 = -1;
            L_0x004f:
                r2 = r58.hasNext();
                if (r2 == 0) goto L_0x024f;
            L_0x0055:
                r2 = r58.nextName();
                r4 = r58.peek();
                if (r2 != 0) goto L_0x0061;
            L_0x005f:
                goto L_0x024a;
            L_0x0061:
                r5 = r2.hashCode();
                r6 = "reader.nextString()";
                switch(r5) {
                    case -2061555532: goto L_0x0231;
                    case -1590496686: goto L_0x0220;
                    case -1582051389: goto L_0x0201;
                    case -1281083797: goto L_0x01e8;
                    case -1236235669: goto L_0x01c9;
                    case -1183703051: goto L_0x01b9;
                    case -1153075697: goto L_0x01a9;
                    case -896505829: goto L_0x0196;
                    case -892481550: goto L_0x0180;
                    case -147132913: goto L_0x016f;
                    case -87375665: goto L_0x015f;
                    case 3355: goto L_0x014c;
                    case 204492020: goto L_0x013c;
                    case 434739270: goto L_0x012b;
                    case 513877365: goto L_0x0112;
                    case 542719122: goto L_0x00fd;
                    case 689465415: goto L_0x00ed;
                    case 711123512: goto L_0x00dd;
                    case 808747010: goto L_0x00cc;
                    case 1114345241: goto L_0x00b5;
                    case 1234636796: goto L_0x00a6;
                    case 1251954791: goto L_0x008d;
                    case 1546339234: goto L_0x007e;
                    case 1864249459: goto L_0x006c;
                    default: goto L_0x006a;
                };
            L_0x006a:
                goto L_0x024a;
            L_0x006c:
                r4 = "instrument_id";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0074:
                r2 = r58.nextString();
                kotlin.jvm.internal.i.e(r2, r6);
                r28 = r2;
                goto L_0x004f;
            L_0x007e:
                r4 = "open_time";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0086:
                r4 = r58.nextLong();
                r31 = r4;
                goto L_0x004f;
            L_0x008d:
                r4 = "platform_id";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0095:
                r2 = com.iqoption.core.Platform.Companion;
                r4 = r58.nextInt();
                r4 = java.lang.Integer.valueOf(r4);
                r2 = r2.fromServerId(r4);
                r23 = r2;
                goto L_0x004f;
            L_0x00a6:
                r4 = "stop_lose_price";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x00ae:
                r4 = r58.nextDouble();
                r43 = r4;
                goto L_0x004f;
            L_0x00b5:
                r5 = "close_profit_enrolled";
                r2 = r2.equals(r5);
                if (r2 == 0) goto L_0x024a;
            L_0x00bd:
                r2 = com.google.gson.stream.JsonToken.NUMBER;
                if (r4 != r2) goto L_0x00c8;
            L_0x00c1:
                r4 = r58.nextDouble();
                r54 = r4;
                goto L_0x004f;
            L_0x00c8:
                r58.skipValue();
                goto L_0x004f;
            L_0x00cc:
                r4 = "take_profit_percent";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x00d5:
                r4 = r58.nextDouble();
                r41 = r4;
                goto L_0x004f;
            L_0x00dd:
                r4 = "stop_lose_percent";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x00e5:
                r4 = r58.nextDouble();
                r45 = r4;
                goto L_0x004f;
            L_0x00ed:
                r4 = "open_quote";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x00f5:
                r4 = r58.nextDouble();
                r33 = r4;
                goto L_0x004f;
            L_0x00fd:
                r4 = "instrument_type";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0105:
                r2 = com.iqoption.core.data.model.InstrumentType.Companion;
                r3 = r58.nextString();
                r2 = r2.fromServerValue(r3);
                r3 = r2;
                goto L_0x004f;
            L_0x0112:
                r5 = "close_quote";
                r2 = r2.equals(r5);
                if (r2 == 0) goto L_0x024a;
            L_0x011a:
                r2 = com.google.gson.stream.JsonToken.NUMBER;
                if (r4 != r2) goto L_0x0126;
            L_0x011e:
                r4 = r58.nextDouble();
                r47 = r4;
                goto L_0x004f;
            L_0x0126:
                r58.skipValue();
                goto L_0x004f;
            L_0x012b:
                r4 = "take_profit_price";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0134:
                r4 = r58.nextDouble();
                r39 = r4;
                goto L_0x004f;
            L_0x013c:
                r4 = "active_id";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0144:
                r2 = r58.nextInt();
                r27 = r2;
                goto L_0x004f;
            L_0x014c:
                r4 = "id";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0154:
                r2 = r58.nextString();
                kotlin.jvm.internal.i.e(r2, r6);
                r18 = r2;
                goto L_0x004f;
            L_0x015f:
                r4 = "invest_enrolled";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0167:
                r4 = r58.nextDouble();
                r37 = r4;
                goto L_0x004f;
            L_0x016f:
                r4 = "user_id";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0178:
                r4 = r58.nextLong();
                r19 = r4;
                goto L_0x004f;
            L_0x0180:
                r4 = "status";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0188:
                r2 = com.iqoption.core.microservices.portfolio.response.PortfolioPosition.Status.Companion;
                r4 = r58.nextString();
                r2 = r2.gO(r4);
                r30 = r2;
                goto L_0x004f;
            L_0x0196:
                r4 = "source";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x019e:
                r2 = r58.nextString();
                kotlin.jvm.internal.i.e(r2, r6);
                r26 = r2;
                goto L_0x004f;
            L_0x01a9:
                r4 = "external_id";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x01b1:
                r4 = r58.nextLong();
                r24 = r4;
                goto L_0x004f;
            L_0x01b9:
                r4 = "invest";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x01c1:
                r4 = r58.nextDouble();
                r35 = r4;
                goto L_0x004f;
            L_0x01c9:
                r5 = "close_reason";
                r2 = r2.equals(r5);
                if (r2 == 0) goto L_0x024a;
            L_0x01d1:
                r2 = com.google.gson.stream.JsonToken.STRING;
                if (r4 != r2) goto L_0x01e3;
            L_0x01d5:
                r2 = com.iqoption.core.microservices.tradingengine.response.position.CloseReason.Companion;
                r4 = r58.nextString();
                r2 = r2.fromServerValue(r4);
                r49 = r2;
                goto L_0x004f;
            L_0x01e3:
                r58.skipValue();
                goto L_0x004f;
            L_0x01e8:
                r5 = "close_profit";
                r2 = r2.equals(r5);
                if (r2 == 0) goto L_0x024a;
            L_0x01f0:
                r2 = com.google.gson.stream.JsonToken.NUMBER;
                if (r4 != r2) goto L_0x01fc;
            L_0x01f4:
                r4 = r58.nextDouble();
                r52 = r4;
                goto L_0x004f;
            L_0x01fc:
                r58.skipValue();
                goto L_0x004f;
            L_0x0201:
                r5 = "raw_event";
                r2 = r2.equals(r5);
                if (r2 == 0) goto L_0x024a;
            L_0x0209:
                r2 = com.google.gson.stream.JsonToken.BEGIN_OBJECT;
                if (r4 != r2) goto L_0x021b;
            L_0x020d:
                r2 = r0.blV;
                r2 = r0.a(r2, r3);
                r2 = r2.read(r1);
                r56 = r2;
                goto L_0x004f;
            L_0x021b:
                r58.skipValue();
                goto L_0x004f;
            L_0x0220:
                r4 = "user_balance_id";
                r2 = r2.equals(r4);
                if (r2 == 0) goto L_0x024a;
            L_0x0229:
                r4 = r58.nextLong();
                r21 = r4;
                goto L_0x004f;
            L_0x0231:
                r5 = "close_time";
                r2 = r2.equals(r5);
                if (r2 == 0) goto L_0x024a;
            L_0x0239:
                r2 = com.google.gson.stream.JsonToken.NUMBER;
                if (r4 != r2) goto L_0x0245;
            L_0x023d:
                r4 = r58.nextLong();
                r50 = r4;
                goto L_0x004f;
            L_0x0245:
                r58.skipValue();
                goto L_0x004f;
            L_0x024a:
                r58.skipValue();
                goto L_0x004f;
            L_0x024f:
                r58.endObject();
                r1 = new com.iqoption.core.microservices.portfolio.response.PortfolioPosition;
                r17 = r1;
                r29 = r3;
                r17.<init>(r18, r19, r21, r23, r24, r26, r27, r28, r29, r30, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r50, r52, r54, r56);
                r1 = (java.lang.Object) r1;
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.portfolio.response.PortfolioPosition$JsonAdapterFactory$a.read(com.google.gson.stream.JsonReader):java.lang.Object");
            }

            private final <T> TypeAdapter<T> a(Gson gson, InstrumentType instrumentType) {
                Class cls;
                int i = b.aob[instrumentType.ordinal()];
                if (i == 1 || i == 2) {
                    cls = b.class;
                } else {
                    cls = TradingPosition.class;
                }
                TypeAdapter adapter = gson.getAdapter(cls);
                if (adapter != null) {
                    return adapter;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.google.gson.TypeAdapter<T>");
            }
        }

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            kotlin.jvm.internal.i.f(gson, "gson");
            kotlin.jvm.internal.i.f(typeToken, "type");
            TypeAdapter nullSafe = new a(gson.getDelegateAdapter(this, typeToken), gson).nullSafe();
            kotlin.jvm.internal.i.e(nullSafe, "object : TypeAdapter<T>(…\n            }.nullSafe()");
            return nullSafe;
        }
    }

    public PortfolioPosition() {
        this(null, 0, 0, null, 0, null, 0, null, null, null, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0, 0.0d, 0.0d, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    public PortfolioPosition(String str, long j, long j2, Platform platform, long j3, String str2, int i, String str3, InstrumentType instrumentType, Status status, long j4, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CloseReason closeReason, long j5, double d9, double d10, Object obj) {
        String str4 = str;
        Platform platform2 = platform;
        String str5 = str2;
        String str6 = str3;
        InstrumentType instrumentType2 = instrumentType;
        Status status2 = status;
        CloseReason closeReason2 = closeReason;
        kotlin.jvm.internal.i.f(str, "id");
        kotlin.jvm.internal.i.f(platform2, "platform");
        kotlin.jvm.internal.i.f(str5, "source");
        kotlin.jvm.internal.i.f(str6, "instrumentId");
        kotlin.jvm.internal.i.f(instrumentType2, "instrumentType");
        kotlin.jvm.internal.i.f(status2, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.i.f(closeReason2, "closeReason");
        this.id = str4;
        this.userId = j;
        this.bwR = j2;
        this.bpa = platform2;
        this.bwS = j3;
        this.bth = str5;
        this.activeId = i;
        this.instrumentId = str6;
        this.instrumentType = instrumentType2;
        this.bwT = status2;
        this.bpe = j4;
        this.bwU = d;
        this.auh = d2;
        this.bwV = d3;
        this.bwW = d4;
        this.bwX = d5;
        this.bwY = d6;
        this.bwZ = d7;
        this.bxa = d8;
        this.bxb = closeReason2;
        this.bxc = j5;
        this.bxd = d9;
        this.bxe = d10;
        this.bxf = obj;
        this.boY = System.currentTimeMillis();
    }

    public final String getId() {
        return this.id;
    }

    public final long getUserBalanceId() {
        return this.bwR;
    }

    public /* synthetic */ PortfolioPosition(String str, long j, long j2, Platform platform, long j3, String str2, int i, String str3, InstrumentType instrumentType, Status status, long j4, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CloseReason closeReason, long j5, double d9, double d10, Object obj, int i2, f fVar) {
        int i3 = i2;
        String str4 = "";
        String str5 = (i3 & 1) != 0 ? str4 : str;
        long j6 = -1;
        long j7 = (i3 & 2) != 0 ? -1 : j;
        long j8 = (i3 & 4) != 0 ? -1 : j2;
        Platform platform2 = (i3 & 8) != 0 ? Platform.UNKNOWN : platform;
        if ((i3 & 16) == 0) {
            j6 = j3;
        }
        String str6 = (i3 & 32) != 0 ? str4 : str2;
        int i4 = (i3 & 64) != 0 ? -1 : i;
        if ((i3 & 128) == 0) {
            str4 = str3;
        }
        InstrumentType instrumentType2 = (i3 & 256) != 0 ? InstrumentType.UNKNOWN : instrumentType;
        Status status2 = (i3 & 512) != 0 ? Status.UNKNOWN : status;
        long j9 = 0;
        long j10 = (i3 & 1024) != 0 ? 0 : j4;
        double d11 = 0.0d;
        double d12 = (i3 & 2048) != 0 ? 0.0d : d;
        double d13 = (i3 & 4096) != 0 ? 0.0d : d2;
        double d14 = (i3 & 8192) != 0 ? 0.0d : d3;
        double d15 = -1.0d;
        double d16 = (i3 & 16384) != 0 ? -1.0d : d4;
        double d17 = (32768 & i3) != 0 ? 0.0d : d5;
        if ((65536 & i3) == 0) {
            d15 = d6;
        }
        double d18 = (131072 & i3) != 0 ? 0.0d : d7;
        double d19 = (262144 & i3) != 0 ? 0.0d : d8;
        CloseReason closeReason2 = (524288 & i3) != 0 ? CloseReason.UNKNOWN : closeReason;
        if ((i3 & 1048576) == 0) {
            j9 = j5;
        }
        double d20 = (i3 & 2097152) != 0 ? 0.0d : d9;
        if ((i3 & 4194304) == 0) {
            d11 = d10;
        }
        this(str5, j7, j8, platform2, j6, str6, i4, str4, instrumentType2, status2, j10, d12, d13, d14, d16, d17, d15, d18, d19, closeReason2, j9, d20, d11, (i3 & 8388608) != 0 ? null : obj);
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final long abl() {
        return this.bpe;
    }

    public final double ago() {
        return this.bwU;
    }

    public final double getInvest() {
        return this.auh;
    }

    public final double agp() {
        return this.bxa;
    }

    public final CloseReason agq() {
        return this.bxb;
    }

    public final long getCloseTime() {
        return this.bxc;
    }

    public final double agr() {
        return this.bxd;
    }

    public final Object ags() {
        return this.bxf;
    }

    public final b agm() {
        Object obj = this.bxf;
        if (!(obj instanceof b)) {
            obj = null;
        }
        return (b) obj;
    }

    public final TradingPosition agn() {
        Object obj = this.bxf;
        if (!(obj instanceof TradingPosition)) {
            obj = null;
        }
        return (TradingPosition) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            PortfolioPosition portfolioPosition = (PortfolioPosition) obj;
            if ((kotlin.jvm.internal.i.y(this.id, portfolioPosition.id) ^ 1) == 0 && this.userId == portfolioPosition.userId && this.bwR == portfolioPosition.bwR && this.bpa == portfolioPosition.bpa && this.bwS == portfolioPosition.bwS && (kotlin.jvm.internal.i.y(this.bth, portfolioPosition.bth) ^ 1) == 0 && this.activeId == portfolioPosition.activeId && (kotlin.jvm.internal.i.y(this.instrumentId, portfolioPosition.instrumentId) ^ 1) == 0 && this.instrumentType == portfolioPosition.instrumentType && this.bwT == portfolioPosition.bwT && this.bpe == portfolioPosition.bpe && this.bwU == portfolioPosition.bwU && this.auh == portfolioPosition.auh && this.bwV == portfolioPosition.bwV && this.bwW == portfolioPosition.bwW && this.bwX == portfolioPosition.bwX && this.bwY == portfolioPosition.bwY && this.bwZ == portfolioPosition.bwZ && this.bxa == portfolioPosition.bxa && this.bxb == portfolioPosition.bxb && this.bxc == portfolioPosition.bxc && this.bxd == portfolioPosition.bxd && this.bxe == portfolioPosition.bxe && (kotlin.jvm.internal.i.y(this.bxf, portfolioPosition.bxf) ^ 1) == 0) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.portfolio.response.PortfolioPosition");
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + Long.valueOf(this.userId).hashCode()) * 31) + Long.valueOf(this.bwR).hashCode()) * 31) + this.bpa.hashCode()) * 31) + Long.valueOf(this.bwS).hashCode()) * 31) + this.bth.hashCode()) * 31) + this.activeId) * 31) + this.instrumentId.hashCode()) * 31) + this.instrumentType.hashCode()) * 31) + this.bwT.hashCode()) * 31) + Long.valueOf(this.bpe).hashCode()) * 31) + Double.valueOf(this.bwU).hashCode()) * 31) + Double.valueOf(this.auh).hashCode()) * 31) + Double.valueOf(this.bwV).hashCode()) * 31) + Double.valueOf(this.bwW).hashCode()) * 31) + Double.valueOf(this.bwX).hashCode()) * 31) + Double.valueOf(this.bwY).hashCode()) * 31) + Double.valueOf(this.bwZ).hashCode()) * 31) + Double.valueOf(this.bxa).hashCode()) * 31) + this.bxb.hashCode()) * 31) + Long.valueOf(this.bxc).hashCode()) * 31) + Double.valueOf(this.bxd).hashCode()) * 31) + Double.valueOf(this.bxe).hashCode()) * 31;
        Object obj = this.bxf;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PortfolioPosition(");
        stringBuilder.append("id='");
        stringBuilder.append(this.id);
        String str = "', ";
        stringBuilder.append(str);
        stringBuilder.append("userId=");
        stringBuilder.append(this.userId);
        String str2 = ", ";
        stringBuilder.append(str2);
        stringBuilder.append("userBalanceId=");
        stringBuilder.append(this.bwR);
        stringBuilder.append(str2);
        stringBuilder.append("platform=");
        stringBuilder.append(this.bpa);
        stringBuilder.append(str2);
        stringBuilder.append("externalId=");
        stringBuilder.append(this.bwS);
        stringBuilder.append(str2);
        stringBuilder.append("source='");
        stringBuilder.append(this.bth);
        stringBuilder.append(str);
        stringBuilder.append("activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(str2);
        stringBuilder.append("instrumentId='");
        stringBuilder.append(this.instrumentId);
        stringBuilder.append(str);
        stringBuilder.append("instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(str2);
        stringBuilder.append("status=");
        stringBuilder.append(this.bwT);
        stringBuilder.append(str2);
        stringBuilder.append("openTime=");
        stringBuilder.append(this.bpe);
        stringBuilder.append(str2);
        stringBuilder.append("openQuote=");
        stringBuilder.append(this.bwU);
        stringBuilder.append(str2);
        stringBuilder.append("invest=");
        stringBuilder.append(this.auh);
        stringBuilder.append(str2);
        stringBuilder.append("investEnrolled=");
        stringBuilder.append(this.bwV);
        stringBuilder.append(str2);
        stringBuilder.append("takeProfitPrice=");
        stringBuilder.append(this.bwW);
        stringBuilder.append(str2);
        stringBuilder.append("takeProfitPercent=");
        stringBuilder.append(this.bwX);
        stringBuilder.append(str2);
        stringBuilder.append("stopLossPrice=");
        stringBuilder.append(this.bwY);
        stringBuilder.append(str2);
        stringBuilder.append("stopLossPercent=");
        stringBuilder.append(this.bwZ);
        stringBuilder.append(str2);
        stringBuilder.append("closeQuote=");
        stringBuilder.append(this.bxa);
        stringBuilder.append(str2);
        stringBuilder.append("closeReason=");
        stringBuilder.append(this.bxb);
        stringBuilder.append(str2);
        stringBuilder.append("closeTime=");
        stringBuilder.append(this.bxc);
        stringBuilder.append(str2);
        stringBuilder.append("closeProfit=");
        stringBuilder.append(this.bxd);
        stringBuilder.append(str2);
        stringBuilder.append("closeProfitEnrolled=");
        stringBuilder.append(this.bxe);
        stringBuilder.append(str2);
        stringBuilder.append("rawEvent=");
        stringBuilder.append(this.bxf);
        stringBuilder.append(str2);
        stringBuilder.append("hash=");
        stringBuilder.append(this.boY);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
