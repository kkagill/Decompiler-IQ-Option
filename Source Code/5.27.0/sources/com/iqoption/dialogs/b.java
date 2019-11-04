package com.iqoption.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.dialogs.b.u;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0014J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/dialogs/DarkDialogFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/dialogs/databinding/FragmentDarkDialogBinding;", "close", "", "getListener", "Lcom/iqoption/dialogs/DarkDialogFragment$OnDialogListener;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setTextOrGone", "textView", "Landroid/widget/TextView;", "text", "", "Companion", "OnDialogListener", "dialogs_release"})
/* compiled from: DarkDialogFragment.kt */
public final class b extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a cLe = new a();
    private HashMap apm;
    private u cLd;

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002JB\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, bng = {"Lcom/iqoption/dialogs/DarkDialogFragment$Companion;", "", "()V", "ARG_CANCEL", "", "ARG_CONFIRM", "ARG_MESSAGE", "ARG_TITLE", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/dialogs/DarkDialogFragment;", "title", "", "message", "cancel", "confirm", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "container", "", "dialogs_release"})
    /* compiled from: DarkDialogFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final void a(FragmentManager fragmentManager, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            kotlin.jvm.internal.i.f(charSequence2, "message");
            fragmentManager.beginTransaction().add(i, b.cLe.a(charSequence, charSequence2, charSequence3, charSequence4), b.cLe.Bx()).addToBackStack(b.cLe.Bx()).commit();
        }

        private final b a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("ARG_TITLE", charSequence);
            bundle.putCharSequence("ARG_MESSAGE", charSequence2);
            bundle.putCharSequence("ARG_CANCEL", charSequence3);
            bundle.putCharSequence("ARG_CONFIRM", charSequence4);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, bng = {"Lcom/iqoption/dialogs/DarkDialogFragment$OnDialogListener;", "", "onConfirm", "", "onDialogClose", "dialogs_release"})
    /* compiled from: DarkDialogFragment.kt */
    public interface b {
        void LI();

        void LJ();
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/dialogs/DarkDialogFragment$onCreateView$1$1"})
    /* compiled from: DarkDialogFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ b cLf;
        final /* synthetic */ CharSequence cLg;
        final /* synthetic */ CharSequence cLh;

        c(b bVar, CharSequence charSequence, CharSequence charSequence2) {
            this.cLf = bVar;
            this.cLg = charSequence;
            this.cLh = charSequence2;
        }

        public final void onClick(View view) {
            b a = this.cLf.auy();
            if (a != null) {
                a.LI();
            }
            this.cLf.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/dialogs/DarkDialogFragment$onCreateView$1$2"})
    /* compiled from: DarkDialogFragment.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ b cLf;
        final /* synthetic */ CharSequence cLg;
        final /* synthetic */ CharSequence cLh;

        d(b bVar, CharSequence charSequence, CharSequence charSequence2) {
            this.cLf = bVar;
            this.cLg = charSequence;
            this.cLh = charSequence2;
        }

        public final void onClick(View view) {
            b a = this.cLf.auy();
            if (a != null) {
                a.LI();
            }
            this.cLf.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/dialogs/DarkDialogFragment$onCreateView$1$3"})
    /* compiled from: DarkDialogFragment.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ b cLf;
        final /* synthetic */ CharSequence cLg;
        final /* synthetic */ CharSequence cLh;

        e(b bVar, CharSequence charSequence, CharSequence charSequence2) {
            this.cLf = bVar;
            this.cLg = charSequence;
            this.cLh = charSequence2;
        }

        public final void onClick(View view) {
            b a = this.cLf.auy();
            if (a != null) {
                a.LJ();
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        bundle = getArguments();
        CharSequence charSequence = null;
        CharSequence charSequence2 = bundle != null ? bundle.getCharSequence("ARG_TITLE") : null;
        Bundle arguments = getArguments();
        CharSequence charSequence3 = arguments != null ? arguments.getCharSequence("ARG_MESSAGE") : null;
        u ae = u.ae(layoutInflater, viewGroup, false);
        kotlin.jvm.internal.i.e(ae, "this");
        this.cLd = ae;
        ae.aHP.setOnClickListener(new c(this, charSequence2, charSequence3));
        TextView textView = ae.alH;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        b(textView, charSequence2);
        textView = ae.ani;
        kotlin.jvm.internal.i.e(textView, "text");
        textView.setText(charSequence3);
        textView = ae.cMD;
        kotlin.jvm.internal.i.e(textView, "buttonCancel");
        Bundle arguments2 = getArguments();
        b(textView, arguments2 != null ? arguments2.getCharSequence("ARG_CANCEL") : null);
        ae.cMD.setOnClickListener(new d(this, charSequence2, charSequence3));
        textView = ae.cME;
        kotlin.jvm.internal.i.e(textView, "buttonConfirm");
        arguments2 = getArguments();
        if (arguments2 != null) {
            charSequence = arguments2.getCharSequence("ARG_CONFIRM");
        }
        b(textView, charSequence);
        ae.cME.setOnClickListener(new e(this, charSequence2, charSequence3));
        ae = this.cLd;
        if (ae == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return ae.getRoot();
    }

    private final void b(TextView textView, CharSequence charSequence) {
        if (charSequence != null) {
            com.iqoption.core.ext.a.ak(textView);
            textView.setText(charSequence);
            return;
        }
        com.iqoption.core.ext.a.al(textView);
    }

    private final void close() {
        com.iqoption.core.ext.a.t(this).popBackStack();
    }

    private final b auy() {
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof b)) {
            parentFragment = null;
        }
        b bVar = (b) parentFragment;
        if (bVar != null) {
            return bVar;
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof b)) {
            activity = null;
        }
        return (b) activity;
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.d(this);
    }
}
