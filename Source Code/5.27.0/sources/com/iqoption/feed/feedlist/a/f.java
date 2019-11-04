package com.iqoption.feed.feedlist.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.iqoption.feed.a.o;
import com.iqoption.feed.feedlist.c.a;
import com.iqoption.feed.feedlist.d;
import com.iqoption.feed.feedlist.g;
import com.squareup.picasso.Picasso;

/* compiled from: TweetMacroViewHolder */
public class f extends c {
    private final a cQD;
    private final o cRr;

    f(o oVar, a aVar) {
        super(oVar.cQc, oVar.getRoot(), aVar);
        this.cRr = oVar;
        this.cQD = aVar;
    }

    public void m(@NonNull d dVar) {
        super.m(dVar);
        com.iqoption.core.microservices.feed.response.a YQ = dVar.YQ();
        g.a(this.cRr.cQd.cPS, YQ);
        String adH = YQ.adH();
        Context context = this.itemView.getContext();
        if (TextUtils.isEmpty(adH)) {
            this.cRr.cQl.setImageBitmap(null);
            Picasso.with(context).cancelRequest(this.cRr.cQl);
            this.cRr.cQl.setVisibility(8);
        } else {
            this.cRr.cQl.setVisibility(0);
            Picasso.with(context).load(adH).transform(new com.iqoption.core.ui.picasso.a()).into(this.cRr.cQl);
        }
        this.cRr.cQd.cPT.setTextSize(0, g.a(context, YQ, true));
        this.cRr.cQd.cPT.setText(g.a(context, YQ));
        this.cRr.cQd.cPR.setOnClickListener(new -$$Lambda$f$IpCde0FQkm4-PY2OunwfL_NIQsU(this, dVar));
        this.cRr.aRe.setText(YQ.adJ());
        this.cRr.cQk.setText(YQ.getDescription());
        this.cRr.cQf.setText(DateUtils.getRelativeTimeSpanString(YQ.getDate() * 1000));
        h(this.cRr.cQc.cPK, YQ.getRating());
        this.cRr.cQc.cPM.setText(String.valueOf(YQ.adO()));
        this.cRr.cQg.p(dVar);
        this.cRr.cQg.setTopicClickListener(this.cQD);
        this.cRr.getRoot().setOnClickListener(new -$$Lambda$f$YiMMUnF04-_RGih_dJoUN_yzFpI(this, YQ));
        a(dVar, this.cRr.cQc.cPJ, this.cRr.cQc.cPK);
        avO();
    }

    private /* synthetic */ void b(d dVar, View view) {
        this.cQD.a(view, dVar);
    }

    private /* synthetic */ void a(com.iqoption.core.microservices.feed.response.a aVar, View view) {
        this.cQD.e(aVar);
    }
}
