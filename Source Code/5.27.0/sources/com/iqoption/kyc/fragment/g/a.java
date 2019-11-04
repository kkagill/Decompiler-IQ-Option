package com.iqoption.kyc.fragment.g;

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
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.iqoption.core.d;
import com.iqoption.core.util.b.e;
import com.iqoption.core.util.b.h;
import com.iqoption.e.ky;
import com.iqoption.kyc.a.b;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.x.R;

/* compiled from: KycReportableErrorFragment */
public class a extends Fragment implements b {
    public static final String TAG = "com.iqoption.kyc.fragment.g.a";
    private a dAp;
    private ky dAq;
    private boolean dAr;
    private OnBackStackChangedListener dxW;

    /* compiled from: KycReportableErrorFragment */
    public interface a {
        void aJO();

        void aJP();
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    @NonNull
    public String aKo() {
        return "USRestricted";
    }

    public boolean aKp() {
        return false;
    }

    public static a eM(boolean z) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_BLOCK", z);
        aVar.setArguments(bundle);
        return aVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.dAr = getArguments().getBoolean("ARG_IS_BLOCK");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dAq = (ky) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_reportable_error_old, viewGroup, false);
        setHasOptionsMenu(this.dAr);
        if (d.Un().Dq()) {
            this.dAq.cgX.setVisibility(8);
        } else {
            this.dAq.cgX.setVisibility(0);
            this.dAq.cgX.setOnClickListener(new -$$Lambda$a$38vdos-18T974bneKZHtuHOgNPA(this));
        }
        Lb();
        this.dxW = new com.iqoption.kyc.a.d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                a.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        String string = getString(R.string.support_email);
        com.iqoption.core.util.b.d.a(new e(new com.iqoption.core.util.b.a[]{new com.iqoption.core.util.b.a(string, string)}, this.dAq.cgY, getString(R.string.kyc_us_person_alert_text_n1, string), R.color.white, R.color.white, true, new h(d.Uo())));
        return this.dAq.getRoot();
    }

    private /* synthetic */ void bJ(View view) {
        this.dAp.aJO();
    }

    private void Lb() {
        if (this.dAr) {
            s.b((AppCompatActivity) getActivity(), this.dAq.cfS.toolbar);
        } else {
            s.a((AppCompatActivity) getActivity(), this.dAq.cfS.toolbar);
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (this.dAr) {
            menuInflater.inflate(R.menu.kyc_made_mistake_menu, menu);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_made_mistake) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.dAp.aJP();
        return true;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dAp = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dAp = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }
}
