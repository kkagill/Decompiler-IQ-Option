package com.iqoption.fragment.dialog.popup.whatsnew.constructor;

import com.iqoption.core.microservices.popupserver.response.PopupAnchor;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[PopupAnchor.values().length];

    static {
        aob[PopupAnchor.TWO_BUTTON_V1.ordinal()] = 1;
        aob[PopupAnchor.ONE_BUTTON_V1.ordinal()] = 2;
        aob[PopupAnchor.WITHOUT_ACTION_V1.ordinal()] = 3;
    }
}
