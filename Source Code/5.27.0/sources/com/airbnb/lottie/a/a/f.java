package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.b.a.a;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.d;
import java.util.List;

/* compiled from: EllipseContent */
public class f implements k, m, a {
    private final g cW;
    private final Path fb = new Path();
    private final com.airbnb.lottie.a.b.a<?, PointF> ft;
    private final com.airbnb.lottie.a.b.a<?, PointF> fu;
    private final com.airbnb.lottie.model.content.a fv;
    private b fw = new b();
    private boolean fy;
    private final String name;

    public f(g gVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.a aVar2) {
        this.name = aVar2.getName();
        this.cW = gVar;
        this.ft = aVar2.bB().bn();
        this.fu = aVar2.bs().bn();
        this.fv = aVar2;
        aVar.a(this.ft);
        aVar.a(this.fu);
        this.ft.b(this);
        this.fu.b(this);
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

    public String getName() {
        return this.name;
    }

    public Path getPath() {
        if (this.fy) {
            return this.fb;
        }
        this.fb.reset();
        if (this.fv.isHidden()) {
            this.fy = true;
            return this.fb;
        }
        PointF pointF = (PointF) this.ft.getValue();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.fb.reset();
        float f5;
        if (this.fv.bC()) {
            float f6 = -f2;
            this.fb.moveTo(0.0f, f6);
            float f7 = 0.0f - f3;
            float f8 = -f;
            float f9 = 0.0f - f4;
            this.fb.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            f4 += 0.0f;
            f5 = f6;
            this.fb.cubicTo(f8, f4, f7, f2, 0.0f, f2);
            f3 += 0.0f;
            this.fb.cubicTo(f3, f2, f, f4, f, 0.0f);
            this.fb.cubicTo(f, f9, f3, f5, 0.0f, f5);
        } else {
            float f10 = -f2;
            this.fb.moveTo(0.0f, f10);
            f5 = f3 + 0.0f;
            float f11 = 0.0f - f4;
            this.fb.cubicTo(f5, f10, f, f11, f, 0.0f);
            f4 += 0.0f;
            this.fb.cubicTo(f, f4, f5, f2, 0.0f, f2);
            float f12 = 0.0f - f3;
            f = -f;
            this.fb.cubicTo(f12, f2, f, f4, f, 0.0f);
            f2 = f10;
            this.fb.cubicTo(f, f11, f12, f2, 0.0f, f2);
        }
        pointF = (PointF) this.fu.getValue();
        this.fb.offset(pointF.x, pointF.y);
        this.fb.close();
        this.fw.a(this.fb);
        this.fy = true;
        return this.fb;
    }

    public void a(d dVar, int i, List<d> list, d dVar2) {
        com.airbnb.lottie.d.g.a(dVar, i, list, dVar2, this);
    }

    public <T> void a(T t, @Nullable c<T> cVar) {
        if (t == l.es) {
            this.ft.a(cVar);
        } else if (t == l.ev) {
            this.fu.a(cVar);
        }
    }
}
