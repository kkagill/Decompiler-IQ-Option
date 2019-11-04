package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.b.a.a;
import com.airbnb.lottie.a.b.b;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.content.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent */
public class g implements e, k, a {
    private final com.airbnb.lottie.g cW;
    private final Path fb = new Path();
    private final com.airbnb.lottie.model.layer.a fe;
    private final Paint fh = new com.airbnb.lottie.a.a(1);
    private final com.airbnb.lottie.a.b.a<Integer, Integer> fj;
    @Nullable
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> fm;
    private final List<m> fn = new ArrayList();
    private final boolean fq;
    private final com.airbnb.lottie.a.b.a<Integer, Integer> fz;
    private final String name;

    public g(com.airbnb.lottie.g gVar, com.airbnb.lottie.model.layer.a aVar, i iVar) {
        this.fe = aVar;
        this.name = iVar.getName();
        this.fq = iVar.isHidden();
        this.cW = gVar;
        if (iVar.cd() == null || iVar.bv() == null) {
            this.fz = null;
            this.fj = null;
            return;
        }
        this.fb.setFillType(iVar.getFillType());
        this.fz = iVar.cd().bn();
        this.fz.b(this);
        aVar.a(this.fz);
        this.fj = iVar.bv().bn();
        this.fj.b(this);
        aVar.a(this.fj);
    }

    public void aB() {
        this.cW.invalidateSelf();
    }

    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = (c) list2.get(i);
            if (cVar instanceof m) {
                this.fn.add((m) cVar);
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public void a(Canvas canvas, Matrix matrix, int i) {
        if (!this.fq) {
            String str = "FillContent#draw";
            d.beginSection(str);
            this.fh.setColor(((b) this.fz).getIntValue());
            int i2 = 0;
            this.fh.setAlpha(com.airbnb.lottie.d.g.clamp((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.fj.getValue()).intValue())) / 100.0f) * 255.0f), 0, 255));
            com.airbnb.lottie.a.b.a aVar = this.fm;
            if (aVar != null) {
                this.fh.setColorFilter((ColorFilter) aVar.getValue());
            }
            this.fb.reset();
            while (i2 < this.fn.size()) {
                this.fb.addPath(((m) this.fn.get(i2)).getPath(), matrix);
                i2++;
            }
            canvas.drawPath(this.fb, this.fh);
            d.k(str);
        }
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.fb.reset();
        for (int i = 0; i < this.fn.size(); i++) {
            this.fb.addPath(((m) this.fn.get(i)).getPath(), matrix);
        }
        this.fb.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public void a(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.d.g.a(dVar, i, list, dVar2, this);
    }

    public <T> void a(T t, @Nullable c<T> cVar) {
        if (t == l.em) {
            this.fz.a(cVar);
        } else if (t == l.ep) {
            this.fj.a(cVar);
        } else if (t != l.eN) {
        } else {
            if (cVar == null) {
                this.fm = null;
                return;
            }
            this.fm = new p(cVar);
            this.fm.b(this);
            this.fe.a(this.fm);
        }
    }
}
