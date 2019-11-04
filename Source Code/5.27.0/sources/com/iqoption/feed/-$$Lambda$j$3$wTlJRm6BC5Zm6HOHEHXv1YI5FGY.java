package com.iqoption.feed;

import androidx.lifecycle.Observer;
import com.iqoption.feed.feedlist.d;
import com.iqoption.feed.j.AnonymousClass3;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$j$3$wTlJRm6BC5Zm6HOHEHXv1YI5FGY implements Observer {
    private final /* synthetic */ AnonymousClass3 f$0;
    private final /* synthetic */ d f$1;

    public /* synthetic */ -$$Lambda$j$3$wTlJRm6BC5Zm6HOHEHXv1YI5FGY(AnonymousClass3 anonymousClass3, d dVar) {
        this.f$0 = anonymousClass3;
        this.f$1 = dVar;
    }

    public final void onChanged(Object obj) {
        this.f$0.a(this.f$1, (com.iqoption.core.ui.d) obj);
    }
}
