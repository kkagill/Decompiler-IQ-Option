package com.google.android.material.i;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* compiled from: ShapePath */
public class d {
    public float Mh;
    public float Mi;
    public float Mj;
    public float Mk;
    private final List<c> Ml;

    /* compiled from: ShapePath */
    public static abstract class c {
        protected final Matrix matrix = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath */
    public static class a extends c {
        private static final RectF jw = new RectF();
        public float Mm;
        public float Mn;
        public float bottom;
        public float left;
        public float right;
        public float top;

        public a(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            jw.set(this.left, this.top, this.right, this.bottom);
            path.arcTo(jw, this.Mm, this.Mn, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static class b extends c {
        private float x;
        private float y;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.x, this.y);
            path.transform(matrix);
        }
    }

    public void j(float f, float f2) {
        this.Mh = f;
        this.Mi = f2;
        this.Mj = f;
        this.Mk = f2;
        this.Ml.clear();
    }

    public void lineTo(float f, float f2) {
        b bVar = new b();
        bVar.x = f;
        bVar.y = f2;
        this.Ml.add(bVar);
        this.Mj = f;
        this.Mk = f2;
    }

    public void addArc(float f, float f2, float f3, float f4, float f5, float f6) {
        a aVar = new a(f, f2, f3, f4);
        aVar.Mm = f5;
        aVar.Mn = f6;
        this.Ml.add(aVar);
        double d = (double) (f5 + f6);
        this.Mj = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.Mk = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }

    public void a(Matrix matrix, Path path) {
        int size = this.Ml.size();
        for (int i = 0; i < size; i++) {
            ((c) this.Ml.get(i)).a(matrix, path);
        }
    }
}
