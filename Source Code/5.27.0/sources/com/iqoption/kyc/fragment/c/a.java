package com.iqoption.kyc.fragment.c;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.util.concurrent.p;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.e.ki;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.view.text.j;
import com.iqoption.x.R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: KycPhoneConfirmFragment */
public class a extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.c.a";
    @Nullable
    private g dtm;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && a.this.isVisible() && t.a(a.this.getFragmentManager(), a.TAG)) {
                y.j(a.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private b dyX;
    private ki dyY;
    private int dyZ;
    private boolean dyn;
    private CountDownTimer dza;
    @Nullable
    private com.google.common.util.concurrent.t<com.iqoption.core.microservices.kyc.response.a> dzb;
    private TextWatcher dzc = new j() {
        public void afterTextChanged(Editable editable) {
            a.this.aLr();
        }
    };
    private com.iqoption.kyc.a.c dzd;

    /* compiled from: KycPhoneConfirmFragment */
    public interface b {
        com.google.common.util.concurrent.t<? extends com.iqoption.core.microservices.c> aJL();

        void aJM();

        com.google.common.util.concurrent.t<com.iqoption.core.microservices.kyc.response.a> iJ(String str);
    }

    /* compiled from: KycPhoneConfirmFragment */
    private static class a extends com.iqoption.system.c.b<a, com.iqoption.core.microservices.kyc.response.a> {
        public a(a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void v(a aVar, com.iqoption.core.microservices.kyc.response.a aVar2) {
            super.v(aVar, aVar2);
            if (aVar.isAdded()) {
                aVar.ev(false);
                aVar.getActivity().invalidateOptionsMenu();
            }
        }

        /* renamed from: a */
        public void c(a aVar, Throwable th) {
            super.c(aVar, th);
            if (aVar.isAdded()) {
                aVar.ev(false);
                aVar.dzb = null;
                aVar.getActivity().invalidateOptionsMenu();
            }
        }
    }

    /* compiled from: KycPhoneConfirmFragment */
    private static class c extends com.iqoption.system.c.b<a, com.iqoption.core.microservices.c> {
        c(a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void v(a aVar, com.iqoption.core.microservices.c cVar) {
            super.v(aVar, cVar);
            aVar.ev(false);
            aVar.aLp();
        }

        /* renamed from: a */
        public void c(a aVar, Throwable th) {
            super.c(aVar, th);
            aVar.ev(false);
        }
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    @NonNull
    public String aKo() {
        return "PhoneConfirmation";
    }

    public static a d(KycState kycState) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_STATE", kycState);
        aVar.setArguments(bundle);
        return aVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dtm = new g(getContext(), (KycState) bundle.getParcelable("ARG_KYC_STATE"));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(true);
        this.dyY = (ki) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_phone_confirm_old, viewGroup, false);
        this.dyY.cfW.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                a.this.dyn = true;
                a.this.ev(true);
                String trim = a.this.dyY.cgB.getText().toString().trim();
                a aVar = a.this;
                aVar.dzb = aVar.dyX.iJ(trim);
                p.a(a.this.dzb, new a(a.this), com.iqoption.core.c.a.biN);
            }
        });
        aLr();
        this.dyY.cgB.addTextChangedListener(this.dzc);
        this.dyY.cgj.setKeyListener(new com.iqoption.widget.NumPad.c() {
            public void onKeyPressed(int i) {
                a.this.dyY.cgB.dispatchKeyEvent(new KeyEvent(0, i));
                a.this.dyY.cgB.dispatchKeyEvent(new KeyEvent(1, i));
            }
        });
        Lb();
        this.dyY.cgM.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                com.google.common.util.concurrent.t aJL = a.this.dyX.aJL();
                a.this.ev(true);
                p.a(aJL, new c(a.this), com.iqoption.core.c.a.biN);
            }
        });
        aLp();
        this.dzd = new com.iqoption.kyc.a.c(this.dyY.cgB, aKn(), aKo(), "ConfirmCode", 9, this.dtm.Er());
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), this.dtm.Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                a.this.Lb();
                if (a.this.dyY != null) {
                    a.this.dyY.cgB.setHideKeyboard(true);
                }
                if (a.this.dtm != null && a.this.dtm.Eo()) {
                    a.this.getFragmentManager().popBackStack();
                }
            }

            /* Access modifiers changed, original: protected */
            public void aKs() {
                super.aKs();
                if (a.this.dyY != null) {
                    a.this.dyY.cgB.setHideKeyboard(false);
                }
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        return this.dyY.getRoot();
    }

    public boolean aKp() {
        return this.dyn;
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dyY.cfS.toolbar);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.kyc_confirm_phone_skip_menu, menu);
    }

    /* JADX WARNING: Missing block: B:20:0x0049, code skipped:
            if (r5.dtm.aIR() != false) goto L_0x004d;
     */
    public void onPrepareOptionsMenu(android.view.Menu r6) {
        /*
        r5 = this;
        super.onPrepareOptionsMenu(r6);
        r0 = 2131361821; // 0x7f0a001d float:1.8343405E38 double:1.0530326546E-314;
        r6 = r6.findItem(r0);
        if (r6 == 0) goto L_0x0050;
    L_0x000c:
        r0 = r5.dzb;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0022;
    L_0x0012:
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x0022;
    L_0x0018:
        r0 = r5.dzb;
        r0 = r0.isCancelled();
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        r0 = 1;
        goto L_0x0023;
    L_0x0022:
        r0 = 0;
    L_0x0023:
        r3 = r5.getFragmentManager();
        r4 = TAG;
        r3 = com.iqoption.util.t.a(r3, r4);
        if (r3 == 0) goto L_0x004c;
    L_0x002f:
        if (r0 != 0) goto L_0x004c;
    L_0x0031:
        r0 = r5.dtm;
        if (r0 == 0) goto L_0x004c;
    L_0x0035:
        r0 = r0.Eo();
        if (r0 != 0) goto L_0x004c;
    L_0x003b:
        r0 = r5.dtm;
        r0 = r0.aIS();
        if (r0 != 0) goto L_0x004d;
    L_0x0043:
        r0 = r5.dtm;
        r0 = r0.aIR();
        if (r0 == 0) goto L_0x004c;
    L_0x004b:
        goto L_0x004d;
    L_0x004c:
        r1 = 0;
    L_0x004d:
        r6.setVisible(r1);
    L_0x0050:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.fragment.c.a.onPrepareOptionsMenu(android.view.Menu):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_confirm_phone_skip) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.dyn = false;
        this.dyX.aJM();
        return true;
    }

    public void onStart() {
        super.onStart();
        Window window = getActivity().getWindow();
        this.dyZ = window.getAttributes().softInputMode;
        window.setSoftInputMode(3);
        y.a(this.dxN);
    }

    public void onStop() {
        super.onStop();
        y.b(this.dxN);
        getActivity().getWindow().setSoftInputMode(this.dyZ);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.dyX = (b) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dyX = null;
    }

    public void onDestroy() {
        super.onDestroy();
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
    }

    private void aLp() {
        g gVar = this.dtm;
        if (gVar != null) {
            if (gVar.aIR()) {
                this.dyY.cgN.setVisibility(8);
                this.dyY.cgM.setVisibility(0);
            } else {
                this.dza = bR(this.dtm.aIQ());
                this.dza.start();
            }
            getActivity().invalidateOptionsMenu();
        }
    }

    @NonNull
    private CountDownTimer bR(long j) {
        return new CountDownTimer(j, 1000) {
            public void onTick(long j) {
                if (a.this.isVisible()) {
                    if (a.this.dyY.cgM.getVisibility() == 0) {
                        com.iqoption.core.util.b.f(a.this.dyY.cgM, a.this.dyY.cgN).start();
                    }
                    TextView textView = a.this.dyY.cgN;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a.this.getString(R.string.kyc_resend_in));
                    stringBuilder.append(" ");
                    stringBuilder.append(bS(j));
                    textView.setText(stringBuilder.toString());
                    a.this.getActivity().invalidateOptionsMenu();
                }
            }

            public void onFinish() {
                a.this.aLq();
            }

            private String bS(long j) {
                return String.format(Locale.US, " %02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
            }
        };
    }

    private void aLq() {
        CountDownTimer countDownTimer = this.dza;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.dza = null;
        }
        com.iqoption.core.util.b.f(this.dyY.cgN, this.dyY.cgM).start();
    }

    private void aLr() {
        boolean z = this.dyY.cgB.getText().length() >= 6 && TextUtils.isDigitsOnly(this.dyY.cgB.getText());
        this.dyY.cfW.setEnabled(z);
    }

    private void ev(boolean z) {
        this.dyY.cfW.d(z, false);
        this.dyY.cgM.setEnabled(z ^ 1);
        this.dyY.cgB.setEnabled(z ^ 1);
        getActivity().invalidateOptionsMenu();
    }
}
