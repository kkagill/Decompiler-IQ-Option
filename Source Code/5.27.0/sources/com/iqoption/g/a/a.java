package com.iqoption.g.a;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: OnClickListener */
public final class a implements OnClickListener {
    final a drn;
    final int dro;

    /* compiled from: OnClickListener */
    public interface a {
        void a(int i, View view);
    }

    public a(a aVar, int i) {
        this.drn = aVar;
        this.dro = i;
    }

    public void onClick(View view) {
        this.drn.a(this.dro, view);
    }
}
