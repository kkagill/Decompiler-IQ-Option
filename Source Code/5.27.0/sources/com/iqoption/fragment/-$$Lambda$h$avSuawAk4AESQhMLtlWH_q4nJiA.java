package com.iqoption.fragment;

import androidx.fragment.app.FragmentManager;
import com.iqoption.core.data.model.InstrumentType;
import java.util.ArrayList;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$h$avSuawAk4AESQhMLtlWH_q4nJiA implements Runnable {
    private final /* synthetic */ FragmentManager f$0;
    private final /* synthetic */ int f$1;
    private final /* synthetic */ InstrumentType f$2;
    private final /* synthetic */ ArrayList f$3;

    public /* synthetic */ -$$Lambda$h$avSuawAk4AESQhMLtlWH_q4nJiA(FragmentManager fragmentManager, int i, InstrumentType instrumentType, ArrayList arrayList) {
        this.f$0 = fragmentManager;
        this.f$1 = i;
        this.f$2 = instrumentType;
        this.f$3 = arrayList;
    }

    public final void run() {
        h.a(this.f$0, this.f$1, this.f$2, this.f$3);
    }
}
