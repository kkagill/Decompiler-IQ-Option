package com.airbnb.lottie.model.content;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.r;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.a.a;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.d;
import java.util.List;

public class ShapeStroke implements b {
    private final boolean fq;
    private final a hB;
    private final d hJ;
    private final b hZ;
    private final LineCapType ia;
    private final LineJoinType ib;
    private final float ic;
    private final List<b> ie;
    @Nullable
    private final b iu;
    private final String name;

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] iC = new int[LineCapType.values().length];
        static final /* synthetic */ int[] iD = new int[LineJoinType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Missing block: B:21:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values();
            r0 = r0.length;
            r0 = new int[r0];
            iD = r0;
            r0 = 1;
            r1 = iD;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.BEVEL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = iD;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.MITER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = iD;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.ROUND;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values();
            r3 = r3.length;
            r3 = new int[r3];
            iC = r3;
            r3 = iC;	 Catch:{ NoSuchFieldError -> 0x003d }
            r4 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.BUTT;	 Catch:{ NoSuchFieldError -> 0x003d }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x003d }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x003d }
        L_0x003d:
            r0 = iC;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.ROUND;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r0[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r0 = iC;	 Catch:{ NoSuchFieldError -> 0x0051 }
            r1 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.UNKNOWN;	 Catch:{ NoSuchFieldError -> 0x0051 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0051 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0051 }
        L_0x0051:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.content.ShapeStroke$AnonymousClass1.<clinit>():void");
        }
    }

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Cap toPaintCap() {
            int i = AnonymousClass1.iC[ordinal()];
            if (i == 1) {
                return Cap.BUTT;
            }
            if (i != 2) {
                return Cap.SQUARE;
            }
            return Cap.ROUND;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Join toPaintJoin() {
            int i = AnonymousClass1.iD[ordinal()];
            if (i == 1) {
                return Join.BEVEL;
            }
            if (i == 2) {
                return Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Join.ROUND;
        }
    }

    public ShapeStroke(String str, @Nullable b bVar, List<b> list, a aVar, d dVar, b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.name = str;
        this.iu = bVar;
        this.ie = list;
        this.hB = aVar;
        this.hJ = dVar;
        this.hZ = bVar2;
        this.ia = lineCapType;
        this.ib = lineJoinType;
        this.ic = f;
        this.fq = z;
    }

    public c a(g gVar, com.airbnb.lottie.model.layer.a aVar) {
        return new r(gVar, aVar, this);
    }

    public String getName() {
        return this.name;
    }

    public a cd() {
        return this.hB;
    }

    public d bv() {
        return this.hJ;
    }

    public b bI() {
        return this.hZ;
    }

    public List<b> bL() {
        return this.ie;
    }

    public b bM() {
        return this.iu;
    }

    public LineCapType bJ() {
        return this.ia;
    }

    public LineJoinType bK() {
        return this.ib;
    }

    public float bN() {
        return this.ic;
    }

    public boolean isHidden() {
        return this.fq;
    }
}
