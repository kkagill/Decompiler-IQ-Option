package org.yaml.snakeyaml.d;

import java.util.ArrayList;

/* compiled from: ArrayStack */
public class a<T> {
    private ArrayList<T> fMR;

    public a(int i) {
        this.fMR = new ArrayList(i);
    }

    public void push(T t) {
        this.fMR.add(t);
    }

    public T pop() {
        ArrayList arrayList = this.fMR;
        return arrayList.remove(arrayList.size() - 1);
    }

    public boolean isEmpty() {
        return this.fMR.isEmpty();
    }
}
