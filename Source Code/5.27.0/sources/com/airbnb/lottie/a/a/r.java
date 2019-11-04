package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.b.b;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.a;

/* compiled from: StrokeContent */
public class r extends a {
    private final a fe;
    @Nullable
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> fm;
    private final boolean fq;
    private final com.airbnb.lottie.a.b.a<Integer, Integer> fz;
    private final String name;

    public r(g gVar, a aVar, ShapeStroke shapeStroke) {
        super(gVar, aVar, shapeStroke.bJ().toPaintCap(), shapeStroke.bK().toPaintJoin(), shapeStroke.bN(), shapeStroke.bv(), shapeStroke.bI(), shapeStroke.bL(), shapeStroke.bM());
        this.fe = aVar;
        this.name = shapeStroke.getName();
        this.fq = shapeStroke.isHidden();
        this.fz = shapeStroke.cd().bn();
        this.fz.b(this);
        aVar.a(this.fz);
    }

    public void a(Canvas canvas, Matrix matrix, int i) {
        if (!this.fq) {
            this.fh.setColor(((b) this.fz).getIntValue());
            if (this.fm != null) {
                this.fh.setColorFilter((ColorFilter) this.fm.getValue());
            }
            super.a(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.name;
    }

    public <T> void a(T t, @Nullable c<T> cVar) {
        super.a((Object) t, (c) cVar);
        if (t == l.en) {
            this.fz.a(cVar);
        } else if (t != l.eN) {
        } else {
            if (cVar == null) {
                this.fm = null;
                return;
            }
            this.fm = new p(cVar);
            this.fm.b(this);
            this.fe.a(this.fz);
        }
    }
}
