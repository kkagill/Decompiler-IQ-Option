package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.m;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.a.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a.b;
import kotlin.reflect.jvm.internal.impl.descriptors.a.c;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: JvmBuiltIns.kt */
public final class e extends g {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(e.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSettings;"))};
    private v fcm;
    private boolean fcn;
    private final kotlin.reflect.jvm.internal.impl.storage.e fco;

    public final JvmBuiltInsSettings bsn() {
        return (JvmBuiltInsSettings) kotlin.reflect.jvm.internal.impl.storage.g.a(this.fco, (Object) this, anY[0]);
    }

    public /* synthetic */ e(h hVar, boolean z, int i, f fVar) {
        if ((i & 2) != 0) {
            z = true;
        }
        this(hVar, z);
    }

    public e(h hVar, boolean z) {
        i.f(hVar, "storageManager");
        super(hVar);
        this.fcn = true;
        this.fco = hVar.f(new JvmBuiltIns$settings$2(this, hVar));
        if (z) {
            bqv();
        }
    }

    public final void a(v vVar, boolean z) {
        i.f(vVar, "moduleDescriptor");
        Object obj = this.fcm == null ? 1 : null;
        if (m.eVC && obj == null) {
            throw new AssertionError("JvmBuiltins repeated initialization");
        }
        this.fcm = vVar;
        this.fcn = z;
    }

    /* Access modifiers changed, original: protected */
    public c bqx() {
        return bsn();
    }

    /* Access modifiers changed, original: protected */
    public a bqw() {
        return bsn();
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bso */
    public List<b> bqy() {
        Iterable bqy = super.bqy();
        i.e(bqy, "super.getClassDescriptorFactories()");
        h bqz = bqz();
        i.e(bqz, "storageManager");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.v bqA = bqA();
        i.e(bqA, "builtInsModule");
        return u.e(bqy, (Object) new d(bqz, bqA, null, 4, null));
    }
}
