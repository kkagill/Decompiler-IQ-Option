package kotlin.reflect.jvm.internal.impl.utils;

/* compiled from: Jsr305State.kt */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public static final a Companion = null;
    private final String description;

    /* compiled from: Jsr305State.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    private ReportLevel(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    static {
        Companion = new a();
    }

    public final boolean isWarning() {
        return ((ReportLevel) this) == WARN;
    }

    public final boolean isIgnore() {
        return ((ReportLevel) this) == IGNORE;
    }
}
