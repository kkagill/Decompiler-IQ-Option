package com.iqoption.core;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.core.a.aa;
import com.iqoption.core.a.e;
import com.iqoption.core.a.g;
import com.iqoption.core.a.i;
import com.iqoption.core.a.k;
import com.iqoption.core.a.m;
import com.iqoption.core.a.o;
import com.iqoption.core.a.q;
import com.iqoption.core.a.s;
import com.iqoption.core.a.u;
import com.iqoption.core.a.w;
import com.iqoption.core.a.y;
import com.iqoption.core.i.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class c extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(13);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(14);

        static {
            sKeys.put("layout-land/calendar_arrow_button_0", Integer.valueOf(h.calendar_arrow_button));
            sKeys.put("layout/calendar_arrow_button_0", Integer.valueOf(h.calendar_arrow_button));
            sKeys.put("layout/fragment_search_country_0", Integer.valueOf(h.fragment_search_country));
            sKeys.put("layout/fragment_splash_0", Integer.valueOf(h.fragment_splash));
            sKeys.put("layout/fragment_technical_log_0", Integer.valueOf(h.fragment_technical_log));
            sKeys.put("layout/item_country_suggest_0", Integer.valueOf(h.item_country_suggest));
            sKeys.put("layout/item_currency_0", Integer.valueOf(h.item_currency));
            sKeys.put("layout/layout_country_field_0", Integer.valueOf(h.layout_country_field));
            sKeys.put("layout/layout_placeholder_field_0", Integer.valueOf(h.layout_placeholder_field));
            sKeys.put("layout/layout_toolbar_black_0", Integer.valueOf(h.layout_toolbar_black));
            sKeys.put("layout/numpad_0", Integer.valueOf(h.numpad));
            sKeys.put("layout/terms_fragment_0", Integer.valueOf(h.terms_fragment));
            sKeys.put("layout/timer_view_0", Integer.valueOf(h.timer_view));
            sKeys.put("layout/view_currency_amount_0", Integer.valueOf(h.view_currency_amount));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.calendar_arrow_button, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.fragment_search_country, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.fragment_splash, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.fragment_technical_log, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.item_country_suggest, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.item_currency, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.layout_country_field, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.layout_placeholder_field, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.layout_toolbar_black, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.numpad, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.terms_fragment, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.timer_view, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.view_currency_amount, 13);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout-land/calendar_arrow_button_0".equals(tag)) {
                            return new com.iqoption.core.a.c(dataBindingComponent, view);
                        }
                        if ("layout/calendar_arrow_button_0".equals(tag)) {
                            return new com.iqoption.core.a.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for calendar_arrow_button is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/fragment_search_country_0".equals(tag)) {
                            return new e(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_search_country is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/fragment_splash_0".equals(tag)) {
                            return new g(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_splash is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/fragment_technical_log_0".equals(tag)) {
                            return new i(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_technical_log is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/item_country_suggest_0".equals(tag)) {
                            return new k(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_country_suggest is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/item_currency_0".equals(tag)) {
                            return new m(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_currency is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/layout_country_field_0".equals(tag)) {
                            return new o(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_country_field is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/layout_placeholder_field_0".equals(tag)) {
                            return new q(dataBindingComponent, new View[]{view});
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_placeholder_field is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/layout_toolbar_black_0".equals(tag)) {
                            return new s(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_toolbar_black is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 10:
                        if ("layout/numpad_0".equals(tag)) {
                            return new u(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for numpad is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 11:
                        if ("layout/terms_fragment_0".equals(tag)) {
                            return new w(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for terms_fragment is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 12:
                        if ("layout/timer_view_0".equals(tag)) {
                            return new y(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for timer_view is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 13:
                        if ("layout/view_currency_amount_0".equals(tag)) {
                            return new aa(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for view_currency_amount is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (!(viewArr == null || viewArr.length == 0)) {
            i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
            if (i > 0) {
                Object tag = viewArr[0].getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if (i == 8) {
                    if ("layout/layout_placeholder_field_0".equals(tag)) {
                        return new q(dataBindingComponent, viewArr);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("The tag for layout_placeholder_field is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        return null;
    }

    public int getLayoutId(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        Integer num = (Integer) b.sKeys.get(str);
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    public String convertBrIdToString(int i) {
        return (String) a.sKeys.get(i);
    }

    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new com.iqoption.i.a());
        return arrayList;
    }
}
