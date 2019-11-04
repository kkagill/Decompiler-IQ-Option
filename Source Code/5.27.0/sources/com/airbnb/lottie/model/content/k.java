package com.airbnb.lottie.model.content;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.q;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.a.h;
import com.airbnb.lottie.model.layer.a;

/* compiled from: ShapePath */
public class k implements b {
    private final boolean fq;
    private final h iB;
    private final int index;
    private final String name;

    public k(String str, int i, h hVar, boolean z) {
        this.name = str;
        this.index = i;
        this.iB = hVar;
        this.fq = z;
    }

    public String getName() {
        return this.name;
    }

    public h ce() {
        return this.iB;
    }

    public c a(g gVar, a aVar) {
        return new q(gVar, aVar, this);
    }

    public boolean isHidden() {
        return this.fq;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapePath{name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", index=");
        stringBuilder.append(this.index);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
