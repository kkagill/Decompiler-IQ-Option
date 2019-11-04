package com.iqoption.cardsverification.status;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.Transition.TransitionListener;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.snackbar.Snackbar;
import com.iqoption.cardsverification.a.o;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.util.ag;
import com.jumio.MobileSDK;
import com.jumio.dv.DocumentVerificationSDK;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001FB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\"\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u0019H\u0016J\u0012\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\b\u0010\u001f\u001a\u0004\u0018\u00010-H\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0012H\u0002J-\u00101\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u000204032\u0006\u00105\u001a\u000206H\u0016¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020(H\u0016J\u001a\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010<\u001a\u00020\u0019H\u0002J\b\u0010=\u001a\u00020\u0019H\u0002J\b\u0010>\u001a\u00020\u0019H\u0002J\u0010\u0010?\u001a\u00020\u00192\u0006\u0010@\u001a\u000204H\u0002J\b\u0010A\u001a\u00020\u0019H\u0002J$\u0010B\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\"2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010EH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006G"}, bng = {"Lcom/iqoption/cardsverification/status/PerformVerifyFragment;", "Lcom/iqoption/cardsverification/status/BaseVerifyStatusFragment;", "Lcom/iqoption/cardsverification/status/VerifyHintBottomSheetFragment$OnMakePhotoListener;", "Lcom/iqoption/dialogs/DarkDialogFragment$OnDialogListener;", "()V", "backBinding", "Lcom/iqoption/cardsverification/databinding/VerifySideItemBinding;", "footerBinding", "Lcom/iqoption/cardsverification/databinding/PerformVerifyFooterBinding;", "frontBinding", "verifyState", "Lcom/iqoption/cardsverification/status/VerifyState;", "viewModel", "Lcom/iqoption/cardsverification/status/PerformVerifyViewModel;", "addSideItem", "container", "Landroid/widget/LinearLayout;", "cardSide", "Lcom/iqoption/cardsverification/status/CardSide;", "getFooterView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "initDescription", "", "initFooter", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onConfirm", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDialogClose", "onInitialized", "userId", "", "Lcom/iqoption/cardsverification/status/PerformVerifyData;", "onMakePhotoClick", "onNextScanClick", "side", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSaveInstanceState", "outState", "onViewCreated", "view", "performNextScan", "showContentUI", "showErrorUI", "showPermissionAbsenceSnack", "permission", "showProgressUI", "showSideCompleted", "animate", "listener", "Landroidx/transition/Transition$TransitionListener;", "Companion", "cardsverification_release"})
/* compiled from: PerformVerifyFragment.kt */
public final class e extends a implements com.iqoption.cardsverification.status.i.b, com.iqoption.dialogs.b.b {
    private static final String TAG;
    public static final a aCf = new a();
    private o aCa;
    private o aCb;
    private k aCc;
    private com.iqoption.cardsverification.a.i aCd;
    private g aCe;
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/cardsverification/status/PerformVerifyFragment$Companion;", "", "()V", "REQUEST_CODE_VERIFY_CARD_PERMISSIONS", "", "STATE_VERIFY", "", "TAG", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "cardsverification_release"})
    /* compiled from: PerformVerifyFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c Lj() {
            return new com.iqoption.core.ui.d.c(e.TAG, e.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: PerformVerifyFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ e aCg;
        final /* synthetic */ CardSide aCh;

        b(e eVar, CardSide cardSide) {
            this.aCg = eVar;
            this.aCh = cardSide;
        }

