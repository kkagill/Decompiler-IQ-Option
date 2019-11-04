package com.iqoption.forexcalendar.a;

import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.forexcalendar.r.e;

/* compiled from: ForexCalendarAssetsAffectedPageBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final RecyclerView aIq;

    protected c(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.aIq = recyclerView;
    }

    @NonNull
    public static c g(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static c g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (c) ViewDataBinding.inflateInternal(layoutInflater, e.forex_calendar_assets_affected_page, null, false, obj);
    }
}
