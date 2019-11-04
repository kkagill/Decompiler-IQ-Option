package com.iqoption.fragment.dialog.popup.whatsnew.depositpage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.microservices.popupserver.response.a;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.e.abb;
import com.iqoption.fragment.b.g;
import com.iqoption.popup.c;
import com.iqoption.util.e;
import com.iqoption.view.d.b;
import com.iqoption.x.R;

/* compiled from: WhatsNewDepositPageDialogFragment */
public class d extends g {
    private c aju;
    private a deR;

    public String getEventName() {
        return "whats-new_show-popup";
    }

    public static void a(FragmentActivity fragmentActivity, a aVar) {
        c.A(fragmentActivity).a(new -$$Lambda$d$lcFVH82Polhx9UoQKphwZuf-QY4(fragmentActivity.getSupportFragmentManager(), aVar), aVar);
    }

    private static void a(FragmentManager fragmentManager, a aVar) {
        String str = "WhatsNewDepositPageDialogFragment";
        fragmentManager.beginTransaction().add(R.id.fragment, l(aVar), str).addToBackStack(str).commitAllowingStateLoss();
    }

    private static d l(a aVar) {
        d dVar = new d();
        dVar.setArguments(new e().b("ARG_DIALOG_TYPE", (Parcelable) aVar).toBundle());
        return dVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.aju = c.A(requireActivity());
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        abb abb = (abb) DataBindingUtil.inflate(layoutInflater, R.layout.whats_new_dialog_experimental_deposit_page, viewGroup, false);
        abb.a(this);
        b bVar = new b(new -$$Lambda$d$IRBtyfsEIXUV2kk2od4gosz0gBg(this));
        abb.aIq.addItemDecoration(new com.iqoption.widget.a(2, fA(R.dimen.dp10), false));
        abb.aIq.hasFixedSize();
        abb.aIq.setAdapter(bVar);
        bundle = getArguments();
        if (bundle != null) {
            this.deR = (a) bundle.getParcelable("ARG_DIALOG_TYPE");
            a aa = a.aa(this);
            aa.k(this.deR);
            aa.aCV().observe(this, new -$$Lambda$d$IjzCaE_O1uy_ccJ4yBPcCrXmqf4(bVar));
        }
        abb.bYh.setOnClickListener(new b() {
            public void M(View view) {
                TradeRoomActivity tradeRoomActivity = d.this.getTradeRoomActivity();
                if (tradeRoomActivity != null) {
                    if (com.iqoption.app.b.aK(tradeRoomActivity).Ej()) {
                        com.iqoption.welcomeonboarding.a.d(tradeRoomActivity.getSupportFragmentManager());
                    } else {
                        tradeRoomActivity.Ao();
                    }
                }
                d.this.onBackPressed();
            }
        });
        return abb.getRoot();
    }

    private /* synthetic */ void f(BankItem bankItem) {
        TradeRoomActivity tradeRoomActivity = getTradeRoomActivity();
        if (tradeRoomActivity != null) {
            if (com.iqoption.app.b.aK(tradeRoomActivity).Ej()) {
                com.iqoption.welcomeonboarding.a.d(tradeRoomActivity.getSupportFragmentManager());
            } else {
                tradeRoomActivity.a(bankItem.aCU(), true);
            }
        }
        onBackPressed();
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Nullable
    public JsonObject aBP() {
        return u.anp().o("type", this.deR.agi() != null ? this.deR.agi() : "").anr();
    }

    public boolean onClose() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "whats-new_close").build());
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.popBackStack();
        }
        this.aju.m(this.deR);
        return true;
    }
}
