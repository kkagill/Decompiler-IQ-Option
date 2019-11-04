package com.iqoption.tradinghistory.materialcalendar.a;

import com.iqoption.tradinghistory.materialcalendar.b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: DateFormatTitleFormatter */
public class d implements g {
    private final DateFormat buo = new SimpleDateFormat("LLLL yyyy", Locale.getDefault());

    public CharSequence o(b bVar) {
        return this.buo.format(bVar.getDate());
    }
}
