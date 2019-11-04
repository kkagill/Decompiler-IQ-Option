package org.yaml.snakeyaml.events;

import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.events.Event.ID;

/* compiled from: DocumentEndEvent */
public final class d extends Event {
    private final boolean fKG;

    public d(Mark mark, Mark mark2, boolean z) {
        super(mark, mark2);
        this.fKG = z;
    }

    public boolean a(ID id) {
        return ID.DocumentEnd == id;
    }
}
