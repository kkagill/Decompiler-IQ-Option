package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.a.k;

public class TabItem extends View {
    public final int ND;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, k.TabItem);
        this.text = obtainStyledAttributes.getText(k.TabItem_android_text);
        this.icon = obtainStyledAttributes.getDrawable(k.TabItem_android_icon);
        this.ND = obtainStyledAttributes.getResourceId(k.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
