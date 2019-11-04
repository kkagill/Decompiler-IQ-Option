package com.iqoption.fragment.leftmenu;

import com.iqoption.fragment.leftmenu.content.a;
import java.util.Comparator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$b$tfYtzgWDU32y6DjSBmv6__rttVs implements Comparator {
    public static final /* synthetic */ -$$Lambda$b$tfYtzgWDU32y6DjSBmv6__rttVs INSTANCE = new -$$Lambda$b$tfYtzgWDU32y6DjSBmv6__rttVs();

    private /* synthetic */ -$$Lambda$b$tfYtzgWDU32y6DjSBmv6__rttVs() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.compare((long) ((a) obj).menuPriority(), (long) ((a) obj2).menuPriority());
    }
}
