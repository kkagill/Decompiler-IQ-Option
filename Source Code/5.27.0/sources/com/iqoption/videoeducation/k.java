package com.iqoption.videoeducation;

import com.iqoption.core.microservices.videoeducation.response.g;
import com.iqoption.videoeducation.c.a;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, bng = {"Lcom/iqoption/videoeducation/VideoEducationWatched;", "Lcom/iqoption/videoeducation/VideoEducationEvent;", "video", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "catalogs", "", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "(Lcom/iqoption/core/microservices/videoeducation/response/Video;Ljava/util/List;)V", "getVideo", "()Lcom/iqoption/core/microservices/videoeducation/response/Video;", "videoeducation_release"})
/* compiled from: VideoEducationManager.kt */
public final class k extends h {
    private final g aJI;

    public k(g gVar, List<a> list) {
        kotlin.jvm.internal.i.f(gVar, "video");
        kotlin.jvm.internal.i.f(list, "catalogs");
        super(list, null);
        this.aJI = gVar;
    }

    public final g aXu() {
        return this.aJI;
    }
}
