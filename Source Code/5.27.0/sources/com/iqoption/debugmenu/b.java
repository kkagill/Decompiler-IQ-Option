package com.iqoption.debugmenu;

import com.iqoption.core.b.d;
import io.reactivex.e;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.processors.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/debugmenu/GuavaEventsToRxConverter;", "", "()V", "processor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/iqoption/core/event/IQEvent;", "kotlin.jvm.PlatformType", "iqGuavaEvents", "Lio/reactivex/Flowable;", "postGuavaEvent", "", "event", "app_optionXRelease"})
/* compiled from: GuavaEventsToRxConverter.kt */
public final class b {
    public static final b cve = new b();
    private static final a<d> processor;

    static {
        a bmJ = PublishProcessor.bmK().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "PublishProcessor.create<IQEvent>().toSerialized()");
        processor = bmJ;
    }

    private b() {
    }

    public final e<d> EI() {
        return processor;
    }

    public final void d(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "event");
        processor.onNext(dVar);
    }
}
