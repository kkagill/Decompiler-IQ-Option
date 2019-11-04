package com.iqoption.kyc.fragment.c;

import android.content.Context;
import android.os.Bundle;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.ObjectsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.util.concurrent.p;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.dto.entity.iqbus.Country;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.e.kg;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.i;
import com.iqoption.kyc.s;
import com.iqoption.util.ag;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.view.text.j;
import com.iqoption.x.R;
import java.util.Locale;

/* compiled from: KycPhoneFragment */
public class c extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.c.c";
    private final PhoneNumberUtil aeY = PhoneNumberUtil.xt();
    private TextWatcher cZE = new j() {
        public void afterTextChanged(Editable editable) {
            c.this.aLr();
        }
    };
    @Nullable
    private g dtm;
    private i dtn;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && c.this.isVisible() && t.a(c.this.getFragmentManager(), c.TAG)) {
                y.j(c.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private int dyZ;
    private com.iqoption.kyc.a.c dzd;
    private b dzi;
    private kg dzj;
    @Nullable
    private String dzk;

    /* compiled from: KycPhoneFragment */
    public interface b {
        void aJM();

        com.google.common.util.concurrent.t<? extends com.iqoption.core.microservices.c> w(int i, long j);
    }

    /* compiled from: KycPhoneFragment */
    private static class a extends com.iqoption.system.c.b<c, com.iqoption.core.microservices.c> {
        public a(c cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void v(c cVar, com.iqoption.core.microservices.c cVar2) {
            super.v(cVar, cVar2);
            cVar.ev(false);
        }

        /* renamed from: a */
        public void c(c cVar, Throwable th) {
            super.c(cVar, th);
            cVar.ev(false);
        }
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    @NonNull
    public String aKo() {
        return "InputPhone";
    }

    public boolean aKp() {
        return true;
    }

    public static c f(KycState kycState) {
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_STATE", kycState);
        cVar.setArguments(bundle);
        return cVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dtm = new g(getContext(), (KycState) bundle.getParcelable("ARG_KYC_STATE"));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dzj = (kg) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_phone, viewGroup, false);
        this.dzj.cfW.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                PhoneNumber b = c.this.aLs();
                c.this.ev(true);
                p.a(c.this.dzi.w(b.xK(), b.yj()), new a(c.this), com.iqoption.core.c.a.biN);
            }
        });
        azH();
        PhoneNumber aIO = this.dtm.aIO();
        if (aIO.yi() || aIO.yh()) {
            String x = ag.x(aIO.xK(), aIO.yj());
            this.dzj.bSU.setText(x);
            this.dzk = x;
        }
        aLr();
        this.dzj.bSU.addTextChangedListener(this.cZE);
        this.dzj.cgj.setKeyListener(new com.iqoption.widget.NumPad.c() {
            public void onKeyPressed(int i) {
                c.this.dzj.bSU.dispatchKeyEvent(new KeyEvent(0, i));
                c.this.dzj.bSU.dispatchKeyEvent(new KeyEvent(1, i));
            }
        });
        Lb();
        this.dzd = new com.iqoption.kyc.a.c(this.dzj.bSU, aKn(), aKo(), "Phone", 8, this.dtm.Er());
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), this.dtm.Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                c.this.Lb();
                if (c.this.dzj != null) {
                    c.this.dzj.bSU.setHideKeyboard(true);
                }
                if (c.this.dtm != null && c.this.dtm.Eo()) {
                    c.this.getFragmentManager().popBackStack();
                }
            }

            /* Access modifiers changed, original: protected */
            public void aKs() {
                super.aKs();
                if (c.this.dzj != null) {
                    c.this.dzj.bSU.setHideKeyboard(false);
                }
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        return this.dzj.getRoot();
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dzj.cfS.toolbar);
    }

    private void azH() {
        p.a(this.dtn.aIY(), new com.iqoption.system.c.b<c, Country>(this) {
            /* renamed from: a */
            public void v(c cVar, Country country) {
                super.v(cVar, country);
                if (cVar.isAdded() && c.this.dtm != null) {
                    c.this.dzj.bSU.setHint(c.this.dtm.a(country));
                }
            }

            /* renamed from: a */
            public void c(c cVar, Throwable th) {
                super.c(cVar, th);
                if (cVar.isAdded() && c.this.dtm != null) {
                    c.this.dzj.bSU.setHint(c.this.dtm.a(null));
                }
            }
        }, com.iqoption.core.c.a.biN);
    }

    private PhoneNumber aLs() {
        try {
            return this.aeY.b(this.dzj.bSU.getText().toString(), Locale.getDefault().getCountry());
        } catch (NumberParseException unused) {
            return new PhoneNumber();
        }
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.dzi = (b) context;
            this.dtn = new i(context);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.kyc_skip_phone_menu, menu);
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.action_skip_phone);
        if (findItem != null) {
            boolean z;
            if (t.a(getFragmentManager(), TAG)) {
                g gVar = this.dtm;
                if (!(gVar == null || gVar.Eo() || (!this.dtm.aIS() && !this.dtm.aIR()))) {
                    z = true;
                    findItem.setVisible(z);
                }
            }
            z = false;
            findItem.setVisible(z);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_skip_phone) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.dzi.aJM();
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

    public void onDetach() {
        super.onDetach();
        this.dzi = null;
    }

    private void ev(boolean z) {
        this.dzj.cfW.d(z, false);
        this.dzj.cgj.setEnabled(z ^ 1);
        this.dzj.bSU.setEnabled(z ^ 1);
    }

    private void aLr() {
        try {
            PhoneNumber aLs = aLs();
            ConfirmButtonView confirmButtonView = this.dzj.cfW;
            boolean z = (aLs.yh() && aLs.yi() && this.aeY.b(aLs)) || (!TextUtils.isEmpty(this.dzk) && ObjectsCompat.equals(this.dzk, this.dzj.bSU.getText().toString()));
            confirmButtonView.setEnabled(z);
        } catch (Exception unused) {
            this.dzj.cfW.setEnabled(false);
        }
    }
}
