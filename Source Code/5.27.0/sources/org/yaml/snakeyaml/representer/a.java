package org.yaml.snakeyaml.representer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.DumperOptions.ScalarStyle;
import org.yaml.snakeyaml.introspector.g;
import org.yaml.snakeyaml.nodes.d;

/* compiled from: BaseRepresenter */
public abstract class a {
    protected FlowStyle fJC = FlowStyle.AUTO;
    private g fJV;
    private boolean fKs = false;
    protected final Map<Class<?>, b> fLW = new HashMap();
    protected b fLX;
    protected final Map<Class<?>, b> fLY = new LinkedHashMap();
    protected ScalarStyle fLZ = null;
    protected final Map<Object, d> fMa = new BaseRepresenter$1(this);

    public void a(ScalarStyle scalarStyle) {
        this.fLZ = scalarStyle;
    }

    public ScalarStyle bUe() {
        ScalarStyle scalarStyle = this.fLZ;
        return scalarStyle == null ? ScalarStyle.PLAIN : scalarStyle;
    }

    public void a(FlowStyle flowStyle) {
        this.fJC = flowStyle;
    }

    public FlowStyle bUh() {
        return this.fJC;
    }

    public void a(g gVar) {
        this.fJV = gVar;
        this.fKs = true;
    }

    public final g bUq() {
        if (this.fJV == null) {
            this.fJV = new g();
        }
        return this.fJV;
    }

    public final boolean bUr() {
        return this.fKs;
    }
}
