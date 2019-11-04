package com.google.common.base;

import java.io.Serializable;

public final class Suppliers {

    static class MemoizingSupplier<T> implements n<T>, Serializable {
        private static final long serialVersionUID = 0;
        final n<T> delegate;
        volatile transient boolean initialized;
        transient T value;

        MemoizingSupplier(n<T> nVar) {
            this.delegate = (n) i.checkNotNull(nVar);
        }

        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        Object obj = this.delegate.get();
                        this.value = obj;
                        this.initialized = true;
                        return obj;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            Object stringBuilder;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Suppliers.memoize(");
            if (this.initialized) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("<supplier that returned ");
                stringBuilder3.append(this.value);
                stringBuilder3.append(">");
                stringBuilder = stringBuilder3.toString();
            } else {
                stringBuilder = this.delegate;
            }
            stringBuilder2.append(stringBuilder);
            stringBuilder2.append(")");
            return stringBuilder2.toString();
        }
    }

    private static class SupplierOfInstance<T> implements n<T>, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        SupplierOfInstance(T t) {
            this.instance = t;
        }

        public T get() {
            return this.instance;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SupplierOfInstance)) {
                return false;
            }
            return f.equal(this.instance, ((SupplierOfInstance) obj).instance);
        }

        public int hashCode() {
            return f.hashCode(this.instance);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Suppliers.ofInstance(");
            stringBuilder.append(this.instance);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private static class ThreadSafeSupplier<T> implements n<T>, Serializable {
        private static final long serialVersionUID = 0;
        final n<T> delegate;

        ThreadSafeSupplier(n<T> nVar) {
            this.delegate = (n) i.checkNotNull(nVar);
        }

        public T get() {
            Object obj;
            synchronized (this.delegate) {
                obj = this.delegate.get();
            }
            return obj;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Suppliers.synchronizedSupplier(");
            stringBuilder.append(this.delegate);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static class a<T> implements n<T> {
        volatile n<T> delegate;
        volatile boolean initialized;
        T value;

        a(n<T> nVar) {
            this.delegate = (n) i.checkNotNull(nVar);
        }

        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        Object obj = this.delegate.get();
                        this.value = obj;
                        this.initialized = true;
                        this.delegate = null;
                        return obj;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            Object obj = this.delegate;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Suppliers.memoize(");
            if (obj == null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("<supplier that returned ");
                stringBuilder2.append(this.value);
                stringBuilder2.append(">");
                obj = stringBuilder2.toString();
            }
            stringBuilder.append(obj);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public static <T> n<T> a(n<T> nVar) {
        if ((nVar instanceof a) || (nVar instanceof MemoizingSupplier)) {
            return nVar;
        }
        return nVar instanceof Serializable ? new MemoizingSupplier(nVar) : new a(nVar);
    }

    public static <T> n<T> aq(T t) {
        return new SupplierOfInstance(t);
    }

    public static <T> n<T> b(n<T> nVar) {
        return new ThreadSafeSupplier(nVar);
    }
}
