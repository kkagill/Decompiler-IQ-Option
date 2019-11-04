package com.google.common.base;

import java.io.Serializable;

public abstract class Equivalence<T> {

    static final class Equals extends Equivalence<Object> implements Serializable {
        static final Equals RT = new Equals();
        private static final long serialVersionUID = 1;

        Equals() {
        }

        /* Access modifiers changed, original: protected */
        public boolean f(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* Access modifiers changed, original: protected */
        public int ag(Object obj) {
            return obj.hashCode();
        }

        private Object readResolve() {
            return RT;
        }
    }

    static final class Identity extends Equivalence<Object> implements Serializable {
        static final Identity RV = new Identity();
        private static final long serialVersionUID = 1;

        /* Access modifiers changed, original: protected */
        public boolean f(Object obj, Object obj2) {
            return false;
        }

        Identity() {
        }

        /* Access modifiers changed, original: protected */
        public int ag(Object obj) {
            return System.identityHashCode(obj);
        }

        private Object readResolve() {
            return RV;
        }
    }

    public abstract int ag(T t);

    public abstract boolean f(T t, T t2);

    protected Equivalence() {
    }

    public final boolean e(T t, T t2) {
        if (t == t2) {
            return true;
        }
        return (t == null || t2 == null) ? false : f(t, t2);
    }

    public final int af(T t) {
        return t == null ? 0 : ag(t);
    }

    public static Equivalence<Object> pT() {
        return Equals.RT;
    }

    public static Equivalence<Object> pU() {
        return Identity.RV;
    }
}
