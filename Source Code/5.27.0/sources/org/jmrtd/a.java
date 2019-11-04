package org.jmrtd;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.FileSystemStructured;

/* compiled from: MRTDFileSystem */
class a implements FileSystemStructured {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private short fEd = (short) 0;
    private boolean fEe;
    private d fEf;
    private Map<Short, Object> fEg = new HashMap();
    private boolean isSelected = false;

    public a(d dVar, boolean z) {
        this.fEf = dVar;
        this.fEe = z;
    }

    public synchronized void d(short s) {
        if (this.fEd != s) {
            this.fEd = s;
            this.isSelected = false;
        }
    }
}
