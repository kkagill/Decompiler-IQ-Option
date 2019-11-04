package com.iqoption.core.ui.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.iqoption.core.i.m;
import java.util.Map;

public class TextScaleResize extends Transition {
    private static final String[] PROPERTIES = new String[]{"TextScaleResize:fontSize"};
    private float bJx = 0.0f;
    private float bJy = -1.0f;
    private float bJz = -1.0f;

    public String[] getTransitionProperties() {
        return PROPERTIES;
    }

    public TextScaleResize() {
        addTarget(TextView.class);
    }

    public TextScaleResize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.TextScaleResize);
        this.bJx = obtainStyledAttributes.getDimension(m.TextScaleResize_scaleEndTextSize, 0.0f);
        this.bJy = obtainStyledAttributes.getDimension(m.TextScaleResize_scalePivotX, -1.0f);
        this.bJz = obtainStyledAttributes.getDimension(m.TextScaleResize_scalePivotY, -1.0f);
        obtainStyledAttributes.recycle();
        addTarget(TextView.class);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues, false);
    }

    public void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues, true);
    }

    private void a(TransitionValues transitionValues, boolean z) {
        if (transitionValues.view instanceof TextView) {
            float f;
            TextView textView = (TextView) transitionValues.view;
            transitionValues.values.put("TextScaleResize:scale", Float.valueOf(textView.getScaleX()));
            if (z) {
                f = this.bJx;
                if (f <= 0.0f) {
                    f = textView.getTextSize();
                }
            } else {
                f = textView.getTextSize();
            }
            transitionValues.values.put("TextScaleResize:fontSize", Float.valueOf(f));
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Animator animator = null;
        if (transitionValues != null && transitionValues2 != null && (transitionValues.view instanceof TextView) && (transitionValues2.view instanceof TextView)) {
            float floatValue;
            float floatValue2;
            final TextView textView = (TextView) transitionValues2.view;
            Map map = transitionValues.values;
            Map map2 = transitionValues2.values;
            String str = "TextScaleResize:fontSize";
            if (map.get(str) != null) {
                floatValue = ((Float) map.get(str)).floatValue();
            } else {
                floatValue = ((TextView) transitionValues.view).getTextSize();
            }
            if (map2.get(str) != null) {
                floatValue2 = ((Float) map2.get(str)).floatValue();
            } else {
                floatValue2 = ((TextView) transitionValues2.view).getTextSize();
            }
            str = "TextScaleResize:scale";
            float f = 1.0f;
            float floatValue3 = map.get(str) != null ? ((Float) map.get(str)).floatValue() : 1.0f;
            float f2 = floatValue2 / floatValue;
            if (map2.get(str) != null) {
                f = ((Float) map2.get(str)).floatValue();
            }
            if (floatValue3 == f2) {
                return null;
            }
            float f3 = this.bJy;
            if (f3 >= 0.0f) {
                textView.setPivotX(f3);
            }
            f3 = this.bJz;
            if (f3 >= 0.0f) {
                textView.setPivotY(f3);
            }
            textView.setTextSize(0, floatValue);
            textView.setScaleX(floatValue3);
            textView.setScaleY(floatValue3);
            animator = ValueAnimator.ofFloat(new float[]{floatValue3, f2});
            animator.addUpdateListener(new -$$Lambda$TextScaleResize$-gfDLUQjpQ-KLFZpJ2cyMu5mxks(textView));
            animator.addListener(new AnimatorListenerAdapter() {
                private boolean bJA;

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (!this.bJA) {
                        textView.setTextSize(0, floatValue2);
                        textView.setScaleX(f);
                        textView.setScaleY(f);
                    }
                }

                public void onAnimationCancel(Animator animator) {
                    this.bJA = true;
                    super.onAnimationCancel(animator);
                }
            });
        }
        return animator;
    }
}
