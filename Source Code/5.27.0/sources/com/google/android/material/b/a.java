package com.google.android.material.b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.a.b;
import com.google.android.material.a.j;
import com.google.android.material.a.k;
import com.google.android.material.internal.g;
import com.google.android.material.internal.h;

/* compiled from: MaterialButton */
public class a extends AppCompatButton {
    @Nullable
    private final c Hq;
    private Mode Hr;
    private ColorStateList Hs;
    @Px
    private int Ht;
    private Drawable icon;
    private int iconGravity;
    @Px
    private int iconPadding;
    @Px
    private int iconSize;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.materialButtonStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray a = g.a(context, attributeSet, k.MaterialButton, i, j.Widget_MaterialComponents_Button, new int[0]);
        this.iconPadding = a.getDimensionPixelSize(k.MaterialButton_iconPadding, 0);
        this.Hr = h.parseTintMode(a.getInt(k.MaterialButton_iconTintMode, -1), Mode.SRC_IN);
        this.Hs = com.google.android.material.f.a.a(getContext(), a, k.MaterialButton_iconTint);
        this.icon = com.google.android.material.f.a.b(getContext(), a, k.MaterialButton_icon);
        this.iconGravity = a.getInteger(k.MaterialButton_iconGravity, 1);
        this.iconSize = a.getDimensionPixelSize(k.MaterialButton_iconSize, 0);
        this.Hq = new c(this);
        this.Hq.a(a);
        a.recycle();
        setCompoundDrawablePadding(this.iconPadding);
        mZ();
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT < 21 && na()) {
            this.Hq.f(canvas);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (na()) {
            this.Hq.setSupportBackgroundTintList(colorStateList);
        } else if (this.Hq != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (na()) {
            return this.Hq.getSupportBackgroundTintList();
        }
        return super.getSupportBackgroundTintList();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable Mode mode) {
        if (na()) {
            this.Hq.setSupportBackgroundTintMode(mode);
        } else if (this.Hq != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Mode getSupportBackgroundTintMode() {
        if (na()) {
            return this.Hq.getSupportBackgroundTintMode();
        }
        return super.getSupportBackgroundTintMode();
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public void setBackgroundTintMode(@Nullable Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Nullable
    public Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public void setBackgroundColor(@ColorInt int i) {
        if (na()) {
            this.Hq.setBackgroundColor(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(@DrawableRes int i) {
        setBackgroundDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!na()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            this.Hq.nb();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (VERSION.SDK_INT == 21) {
            c cVar = this.Hq;
            if (cVar != null) {
                cVar.k(i4 - i2, i3 - i);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.icon != null && this.iconGravity == 2) {
            i = (int) getPaint().measureText(getText().toString());
            int i3 = this.iconSize;
            if (i3 == 0) {
                i3 = this.icon.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - i) - ViewCompat.getPaddingEnd(this)) - i3) - this.iconPadding) - ViewCompat.getPaddingStart(this)) / 2;
            if (isLayoutRTL()) {
                measuredWidth = -measuredWidth;
            }
            if (this.Ht != measuredWidth) {
                this.Ht = measuredWidth;
                mZ();
            }
        }
    }

    private boolean isLayoutRTL() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    /* Access modifiers changed, original: 0000 */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setIconPadding(@Px int i) {
        if (this.iconPadding != i) {
            this.iconPadding = i;
            setCompoundDrawablePadding(i);
        }
    }

    @Px
    public int getIconPadding() {
        return this.iconPadding;
    }

    public void setIconSize(@Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.iconSize != i) {
            this.iconSize = i;
            mZ();
        }
    }

    @Px
    public int getIconSize() {
        return this.iconSize;
    }

    public void setIcon(Drawable drawable) {
        if (this.icon != drawable) {
            this.icon = drawable;
            mZ();
        }
    }

    public void setIconResource(@DrawableRes int i) {
        setIcon(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.Hs != colorStateList) {
            this.Hs = colorStateList;
            mZ();
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        setIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    public ColorStateList getIconTint() {
        return this.Hs;
    }

    public void setIconTintMode(Mode mode) {
        if (this.Hr != mode) {
            this.Hr = mode;
            mZ();
        }
    }

    public Mode getIconTintMode() {
        return this.Hr;
    }

    private void mZ() {
        Drawable drawable = this.icon;
        if (drawable != null) {
            this.icon = drawable.mutate();
            DrawableCompat.setTintList(this.icon, this.Hs);
            Mode mode = this.Hr;
            if (mode != null) {
                DrawableCompat.setTintMode(this.icon, mode);
            }
            int i = this.iconSize;
            if (i == 0) {
                i = this.icon.getIntrinsicWidth();
            }
            int i2 = this.iconSize;
            if (i2 == 0) {
                i2 = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i3 = this.Ht;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        TextViewCompat.setCompoundDrawablesRelative(this, this.icon, null, null, null);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (na()) {
            this.Hq.setRippleColor(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (na()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public ColorStateList getRippleColor() {
        return na() ? this.Hq.getRippleColor() : null;
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (na()) {
            this.Hq.setStrokeColor(colorStateList);
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        if (na()) {
            setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public ColorStateList getStrokeColor() {
        return na() ? this.Hq.getStrokeColor() : null;
    }

    public void setStrokeWidth(@Px int i) {
        if (na()) {
            this.Hq.setStrokeWidth(i);
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        if (na()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Px
    public int getStrokeWidth() {
        return na() ? this.Hq.getStrokeWidth() : 0;
    }

    public void setCornerRadius(@Px int i) {
        if (na()) {
            this.Hq.setCornerRadius(i);
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        if (na()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Px
    public int getCornerRadius() {
        return na() ? this.Hq.getCornerRadius() : 0;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    public void setIconGravity(int i) {
        this.iconGravity = i;
    }

    private boolean na() {
        c cVar = this.Hq;
        return (cVar == null || cVar.nc()) ? false : true;
    }
}
