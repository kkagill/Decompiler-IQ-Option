package com.iqoption.fragment.account.security.phone;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.google.common.b.e;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.app.b.b.o;
import com.iqoption.e.ii;
import com.iqoption.mobbtech.connect.response.MobbErrorException;
import com.iqoption.util.v;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

public class PhoneFragment extends Fragment implements com.iqoption.fragment.account.security.phone.a.b, com.iqoption.fragment.account.security.phone.b.b, com.iqoption.fragment.account.security.phone.c.b, com.iqoption.fragment.account.security.phone.e.b {
    private static final String ARG_COUNTRY_CODE;
    public static final String TAG = "com.iqoption.fragment.account.security.phone.PhoneFragment";
    private static final String cZy;
    private ii cZd;
    private int cZo;
    private long cZp;
    private b cZz = new b(this, null);

    /* renamed from: com.iqoption.fragment.account.security.phone.PhoneFragment$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] cZA = new int[ConfirmState.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.iqoption.fragment.account.security.phone.PhoneFragment.ConfirmState.values();
            r0 = r0.length;
            r0 = new int[r0];
            cZA = r0;
            r0 = cZA;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.fragment.account.security.phone.PhoneFragment.ConfirmState.waitingForNumber;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = cZA;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.fragment.account.security.phone.PhoneFragment.ConfirmState.requestConfirmCode;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = cZA;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.fragment.account.security.phone.PhoneFragment.ConfirmState.waitingForConfirmationCode;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = cZA;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.iqoption.fragment.account.security.phone.PhoneFragment.ConfirmState.confirmed;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.account.security.phone.PhoneFragment$AnonymousClass1.<clinit>():void");
        }
    }

    private enum ConfirmState {
        waitingForNumber,
        requestConfirmCode,
        waitingForConfirmationCode,
        confirmationCodeReceived,
        confirmationCodeSubmitted,
        confirmationCodeExpired,
        confirmed
    }

    private static class b {
        private final WeakReference<PhoneFragment> bJf;

        /* synthetic */ b(PhoneFragment phoneFragment, AnonymousClass1 anonymousClass1) {
            this(phoneFragment);
        }

        private b(PhoneFragment phoneFragment) {
            this.bJf = new WeakReference(phoneFragment);
        }

