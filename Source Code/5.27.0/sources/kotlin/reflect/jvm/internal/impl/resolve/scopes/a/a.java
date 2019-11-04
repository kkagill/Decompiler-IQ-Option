package kotlin.reflect.jvm.internal.impl.resolve.scopes.a;

import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: AbstractReceiverValue */
public abstract class a implements e {
    protected final w fio;
    private final e fuN;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 1 || i == 2) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        if (i == 1 || i == 2) {
            objArr[0] = str2;
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 1 || i == 2) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public a(w wVar, e eVar) {
        if (wVar == null) {
            $$$reportNull$$$0(0);
        }
        this.fio = wVar;
        if (eVar == null) {
            eVar = this;
        }
        this.fuN = eVar;
    }

    public w bpT() {
        w wVar = this.fio;
        if (wVar == null) {
            $$$reportNull$$$0(1);
        }
        return wVar;
    }
}
