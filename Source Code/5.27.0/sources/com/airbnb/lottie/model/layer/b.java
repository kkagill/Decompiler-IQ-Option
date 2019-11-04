package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.layer.Layer.MatteType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompositionLayer */
public class b extends a {
    private final List<a> du = new ArrayList();
    private final RectF fd = new RectF();
    @Nullable
    private a<Float, Float> ja;
    private final RectF jb = new RectF();

    /* compiled from: CompositionLayer */
    /* renamed from: com.airbnb.lottie.model.layer.b$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jc = new int[MatteType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.airbnb.lottie.model.layer.Layer.MatteType.values();
            r0 = r0.length;
            r0 = new int[r0];
            jc = r0;
            r0 = jc;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.airbnb.lottie.model.layer.Layer.MatteType.ADD;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = jc;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.airbnb.lottie.model.layer.Layer.MatteType.INVERT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.b$AnonymousClass1.<clinit>():void");
        }
    }

    public b(g gVar, Layer layer, List<Layer> list, e eVar) {
        int i;
        super(gVar, layer);
        com.airbnb.lottie.model.a.b cz = layer.cz();
        if (cz != null) {
            this.ja = cz.bn();
            a(this.ja);
            this.ja.b(this);
        } else {
            this.ja = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(eVar.al().size());
        int size = list.size() - 1;
        a aVar = null;
        while (true) {
            i = 0;
            if (size < 0) {
                break;
            }
            Layer layer2 = (Layer) list.get(size);
            a a = a.a(layer2, gVar, eVar);
            if (a != null) {
                longSparseArray.put(a.ch().getId(), a);
                if (aVar != null) {
                    aVar.b(a);
                    aVar = null;
                } else {
                    this.du.add(0, a);
                    i = AnonymousClass1.jc[layer2.ct().ordinal()];
                    if (i == 1 || i == 2) {
                        aVar = a;
                    }
                }
            }
            size--;
        }
        while (i < longSparseArray.size()) {
            a aVar2 = (a) longSparseArray.get(longSparseArray.keyAt(i));
            if (aVar2 != null) {
                a aVar3 = (a) longSparseArray.get(aVar2.ch().cu());
                if (aVar3 != null) {
                    aVar2.c(aVar3);
                }
            }
            i++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(Canvas canvas, Matrix matrix, int i) {
        String str = "CompositionLayer#draw";
        d.beginSection(str);
        canvas.save();
        this.jb.set(0.0f, 0.0f, (float) this.iQ.cq(), (float) this.iQ.cr());
        matrix.mapRect(this.jb);
        for (int size = this.du.size() - 1; size >= 0; size--) {
            if (!this.jb.isEmpty() ? canvas.clipRect(this.jb) : true) {
                ((a) this.du.get(size)).a(canvas, matrix, i);
            }
        }
        canvas.restore();
        d.k(str);
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        for (int size = this.du.size() - 1; size >= 0; size--) {
            this.fd.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((a) this.du.get(size)).a(this.fd, this.iP, true);
            rectF.union(this.fd);
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        super.setProgress(f);
        if (this.ja != null) {
            f = ((float) ((long) (((Float) this.ja.getValue()).floatValue() * 1000.0f))) / this.cW.getComposition().ai();
        }
        if (this.iQ.cm() != 0.0f) {
            f /= this.iQ.cm();
        }
        f -= this.iQ.cn();
        for (int size = this.du.size() - 1; size >= 0; size--) {
            ((a) this.du.get(size)).setProgress(f);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        for (int i2 = 0; i2 < this.du.size(); i2++) {
            ((a) this.du.get(i2)).a(dVar, i, (List) list, dVar2);
        }
    }

    public <T> void a(T t, @Nullable c<T> cVar) {
        super.a((Object) t, (c) cVar);
        if (t != l.eM) {
            return;
        }
        if (cVar == null) {
            this.ja = null;
            return;
        }
        this.ja = new p(cVar);
        a(this.ja);
    }
}
