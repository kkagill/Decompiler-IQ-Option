package com.airbnb.lottie.model.content;

import android.graphics.Path.FillType;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.a.a;
import com.airbnb.lottie.model.a.d;

/* compiled from: ShapeFill */
public class i implements b {
    private final boolean fq;
    @Nullable
    private final a hB;
    @Nullable
    private final d hJ;
    private final FillType hT;
    private final boolean iz;
    private final String name;

    public i(String str, boolean z, FillType fillType, @Nullable a aVar, @Nullable d dVar, boolean z2) {
        this.name = str;
        this.iz = z;
        this.hT = fillType;
        this.hB = aVar;
        this.hJ = dVar;
        this.fq = z2;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public a cd() {
        return this.hB;
    }

    @Nullable
    public d bv() {
        return this.hJ;
    }

    public FillType getFillType() {
        return this.hT;
    }

    public boolean isHidden() {
        return this.fq;
    }

    public c a(g gVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.a.a.g(gVar, aVar, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeFill{color=, fillEnabled=");
        stringBuilder.append(this.iz);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
