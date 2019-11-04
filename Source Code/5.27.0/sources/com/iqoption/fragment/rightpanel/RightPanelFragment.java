package com.iqoption.fragment.rightpanel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.common.b.e;
import com.iqoption.app.managers.l;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.k;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.e.nb;
import com.iqoption.fragment.b.d;
import com.iqoption.fragment.m;
import com.iqoption.view.a.a.c;
import com.iqoption.view.a.b;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.util.Objects;

public final class RightPanelFragment extends d implements com.iqoption.view.a.b.a {
    private com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private com.iqoption.core.microservices.useralerts.response.a aoW;
    private n cXM;
    private AnimatorSet ddI;
    private final a dpn = new a(this, null);
    private final g dpp = new g();
    private final DateFormat dpq = TimeUtil.bRJ;
    private RightPanelDelegate dpr;
    private boolean dps;
    private nb dpt;
    protected q dpu;
    @Nullable
    private l dpv;

    public static final class a extends com.iqoption.system.a.d {
        private final WeakReference<RightPanelFragment> bJf;

        /* synthetic */ a(RightPanelFragment rightPanelFragment, AnonymousClass1 anonymousClass1) {
            this(rightPanelFragment);
        }

        private a(RightPanelFragment rightPanelFragment) {
            this.bJf = new WeakReference(rightPanelFragment);
        }

        @e
        public void onCurrentActiveChanged(k kVar) {
            RightPanelFragment rightPanelFragment = (RightPanelFragment) this.bJf.get();
            if (rightPanelFragment != null && rightPanelFragment.isAdded()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$RightPanelFragment$a$hOrAZTfCXyrwK4mAD5ffA-NA-6g(rightPanelFragment));
            }
        }

        private static /* synthetic */ void b(RightPanelFragment rightPanelFragment) {
            com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
            if (IZ != null && rightPanelFragment.getContext() != null) {
                rightPanelFragment.aa(IZ);
            }
        }

        @e
        public void onScheduleActiveChangeEvent(com.iqoption.app.helpers.a.d dVar) {
            RightPanelFragment rightPanelFragment = (RightPanelFragment) this.bJf.get();
            if (rightPanelFragment != null && rightPanelFragment.isAdded()) {
                com.iqoption.core.c.a.biN.execute(new -$$Lambda$RightPanelFragment$a$ES4Ry1G6ZZItwxQbcfjh5i0rtGA(dVar, rightPanelFragment));
            }
        }

