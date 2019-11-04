package com.iqoption.feed.feedlist.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.iqoption.core.microservices.feed.MediaType;
import com.iqoption.feed.a.i;
import com.iqoption.feed.feedlist.d;
import com.iqoption.feed.feedlist.g;
import com.iqoption.feed.fetching.a.b;
import com.iqoption.feed.fetching.a.c;

/* compiled from: MacroArticleViewHolder */
public class a extends c {
    private final com.iqoption.feed.feedlist.c.a cQD;
    private final i cRl;
    private final c<b> cRm = new c<b>() {
        public void onStart() {
            a.this.cRl.cQa.setImageBitmap(null);
            a.this.cRl.cQa.setVisibility(8);
        }

        public void a(b bVar, MediaType mediaType) {
            a.this.cRl.cQa.setImageBitmap(bVar.getBitmap());
            a.this.cRl.cQa.setVisibility(0);
        }

        public void onError() {
            onStart();
        }
    };

    a(i iVar, com.iqoption.feed.feedlist.c.a aVar) {
        super(iVar.cQc, iVar.getRoot(), aVar);
        this.cRl = iVar;
        this.cQD = aVar;
    }

    public void m(@NonNull d dVar) {
        super.m(dVar);
        com.iqoption.core.microservices.feed.d YQ = dVar.YQ();
        Context context = this.itemView.getContext();
        g.a(this.cRl.cQd.cPS, (com.iqoption.core.microservices.feed.response.a) YQ);
        this.cRl.cQd.cPR.setOnClickListener(new -$$Lambda$a$Mpr3QnyRJ9HIYt_ZAVTlxnYJGxU(this, dVar));
        this.cRl.cQd.cPT.setTextSize(0, g.a(context, YQ, true));
        this.cRl.cQd.cPT.setText(g.a(context, (com.iqoption.core.microservices.feed.response.a) YQ));
        this.cRl.cQb.setText(YQ.getTitle());
        this.cRl.cQe.setMaxLines(g.b(context, YQ, true));
        this.cRl.cQe.setText(YQ.getDescription());
        this.cRl.cQf.setText(DateUtils.getRelativeTimeSpanString(YQ.getDate() * 1000));
        h(this.cRl.cQc.cPK, YQ.getRating());
        this.cRl.cQc.cPM.setText(String.valueOf(YQ.adO()));
        this.cRl.cQg.p(dVar);
        this.cRl.cQg.setTopicClickListener(this.cQD);
        if (!(TextUtils.isEmpty(YQ.adC()) && TextUtils.isEmpty(YQ.adD())) && YQ.adF()) {
            com.iqoption.feed.fetching.a.cRJ.a(YQ, this.cRm);
        } else {
            this.cRm.onError();
            com.iqoption.feed.fetching.a.cRJ.a(this.cRm);
        }
        this.cRl.getRoot().setOnClickListener(new -$$Lambda$a$YmTwJ-2-KT4_lRY38yTruVoNSvs(this, YQ));
        a(dVar, this.cRl.cQc.cPJ, this.cRl.cQc.cPK);
        avO();
    }

    private /* synthetic */ void b(d dVar, View view) {
        this.cQD.a(view, dVar);
    }

    private /* synthetic */ void a(com.iqoption.core.microservices.feed.response.a aVar, View view) {
        this.cQD.e(aVar);
    }

    public void recycle() {
        com.iqoption.feed.fetching.a.cRJ.a(this.cRm);
        this.cRm.onStart();
    }
}
