package com.iqoption.portfolio.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.iqoption.e.dq;
import com.iqoption.fragment.b.a;
import com.iqoption.util.e;

/* compiled from: MessageBottomSheet */
public final class c extends a {
    private final long dPh = 3000;
    private Runnable dPi = new Runnable() {
        public void run() {
            c.this.onBackPressed();
        }
    };
    private dq dPj;

    public static void a(@IdRes int i, FragmentManager fragmentManager, String str) {
        String str2 = "MessageBottomSheet";
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str2);
        if (findFragmentByTag != null) {
            ((c) findFragmentByTag).onBackPressed();
        }
        c cVar = new c();
        cVar.setArguments(new e().aF(".arg.message.text", str).toBundle());
        fragmentManager.beginTransaction().add(i, cVar, str2).addToBackStack(str2).commit();
    }

    /* Access modifiers changed, original: protected */
    public View atP() {
        return this.dPj.bYz;
    }

    /* Access modifiers changed, original: protected */
    public View atQ() {
        return this.dPj.bYo;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String string = getArguments().getString(".arg.message.text");
        if (TextUtils.isEmpty(string)) {
            onClose();
        }
        this.dPj = dq.c(layoutInflater, viewGroup, false);
        this.dPj.bYz.setText(string);
        this.dPj.getRoot().postDelayed(this.dPi, 3000);
        return this.dPj.getRoot();
    }

    /* Access modifiers changed, original: protected */
    public void aBJ() {
        this.dPj.getRoot().removeCallbacks(this.dPi);
        this.dPi = null;
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}
