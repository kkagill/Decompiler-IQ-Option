package org.yaml.snakeyaml.tokens;

/* compiled from: TagTuple */
public final class t {
    private final String fMQ;
    private final String suffix;

    public t(String str, String str2) {
        if (str2 != null) {
            this.fMQ = str;
            this.suffix = str2;
            return;
        }
        throw new NullPointerException("Suffix must be provided.");
    }

    public String bWd() {
        return this.fMQ;
    }

    public String bWe() {
        return this.suffix;
    }
}
