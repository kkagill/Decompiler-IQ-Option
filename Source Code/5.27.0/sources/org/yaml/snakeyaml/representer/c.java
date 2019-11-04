package org.yaml.snakeyaml.representer;

import java.util.Collections;
import java.util.Map;
import java.util.TimeZone;
import org.yaml.snakeyaml.b;
import org.yaml.snakeyaml.introspector.g;

/* compiled from: Representer */
public class c extends d {
    protected Map<Class<? extends Object>, b> fKt = Collections.emptyMap();

    /* compiled from: Representer */
    protected class a implements b {
        protected a() {
        }
    }

    public /* bridge */ /* synthetic */ TimeZone getTimeZone() {
        return super.getTimeZone();
    }

    public /* bridge */ /* synthetic */ void setTimeZone(TimeZone timeZone) {
        super.setTimeZone(timeZone);
    }

    public c() {
        this.fLW.put(null, new a());
    }

    public void a(g gVar) {
        super.a(gVar);
        for (b a : this.fKt.values()) {
            a.a(gVar);
        }
    }
}
