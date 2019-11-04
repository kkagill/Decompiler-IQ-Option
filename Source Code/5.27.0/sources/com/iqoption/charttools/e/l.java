package com.iqoption.charttools.e;

import android.util.SparseArray;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.charttools.model.indicator.h;
import com.iqoption.charttools.model.indicator.k;
import com.iqoption.charttools.model.indicator.x;
import com.iqoption.charttools.n;
import com.iqoption.core.d;
import com.iqoption.core.data.model.chart.ChartColor;
import com.iqoption.core.data.model.chart.ChartType;
import com.iqoption.core.util.TimeUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\b\b\u0018\u0000 F2\u00020\u0001:\u0001FBQ\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB\u001d\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0010B\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001b\u0012\b\b\u0002\u0010 \u001a\u00020\u001b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010!J\t\u00103\u001a\u00020\fHÆ\u0003J\t\u00104\u001a\u00020\u001bHÆ\u0003J\t\u00105\u001a\u00020\u001bHÆ\u0003J\t\u00106\u001a\u00020\u001bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010#J\t\u0010=\u001a\u00020\u001bHÆ\u0003J\t\u0010>\u001a\u00020\u001bHÆ\u0003J\t\u0010?\u001a\u00020\u001bHÆ\u0003J¤\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020\u001b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u001b2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0019HÖ\u0001J\t\u0010E\u001a\u00020\fHÖ\u0001R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u001c\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010/R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010/R\u0011\u0010\u001d\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010/R\u0011\u0010\u001f\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010/R\u0011\u0010\u001e\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010/R\u0011\u0010 \u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b \u0010/R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006G"}, bng = {"Lcom/iqoption/charttools/templates/TemplateInitialState;", "", "actives", "Landroid/util/SparseArray;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "indicators", "", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "figures", "config", "Lcom/iqoption/charttools/model/chart/ChartConfig;", "name", "", "template", "Lcom/iqoption/charttools/model/template/ChartTemplate;", "(Landroid/util/SparseArray;Ljava/util/List;Ljava/util/List;Lcom/iqoption/charttools/model/chart/ChartConfig;Ljava/lang/String;Lcom/iqoption/charttools/model/template/ChartTemplate;)V", "(Lcom/iqoption/charttools/model/template/ChartTemplate;Landroid/util/SparseArray;)V", "instruments", "Lcom/iqoption/charttools/templates/InstrumentAdapterItem;", "hosts", "chartType", "Lcom/iqoption/core/data/model/chart/ChartType;", "chartColor", "Lcom/iqoption/core/data/model/chart/ChartColor;", "candleSize", "", "isChartSettingsEnabled", "", "isAutoScaleEnabled", "isHeikenAshiEnabled", "isTradersMoodEnabled", "isLiveDealsEnabled", "isVolumeEnabled", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/iqoption/core/data/model/chart/ChartType;Lcom/iqoption/core/data/model/chart/ChartColor;Ljava/lang/Integer;ZZZZZZLcom/iqoption/charttools/model/template/ChartTemplate;)V", "getCandleSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChartColor", "()Lcom/iqoption/core/data/model/chart/ChartColor;", "getChartType", "()Lcom/iqoption/core/data/model/chart/ChartType;", "formattedCandleSize", "getFormattedCandleSize", "()Ljava/lang/String;", "getHosts", "()Ljava/util/List;", "getInstruments", "()Z", "getName", "getTemplate", "()Lcom/iqoption/charttools/model/template/ChartTemplate;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/iqoption/core/data/model/chart/ChartType;Lcom/iqoption/core/data/model/chart/ChartColor;Ljava/lang/Integer;ZZZZZZLcom/iqoption/charttools/model/template/ChartTemplate;)Lcom/iqoption/charttools/templates/TemplateInitialState;", "equals", "other", "hashCode", "toString", "Companion", "techtools_release"})
/* compiled from: TemplateInitialState.kt */
public final class l {
    @Deprecated
    public static final a aKI = new a();
    private final List<h> aEN;
    private final com.iqoption.charttools.model.b.a aEv;
    private final Integer aII;
    private final ChartType aKA;
    private final ChartColor aKB;
    private final boolean aKC;
    private final boolean aKD;
    private final boolean aKE;
    private final boolean aKF;
    private final boolean aKG;
    private final boolean aKH;
    private final String aKy;
    private final List<d> aKz;
    private final String name;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¨\u0006\f"}, bng = {"Lcom/iqoption/charttools/templates/TemplateInitialState$Companion;", "", "()V", "map", "", "Lcom/iqoption/charttools/templates/InstrumentAdapterItem;", "actives", "Landroid/util/SparseArray;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "indicators", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "figures", "techtools_release"})
    /* compiled from: TemplateInitialState.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final List<d> a(SparseArray<com.iqoption.core.microservices.tradingengine.response.active.a> sparseArray, List<h> list, List<h> list2) {
            kotlin.jvm.internal.i.f(sparseArray, "actives");
            kotlin.jvm.internal.i.f(list, "indicators");
            kotlin.jvm.internal.i.f(list2, "figures");
            if (list.size() + list2.size() == 0) {
                return m.emptyList();
            }
            List arrayList = new ArrayList();
            if ((list.isEmpty() ^ 1) != 0) {
                arrayList.add(new q(d.getString(n.i.indicators), null, 2, null));
                for (h hVar : list) {
                    arrayList.add(new c(hVar.Of(), hVar, null, 4, null));
                }
            }
            if ((list2.isEmpty() ^ 1) != 0) {
                arrayList.add(new q(d.getString(n.i.lines), null, 2, null));
                for (h hVar2 : list2) {
                    x MH = hVar2.MH();
                    if (!(MH instanceof k)) {
                        MH = null;
                    }
                    k kVar = (k) MH;
                    com.iqoption.core.microservices.tradingengine.response.active.a aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) sparseArray.get(kVar != null ? kVar.b(hVar2.Oh()) : -1);
                    if (aVar != null) {
                        arrayList.add(new b(hVar2.MH().On(), com.iqoption.core.microservices.tradingengine.response.active.d.B(aVar), hVar2, null, 8, null));
                    }
                }
            }
            return arrayList;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (kotlin.jvm.internal.i.y(this.name, lVar.name) && kotlin.jvm.internal.i.y(this.aKz, lVar.aKz) && kotlin.jvm.internal.i.y(this.aEN, lVar.aEN) && kotlin.jvm.internal.i.y(this.aKA, lVar.aKA) && kotlin.jvm.internal.i.y(this.aKB, lVar.aKB) && kotlin.jvm.internal.i.y(this.aII, lVar.aII)) {
                    if ((this.aKC == lVar.aKC ? 1 : null) != null) {
                        if ((this.aKD == lVar.aKD ? 1 : null) != null) {
                            if ((this.aKE == lVar.aKE ? 1 : null) != null) {
                                if ((this.aKF == lVar.aKF ? 1 : null) != null) {
                                    if ((this.aKG == lVar.aKG ? 1 : null) != null) {
                                        if ((this.aKH == lVar.aKH ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.aEv, lVar.aEv)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.aKz;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.aEN;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        ChartType chartType = this.aKA;
        hashCode = (hashCode + (chartType != null ? chartType.hashCode() : 0)) * 31;
        ChartColor chartColor = this.aKB;
        hashCode = (hashCode + (chartColor != null ? chartColor.hashCode() : 0)) * 31;
        Integer num = this.aII;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        int i2 = this.aKC;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.aKD;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.aKE;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.aKF;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.aKG;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.aKH;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        com.iqoption.charttools.model.b.a aVar = this.aEv;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TemplateInitialState(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", instruments=");
        stringBuilder.append(this.aKz);
        stringBuilder.append(", hosts=");
        stringBuilder.append(this.aEN);
        stringBuilder.append(", chartType=");
        stringBuilder.append(this.aKA);
        stringBuilder.append(", chartColor=");
        stringBuilder.append(this.aKB);
        stringBuilder.append(", candleSize=");
        stringBuilder.append(this.aII);
        stringBuilder.append(", isChartSettingsEnabled=");
        stringBuilder.append(this.aKC);
        stringBuilder.append(", isAutoScaleEnabled=");
        stringBuilder.append(this.aKD);
        stringBuilder.append(", isHeikenAshiEnabled=");
        stringBuilder.append(this.aKE);
        stringBuilder.append(", isTradersMoodEnabled=");
        stringBuilder.append(this.aKF);
        stringBuilder.append(", isLiveDealsEnabled=");
        stringBuilder.append(this.aKG);
        stringBuilder.append(", isVolumeEnabled=");
        stringBuilder.append(this.aKH);
        stringBuilder.append(", template=");
        stringBuilder.append(this.aEv);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public l(String str, List<? extends d> list, List<h> list2, ChartType chartType, ChartColor chartColor, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, com.iqoption.charttools.model.b.a aVar) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(list, "instruments");
        kotlin.jvm.internal.i.f(list2, "hosts");
        this.name = str;
        this.aKz = list;
        this.aEN = list2;
        this.aKA = chartType;
        this.aKB = chartColor;
        this.aII = num;
        this.aKC = z;
        this.aKD = z2;
        this.aKE = z3;
        this.aKF = z4;
        this.aKG = z5;
        this.aKH = z6;
        this.aEv = aVar;
        Integer num2 = this.aII;
        if (num2 != null) {
            str = TimeUtil.bRM.fv(num2.intValue());
        } else {
            str = null;
        }
        this.aKy = str;
    }

    public final String getName() {
        return this.name;
    }

    public final List<d> Pe() {
        return this.aKz;
    }

    public final List<h> MJ() {
        return this.aEN;
    }

    public final ChartType Pf() {
        return this.aKA;
    }

    public final ChartColor Pg() {
        return this.aKB;
    }

    public final Integer NV() {
        return this.aII;
    }

    public final boolean Ph() {
        return this.aKC;
    }

    public final boolean Pi() {
        return this.aKD;
    }

    public final boolean Pj() {
        return this.aKE;
    }

    public final boolean Pk() {
        return this.aKF;
    }

    public final boolean Pl() {
        return this.aKG;
    }

    public final boolean Md() {
        return this.aKH;
    }

    public final String Pd() {
        return this.aKy;
    }

    public /* synthetic */ l(SparseArray sparseArray, List list, List list2, com.iqoption.charttools.model.a.a aVar, String str, com.iqoption.charttools.model.b.a aVar2, int i, f fVar) {
        if ((i & 16) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i & 32) != 0) {
            aVar2 = (com.iqoption.charttools.model.b.a) null;
        }
        this(sparseArray, list, list2, aVar, str2, aVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    public l(android.util.SparseArray<com.iqoption.core.microservices.tradingengine.response.active.a> r19, java.util.List<com.iqoption.charttools.model.indicator.h> r20, java.util.List<com.iqoption.charttools.model.indicator.h> r21, com.iqoption.charttools.model.a.a r22, java.lang.String r23, com.iqoption.charttools.model.b.a r24) {
        /*
        r18 = this;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        r3 = "actives";
        kotlin.jvm.internal.i.f(r0, r3);
        r3 = "indicators";
        kotlin.jvm.internal.i.f(r1, r3);
        r3 = "figures";
        kotlin.jvm.internal.i.f(r2, r3);
        r3 = "name";
        r5 = r23;
        kotlin.jvm.internal.i.f(r5, r3);
        r3 = aKI;
        r6 = r3.a(r0, r1, r2);
        r0 = r1;
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
    L_0x0030:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x004b;
    L_0x0036:
        r2 = r0.next();
        r3 = r2;
        r3 = (com.iqoption.charttools.model.indicator.h) r3;
        r3 = r3.MH();
        r3 = r3.Od();
        if (r3 == 0) goto L_0x0030;
    L_0x0047:
        r1.add(r2);
        goto L_0x0030;
    L_0x004b:
        r7 = r1;
        r7 = (java.util.List) r7;
        r0 = 0;
        if (r22 == 0) goto L_0x0057;
    L_0x0051:
        r1 = r22.NT();
        r8 = r1;
        goto L_0x0058;
    L_0x0057:
        r8 = r0;
    L_0x0058:
        if (r22 == 0) goto L_0x0060;
    L_0x005a:
        r1 = r22.NU();
        r9 = r1;
        goto L_0x0061;
    L_0x0060:
        r9 = r0;
    L_0x0061:
        if (r22 == 0) goto L_0x0067;
    L_0x0063:
        r0 = r22.NV();
    L_0x0067:
        r10 = r0;
        r0 = 0;
        if (r22 == 0) goto L_0x006e;
    L_0x006b:
        r1 = 1;
        r11 = 1;
        goto L_0x006f;
    L_0x006e:
        r11 = 0;
    L_0x006f:
        if (r22 == 0) goto L_0x007d;
    L_0x0071:
        r1 = r22.NW();
        if (r1 == 0) goto L_0x007d;
    L_0x0077:
        r1 = r1.booleanValue();
        r12 = r1;
        goto L_0x007e;
    L_0x007d:
        r12 = 0;
    L_0x007e:
        if (r22 == 0) goto L_0x008c;
    L_0x0080:
        r1 = r22.NX();
        if (r1 == 0) goto L_0x008c;
    L_0x0086:
        r1 = r1.booleanValue();
        r13 = r1;
        goto L_0x008d;
    L_0x008c:
        r13 = 0;
    L_0x008d:
        if (r22 == 0) goto L_0x009b;
    L_0x008f:
        r1 = r22.NY();
        if (r1 == 0) goto L_0x009b;
    L_0x0095:
        r1 = r1.booleanValue();
        r14 = r1;
        goto L_0x009c;
    L_0x009b:
        r14 = 0;
    L_0x009c:
        if (r22 == 0) goto L_0x00aa;
    L_0x009e:
        r1 = r22.NZ();
        if (r1 == 0) goto L_0x00aa;
    L_0x00a4:
        r1 = r1.booleanValue();
        r15 = r1;
        goto L_0x00ab;
    L_0x00aa:
        r15 = 0;
    L_0x00ab:
        if (r22 == 0) goto L_0x00ba;
    L_0x00ad:
        r1 = r22.Oa();
        if (r1 == 0) goto L_0x00ba;
    L_0x00b3:
        r0 = r1.booleanValue();
        r16 = r0;
        goto L_0x00bc;
    L_0x00ba:
        r16 = 0;
    L_0x00bc:
        r4 = r18;
        r5 = r23;
        r17 = r24;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.charttools.e.l.<init>(android.util.SparseArray, java.util.List, java.util.List, com.iqoption.charttools.model.a.a, java.lang.String, com.iqoption.charttools.model.b.a):void");
    }

    public l(com.iqoption.charttools.model.b.a aVar, SparseArray<com.iqoption.core.microservices.tradingengine.response.active.a> sparseArray) {
        kotlin.jvm.internal.i.f(aVar, "template");
        kotlin.jvm.internal.i.f(sparseArray, "actives");
        this(sparseArray, aVar.LV(), aVar.Ms(), aVar.OW(), aVar.getName(), aVar);
    }
}
