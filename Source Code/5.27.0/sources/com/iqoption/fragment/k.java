package com.iqoption.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.app.IQApp;
import com.iqoption.x.R;

/* compiled from: EducationFragment */
public class k extends aj {
    public static k L(Bundle bundle) {
        k kVar = new k();
        kVar.setArguments(bundle);
        return kVar;
    }

    public static void a(Context context, FragmentManager fragmentManager, @IdRes int i) {
        Bundle bundle = new Bundle();
        String Vb = IQApp.Ev().Vb();
        bundle.putBoolean("EXTRA_IS_POST", false);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vb);
        stringBuilder.append("mobile/education/");
        bundle.putString("EXTRA_URL", stringBuilder.toString());
        bundle.putString("EXTRA_TITLE", context.getString(R.string.education));
        k L = L(bundle);
        String str = "EducationFragment";
        fragmentManager.beginTransaction().add(i, L, str).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(str).commit();
    }
}
