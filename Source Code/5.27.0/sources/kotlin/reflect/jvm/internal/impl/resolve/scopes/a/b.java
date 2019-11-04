package kotlin.reflect.jvm.internal.impl.resolve.scopes.a;

import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: ExtensionReceiver */
public class b extends a implements d {
    private final a fuO;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 2 || i == 4) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    objArr[0] = "newType";
                } else if (i != 4) {
                    objArr[0] = "callableDescriptor";
                }
            }
            objArr[0] = str2;
        } else {
            objArr[0] = "receiverType";
        }
        String str3 = "replaceType";
        if (i == 2) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i != 4) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (i != 2) {
            if (i == 3) {
                objArr[2] = str3;
            } else if (i != 4) {
                objArr[2] = "<init>";
            }
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 2 || i == 4) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public b(a aVar, w wVar, e eVar) {
        if (aVar == null) {
            $$$reportNull$$$0(0);
        }
        if (wVar == null) {
            $$$reportNull$$$0(1);
        }
        super(wVar, eVar);
        this.fuO = aVar;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bpT());
        stringBuilder.append(": Ext {");
        stringBuilder.append(this.fuO);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
