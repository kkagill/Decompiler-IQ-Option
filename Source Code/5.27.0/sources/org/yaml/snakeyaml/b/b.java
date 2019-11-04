package org.yaml.snakeyaml.b;

import java.util.regex.Pattern;
import org.yaml.snakeyaml.nodes.h;

/* compiled from: ResolverTuple */
final class b {
    private final h fJU;
    private final Pattern fMp;

    public b(h hVar, Pattern pattern) {
        this.fJU = hVar;
        this.fMp = pattern;
    }

    public h bUl() {
        return this.fJU;
    }

    public Pattern bVd() {
        return this.fMp;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tuple tag=");
        stringBuilder.append(this.fJU);
        stringBuilder.append(" regexp=");
        stringBuilder.append(this.fMp);
        return stringBuilder.toString();
    }
}
