package com.iqoption.view;

import android.content.Context;
import android.util.AttributeSet;
import com.iqoption.view.a.a.c;

public class RotatedAnimatedVectorSwitchView extends AnimatedVectorSwitchView {
    private boolean ega = false;

    public RotatedAnimatedVectorSwitchView(Context context) {
        super(context);
    }

    public RotatedAnimatedVectorSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public RotatedAnimatedVectorSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        aYp();
    }

    public boolean aYo() {
        return this.ega;
    }

    public void setReverse(boolean z) {
        this.ega = z;
        aYp();
    }

    public void reverse() {
        this.ega ^= 1;
        aYp();
    }

    private void aYp() {
        animate().rotation(this.ega ? 180.0f : 0.0f).setInterpolator(c.egR).start();
    }
}
