package com.iqoption.view.b;

import android.content.Context;
import android.util.AttributeSet;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.fragment.ah;
import java.lang.ref.WeakReference;

/* compiled from: TradeFragmentFrameLayout */
public class c extends a {
    private WeakReference<ah> bJf;

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ah getTradeFragment() {
        if (this.bJf == null) {
            this.bJf = new WeakReference(((TradeRoomActivity) getContext()).getTradeFragment());
        }
        ah ahVar = (ah) this.bJf.get();
        if (ahVar != null) {
            return ahVar;
        }
        this.bJf = null;
        return ((TradeRoomActivity) getContext()).getTradeFragment();
    }
}
