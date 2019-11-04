package com.iqoption.fragment.account.security.sms;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.google.common.b.e;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.app.IQApp;
import com.iqoption.app.b.b.o;
import com.iqoption.e.ii;
import com.iqoption.mobbtech.connect.response.k;
import com.iqoption.util.ae;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

public class SmsFragment extends Fragment implements com.iqoption.fragment.account.security.phone.a.b, com.iqoption.fragment.account.security.phone.b.b, com.iqoption.fragment.account.security.sms.a.a, com.iqoption.fragment.account.security.sms.b.b {
    public static final String TAG = "com.iqoption.fragment.account.security.sms.SmsFragment";
    private com.iqoption.app.b cZJ;
    private Object cZK;
    private c cZL = new c(this, null);
    private ii cZd;

    /* renamed from: com.iqoption.fragment.account.security.sms.SmsFragment$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] cZN = new int[SmsScreens.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.fragment.account.security.sms.SmsFragment.SmsScreens.values();
            r0 = r0.length;
            r0 = new int[r0];
            cZN = r0;
            r0 = cZN;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.fragment.account.security.sms.SmsFragment.SmsScreens.waitingForPhoneConfirmation;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = cZN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.fragment.account.security.sms.SmsFragment.SmsScreens.turnOnOffAuthentication;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = cZN;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.fragment.account.security.sms.SmsFragment.SmsScreens.confirmationCodeSent;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.account.security.sms.SmsFragment$AnonymousClass2.<clinit>():void");
        }
    }

    private enum SmsScreens {
        waitingForPhoneConfirmation,
        turnOnOffAuthentication,
        confirmationCodeSent,
        confirmationCodeExpired
    }

    private static class c {
        private final WeakReference<SmsFragment> bJf;

        /* synthetic */ c(SmsFragment smsFragment, AnonymousClass1 anonymousClass1) {
            this(smsFragment);
        }

        private c(SmsFragment smsFragment) {
            this.bJf = new WeakReference(smsFragment);
        }

