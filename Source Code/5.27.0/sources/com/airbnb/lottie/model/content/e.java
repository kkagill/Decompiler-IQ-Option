package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.a.a.i;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.c;
import com.airbnb.lottie.model.a.d;
import com.airbnb.lottie.model.a.f;
import com.airbnb.lottie.model.content.ShapeStroke.LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke.LineJoinType;
import com.airbnb.lottie.model.layer.a;
import java.util.List;

/* compiled from: GradientStroke */
public class e implements b {
    private final boolean fq;
    private final d hJ;
    private final GradientType hS;
    private final c hU;
    private final f hV;
    private final f hW;
    private final b hZ;
    private final LineCapType ia;
    private final LineJoinType ib;
    private final float ic;
    private final List<b> ie;
    @Nullable
    /* renamed from: if */
    private final b f27if;
    private final String name;

    public e(String str, GradientType gradientType, c cVar, d dVar, f fVar, f fVar2, b bVar, LineCapType lineCapType, LineJoinType lineJoinType, float f, List<b> list, @Nullable b bVar2, boolean z) {
        this.name = str;
        this.hS = gradientType;
        this.hU = cVar;
        this.hJ = dVar;
        this.hV = fVar;
        this.hW = fVar2;
        this.hZ = bVar;
        this.ia = lineCapType;
        this.ib = lineJoinType;
        this.ic = f;
        this.ie = list;
        this.f27if = bVar2;
        this.fq = z;
    }

    public String getName() {
        return this.name;
    }

    public GradientType bE() {
        return this.hS;
    }

    public c bF() {
        return this.hU;
    }

    public d bv() {
        return this.hJ;
    }

    public f bG() {
        return this.hV;
    }

    public f bH() {
        return this.hW;
    }

    public b bI() {
        return this.hZ;
    }

    public LineCapType bJ() {
        return this.ia;
    }

    public LineJoinType bK() {
        return this.ib;
    }

    public List<b> bL() {
        return this.ie;
    }

    @Nullable
    public b bM() {
        return this.f27if;
    }

    public float bN() {
        return this.ic;
    }

    public boolean isHidden() {
        return this.fq;
    }

    public com.airbnb.lottie.a.a.c a(g gVar, a aVar) {
        return new i(gVar, aVar, this);
    }
}
