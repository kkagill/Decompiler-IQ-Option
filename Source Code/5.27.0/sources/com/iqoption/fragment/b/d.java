package com.iqoption.fragment.b;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.activity.b;
import com.iqoption.fragment.ah;
import io.reactivex.disposables.a;

/* compiled from: IQFragment */
public abstract class d extends com.iqoption.util.fragmentstack.d {
    @NonNull
    private final a bIJ = new a();
    @NonNull
    private final a cXt = new a();
    protected boolean ddo = false;
    private long ddp = 0;

    public boolean onClose() {
        return false;
    }

    public boolean akX() {
        FragmentActivity activity = getActivity();
        return activity instanceof com.iqoption.core.ui.a.a ? ((com.iqoption.core.ui.a.a) activity).akX() : false;
    }

    @Nullable
    public TradeRoomActivity getTradeRoomActivity() {
        if (getActivity() instanceof TradeRoomActivity) {
            return (TradeRoomActivity) getActivity();
        }
        return null;
    }

    @Nullable
    public ah PM() {
        TradeRoomActivity tradeRoomActivity = getTradeRoomActivity();
        if (tradeRoomActivity == null) {
            return null;
        }
        return tradeRoomActivity.getTradeFragment();
    }

    @Nullable
    public b aBM() {
        if (getActivity() instanceof b) {
            return (b) getActivity();
        }
        return null;
    }

    public boolean onBackPressed() {
        if (!isAdded() || System.currentTimeMillis() - this.ddp < 300) {
            return true;
        }
        this.ddp = System.currentTimeMillis();
        return onClose();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.ddo = true;
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(bundle);
    }

    public void onPause() {
        this.cXt.clear();
        super.onPause();
    }

    public void onDestroy() {
        this.bIJ.clear();
        super.onDestroy();
    }

    public final int fA(@DimenRes int i) {
        return getResources().getDimensionPixelSize(i);
    }

    public final float gd(@DimenRes int i) {
        return getResources().getDimension(i);
    }

    @ColorInt
    public final int getColor(@ColorRes int i) {
        return ContextCompat.getColor(getContext(), i);
    }

    public Drawable getDrawable(@DrawableRes int i) {
        return ContextCompat.getDrawable(getContext(), i);
    }

    @Deprecated
    public void a(@NonNull io.reactivex.disposables.b bVar) {
        this.bIJ.e(bVar);
    }
}
