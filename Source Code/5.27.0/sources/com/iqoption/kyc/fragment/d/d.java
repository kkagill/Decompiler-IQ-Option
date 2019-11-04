package com.iqoption.kyc.fragment.d;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
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
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.e.jm;
import com.iqoption.kyc.a.b;
import com.iqoption.kyc.a.c;
import com.iqoption.kyc.g;
import com.iqoption.kyc.q;
import com.iqoption.kyc.s;
import com.iqoption.util.y;
import com.iqoption.view.text.j;
import com.iqoption.widget.NumPad;
import com.iqoption.widget.helper.ErrorBubbleHelper;
import com.iqoption.widget.helper.ErrorBubbleHelper.BubbleGravity;
import com.iqoption.x.R;

/* compiled from: KycDateOfBirthFragment */
public class d extends Fragment implements b {
    public static final String TAG = "com.iqoption.kyc.fragment.d.d";
    @Nullable
    private com.iqoption.kyc.profile.a dtB;
    @Nullable
    private g dtm;
    private OnBackStackChangedListener dxW;
    private a dzD;
    private jm dzE;
    private ErrorBubbleHelper dzF;
    @Nullable
    private com.iqoption.core.ui.widget.d.a dzG;
    private c dzd;
    private TextWatcher dzo = new j() {
        public void afterTextChanged(Editable editable) {
            d.this.aLr();
        }
    };

    /* compiled from: KycDateOfBirthFragment */
    public interface a {
        void iK(String str);
    }

    @NonNull
    public String aKn() {
        return "PersonalData";
    }

    @NonNull
    public String aKo() {
        return "InputBirthDate";
    }

    public boolean aKp() {
        return true;
    }

    public static d c(KycState kycState, com.iqoption.kyc.profile.a aVar) {
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_KYC_STATE", kycState);
        bundle.putParcelable("ARG_KYC_PROFILE", aVar);
        dVar.setArguments(bundle);
        return dVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dtm = new g(getContext(), (KycState) bundle.getParcelable("ARG_KYC_STATE"));
            this.dtB = (com.iqoption.kyc.profile.a) bundle.getParcelable("ARG_KYC_PROFILE");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        this.dzE = (jm) DataBindingUtil.inflate(layoutInflater2, R.layout.fragment_kyc_date_of_birth_old, viewGroup, false);
        this.dzE.cfW.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (d.this.dzG != null && d.this.dzG.isValid()) {
                    d.this.dzD.iK(q.a(d.this.dzG));
                }
            }
        });
        this.dzF = new ErrorBubbleHelper(getContext(), layoutInflater2);
        this.dzF.s(getContext(), R.dimen.sp15);
        this.dzF.q(getContext(), R.dimen.kyc_text_field_height);
        aLr();
        Lb();
        this.dzd = new c(this.dzE.cgh, aKn(), aKo(), "BirthDay", 3, this.dtm.Er());
        this.dxW = new com.iqoption.kyc.a.d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), this.dtm.Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                d.this.Lb();
                if (d.this.dzE != null) {
                    d.this.dzE.cgh.setHideKeyboard(true);
                }
            }

            /* Access modifiers changed, original: protected */
            public void aKs() {
                super.aKs();
                if (d.this.dzE != null) {
                    d.this.dzE.cgh.setHideKeyboard(false);
                }
                if (d.this.isAdded() && d.this.dzF != null) {
                    d.this.dzF.bbQ();
                }
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        this.dzE.cgj.setKeyListener(new NumPad.c() {
            public void onKeyPressed(int i) {
                d.this.dzE.cgh.dispatchKeyEvent(new KeyEvent(0, i));
                d.this.dzE.cgh.dispatchKeyEvent(new KeyEvent(1, i));
            }
        });
        this.dzG = this.dzE.cgh.getTextDateValidator();
        com.iqoption.core.ui.widget.d.a aVar = this.dzG;
        if (aVar != null) {
            aVar.setValidationListener(new com.iqoption.core.ui.widget.d.b() {
                public void amI() {
                    d.this.aLr();
                    Lg();
                }

                private void Lg() {
                    String b = q.b(d.this.dzG);
                    d.this.dzF.r(d.this.getContext(), R.dimen.kyc_error_bubble_width);
                    com.iqoption.kyc.a.a.h(d.this.aKn(), d.this.aKo(), b, d.this.dtm.Er());
                }

                public void amJ() {
                    d.this.aLr();
                    d.this.aLv();
                }

                public void n(int i, int i2, int i3) {
                    d.this.aLr();
                    if (d.this.dzG.isValid()) {
                        String b = q.b(d.this.dzG);
                        if (b != null) {
                            d.this.dzF.r(d.this.getContext(), R.dimen.kyc_age_error_bubble_width);
                            d.this.dZ(b);
                            return;
                        }
                        return;
                    }
                    Lg();
                }
            });
        }
        aLu();
        return this.dzE.getRoot();
    }

    private void aLu() {
        g gVar = this.dtm;
        this.dzE.cgh.setText(gVar != null ? gVar.c(this.dtB) : null);
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dzE.cfS.toolbar);
    }

    public void onStart() {
        super.onStart();
        com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
            public void run() {
                y.b(d.this.getContext(), d.this.dzE.cgh);
                d.this.dzE.cgh.requestFocus();
                com.iqoption.core.ext.a.d(d.this.dzE.cgh);
            }
        }, 400);
    }

    public void onStop() {
        super.onStop();
        ErrorBubbleHelper errorBubbleHelper = this.dzF;
        if (errorBubbleHelper != null) {
            errorBubbleHelper.bbQ();
        }
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dzD = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dzD = null;
    }

    private void aLr() {
        ConfirmButtonView confirmButtonView = this.dzE.cfW;
        com.iqoption.core.ui.widget.d.a aVar = this.dzG;
        boolean z = aVar != null && aVar.isValid() && q.b(this.dzG) == null;
        confirmButtonView.setEnabled(z);
    }

    private void dZ(String str) {
        this.dzF.a(this.dzE.cgh, this.dzF.d(getContext(), this.dzE.cgh) ? BubbleGravity.bottom : BubbleGravity.top, str);
    }

    private void aLv() {
        this.dzF.bbQ();
    }
}
