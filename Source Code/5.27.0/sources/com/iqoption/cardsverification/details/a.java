package com.iqoption.cardsverification.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.cardsverification.a.e;
import com.iqoption.cardsverification.g;
import com.iqoption.cardsverification.g.f;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, bng = {"Lcom/iqoption/cardsverification/details/VerifyDetailsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/cardsverification/databinding/FragmentVerifyDetailsBinding;", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "getCard", "()Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "card$delegate", "Lkotlin/Lazy;", "initButton", "", "status", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "initStatus", "initStatusIcon", "initStatusText", "initToolbar", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "cardsverification_release"})
/* compiled from: VerifyDetailsFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a aBj = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "card", "getCard()Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;"))};
    private e aBh;
    private final kotlin.d aBi = g.c(new VerifyDetailsFragment$card$2(this));
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, bng = {"Lcom/iqoption/cardsverification/details/VerifyDetailsFragment$Companion;", "", "()V", "ARG_CARD", "", "TAG", "getTAG", "()Ljava/lang/String;", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "cardsverification_release"})
    /* compiled from: VerifyDetailsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final com.iqoption.core.ui.d.c b(com.iqoption.core.microservices.billing.verification.response.c cVar) {
            com.iqoption.core.microservices.billing.verification.response.c cVar2 = cVar;
            kotlin.jvm.internal.i.f(cVar2, "card");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_CARD", cVar2);
            return new com.iqoption.core.ui.d.c(Bx(), a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: VerifyDetailsFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            com.iqoption.cardsverification.b.a aVar = com.iqoption.cardsverification.b.aAo;
            a aVar2 = this.this$0;
            aVar.b(aVar2, aVar2.La());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: VerifyDetailsFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            com.iqoption.cardsverification.b.a aVar = com.iqoption.cardsverification.b.aAo;
            a aVar2 = this.this$0;
            aVar.c(aVar2, aVar2.La());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: VerifyDetailsFragment.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ a this$0;

        d(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            this.this$0.back();
        }
    }

    private final com.iqoption.core.microservices.billing.verification.response.c La() {
        kotlin.d dVar = this.aBi;
        j jVar = anY[0];
        return (com.iqoption.core.microservices.billing.verification.response.c) dVar.getValue();
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
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.aBh = (e) com.iqoption.core.ext.a.a((Fragment) this, g.e.fragment_verify_details, viewGroup, false, 4, null);
        e eVar = this.aBh;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return eVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        e eVar = this.aBh;
        String str = "binding";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ViewCompat.requestApplyInsets(eVar.getRoot());
        CardStatus Lq = La().Lq();
        Lb();
        a(Lq);
        e eVar2 = this.aBh;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = eVar2.aAE;
        kotlin.jvm.internal.i.e(textView, "binding.verifyCardNumber");
        textView.setText(La().getNumber());
        eVar2 = this.aBh;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView2 = eVar2.aAC;
        kotlin.jvm.internal.i.e(textView2, "binding.verifyCardExpiryDate");
        textView2.setText(La().aba());
        d(Lq);
    }

    /* JADX WARNING: Missing block: B:3:0x0012, code skipped:
            if (r0 != null) goto L_0x0017;
     */
    private final void Lb() {
        /*
        r5 = this;
        r0 = r5.La();
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
        r1 = "CardTypeUtils.fromCardNu…number)?.toString() ?: \"\"";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r5.aBh;
        if (r1 != 0) goto L_0x0025;
    L_0x0020:
        r2 = "binding";
        kotlin.jvm.internal.i.lG(r2);
    L_0x0025:
        r1 = r1.aAI;
        r1 = r1.toolbar;
        r2 = "binding.verifyToolbarLayout.toolbar";
        kotlin.jvm.internal.i.e(r1, r2);
        r2 = com.iqoption.cardsverification.j.aAu;
        r3 = r5.getActivity();
        r4 = r3 instanceof androidx.appcompat.app.AppCompatActivity;
        if (r4 != 0) goto L_0x0039;
    L_0x0038:
        r3 = 0;
    L_0x0039:
        r3 = (androidx.appcompat.app.AppCompatActivity) r3;
        r0 = (java.lang.CharSequence) r0;
        r2.a(r3, r1, r0);
        r0 = new com.iqoption.cardsverification.details.a$d;
        r0.<init>(r5);
        r0 = (android.view.View.OnClickListener) r0;
        r1.setNavigationOnClickListener(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.cardsverification.details.a.Lb():void");
    }

    private final void a(CardStatus cardStatus) {
        e eVar = this.aBh;
        String str = "binding";
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = eVar.aAD;
        String str2 = "binding.verifyCardInvite";
        kotlin.jvm.internal.i.e(textView, str2);
        com.iqoption.core.ext.a.al(textView);
        eVar = this.aBh;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View view = eVar.aAJ;
        if (view == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(view, "binding.verifyTopDivider!!");
        String str3 = "binding.verifyCardStatusContainer";
        e eVar2;
        LinearLayout linearLayout;
        if (cardStatus != CardStatus.VERIFIED) {
            com.iqoption.core.ext.a.ak(view);
            eVar = this.aBh;
            if (eVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LinearLayout linearLayout2 = eVar.aAF;
            kotlin.jvm.internal.i.e(linearLayout2, str3);
            com.iqoption.core.ext.a.ak(linearLayout2);
            b(cardStatus);
            c(cardStatus);
            if (cardStatus == CardStatus.DECLINED || com.iqoption.core.microservices.billing.verification.response.d.abc().contains(cardStatus)) {
                eVar2 = this.aBh;
                if (eVar2 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                TextView textView2 = eVar2.aAD;
                kotlin.jvm.internal.i.e(textView2, str2);
                com.iqoption.core.ext.a.ak(textView2);
                eVar2 = this.aBh;
                if (eVar2 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                eVar2.aAF.setOnClickListener(new c(this));
                eVar2 = this.aBh;
                if (eVar2 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                linearLayout = eVar2.aAF;
                kotlin.jvm.internal.i.e(linearLayout, str3);
                linearLayout.setEnabled(true);
                return;
            }
            eVar2 = this.aBh;
            if (eVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout = eVar2.aAF;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            linearLayout.setEnabled(false);
            return;
        }
        com.iqoption.core.ext.a.al(view);
        eVar2 = this.aBh;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout = eVar2.aAF;
        kotlin.jvm.internal.i.e(linearLayout, str3);
        com.iqoption.core.ext.a.al(linearLayout);
    }

    private final void b(CardStatus cardStatus) {
        e eVar = this.aBh;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ImageView imageView = eVar.aAG;
        kotlin.jvm.internal.i.e(imageView, "binding.verifyCardStatusIcon");
        Integer valueOf = cardStatus == CardStatus.DECLINED ? Integer.valueOf(com.iqoption.cardsverification.g.c.ic_attention_transparent) : com.iqoption.core.microservices.billing.verification.response.d.abc().contains(cardStatus) ? Integer.valueOf(com.iqoption.cardsverification.g.c.ic_progress) : null;
        if (valueOf != null) {
            com.iqoption.core.ext.a.ak(imageView);
            imageView.setImageDrawable(ContextCompat.getDrawable(com.iqoption.core.ext.a.q(this), valueOf.intValue()));
            return;
        }
        com.iqoption.core.ext.a.al(imageView);
    }

    private final void c(CardStatus cardStatus) {
        int i;
        int i2;
        e eVar = this.aBh;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = eVar.aAH;
        kotlin.jvm.internal.i.e(textView, "binding.verifyCardStatusText");
        if (cardStatus == CardStatus.DECLINED) {
            i = f.declined;
        } else if (com.iqoption.core.microservices.billing.verification.response.d.abc().contains(cardStatus)) {
            i = f.awaiting_verification;
        } else {
            i = f.card_non_verified;
        }
        if (com.iqoption.core.microservices.billing.verification.response.d.abc().contains(cardStatus)) {
            i2 = com.iqoption.cardsverification.g.a.slate_grey;
        } else {
            i2 = com.iqoption.cardsverification.g.a.red;
        }
        textView.setText(i);
        textView.setTextColor(ContextCompat.getColor(com.iqoption.core.ext.a.q(this), i2));
    }

    private final void d(CardStatus cardStatus) {
        e eVar = this.aBh;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        Button button = eVar.aAB;
        kotlin.jvm.internal.i.e(button, "binding.verifyCardButton");
        if (cardStatus == CardStatus.VERIFIED || com.iqoption.core.microservices.billing.verification.response.d.abc().contains(cardStatus)) {
            com.iqoption.core.ext.a.al(button);
            return;
        }
        button.setOnClickListener(new b(this));
        com.iqoption.core.ext.a.ak(button);
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.e(this);
    }
}
