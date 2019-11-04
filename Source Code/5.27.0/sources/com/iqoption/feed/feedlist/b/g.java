package com.iqoption.feed.feedlist.b;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.iqoption.feed.a.ac;
import com.iqoption.feed.feedlist.a;
import com.iqoption.feed.feedlist.c;
import com.iqoption.feed.feedlist.d;

/* compiled from: TweetMicroViewHolder */
public class g extends c implements a {
    private final c.a cQD;
    private final ac cRx;

    private static /* synthetic */ void aU(View view) {
    }

    g(ac acVar, c.a aVar) {
        super(acVar.cQs, acVar.getRoot(), aVar);
        this.cRx = acVar;
        this.cQD = aVar;
    }

    public void m(@NonNull d dVar) {
        super.m(dVar);
        com.iqoption.core.microservices.feed.response.a YQ = dVar.YQ();
        Context context = this.itemView.getContext();
        com.iqoption.feed.feedlist.g.a(this.cRx.cQt.cPS, YQ);
        this.cRx.cQt.cPR.setOnClickListener(new -$$Lambda$g$ZczniUzwWahKD1_zzQj-NqA2mfw(this, dVar));
        this.cRx.cQt.cQw.setTextSize(0, com.iqoption.feed.feedlist.g.a(context, YQ, false));
        this.cRx.cQt.cQw.setText(com.iqoption.feed.feedlist.g.a(context, YQ));
        this.cRx.aRe.setText(YQ.adJ());
        this.cRx.cQe.setText(YQ.getDescription());
        this.cRx.cQf.setText(DateUtils.getRelativeTimeSpanString(YQ.getDate() * 1000));
        h(this.cRx.cQs.cQv, YQ.getRating());
        this.cRx.cQs.cPM.setText(String.valueOf(YQ.adO()));
        this.cRx.cQs.getRoot().setOnClickListener(-$$Lambda$g$ZAfrll6QU1I8fWn9gd9nfSTOXDQ.INSTANCE);
        this.cRx.cQg.p(dVar);
        this.cRx.cQg.setTopicClickListener(this.cQD);
        this.cRx.getRoot().setOnClickListener(new -$$Lambda$g$nVRRdFLQB_G9DKW_WJg2cKzwaak(this, YQ));
        a(dVar, this.cRx.cQs.cPJ, this.cRx.cQs.cQv);
        avO();
    }

    public void avN() {
        avP();
    }
}
