package com.iqoption.fragment.account.security.touchId;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.e.ii;
import com.iqoption.x.R;

/* compiled from: TouchIdFragment */
public class b extends Fragment implements com.iqoption.fragment.account.security.touchId.c.b {
    private static final String TAG = "com.iqoption.fragment.account.security.touchId.b";
    private ii cZd;
    private Object dak;

    /* compiled from: TouchIdFragment */
    public interface a {
        void azo();

        t<Long> dx(boolean z);
    }

    public static b azW() {
        b bVar = new b();
        bVar.setArguments(new Bundle());
        return bVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        this.cZd = (ii) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_account_security_page, viewGroup, false);
        if (d.aP(getContext()).FM() >= 0) {
            z = true;
        }
        a(z, this.cZd.cfa);
        boolean z2 = getParentFragment() instanceof a;
        return this.cZd.getRoot();
    }

    public void onDestroyView() {
        if (this.dak != null) {
            IQApp.Ex().bc(this.dak);
            this.dak = null;
        }
        super.onDestroyView();
    }

    public void azo() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof a) {
            ((a) parentFragment).azo();
        }
    }

    public t<Long> dx(boolean z) {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof a) {
            return ((a) parentFragment).dx(z);
        }
        return p.m(new UnsupportedOperationException());
    }

    @NonNull
    private View a(boolean z, ViewGroup viewGroup) {
        c a = c.a(getContext(), viewGroup, z, this);
        this.dak = a.azX();
        IQApp.Ex().bb(this.dak);
        return a.getView();
    }
}
