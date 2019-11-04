package org.yaml.snakeyaml.nodes;

/* compiled from: NodeTuple */
public final class e {
    private d fLo;
    private d fLp;

    public e(d dVar, d dVar2) {
        if (dVar == null || dVar2 == null) {
            throw new NullPointerException("Nodes must be provided.");
        }
        this.fLo = dVar;
        this.fLp = dVar2;
    }

    public d bUO() {
        return this.fLo;
    }

    public d bUP() {
        return this.fLp;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<NodeTuple keyNode=");
        stringBuilder.append(this.fLo.toString());
        stringBuilder.append("; valueNode=");
        stringBuilder.append(this.fLp.toString());
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
