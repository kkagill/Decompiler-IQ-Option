package com.iqoption.fragment.rightpanel;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.ext.g;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.ui.animation.transitions.e;
import com.iqoption.e.io;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 62\u00020\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0014J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000fH\u0002J\u0010\u00102\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u00103\u001a\u00020/H\u0002J\b\u00104\u001a\u00020/H\u0002J\u0017\u00105\u001a\u00020/2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010#R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00188F@BX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R(\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f8F@FX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00067"}, bng = {"Lcom/iqoption/fragment/rightpanel/PhaseNotificationFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/databinding/FragmentActivePhaseNotificationBinding;", "blinkAnimator", "Landroid/animation/ValueAnimator;", "value", "", "details", "getDetails", "()Ljava/lang/String;", "setDetails", "(Ljava/lang/String;)V", "endBlinkColor", "", "", "isBlinking", "()Z", "setBlinking", "(Z)V", "message", "getMessage", "setMessage", "Lcom/iqoption/fragment/rightpanel/PhaseNotificationParams;", "params", "getParams", "()Lcom/iqoption/fragment/rightpanel/PhaseNotificationParams;", "setParams", "(Lcom/iqoption/fragment/rightpanel/PhaseNotificationParams;)V", "startBlinkColor", "yPivot", "getYPivot", "()Ljava/lang/Integer;", "setYPivot", "(Ljava/lang/Integer;)V", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "setTopMargin", "topMargin", "startBlinking", "stopBlinking", "updateDetailsVisibility", "updateYPivot", "Companion", "app_optionXRelease"})
/* compiled from: PhaseNotificationFragment.kt */
public final class k extends com.iqoption.core.ui.fragment.d {
    public static final String TAG;
    public static final a doq = new a();
    private HashMap apm;
    private ValueAnimator dol;
    private int don;
    private int doo;
    private io dop;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/fragment/rightpanel/PhaseNotificationFragment$Companion;", "", "()V", "ARG_PARAMS", "", "TAG", "newInstance", "Lcom/iqoption/fragment/rightpanel/PhaseNotificationFragment;", "params", "Lcom/iqoption/fragment/rightpanel/PhaseNotificationParams;", "app_optionXRelease"})
    /* compiled from: PhaseNotificationFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final k b(l lVar) {
            kotlin.jvm.internal.i.f(lVar, "params");
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_PARAMS", lVar);
            kVar.setArguments(bundle);
            return kVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/iqoption/fragment/rightpanel/PhaseNotificationFragment$startBlinking$1$1$1", "com/iqoption/fragment/rightpanel/PhaseNotificationFragment$$special$$inlined$apply$lambda$1"})
    /* compiled from: PhaseNotificationFragment.kt */
    static final class c implements AnimatorUpdateListener {
        final /* synthetic */ k dos;
        final /* synthetic */ io dou;

