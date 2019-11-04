package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* compiled from: DefaultBuiltIns.kt */
public final class d extends g {
    private static final d eZm = new d(false, 1, null);
    public static final a eZn = new a();

    /* compiled from: DefaultBuiltIns.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public d() {
        this(false, 1, null);
    }

    public static final d bqu() {
        a aVar = eZn;
        return eZm;
    }

    public d(boolean z) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z) {
            bqv();
        }
    }

    public /* synthetic */ d(boolean z, int i, f fVar) {
        if ((i & 1) != 0) {
            z = true;
        }
        this(z);
    }
}
