package kotlin.reflect.jvm.internal.impl.incremental.components;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;

/* compiled from: LookupTracker.kt */
public interface c {

    /* compiled from: LookupTracker.kt */
    public static final class a implements c {
        public static final a fgp = new a();

        public void a(String str, Position position, String str2, ScopeKind scopeKind, String str3) {
            i.f(str, "filePath");
            i.f(position, "position");
            i.f(str2, "scopeFqName");
            i.f(scopeKind, "scopeKind");
            i.f(str3, ConditionalUserProperty.NAME);
        }

        public boolean bvm() {
            return false;
        }

        private a() {
        }
    }

    void a(String str, Position position, String str2, ScopeKind scopeKind, String str3);

    boolean bvm();
}
