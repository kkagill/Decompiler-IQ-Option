package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.o;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.m;
import com.airbnb.lottie.model.layer.a;

/* compiled from: RectangleShape */
public class f implements b {
    private final boolean fq;
    private final m<PointF, PointF> hG;
    private final com.airbnb.lottie.model.a.f hO;
    private final b ir;
    private final String name;

    public f(String str, m<PointF, PointF> mVar, com.airbnb.lottie.model.a.f fVar, b bVar, boolean z) {
        this.name = str;
        this.hG = mVar;
        this.hO = fVar;
        this.ir = bVar;
        this.fq = z;
    }

    public String getName() {
        return this.name;
    }

    public b bX() {
        return this.ir;
    }

    public com.airbnb.lottie.model.a.f bB() {
        return this.hO;
    }

    public m<PointF, PointF> bs() {
        return this.hG;
    }

    public boolean isHidden() {
        return this.fq;
    }

    public c a(g gVar, a aVar) {
        return new o(gVar, aVar, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RectangleShape{position=");
        stringBuilder.append(this.hG);
        stringBuilder.append(", size=");
        stringBuilder.append(this.hO);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
