package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
class m {

    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class a {
        private final Set<a> abN = new HashSet();
        private final b<?> acd;
        private final Set<a> ace = new HashSet();

        a(b<?> bVar) {
            this.acd = bVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(a aVar) {
            this.abN.add(aVar);
        }

        /* Access modifiers changed, original: 0000 */
        public void b(a aVar) {
            this.ace.add(aVar);
        }

        /* Access modifiers changed, original: 0000 */
        public Set<a> vW() {
            return this.abN;
        }

        /* Access modifiers changed, original: 0000 */
        public void c(a aVar) {
            this.ace.remove(aVar);
        }

        /* Access modifiers changed, original: 0000 */
        public b<?> wl() {
            return this.acd;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean isRoot() {
            return this.ace.isEmpty();
        }

        /* Access modifiers changed, original: 0000 */
        public boolean wm() {
            return this.abN.isEmpty();
        }
    }

    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class b {
        private final Class<?> acf;
        private final boolean acg;

        private b(Class<?> cls, boolean z) {
            this.acf = cls;
            this.acg = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.acf.equals(this.acf) && bVar.acg == this.acg) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((this.acf.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.acg).hashCode();
        }
    }

    static void p(List<b<?>> list) {
        Set<a> q = q(list);
        Set g = g(q);
        int i = 0;
        while (!g.isEmpty()) {
            a aVar = (a) g.iterator().next();
            g.remove(aVar);
            i++;
            for (a aVar2 : aVar.vW()) {
                aVar2.c(aVar);
                if (aVar2.isRoot()) {
                    g.add(aVar2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (a aVar3 : q) {
                if (!(aVar3.isRoot() || aVar3.wm())) {
                    arrayList.add(aVar3.wl());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    private static Set<a> q(List<b<?>> list) {
        a aVar;
        HashMap hashMap = new HashMap(list.size());
        for (b bVar : list) {
            aVar = new a(bVar);
            for (Class bVar2 : bVar.vV()) {
                b bVar3 = new b(bVar2, bVar.wb() ^ 1);
                if (!hashMap.containsKey(bVar3)) {
                    hashMap.put(bVar3, new HashSet());
                }
                Set set = (Set) hashMap.get(bVar3);
                if (set.isEmpty() || bVar3.acg) {
                    set.add(aVar);
                } else {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{bVar2}));
                }
            }
        }
        for (Set<a> it : hashMap.values()) {
            for (a aVar2 : it) {
                for (n nVar : aVar2.wl().vW()) {
                    if (nVar.wq()) {
                        Set<a> set2 = (Set) hashMap.get(new b(nVar.wn(), nVar.wp()));
                        if (set2 != null) {
                            for (a aVar3 : set2) {
                                aVar2.a(aVar3);
                                aVar3.b(aVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }

    private static Set<a> g(Set<a> set) {
        HashSet hashSet = new HashSet();
        for (a aVar : set) {
            if (aVar.isRoot()) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }
}
