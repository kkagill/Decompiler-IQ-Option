package com.iqoption.videoeducation;

import com.iqoption.core.microservices.videoeducation.response.g;
import com.iqoption.core.util.TimeUtil;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, bng = {"Lcom/iqoption/videoeducation/VideoItem;", "Lcom/iqoption/videoeducation/VideoAdapterItem;", "video", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "(Lcom/iqoption/core/microservices/videoeducation/response/Video;)V", "duration", "", "getDuration", "()Ljava/lang/String;", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(J)V", "getVideo", "()Lcom/iqoption/core/microservices/videoeducation/response/Video;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_optionXRelease"})
/* compiled from: VideoAdapterItems.kt */
public final class m extends c {
    private final g aJI;
    private final String ecN;
    private long id = this.aJI.getId();

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.aJI, ((com.iqoption.videoeducation.m) r2).aJI) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.videoeducation.m;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.videoeducation.m) r2;
        r0 = r1.aJI;
        r2 = r2.aJI;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.videoeducation.m.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        g gVar = this.aJI;
        return gVar != null ? gVar.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VideoItem(video=");
        stringBuilder.append(this.aJI);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public m(g gVar) {
        kotlin.jvm.internal.i.f(gVar, "video");
        String str = null;
        super();
        this.aJI = gVar;
        Integer ajo = this.aJI.ajo();
        if (ajo != null) {
            str = TimeUtil.bRM.anK().format(Integer.valueOf(ajo.intValue() * 1000));
        }
        this.ecN = str;
    }

    public final g aXu() {
        return this.aJI;
    }

    public Long getId() {
        return Long.valueOf(this.id);
    }

    public final String aXv() {
        return this.ecN;
    }
}
