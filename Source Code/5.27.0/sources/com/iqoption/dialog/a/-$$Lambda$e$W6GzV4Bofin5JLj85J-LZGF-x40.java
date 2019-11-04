package com.iqoption.dialog.a;

import com.google.common.primitives.Longs;
import com.iqoption.mobbtech.connect.response.options.c;
import java.util.Comparator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$e$W6GzV4Bofin5JLj85J-LZGF-x40 implements Comparator {
    public static final /* synthetic */ -$$Lambda$e$W6GzV4Bofin5JLj85J-LZGF-x40 INSTANCE = new -$$Lambda$e$W6GzV4Bofin5JLj85J-LZGF-x40();

    private /* synthetic */ -$$Lambda$e$W6GzV4Bofin5JLj85J-LZGF-x40() {
    }

    public final int compare(Object obj, Object obj2) {
        return Longs.compare(((c) obj).getCreated(), ((c) obj2).getCreated());
    }
}
