package com.iqoption.dialog.a;

import com.google.common.primitives.Longs;
import com.iqoption.mobbtech.connect.response.options.c;
import java.util.Comparator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$b$ffdy4uPnxfMqjU1wUb3SnnhQTvQ implements Comparator {
    public static final /* synthetic */ -$$Lambda$b$ffdy4uPnxfMqjU1wUb3SnnhQTvQ INSTANCE = new -$$Lambda$b$ffdy4uPnxfMqjU1wUb3SnnhQTvQ();

    private /* synthetic */ -$$Lambda$b$ffdy4uPnxfMqjU1wUb3SnnhQTvQ() {
    }

    public final int compare(Object obj, Object obj2) {
        return Longs.compare(((c) obj).getCreated(), ((c) obj2).getCreated());
    }
}
