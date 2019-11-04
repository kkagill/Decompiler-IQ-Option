package com.iqoption.kyc.fragment.b;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import java.util.List;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$c$sf69tuoxfKdRL7svWvgVQoOJX9o implements Observer {
    private final /* synthetic */ c f$0;
    private final /* synthetic */ LayoutInflater f$1;
    private final /* synthetic */ ViewGroup f$2;

    public /* synthetic */ -$$Lambda$c$sf69tuoxfKdRL7svWvgVQoOJX9o(c cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f$0 = cVar;
        this.f$1 = layoutInflater;
        this.f$2 = viewGroup;
    }

    public final void onChanged(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (List) obj);
    }
}
