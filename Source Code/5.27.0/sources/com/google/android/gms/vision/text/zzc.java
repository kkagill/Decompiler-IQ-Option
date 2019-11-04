package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzy;

final class zzc {
    static Rect zza(Text text) {
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (Point point : text.getCornerPoints()) {
            i = Math.min(i, point.x);
            i3 = Math.max(i3, point.x);
            i2 = Math.min(i2, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i, i2, i3, i4);
    }

    static Point[] zza(zzy zzy) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians((double) zzy.zzfb));
        double cos = Math.cos(Math.toRadians((double) zzy.zzfb));
        pointArr[0] = new Point(zzy.left, zzy.top);
        double d = (double) zzy.left;
        double d2 = (double) zzy.width;
        Double.isNaN(d2);
        d2 *= cos;
        Double.isNaN(d);
        int i = (int) (d + d2);
        double d3 = (double) zzy.top;
        double d4 = (double) zzy.width;
        Double.isNaN(d4);
        d4 *= sin;
        Double.isNaN(d3);
        pointArr[1] = new Point(i, (int) (d3 + d4));
        d3 = (double) pointArr[1].x;
        d4 = (double) zzy.height;
        Double.isNaN(d4);
        d4 *= sin;
        Double.isNaN(d3);
        int i2 = (int) (d3 - d4);
        d3 = (double) pointArr[1].y;
        d4 = (double) zzy.height;
        Double.isNaN(d4);
        d4 *= cos;
        Double.isNaN(d3);
        pointArr[2] = new Point(i2, (int) (d3 + d4));
        pointArr[3] = new Point(pointArr[0].x + (pointArr[2].x - pointArr[1].x), pointArr[0].y + (pointArr[2].y - pointArr[1].y));
        return pointArr;
    }
}
