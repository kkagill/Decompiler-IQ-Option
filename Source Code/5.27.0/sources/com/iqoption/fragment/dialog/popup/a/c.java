package com.iqoption.fragment.dialog.popup.a;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.transition.Fade;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.ui.widget.nps.NpsRatingBar;
import com.iqoption.dto.ToastEntity;
import com.iqoption.e.th;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.Ref.BooleanRef;

@i(bne = {1, 1, 15}, bnf = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\u001a\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010'\u001a\u00020\u000eJ \u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006."}, bng = {"Lcom/iqoption/fragment/dialog/popup/nps/NpsScoreFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/databinding/NpsScoreFragmentBinding;", "errorAnimator", "Landroid/animation/ObjectAnimator;", "isCloseAnimation", "", "popupObj", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "popupViewModel", "Lcom/iqoption/popup/PopupViewModel;", "hideError", "", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "nextAnim", "onCreateAnimator", "Landroid/animation/Animator;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onHideAnimation", "onShowAnimation", "onViewCreated", "view", "showError", "showFeedbackFragment", "fm", "popup", "score", "submit", "Companion", "app_optionXRelease"})
/* compiled from: NpsScoreFragment.kt */
public final class c extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = c.class.getSimpleName();
    public static final a deZ = new a();
    private com.iqoption.popup.c aju;
    private HashMap apm;
    private com.iqoption.core.microservices.popupserver.response.a deR;
    private boolean deU = true;
    private th deX;
    private ObjectAnimator deY;

    @i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/fragment/dialog/popup/nps/NpsScoreFragment$Companion;", "", "()V", "ARG_DIALOG_TYPE", "", "BLINKING_DURATION", "", "BLINKING_DURATION_ERROR", "EXIT_ENTER_DURATION", "HIDE_ERROR_DURATION", "SHOW_ERROR_DURATION", "TAG", "kotlin.jvm.PlatformType", "newInstance", "Lcom/iqoption/fragment/dialog/popup/nps/NpsScoreFragment;", "popup", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "tryShow", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: NpsScoreFragment.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: NpsScoreFragment.kt */
        static final class a implements Runnable {
            final /* synthetic */ FragmentManager deH;
            final /* synthetic */ com.iqoption.core.microservices.popupserver.response.a dfa;

            a(FragmentManager fragmentManager, com.iqoption.core.microservices.popupserver.response.a aVar) {
                this.deH = fragmentManager;
                this.dfa = aVar;
            }

            public final void run() {
                a aVar = c.deZ;
                FragmentManager fragmentManager = this.deH;
                kotlin.jvm.internal.i.e(fragmentManager, "fm");
                aVar.a(fragmentManager, this.dfa);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void a(FragmentActivity fragmentActivity, com.iqoption.core.microservices.popupserver.response.a aVar) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            kotlin.jvm.internal.i.f(aVar, "popup");
            com.iqoption.popup.c.dKG.A(fragmentActivity).a((Runnable) new a(fragmentActivity.getSupportFragmentManager(), aVar), aVar);
        }

        private final void a(FragmentManager fragmentManager, com.iqoption.core.microservices.popupserver.response.a aVar) {
            c g = g(aVar);
            g.setEnterTransition(new Fade());
            fragmentManager.beginTransaction().add(R.id.fragment, g, c.TAG).commitAllowingStateLoss();
        }

        private final c g(com.iqoption.core.microservices.popupserver.response.a aVar) {
            c cVar = new c();
            cVar.setArguments(new com.iqoption.util.e().b("ARG_DIALOG_TYPE", (Parcelable) aVar).toBundle());
            return cVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/iqoption/fragment/dialog/popup/nps/NpsScoreFragment$showError$1$1"})
    /* compiled from: NpsScoreFragment.kt */
    static final class g implements AnimatorUpdateListener {
        final /* synthetic */ c dfb;
        final /* synthetic */ BooleanRef dfc;

        g(BooleanRef booleanRef, c cVar) {
            this.dfc = booleanRef;
            this.dfb = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.dfc.element) {
                kotlin.jvm.internal.i.e(valueAnimator, "it");
                if (valueAnimator.getAnimatedFraction() >= 0.2f) {
                    this.dfc.element = true;
                    c.c(this.dfb).coP.bk(ToastEntity.ERROR_TOAST_DURATION);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/dialog/popup/nps/NpsScoreFragment$onCreateView$1", "Lcom/iqoption/view/viewinterface/OnClickDelayView;", "onDelayClick", "", "view", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: NpsScoreFragment.kt */
    public static final class b extends com.iqoption.view.d.b {
        final /* synthetic */ c dfb;

        b(c cVar) {
            this.dfb = cVar;
        }

        public void M(View view) {
            this.dfb.oM();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/iqoption/core/ui/widget/nps/NpsRatingBar;", "<anonymous parameter 1>", "", "onRatingChanged"})
    /* compiled from: NpsScoreFragment.kt */
    static final class c implements com.iqoption.core.ui.widget.nps.NpsRatingBar.a {
        final /* synthetic */ c dfb;

        c(c cVar) {
            this.dfb = cVar;
        }

        public final void a(NpsRatingBar npsRatingBar, int i) {
            kotlin.jvm.internal.i.f(npsRatingBar, "<anonymous parameter 0>");
            this.dfb.oM();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/dialog/popup/nps/NpsScoreFragment$onCreateView$3", "Lcom/iqoption/view/viewinterface/OnClickDelayView;", "onDelayClick", "", "view", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: NpsScoreFragment.kt */
    public static final class d extends com.iqoption.view.d.b {
        final /* synthetic */ c dfb;

        d(c cVar) {
            this.dfb = cVar;
        }

        public void M(View view) {
            this.dfb.aCm();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/dialog/popup/nps/NpsScoreFragment$onCreateView$4", "Lcom/iqoption/view/viewinterface/OnClickDelayView;", "onDelayClick", "", "view", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: NpsScoreFragment.kt */
    public static final class e extends com.iqoption.view.d.b {
        final /* synthetic */ c dfb;

        e(c cVar) {
            this.dfb = cVar;
        }

        public void M(View view) {
            NpsRatingBar npsRatingBar = c.c(this.dfb).coP;
            NpsRatingBar npsRatingBar2 = c.c(this.dfb).coP;
            kotlin.jvm.internal.i.e(npsRatingBar2, "binding.ratingBar");
            npsRatingBar.fn(npsRatingBar2.getRatingMax() / 3);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/dialog/popup/nps/NpsScoreFragment$onCreateView$5", "Lcom/iqoption/view/viewinterface/OnClickDelayView;", "onDelayClick", "", "view", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: NpsScoreFragment.kt */
    public static final class f extends com.iqoption.view.d.b {
        final /* synthetic */ c dfb;

        f(c cVar) {
            this.dfb = cVar;
        }

        public void M(View view) {
            NpsRatingBar npsRatingBar = c.c(this.dfb).coP;
            NpsRatingBar npsRatingBar2 = c.c(this.dfb).coP;
            kotlin.jvm.internal.i.e(npsRatingBar2, "binding.ratingBar");
            npsRatingBar.fn(npsRatingBar2.getRatingMax());
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ th c(c cVar) {
        th thVar = cVar.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return thVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.iqoption.popup.c.a aVar = com.iqoption.popup.c.dKG;
        FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "requireActivity()");
        this.aju = aVar.A(requireActivity);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        bundle = getArguments();
        if (bundle != null) {
            this.deR = (com.iqoption.core.microservices.popupserver.response.a) bundle.getParcelable("ARG_DIALOG_TYPE");
        }
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, R.layout.nps_score_fragment, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…agment, container, false)");
        this.deX = (th) inflate;
        th thVar = this.deX;
        String str = "binding";
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        thVar.a(this);
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = thVar.coM;
        String str2 = "binding.error";
        kotlin.jvm.internal.i.e(frameLayout, str2);
        frameLayout.setAlpha(0.0f);
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        frameLayout = thVar.coM;
        kotlin.jvm.internal.i.e(frameLayout, str2);
        com.iqoption.core.ext.a.ak(frameLayout);
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        thVar.coM.setOnClickListener(new b(this));
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        thVar.coP.setOnRatingChangeListener(new c(this));
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        thVar.coR.setOnClickListener(new d(this));
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        thVar.coO.setOnClickListener(new e(this));
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        thVar.coS.setOnClickListener(new f(this));
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return thVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        th thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        thVar.coP.bk(800);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        com.iqoption.core.microservices.popupserver.response.a aVar = this.deR;
        if (aVar != null) {
            com.iqoption.popup.c cVar = this.aju;
            if (cVar != null) {
                com.iqoption.popup.c.a(cVar, aVar, null, 2, null);
            }
        }
        fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
        }
        return true;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return z ? aCi() : aCj();
    }

    private final Animator aCi() {
        th thVar = this.deX;
        String str = "binding";
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = thVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        root.setAlpha(0.0f);
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(thVar.getRoot(), View.ALPHA, new float[]{1.0f});
        kotlin.jvm.internal.i.e(ofFloat, "anim");
        ofFloat.setInterpolator(j.XL());
        ofFloat.setDuration(300);
        return ofFloat;
    }

    private final Animator aCj() {
        String str = "binding";
        String str2 = "anim";
        th thVar;
        ObjectAnimator ofFloat;
        if (this.deU) {
            thVar = this.deX;
            if (thVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            ofFloat = ObjectAnimator.ofFloat(thVar.getRoot(), View.ALPHA, new float[]{0.0f});
            kotlin.jvm.internal.i.e(ofFloat, str2);
            ofFloat.setInterpolator(j.XL());
            ofFloat.setDuration(300);
            return ofFloat;
        }
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ofFloat = ObjectAnimator.ofFloat(thVar.aIv, View.ALPHA, new float[]{0.0f});
        kotlin.jvm.internal.i.e(ofFloat, str2);
        ofFloat.setInterpolator(j.XL());
        ofFloat.setDuration(300);
        return ofFloat;
    }

    private final void aCm() {
        th thVar = this.deX;
        String str = "binding";
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        NpsRatingBar npsRatingBar = thVar.coP;
        String str2 = "binding.ratingBar";
        kotlin.jvm.internal.i.e(npsRatingBar, str2);
        if (npsRatingBar.getRating() == 0) {
            Lg();
            return;
        }
        com.iqoption.core.microservices.popupserver.response.a aVar = this.deR;
        if (aVar != null) {
            this.deU = false;
            FragmentManager supportFragmentManager = com.iqoption.core.ext.a.r(this).getSupportFragmentManager();
            kotlin.jvm.internal.i.e(supportFragmentManager, "act.supportFragmentManager");
            th thVar2 = this.deX;
            if (thVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            NpsRatingBar npsRatingBar2 = thVar2.coP;
            kotlin.jvm.internal.i.e(npsRatingBar2, str2);
            a(supportFragmentManager, aVar, npsRatingBar2.getRating());
        }
    }

    private final void a(FragmentManager fragmentManager, com.iqoption.core.microservices.popupserver.response.a aVar, int i) {
        fragmentManager.beginTransaction().remove(this).add(R.id.fragment, b.deV.a(aVar, i), b.deV.Bx()).commitAllowingStateLoss();
    }

    public final void Lg() {
        ObjectAnimator objectAnimator = this.deY;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        th thVar = this.deX;
        String str = "binding";
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = thVar.coM;
        String str2 = "binding.error";
        kotlin.jvm.internal.i.e(frameLayout, str2);
        frameLayout.setAlpha(0.0f);
        thVar = this.deX;
        if (thVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        frameLayout = thVar.coM;
        kotlin.jvm.internal.i.e(frameLayout, str2);
        com.iqoption.core.ext.a.ak(frameLayout);
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.2f, 1.0f);
        Keyframe ofFloat3 = Keyframe.ofFloat(0.9f, 1.0f);
        Keyframe ofFloat4 = Keyframe.ofFloat(1.0f, 0.0f);
        Keyframe ofFloat5 = Keyframe.ofFloat(0.0f, com.iqoption.core.ext.a.b((Fragment) this, (int) R.dimen.dp40));
        Keyframe ofFloat6 = Keyframe.ofFloat(0.2f, com.iqoption.core.ext.a.b((Fragment) this, (int) R.dimen.dp10));
        Keyframe ofFloat7 = Keyframe.ofFloat(1.0f, com.iqoption.core.ext.a.b((Fragment) this, (int) R.dimen.dp10));
        th thVar2 = this.deX;
        if (thVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout2 = thVar2.coM;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofKeyframe(View.ALPHA, new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofKeyframe(View.TRANSLATION_Y, new Keyframe[]{ofFloat5, ofFloat6, ofFloat7});
        this.deY = ObjectAnimator.ofPropertyValuesHolder(frameLayout2, propertyValuesHolderArr);
        objectAnimator = this.deY;
        if (objectAnimator != null) {
            objectAnimator.setDuration(2400);
            objectAnimator.setInterpolator(j.XK());
            BooleanRef booleanRef = new BooleanRef();
            booleanRef.element = false;
            objectAnimator.addUpdateListener(new g(booleanRef, this));
            objectAnimator.start();
        }
    }

    public final void oM() {
        if (this.deY != null) {
            th thVar = this.deX;
            String str = "binding";
            if (thVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            FrameLayout frameLayout = thVar.coM;
            kotlin.jvm.internal.i.e(frameLayout, "binding.error");
            if (frameLayout.getAlpha() != 0.0f) {
                ObjectAnimator objectAnimator = this.deY;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                thVar = this.deX;
                if (thVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                this.deY = ObjectAnimator.ofFloat(thVar.coM, View.ALPHA, new float[]{0.0f});
                objectAnimator = this.deY;
                if (objectAnimator == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                objectAnimator.setDuration(300);
                objectAnimator = this.deY;
                if (objectAnimator == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                objectAnimator.setInterpolator(j.XL());
                objectAnimator = this.deY;
                if (objectAnimator == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                objectAnimator.start();
            }
        }
    }
}
