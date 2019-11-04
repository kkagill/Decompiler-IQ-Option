package com.iqoption.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.google.common.base.j;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.aj;
import com.google.common.collect.i;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.c.h;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.view.AnimatedVectorSwitchView;
import com.iqoption.x.R;
import java.util.Comparator;

/* compiled from: BalancesAdapter */
public class c extends Adapter {
    private static final String TAG = b.class.getName();
    private static ImmutableMap<String, Integer> alt;
    private final Comparator<Balance> alA = new -$$Lambda$c$FWs0oY9RzLV7APxF8t4imbd9BOE(this);
    private final j<Balance> alB = -$$Lambda$c$Hde83DNdQlmLowRMf0U79VnTb_A.INSTANCE;
    private final j<Balance> alC = -$$Lambda$c$ot-hSG7DK1ky65BSKgOQYM6wdpU.INSTANCE;
    private final j<Balance> alD = -$$Lambda$c$DY83VOhsGIV04vDh9IEFgxoX8Og.INSTANCE;
    private final boolean alp;
    private final boolean alq;
    private final ConversionCurrency alr;
    private int als = -1;
    private c alu;
    private ImmutableList<Balance> alv;
    private Long alw;
    private int alx;
    private final g aly = new g(IQApp.Eu());
    @Nullable
    private RecyclerView alz;

    /* compiled from: BalancesAdapter */
    public interface c {
        void AJ();

        void a(View view, a aVar, int i);

        void dq(int i);
    }

    /* compiled from: BalancesAdapter */
    public final class g {
        private final String ame = "(%s)";
        private final String amf;
        private final String amg;
        private final String amh;
        private final int ami;
        @ColorInt
        public final int amj;
        @ColorInt
        public final int amk;
        @ColorInt
        public final int aml;

        public g(Context context) {
            String string = context.getString(R.string.total);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(": %s");
            this.amh = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("%s ");
            stringBuilder2.append(context.getString(R.string.cash));
            this.amf = stringBuilder2.toString();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("%s (");
            stringBuilder2.append(context.getString(R.string.only_exchange));
            stringBuilder2.append(")");
            this.amg = stringBuilder2.toString();
            this.ami = context.getResources().getDimensionPixelSize(R.dimen.dp4);
            this.amj = ContextCompat.getColor(context, R.color.green);
            this.amk = ContextCompat.getColor(context, R.color.red);
            this.aml = ContextCompat.getColor(context, R.color.white);
        }
    }

    /* compiled from: BalancesAdapter */
    public static class a extends ViewHolder implements OnClickListener {
        c alG;
        TextView alH;
        TextView alI;
        ViewGroup alJ;
        ViewSwitcher alK;
        AnimatedVectorSwitchView alL;
        View alM;
        g aly;

        a(View view, c cVar, g gVar) {
            super(view);
            this.aly = gVar;
            this.alJ = (ViewGroup) view.findViewById(R.id.base_balance_item);
            this.alK = (ViewSwitcher) view.findViewById(R.id.checkboxFrame);
            this.alH = (TextView) view.findViewById(R.id.title);
            this.alI = (TextView) view.findViewById(R.id.balance);
            this.alL = (AnimatedVectorSwitchView) view.findViewById(R.id.selectedCheckView);
            this.alM = view.findViewById(R.id.loading_change);
            this.alJ.setOnClickListener(this);
            AnimatedVectorSwitchView animatedVectorSwitchView = this.alL;
            if (animatedVectorSwitchView != null) {
                animatedVectorSwitchView.setOnClickListener(this);
            }
            this.alG = cVar;
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            c cVar = this.alG;
            if (cVar != null && adapterPosition >= 0) {
                cVar.a(view, this, adapterPosition);
            }
        }

