package com.iqoption.dto.entity.result;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import java.util.ArrayList;

public class ExpirationsResult {
    private static final long MAX_SHORT_EXPIRATION = 3600;
    @SerializedName("expiration")
    public ArrayList<DigitalExpiration> expirations;
    @SerializedName("type")
    public InstrumentType type;
    @SerializedName("underlying")
    public String underlying;

    public static class DigitalExpiration {
        @SerializedName("dead_time")
        public long deadTime;
        @SerializedName("period")
        public long period;
        @SerializedName("time")
        public long time;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DigitalExpiration{time=");
            stringBuilder.append(this.time);
            stringBuilder.append(", period=");
            stringBuilder.append(this.period);
            stringBuilder.append(", deadTime=");
            stringBuilder.append(this.deadTime);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExpirationsResult{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", underlying='");
        stringBuilder.append(this.underlying);
        stringBuilder.append('\'');
        stringBuilder.append(", expirations=");
        stringBuilder.append(this.expirations);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    @androidx.annotation.WorkerThread
    public java.util.Set<com.iqoption.dto.entity.expiration.Expiration> getExpirations() {
        /*
        r18 = this;
        r0 = r18;
        r1 = com.google.common.collect.Sets.uw();
        r2 = r0.expirations;
        if (r2 == 0) goto L_0x00c5;
    L_0x000a:
        r2 = com.iqoption.app.managers.feature.c.Iw();
        r3 = "trim-option-expirations";
        r2 = r2.ei(r3);
        r3 = 1;
        if (r2 == 0) goto L_0x001e;
    L_0x0018:
        r4 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;
        r5 = r0.type;
        if (r4 == r5) goto L_0x0027;
    L_0x001e:
        r2 = new com.iqoption.core.microservices.features.a.a;
        r4 = "";
        r5 = "disabled";
        r2.<init>(r4, r5, r3);
    L_0x0027:
        r4 = r0.expirations;
        r4 = r4.iterator();
    L_0x002d:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x00c5;
    L_0x0033:
        r5 = r4.next();
        r5 = (com.iqoption.dto.entity.result.ExpirationsResult.DigitalExpiration) r5;
        r6 = r2.getStatus();
        r7 = -1;
        r8 = r6.hashCode();
        r9 = -530335417; // 0xffffffffe063b947 float:-6.56369E19 double:NaN;
        if (r8 == r9) goto L_0x0058;
    L_0x0047:
        r9 = 745728785; // 0x2c72eb11 float:3.4520756E-12 double:3.68438974E-315;
        if (r8 == r9) goto L_0x004d;
    L_0x004c:
        goto L_0x0063;
    L_0x004d:
        r8 = "trim-short";
        r6 = r6.equals(r8);
        if (r6 == 0) goto L_0x0063;
    L_0x0056:
        r6 = 1;
        goto L_0x0064;
    L_0x0058:
        r8 = "trim-long";
        r6 = r6.equals(r8);
        if (r6 == 0) goto L_0x0063;
    L_0x0061:
        r6 = 0;
        goto L_0x0064;
    L_0x0063:
        r6 = -1;
    L_0x0064:
        r7 = 3600; // 0xe10 float:5.045E-42 double:1.7786E-320;
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r6 == 0) goto L_0x00a2;
    L_0x006a:
        if (r6 == r3) goto L_0x0080;
    L_0x006c:
        r6 = new com.iqoption.dto.entity.expiration.Expiration;
        r12 = r5.time;
        r7 = r5.period;
        r14 = r7 * r9;
        r7 = r5.deadTime;
        r16 = r7 * r9;
        r11 = r6;
        r11.<init>(r12, r14, r16);
        r1.add(r6);
        goto L_0x002d;
    L_0x0080:
        r6 = r2.ady();
        r6 = com.iqoption.core.util.u.a(r6, r7);
        r11 = r5.period;
        r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1));
        if (r8 < 0) goto L_0x002d;
    L_0x008e:
        r6 = new com.iqoption.dto.entity.expiration.Expiration;
        r12 = r5.time;
        r7 = r5.period;
        r14 = r7 * r9;
        r7 = r5.deadTime;
        r16 = r7 * r9;
        r11 = r6;
        r11.<init>(r12, r14, r16);
        r1.add(r6);
        goto L_0x002d;
    L_0x00a2:
        r6 = r2.ady();
        r6 = com.iqoption.core.util.u.a(r6, r7);
        r11 = r5.period;
        r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1));
        if (r8 >= 0) goto L_0x002d;
    L_0x00b0:
        r6 = new com.iqoption.dto.entity.expiration.Expiration;
        r12 = r5.time;
        r7 = r5.period;
        r14 = r7 * r9;
        r7 = r5.deadTime;
        r16 = r7 * r9;
        r11 = r6;
        r11.<init>(r12, r14, r16);
        r1.add(r6);
        goto L_0x002d;
    L_0x00c5:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dto.entity.result.ExpirationsResult.getExpirations():java.util.Set");
    }
}
