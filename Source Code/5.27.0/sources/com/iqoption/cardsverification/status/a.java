package com.iqoption.cardsverification.status;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.cardsverification.a.g;
import com.iqoption.cardsverification.g.e;
import com.iqoption.cardsverification.g.f;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.ui.d.c;
import com.iqoption.core.ui.fragment.d;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\u0012\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020*H\u0014J&\u0010+\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0018\u00100\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u0010H\u0004J\b\u00102\u001a\u00020\"H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8DX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158DX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017¨\u00064"}, bng = {"Lcom/iqoption/cardsverification/status/BaseVerifyStatusFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/cardsverification/databinding/FragmentVerifyStatusBinding;", "getBinding", "()Lcom/iqoption/cardsverification/databinding/FragmentVerifyStatusBinding;", "setBinding", "(Lcom/iqoption/cardsverification/databinding/FragmentVerifyStatusBinding;)V", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "getCard", "()Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "card$delegate", "Lkotlin/Lazy;", "clearBackStackOnClose", "", "getClearBackStackOnClose", "()Z", "clearBackStackOnClose$delegate", "status", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "getStatus", "()Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "status$delegate", "getFooterView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getLastPanDigits", "", "initCardName", "", "initImage", "initStatus", "initToolbar", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openScreenForStatus", "clearBackStack", "prepareImageSize", "Companion", "cardsverification_release"})
/* compiled from: BaseVerifyStatusFragment.kt */
public abstract class a extends d {
    public static final String TAG;
    public static final a aBW = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "card", "getCard()Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;")), k.a(new PropertyReference1Impl(k.G(a.class), NotificationCompat.CATEGORY_STATUS, "getStatus()Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;")), k.a(new PropertyReference1Impl(k.G(a.class), "clearBackStackOnClose", "getClearBackStackOnClose()Z"))};
    protected g aBT;
    private final kotlin.d aBU = g.c(new BaseVerifyStatusFragment$status$2(this));
    private final kotlin.d aBV = g.c(new BaseVerifyStatusFragment$clearBackStackOnClose$2(this));
    private final kotlin.d aBi = g.c(new BaseVerifyStatusFragment$card$2(this));
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/cardsverification/status/BaseVerifyStatusFragment$Companion;", "", "()V", "ANIMATION_FOLDER_NAME", "", "ARG_CARD", "ARG_CLEAR_BACK_STACK_ON_CLOSE", "ARG_REFRESH_DESCRIPTION", "ARG_STATUS", "TAG", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "status", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "clearBackStackOnClose", "", "refreshDescription", "cardsverification_release"})
    /* compiled from: BaseVerifyStatusFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c b(com.iqoption.core.microservices.billing.verification.response.c cVar, boolean z) {
            kotlin.jvm.internal.i.f(cVar, "card");
            return a(cVar, cVar.Lq(), false, z);
        }

        public static /* synthetic */ c a(a aVar, com.iqoption.core.microservices.billing.verification.response.c cVar, CardStatus cardStatus, boolean z, boolean z2, int i, Object obj) {
            if ((i & 8) != 0) {
                z2 = false;
            }
            return aVar.a(cVar, cardStatus, z, z2);
        }

        public final c a(com.iqoption.core.microservices.billing.verification.response.c cVar, CardStatus cardStatus, boolean z, boolean z2) {
            com.iqoption.core.microservices.billing.verification.response.c cVar2 = cVar;
            CardStatus cardStatus2 = cardStatus;
            kotlin.jvm.internal.i.f(cVar2, "card");
            kotlin.jvm.internal.i.f(cardStatus2, NotificationCompat.CATEGORY_STATUS);
            c g = h.aCv.g(cardStatus2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_CARD", cVar2);
            bundle.putSerializable("ARG_STATUS", cardStatus2);
            bundle.putBoolean("ARG_CLEAR_BACK_STACK_ON_CLOSE", z);
            bundle.putBoolean("ARG_REFRESH_DESCRIPTION", z2);
            return c.a(g, null, null, bundle, 0, 0, 0, 0, null, null, null, null, 2043, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: BaseVerifyStatusFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    private final boolean Ls() {
        kotlin.d dVar = this.aBV;
        j jVar = anY[2];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final com.iqoption.core.microservices.billing.verification.response.c La() {
        kotlin.d dVar = this.aBi;
        j jVar = anY[0];
        return (com.iqoption.core.microservices.billing.verification.response.c) dVar.getValue();
    }

    /* Access modifiers changed, original: protected|final */
    public final CardStatus Lq() {
        kotlin.d dVar = this.aBU;
        j jVar = anY[1];
        return (CardStatus) dVar.getValue();
    }

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = a.class.getName();
        kotlin.jvm.internal.i.e(name, "BaseVerifyStatusFragment::class.java.name");
        TAG = name;
    }

    /* Access modifiers changed, original: protected|final */
    public final g Lr() {
        g gVar = this.aBT;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.aBT = (g) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_verify_status, viewGroup, false, 4, null);
        g gVar = this.aBT;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        g gVar = this.aBT;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ViewCompat.requestApplyInsets(gVar.getRoot());
        LayoutInflater from = LayoutInflater.from(getContext());
        kotlin.jvm.internal.i.e(from, "inflater");
        g gVar2 = this.aBT;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = gVar2.aAN;
        kotlin.jvm.internal.i.e(frameLayout, "binding.verifyStatusFooter");
        view = a(from, (ViewGroup) frameLayout);
        gVar2 = this.aBT;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar2.aAN.addView(view);
        Lb();
        Lt();
        Lv();
        Lw();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        Fragment fragment = this;
        fragmentManager = com.iqoption.cardsverification.b.aAo.c(fragment).alH();
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (!Ls()) {
            return false;
        }
        if (backStackEntryCount > 1) {
            for (int i = 0; i < backStackEntryCount; i++) {
                fragmentManager.popBackStack();
            }
            return false;
        }
        com.iqoption.cardsverification.b.aAo.b(fragment);
        return true;
    }

    private final void Lb() {
        int i;
        CardStatus Lq = Lq();
        if (Lq == CardStatus.VERIFIED) {
            i = f.verified_;
        } else if (Lq == CardStatus.DECLINED) {
            i = f.declined;
        } else if (com.iqoption.core.microservices.billing.verification.response.d.abc().contains(Lq)) {
            i = f.verification;
        } else {
            i = f.verification_;
        }
        g gVar = this.aBT;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        Toolbar toolbar = gVar.aAR.toolbar;
        kotlin.jvm.internal.i.e(toolbar, "binding.verifyStatusToolbar.toolbar");
        com.iqoption.cardsverification.j jVar = com.iqoption.cardsverification.j.aAu;
        FragmentActivity activity = getActivity();
        if (!(activity instanceof AppCompatActivity)) {
            activity = null;
        }
        jVar.a((AppCompatActivity) activity, toolbar, i);
        toolbar.setNavigationOnClickListener(new b(this));
    }

    private final void Lt() {
        Lu();
        g gVar = this.aBT;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LottieAnimationView lottieAnimationView = gVar.aAO;
        kotlin.jvm.internal.i.e(lottieAnimationView, "binding.verifyStatusImageView");
        if (Lq() == CardStatus.DECLINED) {
            lottieAnimationView.setImageDrawable(com.iqoption.core.ext.a.e((Fragment) this, com.iqoption.cardsverification.g.c.ic_declined));
            return;
        }
        CardStatus Lq = Lq();
        String str = Lq == CardStatus.VERIFIED ? "verified.json" : com.iqoption.core.microservices.billing.verification.response.d.abc().contains(Lq) ? "awaiting_verification.json" : "non_verified.json";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lottie/verification/");
        stringBuilder.append(str);
        lottieAnimationView.setAnimation(stringBuilder.toString());
        lottieAnimationView.Z();
    }

    private final void Lu() {
        int dimensionPixelSize;
        g gVar = this.aBT;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        LottieAnimationView lottieAnimationView = gVar.aAO;
        kotlin.jvm.internal.i.e(lottieAnimationView, "binding.verifyStatusImageView");
        LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        int i = b.aob[Lq().ordinal()];
        if (i == 1) {
            i = getResources().getDimensionPixelSize(com.iqoption.cardsverification.g.b.dp170);
            dimensionPixelSize = getResources().getDimensionPixelSize(com.iqoption.cardsverification.g.b.dp120);
        } else if (i != 2) {
            i = layoutParams.width;
            dimensionPixelSize = layoutParams.height;
        } else {
            i = getResources().getDimensionPixelSize(com.iqoption.cardsverification.g.b.dp119);
            dimensionPixelSize = getResources().getDimensionPixelSize(com.iqoption.cardsverification.g.b.dp119);
        }
        layoutParams.width = i;
        layoutParams.height = dimensionPixelSize;
        lottieAnimationView.setLayoutParams(layoutParams);
    }

    private final void Lv() {
        int i;
        CardStatus Lq = Lq();
        if (Lq == CardStatus.VERIFIED) {
            i = f.card_verified;
        } else if (Lq == CardStatus.DECLINED) {
            i = f.declined;
        } else if (com.iqoption.core.microservices.billing.verification.response.d.abc().contains(Lq)) {
            i = f.awaiting_verification;
        } else {
            i = f.verify_your_card;
        }
        g gVar = this.aBT;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        gVar.aAQ.setText(i);
    }

    /* JADX WARNING: Missing block: B:3:0x0012, code skipped:
            if (r0 != null) goto L_0x0017;
     */
    private final void Lw() {
        /*
        r3 = this;
        r0 = r3.La();
        r0 = r0.getNumber();
        r0 = com.iqoption.core.util.c.hm(r0);
        if (r0 == 0) goto L_0x0015;
    L_0x000e:
        r0 = r0.toString();
        if (r0 == 0) goto L_0x0015;
    L_0x0014:
        goto L_0x0017;
    L_0x0015:
        r0 = "";
    L_0x0017:
        r1 = "CardTypeUtils.fromCardNu…fe(pan)?.toString() ?: \"\"";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r3.Lx();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r0);
        r0 = " **";
        r2.append(r0);
        r2.append(r1);
        r0 = r2.toString();
        r1 = r3.aBT;
        if (r1 != 0) goto L_0x003d;
    L_0x0038:
        r2 = "binding";
        kotlin.jvm.internal.i.lG(r2);
    L_0x003d:
        r1 = r1.aAK;
        r2 = "binding.verifyStatusCard";
        kotlin.jvm.internal.i.e(r1, r2);
        r0 = (java.lang.CharSequence) r0;
        r1.setText(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.cardsverification.status.a.Lw():void");
    }

    private final String Lx() {
        String number = La().getNumber();
        int length = number.length() - 4;
        if (number != null) {
            number = number.substring(length);
            kotlin.jvm.internal.i.e(number, "(this as java.lang.String).substring(startIndex)");
            return number;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.e(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(CardStatus cardStatus, boolean z) {
        kotlin.jvm.internal.i.f(cardStatus, NotificationCompat.CATEGORY_STATUS);
        com.iqoption.cardsverification.b.aAo.a(this, La(), cardStatus, z);
    }
}
