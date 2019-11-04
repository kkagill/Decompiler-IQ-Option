package org.threeten.bp.zone;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.threeten.bp.a.d;

/* compiled from: ZoneRulesProvider */
public abstract class c {
    private static final ConcurrentMap<String, c> fJA = new ConcurrentHashMap(512, 0.75f, 2);
    private static final CopyOnWriteArrayList<c> fJz = new CopyOnWriteArrayList();

    public abstract ZoneRules G(String str, boolean z);

    public abstract Set<String> bTW();

    static {
        b.initialize();
    }

    public static ZoneRules H(String str, boolean z) {
        d.requireNonNull(str, "zoneId");
        return nP(str).G(str, z);
    }

    private static c nP(String str) {
        c cVar = (c) fJA.get(str);
        if (cVar != null) {
            return cVar;
        }
        if (fJA.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown time-zone ID: ");
        stringBuilder.append(str);
        throw new ZoneRulesException(stringBuilder.toString());
    }

    public static void a(c cVar) {
        d.requireNonNull(cVar, "provider");
        b(cVar);
        fJz.add(cVar);
    }

    private static void b(c cVar) {
        for (String str : cVar.bTW()) {
            d.requireNonNull(str, "zoneId");
            if (((c) fJA.putIfAbsent(str, cVar)) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to register zone as one already registered with that ID: ");
                stringBuilder.append(str);
                stringBuilder.append(", currently loading from provider: ");
                stringBuilder.append(cVar);
                throw new ZoneRulesException(stringBuilder.toString());
            }
        }
    }

    protected c() {
    }
}
