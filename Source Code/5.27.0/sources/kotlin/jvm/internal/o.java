package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.a.d;
import kotlin.jvm.a.h;
import kotlin.jvm.a.i;
import kotlin.jvm.a.j;
import kotlin.jvm.a.k;
import kotlin.jvm.a.l;
import kotlin.jvm.a.m;
import kotlin.jvm.a.n;
import kotlin.jvm.a.p;
import kotlin.jvm.a.q;
import kotlin.jvm.a.r;
import kotlin.jvm.a.s;
import kotlin.jvm.a.t;
import kotlin.jvm.a.u;
import kotlin.jvm.a.v;
import kotlin.jvm.a.w;
import kotlin.jvm.internal.a.a;
import kotlin.jvm.internal.a.b;
import kotlin.jvm.internal.a.c;
import kotlin.jvm.internal.a.e;
import kotlin.jvm.internal.a.f;
import kotlin.jvm.internal.a.g;

/* compiled from: TypeIntrinsics */
public class o {
    private static <T extends Throwable> T an(T t) {
        return i.a(t, o.class.getName());
    }

    public static void g(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(" cannot be cast to ");
        stringBuilder.append(str);
        lI(stringBuilder.toString());
    }

    public static void lI(String str) {
        throw a(new ClassCastException(str));
    }

    public static ClassCastException a(ClassCastException classCastException) {
        throw ((ClassCastException) an(classCastException));
    }

    public static Iterable dh(Object obj) {
        if ((obj instanceof a) && !(obj instanceof c)) {
            g(obj, "kotlin.collections.MutableIterable");
        }
        return di(obj);
    }

    public static Iterable di(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static Collection dj(Object obj) {
        if ((obj instanceof a) && !(obj instanceof b)) {
            g(obj, "kotlin.collections.MutableCollection");
        }
        return dk(obj);
    }

    public static Collection dk(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static List dl(Object obj) {
        if ((obj instanceof a) && !(obj instanceof e)) {
            g(obj, "kotlin.collections.MutableList");
        }
        return dm(obj);
    }

    public static List dm(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static Set dn(Object obj) {
        if ((obj instanceof a) && !(obj instanceof g)) {
            g(obj, "kotlin.collections.MutableSet");
        }
        return m2do(obj);
    }

    /* renamed from: do */
    public static Set m2do(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static Map dp(Object obj) {
        if ((obj instanceof a) && !(obj instanceof f)) {
            g(obj, "kotlin.collections.MutableMap");
        }
        return dq(obj);
    }

    public static Map dq(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static int dr(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).bnH();
        }
        if (obj instanceof kotlin.jvm.a.a) {
            return 0;
        }
        if (obj instanceof kotlin.jvm.a.b) {
            return 1;
        }
        if (obj instanceof m) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof kotlin.jvm.a.c) {
            return 10;
        }
        if (obj instanceof d) {
            return 11;
        }
        if (obj instanceof kotlin.jvm.a.e) {
            return 12;
        }
        if (obj instanceof kotlin.jvm.a.f) {
            return 13;
        }
        if (obj instanceof kotlin.jvm.a.g) {
            return 14;
        }
        if (obj instanceof h) {
            return 15;
        }
        if (obj instanceof i) {
            return 16;
        }
        if (obj instanceof j) {
            return 17;
        }
        if (obj instanceof k) {
            return 18;
        }
        if (obj instanceof l) {
            return 19;
        }
        if (obj instanceof n) {
            return 20;
        }
        if (obj instanceof kotlin.jvm.a.o) {
            return 21;
        }
        return obj instanceof p ? 22 : -1;
    }

    public static boolean p(Object obj, int i) {
        return (obj instanceof kotlin.c) && dr(obj) == i;
    }

    public static Object q(Object obj, int i) {
        if (!(obj == null || p(obj, i))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin.jvm.functions.Function");
            stringBuilder.append(i);
            g(obj, stringBuilder.toString());
        }
        return obj;
    }
}