        public void AH() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{com.iqoption.core.util.b.p(this.alJ, this.aly.ami), com.iqoption.core.util.b.m(this.alH)});
            animatorSet.start();
        }

        public void AI() {
            ViewSwitcher viewSwitcher = this.alK;
            if (viewSwitcher != null) {
                viewSwitcher.showNext();
            }
        }

        public void ax(boolean z) {
            AnimatedVectorSwitchView animatedVectorSwitchView = this.alL;
            if (animatedVectorSwitchView != null) {
                if (z) {
                    animatedVectorSwitchView.setSwitched(true);
                } else {
                    animatedVectorSwitchView.setSwitched(false);
                }
            }
        }

        public void ay(boolean z) {
            ViewSwitcher viewSwitcher = this.alK;
            if (viewSwitcher != null) {
                if (z) {
                    if (viewSwitcher.getNextView().getId() == R.id.loading_change) {
                        this.alK.showNext();
                    }
                } else if (viewSwitcher.getNextView().getId() == R.id.selectedCheckView) {
                    this.alK.showNext();
                }
            }
        }
    }

    /* compiled from: BalancesAdapter */
    public static class b extends a {
        TextView alN;
        ImageView alO;

        b(View view, c cVar, g gVar) {
            super(view, cVar, gVar);
            this.alN = (TextView) view.findViewById(R.id.balanceExchange);
            this.alO = (ImageView) view.findViewById(R.id.depositBtn);
            this.alO.setOnClickListener(this);
            this.alO.setOnTouchListener(new com.iqoption.view.d.c());
        }
    }

    /* compiled from: BalancesAdapter */
    public static class d extends a {
        TextView alP;
        TextView alQ;
        TextView alR;
        TextView alS;
        TextView alT;
        TextView alU;
        TextView alV;
        TextView alW;
        TextView alX;
        View alY;
        View alZ;
        TextView ama;

        d(RecyclerView recyclerView, View view, c cVar, g gVar) {
            super(view, cVar, gVar);
            this.alS = (TextView) view.findViewById(R.id.invested);
            this.alT = (TextView) view.findViewById(R.id.investedValue);
            this.alU = (TextView) view.findViewById(R.id.pnl);
            this.alV = (TextView) view.findViewById(R.id.pnlValue);
            this.alW = (TextView) view.findViewById(R.id.profit);
            this.alX = (TextView) view.findViewById(R.id.profitValue);
            this.alQ = (TextView) view.findViewById(R.id.totalBalance);
            this.alR = (TextView) view.findViewById(R.id.totalPnlBalance);
            this.alP = (TextView) view.findViewById(R.id.totalBalanceInfo);
            View findViewById = view.findViewById(R.id.withdrawalBtn);
            View findViewById2 = view.findViewById(R.id.depositBtn);
            findViewById.setOnClickListener(this);
            findViewById2.setOnClickListener(this);
            findViewById.setOnTouchListener(new com.iqoption.view.d.c());
            findViewById2.setOnTouchListener(new com.iqoption.view.d.c());
            this.alY = view.findViewById(R.id.totalArrow);
            this.alY.setOnClickListener(new -$$Lambda$c$d$IBaQMpiLC4I30T19IBnjOnYckl8(this, recyclerView));
            this.alR.setOnClickListener(new -$$Lambda$c$d$BdsLSOtJZAiU3mecq2egaMNFa3c(this, recyclerView));
            this.alZ = view.findViewById(R.id.balanceAuthContainer);
            this.ama = (TextView) view.findViewById(R.id.balanceAuth);
        }

        private /* synthetic */ void b(RecyclerView recyclerView, View view) {
            c.beginDelayedTransition(recyclerView);
            int isSelected = this.alY.isSelected() ^ 1;
            this.alY.setSelected(isSelected);
            this.alY.animate().rotation(isSelected != 0 ? 180.0f : 0.0f).setInterpolator(com.iqoption.view.a.a.c.egR).start();
            az(isSelected);
        }

        private /* synthetic */ void a(RecyclerView recyclerView, View view) {
            if (this.alP != null) {
                c.beginDelayedTransition(recyclerView);
                int i = 0;
                boolean z = this.alP.getVisibility() != 0;
                TextView textView = this.alP;
                if (!z) {
                    i = 8;
                }
                textView.setVisibility(i);
                this.alR.setSelected(z);
            }
        }

        private void az(boolean z) {
            int i = 0;
            this.alS.setVisibility(z ? 0 : 8);
            this.alT.setVisibility(z ? 0 : 8);
            this.alU.setVisibility(z ? 0 : 8);
            this.alV.setVisibility(z ? 0 : 8);
            this.alW.setVisibility(z ? 0 : 8);
            TextView textView = this.alX;
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        }

        public void a(h hVar, String str, double d, double d2) {
            String format = String.format(this.aly.ame, new Object[]{str});
            this.alT.setText(com.iqoption.util.j.d(str, Double.valueOf(hVar.getInvest())));
            this.alV.setText(com.iqoption.util.j.b(str, Double.valueOf(hVar.Hp())));
            this.alX.setText(com.iqoption.util.j.d(str, Double.valueOf(hVar.Hq() + d)));
            this.alR.setText(com.iqoption.util.j.c(format, Double.valueOf((d + d2) + hVar.Hq())));
            if (hVar.Hp() < -0.01d) {
                this.alV.setTextColor(this.aly.amk);
            } else {
                this.alV.setTextColor(this.aly.amj);
            }
            this.alR.setVisibility(0);
            this.alY.setVisibility(0);
        }

        public void AK() {
            az(false);
            this.alR.setVisibility(8);
            this.alP.setVisibility(8);
            this.alY.setVisibility(8);
            this.alR.setSelected(false);
        }
    }

    /* compiled from: BalancesAdapter */
    public static class e extends a {
        TextView alP;
        TextView alQ;
        TextView alR;
        TextView alS;
        TextView alT;
        TextView alU;
        TextView alV;
        TextView alW;
        TextView alX;
        View alY;
        View amb;

        e(RecyclerView recyclerView, View view, c cVar, g gVar) {
            super(view, cVar, gVar);
            this.amb = view.findViewById(R.id.refresh_traning_balance);
            this.amb.setOnClickListener(this);
            this.alQ = (TextView) view.findViewById(R.id.totalBalance);
            this.alR = (TextView) view.findViewById(R.id.totalPnlBalance);
            this.alP = (TextView) view.findViewById(R.id.totalBalanceInfo);
            this.alS = (TextView) view.findViewById(R.id.invested);
            this.alT = (TextView) view.findViewById(R.id.investedValue);
            this.alU = (TextView) view.findViewById(R.id.pnl);
            this.alV = (TextView) view.findViewById(R.id.pnlValue);
            this.alW = (TextView) view.findViewById(R.id.profit);
            this.alX = (TextView) view.findViewById(R.id.profitValue);
            this.alY = view.findViewById(R.id.totalArrow);
            this.alY.setOnClickListener(new -$$Lambda$c$e$MOFIOHLK6fCca7DVgIeCdwrU6fE(this, recyclerView));
            this.alR.setOnClickListener(new -$$Lambda$c$e$kSdkPwVH0qcZARxKI0bIQT7Qaqc(this, recyclerView));
        }

        private /* synthetic */ void b(RecyclerView recyclerView, View view) {
            c.beginDelayedTransition(recyclerView);
            int isSelected = this.alY.isSelected() ^ 1;
            this.alY.setSelected(isSelected);
            this.alY.animate().rotation(isSelected != 0 ? 180.0f : 0.0f).setInterpolator(com.iqoption.view.a.a.c.egR).start();
            az(isSelected);
        }

        private /* synthetic */ void a(RecyclerView recyclerView, View view) {
            c.beginDelayedTransition(recyclerView);
            int isSelected = this.alR.isSelected() ^ 1;
            this.alP.setVisibility(isSelected != 0 ? 0 : 8);
            this.alR.setSelected(isSelected);
            isSelected = getAdapterPosition();
            if (this.alG != null && isSelected >= 0) {
                this.alG.dq(isSelected);
            }
        }

        private void az(boolean z) {
            int i = 0;
            this.alS.setVisibility(z ? 0 : 8);
            this.alT.setVisibility(z ? 0 : 8);
            this.alU.setVisibility(z ? 0 : 8);
            this.alV.setVisibility(z ? 0 : 8);
            this.alW.setVisibility(z ? 0 : 8);
            TextView textView = this.alX;
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        }

        public void a(h hVar, String str, Double d) {
            String format = String.format(this.aly.ame, new Object[]{str});
            this.alT.setText(com.iqoption.util.j.d(str, Double.valueOf(hVar.getInvest())));
            this.alV.setText(com.iqoption.util.j.b(str, Double.valueOf(hVar.Hp())));
            this.alX.setText(com.iqoption.util.j.d(str, Double.valueOf(d.doubleValue() + hVar.Hq())));
            this.alR.setText(com.iqoption.util.j.c(format, Double.valueOf(d.doubleValue() + hVar.Hq())));
            if (hVar.Hp() < -0.01d) {
                this.alV.setTextColor(this.aly.amk);
            } else {
                this.alV.setTextColor(this.aly.amj);
            }
            this.alR.setVisibility(0);
            this.alY.setVisibility(0);
        }

        public void AK() {
            az(false);
            this.alR.setVisibility(8);
            this.alP.setVisibility(8);
            this.alY.setVisibility(8);
            this.alR.setSelected(false);
        }

        public void AL() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.amb, View.ROTATION, new float[]{0.0f});
            ofFloat.setInterpolator(com.iqoption.view.a.a.c.bhT);
            ofFloat.start();
        }

        public void AM() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.amb, View.ROTATION, new float[]{360.0f});
            ofFloat.setDuration(400);
            ofFloat.setInterpolator(com.iqoption.view.a.a.c.bhT);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(Integer.MAX_VALUE);
            ofFloat.start();
        }
    }

    /* compiled from: BalancesAdapter */
    public static class f extends a {
        TextView alP;
        TextView alQ;
        TextView alR;
        TextView alS;
        TextView alT;
        TextView alU;
        TextView alV;
        TextView alW;
        TextView alX;
        View alY;
        View amc;
        View amd;

        f(RecyclerView recyclerView, View view, c cVar, g gVar) {
            super(view, cVar, gVar);
            this.amd = view.findViewById(R.id.registrationButton);
            this.amd.setOnTouchListener(new com.iqoption.view.d.c());
            this.amd.setOnClickListener(this);
            this.amc = view.findViewById(R.id.refresh_trial_balance);
            this.amc.setOnClickListener(this);
            this.alQ = (TextView) view.findViewById(R.id.totalBalance);
            this.alR = (TextView) view.findViewById(R.id.totalPnlBalance);
            this.alP = (TextView) view.findViewById(R.id.totalBalanceInfo);
            this.alS = (TextView) view.findViewById(R.id.invested);
            this.alT = (TextView) view.findViewById(R.id.investedValue);
            this.alU = (TextView) view.findViewById(R.id.pnl);
            this.alV = (TextView) view.findViewById(R.id.pnlValue);
            this.alW = (TextView) view.findViewById(R.id.profit);
            this.alX = (TextView) view.findViewById(R.id.profitValue);
            this.alY = view.findViewById(R.id.totalArrow);
            this.alY.setOnClickListener(new -$$Lambda$c$f$u4soiP8fcFkTDGtTuqYaDyn8nF0(this, recyclerView));
            this.alR.setOnClickListener(new -$$Lambda$c$f$GD-XGnq1JElWq2z32Zkox5yks18(this, recyclerView));
        }

        private /* synthetic */ void b(RecyclerView recyclerView, View view) {
            c.beginDelayedTransition(recyclerView);
            int isSelected = this.alY.isSelected() ^ 1;
            this.alY.setSelected(isSelected);
            this.alY.animate().rotation(isSelected != 0 ? 180.0f : 0.0f).setInterpolator(com.iqoption.view.a.a.c.egR).start();
            az(isSelected);
        }

        private /* synthetic */ void a(RecyclerView recyclerView, View view) {
            c.beginDelayedTransition(recyclerView);
            int isSelected = this.alR.isSelected() ^ 1;
            this.alP.setVisibility(isSelected != 0 ? 0 : 8);
            this.alR.setSelected(isSelected);
            isSelected = getAdapterPosition();
            if (this.alG != null && isSelected >= 0) {
                this.alG.dq(isSelected);
            }
        }

        private void az(boolean z) {
            int i = 0;
            this.alS.setVisibility(z ? 0 : 8);
            this.alT.setVisibility(z ? 0 : 8);
            this.alU.setVisibility(z ? 0 : 8);
            this.alV.setVisibility(z ? 0 : 8);
            this.alW.setVisibility(z ? 0 : 8);
            TextView textView = this.alX;
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        }

        public void a(h hVar, String str, Double d) {
            String format = String.format(this.aly.ame, new Object[]{str});
            this.alT.setText(com.iqoption.util.j.d(str, Double.valueOf(hVar.getInvest())));
            this.alV.setText(com.iqoption.util.j.b(str, Double.valueOf(hVar.Hp())));
            this.alX.setText(com.iqoption.util.j.d(str, Double.valueOf(d.doubleValue() + hVar.Hq())));
            this.alR.setText(com.iqoption.util.j.c(format, Double.valueOf(d.doubleValue() + hVar.Hq())));
            if (hVar.Hp() < -0.01d) {
                this.alV.setTextColor(this.aly.amk);
            } else {
                this.alV.setTextColor(this.aly.amj);
            }
            this.alR.setVisibility(0);
            this.alY.setVisibility(0);
        }

        public void AK() {
            az(false);
            this.alR.setVisibility(8);
            this.alP.setVisibility(8);
            this.alY.setVisibility(8);
            this.alR.setSelected(false);
        }
    }

    static {
        String str = "BTG";
        str = "OMG";
        str = "ZEC";
        str = "XRP";
        str = "NEO";
        str = "ETC";
        str = "BTH";
        str = "DSH";
        str = "QTM";
        str = "LTC";
        str = "XMR";
        str = "XLM";
        str = "TRX";
        str = "EOS";
        alt = ImmutableMap.sX().m(Currencies.OTN_CURRENCY, Integer.valueOf(R.drawable.ic_otn_28)).m(Currencies.BTC_CURRENCY, Integer.valueOf(R.drawable.ic_btc_28)).m(Currencies.ETH_CURRENCY, Integer.valueOf(R.drawable.ic_eth_28)).m(str, Integer.valueOf(R.drawable.ic_btg_28)).m(str, Integer.valueOf(R.drawable.ic_omg_28)).m(str, Integer.valueOf(R.drawable.ic_zec_28)).m(str, Integer.valueOf(R.drawable.ic_xrp_28)).m(str, Integer.valueOf(R.drawable.ic_neo_28)).m(str, Integer.valueOf(R.drawable.ic_etc_28)).m(str, Integer.valueOf(R.drawable.ic_bth_28)).m(str, Integer.valueOf(R.drawable.ic_dsh_28)).m(str, Integer.valueOf(R.drawable.ic_qtm_28)).m(str, Integer.valueOf(R.drawable.ic_ltc_28)).m(str, Integer.valueOf(R.drawable.ic_xmr_28)).m(str, Integer.valueOf(R.drawable.ic_xlm_28)).m(str, Integer.valueOf(R.drawable.ic_trx_28)).m(str, Integer.valueOf(R.drawable.ic_eos_28)).tf();
    }

    public c(c cVar) {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        this.alr = DG.du(Balance.getCurrency(DG.dH(1)));
        this.alp = com.iqoption.app.managers.feature.c.Iw().ej("show-crypto-balances");
        this.alq = false;
        this.alu = cVar;
        AB();
    }

    /* renamed from: do */
    private Integer m6do(int i) {
        if (i == 1) {
            return Integer.valueOf(10);
        }
        if (i == 2) {
            return Integer.valueOf(99);
        }
        if (i == 4) {
            return Integer.valueOf(40);
        }
        if (i != 5) {
            return Integer.valueOf(i);
        }
        return Integer.valueOf(30);
    }

    private static /* synthetic */ boolean c(Balance balance) {
        return Balance.getBalanceType(balance) != 5;
    }

    private static /* synthetic */ boolean b(Balance balance) {
        return Balance.getBalanceType(balance) == 4;
    }

    private static /* synthetic */ boolean a(Balance balance) {
        boolean z = true;
        if (Balance.getBalanceType(balance) != 5) {
            return true;
        }
        if (Balance.getBalanceValue(balance) <= 0.0d) {
            z = false;
        }
        return z;
    }

    public void AB() {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        this.alw = (Long) com.google.common.base.e.g(Long.valueOf(DG.DH()), Long.valueOf(1));
        i b = i.b(DG.DL().values());
        if (DG.Ej()) {
            b = b.b(this.alC);
        }
        if (!this.alp) {
            b = b.b(this.alB);
        }
        this.alv = b.a(this.alA);
        this.als = AC();
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.alz = recyclerView;
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.alz = null;
    }

    private int AC() {
        aj sK = this.alv.iterator();
        int i = 0;
        while (sK.hasNext()) {
            if (((Balance) sK.next()).type == 2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public long getItemId(int i) {
        return dp(i).id;
    }

    public int getItemCount() {
        ImmutableList immutableList = this.alv;
        return immutableList == null ? 0 : immutableList.size();
    }

    public final int getItemViewType(int i) {
        if (i == this.als) {
            return 98;
        }
        i = m6do(dp(i).type).intValue();
        int i2 = 40;
        if (i != 40) {
            return i;
        }
        if (com.iqoption.app.b.DG().Ej()) {
            i2 = 1;
        }
        return i2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new f(this.alz, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.trial_balance_item, viewGroup, false), this.alu, this.aly);
        }
        if (i == 10) {
            return new d(this.alz, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.normal_balance_item, viewGroup, false), this.alu, this.aly);
        }
        if (i == 30) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.crypto_balance_item, viewGroup, false), this.alu, this.aly);
        }
        if (i == 40) {
            return new e(this.alz, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.training_balance_item, viewGroup, false), this.alu, this.aly);
        }
        if (i == 98) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.first_tournament_balance_item, viewGroup, false), this.alu, this.aly);
        }
        if (i == 99) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tournament_balance_item, viewGroup, false), this.alu, this.aly);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported viewType: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String str;
        int i2 = i;
        final a aVar = (a) viewHolder;
        Balance dp = dp(i2);
        double balanceValue = Balance.getBalanceValue(dp);
        String currency = Balance.getCurrency(dp);
        ConversionCurrency du = com.iqoption.app.b.DG().du(currency);
        if (Balance.getBalanceType(dp) == 5) {
            str = Currencies.REPLACE_CURRENCY_MASK;
        } else {
            str = com.iqoption.util.j.c(du);
        }
        String str2 = str;
        boolean GV = com.iqoption.app.managers.c.GS().GV();
        boolean e = e(Long.valueOf(dp.id));
        if (e) {
            this.alx = i2;
        }
        aVar.ax(e);
        String format = String.format(this.aly.amh, new Object[]{str2});
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 1) {
            f fVar = (f) viewHolder;
            fVar.alH.setText(String.format(this.aly.amf, new Object[]{com.iqoption.util.j.d(du)}));
            fVar.alI.setText(com.iqoption.util.j.d(str2, Double.valueOf(balanceValue)));
            fVar.alQ.setText(com.iqoption.util.j.d(format, Double.valueOf(balanceValue)));
            if (GV || !e) {
                fVar.AK();
            } else {
                fVar.a(com.iqoption.app.managers.c.GS().Hf(), str2, Double.valueOf(balanceValue));
            }
            if (balanceValue >= 10000.0d || !e) {
                fVar.amc.setVisibility(8);
            } else {
                fVar.amc.setRotation(0.0f);
                fVar.amc.setVisibility(0);
            }
        } else if (itemViewType == 10) {
            double AD = AD();
            d dVar = (d) viewHolder;
            dVar.alH.setText(String.format(this.aly.amf, new Object[]{com.iqoption.util.j.d(du)}));
            dVar.alI.setText(com.iqoption.util.j.d(str2, Double.valueOf(balanceValue)));
            dVar.alQ.setText(com.iqoption.util.j.d(format, Double.valueOf(balanceValue + AD)));
            if (GV || !e) {
                dVar.AK();
            } else {
                dVar.a(com.iqoption.app.managers.c.GS().Hf(), str2, balanceValue, AD);
            }
            dVar.alP.setText(this.alp ? R.string.total_balance_summarises_your_initial_balance_crypto : R.string.total_balance_summarises_your_initial_balance);
            Double authAmount = dp.getAuthAmount();
            if (authAmount == null || authAmount.doubleValue() <= 0.0d) {
                dVar.alZ.setVisibility(8);
            } else {
                dVar.alZ.setVisibility(0);
                dVar.ama.setText(com.iqoption.util.j.d(str2, authAmount));
                dVar.alZ.setOnClickListener(new com.iqoption.core.ext.g() {
                    public void M(View view) {
                        if (aVar.alG != null) {
                            aVar.alG.AJ();
                        }
                    }
                });
            }
        } else if (itemViewType == 30) {
            b bVar = (b) viewHolder;
            bVar.alH.setText(String.format(this.aly.amg, new Object[]{com.iqoption.util.j.d(du)}));
            bVar.alI.setText(com.iqoption.util.j.a(str2, Double.valueOf(balanceValue), com.iqoption.core.util.j.fq(com.iqoption.util.j.f(du))));
            if (currency.equalsIgnoreCase(Currencies.OTN_CURRENCY)) {
                currency = Currencies.OTM_CURRENCY;
            }
            if (this.alq) {
                bVar.alO.setAlpha(1.0f);
                bVar.alO.setEnabled(true);
            } else {
                bVar.alO.setAlpha(0.2f);
                bVar.alO.setEnabled(false);
            }
            bVar.alN.setText(com.iqoption.util.j.d(com.iqoption.util.j.c(this.alr), Double.valueOf(a(balanceValue, com.iqoption.app.b.DG().du(currency)))));
        } else if (itemViewType == 40) {
            e eVar = (e) viewHolder;
            eVar.alH.setText(String.format(this.aly.amf, new Object[]{com.iqoption.util.j.d(du)}));
            eVar.alI.setText(com.iqoption.util.j.d(str2, Double.valueOf(balanceValue)));
            eVar.alQ.setText(com.iqoption.util.j.d(format, Double.valueOf(balanceValue)));
            if (GV || !e) {
                eVar.AK();
            } else {
                eVar.a(com.iqoption.app.managers.c.GS().Hf(), str2, Double.valueOf(balanceValue));
            }
            if (balanceValue >= 10000.0d || !e) {
                eVar.amb.setVisibility(8);
            } else {
                eVar.amb.setRotation(0.0f);
                eVar.amb.setVisibility(0);
            }
        } else if (itemViewType == 98 || itemViewType == 99) {
            CharSequence stringBuilder;
            TextView textView = aVar.alH;
            if (TextUtils.isEmpty(dp.tournamentName) || dp.tournamentName.equals("null")) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(aVar.alH.getContext().getString(R.string.tournament));
                stringBuilder2.append(i2);
                stringBuilder = stringBuilder2.toString();
            } else {
                stringBuilder = dp.tournamentName;
            }
            textView.setText(stringBuilder);
            aVar.alI.setText(com.iqoption.util.j.d(str2, Double.valueOf(balanceValue)));
        }
        aVar.ay(dp.isLoadingChange);
    }

    private double a(double d, ConversionCurrency conversionCurrency) {
        return com.iqoption.util.j.b(com.iqoption.util.j.c(Double.valueOf(d), com.iqoption.util.j.b(conversionCurrency)), com.iqoption.util.j.b(this.alr)).doubleValue();
    }

    private double AD() {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        aj sK = this.alv.iterator();
        double d = 0.0d;
        while (sK.hasNext()) {
            Balance balance = (Balance) sK.next();
            if (Balance.getBalanceType(balance) == 5) {
                String currency = Balance.getCurrency(balance);
                if (Currencies.OTN_CURRENCY.equalsIgnoreCase(currency)) {
                    currency = Currencies.OTM_CURRENCY;
                }
                d += a(Balance.getBalanceValue(balance), DG.du(currency));
            }
        }
        return d;
    }

    public Balance dp(int i) {
        return (Balance) this.alv.get(i);
    }

    public void d(@Nullable Long l) {
        this.alw = (Long) com.google.common.base.e.g(l, Long.valueOf(-1));
    }

    public void AE() {
        notifyItemChanged(this.alx);
    }

    public void i(int i, boolean z) {
        if (i <= getItemCount()) {
            dp(i).isLoadingChange = z;
        }
    }

    public void AF() {
        int i = 0;
        while (i < this.alv.size()) {
            Balance balance = (Balance) this.alv.get(i);
            if (balance == null || !this.alw.equals(Long.valueOf(balance.id))) {
                i++;
            } else {
                notifyItemChanged(i);
                return;
            }
        }
    }

    public boolean e(Long l) {
        return this.alw.equals(l);
    }

    public int AG() {
        for (int i = 0; i < this.alv.size(); i++) {
            Balance balance = (Balance) this.alv.get(i);
            if (balance != null && this.alw.equals(Long.valueOf(balance.id))) {
                return i;
            }
        }
        return -1;
    }

    private static void beginDelayedTransition(@Nullable ViewGroup viewGroup) {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setOrdering(0);
        autoTransition.setDuration(250);
        TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
    }
}
