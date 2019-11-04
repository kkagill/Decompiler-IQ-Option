package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    @Nullable
    private AnimatorSet QK;

    @NonNull
    public abstract AnimatorSet b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    @CallSuper
    public boolean a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.QK != null;
        if (z3) {
            this.QK.cancel();
        }
        this.QK = b(view, view2, z, z3);
        this.QK.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.QK = null;
            }
        });
        this.QK.start();
        if (!z2) {
            this.QK.end();
        }
        return true;
    }
}
