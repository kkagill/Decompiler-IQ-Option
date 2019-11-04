package org.yaml.snakeyaml.events;

import java.util.Map;
import org.yaml.snakeyaml.DumperOptions.Version;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.events.Event.ID;

/* compiled from: DocumentStartEvent */
public final class e extends Event {
    private final Version fJO;
    private final boolean fKG;
    private final Map<String, String> tags;

    public e(Mark mark, Mark mark2, boolean z, Version version, Map<String, String> map) {
        super(mark, mark2);
        this.fKG = z;
        this.fJO = version;
        this.tags = map;
    }

    public boolean a(ID id) {
        return ID.DocumentStart == id;
    }
}
