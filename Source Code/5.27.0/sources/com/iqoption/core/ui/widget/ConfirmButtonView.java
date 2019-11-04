package com.iqoption.core.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import com.iqoption.core.ext.a;
import com.iqoption.core.i.g;
import com.iqoption.core.i.h;
import com.iqoption.core.i.m;

public class ConfirmButtonView extends FrameLayout {
    private c bJU;
    private View bJV;
    private TextView bJW;
    private ImageView bJX;
    private ImageView bJY;
    private ImageView bJZ;
    private Runnable bKa;
    private int bKb;
    private int bKc;
    private boolean bKd;
    private int maxHeight;
    private int maxWidth;

    public ConfirmButtonView(Context context) {
        super(context);
        b(context, null);
    }

    public boolean callOnClick() {
        return super.callOnClick();
    }

    public ConfirmButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public ConfirmButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, attributeSet);
    }

    @TargetApi(21)
    public ConfirmButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.ConfirmButtonView, 0, 0);
        try {
            int dimensionPixelOffset;
            this.bJW.setText(obtainStyledAttributes.getText(m.ConfirmButtonView_buttonText));
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(m.ConfirmButtonView_buttonTextColor);
            if (colorStateList != null) {
                this.bJW.setTextColor(colorStateList);
            }
            this.bJW.setTextSize(0, (float) obtainStyledAttributes.getDimensionPixelSize(m.ConfirmButtonView_buttonTextSize, (int) this.bJW.getTextSize()));
            Drawable drawable = obtainStyledAttributes.getDrawable(m.ConfirmButtonView_buttonBackground);
            if (VERSION.SDK_INT >= 16) {
                this.bJV.setBackground(drawable);
            } else {
                this.bJV.setBackgroundDrawable(drawable);
            }
            E(obtainStyledAttributes.getString(m.ConfirmButtonView_buttonFontFamily), obtainStyledAttributes.getInt(m.ConfirmButtonView_buttonTextStyle, -1));
            this.bKd = obtainStyledAttributes.getBoolean(m.ConfirmButtonView_showTextUnderProgress, false);
            if (VERSION.SDK_INT >= 21) {
                dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(m.ConfirmButtonView_buttonTranslationZ, 0);
                int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(m.ConfirmButtonView_buttonElevation, 0);
                this.bJV.setTranslationZ((float) dimensionPixelOffset);
                this.bJV.setElevation((float) dimensionPixelOffset2);
            }
            if (obtainStyledAttributes.getBoolean(m.ConfirmButtonView_buttonTextAllCaps, false)) {
                this.bJW.setAllCaps(true);
            }
            drawable = obtainStyledAttributes.getDrawable(m.ConfirmButtonView_buttonImageSrc);
            if (drawable != null) {
                this.bJX.setImageDrawable(drawable);
                this.bJX.setVisibility(0);
            } else {
                dimensionPixelOffset = obtainStyledAttributes.getResourceId(m.ConfirmButtonView_buttonImageSrcCompat, -1);
                if (dimensionPixelOffset != -1) {
                    drawable = AppCompatResources.getDrawable(getContext(), dimensionPixelOffset);
                    if (drawable != null) {
                        this.bJX.setImageDrawable(drawable);
                        this.bJX.setVisibility(0);
                    } else {
                        this.bJX.setVisibility(8);
                    }
                } else {
                    this.bJX.setVisibility(8);
                }
            }
            drawable = obtainStyledAttributes.getDrawable(m.ConfirmButtonView_buttonLeftImageSrc);
            if (drawable != null) {
                this.bJY.setImageDrawable(drawable);
                this.bJY.setVisibility(0);
            } else {
                dimensionPixelOffset = obtainStyledAttributes.getResourceId(m.ConfirmButtonView_buttonLeftImageSrc, -1);
                if (dimensionPixelOffset != -1) {
                    drawable = AppCompatResources.getDrawable(getContext(), dimensionPixelOffset);
                    if (drawable != null) {
                        this.bJY.setImageDrawable(drawable);
                        this.bJY.setVisibility(0);
                    } else {
                        this.bJY.setVisibility(8);
                    }
                } else {
                    this.bJY.setVisibility(8);
                }
            }
            this.maxWidth = obtainStyledAttributes.getDimensionPixelSize(m.ConfirmButtonView_maxButtonWidth, this.maxWidth);
            this.maxHeight = obtainStyledAttributes.getDimensionPixelSize(m.ConfirmButtonView_maxButtonHeight, this.maxHeight);
            this.bKb = obtainStyledAttributes.getDimensionPixelSize(m.ConfirmButtonView_maxButtonWidthTablet, this.bKb);
            this.bKc = obtainStyledAttributes.getDimensionPixelSize(m.ConfirmButtonView_maxButtonHeightTablet, this.bKc);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setButtonImageSrc(Drawable drawable) {
        this.bJX.setImageDrawable(drawable);
        this.bJX.setVisibility(drawable == null ? 8 : 0);
    }

    public void setButtonLeftImageSrc(Drawable drawable) {
        this.bJY.setImageDrawable(drawable);
        this.bJY.setVisibility(drawable == null ? 8 : 0);
    }

    public void setButtonText(@StringRes int i) {
        this.bJW.setText(i);
    }

    private void E(String str, int i) {
        if (str != null) {
            Typeface create = Typeface.create(str, i);
            if (create != null) {
                this.bJW.setTypeface(create);
            }
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.bJV.setEnabled(z);
        this.bJW.setEnabled(z);
        this.bJX.setEnabled(z);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.bJV.setOnClickListener(onClickListener);
    }

    private void b(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(h.confirm_button_layout, this, true);
        this.bJV = inflate.findViewById(g.confirmTextLayout);
        this.bJW = (TextView) inflate.findViewById(g.confirmText);
        this.bJX = (ImageView) inflate.findViewById(g.confirmImage);
        this.bJY = (ImageView) inflate.findViewById(g.confirmImageLeft);
        this.bJU = new c(context, inflate);
        this.bJZ = (ImageView) inflate.findViewById(g.progressView);
        if (!isInEditMode()) {
            this.bJZ.setImageDrawable(this.bJU);
        }
        if (attributeSet != null) {
            a(context, attributeSet);
        }
    }

    public boolean performClick() {
        return isClickable() && super.performClick();
    }

    public void d(final boolean z, final boolean z2) {
        this.bJV.setClickable(z ^ 1);
        Runnable runnable = this.bKa;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.bKa = new Runnable() {
            public void run() {
                ConfirmButtonView.this.e(z, z2);
            }
        };
        post(this.bKa);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        if (getMaxWidth() > 0 && getMaxWidth() < size) {
            i = MeasureSpec.makeMeasureSpec(getMaxWidth(), MeasureSpec.getMode(i));
        }
        size = MeasureSpec.getSize(i2);
        if (getMaxHeight() > 0 && getMaxHeight() < size) {
            i2 = MeasureSpec.makeMeasureSpec(getMaxHeight(), MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    private int getMaxHeight() {
        return a.ba(getContext()) ? this.bKc : this.maxHeight;
    }

    private int getMaxWidth() {
        return a.ba(getContext()) ? this.bKb : this.maxWidth;
    }

    public void e(boolean z, boolean z2) {
        int i = 8;
        if (this.bKd) {
            this.bJZ.setAlpha(1.0f);
            ImageView imageView = this.bJZ;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
            return;
        }
        if (z) {
            if (z2) {
                this.bJV.animate().alpha(0.0f);
                this.bJV.animate().setListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        ConfirmButtonView.this.bJV.setVisibility(8);
                    }
                });
                this.bJZ.setAlpha(0.0f);
                this.bJZ.setVisibility(0);
                this.bJZ.animate().alpha(1.0f);
            } else {
                this.bJV.setVisibility(8);
                this.bJZ.setAlpha(1.0f);
                this.bJZ.setVisibility(0);
            }
            this.bJU.start();
        } else if (z2) {
            this.bJV.setAlpha(0.0f);
            this.bJV.setVisibility(0);
            this.bJV.animate().alpha(1.0f);
            this.bJZ.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ConfirmButtonView.this.bJZ.setVisibility(8);
                    ConfirmButtonView.this.bJU.stop();
                }
            });
        } else {
            this.bJZ.setAlpha(0.0f);
            this.bJZ.setVisibility(8);
            this.bJV.setAlpha(1.0f);
            this.bJV.setVisibility(0);
            this.bJU.stop();
        }
    }
}
