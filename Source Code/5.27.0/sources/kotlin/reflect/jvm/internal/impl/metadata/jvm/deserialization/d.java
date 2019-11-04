package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* compiled from: JvmBytecodeBinaryVersion.kt */
public final class d extends kotlin.reflect.jvm.internal.impl.metadata.a.a {
    public static final d foK = new d(1, 0, 3);
    public static final d foL = new d(new int[0]);
    public static final a foM = new a();

    /* compiled from: JvmBytecodeBinaryVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public d(int... iArr) {
        i.f(iArr, "numbers");
        super(Arrays.copyOf(iArr, iArr.length));
    }
}
