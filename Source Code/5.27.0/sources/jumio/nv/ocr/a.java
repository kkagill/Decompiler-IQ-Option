package jumio.nv.ocr;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.jumio.clientlib.impl.templatematcher.TemplateInfo;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.math.MathUtils;
import com.jumio.commons.math.TrigonometryUtils;
import com.jumio.commons.math.Vector2D;
import java.util.ArrayList;

/* compiled from: TemplateInfoWrapper */
public class a implements Parcelable {
    public static final Creator<a> CREATOR = new Creator<a>() {
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    };
    public static double a = 0.6d;
    public static double b = 0.75d;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final int k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private int v;
    private int w;
    private PreviewProperties x;
    private boolean y;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ a(Parcel parcel, AnonymousClass1 anonymousClass1) {
        this(parcel);
    }

    public a(TemplateInfo templateInfo) {
        PointF pointF = new PointF(templateInfo.getPolygon().getTLx(), templateInfo.getPolygon().getTLy());
        PointF pointF2 = new PointF(templateInfo.getPolygon().getTRx(), templateInfo.getPolygon().getTRy());
        PointF pointF3 = new PointF(templateInfo.getPolygon().getBRx(), templateInfo.getPolygon().getBRy());
        PointF pointF4 = new PointF(templateInfo.getPolygon().getBLx(), templateInfo.getPolygon().getBLy());
        PointF[] inflatePolygon = MathUtils.inflatePolygon(pointF, pointF2, pointF3, pointF4, (int) Math.ceil((double) (Math.max(Math.max((float) new Vector2D(pointF2.x, pointF2.y, pointF.x, pointF.y).length(), (float) new Vector2D(pointF3.x, pointF3.y, pointF4.x, pointF4.y).length()), Math.max((float) new Vector2D(pointF2.x, pointF2.y, pointF3.x, pointF3.y).length(), (float) new Vector2D(pointF.x, pointF.y, pointF4.x, pointF4.y).length())) * 0.0f)));
        this.e = inflatePolygon[0].x;
        this.f = inflatePolygon[0].y;
        this.c = inflatePolygon[1].x;
        this.d = inflatePolygon[1].y;
        this.g = inflatePolygon[2].x;
        this.h = inflatePolygon[2].y;
        this.i = inflatePolygon[3].x;
        this.j = inflatePolygon[3].y;
        this.k = templateInfo.getFrameIndex();
        this.v = templateInfo.getTemplateWidth();
        this.w = templateInfo.getTemplateHeight();
    }

    private a(Parcel parcel) {
        this.k = parcel.readInt();
        float[] fArr = new float[8];
        parcel.readFloatArray(fArr);
        boolean z = false;
        this.e = fArr[0];
        this.f = fArr[1];
        this.c = fArr[2];
        this.d = fArr[3];
        this.i = fArr[4];
        this.j = fArr[5];
        this.g = fArr[6];
        this.h = fArr[7];
        this.t = parcel.readFloat();
        this.u = parcel.readFloat();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = (PreviewProperties) parcel.readSerializable();
        if (parcel.readByte() == (byte) 1) {
            z = true;
        }
        this.y = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(e());
        parcel.writeFloatArray(d());
        parcel.writeFloat(f());
        parcel.writeFloat(g());
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeSerializable(this.x);
        parcel.writeByte((byte) this.y);
    }

