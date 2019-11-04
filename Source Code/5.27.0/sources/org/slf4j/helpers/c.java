package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.a;
import org.slf4j.b;

/* compiled from: SubstituteLoggerFactory */
public class c implements a {
    final ConcurrentMap<String, b> fFN = new ConcurrentHashMap();

    public b nE(String str) {
        b bVar = (b) this.fFN.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(str);
        b bVar3 = (b) this.fFN.putIfAbsent(str, bVar2);
        return bVar3 != null ? bVar3 : bVar2;
    }

    public List<b> bSD() {
        return new ArrayList(this.fFN.values());
    }

    public void clear() {
        this.fFN.clear();
    }
}
