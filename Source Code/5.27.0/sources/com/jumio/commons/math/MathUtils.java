package com.jumio.commons.math;

import android.graphics.PointF;

public class MathUtils {
    public static double deg2rad(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static double rad2deg(double d) {
        return d * 57.29577951308232d;
    }

    public static PointF[] inflatePolygon(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, int i) {
        return inflatePolygon(new PointF[]{pointF, pointF2, pointF3, pointF4}, i);
    }

    public static PointF[] inflatePolygon(PointF[] pointFArr, int i) {
        PointF[] pointFArr2 = pointFArr;
        int i2 = i;
        if (i2 == 0) {
            return pointFArr2;
        }
        if (pointFArr2.length == 4) {
            float f = pointFArr2[0].x;
            float f2 = pointFArr2[0].y;
            float f3 = pointFArr2[1].x;
            float f4 = pointFArr2[1].y;
            float f5 = pointFArr2[2].x;
            float f6 = pointFArr2[2].y;
            float f7 = pointFArr2[3].x;
            float f8 = pointFArr2[3].y;
            PointF[] pointFArr3 = new PointF[4];
            Vector2D vector2D = new Vector2D(f, f2, f3, f4);
            float f9 = f7;
            double d = (double) i2;
            Vector2D add = vector2D.getNormalRight().unit().scale(d).add(f3, f4);
            float slope = vector2D.getSlope();
            double y = add.getY();
            pointFArr = pointFArr3;
            double d2 = (double) slope;
            double x = add.getX();
            Double.isNaN(d2);
            float f10 = (float) (y - (d2 * x));
            Vector2D vector2D2 = new Vector2D(f3, f4, f5, f6);
            Vector2D add2 = vector2D2.getNormalRight().unit().scale(d).add(f5, f6);
            float slope2 = vector2D2.getSlope();
            double y2 = add2.getY();
            float f11 = f5;
            double d3 = (double) slope2;
            x = add2.getX();
            Double.isNaN(d3);
            float f12 = (float) (y2 - (d3 * x));
            f3 = (f12 - f10) / (slope - slope2);
            pointFArr[1] = new PointF(f3, (slope2 * f3) + f12);
            f4 = f9;
            Vector2D vector2D3 = new Vector2D(f11, f6, f4, f8);
            Vector2D add3 = vector2D3.getNormalRight().unit().scale(d).add(f4, f8);
            float slope3 = vector2D3.getSlope();
            d3 = add3.getY();
            float f13 = slope;
            double d4 = (double) slope3;
            double x2 = add3.getX();
            Double.isNaN(d4);
            f3 = (float) (d3 - (d4 * x2));
            f12 = (f3 - f12) / (slope2 - slope3);
            pointFArr[2] = new PointF(f12, (slope3 * f12) + f3);
            vector2D2 = new Vector2D(f4, f8, f, f2);
            Vector2D add4 = vector2D2.getNormalRight().unit().scale(d).add(f, f2);
            slope2 = vector2D2.getSlope();
            double y3 = add4.getY();
            double d5 = (double) slope2;
            d = add4.getX();
            Double.isNaN(d5);
            f8 = (float) (y3 - (d5 * d));
            f12 = (f8 - f3) / (slope3 - slope2);
            pointFArr[3] = new PointF(f12, (slope2 * f12) + f8);
            f8 = (f10 - f8) / (slope2 - f13);
            pointFArr[0] = new PointF(f8, (f13 * f8) + f10);
            return pointFArr;
        }
        throw new IllegalArgumentException("Only quadrangular polygons are supported at the moment!");
    }

    public static float min(float... fArr) {
        int i = 0;
        float f = fArr[0];
        int length = fArr.length;
        while (i < length) {
            f = Math.min(f, fArr[i]);
            i++;
        }
        return f;
    }

    public static float max(float... fArr) {
        int i = 0;
        float f = fArr[0];
        int length = fArr.length;
        while (i < length) {
            f = Math.max(f, fArr[i]);
            i++;
        }
        return f;
    }
}
