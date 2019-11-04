package com.iqoption.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.iqoption.analytics.o;
import com.iqoption.app.IQApp;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.j;
import com.iqoption.dto.Event.Builder;
import com.iqoption.fragment.b.h;
import com.iqoption.fragment.rightpanel.f;
import com.iqoption.popup.c;
import com.iqoption.util.e;
import com.iqoption.x.R;
import java.util.Locale;

/* compiled from: CryptoStoryFragment */
public final class i extends h {
    private static final String TAG = "com.iqoption.fragment.i";
    private j cVa;
    private Builder cVb;

    /* compiled from: CryptoStoryFragment */
    public static final class a {
    }

    /* compiled from: CryptoStoryFragment */
    public static final class b {
        public final boolean cVc;

        public b(boolean z) {
            this.cVc = z;
        }
    }

    public void PX() {
    }

    public static void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, int i, Rect rect) {
        c.A(fragmentActivity).a(new -$$Lambda$i$CBCzEDXsNsZeKpCWDmiiJjVKWJw(fragmentManager, i, rect), TAG);
    }

    private static void a(FragmentManager fragmentManager, int i, Rect rect) {
        if (fragmentManager.findFragmentByTag(TAG) == null) {
            fragmentManager.beginTransaction().add(R.id.fragment, a(i, rect), TAG).addToBackStack(TAG).commit();
        }
    }

    private static Fragment a(int i, Rect rect) {
        i iVar = new i();
        iVar.setArguments(new e().O("arg.activeId", i).a("arg.revealRect", (Parcelable) rect).toBundle());
        return iVar;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Bundle arguments = getArguments();
        this.cVa = (j) com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(arguments.getInt("arg.activeId")), InstrumentType.CRYPTO_INSTRUMENT);
        j jVar = this.cVa;
        if (jVar == null) {
            onClose();
            return;
        }
        String a = f.a(jVar.getInstrumentId(), Locale.getDefault());
        if (TextUtils.isEmpty(a)) {
            onClose();
            return;
        }
        arguments.putString("arg.videoPath", a);
        this.ddz = false;
        super.onViewCreated(view, bundle);
        this.cVb = o.Cx();
        IQApp.Ex().bd(new b(true));
    }

    public void onDestroyView() {
        super.onDestroyView();
        j jVar = this.cVa;
        if (jVar != null) {
            o.a(this.cVb, jVar);
        }
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        c.A(requireActivity()).jr(TAG);
        IQApp.Ex().bd(new b(false));
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void axE() {
        super.axE();
        a(500, com.iqoption.view.a.a.c.egR);
        IQApp.Ex().bd(new a());
    }
}
