package com.iqoption.chat.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.lifecycle.LifecycleObserver;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.chat.e.h;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;
import com.iqoption.core.util.AnalyticsLifecycleObserver;
import com.iqoption.core.util.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/chat/fragment/CantSendReasonDialog;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/chat/databinding/ChatDialogCantSendReasonBinding;", "createTransition", "Landroidx/transition/Transition;", "isEnter", "", "onClose", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "chat_release"})
/* compiled from: CantSendReasonDialog.kt */
public final class d extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = d.class.getSimpleName();
    public static final a aSz = new a();
    private com.iqoption.chat.a.e aSy;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, bng = {"Lcom/iqoption/chat/fragment/CantSendReasonDialog$Companion;", "", "()V", "ARG_MESSAGE", "", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "get", "Lcom/iqoption/chat/fragment/CantSendReasonDialog;", "message", "", "chat_release"})
    /* compiled from: CantSendReasonDialog.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return d.TAG;
        }

        public final d w(CharSequence charSequence) {
            kotlin.jvm.internal.i.f(charSequence, "message");
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("arg.message", charSequence);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/CantSendReasonDialog$onCreateView$1$1"})
    /* compiled from: CantSendReasonDialog.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ d aSA;
        final /* synthetic */ CharSequence aSE;

        d(d dVar, CharSequence charSequence) {
            this.aSA = dVar;
            this.aSE = charSequence;
        }

        public final void onClick(View view) {
            this.aSA.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/CantSendReasonDialog$onCreateView$1$2"})
    /* compiled from: CantSendReasonDialog.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ d aSA;
        final /* synthetic */ CharSequence aSE;

        e(d dVar, CharSequence charSequence) {
            this.aSA = dVar;
            this.aSE = charSequence;
        }

        public final void onClick(View view) {
            this.aSA.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/chat/fragment/CantSendReasonDialog$onCreateTransitionProvider$1", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "getEnterTransition", "Landroidx/transition/Transition;", "getExitTransition", "getReenterTransition", "getReturnTransition", "chat_release"})
    /* compiled from: CantSendReasonDialog.kt */
    public static final class c implements com.iqoption.core.ui.animation.transitions.e {
        final /* synthetic */ d aSA;

        c(d dVar) {
            this.aSA = dVar;
        }

        public Transition RY() {
            return this.aSA.cf(true);
        }

        public Transition RZ() {
            return this.aSA.cf(true);
        }

        public Transition Sa() {
            return this.aSA.cf(false);
        }

        public Transition Sb() {
            return this.aSA.cf(false);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/chat/fragment/CantSendReasonDialog$createTransition$1", "Lcom/iqoption/core/ui/animation/transitions/AnimatorTransition;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "isTransitionRequired", "", "chat_release"})
    /* compiled from: CantSendReasonDialog.kt */
    public static final class b extends com.iqoption.core.ui.animation.transitions.a {
        final /* synthetic */ d aSA;
        final /* synthetic */ boolean aSB;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\b"}, bng = {"com/iqoption/chat/fragment/CantSendReasonDialog$createTransition$1$createAnimator$1$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "chat_release", "com/iqoption/chat/fragment/CantSendReasonDialog$createTransition$1$$special$$inlined$apply$lambda$1", "com/iqoption/chat/fragment/CantSendReasonDialog$createTransition$1$$special$$inlined$animators$lambda$1"})
        /* compiled from: CantSendReasonDialog.kt */
        public static final class a extends AnimatorListenerAdapter {
            final /* synthetic */ ViewGroup aNJ;
            final /* synthetic */ AnimatorSet aSC;
            final /* synthetic */ b aSD;

            a(AnimatorSet animatorSet, b bVar, ViewGroup viewGroup) {
                this.aSC = animatorSet;
                this.aSD = bVar;
                this.aNJ = viewGroup;
            }

            public void onAnimationEnd(Animator animator) {
                this.aNJ.getOverlay().remove(d.a(this.aSD.aSA).getRoot());
            }
        }

        public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
            return true;
        }

        b(d dVar, boolean z) {
            this.aSA = dVar;
            this.aSB = z;
            super(null, 1, null);
            addTarget(dVar.alx());
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            AnimatorSet animatorSet = new AnimatorSet();
            List arrayList = new ArrayList();
            String str = "binding.frame";
            String str2 = "binding.root";
            if (this.aSB) {
                com.iqoption.chat.e.a aVar = com.iqoption.chat.e.a.aWr;
                View root = d.a(this.aSA).getRoot();
                kotlin.jvm.internal.i.e(root, str2);
                MaxSizeCardViewLayout maxSizeCardViewLayout = d.a(this.aSA).aQN;
                kotlin.jvm.internal.i.e(maxSizeCardViewLayout, str);
                arrayList.add(com.iqoption.chat.e.a.a(aVar, root, maxSizeCardViewLayout, 0, 4, null));
            } else {
                viewGroup.getOverlay().add(d.a(this.aSA).getRoot());
                com.iqoption.chat.e.a aVar2 = com.iqoption.chat.e.a.aWr;
                View root2 = d.a(this.aSA).getRoot();
                kotlin.jvm.internal.i.e(root2, str2);
                MaxSizeCardViewLayout maxSizeCardViewLayout2 = d.a(this.aSA).aQN;
                kotlin.jvm.internal.i.e(maxSizeCardViewLayout2, str);
                arrayList.add(com.iqoption.chat.e.a.b(aVar2, root2, maxSizeCardViewLayout2, 0, 4, null));
                animatorSet.addListener(new a(animatorSet, this, viewGroup));
            }
            animatorSet.playTogether(arrayList);
            Animator animator = animatorSet;
            com.iqoption.core.ext.a.a(animator, 250);
            animatorSet.setInterpolator(new FastOutSlowInInterpolator());
            return animator;
        }
    }

    public static final /* synthetic */ com.iqoption.chat.a.e a(d dVar) {
        com.iqoption.chat.a.e eVar = dVar.aSy;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return eVar;
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return new c(this);
    }

    private final Transition cf(boolean z) {
        return new b(this, z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        CharSequence charSequence = arguments != null ? arguments.getCharSequence("arg.message") : null;
        if (charSequence == null) {
            onClose();
            return null;
        }
        com.iqoption.chat.a.e eVar = (com.iqoption.chat.a.e) com.iqoption.core.ext.a.a((Fragment) this, h.chat_dialog_cant_send_reason, viewGroup, false, 4, null);
        v.j(getActivity());
        this.aSy = eVar;
        eVar.aHP.setOnClickListener(new d(this, charSequence));
        TextView textView = eVar.ani;
        kotlin.jvm.internal.i.e(textView, "text");
        textView.setText(charSequence);
        eVar.aQM.setOnClickListener(new e(this, charSequence));
        com.iqoption.chat.a.e eVar2 = this.aSy;
        if (eVar2 == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return eVar2.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.core.analytics.b dl = com.iqoption.core.d.EC().dl("chat_question-sign-popup");
        kotlin.jvm.internal.i.e(dl, "analytics.createPopupSer…hat_question-sign-popup\")");
        a((LifecycleObserver) new AnalyticsLifecycleObserver(dl, null, 2, null));
    }

    private final boolean onClose() {
        com.iqoption.chat.b.b.ST().k(this);
        return true;
    }
}
