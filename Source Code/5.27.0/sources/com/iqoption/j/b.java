package com.iqoption.j;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.core.c;
import com.iqoption.j.a.d;
import com.iqoption.j.a.f;
import com.iqoption.j.a.h;
import com.iqoption.j.a.j;
import com.iqoption.j.a.l;
import com.iqoption.j.a.n;
import com.iqoption.j.a.p;
import com.iqoption.j.c.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class b extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(8);

        static {
            sKeys.put("layout/fragment_operation_history_0", Integer.valueOf(e.fragment_operation_history));
            sKeys.put("layout/fragment_operation_history_options_0", Integer.valueOf(e.fragment_operation_history_options));
            sKeys.put("layout/fragment_operation_navigator_0", Integer.valueOf(e.fragment_operation_navigator));
            sKeys.put("layout/fragment_operation_search_result_0", Integer.valueOf(e.fragment_operation_search_result));
            sKeys.put("layout/layout_operation_history_toolbar_0", Integer.valueOf(e.layout_operation_history_toolbar));
            sKeys.put("layout/operation_history_multi_selection_0", Integer.valueOf(e.operation_history_multi_selection));
            sKeys.put("layout/operation_history_single_selection_0", Integer.valueOf(e.operation_history_single_selection));
            sKeys.put("layout/operation_search_result_item_0", Integer.valueOf(e.operation_search_result_item));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_operation_history, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_operation_history_options, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_operation_navigator, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_operation_search_result, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_operation_history_toolbar, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.operation_history_multi_selection, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.operation_history_single_selection, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.operation_search_result_item, 8);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/fragment_operation_history_0".equals(tag)) {
                            return new com.iqoption.j.a.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_operation_history is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/fragment_operation_history_options_0".equals(tag)) {
                            return new d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_operation_history_options is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/fragment_operation_navigator_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_operation_navigator is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/fragment_operation_search_result_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_operation_search_result is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/layout_operation_history_toolbar_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_operation_history_toolbar is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/operation_history_multi_selection_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for operation_history_multi_selection is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/operation_history_single_selection_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for operation_history_single_selection is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/operation_search_result_item_0".equals(tag)) {
                            return new p(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for operation_search_result_item is invalid. Received: ");
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
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new c());
        arrayList.add(new com.iqoption.i.a());
        return arrayList;
    }
}