        public final void onClick(View view) {
            com.iqoption.cardsverification.status.i.a aVar = i.aCy;
            FragmentManager childFragmentManager = this.aCg.getChildFragmentManager();
            kotlin.jvm.internal.i.e(childFragmentManager, "childFragmentManager");
            aVar.a(childFragmentManager, com.iqoption.cardsverification.g.d.verifyStatusOther, new c(this.aCh));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: PerformVerifyFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ e aCg;
        final /* synthetic */ CardSide aCh;

        c(e eVar, CardSide cardSide) {
            this.aCg = eVar;
            this.aCh = cardSide;
        }

        public final void onClick(View view) {
            this.aCg.b(this.aCh);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: PerformVerifyFragment.kt */
    static final class h implements OnClickListener {
        final /* synthetic */ e aCg;

        h(e eVar) {
            this.aCg = eVar;
        }

        public final void onClick(View view) {
            ag.bm(this.aCg.getContext());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/cardsverification/status/PerformVerifyFragment$initDescription$clickableSpan$1", "Lcom/iqoption/core/util/link/TouchableSpan;", "onClick", "", "textView", "Landroid/view/View;", "cardsverification_release"})
    /* compiled from: PerformVerifyFragment.kt */
    public static final class d extends com.iqoption.core.util.b.i {
        final /* synthetic */ e aCg;
        final /* synthetic */ String aCi;
        final /* synthetic */ int aCj;
        final /* synthetic */ int aCk;

        d(e eVar, String str, int i, int i2, int i3, int i4) {
            this.aCg = eVar;
            this.aCi = str;
            this.aCj = i;
            this.aCk = i2;
            super(i3, i4);
        }

        public void onClick(View view) {
            kotlin.jvm.internal.i.f(view, "textView");
            FragmentActivity activity = this.aCg.getActivity();
            if (activity != null) {
                kotlin.jvm.internal.i.e(activity, "it");
                com.iqoption.core.util.b.d.a((Context) activity, this.aCi, Integer.valueOf(268435456), null, 8, null);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/cardsverification/status/PerformVerifyData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: PerformVerifyFragment.kt */
    static final class f<T> implements Observer<d> {
        final /* synthetic */ e aCg;
        final /* synthetic */ long aCm;

        f(e eVar, long j) {
            this.aCg = eVar;
            this.aCm = j;
        }

        /* renamed from: a */
        public final void onChanged(d dVar) {
            this.aCg.a(this.aCm, dVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: PerformVerifyFragment.kt */
    static final class g<T> implements Observer<Object> {
        final /* synthetic */ e aCg;

        g(e eVar) {
            this.aCg = eVar;
        }

        public final void onChanged(Object obj) {
            this.aCg.a(CardStatus.VERIFY_PENDING, true);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/cardsverification/status/PerformVerifyFragment$onActivityResult$1", "Landroidx/transition/TransitionListenerAdapter;", "onTransitionEnd", "", "transition", "Landroidx/transition/Transition;", "cardsverification_release"})
    /* compiled from: PerformVerifyFragment.kt */
    public static final class e extends TransitionListenerAdapter {
        final /* synthetic */ e aCg;
        final /* synthetic */ boolean aCl;

        e(e eVar, boolean z) {
            this.aCg = eVar;
            this.aCl = z;
        }

        public void onTransitionEnd(Transition transition) {
            kotlin.jvm.internal.i.f(transition, "transition");
            if (this.aCg.isAdded() && this.aCl) {
                TransitionManager.beginDelayedTransition(this.aCg.Lr().aAN);
                this.aCg.LD();
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void LI() {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = com.iqoption.cardsverification.list.e.class.getName();
        kotlin.jvm.internal.i.e(name, "VerifyCardsFragment::class.java.name");
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.aCc = (k) bundle.getParcelable("STATE_VERIFY");
        }
        this.aCe = g.aCs.d(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        g gVar;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        LC();
        String str = "viewModel";
        if (this.aCc == null) {
            LD();
            long userId = com.iqoption.core.d.EA().getUserId();
            gVar = this.aCe;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            gVar.k(userId, La().getId()).observe(this, new f(this, userId));
        } else {
            LF();
            k kVar = this.aCc;
            if (kVar != null) {
                CardSide LQ = kVar.LQ();
                if (LQ != null) {
                    a(this, LQ, false, null, 4, null);
                }
            }
        }
        LG();
        gVar = this.aCe;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.LK().observe(this, new g(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        bundle.putParcelable("STATE_VERIFY", this.aCc);
        super.onSaveInstanceState(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == DocumentVerificationSDK.REQUEST_CODE) {
            k kVar = this.aCc;
            if (kVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            if (i2 == -1) {
                CardSide LR = kVar.LR();
                boolean z = kVar.LQ() != CardSide.NONE;
                a(LR, true, (TransitionListener) new e(this, z));
                if (z) {
                    g gVar = this.aCe;
                    String str = "viewModel";
                    if (gVar == null) {
                        kotlin.jvm.internal.i.lG(str);
                    }
                    com.iqoption.core.microservices.billing.verification.response.c La = La();
                    com.iqoption.core.microservices.billing.verification.response.e abe = kVar.LO().abe();
                    if (abe == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    gVar.b(La, abe.getUuid());
                    gVar = this.aCe;
                    if (gVar == null) {
                        kotlin.jvm.internal.i.lG(str);
                    }
                    gVar.LL();
                } else {
                    kVar.c(LR);
                }
            }
            kVar.d(CardSide.NONE);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.i.f(strArr, "permissions");
        kotlin.jvm.internal.i.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 300) {
            int i2 = 0;
            if (((iArr.length == 0 ? 1 : 0) ^ 1) != 0) {
                i = iArr.length;
                while (i2 < i) {
                    if (iArr[i2] != 0) {
                        ew(strArr[i2]);
                        return;
                    }
                    i2++;
                }
                LH();
            } else {
                com.iqoption.core.d.a(com.iqoption.cardsverification.g.f.unknown_error_occurred, 0, 2, null);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        boolean z = false;
        if (fragmentManager == null) {
            return false;
        }
        k kVar = this.aCc;
        CardSide LQ = kVar != null ? kVar.LQ() : null;
        if (LQ != null) {
            int i = f.aob[LQ.ordinal()];
            if (i == 1 || i == 2) {
                z = true;
            }
        }
        if (!z) {
            return super.a(fragmentManager);
        }
        com.iqoption.dialogs.b.a aVar = com.iqoption.dialogs.b.cLe;
        int i2 = com.iqoption.cardsverification.g.d.verifyStatusOther;
        CharSequence string = getString(com.iqoption.cardsverification.g.f.confirm_back);
        String string2 = getString(com.iqoption.cardsverification.g.f.you_still_need_to_upload_the_other_side);
        kotlin.jvm.internal.i.e(string2, "getString(R.string.you_s…to_upload_the_other_side)");
        aVar.a(fragmentManager, i2, string, string2, getString(com.iqoption.cardsverification.g.f.cancel), getString(com.iqoption.cardsverification.g.f.confirm));
        return true;
    }

    private final void ew(String str) {
        Snackbar a = Snackbar.a((View) Lr().aAL, com.iqoption.cardsverification.g.f.please_enable_camera_access, 0);
        kotlin.jvm.internal.i.e(a, "Snackbar.make(binding.ve…ss, Snackbar.LENGTH_LONG)");
        if (!shouldShowRequestPermissionRationale(str)) {
            a.a(com.iqoption.cardsverification.g.f.settings, (OnClickListener) new h(this));
        }
        a.show();
    }

    private final void LC() {
        View root = Lr().getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        LinearLayout linearLayout = (LinearLayout) root.findViewById(com.iqoption.cardsverification.g.d.performVerifyContainer);
        kotlin.jvm.internal.i.e(linearLayout, "container");
        this.aCa = a(linearLayout, CardSide.FRONT);
        o oVar = this.aCa;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("frontBinding");
        }
        oVar.aBf.setText(com.iqoption.cardsverification.g.f.front_side);
        this.aCb = a(linearLayout, CardSide.BACK);
        o oVar2 = this.aCb;
        if (oVar2 == null) {
            kotlin.jvm.internal.i.lG("backBinding");
        }
        oVar2.aBf.setText(com.iqoption.cardsverification.g.f.back_side);
    }

    private final o a(LinearLayout linearLayout, CardSide cardSide) {
        o b = o.b(LayoutInflater.from(getContext()), linearLayout, true);
        kotlin.jvm.internal.i.e(b, "VerifySideItemBinding.in…ontext), container, true)");
        LinearLayout linearLayout2 = b.aBg;
        kotlin.jvm.internal.i.e(linearLayout2, "binding.verifySideUploaded");
        com.iqoption.core.ext.a.al(linearLayout2);
        b.aBb.setOnTouchListener(new com.iqoption.core.ui.widget.h.a(0.0f, 0.0f, 3, null));
        b.aBb.setOnClickListener(new b(this, cardSide));
        b.aBd.setOnClickListener(new c(this, cardSide));
        return b;
    }

    public void a(CardSide cardSide) {
        kotlin.jvm.internal.i.f(cardSide, "cardSide");
        b(cardSide);
    }

    private final void LD() {
        com.iqoption.cardsverification.a.i iVar = this.aCd;
        String str = "footerBinding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = iVar.aAV;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "footerBinding.performVerifyProgress");
        contentLoadingProgressBar.setVisibility(0);
        iVar = this.aCd;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = iVar.aAU;
        kotlin.jvm.internal.i.e(textView, "footerBinding.performVerifyError");
        com.iqoption.core.ext.a.al(textView);
        iVar = this.aCd;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = iVar.aAT;
        kotlin.jvm.internal.i.e(linearLayout, "footerBinding.performVerifyContainer");
        com.iqoption.core.ext.a.al(linearLayout);
    }

    private final void LE() {
        com.iqoption.cardsverification.a.i iVar = this.aCd;
        String str = "footerBinding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = iVar.aAV;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "footerBinding.performVerifyProgress");
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        iVar = this.aCd;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = iVar.aAU;
        kotlin.jvm.internal.i.e(textView, "footerBinding.performVerifyError");
        com.iqoption.core.ext.a.ak(textView);
        iVar = this.aCd;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = iVar.aAT;
        kotlin.jvm.internal.i.e(linearLayout, "footerBinding.performVerifyContainer");
        com.iqoption.core.ext.a.al(linearLayout);
    }

    private final void LF() {
        com.iqoption.cardsverification.a.i iVar = this.aCd;
        String str = "footerBinding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = iVar.aAT;
        kotlin.jvm.internal.i.e(linearLayout, "footerBinding.performVerifyContainer");
        com.iqoption.core.ext.a.ak(linearLayout);
        iVar = this.aCd;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = iVar.aAU;
        kotlin.jvm.internal.i.e(textView, "footerBinding.performVerifyError");
        com.iqoption.core.ext.a.al(textView);
        iVar = this.aCd;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ContentLoadingProgressBar contentLoadingProgressBar = iVar.aAV;
        kotlin.jvm.internal.i.e(contentLoadingProgressBar, "footerBinding.performVerifyProgress");
        com.iqoption.core.ext.a.al(contentLoadingProgressBar);
    }

    static /* synthetic */ void a(e eVar, CardSide cardSide, boolean z, TransitionListener transitionListener, int i, Object obj) {
        if ((i & 4) != 0) {
            transitionListener = (TransitionListener) null;
        }
        eVar.a(cardSide, z, transitionListener);
    }

    private final void a(CardSide cardSide, boolean z, TransitionListener transitionListener) {
        o oVar;
        int i = f.axg[cardSide.ordinal()];
        if (i == 1) {
            oVar = this.aCa;
            if (oVar == null) {
                kotlin.jvm.internal.i.lG("frontBinding");
            }
        } else if (i == 2) {
            oVar = this.aCb;
            if (oVar == null) {
                kotlin.jvm.internal.i.lG("backBinding");
            }
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            return;
        }
        if (z) {
            AutoTransition autoTransition = new AutoTransition();
            if (transitionListener != null) {
                autoTransition.addListener(transitionListener);
            }
            View root = oVar.getRoot();
            if (root != null) {
                TransitionManager.beginDelayedTransition((ViewGroup) root, autoTransition);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        TextView textView = oVar.aBd;
        kotlin.jvm.internal.i.e(textView, "sideBinding.verifySideButton");
        com.iqoption.core.ext.a.al(textView);
        LinearLayout linearLayout = oVar.aBg;
        kotlin.jvm.internal.i.e(linearLayout, "sideBinding.verifySideUploaded");
        com.iqoption.core.ext.a.ak(linearLayout);
        ImageView imageView = oVar.aBe;
        kotlin.jvm.internal.i.e(imageView, "sideBinding.verifySideHint");
        com.iqoption.core.ext.a.hide(imageView);
        oVar.aBb.setOnTouchListener(null);
        oVar.aBb.setOnClickListener(null);
    }

    private final void a(long j, d dVar) {
        if (dVar != null) {
            LF();
            this.aCc = new k(j, dVar.LA(), dVar.LB().acO(), CardSide.NONE, CardSide.NONE);
            return;
        }
        LE();
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        kotlin.jvm.internal.i.f(viewGroup, "container");
        com.iqoption.cardsverification.a.i a = com.iqoption.cardsverification.a.i.a(layoutInflater, viewGroup, false);
        kotlin.jvm.internal.i.e(a, "PerformVerifyFooterBindi…flater, container, false)");
        this.aCd = a;
        a = this.aCd;
        if (a == null) {
            kotlin.jvm.internal.i.lG("footerBinding");
        }
        View root = a.getRoot();
        kotlin.jvm.internal.i.e(root, "footerBinding.root");
        return root;
    }

    private final void LG() {
        String string = getString(com.iqoption.cardsverification.g.f.aml_policy);
        kotlin.jvm.internal.i.e(string, "getString(R.string.aml_policy)");
        String bp = com.iqoption.core.util.b.f.bp(com.iqoption.core.ext.a.q(this));
        String string2 = getString(com.iqoption.cardsverification.g.f.in_order_to_confirm_your_card_ownership_n1, string);
        kotlin.jvm.internal.i.e(string2, "getString(R.string.in_or…d_ownership_n1, linkText)");
        CharSequence charSequence = string2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        TextView textView = Lr().aAM;
        kotlin.jvm.internal.i.e(textView, "binding.verifyStatusDescription");
        int a = com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.cardsverification.g.a.white);
        int a2 = com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.cardsverification.g.a.white_60);
        d dVar = new d(this, bp, a, a2, a, a2);
        int a3 = v.a(charSequence, string, 0, false, 6, null);
        int length = string.length() + a3;
        spannableStringBuilder.setSpan(dVar, a3, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), a3, length, 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(new com.iqoption.core.util.b.c());
        textView.setHighlightColor(0);
    }

    private final void b(CardSide cardSide) {
        k kVar = this.aCc;
        if (kVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kVar.d(cardSide);
        g gVar = this.aCe;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        if (gVar.a(com.iqoption.core.ext.a.r(this), kVar) != null) {
            String[] missingPermissions = MobileSDK.getMissingPermissions(getContext());
            kotlin.jvm.internal.i.e(missingPermissions, "MobileSDK.getMissingPermissions(context)");
            if ((missingPermissions.length == 0 ? 1 : null) != null) {
                LH();
                return;
            } else {
                requestPermissions(missingPermissions, 300);
                return;
            }
        }
        LE();
    }

    private final void LH() {
        k kVar = this.aCc;
        if (kVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        g gVar = this.aCe;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        DocumentVerificationSDK a = gVar.a(com.iqoption.core.ext.a.r(this), kVar);
        if (a != null) {
            a.setDocumentName(getString(kVar.LR() == CardSide.FRONT ? com.iqoption.cardsverification.g.f.front_side : com.iqoption.cardsverification.g.f.back_side));
            startActivityForResult(a.getIntent(), DocumentVerificationSDK.REQUEST_CODE);
            return;
        }
        LE();
    }

    public void LJ() {
        Fragment fragment = this;
        if (!com.iqoption.cardsverification.b.aAo.c(fragment).alG()) {
            com.iqoption.cardsverification.b.aAo.b(fragment);
        }
    }
}
