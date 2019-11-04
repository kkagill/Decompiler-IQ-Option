package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: MemberScope.kt */
public abstract class c {

    /* compiled from: MemberScope.kt */
    public static final class a extends c {
        private static final int ftS = (d.fuu.bNH() & ((d.fuu.bNF() | d.fuu.bNG()) ^ -1));
        public static final a ftT = new a();

        private a() {
        }

        public int bNo() {
            return ftS;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b extends c {
        public static final b ftU = new b();

        public int bNo() {
            return 0;
        }

        private b() {
        }
    }

    public abstract int bNo();

    public String toString() {
        return getClass().getSimpleName();
    }
}
