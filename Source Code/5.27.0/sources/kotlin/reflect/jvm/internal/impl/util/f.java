package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.s;

/* compiled from: modifierChecks.kt */
public abstract class f implements b {
    private final String description;

    /* compiled from: modifierChecks.kt */
    public static final class a extends f {
        public static final a fyx = new a();

        private a() {
            super("must be a member function", null);
        }

        public boolean n(s sVar) {
            i.f(sVar, "functionDescriptor");
            return sVar.bsL() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends f {
        public static final b fyy = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        public boolean n(s sVar) {
            i.f(sVar, "functionDescriptor");
            return (sVar.bsL() == null && sVar.bsK() == null) ? false : true;
        }
    }

    private f(String str) {
        this.description = str;
    }

    public /* synthetic */ f(String str, f fVar) {
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
