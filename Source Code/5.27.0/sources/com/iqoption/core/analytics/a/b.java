package com.iqoption.core.analytics.a;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.google.common.util.concurrent.x;
import com.google.gson.JsonObject;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import io.reactivex.p;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00059:;<=B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J.\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0007J\"\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015J9\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010\u001fJ2\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0015J(\u0010%\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J6\u0010&\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070(2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015J/\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010,J\u001e\u0010-\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J&\u0010.\u001a\u00020\n2\n\u0010/\u001a\u0006\u0012\u0002\b\u0003002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020302J\u001a\u00104\u001a\u00020\n2\n\u00105\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010\u000b\u001a\u00020\u001eJ(\u00106\u001a\b\u0012\u0004\u0012\u0002H70!\"\u0004\b\u0000\u001072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H70!2\u0006\u0010\f\u001a\u00020\rJ(\u00108\u001a\b\u0012\u0004\u0012\u0002H70!\"\u0004\b\u0000\u001072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H70!2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, bng = {"Lcom/iqoption/core/analytics/sla/TradingSla;", "", "()V", "analytics", "Lcom/iqoption/core/analytics/IQAnalytics;", "sentCreatedPositions", "", "", "sentOrderCreated", "absentExpiration", "", "activeId", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "expirationPeriod", "createClosePositionEvent", "Lcom/iqoption/core/analytics/AnalyticsEvent;", "openPosition", "isBuy", "", "externalId", "", "balanceType", "orderCreated", "orderId", "status", "rejectStatus", "placeOrderTempErrorResponse", "error", "statusCode", "", "(JLjava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;Ljava/lang/String;Ljava/lang/Integer;)V", "placeOrderTempResponse", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/tradingengine/response/order/PlaceOrderResult;", "single", "requestId", "placeOrderTempSuccessResponse", "positionCreated", "orderIds", "", "positionId", "sendClosePositionErrorEvent", "event", "(Lcom/iqoption/core/analytics/AnalyticsEvent;JLjava/lang/String;Ljava/lang/Integer;)V", "sendClosePositionSuccessEvent", "track", "request", "Lcom/google/common/util/concurrent/ListenableFuture;", "consumer", "Lio/reactivex/functions/BiConsumer;", "", "trackGetFirstCandles", "future", "trackGetInstruments", "T", "trackGetUnderlyingList", "DocumentTrack", "DocumentTrackInstrument", "DocumentTrackOpenOption", "DocumentTrackStrike", "DocumentTrackUnderlying", "core_release"})
/* compiled from: TradingSla.kt */
public final class b {
    private static final com.iqoption.core.analytics.d aZI = com.iqoption.core.d.Um().EC();
    private static final Set<Long> aZJ = new LinkedHashSet();
    private static final Set<Long> aZK = new LinkedHashSet();
    public static final b aZL = new b();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/analytics/sla/TradingSla$DocumentTrackUnderlying;", "Lcom/iqoption/core/rx/BaseBiConsumer;", "", "eventName", "", "activeId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "(Ljava/lang/String;ILcom/iqoption/core/data/model/InstrumentType;)V", "getActiveId", "()I", "event", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "onFailure", "", "t", "", "onSuccess", "value", "core_release"})
    /* compiled from: TradingSla.kt */
    public static final class e implements com.iqoption.core.rx.a<Object> {
        private final com.iqoption.core.analytics.b aZM;
        private final int activeId;
        private final InstrumentType instrumentType;

        public e(String str, int i, InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(str, "eventName");
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            this.activeId = i;
            this.instrumentType = instrumentType;
            com.iqoption.core.analytics.b b = b.aZI.b(str, 0.0d, null, false);
            kotlin.jvm.internal.i.e(b, "analytics.createSystemEv…ntName, 0.0, null, false)");
            this.aZM = b;
        }

        /* renamed from: d */
        public void accept(Object obj, Throwable th) {
            com.iqoption.core.rx.a.a.a(this, obj, th);
        }

        public void onSuccess(Object obj) {
            kotlin.jvm.internal.i.f(obj, ConditionalUserProperty.VALUE);
            com.iqoption.core.analytics.b bVar = this.aZM;
            String str = "instrument-type";
            JsonObject anr = u.anp().o("active-id", Integer.valueOf(this.activeId)).o(str, this.instrumentType).anr();
            kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…                 .build()");
            bVar.a(anr);
            bVar.a((Number) Integer.valueOf(1));
            bVar.Cc();
        }

        /* JADX WARNING: Missing block: B:13:0x0024, code skipped:
            if (r6 != null) goto L_0x0029;
     */
        public void l(java.lang.Throwable r6) {
            /*
            r5 = this;
            r0 = "t";
            kotlin.jvm.internal.i.f(r6, r0);
            r0 = r6 instanceof com.iqoption.core.connect.l;
            r1 = 0;
            if (r0 != 0) goto L_0x000d;
        L_0x000b:
            r2 = r1;
            goto L_0x000e;
        L_0x000d:
            r2 = r6;
        L_0x000e:
            r2 = (com.iqoption.core.connect.l) r2;
            r3 = 0;
            if (r2 == 0) goto L_0x0018;
        L_0x0013:
            r2 = r2.getCode();
            goto L_0x0019;
        L_0x0018:
            r2 = 0;
        L_0x0019:
            if (r0 != 0) goto L_0x001c;
        L_0x001b:
            r6 = r1;
        L_0x001c:
            r6 = (com.iqoption.core.connect.l) r6;
            if (r6 == 0) goto L_0x0027;
        L_0x0020:
            r6 = r6.getMessage();
            if (r6 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r6 = "";
        L_0x0029:
            r0 = r5.aZM;
            r1 = com.iqoption.core.util.u.anp();
            r4 = "error";
            r6 = r1.o(r4, r6);
            r1 = java.lang.Integer.valueOf(r2);
            r2 = "status-code";
            r6 = r6.o(r2, r1);
            r1 = r5.activeId;
            r1 = java.lang.Integer.valueOf(r1);
            r2 = "active-id";
            r6 = r6.o(r2, r1);
            r1 = r5.instrumentType;
            r2 = "instrument-type";
            r6 = r6.o(r2, r1);
            r6 = r6.anr();
            r1 = "JsonUtils.createJsonBuil…                 .build()";
            kotlin.jvm.internal.i.e(r6, r1);
            r0.a(r6);
            r6 = java.lang.Integer.valueOf(r3);
            r6 = (java.lang.Number) r6;
            r0.a(r6);
            r0.Cc();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.analytics.a.b$e.l(java.lang.Throwable):void");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/analytics/sla/TradingSla$DocumentTrack;", "Lcom/google/common/util/concurrent/FutureCallback;", "", "eventName", "", "activeId", "", "(Ljava/lang/String;I)V", "getActiveId", "()I", "event", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "onFailure", "", "t", "", "onSuccess", "result", "core_release"})
    /* compiled from: TradingSla.kt */
    private static final class a implements o<Object> {
        private final com.iqoption.core.analytics.b aZM;
        private final int activeId;

        public a(String str, int i) {
            kotlin.jvm.internal.i.f(str, "eventName");
            this.activeId = i;
            com.iqoption.core.analytics.b b = b.aZI.b(str, 0.0d, null, false);
            kotlin.jvm.internal.i.e(b, "analytics.createSystemEv…ntName, 0.0, null, false)");
            this.aZM = b;
        }

        public void onSuccess(Object obj) {
            com.iqoption.core.analytics.b bVar = this.aZM;
            JsonObject anr = u.anp().o("active-id", Integer.valueOf(this.activeId)).anr();
            kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…                 .build()");
            bVar.a(anr);
            bVar.a((Number) Integer.valueOf(1));
            bVar.Cc();
        }

        /* JADX WARNING: Missing block: B:13:0x001e, code skipped:
            if (r6 != null) goto L_0x0023;
     */
        public void l(java.lang.Throwable r6) {
            /*
            r5 = this;
            r0 = r6 instanceof com.iqoption.core.connect.l;
            r1 = 0;
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            r2 = r1;
            goto L_0x0008;
        L_0x0007:
            r2 = r6;
        L_0x0008:
            r2 = (com.iqoption.core.connect.l) r2;
            r3 = 0;
            if (r2 == 0) goto L_0x0012;
        L_0x000d:
            r2 = r2.getCode();
            goto L_0x0013;
        L_0x0012:
            r2 = 0;
        L_0x0013:
            if (r0 != 0) goto L_0x0016;
        L_0x0015:
            r6 = r1;
        L_0x0016:
            r6 = (com.iqoption.core.connect.l) r6;
            if (r6 == 0) goto L_0x0021;
        L_0x001a:
            r6 = r6.getMessage();
            if (r6 == 0) goto L_0x0021;
        L_0x0020:
            goto L_0x0023;
        L_0x0021:
            r6 = "";
        L_0x0023:
            r0 = r5.aZM;
            r1 = com.iqoption.core.util.u.anp();
            r4 = "error";
            r6 = r1.o(r4, r6);
            r1 = java.lang.Integer.valueOf(r2);
            r2 = "status-code";
            r6 = r6.o(r2, r1);
            r1 = r5.activeId;
            r1 = java.lang.Integer.valueOf(r1);
            r2 = "active-id";
            r6 = r6.o(r2, r1);
            r6 = r6.anr();
            r1 = "JsonUtils.createJsonBuil…                 .build()";
            kotlin.jvm.internal.i.e(r6, r1);
            r0.a(r6);
            r6 = java.lang.Integer.valueOf(r3);
            r6 = (java.lang.Number) r6;
            r0.a(r6);
            r0.Cc();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.analytics.a.b$a.l(java.lang.Throwable):void");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/analytics/sla/TradingSla$DocumentTrackInstrument;", "Lcom/google/common/util/concurrent/FutureCallback;", "", "eventName", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "(Ljava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;)V", "event", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "onFailure", "", "t", "", "onSuccess", "result", "core_release"})
    /* compiled from: TradingSla.kt */
    private static final class b implements o<Object> {
        private final com.iqoption.core.analytics.b aZM;
        private final InstrumentType instrumentType;

        public b(String str, InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(str, "eventName");
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            this.instrumentType = instrumentType;
            com.iqoption.core.analytics.b b = b.aZI.b(str, 0.0d, null, false);
            kotlin.jvm.internal.i.e(b, "analytics.createSystemEv…ntName, 0.0, null, false)");
            this.aZM = b;
        }

        public void onSuccess(Object obj) {
            com.iqoption.core.analytics.b bVar = this.aZM;
            JsonObject anr = u.anp().o("instrument-type", this.instrumentType).anr();
            kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…                 .build()");
            bVar.a(anr);
            bVar.a((Number) Integer.valueOf(1));
            bVar.Cc();
        }

        /* JADX WARNING: Missing block: B:13:0x001e, code skipped:
            if (r6 != null) goto L_0x0023;
     */
        public void l(java.lang.Throwable r6) {
            /*
            r5 = this;
            r0 = r6 instanceof com.iqoption.core.connect.l;
            r1 = 0;
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            r2 = r1;
            goto L_0x0008;
        L_0x0007:
            r2 = r6;
        L_0x0008:
            r2 = (com.iqoption.core.connect.l) r2;
            r3 = 0;
            if (r2 == 0) goto L_0x0012;
        L_0x000d:
            r2 = r2.getCode();
            goto L_0x0013;
        L_0x0012:
            r2 = 0;
        L_0x0013:
            if (r0 != 0) goto L_0x0016;
        L_0x0015:
            r6 = r1;
        L_0x0016:
            r6 = (com.iqoption.core.connect.l) r6;
            if (r6 == 0) goto L_0x0021;
        L_0x001a:
            r6 = r6.getMessage();
            if (r6 == 0) goto L_0x0021;
        L_0x0020:
            goto L_0x0023;
        L_0x0021:
            r6 = "";
        L_0x0023:
            r0 = r5.aZM;
            r1 = com.iqoption.core.util.u.anp();
            r4 = "error";
            r6 = r1.o(r4, r6);
            r1 = java.lang.Integer.valueOf(r2);
            r2 = "status-code";
            r6 = r6.o(r2, r1);
            r1 = r5.instrumentType;
            r2 = "instrument-type";
            r6 = r6.o(r2, r1);
            r6 = r6.anr();
            r1 = "JsonUtils.createJsonBuil…                 .build()";
            kotlin.jvm.internal.i.e(r6, r1);
            r0.a(r6);
            r6 = java.lang.Integer.valueOf(r3);
            r6 = (java.lang.Number) r6;
            r0.a(r6);
            r0.Cc();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.analytics.a.b$b.l(java.lang.Throwable):void");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/order/PlaceOrderResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradingSla.kt */
    static final class f<T> implements io.reactivex.b.f<com.iqoption.core.microservices.tradingengine.response.order.d> {
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ long aZN;
        final /* synthetic */ String aZO;

        f(long j, String str, InstrumentType instrumentType) {
            this.aZN = j;
            this.aZO = str;
            this.$instrumentType = instrumentType;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.tradingengine.response.order.d dVar) {
            b bVar = b.aZL;
            long j = this.aZN;
            String str = this.aZO;
            InstrumentType instrumentType = this.$instrumentType;
            Long id = dVar.getId();
            bVar.a(j, str, instrumentType, id != null ? id.longValue() : 0);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradingSla.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ long aZN;
        final /* synthetic */ String aZO;

        g(long j, String str, InstrumentType instrumentType) {
            this.aZN = j;
            this.aZO = str;
            this.$instrumentType = instrumentType;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof com.iqoption.core.connect.l) {
                com.iqoption.core.connect.l lVar = (com.iqoption.core.connect.l) th2;
                b.aZL.a(this.aZN, this.aZO, this.$instrumentType, lVar.getMessage(), Integer.valueOf(lVar.getCode()));
                return;
            }
            b.aZL.a(this.aZN, this.aZO, this.$instrumentType, "", Integer.valueOf(0));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, bng = {"com/iqoption/core/analytics/sla/TradingSla$track$1", "Lcom/google/common/util/concurrent/FutureCallback;", "", "onFailure", "", "t", "", "onSuccess", "result", "core_release"})
    /* compiled from: TradingSla.kt */
    public static final class h implements o<Object> {
        final /* synthetic */ io.reactivex.b.b aZP;

        h(io.reactivex.b.b bVar) {
            this.aZP = bVar;
        }

        public void onSuccess(Object obj) {
            this.aZP.accept(obj, null);
        }

        public void l(Throwable th) {
            kotlin.jvm.internal.i.f(th, "t");
            this.aZP.accept(null, th);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Object;)V"})
    /* compiled from: TradingSla.kt */
    static final class i<T> implements io.reactivex.b.f<T> {
        final /* synthetic */ b aZQ;

        i(b bVar) {
            this.aZQ = bVar;
        }

        public final void accept(T t) {
            this.aZQ.onSuccess(t);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradingSla.kt */
    static final class j<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ b aZQ;

        j(b bVar) {
            this.aZQ = bVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.aZQ.l(th);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Object;)V"})
    /* compiled from: TradingSla.kt */
    static final class k<T> implements io.reactivex.b.f<T> {
        final /* synthetic */ b aZQ;

        k(b bVar) {
            this.aZQ = bVar;
        }

        public final void accept(T t) {
            this.aZQ.onSuccess(t);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: TradingSla.kt */
    static final class l<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ b aZQ;

        l(b bVar) {
            this.aZQ = bVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.aZQ.l(th);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/analytics/sla/TradingSla$DocumentTrackOpenOption;", "Lcom/iqoption/core/rx/BaseBiConsumer;", "", "countryId", "", "(J)V", "getCountryId", "()J", "event", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "onFailure", "", "t", "", "onSuccess", "value", "core_release"})
    /* compiled from: TradingSla.kt */
    public static final class c implements com.iqoption.core.rx.a<Object> {
        private final com.iqoption.core.analytics.b aZM;
        private final long arN;

        public c() {
            this(0, 1, null);
        }

        public c(long j) {
            this.arN = j;
            com.iqoption.core.analytics.b W = b.aZI.W(Event.CATEGORY_SYSTEM, "binary-options_open-time");
            kotlin.jvm.internal.i.e(W, "analytics.createEvent(CA…inary-options_open-time\")");
            this.aZM = W;
        }

        public /* synthetic */ c(long j, int i, f fVar) {
            if ((i & 1) != 0) {
                j = com.iqoption.core.d.Um().EA().El();
            }
            this(j);
        }

        /* renamed from: d */
        public void accept(Object obj, Throwable th) {
            com.iqoption.core.rx.a.a.a(this, obj, th);
        }

        public void onSuccess(Object obj) {
            kotlin.jvm.internal.i.f(obj, ConditionalUserProperty.VALUE);
            com.iqoption.core.analytics.b bVar = this.aZM;
            bVar.a((Number) Long.valueOf(this.arN));
            bVar.Cc();
        }

        /* JADX WARNING: Missing block: B:13:0x0022, code skipped:
            if (r5 != null) goto L_0x0027;
     */
        public void l(java.lang.Throwable r5) {
            /*
            r4 = this;
            r0 = "t";
            kotlin.jvm.internal.i.f(r5, r0);
            r0 = r5 instanceof com.iqoption.core.connect.l;
            r1 = 0;
            if (r0 != 0) goto L_0x000c;
        L_0x000a:
            r2 = r1;
            goto L_0x000d;
        L_0x000c:
            r2 = r5;
        L_0x000d:
            r2 = (com.iqoption.core.connect.l) r2;
            if (r2 == 0) goto L_0x0016;
        L_0x0011:
            r2 = r2.getCode();
            goto L_0x0017;
        L_0x0016:
            r2 = 0;
        L_0x0017:
            if (r0 != 0) goto L_0x001a;
        L_0x0019:
            r5 = r1;
        L_0x001a:
            r5 = (com.iqoption.core.connect.l) r5;
            if (r5 == 0) goto L_0x0025;
        L_0x001e:
            r5 = r5.getMessage();
            if (r5 == 0) goto L_0x0025;
        L_0x0024:
            goto L_0x0027;
        L_0x0025:
            r5 = "";
        L_0x0027:
            r0 = r4.aZM;
            r1 = com.iqoption.core.util.u.anp();
            r3 = "error";
            r5 = r1.o(r3, r5);
            r1 = java.lang.Integer.valueOf(r2);
            r2 = "status-code";
            r5 = r5.o(r2, r1);
            r5 = r5.anr();
            r1 = "JsonUtils.createJsonBuil…                 .build()";
            kotlin.jvm.internal.i.e(r5, r1);
            r0.a(r5);
            r1 = r4.arN;
            r5 = java.lang.Long.valueOf(r1);
            r5 = (java.lang.Number) r5;
            r0.a(r5);
            r0.Cc();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.analytics.a.b$c.l(java.lang.Throwable):void");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/analytics/sla/TradingSla$DocumentTrackStrike;", "Lcom/iqoption/core/rx/BaseFlowableConsumer;", "", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike;", "Lcom/iqoption/core/rx/BaseBiConsumer;", "eventName", "", "activeId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "(Ljava/lang/String;ILcom/iqoption/core/data/model/InstrumentType;)V", "getActiveId", "()I", "event", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "onFailure", "", "t", "", "onSuccess", "value", "core_release"})
    /* compiled from: TradingSla.kt */
    public static final class d implements com.iqoption.core.rx.a<List<? extends com.iqoption.core.microservices.tradingengine.response.instrument.e>>, com.iqoption.core.rx.b<List<? extends com.iqoption.core.microservices.tradingengine.response.instrument.e>> {
        private final com.iqoption.core.analytics.b aZM;
        private final int activeId;
        private final InstrumentType instrumentType;

        public d(String str, int i, InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(str, "eventName");
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            this.activeId = i;
            this.instrumentType = instrumentType;
            com.iqoption.core.analytics.b b = b.aZI.b(str, 0.0d, null, false);
            kotlin.jvm.internal.i.e(b, "analytics.createSystemEv…ntName, 0.0, null, false)");
            this.aZM = b;
        }

        /* renamed from: a */
        public void accept(io.reactivex.l<List<com.iqoption.core.microservices.tradingengine.response.instrument.e>> lVar) {
            kotlin.jvm.internal.i.f(lVar, "notification");
            com.iqoption.core.rx.b.a.a(this, lVar);
        }

        /* renamed from: a */
        public void accept(List<com.iqoption.core.microservices.tradingengine.response.instrument.e> list, Throwable th) {
            com.iqoption.core.rx.a.a.a(this, list, th);
        }

        /* renamed from: B */
        public void onSuccess(List<com.iqoption.core.microservices.tradingengine.response.instrument.e> list) {
            kotlin.jvm.internal.i.f(list, ConditionalUserProperty.VALUE);
            com.iqoption.core.microservices.tradingengine.response.instrument.e eVar = (com.iqoption.core.microservices.tradingengine.response.instrument.e) u.bV(list);
            long aiC = eVar != null ? eVar.aiC() : 0;
            com.iqoption.core.analytics.b bVar = this.aZM;
            String str = "period";
            JsonObject anr = u.anp().o("active-id", Integer.valueOf(this.activeId)).o("instrument-type", this.instrumentType).o(str, Long.valueOf(aiC)).anr();
            kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…                 .build()");
            bVar.a(anr);
            bVar.a((Number) Integer.valueOf(1));
            bVar.Cc();
        }

        /* JADX WARNING: Missing block: B:13:0x0023, code skipped:
            if (r6 != null) goto L_0x0028;
     */
        public void l(java.lang.Throwable r6) {
            /*
            r5 = this;
            r0 = "t";
            kotlin.jvm.internal.i.f(r6, r0);
            r0 = r6 instanceof com.iqoption.core.connect.l;
            r1 = 0;
            if (r0 != 0) goto L_0x000c;
        L_0x000a:
            r2 = r1;
            goto L_0x000d;
        L_0x000c:
            r2 = r6;
        L_0x000d:
            r2 = (com.iqoption.core.connect.l) r2;
            r3 = 0;
            if (r2 == 0) goto L_0x0017;
        L_0x0012:
            r2 = r2.getCode();
            goto L_0x0018;
        L_0x0017:
            r2 = 0;
        L_0x0018:
            if (r0 != 0) goto L_0x001b;
        L_0x001a:
            r6 = r1;
        L_0x001b:
            r6 = (com.iqoption.core.connect.l) r6;
            if (r6 == 0) goto L_0x0026;
        L_0x001f:
            r6 = r6.getMessage();
            if (r6 == 0) goto L_0x0026;
        L_0x0025:
            goto L_0x0028;
        L_0x0026:
            r6 = "";
        L_0x0028:
            r0 = r5.aZM;
            r1 = com.iqoption.core.util.u.anp();
            r4 = "error";
            r6 = r1.o(r4, r6);
            r1 = java.lang.Integer.valueOf(r2);
            r2 = "status-code";
            r6 = r6.o(r2, r1);
            r1 = r5.activeId;
            r1 = java.lang.Integer.valueOf(r1);
            r2 = "active-id";
            r6 = r6.o(r2, r1);
            r1 = r5.instrumentType;
            r2 = "instrument-type";
            r6 = r6.o(r2, r1);
            r6 = r6.anr();
            r1 = "JsonUtils.createJsonBuil…                 .build()";
            kotlin.jvm.internal.i.e(r6, r1);
            r0.a(r6);
            r6 = java.lang.Integer.valueOf(r3);
            r6 = (java.lang.Number) r6;
            r0.a(r6);
            r0.Cc();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.analytics.a.b$d.l(java.lang.Throwable):void");
        }
    }

    private b() {
    }

    public final void a(boolean z, long j, String str, InstrumentType instrumentType, long j2) {
        kotlin.jvm.internal.i.f(str, "externalId");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        com.iqoption.core.analytics.d dVar = aZI;
        double d = z ? 1.0d : 0.0d;
        com.iqoption.core.analytics.d dVar2 = dVar;
        dVar2.a("open-position", d, u.anp().o("active-id", Long.valueOf(j)).o("external-id", str).o("instrument-type", instrumentType).o("balance-type", Long.valueOf(j2)).anr(), false);
    }

    public final void a(long j, String str, String str2) {
        if (!aZJ.contains(Long.valueOf(j))) {
            aZJ.add(Long.valueOf(j));
            String str3 = "order-created";
            aZI.a(str3, 0.0d, u.anp().o("order-id", Long.valueOf(j)).o(NotificationCompat.CATEGORY_STATUS, str).o("reject-status", str2).anr(), false);
        }
    }

    public final p<com.iqoption.core.microservices.tradingengine.response.order.d> a(p<com.iqoption.core.microservices.tradingengine.response.order.d> pVar, InstrumentType instrumentType, long j, String str) {
        kotlin.jvm.internal.i.f(pVar, "single");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(str, "requestId");
        p i = pVar.h((io.reactivex.b.f) new f(j, str, instrumentType)).i((io.reactivex.b.f) new g(j, str, instrumentType));
        kotlin.jvm.internal.i.e(i, "single\n                .…      }\n                }");
        return i;
    }

    private final void a(long j, String str, InstrumentType instrumentType, long j2) {
        com.iqoption.core.analytics.d dVar = aZI;
        str = "order-id";
        JsonObject anr = u.anp().o("active-id", Long.valueOf(j)).o("external-id", str).o(str, Long.valueOf(j2)).o("instrument-type", instrumentType).anr();
        dVar.a("place-order-temp-response", 1.0d, anr, false);
    }

    private final void a(long j, String str, InstrumentType instrumentType, String str2, Integer num) {
        com.iqoption.core.analytics.d dVar = aZI;
        JsonObject anr = u.anp().o("active-id", Long.valueOf(j)).o("external-id", str).o("instrument-type", instrumentType).o("error", str2).o("status-code", num).anr();
        dVar.a("place-order-temp-response", 0.0d, anr, false);
    }

    public final void a(long j, List<Long> list, InstrumentType instrumentType, long j2, String str) {
        kotlin.jvm.internal.i.f(list, "orderIds");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        if (!aZK.contains(Long.valueOf(j2))) {
            aZK.add(Long.valueOf(j2));
            com.iqoption.core.analytics.d dVar = aZI;
            String str2 = "position-id";
            JsonObject anr = u.anp().o("active-id", Long.valueOf(j)).c("order-ids", list).o("instrument-type", instrumentType).o(str2, Long.valueOf(j2)).o(NotificationCompat.CATEGORY_STATUS, str).anr();
            dVar.a("position-created", 1.0d, anr, false);
        }
    }

    public final com.iqoption.core.analytics.a Ut() {
        com.iqoption.core.analytics.b b = aZI.b("close-position", 0.0d, null, false);
        kotlin.jvm.internal.i.e(b, "analytics.createSystemEv…ition\", 0.0, null, false)");
        return b;
    }

    public final void a(com.iqoption.core.analytics.a aVar, long j, long j2) {
        kotlin.jvm.internal.i.f(aVar, "event");
        if (!(aVar instanceof com.iqoption.core.analytics.b)) {
            aVar = null;
        }
        com.iqoption.core.analytics.b bVar = (com.iqoption.core.analytics.b) aVar;
        if (bVar != null) {
            JsonObject anr = u.anp().o("active-id", Long.valueOf(j)).o("position-id", Long.valueOf(j2)).anr();
            kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…                 .build()");
            bVar.a(anr);
            bVar.a((Number) Integer.valueOf(1));
            bVar.Cc();
        }
    }

    public final void a(com.iqoption.core.analytics.a aVar, long j, String str, Integer num) {
        kotlin.jvm.internal.i.f(aVar, "event");
        if (!(aVar instanceof com.iqoption.core.analytics.b)) {
            aVar = null;
        }
        com.iqoption.core.analytics.b bVar = (com.iqoption.core.analytics.b) aVar;
        if (bVar != null) {
            JsonObject anr = u.anp().o("active-id", Long.valueOf(j)).o("error", str).o("status-code", num).anr();
            kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…                 .build()");
            bVar.a(anr);
            bVar.a((Number) Integer.valueOf(0));
            bVar.Cc();
        }
    }

    public final void a(long j, InstrumentType instrumentType, long j2) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        String str = "expiration-period";
        String str2 = "absent-expiration";
        aZI.a(str2, 0.0d, u.anp().o("active-id", Long.valueOf(j)).o("instrument-type", instrumentType).o(str, Long.valueOf(j2)).anr(), false);
    }

    public final void a(t<?> tVar, int i) {
        kotlin.jvm.internal.i.f(tVar, "future");
        com.google.common.util.concurrent.p.a(tVar, new a("get-first-candles", i), x.vG());
    }

    public final <T> p<T> a(p<T> pVar, InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(pVar, "request");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        b bVar = new b("get-underlying-list", instrumentType);
        p i = pVar.h((io.reactivex.b.f) new k(bVar)).i((io.reactivex.b.f) new l(bVar));
        kotlin.jvm.internal.i.e(i, "request\n                …ure(it)\n                }");
        return i;
    }

    public final <T> p<T> b(p<T> pVar, InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(pVar, "request");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        b bVar = new b("get-instruments", instrumentType);
        p i = pVar.h((io.reactivex.b.f) new i(bVar)).i((io.reactivex.b.f) new j(bVar));
        kotlin.jvm.internal.i.e(i, "request\n                …ure(it)\n                }");
        return i;
    }

    public final void a(t<?> tVar, io.reactivex.b.b<Object, Throwable> bVar) {
        kotlin.jvm.internal.i.f(tVar, "request");
        kotlin.jvm.internal.i.f(bVar, "consumer");
        com.google.common.util.concurrent.p.a(tVar, new h(bVar), x.vG());
    }
}
