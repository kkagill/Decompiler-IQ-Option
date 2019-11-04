package com.iqoption.kyc.fragment.f.a;

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
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.e.ko;
import com.iqoption.e.kw;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycQuestionSingleChoiceFragment2 */
public class b extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.f.a.b";
    private ko dAa;
    private com.iqoption.util.y.a dxN = new -$$Lambda$b$7v7wqhGXQyQ6sh6QHRSz1ovKVtQ(this);
    private OnBackStackChangedListener dxW;
    private QuestionnaireType dzU;
    private f dzV;
    private a dzZ;

    /* compiled from: KycQuestionSingleChoiceFragment2 */
    public interface a {
        void b(QuestionnaireType questionnaireType, f fVar, int i, com.iqoption.kyc.a.b bVar);
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
        if (z && t.a(getFragmentManager(), TAG)) {
            y.j(getActivity());
        }
    }

    public static b b(QuestionnaireType questionnaireType, f fVar) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_QUESTION_TYPE", questionnaireType);
        bundle.putParcelable("ARG_QUESTION", fVar);
        bVar.setArguments(bundle);
        return bVar;
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
        this.dAa = (ko) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_question_single_choice_old, viewGroup, false);
        this.dAa.cgm.setText(LocalizationUtil.hr(this.dzV.afi()));
        for (final com.iqoption.core.microservices.kyc.response.questionnaire.b bVar : this.dzV.afk()) {
            kw kwVar = (kw) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_radio_button, viewGroup, false);
            kwVar.getRoot().setTag(R.id.answer, bVar);
            kwVar.getRoot().setTag(R.id.answerId, Integer.valueOf(bVar.aeW()));
            kwVar.cgb.setText(LocalizationUtil.hr(bVar.aeY()));
            kwVar.cgc.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    b.this.o(Integer.valueOf(bVar.aeW()));
                    b.this.aLr();
                }
            });
            this.dAa.cgk.addView(kwVar.getRoot());
        }
        o(Integer.valueOf(-1));
        aLr();
        this.dAa.cga.cfW.setOnClickListener(new -$$Lambda$b$4LCiSklQ9tSLdiydmAzp4-tfymI(this));
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                b.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        return this.dAa.getRoot();
    }

    private /* synthetic */ void aD(View view) {
        int aeW = aeW();
        a aVar = this.dzZ;
        QuestionnaireType questionnaireType = this.dzU;
        f fVar = this.dzV;
        if (aeW == -1) {
            aeW = 0;
        }
        aVar.b(questionnaireType, fVar, aeW, this);
    }

    private void Lb() {
        s.b((AppCompatActivity) getActivity(), this.dAa.cfS.toolbar);
    }

    private int aeW() {
        int childCount = this.dAa.cgk.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.dAa.cgk.getChildAt(i);
            Integer num = (Integer) childAt.getTag(R.id.answerId);
            if (num != null && childAt.findViewById(R.id.checkMark).getVisibility() == 0) {
                return num.intValue();
            }
        }
        return -1;
    }

    private void o(Integer num) {
        int childCount = this.dAa.cgk.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.dAa.cgk.getChildAt(i);
            childAt.findViewById(R.id.checkMark).setVisibility(((Integer) childAt.getTag(R.id.answerId)).equals(num) ? 0 : 4);
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
            this.dzZ = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dzZ = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void aLr() {
        ConfirmButtonView confirmButtonView = this.dAa.cga.cfW;
        boolean z = (this.dzV.wo() && aeW() == -1) ? false : true;
        confirmButtonView.setEnabled(z);
    }
}
