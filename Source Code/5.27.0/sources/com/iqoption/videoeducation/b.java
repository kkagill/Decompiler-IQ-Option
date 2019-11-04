package com.iqoption.videoeducation;

import com.iqoption.util.m;

/* compiled from: SearchDebouncer */
public class b extends m {
    private final a ecl;
    private CharSequence ecm;
    private final m ecn = new m(new Runnable() {
        public void run() {
            b.this.ecl.onPerformSearch(b.this.ecm);
        }
    });

    /* compiled from: SearchDebouncer */
    public interface a {
        void onPerformSearch(CharSequence charSequence);
    }

    public b(a aVar) {
        super(null);
        this.ecl = aVar;
    }

    public void cp(long j) {
        this.ecn.cp(j);
    }

    public void a(CharSequence charSequence, long j) {
        this.ecm = charSequence;
        cp(j);
    }
}
