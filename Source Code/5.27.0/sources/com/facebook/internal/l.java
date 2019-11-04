package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentWrapper */
public class l {
    private Fragment yR;
    private android.app.Fragment yS;

    public l(Fragment fragment) {
        aa.b((Object) fragment, "fragment");
        this.yR = fragment;
    }

    public void startActivityForResult(Intent intent, int i) {
        Fragment fragment = this.yR;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            this.yS.startActivityForResult(intent, i);
        }
    }

    public final Activity getActivity() {
        Fragment fragment = this.yR;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return this.yS.getActivity();
    }
}
