package com.iqoption.fragment;

import android.animation.Animator;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.iqoption.analytics.n;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.f;
import com.iqoption.app.managers.feature.c;
import com.iqoption.core.util.af;
import com.iqoption.core.util.j;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.nh;
import com.iqoption.fragment.b.d;
import com.iqoption.fragment.dialog.h;
import com.iqoption.system.a.e;
import com.iqoption.system.a.g;
import com.iqoption.util.EventSenderLifecycleObserver;
import com.iqoption.util.ab;
import com.iqoption.util.ai;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import kotlin.l;

/* compiled from: TokenBalanceFragment */
public class ag extends d {
    private Animator cXg;
    private double cXh = 0.0d;
    final JsonObject cXi = new JsonObject();
    private final a cXj = new a(this);
    private final b cXk = new b(this);
    private final DecimalFormat cXl = j.fq(2);
    private final DecimalFormat cXm = com.iqoption.util.j.aWK();
    private final f cXn = new f(new -$$Lambda$ag$YT2ziEjBciSskdx3vfrMsRcSu1g(this));
    private nh cXo;
    private final boolean cXp = com.iqoption.app.managers.feature.a.Ii();

    /* compiled from: TokenBalanceFragment */
    private static final class a extends e<ag> {
        public a(ag agVar) {
            super(agVar);
        }

        @com.google.common.b.e
        public void onBalanceFetched(com.iqoption.app.managers.e.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    ag agVar = (ag) a.this.dUo.get();
                    if (agVar != null && agVar.isAdded()) {
                        agVar.ayo();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onEmissionInfoFetchedEvent(com.iqoption.app.managers.e.b bVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    ag agVar = (ag) a.this.dUo.get();
                    if (agVar != null && agVar.isAdded()) {
                        agVar.ayo();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onLeaderBoardResponseFetched(com.iqoption.app.managers.d.a aVar) {
            if (((Boolean) aVar.getValue()).booleanValue()) {
                com.iqoption.core.c.a.biN.execute(new Runnable() {
                    public void run() {
                        ag agVar = (ag) a.this.dUo.get();
                        if (agVar != null && agVar.isAdded()) {
                            agVar.ayq();
                        }
                    }
                });
            }
        }
    }

    /* compiled from: TokenBalanceFragment */
    private static class b extends g<ag> {
        public b(ag agVar) {
            super(agVar);
        }

        @com.google.common.b.e
        public void onUpdateBalanceFragment(com.iqoption.service.e.j jVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    ag agVar = (ag) b.this.dUo.get();
                    if (agVar != null && agVar.isAdded()) {
                        agVar.ayo();
                    }
                }
            });
        }
    }

    public static ag ayl() {
        return new ag();
    }