        c(k kVar, io ioVar) {
            this.dos = kVar;
            this.dou = ioVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView = this.dou.bfF;
            kotlin.jvm.internal.i.e(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                textView.setTextColor(((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnPreDraw$2", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d implements OnPreDrawListener {
        final /* synthetic */ View aTo;
        final /* synthetic */ k dos;
        final /* synthetic */ int dov;
        final /* synthetic */ Integer dox;

        public d(View view, k kVar, int i, Integer num) {
            this.aTo = view;
            this.dos = kVar;
            this.dov = i;
            this.dox = num;
        }

        public boolean onPreDraw() {
            this.aTo.getViewTreeObserver().removeOnPreDrawListener(this);
            View root = k.a(this.dos).getRoot();
            kotlin.jvm.internal.i.e(root, "binding.root");
            int height = root.getHeight();
            ConstraintLayout constraintLayout = k.a(this.dos).aRA;
            kotlin.jvm.internal.i.e(constraintLayout, "binding.contentLayout");
            int height2 = constraintLayout.getHeight();
            int i = height2 / 2;
            if (kotlin.jvm.internal.i.compare(this.dov + i, this.dox.intValue()) > 0) {
                height = this.dov;
            } else if (this.dox.intValue() + i > height) {
                height -= height2;
            } else {
                height = this.dox.intValue() - i;
            }
            this.dos.gg(height);
            return false;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ k dos;

        public b(k kVar) {
            this.dos = kVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            k.a(this.dos).cfx.toggle();
            this.dos.aHu();
        }
    }

    public static final k b(l lVar) {
        return doq.b(lVar);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final String getMessage() {
        return aHt().getMessage();
    }

    public final void setMessage(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.VALUE);
        if ((kotlin.jvm.internal.i.y(aHt().getMessage(), str) ^ 1) != 0) {
            a(l.a(aHt(), str, null, false, null, 14, null));
            View view = getView();
            if (view != null) {
                kotlin.jvm.internal.i.e(view, "contentView");
                TextView textView = ((io) com.iqoption.core.ext.a.findBinding(view)).bfF;
                kotlin.jvm.internal.i.e(textView, "contentView.findBinding<…icationBinding>().message");
                textView.setText(str);
            }
        }
    }

    public final boolean aHr() {
        return aHt().aHr();
    }

    public final void ed(boolean z) {
        if (aHt().aHr() != z) {
            a(l.a(aHt(), null, null, z, null, 11, null));
            View view = getView();
            if (view == null) {
                return;
            }
            if (z) {
                kotlin.jvm.internal.i.e(view, "contentView");
                a((io) com.iqoption.core.ext.a.findBinding(view));
                return;
            }
            amU();
        }
    }

    public final String aHs() {
        return aHt().aHs();
    }

    public final void ix(String str) {
        if ((kotlin.jvm.internal.i.y(aHt().aHs(), str) ^ 1) != 0) {
            a(l.a(aHt(), null, str, false, null, 13, null));
            View view = getView();
            if (view != null) {
                kotlin.jvm.internal.i.e(view, "contentView");
                TextView textView = ((io) com.iqoption.core.ext.a.findBinding(view)).cfw;
                kotlin.jvm.internal.i.e(textView, "contentView.findBinding<….phaseNotificationDetails");
                textView.setText(str);
            }
        }
    }

    public final l aHt() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this).getParcelable("ARG_PARAMS");
        if (parcelable != null) {
            return (l) parcelable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.rightpanel.PhaseNotificationParams");
    }

    private final void a(l lVar) {
        com.iqoption.core.ext.a.s(this).putParcelable("ARG_PARAMS", lVar);
    }

    private final void a(io ioVar) {
        ValueAnimator valueAnimator = this.dol;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            valueAnimator = this.dol;
            if (valueAnimator == null) {
                valueAnimator = new ValueAnimator();
                if (this.don == 0) {
                    this.don = com.iqoption.core.ext.a.a((Fragment) this, (int) R.color.grey_blue_70);
                }
                if (this.doo == 0) {
                    this.doo = com.iqoption.core.ext.a.a((Fragment) this, (int) R.color.white);
                }
                valueAnimator.addUpdateListener(new c(this, ioVar));
                valueAnimator.setIntValues(new int[]{this.don, this.doo});
                valueAnimator.setEvaluator(com.iqoption.core.graphics.animation.a.bhF.XC());
                valueAnimator.setRepeatCount(-1);
                valueAnimator.setRepeatMode(2);
                com.iqoption.core.ext.a.a((Animator) valueAnimator, 500);
                valueAnimator.setInterpolator(j.XJ());
                valueAnimator.start();
                this.dol = valueAnimator;
            } else {
                valueAnimator.start();
            }
        }
    }

    private final void amU() {
        ValueAnimator valueAnimator = this.dol;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    public android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
        r6 = this;
        r9 = "inflater";
        kotlin.jvm.internal.i.f(r7, r9);
        r1 = 2131558700; // 0x7f0d012c float:1.8742723E38 double:1.053129926E-314;
        r3 = 0;
        r4 = 4;
        r5 = 0;
        r0 = r6;
        r2 = r8;
        r7 = com.iqoption.core.ext.a.a(r0, r1, r2, r3, r4, r5);
        r7 = (com.iqoption.e.io) r7;
        r6.dop = r7;
        r7 = r6.dop;
        r8 = "binding";
        if (r7 != 0) goto L_0x001e;
    L_0x001b:
        kotlin.jvm.internal.i.lG(r8);
    L_0x001e:
        r7 = r7.bfF;
        r9 = "binding.message";
        kotlin.jvm.internal.i.e(r7, r9);
        r9 = r6.getMessage();
        r9 = (java.lang.CharSequence) r9;
        r7.setText(r9);
        r7 = r6.aHr();
        if (r7 == 0) goto L_0x003f;
    L_0x0034:
        r7 = r6.dop;
        if (r7 != 0) goto L_0x003b;
    L_0x0038:
        kotlin.jvm.internal.i.lG(r8);
    L_0x003b:
        r6.a(r7);
        goto L_0x0042;
    L_0x003f:
        r6.amU();
    L_0x0042:
        r7 = r6.aHs();
        r9 = "binding.phaseNotificationDetails";
        r0 = "binding.phaseNotificationIcon";
        if (r7 == 0) goto L_0x009e;
    L_0x004c:
        r7 = (java.lang.CharSequence) r7;
        r7 = r7.length();
        r1 = 1;
        if (r7 <= 0) goto L_0x0057;
    L_0x0055:
        r7 = 1;
        goto L_0x0058;
    L_0x0057:
        r7 = 0;
    L_0x0058:
        if (r7 != r1) goto L_0x009e;
    L_0x005a:
        r6.aHu();
        r7 = r6.dop;
        if (r7 != 0) goto L_0x0064;
    L_0x0061:
        kotlin.jvm.internal.i.lG(r8);
    L_0x0064:
        r7 = r7.cfw;
        kotlin.jvm.internal.i.e(r7, r9);
        r9 = r6.aHs();
        r9 = (java.lang.CharSequence) r9;
        r7.setText(r9);
        r7 = r6.dop;
        if (r7 != 0) goto L_0x0079;
    L_0x0076:
        kotlin.jvm.internal.i.lG(r8);
    L_0x0079:
        r7 = r7.cfx;
        kotlin.jvm.internal.i.e(r7, r0);
        r7 = (android.view.View) r7;
        com.iqoption.core.ext.a.ak(r7);
        r7 = r6.dop;
        if (r7 != 0) goto L_0x008a;
    L_0x0087:
        kotlin.jvm.internal.i.lG(r8);
    L_0x008a:
        r7 = r7.aRA;
        r9 = "binding.contentLayout";
        kotlin.jvm.internal.i.e(r7, r9);
        r7 = (android.view.View) r7;
        r9 = new com.iqoption.fragment.rightpanel.k$b;
        r9.<init>(r6);
        r9 = (android.view.View.OnClickListener) r9;
        r7.setOnClickListener(r9);
        goto L_0x00c0;
    L_0x009e:
        r7 = r6.dop;
        if (r7 != 0) goto L_0x00a5;
    L_0x00a2:
        kotlin.jvm.internal.i.lG(r8);
    L_0x00a5:
        r7 = r7.cfx;
        kotlin.jvm.internal.i.e(r7, r0);
        r7 = (android.view.View) r7;
        com.iqoption.core.ext.a.al(r7);
        r7 = r6.dop;
        if (r7 != 0) goto L_0x00b6;
    L_0x00b3:
        kotlin.jvm.internal.i.lG(r8);
    L_0x00b6:
        r7 = r7.cfw;
        kotlin.jvm.internal.i.e(r7, r9);
        r7 = (android.view.View) r7;
        com.iqoption.core.ext.a.al(r7);
    L_0x00c0:
        r7 = r6.aHt();
        r7 = r7.aHv();
        r6.n(r7);
        r7 = r6.dop;
        if (r7 != 0) goto L_0x00d2;
    L_0x00cf:
        kotlin.jvm.internal.i.lG(r8);
    L_0x00d2:
        r7 = r7.getRoot();
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.rightpanel.k.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    private final void aHu() {
        AutoTransition autoTransition = new AutoTransition();
        int i = 0;
        autoTransition.setOrdering(0);
        autoTransition.setDuration(250);
        io ioVar = this.dop;
        String str = "binding";
        if (ioVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TransitionManager.beginDelayedTransition(ioVar.aRA, autoTransition);
        io ioVar2 = this.dop;
        if (ioVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = ioVar2.cfw;
        kotlin.jvm.internal.i.e(textView, "binding.phaseNotificationDetails");
        ioVar = this.dop;
        if (ioVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ToggleButton toggleButton = ioVar.cfx;
        kotlin.jvm.internal.i.e(toggleButton, "binding.phaseNotificationIcon");
        if (!toggleButton.isChecked()) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    private final void n(Integer num) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp58);
        if (num != null) {
            io ioVar = this.dop;
            if (ioVar == null) {
                kotlin.jvm.internal.i.lG("binding");
            }
            ConstraintLayout constraintLayout = ioVar.aRA;
            String str = "binding.contentLayout";
            kotlin.jvm.internal.i.e(constraintLayout, str);
            View view = constraintLayout;
            ConstraintLayout constraintLayout2 = a(this).aRA;
            kotlin.jvm.internal.i.e(constraintLayout2, str);
            if (constraintLayout2.isLaidOut()) {
                view = a(this).getRoot();
                kotlin.jvm.internal.i.e(view, "binding.root");
                int height = view.getHeight();
                constraintLayout2 = a(this).aRA;
                kotlin.jvm.internal.i.e(constraintLayout2, str);
                int height2 = constraintLayout2.getHeight();
                int i = height2 / 2;
                if (kotlin.jvm.internal.i.compare(dimensionPixelOffset + i, num.intValue()) <= 0) {
                    if (num.intValue() + i > height) {
                        dimensionPixelOffset = height - height2;
                    } else {
                        dimensionPixelOffset = num.intValue() - i;
                    }
                }
                gg(dimensionPixelOffset);
                return;
            }
            view.getViewTreeObserver().addOnPreDrawListener(new d(view, this, dimensionPixelOffset, num));
            return;
        }
        gg(dimensionPixelOffset);
    }

    private final void gg(int i) {
        io ioVar = this.dop;
        String str = "binding";
        if (ioVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ConstraintLayout constraintLayout = ioVar.aRA;
        String str2 = "binding.contentLayout";
        kotlin.jvm.internal.i.e(constraintLayout, str2);
        LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            io ioVar2 = this.dop;
            if (ioVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            ConstraintLayout constraintLayout2 = ioVar2.aRA;
            kotlin.jvm.internal.i.e(constraintLayout2, str2);
            constraintLayout2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public void onDestroyView() {
        amU();
        super.onDestroyView();
        Bj();
    }

    /* Access modifiers changed, original: protected */
    public e Bv() {
        return new com.iqoption.core.ui.animation.transitions.c(this, PhaseNotificationFragment$onCreateTransitionProvider$1.dor);
    }

    static {
        String name = k.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }
}
