package com.iqoption.core.data.model;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/data/model/UrlOrRes;", "", "url", "", "resId", "", "(Ljava/lang/String;I)V", "getResId", "()I", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "core_release"})
/* compiled from: UrlOrRes.kt */
public final class e {
    private final int resId;
    private final String url;

    public e() {
        this(null, 0, 3, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (kotlin.jvm.internal.i.y(this.url, eVar.url)) {
                    if ((this.resId == eVar.resId ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.url;
        return ((str != null ? str.hashCode() : 0) * 31) + this.resId;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UrlOrRes(url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", resId=");
        stringBuilder.append(this.resId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(String str, int i) {
        this.url = str;
        this.resId = i;
    }

    public /* synthetic */ e(String str, int i, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            str = (String) null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        this(str, i);
    }

    public final int getResId() {
        return this.resId;
    }

    public final String getUrl() {
        return this.url;
    }
}
