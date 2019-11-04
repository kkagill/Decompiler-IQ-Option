package com.iqoption.fragment.account.security.phone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.kyc.response.e;
import com.iqoption.e.g;
import com.iqoption.util.ag;
import com.iqoption.x.R;

/* compiled from: ConfirmPhoneViewHelper */
public class c {
    public static final String TAG = "com.iqoption.fragment.account.security.phone.c";
    private int cZo;
    private long cZp;
    private g cZu;
    private b cZv;

    /* compiled from: ConfirmPhoneViewHelper */
    public interface b {
        void m(int i, long j);

        t<e> q(int i, long j);
    }

    /* compiled from: ConfirmPhoneViewHelper */
    private static class a extends com.iqoption.system.c.b<c, e> {
        private a(c cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void c(c cVar, Throwable th) {
            cVar.d(false, false);
        }
    }

    public static c a(Context context, ViewGroup viewGroup, int i, long j, b bVar) {
        c cVar = new c();
        cVar.cZo = i;
        cVar.cZp = j;
        cVar.cZv = bVar;
        cVar.a(context, viewGroup);
        cVar.cZu.getRoot().setTag(TAG);
        cVar.p(i, j);
        return cVar;
    }

    public View getView() {
        return this.cZu.getRoot();
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.cZu = (g) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_confirm_phone_fragment, viewGroup, viewGroup != null);
        this.cZu.a(this);
    }

    private void p(int i, long j) {
        if (i > 0) {
            this.cZu.bSJ.setText(ag.x(i, j));
            this.cZu.bSI.setEnabled(true);
        } else if (j > 0) {
            this.cZu.bSJ.setText(String.valueOf(j));
            this.cZu.bSI.setEnabled(true);
        } else {
            this.cZu.bSI.setEnabled(false);
        }
    }

    public void LJ() {
        d(true, true);
        p.a(this.cZv.q(this.cZo, this.cZp), new a(), com.iqoption.core.c.a.biN);
    }

    public void azE() {
        b bVar = this.cZv;
        if (bVar != null) {
            bVar.m(this.cZo, this.cZp);
        }
    }

    private void d(boolean z, boolean z2) {
        this.cZu.bSJ.setEnabled(z ^ 1);
        this.cZu.bSw.setEnabled(z ^ 1);
        this.cZu.bSI.d(z, z2);
    }
}
