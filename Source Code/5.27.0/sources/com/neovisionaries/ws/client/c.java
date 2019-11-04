package com.neovisionaries.ws.client;

import java.nio.ByteBuffer;

/* compiled from: ByteArray */
class c {
    private ByteBuffer ezx;
    private int mLength = 0;

    public c(int i) {
        this.ezx = ByteBuffer.allocate(i);
    }

    public int length() {
        return this.mLength;
    }

    public byte get(int i) {
        if (i >= 0 && this.mLength > i) {
            return this.ezx.get(i);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.mLength)}));
    }

    private void it(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int position = this.ezx.position();
        this.ezx.position(0);
        allocate.put(this.ezx);
        allocate.position(position);
        this.ezx = allocate;
    }

    public void iu(int i) {
        int capacity = this.ezx.capacity();
        int i2 = this.mLength;
        if (capacity < i2 + 1) {
            it(i2 + 1024);
        }
        this.ezx.put((byte) i);
        this.mLength++;
    }

    public void o(byte[] bArr) {
        int capacity = this.ezx.capacity();
        int i = this.mLength;
        if (capacity < bArr.length + i) {
            it((i + bArr.length) + 1024);
        }
        this.ezx.put(bArr);
        this.mLength += bArr.length;
    }

    public void g(byte[] bArr, int i, int i2) {
        int capacity = this.ezx.capacity();
        int i3 = this.mLength;
        if (capacity < i3 + i2) {
            it((i3 + i2) + 1024);
        }
        this.ezx.put(bArr, i, i2);
        this.mLength += i2;
    }

    public void a(c cVar, int i, int i2) {
        g(cVar.ezx.array(), i, i2);
    }

    public byte[] iv(int i) {
        return aH(i, length());
    }

    public byte[] aH(int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 0 || i < 0 || this.mLength < i2) {
            throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.mLength)}));
        }
        byte[] bArr = new byte[i3];
        if (i3 != 0) {
            System.arraycopy(this.ezx.array(), i, bArr, 0, i3);
        }
        return bArr;
    }

    public void clear() {
        this.ezx.clear();
        this.ezx.position(0);
        this.mLength = 0;
    }

    public void iw(int i) {
        if (this.ezx.capacity() > i) {
            int i2 = this.mLength;
            byte[] aH = aH(i2 - i, i2);
            this.ezx = ByteBuffer.wrap(aH);
            this.ezx.position(aH.length);
            this.mLength = aH.length;
        }
    }

    public boolean ix(int i) {
        return ((1 << (i % 8)) & get(i / 8)) != 0;
    }

    public int aI(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < i2) {
            if (ix(i + i3)) {
                i4 += i5;
            }
            i3++;
            i5 *= 2;
        }
        return i4;
    }

    public int aJ(int i, int i2) {
        int i3 = 1;
        i2--;
        int i4 = 0;
        while (i2 >= 0) {
            if (ix(i + i2)) {
                i4 += i3;
            }
            i2--;
            i3 *= 2;
        }
        return i4;
    }

    public boolean i(int[] iArr) {
        boolean ix = ix(iArr[0]);
        iArr[0] = iArr[0] + 1;
        return ix;
    }

    public int b(int[] iArr, int i) {
        int aI = aI(iArr[0], i);
        iArr[0] = iArr[0] + i;
        return aI;
    }

    public void w(int i, boolean z) {
        int i2 = i / 8;
        i %= 8;
        byte b = get(i2);
        this.ezx.put(i2, (byte) (z ? (1 << i) | b : ((1 << i) ^ -1) & b));
    }

    public void iy(int i) {
        w(i, false);
    }
}
