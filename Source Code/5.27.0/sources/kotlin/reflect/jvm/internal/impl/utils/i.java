package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.a.d;
import kotlin.jvm.internal.o;

/* compiled from: SmartSet.kt */
public final class i<T> extends AbstractSet<T> {
    private static final int fAg = 5;
    public static final b fAh = new b();
    private Object data;
    private int size;

    /* compiled from: SmartSet.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final <T> i<T> bQf() {
            return new i();
        }

        public final <T> i<T> R(Collection<? extends T> collection) {
            kotlin.jvm.internal.i.f(collection, "set");
            i iVar = new i();
            iVar.addAll(collection);
            return iVar;
        }
    }

    /* compiled from: SmartSet.kt */
    private static final class a<T> implements Iterator<T>, d {
        private final Iterator<T> fAi;

        public a(T[] tArr) {
            kotlin.jvm.internal.i.f(tArr, "array");
            this.fAi = kotlin.jvm.internal.b.P(tArr);
        }

        public boolean hasNext() {
            return this.fAi.hasNext();
        }

        public T next() {
            return this.fAi.next();
        }

        /* renamed from: bQg */
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmartSet.kt */
    private static final class c<T> implements Iterator<T>, d {
        private boolean eWm = true;
        private final T element;

        public c(T t) {
            this.element = t;
        }

        public T next() {
            if (this.eWm) {
                this.eWm = false;
                return this.element;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.eWm;
        }

        /* renamed from: bQg */
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final <T> i<T> bQf() {
        return fAh.bQf();
    }

    private i() {
    }

    public /* synthetic */ i(f fVar) {
        this();
    }

    public final int size() {
        return getSize();
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.data);
        }
        if (size() < fAg) {
            Object obj = this.data;
            if (obj != null) {
                return new a((Object[]) obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj2 = this.data;
        if (obj2 != null) {
            return o.dn(obj2).iterator();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
    }

    public boolean add(T t) {
        Object obj;
        if (size() == 0) {
            this.data = t;
        } else if (size() == 1) {
            if (kotlin.jvm.internal.i.y(this.data, t)) {
                return false;
            }
            this.data = new Object[]{this.data, t};
        } else if (size() < fAg) {
            obj = this.data;
            if (obj != null) {
                Object[] objArr = (Object[]) obj;
                if (i.contains(objArr, (Object) t)) {
                    return false;
                }
                if (size() == fAg - 1) {
                    obj = al.O(Arrays.copyOf(objArr, objArr.length));
                    obj.add(t);
                } else {
                    obj = Arrays.copyOf(objArr, size() + 1);
                    obj[obj.length - 1] = t;
                }
                this.data = obj;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            obj = this.data;
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            } else if (!o.dn(obj).add(t)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    public void clear() {
        this.data = null;
        setSize(0);
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return kotlin.jvm.internal.i.y(this.data, obj);
        }
        Object obj2;
        if (size() < fAg) {
            obj2 = this.data;
            if (obj2 != null) {
                return i.contains((Object[]) obj2, obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        obj2 = this.data;
        if (obj2 != null) {
            return ((Set) obj2).contains(obj);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Set<T>");
    }
}
