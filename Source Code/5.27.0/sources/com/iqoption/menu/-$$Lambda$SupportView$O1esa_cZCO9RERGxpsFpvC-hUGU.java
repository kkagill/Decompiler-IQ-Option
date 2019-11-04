package com.iqoption.menu;

import android.view.View;
import android.view.View.OnClickListener;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SupportView$O1esa_cZCO9RERGxpsFpvC-hUGU implements OnClickListener {
    public static final /* synthetic */ -$$Lambda$SupportView$O1esa_cZCO9RERGxpsFpvC-hUGU INSTANCE = new -$$Lambda$SupportView$O1esa_cZCO9RERGxpsFpvC-hUGU();

    private /* synthetic */ -$$Lambda$SupportView$O1esa_cZCO9RERGxpsFpvC-hUGU() {
    }

    public final void onClick(View view) {
        EventManager.BS().a(new Event(Event.CATEGORY_TEXT_CHANGED, "new-support-dialog_text"));
    }
}
