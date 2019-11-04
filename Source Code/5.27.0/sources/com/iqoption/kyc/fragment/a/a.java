package com.iqoption.kyc.fragment.a;

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
import com.google.common.util.concurrent.t;
import com.iqoption.e.ka;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.s;
import com.iqoption.util.v;
import com.iqoption.x.R;

/* compiled from: KycFinishFragment */
public class a extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.a.a";
    private boolean aZy;
    private a dxT;
    private ka dxU;
    private int dxV;
    private OnBackStackChangedListener dxW;

    /* compiled from: KycFinishFragment */
    public interface a {
        t<?> aJS();
    }

    /* compiled from: KycFinishFragment */
    private static class b extends com.iqoption.system.c.b<a, Object> {
        public b(a aVar) {
            super(aVar, Object.class);
        }

        /* renamed from: a */
        public void v(a aVar, Object obj) {
            super.v(aVar, obj);
            aVar.ev(false);
        }

        /* renamed from: a */
        public void c(a aVar, Throwable th) {
            super.c(aVar, th);
            aVar.ev(false);
        }
    }

    @NonNull
    public String aKo() {
        return "AccountVerified";
    }

    public boolean aKp() {
        return false;
    }

    public static a m(int i, boolean z) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_SCREEN_TYPE", i);
        bundle.putBoolean("ARG_IS_REGULATED", z);
        aVar.setArguments(bundle);
        return aVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.aZy = bundle.getBoolean("ARG_IS_REGULATED");
            this.dxV = bundle.getInt("ARG_SCREEN_TYPE");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dxU = (ka) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_finish_old, viewGroup, false);
        this.dxU.cfW.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                v.b(a.this.dxT.aJS(), new b(a.this));
            }
        });
        int i = this.dxV;
        if (i == 1) {
            this.dxU.cgF.setImageResource(R.drawable.ic_kyc_user);
            this.dxU.cgG.setText(R.string.kyc_profile_almost_verified);
            this.dxU.cgE.setText(R.string.kyc_documents_review_description);
        } else if (i != 2) {
            this.dxU.cgF.setImageResource(R.drawable.ic_kyc_finish);
            this.dxU.cgG.setText(R.string.kyc_thanks);
            this.dxU.cgE.setText(R.string.kyc_information_has_been_saved);
        } else {
            this.dxU.cgF.setImageResource(R.drawable.ic_kyc_finish);
            this.dxU.cgG.setText(R.string.kyc_thanks);
            this.dxU.cgE.setText(getString(R.string.kyc_information_has_been_saved_attach_documents_days, "7"));
        }
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), this.aZy, aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                a.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        return this.dxU.getRoot();
    }

    @NonNull
    public String aKn() {
        return this.aZy ? "IdentityProving" : "PersonalData";
    }

    private void Lb() {
        s.b((AppCompatActivity) getActivity());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dxT = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dxT = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void ev(boolean z) {
        this.dxU.cfW.d(z, false);
    }
}
