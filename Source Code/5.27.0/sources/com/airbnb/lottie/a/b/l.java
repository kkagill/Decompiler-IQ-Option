package com.airbnb.lottie.a.b;

import android.graphics.Path;
import com.airbnb.lottie.d.g;
import com.airbnb.lottie.e.a;
import com.airbnb.lottie.model.content.h;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation */
public class l extends a<h, Path> {
    private final h gA = new h();
    private final Path gB = new Path();

    public l(List<a<h>> list) {
        super(list);
    }

    /* renamed from: i */
    public Path a(a<h> aVar, float f) {
        this.gA.a((h) aVar.kj, (h) aVar.kk, f);
        g.a(this.gA, this.gB);
        return this.gB;
    }
}
