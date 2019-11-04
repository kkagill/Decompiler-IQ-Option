package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.e;

/* compiled from: LazyClassReceiverParameterDescriptor */
public class q extends c {
    private final d ffo;
    private final c ffp;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 1 || i == 2) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        if (i == 1 || i == 2) {
            objArr[0] = str2;
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 1 || i == 2) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public q(d dVar) {
        if (dVar == null) {
            $$$reportNull$$$0(0);
        }
        super(f.fdA.bug());
        this.ffo = dVar;
        this.ffp = new c(dVar, null);
    }

    public e btM() {
        c cVar = this.ffp;
        if (cVar == null) {
            $$$reportNull$$$0(1);
        }
        return cVar;
    }

    public k brj() {
        d dVar = this.ffo;
        if (dVar == null) {
            $$$reportNull$$$0(2);
        }
        return dVar;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("class ");
        stringBuilder.append(this.ffo.bsZ());
        stringBuilder.append("::this");
        return stringBuilder.toString();
    }
}
