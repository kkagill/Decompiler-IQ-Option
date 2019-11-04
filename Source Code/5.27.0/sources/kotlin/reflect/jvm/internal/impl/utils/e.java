package kotlin.reflect.jvm.internal.impl.utils;

import com.google.android.gms.plus.PlusShare;
import java.util.Map;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

/* compiled from: Jsr305State.kt */
public final class e {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(e.class), PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, "getDescription()[Ljava/lang/String;"))};
    public static final e fzV = new e(ReportLevel.WARN, null, af.emptyMap(), false, 8, null);
    public static final e fzW = new e(ReportLevel.IGNORE, ReportLevel.IGNORE, af.emptyMap(), false, 8, null);
    public static final e fzX = new e(ReportLevel.STRICT, ReportLevel.STRICT, af.emptyMap(), false, 8, null);
    public static final a fzY = new a();
    private final d fzQ;
    private final ReportLevel fzR;
    private final ReportLevel fzS;
    private final Map<String, ReportLevel> fzT;
    private final boolean fzU;

    /* compiled from: Jsr305State.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (i.y(this.fzR, eVar.fzR) && i.y(this.fzS, eVar.fzS) && i.y(this.fzT, eVar.fzT)) {
                    if ((this.fzU == eVar.fzU ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ReportLevel reportLevel = this.fzR;
        int i = 0;
        int hashCode = (reportLevel != null ? reportLevel.hashCode() : 0) * 31;
        ReportLevel reportLevel2 = this.fzS;
        hashCode = (hashCode + (reportLevel2 != null ? reportLevel2.hashCode() : 0)) * 31;
        Map map = this.fzT;
        if (map != null) {
            i = map.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.fzU;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Jsr305State(global=");
        stringBuilder.append(this.fzR);
        stringBuilder.append(", migration=");
        stringBuilder.append(this.fzS);
        stringBuilder.append(", user=");
        stringBuilder.append(this.fzT);
        stringBuilder.append(", enableCompatqualCheckerFrameworkAnnotations=");
        stringBuilder.append(this.fzU);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(ReportLevel reportLevel, ReportLevel reportLevel2, Map<String, ? extends ReportLevel> map, boolean z) {
        i.f(reportLevel, "global");
        i.f(map, "user");
        this.fzR = reportLevel;
        this.fzS = reportLevel2;
        this.fzT = map;
        this.fzU = z;
        this.fzQ = g.c(new Jsr305State$description$2(this));
    }

    public final ReportLevel bPZ() {
        return this.fzR;
    }

    public final ReportLevel bQa() {
        return this.fzS;
    }

    public final Map<String, ReportLevel> bQb() {
        return this.fzT;
    }

    public /* synthetic */ e(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, boolean z, int i, f fVar) {
        if ((i & 8) != 0) {
            z = true;
        }
        this(reportLevel, reportLevel2, map, z);
    }

    public final boolean bQc() {
        return this.fzU;
    }

    public final boolean bvp() {
        return ((e) this) == fzW;
    }
}
