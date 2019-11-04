package kotlin.reflect.jvm.internal.impl.resolve.scopes.a;

import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: TransientReceiver */
public class h extends a {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 3 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i == 2) {
            objArr[0] = "newType";
        } else if (i != 3) {
            objArr[0] = "type";
        } else {
            objArr[0] = str2;
        }
        String str3 = "replaceType";
        if (i != 3) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (i == 2) {
            objArr[2] = str3;
        } else if (i != 3) {
            objArr[2] = "<init>";
        }
        str = String.format(str, objArr);
        throw (i != 3 ? new IllegalArgumentException(str) : new IllegalStateException(str));
    }

    public h(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(0);
        }
        this(wVar, null);
    }

    private h(w wVar, e eVar) {
        if (wVar == null) {
            $$$reportNull$$$0(1);
        }
        super(wVar, eVar);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{Transient} : ");
        stringBuilder.append(bpT());
        return stringBuilder.toString();
    }
}
