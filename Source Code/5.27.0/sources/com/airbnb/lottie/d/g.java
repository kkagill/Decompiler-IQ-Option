package com.airbnb.lottie.d;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.model.a;
import com.airbnb.lottie.model.content.h;
import com.airbnb.lottie.model.d;
import java.util.List;

/* compiled from: MiscUtils */
public class g {
    private static PointF kf = new PointF();

    public static double a(double d, double d2, @FloatRange(from = 0.0d, to = 1.0d) double d3) {
        return d + (d3 * (d2 - d));
    }

    public static int b(int i, int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    public static boolean b(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static float lerp(float f, float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    public static PointF b(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void a(h hVar, Path path) {
        path.reset();
        PointF cb = hVar.cb();
        path.moveTo(cb.x, cb.y);
        kf.set(cb.x, cb.y);
        for (int i = 0; i < hVar.cc().size(); i++) {
            a aVar = (a) hVar.cc().get(i);
            PointF be = aVar.be();
            PointF bf = aVar.bf();
            PointF bg = aVar.bg();
            if (be.equals(kf) && bf.equals(bg)) {
                path.lineTo(bg.x, bg.y);
            } else {
                path.cubicTo(be.x, be.y, bf.x, bf.y, bg.x, bg.y);
            }
            kf.set(bg.x, bg.y);
        }
        if (hVar.isClosed()) {
            path.close();
        }
    }

    static int g(float f, float f2) {
        return floorMod((int) f, (int) f2);
    }

    private static int floorMod(int i, int i2) {
        return i - (i2 * floorDiv(i, i2));
    }

    private static int floorDiv(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0 ? 1 : null) != null || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void a(d dVar, int i, List<d> list, d dVar2, k kVar) {
        if (dVar.c(kVar.getName(), i)) {
            list.add(dVar2.x(kVar.getName()).a(kVar));
        }
    }
}
