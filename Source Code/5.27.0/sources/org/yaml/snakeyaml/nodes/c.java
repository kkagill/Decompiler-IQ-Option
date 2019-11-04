package org.yaml.snakeyaml.nodes;

import java.util.List;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.error.Mark;

/* compiled from: MappingNode */
public class c extends b<e> {
    private List<e> fLj;
    private boolean fLk = false;

    public c(h hVar, boolean z, List<e> list, Mark mark, Mark mark2, FlowStyle flowStyle) {
        super(hVar, mark, mark2, flowStyle);
        if (list != null) {
            this.fLj = list;
            this.fLm = z;
            return;
        }
        throw new NullPointerException("value in a Node is required.");
    }

    public NodeId bUJ() {
        return NodeId.mapping;
    }

    public List<e> bUK() {
        return this.fLj;
    }

    public void cs(List<e> list) {
        this.fLj = list;
    }

    public void ag(Class<? extends Object> cls) {
        for (e bUO : this.fLj) {
            bUO.bUO().ah(cls);
        }
    }

    public void b(Class<? extends Object> cls, Class<? extends Object> cls2) {
        for (e eVar : this.fLj) {
            eVar.bUP().ah(cls2);
            eVar.bUO().ah(cls);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (e eVar : bUK()) {
            stringBuilder.append("{ key=");
            stringBuilder.append(eVar.bUO());
            stringBuilder.append("; value=");
            if (eVar.bUP() instanceof b) {
                stringBuilder.append(System.identityHashCode(eVar.bUP()));
            } else {
                stringBuilder.append(eVar.toString());
            }
            stringBuilder.append(" }");
        }
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("<");
        stringBuilder3.append(getClass().getName());
        stringBuilder3.append(" (tag=");
        stringBuilder3.append(bUl());
        stringBuilder3.append(", values=");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(")>");
        return stringBuilder3.toString();
    }

    public void hu(boolean z) {
        this.fLk = z;
    }

    public boolean bUL() {
        return this.fLk;
    }
}
