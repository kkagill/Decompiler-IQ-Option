package org.yaml.snakeyaml.tokens;

import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.tokens.Token.ID;

/* compiled from: TagToken */
public final class s extends Token {
    private final t fMP;

    public s(t tVar, Mark mark, Mark mark2) {
        super(mark, mark2);
        this.fMP = tVar;
    }

    public t bWc() {
        return this.fMP;
    }

    public ID bVZ() {
        return ID.Tag;
    }
}
