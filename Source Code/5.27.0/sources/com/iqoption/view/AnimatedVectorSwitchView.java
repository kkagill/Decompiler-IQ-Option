package com.iqoption.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.iqoption.d.a;

public class AnimatedVectorSwitchView extends AppCompatImageView {
    private boolean edQ = false;
    private AnimatedVectorDrawableCompat edR;
    private AnimatedVectorDrawableCompat edS;

    public AnimatedVectorSwitchView(Context context) {
        super(context);
    }

    public AnimatedVectorSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public AnimatedVectorSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.AnimatedVectorSwitchView, 0, 0);
        try {
            this.edQ = obtainStyledAttributes.getBoolean(0, false);
            this.edR = AnimatedVectorDrawableCompat.create(context, obtainStyledAttributes.getResourceId(2, 0));
            this.edS = AnimatedVectorDrawableCompat.create(context, obtainStyledAttributes.getResourceId(1, 0));
            setSwitched(this.edQ);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public boolean aXF() {
        return this.edQ;
    }

    public void setSwitched(boolean z) {
        this.edQ = z;
        Drawable drawable = this.edQ ? this.edS : this.edR;
        setImageDrawable(drawable);
        drawable.invalidateSelf();
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setAnimatedSwitched(boolean z) {
        if (this.edQ != z) {
            this.edQ = z;
            aXG();
            return;
        }
        setSwitched(z);
    }

    private void aXG() {
        Drawable drawable = this.edQ ? this.edR : this.edS;
        setImageDrawable(drawable);
        drawable.invalidateSelf();
        drawable.start();
    }
}
