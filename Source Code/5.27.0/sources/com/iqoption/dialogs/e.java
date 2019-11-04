package com.iqoption.dialogs;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.iqoption.core.ui.widget.StarBar;
import com.iqoption.dialogs.b.o;
import com.iqoption.dialogs.d.f;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0002J\b\u0010\u001b\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, bng = {"Lcom/iqoption/dialogs/RateUsDialog;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/dialogs/databinding/DialogRateUsBinding;", "onOpenSupportChat", "Lkotlin/Function1;", "", "", "transition", "Landroidx/transition/AutoTransition;", "getTransition", "()Landroidx/transition/AutoTransition;", "transition$delegate", "Lkotlin/Lazy;", "close", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "openPlayMarket", "scheduleTransition", "Companion", "dialogs_release"})
/* compiled from: RateUsDialog.kt */
public final class e extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(e.class), "transition", "getTransition()Landroidx/transition/AutoTransition;"))};
    public static final a cLk = new a();
    private final kotlin.d aNm = g.c(RateUsDialog$transition$2.cLn);
    private HashMap apm;
    private kotlin.jvm.a.b<? super Integer, l> cLi;
    private o cLj;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/dialogs/RateUsDialog$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/dialogs/RateUsDialog;", "onOpenSupportChat", "Lkotlin/Function1;", "", "", "dialogs_release"})
    /* compiled from: RateUsDialog.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/dialogs/RateUsDialog$onCreateView$1$1"})
    /* compiled from: RateUsDialog.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ e cLl;

        b(e eVar) {
            this.cLl = eVar;
        }

        public final void onClick(View view) {
            this.cLl.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/dialogs/RateUsDialog$onCreateView$1$3"})
    /* compiled from: RateUsDialog.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ e cLl;
        final /* synthetic */ o cLm;

        d(o oVar, e eVar) {
            this.cLm = oVar;
            this.cLl = eVar;
        }

        public final void onClick(View view) {
            this.cLl.close();
            StarBar starBar = this.cLm.aRL;
            kotlin.jvm.internal.i.e(starBar, "starBar");
            int stars = starBar.getStars();
            if (stars < 4) {
                kotlin.jvm.a.b b = this.cLl.cLi;
                if (b != null) {
                    l lVar = (l) b.invoke(Integer.valueOf(stars));
                    return;
                }
                return;
            }
            this.cLl.auB();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "it", "", "onStarsChanged", "com/iqoption/dialogs/RateUsDialog$onCreateView$1$2"})
    /* compiled from: RateUsDialog.kt */
    static final class c implements com.iqoption.core.ui.widget.StarBar.b {
        final /* synthetic */ e cLl;
        final /* synthetic */ o cLm;

        c(o oVar, e eVar) {
            this.cLm = oVar;
            this.cLl = eVar;
        }

        public final void ev(int i) {
            this.cLl.auA();
            String str = "btnAction";
            if (i == 0) {
                TextView textView = this.cLm.cMu;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.al(textView);
                return;
            }
            TextView textView2 = this.cLm.cMu;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.ext.a.ak(textView2);
            textView2 = this.cLm.cMu;
            kotlin.jvm.internal.i.e(textView2, str);
            e eVar = this.cLl;
            if (i < 4) {
                i = f.rate_us_dialog_send_feedback;
            } else {
                i = f.rate_us_dialog_leave_review;
            }
            textView2.setText(eVar.getString(i));
        }
    }

    private final AutoTransition auz() {
        kotlin.d dVar = this.aNm;
        j jVar = anY[0];
        return (AutoTransition) dVar.getValue();
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
        String simpleName = e.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "RateUsDialog::class.java.simpleName");
        TAG = simpleName;
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.a(this, com.iqoption.dialogs.d.d.frame);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        if (this.cLi == null) {
            return null;
        }
        o oVar = (o) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.dialogs.d.e.dialog_rate_us, viewGroup, false, 4, null);
        this.cLj = oVar;
        oVar.aHP.setOnClickListener(new b(this));
        oVar.aRL.setOnStarsChangedListener(new c(oVar, this));
        oVar.cMu.setOnClickListener(new d(oVar, this));
        return oVar.getRoot();
    }

    private final void auA() {
        o oVar = this.cLj;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TransitionManager.beginDelayedTransition(oVar.cMv, auz());
    }

    private final void auB() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(com.iqoption.core.d.Un().Dw()));
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            com.iqoption.core.d.a(f.error, 0, 2, null);
        }
    }

    public final void close() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null && !fragmentManager.isStateSaved() && !fragmentManager.isDestroyed()) {
            fragmentManager.popBackStack();
        }
    }
}
