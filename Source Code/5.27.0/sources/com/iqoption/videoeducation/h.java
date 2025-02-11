package com.iqoption.videoeducation;

import com.iqoption.videoeducation.c.a;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0001\u0001\b¨\u0006\t"}, bng = {"Lcom/iqoption/videoeducation/VideoEducationEvent;", "", "catalogs", "", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "(Ljava/util/List;)V", "getCatalogs", "()Ljava/util/List;", "Lcom/iqoption/videoeducation/VideoEducationWatched;", "videoeducation_release"})
/* compiled from: VideoEducationManager.kt */
public abstract class h {
    private final List<a> ecs;

    private h(List<a> list) {
        this.ecs = list;
    }

    public /* synthetic */ h(List list, f fVar) {
        this(list);
    }

    public final List<a> aXi() {
        return this.ecs;
    }
}
