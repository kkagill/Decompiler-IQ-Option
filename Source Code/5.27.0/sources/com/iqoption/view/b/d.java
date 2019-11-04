package com.iqoption.view.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.iqoption.activity.TradeRoomActivity;

/* compiled from: TradeFragmentHorizontalScrollView */
public class d extends b {
    public d(Context context) {
        super(context);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public d(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        if (!(context instanceof TradeRoomActivity)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The context must be TradeRoomActivity, but was ");
            stringBuilder.append(context);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    @NonNull
    public TradeRoomActivity getTradeRoomActivity() {
        return (TradeRoomActivity) getContext();
    }
}
