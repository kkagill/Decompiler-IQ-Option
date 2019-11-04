package com.iqoption.cardsverification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.cardsverification.g.d;
import com.iqoption.cardsverification.g.e;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.c;
import com.iqoption.core.ui.d.g;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010\u0015\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/cardsverification/CardsNavigatorFragment;", "Lcom/iqoption/core/ui/navigation/BaseStackNavigatorFragment;", "()V", "binding", "Lcom/iqoption/cardsverification/databinding/FragmentCardsNavigatorBinding;", "closeCardVerification", "", "getContainerId", "", "getInitialEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showCard", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "refreshDescription", "", "showCardList", "Companion", "cardsverification_release"})
/* compiled from: CardsNavigatorFragment.kt */
public abstract class b extends com.iqoption.core.ui.d.b {
    private static final String TAG;
    public static final a aAo = new a();
    private com.iqoption.cardsverification.a.a aAn;
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J&\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u0016J\u0016\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001d"}, bng = {"Lcom/iqoption/cardsverification/CardsNavigatorFragment$Companion;", "", "()V", "ARG_CARD", "", "ARG_REFRESH_DESCRIPTION", "TAG", "getTAG", "()Ljava/lang/String;", "closeCardVerification", "Lcom/iqoption/cardsverification/CardsNavigatorFragment;", "child", "Landroidx/fragment/app/Fragment;", "navigator", "Lcom/iqoption/core/ui/navigation/StackNavigator;", "openPerformVerificationScreen", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "openScreenForStatus", "status", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "clearBackStack", "", "openStatusScreen", "prepareArguments", "Landroid/os/Bundle;", "particularCard", "refreshDescription", "showDetails", "cardsverification_release"})
    /* compiled from: CardsNavigatorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final Bundle a(c cVar, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_CARD", cVar);
            bundle.putBoolean("ARG_REFRESH_DESCRIPTION", z);
            return bundle;
        }

        public final b a(Fragment fragment, c cVar) {
            kotlin.jvm.internal.i.f(fragment, "child");
            kotlin.jvm.internal.i.f(cVar, "card");
            b bVar = (b) com.iqoption.core.ext.a.a(fragment, b.class);
            bVar.alE().b(com.iqoption.cardsverification.details.a.aBj.b(cVar), false);
            return bVar;
        }

        public final b b(Fragment fragment, c cVar) {
            kotlin.jvm.internal.i.f(fragment, "child");
            kotlin.jvm.internal.i.f(cVar, "card");
            b bVar = (b) com.iqoption.core.ext.a.a(fragment, b.class);
            bVar.alE().b(com.iqoption.cardsverification.status.a.a.a(com.iqoption.cardsverification.status.a.aBW, cVar, CardStatus.NEW, false, false, 8, null), false);
            return bVar;
        }

        public final b c(Fragment fragment, c cVar) {
            kotlin.jvm.internal.i.f(fragment, "child");
            kotlin.jvm.internal.i.f(cVar, "card");
            b bVar = (b) com.iqoption.core.ext.a.a(fragment, b.class);
            bVar.alE().b(com.iqoption.cardsverification.status.a.aBW.b(cVar, false), false);
            return bVar;
        }

        public final b a(Fragment fragment, c cVar, CardStatus cardStatus, boolean z) {
            kotlin.jvm.internal.i.f(fragment, "child");
            kotlin.jvm.internal.i.f(cVar, "card");
            kotlin.jvm.internal.i.f(cardStatus, NotificationCompat.CATEGORY_STATUS);
            b bVar = (b) com.iqoption.core.ext.a.a(fragment, b.class);
            bVar.alE().b(com.iqoption.cardsverification.status.a.a.a(com.iqoption.cardsverification.status.a.aBW, cVar, cardStatus, z, false, 8, null), false);
            return bVar;
        }

        public final b b(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            b bVar = (b) com.iqoption.core.ext.a.a(fragment, b.class);
            bVar.KY();
            return bVar;
        }

        public final g c(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            return ((b) com.iqoption.core.ext.a.a(fragment, b.class)).alE();
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public com.iqoption.core.ui.d.c KX() {
        return null;
    }

    public abstract void KY();

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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.aAn = (com.iqoption.cardsverification.a.a) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_cards_navigator, viewGroup, false, 4, null);
        com.iqoption.cardsverification.a.a aVar = this.aAn;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        c cVar = (c) com.iqoption.core.ext.a.s(this).getParcelable("ARG_CARD");
        if (cVar != null) {
            a(bundle, cVar, com.iqoption.core.ext.a.s(this).getBoolean("ARG_REFRESH_DESCRIPTION", false));
        } else {
            G(bundle);
        }
    }

    private final void a(Bundle bundle, c cVar, boolean z) {
        if (bundle == null) {
            alE().b(com.iqoption.cardsverification.status.a.aBW.b(cVar, z), true);
        }
    }

    private final void G(Bundle bundle) {
        if (bundle == null) {
            alE().b(com.iqoption.cardsverification.list.e.aBy.Lj(), true);
        }
    }

    public int KW() {
        return d.cardsNavigatorContainer;
    }
}
