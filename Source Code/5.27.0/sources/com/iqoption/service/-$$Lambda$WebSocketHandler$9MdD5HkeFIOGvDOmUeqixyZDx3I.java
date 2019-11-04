package com.iqoption.service;

import com.google.gson.JsonArray;
import com.iqoption.core.data.model.InstrumentType;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$WebSocketHandler$9MdD5HkeFIOGvDOmUeqixyZDx3I implements Runnable {
    private final /* synthetic */ JsonArray f$0;
    private final /* synthetic */ InstrumentType f$1;

    public /* synthetic */ -$$Lambda$WebSocketHandler$9MdD5HkeFIOGvDOmUeqixyZDx3I(JsonArray jsonArray, InstrumentType instrumentType) {
        this.f$0 = jsonArray;
        this.f$1 = instrumentType;
    }

    public final void run() {
        WebSocketHandler.a(this.f$0, this.f$1);
    }
}
