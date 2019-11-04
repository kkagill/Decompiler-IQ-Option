package com.iqoption.feed.feedlist.b;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import com.iqoption.core.microservices.feed.MediaType;
import com.iqoption.feed.a.y;
import com.iqoption.feed.feedlist.a;
import com.iqoption.feed.feedlist.c;
import com.iqoption.feed.feedlist.d;
import com.iqoption.feed.feedlist.g;
import com.iqoption.feed.fetching.a.b;

/* compiled from: OtherMicroVideoViewHolder */
public class f extends c implements a {
    private final c.a cQD;
    private final com.iqoption.feed.fetching.a.c<b> cRm = new com.iqoption.feed.fetching.a.c<b>() {
        public void onStart() {
            f.this.cRv.cQq.setImageBitmap(null);
        }

        public void a(b bVar, MediaType mediaType) {
            f.this.cRv.cQq.setImageBitmap(bVar.getBitmap());
        }

        public void onError() {
            f.this.cRv.cQq.setImageBitmap(null);
        }
    };
    private final y cRv;

    private static /* synthetic */ void aU(View view) {
    }

    f(y yVar, c.a aVar) {
        super(yVar.cQs, yVar.getRoot(), aVar);
        this.cRv = yVar;
        this.cQD = aVar;
    }

    public void m(d dVar) {
        super.m(dVar);
        com.iqoption.core.microservices.feed.d YQ = dVar.YQ();
        Context context = this.itemView.getContext();
        g.a(this.cRv.cQt.cPS, (com.iqoption.core.microservices.feed.response.a) YQ);
        this.cRv.cQt.cQw.setTextSize(0, g.a(context, YQ, false));
        this.cRv.cQt.cQw.setText(g.a(context, (com.iqoption.core.microservices.feed.response.a) YQ));
        if (TextUtils.isEmpty(YQ.getTitle())) {
            this.cRv.cQz.setText("");
            this.cRv.cQz.setVisibility(8);
        } else {
            this.cRv.cQz.setText(YQ.getTitle());
            this.cRv.cQz.setVisibility(0);
        }
        this.cRv.cQt.cPR.setOnClickListener(new -$$Lambda$f$8in9SHDH958-ytz6NeUsabRgDNE(this, dVar));
        this.cRv.cQf.setText(DateUtils.getRelativeTimeSpanString(YQ.getDate() * 1000));
        h(this.cRv.cQs.cQv, YQ.getRating());
        this.cRv.cQs.cPM.setText(String.valueOf(YQ.adO()));
        this.cRv.cQs.getRoot().setOnClickListener(-$$Lambda$f$uG_85kHoN1gQQUDI9NoTH6HYfds.INSTANCE);
        this.cRv.cQg.p(dVar);
        this.cRv.cQg.setTopicClickListener(this.cQD);
        this.cRv.cQq.setOnClickListener(new -$$Lambda$f$y5anypywJAvrxFz5zLvrhVKCIXw(this, YQ));
        com.iqoption.feed.fetching.a.cRJ.a(YQ, this.cRm);
        a(dVar, this.cRv.cQs.cPJ, this.cRv.cQs.cQv);
        avO();
    }

    public void recycle() {
        com.iqoption.feed.fetching.a.cRJ.a(this.cRm);
    }

    public void avN() {
        avP();
    }
}
