package com.iqoption.welcome;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.welcome.a.ab;
import com.iqoption.welcome.a.ad;
import com.iqoption.welcome.a.af;
import com.iqoption.welcome.a.ag;
import com.iqoption.welcome.a.ai;
import com.iqoption.welcome.a.c;
import com.iqoption.welcome.a.f;
import com.iqoption.welcome.a.h;
import com.iqoption.welcome.a.j;
import com.iqoption.welcome.a.l;
import com.iqoption.welcome.a.n;
import com.iqoption.welcome.a.o;
import com.iqoption.welcome.a.q;
import com.iqoption.welcome.a.r;
import com.iqoption.welcome.a.t;
import com.iqoption.welcome.a.v;
import com.iqoption.welcome.a.x;
import com.iqoption.welcome.a.z;
import com.iqoption.welcome.g.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class b extends DataBinderMapper {
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
        static final HashMap<String, Integer> sKeys = new HashMap(20);

        static {
            sKeys.put("layout-land/fragment_change_password_0", Integer.valueOf(e.fragment_change_password));
            sKeys.put("layout/fragment_change_password_0", Integer.valueOf(e.fragment_change_password));
            sKeys.put("layout/fragment_forgot_password_0", Integer.valueOf(e.fragment_forgot_password));
            sKeys.put("layout-land/fragment_forgot_password_0", Integer.valueOf(e.fragment_forgot_password));
            sKeys.put("layout/fragment_trial_registration_0", Integer.valueOf(e.fragment_trial_registration));
            sKeys.put("layout/fragment_two_step_auth_0", Integer.valueOf(e.fragment_two_step_auth));
            sKeys.put("layout/fragment_welcome_0", Integer.valueOf(e.fragment_welcome));
            sKeys.put("layout/fragment_welcome_login_0", Integer.valueOf(e.fragment_welcome_login));
            sKeys.put("layout-land/fragment_welcome_login_0", Integer.valueOf(e.fragment_welcome_login));
            sKeys.put("layout/fragment_welcome_registration_0", Integer.valueOf(e.fragment_welcome_registration));
            sKeys.put("layout-land/fragment_welcome_registration_0", Integer.valueOf(e.fragment_welcome_registration));
            sKeys.put("layout/fragment_welcome_registration_social_0", Integer.valueOf(e.fragment_welcome_registration_social));
            sKeys.put("layout/fragment_welcome_slide_0", Integer.valueOf(e.fragment_welcome_slide));
            sKeys.put("layout/fragment_welcome_slides_0", Integer.valueOf(e.fragment_welcome_slides));
            sKeys.put("layout/item_currency_selection_0", Integer.valueOf(e.item_currency_selection));
            sKeys.put("layout/layout_register_button_0", Integer.valueOf(e.layout_register_button));
            sKeys.put("layout/layout_welcome_policy_0", Integer.valueOf(e.layout_welcome_policy));
            sKeys.put("layout/layout_welcome_social_0", Integer.valueOf(e.layout_welcome_social));
            sKeys.put("layout-land/layout_welcome_social_0", Integer.valueOf(e.layout_welcome_social));
            sKeys.put("layout/popup_window_currency_selection_0", Integer.valueOf(e.popup_window_currency_selection));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_change_password, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_forgot_password, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_trial_registration, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_two_step_auth, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_welcome, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_welcome_login, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_welcome_registration, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_welcome_registration_social, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_welcome_slide, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_welcome_slides, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_currency_selection, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_register_button, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_welcome_policy, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_welcome_social, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.popup_window_currency_selection, 15);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout-land/fragment_change_password_0".equals(tag)) {
                            return new c(dataBindingComponent, view);
                        }
                        if ("layout/fragment_change_password_0".equals(tag)) {
                            return new com.iqoption.welcome.a.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_change_password is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/fragment_forgot_password_0".equals(tag)) {
                            return new com.iqoption.welcome.a.e(dataBindingComponent, view);
                        }
                        if ("layout-land/fragment_forgot_password_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_forgot_password is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/fragment_trial_registration_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_trial_registration is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/fragment_two_step_auth_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_two_step_auth is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/fragment_welcome_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_welcome is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/fragment_welcome_login_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        if ("layout-land/fragment_welcome_login_0".equals(tag)) {
                            return new o(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_welcome_login is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/fragment_welcome_registration_0".equals(tag)) {
                            return new q(dataBindingComponent, view);
                        }
                        if ("layout-land/fragment_welcome_registration_0".equals(tag)) {
                            return new r(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_welcome_registration is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/fragment_welcome_registration_social_0".equals(tag)) {
                            return new t(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_welcome_registration_social is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/fragment_welcome_slide_0".equals(tag)) {
                            return new v(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_welcome_slide is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 10:
                        if ("layout/fragment_welcome_slides_0".equals(tag)) {
                            return new x(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_welcome_slides is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 11:
                        if ("layout/item_currency_selection_0".equals(tag)) {
                            return new z(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_currency_selection is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 12:
                        if ("layout/layout_register_button_0".equals(tag)) {
                            return new ab(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_register_button is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 13:
                        if ("layout/layout_welcome_policy_0".equals(tag)) {
                            return new ad(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_welcome_policy is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 14:
                        if ("layout/layout_welcome_social_0".equals(tag)) {
                            return new af(dataBindingComponent, view);
                        }
                        if ("layout-land/layout_welcome_social_0".equals(tag)) {
                            return new ag(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_welcome_social is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 15:
                        if ("layout/popup_window_currency_selection_0".equals(tag)) {
                            return new ai(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for popup_window_currency_selection is invalid. Received: ");
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
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.asset.a());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new com.iqoption.core.c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.dialogs.c());
        arrayList.add(new com.iqoption.i.a());
        arrayList.add(new com.iqoption.k.a());
        return arrayList;
    }
}