    @NonNull
    private FragmentManager aym() {
        return requireActivity().getSupportFragmentManager();
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cXo = (nh) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_token_balance, viewGroup, false);
        this.cXo.a(this);
        this.cXo.ciK.setLayoutTransition(ak.anP());
        this.cXo.ciL.setLayoutTransition(ak.anP());
        if (!this.cXp) {
            this.cXo.ciO.setVisibility(8);
            this.cXo.cjp.setVisibility(8);
            this.cXo.cju.setVisibility(8);
            this.cXo.cjv.setVisibility(8);
            this.cXo.ciY.setVisibility(8);
            this.cXo.ciP.setVisibility(8);
            this.cXo.ciQ.setVisibility(8);
            this.cXo.ciU.setVisibility(8);
            this.cXo.ciT.setVisibility(8);
            this.cXo.cjs.setVisibility(8);
            this.cXo.ciM.setVisibility(8);
            this.cXo.ciZ.setVisibility(8);
            this.cXo.ciL.setBackground(null);
        }
        this.cXo.cjw.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                com.iqoption.app.b DG = com.iqoption.app.b.DG();
                Balance DM = DG.DM();
                if (DM != null) {
                    ag.this.dr(true);
                    ConversionCurrency du = DG.du(Balance.getCurrency(DM));
                    n.a(DM.amount.doubleValue(), du != null ? du.getName() : "");
                }
            }
        });
        this.cXo.cje.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                String str = "otn_commmision";
                int dX = com.iqoption.app.d.dX(str) ^ 1;
                ag.this.cXo.cjg.setChecked(dX);
                com.iqoption.app.d.i(str, dX);
                IQApp.Ex().bd(new com.iqoption.fragment.y.a().setValue(Boolean.valueOf(dX)));
                n.aG(dX);
            }
        });
        this.cXo.cju.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                int isSelected = view.isSelected() ^ 1;
                view.setSelected(isSelected);
                int i = 0;
                ag.this.cXo.cjv.setVisibility(isSelected != 0 ? 0 : 8);
                TextView textView = ag.this.cXo.ciY;
                if (isSelected == 0) {
                    i = 8;
                }
                textView.setVisibility(i);
            }
        });
        this.cXo.cjk.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                int isSelected = view.isSelected() ^ 1;
                view.setSelected(isSelected);
                ag.this.cXo.cjl.setVisibility(isSelected != 0 ? 0 : 8);
            }
        });
        this.cXo.ciP.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                int isSelected = view.isSelected() ^ 1;
                view.setSelected(isSelected);
                int i = 0;
                ag.this.cXo.ciQ.setVisibility(isSelected != 0 ? 0 : 8);
                ag.this.cXo.ciT.setVisibility(isSelected != 0 ? 0 : 8);
                ag.this.cXo.ciU.setVisibility(isSelected != 0 ? 0 : 8);
                view = ag.this.cXo.ciO;
                if (isSelected == 0) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        });
        this.cXo.cjd.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                ag.this.ayn();
            }
        });
        ayo();
        return this.cXo.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        getLifecycle().addObserver(new EventSenderLifecycleObserver("otn_show-left-bar-menu", new -$$Lambda$ag$LU38Nboge9L2amjitLpnV2EUW6c(this)));
    }

    private /* synthetic */ l f(Builder builder) {
        this.cXi.add("pay_commission_otn", new JsonPrimitive(Boolean.valueOf(com.iqoption.app.d.dX("otn_commmision"))));
        builder.setValue(Double.valueOf(this.cXh)).setParameters(this.cXi);
        return null;
    }

    private void ayn() {
        String str = "WebFragment";
        aym().beginTransaction().add(R.id.other_fragment, aj.O(new com.iqoption.util.e().aF("EXTRA_URL", "https://otn.org/?aff=6&afftrack=android_app").toBundle()), str).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(str).commit();
    }

    private void ayo() {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        if (DG.DJ() != 1 || DG.Ej()) {
            this.cXo.cjj.setVisibility(8);
            this.cXo.cjm.setVisibility(8);
            this.cXo.ciH.setVisibility(8);
            this.cXo.ciZ.setVisibility(8);
            this.cXo.cjw.setVisibility(8);
            this.cXo.ciL.setVisibility(8);
            this.cXo.ciP.setVisibility(8);
            this.cXo.ciQ.setVisibility(8);
            this.cXo.ciT.setVisibility(8);
            this.cXo.ciU.setVisibility(8);
            this.cXo.cjq.setVisibility(8);
            this.cXo.cjq.setVisibility(8);
            this.cXo.cjr.setVisibility(0);
        } else {
            String str;
            com.iqoption.app.managers.e eVar;
            ConversionCurrency du = DG.du(Currencies.OTN_CURRENCY);
            ConversionCurrency du2 = DG.du(Balance.getCurrency(DG.dH(1)));
            String c = com.iqoption.util.j.c(du2);
            double doubleValue = com.iqoption.util.j.b(du2).doubleValue();
            double doubleValue2 = com.iqoption.util.j.b(du).doubleValue();
            this.cXo.ciH.setVisibility(0);
            this.cXo.ciL.setVisibility(0);
            com.iqoption.app.managers.e Hv = com.iqoption.app.managers.e.Hv();
            Balance DM = DG.DM();
            String str2 = Currencies.REPLACE_CURRENCY_MASK;
            if (DM == null) {
                ayp();
                String str3 = str2;
                a(doubleValue2, doubleValue, c);
                this.cXo.cjj.setVisibility(8);
                this.cXo.cjw.setVisibility(8);
                this.cXo.cjk.setVisibility(8);
                this.cXo.cje.setVisibility(8);
                this.cXo.ciZ.setVisibility(0);
                str = str3;
                eVar = Hv;
            } else {
                this.cXo.cjj.setVisibility(0);
                this.cXo.cjw.setVisibility(0);
                ayp();
                String str4 = str2;
                a(doubleValue2, doubleValue, c);
                if (Balance.getBalanceValue(DM) > 0.0d) {
                    this.cXo.cjw.setEnabled(true);
                    this.cXo.ciH.setVisibility(0);
                    this.cXo.ciZ.setVisibility(8);
                } else {
                    this.cXo.cjw.setEnabled(false);
                    this.cXo.ciH.setVisibility(8);
                    if (this.cXp) {
                        this.cXo.ciZ.setVisibility(0);
                    }
                }
                this.cXh = Balance.getBalanceValue(DM);
                str2 = str4;
                this.cXo.cji.setText(com.iqoption.util.j.a(str2, Double.valueOf(this.cXh), this.cXm));
                this.cXo.cjk.setVisibility(0);
                this.cXo.cje.setVisibility(0);
                this.cXo.cjg.setChecked(com.iqoption.app.d.dX("otn_commmision"));
                if (c.Iw().ep("show-otn-rate")) {
                    str = str2;
                    eVar = Hv;
                    this.cXo.cjh.setText(a(doubleValue2, Balance.getBalanceValue(DM), doubleValue, c));
                    this.cXo.cjh.setVisibility(0);
                } else {
                    str = str2;
                    eVar = Hv;
                    this.cXo.cjh.setVisibility(8);
                }
            }
            com.iqoption.app.managers.e eVar2 = eVar;
            a(eVar2, str, c, Double.valueOf(doubleValue));
            a(eVar2, str);
        }
        this.cXo.cjd.setVisibility(8);
        this.cXo.cjc.setVisibility(8);
        if (this.cXo.ciZ.getVisibility() == 0 && com.iqoption.app.d.dX("otn_loyalty_teaser_played_token_balance_panel")) {
            this.cXo.ciZ.aYi();
        }
    }

    private void onUpdateStockValue(Double d, Double d2) {
        if (isAdded()) {
            if (d != null) {
                ai aWX = new ai().cs(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.white))).jP(com.iqoption.core.util.e.q(d.doubleValue())).aWX();
                if (d2 != null) {
                    aWX.cs(new ForegroundColorSpan(ContextCompat.getColor(getContext(), d2.doubleValue() >= 0.0d ? R.color.green : R.color.red))).jP(" (").jP(af.r(d2.doubleValue())).jP(")").aWX();
                }
                this.cXo.cjm.setText(aWX.anA());
            } else {
                this.cXo.cjm.setText(getString(R.string.n_a));
            }
        }
    }

    private void ayp() {
        if (this.cXn.isEnabled()) {
            this.cXn.HN();
            return;
        }
        this.cXo.cjm.setTextColor(ContextCompat.getColor(getContext(), R.color.grey_blur));
        this.cXo.cjm.setText(getString(R.string.coming_soon));
    }

    private void a(double d, double d2, String str) {
        if (c.Iw().ep("show-otn-rate")) {
            this.cXo.cjb.setText(com.iqoption.util.j.a(str, com.iqoption.util.j.b(com.iqoption.util.j.c(Double.valueOf(1.0d), Double.valueOf(d)), Double.valueOf(d2)), this.cXl));
            this.cXo.cja.setVisibility(0);
            return;
        }
        this.cXo.cja.setVisibility(8);
    }

    private void a(com.iqoption.app.managers.e eVar, String str, String str2, Double d) {
        if (this.cXp) {
            Number HG = eVar.HG();
            if (HG == null || HG.doubleValue() <= 0.0d) {
                this.cXo.ciN.setVisibility(8);
                this.cXo.cjs.setVisibility(8);
                this.cXo.ciZ.setVisibility(0);
            } else {
                this.cXo.cjt.setText(com.iqoption.util.j.a(str2, Double.valueOf(com.iqoption.util.j.b((Double) HG, d).doubleValue()), this.cXl));
                BigDecimal HF = eVar.HF();
                if (HF != null) {
                    this.cXo.ciX.setText(com.iqoption.util.j.a(str, Double.valueOf(HF.doubleValue()), this.cXm));
                    BigDecimal HK = eVar.HK();
                    if (HK != null) {
                        double j = ab.j(HK.doubleValue(), HF.doubleValue());
                        str2 = getString(R.string.of_all_tokens_distributed_this_week_short);
                        if (com.google.common.c.a.b(j, 0.0d, 0.001d)) {
                            this.cXo.ciN.setVisibility(8);
                        } else {
                            this.cXo.ciN.setText(new ai().cs(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.otn))).jP(af.b(j, "", 2)).aWX().jP(" ").jP(str2).anA());
                            this.cXo.ciN.setVisibility(0);
                        }
                    } else {
                        this.cXo.ciN.setVisibility(8);
                    }
                } else {
                    this.cXo.ciX.setText(null);
                }
                this.cXo.cjs.setVisibility(0);
                this.cXi.add("weekly_turnover_expected", new JsonPrimitive(HG));
                if (!com.iqoption.app.d.dX("first_show_turnover_info") && this.cXg == null) {
                    this.cXg = com.iqoption.core.util.b.ay(this.cXo.ciV);
                    this.cXg.start();
                }
            }
            ayq();
        }
    }

    private void ayq() {
        if (this.cXp) {
            int am = com.iqoption.app.managers.d.Hs().am(0);
            int an = com.iqoption.app.managers.d.Hs().an(0);
            if (an == 0 || am == 0) {
                this.cXo.cjy.setVisibility(8);
            } else {
                String[] split = getString(R.string.you_re_of).split(Currencies.REPLACE_CURRENCY_MASK);
                this.cXo.cjy.setText(new ai().jP(split[0]).cs(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.otn))).jP(String.valueOf(am)).aWX().jP(split[1]).jP(String.valueOf(an)).anA());
                this.cXo.cjy.setVisibility(0);
            }
            if (this.cXo.ciN.getVisibility() == 8 && this.cXo.cjy.getVisibility() == 8) {
                this.cXo.ciM.setVisibility(8);
            } else {
                this.cXo.ciM.setVisibility(0);
            }
        }
    }

    private void a(com.iqoption.app.managers.e eVar, String str) {
        if (this.cXp) {
            double d;
            this.cXo.ciP.setVisibility(0);
            BigDecimal HK = eVar.HK();
            BigDecimal HL = eVar.HL();
            if (HK != null) {
                this.cXo.ciS.setText(com.iqoption.util.j.a(str, Double.valueOf(HK.doubleValue()), this.cXm));
            } else {
                this.cXo.ciS.setText(getString(R.string.n_a));
            }
            if (HL != null) {
                this.cXo.ciR.setText(com.iqoption.util.j.a(str, Double.valueOf(HL.doubleValue()), this.cXm));
            } else {
                this.cXo.ciR.setText(getString(R.string.n_a));
            }
            int size = eVar.HM().size() + 1;
            BigDecimal HJ = eVar.HJ();
            BigDecimal HI = eVar.HI();
            this.cXo.cjo.setText(getString(R.string.tokens_left_week_n1, String.valueOf(size)));
            if (HI == null) {
                d = 0.0d;
            } else {
                d = HI.doubleValue();
            }
            d -= HJ == null ? 0.0d : HJ.doubleValue();
            this.cXo.cjq.setText(d > 0.0d ? com.iqoption.util.j.a(str, Double.valueOf(d), this.cXm) : getString(R.string.n_a));
            this.cXi.add("week_num", new JsonPrimitive(Integer.valueOf(size)));
        }
    }

    private void dr(boolean z) {
        if (z) {
            this.cXo.ciJ.setVisibility(0);
            this.cXo.cjx.setText(null);
            return;
        }
        this.cXo.ciJ.setVisibility(8);
        this.cXo.cjx.setText(R.string.withdraw);
    }

    private String a(double d, double d2, double d3, String str) {
        String str2 = "otn_usd_rate";
        this.cXi.add(str2, new JsonPrimitive(com.iqoption.util.j.b(com.iqoption.util.j.c(Double.valueOf(1.0d), Double.valueOf(d)), Double.valueOf(d3))));
        return getString(R.string.you_have_n1_by_int_rate, com.iqoption.util.j.a(str, Double.valueOf(r3.doubleValue() * d2), this.cXl));
    }

    public void onPause() {
        super.onPause();
        this.cXn.onPause();
        Animator animator = this.cXg;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void onResume() {
        super.onResume();
        this.cXn.onResume();
        Animator animator = this.cXg;
        if (animator != null && !animator.isRunning()) {
            this.cXg.start();
        }
    }

    public void onStop() {
        super.onStop();
        this.cXj.unregister();
        this.cXk.unregister();
    }

    public void onStart() {
        super.onStart();
        this.cXj.register();
        this.cXk.register();
        com.iqoption.app.managers.e.Hv().Hx();
        if (com.iqoption.app.managers.feature.a.Ij()) {
            com.iqoption.app.managers.d.Hs().al(0);
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
        if (z && onCreateAnimation != null) {
            onCreateAnimation.setAnimationListener(com.iqoption.view.a.a.a.a.c(new -$$Lambda$ag$5N3npbgii1Cpk_Lzg3ONXIk29BA(this)));
        }
        return onCreateAnimation;
    }

    private /* synthetic */ void ays() {
        if (this.cXo.ciZ.getVisibility() == 0) {
            String str = "otn_loyalty_teaser_played_token_balance_panel";
            if (!com.iqoption.app.d.dX(str)) {
                com.iqoption.app.d.i(str, true);
                this.cXo.ciZ.play();
            }
        }
    }

    public void ayr() {
        h.a(R.id.fragment, aym());
        com.iqoption.app.d.i("first_show_turnover_info", true);
        Animator animator = this.cXg;
        if (animator != null) {
            animator.cancel();
            this.cXg = null;
        }
        n.Cw();
    }
}
