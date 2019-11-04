package org.yaml.snakeyaml.parser;

import java.util.Map;
import org.yaml.snakeyaml.DumperOptions.Version;

/* compiled from: VersionTagsTuple */
class d {
    private Version fJO;
    private Map<String, String> tags;

    public d(Version version, Map<String, String> map) {
        this.fJO = version;
        this.tags = map;
    }

    public Version bUX() {
        return this.fJO;
    }

    public Map<String, String> bUY() {
        return this.tags;
    }

    public String toString() {
        return String.format("VersionTagsTuple<%s, %s>", new Object[]{this.fJO, this.tags});
    }
}
