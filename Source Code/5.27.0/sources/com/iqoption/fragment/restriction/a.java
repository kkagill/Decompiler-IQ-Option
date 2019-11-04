package com.iqoption.fragment.restriction;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.e.nl;
import com.iqoption.util.af;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u0003012B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J\u001a\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\f\u0010.\u001a\u00020\u0019*\u00020/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000¨\u00063"}, bng = {"Lcom/iqoption/fragment/restriction/TradeRoomRestrictionFragment;", "Lcom/iqoption/fragment/base/IQAnimationFragment;", "()V", "binding", "Lcom/iqoption/databinding/FragmentTraderoomRestrictionBinding;", "listener", "Lcom/iqoption/fragment/restriction/TradeRoomRestrictionFragment$OnFragmentInteractionListener;", "requirement", "Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirement;", "getRequirement", "()Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirement;", "requirement$delegate", "Lkotlin/Lazy;", "restriction", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "getRestriction", "()Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "restriction$delegate", "screenEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "translation", "", "viewModel", "Lcom/iqoption/fragment/restriction/TradeRoomRestrictionViewModel;", "onAttach", "", "context", "Landroid/content/Context;", "onClose", "", "onConfirmClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDetach", "onHideAnimation", "onShowAnimation", "onViewCreated", "view", "addEventParameters", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "Builder", "Companion", "OnFragmentInteractionListener", "app_optionXRelease"})
/* compiled from: TradeRoomRestrictionFragment.kt */
public final class a extends com.iqoption.fragment.b.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "requirement", "getRequirement()Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirement;")), k.a(new PropertyReference1Impl(k.G(a.class), "restriction", "getRestriction()Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;"))};
    public static final b dkA = new b();
    private static List<com.iqoption.core.microservices.kyc.response.requirement.a> dkz;
    private HashMap apm;
    private int cUR;
    private com.iqoption.core.analytics.c czd;
    private nl dku;
    private c dkv;
    private final kotlin.d dkw = g.c(new TradeRoomRestrictionFragment$requirement$2(this));
    private final kotlin.d dkx = g.c(new TradeRoomRestrictionFragment$restriction$2(this));
    private b dky;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/restriction/TradeRoomRestrictionFragment$OnFragmentInteractionListener;", "", "onTradeRoomRestrictionFragmentConfirm", "", "targetStep", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "app_optionXRelease"})
    /* compiled from: TradeRoomRestrictionFragment.kt */
    public interface c {
        void d(KycStepType kycStepType);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/fragment/restriction/TradeRoomRestrictionFragment$Builder;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "fm", "Landroidx/fragment/app/FragmentManager;", "containerViewId", "", "(Landroidx/fragment/app/FragmentActivity;Landroidx/fragment/app/FragmentManager;I)V", "requirements", "", "Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirement;", "restriction", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "targetFragment", "Landroidx/fragment/app/Fragment;", "setRequirements", "setRestriction", "setTargetFragment", "show", "", "Companion", "app_optionXRelease"})
    /* compiled from: TradeRoomRestrictionFragment.kt */
    public static final class a {
        public static final a dkF = new a();
        private final FragmentManager bJl;
        private List<com.iqoption.core.microservices.kyc.response.requirement.a> bvM;
        private Fragment dkB;
        private com.iqoption.core.microservices.kyc.response.restriction.b dkC;
        private final FragmentActivity dkD;
        private final int dkE;

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/fragment/restriction/TradeRoomRestrictionFragment$Builder$Companion;", "", "()V", "create", "Lcom/iqoption/fragment/restriction/TradeRoomRestrictionFragment$Builder;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fm", "Landroidx/fragment/app/FragmentManager;", "containerViewId", "", "app_optionXRelease"})
        /* compiled from: TradeRoomRestrictionFragment.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final a b(FragmentActivity fragmentActivity, FragmentManager fragmentManager, @IdRes int i) {
                kotlin.jvm.internal.i.f(fragmentActivity, "activity");
                kotlin.jvm.internal.i.f(fragmentManager, "fm");
                return new a(fragmentActivity, fragmentManager, i, null);
            }
        }

        private a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, @IdRes int i) {
            this.dkD = fragmentActivity;
            this.bJl = fragmentManager;
            this.dkE = i;
        }

        public /* synthetic */ a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, int i, f fVar) {
            this(fragmentActivity, fragmentManager, i);
        }

        public final a ae(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "targetFragment");
            this.dkB = fragment;
            return this;
        }

        public final a aZ(List<com.iqoption.core.microservices.kyc.response.requirement.a> list) {
            kotlin.jvm.internal.i.f(list, "requirements");
            this.bvM = list;
            return this;
        }

        public final a a(com.iqoption.core.microservices.kyc.response.restriction.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "restriction");
            this.dkC = bVar;
            return this;
        }

        public final void show() {
            a.dkz = this.bvM;
            List<com.iqoption.core.microservices.kyc.response.requirement.a> list = this.bvM;
            if (list == null) {
                b bVar = a.dkA;
                FragmentActivity fragmentActivity = this.dkD;
                FragmentManager fragmentManager = this.bJl;
                Fragment fragment = this.dkB;
                if (fragment == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                bVar.a(fragmentActivity, fragmentManager, fragment, this.dkE, null, this.dkC);
            } else if (list != null) {
                for (com.iqoption.core.microservices.kyc.response.requirement.a aVar : list) {
                    b bVar2 = a.dkA;
                    FragmentActivity fragmentActivity2 = this.dkD;
                    FragmentManager fragmentManager2 = this.bJl;
                    Fragment fragment2 = this.dkB;
                    if (fragment2 == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    bVar2.a(fragmentActivity2, fragmentManager2, fragment2, this.dkE, aVar, null);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J>\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J<\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010\u001a\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/fragment/restriction/TradeRoomRestrictionFragment$Companion;", "", "()V", "ARG_REQUIREMENT", "", "ARG_RESTRICTION", "TAG", "scheduledRequirements", "", "Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirement;", "newInstance", "Lcom/iqoption/fragment/restriction/TradeRoomRestrictionFragment;", "targetFragment", "Landroidx/fragment/app/Fragment;", "requirement", "restriction", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "fm", "Landroidx/fragment/app/FragmentManager;", "containerViewId", "", "showImmediate", "tag", "app_optionXRelease"})
    /* compiled from: TradeRoomRestrictionFragment.kt */
    public static final class b {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: TradeRoomRestrictionFragment.kt */
        static final class a implements Runnable {
            final /* synthetic */ String bbS;
            final /* synthetic */ FragmentManager deH;
            final /* synthetic */ com.iqoption.core.microservices.kyc.response.requirement.a dkG;
            final /* synthetic */ Fragment dkH;
            final /* synthetic */ com.iqoption.core.microservices.kyc.response.restriction.b dkI;
            final /* synthetic */ int dkJ;

            a(FragmentManager fragmentManager, String str, com.iqoption.core.microservices.kyc.response.requirement.a aVar, Fragment fragment, com.iqoption.core.microservices.kyc.response.restriction.b bVar, int i) {
                this.deH = fragmentManager;
                this.bbS = str;
                this.dkG = aVar;
                this.dkH = fragment;
                this.dkI = bVar;
                this.dkJ = i;
            }

            public final void run() {
                a.dkA.a(this.deH, this.bbS, this.dkG, this.dkH, this.dkI, this.dkJ);
            }
        }

        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        private final void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, Fragment fragment, @IdRes int i, com.iqoption.core.microservices.kyc.response.requirement.a aVar, com.iqoption.core.microservices.kyc.response.restriction.b bVar) {
            if (aVar == null && bVar == null) {
                throw new IllegalArgumentException("Both arguments are null");
            } else if (aVar == null || bVar == null) {
                b bVar2 = this;
                String a = bVar2.a(aVar, bVar);
                com.iqoption.popup.c A = com.iqoption.popup.c.dKG.A(fragmentActivity);
                if (bVar != null) {
                    bVar2.a(fragmentManager, a, aVar, fragment, bVar, i);
                } else if (!A.js(a)) {
                    A.a((Runnable) new a(fragmentManager, a, aVar, fragment, bVar, i), a);
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Both arguments are not null: ");
                stringBuilder.append(aVar);
                stringBuilder.append(", ");
                stringBuilder.append(bVar);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        private final void a(FragmentManager fragmentManager, String str, com.iqoption.core.microservices.kyc.response.requirement.a aVar, Fragment fragment, com.iqoption.core.microservices.kyc.response.restriction.b bVar, int i) {
            if (fragmentManager.findFragmentByTag(str) == null) {
                a a;
                if (aVar != null) {
                    a = a(fragment, aVar);
                } else {
                    b bVar2 = this;
                    if (bVar == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    a = bVar2.a(fragment, bVar);
                }
                fragmentManager.beginTransaction().add(i, a, str).addToBackStack(str).commitAllowingStateLoss();
            }
        }

        private final a a(Fragment fragment, com.iqoption.core.microservices.kyc.response.requirement.a aVar) {
            a aVar2 = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_REQUIREMENT", aVar);
            aVar2.setArguments(bundle);
            aVar2.setTargetFragment(fragment, 0);
            return aVar2;
        }

        private final a a(Fragment fragment, com.iqoption.core.microservices.kyc.response.restriction.b bVar) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_RESTRICTION", bVar);
            aVar.setArguments(bundle);
            aVar.setTargetFragment(fragment, 0);
            return aVar;
        }

        private final String a(com.iqoption.core.microservices.kyc.response.requirement.a aVar, com.iqoption.core.microservices.kyc.response.restriction.b bVar) {
            if (bVar != null) {
                return a.TAG;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a.TAG);
            stringBuilder.append(':');
            if (aVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            stringBuilder.append(aVar.afv());
            return stringBuilder.toString();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ a this$0;

        public d(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.axC();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends g {
        final /* synthetic */ a this$0;

        public e(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.onClose();
        }
    }

    private final com.iqoption.core.microservices.kyc.response.requirement.a aEV() {
        kotlin.d dVar = this.dkw;
        j jVar = anY[0];
        return (com.iqoption.core.microservices.kyc.response.requirement.a) dVar.getValue();
    }

    private final com.iqoption.core.microservices.kyc.response.restriction.b aEW() {
        kotlin.d dVar = this.dkx;
        j jVar = anY[1];
        return (com.iqoption.core.microservices.kyc.response.restriction.b) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dky = b.dkK.af(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dku = (nl) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_traderoom_restriction, viewGroup, false, 4, null);
        this.cUR = com.iqoption.core.util.b.bi(com.iqoption.core.ext.a.q(this));
        nl nlVar = this.dku;
        if (nlVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return nlVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        int i = aEV() != null ? R.drawable.bg_requirement_view : R.drawable.bg_card_view;
        nl nlVar = this.dku;
        String str = "binding";
        if (nlVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = nlVar.bYN;
        String str2 = "binding.contentLayout";
        kotlin.jvm.internal.i.e(frameLayout, str2);
        frameLayout.setBackground(com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), i));
        nl nlVar2 = this.dku;
        if (nlVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout2 = nlVar2.bYN;
        kotlin.jvm.internal.i.e(frameLayout2, str2);
        frameLayout2.setOnClickListener(new d(this));
        nlVar2 = this.dku;
        if (nlVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        frameLayout2 = nlVar2.cfH;
        kotlin.jvm.internal.i.e(frameLayout2, "binding.backLayout");
        frameLayout2.setOnClickListener(new e(this));
        String str3 = "binding.btnConfirm";
        str2 = "binding.text";
        String str4 = "binding.tittle";
        nl nlVar3;
        TextView textView;
        nl nlVar4;
        TextView textView2;
        nl nlVar5;
        TextView textView3;
        if (aEW() != null) {
            com.iqoption.core.microservices.kyc.response.restriction.b aEW = aEW();
            com.iqoption.core.microservices.kyc.response.restriction.a afD = aEW != null ? aEW.afD() : null;
            if (afD == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            nlVar3 = this.dku;
            if (nlVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = nlVar3.cjW;
            kotlin.jvm.internal.i.e(textView, str4);
            textView.setText(afD.afw());
            nlVar4 = this.dku;
            if (nlVar4 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView2 = nlVar4.ani;
            kotlin.jvm.internal.i.e(textView2, str2);
            textView2.setText(afD.afB());
            nlVar5 = this.dku;
            if (nlVar5 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView3 = nlVar5.cbI;
            kotlin.jvm.internal.i.e(textView3, str3);
            textView3.setText(afD.afy());
        } else {
            com.iqoption.core.microservices.kyc.response.requirement.a aEV = aEV();
            if (aEV == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            nlVar3 = this.dku;
            if (nlVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = nlVar3.cjW;
            kotlin.jvm.internal.i.e(textView, str4);
            textView.setText(aEV.afw());
            nlVar4 = this.dku;
            if (nlVar4 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView2 = nlVar4.ani;
            kotlin.jvm.internal.i.e(textView2, str2);
            textView2.setText(aEV.afx());
            nlVar5 = this.dku;
            if (nlVar5 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView3 = nlVar5.cbI;
            kotlin.jvm.internal.i.e(textView3, str3);
            textView3.setText(aEV.afy());
        }
        com.iqoption.core.analytics.b dl = com.iqoption.core.d.EC().dl("kyc_traderoom-popup-show");
        a(dl);
        this.czd = dl;
    }

    private final void axC() {
        com.iqoption.core.microservices.kyc.response.requirement.a aEV;
        KycStepType kycStepType = null;
        if (aEV() != null) {
            List list = dkz;
            if (list != null) {
                List<com.iqoption.core.microservices.kyc.response.requirement.a> Q = u.Q(list);
                if (Q != null) {
                    for (com.iqoption.core.microservices.kyc.response.requirement.a aEV2 : Q) {
                        com.iqoption.popup.c.a aVar = com.iqoption.popup.c.dKG;
                        FragmentActivity requireActivity = requireActivity();
                        kotlin.jvm.internal.i.e(requireActivity, "requireActivity()");
                        aVar.A(requireActivity).jr(dkA.a(aEV2, null));
                    }
                }
            }
            dkz = (List) null;
        }
        onClose();
        c cVar = this.dkv;
        if (cVar != null) {
            aEV2 = aEV();
            if (aEV2 != null) {
                kycStepType = aEV2.afz();
            }
            cVar.d(kycStepType);
        }
        com.iqoption.core.analytics.b W = com.iqoption.core.d.EC().W("link_pressed", "kyc_traderoom-link-pressed");
        a(W);
        W.Cc();
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        com.iqoption.popup.c.a aVar = com.iqoption.popup.c.dKG;
        FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "requireActivity()");
        aVar.A(requireActivity).jr(dkA.a(aEV(), aEW()));
        com.iqoption.core.microservices.kyc.response.requirement.a aEV = aEV();
        if (aEV != null) {
            b bVar = this.dky;
            if (bVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            bVar.a(aEV);
        }
        return true;
    }

    public void att() {
        nl nlVar = this.dku;
        String str = "binding";
        if (nlVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = nlVar.bYN;
        String str2 = "binding.contentLayout";
        kotlin.jvm.internal.i.e(frameLayout, str2);
        frameLayout.setAlpha(0.0f);
        float f;
        nl nlVar2;
        if (af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            nl nlVar3 = this.dku;
            if (nlVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            FrameLayout frameLayout2 = nlVar3.bYN;
            kotlin.jvm.internal.i.e(frameLayout2, str2);
            float f2 = (float) dimensionPixelSize2;
            frameLayout2.setTranslationX(f2);
            nlVar3 = this.dku;
            if (nlVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            frameLayout2 = nlVar3.bYN;
            kotlin.jvm.internal.i.e(frameLayout2, str2);
            f = (float) (-dimensionPixelSize2);
            frameLayout2.setTranslationY(f);
            nlVar3 = this.dku;
            if (nlVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView = nlVar3.ani;
            String str3 = "binding.text";
            kotlin.jvm.internal.i.e(textView, str3);
            textView.setTranslationX(f2);
            nlVar3 = this.dku;
            if (nlVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = nlVar3.ani;
            kotlin.jvm.internal.i.e(textView, str3);
            textView.setTranslationY(f);
            nlVar2 = this.dku;
            if (nlVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView2 = nlVar2.ani;
            kotlin.jvm.internal.i.e(textView2, str3);
            textView2.setAlpha(0.0f);
            nlVar2 = this.dku;
            if (nlVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            FrameLayout frameLayout3 = nlVar2.bYN;
            kotlin.jvm.internal.i.e(frameLayout3, str2);
            dimensionPixelSize2 = frameLayout3.getWidth() - dimensionPixelSize;
            nlVar3 = this.dku;
            if (nlVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            frameLayout2 = nlVar3.bYN;
            kotlin.jvm.internal.i.e(frameLayout2, str2);
            double width = (double) frameLayout2.getWidth();
            nl nlVar4 = this.dku;
            if (nlVar4 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            FrameLayout frameLayout4 = nlVar4.bYN;
            kotlin.jvm.internal.i.e(frameLayout4, str2);
            float hypot = (float) Math.hypot(width, (double) frameLayout4.getHeight());
            nl nlVar5 = this.dku;
            if (nlVar5 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(nlVar5.bYN, dimensionPixelSize2, dimensionPixelSize, (float) dimensionPixelSize, hypot);
            Animator duration = createCircularReveal.setDuration(400);
            kotlin.jvm.internal.i.e(duration, "animator.setDuration(400)");
            TimeInterpolator timeInterpolator = interpolator;
            duration.setInterpolator(timeInterpolator);
            nl nlVar6 = this.dku;
            if (nlVar6 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            FrameLayout frameLayout5 = nlVar6.bYN;
            r9 = new PropertyValuesHolder[2];
            String str4 = "translationX";
            r9[0] = PropertyValuesHolder.ofFloat(str4, new float[]{0.0f});
            String str5 = "translationY";
            r9[1] = PropertyValuesHolder.ofFloat(str5, new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout5, r9);
            Animator animator = createCircularReveal;
            ObjectAnimator duration2 = ofPropertyValuesHolder.setDuration(200);
            kotlin.jvm.internal.i.e(duration2, "shift.setDuration(200)");
            duration2.setInterpolator(timeInterpolator);
            nlVar5 = this.dku;
            if (nlVar5 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            TextView textView3 = nlVar5.ani;
            r15 = new PropertyValuesHolder[3];
            r15[0] = PropertyValuesHolder.ofFloat(str4, new float[]{0.0f});
            r15[1] = PropertyValuesHolder.ofFloat(str5, new float[]{0.0f});
            r15[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(textView3, r15);
            ObjectAnimator duration3 = ofPropertyValuesHolder2.setDuration(200);
            kotlin.jvm.internal.i.e(duration3, "shiftB.setDuration(200)");
            duration3.setInterpolator(timeInterpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(animator).with(ofPropertyValuesHolder);
            animatorSet.play(ofPropertyValuesHolder2).after(100);
            animatorSet.start();
            nlVar = this.dku;
            if (nlVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            frameLayout = nlVar.bYN;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            frameLayout.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        nl nlVar7 = this.dku;
        if (nlVar7 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout6 = nlVar7.bYN;
        f = (float) (-dimensionPixelOffset);
        frameLayout6.setTranslationX(f);
        frameLayout6.setTranslationY(f);
        nlVar2 = this.dku;
        if (nlVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout7 = nlVar2.bYN;
        kotlin.jvm.internal.i.e(frameLayout7, str2);
        frameLayout6.setPivotX((float) (frameLayout7.getWidth() - dimensionPixelOffset));
        frameLayout6.setPivotY(1.0f);
        frameLayout6.setScaleX(0.3f);
        frameLayout6.setScaleY(0.3f);
        frameLayout6.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        nl nlVar = this.dku;
        if (nlVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        nlVar.bYN.animate().alpha(0.0f).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getTargetFragment() instanceof c) {
            this.dkv = (c) getTargetFragment();
        } else if (getParentFragment() instanceof c) {
            this.dkv = (c) getParentFragment();
        } else if (context instanceof c) {
            this.dkv = (c) context;
        }
    }

    public void onDetach() {
        super.onDetach();
        this.dkv = (c) null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        com.iqoption.core.analytics.c cVar = this.czd;
        if (cVar != null) {
            cVar.Cc();
        }
        Bj();
    }

    private final void a(com.iqoption.core.analytics.b bVar) {
        com.iqoption.core.microservices.kyc.response.requirement.a aEV = aEV();
        Object obj = null;
        bVar.f("requirement_id", aEV != null ? aEV.afv() : null);
        com.iqoption.core.microservices.kyc.response.restriction.b aEW = aEW();
        if (aEW != null) {
            obj = aEW.afC();
        }
        bVar.f("restriction_id", obj);
    }
}
