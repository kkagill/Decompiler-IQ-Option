package com.google.firebase.components;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.a.c;
import com.google.firebase.a.d;
import com.google.firebase.b.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class i extends a {
    private static final a<Set<Object>> abU = l.wk();
    private final Map<b<?>, q<?>> abV = new HashMap();
    private final Map<Class<?>, q<?>> abW = new HashMap();
    private final Map<Class<?>, q<Set<?>>> abX = new HashMap();
    private final o abY;

    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    public /* bridge */ /* synthetic */ Set p(Class cls) {
        return super.p(cls);
    }

    public i(Executor executor, Iterable<h> iterable, b<?>... bVarArr) {
        this.abY = new o(executor);
        ArrayList<b> arrayList = new ArrayList();
        arrayList.add(b.a(this.abY, o.class, d.class, c.class));
        for (h components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, bVarArr);
        m.p(arrayList);
        for (b bVar : arrayList) {
            this.abV.put(bVar, new q(j.b(this, bVar)));
        }
        wh();
        wi();
    }

    private void wh() {
        for (Entry entry : this.abV.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.wb()) {
                q qVar = (q) entry.getValue();
                for (Class put : bVar.vV()) {
                    this.abW.put(put, qVar);
                }
            }
        }
        wj();
    }

    private void wi() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.abV.entrySet()) {
            b bVar = (b) entry.getKey();
            if (!bVar.wb()) {
                q qVar = (q) entry.getValue();
                for (Class cls : bVar.vV()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(qVar);
                }
            }
        }
        for (Entry entry2 : hashMap.entrySet()) {
            this.abX.put((Class) entry2.getKey(), new q(k.f((Set) entry2.getValue())));
        }
    }

    static /* synthetic */ Set e(Set set) {
        HashSet hashSet = new HashSet();
        for (q qVar : set) {
            hashSet.add(qVar.get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public <T> a<T> t(Class<T> cls) {
        Preconditions.checkNotNull(cls, "Null interface requested.");
        return (a) this.abW.get(cls);
    }

    public <T> a<Set<T>> u(Class<T> cls) {
        q qVar = (q) this.abX.get(cls);
        if (qVar != null) {
            return qVar;
        }
        return abU;
    }

    public void am(boolean z) {
        for (Entry entry : this.abV.entrySet()) {
            b bVar = (b) entry.getKey();
            q qVar = (q) entry.getValue();
            if (bVar.vZ() || (bVar.wa() && z)) {
                qVar.get();
            }
        }
        this.abY.wr();
    }

    private void wj() {
        for (b vW : this.abV.keySet()) {
            for (n nVar : vW.vW()) {
                if (nVar.wo()) {
                    if (!this.abW.containsKey(nVar.wn())) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{vW, nVar.wn()}));
                    }
                }
            }
        }
    }
}
