package com.iqoption.kyc.fragment.f.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.e.ku;
import com.iqoption.kyc.a.b;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycQuestionYesNoFragment2 */
public class d extends Fragment implements b {
    public static final String TAG = "com.iqoption.kyc.fragment.f.a.d";
    private a dAh;
    private ku dAi;
    private y dxL;
    private com.iqoption.util.y.a dxN = new -$$Lambda$d$rVIAQY53X6ikL17FFLWUQATZs0Q(this);
    private OnBackStackChangedListener dxW;
    private QuestionnaireType dzU;
    private f dzV;

    /* compiled from: KycQuestionYesNoFragment2 */
    public interface a {
        void a(QuestionnaireType questionnaireType, f fVar, int i, b bVar);
    }

    @NonNull
    public String aKn() {
        return "TradingExperience";
    }

    @NonNull
    public String aKo() {
        return "Question";
    }

    public boolean aKp() {
        return false;
    }

    private /* synthetic */ void eL(boolean z) {
        if (z && isAdded() && t.a(getFragmentManager(), TAG)) {
            y.j(getActivity());
        }
    }

    public static d d(QuestionnaireType questionnaireType, f fVar) {
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_QUESTION_TYPE", questionnaireType);
        bundle.putParcelable("ARG_QUESTION", fVar);
        dVar.setArguments(bundle);
        return dVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dzU = (QuestionnaireType) bundle.getSerializable("ARG_QUESTION_TYPE");
            this.dzV = (f) bundle.getParcelable("ARG_QUESTION");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dAi = (ku) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_question_yes_no, viewGroup, false);
        this.dAi.cgm.setText(LocalizationUtil.hr(this.dzV.afi()));
        com.iqoption.core.microservices.kyc.response.questionnaire.b bVar = (com.iqoption.core.microservices.kyc.response.questionnaire.b) this.dzV.afk().get(0);
        com.iqoption.core.microservices.kyc.response.questionnaire.b bVar2 = (com.iqoption.core.microservices.kyc.response.questionnaire.b) this.dzV.afk().get(1);
        this.dAi.cgV.setText(LocalizationUtil.hr(bVar.aeY()));
        this.dAi.cgU.setText(LocalizationUtil.hr(bVar2.aeY()));
        this.dAi.cgV.setOnClickListener(new -$$Lambda$d$BIpgLuHtyxCCjPKhOgvQokDqIaw(this, bVar));
        this.dAi.cgU.setOnClickListener(new -$$Lambda$d$d7ztpJYgw-tr1G-8t4WZsFMSiwo(this, bVar2));
        Lb();
        this.dxW = new com.iqoption.kyc.a.d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                d.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        this.dxL = new y(getActivity());
        return this.dAi.getRoot();
    }

    private /* synthetic */ void b(com.iqoption.core.microservices.kyc.response.questionnaire.b bVar, View view) {
        this.dAh.a(this.dzU, this.dzV, bVar.aeW(), this);
    }

    private /* synthetic */ void a(com.iqoption.core.microservices.kyc.response.questionnaire.b bVar, View view) {
        this.dAh.a(this.dzU, this.dzV, bVar.aeW(), this);
    }

    private void Lb() {
        s.b((AppCompatActivity) getActivity(), this.dAi.cfS.toolbar);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dAh = (a) context;
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
        this.dAh = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }
}
