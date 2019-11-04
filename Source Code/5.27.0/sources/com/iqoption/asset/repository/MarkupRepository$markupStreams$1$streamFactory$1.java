package com.iqoption.asset.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.e;
import io.reactivex.b.c;
import io.reactivex.b.g;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/iqoption/core/IQAccount;", "invoke"})
/* compiled from: MarkupRepository.kt */
final class MarkupRepository$markupStreams$1$streamFactory$1 extends Lambda implements b<e, io.reactivex.e<Map<Integer, ? extends com.iqoption.core.microservices.risks.response.markup.a>>> {
    final /* synthetic */ InstrumentType $instrumentType;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "Lkotlin/Function1;", "T", "R", "result", "apply", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "com/iqoption/core/rx/RxCommonKt$mapMutator$1"})
    /* compiled from: RxCommon.kt */
    public static final class a<T, R> implements g<T, R> {
        /* renamed from: bx */
        public final b<T, T> apply(R r) {
            return new MarkupRepository$markupStreams$1$streamFactory$1$$special$$inlined$mapMutator$1$1(this, r);
        }
    }

    MarkupRepository$markupStreams$1$streamFactory$1(InstrumentType instrumentType) {
        this.$instrumentType = instrumentType;
        super(1);
    }

    /* renamed from: a */
    public final io.reactivex.e<Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>> invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "<anonymous parameter 0>");
        io.reactivex.e bkO = b.ayl.B(this.$instrumentType).bkO();
        kotlin.jvm.internal.i.e(bkO, "loadMarkups(instrumentTy…            .toFlowable()");
        bkO = com.iqoption.core.rx.g.f(bkO);
        io.reactivex.e c = b.ayj.c(com.iqoption.core.rx.i.aki());
        kotlin.jvm.internal.i.e(c, "forceRefreshProcessor.observeOn(bg)");
        c = com.iqoption.core.rx.g.f(c);
        io.reactivex.e g = com.iqoption.core.microservices.risks.a.a(com.iqoption.core.microservices.risks.a.bxY, this.$instrumentType, 0, 0, 6, null).g(new a());
        kotlin.jvm.internal.i.e(g, "map { result ->\n        …, result)\n        }\n    }");
        return io.reactivex.e.a((org.a.b) bkO, (org.a.b) io.reactivex.e.b((org.a.b) g, (org.a.b) c)).a(af.emptyMap(), (c) AnonymousClass1.ayo);
    }
}
