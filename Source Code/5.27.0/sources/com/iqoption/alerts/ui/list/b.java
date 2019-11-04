package com.iqoption.alerts.ui.list;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.microservices.useralerts.response.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u0012HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00109\u001a\u00020\u00122\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\rHÖ\u0001J\t\u0010=\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u0010\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0014\u0010\u000f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#¨\u0006>"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertItem;", "Lcom/iqoption/alerts/ui/list/BaseAlertItem;", "alert", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "assetName", "", "assetImage", "instrument", "value", "label", "valueColorRes", "", "labelColorRes", "labelImageTintRes", "labelImageRes", "isExpanded", "", "(Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIZ)V", "getAlert", "()Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "getAsset", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getAssetImage", "()Ljava/lang/String;", "getAssetName", "id", "getId", "getInstrument", "()Z", "setExpanded", "(Z)V", "getLabel", "getLabelColorRes", "()I", "getLabelImageRes", "getLabelImageTintRes", "longId", "", "getLongId", "()J", "getValue", "getValueColorRes", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "alerts_release"})
/* compiled from: AlertAdapterItems.kt */
public final class b extends i {
    private final a aoW;
    private final com.iqoption.core.microservices.tradingengine.response.active.a aoX;
    private final String aoY;
    private final String aoZ;
    private final int apa;
    private final int apb;
    private final int apc;
    private final int apd;
    private boolean ape;
    private final String assetName;
    private final String id;
    private final String label;
    private final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.y(this.aoW, bVar.aoW) && kotlin.jvm.internal.i.y(Bb(), bVar.Bb()) && kotlin.jvm.internal.i.y(Bc(), bVar.Bc()) && kotlin.jvm.internal.i.y(Bd(), bVar.Bd()) && kotlin.jvm.internal.i.y(Be(), bVar.Be()) && kotlin.jvm.internal.i.y(getValue(), bVar.getValue()) && kotlin.jvm.internal.i.y(getLabel(), bVar.getLabel())) {
                    if ((Bf() == bVar.Bf() ? 1 : null) != null) {
                        if ((Bg() == bVar.Bg() ? 1 : null) != null) {
                            if ((Bh() == bVar.Bh() ? 1 : null) != null) {
                                if ((Bi() == bVar.Bi() ? 1 : null) != null) {
                                    if ((nq() == bVar.nq() ? 1 : null) != null) {
                                        return true;
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
        a aVar = this.aoW;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        com.iqoption.core.microservices.tradingengine.response.active.a Bb = Bb();
        hashCode = (hashCode + (Bb != null ? Bb.hashCode() : 0)) * 31;
        String Bc = Bc();
        hashCode = (hashCode + (Bc != null ? Bc.hashCode() : 0)) * 31;
        Bc = Bd();
        hashCode = (hashCode + (Bc != null ? Bc.hashCode() : 0)) * 31;
        Bc = Be();
        hashCode = (hashCode + (Bc != null ? Bc.hashCode() : 0)) * 31;
        Bc = getValue();
        hashCode = (hashCode + (Bc != null ? Bc.hashCode() : 0)) * 31;
        Bc = getLabel();
        if (Bc != null) {
            i = Bc.hashCode();
        }
        hashCode = (((((((((hashCode + i) * 31) + Bf()) * 31) + Bg()) * 31) + Bh()) * 31) + Bi()) * 31;
        i = nq();
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AlertItem(alert=");
        stringBuilder.append(this.aoW);
        stringBuilder.append(", asset=");
        stringBuilder.append(Bb());
        stringBuilder.append(", assetName=");
        stringBuilder.append(Bc());
        stringBuilder.append(", assetImage=");
        stringBuilder.append(Bd());
        stringBuilder.append(", instrument=");
        stringBuilder.append(Be());
        stringBuilder.append(", value=");
        stringBuilder.append(getValue());
        stringBuilder.append(", label=");
        stringBuilder.append(getLabel());
        stringBuilder.append(", valueColorRes=");
        stringBuilder.append(Bf());
        stringBuilder.append(", labelColorRes=");
        stringBuilder.append(Bg());
        stringBuilder.append(", labelImageTintRes=");
        stringBuilder.append(Bh());
        stringBuilder.append(", labelImageRes=");
        stringBuilder.append(Bi());
        stringBuilder.append(", isExpanded=");
        stringBuilder.append(nq());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final a Ba() {
        return this.aoW;
    }

    public com.iqoption.core.microservices.tradingengine.response.active.a Bb() {
        return this.aoX;
    }

    public String Bc() {
        return this.assetName;
    }

    public String Bd() {
        return this.aoY;
    }

    public String Be() {
        return this.aoZ;
    }

    public String getValue() {
        return this.value;
    }

    public String getLabel() {
        return this.label;
    }

    public int Bf() {
        return this.apa;
    }

    public int Bg() {
        return this.apb;
    }

    public int Bh() {
        return this.apc;
    }

    public int Bi() {
        return this.apd;
    }

    public boolean nq() {
        return this.ape;
    }

    public void setExpanded(boolean z) {
        this.ape = z;
    }

    public b(a aVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar2, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, boolean z) {
        String str6 = "alert";
        kotlin.jvm.internal.i.f(aVar, str6);
        kotlin.jvm.internal.i.f(aVar2, "asset");
        kotlin.jvm.internal.i.f(str, "assetName");
        kotlin.jvm.internal.i.f(str2, "assetImage");
        kotlin.jvm.internal.i.f(str3, "instrument");
        kotlin.jvm.internal.i.f(str4, ConditionalUserProperty.VALUE);
        kotlin.jvm.internal.i.f(str5, PlusShare.KEY_CALL_TO_ACTION_LABEL);
        this.aoW = aVar;
        this.aoX = aVar2;
        this.assetName = str;
        this.aoY = str2;
        this.aoZ = str3;
        this.value = str4;
        this.label = str5;
        this.apa = i;
        this.apb = i2;
        this.apc = i3;
        this.apd = i4;
        this.ape = z;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str6);
        stringBuilder.append(this.aoW.getId());
        this.id = stringBuilder.toString();
    }

    public String getId() {
        return this.id;
    }

    public long AY() {
        return this.aoW.getId();
    }
}
