package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.a.f;
import com.airbnb.lottie.model.a.m;

/* compiled from: CircleShape */
public class a implements b {
    private final boolean fq;
    private final m<PointF, PointF> hG;
    private final f hO;
    private final boolean hP;
    private final String name;

    public a(String str, m<PointF, PointF> mVar, f fVar, boolean z, boolean z2) {
        this.name = str;
        this.hG = mVar;
        this.hO = fVar;
        this.hP = z;
        this.fq = z2;
    }

    public c a(g gVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.a.a.f(gVar, aVar, this);
    }

    public String getName() {
        return this.name;
    }

    public m<PointF, PointF> bs() {
        return this.hG;
    }

    public f bB() {
        return this.hO;
    }

    public boolean bC() {
        return this.hP;
    }

    public boolean isHidden() {
        return this.fq;
    }
}
