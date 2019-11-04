package com.iqoption.tradinghistory.materialcalendar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import com.iqoption.tradinghistory.g.b;
import com.iqoption.tradinghistory.materialcalendar.a.e;

@SuppressLint({"ViewConstructor"})
/* compiled from: DayView */
class h extends AppCompatCheckedTextView {
    private b dZA;
    private int dZB;
    private final int dZC = getResources().getDimensionPixelSize(b.dp2);
    private final int dZD = 200;
    private Drawable dZE = null;
    private Drawable dZF;
    private Drawable dZG;
    private e dZH = e.eaM;
    private boolean dZI = true;
    private boolean dZJ = true;
    private boolean dZK = false;
    private final Rect dZL = new Rect();
    private int dZl = 4;

    /* Access modifiers changed, original: 0000 */
    public void a(j jVar) {
    }

    public h(Context context, b bVar) {
        super(context);
        setGravity(17);
        setTextAlignment(4);
        f(bVar);
    }

    public void f(b bVar) {
        this.dZA = bVar;
        setText(getLabel());
    }

    public void setDayFormatter(e eVar) {
        if (eVar == null) {
            eVar = e.eaM;
        }
        this.dZH = eVar;
        CharSequence text = getText();
        Object[] objArr = null;
        if (text instanceof Spanned) {
            objArr = ((Spanned) text).getSpans(0, text.length(), Object.class);
        }
        SpannableString spannableString = new SpannableString(getLabel());
        if (objArr != null) {
            for (Object span : objArr) {
                spannableString.setSpan(span, 0, spannableString.length(), 33);
            }
        }
        setText(spannableString);
    }

    @NonNull
    public String getLabel() {
        return this.dZH.n(this.dZA);
    }

    public void setSelectionColor(int i) {
        this.dZB = i;
        aWv();
    }

    public b aWt() {
        return this.dZA;
    }

    private void aWu() {
        int i = 0;
        int i2 = (this.dZJ && this.dZI && !this.dZK) ? 1 : 0;
        boolean z = this.dZI && !this.dZK;
        super.setEnabled(z);
        z = MaterialCalendarView.hk(this.dZl);
        Object obj = (MaterialCalendarView.hl(this.dZl) || z) ? 1 : null;
        boolean hm = MaterialCalendarView.hm(this.dZl);
        if (!this.dZJ && z) {
            i2 = 1;
        }
        if (!(this.dZI || obj == null)) {
            i2 |= this.dZJ;
        }
        if (this.dZK && hm) {
            int i3 = (this.dZJ && this.dZI) ? 1 : 0;
            i2 |= i3;
        }
        if (!(this.dZJ || i2 == 0)) {
            setTextColor(getTextColors().getColorForState(new int[]{-16842910}, -7829368));
        }
        if (i2 == 0) {
            i = 4;
        }
        setVisibility(i);
    }

    /* Access modifiers changed, original: protected */
    public void b(int i, boolean z, boolean z2) {
        this.dZl = i;
        this.dZJ = z2;
        this.dZI = z;
        aWu();
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(@NonNull Canvas canvas) {
        Drawable drawable = this.dZE;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            this.dZE.draw(canvas);
        }
        drawable = this.dZG;
        if (drawable != null) {
            drawable.setBounds(this.dZL);
        }
        super.onDraw(canvas);
    }

    private void aWv() {
        Drawable drawable = this.dZF;
        if (drawable != null) {
            setBackground(drawable);
            return;
        }
        this.dZG = a(this.dZB, 200, this.dZL);
        setBackground(this.dZG);
    }

    private static Drawable a(int i, int i2, Rect rect) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(i2);
        stateListDrawable.addState(new int[]{16842912}, hj(i));
        stateListDrawable.addState(new int[]{16842919}, hj(i));
        stateListDrawable.addState(new int[0], hj(0));
        return stateListDrawable;
    }

    private static Drawable hj(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        aD(i3 - i, i4 - i2);
    }

    private void aD(int i, int i2) {
        int min = Math.min(i2, i) - this.dZC;
        i = Math.abs(i - min) / 2;
        i2 = Math.abs(i2 - min) / 2;
        Object obj = VERSION.SDK_INT == 21 ? 1 : null;
        if (obj != null) {
            i /= 2;
        }
        if (obj != null) {
            i2 /= 2;
        }
        this.dZL.set(i, i2, min + i, min + i2);
    }
}
