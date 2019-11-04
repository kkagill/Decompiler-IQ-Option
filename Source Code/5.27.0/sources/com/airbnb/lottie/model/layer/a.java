package com.airbnb.lottie.model.layer;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.e;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.Mask.MaskMode;
import com.airbnb.lottie.model.content.h;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.Layer.MatteType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseLayer */
public abstract class a implements e, com.airbnb.lottie.a.b.a.a, com.airbnb.lottie.model.e {
    final g cW;
    final o fY;
    private final Path fb = new Path();
    private final RectF fd = new RectF();
    private final Paint iG = new com.airbnb.lottie.a.a(1);
    private final Paint iH = new com.airbnb.lottie.a.a(1, Mode.DST_IN);
    private final Paint iI = new com.airbnb.lottie.a.a(1, Mode.DST_OUT);
    private final Paint iJ = new com.airbnb.lottie.a.a(1);
    private final Paint iK = new com.airbnb.lottie.a.a(Mode.CLEAR);
    private final RectF iL = new RectF();
    private final RectF iM = new RectF();
    private final RectF iN = new RectF();
    private final String iO;
    final Matrix iP = new Matrix();
    final Layer iQ;
    @Nullable
    private com.airbnb.lottie.a.b.g iR;
    @Nullable
    private a iS;
    @Nullable
    private a iT;
    private List<a> iU;
    private final List<com.airbnb.lottie.a.b.a<?, ?>> iV = new ArrayList();
    private final Matrix matrix = new Matrix();
    private boolean visible = true;

    /* compiled from: BaseLayer */
    /* renamed from: com.airbnb.lottie.model.layer.a$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] iZ = new int[MaskMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Missing block: B:29:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.airbnb.lottie.model.content.Mask.MaskMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            iZ = r0;
            r0 = 1;
            r1 = iZ;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = iZ;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = iZ;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = com.airbnb.lottie.model.layer.Layer.LayerType.values();
            r3 = r3.length;
            r3 = new int[r3];
            iY = r3;
            r3 = iY;	 Catch:{ NoSuchFieldError -> 0x003d }
            r4 = com.airbnb.lottie.model.layer.Layer.LayerType.SHAPE;	 Catch:{ NoSuchFieldError -> 0x003d }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x003d }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x003d }
        L_0x003d:
            r0 = iY;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3 = com.airbnb.lottie.model.layer.Layer.LayerType.PRE_COMP;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r0[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r0 = iY;	 Catch:{ NoSuchFieldError -> 0x0051 }
            r1 = com.airbnb.lottie.model.layer.Layer.LayerType.SOLID;	 Catch:{ NoSuchFieldError -> 0x0051 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0051 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0051 }
        L_0x0051:
            r0 = iY;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = com.airbnb.lottie.model.layer.Layer.LayerType.IMAGE;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x005c }
        L_0x005c:
            r0 = iY;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = com.airbnb.lottie.model.layer.Layer.LayerType.NULL;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0067 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0067 }
        L_0x0067:
            r0 = iY;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = com.airbnb.lottie.model.layer.Layer.LayerType.TEXT;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0072 }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0072 }
        L_0x0072:
            r0 = iY;	 Catch:{ NoSuchFieldError -> 0x007d }
            r1 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN;	 Catch:{ NoSuchFieldError -> 0x007d }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007d }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007d }
        L_0x007d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.a$AnonymousClass2.<clinit>():void");
        }
    }

    public void a(List<c> list, List<c> list2) {
    }

    public abstract void b(Canvas canvas, Matrix matrix, int i);

    /* Access modifiers changed, original: 0000 */
    public void b(d dVar, int i, List<d> list, d dVar2) {
    }

    @Nullable
    static a a(Layer layer, g gVar, com.airbnb.lottie.e eVar) {
        switch (layer.cs()) {
            case SHAPE:
                return new e(gVar, layer);
            case PRE_COMP:
                return new b(gVar, layer, eVar.m(layer.cp()), eVar);
            case SOLID:
                return new f(gVar, layer);
            case IMAGE:
                return new c(gVar, layer);
            case NULL:
                return new d(gVar, layer);
            case TEXT:
                return new g(gVar, layer);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown layer type ");
                stringBuilder.append(layer.cs());
                com.airbnb.lottie.d.d.warning(stringBuilder.toString());
                return null;
        }
    }

