package com.iqoption.view.text;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: SplitLineTransformation */
public class i implements TransformationMethod {
    private int lines;

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public i(int i) {
        if (i >= 1) {
            this.lines = i;
            return;
        }
        throw new IllegalArgumentException("lines value should be greater than zero");
    }

    public void setLines(int i) {
        this.lines = i;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return charSequence;
        }
        String charSequence2 = charSequence.toString();
        String str = " ";
        String[] split = charSequence2.split(str);
        int i = 1;
        if (split.length < 1) {
            return charSequence;
        }
        if (split.length <= this.lines) {
            return charSequence2.replaceAll(str, "\n");
        }
        StringBuilder stringBuilder = new StringBuilder();
        length = Math.max(1, length / this.lines);
        int i2 = 0;
        for (String str2 : split) {
            if (i2 != 0 && i < this.lines && str2.length() + i2 > length) {
                stringBuilder.append(10);
                i++;
                i2 = 0;
            } else if (i2 > 0) {
                stringBuilder.append(' ');
                i2++;
            }
            stringBuilder.append(str2);
            i2 += str2.length();
        }
        return stringBuilder.toString();
    }
}
