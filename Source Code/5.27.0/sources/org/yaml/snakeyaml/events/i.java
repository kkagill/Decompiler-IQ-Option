package org.yaml.snakeyaml.events;

import org.yaml.snakeyaml.error.Mark;

/* compiled from: NodeEvent */
public abstract class i extends Event {
    private final String fKL;

    public i(String str, Mark mark, Mark mark2) {
        super(mark, mark2);
        this.fKL = str;
    }

    public String bUF() {
        return this.fKL;
    }

    /* Access modifiers changed, original: protected */
    public String bUB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("anchor=");
        stringBuilder.append(this.fKL);
        return stringBuilder.toString();
    }
}
