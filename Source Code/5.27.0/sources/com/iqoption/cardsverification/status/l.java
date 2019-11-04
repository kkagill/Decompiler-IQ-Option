package com.iqoption.cardsverification.status;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.cardsverification.g;
import com.iqoption.cardsverification.g.e;
import com.iqoption.cardsverification.g.f;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.d;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0011"}, bng = {"Lcom/iqoption/cardsverification/status/VerifyStatusFragment;", "Lcom/iqoption/cardsverification/status/BaseVerifyStatusFragment;", "()V", "getFooterView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initButton", "", "onButtonClick", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "cardsverification_release"})
/* compiled from: VerifyStatusFragment.kt */
public final class l extends a {
    private static final String TAG;
    public static final a aCE = new a();
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/cardsverification/status/VerifyStatusFragment$Companion;", "", "()V", "TAG", "", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "cardsverification_release"})
    /* compiled from: VerifyStatusFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c Lj() {
            return new com.iqoption.core.ui.d.c(l.TAG, l.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: VerifyStatusFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ l aCF;

        b(l lVar) {
            this.aCF = lVar;
        }

        public final void onClick(View view) {
            this.aCF.LT();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "refreshedCard", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "onChanged"})
    /* compiled from: VerifyStatusFragment.kt */
    static final class c<T> implements Observer<com.iqoption.core.microservices.billing.verification.response.c> {
        final /* synthetic */ l aCF;

        c(l lVar) {
            this.aCF = lVar;
        }

        /* renamed from: i */
        public final void onChanged(com.iqoption.core.microservices.billing.verification.response.c cVar) {
            if (cVar != null) {
                TextView textView = this.aCF.Lr().aAM;
                kotlin.jvm.internal.i.e(textView, "binding.verifyStatusDescription");
                m.a(textView, cVar, cVar.Lq());
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
        String name = l.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        kotlin.jvm.internal.i.f(viewGroup, "container");
        View inflate = layoutInflater.inflate(e.verify_status_footer_layout, viewGroup, false);
        if (inflate == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        LS();
        TextView textView = Lr().aAM;
        kotlin.jvm.internal.i.e(textView, "binding.verifyStatusDescription");
        m.a(textView, La(), Lq());
        if (com.iqoption.core.ext.a.s(this).getBoolean("ARG_REFRESH_DESCRIPTION", false)) {
            n.aCH.e(com.iqoption.core.ext.a.r(this)).au(La().getId()).observe(this, new c(this));
        }
    }

    private final void LS() {
        Integer valueOf;
        CardStatus Lq = Lq();
        if (Lq == CardStatus.DECLINED) {
            valueOf = Integer.valueOf(f.try_again);
        } else if (Lq == CardStatus.VERIFIED || d.abc().contains(Lq)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(f.start);
        }
        View root = Lr().getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        Button button = (Button) root.findViewById(g.d.verifyDetailsButton);
        String str = "button";
        if (valueOf != null) {
            button.setText(valueOf.intValue());
            button.setOnClickListener(new b(this));
            kotlin.jvm.internal.i.e(button, str);
            com.iqoption.core.ext.a.ak(button);
            return;
        }
        kotlin.jvm.internal.i.e(button, str);
        com.iqoption.core.ext.a.al(button);
    }

    private final void LT() {
        CardStatus Lq = Lq();
        if (Lq == CardStatus.VERIFIED || d.abc().contains(Lq)) {
            a(com.iqoption.core.ext.a.u(this));
        } else {
            a(CardStatus.NEW, false);
        }
    }
}
