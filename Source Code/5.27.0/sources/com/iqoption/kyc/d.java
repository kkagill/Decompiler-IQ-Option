package com.iqoption.kyc;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.core.c;
import com.iqoption.kyc.b.ab;
import com.iqoption.kyc.b.ad;
import com.iqoption.kyc.b.af;
import com.iqoption.kyc.b.ah;
import com.iqoption.kyc.b.aj;
import com.iqoption.kyc.b.al;
import com.iqoption.kyc.b.an;
import com.iqoption.kyc.b.ap;
import com.iqoption.kyc.b.ar;
import com.iqoption.kyc.b.at;
import com.iqoption.kyc.b.av;
import com.iqoption.kyc.b.ax;
import com.iqoption.kyc.b.az;
import com.iqoption.kyc.b.bb;
import com.iqoption.kyc.b.bd;
import com.iqoption.kyc.b.bf;
import com.iqoption.kyc.b.bh;
import com.iqoption.kyc.b.bj;
import com.iqoption.kyc.b.bl;
import com.iqoption.kyc.b.bn;
import com.iqoption.kyc.b.bp;
import com.iqoption.kyc.b.br;
import com.iqoption.kyc.b.bt;
import com.iqoption.kyc.b.bv;
import com.iqoption.kyc.b.bx;
import com.iqoption.kyc.b.bz;
import com.iqoption.kyc.b.f;
import com.iqoption.kyc.b.h;
import com.iqoption.kyc.b.j;
import com.iqoption.kyc.b.l;
import com.iqoption.kyc.b.n;
import com.iqoption.kyc.b.p;
import com.iqoption.kyc.b.r;
import com.iqoption.kyc.b.t;
import com.iqoption.kyc.b.v;
import com.iqoption.kyc.b.x;
import com.iqoption.kyc.b.z;
import com.iqoption.kyc.o.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class d extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(39);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(39);

        static {
            sKeys.put("layout/fragment_kyc_address_0", Integer.valueOf(e.fragment_kyc_address));
            sKeys.put("layout/fragment_kyc_country_0", Integer.valueOf(e.fragment_kyc_country));
            sKeys.put("layout/fragment_kyc_date_of_birth_0", Integer.valueOf(e.fragment_kyc_date_of_birth));
            sKeys.put("layout/fragment_kyc_decuments_history_0", Integer.valueOf(e.fragment_kyc_decuments_history));
            sKeys.put("layout/fragment_kyc_document_0", Integer.valueOf(e.fragment_kyc_document));
            sKeys.put("layout/fragment_kyc_finish_0", Integer.valueOf(e.fragment_kyc_finish));
            sKeys.put("layout/fragment_kyc_gdpr_0", Integer.valueOf(e.fragment_kyc_gdpr));
            sKeys.put("layout/fragment_kyc_governance_0", Integer.valueOf(e.fragment_kyc_governance));
            sKeys.put("layout/fragment_kyc_governance_error_0", Integer.valueOf(e.fragment_kyc_governance_error));
            sKeys.put("layout/fragment_kyc_legal_name_0", Integer.valueOf(e.fragment_kyc_legal_name));
            sKeys.put("layout/fragment_kyc_navigator_0", Integer.valueOf(e.fragment_kyc_navigator));
            sKeys.put("layout/fragment_kyc_phone_confirm_0", Integer.valueOf(e.fragment_kyc_phone_confirm));
            sKeys.put("layout/fragment_kyc_phone_input_0", Integer.valueOf(e.fragment_kyc_phone_input));
            sKeys.put("layout/fragment_kyc_phone_navigator_0", Integer.valueOf(e.fragment_kyc_phone_navigator));
            sKeys.put("layout/fragment_kyc_profile_0", Integer.valueOf(e.fragment_kyc_profile));
            sKeys.put("layout/fragment_kyc_question_multi_choice_0", Integer.valueOf(e.fragment_kyc_question_multi_choice));
            sKeys.put("layout/fragment_kyc_question_single_choice_0", Integer.valueOf(e.fragment_kyc_question_single_choice));
            sKeys.put("layout/fragment_kyc_question_text_0", Integer.valueOf(e.fragment_kyc_question_text));
            sKeys.put("layout/fragment_kyc_question_warning_0", Integer.valueOf(e.fragment_kyc_question_warning));
            sKeys.put("layout/fragment_kyc_questionnaire_container_0", Integer.valueOf(e.fragment_kyc_questionnaire_container));
            sKeys.put("layout/fragment_kyc_reportable_0", Integer.valueOf(e.fragment_kyc_reportable));
            sKeys.put("layout/fragment_kyc_reportable_error_0", Integer.valueOf(e.fragment_kyc_reportable_error));
            sKeys.put("layout/fragment_kyc_risks_0", Integer.valueOf(e.fragment_kyc_risks));
            sKeys.put("layout/fragment_kyc_sex_0", Integer.valueOf(e.fragment_kyc_sex));
            sKeys.put("layout/fragment_kyc_steps_0", Integer.valueOf(e.fragment_kyc_steps));
            sKeys.put("layout/fragment_kyc_tin_0", Integer.valueOf(e.fragment_kyc_tin));
            sKeys.put("layout/fragment_phone_confirm_0", Integer.valueOf(e.fragment_phone_confirm));
            sKeys.put("layout/item_country_0", Integer.valueOf(e.item_country));
            sKeys.put("layout/item_country_title_0", Integer.valueOf(e.item_country_title));
            sKeys.put("layout/item_kyc_answer_multi_0", Integer.valueOf(e.item_kyc_answer_multi));
            sKeys.put("layout/item_kyc_answer_single_0", Integer.valueOf(e.item_kyc_answer_single));
            sKeys.put("layout/item_kyc_document_0", Integer.valueOf(e.item_kyc_document));
            sKeys.put("layout/item_kyc_step_0", Integer.valueOf(e.item_kyc_step));
            sKeys.put("layout/item_poa_type_0", Integer.valueOf(e.item_poa_type));
            sKeys.put("layout/layout_kyc_bottom_bar_0", Integer.valueOf(e.layout_kyc_bottom_bar));
            sKeys.put("layout/layout_kyc_button_0", Integer.valueOf(e.layout_kyc_button));
            sKeys.put("layout/layout_kyc_phone_keyboard_0", Integer.valueOf(e.layout_kyc_phone_keyboard));
            sKeys.put("layout/layout_kyc_questionnaire_expired_0", Integer.valueOf(e.layout_kyc_questionnaire_expired));
            sKeys.put("layout/layout_kyc_toolbar_0", Integer.valueOf(e.layout_kyc_toolbar));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_address, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_country, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_date_of_birth, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_decuments_history, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_document, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_finish, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_gdpr, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_governance, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_governance_error, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_legal_name, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_navigator, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_phone_confirm, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_phone_input, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_phone_navigator, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_profile, 15);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_question_multi_choice, 16);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_question_single_choice, 17);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_question_text, 18);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_question_warning, 19);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_questionnaire_container, 20);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_reportable, 21);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_reportable_error, 22);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_risks, 23);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_sex, 24);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_steps, 25);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_kyc_tin, 26);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.fragment_phone_confirm, 27);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_country, 28);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_country_title, 29);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_kyc_answer_multi, 30);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_kyc_answer_single, 31);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_kyc_document, 32);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_kyc_step, 33);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.item_poa_type, 34);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_kyc_bottom_bar, 35);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_kyc_button, 36);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_kyc_phone_keyboard, 37);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_kyc_questionnaire_expired, 38);
        INTERNAL_LAYOUT_ID_LOOKUP.put(e.layout_kyc_toolbar, 39);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/fragment_kyc_address_0".equals(tag)) {
                            return new com.iqoption.kyc.b.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_address is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/fragment_kyc_country_0".equals(tag)) {
                            return new com.iqoption.kyc.b.d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_country is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/fragment_kyc_date_of_birth_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_date_of_birth is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/fragment_kyc_decuments_history_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_decuments_history is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/fragment_kyc_document_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_document is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/fragment_kyc_finish_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_finish is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/fragment_kyc_gdpr_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_gdpr is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/fragment_kyc_governance_0".equals(tag)) {
                            return new p(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_governance is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/fragment_kyc_governance_error_0".equals(tag)) {
                            return new r(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_governance_error is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 10:
                        if ("layout/fragment_kyc_legal_name_0".equals(tag)) {
                            return new t(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_legal_name is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 11:
                        if ("layout/fragment_kyc_navigator_0".equals(tag)) {
                            return new v(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_navigator is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 12:
                        if ("layout/fragment_kyc_phone_confirm_0".equals(tag)) {
                            return new x(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_phone_confirm is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 13:
                        if ("layout/fragment_kyc_phone_input_0".equals(tag)) {
                            return new z(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_phone_input is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 14:
                        if ("layout/fragment_kyc_phone_navigator_0".equals(tag)) {
                            return new ab(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_phone_navigator is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 15:
                        if ("layout/fragment_kyc_profile_0".equals(tag)) {
                            return new ad(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_profile is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 16:
                        if ("layout/fragment_kyc_question_multi_choice_0".equals(tag)) {
                            return new af(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_question_multi_choice is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 17:
                        if ("layout/fragment_kyc_question_single_choice_0".equals(tag)) {
                            return new ah(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_question_single_choice is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 18:
                        if ("layout/fragment_kyc_question_text_0".equals(tag)) {
                            return new aj(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_question_text is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 19:
                        if ("layout/fragment_kyc_question_warning_0".equals(tag)) {
                            return new al(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_question_warning is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 20:
                        if ("layout/fragment_kyc_questionnaire_container_0".equals(tag)) {
                            return new an(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_questionnaire_container is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 21:
                        if ("layout/fragment_kyc_reportable_0".equals(tag)) {
                            return new ap(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_reportable is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 22:
                        if ("layout/fragment_kyc_reportable_error_0".equals(tag)) {
                            return new ar(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_reportable_error is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 23:
                        if ("layout/fragment_kyc_risks_0".equals(tag)) {
                            return new at(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_risks is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 24:
                        if ("layout/fragment_kyc_sex_0".equals(tag)) {
                            return new av(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_sex is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 25:
                        if ("layout/fragment_kyc_steps_0".equals(tag)) {
                            return new ax(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_steps is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 26:
                        if ("layout/fragment_kyc_tin_0".equals(tag)) {
                            return new az(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_kyc_tin is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 27:
                        if ("layout/fragment_phone_confirm_0".equals(tag)) {
                            return new bb(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_phone_confirm is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 28:
                        if ("layout/item_country_0".equals(tag)) {
                            return new bd(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_country is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 29:
                        if ("layout/item_country_title_0".equals(tag)) {
                            return new bf(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_country_title is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 30:
                        if ("layout/item_kyc_answer_multi_0".equals(tag)) {
                            return new bh(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_kyc_answer_multi is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 31:
                        if ("layout/item_kyc_answer_single_0".equals(tag)) {
                            return new bj(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_kyc_answer_single is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 32:
                        if ("layout/item_kyc_document_0".equals(tag)) {
                            return new bl(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_kyc_document is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 33:
                        if ("layout/item_kyc_step_0".equals(tag)) {
                            return new bn(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_kyc_step is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 34:
                        if ("layout/item_poa_type_0".equals(tag)) {
                            return new bp(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for item_poa_type is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 35:
                        if ("layout/layout_kyc_bottom_bar_0".equals(tag)) {
                            return new br(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_kyc_bottom_bar is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 36:
                        if ("layout/layout_kyc_button_0".equals(tag)) {
                            return new bt(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_kyc_button is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 37:
                        if ("layout/layout_kyc_phone_keyboard_0".equals(tag)) {
                            return new bv(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_kyc_phone_keyboard is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 38:
                        if ("layout/layout_kyc_questionnaire_expired_0".equals(tag)) {
                            return new bx(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_kyc_questionnaire_expired is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 39:
                        if ("layout/layout_kyc_toolbar_0".equals(tag)) {
                            return new bz(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for layout_kyc_toolbar is invalid. Received: ");
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
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new c());
        arrayList.add(new com.iqoption.i.a());
        arrayList.add(new com.iqoption.widget.numpad.a());
        return arrayList;
    }
}
