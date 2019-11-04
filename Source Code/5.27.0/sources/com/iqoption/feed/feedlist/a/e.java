package com.iqoption.feed.feedlist.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.iqoption.core.microservices.feed.MediaType;
import com.iqoption.feed.a.q;
import com.iqoption.feed.feedlist.c.a;
import com.iqoption.feed.feedlist.d;
import com.iqoption.feed.feedlist.g;
import com.iqoption.feed.fetching.a.b;
import com.iqoption.feed.fetching.a.c;

/* compiled from: OtherMacroVideoViewHolder */
public class e extends c {
    private final a cQD;
    private final c<b> cRm = new c<b>() {
        public void onStart() {
            e.this.cRp.cQq.setImageBitmap(null);
        }

        public void a(b bVar, MediaType mediaType) {
            e.this.cRp.cQq.setImageBitmap(bVar.getBitmap());
        }

        public void onError() {
            e.this.cRp.cQq.setImageBitmap(null);
        }
    };
    private final q cRp;

    e(q qVar, a aVar) {
        super(qVar.cQc, qVar.getRoot(), aVar);
        this.cRp = qVar;
        this.cQD = aVar;
    }

    public void m(@NonNull d dVar) {
        super.m(dVar);
        com.iqoption.core.microservices.feed.d YQ = dVar.YQ();
        Context context = this.itemView.getContext();
        g.a(this.cRp.cQd.cPS, (com.iqoption.core.microservices.feed.response.a) YQ);
        this.cRp.cQd.cPT.setTextSize(0, g.a(context, YQ, true));
        this.cRp.cQd.cPT.setText(g.a(context, (com.iqoption.core.microservices.feed.response.a) YQ));
        if (TextUtils.isEmpty(YQ.getTitle())) {
            this.cRp.cQr.setVisibility(8);
        } else {
            this.cRp.cQr.setText(YQ.getTitle());
            this.cRp.cQr.setVisibility(0);
        }
        this.cRp.cQd.cPR.setOnClickListener(new -$$Lambda$e$HMv6HWqV2wzgoi-sdtBIJp1Cgyg(this, dVar));
        this.cRp.cQm.setVisibility(8);
        this.cRp.cQf.setText(DateUtils.getRelativeTimeSpanString(YQ.getDate() * 1000));
        this.cRp.cQg.p(dVar);
        this.cRp.cQg.setTopicClickListener(this.cQD);
        this.cRp.cQc.cPM.setText(String.valueOf(YQ.adO()));
        h(this.cRp.cQc.cPK, YQ.getRating());
        this.cRp.cQq.setOnClickListener(new -$$Lambda$e$PzeoNB9zFPCGVtxr5rseCcnM4rI(this, YQ));
        com.iqoption.feed.fetching.a.cRJ.a(YQ, this.cRm);
        a(dVar, this.cRp.cQc.cPJ, this.cRp.cQc.cPK);
        avO();
    }

    private /* synthetic */ void b(d dVar, View view) {
        this.cQD.a(view, dVar);
    }

    private /* synthetic */ void a(com.iqoption.core.microservices.feed.response.a aVar, View view) {
        this.cQD.e(aVar);
    }

    public void recycle() {
        this.cRp.cQq.setImageBitmap(null);
        com.iqoption.feed.fetching.a.cRJ.a(this.cRm);
    }
}
