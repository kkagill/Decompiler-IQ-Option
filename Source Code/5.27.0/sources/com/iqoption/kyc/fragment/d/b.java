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
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.e.je;
import com.iqoption.kyc.a.c;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.view.text.j;
import com.iqoption.x.R;

/* compiled from: KycCityFragment */
public class b extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.d.b";
    @Nullable
    private com.iqoption.kyc.profile.a dtB;
    @Nullable
    private g dtm;
    private OnBackStackChangedListener dxW;
    private je dzn;
    private TextWatcher dzo = new j() {
        public void afterTextChanged(Editable editable) {
            b.this.aLr();
        }
    };
    private boolean dzp;
    private a dzt;
    private c dzu;
    private c dzv;

    /* compiled from: KycCityFragment */
    public interface a {
        void ax(String str, String str2);
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    @NonNull
    public String aKo() {
        return "InputAddress_CityPostalCode";
    }

    public boolean aKp() {
        return true;
    }

    public static b b(KycState kycState, com.iqoption.kyc.profile.a aVar) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_STATE", kycState);
        bundle.putParcelable("ARG_KYC_PROFILE", aVar);
        bVar.setArguments(bundle);
        return bVar;
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
                b.this.dzt.ax(b.this.dzn.cfX.getText().toString(), b.this.dzn.cfY.getText().toString());
            }
        });
        this.dzn.cfX.setHint(R.string.city);
        this.dzn.cfY.setHint(R.string.kyc_info_postalcode);
        aLt();
        aLr();
        Lb();
        this.dzu = new c(this.dzn.cfX, aKn(), aKo(), "City", 4, this.dtm.Er());
        this.dzv = new c(this.dzn.cfY, aKn(), aKo(), "PostalCode", 5, this.dtm.Er());
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), this.dtm.Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                b.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        this.dzn.cfX.addTextChangedListener(this.dzo);
        this.dzn.cfY.addTextChangedListener(this.dzo);
        return this.dzn.getRoot();
    }

    private void aLt() {
        g gVar = this.dtm;
        CharSequence charSequence = null;
        CharSequence g = gVar != null ? gVar.g(this.dtB) : null;
        g gVar2 = this.dtm;
        if (gVar2 != null) {
            charSequence = gVar2.h(this.dtB);
        }
        this.dzn.cfX.setText(g);
        this.dzn.cfY.setText(charSequence);
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dzn.cfS.toolbar);
    }

    public void onStart() {
        super.onStart();
        com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
            public void run() {
                if (b.this.isVisible() && t.a(b.this.getFragmentManager(), b.TAG)) {
                    View view = b.this.dzp ? b.this.dzn.cfY : b.this.dzn.cfX;
                    y.b(b.this.getContext(), view);
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
            this.dzt = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dzt = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void aLr() {
        boolean z = (TextUtils.isEmpty(this.dzn.cfX.getText().toString()) || TextUtils.isEmpty(this.dzn.cfY.getText().toString())) ? false : true;
        this.dzn.cga.cfW.setEnabled(z);
    }
}
