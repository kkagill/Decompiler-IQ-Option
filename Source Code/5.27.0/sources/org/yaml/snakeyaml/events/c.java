package org.yaml.snakeyaml.events;

import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.error.Mark;

/* compiled from: CollectionStartEvent */
public abstract class c extends i {
    private final boolean fKE;
    private final FlowStyle fKF;
    private final String tag;

    public c(String str, String str2, boolean z, Mark mark, Mark mark2, FlowStyle flowStyle) {
        super(str, mark, mark2);
        this.tag = str2;
        this.fKE = z;
        if (flowStyle != null) {
            this.fKF = flowStyle;
            return;
        }
        throw new NullPointerException("Flow style must be provided.");
    }

    public String getTag() {
        return this.tag;
    }

    public boolean bUz() {
        return this.fKE;
    }

    public FlowStyle bUA() {
        return this.fKF;
    }

    /* Access modifiers changed, original: protected */
    public String bUB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.bUB());
        stringBuilder.append(", tag=");
        stringBuilder.append(this.tag);
        stringBuilder.append(", implicit=");
        stringBuilder.append(this.fKE);
        return stringBuilder.toString();
    }
}
