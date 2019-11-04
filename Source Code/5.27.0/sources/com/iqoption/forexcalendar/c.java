package com.iqoption.forexcalendar;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.forexcalendar.a.d;
import com.iqoption.forexcalendar.a.f;
import com.iqoption.forexcalendar.a.h;
import com.iqoption.forexcalendar.a.j;
import com.iqoption.forexcalendar.a.l;
import com.iqoption.forexcalendar.a.n;
import com.iqoption.forexcalendar.a.p;
import com.iqoption.forexcalendar.a.r;
import com.iqoption.forexcalendar.r.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class c extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(9);

        static {
            sKeys.put("layout/asset_affected_item_0", Integer.valueOf(e.asset_affected_item));
            sKeys.put("layout/forex_calendar_assets_affected_page_0", Integer.valueOf(e.forex_calendar_assets_affected_page));
            sKeys.put("layout/forex_calendar_info_history_page_0", Integer.valueOf(e.forex_calendar_info_history_page));
            sKeys.put("layout/fragment_forex_calendar_0", Integer.valueOf(e.fragment_forex_calendar));
            sKeys.put("layout/fragment_forex_calendar_detail_0", Integer.valueOf(e.fragment_forex_calendar_detail));
            sKeys.put("layout/macro_forex_calendar_item_0", Integer.valueOf(e.macro_forex_calendar_item));
            sKeys.put("layout/macro_forex_calendar_title_item_0", Integer.valueOf(e.macro_forex_calendar_title_item));
            sKeys.put("layout/micro_forex_calendar_item_0", Integer.valueOf(e.micro_forex_calendar_item));
            sKeys.put("layout/micro_forex_calendar_title_item_0", Integer.valueOf(e.micro_forex_calendar_title_item));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.asset_affected_item, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.forex_calendar_assets_affected_page, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.forex_calendar_info_history_page, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_forex_calendar, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_forex_calendar_detail, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.macro_forex_calendar_item, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.macro_forex_calendar_title_item, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.micro_forex_calendar_item, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.micro_forex_calendar_title_item, 9);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/asset_affected_item_0".equals(tag)) {
                            return new com.iqoption.forexcalendar.a.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for asset_affected_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/forex_calendar_assets_affected_page_0".equals(tag)) {
                            return new d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for forex_calendar_assets_affected_page is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/forex_calendar_info_history_page_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for forex_calendar_info_history_page is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/fragment_forex_calendar_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_forex_calendar is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/fragment_forex_calendar_detail_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_forex_calendar_detail is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/macro_forex_calendar_item_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for macro_forex_calendar_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/macro_forex_calendar_title_item_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for macro_forex_calendar_title_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/micro_forex_calendar_item_0".equals(tag)) {
                            return new p(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for micro_forex_calendar_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/micro_forex_calendar_title_item_0".equals(tag)) {
                            return new r(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for micro_forex_calendar_title_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
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
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.asset.a());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new com.iqoption.core.c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.i.a());
        return arrayList;
    }
}
