package com.iqoption.withdraw;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.billing.g;
import com.iqoption.core.c;
import com.iqoption.withdraw.a.ab;
import com.iqoption.withdraw.a.ad;
import com.iqoption.withdraw.a.af;
import com.iqoption.withdraw.a.ah;
import com.iqoption.withdraw.a.aj;
import com.iqoption.withdraw.a.al;
import com.iqoption.withdraw.a.d;
import com.iqoption.withdraw.a.f;
import com.iqoption.withdraw.a.h;
import com.iqoption.withdraw.a.j;
import com.iqoption.withdraw.a.l;
import com.iqoption.withdraw.a.n;
import com.iqoption.withdraw.a.p;
import com.iqoption.withdraw.a.r;
import com.iqoption.withdraw.a.t;
import com.iqoption.withdraw.a.v;
import com.iqoption.withdraw.a.x;
import com.iqoption.withdraw.a.z;
import com.iqoption.withdraw.d.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class b extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(19);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(19);

        static {
            sKeys.put("layout/fragment_withdraw_complete_0", Integer.valueOf(e.fragment_withdraw_complete));
            sKeys.put("layout/fragment_withdraw_fields_0", Integer.valueOf(e.fragment_withdraw_fields));
            sKeys.put("layout/fragment_withdraw_history_0", Integer.valueOf(e.fragment_withdraw_history));
            sKeys.put("layout/fragment_withdraw_methods_0", Integer.valueOf(e.fragment_withdraw_methods));
            sKeys.put("layout/fragment_withdraw_navigator_0", Integer.valueOf(e.fragment_withdraw_navigator));
            sKeys.put("layout/fragment_withdraw_verify_0", Integer.valueOf(e.fragment_withdraw_verify));
            sKeys.put("layout/fragment_withdraw_verify_page_0", Integer.valueOf(e.fragment_withdraw_verify_page));
            sKeys.put("layout/item_payout_amount_field_0", Integer.valueOf(e.item_payout_amount_field));
            sKeys.put("layout/item_payout_regular_field_0", Integer.valueOf(e.item_payout_regular_field));
            sKeys.put("layout/layout_withdraw_fee_0", Integer.valueOf(e.layout_withdraw_fee));
            sKeys.put("layout/layout_withdraw_no_fee_0", Integer.valueOf(e.layout_withdraw_no_fee));
            sKeys.put("layout/toolbar_layout_0", Integer.valueOf(e.toolbar_layout));
            sKeys.put("layout/withdraw_button_layout_0", Integer.valueOf(e.withdraw_button_layout));
            sKeys.put("layout/withdraw_history_payout_item_0", Integer.valueOf(e.withdraw_history_payout_item));
            sKeys.put("layout/withdraw_history_title_item_0", Integer.valueOf(e.withdraw_history_title_item));
            sKeys.put("layout/withdraw_insufficient_founds_layout_0", Integer.valueOf(e.withdraw_insufficient_founds_layout));
            sKeys.put("layout/withdraw_limit_reason_dialog_0", Integer.valueOf(e.withdraw_limit_reason_dialog));
            sKeys.put("layout/withdraw_method_card_layout_0", Integer.valueOf(e.withdraw_method_card_layout));
            sKeys.put("layout/withdraw_verify_button_0", Integer.valueOf(e.withdraw_verify_button));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_withdraw_complete, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_withdraw_fields, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_withdraw_history, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_withdraw_methods, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_withdraw_navigator, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_withdraw_verify, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_withdraw_verify_page, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_payout_amount_field, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_payout_regular_field, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_withdraw_fee, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_withdraw_no_fee, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.toolbar_layout, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.withdraw_button_layout, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.withdraw_history_payout_item, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.withdraw_history_title_item, 15);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.withdraw_insufficient_founds_layout, 16);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.withdraw_limit_reason_dialog, 17);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.withdraw_method_card_layout, 18);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.withdraw_verify_button, 19);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/fragment_withdraw_complete_0".equals(tag)) {
                            return new com.iqoption.withdraw.a.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_withdraw_complete is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/fragment_withdraw_fields_0".equals(tag)) {
                            return new d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_withdraw_fields is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/fragment_withdraw_history_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_withdraw_history is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/fragment_withdraw_methods_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_withdraw_methods is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/fragment_withdraw_navigator_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_withdraw_navigator is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/fragment_withdraw_verify_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_withdraw_verify is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/fragment_withdraw_verify_page_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_withdraw_verify_page is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/item_payout_amount_field_0".equals(tag)) {
                            return new p(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_payout_amount_field is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/item_payout_regular_field_0".equals(tag)) {
                            return new r(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_payout_regular_field is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 10:
                        if ("layout/layout_withdraw_fee_0".equals(tag)) {
                            return new t(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_withdraw_fee is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 11:
                        if ("layout/layout_withdraw_no_fee_0".equals(tag)) {
                            return new v(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_withdraw_no_fee is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 12:
                        if ("layout/toolbar_layout_0".equals(tag)) {
                            return new x(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for toolbar_layout is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 13:
                        if ("layout/withdraw_button_layout_0".equals(tag)) {
                            return new z(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for withdraw_button_layout is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 14:
                        if ("layout/withdraw_history_payout_item_0".equals(tag)) {
                            return new ab(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for withdraw_history_payout_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 15:
                        if ("layout/withdraw_history_title_item_0".equals(tag)) {
                            return new ad(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for withdraw_history_title_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 16:
                        if ("layout/withdraw_insufficient_founds_layout_0".equals(tag)) {
                            return new af(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for withdraw_insufficient_founds_layout is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 17:
                        if ("layout/withdraw_limit_reason_dialog_0".equals(tag)) {
                            return new ah(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for withdraw_limit_reason_dialog is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 18:
                        if ("layout/withdraw_method_card_layout_0".equals(tag)) {
                            return new aj(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for withdraw_method_card_layout is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 19:
                        if ("layout/withdraw_verify_button_0".equals(tag)) {
                            return new al(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for withdraw_verify_button is invalid. Received: ");
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
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.asset.a());
        arrayList.add(new g());
        arrayList.add(new com.iqoption.cardsverification.e());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.dialogs.c());
        arrayList.add(new com.iqoption.kyc.d());
        arrayList.add(new com.iqoption.i.a());
        arrayList.add(new com.iqoption.k.a());
        arrayList.add(new com.iqoption.widget.numpad.a());
        return arrayList;
    }
}
