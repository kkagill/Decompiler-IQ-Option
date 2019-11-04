package com.iqoption.deposit.hold;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewStubProxy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.kyc.response.k;
import com.iqoption.deposit.o;
import com.iqoption.deposit.verification.VerificationState;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H$J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0016H$J\b\u0010\u001b\u001a\u00020\u001cH$J\b\u0010\u001d\u001a\u00020\fH$J\b\u0010\u001e\u001a\u00020\u0014H$J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0016H$J\b\u0010 \u001a\u00020\u001cH$J\b\u0010!\u001a\u00020\u0012H\u0014J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010$H\u0017J\u000e\u0010(\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010)\u001a\u00020\u0012H\u0002J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u0012H\u0002J\b\u0010.\u001a\u00020\u001cH$J\b\u0010/\u001a\u000200H$R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u00062"}, bng = {"Lcom/iqoption/deposit/hold/BaseDepositHoldFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "holdPayment", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/HoldPayment;", "kycWarningData", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "loadedCard", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "timeWarningExpandedByUser", "", "viewModel", "Lcom/iqoption/deposit/hold/DepositHoldViewModel;", "getViewModel", "()Lcom/iqoption/deposit/hold/DepositHoldViewModel;", "setViewModel", "(Lcom/iqoption/deposit/hold/DepositHoldViewModel;)V", "applyButtonState", "", "button", "Landroid/view/View;", "iconImage", "Landroid/widget/ImageView;", "verifyWarning", "Lcom/iqoption/deposit/verification/VerifyWarning;", "cardButton", "cardButtonIcon", "cardWarning", "Landroid/widget/TextView;", "createDepositHoldViewModel", "kycButton", "kycButtonIcon", "kycWarning", "onAllHoldWarningsResolved", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onViewCreated", "view", "savedInstanceState", "setHoldPayment", "showErrorState", "showHoldStatus", "holdStatus", "Lcom/iqoption/deposit/hold/HoldScreenStatus;", "showProgressState", "timeLink", "timeWarning", "Landroidx/databinding/ViewStubProxy;", "Companion", "deposit_release"})
/* compiled from: BaseDepositHoldFragment.kt */
public abstract class a extends com.iqoption.core.ui.fragment.d {
    public static final a cDR = new a();
    private HashMap apm;
    private f cDM;
    private com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b cDN;
    private com.iqoption.core.microservices.billing.verification.response.c cDO;
    private k cDP;
    private boolean cDQ;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/deposit/hold/BaseDepositHoldFragment$Companion;", "", "()V", "STATE_TIME_WARNING_EXPANDED", "", "deposit_release"})
    /* compiled from: BaseDepositHoldFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ a cDS;

        public b(a aVar) {
            this.cDS = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            k c = this.cDS.cDP;
            if (c != null) {
                com.iqoption.core.d.EC().di("deposit-page_verify-identity");
                com.iqoption.deposit.navigator.b.cGp.a((Fragment) this.cDS, c);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ a cDS;

        public c(a aVar) {
            this.cDS = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.microservices.billing.verification.response.c b = this.cDS.cDO;
            if (b != null) {
                com.iqoption.core.d.EC().di("deposit-page_verify-card");
                com.iqoption.cardsverification.c.aAp.KZ().d(this.cDS, b);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ a cDS;
        final /* synthetic */ TextView cDT;
        final /* synthetic */ ViewStubProxy cDU;

