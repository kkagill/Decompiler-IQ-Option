package com.google.firebase.c;

import com.google.firebase.components.n;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class b implements g {
    private final String aeK;
    private final d aeL;

    b(Set<e> set, d dVar) {
        this.aeK = h(set);
        this.aeL = dVar;
    }

    public String hu() {
        if (this.aeL.xd().isEmpty()) {
            return this.aeK;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.aeK);
        stringBuilder.append(' ');
        stringBuilder.append(h(this.aeL.xd()));
        return stringBuilder.toString();
    }

    private static String h(Set<e> set) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            stringBuilder.append(eVar.xa());
            stringBuilder.append('/');
            stringBuilder.append(eVar.getVersion());
            if (it.hasNext()) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }

    public static com.google.firebase.components.b<g> xb() {
        return com.google.firebase.components.b.q(g.class).a(n.w(e.class)).a(c.xc()).wf();
    }
}
