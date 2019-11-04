package org.yaml.snakeyaml.nodes;

import java.util.List;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.error.Mark;

/* compiled from: SequenceNode */
public class g extends b<d> {
    private final List<d> fLj;

    public g(h hVar, boolean z, List<d> list, Mark mark, Mark mark2, FlowStyle flowStyle) {
        super(hVar, mark, mark2, flowStyle);
        if (list != null) {
            this.fLj = list;
            this.fLm = z;
            return;
        }
        throw new NullPointerException("value in a Node is required.");
    }

    public NodeId bUJ() {
        return NodeId.sequence;
    }

    public List<d> bUK() {
        return this.fLj;
    }

    public void ai(Class<? extends Object> cls) {
        for (d ah : this.fLj) {
            ah.ah(cls);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" (tag=");
        stringBuilder.append(bUl());
        stringBuilder.append(", value=");
        stringBuilder.append(bUK());
        stringBuilder.append(")>");
        return stringBuilder.toString();
    }
}
