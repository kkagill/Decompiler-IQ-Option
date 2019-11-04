package com.iqoption.kyc.fragment.g;

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
import com.google.common.util.concurrent.p;
import com.iqoption.e.la;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycReportableFragment */
public class b extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.g.b";
    private a dAt;
    private la dAu;
    @Nullable
    private com.iqoption.kyc.profile.a dtB;
    private y dxL;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && b.this.isAdded() && t.a(b.this.getFragmentManager(), b.TAG)) {
                y.j(b.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;

    /* compiled from: KycReportableFragment */
    public interface a {
        com.google.common.util.concurrent.t<?> ey(boolean z);
    }

    /* compiled from: KycReportableFragment */
    private static class b extends com.iqoption.system.c.b<b, Object> {
        private boolean dAw;

        public b(b bVar, boolean z) {
            super(bVar, Object.class);
            this.dAw = z;
        }

        /* renamed from: a */
        public void v(b bVar, Object obj) {
            super.v(bVar, obj);
            if (bVar.isAdded()) {
                bVar.d(false, this.dAw);
            }
        }

        /* renamed from: a */
        public void c(b bVar, Throwable th) {
            super.c(bVar, th);
            if (bVar.isAdded()) {
                bVar.d(false, this.dAw);
            }
        }
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    @NonNull
    public String aKo() {
        return "USPerson";
    }

    public boolean aKp() {
        return true;
    }

    public static b k(com.iqoption.kyc.profile.a aVar) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_PROFILE", aVar);
        bVar.setArguments(bundle);
        return bVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.dtB = (com.iqoption.kyc.profile.a) getArguments().getParcelable("ARG_KYC_PROFILE");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dAu = (la) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_reportable_old, viewGroup, false);
        final boolean Er = new g(getContext()).Er();
        this.dAu.cgZ.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                com.iqoption.kyc.a.a.b(false, b.this.aKn(), b.this.aKo(), Er);
                p.a(b.this.dAt.ey(false), new b(b.this, false), com.iqoption.core.c.a.biN);
            }
        });
        this.dAu.chb.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                com.iqoption.kyc.a.a.b(true, b.this.aKn(), b.this.aKo(), Er);
                p.a(b.this.dAt.ey(true), new b(b.this, true), com.iqoption.core.c.a.biN);
            }
        });
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), Er, aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                b.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        this.dxL = new y(getActivity());
        return this.dAu.getRoot();
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dAu.cfS.toolbar);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dAt = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onStart() {
        super.onStart();
        y.a(this.dxN);
    }

    public void onStop() {
        super.onStop();
        y.b(this.dxN);
    }

    public void onDetach() {
        super.onDetach();
        this.dAt = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void d(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.dAu.chb.d(true, false);
                this.dAu.cgZ.setEnabled(false);
                return;
            }
            this.dAu.cgZ.d(true, false);
            this.dAu.chb.setEnabled(false);
        } else if (z2) {
            this.dAu.chb.d(false, false);
            this.dAu.cgZ.setEnabled(true);
        } else {
            this.dAu.cgZ.d(false, false);
            this.dAu.chb.setEnabled(true);
        }
    }
}