        private static /* synthetic */ void a(com.iqoption.app.helpers.a.d dVar, RightPanelFragment rightPanelFragment) {
            com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
            if (IZ != null && IZ.instrumentType == dVar.getValue() && rightPanelFragment.getContext() != null) {
                rightPanelFragment.ab(IZ);
            }
        }
    }

    public void onTick(long j) {
        this.dpt.ciz.setText(this.dpq.format(this.dpp.bN(System.currentTimeMillis())));
    }

    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.dpt = (nb) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_right_panel, viewGroup, false);
        return this.dpt.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.dpu = q.t(requireActivity());
        this.cXM = n.s(requireActivity());
        this.cXM.aHz().observe(this, new -$$Lambda$RightPanelFragment$VcHeQKyGgnGHTftvaP3aO6AikII(this));
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
        if (IZ != null) {
            Z(IZ);
        }
        this.dpn.register();
        b.aYv().a((com.iqoption.view.a.b.a) this);
        Fragment findFragmentByTag = requireActivity().getSupportFragmentManager().findFragmentByTag(k.TAG);
        if (findFragmentByTag != null) {
            this.dpv = ((k) findFragmentByTag).aHt();
        }
    }

    private /* synthetic */ void d(com.iqoption.core.microservices.useralerts.response.a aVar) {
        this.aoW = aVar;
        c(aVar);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.dpn.unregister();
        RightPanelDelegate rightPanelDelegate = this.dpr;
        if (rightPanelDelegate != null) {
            rightPanelDelegate.destroy();
        }
        b.aYv().b((com.iqoption.view.a.b.a) this);
    }

    public double ZC() {
        return this.dpr.ZC();
    }

    private void e(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        this.anF = aVar;
        this.dpu.e(aVar);
    }

    private void Z(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        RightPanelDelegate rightPanelDelegate = this.dpr;
        boolean c = c(aVar, this.aoW);
        e(aVar);
        if (c) {
            this.dpr = d(aVar, this.aoW);
            a(rightPanelDelegate, this.dpr);
            return;
        }
        this.dpr.T(aVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = this.anF;
        if (!(aVar2 == null || (aVar2.getActiveId() == aVar.getActiveId() && this.anF.getInstrumentType() == aVar.getInstrumentType()))) {
            this.cXM.aHF();
        }
        Z(aVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void ab(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        RightPanelDelegate rightPanelDelegate = this.dpr;
        if (c(aVar, this.aoW)) {
            this.dpr = d(aVar, this.aoW);
            a(rightPanelDelegate, this.dpr);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c(@Nullable com.iqoption.core.microservices.useralerts.response.a aVar) {
        RightPanelDelegate rightPanelDelegate = this.dpr;
        if (c(this.anF, aVar)) {
            this.dpr = d(this.anF, aVar);
            a(rightPanelDelegate, this.dpr);
        }
    }

    private void a(RightPanelDelegate rightPanelDelegate, RightPanelDelegate rightPanelDelegate2) {
        this.dps = true;
        final View e = rightPanelDelegate2.e(LayoutInflater.from(getContext()), this.dpt.ciA);
        this.dpt.ciA.addView(e);
        rightPanelDelegate2.create();
        if (rightPanelDelegate != null) {
            final View childAt = this.dpt.ciA.getChildAt(this.dpt.ciA.getChildCount() - 2);
            ObjectAnimator.ofFloat(childAt, View.ALPHA, new float[]{0.0f}).addListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    e.setAlpha(0.0f);
                }

                public void onAnimationEnd(Animator animator) {
                    childAt.setVisibility(8);
                }
            });
            ObjectAnimator.ofFloat(e, View.ALPHA, new float[]{1.0f}).setInterpolator(c.egR);
            AnimatorSet animatorSet = this.ddI;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.ddI = new AnimatorSet();
            com.iqoption.core.util.b.a(this.ddI, 500).setInterpolator(c.egR);
            this.ddI.playTogether(new Animator[]{r3, r1});
            this.ddI.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    RightPanelFragment.this.dpt.ciA.removeViewAt(0);
                    RightPanelFragment.this.ddI = null;
                }
            });
            this.ddI.start();
            rightPanelDelegate.destroy();
        }
        this.dps = false;
    }

    public void ac(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        if (this.dps) {
            com.iqoption.core.c.a.biN.post(new -$$Lambda$RightPanelFragment$2Awcry9QhQyF-zY-ec_Ou_BFMpI(this, aVar));
        } else {
            ad(aVar);
        }
    }

    private /* synthetic */ void ag(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        ad(aVar);
    }

    private void ad(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        RightPanelDelegate rightPanelDelegate = this.dpr;
        this.dpr = d(aVar, this.aoW);
        a(rightPanelDelegate, this.dpr);
    }

    private boolean c(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar, @Nullable com.iqoption.core.microservices.useralerts.response.a aVar2) {
        if (this.anF == null) {
            return true;
        }
        RightPanelDelegate rightPanelDelegate = this.dpr;
        if (rightPanelDelegate == null) {
            return true;
        }
        return rightPanelDelegate.b(aVar, aVar2) ^ 1;
    }

    private RightPanelDelegate d(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar, @Nullable com.iqoption.core.microservices.useralerts.response.a aVar2) {
        if (aVar2 != null) {
            return new PriceAlertDelegate(this, aVar, aVar2);
        }
        switch (aVar.getInstrumentType()) {
            case TURBO_INSTRUMENT:
            case BINARY_INSTRUMENT:
                if (!com.iqoption.util.c.a.z(aVar) || aVar.isSuspended()) {
                    return new ClosedRightPanelDelegate(this, aVar);
                }
                return new BinaryRightPanelDelegate(this, aVar);
            case DIGITAL_INSTRUMENT:
                if (!com.iqoption.util.c.a.z(aVar) || aVar.isSuspended()) {
                    return new ClosedRightPanelDelegate(this, aVar);
                }
                return new DigitalRightPanelDelegate(this, aVar);
            case MULTI_INSTRUMENT:
                if (!com.iqoption.util.c.a.z(aVar) || aVar.isSuspended()) {
                    return new ClosedRightPanelDelegate(this, aVar);
                }
                return new MultiRightPanelDelegate(this, aVar);
            case CRYPTO_INSTRUMENT:
            case CFD_INSTRUMENT:
            case FOREX_INSTRUMENT:
                if (com.iqoption.util.c.a.z(aVar) && !aVar.isSuspended()) {
                    return new CfdRightPanelDelegate(this, aVar);
                }
                if (!ae(aVar) || aVar.isSuspended()) {
                    return new ClosedRightPanelDelegate(this, aVar);
                }
                return new CfdOnOpenRightPanelDelegate(this, aVar);
            case FX_INSTRUMENT:
                if (!com.iqoption.util.c.a.z(aVar) || aVar.isSuspended()) {
                    return new ClosedRightPanelDelegate(this, aVar);
                }
                return new FxRightPanelDelegate(this, aVar);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Active with type: ");
                stringBuilder.append(aVar.getInstrumentType());
                stringBuilder.append(" is not supported");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private boolean ae(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return aVar.getInstrumentType() == InstrumentType.CFD_INSTRUMENT && af(aVar) && com.iqoption.app.managers.feature.a.ef(Order.ON_MKT_OPEN);
    }

    public void aHM() {
        m.a(getActivity(), getActivity().getSupportFragmentManager(), (int) R.id.fragment);
    }

    private boolean af(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return aVar.aY(l.HZ().Ib()) != Long.MAX_VALUE;
    }

    /* Access modifiers changed, original: 0000 */
    public void c(@NonNull String str, @Nullable String str2, boolean z, @Nullable Integer num) {
        l lVar = new l(str, str2, z, num);
        if (!Objects.equals(this.dpv, lVar)) {
            this.dpv = lVar;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                if (supportFragmentManager != null) {
                    String str3 = k.TAG;
                    k kVar = (k) supportFragmentManager.findFragmentByTag(str3);
                    if (kVar != null) {
                        kVar.setMessage(str);
                        kVar.ix(str2);
                        kVar.ed(z);
                    } else {
                        supportFragmentManager.beginTransaction().add(R.id.fragment, k.b(lVar), str3).commitNowAllowingStateLoss();
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aGt() {
        if (this.dpv != null) {
            this.dpv = null;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                if (supportFragmentManager != null) {
                    supportFragmentManager.beginTransaction().remove(supportFragmentManager.findFragmentByTag(k.TAG)).commitNowAllowingStateLoss();
                }
            }
        }
    }
}
