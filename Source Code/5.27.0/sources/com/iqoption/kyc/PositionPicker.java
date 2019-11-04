package com.iqoption.kyc;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.NumberPicker.Formatter;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.iqoption.d.a;
import com.iqoption.util.y;
import java.lang.reflect.Field;

public class PositionPicker extends NumberPicker {
    private static final String TAG = "com.iqoption.kyc.PositionPicker";
    @Nullable
    private EditText dte;
    @Nullable
    private Paint dtf;

    public boolean performClick() {
        return true;
    }

    public boolean performLongClick() {
        return true;
    }

    public PositionPicker(Context context) {
        super(context);
    }

    public PositionPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    public PositionPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet);
    }

    @RequiresApi(api = 21)
    public PositionPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        d(context, attributeSet);
    }

    private void d(Context context, AttributeSet attributeSet) {
        setFormatter(new Formatter() {
            public String format(int i) {
                return "";
            }
        });
        this.dte = a(this);
        this.dtf = b(this);
        EditText editText = this.dte;
        if (editText != null) {
            y.a(editText, false);
            this.dte.setVisibility(4);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.PositionPicker, 0, 0);
        try {
            int dimension = (int) obtainStyledAttributes.getDimension(3, 0.0f);
            if (dimension != 0) {
                setTextSize(dimension);
            }
            setTextColor(obtainStyledAttributes.getColor(2, -1));
            setDividerColor(obtainStyledAttributes.getColor(0, -1));
            dimension = (int) obtainStyledAttributes.getDimension(1, 0.0f);
            if (dimension != 0) {
                setDividerHeight(dimension);
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextSize(int i) {
        EditText editText = this.dte;
        if (editText != null) {
            editText.setTextSize(0, (float) i);
        }
        Paint paint = this.dtf;
        if (paint != null) {
            paint.setTextSize((float) i);
        }
    }

    public void setTextColor(int i) {
        EditText editText = this.dte;
        if (editText != null) {
            editText.setTextColor(i);
        }
        Paint paint = this.dtf;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setDividerColor(int i) {
        a(this, i);
    }

    private void setDividerHeight(int i) {
        b(this, i);
    }

    @Nullable
    private static EditText a(NumberPicker numberPicker) {
        int childCount = numberPicker.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = numberPicker.getChildAt(i);
            if (childAt instanceof EditText) {
                return (EditText) childAt;
            }
        }
        return null;
    }

    @Nullable
    private static Paint b(NumberPicker numberPicker) {
        try {
            Field declaredField = NumberPicker.class.getDeclaredField("mSelectorWheelPaint");
            declaredField.setAccessible(true);
            return (Paint) declaredField.get(numberPicker);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            return null;
        }
    }

    private static void a(NumberPicker numberPicker, int i) {
        for (Field field : NumberPicker.class.getDeclaredFields()) {
            if (field.getName().equals("mSelectionDivider")) {
                field.setAccessible(true);
                try {
                    field.set(numberPicker, new ColorDrawable(i));
                    return;
                } catch (NotFoundException | IllegalAccessException | IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private static void b(NumberPicker numberPicker, int i) {
        for (Field field : NumberPicker.class.getDeclaredFields()) {
            if (field.getName().equals("mSelectionDividerHeight")) {
                field.setAccessible(true);
                try {
                    field.set(numberPicker, Integer.valueOf(i));
                    return;
                } catch (NotFoundException | IllegalAccessException | IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }
}
