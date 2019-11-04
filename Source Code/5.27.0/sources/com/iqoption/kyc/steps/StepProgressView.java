package com.iqoption.kyc.steps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.iqoption.kyc.o;
import com.iqoption.kyc.o.b;
import kotlin.f.a;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%H\u0014J0\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0014J(\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0014J\u0016\u0010;\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010<\u001a\u00020.H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001e8B@BX\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020%8B@BX\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0012\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010,\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006="}, bng = {"Lcom/iqoption/kyc/steps/StepProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bigRadius", "", "<set-?>", "centerX", "getCenterX", "()F", "setCenterX", "(F)V", "centerX$delegate", "Lkotlin/properties/ReadWriteProperty;", "centerY", "getCenterY", "setCenterY", "centerY$delegate", "isCompleted", "", "paint", "Landroid/graphics/Paint;", "position", "Lcom/iqoption/kyc/steps/ProgressPosition;", "smallRadius", "Landroid/graphics/Bitmap;", "tempBitmap", "getTempBitmap", "()Landroid/graphics/Bitmap;", "setTempBitmap", "(Landroid/graphics/Bitmap;)V", "tempBitmap$delegate", "Landroid/graphics/Canvas;", "tempCanvas", "getTempCanvas", "()Landroid/graphics/Canvas;", "setTempCanvas", "(Landroid/graphics/Canvas;)V", "tempCanvas$delegate", "transparentPaint", "onDraw", "", "canvas", "onLayout", "changed", "left", "top", "right", "bottom", "onSizeChanged", "w", "h", "oldw", "oldh", "setData", "updatePaintColor", "kyc_release"})
/* compiled from: StepProgressView.kt */
public final class StepProgressView extends View {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(StepProgressView.class), "centerX", "getCenterX()F")), k.a(new MutablePropertyReference1Impl(k.G(StepProgressView.class), "centerY", "getCenterY()F")), k.a(new MutablePropertyReference1Impl(k.G(StepProgressView.class), "tempBitmap", "getTempBitmap()Landroid/graphics/Bitmap;")), k.a(new MutablePropertyReference1Impl(k.G(StepProgressView.class), "tempCanvas", "getTempCanvas()Landroid/graphics/Canvas;"))};
    private boolean cEs;
    private final Paint dEi;
    private ProgressPosition dEj;
    private float dEk;
    private float dEl;
    private final d dEm;
    private final d dEn;
    private final d dEo;
    private final d dEp;
    private final Paint fh;

    public StepProgressView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StepProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final float getCenterX() {
        return ((Number) this.dEm.b(this, anY[0])).floatValue();
    }

    private final float getCenterY() {
        return ((Number) this.dEn.b(this, anY[1])).floatValue();
    }

    private final Bitmap getTempBitmap() {
        return (Bitmap) this.dEo.b(this, anY[2]);
    }

    private final Canvas getTempCanvas() {
        return (Canvas) this.dEp.b(this, anY[3]);
    }

    private final void setCenterX(float f) {
        this.dEm.a(this, anY[0], Float.valueOf(f));
    }

    private final void setCenterY(float f) {
        this.dEn.a(this, anY[1], Float.valueOf(f));
    }

    private final void setTempBitmap(Bitmap bitmap) {
        this.dEo.a(this, anY[2], bitmap);
    }

    private final void setTempCanvas(Canvas canvas) {
        this.dEp.a(this, anY[3], canvas);
    }

    public /* synthetic */ StepProgressView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = (AttributeSet) null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public StepProgressView(Context context, AttributeSet attributeSet, int i) {
        kotlin.jvm.internal.i.f(context, "context");
        super(context, attributeSet, i);
        this.fh = new Paint();
        this.dEi = new Paint();
        this.dEj = ProgressPosition.MIDDLE;
        this.dEk = context.getResources().getDimension(b.dp7);
        this.dEl = context.getResources().getDimension(b.dp5);
        this.dEm = a.eWg.bnQ();
        this.dEn = a.eWg.bnQ();
        this.dEo = a.eWg.bnQ();
        this.dEp = a.eWg.bnQ();
        this.fh.setAntiAlias(true);
        aNg();
        this.fh.setStrokeWidth(context.getResources().getDimension(b.dp2));
        this.dEi.setAntiAlias(true);
        this.dEi.setColor(0);
        this.dEi.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
    }

    private final void aNg() {
        int i = this.cEs ? o.a.green : o.a.grey_blue_50;
        Paint paint = this.fh;
        Context context = getContext();
        kotlin.jvm.internal.i.e(context, "context");
        paint.setColor(com.iqoption.core.ext.a.k(context, i));
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        kotlin.jvm.internal.i.e(createBitmap, "Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)");
        setTempBitmap(createBitmap);
        getTempBitmap().eraseColor(0);
        setTempCanvas(new Canvas(getTempBitmap()));
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setCenterX(((float) getWidth()) / 2.0f);
        setCenterY(((float) getHeight()) / 2.0f);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        kotlin.jvm.internal.i.f(canvas, "canvas");
        super.onDraw(canvas);
        getTempCanvas().drawCircle(getCenterX(), getCenterY(), this.dEk, this.fh);
        getTempCanvas().drawCircle(getCenterX(), getCenterY(), this.dEl, this.dEi);
        canvas.drawBitmap(getTempBitmap(), 0.0f, 0.0f, null);
        if (this.dEj != ProgressPosition.FIRST) {
            canvas.drawLine(getCenterX(), 0.0f, getCenterX(), getCenterY() - this.dEk, this.fh);
        }
        if (this.dEj != ProgressPosition.LAST) {
            canvas.drawLine(getCenterX(), getCenterY() + this.dEk, getCenterX(), (float) getHeight(), this.fh);
        }
    }

    public final void a(ProgressPosition progressPosition, boolean z) {
        kotlin.jvm.internal.i.f(progressPosition, "position");
        this.dEj = progressPosition;
        this.cEs = z;
        aNg();
        invalidate();
    }
}
