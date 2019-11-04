package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.core.view.ViewCompat;
import com.google.android.material.a.f;
import com.google.android.material.a.k;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements a {
    private TextView Nr;
    private Button Ns;
    private int Nt;
    private int maxWidth;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.SnackbarLayout);
        this.maxWidth = obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_android_maxWidth, -1);
        this.Nt = obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.Nr = (TextView) findViewById(f.snackbar_text);
        this.Ns = (Button) findViewById(f.snackbar_action);
    }

    public TextView getMessageView() {
        return this.Nr;
    }

    public Button getActionView() {
        return this.Ns;
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing block: B:15:0x0053, code skipped:
            if (e(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Missing block: B:19:0x005e, code skipped:
            if (e(0, r0, r0) != false) goto L_0x0062;
     */
    public void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        super.onMeasure(r8, r9);
        r0 = r7.maxWidth;
        if (r0 <= 0) goto L_0x0018;
    L_0x0007:
        r0 = r7.getMeasuredWidth();
        r1 = r7.maxWidth;
        if (r0 <= r1) goto L_0x0018;
    L_0x000f:
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8);
        super.onMeasure(r8, r9);
    L_0x0018:
        r0 = r7.getResources();
        r1 = com.google.android.material.a.d.design_snackbar_padding_vertical_2lines;
        r0 = r0.getDimensionPixelSize(r1);
        r1 = r7.getResources();
        r2 = com.google.android.material.a.d.design_snackbar_padding_vertical;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = r7.Nr;
        r2 = r2.getLayout();
        r2 = r2.getLineCount();
        r3 = 0;
        r4 = 1;
        if (r2 <= r4) goto L_0x003c;
    L_0x003a:
        r2 = 1;
        goto L_0x003d;
    L_0x003c:
        r2 = 0;
    L_0x003d:
        if (r2 == 0) goto L_0x0056;
    L_0x003f:
        r5 = r7.Nt;
        if (r5 <= 0) goto L_0x0056;
    L_0x0043:
        r5 = r7.Ns;
        r5 = r5.getMeasuredWidth();
        r6 = r7.Nt;
        if (r5 <= r6) goto L_0x0056;
    L_0x004d:
        r1 = r0 - r1;
        r0 = r7.e(r4, r0, r1);
        if (r0 == 0) goto L_0x0061;
    L_0x0055:
        goto L_0x0062;
    L_0x0056:
        if (r2 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005a;
    L_0x0059:
        r0 = r1;
    L_0x005a:
        r0 = r7.e(r3, r0, r0);
        if (r0 == 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0062;
    L_0x0061:
        r4 = 0;
    L_0x0062:
        if (r4 == 0) goto L_0x0067;
    L_0x0064:
        super.onMeasure(r8, r9);
    L_0x0067:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    private boolean e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.Nr.getPaddingTop() == i2 && this.Nr.getPaddingBottom() == i3) {
            return z;
        }
        b(this.Nr, i2, i3);
        return true;
    }

    private static void b(View view, int i, int i2) {
        if (ViewCompat.isPaddingRelative(view)) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    public void m(int i, int i2) {
        this.Nr.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.Nr.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.Ns.getVisibility() == 0) {
            this.Ns.setAlpha(0.0f);
            this.Ns.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void n(int i, int i2) {
        this.Nr.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.Nr.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.Ns.getVisibility() == 0) {
            this.Ns.setAlpha(1.0f);
            this.Ns.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
