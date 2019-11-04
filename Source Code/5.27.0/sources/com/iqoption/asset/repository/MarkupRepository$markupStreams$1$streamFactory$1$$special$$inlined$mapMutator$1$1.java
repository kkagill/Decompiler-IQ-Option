package com.iqoption.asset.repository;

import com.iqoption.asset.repository.MarkupRepository.markupStreams.1.streamFactory.1.a;
import com.iqoption.core.microservices.risks.response.markup.d;
import java.util.Map;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "T", "R", "old", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/iqoption/core/rx/RxCommonKt$mapMutator$1$1"})
/* compiled from: RxCommon.kt */
public final class MarkupRepository$markupStreams$1$streamFactory$1$$special$$inlined$mapMutator$1$1 extends Lambda implements b<T, T> {
    final /* synthetic */ Object $result;
    final /* synthetic */ a this$0;

    public MarkupRepository$markupStreams$1$streamFactory$1$$special$$inlined$mapMutator$1$1(a aVar, Object obj) {
        this.this$0 = aVar;
        this.$result = obj;
        super(1);
    }

    public final T invoke(T t) {
        d dVar = (d) this.$result;
        return af.a((Map) t, j.x(Integer.valueOf(dVar.getActiveId()), dVar.ahl()));
    }
}
