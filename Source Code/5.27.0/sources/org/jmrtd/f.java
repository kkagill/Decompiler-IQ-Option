package org.jmrtd;

import java.io.Serializable;
import net.sf.scuba.smartcards.APDUEvent;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ResponseAPDU;

/* compiled from: WrappedAPDUEvent */
public class f extends APDUEvent {
    private CommandAPDU fEr;
    private ResponseAPDU fEs;

    public f(Object obj, Serializable serializable, int i, CommandAPDU commandAPDU, ResponseAPDU responseAPDU, CommandAPDU commandAPDU2, ResponseAPDU responseAPDU2) {
        super(obj, serializable, i, commandAPDU2, responseAPDU2);
        this.fEr = commandAPDU;
        this.fEs = responseAPDU;
    }
}
