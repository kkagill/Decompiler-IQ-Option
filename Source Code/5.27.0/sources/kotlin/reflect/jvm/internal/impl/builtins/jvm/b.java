package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* compiled from: JvmBuiltInsSettings.kt */
final class b extends g {
    private static final g fbM = new b();
    public static final a fbN = new a();

    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g bsa() {
            return b.fbM;
        }
    }

    private b() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        bqv();
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: brY */
    public kotlin.reflect.jvm.internal.impl.descriptors.a.c.a bqx() {
        return kotlin.reflect.jvm.internal.impl.descriptors.a.c.a.fdM;
    }
}
