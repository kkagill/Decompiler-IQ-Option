package com.iqoption.kyc.profile.steps;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.iqoption.kyc.b;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u001a\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0006\u0010\"\u001a\u00020\u0019J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004H&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006#"}, bng = {"Lcom/iqoption/kyc/profile/steps/BaseKycProfileStepFragment;", "Lcom/iqoption/kyc/BaseKycStepFragment;", "()V", "profile", "Lcom/iqoption/kyc/profile/KycProfile;", "getProfile", "()Lcom/iqoption/kyc/profile/KycProfile;", "setProfile", "(Lcom/iqoption/kyc/profile/KycProfile;)V", "step", "Lcom/iqoption/kyc/profile/steps/ProfileStep;", "getStep", "()Lcom/iqoption/kyc/profile/steps/ProfileStep;", "viewModel", "Lcom/iqoption/kyc/profile/steps/KycProfileStepViewModel;", "getViewModel", "()Lcom/iqoption/kyc/profile/steps/KycProfileStepViewModel;", "setViewModel", "(Lcom/iqoption/kyc/profile/steps/KycProfileStepViewModel;)V", "createViewModel", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onProfileUpdated", "onViewCreated", "view", "Landroid/view/View;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "validateAndSaveData", "kyc_release"})
/* compiled from: BaseKycProfileStepFragment.kt */
public abstract class a extends b {
    private HashMap apm;
    protected e dBy;
    private com.iqoption.kyc.profile.a dBz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/kyc/profile/KycProfile;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseKycProfileStepFragment.kt */
    static final class a<T> implements Observer<com.iqoption.kyc.profile.a> {
        final /* synthetic */ a dBA;

        a(a aVar) {
            this.dBA = aVar;
        }

        /* renamed from: o */
        public final void onChanged(com.iqoption.kyc.profile.a aVar) {
            if ((kotlin.jvm.internal.i.y(this.dBA.aLY(), aVar) ^ 1) != 0) {
                this.dBA.l(aVar);
                if (aVar != null) {
                    this.dBA.m(aVar);
                }
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract ProfileStep aMb();

    /* Access modifiers changed, original: protected */
    public void m(com.iqoption.kyc.profile.a aVar) {
        kotlin.jvm.internal.i.f(aVar, Scopes.PROFILE);
    }

    public abstract boolean n(com.iqoption.kyc.profile.a aVar);

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    /* Access modifiers changed, original: protected|final */
    public final e aLX() {
        e eVar = this.dBy;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return eVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final com.iqoption.kyc.profile.a aLY() {
        return this.dBz;
    }

    /* Access modifiers changed, original: protected|final */
    public final void l(com.iqoption.kyc.profile.a aVar) {
        this.dBz = aVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dBy = aLZ();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        e eVar = this.dBy;
        String str = "viewModel";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.aLU().observe(this, new a(this));
        eVar = this.dBy;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        eVar.f(aMb());
    }

    /* Access modifiers changed, original: protected */
    public e aLZ() {
        return e.dBL.aF(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        kotlin.jvm.internal.i.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        com.iqoption.kyc.profile.b.dBp.P(this).alG();
        return true;
    }

    public final boolean aMa() {
        com.iqoption.kyc.profile.a aVar = this.dBz;
        return aVar != null ? n(aVar) : false;
    }
}
