package com.iqoption.signals;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.core.c;
import com.iqoption.signals.a.d;
import com.iqoption.signals.a.f;
import com.iqoption.signals.a.h;
import com.iqoption.signals.d.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class b extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(4);

        static {
            sKeys.put("layout/fragment_signal_0", Integer.valueOf(e.fragment_signal));
            sKeys.put("layout/fragment_signals_0", Integer.valueOf(e.fragment_signals));
            sKeys.put("layout/price_movements_filter_options_0", Integer.valueOf(e.price_movements_filter_options));
            sKeys.put("layout/signal_loading_item_0", Integer.valueOf(e.signal_loading_item));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_signal, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_signals, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.price_movements_filter_options, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.signal_loading_item, 4);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            StringBuilder stringBuilder;
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if ("layout/signal_loading_item_0".equals(tag)) {
                                return new h(dataBindingComponent, view);
                            }
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("The tag for signal_loading_item is invalid. Received: ");
                            stringBuilder.append(tag);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    } else if ("layout/price_movements_filter_options_0".equals(tag)) {
                        return new f(dataBindingComponent, view);
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for price_movements_filter_options is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                } else if ("layout/fragment_signals_0".equals(tag)) {
                    return new d(dataBindingComponent, view);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("The tag for fragment_signals is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else if ("layout/fragment_signal_0".equals(tag)) {
                return new com.iqoption.signals.a.b(dataBindingComponent, view);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_signal is invalid. Received: ");
                stringBuilder.append(tag);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
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
        arrayList.add(new c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.i.a());
        return arrayList;
    }
}
