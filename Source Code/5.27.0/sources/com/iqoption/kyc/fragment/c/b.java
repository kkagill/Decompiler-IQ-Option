package com.iqoption.kyc.fragment.c;

import android.content.Context;
import android.os.Bundle;
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
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.e.kk;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.ag;
import com.iqoption.x.R;

/* compiled from: KycPhoneConfirmedFragment */
public class b extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.c.b";
    @Nullable
    private g dtm;
    private OnBackStackChangedListener dxW;
    private a dzf;
    private kk dzg;

    /* compiled from: KycPhoneConfirmedFragment */
    public interface a {
        void aJN();
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    @NonNull
    public String aKo() {
        return "PhoneConfirmed";
    }

    public boolean aKp() {
        return true;
    }

    public static b e(KycState kycState) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_STATE", kycState);
        bVar.setArguments(bundle);
        return bVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dtm = new g(getContext(), (KycState) bundle.getParcelable("ARG_KYC_STATE"));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dzg = (kk) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_phone_confirmed, viewGroup, false);
        this.dzg.cga.cfW.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                b.this.dzf.aJN();
            }
        });
        PhoneNumber aIP = this.dtm.aIP();
        if (aIP.yi() || aIP.yh()) {
            this.dzg.cgn.setText(ag.x(aIP.xK(), aIP.yj()));
        }
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                b.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        return this.dzg.getRoot();
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dzg.cfS.toolbar);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dzf = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dzf = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }
}
