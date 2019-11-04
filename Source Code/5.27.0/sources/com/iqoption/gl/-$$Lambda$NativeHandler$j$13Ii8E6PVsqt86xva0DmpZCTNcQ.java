package com.iqoption.gl;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.position.Position;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$NativeHandler$j$13Ii8E6PVsqt86xva0DmpZCTNcQ implements Runnable {
    private final /* synthetic */ Position f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;
    private final /* synthetic */ InstrumentType f$3;
    private final /* synthetic */ double f$4;
    private final /* synthetic */ double f$5;

    public /* synthetic */ -$$Lambda$NativeHandler$j$13Ii8E6PVsqt86xva0DmpZCTNcQ(Position position, String str, String str2, InstrumentType instrumentType, double d, double d2) {
        this.f$0 = position;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = instrumentType;
        this.f$4 = d;
        this.f$5 = d2;
    }

    public final void run() {
        j.a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
    }
}
