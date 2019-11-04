package com.airbnb.lottie.c;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.IntRange;
import com.airbnb.lottie.d.g;
import com.airbnb.lottie.model.content.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientColorParser */
public class l implements aj<c> {
    private int jL;

    public l(int i) {
        this.jL = i;
    }

    /* renamed from: e */
    public c b(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        Object obj = jsonReader.peek() == JsonToken.BEGIN_ARRAY ? 1 : null;
        if (obj != null) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (obj != null) {
            jsonReader.endArray();
        }
        if (this.jL == -1) {
            this.jL = arrayList.size() / 4;
        }
        int i = this.jL;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.jL * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        c cVar = new c(fArr, iArr);
        a(cVar, arrayList);
        return cVar;
    }

    private void a(c cVar, List<Float> list) {
        int i = this.jL * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) ((Float) list.get(i)).floatValue();
                } else {
                    dArr2[i2] = (double) ((Float) list.get(i)).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < cVar.getSize(); i3++) {
                int i4 = cVar.getColors()[i3];
                cVar.getColors()[i3] = Color.argb(a((double) cVar.bD()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    @IntRange(from = 0, to = 255)
    private int a(double d, double[] dArr, double[] dArr2) {
        double a;
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        for (int i = 1; i < dArr3.length; i++) {
            int i2 = i - 1;
            double d2 = dArr3[i2];
            double d3 = dArr3[i];
            if (dArr3[i] >= d) {
                a = g.a(dArr4[i2], dArr4[i], (d - d2) / (d3 - d2));
                break;
            }
        }
        a = dArr4[dArr4.length - 1];
        return (int) (a * 255.0d);
    }
}
