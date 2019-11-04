package com.google.android.material.c.a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.google.android.material.c.c;
import com.google.android.material.c.d;

/* compiled from: CircularRevealCardView */
public class a extends CardView implements d {
    private final c HL;

    public void nj() {
        this.HL.nj();
    }

    public void nk() {
        this.HL.nk();
    }

    public void setRevealInfo(@Nullable d.d dVar) {
        this.HL.setRevealInfo(dVar);
    }

    @Nullable
    public d.d getRevealInfo() {
        return this.HL.getRevealInfo();
    }

    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.HL.setCircularRevealScrimColor(i);
    }

    public int getCircularRevealScrimColor() {
        return this.HL.getCircularRevealScrimColor();
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.HL.getCircularRevealOverlayDrawable();
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.HL.setCircularRevealOverlayDrawable(drawable);
    }

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
