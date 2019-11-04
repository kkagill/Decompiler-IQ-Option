package com.iqoption.chat.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.iqoption.chat.a.g;
import com.iqoption.chat.e.h;
import com.iqoption.chat.e.j;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.ui.widget.MaxSizeFrameLayout;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.l;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0012\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020$H\u0014J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@FX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006."}, bng = {"Lcom/iqoption/chat/fragment/FeedbackDialog;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/chat/databinding/ChatDialogFeedbackBinding;", "onCancel", "Lkotlin/Function0;", "", "getOnCancel", "()Lkotlin/jvm/functions/Function0;", "setOnCancel", "(Lkotlin/jvm/functions/Function0;)V", "onClose", "Landroid/view/View$OnClickListener;", "onSend", "Lkotlin/Function1;", "", "getOnSend", "()Lkotlin/jvm/functions/Function1;", "setOnSend", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "rating", "getRating", "()I", "setRating", "(I)V", "createTransition", "Landroidx/transition/Transition;", "isEnter", "", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "chat_release"})
/* compiled from: FeedbackDialog.kt */
public final class i extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = i.class.getSimpleName();
    public static final a aSV = new a();
    private kotlin.jvm.a.a<l> aSS;
    private final OnClickListener aST = new c(this);
    private g aSU;
    private kotlin.jvm.a.b<? super String, l> aSm;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, bng = {"Lcom/iqoption/chat/fragment/FeedbackDialog$Companion;", "", "()V", "ARG_RATING", "", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/chat/fragment/FeedbackDialog;", "rating", "", "onSend", "Lkotlin/Function1;", "", "onCancel", "Lkotlin/Function0;", "chat_release"})
    /* compiled from: FeedbackDialog.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return i.TAG;
        }

        public final i a(int i, kotlin.jvm.a.b<? super String, l> bVar, kotlin.jvm.a.a<l> aVar) {
            kotlin.jvm.internal.i.f(bVar, "onSend");
            kotlin.jvm.internal.i.f(aVar, "onCancel");
            i iVar = new i();
            iVar.setArguments(new Bundle());
            iVar.setRating(i);
            iVar.g(bVar);
            iVar.a((kotlin.jvm.a.a) aVar);
            return iVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: FeedbackDialog.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ i aSW;

        c(i iVar) {
            this.aSW = iVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.a Sj = this.aSW.Sj();
            if (Sj != null) {
                l lVar = (l) Sj.invoke();
            }
            v.j(this.aSW.getActivity());
            com.iqoption.chat.b.b.ST().k(this.aSW);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/FeedbackDialog$onCreateView$1$2"})
    /* compiled from: FeedbackDialog.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ i aSW;
        final /* synthetic */ g aSY;

        e(g gVar, i iVar) {
            this.aSY = gVar;
            this.aSW = iVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Si = this.aSW.Si();
            if (Si != null) {
                IQTextInputEditText iQTextInputEditText = this.aSY.aQQ;
                kotlin.jvm.internal.i.e(iQTextInputEditText, "commentInput");
                Editable text = iQTextInputEditText.getText();
                if (text == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(text, "commentInput.text!!");
                l lVar = (l) Si.invoke(v.trim(text).toString());
            }
            v.j(com.iqoption.core.ext.a.r(this.aSW));
            com.iqoption.chat.b.b.ST().k(this.aSW);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/chat/fragment/FeedbackDialog$onCreateTransitionProvider$1", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "getEnterTransition", "Landroidx/transition/Transition;", "getExitTransition", "getReenterTransition", "getReturnTransition", "chat_release"})
    /* compiled from: FeedbackDialog.kt */
    public static final class d implements com.iqoption.core.ui.animation.transitions.e {
        final /* synthetic */ i aSW;

        d(i iVar) {
            this.aSW = iVar;
        }

        public Transition RY() {
            return this.aSW.cf(true);
        }

        public Transition RZ() {
            return this.aSW.cf(true);
        }

        public Transition Sa() {
            return this.aSW.cf(false);
        }

        public Transition Sb() {
            return this.aSW.cf(false);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, bng = {"com/iqoption/chat/fragment/FeedbackDialog$onCreateView$1$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "onTextChanged", "", "s", "", "start", "", "before", "count", "chat_release"})
    /* compiled from: FeedbackDialog.kt */
    public static final class f extends ah {
        final /* synthetic */ g aSY;
        final /* synthetic */ int aSZ;

        f(g gVar, int i) {
            this.aSY = gVar;
            this.aSZ = i;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            kotlin.jvm.internal.i.f(charSequence, "s");
            TextView textView = this.aSY.aQS;
            kotlin.jvm.internal.i.e(textView, "counter");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(charSequence.length());
            stringBuilder.append('/');
            stringBuilder.append(this.aSZ);
            textView.setText(stringBuilder.toString());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/chat/fragment/FeedbackDialog$createTransition$1", "Lcom/iqoption/core/ui/animation/transitions/AnimatorTransition;", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "endValues", "isTransitionRequired", "", "chat_release"})
    /* compiled from: FeedbackDialog.kt */
    public static final class b extends com.iqoption.core.ui.animation.transitions.a {
        final /* synthetic */ boolean aSB;
        final /* synthetic */ i aSW;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\b"}, bng = {"com/iqoption/chat/fragment/FeedbackDialog$createTransition$1$createAnimator$1$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "chat_release", "com/iqoption/chat/fragment/FeedbackDialog$createTransition$1$$special$$inlined$apply$lambda$1", "com/iqoption/chat/fragment/FeedbackDialog$createTransition$1$$special$$inlined$animators$lambda$1"})
        /* compiled from: FeedbackDialog.kt */
        public static final class a extends AnimatorListenerAdapter {
            final /* synthetic */ ViewGroup aNJ;
            final /* synthetic */ AnimatorSet aSC;
            final /* synthetic */ b aSX;

            a(AnimatorSet animatorSet, b bVar, ViewGroup viewGroup) {
                this.aSC = animatorSet;
                this.aSX = bVar;
                this.aNJ = viewGroup;
            }

            public void onAnimationEnd(Animator animator) {
                this.aNJ.getOverlay().remove(i.a(this.aSX.aSW).getRoot());
            }
        }

        public boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
            return true;
        }

        b(i iVar, boolean z) {
            this.aSW = iVar;
            this.aSB = z;
            super(null, 1, null);
            addTarget(iVar.alx());
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            kotlin.jvm.internal.i.f(viewGroup, "sceneRoot");
            AnimatorSet animatorSet = new AnimatorSet();
            List arrayList = new ArrayList();
            String str = "binding.frame";
            String str2 = "binding.root";
            if (this.aSB) {
                com.iqoption.chat.e.a aVar = com.iqoption.chat.e.a.aWr;
                View root = i.a(this.aSW).getRoot();
                kotlin.jvm.internal.i.e(root, str2);
                MaxSizeFrameLayout maxSizeFrameLayout = i.a(this.aSW).aQT;
                kotlin.jvm.internal.i.e(maxSizeFrameLayout, str);
                arrayList.add(com.iqoption.chat.e.a.a(aVar, root, maxSizeFrameLayout, 0, 4, null));
            } else {
                viewGroup.getOverlay().add(i.a(this.aSW).getRoot());
                com.iqoption.chat.e.a aVar2 = com.iqoption.chat.e.a.aWr;
                View root2 = i.a(this.aSW).getRoot();
                kotlin.jvm.internal.i.e(root2, str2);
                MaxSizeFrameLayout maxSizeFrameLayout2 = i.a(this.aSW).aQT;
                kotlin.jvm.internal.i.e(maxSizeFrameLayout2, str);
                arrayList.add(com.iqoption.chat.e.a.b(aVar2, root2, maxSizeFrameLayout2, 0, 4, null));
                animatorSet.addListener(new a(animatorSet, this, viewGroup));
            }
            animatorSet.playTogether(arrayList);
            Animator animator = animatorSet;
            com.iqoption.core.ext.a.a(animator, 250);
            animatorSet.setInterpolator(new FastOutSlowInInterpolator());
            return animator;
        }
    }

    public final kotlin.jvm.a.b<String, l> Si() {
        return this.aSm;
    }

    public final void g(kotlin.jvm.a.b<? super String, l> bVar) {
        this.aSm = bVar;
    }

    public final kotlin.jvm.a.a<l> Sj() {
        return this.aSS;
    }

    public final void a(kotlin.jvm.a.a<l> aVar) {
        this.aSS = aVar;
    }

    public final int getRating() {
        return com.iqoption.core.ext.a.s(this).getInt("arg.rating");
    }

    public final void setRating(int i) {
        com.iqoption.core.ext.a.s(this).putInt("arg.rating", i);
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return new d(this);
    }

    private final Transition cf(boolean z) {
        return new b(this, z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        if (this.aSm == null || this.aSS == null) {
            com.iqoption.chat.b.b.ST().k(this);
            return null;
        }
        int i;
        g gVar = (g) com.iqoption.core.ext.a.a((Fragment) this, h.chat_dialog_feedback, viewGroup, false, 4, null);
        v.j(getActivity());
        this.aSU = gVar;
        TextView textView = gVar.aQU;
        kotlin.jvm.internal.i.e(textView, "note");
        if (getRating() > 3) {
            i = j.good_but_not_good_enough;
        } else {
            i = j.we_are_sorry_to_see_you_unhappy;
        }
        textView.setText(getString(i));
        IQTextInputEditText iQTextInputEditText = gVar.aQQ;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "commentInput");
        iQTextInputEditText.setFilters((InputFilter[]) new LengthFilter[]{new LengthFilter(240)});
        gVar.aQQ.addTextChangedListener(new f(gVar, 240));
        gVar.aHP.setOnClickListener(this.aST);
        gVar.aQO.setOnClickListener(this.aST);
        gVar.aQP.setOnClickListener(new e(gVar, this));
        return gVar.getRoot();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        this.aST.onClick(null);
        return true;
    }
}
