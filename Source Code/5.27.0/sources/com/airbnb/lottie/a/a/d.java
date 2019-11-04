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
import com.airbnb.lottie.model.a.l;
import com.airbnb.lottie.model.content.b;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.model.e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup */
public class d implements e, m, a, e {
    private final g cW;
    private final Path fb;
    private final RectF fd;
    private final List<c> fp;
    private final boolean fq;
    @Nullable
    private List<m> fr;
    @Nullable
    private o fs;
    private final Matrix matrix;
    private final String name;

    private static List<c> a(g gVar, com.airbnb.lottie.model.layer.a aVar, List<b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            c a = ((b) list.get(i)).a(gVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Nullable
    static l d(List<b> list) {
        for (int i = 0; i < list.size(); i++) {
            b bVar = (b) list.get(i);
            if (bVar instanceof l) {
                return (l) bVar;
            }
        }
        return null;
    }

    public d(g gVar, com.airbnb.lottie.model.layer.a aVar, j jVar) {
        this(gVar, aVar, jVar.getName(), jVar.isHidden(), a(gVar, aVar, jVar.getItems()), d(jVar.getItems()));
    }

    d(g gVar, com.airbnb.lottie.model.layer.a aVar, String str, boolean z, List<c> list, @Nullable l lVar) {
        int size;
        this.matrix = new Matrix();
        this.fb = new Path();
        this.fd = new RectF();
        this.name = str;
        this.cW = gVar;
        this.fq = z;
        this.fp = list;
        if (lVar != null) {
            this.fs = lVar.bA();
            this.fs.a(aVar);
            this.fs.a((a) this);
        }
        ArrayList arrayList = new ArrayList();
        for (size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (size = arrayList.size() - 1; size >= 0; size--) {
            ((j) arrayList.get(size)).a(list.listIterator(list.size()));
        }
    }

    public void aB() {
        this.cW.invalidateSelf();
    }

    public String getName() {
        return this.name;
    }

    public void a(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.fp.size());
        arrayList.addAll(list);
        for (int size = this.fp.size() - 1; size >= 0; size--) {
            c cVar = (c) this.fp.get(size);
            cVar.a(arrayList, this.fp.subList(0, size));
            arrayList.add(cVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public List<m> aC() {
        if (this.fr == null) {
            this.fr = new ArrayList();
            for (int i = 0; i < this.fp.size(); i++) {
                c cVar = (c) this.fp.get(i);
                if (cVar instanceof m) {
                    this.fr.add((m) cVar);
                }
            }
        }
        return this.fr;
    }

    /* Access modifiers changed, original: 0000 */
    public Matrix aD() {
        o oVar = this.fs;
        if (oVar != null) {
            return oVar.getMatrix();
        }
        this.matrix.reset();
        return this.matrix;
    }

    public Path getPath() {
        this.matrix.reset();
        o oVar = this.fs;
        if (oVar != null) {
            this.matrix.set(oVar.getMatrix());
        }
        this.fb.reset();
        if (this.fq) {
            return this.fb;
        }
        for (int size = this.fp.size() - 1; size >= 0; size--) {
            c cVar = (c) this.fp.get(size);
            if (cVar instanceof m) {
                this.fb.addPath(((m) cVar).getPath(), this.matrix);
            }
        }
        return this.fb;
    }

    public void a(Canvas canvas, Matrix matrix, int i) {
        if (!this.fq) {
            this.matrix.set(matrix);
            o oVar = this.fs;
            if (oVar != null) {
                this.matrix.preConcat(oVar.getMatrix());
                i = (int) ((((((float) (this.fs.ba() == null ? 100 : ((Integer) this.fs.ba().getValue()).intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            for (int size = this.fp.size() - 1; size >= 0; size--) {
                Object obj = this.fp.get(size);
                if (obj instanceof e) {
                    ((e) obj).a(canvas, this.matrix, i);
                }
            }
        }
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.matrix.set(matrix);
        o oVar = this.fs;
        if (oVar != null) {
            this.matrix.preConcat(oVar.getMatrix());
        }
        this.fd.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.fp.size() - 1; size >= 0; size--) {
            c cVar = (c) this.fp.get(size);
            if (cVar instanceof e) {
                ((e) cVar).a(this.fd, this.matrix, z);
                rectF.union(this.fd);
            }
        }
    }

    public void a(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        if (dVar.a(getName(), i)) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.x(getName());
                if (dVar.c(getName(), i)) {
                    list.add(dVar2.a(this));
                }
            }
            if (dVar.d(getName(), i)) {
                i += dVar.b(getName(), i);
                for (int i2 = 0; i2 < this.fp.size(); i2++) {
                    c cVar = (c) this.fp.get(i2);
                    if (cVar instanceof e) {
                        ((e) cVar).a(dVar, i, list, dVar2);
                    }
                }
            }
        }
    }

    public <T> void a(T t, @Nullable c<T> cVar) {
        o oVar = this.fs;
        if (oVar != null) {
            oVar.b(t, cVar);
        }
    }
}