    a(g gVar, Layer layer) {
        this.cW = gVar;
        this.iQ = layer;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(layer.getName());
        stringBuilder.append("#draw");
        this.iO = stringBuilder.toString();
        if (layer.ct() == MatteType.INVERT) {
            this.iJ.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        } else {
            this.iJ.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        }
        this.fY = layer.ca().bA();
        this.fY.a((com.airbnb.lottie.a.b.a.a) this);
        if (!(layer.aV() == null || layer.aV().isEmpty())) {
            this.iR = new com.airbnb.lottie.a.b.g(layer.aV());
            for (com.airbnb.lottie.a.b.a b : this.iR.aW()) {
                b.b(this);
            }
            for (com.airbnb.lottie.a.b.a b2 : this.iR.aX()) {
                a(b2);
                b2.b(this);
            }
        }
        cj();
    }

    public void aB() {
        invalidateSelf();
    }

    /* Access modifiers changed, original: 0000 */
    public Layer ch() {
        return this.iQ;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(@Nullable a aVar) {
        this.iS = aVar;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ci() {
        return this.iS != null;
    }

    /* Access modifiers changed, original: 0000 */
    public void c(@Nullable a aVar) {
        this.iT = aVar;
    }

    private void cj() {
        boolean z = true;
        if (this.iQ.co().isEmpty()) {
            setVisible(true);
            return;
        }
        final com.airbnb.lottie.a.b.c cVar = new com.airbnb.lottie.a.b.c(this.iQ.co());
        cVar.aO();
        cVar.b(new com.airbnb.lottie.a.b.a.a() {
            public void aB() {
                a.this.setVisible(cVar.aU() == 1.0f);
            }
        });
        if (((Float) cVar.getValue()).floatValue() != 1.0f) {
            z = false;
        }
        setVisible(z);
        a(cVar);
    }

    private void invalidateSelf() {
        this.cW.invalidateSelf();
    }

    @SuppressLint({"WrongConstant"})
    private void a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, z ? 31 : 19);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    public void a(@Nullable com.airbnb.lottie.a.b.a<?, ?> aVar) {
        if (aVar != null) {
            this.iV.add(aVar);
        }
    }

    public void b(com.airbnb.lottie.a.b.a<?, ?> aVar) {
        this.iV.remove(aVar);
    }

    @CallSuper
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.fd.set(0.0f, 0.0f, 0.0f, 0.0f);
        cl();
        this.iP.set(matrix);
        if (z) {
            List list = this.iU;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.iP.preConcat(((a) this.iU.get(size)).fY.getMatrix());
                }
            } else {
                a aVar = this.iT;
                if (aVar != null) {
                    this.iP.preConcat(aVar.fY.getMatrix());
                }
            }
        }
        this.iP.preConcat(this.fY.getMatrix());
    }

    public void a(Canvas canvas, Matrix matrix, int i) {
        com.airbnb.lottie.d.beginSection(this.iO);
        if (!this.visible || this.iQ.isHidden()) {
            com.airbnb.lottie.d.k(this.iO);
            return;
        }
        cl();
        String str = "Layer#parentMatrix";
        com.airbnb.lottie.d.beginSection(str);
        this.matrix.reset();
        this.matrix.set(matrix);
        for (int size = this.iU.size() - 1; size >= 0; size--) {
            this.matrix.preConcat(((a) this.iU.get(size)).fY.getMatrix());
        }
        com.airbnb.lottie.d.k(str);
        i = (int) ((((((float) i) / 255.0f) * ((float) (this.fY.ba() == null ? 100 : ((Integer) this.fY.ba().getValue()).intValue()))) / 100.0f) * 255.0f);
        String str2 = "Layer#drawLayer";
        if (ci() || ck()) {
            str = "Layer#computeBounds";
            com.airbnb.lottie.d.beginSection(str);
            a(this.fd, this.matrix, false);
            b(this.fd, matrix);
            this.matrix.preConcat(this.fY.getMatrix());
            a(this.fd, this.matrix);
            com.airbnb.lottie.d.k(str);
            if (!this.fd.isEmpty()) {
                str = "Layer#saveLayer";
                com.airbnb.lottie.d.beginSection(str);
                a(canvas, this.fd, this.iG, true);
                com.airbnb.lottie.d.k(str);
                e(canvas);
                com.airbnb.lottie.d.beginSection(str2);
                b(canvas, this.matrix, i);
                com.airbnb.lottie.d.k(str2);
                if (ck()) {
                    a(canvas, this.matrix);
                }
                String str3 = "Layer#restoreLayer";
                if (ci()) {
                    str2 = "Layer#drawMatte";
                    com.airbnb.lottie.d.beginSection(str2);
                    com.airbnb.lottie.d.beginSection(str);
                    a(canvas, this.fd, this.iJ, false);
                    com.airbnb.lottie.d.k(str);
                    e(canvas);
                    this.iS.a(canvas, matrix, i);
                    com.airbnb.lottie.d.beginSection(str3);
                    canvas.restore();
                    com.airbnb.lottie.d.k(str3);
                    com.airbnb.lottie.d.k(str2);
                }
                com.airbnb.lottie.d.beginSection(str3);
                canvas.restore();
                com.airbnb.lottie.d.k(str3);
            }
            f(com.airbnb.lottie.d.k(this.iO));
            return;
        }
        this.matrix.preConcat(this.fY.getMatrix());
        com.airbnb.lottie.d.beginSection(str2);
        b(canvas, this.matrix, i);
        com.airbnb.lottie.d.k(str2);
        f(com.airbnb.lottie.d.k(this.iO));
    }

    private void f(float f) {
        this.cW.getComposition().getPerformanceTracker().a(this.iQ.getName(), f);
    }

    private void e(Canvas canvas) {
        String str = "Layer#clearLayer";
        com.airbnb.lottie.d.beginSection(str);
        canvas.drawRect(this.fd.left - 1.0f, this.fd.top - 1.0f, this.fd.right + 1.0f, this.fd.bottom + 1.0f, this.iK);
        com.airbnb.lottie.d.k(str);
    }

    private void a(RectF rectF, Matrix matrix) {
        this.iL.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (ck()) {
            int size = this.iR.aV().size();
            int i = 0;
            while (i < size) {
                Mask mask = (Mask) this.iR.aV().get(i);
                this.fb.set((Path) ((com.airbnb.lottie.a.b.a) this.iR.aW().get(i)).getValue());
                this.fb.transform(matrix);
                int i2 = AnonymousClass2.iZ[mask.bO().ordinal()];
                if (i2 == 1) {
                    return;
                }
                if ((i2 != 2 && i2 != 3) || !mask.isInverted()) {
                    this.fb.computeBounds(this.iN, false);
                    if (i == 0) {
                        this.iL.set(this.iN);
                    } else {
                        RectF rectF2 = this.iL;
                        rectF2.set(Math.min(rectF2.left, this.iN.left), Math.min(this.iL.top, this.iN.top), Math.max(this.iL.right, this.iN.right), Math.max(this.iL.bottom, this.iN.bottom));
                    }
                    i++;
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.iL)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void b(RectF rectF, Matrix matrix) {
        if (ci() && this.iQ.ct() != MatteType.INVERT) {
            this.iM.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.iS.a(this.iM, matrix, true);
            if (!rectF.intersect(this.iM)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void a(Canvas canvas, Matrix matrix) {
        String str = "Layer#saveLayer";
        com.airbnb.lottie.d.beginSection(str);
        int i = 0;
        a(canvas, this.fd, this.iH, false);
        com.airbnb.lottie.d.k(str);
        while (i < this.iR.aV().size()) {
            Mask mask = (Mask) this.iR.aV().get(i);
            com.airbnb.lottie.a.b.a aVar = (com.airbnb.lottie.a.b.a) this.iR.aW().get(i);
            com.airbnb.lottie.a.b.a aVar2 = (com.airbnb.lottie.a.b.a) this.iR.aX().get(i);
            int i2 = AnonymousClass2.iZ[mask.bO().ordinal()];
            if (i2 == 1) {
                if (i == 0) {
                    Paint paint = new Paint();
                    paint.setColor(ViewCompat.MEASURED_STATE_MASK);
                    canvas.drawRect(this.fd, paint);
                }
                if (mask.isInverted()) {
                    d(canvas, matrix, mask, aVar, aVar2);
                } else {
                    c(canvas, matrix, mask, aVar, aVar2);
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (mask.isInverted()) {
                        b(canvas, matrix, mask, aVar, aVar2);
                    } else {
                        a(canvas, matrix, mask, aVar, aVar2);
                    }
                }
            } else if (mask.isInverted()) {
                f(canvas, matrix, mask, aVar, aVar2);
            } else {
                e(canvas, matrix, mask, aVar, aVar2);
            }
            i++;
        }
        String str2 = "Layer#restoreLayer";
        com.airbnb.lottie.d.beginSection(str2);
        canvas.restore();
        com.airbnb.lottie.d.k(str2);
    }

    private void a(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.a.b.a<h, Path> aVar, com.airbnb.lottie.a.b.a<Integer, Integer> aVar2) {
        this.fb.set((Path) aVar.getValue());
        this.fb.transform(matrix);
        this.iG.setAlpha((int) (((float) ((Integer) aVar2.getValue()).intValue()) * 2.55f));
        canvas.drawPath(this.fb, this.iG);
    }

    private void b(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.a.b.a<h, Path> aVar, com.airbnb.lottie.a.b.a<Integer, Integer> aVar2) {
        a(canvas, this.fd, this.iG, true);
        canvas.drawRect(this.fd, this.iG);
        this.fb.set((Path) aVar.getValue());
        this.fb.transform(matrix);
        this.iG.setAlpha((int) (((float) ((Integer) aVar2.getValue()).intValue()) * 2.55f));
        canvas.drawPath(this.fb, this.iI);
        canvas.restore();
    }

    private void c(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.a.b.a<h, Path> aVar, com.airbnb.lottie.a.b.a<Integer, Integer> aVar2) {
        this.fb.set((Path) aVar.getValue());
        this.fb.transform(matrix);
        canvas.drawPath(this.fb, this.iI);
    }

    private void d(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.a.b.a<h, Path> aVar, com.airbnb.lottie.a.b.a<Integer, Integer> aVar2) {
        a(canvas, this.fd, this.iI, true);
        canvas.drawRect(this.fd, this.iG);
        this.iI.setAlpha((int) (((float) ((Integer) aVar2.getValue()).intValue()) * 2.55f));
        this.fb.set((Path) aVar.getValue());
        this.fb.transform(matrix);
        canvas.drawPath(this.fb, this.iI);
        canvas.restore();
    }

    private void e(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.a.b.a<h, Path> aVar, com.airbnb.lottie.a.b.a<Integer, Integer> aVar2) {
        a(canvas, this.fd, this.iH, true);
        this.fb.set((Path) aVar.getValue());
        this.fb.transform(matrix);
        this.iG.setAlpha((int) (((float) ((Integer) aVar2.getValue()).intValue()) * 2.55f));
        canvas.drawPath(this.fb, this.iG);
        canvas.restore();
    }

    private void f(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.a.b.a<h, Path> aVar, com.airbnb.lottie.a.b.a<Integer, Integer> aVar2) {
        a(canvas, this.fd, this.iH, true);
        canvas.drawRect(this.fd, this.iG);
        this.iI.setAlpha((int) (((float) ((Integer) aVar2.getValue()).intValue()) * 2.55f));
        this.fb.set((Path) aVar.getValue());
        this.fb.transform(matrix);
        canvas.drawPath(this.fb, this.iI);
        canvas.restore();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ck() {
        com.airbnb.lottie.a.b.g gVar = this.iR;
        return (gVar == null || gVar.aW().isEmpty()) ? false : true;
    }

    private void setVisible(boolean z) {
        if (z != this.visible) {
            this.visible = z;
            invalidateSelf();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.fY.setProgress(f);
        int i = 0;
        if (this.iR != null) {
            for (int i2 = 0; i2 < this.iR.aW().size(); i2++) {
                ((com.airbnb.lottie.a.b.a) this.iR.aW().get(i2)).setProgress(f);
            }
        }
        if (this.iQ.cm() != 0.0f) {
            f /= this.iQ.cm();
        }
        a aVar = this.iS;
        if (aVar != null) {
            this.iS.setProgress(aVar.iQ.cm() * f);
        }
        while (i < this.iV.size()) {
            ((com.airbnb.lottie.a.b.a) this.iV.get(i)).setProgress(f);
            i++;
        }
    }

    private void cl() {
        if (this.iU == null) {
            if (this.iT == null) {
                this.iU = Collections.emptyList();
                return;
            }
            this.iU = new ArrayList();
            for (Object obj = this.iT; obj != null; obj = obj.iT) {
                this.iU.add(obj);
            }
        }
    }

    public String getName() {
        return this.iQ.getName();
    }

    public void a(d dVar, int i, List<d> list, d dVar2) {
        if (dVar.a(getName(), i)) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.x(getName());
                if (dVar.c(getName(), i)) {
                    list.add(dVar2.a(this));
                }
            }
            if (dVar.d(getName(), i)) {
                b(dVar, i + dVar.b(getName(), i), list, dVar2);
            }
        }
    }

    @CallSuper
    public <T> void a(T t, @Nullable com.airbnb.lottie.e.c<T> cVar) {
        this.fY.b(t, cVar);
    }
}
