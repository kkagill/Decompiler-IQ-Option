package com.iqoption.dialogs;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.dialogs.b.ab;
import com.iqoption.dialogs.b.ad;
import com.iqoption.dialogs.b.af;
import com.iqoption.dialogs.b.ah;
import com.iqoption.dialogs.b.aj;
import com.iqoption.dialogs.b.al;
import com.iqoption.dialogs.b.d;
import com.iqoption.dialogs.b.f;
import com.iqoption.dialogs.b.g;
import com.iqoption.dialogs.b.i;
import com.iqoption.dialogs.b.k;
import com.iqoption.dialogs.b.l;
import com.iqoption.dialogs.b.n;
import com.iqoption.dialogs.b.p;
import com.iqoption.dialogs.b.r;
import com.iqoption.dialogs.b.t;
import com.iqoption.dialogs.b.v;
import com.iqoption.dialogs.b.x;
import com.iqoption.dialogs.b.z;
import com.iqoption.dialogs.d.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class c extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(18);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(20);

        static {
            sKeys.put("layout/bottom_sheet_overnight_history_0", Integer.valueOf(e.bottom_sheet_overnight_history));
            sKeys.put("layout/commission_change_item_0", Integer.valueOf(e.commission_change_item));
            sKeys.put("layout-land/custodial_schedule_item_0", Integer.valueOf(e.custodial_schedule_item));
            sKeys.put("layout/custodial_schedule_item_0", Integer.valueOf(e.custodial_schedule_item));
            sKeys.put("layout/dialog_commission_change_0", Integer.valueOf(e.dialog_commission_change));
            sKeys.put("layout-land/dialog_custodial_fee_0", Integer.valueOf(e.dialog_custodial_fee));
            sKeys.put("layout/dialog_custodial_fee_0", Integer.valueOf(e.dialog_custodial_fee));
            sKeys.put("layout/dialog_overnight_fee_0", Integer.valueOf(e.dialog_overnight_fee));
            sKeys.put("layout/dialog_rate_us_0", Integer.valueOf(e.dialog_rate_us));
            sKeys.put("layout/dialog_simple_0", Integer.valueOf(e.dialog_simple));
            sKeys.put("layout/fragment_bottom_sheet_0", Integer.valueOf(e.fragment_bottom_sheet));
            sKeys.put("layout/fragment_dark_dialog_0", Integer.valueOf(e.fragment_dark_dialog));
            sKeys.put("layout/fragment_iq_bottom_sheet_0", Integer.valueOf(e.fragment_iq_bottom_sheet));
            sKeys.put("layout/fragment_menu_list_0", Integer.valueOf(e.fragment_menu_list));
            sKeys.put("layout/fragment_menu_list_light_0", Integer.valueOf(e.fragment_menu_list_light));
            sKeys.put("layout/layout_info_popup_0", Integer.valueOf(e.layout_info_popup));
            sKeys.put("layout/overnight_charge_item_0", Integer.valueOf(e.overnight_charge_item));
            sKeys.put("layout/overnight_schedule_item_0", Integer.valueOf(e.overnight_schedule_item));
            sKeys.put("layout/refresh_balance_bottom_sheet_0", Integer.valueOf(e.refresh_balance_bottom_sheet));
            sKeys.put("layout/trade_on_practice_bottom_sheet_0", Integer.valueOf(e.trade_on_practice_bottom_sheet));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.bottom_sheet_overnight_history, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.commission_change_item, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.custodial_schedule_item, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.dialog_commission_change, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.dialog_custodial_fee, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.dialog_overnight_fee, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.dialog_rate_us, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.dialog_simple, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_bottom_sheet, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_dark_dialog, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_iq_bottom_sheet, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_menu_list, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_menu_list_light, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_info_popup, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.overnight_charge_item, 15);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.overnight_schedule_item, 16);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.refresh_balance_bottom_sheet, 17);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.trade_on_practice_bottom_sheet, 18);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/bottom_sheet_overnight_history_0".equals(tag)) {
                            return new com.iqoption.dialogs.b.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for bottom_sheet_overnight_history is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/commission_change_item_0".equals(tag)) {
                            return new d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for commission_change_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout-land/custodial_schedule_item_0".equals(tag)) {
                            return new g(dataBindingComponent, view);
                        }
                        if ("layout/custodial_schedule_item_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for custodial_schedule_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/dialog_commission_change_0".equals(tag)) {
                            return new i(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for dialog_commission_change is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout-land/dialog_custodial_fee_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        if ("layout/dialog_custodial_fee_0".equals(tag)) {
                            return new k(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for dialog_custodial_fee is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/dialog_overnight_fee_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for dialog_overnight_fee is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/dialog_rate_us_0".equals(tag)) {
                            return new p(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for dialog_rate_us is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/dialog_simple_0".equals(tag)) {
                            return new r(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for dialog_simple is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/fragment_bottom_sheet_0".equals(tag)) {
                            return new t(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_bottom_sheet is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 10:
                        if ("layout/fragment_dark_dialog_0".equals(tag)) {
                            return new v(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_dark_dialog is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 11:
                        if ("layout/fragment_iq_bottom_sheet_0".equals(tag)) {
                            return new x(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_iq_bottom_sheet is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 12:
                        if ("layout/fragment_menu_list_0".equals(tag)) {
                            return new z(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_menu_list is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 13:
                        if ("layout/fragment_menu_list_light_0".equals(tag)) {
                            return new ab(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_menu_list_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 14:
                        if ("layout/layout_info_popup_0".equals(tag)) {
                            return new ad(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_info_popup is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 15:
                        if ("layout/overnight_charge_item_0".equals(tag)) {
                            return new af(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for overnight_charge_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 16:
                        if ("layout/overnight_schedule_item_0".equals(tag)) {
                            return new ah(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for overnight_schedule_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 17:
                        if ("layout/refresh_balance_bottom_sheet_0".equals(tag)) {
                            return new aj(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for refresh_balance_bottom_sheet is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 18:
                        if ("layout/trade_on_practice_bottom_sheet_0".equals(tag)) {
                            return new al(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for trade_on_practice_bottom_sheet is invalid. Received: ");
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
        arrayList.add(new com.iqoption.core.c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.i.a());
        arrayList.add(new com.iqoption.k.a());
        return arrayList;
    }
}
