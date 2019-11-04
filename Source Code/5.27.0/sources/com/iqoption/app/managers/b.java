package com.iqoption.app.managers;

import java.util.HashSet;
import java.util.Set;

/* compiled from: LockCounter */
public class b {
    private Set<Object> atD = new HashSet();

    public void bu(Object obj) {
        this.atD.add(obj);
    }

    public boolean bv(Object obj) {
        this.atD.remove(obj);
        return this.atD.isEmpty();
    }

    public boolean isEmpty() {
        return this.atD.isEmpty();
    }

    public void clear() {
        this.atD.clear();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LockCounter{lockTags=");
        stringBuilder.append(this.atD);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
