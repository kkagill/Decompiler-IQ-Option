package com.iqoption.fragment.account.security.phone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.c;
import com.iqoption.x.R;

/* compiled from: ConfirmCodeExpiredViewHelper */
public class a {
    public static final String TAG = "com.iqoption.fragment.account.security.phone.a";
    private com.iqoption.e.a cZm;
    private b cZn;
    private int cZo;
    private long cZp;

    /* compiled from: ConfirmCodeExpiredViewHelper */
    public interface b {
        t<? extends c> l(int i, long j);
    }

    /* compiled from: ConfirmCodeExpiredViewHelper */
    private static class a extends com.iqoption.system.c.b<a, c> {
        private a(a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void v(a aVar, c cVar) {
            super.v(aVar, cVar);
        }

        /* renamed from: a */
        public void c(a aVar, Throwable th) {
            aVar.d(false, false);
        }
    }

    public static a a(Context context, ViewGroup viewGroup, int i, long j, b bVar) {
        a c = c(context, viewGroup, i, j, bVar);
        c.cZm.bSr.setText(R.string.phone_text);
        return c;
    }

    public static a b(Context context, ViewGroup viewGroup, int i, long j, b bVar) {
        a c = c(context, viewGroup, i, j, bVar);
        c.cZm.bSr.setText(R.string.two_factor_text);
        return c;
    }

    private static a c(Context context, ViewGroup viewGroup, int i, long j, b bVar) {
        a aVar = new a();
        aVar.cZo = i;
        aVar.cZp = j;
        aVar.cZn = bVar;
        aVar.a(context, viewGroup);
        aVar.cZm.getRoot().setTag(TAG);
        return aVar;
    }

    public View getView() {
        return this.cZm.getRoot();
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.cZm = (com.iqoption.e.a) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_confirm_code_expired_fragment, viewGroup, viewGroup != null);
        this.cZm.a(this);
    }

    public void azA() {
        d(true, true);
        p.a(this.cZn.l(this.cZo, this.cZp), new a(), com.iqoption.core.c.a.biN);
    }

    private void d(boolean z, boolean z2) {
        this.cZm.bSs.d(z, z2);
    }
}
