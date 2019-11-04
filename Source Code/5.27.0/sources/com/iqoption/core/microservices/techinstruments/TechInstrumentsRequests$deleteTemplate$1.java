package com.iqoption.core.microservices.techinstruments;

import com.google.gson.stream.JsonReader;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/google/gson/stream/JsonReader;", "invoke"})
/* compiled from: TechInstrumentsRequests.kt */
final class TechInstrumentsRequests$deleteTemplate$1 extends Lambda implements b<JsonReader, String> {
    public static final TechInstrumentsRequests$deleteTemplate$1 byO = new TechInstrumentsRequests$deleteTemplate$1();

    TechInstrumentsRequests$deleteTemplate$1() {
        super(1);
    }

    /* renamed from: e */
    public final String invoke(JsonReader jsonReader) {
        kotlin.jvm.internal.i.f(jsonReader, "it");
        return "delete-template";
    }
}
