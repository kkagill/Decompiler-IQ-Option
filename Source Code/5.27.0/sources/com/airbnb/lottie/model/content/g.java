package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.p;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.l;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Repeater */
public class g implements b {
    private final boolean fq;
    private final b is;
    private final b iu;
    private final l iw;
    private final String name;

    public g(String str, b bVar, b bVar2, l lVar, boolean z) {
        this.name = str;
        this.is = bVar;
        this.iu = bVar2;
        this.iw = lVar;
        this.fq = z;
    }

    public String getName() {
        return this.name;
    }

    public b bY() {
        return this.is;
    }

    public b bZ() {
        return this.iu;
    }

    public l ca() {
        return this.iw;
    }

    public boolean isHidden() {
        return this.fq;
    }

    @Nullable
    public c a(com.airbnb.lottie.g gVar, a aVar) {
        return new p(gVar, aVar, this);
    }
}
