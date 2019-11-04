package com.iqoption.view.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* compiled from: BaseHorizontalScrollView */
public class b extends HorizontalScrollView {
    private a egU;
    private boolean mAttached;

    /* compiled from: BaseHorizontalScrollView */
    public interface a {
        void onScrollChanged(int i, int i2, int i3, int i4);
    }

    public b(Context context) {
        super(context);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public boolean aYx() {
        return this.mAttached;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttached = true;
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttached = false;
    }

    /* Access modifiers changed, original: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a aVar = this.egU;
        if (aVar != null) {
            aVar.onScrollChanged(i, i2, i3, i4);
        }
    }

    public void setOnScrollChangedListener(a aVar) {
        this.egU = aVar;
    }
}
