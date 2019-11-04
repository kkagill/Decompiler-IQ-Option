package com.iqoption.feed.feedlist.b;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.iqoption.feed.a.s;
import com.iqoption.feed.feedlist.d;
import com.iqoption.feed.feedlist.g;

/* compiled from: MicroArticleViewHolder */
public class a extends c implements com.iqoption.feed.feedlist.a {
    private final com.iqoption.feed.feedlist.c.a cQD;
    private final s cRt;

    private static /* synthetic */ void aU(View view) {
    }

    a(s sVar, com.iqoption.feed.feedlist.c.a aVar) {
        super(sVar.cQs, sVar.getRoot(), aVar);
        this.cRt = sVar;
        this.cQD = aVar;
    }

    public void m(@NonNull d dVar) {
        super.m(dVar);
        com.iqoption.core.microservices.feed.response.a YQ = dVar.YQ();
        Context context = this.itemView.getContext();
        g.a(this.cRt.cQt.cPS, YQ);
        this.cRt.cQt.cPR.setOnClickListener(new -$$Lambda$a$iNt2oB33E8-pp4TurABJ61U2_X8(this, dVar));
        this.cRt.cQt.cQw.setTextSize(0, g.a(context, YQ, false));
        this.cRt.cQt.cQw.setText(g.a(context, YQ));
        this.cRt.cQb.setText(YQ.getTitle());
        this.cRt.cQe.setMaxLines(g.b(context, YQ, false));
        this.cRt.cQe.setText(YQ.getDescription());
        this.cRt.cQf.setText(DateUtils.getRelativeTimeSpanString(YQ.getDate() * 1000));
        h(this.cRt.cQs.cQv, YQ.getRating());
        this.cRt.cQs.cPM.setText(String.valueOf(YQ.adO()));
        this.cRt.cQs.getRoot().setOnClickListener(-$$Lambda$a$678wjNr9yljwY2x_q-MptvBm3b0.INSTANCE);
        this.cRt.cQg.p(dVar);
        this.cRt.cQg.setTopicClickListener(this.cQD);
        this.cRt.getRoot().setOnClickListener(new -$$Lambda$a$sC1bUEOb1v2rjIE3fMM0lmKhE8Y(this, YQ));
        a(dVar, this.cRt.cQs.cPJ, this.cRt.cQs.cQv);
        avO();
    }

    public void avN() {
        avP();
    }
}
