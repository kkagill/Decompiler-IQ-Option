package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;

/* compiled from: methodSignatureBuilding.kt */
public final class u {
    public static final u fmf = new u();

    private u() {
    }

    public final String mj(String str) {
        i.f(str, ConditionalUserProperty.NAME);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("java/lang/");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final String mk(String str) {
        i.f(str, ConditionalUserProperty.NAME);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("java/util/");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final String ml(String str) {
        i.f(str, ConditionalUserProperty.NAME);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("java/util/function/");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final LinkedHashSet<String> c(String str, String... strArr) {
        i.f(str, ConditionalUserProperty.NAME);
        i.f(strArr, "signatures");
        return e(mj(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final LinkedHashSet<String> d(String str, String... strArr) {
        i.f(str, ConditionalUserProperty.NAME);
        i.f(strArr, "signatures");
        return e(mk(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final LinkedHashSet<String> e(String str, String... strArr) {
        i.f(str, "internalName");
        i.f(strArr, "signatures");
        Collection linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".");
            stringBuilder.append(str2);
            linkedHashSet.add(stringBuilder.toString());
        }
        return (LinkedHashSet) linkedHashSet;
    }

    public final String a(d dVar, String str) {
        i.f(dVar, "classDescriptor");
        i.f(str, "jvmDescriptor");
        return bf(r.C(dVar), str);
    }

    public final String bf(String str, String str2) {
        i.f(str, "internalName");
        i.f(str2, "jvmDescriptor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final String a(String str, List<String> list, String str2) {
        i.f(str, ConditionalUserProperty.NAME);
        i.f(list, "parameters");
        i.f(str2, "ret");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('(');
        stringBuilder.append(u.a(list, "", null, null, 0, null, SignatureBuildingComponents$jvmDescriptor$1.fmg, 30, null));
        stringBuilder.append(')');
        stringBuilder.append(mm(str2));
        return stringBuilder.toString();
    }

    private final String mm(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('L');
        stringBuilder.append(str);
        stringBuilder.append(';');
        return stringBuilder.toString();
    }

    public final String[] i(String... strArr) {
        i.f(strArr, "signatures");
        Collection arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<init>(");
            stringBuilder.append(str);
            stringBuilder.append(")V");
            arrayList.add(stringBuilder.toString());
        }
        Object[] toArray = ((List) arrayList).toArray(new String[0]);
        if (toArray != null) {
            return (String[]) toArray;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