        public d(a aVar, TextView textView, ViewStubProxy viewStubProxy) {
            this.cDS = aVar;
            this.cDT = textView;
            this.cDU = viewStubProxy;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.ext.a.al(this.cDT);
            ViewStub viewStub = this.cDU.getViewStub();
            if (viewStub == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            viewStub.inflate();
            this.cDS.cDQ = true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/deposit/hold/HoldScreenStatus;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseDepositHoldFragment.kt */
    static final class e<T> implements Observer<com.iqoption.core.ui.d<i>> {
        final /* synthetic */ a cDS;

        e(a aVar) {
            this.cDS = aVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.core.ui.d<i> dVar) {
            k kVar = null;
            if (dVar == null || !dVar.isSuccess()) {
                this.cDS.ark();
                this.cDS.cDO = (com.iqoption.core.microservices.billing.verification.response.c) null;
                this.cDS.cDP = (k) null;
                return;
            }
            Object data = dVar.getData();
            if (data == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            i iVar = (i) data;
            this.cDS.cDO = iVar.La();
            a aVar = this.cDS;
            com.iqoption.deposit.verification.b arz = iVar.arz();
            if (arz != null) {
                kVar = arz.getData();
            }
            aVar.cDP = kVar;
            this.cDS.a(iVar);
            if (iVar.arz() == null && iVar.arA() == null) {
                this.cDS.ari();
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract TextView arl();

    public abstract ViewStubProxy arm();

    public abstract View arn();

    public abstract View aro();

    public abstract ImageView arp();

    public abstract ImageView arq();

    public abstract TextView arr();

    public abstract TextView ars();

    public abstract f art();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    /* Access modifiers changed, original: protected|final */
    public final f arh() {
        return this.cDM;
    }

    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        arj();
        f art = art();
        art.aru().observe(this, new e(this));
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b bVar = this.cDN;
        if (bVar != null) {
            art.bu(bVar.aaB());
        }
        this.cDM = art;
        arn().setOnClickListener(new b(this));
        aro().setOnClickListener(new c(this));
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("STATE_TIME_WARNING_EXPANDED", false);
        }
        this.cDQ = z;
        TextView arl = arl();
        ViewStubProxy arm = arm();
        if (this.cDQ || arm.isInflated() || !com.iqoption.core.ext.a.p(this)) {
            if (!arm.isInflated()) {
                ViewStub viewStub = arm.getViewStub();
                if (viewStub == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                viewStub.inflate();
            }
            com.iqoption.core.ext.a.al(arl);
            return;
        }
        View view2 = arl;
        com.iqoption.core.ext.a.ak(view2);
        StringBuilder stringBuilder = new StringBuilder();
        String string = getString(o.g.show_more);
        kotlin.jvm.internal.i.e(string, "getString(R.string.show_more)");
        if (string != null) {
            string = string.toLowerCase();
            kotlin.jvm.internal.i.e(string, "(this as java.lang.String).toLowerCase()");
            stringBuilder.append(string);
            stringBuilder.append("...");
            arl.setText(stringBuilder.toString());
            view2.setOnClickListener(new d(this, arl, arm));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        bundle.putBoolean("STATE_TIME_WARNING_EXPANDED", this.cDQ);
        super.onSaveInstanceState(bundle);
    }

    /* Access modifiers changed, original: protected */
    public void ari() {
        com.iqoption.billing.repository.a.ayY.Kx();
    }

    private final void arj() {
        com.iqoption.core.ext.a.al(arr());
        com.iqoption.core.ext.a.al(ars());
        com.iqoption.core.ext.a.al(arn());
        com.iqoption.core.ext.a.al(aro());
    }

    private final void ark() {
        View view = getView();
        if (view != null) {
            com.iqoption.core.ext.a.al(view);
        }
    }

    private final void a(i iVar) {
        View view = getView();
        if (view != null) {
            com.iqoption.core.ext.a.ak(view);
        }
        c.a(arr(), iVar.arz());
        c.a(ars(), iVar.arA());
        a(arn(), arp(), iVar.arz());
        a(aro(), arq(), iVar.arA());
    }

    private final void a(View view, ImageView imageView, com.iqoption.deposit.verification.e<?> eVar) {
        VerificationState ath;
        if (eVar != null) {
            ath = eVar.ath();
        } else {
            ath = null;
        }
        if (ath != null) {
            int i = b.aob[ath.ordinal()];
            String str = "it.context";
            Context context;
            if (i == 1) {
                com.iqoption.core.ext.a.ak(view);
                view.setEnabled(false);
                if (imageView != null) {
                    context = imageView.getContext();
                    kotlin.jvm.internal.i.e(context, str);
                    imageView.setImageDrawable(com.iqoption.core.ext.a.n(context, com.iqoption.deposit.o.d.ic_wait));
                    return;
                }
                return;
            } else if (i != 2) {
                com.iqoption.core.ext.a.ak(view);
                view.setEnabled(true);
                if (imageView != null) {
                    context = imageView.getContext();
                    kotlin.jvm.internal.i.e(context, str);
                    imageView.setImageDrawable(com.iqoption.core.ext.a.n(context, com.iqoption.deposit.o.d.ic_error_white));
                    return;
                }
                return;
            }
        }
        com.iqoption.core.ext.a.al(view);
    }
}
