package com.google.android.material.internal;

import android.widget.ImageButton;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: VisibilityAwareImageButton */
public class i extends ImageButton {
    private int Lg;

    public void setVisibility(int i) {
        f(i, true);
    }

    public final void f(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.Lg = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.Lg;
    }
}
