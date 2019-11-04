package com.airbnb.lottie.model.content;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.layer.a;

public class ShapeTrimPath implements b {
    private final boolean fq;
    private final Type gc;
    private final b iE;
    private final b iF;
    private final b iu;
    private final String name;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown trim path type ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public ShapeTrimPath(String str, Type type, b bVar, b bVar2, b bVar3, boolean z) {
        this.name = str;
        this.gc = type;
        this.iE = bVar;
        this.iF = bVar2;
        this.iu = bVar3;
        this.fq = z;
    }

    public String getName() {
        return this.name;
    }

    public Type aK() {
        return this.gc;
    }

    public b cf() {
        return this.iF;
    }

    public b cg() {
        return this.iE;
    }

    public b bZ() {
        return this.iu;
    }

    public boolean isHidden() {
        return this.fq;
    }

    public c a(g gVar, a aVar) {
        return new s(aVar, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trim Path: {start: ");
        stringBuilder.append(this.iE);
        stringBuilder.append(", end: ");
        stringBuilder.append(this.iF);
        stringBuilder.append(", offset: ");
        stringBuilder.append(this.iu);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
