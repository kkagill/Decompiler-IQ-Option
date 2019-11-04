package com.iqoption.videoeducation;

import com.google.android.gms.plus.PlusShare;
import com.iqoption.videoeducation.c.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, bng = {"Lcom/iqoption/videoeducation/VideoCatalogItem;", "Lcom/iqoption/videoeducation/VideoCatalogAdapterItem;", "catalog", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "icon", "", "title", "allCount", "newCount", "(Lcom/iqoption/videoeducation/model/VideoCatalog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAllCount", "()Ljava/lang/String;", "getCatalog", "()Lcom/iqoption/videoeducation/model/VideoCatalog;", "getIcon", "getNewCount", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_optionXRelease"})
/* compiled from: VideoCatalogAdapterItems.kt */
public final class f extends d {
    private final String boP;
    private final a ecp;
    private final String ecq;
    private final String ecr;
    private final String title;

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.i.y(r2.ecr, r3.ecr) != false) goto L_0x003d;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.videoeducation.f;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.iqoption.videoeducation.f) r3;
        r0 = r2.ecp;
        r1 = r3.ecp;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.boP;
        r1 = r3.boP;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.title;
        r1 = r3.title;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.ecq;
        r1 = r3.ecq;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.ecr;
        r3 = r3.ecr;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r3 = 0;
        return r3;
    L_0x003d:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.videoeducation.f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        a aVar = this.ecp;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.boP;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.title;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.ecq;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.ecr;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VideoCatalogItem(catalog=");
        stringBuilder.append(this.ecp);
        stringBuilder.append(", icon=");
        stringBuilder.append(this.boP);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", allCount=");
        stringBuilder.append(this.ecq);
        stringBuilder.append(", newCount=");
        stringBuilder.append(this.ecr);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final a aXf() {
        return this.ecp;
    }

    public final String aWd() {
        return this.boP;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String aXg() {
        return this.ecq;
    }

    public final String aXh() {
        return this.ecr;
    }

    public f(a aVar, String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.i.f(aVar, "catalog");
        kotlin.jvm.internal.i.f(str2, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        super(aVar.aXE().getId(), null);
        this.ecp = aVar;
        this.boP = str;
        this.title = str2;
        this.ecq = str3;
        this.ecr = str4;
    }
}
