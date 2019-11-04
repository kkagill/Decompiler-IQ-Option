package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.e;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: FunctionClassScope.kt */
public final class c extends e {
    public c(h hVar, FunctionClassDescriptor functionClassDescriptor) {
        i.f(hVar, "storageManager");
        i.f(functionClassDescriptor, "containingClass");
        super(hVar, functionClassDescriptor);
    }

    /* Access modifiers changed, original: protected */
    public List<s> brU() {
        d bNL = bNL();
        if (bNL != null) {
            int i = d.aob[((FunctionClassDescriptor) bNL).brJ().ordinal()];
            if (i == 1) {
                return l.listOf(e.fbJ.a((FunctionClassDescriptor) bNL(), false));
            }
            if (i != 2) {
                return m.emptyList();
            }
            return l.listOf(e.fbJ.a((FunctionClassDescriptor) bNL(), true));
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
    }
}
