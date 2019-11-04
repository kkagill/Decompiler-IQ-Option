package com.iqoption.a;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: StableIdStore */
public final class i {
    private final Map<String, Long> ana = Maps.uk();
    private final Set<Long> anb = Sets.uw();

    public long de(String str) {
        Long l = (Long) this.ana.get(str);
        if (l != null) {
            return l.longValue();
        }
        long AP = AP();
        this.ana.put(str, Long.valueOf(AP));
        return AP;
    }

    private long AP() {
        long leastSignificantBits;
        UUID uuid = null;
        do {
            if (uuid == null) {
                uuid = UUID.randomUUID();
                leastSignificantBits = uuid.getLeastSignificantBits();
            } else {
                leastSignificantBits = uuid.getMostSignificantBits();
                uuid = null;
            }
        } while (!this.anb.add(Long.valueOf(leastSignificantBits)));
        return leastSignificantBits;
    }
}
