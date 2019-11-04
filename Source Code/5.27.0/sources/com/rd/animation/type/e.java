package com.rd.animation.type;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import androidx.annotation.NonNull;
import com.rd.animation.a.b.a;

/* compiled from: ScaleDownAnimation */
public class e extends d {
    public e(@NonNull a aVar) {
        super(aVar);
    }

    /* Access modifiers changed, original: protected */
    @NonNull
    public PropertyValuesHolder gd(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = (int) (((float) this.radius) * this.eIc);
            i2 = this.radius;
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i = this.radius;
            i2 = (int) (((float) this.radius) * this.eIc);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
