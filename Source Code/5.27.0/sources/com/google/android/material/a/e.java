package com.google.android.material.a;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty */
public class e extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> DS = new e();
    private final WeakHashMap<Drawable, Integer> DT = new WeakHashMap();

    private e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.DT.containsKey(drawable)) {
            return (Integer) this.DT.get(drawable);
        }
        return Integer.valueOf(255);
    }

    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (VERSION.SDK_INT < 19) {
            this.DT.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
