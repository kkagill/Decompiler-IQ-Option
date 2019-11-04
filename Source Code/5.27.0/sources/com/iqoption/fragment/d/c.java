package com.iqoption.fragment.d;

import com.google.common.collect.ImmutableSet;
import com.iqoption.dto.entity.iqbus.SignalLegacy;

/* compiled from: SignalManagerEvent */
public interface c {

    /* compiled from: SignalManagerEvent */
    public static class a implements c {
    }

    /* compiled from: SignalManagerEvent */
    public static class b implements c {
        private final ImmutableSet<Integer> dqB;
        private final SignalLegacy[] dqC;

        public b(ImmutableSet<Integer> immutableSet, SignalLegacy[] signalLegacyArr) {
            this.dqB = immutableSet;
            this.dqC = signalLegacyArr;
        }
    }
}
