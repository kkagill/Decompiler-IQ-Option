package com.iqoption.withdraw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.ui.animation.transitions.e;
import com.iqoption.withdraw.a.ag;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0019"}, bng = {"Lcom/iqoption/withdraw/WithdrawLimitReasonDialog;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/withdraw/databinding/WithdrawLimitReasonDialogBinding;", "listener", "Lcom/iqoption/withdraw/WithdrawLimitReasonDialog$OnCloseListener;", "getListener", "()Lcom/iqoption/withdraw/WithdrawLimitReasonDialog$OnCloseListener;", "setListener", "(Lcom/iqoption/withdraw/WithdrawLimitReasonDialog$OnCloseListener;)V", "close", "", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "OnCloseListener", "withdraw_release"})
/* compiled from: WithdrawLimitReasonDialog.kt */
public final class g extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a epj = new a();
    private HashMap apm;
    private ag eph;
    private b epi;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, bng = {"Lcom/iqoption/withdraw/WithdrawLimitReasonDialog$Companion;", "", "()V", "ARG_MESSAGE", "", "ARG_TITLE", "TAG", "getTAG", "()Ljava/lang/String;", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "title", "", "message", "withdraw_release"})
    /* compiled from: WithdrawLimitReasonDialog.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return g.TAG;
        }

        public final com.iqoption.core.ui.d.c a(CharSequence charSequence, CharSequence charSequence2) {
            CharSequence charSequence3 = charSequence2;
            kotlin.jvm.internal.i.f(charSequence3, "message");
            Bundle bundle = new Bundle();
            bundle.putCharSequence("ARG_TITLE", charSequence);
            bundle.putCharSequence("ARG_MESSAGE", charSequence3);
            return new com.iqoption.core.ui.d.c(Bx(), g.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, bng = {"Lcom/iqoption/withdraw/WithdrawLimitReasonDialog$OnCloseListener;", "", "onDialogClose", "", "withdraw_release"})
    /* compiled from: WithdrawLimitReasonDialog.kt */
    public interface b {
        void LI();
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/withdraw/WithdrawLimitReasonDialog$onCreateView$1$1"})
    /* compiled from: WithdrawLimitReasonDialog.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ CharSequence cLg;
        final /* synthetic */ CharSequence cLh;
        final /* synthetic */ g epk;

        c(g gVar, CharSequence charSequence, CharSequence charSequence2) {
            this.epk = gVar;
            this.cLg = charSequence;
            this.cLh = charSequence2;
        }

        public final void onClick(View view) {
            this.epk.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/withdraw/WithdrawLimitReasonDialog$onCreateView$1$2"})
    /* compiled from: WithdrawLimitReasonDialog.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ CharSequence cLg;
        final /* synthetic */ CharSequence cLh;
        final /* synthetic */ g epk;

        d(g gVar, CharSequence charSequence, CharSequence charSequence2) {
            this.epk = gVar;
            this.cLg = charSequence;
            this.cLh = charSequence2;
        }

        public final void onClick(View view) {
            this.epk.close();
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
        String name = g.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public final void a(b bVar) {
        this.epi = bVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        bundle = getArguments();
        CharSequence charSequence = null;
        CharSequence charSequence2 = bundle != null ? bundle.getCharSequence("ARG_TITLE") : null;
        Bundle arguments = getArguments();
        if (arguments != null) {
            charSequence = arguments.getCharSequence("ARG_MESSAGE");
        }
        ag ag = ag.ag(layoutInflater, viewGroup, false);
        kotlin.jvm.internal.i.e(ag, "this");
        this.eph = ag;
        ag.aHP.setOnClickListener(new c(this, charSequence2, charSequence));
        String str = PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE;
        TextView textView;
        if (charSequence2 != null) {
            TextView textView2 = ag.alH;
            kotlin.jvm.internal.i.e(textView2, str);
            textView2.setVisibility(0);
            textView = ag.alH;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(charSequence2);
        } else {
            textView = ag.alH;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setVisibility(8);
        }
        TextView textView3 = ag.ani;
        kotlin.jvm.internal.i.e(textView3, "text");
        textView3.setText(charSequence);
        ag.aQM.setOnClickListener(new d(this, charSequence2, charSequence));
        ag = this.eph;
        if (ag == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return ag.getRoot();
    }

    public final void close() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        b bVar = this.epi;
        if (bVar != null) {
            bVar.LI();
        }
    }

    /* Access modifiers changed, original: protected */
    public e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.d(this);
    }
}
