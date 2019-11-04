package com.iqoption.kyc.fragment.d;

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
import com.iqoption.e.le;
import com.iqoption.kyc.a.b;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycSexFragment */
public class f extends Fragment implements b {
    public static final String TAG = "com.iqoption.kyc.fragment.d.f";
    @Nullable
    private com.iqoption.kyc.profile.a dtB;
    private y dxL;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && f.this.isAdded() && t.a(f.this.getFragmentManager(), f.TAG)) {
                y.j(f.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private a dzM;
    private le dzN;

    /* compiled from: KycSexFragment */
    public interface a {
        void ex(boolean z);
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    @NonNull
    public String aKo() {
        return "ChooseSex";
    }

    public boolean aKp() {
        return true;
    }

    public static f j(com.iqoption.kyc.profile.a aVar) {
        f fVar = new f();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_PROFILE", aVar);
        fVar.setArguments(bundle);
        return fVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.dtB = (com.iqoption.kyc.profile.a) getArguments().getParcelable("ARG_KYC_PROFILE");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dzN = (le) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_sex_old, viewGroup, false);
        final boolean Er = new g(getContext()).Er();
        this.dzN.chd.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                com.iqoption.kyc.a.a.a(true, f.this.aKn(), f.this.aKn(), Er);
                f.this.dzM.ex(true);
            }
        });
        this.dzN.chc.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                com.iqoption.kyc.a.a.a(false, f.this.aKn(), f.this.aKn(), Er);
                f.this.dzM.ex(false);
            }
        });
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), Er, aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                f.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        this.dxL = new y(getActivity());
        return this.dzN.getRoot();
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dzN.cfS.toolbar);
    }

    public void onStart() {
        super.onStart();
        y.a(this.dxN);
    }

    public void onStop() {
        super.onStop();
        y.b(this.dxN);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dzM = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dzM = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }
}
