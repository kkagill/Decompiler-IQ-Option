package com.iqoption.fragment.leftpanel;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import com.iqoption.core.graphics.c;
import com.iqoption.core.j;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0005¨\u0006\t"}, bng = {"getDrawable", "Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable;", "res", "Lcom/iqoption/core/Resourcer;", "staticResId", "", "circleColor", "centerOffsetX", "centerOffsetY", "app_optionXRelease"})
/* compiled from: LeftPanelDrawables.kt */
public final class d {

    @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\f"}, bng = {"com/iqoption/fragment/leftpanel/LeftPanelDrawablesKt$getDrawable$1", "Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable$Decoration;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "path", "Landroid/graphics/Path;", "progress", "", "onDrawOver", "onSetupPath", "app_optionXRelease"})
    /* compiled from: LeftPanelDrawables.kt */
    public static final class a implements com.iqoption.core.graphics.a.a.d {
        final /* synthetic */ c djI;
        final /* synthetic */ Path djJ;
        final /* synthetic */ float djK;
        final /* synthetic */ float djL;
        final /* synthetic */ float djM;
        final /* synthetic */ float djN;
        final /* synthetic */ Paint djO;

        public void a(Canvas canvas, Path path, float f) {
            kotlin.jvm.internal.i.f(canvas, "canvas");
            kotlin.jvm.internal.i.f(path, "path");
        }

        a(c cVar, Path path, float f, float f2, float f3, float f4, Paint paint) {
            this.djI = cVar;
            this.djJ = path;
            this.djK = f;
            this.djL = f2;
            this.djM = f3;
            this.djN = f4;
            this.djO = paint;
        }

        public void a(Path path, float f) {
            kotlin.jvm.internal.i.f(path, "path");
            path.reset();
            path.addRect(0.0f, 0.0f, this.djI.getWidth(), this.djI.getHeight(), Direction.CW);
            if (f > ((float) 0)) {
                this.djJ.reset();
                this.djJ.addCircle(this.djK, this.djL, this.djM * f, Direction.CW);
                path.op(this.djJ, Op.DIFFERENCE);
            }
        }

        public void b(Canvas canvas, Path path, float f) {
            kotlin.jvm.internal.i.f(canvas, "canvas");
            kotlin.jvm.internal.i.f(path, "path");
            canvas.drawCircle(this.djK, this.djL, this.djN * f, this.djO);
        }
    }

    public static final com.iqoption.core.graphics.a.a a(j jVar, @DrawableRes int i, @ColorInt int i2, @DimenRes int i3, @DimenRes int i4) {
        kotlin.jvm.internal.i.f(jVar, "res");
        Drawable a = com.iqoption.core.ext.a.a(jVar.getDrawable(i), jVar.ex(R.color.left_bar_icon_tint));
        c cVar = new c((float) a.getIntrinsicWidth(), (float) a.getIntrinsicHeight());
        Paint paint = new Paint(1);
        paint.setColor(i2);
        float ey = jVar.ey(R.dimen.dp3) + jVar.ey(R.dimen.f31dp0.5);
        return new com.iqoption.core.graphics.a.a(a, new a(cVar, new Path(), (cVar.getWidth() - ey) - jVar.ey(i3), ey + jVar.ey(i4), jVar.ey(R.dimen.dp6), ey, paint));
    }
}
