package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.b.a.a;
import com.airbnb.lottie.a.b.c;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.content.f;
import com.airbnb.lottie.model.d;
import java.util.List;

/* compiled from: RectangleContent */
public class o implements k, m, a {
    private final g cW;
    private final com.airbnb.lottie.a.b.a<?, Float> fV;
    private final Path fb = new Path();
    private final RectF fd = new RectF();
    private final boolean fq;
    private final com.airbnb.lottie.a.b.a<?, PointF> ft;
    private final com.airbnb.lottie.a.b.a<?, PointF> fu;
    private b fw = new b();
    private boolean fy;
    private final String name;

    public o(g gVar, com.airbnb.lottie.model.layer.a aVar, f fVar) {
        this.name = fVar.getName();
        this.fq = fVar.isHidden();
        this.cW = gVar;
        this.fu = fVar.bs().bn();
        this.ft = fVar.bB().bn();
        this.fV = fVar.bX().bn();
        aVar.a(this.fu);
        aVar.a(this.ft);
        aVar.a(this.fV);
        this.fu.b(this);
        this.ft.b(this);
        this.fV.b(this);
    }

    public String getName() {
        return this.name;
    }

    public void aB() {
        invalidate();
    }

    private void invalidate() {
        this.fy = false;
        this.cW.invalidateSelf();
    }

    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = (c) list.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.aK() == Type.SIMULTANEOUSLY) {
                    this.fw.a(sVar);
                    sVar.a(this);
                }
            }
        }
    }

    public Path getPath() {
        if (this.fy) {
            return this.fb;
        }
        this.fb.reset();
        if (this.fq) {
            this.fy = true;
            return this.fb;
        }
        float f;
        PointF pointF = (PointF) this.ft.getValue();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        com.airbnb.lottie.a.b.a aVar = this.fV;
        if (aVar == null) {
            f = 0.0f;
        } else {
            f = ((c) aVar).aU();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF pointF2 = (PointF) this.fu.getValue();
        this.fb.moveTo(pointF2.x + f2, (pointF2.y - f3) + f);
        this.fb.lineTo(pointF2.x + f2, (pointF2.y + f3) - f);
        if (f > 0.0f) {
            float f4 = f * 2.0f;
            this.fd.set((pointF2.x + f2) - f4, (pointF2.y + f3) - f4, pointF2.x + f2, pointF2.y + f3);
            this.fb.arcTo(this.fd, 0.0f, 90.0f, false);
        }
        this.fb.lineTo((pointF2.x - f2) + f, pointF2.y + f3);
        if (f > 0.0f) {
            float f5 = f * 2.0f;
            this.fd.set(pointF2.x - f2, (pointF2.y + f3) - f5, (pointF2.x - f2) + f5, pointF2.y + f3);
            this.fb.arcTo(this.fd, 90.0f, 90.0f, false);
        }
        this.fb.lineTo(pointF2.x - f2, (pointF2.y - f3) + f);
        if (f > 0.0f) {
            float f6 = f * 2.0f;
            this.fd.set(pointF2.x - f2, pointF2.y - f3, (pointF2.x - f2) + f6, (pointF2.y - f3) + f6);
            this.fb.arcTo(this.fd, 180.0f, 90.0f, false);
        }
        this.fb.lineTo((pointF2.x + f2) - f, pointF2.y - f3);
        if (f > 0.0f) {
            f *= 2.0f;
            this.fd.set((pointF2.x + f2) - f, pointF2.y - f3, pointF2.x + f2, (pointF2.y - f3) + f);
            this.fb.arcTo(this.fd, 270.0f, 90.0f, false);
        }
        this.fb.close();
        this.fw.a(this.fb);
        this.fy = true;
        return this.fb;
    }

    public void a(d dVar, int i, List<d> list, d dVar2) {
        com.airbnb.lottie.d.g.a(dVar, i, list, dVar2, this);
    }

    public <T> void a(T t, @Nullable com.airbnb.lottie.e.c<T> cVar) {
        if (t == l.et) {
            this.ft.a(cVar);
        } else if (t == l.ev) {
            this.fu.a(cVar);
        } else if (t == l.eu) {
            this.fV.a(cVar);
        }
    }
}
