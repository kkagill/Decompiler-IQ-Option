package com.google.android.material.c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.material.c.d.d;

/* compiled from: CircularRevealHelper */
public class c {
    public static final int HO;
    private final a HP;
    private final Path HQ;
    private final Paint HS;
    private final Paint HV;
    @Nullable
    private d HW;
    @Nullable
    private Drawable HX;
    private boolean HY;
    private boolean HZ;
    private final View view;

    /* compiled from: CircularRevealHelper */
    interface a {
        void g(Canvas canvas);

        boolean nl();
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            HO = 2;
        } else if (VERSION.SDK_INT >= 18) {
            HO = 1;
        } else {
            HO = 0;
        }
    }

    public void nj() {
        if (HO == 0) {
            this.HY = true;
            this.HZ = false;
            this.view.buildDrawingCache();
            Bitmap drawingCache = this.view.getDrawingCache();
            if (!(drawingCache != null || this.view.getWidth() == 0 || this.view.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.view.getWidth(), this.view.getHeight(), Config.ARGB_8888);
                this.view.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                this.HS.setShader(new BitmapShader(drawingCache, TileMode.CLAMP, TileMode.CLAMP));
            }
            this.HY = false;
            this.HZ = true;
        }
    }

    public void nk() {
        if (HO == 0) {
            this.HZ = false;
            this.view.destroyDrawingCache();
            this.HS.setShader(null);
            this.view.invalidate();
        }
    }

    public void setRevealInfo(@Nullable d dVar) {
        if (dVar == null) {
            this.HW = null;
        } else {
            d dVar2 = this.HW;
            if (dVar2 == null) {
                this.HW = new d(dVar);
            } else {
                dVar2.b(dVar);
            }
            if (com.google.android.material.e.a.f(dVar.radius, a(dVar), 1.0E-4f)) {
                this.HW.radius = Float.MAX_VALUE;
            }
        }
        nm();
    }

    @Nullable
    public d getRevealInfo() {
        d dVar = this.HW;
        if (dVar == null) {
            return null;
        }
        d dVar2 = new d(dVar);
        if (dVar2.isInvalid()) {
            dVar2.radius = a(dVar2);
        }
        return dVar2;
    }

    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.HV.setColor(i);
        this.view.invalidate();
    }

    @ColorInt
    public int getCircularRevealScrimColor() {
        return this.HV.getColor();
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.HX;
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.HX = drawable;
        this.view.invalidate();
    }

    private void nm() {
        if (HO == 1) {
            this.HQ.rewind();
            d dVar = this.HW;
            if (dVar != null) {
                this.HQ.addCircle(dVar.centerX, this.HW.centerY, this.HW.radius, Direction.CW);
            }
        }
        this.view.invalidate();
    }

    private float a(d dVar) {
        return com.google.android.material.e.a.a(dVar.centerX, dVar.centerY, 0.0f, 0.0f, (float) this.view.getWidth(), (float) this.view.getHeight());
    }

    public void draw(Canvas canvas) {
        if (nn()) {
            int i = HO;
            if (i == 0) {
                canvas.drawCircle(this.HW.centerX, this.HW.centerY, this.HW.radius, this.HS);
                if (no()) {
                    canvas.drawCircle(this.HW.centerX, this.HW.centerY, this.HW.radius, this.HV);
                }
            } else if (i == 1) {
                i = canvas.save();
                canvas.clipPath(this.HQ);
                this.HP.g(canvas);
                if (no()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.view.getWidth(), (float) this.view.getHeight(), this.HV);
                }
                canvas.restoreToCount(i);
            } else if (i == 2) {
                this.HP.g(canvas);
                if (no()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.view.getWidth(), (float) this.view.getHeight(), this.HV);
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported strategy ");
                stringBuilder.append(HO);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        this.HP.g(canvas);
        if (no()) {
            canvas.drawRect(0.0f, 0.0f, (float) this.view.getWidth(), (float) this.view.getHeight(), this.HV);
        }
        h(canvas);
    }

    private void h(Canvas canvas) {
        if (np()) {
            Rect bounds = this.HX.getBounds();
            float width = this.HW.centerX - (((float) bounds.width()) / 2.0f);
            float height = this.HW.centerY - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.HX.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    public boolean isOpaque() {
        return this.HP.nl() && !nn();
    }

    private boolean nn() {
        d dVar = this.HW;
        boolean z = false;
        int i = (dVar == null || dVar.isInvalid()) ? 1 : 0;
        if (HO != 0) {
            return i ^ 1;
        }
        if (i == 0 && this.HZ) {
            z = true;
        }
        return z;
    }

    private boolean no() {
        return (this.HY || Color.alpha(this.HV.getColor()) == 0) ? false : true;
    }

    private boolean np() {
        return (this.HY || this.HX == null || this.HW == null) ? false : true;
    }
}
