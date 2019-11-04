package com.iqoption.p.a;

import com.iqoption.core.util.j;
import java.text.DecimalFormat;

/* compiled from: StrikeFormatter */
public final class a {
    private DecimalFormat eaS;
    private int eaT;

    public a() {
        hu(6);
    }

    public a(int i) {
        hu(i);
    }

    public String format(double d) {
        return this.eaS.format(d);
    }

    public void ht(int i) {
        if (this.eaT != i) {
            hu(i);
        }
    }

    private void hu(int i) {
        this.eaT = i;
        this.eaS = j.fr(i);
    }
}
