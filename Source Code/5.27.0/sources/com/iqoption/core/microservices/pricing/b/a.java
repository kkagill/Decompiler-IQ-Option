package com.iqoption.core.microservices.pricing.b;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.position.PendingOrderWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 .2\u00020\u0001:\u0004./01B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003JU\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\fJ\t\u0010-\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017¨\u00062"}, bng = {"Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote;", "", "()V", "activeId", "", "expiration", "Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Expiration;", "instant", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "quotes", "", "Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$QuoteUpdate;", "timestamp", "", "underlying", "(ILcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Expiration;Ljava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;Ljava/util/List;JLjava/lang/String;)V", "getActiveId", "()I", "getExpiration", "()Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Expiration;", "getInstant", "()Ljava/lang/String;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getQuotes", "()Ljava/util/List;", "getTimestamp", "()J", "getUnderlying", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toOptionQuotes", "Lcom/iqoption/core/microservices/tradingengine/response/OptionQuote;", "toString", "Companion", "Expiration", "Price", "QuoteUpdate", "core_release"})
/* compiled from: InstrumentQuote.kt */
public final class a {
    private static final b bxr = new b();
    private static final c bxs = new c();
    @Deprecated
    public static final a bxt = new a();
    @SerializedName("active")
    private final int activeId;
    @SerializedName("expiration")
    private final b bxo;
    @SerializedName("instant")
    private final String bxp;
    @SerializedName("quotes")
    private final List<d> bxq;
    @SerializedName("kind")
    private final InstrumentType instrumentType;
    @SerializedName("timestamp")
    private final long timestamp;
    @SerializedName("underlying")
    private final String underlying;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Companion;", "", "()V", "EMPTY_EXPIRATION", "Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Expiration;", "getEMPTY_EXPIRATION", "()Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Expiration;", "EMPTY_PRICE", "Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Price;", "getEMPTY_PRICE", "()Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Price;", "core_release"})
    /* compiled from: InstrumentQuote.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c agE() {
            return a.bxs;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Expiration;", "", "()V", "instant", "", "period", "", "timestamp", "", "(Ljava/lang/String;IJ)V", "getInstant", "()Ljava/lang/String;", "getPeriod", "()I", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_release"})
    /* compiled from: InstrumentQuote.kt */
    public static final class b {
        @SerializedName("instant")
        private final String bxp;
        @SerializedName("period")
        private final int period;
        @SerializedName("timestamp")
        private final long timestamp;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (kotlin.jvm.internal.i.y(this.bxp, bVar.bxp)) {
                        if ((this.period == bVar.period ? 1 : null) != null) {
                            if ((this.timestamp == bVar.timestamp ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.bxp;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.period) * 31;
            long j = this.timestamp;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expiration(instant=");
            stringBuilder.append(this.bxp);
            stringBuilder.append(", period=");
            stringBuilder.append(this.period);
            stringBuilder.append(", timestamp=");
            stringBuilder.append(this.timestamp);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(String str, int i, long j) {
            kotlin.jvm.internal.i.f(str, "instant");
            this.bxp = str;
            this.period = i;
            this.timestamp = j;
        }

        public final int agF() {
            return this.period;
        }

        public /* synthetic */ b(String str, int i, long j, int i2, f fVar) {
            if ((i2 & 1) != 0) {
                str = "";
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                j = 0;
            }
            this(str, i, j);
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public b() {
            this("", 0, 0, 6, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Price;", "", "()V", "ask", "", "bid", "(DD)V", "getAsk", "()D", "getBid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
    /* compiled from: InstrumentQuote.kt */
    public static final class c {
        @SerializedName("ask")
        private final double ask;
        @SerializedName("bid")
        private final double bid;

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (java.lang.Double.compare(r4.bid, r5.bid) == 0) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r5) {
            /*
            r4 = this;
            if (r4 == r5) goto L_0x001f;
        L_0x0002:
            r0 = r5 instanceof com.iqoption.core.microservices.pricing.b.a.c;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r5 = (com.iqoption.core.microservices.pricing.b.a.c) r5;
            r0 = r4.ask;
            r2 = r5.ask;
            r0 = java.lang.Double.compare(r0, r2);
            if (r0 != 0) goto L_0x001d;
        L_0x0012:
            r0 = r4.bid;
            r2 = r5.bid;
            r5 = java.lang.Double.compare(r0, r2);
            if (r5 != 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r5 = 0;
            return r5;
        L_0x001f:
            r5 = 1;
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.pricing.b.a$c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.ask);
            int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
            long doubleToLongBits2 = Double.doubleToLongBits(this.bid);
            return i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Price(ask=");
            stringBuilder.append(this.ask);
            stringBuilder.append(", bid=");
            stringBuilder.append(this.bid);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public c(double d, double d2) {
            this.ask = d;
            this.bid = d2;
        }

        public final double agG() {
            return this.ask;
        }

        public /* synthetic */ c(double d, double d2, int i, f fVar) {
            if ((i & 1) != 0) {
                d = 0.0d;
            }
            if ((i & 2) != 0) {
                d2 = 0.0d;
            }
            this(d, d2);
        }

        public final double agH() {
            return this.bid;
        }

        public c() {
            this(0.0d, 0.0d, 2, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$QuoteUpdate;", "", "()V", "price", "Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Price;", "symbols", "", "", "(Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Price;Ljava/util/List;)V", "getPrice", "()Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote$Price;", "getSymbols", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"})
    /* compiled from: InstrumentQuote.kt */
    public static final class d {
        @SerializedName("price")
        private final c bxu;
        @SerializedName("symbols")
        private final List<String> bxv;

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bxv, r3.bxv) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.core.microservices.pricing.b.a.d;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (com.iqoption.core.microservices.pricing.b.a.d) r3;
            r0 = r2.bxu;
            r1 = r3.bxu;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.bxv;
            r3 = r3.bxv;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.pricing.b.a$d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            c cVar = this.bxu;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            List list = this.bxv;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("QuoteUpdate(price=");
            stringBuilder.append(this.bxu);
            stringBuilder.append(", symbols=");
            stringBuilder.append(this.bxv);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public d(c cVar, List<String> list) {
            kotlin.jvm.internal.i.f(cVar, PendingOrderWrapper.PRICE);
            kotlin.jvm.internal.i.f(list, "symbols");
            this.bxu = cVar;
            this.bxv = list;
        }

        public /* synthetic */ d(c cVar, List list, int i, f fVar) {
            if ((i & 1) != 0) {
                cVar = a.bxt.agE();
            }
            if ((i & 2) != 0) {
                list = m.emptyList();
            }
            this(cVar, list);
        }

        public final c agI() {
            return this.bxu;
        }

        public final List<String> agJ() {
            return this.bxv;
        }

        public d() {
            this(a.bxt.agE(), null, 2, null);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.activeId == aVar.activeId ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bxo, aVar.bxo) && kotlin.jvm.internal.i.y(this.bxp, aVar.bxp) && kotlin.jvm.internal.i.y(this.instrumentType, aVar.instrumentType) && kotlin.jvm.internal.i.y(this.bxq, aVar.bxq)) {
                    if ((this.timestamp == aVar.timestamp ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.underlying, aVar.underlying)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.activeId * 31;
        b bVar = this.bxo;
        int i2 = 0;
        i = (i + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.bxp;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        InstrumentType instrumentType = this.instrumentType;
        i = (i + (instrumentType != null ? instrumentType.hashCode() : 0)) * 31;
        List list = this.bxq;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        long j = this.timestamp;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        str = this.underlying;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstrumentQuote(activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", expiration=");
        stringBuilder.append(this.bxo);
        stringBuilder.append(", instant=");
        stringBuilder.append(this.bxp);
        stringBuilder.append(", instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", quotes=");
        stringBuilder.append(this.bxq);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", underlying=");
        stringBuilder.append(this.underlying);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(int i, b bVar, String str, InstrumentType instrumentType, List<d> list, long j, String str2) {
        kotlin.jvm.internal.i.f(bVar, "expiration");
        kotlin.jvm.internal.i.f(str, "instant");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(list, "quotes");
        kotlin.jvm.internal.i.f(str2, "underlying");
        this.activeId = i;
        this.bxo = bVar;
        this.bxp = str;
        this.instrumentType = instrumentType;
        this.bxq = list;
        this.timestamp = j;
        this.underlying = str2;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public /* synthetic */ a(int i, b bVar, String str, InstrumentType instrumentType, List list, long j, String str2, int i2, f fVar) {
        int i3 = (i2 & 1) != 0 ? -1 : i;
        b bVar2 = (i2 & 2) != 0 ? bxr : bVar;
        String str3 = "";
        String str4 = (i2 & 4) != 0 ? str3 : str;
        InstrumentType instrumentType2 = (i2 & 8) != 0 ? InstrumentType.UNKNOWN : instrumentType;
        List emptyList = (i2 & 16) != 0 ? m.emptyList() : list;
        long j2 = (i2 & 32) != 0 ? 0 : j;
        if ((i2 & 64) == 0) {
            str3 = str2;
        }
        this(i3, bVar2, str4, instrumentType2, emptyList, j2, str3);
    }

    public final b agA() {
        return this.bxo;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final String agB() {
        return this.underlying;
    }

    public a() {
        this(-1, null, null, null, null, 0, null, 126, null);
    }

    public final List<com.iqoption.core.microservices.tradingengine.response.a> agz() {
        List arrayList = new ArrayList();
        for (d dVar : this.bxq) {
            for (String aVar : dVar.agJ()) {
                arrayList.add(new com.iqoption.core.microservices.tradingengine.response.a(aVar, null, this.instrumentType, 0, 0, dVar.agI().agH(), 0, 0, dVar.agI().agG(), 0.0d, 730, null));
            }
        }
        return arrayList;
    }
}
