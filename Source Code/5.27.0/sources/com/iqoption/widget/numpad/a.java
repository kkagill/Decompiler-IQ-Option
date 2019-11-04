package com.iqoption.widget.numpad;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.core.c;
import com.iqoption.widget.numpad.a.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class a extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(2);

        static {
            sKeys.put("layout/widget_layout_numpad_default_0", Integer.valueOf(com.iqoption.widget.numpad.b.b.widget_layout_numpad_default));
            sKeys.put("layout/widget_layout_numpad_with_dot_0", Integer.valueOf(com.iqoption.widget.numpad.b.b.widget_layout_numpad_with_dot));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.widget.numpad.b.b.widget_layout_numpad_default, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.widget.numpad.b.b.widget_layout_numpad_with_dot, 2);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            StringBuilder stringBuilder;
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            } else if (i != 1) {
                if (i == 2) {
                    if ("layout/widget_layout_numpad_with_dot_0".equals(tag)) {
                        return new d(dataBindingComponent, view);
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("The tag for widget_layout_numpad_with_dot is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else if ("layout/widget_layout_numpad_default_0".equals(tag)) {
                return new com.iqoption.widget.numpad.a.b(dataBindingComponent, view);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for widget_layout_numpad_default is invalid. Received: ");
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
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new c());
        arrayList.add(new com.iqoption.i.a());
        return arrayList;
    }
}
