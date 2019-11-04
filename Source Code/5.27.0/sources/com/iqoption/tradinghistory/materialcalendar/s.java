package com.iqoption.tradinghistory.materialcalendar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.widget.TextView;
import com.iqoption.tradinghistory.materialcalendar.a.h;

@SuppressLint({"ViewConstructor"})
/* compiled from: WeekDayView */
class s extends TextView {
    private h eaJ = h.eaO;
    private int eaK;

    public s(Context context, int i) {
        super(context);
        setGravity(17);
        if (VERSION.SDK_INT >= 17) {
            setTextAlignment(4);
        }
        hq(i);
    }

    public void setWeekDayFormatter(h hVar) {
        if (hVar == null) {
            hVar = h.eaO;
        }
        this.eaJ = hVar;
        hq(this.eaK);
    }

    public void hq(int i) {
        this.eaK = i;
        setText(this.eaJ.hs(i));
    }
}
