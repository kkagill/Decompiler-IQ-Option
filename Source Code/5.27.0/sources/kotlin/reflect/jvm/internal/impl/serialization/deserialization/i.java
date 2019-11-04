package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: DeserializationConfiguration.kt */
public interface i {

    /* compiled from: DeserializationConfiguration.kt */
    public static final class b {
        public static boolean a(i iVar) {
            return false;
        }

        public static boolean b(i iVar) {
            return false;
        }

        public static boolean c(i iVar) {
            return true;
        }

        public static boolean d(i iVar) {
            return true;
        }

        public static boolean e(i iVar) {
            return false;
        }
    }

    /* compiled from: DeserializationConfiguration.kt */
    public static final class a implements i {
        public static final a fvo = new a();

        private a() {
        }

        public boolean bOi() {
            return b.b(this);
        }

        public boolean bOj() {
            return b.c(this);
        }

        public boolean bOk() {
            return b.d(this);
        }

        public boolean bOl() {
            return b.e(this);
        }

        public boolean byt() {
            return b.a(this);
        }
    }

    boolean bOi();

    boolean bOj();

    boolean bOk();

    boolean bOl();

    boolean byt();
}
