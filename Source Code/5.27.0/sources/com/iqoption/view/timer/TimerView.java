package com.iqoption.view.timer;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.iqoption.view.b.a;
import com.iqoption.view.timer.component.FlowerView;
import com.iqoption.x.R;
import java.util.concurrent.TimeUnit;

public class TimerView extends a {
    private TextView bgq;
    private long eed;
    private String eit;
    private String eiu;
    private String eiv;
    private String eiw;
    private FlowerView eix;

    public TimerView(Context context) {
        this(context, null);
    }

    public TimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.eed = 0;
        aXH();
    }

    private void aXH() {
        Context context = getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.timer_view, this, true);
        this.eix = (FlowerView) inflate.findViewById(R.id.flowerView);
        this.bgq = (TextView) inflate.findViewById(R.id.countDownTime);
        this.eit = context.getString(R.string.seconds_one_char);
        this.eiu = context.getString(R.string.minutes_one_char);
        this.eiv = context.getString(R.string.hour_one_char);
        this.eiw = context.getString(R.string.day_one_char);
    }

    public void setTextSize(float f) {
        this.bgq.setTextSize(0, f);
    }

    public void reset() {
        this.eed = 0;
        this.bgq.setTag(R.id.id_count_down_time, null);
    }

    public void setMaxValue(long j) {
        this.eed = j;
    }

    public long getMaxValue() {
        return this.eed;
    }

    public void cw(long j) {
        h(j, this.eed);
    }

    public void h(long j, long j2) {
        if (j > 0) {
            Long l = (Long) this.bgq.getTag(R.id.id_count_down_time);
            if (l == null || l.longValue() >= j) {
                String cx = cx(j);
                if (!(TextUtils.isEmpty(cx) || cx.equalsIgnoreCase(this.bgq.getText().toString()))) {
                    this.bgq.setText(cx(j));
                }
                this.eix.y(j, j2);
                return;
            }
            this.bgq.setTag(R.id.id_count_down_time, Long.valueOf(j));
        }
    }

    private String cx(long j) {
        long toDays = TimeUnit.MILLISECONDS.toDays(j);
        StringBuilder stringBuilder;
        if (toDays <= 0) {
            toDays = TimeUnit.MILLISECONDS.toHours(j);
            if (toDays > 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(toDays);
                stringBuilder.append(this.eiv);
                return stringBuilder.toString();
            }
            toDays = TimeUnit.MILLISECONDS.toMinutes(j);
            if (toDays > 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(toDays);
                stringBuilder.append(this.eiu);
                return stringBuilder.toString();
            }
            j = TimeUnit.MILLISECONDS.toSeconds(j);
            if (j < 0) {
                return "";
            }
            j = Math.max(1, j);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(j);
            stringBuilder2.append(this.eit);
            return stringBuilder2.toString();
        } else if (toDays > 99) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("99+");
            stringBuilder.append(this.eiw);
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(toDays);
            stringBuilder.append(this.eiw);
            return stringBuilder.toString();
        }
    }
}
