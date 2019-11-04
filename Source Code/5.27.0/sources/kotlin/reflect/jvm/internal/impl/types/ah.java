package kotlin.reflect.jvm.internal.impl.types;

import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;

/* compiled from: StarProjectionImpl.kt */
public final class ah extends aq {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(ah.class), "_type", "get_type()Lorg/jetbrains/kotlin/types/KotlinType;"))};
    private final d fxq = g.a(LazyThreadSafetyMode.PUBLICATION, new StarProjectionImpl$_type$2(this));
    private final ao fxr;

    private final w bPE() {
        d dVar = this.fxq;
        j jVar = anY[0];
        return (w) dVar.getValue();
    }

    public boolean bPC() {
        return true;
    }

    public ah(ao aoVar) {
        i.f(aoVar, "typeParameter");
        this.fxr = aoVar;
    }

    public Variance bPD() {
        return Variance.OUT_VARIANCE;
    }

    public w bpT() {
        return bPE();
    }
}
