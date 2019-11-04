package io.reactivex.internal.util;

import io.reactivex.b.l;
import org.a.c;

/* compiled from: AppendOnlyLinkedArrayList */
public class a<T> {
    final int eTO;
    final Object[] eTP;
    Object[] eTQ = this.eTP;
    int offset;

    /* compiled from: AppendOnlyLinkedArrayList */
    public interface a<T> extends l<T> {
        boolean test(T t);
    }

    public a(int i) {
        this.eTO = i;
        this.eTP = new Object[(i + 1)];
    }

    public void add(T t) {
        int i = this.eTO;
        int i2 = this.offset;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.eTQ[i] = objArr;
            this.eTQ = objArr;
            i2 = 0;
        }
        this.eTQ[i2] = t;
        this.offset = i2 + 1;
    }

    public void cW(T t) {
        this.eTP[0] = t;
    }

    public void a(a<? super T> aVar) {
        int i = this.eTO;
        for (Object[] objArr = this.eTP; objArr != null; objArr = (Object[]) objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object obj = objArr[i2];
                if (obj == null) {
                    continue;
                    break;
                } else if (!aVar.test(obj)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public <U> boolean b(c<? super U> cVar) {
        Object[] objArr = this.eTP;
        int i = this.eTO;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object obj = objArr[i2];
                if (obj == null) {
                    continue;
                    break;
                } else if (NotificationLite.acceptFull(obj, (c) cVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = (Object[]) objArr[i];
        }
    }
}
