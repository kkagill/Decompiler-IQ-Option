package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.i;

/* compiled from: InvalidModuleException.kt */
public final class InvalidModuleException extends IllegalStateException {
    public InvalidModuleException(String str) {
        i.f(str, "message");
        super(str);
    }
}