        @e
        public void onPhoneConfirmed(o oVar) {
            if (((Boolean) oVar.getValue()).booleanValue()) {
                com.iqoption.core.c.a.biN.execute(new Runnable() {
                    public void run() {
                        PhoneFragment phoneFragment = (PhoneFragment) b.this.bJf.get();
                        if (phoneFragment != null) {
                            phoneFragment.t(phoneFragment.cZo, phoneFragment.cZp);
                        }
                    }
                });
            }
        }
    }

    private static class a extends com.iqoption.system.c.b<PhoneFragment, com.iqoption.core.microservices.kyc.response.a> {
        private final int cZo;
        private final long cZp;

        public a(PhoneFragment phoneFragment, int i, long j) {
            super(phoneFragment);
            this.cZo = i;
            this.cZp = j;
        }

        /* renamed from: a */
        public void v(PhoneFragment phoneFragment, com.iqoption.core.microservices.kyc.response.a aVar) {
            phoneFragment.t(this.cZo, this.cZp);
        }

        public void l(Throwable th) {
            if (th instanceof MobbErrorException) {
                String errorMessage = ((MobbErrorException) th).aPQ().getErrorMessage();
                if (TextUtils.isEmpty(errorMessage)) {
                    com.iqoption.app.a.b.aQ(IQApp.Eu());
                } else if (errorMessage.indexOf(44) == -1) {
                    com.iqoption.app.a.b.b(errorMessage, IQApp.Eu());
                } else {
                    com.iqoption.app.a.b.b(errorMessage.substring(0, errorMessage.indexOf(44)), IQApp.Eu());
                }
            }
        }
    }

    private static class c extends com.iqoption.system.c.b<PhoneFragment, com.iqoption.core.microservices.kyc.response.e> {
        private final int cZo;
        private final long cZp;

        public c(PhoneFragment phoneFragment, int i, long j) {
            super(phoneFragment);
            this.cZo = i;
            this.cZp = j;
        }

        /* renamed from: a */
        public void v(PhoneFragment phoneFragment, com.iqoption.core.microservices.kyc.response.e eVar) {
            if (!(eVar.isSuccessful() || TextUtils.isEmpty(eVar.getMessage()))) {
                com.iqoption.app.a.b.b(eVar.getMessage(), phoneFragment.getContext());
            }
            phoneFragment.u(this.cZo, this.cZp);
        }
    }

    public void o(int i, long j) {
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(".ARG_COUNTRY_CODE");
        ARG_COUNTRY_CODE = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(".ARG_NATIONAL_PHONE");
        cZy = stringBuilder.toString();
    }

    public static PhoneFragment r(int i, long j) {
        PhoneFragment phoneFragment = new PhoneFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_COUNTRY_CODE, i);
        bundle.putLong(cZy, j);
        phoneFragment.setArguments(bundle);
        return phoneFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cZd = (ii) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_account_security_page, viewGroup, false);
        if (getArguments() != null) {
            this.cZo = getArguments().getInt(ARG_COUNTRY_CODE);
            this.cZp = getArguments().getLong(cZy);
        }
        IQApp.Ex().bb(this.cZz);
        if (this.cZp == 0) {
            a(ConfirmState.waitingForNumber);
        } else if (com.iqoption.app.b.aK(getContext()).Eo()) {
            a(ConfirmState.confirmed);
        } else if (bg(azG())) {
            a(ConfirmState.requestConfirmCode);
        } else {
            a(ConfirmState.waitingForConfirmationCode);
        }
        return this.cZd.getRoot();
    }

    public void onDestroyView() {
        IQApp.Ex().bc(this.cZz);
        super.onDestroyView();
    }

    private void a(ConfirmState confirmState) {
        int i = AnonymousClass1.cZA[confirmState.ordinal()];
        if (i == 1) {
            c(this.cZo, this.cZp, this.cZd.cfa);
        } else if (i == 2) {
            d(this.cZo, this.cZp, this.cZd.cfa);
        } else if (i == 3) {
            a(this.cZo, this.cZp, 0, (int) azG(), this.cZd.cfa);
        } else if (i == 4) {
            a(this.cZo, this.cZp, this.cZd.cfa);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported state: ");
            stringBuilder.append(confirmState);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public t<com.iqoption.core.microservices.kyc.response.e> s(int i, long j) {
        Object obj = (i == this.cZo && j == this.cZp) ? 1 : null;
        if (obj != null) {
            long azG = azG();
            t<com.iqoption.core.microservices.kyc.response.e> aPs;
            if (bg(azG)) {
                aPs = com.iqoption.mobbtech.connect.request.api.a.aPs();
                p.a(aPs, new c(this, i, j), com.iqoption.core.c.a.biN);
                return aPs;
            }
            aPs = p.bo(new com.iqoption.core.microservices.kyc.response.e(true, ""));
            com.iqoption.core.util.b.a(a(i, j, 0, (int) azG, null), this.cZd.cfa, true);
            return aPs;
        }
        this.cZo = i;
        this.cZp = j;
        t a = v.a(com.iqoption.mobbtech.connect.request.api.a.u((long) i, j), -$$Lambda$PhoneFragment$f8xGwhwu0V5l9gg5QzIv0ekXg9o.INSTANCE);
        p.a(a, new c(this, i, j), com.iqoption.core.c.a.biN);
        return a;
    }

    public t<com.iqoption.core.microservices.kyc.response.a> a(int i, long j, String str) {
        t iH = com.iqoption.mobbtech.connect.request.api.a.iH(str);
        p.a(iH, new a(this, i, j), com.iqoption.core.c.a.biN);
        return iH;
    }

    private void t(int i, long j) {
        this.cZo = i;
        this.cZp = j;
        com.iqoption.core.data.d.b.WB().aG(0);
        com.iqoption.core.util.b.a(a(i, j, null), this.cZd.cfa, true);
    }

    public void n(int i, long j) {
        this.cZo = i;
        this.cZp = j;
        com.iqoption.core.data.d.b.WB().aG(0);
        com.iqoption.core.util.b.a(b(i, j, null), this.cZd.cfa, true);
    }

    public t<com.iqoption.core.microservices.kyc.response.e> q(int i, long j) {
        this.cZo = i;
        this.cZp = j;
        long azG = azG();
        if (bg(azG)) {
            t<com.iqoption.core.microservices.kyc.response.e> aPs = com.iqoption.mobbtech.connect.request.api.a.aPs();
            p.a(aPs, new c(this, i, j), com.iqoption.core.c.a.biN);
            return aPs;
        }
        t<com.iqoption.core.microservices.kyc.response.e> bo = p.bo(new com.iqoption.core.microservices.kyc.response.e(true, ""));
        com.iqoption.core.util.b.a(a(i, j, 0, (int) azG, null), this.cZd.cfa, true);
        return bo;
    }

    public void m(int i, long j) {
        this.cZo = i;
        this.cZp = j;
        com.iqoption.core.util.b.a(c(i, j, null), this.cZd.cfa, true);
    }

    public void u(int i, long j) {
        this.cZo = i;
        this.cZp = j;
        com.iqoption.core.data.d.b.WB().aG(System.currentTimeMillis());
        com.iqoption.core.util.b.a(a(i, j, 0, 300000, null), this.cZd.cfa, true);
    }

    public t<com.iqoption.core.microservices.kyc.response.e> l(int i, long j) {
        this.cZo = i;
        this.cZp = j;
        t aPs = com.iqoption.mobbtech.connect.request.api.a.aPs();
        p.a(aPs, new c(this, i, j), com.iqoption.core.c.a.biN);
        return aPs;
    }

    @NonNull
    private View a(int i, long j, ViewGroup viewGroup) {
        return d.a(getContext(), viewGroup, i, j).getView();
    }

    @NonNull
    private View b(int i, long j, ViewGroup viewGroup) {
        return a.a(getContext(), viewGroup, i, j, this).getView();
    }

    @NonNull
    private View c(int i, long j, ViewGroup viewGroup) {
        return e.a(getContext(), viewGroup, i, j, this).getView();
    }

    @NonNull
    private View d(int i, long j, ViewGroup viewGroup) {
        return c.a(getContext(), viewGroup, i, j, this).getView();
    }

    @NonNull
    private View a(int i, long j, int i2, int i3, ViewGroup viewGroup) {
        return b.a(getContext(), viewGroup, i, j, i2, i3, this).getView();
    }

    private long azG() {
        return com.iqoption.core.e.b.bf(com.iqoption.core.data.d.b.WB().Wz());
    }

    private boolean bg(long j) {
        return com.iqoption.core.e.b.bg(j);
    }
}
