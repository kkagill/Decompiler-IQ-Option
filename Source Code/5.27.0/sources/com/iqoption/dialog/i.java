package com.iqoption.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonElement;
import com.iqoption.app.managers.feature.c;
import com.iqoption.core.microservices.features.a.a;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.core.util.af;
import com.iqoption.e.he;
import com.iqoption.fragment.b.g;
import com.iqoption.view.d.b;
import com.iqoption.x.R;

/* compiled from: WarningDialog */
public final class i extends g {
    private he cHu;

    public String getEventName() {
        return "closed-warning-dialog";
    }

    public static void d(FragmentManager fragmentManager) {
        a(fragmentManager, (int) R.id.other_fragment, null);
    }

    public static void e(FragmentManager fragmentManager) {
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("WarningDialog");
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commitNow();
        }
    }

    private static void a(FragmentManager fragmentManager, @IdRes int i, Bundle bundle) {
        e(fragmentManager);
        fragmentManager.beginTransaction().add(i, H(bundle), "WarningDialog").commit();
    }

    private static i H(Bundle bundle) {
        i iVar = new i();
        if (bundle != null) {
            iVar.setArguments(bundle);
        }
        return iVar;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cHu = he.p(layoutInflater, viewGroup, false);
        return this.cHu.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        a ei = c.Iw().ei("platform-troubles");
        if (ei != null) {
            if (!"disabled".equalsIgnoreCase(ei.getStatus())) {
                JsonElement ady = ei.ady();
                if (ady.isJsonObject()) {
                    JsonElement jsonElement = ady.getAsJsonObject().get(ei.getStatus());
                    if (jsonElement.isJsonObject()) {
                        String asString = jsonElement.getAsJsonObject().get("token").getAsString();
                        if (!TextUtils.isEmpty(asString)) {
                            asString = LocalizationUtil.hq(asString);
                            if (!TextUtils.isEmpty(asString)) {
                                this.cHu.cdD.setText(af.hw(asString));
                            }
                        }
                    }
                }
            }
        }
        this.cHu.bYq.setOnClickListener(new b() {
            public void M(View view) {
                i.this.onClose();
            }
        });
    }

    public boolean onClose() {
        e(getFragmentManager());
        return true;
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}
