package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: typeSignatureMapping.kt */
public class g<T> {
    private int flQ;
    private T flR;
    private final j<T> flS;

    public void byx() {
    }

    public void byw() {
        if (this.flR == null) {
            this.flQ++;
            int i = this.flQ;
        }
    }

    public void dF(T t) {
        i.f(t, "objectType");
        dG(t);
    }

    /* Access modifiers changed, original: protected|final */
    public final void dG(T t) {
        i.f(t, "type");
        if (this.flR == null) {
            Object t2;
            if (this.flQ > 0) {
                j jVar = this.flS;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(u.l("[", this.flQ));
                stringBuilder.append(this.flS.toString(t2));
                t2 = jVar.mf(stringBuilder.toString());
            }
            this.flR = t2;
        }
    }

    public void c(f fVar, T t) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(t, "type");
        dG(t);
    }
}
