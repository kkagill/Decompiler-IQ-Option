package com.iqoption.feed.feedlist.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.iqoption.core.microservices.feed.response.FeedPriority;
import com.iqoption.feed.a.u;
import com.iqoption.feed.feedlist.b;
import com.iqoption.feed.feedlist.c.a;

/* compiled from: MicroContentViewHolder */
public abstract class c extends b {
    private final u cRu;

    c(u uVar, View view, a aVar) {
        super(view, aVar);
        this.cRu = uVar;
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public ViewGroup avT() {
        return this.cRu.cQu;
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public TextView avU() {
        return this.cRu.cPI;
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public TextView avV() {
        return this.cRu.cPL;
    }

    public boolean Ng() {
        if (this.cQE != null) {
            if (com.iqoption.core.ext.c.b(this.cQE.YQ().adL(), FeedPriority.PROMOTED, FeedPriority.BREAKING_NEWS)) {
                return false;
            }
        }
        return true;
    }
}
