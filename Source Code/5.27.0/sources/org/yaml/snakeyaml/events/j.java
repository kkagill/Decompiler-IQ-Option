package org.yaml.snakeyaml.events;

import org.yaml.snakeyaml.DumperOptions.ScalarStyle;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.events.Event.ID;

/* compiled from: ScalarEvent */
public final class j extends i {
    private final ScalarStyle fKM;
    private final f fKN;
    private final String tag;
    private final String value;

    public j(String str, String str2, f fVar, String str3, Mark mark, Mark mark2, ScalarStyle scalarStyle) {
        super(str, mark, mark2);
        this.tag = str2;
        this.fKN = fVar;
        if (str3 != null) {
            this.value = str3;
            if (scalarStyle != null) {
                this.fKM = scalarStyle;
                return;
            }
            throw new NullPointerException("Style must be provided.");
        }
        throw new NullPointerException("Value must be provided.");
    }

    public String getTag() {
        return this.tag;
    }

    public ScalarStyle bUG() {
        return this.fKM;
    }

    public String getValue() {
        return this.value;
    }

    public f bUH() {
        return this.fKN;
    }

    /* Access modifiers changed, original: protected */
    public String bUB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.bUB());
        stringBuilder.append(", tag=");
        stringBuilder.append(this.tag);
        stringBuilder.append(", ");
        stringBuilder.append(this.fKN);
        stringBuilder.append(", value=");
        stringBuilder.append(this.value);
        return stringBuilder.toString();
    }

    public boolean a(ID id) {
        return ID.Scalar == id;
    }
}
