package com.iqoption.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.x.R;

public class ChartTypeView extends FrameLayout {
    private TextView OQ;
    private ImageView aRh;
    private View eel;

    public ChartTypeView(Context context) {
        super(context);
        init();
    }

    public ChartTypeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ChartTypeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(21)
    public ChartTypeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.chart_type_button, this, true);
        this.aRh = (ImageView) findViewById(R.id.icon);
        this.OQ = (TextView) findViewById(R.id.text);
        this.eel = findViewById(R.id.dot);
        setSelected(false);
    }

    public void setIsShowDot(boolean z) {
        this.eel.setVisibility(z ? 0 : 8);
    }

    public void aF(int i, int i2) {
        setChartType(i);
        this.OQ.setText(TimeUtil.formatElapsedTime((long) i2));
    }

    private void setChartType(int i) {
        if (i == 0) {
            this.aRh.setImageResource(R.drawable.ic_icon_view2);
        } else if (i == 1) {
            this.aRh.setImageResource(R.drawable.ic_icon_view1);
        } else if (i == 2) {
            this.aRh.setImageResource(R.drawable.ic_icon_view3);
        } else if (i == 3) {
            this.aRh.setImageResource(R.drawable.ic_icon_view4);
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
    }
}
