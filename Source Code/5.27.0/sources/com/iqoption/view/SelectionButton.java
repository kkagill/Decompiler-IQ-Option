package com.iqoption.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.iqoption.d.a;

public class SelectionButton extends AppCompatButton {
    int egb;
    ColorStateList egc;

    public SelectionButton(Context context) {
        this(context, null);
    }

    public SelectionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.egb = -1;
        g(attributeSet);
    }

    private void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.SelectionButton);
            this.egb = obtainStyledAttributes.getColor(1, -1);
            this.egc = obtainStyledAttributes.getColorStateList(2);
            setSelected(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            setTextColor(this.egb);
        } else {
            setTextColor(this.egc);
        }
    }
}
