package com.iqoption.core.ui.widget.rounded;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/core/ui/widget/rounded/BitmapUtils;", "", "()V", "scaleCenterCrop", "Landroid/graphics/Bitmap;", "source", "newHeight", "", "newWidth", "core_release"})
/* compiled from: BitmapUtils.kt */
public final class a {
    public static final a bPx = new a();

    private a() {
    }

    public static final Bitmap b(Bitmap bitmap, int i, int i2) {
        kotlin.jvm.internal.i.f(bitmap, "source");
        float f = (float) i2;
        float width = (float) bitmap.getWidth();
        float f2 = (float) i;
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f2 / height);
        width *= max;
        max *= height;
        height = (float) 2;
        f = (f - width) / height;
        f2 = (f2 - max) / height;
        RectF rectF = new RectF(f, f2, width + f, max + f2);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, bitmap.getConfig());
        new Canvas(createBitmap).drawBitmap(bitmap, null, rectF, null);
        kotlin.jvm.internal.i.e(createBitmap, "dest");
        return createBitmap;
    }
}
