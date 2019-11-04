package com.iqoption.fragment.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;
import com.iqoption.e.nd;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0014J\b\u0010\u001b\u001a\u00020\fH\u0014J\b\u0010\u001c\u001a\u00020\fH\u0016J\u001a\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006$"}, bng = {"Lcom/iqoption/fragment/dialog/ScrollableDialogFragment;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "()V", "animationController", "Lcom/iqoption/ui/DialogAnimationController;", "binding", "Lcom/iqoption/databinding/FragmentScrollableDialogBinding;", "getBinding", "()Lcom/iqoption/databinding/FragmentScrollableDialogBinding;", "setBinding", "(Lcom/iqoption/databinding/FragmentScrollableDialogBinding;)V", "close", "", "getAnimationDuration", "", "getListener", "Lcom/iqoption/fragment/dialog/ScrollableDialogFragment$OnDialogListener;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onHideAnimation", "onNegativeClicked", "onPositiveClicked", "onShowAnimation", "setTextOrGone", "textView", "Landroid/widget/TextView;", "text", "", "Companion", "OnDialogListener", "app_optionXRelease"})
/* compiled from: ScrollableDialogFragment.kt */
public class k extends com.iqoption.fragment.b.b {
    private static final String TAG;
    public static final a deC = new a();
    private HashMap apm;
    protected nd deA;
    private com.iqoption.p.a deB;

