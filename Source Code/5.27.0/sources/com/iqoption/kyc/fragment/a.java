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
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.common.util.concurrent.p;
import com.iqoption.e.jk;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycCysecFragment */
public class a extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.a";
    private boolean dtI;
    private a dxJ;
    private jk dxK;
    @Nullable
    private y dxL;
    private boolean dxM;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && a.this.isAdded() && t.a(a.this.getFragmentManager(), a.TAG)) {
                y.j(a.this.getActivity());
            }
        }
    };
    private d dxO;
    private boolean isInProgress;

    /* compiled from: KycCysecFragment */
    public interface a {
        com.google.common.util.concurrent.t<?> aKe();

        void aKf();
    }

    /* compiled from: KycCysecFragment */
    private static class b extends com.iqoption.system.c.b<a, Object> {
        b(a aVar) {
            super(aVar);
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

    public static a eH(boolean z) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_HIDE_SKIP", z);
        aVar.setArguments(bundle);
        return aVar;
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
        this.dxK = (jk) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_cysec, viewGroup, false);
        this.dxK.cfW.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                a.this.ev(true);
                p.a(a.this.dxJ.aKe(), new b(a.this), com.iqoption.core.c.a.biN);
            }
        });
        Lb();
        this.dxO = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                a.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxO);
        this.dxL = new y(getActivity());
        return this.dxK.getRoot();
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (!this.dtI) {
            menuInflater.inflate(R.menu.kyc_continue_later_cysec_menu, menu);
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.action_continue_later_cysec);
        if (findItem != null) {
            boolean z = false;
            if (this.dxM) {
                findItem.setVisible(false);
                return;
            }
            if (!this.isInProgress && t.a(getFragmentManager(), TAG)) {
                z = true;
            }
            findItem.setVisible(z);
            this.dxM = z ^ 1;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!t.a(getFragmentManager(), TAG) || menuItem.getItemId() != R.id.action_continue_later_cysec || this.isInProgress) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.dxJ.aKf();
        return true;
    }

    private void Lb() {
        s.b((AppCompatActivity) getActivity(), this.dxK.cfS.toolbar);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
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
            this.dxJ = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dxJ = null;
    }

    public void onDestroyView() {
        d dVar = this.dxO;
        if (dVar != null) {
            dVar.aKq();
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.removeOnBackStackChangedListener(this.dxO);
        }
        super.onDestroyView();
    }

    private void ev(boolean z) {
        this.isInProgress = z;
        this.dxK.cfW.d(z, false);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }
}
