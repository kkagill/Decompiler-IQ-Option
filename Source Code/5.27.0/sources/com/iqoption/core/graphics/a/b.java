package com.iqoption.core.graphics.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.iqoption.core.ext.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0001H\u0016J\b\u0010 \u001a\u00020\u0018H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u001aH\u0014J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u000eH\u0014J \u0010'\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u000eH\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0018H\u0016J\u0010\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u000eH\u0016J\u0012\u00102\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0018H\u0016J\u0010\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\u0018H\u0016J\u0018\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0016J(\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0016J\u000e\u0010B\u001a\u00020\u00182\u0006\u0010C\u001a\u00020\u0016J\u0010\u0010D\u001a\u00020\u00182\u0006\u0010C\u001a\u00020\u0016H\u0016J\u0010\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020\u000eH\u0016J\u0012\u0010G\u001a\u00020\n2\b\u0010F\u001a\u0004\u0018\u00010HH\u0016J\u0010\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020KH\u0016J\u0018\u0010L\u001a\u00020\u00182\u0006\u0010M\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\u0018H\u0016J\u0018\u0010O\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0016R\u001a\u0010\u0004\u001a\u00020\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006P"}, bng = {"Lcom/iqoption/core/graphics/drawable/DrawableWrapper;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroidx/core/graphics/drawable/TintAwareDrawable;", "wrapped", "(Landroid/graphics/drawable/Drawable;)V", "getWrapped", "()Landroid/graphics/drawable/Drawable;", "setWrapped", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getChangingConfigurations", "", "getCurrent", "getIntrinsicHeight", "getIntrinsicWidth", "getMinimumHeight", "getMinimumWidth", "getOpacity", "getOriginalState", "", "getPadding", "", "padding", "Landroid/graphics/Rect;", "getState", "getTransparentRegion", "Landroid/graphics/Region;", "invalidateDrawable", "who", "isAutoMirrored", "isStateful", "jumpToCurrentState", "onBoundsChange", "bounds", "onLevelChange", "level", "scheduleDrawable", "what", "Ljava/lang/Runnable;", "when", "", "setAlpha", "alpha", "setAutoMirrored", "mirrored", "setChangingConfigurations", "configs", "setColorFilter", "cf", "Landroid/graphics/ColorFilter;", "setDither", "dither", "setFilterBitmap", "filter", "setHotspot", "x", "", "y", "setHotspotBounds", "left", "top", "right", "bottom", "setOriginalState", "stateSet", "setState", "setTint", "tint", "setTintList", "Landroid/content/res/ColorStateList;", "setTintMode", "tintMode", "Landroid/graphics/PorterDuff$Mode;", "setVisible", "visible", "restart", "unscheduleDrawable", "core_release"})
/* compiled from: DrawableWrapper.kt */
public class b extends Drawable implements Callback, TintAwareDrawable {
    private Drawable biq;

    public b(Drawable drawable) {
        kotlin.jvm.internal.i.f(drawable, "wrapped");
        this.biq = drawable;
        this.biq.setCallback(this);
    }

    public final Drawable XZ() {
        return this.biq;
    }

    public void draw(Canvas canvas) {
        kotlin.jvm.internal.i.f(canvas, "canvas");
        this.biq.draw(canvas);
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        kotlin.jvm.internal.i.f(rect, "bounds");
        this.biq.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.biq.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.biq.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.biq.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.biq.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.biq.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.biq.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        return this.biq.isStateful();
    }

    public boolean setState(int[] iArr) {
        kotlin.jvm.internal.i.f(iArr, "stateSet");
        return this.biq.setState(iArr);
    }

    public int[] getState() {
        int[] state = this.biq.getState();
        kotlin.jvm.internal.i.e(state, "wrapped.state");
        return state;
    }

    public final boolean e(int[] iArr) {
        kotlin.jvm.internal.i.f(iArr, "stateSet");
        return super.setState(iArr);
    }

    public void jumpToCurrentState() {
        this.biq.jumpToCurrentState();
    }

    public Drawable getCurrent() {
        Drawable current = this.biq.getCurrent();
        kotlin.jvm.internal.i.e(current, "wrapped.current");
        return current;
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.biq.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.biq.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.biq.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.biq.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.biq.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.biq.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.biq.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        kotlin.jvm.internal.i.f(rect, "padding");
        return this.biq.getPadding(rect);
    }

    public void invalidateDrawable(Drawable drawable) {
        kotlin.jvm.internal.i.f(drawable, "who");
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        kotlin.jvm.internal.i.f(drawable, "who");
        kotlin.jvm.internal.i.f(runnable, "what");
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        kotlin.jvm.internal.i.f(drawable, "who");
        kotlin.jvm.internal.i.f(runnable, "what");
        unscheduleSelf(runnable);
    }

    /* Access modifiers changed, original: protected */
    public boolean onLevelChange(int i) {
        return this.biq.setLevel(i);
    }

    public void setAutoMirrored(boolean z) {
        DrawableCompat.setAutoMirrored(this.biq, z);
    }

    public boolean isAutoMirrored() {
        return DrawableCompat.isAutoMirrored(this.biq);
    }

    public void setTint(int i) {
        Drawable drawable = this.biq;
        Drawable a = a.a(drawable, i);
        if ((kotlin.jvm.internal.i.y(drawable, a) ^ 1) != 0) {
            drawable.setCallback((Callback) null);
            a.setCallback(this);
        }
        this.biq = a;
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.biq;
        Drawable a = a.a(drawable, colorStateList);
        if ((kotlin.jvm.internal.i.y(drawable, a) ^ 1) != 0) {
            drawable.setCallback((Callback) null);
            a.setCallback(this);
        }
        this.biq = a;
    }

    public void setTintMode(Mode mode) {
        kotlin.jvm.internal.i.f(mode, "tintMode");
        DrawableCompat.setTintMode(this.biq, mode);
    }

    public void setHotspot(float f, float f2) {
        DrawableCompat.setHotspot(this.biq, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        DrawableCompat.setHotspotBounds(this.biq, i, i2, i3, i4);
    }
}
