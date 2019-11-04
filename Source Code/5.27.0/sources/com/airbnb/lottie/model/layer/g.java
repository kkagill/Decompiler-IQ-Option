package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.a.a.d;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.n;
import com.airbnb.lottie.d.h;
import com.airbnb.lottie.e;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.DocumentData.Justification;
import com.airbnb.lottie.model.a.k;
import com.airbnb.lottie.model.b;
import com.airbnb.lottie.model.c;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TextLayer */
public class g extends a {
    private final com.airbnb.lottie.g cW;
    private final e df;
    @Nullable
    private a<Integer, Integer> fz;
    private final LongSparseArray<String> jA = new LongSparseArray();
    private final n jB;
    @Nullable
    private a<Integer, Integer> jC;
    @Nullable
    private a<Float, Float> jD;
    @Nullable
    private a<Float, Float> jE;
    private final StringBuilder jv = new StringBuilder(2);
    private final RectF jw = new RectF();
    private final Paint jx = new Paint(1) {
    };
    private final Paint jy = new Paint(1) {
    };
    private final Map<c, List<d>> jz = new HashMap();
    private final Matrix matrix = new Matrix();

    /* compiled from: TextLayer */
    /* renamed from: com.airbnb.lottie.model.layer.g$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] jG = new int[Justification.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.airbnb.lottie.model.DocumentData.Justification.values();
            r0 = r0.length;
            r0 = new int[r0];
            jG = r0;
            r0 = jG;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.airbnb.lottie.model.DocumentData.Justification.LEFT_ALIGN;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = jG;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.airbnb.lottie.model.DocumentData.Justification.RIGHT_ALIGN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = jG;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.airbnb.lottie.model.DocumentData.Justification.CENTER;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.g$AnonymousClass3.<clinit>():void");
        }
    }

    g(com.airbnb.lottie.g gVar, Layer layer) {
        super(gVar, layer);
        this.cW = gVar;
        this.df = layer.getComposition();
        this.jB = layer.cx().bn();
        this.jB.b(this);
        a(this.jB);
        k cy = layer.cy();
        if (!(cy == null || cy.hB == null)) {
            this.fz = cy.hB.bn();
            this.fz.b(this);
            a(this.fz);
        }
        if (!(cy == null || cy.hC == null)) {
            this.jC = cy.hC.bn();
            this.jC.b(this);
            a(this.jC);
        }
        if (!(cy == null || cy.hD == null)) {
            this.jD = cy.hD.bn();
            this.jD.b(this);
            a(this.jD);
        }
        if (cy != null && cy.hE != null) {
            this.jE = cy.hE.bn();
            this.jE.b(this);
            a(this.jE);
        }
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.df.getBounds().width(), (float) this.df.getBounds().height());
    }

    /* Access modifiers changed, original: 0000 */
    public void b(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.cW.aw()) {
            canvas.setMatrix(matrix);
        }
        DocumentData documentData = (DocumentData) this.jB.getValue();
        b bVar = (b) this.df.an().get(documentData.hf);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        a aVar = this.fz;
        if (aVar != null) {
            this.jx.setColor(((Integer) aVar.getValue()).intValue());
        } else {
            this.jx.setColor(documentData.color);
        }
        aVar = this.jC;
        if (aVar != null) {
            this.jy.setColor(((Integer) aVar.getValue()).intValue());
        } else {
            this.jy.setColor(documentData.strokeColor);
        }
        int intValue = ((this.fY.ba() == null ? 100 : ((Integer) this.fY.ba().getValue()).intValue()) * 255) / 100;
        this.jx.setAlpha(intValue);
        this.jy.setAlpha(intValue);
        aVar = this.jD;
        if (aVar != null) {
            this.jy.setStrokeWidth(((Float) aVar.getValue()).floatValue());
        } else {
            float b = h.b(matrix);
            Paint paint = this.jy;
            double d = documentData.hl;
            double cP = (double) h.cP();
            Double.isNaN(cP);
            d *= cP;
            cP = (double) b;
            Double.isNaN(cP);
            paint.setStrokeWidth((float) (d * cP));
        }
        if (this.cW.aw()) {
            a(documentData, matrix, bVar, canvas);
        } else {
            a(documentData, bVar, matrix, canvas);
        }
        canvas.restore();
    }

    private void a(DocumentData documentData, Matrix matrix, b bVar, Canvas canvas) {
        DocumentData documentData2 = documentData;
        Canvas canvas2 = canvas;
        float f = ((float) documentData2.hg) / 100.0f;
        float b = h.b(matrix);
        float cP = ((float) documentData2.hj) * h.cP();
        List B = B(documentData2.text);
        int size = B.size();
        int i = 0;
        while (i < size) {
            String str = (String) B.get(i);
            float a = a(str, bVar, f, b);
            canvas.save();
            a(documentData2.hh, canvas2, a);
            canvas2.translate(0.0f, (((float) i) * cP) - ((((float) (size - 1)) * cP) / 2.0f));
            int i2 = i;
            a(str, documentData, matrix, bVar, canvas, b, f);
            canvas.restore();
            i = i2 + 1;
        }
    }

    private void a(String str, DocumentData documentData, Matrix matrix, b bVar, Canvas canvas, float f, float f2) {
        for (int i = 0; i < str.length(); i++) {
            c cVar = (c) this.df.am().get(c.a(str.charAt(i), bVar.getFamily(), bVar.bh()));
            if (cVar != null) {
                a(cVar, matrix, f2, documentData, canvas);
                float bj = ((((float) cVar.bj()) * f2) * h.cP()) * f;
                float f3 = ((float) documentData.hi) / 10.0f;
                a aVar = this.jE;
                if (aVar != null) {
                    f3 += ((Float) aVar.getValue()).floatValue();
                }
                canvas.translate(bj + (f3 * f), 0.0f);
            }
        }
    }

    private void a(DocumentData documentData, b bVar, Matrix matrix, Canvas canvas) {
        float b = h.b(matrix);
        Typeface g = this.cW.g(bVar.getFamily(), bVar.bh());
        if (g != null) {
            String str = documentData.text;
            s av = this.cW.av();
            if (av != null) {
                str = av.s(str);
            }
            this.jx.setTypeface(g);
            Paint paint = this.jx;
            double d = documentData.hg;
            double cP = (double) h.cP();
            Double.isNaN(cP);
            paint.setTextSize((float) (d * cP));
            this.jy.setTypeface(this.jx.getTypeface());
            this.jy.setTextSize(this.jx.getTextSize());
            float cP2 = ((float) documentData.hj) * h.cP();
            List B = B(str);
            int size = B.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) B.get(i);
                a(documentData.hh, canvas, this.jy.measureText(str2));
                canvas.translate(0.0f, (((float) i) * cP2) - ((((float) (size - 1)) * cP2) / 2.0f));
                a(str2, documentData, canvas, b);
                canvas.setMatrix(matrix);
            }
        }
    }

    private List<String> B(String str) {
        String str2 = "\r";
        return Arrays.asList(str.replaceAll("\r\n", str2).replaceAll("\n", str2).split(str2));
    }

    private void a(String str, DocumentData documentData, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String e = e(str, i);
            i += e.length();
            a(e, documentData, canvas);
            float measureText = this.jx.measureText(e, 0, 1);
            float f2 = ((float) documentData.hi) / 10.0f;
            a aVar = this.jE;
            if (aVar != null) {
                f2 += ((Float) aVar.getValue()).floatValue();
            }
            canvas.translate(measureText + (f2 * f), 0.0f);
        }
    }

    private float a(String str, b bVar, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            c cVar = (c) this.df.am().get(c.a(str.charAt(i), bVar.getFamily(), bVar.bh()));
            if (cVar != null) {
                double d = (double) f3;
                double bj = cVar.bj();
                double d2 = (double) f;
                Double.isNaN(d2);
                bj *= d2;
                d2 = (double) h.cP();
                Double.isNaN(d2);
                bj *= d2;
                d2 = (double) f2;
                Double.isNaN(d2);
                bj *= d2;
                Double.isNaN(d);
                f3 = (float) (d + bj);
            }
        }
        return f3;
    }

    private void a(Justification justification, Canvas canvas, float f) {
        int i = AnonymousClass3.jG[justification.ordinal()];
        if (i == 1) {
            return;
        }
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private void a(c cVar, Matrix matrix, float f, DocumentData documentData, Canvas canvas) {
        List a = a(cVar);
        for (int i = 0; i < a.size(); i++) {
            Path path = ((d) a.get(i)).getPath();
            path.computeBounds(this.jw, false);
            this.matrix.set(matrix);
            this.matrix.preTranslate(0.0f, ((float) (-documentData.hk)) * h.cP());
            this.matrix.preScale(f, f);
            path.transform(this.matrix);
            if (documentData.hm) {
                a(path, this.jx, canvas);
                a(path, this.jy, canvas);
            } else {
                a(path, this.jy, canvas);
                a(path, this.jx, canvas);
            }
        }
    }

    private void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private void a(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.hm) {
            a(str, this.jx, canvas);
            a(str, this.jy, canvas);
            return;
        }
        a(str, this.jy, canvas);
        a(str, this.jx, canvas);
    }

    private void a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    private List<d> a(c cVar) {
        if (this.jz.containsKey(cVar)) {
            return (List) this.jz.get(cVar);
        }
        List bi = cVar.bi();
        int size = bi.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new d(this.cW, this, (j) bi.get(i)));
        }
        this.jz.put(cVar, arrayList);
        return arrayList;
    }

    private String e(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!w(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.jA.containsKey(j)) {
            return (String) this.jA.get(j);
        }
        this.jv.setLength(0);
        while (i < charCount) {
            codePointAt = str.codePointAt(i);
            this.jv.appendCodePoint(codePointAt);
            i += Character.charCount(codePointAt);
        }
        str = this.jv.toString();
        this.jA.put(j, str);
        return str;
    }

    private boolean w(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    public <T> void a(T t, @Nullable com.airbnb.lottie.e.c<T> cVar) {
        a aVar;
        super.a((Object) t, (com.airbnb.lottie.e.c) cVar);
        if (t == l.em) {
            aVar = this.fz;
            if (aVar != null) {
                aVar.a(cVar);
                return;
            }
        }
        if (t == l.en) {
            aVar = this.jC;
            if (aVar != null) {
                aVar.a(cVar);
                return;
            }
        }
        if (t == l.eA) {
            aVar = this.jD;
            if (aVar != null) {
                aVar.a(cVar);
                return;
            }
        }
        if (t == l.eB) {
            a aVar2 = this.jE;
            if (aVar2 != null) {
                aVar2.a(cVar);
            }
        }
    }
}
