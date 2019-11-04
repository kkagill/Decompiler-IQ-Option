package com.iqoption.kyc.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.google.common.util.concurrent.p;
import com.iqoption.e.lg;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycStartNonRegulatedFragment */
public class b extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.b";
    private boolean dtI;
    @Nullable
    private y dxL;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && b.this.isAdded() && t.a(b.this.getFragmentManager(), b.TAG)) {
                y.j(b.this.getActivity());
            }
        }
    };
    private d dxO;
    private a dxQ;
    private lg dxR;
    private boolean isInProgress;

    /* compiled from: KycStartNonRegulatedFragment */
    public interface a {
        com.google.common.util.concurrent.t<?> aKg();

        void aKh();
    }

    /* compiled from: KycStartNonRegulatedFragment */
    private static class b extends com.iqoption.system.c.b<b, Object> {
        b(b bVar) {
            super(bVar);
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

    @NonNull
    public String aKn() {
        return "Welcome";
    }

    @NonNull
    public String aKo() {
        return "VerifyAccountAfterSignUp";
    }

    public boolean aKp() {
        return true;
    }

    public static b eI(boolean z) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_HIDE_SKIP", z);
        bVar.setArguments(bundle);
        return bVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dtI = bundle.getBoolean("ARG_IS_HIDE_SKIP");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(this.dtI ^ 1);
        this.dxR = (lg) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_start_non_regulated, viewGroup, false);
        this.dxR.cfW.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                b.this.ev(true);
                p.a(b.this.dxQ.aKg(), new b(b.this), com.iqoption.core.c.a.biN);
            }
        });
        Lb();
        this.dxO = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                b.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxO);
        this.dxL = new y(getActivity());
        return this.dxR.getRoot();
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (!this.dtI) {
            menuInflater.inflate(R.menu.kyc_continue_later_start_non_regulated_menu, menu);
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.action_continue_later_start_non_regulated);
        if (findItem != null) {
            boolean z = !this.isInProgress && t.a(getFragmentManager(), TAG);
            findItem.setVisible(z);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!t.a(getFragmentManager(), TAG) || menuItem.getItemId() != R.id.action_continue_later_start_non_regulated || this.isInProgress) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.dxQ.aKh();
        return true;
    }

    private void Lb() {
        s.b((AppCompatActivity) getActivity(), this.dxR.cfS.toolbar);
        getActivity().invalidateOptionsMenu();
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
            this.dxQ = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dxQ = null;
    }

    public void onDestroyView() {
        d dVar = this.dxO;
        if (dVar != null) {
            dVar.aKq();
        }
        getFragmentManager().removeOnBackStackChangedListener(this.dxO);
        super.onDestroyView();
    }

    private void ev(boolean z) {
        this.isInProgress = z;
        this.dxR.cfW.d(z, false);
        if (z) {
            getActivity().invalidateOptionsMenu();
        }
    }
}
