package com.iqoption.core.ui.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader.TileMode;
import com.squareup.picasso.Transformation;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, bng = {"Lcom/iqoption/core/ui/picasso/PathTransformation;", "Lcom/squareup/picasso/Transformation;", "factory", "Lkotlin/Function0;", "Landroid/graphics/Path;", "(Lkotlin/jvm/functions/Function0;)V", "onPostDraw", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "getOnPostDraw", "()Lkotlin/jvm/functions/Function1;", "setOnPostDraw", "(Lkotlin/jvm/functions/Function1;)V", "onPreDraw", "getOnPreDraw", "setOnPreDraw", "paint", "Landroid/graphics/Paint;", "path", "getPath", "()Landroid/graphics/Path;", "path$delegate", "Lkotlin/Lazy;", "key", "", "transform", "Landroid/graphics/Bitmap;", "source", "core_release"})
/* compiled from: PathTransformation.kt */
public final class b implements Transformation {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "path", "getPath()Landroid/graphics/Path;"))};
    private final d bJs;
    private kotlin.jvm.a.b<? super Canvas, l> bJt;
    private kotlin.jvm.a.b<? super Canvas, l> bJu;
    private final Paint fh = new Paint(1);

    private final Path getPath() {
        d dVar = this.bJs;
        j jVar = anY[0];
        return (Path) dVar.getValue();
    }

    public String key() {
        return "path";
    }

    public b(a<? extends Path> aVar) {
        kotlin.jvm.internal.i.f(aVar, "factory");
        this.bJs = g.c(new PathTransformation$path$2(aVar));
    }

    public final void m(kotlin.jvm.a.b<? super Canvas, l> bVar) {
        this.bJu = bVar;
    }

    public Bitmap transform(Bitmap bitmap) {
        kotlin.jvm.internal.i.f(bitmap, "source");
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        this.fh.setShader(new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP));
        kotlin.jvm.a.b bVar = this.bJt;
        if (bVar != null) {
            l lVar = (l) bVar.invoke(canvas);
        }
        canvas.drawPath(getPath(), this.fh);
        bVar = this.bJu;
        if (bVar != null) {
            l lVar2 = (l) bVar.invoke(canvas);
        }
        bitmap.recycle();
        kotlin.jvm.internal.i.e(createBitmap, "bitmap");
        return createBitmap;
    }
}
