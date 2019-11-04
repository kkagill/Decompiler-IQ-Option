package com.iqoption.charttools;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.charttools.b.ab;
import com.iqoption.charttools.b.c;
import com.iqoption.charttools.b.e;
import com.iqoption.charttools.b.f;
import com.iqoption.charttools.b.j;
import com.iqoption.charttools.b.l;
import com.iqoption.charttools.b.n;
import com.iqoption.charttools.b.p;
import com.iqoption.charttools.b.r;
import com.iqoption.charttools.b.t;
import com.iqoption.charttools.b.v;
import com.iqoption.charttools.b.x;
import com.iqoption.charttools.b.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class h extends DataBinderMapper {
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
        static final HashMap<String, Integer> sKeys = new HashMap(15);

        static {
            sKeys.put("layout/fragment_indicator_settings_0", Integer.valueOf(com.iqoption.charttools.n.h.fragment_indicator_settings));
            sKeys.put("layout-land/fragment_indicator_settings_0", Integer.valueOf(com.iqoption.charttools.n.h.fragment_indicator_settings));
            sKeys.put("layout/fragment_template_0", Integer.valueOf(com.iqoption.charttools.n.h.fragment_template));
            sKeys.put("layout-land/fragment_template_0", Integer.valueOf(com.iqoption.charttools.n.h.fragment_template));
            sKeys.put("layout/indicator_constructor_bottom_sheet_input_select_0", Integer.valueOf(com.iqoption.charttools.n.h.indicator_constructor_bottom_sheet_input_select));
            sKeys.put("layout/indicator_constructor_group_description_item_0", Integer.valueOf(com.iqoption.charttools.n.h.indicator_constructor_group_description_item));
            sKeys.put("layout/indicator_constructor_group_title_item_0", Integer.valueOf(com.iqoption.charttools.n.h.indicator_constructor_group_title_item));
            sKeys.put("layout/indicator_constructor_input_bool_0", Integer.valueOf(com.iqoption.charttools.n.h.indicator_constructor_input_bool));
            sKeys.put("layout/indicator_constructor_input_color_0", Integer.valueOf(com.iqoption.charttools.n.h.indicator_constructor_input_color));
            sKeys.put("layout/indicator_constructor_input_field_0", Integer.valueOf(com.iqoption.charttools.n.h.indicator_constructor_input_field));
            sKeys.put("layout/indicator_constructor_input_line_width_0", Integer.valueOf(com.iqoption.charttools.n.h.indicator_constructor_input_line_width));
            sKeys.put("layout/indicator_constructor_input_select_0", Integer.valueOf(com.iqoption.charttools.n.h.indicator_constructor_input_select));
            sKeys.put("layout/indicator_constructor_input_step_field_0", Integer.valueOf(com.iqoption.charttools.n.h.indicator_constructor_input_step_field));
            sKeys.put("layout/templates_figure_item_0", Integer.valueOf(com.iqoption.charttools.n.h.templates_figure_item));
            sKeys.put("layout/templates_indicator_item_0", Integer.valueOf(com.iqoption.charttools.n.h.templates_indicator_item));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.fragment_indicator_settings, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.fragment_template, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.indicator_constructor_bottom_sheet_input_select, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.indicator_constructor_group_description_item, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.indicator_constructor_group_title_item, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.indicator_constructor_input_bool, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.indicator_constructor_input_color, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.indicator_constructor_input_field, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.indicator_constructor_input_line_width, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.indicator_constructor_input_select, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.indicator_constructor_input_step_field, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.templates_figure_item, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.charttools.n.h.templates_indicator_item, 13);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/fragment_indicator_settings_0".equals(tag)) {
                            return new com.iqoption.charttools.b.b(dataBindingComponent, view);
                        }
                        if ("layout-land/fragment_indicator_settings_0".equals(tag)) {
                            return new c(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_indicator_settings is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/fragment_template_0".equals(tag)) {
                            return new e(dataBindingComponent, view);
                        }
                        if ("layout-land/fragment_template_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_template is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/indicator_constructor_bottom_sheet_input_select_0".equals(tag)) {
                            return new com.iqoption.charttools.b.h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for indicator_constructor_bottom_sheet_input_select is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/indicator_constructor_group_description_item_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for indicator_constructor_group_description_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/indicator_constructor_group_title_item_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for indicator_constructor_group_title_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/indicator_constructor_input_bool_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for indicator_constructor_input_bool is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/indicator_constructor_input_color_0".equals(tag)) {
                            return new p(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for indicator_constructor_input_color is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/indicator_constructor_input_field_0".equals(tag)) {
                            return new r(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for indicator_constructor_input_field is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/indicator_constructor_input_line_width_0".equals(tag)) {
                            return new t(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for indicator_constructor_input_line_width is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 10:
                        if ("layout/indicator_constructor_input_select_0".equals(tag)) {
                            return new v(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for indicator_constructor_input_select is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 11:
                        if ("layout/indicator_constructor_input_step_field_0".equals(tag)) {
                            return new x(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for indicator_constructor_input_step_field is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 12:
                        if ("layout/templates_figure_item_0".equals(tag)) {
                            return new z(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for templates_figure_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 13:
                        if ("layout/templates_indicator_item_0".equals(tag)) {
                            return new ab(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for templates_indicator_item is invalid. Received: ");
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
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.asset.a());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new com.iqoption.core.c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.dialogs.c());
        arrayList.add(new com.iqoption.i.a());
        arrayList.add(new com.iqoption.k.a());
        arrayList.add(new com.iqoption.videoeducation.a());
        return arrayList;
    }
}
