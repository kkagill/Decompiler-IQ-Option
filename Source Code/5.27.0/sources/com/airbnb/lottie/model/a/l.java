package com.airbnb.lottie.model.a;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.b;
import com.airbnb.lottie.model.layer.a;

/* compiled from: AnimatableTransform */
public class l implements b {
    @Nullable
    private final e hF;
    @Nullable
    private final m<PointF, PointF> hG;
    @Nullable
    private final g hH;
    @Nullable
    private final b hI;
    @Nullable
    private final d hJ;
    @Nullable
    private final b hK;
    @Nullable
    private final b hL;
    @Nullable
    private final b hM;
    @Nullable
    private final b hN;

    @Nullable
    public c a(g gVar, a aVar) {
        return null;
    }

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public l(@Nullable e eVar, @Nullable m<PointF, PointF> mVar, @Nullable g gVar, @Nullable b bVar, @Nullable d dVar, @Nullable b bVar2, @Nullable b bVar3, @Nullable b bVar4, @Nullable b bVar5) {
        this.hF = eVar;
        this.hG = mVar;
        this.hH = gVar;
        this.hI = bVar;
        this.hJ = dVar;
        this.hM = bVar2;
        this.hN = bVar3;
        this.hK = bVar4;
        this.hL = bVar5;
    }

    @Nullable
    public e br() {
        return this.hF;
    }

    @Nullable
    public m<PointF, PointF> bs() {
        return this.hG;
    }

    @Nullable
    public g bt() {
        return this.hH;
    }

    @Nullable
    public b bu() {
        return this.hI;
    }

    @Nullable
    public d bv() {
        return this.hJ;
    }

    @Nullable
    public b bw() {
        return this.hM;
    }

    @Nullable
    public b bx() {
        return this.hN;
    }

    @Nullable
    public b by() {
        return this.hK;
    }

    @Nullable
    public b bz() {
        return this.hL;
    }

    public o bA() {
        return new o(this);
    }
}
