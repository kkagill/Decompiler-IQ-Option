package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;

/* compiled from: JvmAnnotationNames */
public final class n {
    public static final b fhk = new b("kotlin.Metadata");
    public static final String fhl;
    public static final f fhm = f.ms(ConditionalUserProperty.VALUE);
    public static final b fhn = new b("org.jetbrains.annotations.NotNull");
    public static final b fho = new b("org.jetbrains.annotations.Nullable");
    public static final b fhp = new b("org.jetbrains.annotations.Mutable");
    public static final b fhq = new b("org.jetbrains.annotations.ReadOnly");
    public static final b fhr = new b("kotlin.annotations.jvm.ReadOnly");
    public static final b fhs = new b("kotlin.annotations.jvm.Mutable");
    public static final b fht = new b("kotlin.jvm.PurelyImplements");
    public static final b fhu = new b("kotlin.jvm.internal.EnhancedNullability");
    public static final b fhv = new b("kotlin.jvm.internal.EnhancedMutability");
    public static final b fhw = new b("kotlin.annotations.jvm.internal.ParameterName");
    public static final b fhx = new b("kotlin.annotations.jvm.internal.DefaultValue");
    public static final b fhy = new b("kotlin.annotations.jvm.internal.DefaultNull");

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("L");
        stringBuilder.append(c.t(fhk).byE());
        stringBuilder.append(";");
        fhl = stringBuilder.toString();
    }
}
