package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzae;
import com.google.android.gms.internal.vision.zzy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class TextBlock implements Text {
    private Point[] cornerPoints;
    private zzae[] zzev;
    private List<Line> zzew;
    private String zzex;
    private Rect zzey;

    TextBlock(SparseArray<zzae> sparseArray) {
        this.zzev = new zzae[sparseArray.size()];
        int i = 0;
        while (true) {
            zzae[] zzaeArr = this.zzev;
            if (i < zzaeArr.length) {
                zzaeArr[i] = (zzae) sparseArray.valueAt(i);
                i++;
            } else {
                return;
            }
        }
    }

    public String getLanguage() {
        String str = this.zzex;
        if (str != null) {
            return str;
        }
        HashMap hashMap = new HashMap();
        for (zzae zzae : this.zzev) {
            hashMap.put(zzae.zzex, Integer.valueOf((hashMap.containsKey(zzae.zzex) ? ((Integer) hashMap.get(zzae.zzex)).intValue() : 0) + 1));
        }
        this.zzex = (String) ((Entry) Collections.max(hashMap.entrySet(), new zza(this))).getKey();
        str = this.zzex;
        if (str == null || str.isEmpty()) {
            this.zzex = "und";
        }
        return this.zzex;
    }

    public String getValue() {
        zzae[] zzaeArr = this.zzev;
        if (zzaeArr.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(zzaeArr[0].zzfg);
        for (int i = 1; i < this.zzev.length; i++) {
            stringBuilder.append("\n");
            stringBuilder.append(this.zzev[i].zzfg);
        }
        return stringBuilder.toString();
    }

    public Point[] getCornerPoints() {
        TextBlock textBlock;
        TextBlock textBlock2 = this;
        if (textBlock2.cornerPoints == null) {
            int i = 0;
            if (textBlock2.zzev.length == 0) {
                textBlock2.cornerPoints = new Point[0];
            } else {
                zzae[] zzaeArr;
                double sin;
                int i2;
                double cos;
                int i3 = Integer.MAX_VALUE;
                int i4 = 0;
                int i5 = Integer.MAX_VALUE;
                int i6 = Integer.MIN_VALUE;
                int i7 = Integer.MIN_VALUE;
                while (true) {
                    zzaeArr = textBlock2.zzev;
                    if (i4 >= zzaeArr.length) {
                        break;
                    }
                    zzy zzy = zzaeArr[i4].zzfd;
                    zzy zzy2 = textBlock2.zzev[i].zzfd;
                    int i8 = -zzy2.left;
                    int i9 = -zzy2.top;
                    sin = Math.sin(Math.toRadians((double) zzy2.zzfb));
                    i2 = i8;
                    cos = Math.cos(Math.toRadians((double) zzy2.zzfb));
                    Point[] pointArr = new Point[4];
                    pointArr[i] = new Point(zzy.left, zzy.top);
                    pointArr[i].offset(i2, i9);
                    double d = (double) pointArr[i].x;
                    Double.isNaN(d);
                    d *= cos;
                    i2 = i3;
                    double d2 = (double) pointArr[i].y;
                    Double.isNaN(d2);
                    int i10 = (int) (d + (d2 * sin));
                    d = (double) (-pointArr[0].x);
                    Double.isNaN(d);
                    d *= sin;
                    sin = (double) pointArr[0].y;
                    Double.isNaN(sin);
                    i3 = (int) (d + (sin * cos));
                    pointArr[0].x = i10;
                    pointArr[0].y = i3;
                    pointArr[1] = new Point(zzy.width + i10, i3);
                    pointArr[2] = new Point(zzy.width + i10, zzy.height + i3);
                    pointArr[3] = new Point(i10, i3 + zzy.height);
                    i3 = i2;
                    for (i10 = 0; i10 < 4; i10++) {
                        Point point = pointArr[i10];
                        i3 = Math.min(i3, point.x);
                        i6 = Math.max(i6, point.x);
                        i5 = Math.min(i5, point.y);
                        i7 = Math.max(i7, point.y);
                    }
                    i4++;
                    i = 0;
                    textBlock2 = this;
                }
                i2 = i3;
                zzy zzy3 = zzaeArr[0].zzfd;
                i4 = zzy3.left;
                i = zzy3.top;
                double sin2 = Math.sin(Math.toRadians((double) zzy3.zzfb));
                sin = Math.cos(Math.toRadians((double) zzy3.zzfb));
                r3 = new Point[4];
                int i11 = i2;
                int i12 = 0;
                r3[0] = new Point(i11, i5);
                r3[1] = new Point(i6, i5);
                r3[2] = new Point(i6, i7);
                r3[3] = new Point(i11, i7);
                while (i12 < 4) {
                    double d3 = (double) r3[i12].x;
                    Double.isNaN(d3);
                    d3 *= sin;
                    cos = (double) r3[i12].y;
                    Double.isNaN(cos);
                    i5 = (int) (d3 - (cos * sin2));
                    double d4 = (double) r3[i12].x;
                    Double.isNaN(d4);
                    d4 *= sin2;
                    cos = (double) r3[i12].y;
                    Double.isNaN(cos);
                    i6 = (int) (d4 + (cos * sin));
                    r3[i12].x = i5;
                    r3[i12].y = i6;
                    r3[i12].offset(i4, i);
                    i12++;
                }
                textBlock = this;
                textBlock.cornerPoints = r3;
                return textBlock.cornerPoints;
            }
        }
        textBlock = textBlock2;
        return textBlock.cornerPoints;
    }

    public List<? extends Text> getComponents() {
        zzae[] zzaeArr = this.zzev;
        int i = 0;
        if (zzaeArr.length == 0) {
            return new ArrayList(0);
        }
        if (this.zzew == null) {
            this.zzew = new ArrayList(zzaeArr.length);
            zzaeArr = this.zzev;
            int length = zzaeArr.length;
            while (i < length) {
                this.zzew.add(new Line(zzaeArr[i]));
                i++;
            }
        }
        return this.zzew;
    }

    public Rect getBoundingBox() {
        if (this.zzey == null) {
            this.zzey = zzc.zza((Text) this);
        }
        return this.zzey;
    }
}
