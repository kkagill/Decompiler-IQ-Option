package com.iqoption.kyc.fragment.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.util.concurrent.p;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.microservices.kyc.response.document.e;
import com.iqoption.e.ke;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycIdDeclinedFragment */
public class g extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.b.g";
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && t.a(g.this.getFragmentManager(), g.TAG)) {
                y.j(g.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private a dyI;
    private ke dyJ;
    @Nullable
    private e dym;
    private boolean isInProgress;

    /* compiled from: KycIdDeclinedFragment */
    public interface a {
        com.google.common.util.concurrent.t<?> aKc();
    }

    /* compiled from: KycIdDeclinedFragment */
    private static class b extends com.iqoption.system.c.b<g, Object> {
        public b(g gVar) {
            super(gVar, Object.class);
        }

        /* renamed from: a */
        public void v(g gVar, Object obj) {
            super.v(gVar, obj);
            gVar.ev(false);
        }

        /* renamed from: a */
        public void c(g gVar, Throwable th) {
            super.c(gVar, th);
            gVar.ev(false);
        }
    }

    @NonNull
    public String aKn() {
        return "IdentityProving";
    }

    @NonNull
    public String aKo() {
        return "ProofOfIdentity";
    }

    public boolean aKp() {
        return true;
    }

    public static g e(e eVar) {
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_PROOF_DOCS", eVar);
        gVar.setArguments(bundle);
        return gVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dym = (e) bundle.getParcelable("KEY_PROOF_DOCS");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dyJ = (ke) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_id_declined, viewGroup, false);
        this.dyJ.cfW.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (!g.this.isInProgress) {
                    g.this.ev(true);
                    p.a(g.this.dyI.aKc(), new b(g.this), com.iqoption.core.c.a.biN);
                }
            }
        });
        String g = this.dym.g(VerificationType.POI);
        if (!TextUtils.isEmpty(g)) {
            this.dyJ.cfV.setText(g);
        }
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new com.iqoption.kyc.g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                g.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        return this.dyJ.getRoot();
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dyJ.cfS.toolbar);
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
            this.dyI = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dyI = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void ev(boolean z) {
        this.isInProgress = z;
        this.dyJ.cfW.d(z, false);
    }
}
