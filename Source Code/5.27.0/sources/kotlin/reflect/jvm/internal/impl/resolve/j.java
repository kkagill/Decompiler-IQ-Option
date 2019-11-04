package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.av;

/* compiled from: VisibilityUtil.kt */
public final class j {
    public static final CallableMemberDescriptor P(Collection<? extends CallableMemberDescriptor> collection) {
        i.f(collection, "descriptors");
        int isEmpty = collection.isEmpty() ^ 1;
        if (m.eVC && isEmpty == 0) {
            throw new AssertionError("Assertion failed");
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            if (callableMemberDescriptor != null) {
                Integer c = av.c(callableMemberDescriptor.brx(), callableMemberDescriptor2.brx());
                if (c != null) {
                    if (c.intValue() >= 0) {
                    }
                }
            }
            callableMemberDescriptor = callableMemberDescriptor2;
        }
        if (callableMemberDescriptor == null) {
            i.bnJ();
        }
        return callableMemberDescriptor;
    }
}
