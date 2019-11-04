package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: JvmAnnotationNames.kt */
public final class o {
    private static final b fhA = new b("javax.annotation.Nonnull");
    private static final b fhB;
    private static final List<b> fhC;
    private static final b fhD = new b("org.checkerframework.checker.nullness.compatqual.NullableDecl");
    private static final b fhE = new b("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
    private static final b fhF = new b("androidx.annotation.RecentlyNullable");
    private static final b fhG = new b("androidx.annotation.RecentlyNonNull");
    private static final Set<b> fhH = am.d(am.d(am.d(am.d(am.a(am.d(am.a(new LinkedHashSet(), fhz), fhA), fhC), fhD), fhE), fhF), fhG);
    private static final List<b> fhI = m.listOf(n.fhq, n.fhr);
    private static final List<b> fhJ = m.listOf(n.fhp, n.fhs);
    private static final List<b> fhz;

    static {
        r0 = new b[13];
        String str = "androidx.annotation.Nullable";
        r0[1] = new b(str);
        r0[2] = new b(str);
        r0[3] = new b("android.annotation.Nullable");
        r0[4] = new b("com.android.annotations.Nullable");
        r0[5] = new b("org.eclipse.jdt.annotation.Nullable");
        r0[6] = new b("org.checkerframework.checker.nullness.qual.Nullable");
        r0[7] = new b("javax.annotation.Nullable");
        String str2 = "javax.annotation.CheckForNull";
        r0[8] = new b(str2);
        r0[9] = new b("edu.umd.cs.findbugs.annotations.CheckForNull");
        r0[10] = new b("edu.umd.cs.findbugs.annotations.Nullable");
        r0[11] = new b("edu.umd.cs.findbugs.annotations.PossiblyNull");
        r0[12] = new b("io.reactivex.annotations.Nullable");
        fhz = m.listOf(r0);
        fhB = new b(str2);
        r0 = new b[10];
        str2 = "androidx.annotation.NonNull";
        r0[2] = new b(str2);
        r0[3] = new b(str2);
        r0[4] = new b("android.annotation.NonNull");
        r0[5] = new b("com.android.annotations.NonNull");
        r0[6] = new b("org.eclipse.jdt.annotation.NonNull");
        r0[7] = new b("org.checkerframework.checker.nullness.qual.NonNull");
        r0[8] = new b("lombok.NonNull");
        r0[9] = new b("io.reactivex.annotations.NonNull");
        fhC = m.listOf(r0);
    }

    public static final List<b> bvy() {
        return fhz;
    }

    public static final b bvz() {
        return fhA;
    }

    public static final b bvA() {
        return fhB;
    }

    public static final List<b> bvB() {
        return fhC;
    }

    public static final b bvC() {
        return fhD;
    }

    public static final b bvD() {
        return fhE;
    }

    public static final b bvE() {
        return fhF;
    }

    public static final b bvF() {
        return fhG;
    }

    public static final List<b> bvG() {
        return fhI;
    }

    public static final List<b> bvH() {
        return fhJ;
    }
}
