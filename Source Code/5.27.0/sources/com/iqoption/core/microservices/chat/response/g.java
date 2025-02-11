package com.iqoption.core.microservices.chat.response;

import com.iqoption.core.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatMessageRateAdapter;", "", "options", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;)V", "canRate", "", "getCanRate", "()Z", "comment", "", "getComment", "()Ljava/lang/String;", "rate", "", "getRate", "()I", "rateDate", "", "getRateDate", "()J", "rateTimeToChange", "getRateTimeToChange", "rateUntil", "getRateUntil", "core_release"})
/* compiled from: ChatMessage.kt */
public final class g {
    private final long bqA;
    private final long bqB;
    private final long bqC;
    private final String bqD;
    private final int rate;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Missing block: B:31:0x0061, code skipped:
            if (r5 != null) goto L_0x0066;
     */
    public g(com.google.gson.JsonObject r5) {
        /*
        r4 = this;
        r4.<init>();
        if (r5 == 0) goto L_0x0012;
    L_0x0005:
        r0 = "rate";
        r0 = r5.get(r0);
        if (r0 == 0) goto L_0x0012;
    L_0x000d:
        r0 = r0.getAsInt();
        goto L_0x0013;
    L_0x0012:
        r0 = 0;
    L_0x0013:
        r4.rate = r0;
        r0 = 0;
        if (r5 == 0) goto L_0x0026;
    L_0x0019:
        r2 = "rate_date";
        r2 = r5.get(r2);
        if (r2 == 0) goto L_0x0026;
    L_0x0021:
        r2 = r2.getAsLong();
        goto L_0x0027;
    L_0x0026:
        r2 = r0;
    L_0x0027:
        r4.bqA = r2;
        if (r5 == 0) goto L_0x0038;
    L_0x002b:
        r2 = "rate_time_to_change";
        r2 = r5.get(r2);
        if (r2 == 0) goto L_0x0038;
    L_0x0033:
        r2 = r2.getAsLong();
        goto L_0x0039;
    L_0x0038:
        r2 = r0;
    L_0x0039:
        r4.bqB = r2;
        if (r5 == 0) goto L_0x0049;
    L_0x003d:
        r2 = "rate_until";
        r2 = r5.get(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x0045:
        r0 = r2.getAsLong();
    L_0x0049:
        r4.bqC = r0;
        if (r5 == 0) goto L_0x0064;
    L_0x004d:
        r0 = "comment";
        r5 = r5.get(r0);
        if (r5 == 0) goto L_0x0064;
    L_0x0055:
        r0 = r5.isJsonPrimitive();
        if (r0 == 0) goto L_0x0060;
    L_0x005b:
        r5 = r5.getAsString();
        goto L_0x0061;
    L_0x0060:
        r5 = 0;
    L_0x0061:
        if (r5 == 0) goto L_0x0064;
    L_0x0063:
        goto L_0x0066;
    L_0x0064:
        r5 = "";
    L_0x0066:
        r4.bqD = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.chat.response.g.<init>(com.google.gson.JsonObject):void");
    }

    public final int acs() {
        return this.rate;
    }

    public final long act() {
        return this.bqA;
    }

    public final boolean acu() {
        long If = d.EB().If();
        long j = this.bqA;
        if (j != 0) {
            j += this.bqB;
        } else {
            j = this.bqC;
        }
        return j >= If;
    }
}