        @e
        public void onTwoFactorAuthEnabled(com.iqoption.app.b.b.c cVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    SmsFragment smsFragment = (SmsFragment) c.this.bJf.get();
                    if (smsFragment != null) {
                        com.iqoption.app.d.aP(smsFragment.getContext()).Z(0);
                        com.iqoption.app.d.aP(smsFragment.getContext()).dO(0);
                        boolean Ec = smsFragment.cZJ.Ec();
                        PhoneNumber DV = smsFragment.cZJ.DV();
                        if (smsFragment.isAdded() && smsFragment.cZd.cfa.getChildCount() == 1) {
                            View childAt = smsFragment.cZd.cfa.getChildAt(0);
                            boolean equals = ae.equals(childAt.getTag(), com.iqoption.fragment.account.security.phone.a.TAG);
                            boolean equals2 = ae.equals(childAt.getTag(), com.iqoption.fragment.account.security.phone.b.TAG);
                            if (equals || equals2) {
                                com.iqoption.core.util.b.b(smsFragment.a(DV.xK(), DV.yj(), Ec, null), smsFragment.cZd.cfa, true);
                            }
                        }
                    }
                }
            });
        }

        @e
        public void onPhoneConfirmed(o oVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    SmsFragment smsFragment = (SmsFragment) c.this.bJf.get();
                    if (smsFragment != null && smsFragment.isAdded() && smsFragment.cZd.cfa.getChildCount() == 1 && ae.equals(smsFragment.cZd.cfa.getChildAt(0).getTag(), a.TAG) && smsFragment.cZJ.Eo()) {
                        PhoneNumber DV = smsFragment.cZJ.DV();
                        com.iqoption.core.util.b.b(smsFragment.a(DV.xK(), DV.yj(), smsFragment.cZJ.Ec(), null), smsFragment.cZd.cfa, true);
                    }
                }
            });
        }
    }

    public interface d {
        void k(int i, long j);
    }

    private static class a extends com.iqoption.mobbtech.connect.response.k.a<SmsFragment> {
        public a(SmsFragment smsFragment) {
            super(smsFragment);
        }

        /* renamed from: a */
        public void v(SmsFragment smsFragment, k kVar) {
            super.v(smsFragment, kVar);
            smsFragment.azM();
        }
    }

    private static class b extends com.iqoption.mobbtech.connect.response.k.a<SmsFragment> {
        private final boolean cZO;

        public b(SmsFragment smsFragment, boolean z) {
            super(smsFragment);
            this.cZO = z;
        }

        /* renamed from: a */
        public void v(SmsFragment smsFragment, k kVar) {
            smsFragment.dz(this.cZO);
        }
    }

    public void m(int i, long j) {
    }

    public static SmsFragment azL() {
        SmsFragment smsFragment = new SmsFragment();
        smsFragment.setArguments(new Bundle());
        return smsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cZd = (ii) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_account_security_page, viewGroup, false);
        this.cZJ = com.iqoption.app.b.aK(getContext());
        if (!this.cZJ.Eo()) {
            a(SmsScreens.waitingForPhoneConfirmation);
        } else if (bg(azG())) {
            a(SmsScreens.turnOnOffAuthentication);
        } else {
            a(SmsScreens.confirmationCodeSent);
        }
        IQApp.Ex().bb(this.cZL);
        if (!(getParentFragment() instanceof d)) {
            Log.e(TAG, "OnFragmentInteractionListener is not implemented by target fragment");
        }
        return this.cZd.getRoot();
    }

    public void onDestroyView() {
        IQApp.Ex().bc(this.cZL);
        bZ(null);
        super.onDestroyView();
    }

    private void bZ(Object obj) {
        if (this.cZK != null) {
            IQApp.Ex().bc(this.cZK);
        }
        this.cZK = obj;
        if (this.cZK != null) {
            IQApp.Ex().bb(this.cZK);
        }
    }

    private void a(SmsScreens smsScreens) {
        PhoneNumber DV = this.cZJ.DV();
        int i = AnonymousClass2.cZN[smsScreens.ordinal()];
        if (i == 1) {
            d(DV.xK(), DV.yj(), this.cZd.cfa);
        } else if (i == 2) {
            a(DV.xK(), DV.yj(), this.cZJ.Ec(), this.cZd.cfa);
        } else if (i == 3) {
            a(DV.xK(), DV.yj(), com.iqoption.app.d.aP(getContext()).FK(), (int) azG(), this.cZd.cfa);
        }
    }

    public void v(int i, long j) {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof d) {
            ((d) parentFragment).k(i, j);
        }
    }

    private void dz(boolean z) {
        com.iqoption.app.d.aP(getContext()).Z(0);
        com.iqoption.app.d.aP(getContext()).dO(0);
        PhoneNumber DV = this.cZJ.DV();
        com.iqoption.core.util.b.a(a(DV.xK(), DV.yj(), z, null), this.cZd.cfa, true);
    }

    private void azM() {
        PhoneNumber DV = this.cZJ.DV();
        com.iqoption.app.d.aP(getContext()).Z(System.currentTimeMillis());
        com.iqoption.core.util.b.a(a(DV.xK(), DV.yj(), 0, 300000, null), this.cZd.cfa, true);
    }

    public t<? extends com.iqoption.core.microservices.c> a(boolean z, int i, long j) {
        if (bg(azG())) {
            t a = com.iqoption.mobbtech.connect.request.api.a.a(getContext(), z, Optional.pW());
            p.a(a, new a(this), com.iqoption.core.c.a.biN);
            return a;
        }
        com.iqoption.core.util.b.a(a(i, j, com.iqoption.app.d.aP(getContext()).FK(), (int) azG(), null), this.cZd.cfa, true);
        return p.bo(new com.iqoption.core.microservices.c() {
            public String getMessage() {
                return "";
            }

            public boolean isSuccessful() {
                return true;
            }
        });
    }

    public t<? extends com.iqoption.core.microservices.c> a(int i, long j, String str) {
        boolean Ec = this.cZJ.Ec() ^ 1;
        t a = com.iqoption.mobbtech.connect.request.api.a.a(getContext(), Ec, Optional.an(str));
        p.a(a, new b(this, Ec), com.iqoption.core.c.a.biN);
        return a;
    }

    public void n(int i, long j) {
        com.iqoption.app.d.aP(getContext()).Z(0);
        com.iqoption.app.d.aP(getContext()).dO(0);
        com.iqoption.core.util.b.a(b(i, j, null), this.cZd.cfa, true);
    }

    public t<? extends com.iqoption.core.microservices.c> l(int i, long j) {
        t a = com.iqoption.mobbtech.connect.request.api.a.a(getContext(), this.cZJ.Ec() ^ 1, Optional.pW());
        p.a(a, new a(this), com.iqoption.core.c.a.biN);
        return a;
    }

    public void o(int i, long j) {
        com.iqoption.core.util.b.a(a(i, j, this.cZJ.Ec(), null), this.cZd.cfa, true);
    }

    @NonNull
    private View a(int i, long j, boolean z, ViewGroup viewGroup) {
        b a = b.a(getContext(), viewGroup, i, j, z, this);
        bZ(a.azN());
        return a.getView();
    }

    @NonNull
    private View d(int i, long j, ViewGroup viewGroup) {
        a b = a.b(getContext(), viewGroup, i, j);
        b.a(this);
        return b.getView();
    }

    @NonNull
    private View a(int i, long j, int i2, int i3, ViewGroup viewGroup) {
        return com.iqoption.fragment.account.security.phone.b.b(getContext(), viewGroup, i, j, i2, i3, this).getView();
    }

    @NonNull
    private View b(int i, long j, ViewGroup viewGroup) {
        return com.iqoption.fragment.account.security.phone.a.b(getContext(), viewGroup, i, j, this).getView();
    }

    private long azG() {
        return com.iqoption.core.e.b.bf(com.iqoption.app.d.aP(getContext()).FJ());
    }

    private boolean bg(long j) {
        return com.iqoption.core.e.b.bg(j);
    }
}
