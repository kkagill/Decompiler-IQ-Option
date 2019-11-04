package com.iqoption.core.microservices.tradingengine.response.active;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.o;
import java.util.Collection;
import java.util.HashMap;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u0000 \u00112\u00020\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult;", "", "activeSetting", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "(Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;)V", "getActiveSetting", "()Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ActiveSetting", "Companion", "OptionsMap", "core_release"})
@o
/* compiled from: ActiveSettingResult.kt */
public final class g {
    private static final a bzP = new a();
    public static final b bzQ = new b();
    @SerializedName("result")
    private final a bzO;

    @i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#H\u0002J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0010\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "", "()V", "_turbo", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$OptionsMap;", "_binary", "currency", "", "groups", "Ljava/util/HashMap;", "", "(Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$OptionsMap;Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$OptionsMap;Ljava/lang/String;Ljava/util/HashMap;)V", "binary", "getBinary", "()Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$OptionsMap;", "binary$delegate", "Lkotlin/Lazy;", "getCurrency", "()Ljava/lang/String;", "getGroups", "()Ljava/util/HashMap;", "turbo", "getTurbo", "turbo$delegate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "fillInstrumentType", "optionsMap", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "hashCode", "toString", "core_release"})
    /* compiled from: ActiveSettingResult.kt */
    public static final class a {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "turbo", "getTurbo()Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$OptionsMap;")), k.a(new PropertyReference1Impl(k.G(a.class), "binary", "getBinary()Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$OptionsMap;"))};
        private final transient d bzR;
        private final transient d bzS;
        @SerializedName("turbo")
        private final c bzT;
        @SerializedName("binary")
        private final c bzU;
        @SerializedName("groups")
        private final HashMap<Integer, String> bzV;
        @SerializedName("currency")
        private final String currency;

        public final c ahV() {
            d dVar = this.bzR;
            j jVar = anY[0];
            return (c) dVar.getValue();
        }

        public final c ahW() {
            d dVar = this.bzS;
            j jVar = anY[1];
            return (c) dVar.getValue();
        }

        /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bzV, r3.bzV) != false) goto L_0x0033;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0033;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.core.microservices.tradingengine.response.active.g.a;
            if (r0 == 0) goto L_0x0031;
        L_0x0006:
            r3 = (com.iqoption.core.microservices.tradingengine.response.active.g.a) r3;
            r0 = r2.bzT;
            r1 = r3.bzT;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0012:
            r0 = r2.bzU;
            r1 = r3.bzU;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x001c:
            r0 = r2.currency;
            r1 = r3.currency;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0026:
            r0 = r2.bzV;
            r3 = r3.bzV;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x0031;
        L_0x0030:
            goto L_0x0033;
        L_0x0031:
            r3 = 0;
            return r3;
        L_0x0033:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.tradingengine.response.active.g$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            c cVar = this.bzT;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            c cVar2 = this.bzU;
            hashCode = (hashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
            String str = this.currency;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            HashMap hashMap = this.bzV;
            if (hashMap != null) {
                i = hashMap.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ActiveSetting(_turbo=");
            stringBuilder.append(this.bzT);
            stringBuilder.append(", _binary=");
            stringBuilder.append(this.bzU);
            stringBuilder.append(", currency=");
            stringBuilder.append(this.currency);
            stringBuilder.append(", groups=");
            stringBuilder.append(this.bzV);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(c cVar, c cVar2, String str, HashMap<Integer, String> hashMap) {
            kotlin.jvm.internal.i.f(cVar, "_turbo");
            kotlin.jvm.internal.i.f(cVar2, "_binary");
            kotlin.jvm.internal.i.f(str, "currency");
            this.bzT = cVar;
            this.bzU = cVar2;
            this.currency = str;
            this.bzV = hashMap;
            this.bzR = g.c(new ActiveSettingResult$ActiveSetting$turbo$2(this));
            this.bzS = g.c(new ActiveSettingResult$ActiveSetting$binary$2(this));
        }

        public final HashMap<Integer, String> ahX() {
            return this.bzV;
        }

        public a() {
            this(new c(null), new c(null), "", null);
        }

        private final c a(c cVar, InstrumentType instrumentType) {
            HashMap ahZ = cVar.ahZ();
            Collection<n> values = ahZ != null ? ahZ.values() : null;
            if (values != null) {
                for (n M : values) {
                    M.M(instrumentType);
                }
            }
            return cVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "getEMPTY", "()Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "core_release"})
    /* compiled from: ActiveSettingResult.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R,\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$OptionsMap;", "", "actives", "Ljava/util/HashMap;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive;", "(Ljava/util/HashMap;)V", "getActives", "()Ljava/util/HashMap;", "setActives", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"})
    /* compiled from: ActiveSettingResult.kt */
    public static final class c {
        @SerializedName("actives")
        private HashMap<Integer, n> bzW;

        public c() {
            this(null, 1, null);
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.bzW, ((com.iqoption.core.microservices.tradingengine.response.active.g.c) r2).bzW) != false) goto L_0x0015;
     */
        public boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof com.iqoption.core.microservices.tradingengine.response.active.g.c;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (com.iqoption.core.microservices.tradingengine.response.active.g.c) r2;
            r0 = r1.bzW;
            r2 = r2.bzW;
            r2 = kotlin.jvm.internal.i.y(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.tradingengine.response.active.g$c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            HashMap hashMap = this.bzW;
            return hashMap != null ? hashMap.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OptionsMap(actives=");
            stringBuilder.append(this.bzW);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public c(HashMap<Integer, n> hashMap) {
            this.bzW = hashMap;
        }

        public /* synthetic */ c(HashMap hashMap, int i, f fVar) {
            if ((i & 1) != 0) {
                hashMap = (HashMap) null;
            }
            this(hashMap);
        }

        public final HashMap<Integer, n> ahZ() {
            return this.bzW;
        }
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.bzO, ((com.iqoption.core.microservices.tradingengine.response.active.g) r2).bzO) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.core.microservices.tradingengine.response.active.g;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.core.microservices.tradingengine.response.active.g) r2;
        r0 = r1.bzO;
        r2 = r2.bzO;
        r2 = kotlin.jvm.internal.i.y(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.tradingengine.response.active.g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        a aVar = this.bzO;
        return aVar != null ? aVar.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActiveSettingResult(activeSetting=");
        stringBuilder.append(this.bzO);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
