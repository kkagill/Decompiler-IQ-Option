package com.iqoption.alerts.ui.list;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.core.microservices.useralerts.response.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0002\u0010\u0011J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003Jw\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\u0013\u00108\u001a\u00020\u001a2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\rHÖ\u0001J\t\u0010<\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0010\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0014\u0010\u000f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0015R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!¨\u0006="}, bng = {"Lcom/iqoption/alerts/ui/list/TriggerItem;", "Lcom/iqoption/alerts/ui/list/BaseAlertItem;", "trigger", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "assetName", "", "assetImage", "instrument", "value", "label", "valueColorRes", "", "labelColorRes", "labelImageTintRes", "labelImageRes", "(Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V", "getAsset", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getAssetImage", "()Ljava/lang/String;", "getAssetName", "id", "getId", "getInstrument", "", "isExpanded", "()Z", "setExpanded", "(Z)V", "getLabel", "getLabelColorRes", "()I", "getLabelImageRes", "getLabelImageTintRes", "longId", "", "getLongId", "()J", "getTrigger", "()Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "getValue", "getValueColorRes", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "alerts_release"})
/* compiled from: AlertAdapterItems.kt */
public final class m extends i {
    private final a aoX;
    private final String aoY;
    private final String aoZ;
    private final b apQ;
    private final int apa;
    private final int apb;
    private final int apc;
    private final int apd;
    private final String assetName;
    private final String id;
    private final String label;
    private final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (kotlin.jvm.internal.i.y(this.apQ, mVar.apQ) && kotlin.jvm.internal.i.y(Bb(), mVar.Bb()) && kotlin.jvm.internal.i.y(Bc(), mVar.Bc()) && kotlin.jvm.internal.i.y(Bd(), mVar.Bd()) && kotlin.jvm.internal.i.y(Be(), mVar.Be()) && kotlin.jvm.internal.i.y(getValue(), mVar.getValue()) && kotlin.jvm.internal.i.y(getLabel(), mVar.getLabel())) {
                    if ((Bf() == mVar.Bf() ? 1 : null) != null) {
                        if ((Bg() == mVar.Bg() ? 1 : null) != null) {
                            if ((Bh() == mVar.Bh() ? 1 : null) != null) {
                                if ((Bi() == mVar.Bi() ? 1 : null) != null) {
                                    return true;
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
        b bVar = this.apQ;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        a Bb = Bb();
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
        return ((((((((hashCode + i) * 31) + Bf()) * 31) + Bg()) * 31) + Bh()) * 31) + Bi();
    }

    public boolean nq() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TriggerItem(trigger=");
        stringBuilder.append(this.apQ);
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
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a Bb() {
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

    public m(b bVar, a aVar, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4) {
        String str6 = "trigger";
        kotlin.jvm.internal.i.f(bVar, str6);
        kotlin.jvm.internal.i.f(aVar, "asset");
        kotlin.jvm.internal.i.f(str, "assetName");
        kotlin.jvm.internal.i.f(str2, "assetImage");
        kotlin.jvm.internal.i.f(str3, "instrument");
        kotlin.jvm.internal.i.f(str4, ConditionalUserProperty.VALUE);
        kotlin.jvm.internal.i.f(str5, PlusShare.KEY_CALL_TO_ACTION_LABEL);
        this.apQ = bVar;
        this.aoX = aVar;
        this.assetName = str;
        this.aoY = str2;
        this.aoZ = str3;
        this.value = str4;
        this.label = str5;
        this.apa = i;
        this.apb = i2;
        this.apc = i3;
        this.apd = i4;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str6);
        stringBuilder.append(this.apQ.getId());
        this.id = stringBuilder.toString();
    }

    public String getId() {
        return this.id;
    }

    public long AY() {
        return this.apQ.getId();
    }
}
