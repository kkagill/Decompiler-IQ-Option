package kotlin.reflect.jvm.internal.impl.descriptors.a;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.d;

/* compiled from: PlatformDependentDeclarationFilter.kt */
public interface c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class a implements c {
        public static final a fdM = new a();

        public boolean a(d dVar, ai aiVar) {
            i.f(dVar, "classDescriptor");
            i.f(aiVar, "functionDescriptor");
            return true;
        }

        private a() {
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class b implements c {
        public static final b fdN = new b();

        private b() {
        }

        public boolean a(d dVar, ai aiVar) {
            i.f(dVar, "classDescriptor");
            i.f(aiVar, "functionDescriptor");
            return aiVar.brE().j(d.buh()) ^ 1;
        }
    }

    boolean a(d dVar, ai aiVar);
}
