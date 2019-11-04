package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* compiled from: JvmMetadataVersion.kt */
public final class g extends kotlin.reflect.jvm.internal.impl.metadata.a.a {
    public static final g foQ = new g(1, 1, 15);
    public static final g foR = new g(new int[0]);
    public static final a foS = new a();
    private final boolean foP;

    /* compiled from: JvmMetadataVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public g(int[] iArr, boolean z) {
        i.f(iArr, "versionArray");
        super(Arrays.copyOf(iArr, iArr.length));
        this.foP = z;
    }

    public g(int... iArr) {
        i.f(iArr, "numbers");
        this(iArr, false);
    }

    public boolean bJQ() {
        if (getMajor() == 1 && getMinor() == 0) {
            return false;
        }
        boolean a = this.foP ? a(foQ) : getMajor() == 1 && getMinor() <= 4;
        if (a) {
            return true;
        }
        return false;
    }
}
