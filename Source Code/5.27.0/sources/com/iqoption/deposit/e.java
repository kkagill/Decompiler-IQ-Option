package com.iqoption.deposit;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.billing.g;
import com.iqoption.core.c;
import com.iqoption.deposit.b.aa;
import com.iqoption.deposit.b.ac;
import com.iqoption.deposit.b.ae;
import com.iqoption.deposit.b.ag;
import com.iqoption.deposit.b.ai;
import com.iqoption.deposit.b.ak;
import com.iqoption.deposit.b.am;
import com.iqoption.deposit.b.ao;
import com.iqoption.deposit.b.aq;
import com.iqoption.deposit.b.as;
import com.iqoption.deposit.b.au;
import com.iqoption.deposit.b.aw;
import com.iqoption.deposit.b.ay;
import com.iqoption.deposit.b.ba;
import com.iqoption.deposit.b.bc;
import com.iqoption.deposit.b.be;
import com.iqoption.deposit.b.bg;
import com.iqoption.deposit.b.bi;
import com.iqoption.deposit.b.bk;
import com.iqoption.deposit.b.bm;
import com.iqoption.deposit.b.bn;
import com.iqoption.deposit.b.bp;
import com.iqoption.deposit.b.bq;
import com.iqoption.deposit.b.bs;
import com.iqoption.deposit.b.d;
import com.iqoption.deposit.b.h;
import com.iqoption.deposit.b.j;
import com.iqoption.deposit.b.l;
import com.iqoption.deposit.b.n;
import com.iqoption.deposit.b.o;
import com.iqoption.deposit.b.q;
import com.iqoption.deposit.b.s;
import com.iqoption.deposit.b.u;
import com.iqoption.deposit.b.w;
import com.iqoption.deposit.b.y;
import com.iqoption.deposit.o.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class e extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(34);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(37);

        static {
            sKeys.put("layout/constructor_spinner_field_light_0", Integer.valueOf(f.constructor_spinner_field_light));
            sKeys.put("layout/constructor_text_edit_field_light_0", Integer.valueOf(f.constructor_text_edit_field_light));
            sKeys.put("layout/fragment_card_payment_light_0", Integer.valueOf(f.fragment_card_payment_light));
            sKeys.put("layout/fragment_crypto_payment_status_0", Integer.valueOf(f.fragment_crypto_payment_status));
            sKeys.put("layout/fragment_deposit_crypto_0", Integer.valueOf(f.fragment_deposit_crypto));
            sKeys.put("layout/fragment_deposit_crypto_requisites_0", Integer.valueOf(f.fragment_deposit_crypto_requisites));
            sKeys.put("layout/fragment_deposit_hold_light_0", Integer.valueOf(f.fragment_deposit_hold_light));
            sKeys.put("layout-land/fragment_deposit_hold_light_0", Integer.valueOf(f.fragment_deposit_hold_light));
            sKeys.put("layout/fragment_deposit_methods_light_0", Integer.valueOf(f.fragment_deposit_methods_light));
            sKeys.put("layout/fragment_deposit_navigator_0", Integer.valueOf(f.fragment_deposit_navigator));
            sKeys.put("layout/fragment_deposit_perform_light_0", Integer.valueOf(f.fragment_deposit_perform_light));
            sKeys.put("layout/fragment_kyc_warning_0", Integer.valueOf(f.fragment_kyc_warning));
            sKeys.put("layout/fragment_payment_completed_light_0", Integer.valueOf(f.fragment_payment_completed_light));
            sKeys.put("layout/fragment_payment_fields_light_0", Integer.valueOf(f.fragment_payment_fields_light));
            sKeys.put("layout/fragment_redirect_web_payment_light_0", Integer.valueOf(f.fragment_redirect_web_payment_light));
            sKeys.put("layout/fragment_refund_address_0", Integer.valueOf(f.fragment_refund_address));
            sKeys.put("layout/item_constructor_spinner_light_0", Integer.valueOf(f.item_constructor_spinner_light));
            sKeys.put("layout/item_currency_light_0", Integer.valueOf(f.item_currency_light));
            sKeys.put("layout/item_payment_method_expand_light_0", Integer.valueOf(f.item_payment_method_expand_light));
            sKeys.put("layout/item_payment_method_light_0", Integer.valueOf(f.item_payment_method_light));
            sKeys.put("layout/item_payment_method_title_light_0", Integer.valueOf(f.item_payment_method_title_light));
            sKeys.put("layout/item_preset_light_0", Integer.valueOf(f.item_preset_light));
            sKeys.put("layout/item_scan_card_light_0", Integer.valueOf(f.item_scan_card_light));
            sKeys.put("layout/layout_crypto_rate_popup_0", Integer.valueOf(f.layout_crypto_rate_popup));
            sKeys.put("layout/layout_currency_selector_light_0", Integer.valueOf(f.layout_currency_selector_light));
            sKeys.put("layout/layout_deposit_button_0", Integer.valueOf(f.layout_deposit_button));
            sKeys.put("layout/layout_deposit_button_light_0", Integer.valueOf(f.layout_deposit_button_light));
            sKeys.put("layout/layout_deposit_hold_show_more_0", Integer.valueOf(f.layout_deposit_hold_show_more));
            sKeys.put("layout/layout_deposit_hold_time_warning_0", Integer.valueOf(f.layout_deposit_hold_time_warning));
            sKeys.put("layout/layout_deposit_hold_warning_0", Integer.valueOf(f.layout_deposit_hold_warning));
            sKeys.put("layout/layout_deposit_protected_light_0", Integer.valueOf(f.layout_deposit_protected_light));
            sKeys.put("layout/layout_deposit_toolbar_lite_0", Integer.valueOf(f.layout_deposit_toolbar_lite));
            sKeys.put("layout/layout_navigator_content_0", Integer.valueOf(f.layout_navigator_content));
            sKeys.put("layout-land/layout_navigator_content_0", Integer.valueOf(f.layout_navigator_content));
            sKeys.put("layout/layout_perform_toolbar_title_light_0", Integer.valueOf(f.layout_perform_toolbar_title_light));
            sKeys.put("layout-land/layout_perform_toolbar_title_light_0", Integer.valueOf(f.layout_perform_toolbar_title_light));
            sKeys.put("layout/nfc_scan_fragment_0", Integer.valueOf(f.nfc_scan_fragment));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.constructor_spinner_field_light, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.constructor_text_edit_field_light, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_card_payment_light, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_crypto_payment_status, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_deposit_crypto, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_deposit_crypto_requisites, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_deposit_hold_light, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_deposit_methods_light, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_deposit_navigator, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_deposit_perform_light, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_kyc_warning, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_payment_completed_light, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_payment_fields_light, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_redirect_web_payment_light, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.fragment_refund_address, 15);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.item_constructor_spinner_light, 16);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.item_currency_light, 17);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.item_payment_method_expand_light, 18);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.item_payment_method_light, 19);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.item_payment_method_title_light, 20);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.item_preset_light, 21);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.item_scan_card_light, 22);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_crypto_rate_popup, 23);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_currency_selector_light, 24);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_deposit_button, 25);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_deposit_button_light, 26);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_deposit_hold_show_more, 27);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_deposit_hold_time_warning, 28);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_deposit_hold_warning, 29);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_deposit_protected_light, 30);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_deposit_toolbar_lite, 31);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_navigator_content, 32);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.layout_perform_toolbar_title_light, 33);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.nfc_scan_fragment, 34);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/constructor_spinner_field_light_0".equals(tag)) {
                            return new com.iqoption.deposit.b.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for constructor_spinner_field_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/constructor_text_edit_field_light_0".equals(tag)) {
                            return new d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for constructor_text_edit_field_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/fragment_card_payment_light_0".equals(tag)) {
                            return new com.iqoption.deposit.b.f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_card_payment_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/fragment_crypto_payment_status_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_crypto_payment_status is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/fragment_deposit_crypto_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_deposit_crypto is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/fragment_deposit_crypto_requisites_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_deposit_crypto_requisites is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/fragment_deposit_hold_light_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        if ("layout-land/fragment_deposit_hold_light_0".equals(tag)) {
                            return new o(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_deposit_hold_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/fragment_deposit_methods_light_0".equals(tag)) {
                            return new q(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_deposit_methods_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/fragment_deposit_navigator_0".equals(tag)) {
                            return new s(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_deposit_navigator is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 10:
                        if ("layout/fragment_deposit_perform_light_0".equals(tag)) {
                            return new u(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_deposit_perform_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 11:
                        if ("layout/fragment_kyc_warning_0".equals(tag)) {
                            return new w(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_warning is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 12:
                        if ("layout/fragment_payment_completed_light_0".equals(tag)) {
                            return new y(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_payment_completed_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 13:
                        if ("layout/fragment_payment_fields_light_0".equals(tag)) {
                            return new aa(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_payment_fields_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 14:
                        if ("layout/fragment_redirect_web_payment_light_0".equals(tag)) {
                            return new ac(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_redirect_web_payment_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 15:
                        if ("layout/fragment_refund_address_0".equals(tag)) {
                            return new ae(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_refund_address is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 16:
                        if ("layout/item_constructor_spinner_light_0".equals(tag)) {
                            return new ag(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_constructor_spinner_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 17:
                        if ("layout/item_currency_light_0".equals(tag)) {
                            return new ai(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_currency_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 18:
                        if ("layout/item_payment_method_expand_light_0".equals(tag)) {
                            return new ak(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_payment_method_expand_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 19:
                        if ("layout/item_payment_method_light_0".equals(tag)) {
                            return new am(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_payment_method_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 20:
                        if ("layout/item_payment_method_title_light_0".equals(tag)) {
                            return new ao(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_payment_method_title_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 21:
                        if ("layout/item_preset_light_0".equals(tag)) {
                            return new aq(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_preset_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 22:
                        if ("layout/item_scan_card_light_0".equals(tag)) {
                            return new as(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_scan_card_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 23:
                        if ("layout/layout_crypto_rate_popup_0".equals(tag)) {
                            return new au(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_crypto_rate_popup is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 24:
                        if ("layout/layout_currency_selector_light_0".equals(tag)) {
                            return new aw(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_currency_selector_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 25:
                        if ("layout/layout_deposit_button_0".equals(tag)) {
                            return new ay(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_deposit_button is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 26:
                        if ("layout/layout_deposit_button_light_0".equals(tag)) {
                            return new ba(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_deposit_button_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 27:
                        if ("layout/layout_deposit_hold_show_more_0".equals(tag)) {
                            return new bc(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_deposit_hold_show_more is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 28:
                        if ("layout/layout_deposit_hold_time_warning_0".equals(tag)) {
                            return new be(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_deposit_hold_time_warning is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 29:
                        if ("layout/layout_deposit_hold_warning_0".equals(tag)) {
                            return new bg(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_deposit_hold_warning is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 30:
                        if ("layout/layout_deposit_protected_light_0".equals(tag)) {
                            return new bi(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_deposit_protected_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 31:
                        if ("layout/layout_deposit_toolbar_lite_0".equals(tag)) {
                            return new bk(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_deposit_toolbar_lite is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 32:
                        if ("layout/layout_navigator_content_0".equals(tag)) {
                            return new bm(dataBindingComponent, view);
                        }
                        if ("layout-land/layout_navigator_content_0".equals(tag)) {
                            return new bn(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_navigator_content is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 33:
                        if ("layout/layout_perform_toolbar_title_light_0".equals(tag)) {
                            return new bp(dataBindingComponent, view);
                        }
                        if ("layout-land/layout_perform_toolbar_title_light_0".equals(tag)) {
                            return new bq(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_perform_toolbar_title_light is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 34:
                        if ("layout/nfc_scan_fragment_0".equals(tag)) {
                            return new bs(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for nfc_scan_fragment is invalid. Received: ");
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
        ArrayList arrayList = new ArrayList(13);
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
        arrayList.add(new com.iqoption.qrcode.b());
        arrayList.add(new com.iqoption.widget.numpad.a());
        return arrayList;
    }
}
