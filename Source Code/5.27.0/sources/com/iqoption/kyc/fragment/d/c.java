package com.iqoption.kyc.fragment.d;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.NumberPicker;
import android.widget.NumberPicker.Formatter;
import android.widget.NumberPicker.OnValueChangeListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.base.f;
import com.google.common.base.j;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.p;
import com.iqoption.dto.entity.iqbus.Country;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.e.ji;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.i;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycCountryFragment */
public class c extends Fragment implements com.iqoption.kyc.a.b {
    private static final String LOG_TAG = "com.iqoption.kyc.fragment.d.c";
    @Nullable
    private com.iqoption.kyc.profile.a dtB;
    @Nullable
    private g dtm;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && t.a(c.this.getFragmentManager(), c.LOG_TAG)) {
                y.j(c.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    @Nullable
    private Country dzA;
    private b dzx;
    private ji dzy;
    private boolean dzz;

    /* compiled from: KycCountryFragment */
    public interface b {
        void a(Country country, boolean z);

        void b(Country country);
    }

    /* compiled from: KycCountryFragment */
    private static class a extends com.iqoption.system.c.b<c, ImmutableList<Country>> {
        public a(c cVar) {
            super(cVar);
        }

        /* renamed from: b */
        public void v(c cVar, ImmutableList<Country> immutableList) {
            super.v(cVar, immutableList);
            if (immutableList.isEmpty()) {
                i.d(new RuntimeException("KYC. Empty countries list has been received from the server"));
            }
            if (cVar.isAdded()) {
                cVar.j(immutableList);
                cVar.dzy.cga.cfW.d(false, false);
            }
        }

        /* renamed from: a */
        public void c(c cVar, Throwable th) {
            super.c(cVar, th);
            com.crashlytics.android.a.ag("KYC. Unable to get countries list");
            i.d(th);
            if (cVar.isAdded()) {
                cVar.dzy.cga.cfW.d(false, false);
            }
        }
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    public boolean aKp() {
        return true;
    }

    public static c a(KycState kycState, com.iqoption.kyc.profile.a aVar, boolean z) {
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_STATE", kycState);
        bundle.putParcelable("ARG_KYC_PROFILE", aVar);
        bundle.putBoolean("ARG_IS_CITIZEN_COUNTRY_FRAGMENT", z);
        cVar.setArguments(bundle);
        return cVar;
    }

    public static String eK(boolean z) {
        StringBuilder stringBuilder;
        String str;
        if (z) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(LOG_TAG);
            str = ".citizenship";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(LOG_TAG);
            str = ".residential_country";
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dtm = new g(getContext(), (KycState) bundle.getParcelable("ARG_KYC_STATE"));
            this.dtB = (com.iqoption.kyc.profile.a) bundle.getParcelable("ARG_KYC_PROFILE");
            this.dzz = bundle.getBoolean("ARG_IS_CITIZEN_COUNTRY_FRAGMENT");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dzy = (ji) DataBindingUtil.inflate(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), (int) R.style.KycCountryTheme)), R.layout.fragment_kyc_country_old, viewGroup, false);
        this.dzy.cga.cfW.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (c.this.dzA != null) {
                    if (c.this.dzz) {
                        c.this.dzx.b(c.this.dzA);
                    } else {
                        if (!(c.this.dtm == null || c.this.dzA == null)) {
                            com.iqoption.kyc.a.a.a("kyc_choose-country", c.this.aKn(), c.this.aKo(), c.this.dtm.Er(), c.this.dzA.id.longValue(), c.this.dzA.nameShort);
                        }
                        c.this.dzx.a(c.this.dzA, c.this.dzy.cge.isChecked());
                    }
                }
            }
        });
        this.dzy.cgf.setWrapSelectorWheel(false);
        if (this.dzz) {
            this.dzy.cgg.setText(R.string.kyc_enter_your_citizenship_country);
            this.dzy.cge.setVisibility(8);
        } else {
            this.dzy.cgg.setText(R.string.kyc_enter_your_residental_country);
        }
        this.dzy.cga.cfW.d(true, false);
        p.a(com.iqoption.mobbtech.connect.request.api.c.aPt(), new a(this), com.iqoption.core.c.a.biN);
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), this.dtm.Er(), aKn(), aKo(), eK(this.dzz)) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                c.this.Lb();
                c.this.dzy.cgf.requestFocus();
            }
        };
        this.dzy.cge.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                com.iqoption.kyc.a.a.a(z, c.this.aKn(), c.this.aKo(), "", c.this.dtm.Er());
            }
        });
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        return this.dzy.getRoot();
    }

    @NonNull
    public String aKo() {
        return this.dzz ? "InputCountry_Citizenship" : "InputCountry_Resident";
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dzy.cfS.toolbar);
    }

    private void j(final ImmutableList<Country> immutableList) {
        int d;
        g gVar = this.dtm;
        if (gVar != null) {
            long e;
            if (this.dzz) {
                e = gVar.e(this.dtB);
            } else {
                e = gVar.d(this.dtB);
            }
            d = com.google.common.collect.s.d(immutableList, new j<Country>() {
                /* renamed from: c */
                public boolean apply(Country country) {
                    return f.equal(country.id, Long.valueOf(e));
                }
            });
        } else {
            d = -1;
        }
        this.dzy.cgf.setMinValue(0);
        this.dzy.cgf.setMaxValue(Math.max(0, immutableList.size() - 1));
        if (d != -1) {
            this.dzy.cgf.setValue(d);
            this.dzA = (Country) immutableList.get(d);
        }
        this.dzy.cgf.setOnValueChangedListener(new OnValueChangeListener() {
            public void onValueChange(NumberPicker numberPicker, int i, int i2) {
                c.this.dzA = (Country) immutableList.get(i2);
            }
        });
        this.dzy.cgf.setFormatter(new Formatter() {
            public String format(int i) {
                return i < immutableList.size() ? ((Country) immutableList.get(i)).name : "";
            }
        });
    }

    public void onStart() {
        super.onStart();
        y.a(this.dxN);
        if (t.a(getFragmentManager(), eK(this.dzz))) {
            this.dzy.cgf.requestFocus();
        }
    }

    public void onStop() {
        super.onStop();
        y.b(this.dxN);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.dzx = (b) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dzx = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }
}
