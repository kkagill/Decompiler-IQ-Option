package org.yaml.snakeyaml.tokens;

import org.yaml.snakeyaml.DumperOptions.ScalarStyle;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.tokens.Token.ID;

/* compiled from: ScalarToken */
public final class p extends Token {
    private final boolean fKJ;
    private final ScalarStyle fKM;
    private final String value;

    public p(String str, Mark mark, Mark mark2, boolean z) {
        this(str, z, mark, mark2, ScalarStyle.PLAIN);
    }

    public p(String str, boolean z, Mark mark, Mark mark2, ScalarStyle scalarStyle) {
        super(mark, mark2);
        this.value = str;
        this.fKJ = z;
        if (scalarStyle != null) {
            this.fKM = scalarStyle;
            return;
        }
        throw new NullPointerException("Style must be provided.");
    }

    public boolean bWa() {
        return this.fKJ;
    }

    public String getValue() {
        return this.value;
    }

    public ScalarStyle bWb() {
        return this.fKM;
    }

    public ID bVZ() {
        return ID.Scalar;
    }
}
