package kotlin.reflect.jvm.internal.impl.utils;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: SmartList */
public class h<E> extends AbstractList<E> implements RandomAccess {
    private int fAa;
    private Object fAb;

    /* compiled from: SmartList */
    private static class a<T> implements Iterator<T> {
        private static final a fAc = new a();

        public boolean hasNext() {
            return false;
        }

        private a() {
        }

        public static <T> a<T> bQd() {
            return fAc;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* compiled from: SmartList */
    private static abstract class c<T> implements Iterator<T> {
        private boolean fAf;

        public abstract void bQe();

        public abstract T ur();

        private c() {
        }

        public final boolean hasNext() {
            return this.fAf ^ 1;
        }

        public final T next() {
            if (this.fAf) {
                throw new NoSuchElementException();
            }
            this.fAf = true;
            bQe();
            return ur();
        }
    }

    /* compiled from: SmartList */
    private class b extends c<E> {
        private final int fAd;

        public b() {
            super();
            this.fAd = h.this.modCount;
        }

        /* Access modifiers changed, original: protected */
        public E ur() {
            return h.this.fAb;
        }

        /* Access modifiers changed, original: protected */
        public void bQe() {
            if (h.this.modCount != this.fAd) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ModCount: ");
                stringBuilder.append(h.this.modCount);
                stringBuilder.append("; expected: ");
                stringBuilder.append(this.fAd);
                throw new ConcurrentModificationException(stringBuilder.toString());
            }
        }

        public void remove() {
            bQe();
            h.this.clear();
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                objArr[0] = str2;
                break;
            case 5:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        String str3 = "toArray";
        if (i == 2 || i == 3 || i == 4) {
            objArr[1] = "iterator";
        } else if (i == 6 || i == 7 || i == 8) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public E get(int i) {
        if (i >= 0) {
            int i2 = this.fAa;
            if (i < i2) {
                if (i2 == 1) {
                    return this.fAb;
                }
                return ((Object[]) this.fAb)[i];
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(i);
        stringBuilder.append(", Size: ");
        stringBuilder.append(this.fAa);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public boolean add(E e) {
        int i = this.fAa;
        if (i == 0) {
            this.fAb = e;
        } else if (i == 1) {
            this.fAb = new Object[]{this.fAb, e};
        } else {
            Object[] objArr;
            Object[] objArr2 = (Object[]) this.fAb;
            int length = objArr2.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                i++;
                if (i2 >= i) {
                    i = i2;
                }
                objArr = new Object[i];
                this.fAb = objArr;
                System.arraycopy(objArr2, 0, objArr, 0, length);
            } else {
                objArr = objArr2;
            }
            objArr[this.fAa] = e;
        }
        this.fAa++;
        this.modCount++;
        return true;
    }

    public void add(int i, E e) {
        if (i >= 0) {
            int i2 = this.fAa;
            if (i <= i2) {
                if (i2 == 0) {
                    this.fAb = e;
                } else if (i2 == 1 && i == 0) {
                    this.fAb = new Object[]{e, this.fAb};
                } else {
                    i2 = this.fAa;
                    Object[] objArr = new Object[(i2 + 1)];
                    if (i2 == 1) {
                        objArr[0] = this.fAb;
                    } else {
                        Object[] objArr2 = (Object[]) this.fAb;
                        System.arraycopy(objArr2, 0, objArr, 0, i);
                        System.arraycopy(objArr2, i, objArr, i + 1, this.fAa - i);
                    }
                    objArr[i] = e;
                    this.fAb = objArr;
                }
                this.fAa++;
                this.modCount++;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(i);
        stringBuilder.append(", Size: ");
        stringBuilder.append(this.fAa);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public int size() {
        return this.fAa;
    }

    public void clear() {
        this.fAb = null;
        this.fAa = 0;
        this.modCount++;
    }

    public E set(int i, E e) {
        if (i >= 0) {
            int i2 = this.fAa;
            if (i < i2) {
                if (i2 == 1) {
                    E e2 = this.fAb;
                    this.fAb = e;
                    return e2;
                }
                Object[] objArr = (Object[]) this.fAb;
                E e3 = objArr[i];
                objArr[i] = e;
                return e3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(i);
        stringBuilder.append(", Size: ");
        stringBuilder.append(this.fAa);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public E remove(int i) {
        if (i >= 0) {
            int i2 = this.fAa;
            if (i < i2) {
                E e;
                if (i2 == 1) {
                    e = this.fAb;
                    this.fAb = null;
                } else {
                    Object[] objArr = (Object[]) this.fAb;
                    E e2 = objArr[i];
                    if (i2 == 2) {
                        this.fAb = objArr[1 - i];
                    } else {
                        i2 = (i2 - i) - 1;
                        if (i2 > 0) {
                            System.arraycopy(objArr, i + 1, objArr, i, i2);
                        }
                        objArr[this.fAa - 1] = null;
                    }
                    e = e2;
                }
                this.fAa--;
                this.modCount++;
                return e;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(i);
        stringBuilder.append(", Size: ");
        stringBuilder.append(this.fAa);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public Iterator<E> iterator() {
        int i = this.fAa;
        if (i == 0) {
            a bQd = a.bQd();
            if (bQd == null) {
                $$$reportNull$$$0(2);
            }
            return bQd;
        } else if (i == 1) {
            return new b();
        } else {
            Iterator it = super.iterator();
            if (it == null) {
                $$$reportNull$$$0(4);
            }
            return it;
        }
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr == null) {
            $$$reportNull$$$0(5);
        }
        int length = tArr.length;
        int i = this.fAa;
        Object[] objArr;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.fAb;
            } else {
                objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                objArr[0] = this.fAb;
                if (objArr == null) {
                    $$$reportNull$$$0(6);
                }
                return objArr;
            }
        } else if (length < i) {
            objArr = Arrays.copyOf((Object[]) this.fAb, i, tArr.getClass());
            if (objArr == null) {
                $$$reportNull$$$0(7);
            }
            return objArr;
        } else if (i != 0) {
            System.arraycopy(this.fAb, 0, tArr, 0, i);
        }
        i = this.fAa;
        if (length > i) {
            tArr[i] = null;
        }
        if (tArr == null) {
            $$$reportNull$$$0(8);
        }
        return tArr;
    }
}
