package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.a.b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.h;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.e;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class d implements b {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    private static final kotlin.reflect.jvm.internal.impl.name.b fch = g.eZp;
    private static final f fci;
    private static final kotlin.reflect.jvm.internal.impl.name.a fcj;
    public static final a fck = new a();
    private final e fce;
    private final v fcf;
    private final kotlin.jvm.a.b<v, kotlin.reflect.jvm.internal.impl.descriptors.k> fcg;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.name.a bsl() {
            return d.fcj;
        }
    }

    private final h bsh() {
        return (h) kotlin.reflect.jvm.internal.impl.storage.g.a(this.fce, (Object) this, anY[0]);
    }

    public d(kotlin.reflect.jvm.internal.impl.storage.h hVar, v vVar, kotlin.jvm.a.b<? super v, ? extends kotlin.reflect.jvm.internal.impl.descriptors.k> bVar) {
        i.f(hVar, "storageManager");
        i.f(vVar, "moduleDescriptor");
        i.f(bVar, "computeContainingDeclaration");
        this.fcf = vVar;
        this.fcg = bVar;
        this.fce = hVar.f(new JvmBuiltInClassDescriptorFactory$cloneable$2(this, hVar));
    }

    public /* synthetic */ d(kotlin.reflect.jvm.internal.impl.storage.h hVar, v vVar, kotlin.jvm.a.b bVar, int i, f fVar) {
        if ((i & 4) != 0) {
            bVar = JvmBuiltInClassDescriptorFactory$1.fcl;
        }
        this(hVar, vVar, bVar);
    }

    public boolean a(kotlin.reflect.jvm.internal.impl.name.b bVar, f fVar) {
        i.f(bVar, "packageFqName");
        i.f(fVar, ConditionalUserProperty.NAME);
        return i.y(fVar, fci) && i.y(bVar, fch);
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.d f(kotlin.reflect.jvm.internal.impl.name.a aVar) {
        i.f(aVar, "classId");
        return i.y(aVar, fcj) ? bsh() : null;
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> d(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        i.f(bVar, "packageFqName");
        if (i.y(bVar, fch)) {
            return ak.df(bsh());
        }
        return al.emptySet();
    }

    static {
        f bKc = g.eZA.eZF.bKc();
        i.e(bKc, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
        fci = bKc;
        kotlin.reflect.jvm.internal.impl.name.a s = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.eZF.bKf());
        i.e(s, "ClassId.topLevel(KotlinB…NAMES.cloneable.toSafe())");
        fcj = s;
    }
}
