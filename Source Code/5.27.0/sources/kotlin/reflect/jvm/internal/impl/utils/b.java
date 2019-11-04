package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: DFS */
public class b {

    /* compiled from: DFS */
    public interface b<N> {
        Iterable<? extends N> dy(N n);
    }

    /* compiled from: DFS */
    public interface c<N, R> {
        R bsI();

        void dR(N n);

        boolean dz(N n);
    }

    /* compiled from: DFS */
    public interface d<N> {
        boolean dW(N n);
    }

    /* compiled from: DFS */
    public static abstract class a<N, R> implements c<N, R> {
        public void dR(N n) {
        }

        public boolean dz(N n) {
            return true;
        }
    }

    /* compiled from: DFS */
    public static class e<N> implements d<N> {
        private final Set<N> Zz;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"}));
        }

        public e() {
            this(new HashSet());
        }

        public e(Set<N> set) {
            if (set == null) {
                $$$reportNull$$$0(0);
            }
            this.Zz = set;
        }

        public boolean dW(N n) {
            return this.Zz.add(n);
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R a(Collection<N> collection, b<N> bVar, d<N> dVar, c<N, R> cVar) {
        if (collection == null) {
            $$$reportNull$$$0(0);
        }
        if (bVar == null) {
            $$$reportNull$$$0(1);
        }
        if (dVar == null) {
            $$$reportNull$$$0(2);
        }
        if (cVar == null) {
            $$$reportNull$$$0(3);
        }
        for (N a : collection) {
            a((Object) a, (b) bVar, (d) dVar, (c) cVar);
        }
        return cVar.bsI();
    }

    public static <N, R> R a(Collection<N> collection, b<N> bVar, c<N, R> cVar) {
        if (collection == null) {
            $$$reportNull$$$0(4);
        }
        if (bVar == null) {
            $$$reportNull$$$0(5);
        }
        if (cVar == null) {
            $$$reportNull$$$0(6);
        }
        return a((Collection) collection, (b) bVar, new e(), (c) cVar);
    }

    public static <N> Boolean a(Collection<N> collection, b<N> bVar, final kotlin.jvm.a.b<N, Boolean> bVar2) {
        if (collection == null) {
            $$$reportNull$$$0(7);
        }
        if (bVar == null) {
            $$$reportNull$$$0(8);
        }
        if (bVar2 == null) {
            $$$reportNull$$$0(9);
        }
        final boolean[] zArr = new boolean[1];
        return (Boolean) a((Collection) collection, (b) bVar, new a<N, Boolean>() {
            public boolean dz(N n) {
                if (((Boolean) bVar2.invoke(n)).booleanValue()) {
                    zArr[0] = true;
                }
                return zArr[0] ^ 1;
            }

            /* renamed from: bPV */
            public Boolean bsI() {
                return Boolean.valueOf(zArr[0]);
            }
        });
    }

    public static <N> void a(N n, b<N> bVar, d<N> dVar, c<N, ?> cVar) {
        if (n == null) {
            $$$reportNull$$$0(22);
        }
        if (bVar == null) {
            $$$reportNull$$$0(23);
        }
        if (dVar == null) {
            $$$reportNull$$$0(24);
        }
        if (cVar == null) {
            $$$reportNull$$$0(25);
        }
        if (dVar.dW(n) && cVar.dz(n)) {
            for (Object a : bVar.dy(n)) {
                a(a, (b) bVar, (d) dVar, (c) cVar);
            }
            cVar.dR(n);
        }
    }
}
