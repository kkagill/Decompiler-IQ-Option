package com.iqoption.charttools.constructor.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iqoption.charttools.model.indicator.i;
import com.iqoption.charttools.n.g;
import com.iqoption.charttools.n.h;

public class WidthPicker extends LinearLayout {
    private a aHF;
    private TextView aHG;
    private ImageView[] aHH;

    public interface a {
        void em(int i);
    }

    private static int W(View view) {
        return Integer.parseInt((String) view.getTag());
    }

    public WidthPicker(Context context) {
        super(context);
        aV(context);
    }

    public WidthPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        aV(context);
    }

    public WidthPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aV(context);
    }

    private void aV(Context context) {
        setOrientation(0);
        View inflate = LayoutInflater.from(context).inflate(h.indicator_constructor_layout_width_picker, this, true);
        ImageView imageView = (ImageView) inflate.findViewById(g.width1);
        ImageView imageView2 = (ImageView) inflate.findViewById(g.width3);
        ImageView imageView3 = (ImageView) inflate.findViewById(g.width5);
        imageView.setSelected(true);
        imageView.setOnTouchListener(new com.iqoption.core.ui.widget.h.a());
        imageView2.setOnTouchListener(new com.iqoption.core.ui.widget.h.a());
        imageView3.setOnTouchListener(new com.iqoption.core.ui.widget.h.a());
        AnonymousClass1 anonymousClass1 = new com.iqoption.core.ext.g() {
            public void M(@NonNull View view) {
                WidthPicker.this.setSelectedWidth(WidthPicker.W(view));
            }
        };
        imageView.setOnClickListener(anonymousClass1);
        imageView2.setOnClickListener(anonymousClass1);
        imageView3.setOnClickListener(anonymousClass1);
        this.aHH = new ImageView[]{imageView, imageView2, imageView3};
        this.aHG = (TextView) findViewById(g.title);
    }

    public void setOnWidthChangeListener(a aVar) {
        this.aHF = aVar;
    }

    public int getSelectedWidth() {
        int i = 0;
        int i2 = i.aJb[0];
        while (true) {
            ImageView[] imageViewArr = this.aHH;
            if (i >= imageViewArr.length) {
                return i2;
            }
            View view = imageViewArr[i];
            if (view.isSelected()) {
                return W(view);
            }
            i++;
        }
    }

    public void setSelectedWidth(int i) {
        View view = null;
        View view2 = view;
        int i2 = 0;
        while (true) {
            ImageView[] imageViewArr = this.aHH;
            if (i2 >= imageViewArr.length) {
                break;
            }
            View view3 = imageViewArr[i2];
            if (W(view3) == i) {
                view = view3;
            }
            if (view3.isSelected()) {
                view2 = view3;
            }
            i2++;
        }
        if (view == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Wrong width ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (view != view2) {
            view.setSelected(true);
            if (view2 != null) {
                view2.setSelected(false);
            }
            a aVar = this.aHF;
            if (aVar != null) {
                aVar.em(i);
            }
        }
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.aHG.setText(charSequence);
    }
}
