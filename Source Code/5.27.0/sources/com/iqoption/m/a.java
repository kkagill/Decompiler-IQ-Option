package com.iqoption.m;

import android.util.Pair;
import com.google.common.util.concurrent.t;
import com.iqoption.core.connect.f;
import com.iqoption.core.connect.m;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.service.websocket.a.b;
import io.reactivex.e;
import java.util.Set;

/* compiled from: IqSocket */
public interface a extends f {
    boolean DR();

    String Xd();

    e<m> aTz();

    void azk();

    boolean c(b bVar);

    t<Object> cj(Object obj);

    boolean jH(String str);

    void l(Set<Pair<Integer, Integer>> set);

    void m(Set<Pair<Integer, InstrumentType>> set);

    boolean n(Object obj, int i);
}
