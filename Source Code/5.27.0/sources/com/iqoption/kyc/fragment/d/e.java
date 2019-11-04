package com.iqoption.kyc.fragment.d;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.e.lz;
import com.iqoption.kyc.a.b;
import com.iqoption.kyc.a.c;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.view.text.j;
import com.iqoption.x.R;

/* compiled from: KycLegalNameFragment */
public class e extends Fragment implements b {
    public static final String TAG = "com.iqoption.kyc.fragment.d.e";
    @Nullable
    private com.iqoption.kyc.profile.a dtB;
    @Nullable
    private g dtm;
    private OnBackStackChangedListener dxW;
    private a dzI;
    private lz dzJ;
    private boolean dzK;
    private TextWatcher dzo = new j() {
        public void afterTextChanged(Editable editable) {
            e.this.aLr();
        }
    };

    /* compiled from: KycLegalNameFragment */
    public interface a {
        void aw(String str, String str2);
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    @NonNull
    public String aKo() {
        return "InputName";
    }

    public boolean aKp() {
        return true;
    }

    public static e d(KycState kycState, com.iqoption.kyc.profile.a aVar) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_STATE", kycState);
        bundle.putParcelable("ARG_KYC_PROFILE", aVar);
        eVar.setArguments(bundle);
        return eVar;
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
        this.dzJ = (lz) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_old_kyc_legal_name, viewGroup, false);
        this.dzJ.cga.cfW.setOnClickListener(new -$$Lambda$e$J9_xze6M8DjUQ-8eOgW837Lys5k(this));
        String a = this.dtm.a(this.dtB);
        String b = this.dtm.b(this.dtB);
        this.dzJ.chr.setText(a);
        this.dzJ.chs.setText(b);
        aLr();
        this.dzJ.chr.addTextChangedListener(this.dzo);
        this.dzJ.chs.addTextChangedListener(this.dzo);
        Lb();
        c cVar = new c(this.dzJ.chr, aKn(), aKo(), "Name", 1, this.dtm.Er());
        c cVar2 = new c(this.dzJ.chs, aKn(), aKo(), "Surname", 2, this.dtm.Er());
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), this.dtm.Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                e.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        return this.dzJ.getRoot();
    }

    private /* synthetic */ void bJ(View view) {
        this.dzI.aw(this.dzJ.chr.getText().toString(), this.dzJ.chs.getText().toString());
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dzJ.cfS.toolbar);
    }

    public void onStart() {
        super.onStart();
        com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
            public void run() {
                if (e.this.isVisible() && t.a(e.this.getFragmentManager(), e.TAG)) {
                    View view = e.this.dzK ? e.this.dzJ.chs : e.this.dzJ.chr;
                    y.b(e.this.getContext(), view);
                    view.requestFocus();
                    com.iqoption.core.ext.a.d(view);
                }
            }
        }, 400);
    }

    public void onStop() {
        this.dzK = this.dzJ.chs.hasFocus();
        super.onStop();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dzI = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dzI = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void aLr() {
        g gVar = this.dtm;
        boolean z = gVar != null && gVar.iF(this.dzJ.chr.getText().toString()) && this.dtm.iF(this.dzJ.chs.getText().toString());
        this.dzJ.cga.cfW.setEnabled(z);
    }
}
