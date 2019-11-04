package com.iqoption.deposit.crypto.a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.deposit.k;
import com.iqoption.deposit.n;
import com.iqoption.deposit.o.f;
import com.iqoption.deposit.o.g;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0017H\u0014J\u001a\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010&\u001a\u00020\nH\u0016J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0017H\u0016J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002J\b\u0010/\u001a\u00020\u0015H\u0003J\b\u00100\u001a\u00020\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u00062"}, bng = {"Lcom/iqoption/deposit/crypto/preform/DepositCryptoFragment;", "Lcom/iqoption/deposit/PayFieldsContainerFragment;", "()V", "amount", "Ljava/math/BigDecimal;", "binding", "Lcom/iqoption/deposit/databinding/FragmentDepositCryptoBinding;", "cryptoData", "Lcom/iqoption/deposit/crypto/preform/CryptoData;", "paymentMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod;", "prevCryptoLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/google/common/base/Optional;", "viewModel", "Lcom/iqoption/deposit/crypto/preform/DepositCryptoViewModel;", "collectParams", "", "", "", "fillData", "", "hasLimit", "", "observeCryptoData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCustomHiddenChanged", "hidden", "onViewCreated", "view", "payMethod", "requestFullScreenFields", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "setFieldsEnabled", "enabled", "showContentUi", "showKycWarning", "showProgressUi", "updateLimit", "validate", "Companion", "deposit_release"})
/* compiled from: DepositCryptoFragment.kt */
public final class b extends n {
    private static final String TAG;
    public static final a czV = new a();
    private HashMap apm;
    private com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d bnL;
    private BigDecimal bub;
    private com.iqoption.deposit.b.i czR;
    private c czS;
    private LiveData<Optional<a>> czT;
    private a czU;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/crypto/preform/DepositCryptoFragment$Companion;", "", "()V", "TAG", "", "createNavigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "deposit_release"})
    /* compiled from: DepositCryptoFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c aqV() {
            return new com.iqoption.core.ui.d.c(b.TAG, b.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/deposit/crypto/preform/DepositCryptoFragment$fillData$1", "Lcom/iqoption/core/util/link/LinkClickListener;", "onLinkClicked", "", "link", "Lcom/iqoption/core/util/link/Link;", "deposit_release"})
    /* compiled from: DepositCryptoFragment.kt */
    public static final class b implements com.iqoption.core.util.b.b {
        final /* synthetic */ b czW;

        b(b bVar) {
            this.czW = bVar;
        }

        public void onLinkClicked(com.iqoption.core.util.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "link");
            com.iqoption.deposit.navigator.b.cGp.a(this.czW, false, KycVerificationContext.BILLING_DEPOSIT_AML);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/google/common/base/Optional;", "Lcom/iqoption/deposit/crypto/preform/CryptoData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositCryptoFragment.kt */
    static final class c<T> implements Observer<Optional<a>> {
        final /* synthetic */ b czW;

        c(b bVar) {
            this.czW = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Optional<a> optional) {
            a aVar = optional != null ? (a) optional.pN() : null;
            if (aVar != null) {
                this.czW.a(aVar);
            } else {
                com.iqoption.core.d.a(com.iqoption.core.ext.a.q(this.czW), g.unknown_error_occurred, 0, 2, null);
            }
            this.czW.aqy();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositCryptoFragment.kt */
    static final class d<T> implements Observer<BigDecimal> {
        final /* synthetic */ b czW;

        d(b bVar) {
            this.czW = bVar;
        }

        /* renamed from: c */
        public final void onChanged(BigDecimal bigDecimal) {
            this.czW.bub = bigDecimal;
            this.czW.aqS();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "onChanged"})
    /* compiled from: DepositCryptoFragment.kt */
    static final class e<T> implements Observer<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> {
        final /* synthetic */ b czW;

        e(b bVar) {
            this.czW = bVar;
        }

        /* renamed from: k */
        public final void onChanged(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
            if (aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) {
                this.czW.bnL = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) aVar;
                this.czW.aqR();
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.czS = c.czX.J(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.czR = (com.iqoption.deposit.b.i) com.iqoption.core.ext.a.a((Fragment) this, f.fragment_deposit_crypto, viewGroup, false, 4, null);
        com.iqoption.deposit.b.i iVar = this.czR;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return iVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        c cVar = this.czS;
        String str = "viewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        cVar.aoD().observe(lifecycleOwner, new d(this));
        cVar = this.czS;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aoy().observe(lifecycleOwner, new e(this));
    }

    /* Access modifiers changed, original: protected */
    public void cG(boolean z) {
        if (!z) {
            aqR();
        }
    }

    private final void aqR() {
        a aVar;
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar = this.bnL;
        LiveData liveData = this.czT;
        if (liveData != null) {
            Optional optional = (Optional) liveData.getValue();
            if (optional != null) {
                aVar = (a) optional.pN();
                if (aVar == null && dVar != null) {
                    aqx();
                    liveData = this.czT;
                    if (liveData != null) {
                        liveData.removeObservers(this);
                    }
                    c cVar = this.czS;
                    if (cVar == null) {
                        kotlin.jvm.internal.i.lG("viewModel");
                    }
                    LiveData j = cVar.j(dVar.aaD(), k.cxn.aoN());
                    this.czT = j;
                    j.observe(this, new c(this));
                    return;
                }
            }
        }
        aVar = null;
        if (aVar == null) {
        }
    }

    private final void aqx() {
        com.iqoption.deposit.b.i iVar = this.czR;
        String str = "binding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = iVar.cBh;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.depositCryptoProgress");
        contentLoadingProgressBar.setVisibility(0);
        iVar = this.czR;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = iVar.cBg;
        kotlin.jvm.internal.i.e(linearLayout, "binding.depositCryptoContent");
        com.iqoption.core.ext.a.hide(linearLayout);
    }

    private final void aqy() {
        com.iqoption.deposit.b.i iVar = this.czR;
        String str = "binding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = iVar.cBh;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.depositCryptoProgress");
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        iVar = this.czR;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = iVar.cBg;
        kotlin.jvm.internal.i.e(linearLayout, "binding.depositCryptoContent");
        com.iqoption.core.ext.a.ak(linearLayout);
    }

    @SuppressLint({"SetTextI18n"})
    private final void a(a aVar) {
        this.czU = aVar;
        String a = com.iqoption.core.util.e.a(aVar.aal().aam(), aVar.aqP(), true);
        com.iqoption.deposit.b.i iVar = this.czR;
        String str = "binding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = iVar.cBi;
        kotlin.jvm.internal.i.e(textView, "binding.depositCryptoRate");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1 ");
        stringBuilder.append(aVar.wU());
        stringBuilder.append(" ≈ ");
        stringBuilder.append(a);
        textView.setText(stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(aVar.aqQ().aad());
        stringBuilder2.append(' ');
        stringBuilder2.append(getString(g.minutes));
        a = stringBuilder2.toString();
        iVar = this.czR;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = iVar.cBj;
        kotlin.jvm.internal.i.e(textView, "binding.depositCryptoRateWarning");
        textView.setText(getString(g.exchange_rate_changes_every_n1, a));
        String str2 = "binding.depositCryptoAmountWarningDescription";
        com.iqoption.deposit.b.i iVar2;
        TextView textView2;
        if (aqU()) {
            kotlin.jvm.internal.i.e(getString(g.kyc_verify_account), "getString(R.string.kyc_verify_account)");
            String string = getString(g.n1_to_make_deposit_more_than_n2, a, aVar.aqO());
            kotlin.jvm.internal.i.e(string, "getString(R.string.n1_to…a.getFormattedMaxLimit())");
            com.iqoption.deposit.b.i iVar3 = this.czR;
            if (iVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView3 = iVar3.cBf;
            kotlin.jvm.internal.i.e(textView3, str2);
            com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{new com.iqoption.core.util.b.a(a, "")};
            com.iqoption.core.util.b.d.a(new com.iqoption.core.util.b.e(aVarArr, textView3, string, com.iqoption.deposit.o.b.iq, com.iqoption.deposit.o.b.iq_60, false, new b(this), 32, null));
            iVar2 = this.czR;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView2 = iVar2.cBf;
            kotlin.jvm.internal.i.e(textView2, str2);
            com.iqoption.core.ext.a.ak(textView2);
        } else {
            iVar2 = this.czR;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView2 = iVar2.cBf;
            kotlin.jvm.internal.i.e(textView2, str2);
            com.iqoption.core.ext.a.al(textView2);
        }
        aqS();
    }

    @SuppressLint({"SetTextI18n"})
    private final void aqS() {
        a aVar = this.czU;
        BigDecimal bigDecimal = this.bub;
        if (bigDecimal != null && aVar != null) {
            String str = "binding.depositCryptoAmountWarning";
            String str2 = "binding.depositCryptoAmountProgress";
            String str3 = "binding";
            com.iqoption.deposit.b.i iVar;
            ProgressBar progressBar;
            if (!aqU() || aVar.aqM() <= ((double) 0)) {
                iVar = this.czR;
                if (iVar == null) {
                    kotlin.jvm.internal.i.lG(str3);
                }
                TextView textView = iVar.cBe;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.al(textView);
                iVar = this.czR;
                if (iVar == null) {
                    kotlin.jvm.internal.i.lG(str3);
                }
                progressBar = iVar.cBd;
                kotlin.jvm.internal.i.e(progressBar, str2);
                com.iqoption.core.ext.a.al(progressBar);
                return;
            }
            com.iqoption.deposit.b.i iVar2 = this.czR;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            TextView textView2 = iVar2.cBe;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.ak(textView2);
            iVar2 = this.czR;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            ProgressBar progressBar2 = iVar2.cBd;
            kotlin.jvm.internal.i.e(progressBar2, str2);
            com.iqoption.core.ext.a.ak(progressBar2);
            double aqM = aVar.aqM();
            double aqN = aVar.aqN() + bigDecimal.doubleValue();
            String a = com.iqoption.core.util.e.a(aqN, aVar.aqP(), true);
            String a2 = com.iqoption.core.util.e.a(aqM, aVar.aqP(), true);
            iVar2 = this.czR;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            textView2 = iVar2.cBe;
            kotlin.jvm.internal.i.e(textView2, str);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append(" / ");
            stringBuilder.append(a2);
            textView2.setText(stringBuilder.toString());
            iVar = this.czR;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            progressBar = iVar.cBd;
            kotlin.jvm.internal.i.e(progressBar, str2);
            double d = (double) 100;
            Double.isNaN(d);
            progressBar.setMax((int) (aqM * d));
            iVar = this.czR;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            progressBar = iVar.cBd;
            kotlin.jvm.internal.i.e(progressBar, str2);
            Double.isNaN(d);
            progressBar.setProgress((int) (aqN * d));
        }
    }

    private final void aqT() {
        a aVar = this.czU;
        if (aVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        String aqO = aVar.aqO();
        String wU = aVar.wU();
        Object string = kotlin.jvm.internal.i.y(wU, com.iqoption.core.microservices.configuration.a.d.brN.acS()) ? getString(g.bitcoin) : wU;
        kotlin.jvm.internal.i.e(string, "if (from == BTC_CURRENCY…           from\n        }");
        com.iqoption.core.ui.d.g.a(com.iqoption.deposit.navigator.b.cGp.P(this), com.iqoption.deposit.crypto.kyc.a.czN.p(aqO, wU, string), false, 2, null);
    }

    private final boolean aqU() {
        a aVar = this.czU;
        if (aVar != null) {
            com.iqoption.core.microservices.billing.response.crypto.f aqQ = aVar.aqQ();
            if (aqQ != null && aqQ.aai()) {
                return true;
            }
        }
        return false;
    }

    public boolean validate() {
        a aVar = this.czU;
        BigDecimal bigDecimal = this.bub;
        if (bigDecimal == null || aVar == null) {
            return false;
        }
        if (!aqU()) {
            return true;
        }
        if (aVar.aqN() + bigDecimal.doubleValue() <= aVar.aqM()) {
            return true;
        }
        aqT();
        return false;
    }

    public Map<String, Object> aoR() {
        throw new IllegalStateException("Crypto payment contains only full screen extra params");
    }

    /* renamed from: aqc */
    public com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d aoS() {
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d dVar = this.bnL;
        if (dVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return dVar;
    }

    public boolean a(com.iqoption.deposit.i iVar) {
        String aak;
        kotlin.jvm.internal.i.f(iVar, "depositParams");
        com.iqoption.deposit.crypto.refund.a.a aVar = com.iqoption.deposit.crypto.refund.a.cAp;
        a aVar2 = this.czU;
        if (aVar2 != null) {
            com.iqoption.core.microservices.billing.response.crypto.f aqQ = aVar2.aqQ();
            if (aqQ != null) {
                aak = aqQ.aak();
                com.iqoption.core.ui.d.g.a(com.iqoption.deposit.navigator.b.cGp.P(this), aVar.a(iVar, aak), false, 2, null);
                return true;
            }
        }
        aak = null;
        com.iqoption.core.ui.d.g.a(com.iqoption.deposit.navigator.b.cGp.P(this), aVar.a(iVar, aak), false, 2, null);
        return true;
    }
}
