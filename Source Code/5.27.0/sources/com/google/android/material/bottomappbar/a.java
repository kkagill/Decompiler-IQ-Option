package com.google.android.material.bottomappbar;

import com.google.android.material.i.b;
import com.google.android.material.i.d;

/* compiled from: BottomAppBarTopEdgeTreatment */
public class a extends b {
    private float Gt;
    private float Gu;
    private float Gv;
    private float Gw;
    private float Gx;

    public void a(float f, float f2, d dVar) {
        float f3 = f;
        d dVar2 = dVar;
        float f4 = this.Gv;
        if (f4 == 0.0f) {
            dVar2.lineTo(f3, 0.0f);
            return;
        }
        float f5 = ((this.Gu * 2.0f) + f4) / 2.0f;
        float f6 = f2 * this.Gt;
        float f7 = (f3 / 2.0f) + this.Gx;
        float f8 = (this.Gw * f2) + ((1.0f - f2) * f5);
        if (f8 / f5 >= 1.0f) {
            dVar2.lineTo(f3, 0.0f);
            return;
        }
        f4 = f5 + f6;
        float f9 = f8 + f6;
        f4 = (float) Math.sqrt((double) ((f4 * f4) - (f9 * f9)));
        float f10 = f7 - f4;
        float f11 = f7 + f4;
        float toDegrees = (float) Math.toDegrees(Math.atan((double) (f4 / f9)));
        float f12 = 90.0f - toDegrees;
        f9 = f10 - f6;
        dVar2.lineTo(f9, 0.0f);
        float f13 = f6 * 2.0f;
        float f14 = toDegrees;
        dVar.addArc(f9, 0.0f, f10 + f6, f13, 270.0f, toDegrees);
        dVar.addArc(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f12, (f12 * 2.0f) - 180.0f);
        dVar.addArc(f11 - f6, 0.0f, f11 + f6, f13, 270.0f - f14, f14);
        dVar2.lineTo(f3, 0.0f);
    }

    /* Access modifiers changed, original: 0000 */
    public void p(float f) {
        this.Gx = f;
    }

    /* Access modifiers changed, original: 0000 */
    public float mV() {
        return this.Gx;
    }

    /* Access modifiers changed, original: 0000 */
    public float getCradleVerticalOffset() {
        return this.Gw;
    }

    /* Access modifiers changed, original: 0000 */
    public void setCradleVerticalOffset(float f) {
        this.Gw = f;
    }

    /* Access modifiers changed, original: 0000 */
    public float mW() {
        return this.Gv;
    }

    /* Access modifiers changed, original: 0000 */
    public void q(float f) {
        this.Gv = f;
    }

    /* Access modifiers changed, original: 0000 */
    public float getFabCradleMargin() {
        return this.Gu;
    }

    /* Access modifiers changed, original: 0000 */
    public void setFabCradleMargin(float f) {
        this.Gu = f;
    }

    /* Access modifiers changed, original: 0000 */
    public float getFabCradleRoundedCornerRadius() {
        return this.Gt;
    }

    /* Access modifiers changed, original: 0000 */
    public void setFabCradleRoundedCornerRadius(float f) {
        this.Gt = f;
    }
}
