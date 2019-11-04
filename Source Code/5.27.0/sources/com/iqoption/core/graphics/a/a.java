package com.iqoption.core.graphics.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.util.Property;
import androidx.core.app.NotificationCompat;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0014J\u0012\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000bH\u0016J\u0012\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u0019H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, bng = {"Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable;", "Landroid/graphics/drawable/Drawable;", "wrapped", "decoration", "Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable$Decoration;", "(Landroid/graphics/drawable/Drawable;Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable$Decoration;)V", "bitmap", "Landroid/graphics/Bitmap;", "canvas", "Landroid/graphics/Canvas;", "height", "", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "value", "", "progress", "getProgress", "()F", "setProgress", "(F)V", "width", "draw", "", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "invalidateShader", "isStateful", "", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "onStateChange", "state", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "updateShaderBitmap", "Companion", "Decoration", "core_release"})
/* compiled from: DecoratedPathDrawable.kt */
public final class a extends Drawable {
    private static final Property<a, Float> ajH = new c(Float.TYPE, NotificationCompat.CATEGORY_PROGRESS);
    private static final d bis = new b();
    public static final a bit = new a();
    private Canvas aHC;
    private final Drawable biq;
    private final d bir;
    private Bitmap bitmap;
    private float di;
    private final Path fb = new Path();
    private final Paint fh = new Paint(1);
    private final int height = this.biq.getIntrinsicHeight();
    private final int width = this.biq.getIntrinsicWidth();

    @i(bne = {1, 1, 15}, bnf = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, bng = {"com/iqoption/core/graphics/drawable/DecoratedPathDrawable$1", "Landroid/graphics/drawable/Drawable$Callback;", "invalidateDrawable", "", "who", "Landroid/graphics/drawable/Drawable;", "scheduleDrawable", "what", "Ljava/lang/Runnable;", "when", "", "unscheduleDrawable", "core_release"})
    /* compiled from: DecoratedPathDrawable.kt */
    /* renamed from: com.iqoption.core.graphics.a.a$1 */
    public static final class AnonymousClass1 implements Callback {
        final /* synthetic */ a biu;

        AnonymousClass1(a aVar) {
            this.biu = aVar;
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Callback callback = this.biu.getCallback();
            if (callback != null) {
                callback.unscheduleDrawable(this.biu, runnable);
            }
        }

        public void invalidateDrawable(Drawable drawable) {
            Callback callback = this.biu.getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this.biu);
            }
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Callback callback = this.biu.getCallback();
            if (callback != null) {
                callback.scheduleDrawable(this.biu, runnable, j);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable$Decoration;", "getEMPTY", "()Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable$Decoration;", "PROPERTY_PROGRESS", "Landroid/util/Property;", "Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable;", "", "getPROPERTY_PROGRESS", "()Landroid/util/Property;", "core_release"})
    /* compiled from: DecoratedPathDrawable.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Property<a, Float> XY() {
            return a.ajH;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\n"}, bng = {"com/iqoption/core/graphics/drawable/DecoratedPathDrawable$Companion$PROPERTY_PROGRESS$1", "Landroid/util/Property;", "Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable;", "", "get", "object", "(Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable;)Ljava/lang/Float;", "set", "", "value", "core_release"})
    /* compiled from: DecoratedPathDrawable.kt */
    public static final class c extends Property<a, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            a((a) obj, ((Number) obj2).floatValue());
        }

        public void a(a aVar, float f) {
            kotlin.jvm.internal.i.f(aVar, "object");
            aVar.setProgress(f);
        }

        /* renamed from: a */
        public Float get(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "object");
            return Float.valueOf(aVar.getProgress());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\f"}, bng = {"Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable$Decoration;", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "path", "Landroid/graphics/Path;", "progress", "", "onDrawOver", "onSetupPath", "core_release"})
    /* compiled from: DecoratedPathDrawable.kt */
    public interface d {
        void a(Canvas canvas, Path path, float f);

        void a(Path path, float f);

        void b(Canvas canvas, Path path, float f);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\f"}, bng = {"com/iqoption/core/graphics/drawable/DecoratedPathDrawable$Companion$EMPTY$1", "Lcom/iqoption/core/graphics/drawable/DecoratedPathDrawable$Decoration;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "path", "Landroid/graphics/Path;", "progress", "", "onDrawOver", "onSetupPath", "core_release"})
    /* compiled from: DecoratedPathDrawable.kt */
    public static final class b implements d {
        public void a(Canvas canvas, Path path, float f) {
            kotlin.jvm.internal.i.f(canvas, "canvas");
            kotlin.jvm.internal.i.f(path, "path");
        }

        public void a(Path path, float f) {
            kotlin.jvm.internal.i.f(path, "path");
        }

        public void b(Canvas canvas, Path path, float f) {
            kotlin.jvm.internal.i.f(canvas, "canvas");
            kotlin.jvm.internal.i.f(path, "path");
        }

        b() {
        }
    }

    public a(Drawable drawable, d dVar) {
        kotlin.jvm.internal.i.f(drawable, "wrapped");
        kotlin.jvm.internal.i.f(dVar, "decoration");
        this.biq = drawable;
        this.bir = dVar;
        if (!(this.width == 0 || this.height == 0)) {
            XV();
        }
        this.biq.setCallback(new AnonymousClass1(this));
    }

    public final float getProgress() {
        return this.di;
    }

    public final void setProgress(float f) {
        if (this.di != f) {
            this.di = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        kotlin.jvm.internal.i.f(canvas, "canvas");
        this.bir.a(this.fb, this.di);
        this.bir.a(canvas, this.fb, this.di);
        canvas.drawPath(this.fb, this.fh);
        this.bir.b(canvas, this.fb, this.di);
    }

    public void setAlpha(int i) {
        this.biq.setAlpha(i);
        XW();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.biq.setColorFilter(colorFilter);
        XW();
    }

    public int getOpacity() {
        return this.biq.getOpacity();
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        kotlin.jvm.internal.i.f(rect, "bounds");
        super.onBoundsChange(rect);
        int i = this.width;
        int i2 = this.height;
        this.biq.setBounds(rect);
        if (!(i == this.width && i2 == this.height)) {
            XV();
        }
        XW();
    }

    public int getIntrinsicWidth() {
        return this.width;
    }

    public int getIntrinsicHeight() {
        return this.height;
    }

    public boolean isStateful() {
        return this.biq.isStateful();
    }

    /* Access modifiers changed, original: protected */
    public boolean onStateChange(int[] iArr) {
        if (!this.biq.setState(iArr)) {
            return false;
        }
        XW();
        return true;
    }

    private final void XV() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        bitmap = Bitmap.createBitmap(this.width, this.height, Config.ARGB_8888);
        this.aHC = new Canvas(bitmap);
        this.fh.setShader(new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP));
        this.bitmap = bitmap;
    }

    private final void XW() {
        Canvas canvas = this.aHC;
        if (canvas != null) {
            canvas.drawColor(0, Mode.CLEAR);
            this.biq.draw(canvas);
        }
    }
}
