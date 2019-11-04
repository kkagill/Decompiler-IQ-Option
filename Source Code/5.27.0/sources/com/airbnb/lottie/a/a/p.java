package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.b.a.a;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent */
public class p implements e, j, k, m, a {
    private final g cW;
    private final com.airbnb.lottie.a.b.a<Float, Float> fW;
    private final com.airbnb.lottie.a.b.a<Float, Float> fX;
    private final o fY;
    private d fZ;
    private final Path fb = new Path();
    private final com.airbnb.lottie.model.layer.a fe;
    private final boolean fq;
    private final Matrix matrix = new Matrix();
    private final String name;

    public p(g gVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.g gVar2) {
        this.cW = gVar;
        this.fe = aVar;
        this.name = gVar2.getName();
        this.fq = gVar2.isHidden();
        this.fW = gVar2.bY().bn();
        aVar.a(this.fW);
        this.fW.b(this);
        this.fX = gVar2.bZ().bn();
        aVar.a(this.fX);
        this.fX.b(this);
        this.fY = gVar2.ca().bA();
        this.fY.a(aVar);
        this.fY.a((a) this);
    }

    public void a(ListIterator<c> listIterator) {
        if (this.fZ == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.fZ = new d(this.cW, this.fe, "Repeater", this.fq, arrayList, null);
        }
    }

    public String getName() {
        return this.name;
    }

    public void a(List<c> list, List<c> list2) {
        this.fZ.a((List) list, (List) list2);
    }

    public Path getPath() {
        Path path = this.fZ.getPath();
        this.fb.reset();
        float floatValue = ((Float) this.fW.getValue()).floatValue();
        float floatValue2 = ((Float) this.fX.getValue()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.matrix.set(this.fY.e(((float) i) + floatValue2));
            this.fb.addPath(path, this.matrix);
        }
        return this.fb;
    }

    public void a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.fW.getValue()).floatValue();
        float floatValue2 = ((Float) this.fX.getValue()).floatValue();
        float floatValue3 = ((Float) this.fY.bb().getValue()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.fY.bc().getValue()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.matrix.set(matrix);
            float f = (float) i2;
            this.matrix.preConcat(this.fY.e(f + floatValue2));
            this.fZ.a(canvas, this.matrix, (int) (((float) i) * com.airbnb.lottie.d.g.lerp(floatValue3, floatValue4, f / floatValue)));
        }
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.fZ.a(rectF, matrix, z);
    }

    public void aB() {
        this.cW.invalidateSelf();
    }

    public void a(d dVar, int i, List<d> list, d dVar2) {
        com.airbnb.lottie.d.g.a(dVar, i, list, dVar2, this);
    }

    public <T> void a(T t, @Nullable c<T> cVar) {
        if (!this.fY.b(t, cVar)) {
            if (t == l.eC) {
                this.fW.a(cVar);
            } else if (t == l.eD) {
                this.fX.a(cVar);
            }
        }
    }
}
