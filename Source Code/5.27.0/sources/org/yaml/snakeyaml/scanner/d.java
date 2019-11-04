package org.yaml.snakeyaml.scanner;

import org.yaml.snakeyaml.error.Mark;

/* compiled from: SimpleKey */
final class d {
    private int column;
    private int fMM;
    private Mark fMN;
    private int index;
    private int line;
    private boolean required;

    public d(int i, boolean z, int i2, int i3, int i4, Mark mark) {
        this.fMM = i;
        this.required = z;
        this.index = i2;
        this.line = i3;
        this.column = i4;
        this.fMN = mark;
    }

    public int bVY() {
        return this.fMM;
    }

    public int bUy() {
        return this.column;
    }

    public Mark bUZ() {
        return this.fMN;
    }

    public int getIndex() {
        return this.index;
    }

    public int bUx() {
        return this.line;
    }

    public boolean wo() {
        return this.required;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SimpleKey - tokenNumber=");
        stringBuilder.append(this.fMM);
        stringBuilder.append(" required=");
        stringBuilder.append(this.required);
        stringBuilder.append(" index=");
        stringBuilder.append(this.index);
        stringBuilder.append(" line=");
        stringBuilder.append(this.line);
        stringBuilder.append(" column=");
        stringBuilder.append(this.column);
        return stringBuilder.toString();
    }
}
