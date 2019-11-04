package com.iqoption.feed.feedlist.b;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.iqoption.feed.a.ac;
import com.iqoption.feed.a.s;
import com.iqoption.feed.a.y;
import com.iqoption.feed.feedlist.c.a;
import com.iqoption.feed.feedlist.f;
import com.iqoption.feed.feedlist.h;
import com.iqoption.feed.i;
import com.iqoption.feed.j.b;

/* compiled from: MicroViewHolderProvider */
public class e implements f {
    private final b cPj;
    private final a cQD;

    public e(b bVar, a aVar) {
        this.cPj = bVar;
        this.cQD = aVar;
    }

    public h E(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new h((y) DataBindingUtil.inflate(from, i.f.micro_other_video_feed, viewGroup, false), this.cPj, this.cQD);
        }
        if (i == 2) {
            return new f((y) DataBindingUtil.inflate(from, i.f.micro_other_video_feed, viewGroup, false), this.cQD);
        }
        if (i == 3) {
            return new a((s) DataBindingUtil.inflate(from, i.f.micro_article_feed, viewGroup, false), this.cQD);
        }
        if (i != 4) {
            return null;
        }
        return new g((ac) DataBindingUtil.inflate(from, i.f.micro_tweet_feed, viewGroup, false), this.cQD);
    }
}
