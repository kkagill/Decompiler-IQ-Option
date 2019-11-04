package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.af;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.g;
import kotlin.reflect.jvm.internal.impl.types.n;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.utils.a;

/* compiled from: Visibilities */
public class av {
    public static final aw fda = new aw("private", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean l(k kVar) {
            if (kVar == null) {
                AnonymousClass1.$$$reportNull$$$0(0);
            }
            return c.M(kVar) != ak.fcW;
        }

        public boolean b(e eVar, o oVar, k kVar) {
            boolean z = true;
            if (oVar == null) {
                AnonymousClass1.$$$reportNull$$$0(1);
            }
            if (kVar == null) {
                AnonymousClass1.$$$reportNull$$$0(2);
            }
            if (c.A(oVar) && l(kVar)) {
                return av.a((k) oVar, kVar);
            }
            k brj;
            if (oVar instanceof j) {
                g btg = ((j) oVar).btg();
                if (c.E(btg) && c.A(btg) && (kVar instanceof j) && c.A(kVar.brj()) && av.a((k) oVar, kVar)) {
                    return true;
                }
            }
            while (brj != null) {
                brj = brj.brj();
                if (!(brj instanceof d) || c.D(brj)) {
                    if (brj instanceof y) {
                        break;
                    }
                }
                break;
            }
            if (brj == null) {
                return false;
            }
            while (kVar != null) {
                if (brj == kVar) {
                    return true;
                }
                if (kVar instanceof y) {
                    if (!((brj instanceof y) && ((y) brj).btB().equals(((y) kVar).btB()) && c.f(kVar, brj))) {
                        z = false;
                    }
                    return z;
                }
                kVar = kVar.brj();
            }
            return false;
        }
    };
    public static final aw fdb = new aw("private_to_this", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$2";
            if (i == 1) {
                objArr[0] = "from";
            } else if (i != 2) {
                objArr[0] = "what";
            } else {
                objArr[0] = str2;
            }
            if (i != 2) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getDisplayName";
            }
            if (i != 2) {
                objArr[2] = "isVisible";
            }
            str = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(str) : new IllegalStateException(str));
        }

        public String getDisplayName() {
            return "private/*private to this*/";
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass5.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass5.$$$reportNull$$$0(1);
            }
            if (av.fda.b(eVar, oVar, kVar)) {
                if (eVar == av.fdn) {
                    return true;
                }
                if (eVar == av.fdm) {
                    return false;
                }
                k a = c.a((k) oVar, d.class);
                if (a != null && (eVar instanceof g)) {
                    return ((g) eVar).btP().btf().equals(a.bsW());
                }
            }
            return false;
        }
    };
    public static final aw fdc = new aw("protected", true) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass6.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass6.$$$reportNull$$$0(1);
            }
            k kVar2 = (d) c.a((k) oVar, d.class);
            d dVar = (d) c.a(kVar, d.class, false);
            if (dVar == null) {
                return false;
            }
            if (kVar2 != null && c.D(kVar2)) {
                d dVar2 = (d) c.a(kVar2, d.class);
                if (dVar2 != null && c.d(dVar, dVar2)) {
                    return true;
                }
            }
            kVar2 = c.a(oVar);
            d dVar3 = (d) c.a(kVar2, d.class);
            if (dVar3 == null) {
                return false;
            }
            if (c.d(dVar, dVar3) && a(eVar, kVar2, dVar)) {
                return true;
            }
            return b(eVar, oVar, dVar.brj());
        }

        private boolean a(e eVar, o oVar, d dVar) {
            if (oVar == null) {
                AnonymousClass6.$$$reportNull$$$0(2);
            }
            if (dVar == null) {
                AnonymousClass6.$$$reportNull$$$0(3);
            }
            boolean z = false;
            if (eVar == av.fdo) {
                return false;
            }
            if (!(oVar instanceof CallableMemberDescriptor) || (oVar instanceof j) || eVar == av.fdn) {
                return true;
            }
            if (!(eVar == av.fdm || eVar == null)) {
                w bNQ = eVar instanceof f ? ((f) eVar).bNQ() : eVar.bpT();
                if (c.b(bNQ, dVar) || n.aC(bNQ)) {
                    z = true;
                }
            }
            return z;
        }
    };
    public static final aw fdd = new aw("internal", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass7.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass7.$$$reportNull$$$0(1);
            }
            if (c.B(kVar).c(c.B(oVar))) {
                return av.fdp.j(oVar, kVar);
            }
            return false;
        }
    };
    public static final aw fde = new aw("public", true) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass8.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass8.$$$reportNull$$$0(1);
            }
            return true;
        }
    };
    public static final aw fdf = new aw(ImagesContract.LOCAL, false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass9.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass9.$$$reportNull$$$0(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    };
    public static final aw fdg = new aw("inherited", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass10.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass10.$$$reportNull$$$0(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    };
    public static final aw fdh = new aw("invisible_fake", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass11.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass11.$$$reportNull$$$0(1);
            }
            return false;
        }
    };
    public static final aw fdi = new aw("unknown", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean b(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                AnonymousClass12.$$$reportNull$$$0(0);
            }
            if (kVar == null) {
                AnonymousClass12.$$$reportNull$$$0(1);
            }
            return false;
        }
    };
    public static final Set<aw> fdj = Collections.unmodifiableSet(al.setOf(fda, fdb, fdd, fdf));
    private static final Map<aw, Integer> fdk;
    public static final aw fdl = fde;
    private static final e fdm = new e() {
        public w bpT() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    public static final e fdn = new e() {
        public w bpT() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    @Deprecated
    public static final e fdo = new e() {
        public w bpT() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    private static final kotlin.reflect.jvm.internal.impl.util.g fdp;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                    objArr[0] = "visibility";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities";
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        Integer valueOf2 = Integer.valueOf(1);
        HashMap ch = a.ch(4);
        ch.put(fdb, valueOf);
        ch.put(fda, valueOf);
        ch.put(fdd, valueOf2);
        ch.put(fdc, valueOf2);
        ch.put(fde, Integer.valueOf(2));
        fdk = Collections.unmodifiableMap(ch);
        Iterator it = ServiceLoader.load(kotlin.reflect.jvm.internal.impl.util.g.class, kotlin.reflect.jvm.internal.impl.util.g.class.getClassLoader()).iterator();
        fdp = it.hasNext() ? (kotlin.reflect.jvm.internal.impl.util.g) it.next() : kotlin.reflect.jvm.internal.impl.util.g.a.fyz;
    }

    public static boolean a(o oVar, k kVar) {
        if (oVar == null) {
            $$$reportNull$$$0(2);
        }
        if (kVar == null) {
            $$$reportNull$$$0(3);
        }
        return a(fdn, oVar, kVar) == null;
    }

    public static boolean a(k kVar, k kVar2) {
        if (kVar == null) {
            $$$reportNull$$$0(6);
        }
        if (kVar2 == null) {
            $$$reportNull$$$0(7);
        }
        ak M = c.M(kVar2);
        return M != ak.fcW ? M.equals(c.M(kVar)) : false;
    }

    public static o a(e eVar, o oVar, k kVar) {
        if (oVar == null) {
            $$$reportNull$$$0(8);
        }
        if (kVar == null) {
            $$$reportNull$$$0(9);
        }
        k kVar2 = (o) oVar.bsW();
        while (kVar2 != null && kVar2.brx() != fdf) {
            if (!kVar2.brx().b(eVar, kVar2, kVar)) {
                return kVar2;
            }
            o kVar22 = (o) c.a(kVar22, o.class);
        }
        if (oVar instanceof af) {
            o a = a(eVar, ((af) oVar).bvc(), kVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    static Integer b(aw awVar, aw awVar2) {
        if (awVar == null) {
            $$$reportNull$$$0(10);
        }
        if (awVar2 == null) {
            $$$reportNull$$$0(11);
        }
        if (awVar == awVar2) {
            return Integer.valueOf(0);
        }
        Integer num = (Integer) fdk.get(awVar);
        Integer num2 = (Integer) fdk.get(awVar2);
        return (num == null || num2 == null || num.equals(num2)) ? null : Integer.valueOf(num.intValue() - num2.intValue());
    }

    public static Integer c(aw awVar, aw awVar2) {
        if (awVar == null) {
            $$$reportNull$$$0(12);
        }
        if (awVar2 == null) {
            $$$reportNull$$$0(13);
        }
        Integer c = awVar.c(awVar2);
        if (c != null) {
            return c;
        }
        Integer c2 = awVar2.c(awVar);
        return c2 != null ? Integer.valueOf(-c2.intValue()) : null;
    }

    public static boolean b(aw awVar) {
        if (awVar == null) {
            $$$reportNull$$$0(14);
        }
        return awVar == fda || awVar == fdb;
    }
}
