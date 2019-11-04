package com.iqoption.fragment.assets.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, bng = {"Lcom/iqoption/fragment/assets/model/AssetClosed;", "Lcom/iqoption/fragment/assets/model/AssetItem;", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "image", "", "name", "isFavorite", "", "quote", "openAt", "(Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAsset", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getImage", "()Ljava/lang/String;", "()Z", "isOpened", "getName", "getOpenAt", "getQuote", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "app_optionXRelease"})
/* compiled from: AssetAdapterItems.kt */
public final class h extends k {
    private final String Dy;
    private final a aoX;
    private final boolean axL;
    private final String dcg;
    private final String image;
    private final String name;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (kotlin.jvm.internal.i.y(this.aoX, hVar.aoX) && kotlin.jvm.internal.i.y(this.image, hVar.image) && kotlin.jvm.internal.i.y(getName(), hVar.getName())) {
                    if (!((QE() == hVar.QE() ? 1 : null) != null && kotlin.jvm.internal.i.y(this.Dy, hVar.Dy) && kotlin.jvm.internal.i.y(this.dcg, hVar.dcg))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        a aVar = this.aoX;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.image;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = getName();
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        int QE = QE();
        if (QE != 0) {
            QE = 1;
        }
        hashCode = (hashCode + QE) * 31;
        str = this.Dy;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.dcg;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public boolean isOpened() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetClosed(asset=");
        stringBuilder.append(this.aoX);
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append(", name=");
        stringBuilder.append(getName());
        stringBuilder.append(", isFavorite=");
        stringBuilder.append(QE());
        stringBuilder.append(", quote=");
        stringBuilder.append(this.Dy);
        stringBuilder.append(", openAt=");
        stringBuilder.append(this.dcg);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final String getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public boolean QE() {
        return this.axL;
    }

    public final String mp() {
        return this.Dy;
    }

    public final String aAZ() {
        return this.dcg;
    }

    public h(a aVar, String str, String str2, boolean z, String str3, String str4) {
        kotlin.jvm.internal.i.f(aVar, "asset");
        kotlin.jvm.internal.i.f(str2, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str3, "quote");
        kotlin.jvm.internal.i.f(str4, "openAt");
        super(aVar, null);
        this.aoX = aVar;
        this.image = str;
        this.name = str2;
        this.axL = z;
        this.Dy = str3;
        this.dcg = str4;
    }
}
