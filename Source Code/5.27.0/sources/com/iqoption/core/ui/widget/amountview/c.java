package com.iqoption.core.ui.widget.amountview;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AmountViewColumnManager */
class c {
    private final d bLT;
    final ArrayList<b> bMB = new ArrayList();
    private Set<Character> bMC;
    private a[] bMn;

    c(d dVar) {
        this.bLT = dVar;
    }

    /* Access modifiers changed, original: varargs */
    public void setCharacterLists(String... strArr) {
        this.bMn = new a[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.bMn[i] = new a(strArr[i]);
        }
        this.bMC = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            this.bMC.addAll(this.bMn[i2].amo());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public a[] amu() {
        return this.bMn;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(char[] cArr) {
        if (this.bMn != null) {
            int i = 0;
            while (i < this.bMB.size()) {
                if (((b) this.bMB.get(i)).amq() > 0.0f) {
                    i++;
                } else {
                    this.bMB.remove(i);
                }
            }
            int[] a = f.a(amv(), cArr, this.bMC);
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < a.length; i4++) {
                int i5 = a[i4];
                if (i5 != 0) {
                    if (i5 == 1) {
                        this.bMB.add(i2, new b(this.bMn, this.bLT));
                    } else if (i5 == 2) {
                        ((b) this.bMB.get(i2)).C(0);
                        i2++;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown action: ");
                        stringBuilder.append(a[i4]);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                ((b) this.bMB.get(i2)).C(cArr[i3]);
                i2++;
                i3++;
            }
            return;
        }
        throw new IllegalStateException("Need to call #setCharacterLists first.");
    }

    /* Access modifiers changed, original: 0000 */
    public void onAnimationEnd() {
        int size = this.bMB.size();
        for (int i = 0; i < size; i++) {
            ((b) this.bMB.get(i)).onAnimationEnd();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setAnimationProgress(float f) {
        int size = this.bMB.size();
        for (int i = 0; i < size; i++) {
            ((b) this.bMB.get(i)).setAnimationProgress(f);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float amr() {
        float f = 0.0f;
        for (int i = 0; i < this.bMB.size(); i++) {
            f += ((b) this.bMB.get(i)).amr();
        }
        return f;
    }

    /* Access modifiers changed, original: 0000 */
    public float amq() {
        float f = 0.0f;
        for (int i = 0; i < this.bMB.size(); i++) {
            f += ((b) this.bMB.get(i)).amq();
        }
        return f;
    }

    /* Access modifiers changed, original: 0000 */
    public char[] amv() {
        int size = this.bMB.size();
        char[] cArr = new char[size];
        for (int i = 0; i < size; i++) {
            cArr[i] = ((b) this.bMB.get(i)).yP();
        }
        return cArr;
    }

    /* Access modifiers changed, original: 0000 */
    public void draw(Canvas canvas, Paint paint) {
        int size = this.bMB.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.bMB.get(i);
            bVar.draw(canvas, paint);
            canvas.translate(bVar.amq(), 0.0f);
        }
    }
}
