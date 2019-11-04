package com.iqoption.kyc.fragment.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.util.concurrent.p;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.microservices.kyc.response.document.e;
import com.iqoption.e.jc;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycAddressDeclinedFragment */
public class b extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.b.b";
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && t.a(b.this.getFragmentManager(), b.TAG)) {
                y.j(b.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private a dyk;
    private jc dyl;
    @Nullable
    private e dym;
    private boolean dyn;

    /* compiled from: KycAddressDeclinedFragment */
    public interface a {
        com.google.common.util.concurrent.t<?> aKd();
    }

    /* compiled from: KycAddressDeclinedFragment */
    private static class b extends com.iqoption.system.c.b<b, Object> {
        public b(b bVar) {
            super(bVar, Object.class);
        }

        /* renamed from: a */
        public void v(b bVar, Object obj) {
            super.v(bVar, obj);
            bVar.ev(false);
        }

        /* renamed from: a */
        public void c(b bVar, Throwable th) {
            super.c(bVar, th);
            bVar.ev(false);
        }
    }

    public String aKn() {
        return "IdentityProving";
    }

    public String aKo() {
        return "AddressDocument";
    }

    public static b c(e eVar) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_PROOF_DOCS", eVar);
        bVar.setArguments(bundle);
        return bVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dym = (e) bundle.getParcelable("KEY_PROOF_DOCS");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dyl = (jc) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_address_declined, viewGroup, false);
        this.dyl.cfW.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                b.this.dyn = true;
                p.a(b.this.dyk.aKd(), new b(b.this), com.iqoption.core.c.a.biN);
            }
        });
        String g = this.dym.g(VerificationType.POA);
        if (!TextUtils.isEmpty(g)) {
            this.dyl.cfV.setText(g);
        }
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                b.this.Lb();
                b.this.dyn = false;
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        return this.dyl.getRoot();
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dyl.cfS.toolbar);
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
            this.dyk = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dyk = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void ev(boolean z) {
        this.dyl.cfW.d(z, false);
    }

    public boolean aKp() {
        return this.dyn;
    }
}
