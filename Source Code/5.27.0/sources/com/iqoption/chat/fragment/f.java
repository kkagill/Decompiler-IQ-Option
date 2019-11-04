package com.iqoption.chat.fragment;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextPaint;
import com.iqoption.chat.e;
import com.iqoption.chat.e.c;
import com.iqoption.chat.e.d;
import com.iqoption.core.j;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002?@B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0002J\u0011\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0001J\u0011\u0010&\u001a\u00020'2\u0006\u0010%\u001a\u00020$H\u0001J\u0011\u0010(\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$H\u0001J\u0011\u0010)\u001a\u00020*2\u0006\u0010%\u001a\u00020$H\u0001J\b\u0010+\u001a\u00020$H\u0016J\b\u0010,\u001a\u00020$H\u0016J\b\u0010-\u001a\u00020$H\u0016J\u0011\u0010.\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0001J\u0011\u0010/\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0001J\u0011\u00100\u001a\u0002012\u0006\u0010%\u001a\u00020$H\u0001J*\u00100\u001a\u0002012\u0006\u0010%\u001a\u00020$2\u0012\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020403\"\u000204H\u0001¢\u0006\u0002\u00105J\t\u00106\u001a\u000207H\u0001J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020$H\u0016J\u0012\u0010:\u001a\u00020\u001f2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0011\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u0013H\u0001R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, bng = {"Lcom/iqoption/chat/fragment/DateDrawable;", "Landroid/graphics/drawable/Drawable;", "Lcom/iqoption/core/Resourcer;", "resourcer", "dateComparator", "Lcom/iqoption/chat/util/DateComparator;", "(Lcom/iqoption/core/Resourcer;Lcom/iqoption/chat/util/DateComparator;)V", "value", "", "date", "getDate", "()J", "setDate", "(J)V", "dateFormat", "Ljava/text/SimpleDateFormat;", "datePadding", "Landroid/graphics/RectF;", "dateRadius", "", "dateRect", "dateText", "", "dateYearFormat", "fontMetrics", "Lcom/iqoption/chat/fragment/DateDrawable$FontMetrics;", "rectPaint", "Landroid/graphics/Paint;", "textPaint", "Landroid/text/TextPaint;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "formatDate", "getColor", "", "resId", "getColors", "Landroid/content/res/ColorStateList;", "getDrawable", "getFont", "Landroid/graphics/Typeface;", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "getPixels", "getPixelsInt", "getString", "", "args", "", "", "(I[Ljava/lang/Object;)Ljava/lang/CharSequence;", "getViewConfiguration", "Landroid/view/ViewConfiguration;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "toPixels", "dp", "Companion", "FontMetrics", "chat_release"})
/* compiled from: DateDrawable.kt */
public final class f extends Drawable implements j {
    private static final long aSP = TimeUnit.DAYS.toMillis(1);
    public static final a aSQ = new a();
    private final TextPaint Kj;
    private final SimpleDateFormat aQc = new SimpleDateFormat("MMMM d yyyy", Locale.getDefault());
    private long aSH;
    private final Paint aSI;
    private final b aSJ;
    private String aSK;
    private final float aSL;
    private final RectF aSM;
    private final RectF aSN;
    private final com.iqoption.chat.e.b aSO;
    private final /* synthetic */ j aSR;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d", Locale.getDefault());

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/chat/fragment/DateDrawable$Companion;", "", "()V", "DAY", "", "chat_release"})
    /* compiled from: DateDrawable.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0012"}, bng = {"Lcom/iqoption/chat/fragment/DateDrawable$FontMetrics;", "Landroid/graphics/Paint$FontMetrics;", "paint", "Landroid/graphics/Paint;", "(Landroid/graphics/Paint;)V", "height", "", "getHeight", "()F", "setHeight", "(F)V", "width", "getWidth", "setWidth", "update", "", "text", "", "chat_release"})
    /* compiled from: DateDrawable.kt */
    private static final class b extends FontMetrics {
        private final Paint fh;
        private float height;
        private float width;

