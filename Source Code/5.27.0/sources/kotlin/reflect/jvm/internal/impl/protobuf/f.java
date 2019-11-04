package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.core.internal.view.SupportMenu;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e;

/* compiled from: ExtensionRegistryLite */
public class f {
    private static volatile boolean fpW = false;
    private static final f fpY = new f(true);
    private final Map<a, e<?, ?>> fpX;

    /* compiled from: ExtensionRegistryLite */
    private static final class a {
        private final int number;
        private final Object object;

        a(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public int hashCode() {
            return (System.identityHashCode(this.object) * SupportMenu.USER_MASK) + this.number;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.object == aVar.object && this.number == aVar.number) {
                z = true;
            }
            return z;
        }
    }

    public static f bKU() {
        return new f();
    }

    public static f bKV() {
        return fpY;
    }

    public <ContainingType extends n> e<ContainingType, ?> a(ContainingType containingType, int i) {
        return (e) this.fpX.get(new a(containingType, i));
    }

    public final void a(e<?, ?> eVar) {
        this.fpX.put(new a(eVar.bLm(), eVar.getNumber()), eVar);
    }

    f() {
        this.fpX = new HashMap();
    }

    private f(boolean z) {
        this.fpX = Collections.emptyMap();
    }
}
