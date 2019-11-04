package com.iqoption.fragment.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.b;
import com.iqoption.app.d;
import com.iqoption.app.managers.feature.a;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.sr;
import com.iqoption.fragment.b.g;
import com.iqoption.popup.c;
import com.iqoption.x.R;
import java.util.Locale;

/* compiled from: MoreTradingOpportunities */
public class f extends g {
    private static final String TAG = "com.iqoption.fragment.dialog.f";

    public String getEventName() {
        return "more-opportunities_popup-shown";
    }

    public static boolean d(FragmentActivity fragmentActivity, FragmentManager fragmentManager) {
        if (!bw((Context) fragmentActivity)) {
            return false;
        }
        c.A(fragmentActivity).a(new -$$Lambda$f$SwUKP1S6MT0BxUrgSdeLZGKRg80(fragmentManager), TAG);
        return true;
    }

    private static void d(FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().add(R.id.fragment, new f(), TAG).addToBackStack(TAG).commitAllowingStateLoss();
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sr srVar = (sr) DataBindingUtil.inflate(layoutInflater, R.layout.more_trading_opportunities, viewGroup, false);
        srVar.cle.setOnClickListener(new -$$Lambda$f$uJSMvrv7QptxfPLIIxVERYFKpwY(this));
        srVar.cop.setOnClickListener(new -$$Lambda$f$09r1LWsibzFqLfva2scTVr1573Y(this));
        d.Fa().bl(true);
        return srVar.getRoot();
    }

    private /* synthetic */ void bv(View view) {
        aBU();
    }

    private void aBU() {
        onClose();
        Context activity = getActivity();
        if (activity != null) {
            com.iqoption.core.util.b.d.a(activity, aBV(), null, null);
        }
    }

    private String aBV() {
        String Vi = IQApp.Ev().Vi();
        Builder Builder = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "more-opportunities_download-button-click");
        String str = "%sdownload";
        if (b.DG().Ej()) {
            String DB = d.Fa().DB();
            String FF = d.Fa().FF();
            if (TextUtils.isEmpty(DB) || TextUtils.isEmpty(FF)) {
                EventManager.BS().a(Builder.build());
                return String.format(Locale.US, str, new Object[]{Vi});
            }
            EventManager.BS().a(Builder.setParameters(u.anp().o("aff", DB).o("aff_track", FF).anr()).build());
            return String.format(Locale.US, "%sdownload?aff=%s&afftrack=%s&platform=2", new Object[]{Vi, DB, FF});
        }
        EventManager.BS().a(Builder.build());
        return String.format(Locale.US, str, new Object[]{Vi});
    }

    /* Access modifiers changed, original: protected */
    public int aBO() {
        return getResources().getDimensionPixelSize(R.dimen.dp394);
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        c.A(requireActivity()).jr(TAG);
        return true;
    }

    public static boolean bw(@NonNull Context context) {
        b aK = b.aK(context);
        return a.ef("more-trading-opportunities") && (!aK.Er() || aK.Ef());
    }
}
