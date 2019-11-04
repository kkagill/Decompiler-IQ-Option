package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.e;

/* compiled from: Visibility.kt */
public abstract class aw {
    private final boolean fdq;
    private final String name;

    public abstract boolean b(e eVar, o oVar, k kVar);

    public aw bud() {
        return this;
    }

    protected aw(String str, boolean z) {
        i.f(str, ConditionalUserProperty.NAME);
        this.name = str;
        this.fdq = z;
    }

    public final boolean bue() {
        return this.fdq;
    }

    /* Access modifiers changed, original: protected */
    public Integer c(aw awVar) {
        i.f(awVar, "visibility");
        return av.b(this, awVar);
    }

    public String getDisplayName() {
        return this.name;
    }

    public final String toString() {
        return getDisplayName();
    }
}
