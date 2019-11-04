package com.iqoption.feed.feedlist.a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.iqoption.feed.a.o;
import com.iqoption.feed.a.q;
import com.iqoption.feed.feedlist.c.a;
import com.iqoption.feed.feedlist.f;
import com.iqoption.feed.feedlist.h;
import com.iqoption.feed.i;
import com.iqoption.feed.j.b;

/* compiled from: MacroViewHolderProvider */
public class d implements f {
    private b cPj;
    private final a cQD;

    public d(b bVar, a aVar) {
        this.cPj = bVar;
        this.cQD = aVar;
    }

    public h E(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new g((q) DataBindingUtil.inflate(from, i.f.macro_video_feed, viewGroup, false), this.cPj, this.cQD);
        }
        if (i == 2) {
            return new e((q) DataBindingUtil.inflate(from, i.f.macro_video_feed, viewGroup, false), this.cQD);
        }
        if (i == 3) {
            return new a((com.iqoption.feed.a.i) DataBindingUtil.inflate(from, i.f.macro_article_feed, viewGroup, false), this.cQD);
        }
        if (i != 4) {
            return null;
        }
        return new f((o) DataBindingUtil.inflate(from, i.f.macro_tweet_feed, viewGroup, false), this.cQD);
    }
}
