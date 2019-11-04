package com.iqoption.feed.feedlist.a;

import androidx.annotation.NonNull;
import com.iqoption.feed.a.q;
import com.iqoption.feed.feedlist.c.a;
import com.iqoption.feed.feedlist.d;
import com.iqoption.feed.feedlist.j;
import com.iqoption.feed.feedlist.k;
import com.iqoption.feed.j.b;

/* compiled from: YouTubeMacroVideoViewHolder */
public class g extends e implements j {
    private final k cRs;

    g(q qVar, b bVar, a aVar) {
        super(qVar, aVar);
        this.cRs = new k(qVar.cQo, bVar);
    }

    public void m(@NonNull d dVar) {
        super.m(dVar);
        this.cRs.g(dVar.YQ());
    }

    public void recycle() {
        super.recycle();
        this.cRs.awg();
    }

    public void awf() {
        this.cRs.awf();
    }

    public void awg() {
        this.cRs.awg();
    }
}
