package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public final class b<T> {
    private final Set<Class<? super T>> abM;
    private final Set<n> abN;
    private final int abO;
    private final g<T> abP;
    private final Set<Class<?>> abQ;
    private final int type;

    @KeepForSdk
    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    public static class a<T> {
        private final Set<Class<? super T>> abM;
        private final Set<n> abN;
        private int abO;
        private g<T> abP;
        private Set<Class<?>> abQ;
        private int type;

        @SafeVarargs
        private a(Class<T> cls, Class<? super T>... clsArr) {
            this.abM = new HashSet();
            this.abN = new HashSet();
            int i = 0;
            this.abO = 0;
            this.type = 0;
            this.abQ = new HashSet();
            String str = "Null interface";
            Preconditions.checkNotNull(cls, str);
            this.abM.add(cls);
            int length = clsArr.length;
            while (i < length) {
                Preconditions.checkNotNull(clsArr[i], str);
                i++;
            }
            Collections.addAll(this.abM, clsArr);
        }

        @KeepForSdk
        public a<T> a(n nVar) {
            Preconditions.checkNotNull(nVar, "Null dependency");
            s(nVar.wn());
            this.abN.add(nVar);
            return this;
        }

        @KeepForSdk
        public a<T> wc() {
            return cy(1);
        }

        @KeepForSdk
        public a<T> wd() {
            return cy(2);
        }

        private a<T> cy(int i) {
            Preconditions.checkState(this.abO == 0, "Instantiation type has already been set.");
            this.abO = i;
            return this;
        }

        private void s(Class<?> cls) {
            Preconditions.checkArgument(this.abM.contains(cls) ^ 1, "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @KeepForSdk
        public a<T> a(g<T> gVar) {
            this.abP = (g) Preconditions.checkNotNull(gVar, "Null factory");
            return this;
        }

        private a<T> we() {
            this.type = 1;
            return this;
        }

        @KeepForSdk
        public b<T> wf() {
            Preconditions.checkState(this.abP != null, "Missing required property: factory.");
            return new b(new HashSet(this.abM), new HashSet(this.abN), this.abO, this.type, this.abP, this.abQ);
        }
    }

    static /* synthetic */ Object b(Object obj, e eVar) {
        return obj;
    }

    private b(Set<Class<? super T>> set, Set<n> set2, int i, int i2, g<T> gVar, Set<Class<?>> set3) {
        this.abM = Collections.unmodifiableSet(set);
        this.abN = Collections.unmodifiableSet(set2);
        this.abO = i;
        this.type = i2;
        this.abP = gVar;
        this.abQ = Collections.unmodifiableSet(set3);
    }

    public Set<Class<? super T>> vV() {
        return this.abM;
    }

    public Set<n> vW() {
        return this.abN;
    }

    public g<T> vX() {
        return this.abP;
    }

    public Set<Class<?>> vY() {
        return this.abQ;
    }

    public boolean vZ() {
        return this.abO == 1;
    }

    public boolean wa() {
        return this.abO == 2;
    }

    public boolean wb() {
        return this.type == 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Component<");
        stringBuilder.append(Arrays.toString(this.abM.toArray()));
        stringBuilder.append(">{");
        stringBuilder.append(this.abO);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", deps=");
        stringBuilder.append(Arrays.toString(this.abN.toArray()));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @KeepForSdk
    public static <T> a<T> q(Class<T> cls) {
        return new a(cls, new Class[0]);
    }

    @KeepForSdk
    @SafeVarargs
    public static <T> a<T> a(Class<T> cls, Class<? super T>... clsArr) {
        return new a(cls, clsArr);
    }

    @KeepForSdk
    @SafeVarargs
    public static <T> b<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return a((Class) cls, (Class[]) clsArr).a(c.bp(t)).wf();
    }

    @KeepForSdk
    public static <T> a<T> r(Class<T> cls) {
        return q(cls).we();
    }

    @KeepForSdk
    public static <T> b<T> a(T t, Class<T> cls) {
        return r(cls).a(d.bp(t)).wf();
    }
}
