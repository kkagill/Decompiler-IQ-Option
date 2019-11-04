package com.iqoption.kyc;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.animation.transitions.c;
import com.iqoption.core.ui.animation.transitions.e;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.kyc.a.a;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0014J\b\u0010\u0019\u001a\u00020\rH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001a"}, bng = {"Lcom/iqoption/kyc/BaseKycStepFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/kyc/analytics/KycAnalyticsFragmentInfo;", "()V", "screenEvent", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "getSelectionViewModel", "()Lcom/iqoption/kyc/KycSelectionViewModel;", "setSelectionViewModel", "(Lcom/iqoption/kyc/KycSelectionViewModel;)V", "hasSearch", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "showBottomBar", "showProgress", "kyc_release"})
/* compiled from: BaseKycStepFragment.kt */
public abstract class b extends d implements com.iqoption.kyc.a.b {
    private HashMap apm;
    private com.iqoption.core.analytics.b drM;
    protected j drN;

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean aIC() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean aID() {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean aIE() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final j aIB() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.drN = j.dsW.am(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        a aVar = a.dtL;
        String aKn = aKn();
        String aKo = aKo();
        j jVar = this.drN;
        String str = "selectionViewModel";
        if (jVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        this.drM = aVar.i(aKn, aKo, jVar.Er());
        j jVar2 = this.drN;
        if (jVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        jVar2.ep(aIC());
        jVar2 = this.drN;
        if (jVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        jVar2.eo(aID());
        jVar2 = this.drN;
        if (jVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        jVar2.er(aIE());
    }

    public void onDestroyView() {
        com.iqoption.core.analytics.b bVar = this.drM;
        if (bVar != null) {
            String aKn = aKn();
            String aKo = aKo();
            j jVar = this.drN;
            if (jVar == null) {
                kotlin.jvm.internal.i.lG("selectionViewModel");
            }
            a.a(bVar, aKn, aKo, jVar.Er());
        }
        super.onDestroyView();
        Bj();
    }

    /* Access modifiers changed, original: protected */
    public e Bv() {
        return c.bHB.e(this);
    }
}
