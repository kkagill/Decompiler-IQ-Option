package com.rd.draw.a;

import android.util.Pair;
import android.view.View.MeasureSpec;
import androidx.annotation.NonNull;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.a;

/* compiled from: MeasureController */
public class c {
    public Pair<Integer, Integer> a(@NonNull a aVar, int i, int i2) {
        a aVar2 = aVar;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int count = aVar.getCount();
        int radius = aVar.getRadius();
        int bhJ = aVar.bhJ();
        int padding = aVar.getPadding();
        int paddingLeft = aVar.getPaddingLeft();
        int paddingTop = aVar.getPaddingTop();
        int paddingRight = aVar.getPaddingRight();
        int paddingBottom = aVar.getPaddingBottom();
        radius *= 2;
        Orientation bhY = aVar.bhY();
        int i3 = 0;
        if (count != 0) {
            count = ((radius * count) + ((bhJ * 2) * count)) + (padding * (count - 1));
            radius += bhJ;
            if (bhY != Orientation.HORIZONTAL) {
                int i4 = radius;
                radius = count;
                count = i4;
            }
        } else {
            count = 0;
            radius = 0;
        }
        if (aVar.bhZ() == AnimationType.DROP) {
            if (bhY == Orientation.HORIZONTAL) {
                radius *= 2;
            } else {
                count *= 2;
            }
        }
        paddingLeft += paddingRight;
        paddingTop += paddingBottom;
        Orientation orientation = Orientation.HORIZONTAL;
        count += paddingLeft;
        radius += paddingTop;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(count, size) : count;
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(radius, size2);
            } else {
                size2 = radius;
            }
        }
        if (size < 0) {
            size = 0;
        }
        if (size2 >= 0) {
            i3 = size2;
        }
        aVar2.setWidth(size);
        aVar2.setHeight(i3);
        return new Pair(Integer.valueOf(size), Integer.valueOf(i3));
    }
}
