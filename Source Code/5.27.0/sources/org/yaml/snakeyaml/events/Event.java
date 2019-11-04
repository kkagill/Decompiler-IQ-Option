package org.yaml.snakeyaml.events;

import org.yaml.snakeyaml.error.Mark;

public abstract class Event {
    private final Mark fKH;
    private final Mark fKI;

    public enum ID {
        Alias,
        DocumentEnd,
        DocumentStart,
        MappingEnd,
        MappingStart,
        Scalar,
        SequenceEnd,
        SequenceStart,
        StreamEnd,
        StreamStart
    }

    public abstract boolean a(ID id);

    /* Access modifiers changed, original: protected */
    public String bUB() {
        return "";
    }

    public Event(Mark mark, Mark mark2) {
        this.fKH = mark;
        this.fKI = mark2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        stringBuilder.append(getClass().getName());
        stringBuilder.append("(");
        stringBuilder.append(bUB());
        stringBuilder.append(")>");
        return stringBuilder.toString();
    }

    public Mark bUC() {
        return this.fKH;
    }

    public Mark bUD() {
        return this.fKI;
    }

    public boolean equals(Object obj) {
        return obj instanceof Event ? toString().equals(obj.toString()) : false;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
