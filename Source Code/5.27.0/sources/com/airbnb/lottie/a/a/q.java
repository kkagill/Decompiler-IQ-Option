package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.Path.FillType;
import com.airbnb.lottie.a.b.a.a;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.content.k;
import java.util.List;

/* compiled from: ShapeContent */
public class q implements m, a {
    private final g cW;
    private final Path fb = new Path();
    private final boolean fq;
    private b fw = new b();
    private boolean fy;
    private final com.airbnb.lottie.a.b.a<?, Path> ga;
    private final String name;

    public q(g gVar, com.airbnb.lottie.model.layer.a aVar, k kVar) {
        this.name = kVar.getName();
        this.fq = kVar.isHidden();
        this.cW = gVar;
        this.ga = kVar.ce().bn();
        aVar.a(this.ga);
        this.ga.b(this);
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
        this.fb.set((Path) this.ga.getValue());
        this.fb.setFillType(FillType.EVEN_ODD);
        this.fw.a(this.fb);
        this.fy = true;
        return this.fb;
    }

    public String getName() {
        return this.name;
    }
}
