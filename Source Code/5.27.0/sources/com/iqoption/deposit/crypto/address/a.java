package com.iqoption.deposit.crypto.address;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.common.base.Optional;
import com.iqoption.core.ui.widget.time.TimeTextView;
import com.iqoption.core.util.ag;
import com.iqoption.deposit.b.at;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000eH\u0003J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u0010H\u0002J\u0012\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0012\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010/\u001a\u00020\u0019H\u0016J\b\u00100\u001a\u00020\u0019H\u0016J\b\u00101\u001a\u00020\u0019H\u0016J\u001a\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010(H\u0017J\b\u00104\u001a\u00020\u0019H\u0002J\b\u00105\u001a\u00020\u0019H\u0002J\b\u00106\u001a\u00020\u0019H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000¨\u00068"}, bng = {"Lcom/iqoption/deposit/crypto/address/DepositCryptoRequisitesFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "billingId", "", "getBillingId", "()J", "billingId$delegate", "Lkotlin/Lazy;", "binding", "Lcom/iqoption/deposit/databinding/FragmentDepositCryptoRequisitesBinding;", "cryptoRequisites", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositRequisites;", "existedFiatCurrencyMask", "", "infoPopup", "Landroid/widget/PopupWindow;", "isCustomAnimationsEnabled", "", "()Z", "screenEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "viewModel", "Lcom/iqoption/deposit/crypto/address/DepositCryptoRequisitesViewModel;", "bindData", "", "requisites", "fiatMask", "changeDetailsVisibility", "visible", "animate", "close", "closeInfoPopup", "closeInfoPopupIfExist", "createInfoPopup", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onEnterAnimation", "onExitAnimation", "onViewCreated", "view", "showContentUi", "showInfoPopup", "showProgressUi", "Companion", "deposit_release"})
/* compiled from: DepositCryptoRequisitesFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "billingId", "getBillingId()J"))};
    public static final a cze = new a();
    private PopupWindow aiN;
    private HashMap apm;
    private final boolean bIN = true;
    private final kotlin.d cyY = g.c(new DepositCryptoRequisitesFragment$billingId$2(this));
    private com.iqoption.deposit.b.k cyZ;
    private b cza;
    private com.iqoption.core.microservices.billing.response.crypto.c czb;
    private String czc;
    private com.iqoption.core.analytics.c czd;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/deposit/crypto/address/DepositCryptoRequisitesFragment$Companion;", "", "()V", "ARG_BILLING_ID", "", "ARG_EXISTED_FIAT_MASK", "TAG", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "billingId", "", "existedFiatMask", "deposit_release"})
    /* compiled from: DepositCryptoRequisitesFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c h(long j, String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("ARG_BILLING_ID", j);
            bundle.putString("ARG_EXISTED_FIAT_MASK", str);
            return new com.iqoption.core.ui.d.c(a.TAG, a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public b(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.close(false);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public c(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.d.EC().a("deposit-page_iq-address-info", 0.0d, com.iqoption.deposit.d.a.cGB.atf());
            this.this$0.aqA();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ String czf;
        final /* synthetic */ a this$0;

        public d(a aVar, String str) {
            this.this$0 = aVar;
            this.czf = str;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            String str = this.czf;
            TextView textView = a.b(this.this$0).cBk;
            kotlin.jvm.internal.i.e(textView, "binding.cryptoAddress");
            ag.au(str, textView.getText().toString());
            com.iqoption.core.d.a(com.iqoption.core.ext.a.q(this.this$0), com.iqoption.deposit.o.g.address_copied, 0);
            com.iqoption.core.d.EC().a("deposit-page_iq-address-copy", 0.0d, com.iqoption.deposit.d.a.cGB.atf());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public e(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            LinearLayout linearLayout = a.b(this.this$0).cBq;
            kotlin.jvm.internal.i.e(linearLayout, "binding.cryptoDetailsContainer");
            this.this$0.f(com.iqoption.core.ext.a.af(linearLayout) ^ 1, true);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositCryptoRequisitesFragment.kt */
    static final class f<T> implements Observer<Bitmap> {
        final /* synthetic */ a this$0;

        f(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: b */
        public final void onChanged(Bitmap bitmap) {
            a.b(this.this$0).cBx.setImageBitmap(bitmap);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "", "it", "Lcom/google/common/base/Optional;", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositRequisites;", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositCryptoRequisitesFragment.kt */
    static final class g<T> implements Observer<Optional<Pair<? extends com.iqoption.core.microservices.billing.response.crypto.c, ? extends String>>> {
        final /* synthetic */ a this$0;

        g(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Optional<Pair<com.iqoption.core.microservices.billing.response.crypto.c, String>> optional) {
            com.iqoption.core.microservices.billing.response.crypto.c cVar = null;
            Pair pair = optional != null ? (Pair) optional.pN() : null;
            String str = "binding.cryptoQuestion";
            ImageView imageView;
            if (pair != null) {
                this.this$0.aqy();
                this.this$0.a((com.iqoption.core.microservices.billing.response.crypto.c) pair.getFirst(), (String) pair.bni());
                imageView = a.b(this.this$0).cBz;
                kotlin.jvm.internal.i.e(imageView, str);
                imageView.setEnabled(true);
            } else {
                com.iqoption.core.d.a(com.iqoption.deposit.o.g.unknown_error_occurred, 0, 2, null);
                imageView = a.b(this.this$0).cBz;
                kotlin.jvm.internal.i.e(imageView, str);
                imageView.setEnabled(false);
            }
            a aVar = this.this$0;
            if (pair != null) {
                cVar = (com.iqoption.core.microservices.billing.response.crypto.c) pair.getFirst();
            }
            aVar.czb = cVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositCryptoRequisitesFragment.kt */
    static final class h<T> implements Observer<String> {
        final /* synthetic */ a this$0;

        h(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            TimeTextView timeTextView = a.b(this.this$0).cBH;
            if (str == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            timeTextView.D(str);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "color", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"})
    /* compiled from: DepositCryptoRequisitesFragment.kt */
    static final class i<T> implements Observer<Integer> {
        final /* synthetic */ a this$0;

        i(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: b */
        public final void onChanged(Integer num) {
            if (num != null) {
                a.b(this.this$0).cBH.setTextColor(num.intValue());
            }
        }
    }

    private final long ZF() {
        kotlin.d dVar = this.cyY;
        j jVar = anY[0];
        return ((Number) dVar.getValue()).longValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ com.iqoption.deposit.b.k b(a aVar) {
        com.iqoption.deposit.b.k kVar = aVar.cyZ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return kVar;
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cza = b.czt.a(this, ZF());
        this.czc = com.iqoption.core.ext.a.s(this).getString("ARG_EXISTED_FIAT_MASK");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.cyZ = (com.iqoption.deposit.b.k) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.deposit.o.f.fragment_deposit_crypto_requisites, viewGroup, false, 4, null);
        com.iqoption.deposit.b.k kVar = this.cyZ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return kVar.getRoot();
    }

    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.czd = com.iqoption.core.d.EC().h("deposit-page_iq-address", 0.0d, com.iqoption.deposit.d.a.cGB.atf());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(com.iqoption.deposit.o.g.app_name));
        stringBuilder.append(' ');
        String string = getString(com.iqoption.deposit.o.g.address);
        kotlin.jvm.internal.i.e(string, "getString(R.string.address)");
        if (string != null) {
            string = string.toLowerCase();
            kotlin.jvm.internal.i.e(string, "(this as java.lang.String).toLowerCase()");
            stringBuilder.append(string);
            String stringBuilder2 = stringBuilder.toString();
            com.iqoption.deposit.b.k kVar = this.cyZ;
            String str = "binding";
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView = kVar.cBc.cDD;
            kotlin.jvm.internal.i.e(textView, "binding.cryptoToolbar.depositTitle");
            textView.setText(stringBuilder2);
            kVar = this.cyZ;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            ImageView imageView = kVar.cBc.cCu;
            kotlin.jvm.internal.i.e(imageView, "binding.cryptoToolbar.toolbarBack");
            imageView.setOnClickListener(new b(this));
            kVar = this.cyZ;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            imageView = kVar.cBz;
            kotlin.jvm.internal.i.e(imageView, "binding.cryptoQuestion");
            imageView.setOnClickListener(new c(this));
            kVar = this.cyZ;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = kVar.cBG;
            kotlin.jvm.internal.i.e(textView, "binding.cryptoTimeLeftTitle");
            textView.setText(getString(com.iqoption.deposit.o.g.time_left_to_send_n1, com.iqoption.deposit.k.cxn.aoN()));
            kVar = this.cyZ;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            kVar.cBl.setOnTouchListener(new com.iqoption.core.ui.widget.h.a(0.75f, 0.0f, 2, null));
            kVar = this.cyZ;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            CardView cardView = kVar.cBl;
            kotlin.jvm.internal.i.e(cardView, "binding.cryptoCopy");
            cardView.setOnClickListener(new d(this, stringBuilder2));
            kotlin.jvm.internal.i.e(getString(com.iqoption.deposit.o.g.app_name), "getString(R.string.app_name)");
            kVar = this.cyZ;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = kVar.cBm;
            kotlin.jvm.internal.i.e(textView, "binding.cryptoCopyDescription");
            textView.setText(getString(com.iqoption.deposit.o.g.copy_address_of_n1_wallet_n2, stringBuilder2, com.iqoption.deposit.k.cxn.aoN()));
            b bVar = this.cza;
            string = "viewModel";
            if (bVar == null) {
                kotlin.jvm.internal.i.lG(string);
            }
            LifecycleOwner lifecycleOwner = this;
            bVar.aqD().observe(lifecycleOwner, new f(this));
            aqx();
            bVar = this.cza;
            if (bVar == null) {
                kotlin.jvm.internal.i.lG(string);
            }
            bVar.i(ZF(), this.czc).observe(lifecycleOwner, new g(this));
            bVar = this.cza;
            if (bVar == null) {
                kotlin.jvm.internal.i.lG(string);
            }
            bVar.aqE().observe(lifecycleOwner, new h(this));
            bVar = this.cza;
            if (bVar == null) {
                kotlin.jvm.internal.i.lG(string);
            }
            bVar.aqF().observe(lifecycleOwner, new i(this));
            if (bundle == null) {
                f(false, false);
            }
            com.iqoption.deposit.b.k kVar2 = this.cyZ;
            if (kVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LinearLayout linearLayout = kVar2.cBp;
            kotlin.jvm.internal.i.e(linearLayout, "binding.cryptoDetailsButton");
            linearLayout.setOnClickListener(new e(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public void onDestroyView() {
        com.iqoption.core.analytics.c cVar = this.czd;
        if (cVar != null) {
            cVar.Cc();
        }
        super.onDestroyView();
        Bj();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        close(true);
        return true;
    }

    private final void close(boolean z) {
        if (!z || !aqz()) {
            Fragment fragment = this;
            com.iqoption.deposit.navigator.b.cGp.P(fragment).q(com.iqoption.deposit.crypto.refund.a.cAp.Bx(), true);
            com.iqoption.deposit.navigator.b.cGp.T(fragment);
        }
    }

    @SuppressLint({"SetTextI18n"})
    private final void a(com.iqoption.core.microservices.billing.response.crypto.c cVar, String str) {
        com.iqoption.deposit.b.k kVar = this.cyZ;
        String str2 = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        TextView textView = kVar.cBF;
        kotlin.jvm.internal.i.e(textView, "binding.cryptoSendValue");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cVar.ZM());
        stringBuilder.append(' ');
        stringBuilder.append(cVar.ZQ());
        textView.setText(stringBuilder.toString());
        kVar = this.cyZ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textView = kVar.cBw;
        kotlin.jvm.internal.i.e(textView, "binding.cryptoGetValue");
        textView.setText(com.iqoption.core.util.e.a(cVar.ZN(), 0, str, false, false, false, false, null, null, 249, null));
        String aaa = cVar.aaa();
        CharSequence charSequence = aaa;
        String str3 = "binding.cryptoQRCodeImage";
        String str4 = "binding.cryptoCopy";
        CardView cardView;
        ImageView imageView;
        if ((u.Y(charSequence) ^ 1) != 0) {
            com.iqoption.deposit.b.k kVar2 = this.cyZ;
            if (kVar2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            TextView textView2 = kVar2.cBk;
            kotlin.jvm.internal.i.e(textView2, "binding.cryptoAddress");
            textView2.setText(charSequence);
            b bVar = this.cza;
            if (bVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            bVar.M(aaa, com.iqoption.core.ext.a.q(this).getResources().getDimensionPixelSize(com.iqoption.deposit.o.c.dp148));
            kVar = this.cyZ;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            cardView = kVar.cBl;
            kotlin.jvm.internal.i.e(cardView, str4);
            com.iqoption.core.ext.a.ak(cardView);
            kVar = this.cyZ;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            imageView = kVar.cBx;
            kotlin.jvm.internal.i.e(imageView, str3);
            com.iqoption.core.ext.a.ak(imageView);
        } else {
            kVar = this.cyZ;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            cardView = kVar.cBl;
            kotlin.jvm.internal.i.e(cardView, str4);
            com.iqoption.core.ext.a.al(cardView);
            kVar = this.cyZ;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            imageView = kVar.cBx;
            kotlin.jvm.internal.i.e(imageView, str3);
            com.iqoption.core.ext.a.al(imageView);
        }
        kVar = this.cyZ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textView = kVar.cBs;
        kotlin.jvm.internal.i.e(textView, "binding.cryptoDetailsRefundAddress");
        textView.setText(cVar.aae());
        kVar = this.cyZ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        textView = kVar.cBr;
        kotlin.jvm.internal.i.e(textView, "binding.cryptoDetailsFee");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(cVar.aac());
        stringBuilder2.append(' ');
        stringBuilder2.append(cVar.ZQ());
        stringBuilder2.append(" +");
        textView.setText(stringBuilder2.toString());
    }

    private final void f(boolean z, boolean z2) {
        com.iqoption.deposit.b.k kVar = this.cyZ;
        String str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = kVar.cBn;
        kotlin.jvm.internal.i.e(imageView, "binding.cryptoDetailsArrow");
        float f = z ? 0.0f : 180.0f;
        if (z2) {
            ViewPropertyAnimator rotation = imageView.animate().rotation(f);
            kotlin.jvm.internal.i.e(rotation, "arrow.animate().rotation(targetRotation)");
            rotation.setDuration(250);
        } else {
            imageView.setRotation(f);
        }
        com.iqoption.deposit.b.k kVar2 = this.cyZ;
        if (kVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = kVar2.cBq;
        kotlin.jvm.internal.i.e(linearLayout, "binding.cryptoDetailsContainer");
        if (z) {
            com.iqoption.core.ext.a.ak(linearLayout);
        } else {
            com.iqoption.core.ext.a.al(linearLayout);
        }
    }

    private final void aqx() {
        com.iqoption.deposit.b.k kVar = this.cyZ;
        String str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = kVar.cBC;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.cryptoRequisitesProgress");
        contentLoadingProgressBar.setVisibility(0);
        kVar = this.cyZ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ScrollView scrollView = kVar.cBB;
        kotlin.jvm.internal.i.e(scrollView, "binding.cryptoRequisitesContent");
        com.iqoption.core.ext.a.al(scrollView);
    }

    private final void aqy() {
        com.iqoption.deposit.b.k kVar = this.cyZ;
        String str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = kVar.cBC;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.cryptoRequisitesProgress");
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        kVar = this.cyZ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ScrollView scrollView = kVar.cBB;
        kotlin.jvm.internal.i.e(scrollView, "binding.cryptoRequisitesContent");
        com.iqoption.core.ext.a.ak(scrollView);
    }

    private final boolean aqz() {
        PopupWindow popupWindow = this.aiN;
        if (popupWindow == null) {
            return false;
        }
        popupWindow.dismiss();
        this.aiN = (PopupWindow) null;
        return true;
    }

    private final void aqA() {
        com.iqoption.deposit.b.k kVar = this.cyZ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ImageView imageView = kVar.cBz;
        kotlin.jvm.internal.i.e(imageView, "binding.cryptoQuestion");
        PopupWindow aqB = aqB();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        Window window = com.iqoption.core.ext.a.r(this).getWindow();
        kotlin.jvm.internal.i.e(window, "act.window");
        aqB.showAtLocation(window.getDecorView(), 0, iArr[0], iArr[1] - com.iqoption.core.ext.a.q(this).getResources().getDimensionPixelOffset(com.iqoption.deposit.o.c.dp16));
    }

    private final PopupWindow aqB() {
        com.iqoption.deposit.b.k kVar = this.cyZ;
        String str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = kVar.cBz;
        kotlin.jvm.internal.i.e(imageView, "binding.cryptoQuestion");
        ViewParent parent = imageView.getParent();
        if (parent != null) {
            at atVar = (at) com.iqoption.core.ext.a.a(com.iqoption.core.ext.a.q(this), com.iqoption.deposit.o.f.layout_crypto_rate_popup, (ViewGroup) parent, false, 4, null);
            StringBuilder stringBuilder = new StringBuilder();
            com.iqoption.core.microservices.billing.response.crypto.c cVar = this.czb;
            if (cVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            stringBuilder.append(cVar.aad());
            stringBuilder.append(' ');
            stringBuilder.append(getString(com.iqoption.deposit.o.g.minutes));
            String stringBuilder2 = stringBuilder.toString();
            kotlin.jvm.internal.i.e(getString(com.iqoption.deposit.o.g.bitcoin), "getString(R.string.bitcoin)");
            TextView textView = atVar.cDl;
            kotlin.jvm.internal.i.e(textView, "popupBinding.cryptoRatePopupText");
            textView.setText(getString(com.iqoption.deposit.o.g.this_exchange_rate_will_be_fixed_n1_n2, stringBuilder2, r3));
            View root = atVar.getRoot();
            kotlin.jvm.internal.i.e(root, "popupBinding.root");
            com.iqoption.deposit.b.k kVar2 = this.cyZ;
            if (kVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            View root2 = kVar2.getRoot();
            kotlin.jvm.internal.i.e(root2, "binding.root");
            root.measure(MeasureSpec.makeMeasureSpec(root2.getMeasuredWidth(), 0), 0);
            PopupWindow popupWindow = new PopupWindow(com.iqoption.core.ext.a.q(this));
            popupWindow.setContentView(atVar.getRoot());
            popupWindow.setOutsideTouchable(true);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow.setWidth(root.getMeasuredWidth());
            popupWindow.setHeight(root.getMeasuredHeight());
            this.aiN = popupWindow;
            return popupWindow;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public boolean PU() {
        return this.bIN;
    }

    public void PX() {
        Resources resources = com.iqoption.core.ext.a.q(this).getResources();
        kotlin.jvm.internal.i.e(resources, "ctx.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        com.iqoption.deposit.b.k kVar = this.cyZ;
        String str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = kVar.getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{((float) displayMetrics.widthPixels) / ((float) 2), 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        kVar = this.cyZ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kVar.getRoot(), View.ALPHA, new float[]{0.0f, 1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alpha");
        ofFloat.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }

    public void PY() {
        Resources resources = com.iqoption.core.ext.a.q(this).getResources();
        kotlin.jvm.internal.i.e(resources, "ctx.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        com.iqoption.deposit.b.k kVar = this.cyZ;
        String str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = kVar.getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f, ((float) displayMetrics.widthPixels) / ((float) 2)});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "translation");
        ofPropertyValuesHolder.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        kVar = this.cyZ;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kVar.getRoot(), View.ALPHA, new float[]{1.0f, 0.0f});
        kotlin.jvm.internal.i.e(ofFloat, "alpha");
        ofFloat.setInterpolator(com.iqoption.core.graphics.animation.j.XJ());
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, PV());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        animatorSet.start();
    }
}
