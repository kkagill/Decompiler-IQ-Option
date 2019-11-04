package com.iqoption.tradinghistory.materialcalendar.a;

import androidx.annotation.NonNull;
import com.iqoption.tradinghistory.materialcalendar.b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: DateFormatDayFormatter */
public class c implements e {
    private final DateFormat buo = new SimpleDateFormat("d", Locale.getDefault());

    @NonNull
    public String n(@NonNull b bVar) {
        return this.buo.format(bVar.getDate());
    }
}
