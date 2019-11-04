package org.yaml.snakeyaml.events;

/* compiled from: ImplicitTuple */
public class f {
    private final boolean fKJ;
    private final boolean fKK;

    public f(boolean z, boolean z2) {
        this.fKJ = z;
        this.fKK = z2;
    }

    public boolean bUE() {
        return this.fKJ;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("implicit=[");
        stringBuilder.append(this.fKJ);
        stringBuilder.append(", ");
        stringBuilder.append(this.fKK);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
