package com.iqoption.kyc.fragment.b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.iqoption.e.jq;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.v;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycDocumentsIntroFragment */
public class e extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.b.e";
    private y dxL;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && e.this.isAdded() && t.a(e.this.getFragmentManager(), e.TAG)) {
                y.j(e.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private a dyx;
    private jq dyy;
    private boolean isInProgress;

    /* compiled from: KycDocumentsIntroFragment */
    public interface a {
        com.google.common.util.concurrent.t<?> aJT();

        com.google.common.util.concurrent.t<?> aJU();
    }

    /* compiled from: KycDocumentsIntroFragment */
    private static class b extends com.iqoption.system.c.b<e, Object> {
        public b(e eVar) {
            super(eVar, Object.class);
        }

        /* renamed from: a */
        public void v(e eVar, Object obj) {
            super.v(eVar, obj);
            eVar.ev(false);
        }

        /* renamed from: a */
        public void c(e eVar, Throwable th) {
            super.c(eVar, th);
            eVar.ev(false);
        }
    }

    @NonNull
    public String aKn() {
        return "IdentityProving";
    }

    @NonNull
    public String aKo() {
        return "IdentityProvingWelcome";
    }

    public boolean aKp() {
        return true;
    }

    public static e aLl() {
        return new e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu((((Integer) com.iqoption.app.b.aK(getContext()).ase.getValue()).intValue() == 0 ? 1 : 0) ^ 1);
        this.dyy = (jq) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_documents_intro, viewGroup, false);
        this.dyy.cfW.setOnClickListener(new -$$Lambda$e$ELXZ0qcOS22u_j_Ih8rEZzmqMm4(this));
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                e.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        this.dxL = new y(getActivity());
        return this.dyy.getRoot();
    }

    private /* synthetic */ void bJ(View view) {
        ev(true);
        v.b(this.dyx.aJT(), new b(this));
    }

    private void ev(boolean z) {
        this.isInProgress = z;
        this.dyy.cfW.d(z, false);
        getActivity().invalidateOptionsMenu();
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.kyc_continue_later_documents_intro_menu, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!t.a(getFragmentManager(), TAG) || menuItem.getItemId() != R.id.action_continue_later_documents_intro) {
            return super.onOptionsItemSelected(menuItem);
        }
        ev(true);
        v.b(this.dyx.aJU(), new b(this));
        return true;
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.action_continue_later_documents_intro);
        if (findItem != null) {
            findItem.setEnabled(this.isInProgress ^ 1);
            findItem.setVisible(t.a(getFragmentManager(), TAG));
        }
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dyy.cfS.toolbar);
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
            this.dyx = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dyx = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }
}
