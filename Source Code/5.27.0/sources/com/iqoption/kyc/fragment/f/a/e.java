package com.iqoption.kyc.fragment.f.a;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
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
import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.c;
import com.iqoption.e.ks;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.view.text.j;
import com.iqoption.x.R;

/* compiled from: KycWarningFragment2 */
public class e extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.f.a.e";
    private a dAk;
    private ks dAl;
    private String dAm;
    private boolean dAn;
    private g dtm;
    private OnBackStackChangedListener dxW;
    private boolean dyn;

    /* compiled from: KycWarningFragment2 */
    public interface a {
        void aJQ();

        t<? extends c> iL(@Nullable String str);
    }

    /* compiled from: KycWarningFragment2 */
    private static class b extends com.iqoption.system.c.b<e, c> {
        b(e eVar) {
            super(eVar);
        }

        /* renamed from: a */
        public void v(e eVar, c cVar) {
            super.v(eVar, cVar);
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
        return "TradingExperience";
    }

    @NonNull
    public String aKo() {
        return "Warning";
    }

    public static e b(String str, Boolean bool) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_WARNING", str);
        bundle.putBoolean("ARG_IS_SHOW_USER_SIGNATURE_FIELD", bool.booleanValue());
        eVar.setArguments(bundle);
        return eVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dAm = bundle.getString("ARG_WARNING");
            this.dAn = bundle.getBoolean("ARG_IS_SHOW_USER_SIGNATURE_FIELD");
        }
        this.dtm = new g(getContext());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dAl = (ks) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_question_warning2, viewGroup, false);
        if (!TextUtils.isEmpty(this.dAm)) {
            this.dAl.bYc.setText(Html.fromHtml(this.dAm));
        }
        if (this.dAn) {
            this.dAl.cgQ.setVisibility(8);
            this.dAl.cgT.setVisibility(0);
            this.dAl.cgS.setVisibility(0);
            this.dAl.cgR.setVisibility(0);
        } else {
            this.dAl.cgQ.setVisibility(0);
            this.dAl.cgT.setVisibility(8);
            this.dAl.cgS.setVisibility(8);
            this.dAl.cgR.setVisibility(8);
        }
        this.dAl.cfW.setEnabled(this.dAn ^ 1);
        if (this.dAn) {
            this.dAl.cgR.addTextChangedListener(new j() {
                public void afterTextChanged(Editable editable) {
                    e.this.dAl.cfW.setEnabled(e.this.dtm.iF(editable.toString()));
                }
            });
        }
        this.dAl.cfW.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                CharSequence obj = e.this.dAn ? e.this.dAl.cgR.getText().toString() : null;
                if (!TextUtils.isEmpty(obj) || !e.this.dAn) {
                    e.this.dyn = true;
                    e.this.ev(true);
                    p.a(e.this.dAk.iL(obj), new b(e.this), com.iqoption.core.c.a.biN);
                }
            }
        });
        this.dAl.cgP.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                e.this.dyn = false;
                com.iqoption.kyc.a.a.k(e.this.aKn(), e.this.aKo(), e.this.dtm.Er());
                e.this.dAk.aJQ();
            }
        });
        this.dAl.bYc.setMovementMethod(new ScrollingMovementMethod());
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), this.dtm.Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                e.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        return this.dAl.getRoot();
    }

    public boolean aKp() {
        return this.dyn;
    }

    private void Lb() {
        s.b((AppCompatActivity) getActivity(), this.dAl.cfS.toolbar);
        getActivity().invalidateOptionsMenu();
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dAk = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dAk = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void ev(boolean z) {
        this.dAl.cfW.d(z, false);
        this.dAl.cgP.setEnabled(z ^ 1);
    }
}
