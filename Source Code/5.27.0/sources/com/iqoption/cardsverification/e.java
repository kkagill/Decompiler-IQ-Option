package com.iqoption.cardsverification;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.billing.g;
import com.iqoption.cardsverification.a.d;
import com.iqoption.cardsverification.a.f;
import com.iqoption.cardsverification.a.h;
import com.iqoption.cardsverification.a.j;
import com.iqoption.cardsverification.a.l;
import com.iqoption.cardsverification.a.n;
import com.iqoption.cardsverification.a.p;
import com.iqoption.cardsverification.a.r;
import com.iqoption.core.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class e extends DataBinderMapper {
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
            sKeys.put("layout/fragment_cards_navigator_0", Integer.valueOf(com.iqoption.cardsverification.g.e.fragment_cards_navigator));
            sKeys.put("layout/fragment_verify_cards_0", Integer.valueOf(com.iqoption.cardsverification.g.e.fragment_verify_cards));
            sKeys.put("layout/fragment_verify_details_0", Integer.valueOf(com.iqoption.cardsverification.g.e.fragment_verify_details));
            sKeys.put("layout/fragment_verify_status_0", Integer.valueOf(com.iqoption.cardsverification.g.e.fragment_verify_status));
            sKeys.put("layout/perform_verify_footer_0", Integer.valueOf(com.iqoption.cardsverification.g.e.perform_verify_footer));
            sKeys.put("layout/verify_card_item_0", Integer.valueOf(com.iqoption.cardsverification.g.e.verify_card_item));
            sKeys.put("layout/verify_side_hint_0", Integer.valueOf(com.iqoption.cardsverification.g.e.verify_side_hint));
            sKeys.put("layout/verify_side_item_0", Integer.valueOf(com.iqoption.cardsverification.g.e.verify_side_item));
            sKeys.put("layout/verify_toolbar_layout_0", Integer.valueOf(com.iqoption.cardsverification.g.e.verify_toolbar_layout));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.cardsverification.g.e.fragment_cards_navigator, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.cardsverification.g.e.fragment_verify_cards, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.cardsverification.g.e.fragment_verify_details, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.cardsverification.g.e.fragment_verify_status, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.cardsverification.g.e.perform_verify_footer, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.cardsverification.g.e.verify_card_item, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.cardsverification.g.e.verify_side_hint, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.cardsverification.g.e.verify_side_item, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(com.iqoption.cardsverification.g.e.verify_toolbar_layout, 9);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/fragment_cards_navigator_0".equals(tag)) {
                            return new com.iqoption.cardsverification.a.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_cards_navigator is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/fragment_verify_cards_0".equals(tag)) {
                            return new d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_verify_cards is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/fragment_verify_details_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_verify_details is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/fragment_verify_status_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_verify_status is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/perform_verify_footer_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for perform_verify_footer is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/verify_card_item_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for verify_card_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/verify_side_hint_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for verify_side_hint is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/verify_side_item_0".equals(tag)) {
                            return new p(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for verify_side_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/verify_toolbar_layout_0".equals(tag)) {
                            return new r(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for verify_toolbar_layout is invalid. Received: ");
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
        arrayList.add(new g());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.dialogs.c());
        arrayList.add(new com.iqoption.i.a());
        arrayList.add(new com.iqoption.k.a());
        return arrayList;
    }
}
