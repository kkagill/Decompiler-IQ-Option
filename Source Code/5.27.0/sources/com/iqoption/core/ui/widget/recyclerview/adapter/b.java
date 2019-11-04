package com.iqoption.core.ui.widget.recyclerview.adapter;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000RN\u0010\u0007\u001aB\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/adapter/StableIdStore;", "", "()V", "idSet", "Ljava/util/HashSet;", "", "kotlin.jvm.PlatformType", "idUidMap", "Ljava/util/HashMap;", "", "get", "uid", "makeId", "core_release"})
/* compiled from: StableIdStore.kt */
public final class b {
    private final HashMap<String, Long> bPp = Maps.uk();
    private final HashSet<Long> bPq = Sets.uw();

    public final long de(String str) {
        kotlin.jvm.internal.i.f(str, "uid");
        Long l = (Long) this.bPp.get(str);
        if (l != null) {
            return l.longValue();
        }
        long AP = AP();
        HashMap hashMap = this.bPp;
        kotlin.jvm.internal.i.e(hashMap, "idUidMap");
        hashMap.put(str, Long.valueOf(AP));
        return AP;
    }

    private final long AP() {
        long leastSignificantBits;
        UUID uuid = (UUID) null;
        UUID uuid2 = uuid;
        do {
            if (uuid2 == null) {
                uuid2 = UUID.randomUUID();
                if (uuid2 == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                leastSignificantBits = uuid2.getLeastSignificantBits();
            } else {
                leastSignificantBits = uuid2.getMostSignificantBits();
                uuid2 = uuid;
            }
        } while (!this.bPq.add(Long.valueOf(leastSignificantBits)));
        return leastSignificantBits;
    }
}
