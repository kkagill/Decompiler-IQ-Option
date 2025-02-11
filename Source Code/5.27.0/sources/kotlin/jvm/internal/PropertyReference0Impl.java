package kotlin.jvm.internal;

import kotlin.reflect.d;

public class PropertyReference0Impl extends PropertyReference0 {
    private final String name;
    private final d owner;
    private final String signature;

    public PropertyReference0Impl(d dVar, String str, String str2) {
        this.owner = dVar;
        this.name = str;
        this.signature = str2;
    }

    public d RW() {
        return this.owner;
    }

    public String getName() {
        return this.name;
    }

    public String RX() {
        return this.signature;
    }

    public Object get() {
        return bnN().Q(new Object[0]);
    }
}
