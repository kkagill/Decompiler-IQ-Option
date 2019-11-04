package com.iqoption.menu;

import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, bng = {"updateTabsBackground", "", "tabs", "", "Lcom/iqoption/menu/PersonalInfoTab;", "app_optionXRelease"})
/* compiled from: PersonalInfoTab.kt */
public final class b {
    public static final void bj(List<a> list) {
        kotlin.jvm.internal.i.f(list, "tabs");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (((a) next).aNP()) {
                arrayList.add(next);
            }
        }
        List<a> list2 = (List) arrayList;
        int i = 0;
        for (a aVar : list2) {
            int i2 = i == 0 ? R.drawable.btn_rounded_left : i == list2.size() + -1 ? R.drawable.btn_rounded_right : R.drawable.btn_between_state;
            aVar.getView().setBackgroundResource(i2);
            i++;
        }
    }
}
