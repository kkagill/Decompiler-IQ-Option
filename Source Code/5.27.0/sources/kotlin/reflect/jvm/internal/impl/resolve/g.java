package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: OverridingStrategy.kt */
public abstract class g extends h {
    public abstract void a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public void b(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        i.f(callableMemberDescriptor, "fromSuper");
        i.f(callableMemberDescriptor2, "fromCurrent");
        a(callableMemberDescriptor, callableMemberDescriptor2);
    }

    public void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        i.f(callableMemberDescriptor, "first");
        i.f(callableMemberDescriptor2, "second");
        a(callableMemberDescriptor, callableMemberDescriptor2);
    }
}
