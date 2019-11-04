package com.google.android.material.a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: MatrixEvaluator */
public class g implements TypeEvaluator<Matrix> {
    private final float[] DU = new float[9];
    private final float[] DV = new float[9];
    private final Matrix DW = new Matrix();

    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.DU);
        matrix2.getValues(this.DV);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.DV;
            float f2 = fArr[i];
            float[] fArr2 = this.DU;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.DW.setValues(this.DV);
        return this.DW;
    }
}
