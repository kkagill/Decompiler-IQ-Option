package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.n;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.m;
import com.airbnb.lottie.model.layer.a;

public class PolystarShape implements b {
    private final Type fN;
    private final boolean fq;
    private final m<PointF, PointF> hG;
    private final b hI;
    private final b ik;
    private final b il;
    private final b im;
    private final b io;
    private final b ip;
    private final String name;

    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, b bVar, m<PointF, PointF> mVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, boolean z) {
        this.name = str;
        this.fN = type;
        this.ik = bVar;
        this.hG = mVar;
        this.hI = bVar2;
        this.il = bVar3;
        this.im = bVar4;
        this.io = bVar5;
        this.ip = bVar6;
        this.fq = z;
    }

    public String getName() {
        return this.name;
    }

    public Type bR() {
        return this.fN;
    }

    public b bS() {
        return this.ik;
    }

    public m<PointF, PointF> bs() {
        return this.hG;
    }

    public b bu() {
        return this.hI;
    }

    public b bT() {
        return this.il;
    }

    public b bU() {
        return this.im;
    }

    public b bV() {
        return this.io;
    }

    public b bW() {
        return this.ip;
    }

    public boolean isHidden() {
        return this.fq;
    }

    public c a(g gVar, a aVar) {
        return new n(gVar, aVar, this);
    }
}
