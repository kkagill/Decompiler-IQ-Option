package com.iqoption.fragment;

import android.widget.ImageView;
import androidx.lifecycle.Observer;
import com.iqoption.core.microservices.useralerts.response.a;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ah$QHwrJ5tkxz9xsk5FlA99WlZkIWk implements Observer {
    private final /* synthetic */ ImageView f$0;

    public /* synthetic */ -$$Lambda$ah$QHwrJ5tkxz9xsk5FlA99WlZkIWk(ImageView imageView) {
        this.f$0 = imageView;
    }

    public final void onChanged(Object obj) {
        ah.a(this.f$0, (a) obj);
    }
}
