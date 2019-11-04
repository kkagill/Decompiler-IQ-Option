package com.iqoption.dialog.a;

import com.google.common.primitives.Longs;
import com.iqoption.dto.Point;
import java.util.Comparator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$b$Slxe8WKkRcdIeL2k0yLPBIj10qc implements Comparator {
    public static final /* synthetic */ -$$Lambda$b$Slxe8WKkRcdIeL2k0yLPBIj10qc INSTANCE = new -$$Lambda$b$Slxe8WKkRcdIeL2k0yLPBIj10qc();

    private /* synthetic */ -$$Lambda$b$Slxe8WKkRcdIeL2k0yLPBIj10qc() {
    }

    public final int compare(Object obj, Object obj2) {
        return Longs.compare(((Point) obj).timestamp, ((Point) obj2).timestamp);
    }
}
