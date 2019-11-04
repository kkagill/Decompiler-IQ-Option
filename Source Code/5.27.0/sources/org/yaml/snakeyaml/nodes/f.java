package org.yaml.snakeyaml.nodes;

import org.yaml.snakeyaml.DumperOptions.ScalarStyle;
import org.yaml.snakeyaml.error.Mark;

/* compiled from: ScalarNode */
public class f extends d {
    private ScalarStyle fKM;
    private String value;

    public f(h hVar, boolean z, String str, Mark mark, Mark mark2, ScalarStyle scalarStyle) {
        super(hVar, mark, mark2);
        if (str != null) {
            this.value = str;
            if (scalarStyle != null) {
                this.fKM = scalarStyle;
                this.fLm = z;
                return;
            }
            throw new NullPointerException("Scalar style must be provided.");
        }
        throw new NullPointerException("value in a Node is required.");
    }

    public NodeId bUJ() {
        return NodeId.scalar;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" (tag=");
        stringBuilder.append(bUl());
        stringBuilder.append(", value=");
        stringBuilder.append(getValue());
        stringBuilder.append(")>");
        return stringBuilder.toString();
    }
}
