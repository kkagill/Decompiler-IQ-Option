package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList */
public class t extends AbstractList<String> implements RandomAccess, l {
    private final l frc;

    public l bLA() {
        return this;
    }

    public t(l lVar) {
        this.frc = lVar;
    }

    public String get(int i) {
        return (String) this.frc.get(i);
    }

    public int size() {
        return this.frc.size();
    }

    public d mj(int i) {
        return this.frc.mj(i);
    }

    public void f(d dVar) {
        throw new UnsupportedOperationException();
    }

    public ListIterator<String> listIterator(final int i) {
        return new ListIterator<String>() {
            ListIterator<String> frd = t.this.frc.listIterator(i);

            public boolean hasNext() {
                return this.frd.hasNext();
            }

            public String next() {
                return (String) this.frd.next();
            }

            public boolean hasPrevious() {
                return this.frd.hasPrevious();
            }

            /* renamed from: bLP */
            public String previous() {
                return (String) this.frd.previous();
            }

            public int nextIndex() {
                return this.frd.nextIndex();
            }

            public int previousIndex() {
                return this.frd.previousIndex();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

            /* renamed from: mA */
            public void set(String str) {
                throw new UnsupportedOperationException();
            }

            public void add(String str) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            Iterator<String> fqg = t.this.frc.iterator();

            public boolean hasNext() {
                return this.fqg.hasNext();
            }

            public String next() {
                return (String) this.fqg.next();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public List<?> bLz() {
        return this.frc.bLz();
    }
}