        public b(Paint paint) {
            kotlin.jvm.internal.i.f(paint, "paint");
            this.fh = paint;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getHeight() {
            return this.height;
        }

        public final void eZ(String str) {
            kotlin.jvm.internal.i.f(str, "text");
            this.width = this.fh.measureText(str);
            this.fh.getFontMetrics(this);
            this.height = this.descent - this.ascent;
        }
    }

    public CharSequence eA(int i) {
        return this.aSR.eA(i);
    }

    public ColorStateList ex(int i) {
        return this.aSR.ex(i);
    }

    public float ey(int i) {
        return this.aSR.ey(i);
    }

    public int ez(int i) {
        return this.aSR.ez(i);
    }

    public int getColor(int i) {
        return this.aSR.getColor(i);
    }

    public Drawable getDrawable(int i) {
        return this.aSR.getDrawable(i);
    }

    public Typeface getFont(int i) {
        return this.aSR.getFont(i);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public f(j jVar, com.iqoption.chat.e.b bVar) {
        kotlin.jvm.internal.i.f(jVar, "resourcer");
        kotlin.jvm.internal.i.f(bVar, "dateComparator");
        this.aSR = jVar;
        this.aSO = bVar;
        Paint paint = new Paint(1);
        paint.setColor(getColor(c.chat_date_badge_bg));
        this.aSI = paint;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(getColor(c.chat_date_badge_text));
        textPaint.setTypeface(getFont(com.iqoption.chat.e.f.bold));
        textPaint.setTextSize(ey(d.sp12));
        if (VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(0.02f);
        }
        this.Kj = textPaint;
        this.aSJ = new b(this.Kj);
        this.aSK = "";
        this.aSL = ey(d.dp13);
        this.aSM = new RectF(ey(d.dp11), ey(d.dp6), ey(d.dp11), ey(d.dp7));
        this.aSN = new RectF();
    }

    public final long getDate() {
        return this.aSH;
    }

    public final void setDate(long j) {
        long j2 = aSP;
        j = (j / j2) * j2;
        if (this.aSH != j) {
            this.aSH = j;
            String ay = ay(j);
            this.aSJ.eZ(ay);
            this.aSK = ay;
            RectF rectF = this.aSN;
            rectF.set(0.0f, 0.0f, this.aSJ.getWidth(), this.aSJ.getHeight());
            float f = rectF.right;
            RectF rectF2 = this.aSM;
            rectF.right = f + (rectF2.left + rectF2.right);
            f = rectF.bottom;
            rectF2 = this.aSM;
            rectF.bottom = f + (rectF2.top + rectF2.bottom);
            invalidateSelf();
        }
    }

    private final String ay(long j) {
        Object eA;
        if (this.aSO.isToday(j)) {
            eA = eA(e.j.today);
        } else if (this.aSO.aA(j)) {
            eA = eA(e.j.yesterday);
        } else if (this.aSO.aB(j)) {
            eA = this.dateFormat.format(Long.valueOf(j));
        } else {
            eA = this.aQc.format(Long.valueOf(j));
        }
        return eA.toString();
    }

    public void draw(Canvas canvas) {
        if (canvas != null) {
            canvas.save();
            canvas.translate((float) getBounds().left, (float) getBounds().top);
            RectF rectF = this.aSN;
            float f = this.aSL;
            canvas.drawRoundRect(rectF, f, f, this.aSI);
            canvas.translate(this.aSM.left, this.aSM.top);
            String str = this.aSK;
            b bVar = this.aSJ;
            canvas.drawText(str, 0.0f, bVar.getHeight() - bVar.descent, this.Kj);
            canvas.restore();
        }
    }

    public int getIntrinsicWidth() {
        return (int) this.aSN.width();
    }

    public int getIntrinsicHeight() {
        return (int) this.aSN.height();
    }
}
