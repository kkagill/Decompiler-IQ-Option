package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: modifierChecks.kt */
public abstract class k implements b {
    private final String description;
    private final kotlin.jvm.a.b<g, w> fzt;
    private final String name;

    /* compiled from: modifierChecks.kt */
    public static final class a extends k {
        public static final a fzu = new a();

        private a() {
            super("Boolean", ReturnsCheck$ReturnsBoolean$1.fzv, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends k {
        public static final b fzw = new b();

        private b() {
            super("Int", ReturnsCheck$ReturnsInt$1.fzx, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends k {
        public static final c fzy = new c();

        private c() {
            super("Unit", ReturnsCheck$ReturnsUnit$1.fzz, null);
        }
    }

    private k(String str, kotlin.jvm.a.b<? super g, ? extends w> bVar) {
        this.name = str;
        this.fzt = bVar;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("must return ");
        stringBuilder.append(this.name);
        this.description = stringBuilder.toString();
    }

    public /* synthetic */ k(String str, kotlin.jvm.a.b bVar, f fVar) {
        this(str, bVar);
    }

    public String a(s sVar) {
        i.f(sVar, "functionDescriptor");
        return kotlin.reflect.jvm.internal.impl.util.b.a.a(this, sVar);
    }

    public String getDescription() {
        return this.description;
    }

    public boolean n(s sVar) {
        i.f(sVar, "functionDescriptor");
        return i.y(sVar.bsN(), (w) this.fzt.invoke(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(sVar)));
    }
}
