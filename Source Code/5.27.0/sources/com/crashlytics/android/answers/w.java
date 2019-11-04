package com.crashlytics.android.answers;

import java.util.Set;

/* compiled from: SamplingEventFilter */
class w implements n {
    static final Set<Type> oK = new SamplingEventFilter$1();
    final int oJ;

    public w(int i) {
        this.oJ = i;
    }

    public boolean a(SessionEvent sessionEvent) {
        Object obj = (oK.contains(sessionEvent.oS) && sessionEvent.oR.pd == null) ? 1 : null;
        Object obj2 = Math.abs(sessionEvent.oR.pb.hashCode() % this.oJ) != 0 ? 1 : null;
        if (obj == null || obj2 == null) {
            return false;
        }
        return true;
    }
}
