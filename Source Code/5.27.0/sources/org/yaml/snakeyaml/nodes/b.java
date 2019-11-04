package org.yaml.snakeyaml.nodes;

import java.util.List;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.error.Mark;

/* compiled from: CollectionNode */
public abstract class b<T> extends d {
    private FlowStyle fKF;

    public abstract List<T> bUK();

    public b(h hVar, Mark mark, Mark mark2, FlowStyle flowStyle) {
        super(hVar, mark, mark2);
        b(flowStyle);
    }

    public void b(FlowStyle flowStyle) {
        if (flowStyle != null) {
            this.fKF = flowStyle;
            return;
        }
        throw new NullPointerException("Flow style must be provided.");
    }

    public void a(Mark mark) {
        this.fKI = mark;
    }
}
