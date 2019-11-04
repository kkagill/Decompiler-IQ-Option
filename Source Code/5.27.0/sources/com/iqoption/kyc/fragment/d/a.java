package com.iqoption.kyc.fragment.d;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.base.Joiner;
import com.google.common.base.k;
import com.google.common.collect.s;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.e.je;
import com.iqoption.kyc.a.c;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.util.y;
import com.iqoption.view.text.SoftKeyboardEditText;
import com.iqoption.view.text.j;
import com.iqoption.x.R;

/* compiled from: KycAddressFragment */
public class a extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.d.a";
    @Nullable
    private com.iqoption.kyc.profile.a dtB;
    @Nullable
    private g dtm;
    private OnBackStackChangedListener dxW;
    private a dzm;
    private je dzn;
    private TextWatcher dzo = new j() {
        public void afterTextChanged(Editable editable) {
            a.this.aLr();
        }
    };
    private boolean dzp;
    private c dzq;
    private c dzr;

    /* compiled from: KycAddressFragment */
    public interface a {
        t<?> ay(String str, String str2);
    }

    /* compiled from: KycAddressFragment */
    private static class b extends com.iqoption.system.c.b<a, Object> {
        public b(a aVar) {
            super(aVar, Object.class);
        }

        /* renamed from: a */
        public void v(a aVar, Object obj) {
            super.v(aVar, obj);
            if (aVar.isAdded()) {
                aVar.ev(false);
            }
        }

        /* renamed from: a */
        public void c(a aVar, Throwable th) {
            super.c(aVar, th);
            if (aVar.isAdded()) {
                aVar.ev(false);
            }
        }
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    @NonNull
    public String aKo() {
        return "InputAddress_StreetAndHouseNumber";
    }

    public boolean aKp() {
        return true;
    }

    public static a a(KycState kycState, com.iqoption.kyc.profile.a aVar) {
        a aVar2 = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_STATE", kycState);
        bundle.putParcelable("ARG_KYC_PROFILE", aVar);
        aVar2.setArguments(bundle);
        return aVar2;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dtm = new g(getContext(), (KycState) bundle.getParcelable("ARG_KYC_STATE"));
            this.dtB = (com.iqoption.kyc.profile.a) bundle.getParcelable("ARG_KYC_PROFILE");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dzn = (je) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_address_old, viewGroup, false);
        this.dzn.cga.cfW.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String obj = a.this.dzn.cfX.getText().toString();
                String obj2 = a.this.dzn.cfY.getText().toString();
                a.this.ev(true);
                p.a(a.this.dzm.ay(obj, obj2), new b(a.this), com.iqoption.core.c.a.biN);
            }
        });
        aLt();
        aLr();
        Lb();
        this.dzq = new c(this.dzn.cfX, aKn(), aKo(), "AddressLine1", 6, this.dtm.Er());
        this.dzr = new c(this.dzn.cfY, aKn(), aKo(), "AddressLine2", 7, this.dtm.Er());
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), this.dtm.Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                a.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        SoftKeyboardEditText softKeyboardEditText = this.dzn.cfX;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(R.string.kyc_address_line));
        stringBuilder.append(" 1");
        softKeyboardEditText.setHint(stringBuilder.toString());
        softKeyboardEditText = this.dzn.cfY;
        stringBuilder = new StringBuilder();
        stringBuilder.append(getString(R.string.kyc_address_line));
        stringBuilder.append(" 2");
        softKeyboardEditText.setHint(stringBuilder.toString());
        this.dzn.cfX.addTextChangedListener(this.dzo);
        this.dzn.cfY.addTextChangedListener(this.dzo);
        return this.dzn.getRoot();
    }

    private void aLt() {
        g gVar = this.dtm;
        CharSequence f = gVar != null ? gVar.f(this.dtB) : null;
        if (!TextUtils.isEmpty(f)) {
            if (f.length() > 30) {
                Iterable k = k.f(',').qd().qc().k(f);
                int n = s.n(k);
                if (n > 1) {
                    n /= 2;
                    String str = ", ";
                    String join = Joiner.on(str).join(s.c(k, n));
                    str = Joiner.on(str).join(s.b(k, n));
                    this.dzn.cfX.setText(join);
                    this.dzn.cfY.setText(str);
                    return;
                }
                this.dzn.cfX.setText(f);
                return;
            }
            this.dzn.cfX.setText(f);
        }
    }

    private void Lb() {
        com.iqoption.kyc.s.a((AppCompatActivity) getActivity(), this.dzn.cfS.toolbar);
    }

    public void onStart() {
        super.onStart();
        com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
            public void run() {
                if (a.this.isVisible() && com.iqoption.util.t.a(a.this.getFragmentManager(), a.TAG)) {
                    View view = a.this.dzp ? a.this.dzn.cfY : a.this.dzn.cfX;
                    y.b(a.this.getContext(), view);
                    view.requestFocus();
                    com.iqoption.core.ext.a.d(view);
                }
            }
        }, 400);
    }

    public void onStop() {
        this.dzp = this.dzn.cfY.hasFocus();
        super.onStop();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dzm = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dzm = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void aLr() {
        boolean z = (TextUtils.isEmpty(this.dzn.cfX.getText().toString()) && TextUtils.isEmpty(this.dzn.cfY.getText().toString())) ? false : true;
        this.dzn.cga.cfW.setEnabled(z);
    }

    private void ev(boolean z) {
        if (z) {
            this.dzn.cga.cfW.d(true, false);
            this.dzn.cfX.setEnabled(false);
            this.dzn.cfY.setEnabled(false);
            return;
        }
        this.dzn.cga.cfW.d(false, false);
        this.dzn.cfX.setEnabled(true);
        this.dzn.cfY.setEnabled(true);
    }
}
