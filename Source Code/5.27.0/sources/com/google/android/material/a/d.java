package com.google.android.material.a;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.a.f;

/* compiled from: ChildrenAlphaProperty */
public class d extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> DR = new d("childrenAlpha");

    private d(String str) {
        super(Float.class, str);
    }

    /* renamed from: b */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(f.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: a */
    public void set(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(f.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
