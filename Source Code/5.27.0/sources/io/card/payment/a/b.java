package io.card.payment.a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;

/* compiled from: Appearance */
public class b {
    public static final int[] eLA = new int[]{16842919, 16842910};
    public static final int[] eLB = new int[]{16842910};
    public static final int[] eLC = new int[]{-16842910};
    public static final int[] eLD = new int[]{16842908};
    public static final int eLE = Color.parseColor("#003087");
    public static final int eLF = Color.parseColor("#009CDE");
    public static final int eLG = Color.parseColor("#aa009CDE");
    public static final Drawable eLH;
    public static final int eLI;
    public static final int eLJ = eLF;
    public static final int eLK = eLG;
    public static final int eLL = eLE;
    public static final int eLM = Color.parseColor("#c5ddeb");
    public static final int eLN;
    public static final int eLO = Color.parseColor("#aa717074");
    public static final int eLP = Color.parseColor("#5a5a5d");
    public static final int eLQ;
    public static final int eLR = Color.parseColor("#515151");
    public static final int eLS = Color.parseColor("#b32317");
    public static final int eLT = eLR;
    public static final Typeface eLU = biS();

    static {
        String str = "#717074";
        eLH = new ColorDrawable(Color.parseColor(str));
        String str2 = "#f5f5f5";
        eLI = Color.parseColor(str2);
        eLN = Color.parseColor(str);
        eLQ = Color.parseColor(str2);
    }

    public static Drawable bV(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(eLA, new ColorDrawable(eLL));
        stateListDrawable.addState(eLC, new ColorDrawable(eLM));
        stateListDrawable.addState(eLD, bY(context));
        stateListDrawable.addState(eLB, bX(context));
        return stateListDrawable;
    }

    private static float bW(Context context) {
        return (c.e("4dip", context) / 2.0f) * context.getResources().getDisplayMetrics().density;
    }

    private static Drawable bX(Context context) {
        return i(eLJ, bW(context));
    }

    private static Drawable bY(Context context) {
        return d(eLJ, eLK, bW(context));
    }

    public static Drawable bZ(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(eLA, new ColorDrawable(eLP));
        stateListDrawable.addState(eLC, new ColorDrawable(eLQ));
        stateListDrawable.addState(eLD, cb(context));
        stateListDrawable.addState(eLB, ca(context));
        return stateListDrawable;
    }

    private static Drawable ca(Context context) {
        return i(eLN, bW(context));
    }

    private static Drawable cb(Context context) {
        return d(eLN, eLO, bW(context));
    }

    private static Drawable i(int i, float f) {
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = new ColorDrawable(i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setStrokeWidth(f * 2.0f);
        shapeDrawable.getPaint().setStyle(Style.STROKE);
        shapeDrawable.getPaint().setColor(eLI);
        drawableArr[1] = shapeDrawable;
        return new LayerDrawable(drawableArr);
    }

    private static Drawable d(int i, int i2, float f) {
        Drawable[] drawableArr = new Drawable[3];
        drawableArr[0] = new ColorDrawable(i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setStrokeWidth(2.0f * f);
        shapeDrawable.getPaint().setStyle(Style.STROKE);
        shapeDrawable.getPaint().setColor(eLI);
        drawableArr[1] = shapeDrawable;
        shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setStrokeWidth(f);
        shapeDrawable.getPaint().setStyle(Style.STROKE);
        shapeDrawable.getPaint().setColor(i2);
        drawableArr[2] = shapeDrawable;
        return new LayerDrawable(drawableArr);
    }

    private static Typeface biS() {
        return Typeface.create("sans-serif-light", 0);
    }
}
