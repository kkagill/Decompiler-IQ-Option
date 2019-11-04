package com.iqoption.chat.component;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/graphics/Canvas;", "invoke", "com/iqoption/chat/component/RoomsAdapter$avatarTransformation$2$2$1"})
/* compiled from: RoomsAdapter.kt */
final class RoomsAdapter$avatarTransformation$2$$special$$inlined$apply$lambda$1 extends Lambda implements b<Canvas, l> {
    final /* synthetic */ Paint $paint$inlined;
    final /* synthetic */ float $r2$inlined;
    final /* synthetic */ float $x0$inlined;
    final /* synthetic */ float $y0$inlined;

    RoomsAdapter$avatarTransformation$2$$special$$inlined$apply$lambda$1(float f, float f2, float f3, Paint paint) {
        this.$x0$inlined = f;
        this.$y0$inlined = f2;
        this.$r2$inlined = f3;
        this.$paint$inlined = paint;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m((Canvas) obj);
        return l.eVB;
    }

    public final void m(Canvas canvas) {
        kotlin.jvm.internal.i.f(canvas, "it");
        canvas.drawCircle(this.$x0$inlined, this.$y0$inlined, this.$r2$inlined, this.$paint$inlined);
    }
}
