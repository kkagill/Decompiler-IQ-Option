package com.iqoption.core.microservices.techinstruments;

import com.iqoption.core.d;
import com.iqoption.core.microservices.techinstruments.a.c;
import io.reactivex.e;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/techinstruments/response/ModifiedTemplates;", "invoke"})
/* compiled from: TechInstrumentsRequests.kt */
final class TechInstrumentsRequests$templateUpdates$2 extends Lambda implements a<e<c>> {
    public static final TechInstrumentsRequests$templateUpdates$2 byP = new TechInstrumentsRequests$templateUpdates$2();

    TechInstrumentsRequests$templateUpdates$2() {
        super(0);
    }

    /* renamed from: abK */
    public final e<c> invoke() {
        return d.EW().b("modified-templates", c.class).HQ();
    }
}
