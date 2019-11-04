package com.iqoption.core.microservices.chat.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0005\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\f¨\u0006!"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "", "()V", "id", "", "isPrivate", "", "url", "path", "thumbnail", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "isImage", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPath", "getThumbnail", "url$annotations", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "equals", "other", "hashCode", "", "toString", "core_release"})
/* compiled from: ChatAttachment.kt */
public final class a {
    @SerializedName("is_private")
    private final Boolean bpW;
    @SerializedName("thumbnail")
    private final String bpX;
    @SerializedName("id")
    private final String id;
    @SerializedName("path")
    private final String path;
    @SerializedName("url")
    private final String url;

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bpX, r3.bpX) != false) goto L_0x003d;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.chat.response.a;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.chat.response.a) r3;
        r0 = r2.id;
        r1 = r3.id;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.bpW;
        r1 = r3.bpW;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.url;
        r1 = r3.url;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.path;
        r1 = r3.path;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.bpX;
        r3 = r3.bpX;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.chat.response.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.bpW;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.path;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bpX;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChatAttachment(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", isPrivate=");
        stringBuilder.append(this.bpW);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", path=");
        stringBuilder.append(this.path);
        stringBuilder.append(", thumbnail=");
        stringBuilder.append(this.bpX);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(String str, Boolean bool, String str2, String str3, String str4) {
        kotlin.jvm.internal.i.f(str, "id");
        this.id = str;
        this.bpW = bool;
        this.url = str2;
        this.path = str3;
        this.bpX = str4;
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ a(String str, Boolean bool, String str2, String str3, String str4, int i, f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            bool = (Boolean) null;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            str2 = (String) null;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = (String) null;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = (String) null;
        }
        this(str, bool2, str5, str6, str4);
    }

    public final Boolean abT() {
        return this.bpW;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean abS() {
        return this.bpX != null;
    }

    public a() {
        this("", null, null, null, null, 30, null);
    }
}
