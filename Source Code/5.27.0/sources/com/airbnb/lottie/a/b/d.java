package com.airbnb.lottie.a.b;

import com.airbnb.lottie.e.a;
import com.airbnb.lottie.model.content.c;
import java.util.List;

/* compiled from: GradientColorKeyframeAnimation */
public class d extends f<c> {
    private final c gq;

    public d(List<a<c>> list) {
        super(list);
        int i = 0;
        c cVar = (c) ((a) list.get(0)).kj;
        if (cVar != null) {
            i = cVar.getSize();
        }
        this.gq = new c(new float[i], new int[i]);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: f */
    public c a(a<c> aVar, float f) {
        this.gq.a((c) aVar.kj, (c) aVar.kk, f);
        return this.gq;
    }
}
