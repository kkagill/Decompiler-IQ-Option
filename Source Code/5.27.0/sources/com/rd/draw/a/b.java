package com.rd.draw.a;

import android.graphics.Canvas;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: DrawController */
public class b {
    private com.rd.draw.data.a eHs;
    private com.rd.draw.b.a eIA;
    private a eIB;
    private com.rd.animation.b.a eIz;

    /* compiled from: DrawController */
    public interface a {
        void iU(int i);
    }

    public b(@NonNull com.rd.draw.data.a aVar) {
        this.eHs = aVar;
        this.eIA = new com.rd.draw.b.a(aVar);
    }

    public void b(@Nullable com.rd.animation.b.a aVar) {
        this.eIz = aVar;
    }

    public void setClickListener(@Nullable a aVar) {
        this.eIB = aVar;
    }

    public void d(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            o(motionEvent.getX(), motionEvent.getY());
        }
    }

    private void o(float f, float f2) {
        if (this.eIB != null) {
            int a = com.rd.b.a.a(this.eHs, f, f2);
            if (a >= 0) {
                this.eIB.iU(a);
            }
        }
    }

    public void draw(@NonNull Canvas canvas) {
        int count = this.eHs.getCount();
        for (int i = 0; i < count; i++) {
            a(canvas, i, com.rd.b.a.b(this.eHs, i), com.rd.b.a.c(this.eHs, i));
        }
    }

    private void a(@NonNull Canvas canvas, int i, int i2, int i3) {
        boolean bhS = this.eHs.bhS();
        int bhV = this.eHs.bhV();
        int bhW = this.eHs.bhW();
        int i4 = 1;
        int i5 = (bhS || !(i == bhV || i == this.eHs.bhX())) ? 0 : 1;
        if (!(bhS && (i == bhV || i == bhW))) {
            i4 = 0;
        }
        bhS = i5 | i4;
        this.eIA.v(i, i2, i3);
        if (this.eIz == null || !bhS) {
            this.eIA.a(canvas, bhS);
        } else {
            r(canvas);
        }
    }

    private void r(@NonNull Canvas canvas) {
        switch (this.eHs.bhZ()) {
            case NONE:
                this.eIA.a(canvas, true);
                return;
            case COLOR:
                this.eIA.a(canvas, this.eIz);
                return;
            case SCALE:
                this.eIA.b(canvas, this.eIz);
                return;
            case WORM:
                this.eIA.c(canvas, this.eIz);
                return;
            case SLIDE:
                this.eIA.d(canvas, this.eIz);
                return;
            case FILL:
                this.eIA.e(canvas, this.eIz);
                return;
            case THIN_WORM:
                this.eIA.f(canvas, this.eIz);
                return;
            case DROP:
                this.eIA.g(canvas, this.eIz);
                return;
            case SWAP:
                this.eIA.h(canvas, this.eIz);
                return;
            case SCALE_DOWN:
                this.eIA.i(canvas, this.eIz);
                return;
            default:
                return;
        }
    }
}
