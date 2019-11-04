package com.airbnb.lottie.model.content;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.d;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.layer.a;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup */
public class j implements b {
    private final boolean fq;
    private final List<b> iA;
    private final String name;

    public j(String str, List<b> list, boolean z) {
        this.name = str;
        this.iA = list;
        this.fq = z;
    }

    public String getName() {
        return this.name;
    }

    public List<b> getItems() {
        return this.iA;
    }

    public boolean isHidden() {
        return this.fq;
    }

    public c a(g gVar, a aVar) {
        return new d(gVar, aVar, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeGroup{name='");
        stringBuilder.append(this.name);
        stringBuilder.append("' Shapes: ");
        stringBuilder.append(Arrays.toString(this.iA.toArray()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
