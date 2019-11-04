package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.renderer.g;

/* compiled from: TypeWithEnhancement.kt */
public final class s extends q implements av {
    private final q fxi;
    private final w fxj;

    /* renamed from: bPu */
    public q bPv() {
        return this.fxi;
    }

    public w bPw() {
        return this.fxj;
    }

    public s(q qVar, w wVar) {
        i.f(qVar, ConditionalUserProperty.ORIGIN);
        i.f(wVar, "enhancement");
        super(qVar.bPr(), qVar.bPs());
        this.fxi = qVar;
        this.fxj = wVar;
    }

    public ay f(f fVar) {
        i.f(fVar, "newAnnotations");
        return aw.b(bPv().f(fVar), bPw());
    }

    public ay gL(boolean z) {
        return aw.b(bPv().gL(z), bPw().bPA().gL(z));
    }

    public String a(b bVar, g gVar) {
        i.f(bVar, "renderer");
        i.f(gVar, "options");
        if (gVar.bMg()) {
            return bVar.b(bPw());
        }
        return bPv().a(bVar, gVar);
    }

    public ad bxe() {
        return bPv().bxe();
    }
}
