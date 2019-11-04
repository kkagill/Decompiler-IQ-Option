package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

public interface CallableMemberDescriptor extends a, t {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    void K(Collection<? extends CallableMemberDescriptor> collection);

    CallableMemberDescriptor a(k kVar, Modality modality, aw awVar, Kind kind, boolean z);

    Collection<? extends CallableMemberDescriptor> bsR();

    CallableMemberDescriptor bsS();

    Kind bsT();
}
