package com.microblink.secured;

/* compiled from: line */
public class x {
    protected final int exC;
    private w[] exD;
    private int exE;

    public final synchronized void a(w wVar) {
        if (wVar != null) {
            wVar.bdr();
            if (this.exE < this.exC) {
                this.exE++;
                this.exD[this.exE] = wVar;
            }
        }
    }
}
