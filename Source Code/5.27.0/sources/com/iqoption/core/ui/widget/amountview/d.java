package com.iqoption.core.ui.widget.amountview;

import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AmountViewDrawMetrics */
class d {
    private final Paint bLS;
    private final Map<Character, Float> bMD = new HashMap(256);
    private float bME;
    private float bMt;

    d(Paint paint) {
        this.bLS = paint;
        invalidate();
    }

    /* Access modifiers changed, original: 0000 */
    public void invalidate() {
        this.bMD.clear();
        FontMetrics fontMetrics = this.bLS.getFontMetrics();
        this.bMt = fontMetrics.bottom - fontMetrics.top;
        this.bME = -fontMetrics.top;
    }

    /* Access modifiers changed, original: 0000 */
    public float D(char c) {
        if (c == 0) {
            return 0.0f;
        }
        Float f = (Float) this.bMD.get(Character.valueOf(c));
        if (f != null) {
            return f.floatValue();
        }
        float measureText = this.bLS.measureText(Character.toString(c));
        this.bMD.put(Character.valueOf(c), Float.valueOf(measureText));
        return measureText;
    }

    /* Access modifiers changed, original: 0000 */
    public float amw() {
        return this.bMt;
    }

    /* Access modifiers changed, original: 0000 */
    public float amx() {
        return this.bME;
    }
}
