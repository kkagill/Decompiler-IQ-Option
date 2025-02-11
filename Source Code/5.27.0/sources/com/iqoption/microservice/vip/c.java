package com.iqoption.microservice.vip;

import com.google.android.gms.plus.PlusShare;
import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, bng = {"Lcom/iqoption/microservice/vip/TrainingSessionCategory;", "", "()V", "id", "", "title", "", "logo", "(JLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getLogo", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_optionXRelease"})
/* compiled from: VipManagerResposnses.kt */
public final class c {
    @SerializedName("logo")
    private final String dHg;
    @SerializedName("id")
    private final long id;
    @SerializedName("title")
    private final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!((this.id == cVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.title, cVar.title) && kotlin.jvm.internal.i.y(this.dHg, cVar.dHg))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.title;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.dHg;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrainingSessionCategory(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", logo=");
        stringBuilder.append(this.dHg);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(long j, String str, String str2) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        kotlin.jvm.internal.i.f(str2, "logo");
        this.id = j;
        this.title = str;
        this.dHg = str2;
    }

    public final long getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String aOB() {
        return this.dHg;
    }

    public c() {
        String str = "";
        this(0, str, str);
    }
}
