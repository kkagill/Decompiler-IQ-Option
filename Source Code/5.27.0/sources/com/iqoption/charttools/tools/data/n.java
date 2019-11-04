package com.iqoption.charttools.tools.data;

import com.google.android.gms.plus.PlusShare;
import com.iqoption.charttools.model.indicator.x;
import com.iqoption.core.data.model.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006&"}, bng = {"Lcom/iqoption/charttools/tools/data/TitleIndicatorItem;", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "meta", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "title", "", "icon", "Lcom/iqoption/core/data/model/UrlOrRes;", "info", "isExpanded", "", "isFavorite", "isAvailable", "(Lcom/iqoption/charttools/model/indicator/MetaIndicator;Ljava/lang/String;Lcom/iqoption/core/data/model/UrlOrRes;Ljava/lang/String;ZZZ)V", "getIcon", "()Lcom/iqoption/core/data/model/UrlOrRes;", "id", "getId", "()Ljava/lang/String;", "getInfo", "()Z", "getMeta", "()Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "app_optionXRelease"})
/* compiled from: IndicatorAdapterItems.kt */
public final class n extends h {
    private final x aEL;
    private final e aNe;
    private final boolean aNf;
    private final boolean ape;
    private final boolean axL;
    private final String id;
    private final String info;
    private final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (kotlin.jvm.internal.i.y(this.aEL, nVar.aEL) && kotlin.jvm.internal.i.y(this.title, nVar.title) && kotlin.jvm.internal.i.y(this.aNe, nVar.aNe) && kotlin.jvm.internal.i.y(this.info, nVar.info)) {
                    if ((this.ape == nVar.ape ? 1 : null) != null) {
                        if ((this.axL == nVar.axL ? 1 : null) != null) {
                            if ((this.aNf == nVar.aNf ? 1 : null) != null) {
                                return true;
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
        x xVar = this.aEL;
        int i = 0;
        int hashCode = (xVar != null ? xVar.hashCode() : 0) * 31;
        String str = this.title;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        e eVar = this.aNe;
        hashCode = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        str = this.info;
        if (str != null) {
            i = str.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.ape;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.axL;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.aNf;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TitleIndicatorItem(meta=");
        stringBuilder.append(this.aEL);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", icon=");
        stringBuilder.append(this.aNe);
        stringBuilder.append(", info=");
        stringBuilder.append(this.info);
        stringBuilder.append(", isExpanded=");
        stringBuilder.append(this.ape);
        stringBuilder.append(", isFavorite=");
        stringBuilder.append(this.axL);
        stringBuilder.append(", isAvailable=");
        stringBuilder.append(this.aNf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final x MH() {
        return this.aEL;
    }

    public final String getTitle() {
        return this.title;
    }

    public final e Op() {
        return this.aNe;
    }

    public final String getInfo() {
        return this.info;
    }

    public final boolean nq() {
        return this.ape;
    }

    public final boolean QE() {
        return this.axL;
    }

    public final boolean isAvailable() {
        return this.aNf;
    }

    public n(x xVar, String str, e eVar, String str2, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.i.f(xVar, "meta");
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        kotlin.jvm.internal.i.f(eVar, "icon");
        super();
        this.aEL = xVar;
        this.title = str;
        this.aNe = eVar;
        this.info = str2;
        this.ape = z;
        this.axL = z2;
        this.aNf = z3;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("item:");
        stringBuilder.append(this.aEL.Or());
        this.id = stringBuilder.toString();
    }

    public String getId() {
        return this.id;
    }
}
