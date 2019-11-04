package com.airbnb.lottie.model.content;

import android.graphics.Path.FillType;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.a.h;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.c;
import com.airbnb.lottie.model.a.f;
import com.airbnb.lottie.model.layer.a;

/* compiled from: GradientFill */
public class d implements b {
    private final boolean fq;
    private final com.airbnb.lottie.model.a.d hJ;
    private final GradientType hS;
    private final FillType hT;
    private final c hU;
    private final f hV;
    private final f hW;
    @Nullable
    private final b hX;
    @Nullable
    private final b hY;
    private final String name;

    public d(String str, GradientType gradientType, FillType fillType, c cVar, com.airbnb.lottie.model.a.d dVar, f fVar, f fVar2, b bVar, b bVar2, boolean z) {
        this.hS = gradientType;
        this.hT = fillType;
        this.hU = cVar;
        this.hJ = dVar;
        this.hV = fVar;
        this.hW = fVar2;
        this.name = str;
        this.hX = bVar;
        this.hY = bVar2;
        this.fq = z;
    }

    public String getName() {
        return this.name;
    }

    public GradientType bE() {
        return this.hS;
    }

    public FillType getFillType() {
        return this.hT;
    }

    public c bF() {
        return this.hU;
    }

    public com.airbnb.lottie.model.a.d bv() {
        return this.hJ;
    }

    public f bG() {
        return this.hV;
    }

    public f bH() {
        return this.hW;
    }

    public boolean isHidden() {
        return this.fq;
    }

    public com.airbnb.lottie.a.a.c a(g gVar, a aVar) {
        return new h(gVar, aVar, this);
    }
}
