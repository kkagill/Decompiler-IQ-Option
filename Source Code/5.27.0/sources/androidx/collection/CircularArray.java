package androidx.collection;

public final class CircularArray<E> {
    private int mCapacityBitmask;
    private E[] mElements;
    private int mHead;
    private int mTail;

    private void doubleCapacity() {
        Object[] objArr = this.mElements;
        int length = objArr.length;
        int i = this.mHead;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            Object[] objArr2 = new Object[i3];
            System.arraycopy(objArr, i, objArr2, 0, i2);
            System.arraycopy(this.mElements, 0, objArr2, i2, this.mHead);
            this.mElements = objArr2;
            this.mHead = 0;
            this.mTail = length;
            this.mCapacityBitmask = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public CircularArray() {
        this(8);
    }

    public CircularArray(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            if (Integer.bitCount(i) != 1) {
                i = Integer.highestOneBit(i - 1) << 1;
            }
            this.mCapacityBitmask = i - 1;
            this.mElements = new Object[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    public void addFirst(E e) {
        this.mHead = (this.mHead - 1) & this.mCapacityBitmask;
        Object[] objArr = this.mElements;
        int i = this.mHead;
        objArr[i] = e;
        if (i == this.mTail) {
            doubleCapacity();
        }
    }

    public void addLast(E e) {
        Object[] objArr = this.mElements;
        int i = this.mTail;
        objArr[i] = e;
        this.mTail = this.mCapacityBitmask & (i + 1);
        if (this.mTail == this.mHead) {
            doubleCapacity();
        }
    }

    public E popFirst() {
        int i = this.mHead;
        if (i != this.mTail) {
            Object[] objArr = this.mElements;
            E e = objArr[i];
            objArr[i] = null;
            this.mHead = (i + 1) & this.mCapacityBitmask;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E popLast() {
        int i = this.mHead;
        int i2 = this.mTail;
        if (i != i2) {
            i = this.mCapacityBitmask & (i2 - 1);
            Object[] objArr = this.mElements;
            E e = objArr[i];
            objArr[i] = null;
            this.mTail = i;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void clear() {
        removeFromStart(size());
    }

    public void removeFromStart(int i) {
        if (i > 0) {
            if (i <= size()) {
                int length = this.mElements.length;
                int i2 = this.mHead;
                if (i < length - i2) {
                    length = i2 + i;
                }
                for (i2 = this.mHead; i2 < length; i2++) {
                    this.mElements[i2] = null;
                }
                i2 = this.mHead;
                length -= i2;
                i -= length;
                this.mHead = this.mCapacityBitmask & (i2 + length);
                if (i > 0) {
                    for (length = 0; length < i; length++) {
                        this.mElements[length] = null;
                    }
                    this.mHead = i;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void removeFromEnd(int i) {
        if (i > 0) {
            if (i <= size()) {
                int i2;
                int i3 = 0;
                int i4 = this.mTail;
                if (i < i4) {
                    i3 = i4 - i;
                }
                i4 = i3;
                while (true) {
                    i2 = this.mTail;
                    if (i4 >= i2) {
                        break;
                    }
                    this.mElements[i4] = null;
                    i4++;
                }
                i3 = i2 - i3;
                i -= i3;
                this.mTail = i2 - i3;
                if (i > 0) {
                    this.mTail = this.mElements.length;
                    i3 = this.mTail - i;
                    for (i = i3; i < this.mTail; i++) {
                        this.mElements[i] = null;
                    }
                    this.mTail = i3;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public E getFirst() {
        int i = this.mHead;
        if (i != this.mTail) {
            return this.mElements[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E getLast() {
        int i = this.mHead;
        int i2 = this.mTail;
        if (i != i2) {
            return this.mElements[(i2 - 1) & this.mCapacityBitmask];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E get(int i) {
        if (i < 0 || i >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[this.mCapacityBitmask & (this.mHead + i)];
    }

    public int size() {
        return (this.mTail - this.mHead) & this.mCapacityBitmask;
    }

    public boolean isEmpty() {
        return this.mHead == this.mTail;
    }
}
