package com.google.android.material.c;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.material.c.d.d;

/* compiled from: CircularRevealFrameLayout */
public class b extends FrameLayout implements d {
    private final c HL;

    public void nj() {
        this.HL.nj();
    }

    public void nk() {
        this.HL.nk();
    }

    @Nullable
    public d getRevealInfo() {
        return this.HL.getRevealInfo();
    }

    public void setRevealInfo(@Nullable d dVar) {
        this.HL.setRevealInfo(dVar);
    }

    public int getCircularRevealScrimColor() {
        return this.HL.getCircularRevealScrimColor();
    }

    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.HL.setCircularRevealScrimColor(i);
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.HL.getCircularRevealOverlayDrawable();
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.HL.setCircularRevealOverlayDrawable(drawable);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        c cVar = this.HL;
        if (cVar != null) {
            cVar.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public void g(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean isOpaque() {
        c cVar = this.HL;
        if (cVar != null) {
            return cVar.isOpaque();
        }
        return super.isOpaque();
    }

    public boolean nl() {
        return super.isOpaque();
    }
}
