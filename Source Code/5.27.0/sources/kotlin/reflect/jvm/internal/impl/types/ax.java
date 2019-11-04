package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: ErrorType.kt */
public final class ax extends o {
    private final String fxH;

    public final String bPH() {
        return this.fxH;
    }

    public ax(String str, an anVar, h hVar, List<? extends ap> list, boolean z) {
        i.f(str, "presentableName");
        i.f(anVar, "constructor");
        i.f(hVar, "memberScope");
        i.f(list, "arguments");
        super(anVar, hVar, list, z);
        this.fxH = str;
    }

    /* renamed from: gM */
    public ad gL(boolean z) {
        return new ax(this.fxH, bMZ(), bsF(), btD(), z);
    }
}
