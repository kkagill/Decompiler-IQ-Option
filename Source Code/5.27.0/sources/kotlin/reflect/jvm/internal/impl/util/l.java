package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.s;

/* compiled from: modifierChecks.kt */
public abstract class l implements b {
    private final String description;

    /* compiled from: modifierChecks.kt */
    public static final class a extends l {
        private final int n;

        public a(int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("must have at least ");
            stringBuilder.append(i);
            stringBuilder.append(" value parameter");
            stringBuilder.append(i > 1 ? "s" : "");
            super(stringBuilder.toString(), null);
            this.n = i;
        }

        public boolean n(s sVar) {
            i.f(sVar, "functionDescriptor");
            return sVar.bsP().size() >= this.n;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends l {
        private final int n;

        public b(int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("must have exactly ");
            stringBuilder.append(i);
            stringBuilder.append(" value parameters");
            super(stringBuilder.toString(), null);
            this.n = i;
        }

        public boolean n(s sVar) {
            i.f(sVar, "functionDescriptor");
            return sVar.bsP().size() == this.n;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends l {
        public static final c fzA = new c();

        private c() {
            super("must have no value parameters", null);
        }

        public boolean n(s sVar) {
            i.f(sVar, "functionDescriptor");
            return sVar.bsP().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class d extends l {
        public static final d fzB = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        public boolean n(s sVar) {
            i.f(sVar, "functionDescriptor");
            return sVar.bsP().size() == 1;
        }
    }

    private l(String str) {
        this.description = str;
    }

    public /* synthetic */ l(String str, f fVar) {
        this(str);
    }

    public String a(s sVar) {
        i.f(sVar, "functionDescriptor");
        return kotlin.reflect.jvm.internal.impl.util.b.a.a(this, sVar);
    }

    public String getDescription() {
        return this.description;
    }
}