    @i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017JG\u0010\u0018\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010\u001aJa\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010 R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, bng = {"Lcom/iqoption/fragment/dialog/ScrollableDialogFragment$Companion;", "", "()V", "ARG_MAX_WIDTH", "", "ARG_MESSAGE", "ARG_NEGATIVE", "ARG_POSITIVE", "ARG_SUBTITLE", "ARG_TITLE", "TAG", "getTAG", "()Ljava/lang/String;", "getArguments", "Landroid/os/Bundle;", "title", "", "subtitle", "message", "negative", "positive", "maxWidth", "", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;)Landroid/os/Bundle;", "newInstance", "Lcom/iqoption/fragment/dialog/ScrollableDialogFragment;", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;)Lcom/iqoption/fragment/dialog/ScrollableDialogFragment;", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "container", "(Landroidx/fragment/app/FragmentManager;ILjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;)V", "app_optionXRelease"})
    /* compiled from: ScrollableDialogFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return k.TAG;
        }

        public final void a(FragmentManager fragmentManager, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, Integer num) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            kotlin.jvm.internal.i.f(charSequence3, "message");
            fragmentManager.beginTransaction().add(i, k.deC.a(charSequence, charSequence2, charSequence3, charSequence4, charSequence5, num), k.deC.Bx()).addToBackStack(k.deC.Bx()).commit();
        }

        private final k a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, Integer num) {
            k kVar = new k();
            kVar.setArguments(k.deC.b(charSequence, charSequence2, charSequence3, charSequence4, charSequence5, num));
            return kVar;
        }

        public final Bundle b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, Integer num) {
            kotlin.jvm.internal.i.f(charSequence3, "message");
            Bundle bundle = new Bundle();
            bundle.putCharSequence("ARG_TITLE", charSequence);
            bundle.putCharSequence("ARG_SUBTITLE", charSequence2);
            bundle.putCharSequence("ARG_MESSAGE", charSequence3);
            bundle.putCharSequence("ARG_NEGATIVE", charSequence4);
            bundle.putCharSequence("ARG_POSITIVE", charSequence5);
            if (num != null) {
                bundle.putInt("ARG_MAX_WIDTH", num.intValue());
            }
            return bundle;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, bng = {"Lcom/iqoption/fragment/dialog/ScrollableDialogFragment$OnDialogListener;", "", "onConfirm", "", "onDialogClose", "app_optionXRelease"})
    /* compiled from: ScrollableDialogFragment.kt */
    public interface b {
        void LI();

        void LJ();
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/fragment/dialog/ScrollableDialogFragment$onCreateView$1$1"})
    /* compiled from: ScrollableDialogFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ CharSequence cLg;
        final /* synthetic */ CharSequence cLh;
        final /* synthetic */ k deD;
        final /* synthetic */ CharSequence deE;

        c(k kVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.deD = kVar;
            this.cLg = charSequence;
            this.deE = charSequence2;
            this.cLh = charSequence3;
        }

        public final void onClick(View view) {
            b a = this.deD.aCc();
            if (a != null) {
                a.LI();
            }
            this.deD.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/fragment/dialog/ScrollableDialogFragment$onCreateView$1$2"})
    /* compiled from: ScrollableDialogFragment.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ CharSequence cLg;
        final /* synthetic */ CharSequence cLh;
        final /* synthetic */ k deD;
        final /* synthetic */ CharSequence deE;

        d(k kVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.deD = kVar;
            this.cLg = charSequence;
            this.deE = charSequence2;
            this.cLh = charSequence3;
        }

        public final void onClick(View view) {
            this.deD.aCd();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/fragment/dialog/ScrollableDialogFragment$onCreateView$1$3"})
    /* compiled from: ScrollableDialogFragment.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ CharSequence cLg;
        final /* synthetic */ CharSequence cLh;
        final /* synthetic */ k deD;
        final /* synthetic */ CharSequence deE;

        e(k kVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.deD = kVar;
            this.cLg = charSequence;
            this.deE = charSequence2;
            this.cLh = charSequence3;
        }

        public final void onClick(View view) {
            this.deD.aCe();
        }
    }

    public static final void a(FragmentManager fragmentManager, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, Integer num) {
        deC.a(fragmentManager, i, charSequence, charSequence2, charSequence3, charSequence4, charSequence5, num);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public long getAnimationDuration() {
        return 250;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = k.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    /* Access modifiers changed, original: protected|final */
    public final nd aCb() {
        nd ndVar = this.deA;
        if (ndVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return ndVar;
    }

    public void att() {
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, getAnimationDuration());
        Animator[] animatorArr = new Animator[2];
        nd ndVar = this.deA;
        String str = "binding";
        if (ndVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        animatorArr[0] = ObjectAnimator.ofFloat(ndVar.getRoot(), View.ALPHA, new float[]{0.0f, 1.0f});
        ndVar = this.deA;
        if (ndVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        animatorArr[1] = ObjectAnimator.ofFloat(ndVar.aQN, View.TRANSLATION_Y, new float[]{gd(R.dimen.dp24), 0.0f});
        animatorSet.playTogether(animatorArr);
        animatorSet.setInterpolator(com.iqoption.view.a.a.c.egR);
        animatorSet.start();
    }

    public void atu() {
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.ext.a.a((Animator) animatorSet, getAnimationDuration());
        Animator[] animatorArr = new Animator[2];
        nd ndVar = this.deA;
        String str = "binding";
        if (ndVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        animatorArr[0] = ObjectAnimator.ofFloat(ndVar.getRoot(), View.ALPHA, new float[]{1.0f, 0.0f});
        ndVar = this.deA;
        if (ndVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        animatorArr[1] = ObjectAnimator.ofFloat(ndVar.aQN, View.TRANSLATION_Y, new float[]{0.0f, gd(R.dimen.dp24)});
        animatorSet.playTogether(animatorArr);
        animatorSet.setInterpolator(com.iqoption.view.a.a.c.egR);
        animatorSet.start();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        CharSequence charSequence = null;
        CharSequence charSequence2 = arguments != null ? arguments.getCharSequence("ARG_TITLE") : null;
        Bundle arguments2 = getArguments();
        CharSequence charSequence3 = arguments2 != null ? arguments2.getCharSequence("ARG_SUBTITLE") : null;
        Bundle arguments3 = getArguments();
        CharSequence charSequence4 = arguments3 != null ? arguments3.getCharSequence("ARG_MESSAGE") : null;
        nd ndVar = (nd) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_scrollable_dialog, viewGroup, false, 4, null);
        com.iqoption.fragment.b.b bVar = this;
        View root = ndVar.getRoot();
        kotlin.jvm.internal.i.e(root, "root");
        MaxSizeCardViewLayout maxSizeCardViewLayout = ndVar.aQN;
        kotlin.jvm.internal.i.e(maxSizeCardViewLayout, "frame");
        this.deB = new com.iqoption.p.a(bVar, root, maxSizeCardViewLayout);
        ndVar.aHP.setOnClickListener(new c(this, charSequence2, charSequence3, charSequence4));
        TextView textView = ndVar.alH;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        b(textView, charSequence2);
        textView = ndVar.ciE;
        kotlin.jvm.internal.i.e(textView, "subTitle");
        b(textView, charSequence3);
        textView = ndVar.ani;
        kotlin.jvm.internal.i.e(textView, "text");
        textView.setText(charSequence4);
        textView = ndVar.ciC;
        kotlin.jvm.internal.i.e(textView, "negativeButton");
        Bundle arguments4 = getArguments();
        b(textView, arguments4 != null ? arguments4.getCharSequence("ARG_NEGATIVE") : null);
        ndVar.ciC.setOnClickListener(new d(this, charSequence2, charSequence3, charSequence4));
        textView = ndVar.ciD;
        kotlin.jvm.internal.i.e(textView, "positiveButton");
        arguments4 = getArguments();
        if (arguments4 != null) {
            charSequence = arguments4.getCharSequence("ARG_POSITIVE");
        }
        b(textView, charSequence);
        ndVar.ciD.setOnClickListener(new e(this, charSequence2, charSequence3, charSequence4));
        this.deA = ndVar;
        arguments = getArguments();
        int i = arguments != null ? arguments.getInt("ARG_MAX_WIDTH") : 0;
        if (i <= 0) {
            i = com.iqoption.core.ext.a.q(this).getResources().getDimensionPixelSize(R.dimen.dp280);
        }
        ndVar = this.deA;
        String str = "binding";
        if (ndVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ndVar.aQN.setMaxWidthCardView(i);
        nd ndVar2 = this.deA;
        if (ndVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return ndVar2.getRoot();
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

    private final b aCc() {
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
    public void aCd() {
        b aCc = aCc();
        if (aCc != null) {
            aCc.LI();
        }
        close();
    }

    /* Access modifiers changed, original: protected */
    public void aCe() {
        b aCc = aCc();
        if (aCc != null) {
            aCc.LJ();
        }
        close();
    }
}
