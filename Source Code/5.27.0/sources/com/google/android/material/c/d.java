package com.google.android.material.c;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* compiled from: CircularRevealWidget */
public interface d extends a {

    /* compiled from: CircularRevealWidget */
    public static class a implements TypeEvaluator<d> {
        public static final TypeEvaluator<d> Ia = new a();
        private final d HW = new d();

        /* renamed from: a */
        public d evaluate(float f, d dVar, d dVar2) {
            this.HW.d(com.google.android.material.e.a.lerp(dVar.centerX, dVar2.centerX, f), com.google.android.material.e.a.lerp(dVar.centerY, dVar2.centerY, f), com.google.android.material.e.a.lerp(dVar.radius, dVar2.radius, f));
            return this.HW;
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class b extends Property<d, d> {
        public static final Property<d, d> Ib = new b("circularReveal");

        private b(String str) {
            super(d.class, str);
        }

        /* renamed from: b */
        public d get(d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(d dVar, d dVar2) {
            dVar.setRevealInfo(dVar2);
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class c extends Property<d, Integer> {
        public static final Property<d, Integer> Ic = new c("circularRevealScrimColor");

        private c(String str) {
            super(Integer.class, str);
        }

        /* renamed from: c */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class d {
        public float centerX;
        public float centerY;
        public float radius;

        private d() {
        }

        public d(float f, float f2, float f3) {
            this.centerX = f;
            this.centerY = f2;
            this.radius = f3;
        }

        public d(d dVar) {
            this(dVar.centerX, dVar.centerY, dVar.radius);
        }

        public void d(float f, float f2, float f3) {
            this.centerX = f;
            this.centerY = f2;
            this.radius = f3;
        }

        public void b(d dVar) {
            d(dVar.centerX, dVar.centerY, dVar.radius);
        }

        public boolean isInvalid() {
            return this.radius == Float.MAX_VALUE;
        }
    }

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    d getRevealInfo();

    void nj();

    void nk();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@ColorInt int i);

    void setRevealInfo(@Nullable d dVar);
}
