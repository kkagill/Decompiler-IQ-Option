package com.iqoption.kyc.fragment.f.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.collect.ImmutableSet;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.e.jg;
import com.iqoption.e.km;
import com.iqoption.kyc.a.b;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KycQuestionMultiChoiceFragment2 */
public class a extends Fragment implements b {
    public static final String TAG = "com.iqoption.kyc.fragment.f.a.a";
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && t.a(a.this.getFragmentManager(), a.TAG)) {
                y.j(a.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private QuestionnaireType dzU;
    private f dzV;
    private a dzW;
    private km dzX;

    /* compiled from: KycQuestionMultiChoiceFragment2 */
    public interface a {
        void a(QuestionnaireType questionnaireType, f fVar, List<Integer> list, b bVar);
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

    public static a a(QuestionnaireType questionnaireType, f fVar) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_QUESTION_TYPE", questionnaireType);
        bundle.putParcelable("ARG_QUESTION", fVar);
        aVar.setArguments(bundle);
        return aVar;
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
        this.dzX = (km) DataBindingUtil.inflate(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), (int) R.style.KycCountryTheme)), R.layout.fragment_kyc_question_multi_choice_old, viewGroup, false);
        this.dzX.cgm.setText(LocalizationUtil.hr(this.dzV.afi()));
        for (com.iqoption.core.microservices.kyc.response.questionnaire.b bVar : this.dzV.afk()) {
            jg jgVar = (jg) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_check_box, viewGroup, false);
            jgVar.getRoot().setTag(R.id.answer, bVar);
            jgVar.getRoot().setTag(R.id.answerId, Integer.valueOf(bVar.aeW()));
            jgVar.cgb.setText(LocalizationUtil.hr(bVar.aeY()));
            jgVar.cgd.setOnCheckedChangeListener(new -$$Lambda$a$yjoM8VXgs-RQqNcrUVpVFCLbFVE(this, jgVar));
            jgVar.cgc.setOnClickListener(new -$$Lambda$a$94-idbvEIKSssEjneMZN4sGjQDQ(jgVar));
            this.dzX.cgk.addView(jgVar.getRoot());
        }
        this.dzX.cga.cfW.setOnClickListener(new -$$Lambda$a$HRmFTnYmIxYabZ0Ctp7srlFtUAo(this));
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                a.this.Lb();
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        aLr();
        return this.dzX.getRoot();
    }

    private /* synthetic */ void a(jg jgVar, CompoundButton compoundButton, boolean z) {
        com.iqoption.core.microservices.kyc.response.questionnaire.b bVar = (com.iqoption.core.microservices.kyc.response.questionnaire.b) jgVar.getRoot().getTag(R.id.answer);
        if (z) {
            b(bVar);
        }
        aLr();
    }

    private /* synthetic */ void aC(View view) {
        this.dzW.a(this.dzU, this.dzV, aLw(), this);
    }

    private ArrayList<Integer> aLw() {
        ArrayList arrayList = new ArrayList();
        km kmVar = this.dzX;
        if (kmVar == null) {
            return arrayList;
        }
        int childCount = kmVar.cgk.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.dzX.cgk.getChildAt(i);
            Integer num = (Integer) childAt.getTag(R.id.answerId);
            if (num != null && ((CheckBox) childAt.findViewById(R.id.checkBox)).isChecked()) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    private void b(com.iqoption.core.microservices.kyc.response.questionnaire.b bVar) {
        int childCount = this.dzX.cgk.getChildCount();
        ImmutableSet n = ImmutableSet.n(bVar.aeX());
        for (int i = 0; i < childCount; i++) {
            View childAt = this.dzX.cgk.getChildAt(i);
            Integer num = (Integer) childAt.getTag(R.id.answerId);
            if (!(num == null || num.equals(Integer.valueOf(bVar.aeW())) || !n.contains(num))) {
                ((CheckBox) childAt.findViewById(R.id.checkBox)).setChecked(false);
            }
        }
    }

    private void Lb() {
        s.b((AppCompatActivity) getActivity(), this.dzX.cfS.toolbar);
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
            this.dzW = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dzW = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private void aLr() {
        this.dzX.cga.cfW.setEnabled(aLw().isEmpty() ^ 1);
    }
}
