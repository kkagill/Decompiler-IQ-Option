package com.iqoption.earningscalendar;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.earningscalendar.a.d;
import com.iqoption.earningscalendar.a.f;
import com.iqoption.earningscalendar.a.h;
import com.iqoption.earningscalendar.a.j;
import com.iqoption.earningscalendar.o.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class b extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(5);

        static {
            sKeys.put("layout/fragment_earnings_calendar_0", Integer.valueOf(c.fragment_earnings_calendar));
            sKeys.put("layout/macro_earnings_calendar_item_0", Integer.valueOf(c.macro_earnings_calendar_item));
            sKeys.put("layout/macro_earnings_calendar_title_item_0", Integer.valueOf(c.macro_earnings_calendar_title_item));
            sKeys.put("layout/micro_earnings_calendar_item_0", Integer.valueOf(c.micro_earnings_calendar_item));
            sKeys.put("layout/micro_earnings_calendar_title_item_0", Integer.valueOf(c.micro_earnings_calendar_title_item));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(c.fragment_earnings_calendar, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(c.macro_earnings_calendar_item, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(c.macro_earnings_calendar_title_item, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(c.micro_earnings_calendar_item, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(c.micro_earnings_calendar_title_item, 5);
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
                        if (i != 4) {
                            if (i == 5) {
                                if ("layout/micro_earnings_calendar_title_item_0".equals(tag)) {
                                    return new j(dataBindingComponent, view);
                                }
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("The tag for micro_earnings_calendar_title_item is invalid. Received: ");
                                stringBuilder.append(tag);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        } else if ("layout/micro_earnings_calendar_item_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("The tag for micro_earnings_calendar_item is invalid. Received: ");
                            stringBuilder.append(tag);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    } else if ("layout/macro_earnings_calendar_title_item_0".equals(tag)) {
                        return new f(dataBindingComponent, view);
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for macro_earnings_calendar_title_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                } else if ("layout/macro_earnings_calendar_item_0".equals(tag)) {
                    return new d(dataBindingComponent, view);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("The tag for macro_earnings_calendar_item is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else if ("layout/fragment_earnings_calendar_0".equals(tag)) {
                return new com.iqoption.earningscalendar.a.b(dataBindingComponent, view);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_earnings_calendar is invalid. Received: ");
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
        arrayList.add(new com.iqoption.core.c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.i.a());
        return arrayList;
    }
}
