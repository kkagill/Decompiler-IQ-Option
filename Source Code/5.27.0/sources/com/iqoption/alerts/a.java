package com.iqoption.alerts;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.alerts.a.d;
import com.iqoption.alerts.a.f;
import com.iqoption.alerts.a.h;
import com.iqoption.alerts.a.j;
import com.iqoption.alerts.a.l;
import com.iqoption.alerts.a.n;
import com.iqoption.alerts.b.e;
import com.iqoption.core.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class a extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(7);

        static {
            sKeys.put("layout/alerts_list_alert_item_0", Integer.valueOf(e.alerts_list_alert_item));
            sKeys.put("layout/alerts_list_empty_item_0", Integer.valueOf(e.alerts_list_empty_item));
            sKeys.put("layout/alerts_list_fragment_0", Integer.valueOf(e.alerts_list_fragment));
            sKeys.put("layout/alerts_list_title_item_0", Integer.valueOf(e.alerts_list_title_item));
            sKeys.put("layout/alerts_options_picker_fragment_0", Integer.valueOf(e.alerts_options_picker_fragment));
            sKeys.put("layout/alerts_price_picker_fragment_0", Integer.valueOf(e.alerts_price_picker_fragment));
            sKeys.put("layout/alerts_price_picker_numpad_0", Integer.valueOf(e.alerts_price_picker_numpad));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.alerts_list_alert_item, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.alerts_list_empty_item, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.alerts_list_fragment, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.alerts_list_title_item, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.alerts_options_picker_fragment, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.alerts_price_picker_fragment, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.alerts_price_picker_numpad, 7);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/alerts_list_alert_item_0".equals(tag)) {
                            return new com.iqoption.alerts.a.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for alerts_list_alert_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/alerts_list_empty_item_0".equals(tag)) {
                            return new d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for alerts_list_empty_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/alerts_list_fragment_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for alerts_list_fragment is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/alerts_list_title_item_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for alerts_list_title_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/alerts_options_picker_fragment_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for alerts_options_picker_fragment is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/alerts_price_picker_fragment_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for alerts_price_picker_fragment is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/alerts_price_picker_numpad_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for alerts_price_picker_numpad is invalid. Received: ");
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
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.asset.a());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.i.a());
        arrayList.add(new com.iqoption.widget.numpad.a());
        return arrayList;
    }
}
