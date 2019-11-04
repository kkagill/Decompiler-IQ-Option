package com.iqoption.fragment.account.security.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.google.common.b.e;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.b.b.g;
import com.iqoption.dto.Event;
import com.iqoption.e.ii;
import com.iqoption.kyc.i;
import com.iqoption.mobbtech.connect.response.j;
import com.iqoption.mobbtech.connect.response.k;
import com.iqoption.x.R;

/* compiled from: EmailFragment */
public class c extends Fragment implements com.iqoption.fragment.account.security.a.a.b, com.iqoption.fragment.account.security.a.d.a {
    public static final String TAG = "com.iqoption.fragment.account.security.a.c";
    private ii cZd;
    private Handler cZe = new Handler(Looper.getMainLooper());
    private a cZf;

    /* compiled from: EmailFragment */
    private class a {
        private boolean cZg;
        private boolean cZh;

        public a(boolean z, boolean z2) {
            this.cZh = z;
            this.cZg = z2;
        }

        @e
        public void emailChanged(g gVar) {
            update();
        }

        @e
        public void accountIsActivated(com.iqoption.app.b.b.a aVar) {
            update();
        }

        private void update() {
            c.this.cZe.post(new Runnable() {
                public void run() {
                    if (!a.this.cZg && c.bt(c.this.getContext())) {
                        c.this.im(com.iqoption.app.b.aK(c.this.getContext()).getEmail());
                    } else if (!a.this.cZh && c.this.azy()) {
                        c.this.il(c.this.getEmail());
                    } else if (a.this.cZg && !c.bt(c.this.getContext())) {
                        c.this.il(c.this.getEmail());
                    }
                    a aVar = a.this;
                    aVar.cZg = c.bt(c.this.getContext());
                    aVar = a.this;
                    aVar.cZh = c.this.azy();
                }
            });
        }
    }

    /* compiled from: EmailFragment */
    private static class b extends com.iqoption.mobbtech.connect.response.k.a<c> {
        private final String email;

        private b(c cVar, String str) {
            super(cVar);
            this.email = str;
        }

        /* renamed from: a */
        public void onSuccess(k kVar) {
            c cVar = (c) aUE();
            if (cVar != null) {
                if (!TextUtils.isEmpty(kVar.getMessage())) {
                    com.iqoption.app.a.b.b(kVar.getMessage(), cVar.getContext());
                }
                cVar.il(this.email);
            }
        }
    }

    public static c azv() {
        return new c();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cZd = (ii) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_account_security_page, viewGroup, false);
        azx();
        this.cZf = new a(azy(), bt(getContext()));
        IQApp.Ex().bb(this.cZf);
        return this.cZd.getRoot();
    }

    public void onDestroyView() {
        if (this.cZf != null) {
            IQApp.Ex().bc(this.cZf);
        }
        super.onDestroyView();
    }

    public t<j> ik(String str) {
        t iG = new i(getContext()).iG(str);
        p.a(iG, new b(str), com.iqoption.core.c.a.biN);
        return iG;
    }

    public void azw() {
        com.iqoption.core.util.b.a(a.a(getContext(), null, getEmail(), this).getView(), this.cZd.cfa, true);
        EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "security_email-resend"));
    }

    private void azx() {
        if (!azy()) {
            a.a(getContext(), this.cZd.cfa, getEmail(), this);
        } else if (bt(getContext())) {
            b.a(getContext(), this.cZd.cfa, getEmail());
        } else {
            d.a(getContext(), this.cZd.cfa, getEmail(), this);
        }
    }

    private void il(String str) {
        com.iqoption.core.util.b.a(d.a(getContext(), null, str, this).getView(), this.cZd.cfa, true);
    }

    private void im(String str) {
        com.iqoption.core.util.b.a(b.a(getContext(), null, str).getView(), this.cZd.cfa, true);
    }

    private boolean azy() {
        return TextUtils.isEmpty(com.iqoption.app.b.aK(getContext()).getEmail()) ^ 1;
    }

    public static boolean bt(Context context) {
        return com.iqoption.app.b.aK(context).Eq();
    }

    private String getEmail() {
        return com.iqoption.app.b.aK(getContext()).Eb();
    }
}
