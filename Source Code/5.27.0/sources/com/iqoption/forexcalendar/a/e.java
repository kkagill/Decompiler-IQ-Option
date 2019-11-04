package com.iqoption.forexcalendar.a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

/* compiled from: ForexCalendarInfoHistoryPageBinding */
public abstract class e extends ViewDataBinding {
    @NonNull
    public final TextView cTc;
    @NonNull
    public final TextView cTd;

    protected e(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cTc = textView;
        this.cTd = textView2;
    }

    @NonNull
    public static e h(@NonNull LayoutInflater layoutInflater) {
        return h(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static e h(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (e) ViewDataBinding.inflateInternal(layoutInflater, com.iqoption.forexcalendar.r.e.forex_calendar_info_history_page, null, false, obj);
    }
}
