package com.iqoption.tradinghistory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.tradinghistory.a.ab;
import com.iqoption.tradinghistory.a.ad;
import com.iqoption.tradinghistory.a.d;
import com.iqoption.tradinghistory.a.f;
import com.iqoption.tradinghistory.a.h;
import com.iqoption.tradinghistory.a.j;
import com.iqoption.tradinghistory.a.l;
import com.iqoption.tradinghistory.a.n;
import com.iqoption.tradinghistory.a.p;
import com.iqoption.tradinghistory.a.r;
import com.iqoption.tradinghistory.a.t;
import com.iqoption.tradinghistory.a.v;
import com.iqoption.tradinghistory.a.x;
import com.iqoption.tradinghistory.a.z;
import com.iqoption.tradinghistory.g.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class c extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(15);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(15);

        static {
            sKeys.put("layout/fragment_deal_details_0", Integer.valueOf(e.fragment_deal_details));
            sKeys.put("layout/fragment_deal_details_multi_0", Integer.valueOf(e.fragment_deal_details_multi));
            sKeys.put("layout/fragment_trading_history_0", Integer.valueOf(e.fragment_trading_history));
            sKeys.put("layout/fragment_trading_history_filters_0", Integer.valueOf(e.fragment_trading_history_filters));
            sKeys.put("layout/fragment_trading_history_navigator_0", Integer.valueOf(e.fragment_trading_history_navigator));
            sKeys.put("layout/fragment_trading_history_options_0", Integer.valueOf(e.fragment_trading_history_options));
            sKeys.put("layout/fragment_trading_history_set_date_0", Integer.valueOf(e.fragment_trading_history_set_date));
            sKeys.put("layout/item_trading_history_0", Integer.valueOf(e.item_trading_history));
            sKeys.put("layout/item_trading_history_active_title_0", Integer.valueOf(e.item_trading_history_active_title));
            sKeys.put("layout/item_trading_history_space_0", Integer.valueOf(e.item_trading_history_space));
            sKeys.put("layout/item_trading_history_title_0", Integer.valueOf(e.item_trading_history_title));
            sKeys.put("layout/layout_deals_details_item_0", Integer.valueOf(e.layout_deals_details_item));
            sKeys.put("layout/layout_trading_history_toolbar_0", Integer.valueOf(e.layout_trading_history_toolbar));
            sKeys.put("layout/trading_history_multi_selection_0", Integer.valueOf(e.trading_history_multi_selection));
            sKeys.put("layout/trading_history_single_selection_0", Integer.valueOf(e.trading_history_single_selection));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_deal_details, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_deal_details_multi, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_trading_history, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_trading_history_filters, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_trading_history_navigator, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_trading_history_options, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_trading_history_set_date, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_trading_history, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_trading_history_active_title, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_trading_history_space, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_trading_history_title, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_deals_details_item, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_trading_history_toolbar, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.trading_history_multi_selection, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.trading_history_single_selection, 15);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/fragment_deal_details_0".equals(tag)) {
                            return new com.iqoption.tradinghistory.a.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_deal_details is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/fragment_deal_details_multi_0".equals(tag)) {
                            return new d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_deal_details_multi is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/fragment_trading_history_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_trading_history is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/fragment_trading_history_filters_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_trading_history_filters is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/fragment_trading_history_navigator_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_trading_history_navigator is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/fragment_trading_history_options_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_trading_history_options is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/fragment_trading_history_set_date_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_trading_history_set_date is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/item_trading_history_0".equals(tag)) {
                            return new r(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_trading_history is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/item_trading_history_active_title_0".equals(tag)) {
                            return new p(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_trading_history_active_title is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 10:
                        if ("layout/item_trading_history_space_0".equals(tag)) {
                            return new t(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_trading_history_space is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 11:
                        if ("layout/item_trading_history_title_0".equals(tag)) {
                            return new v(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_trading_history_title is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 12:
                        if ("layout/layout_deals_details_item_0".equals(tag)) {
                            return new x(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_deals_details_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 13:
                        if ("layout/layout_trading_history_toolbar_0".equals(tag)) {
                            return new z(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_trading_history_toolbar is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 14:
                        if ("layout/trading_history_multi_selection_0".equals(tag)) {
                            return new ab(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for trading_history_multi_selection is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 15:
                        if ("layout/trading_history_single_selection_0".equals(tag)) {
                            return new ad(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for trading_history_single_selection is invalid. Received: ");
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
