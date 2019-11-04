package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import com.airbnb.lottie.d.d;
import com.airbnb.lottie.d.g;
import com.airbnb.lottie.model.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData */
public class h {
    private boolean closed;
    private final List<a> ix;
    private PointF iy;

    public h(PointF pointF, boolean z, List<a> list) {
        this.iy = pointF;
        this.closed = z;
        this.ix = new ArrayList(list);
    }

    public h() {
        this.ix = new ArrayList();
    }

    private void e(float f, float f2) {
        if (this.iy == null) {
            this.iy = new PointF();
        }
        this.iy.set(f, f2);
    }

    public PointF cb() {
        return this.iy;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public List<a> cc() {
        return this.ix;
    }

    public void a(h hVar, h hVar2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.iy == null) {
            this.iy = new PointF();
        }
        boolean z = hVar.isClosed() || hVar2.isClosed();
        this.closed = z;
        if (hVar.cc().size() != hVar2.cc().size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Curves must have the same number of control points. Shape 1: ");
            stringBuilder.append(hVar.cc().size());
            stringBuilder.append("\tShape 2: ");
            stringBuilder.append(hVar2.cc().size());
            d.warning(stringBuilder.toString());
        }
        int min = Math.min(hVar.cc().size(), hVar2.cc().size());
        int size;
        if (this.ix.size() < min) {
            for (size = this.ix.size(); size < min; size++) {
                this.ix.add(new a());
            }
        } else if (this.ix.size() > min) {
            for (size = this.ix.size() - 1; size >= min; size--) {
                List list = this.ix;
                list.remove(list.size() - 1);
            }
        }
        PointF cb = hVar.cb();
        PointF cb2 = hVar2.cb();
        e(g.lerp(cb.x, cb2.x, f), g.lerp(cb.y, cb2.y, f));
        for (min = this.ix.size() - 1; min >= 0; min--) {
            a aVar = (a) hVar.cc().get(min);
            a aVar2 = (a) hVar2.cc().get(min);
            PointF be = aVar.be();
            PointF bf = aVar.bf();
            PointF bg = aVar.bg();
            PointF be2 = aVar2.be();
            PointF bf2 = aVar2.bf();
            cb2 = aVar2.bg();
            ((a) this.ix.get(min)).b(g.lerp(be.x, be2.x, f), g.lerp(be.y, be2.y, f));
            ((a) this.ix.get(min)).c(g.lerp(bf.x, bf2.x, f), g.lerp(bf.y, bf2.y, f));
            ((a) this.ix.get(min)).d(g.lerp(bg.x, cb2.x, f), g.lerp(bg.y, cb2.y, f));
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeData{numCurves=");
        stringBuilder.append(this.ix.size());
        stringBuilder.append("closed=");
        stringBuilder.append(this.closed);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
