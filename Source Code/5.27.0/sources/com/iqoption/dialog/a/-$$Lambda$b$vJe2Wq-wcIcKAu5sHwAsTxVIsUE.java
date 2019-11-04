package com.iqoption.dialog.a;

import com.google.common.primitives.Longs;
import com.iqoption.mobbtech.connect.response.options.c;
import java.util.Comparator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$b$vJe2Wq-wcIcKAu5sHwAsTxVIsUE implements Comparator {
    public static final /* synthetic */ -$$Lambda$b$vJe2Wq-wcIcKAu5sHwAsTxVIsUE INSTANCE = new -$$Lambda$b$vJe2Wq-wcIcKAu5sHwAsTxVIsUE();

    private /* synthetic */ -$$Lambda$b$vJe2Wq-wcIcKAu5sHwAsTxVIsUE() {
    }

    public final int compare(Object obj, Object obj2) {
        return Longs.compare(((c) obj).getClosed(), ((c) obj2).getClosed());
    }
}