    public boolean a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(k());
        arrayList.add(l());
        arrayList.add(n());
        arrayList.add(m());
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (i >= size) {
                return true;
            }
            int i2 = (i + 2) % size;
            int i3 = i + 1;
            int i4 = i3 % size;
            double d = (double) (((PointF) arrayList.get(i2)).x - ((PointF) arrayList.get(i4)).x);
            double d2 = (double) (((PointF) arrayList.get(i2)).y - ((PointF) arrayList.get(i4)).y);
            double d3 = (double) (((PointF) arrayList.get(i)).x - ((PointF) arrayList.get(i4)).x);
            double d4 = (double) (((PointF) arrayList.get(i)).y - ((PointF) arrayList.get(i4)).y);
            Double.isNaN(d);
            Double.isNaN(d4);
            d *= d4;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d -= d2 * d3;
            if (i == 0) {
                if (d <= 0.0d) {
                    z2 = false;
                }
                z = z2;
            } else {
                if (d <= 0.0d) {
                    z2 = false;
                }
                if (z != z2) {
                    return false;
                }
            }
            i = i3;
        }
    }

    public boolean b() {
        float f = (float) this.x.surface.width;
        float f2 = (float) this.x.surface.height;
        float f3 = this.n;
        if (f3 >= 0.0f && f3 <= f) {
            f3 = this.r;
            if (f3 >= 0.0f && f3 <= f) {
                f3 = this.l;
                if (f3 >= 0.0f && f3 <= f) {
                    f3 = this.p;
                    if (f3 >= 0.0f && f3 <= f) {
                        f = this.o;
                        if (f >= 0.0f && f <= f2) {
                            f = this.s;
                            if (f >= 0.0f && f <= f2) {
                                f = this.m;
                                if (f >= 0.0f && f <= f2) {
                                    f = this.q;
                                    if (f >= 0.0f && f <= f2) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean c() {
        float f = f() / g();
        float o = ((float) o()) / ((float) p());
        boolean z = true;
        Object obj = ((f <= 1.0f || o <= 1.0f) && (f >= 1.0f || o >= 1.0f)) ? null : 1;
        o = (float) this.x.surface.width;
        float f2 = (float) this.x.surface.height;
        double max;
        double d;
        double d2;
        if (obj == null || this.y) {
            max = (double) Math.max((int) Math.round(TrigonometryUtils.getDistanceBetweenTwoPoints(new Point(Math.round(this.l), Math.round(this.m)), new Point(Math.round(this.n), Math.round(this.o)))), (int) Math.round(TrigonometryUtils.getDistanceBetweenTwoPoints(new Point(Math.round(this.r), Math.round(this.s)), new Point(Math.round(this.p), Math.round(this.q)))));
            d = (double) o;
            d2 = b;
            Double.isNaN(d);
            if (max >= d * d2) {
                z = false;
            }
            return z;
        }
        d = (double) h().height();
        max = (double) f2;
        d2 = a;
        Double.isNaN(max);
        if (d >= max * d2) {
            z = false;
        }
        return z;
    }

    public float[] d() {
        return new float[]{this.e, this.f, this.c, this.d, this.g, this.h, this.i, this.j};
    }

    public int e() {
        return this.k;
    }

    public float f() {
        return this.t;
    }

    public void a(float f) {
        this.t = f;
    }

    public float g() {
        return this.u;
    }

    public void b(float f) {
        this.u = f;
    }

    public Rect h() {
        Rect rect = new Rect();
        rect.top = (int) MathUtils.min(this.o, this.m, this.s, this.q);
        rect.left = (int) MathUtils.min(this.n, this.l, this.r, this.p);
        rect.bottom = (int) MathUtils.max(this.o, this.m, this.s, this.q);
        rect.right = (int) MathUtils.max(this.n, this.l, this.p, this.r);
        return rect;
    }

    public Rect i() {
        Rect rect = new Rect();
        rect.top = (int) MathUtils.min(this.f, this.d, this.j, this.h);
        rect.left = (int) MathUtils.min(this.e, this.c, this.i, this.g);
        rect.bottom = (int) MathUtils.max(this.f, this.d, this.j, this.h);
        rect.right = (int) MathUtils.max(this.e, this.c, this.g, this.i);
        return rect;
    }

    public PointF j() {
        PointF pointF = new PointF();
        Vector2D vector2D = new Vector2D((double) this.n, (double) this.o);
        vector2D = vector2D.add(new Vector2D((double) this.p, (double) this.q).subtract(vector2D).scale(0.5d));
        pointF.x = (float) vector2D.getX();
        pointF.y = (float) vector2D.getY();
        return pointF;
    }

    private PointF a(PointF pointF, PreviewProperties previewProperties) {
        float f;
        float f2;
        int i = previewProperties.orientation;
        Object obj = null;
        Object obj2 = (i == 180 || i == 270) ? 1 : null;
        if (i == 90 || i == 270) {
            obj = 1;
        }
        float f3 = ((float) previewProperties.scaledPreview.width) / ((float) previewProperties.preview.width);
        float f4 = ((float) previewProperties.scaledPreview.height) / ((float) previewProperties.preview.height);
        float f5 = ((float) (previewProperties.scaledPreview.width - previewProperties.surface.width)) / 2.0f;
        float f6 = ((float) (previewProperties.scaledPreview.height - previewProperties.surface.height)) / 2.0f;
        if (obj != null) {
            if (obj2 != null) {
                f = (pointF.y * f3) - f5;
                f2 = (float) previewProperties.surface.height;
                f3 = pointF.x;
            } else {
                f = ((float) previewProperties.surface.width) - ((pointF.y * f3) - f5);
                f2 = pointF.x;
                f2 = (f2 * f4) - f6;
                pointF.x = f;
                pointF.y = f2;
                return pointF;
            }
        } else if (obj2 != null) {
            f = ((float) previewProperties.surface.width) - ((pointF.x * f3) - f5);
            f2 = (float) previewProperties.surface.height;
            f3 = pointF.y;
        } else {
            f = (pointF.x * f3) - f5;
            f2 = pointF.y;
            f2 = (f2 * f4) - f6;
            pointF.x = f;
            pointF.y = f2;
            return pointF;
        }
        f2 -= (f3 * f4) - f6;
        pointF.x = f;
        pointF.y = f2;
        return pointF;
    }

    public void a(PreviewProperties previewProperties, boolean z) {
        this.x = previewProperties;
        this.y = z;
        b((float) previewProperties.preview.height);
        a((float) previewProperties.preview.width);
        PointF a = a(new PointF(this.c, this.d), previewProperties);
        this.l = a.x;
        this.m = a.y;
        a = a(new PointF(this.e, this.f), previewProperties);
        this.n = a.x;
        this.o = a.y;
        a = a(new PointF(this.g, this.h), previewProperties);
        this.p = a.x;
        this.q = a.y;
        PointF a2 = a(new PointF(this.i, this.j), previewProperties);
        this.r = a2.x;
        this.s = a2.y;
    }

    public PointF k() {
        return new PointF(this.n, this.o);
    }

    public PointF l() {
        return new PointF(this.l, this.m);
    }

    public PointF m() {
        return new PointF(this.r, this.s);
    }

    public PointF n() {
        return new PointF(this.p, this.q);
    }

    public int o() {
        return this.v;
    }

    public int p() {
        return this.w;
    }

    public PreviewProperties q() {
        return this.x;
    }
}
