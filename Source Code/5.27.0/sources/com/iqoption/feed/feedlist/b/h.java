package com.iqoption.feed.feedlist.b;

import androidx.annotation.NonNull;
import com.iqoption.feed.a.y;
import com.iqoption.feed.feedlist.c.a;
import com.iqoption.feed.feedlist.d;
import com.iqoption.feed.feedlist.j;
import com.iqoption.feed.feedlist.k;
import com.iqoption.feed.j.b;

/* compiled from: YouTubeMicroViewHolder */
public class h extends f implements j {
    private final k cRs;

    h(y yVar, b bVar, a aVar) {
        super(yVar, aVar);
        this.cRs = new k(yVar.cQy, bVar);
    }

    public void m(@NonNull d dVar) {
        super.m(dVar);
        this.cRs.g(dVar.YQ());
    }

    public void recycle() {
        super.recycle();
        awg();
    }

    public void awf() {
        this.cRs.awf();
    }

    public void awg() {
        this.cRs.awg();
    }
}
