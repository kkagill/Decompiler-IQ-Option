package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.a;
import kotlin.reflect.d;
import kotlin.reflect.n;

public abstract class CallableReference implements Serializable, a {
    public static final Object eVW = NoReceiver.eVX;
    private transient a eVV;
    protected final Object receiver;

    private static class NoReceiver implements Serializable {
        private static final NoReceiver eVX = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() {
            return eVX;
        }
    }

    public abstract a bnw();

    public CallableReference() {
        this(eVW);
    }

    protected CallableReference(Object obj) {
        this.receiver = obj;
    }

    public Object bnx() {
        return this.receiver;
    }

    public a bny() {
        a aVar = this.eVV;
        if (aVar != null) {
            return aVar;
        }
        aVar = bnw();
        this.eVV = aVar;
        return aVar;
    }

    /* Access modifiers changed, original: protected */
    public a bnz() {
        CallableReference bny = bny();
        if (bny != this) {
            return bny;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public d RW() {
        throw new AbstractMethodError();
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public String RX() {
        throw new AbstractMethodError();
    }

    public n bnA() {
        return bnz().bnA();
    }

    public Object Q(Object... objArr) {
        return bnz().Q(objArr);
    }
}
