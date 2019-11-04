package com.iqoption.dialog.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.iqoption.core.util.af;
import com.iqoption.dialog.a.c.-CC;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.e.ew;
import com.iqoption.e.fa;
import com.iqoption.e.fi;
import com.iqoption.e.fk;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;
import java.util.List;

/* compiled from: CfdComponentFactory */
final class a implements c {
    private final com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private final List<Position> bwQ;
    private final boolean cHw;
    private final i cHx;
    private final Context context;
    private final Position position;

    /* compiled from: CfdComponentFactory */
    private static final class c extends Adapter<d> {
        private final List<Position> bwQ;
        private final j<d> cHB;

        c(j<d> jVar, List<Position> list) {
            this.cHB = jVar;
            this.bwQ = list;
        }

        @NonNull
        /* renamed from: y */
        public d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return (d) this.cHB.create(viewGroup, i);
        }

        /* renamed from: a */
        public void onBindViewHolder(d dVar, int i) {
            dVar.j((Position) this.bwQ.get(i));
        }

        public int getItemCount() {
            return this.bwQ.size();
        }
    }

    /* compiled from: CfdComponentFactory */
    private static abstract class d extends ViewHolder {
        final i cHx;

        public abstract void j(Position position);

        d(View view, i iVar) {
            super(view);
            this.cHx = iVar;
        }

        static boolean n(long j, long j2) {
            return j / 86400000 == j2 / 86400000;
        }
    }

    /* compiled from: CfdComponentFactory */
    private static class a extends d {
        private final fi cHy;
        private final String cHz;

        a(fi fiVar, i iVar) {
            super(fiVar.getRoot(), iVar);
            this.cHy = fiVar;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(fiVar.getRoot().getResources().getString(R.string.mult).toLowerCase());
            stringBuilder.append(" %s");
            this.cHz = stringBuilder.toString();
        }

        /* Access modifiers changed, original: 0000 */
        public void j(Position position) {
            Double openPriceEnrolled = position.getOpenPriceEnrolled();
            String str = "—";
            if (openPriceEnrolled != null) {
                this.cHy.cav.setText(this.cHx.u(openPriceEnrolled.doubleValue()));
            } else {
                this.cHy.cav.setText(str);
            }
            openPriceEnrolled = position.getCloseUnderlyingPrice();
            if (openPriceEnrolled != null) {
                this.cHy.caq.setText(this.cHx.u(openPriceEnrolled.doubleValue()));
            } else {
                this.cHy.caq.setText(str);
            }
            if (Position.isLong(position)) {
                this.cHy.cau.setImageResource(R.drawable.ic_indicator_call_10dp);
            } else {
                this.cHy.cau.setImageResource(R.drawable.ic_indicator_put_10dp);
            }
            long createTime = position.getCreateTime();
            long closeTime = position.getCloseTime();
            if (d.n(createTime, closeTime)) {
                this.cHy.caw.setText(this.cHx.aQ(createTime));
                this.cHy.car.setText(this.cHx.aQ(closeTime));
            } else {
                this.cHy.caw.setText(this.cHx.ay(createTime));
                this.cHy.car.setText(this.cHx.ay(closeTime));
            }
            this.cHy.cas.setText(String.format(this.cHz, new Object[]{af.ft(position.getLeverage()).toUpperCase()}));
            double closeInvestSum = position.getCloseInvestSum();
            this.cHy.cag.setText(this.cHx.v(closeInvestSum));
            double winAmount = position.getWinAmount() - position.getCloseInvestSum();
            closeInvestSum = (winAmount / closeInvestSum) * 100.0d;
            if (winAmount > 0.0d) {
                this.cHy.bZm.setText(af.hu(this.cHx.v(winAmount)));
                this.cHy.bZm.setTextColor(this.cHx.cHQ);
                this.cHy.cat.setText(af.d(Double.valueOf(closeInvestSum)));
                this.cHy.cat.setTextColor(this.cHx.cHQ);
            } else if (winAmount < 0.0d) {
                this.cHy.bZm.setText(af.hv(this.cHx.v(Math.abs(winAmount))));
                this.cHy.bZm.setTextColor(this.cHx.cHP);
                this.cHy.cat.setText(af.e(Double.valueOf(Math.abs(closeInvestSum))));
                this.cHy.cat.setTextColor(this.cHx.cHP);
            } else {
                this.cHy.bZm.setText(this.cHx.v(0.0d));
                this.cHy.bZm.setTextColor(this.cHx.cHN);
                this.cHy.cat.setText(af.s(0.0d));
                this.cHy.cat.setTextColor(this.cHx.cHN);
            }
            String win = position.getWin();
            if (win != null) {
                Object obj = -1;
                int hashCode = win.hashCode();
                if (hashCode != 117724) {
                    if (hashCode == 103157406 && win.equals("loose")) {
                        obj = null;
                    }
                } else if (win.equals("win")) {
                    obj = 1;
                }
                if (obj == null) {
                    this.cHy.cax.setText(R.string.status_lose);
                    this.cHy.cax.setTextColor(this.cHx.cHO);
                    return;
                } else if (obj != 1) {
                    this.cHy.cax.setText(win);
                    this.cHy.cax.setTextColor(this.cHx.cHN);
                    return;
                } else {
                    this.cHy.cax.setText(R.string.status_profit);
                    this.cHy.cax.setTextColor(this.cHx.cHN);
                    return;
                }
            }
            this.cHy.cax.setText(null);
        }
    }

    /* compiled from: CfdComponentFactory */
    private static final class b extends d {
        private final fk cHA;

        b(fk fkVar, i iVar) {
            super(fkVar.getRoot(), iVar);
            this.cHA = fkVar;
        }

        /* Access modifiers changed, original: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0163  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0138  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0138  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0163  */
        public void j(com.iqoption.dto.entity.position.Position r8) {
            /*
            r7 = this;
            r0 = r8.getOpenPriceEnrolled();
            r1 = "—";
            if (r0 == 0) goto L_0x001b;
        L_0x0009:
            r2 = r7.cHA;
            r2 = r2.cav;
            r3 = r7.cHx;
            r4 = r0.doubleValue();
            r0 = r3.u(r4);
            r2.setText(r0);
            goto L_0x0022;
        L_0x001b:
            r0 = r7.cHA;
            r0 = r0.cav;
            r0.setText(r1);
        L_0x0022:
            r0 = r8.getCloseUnderlyingPrice();
            if (r0 == 0) goto L_0x003a;
        L_0x0028:
            r1 = r7.cHA;
            r1 = r1.caq;
            r2 = r7.cHx;
            r3 = r0.doubleValue();
            r0 = r2.u(r3);
            r1.setText(r0);
            goto L_0x0041;
        L_0x003a:
            r0 = r7.cHA;
            r0 = r0.caq;
            r0.setText(r1);
        L_0x0041:
            r0 = com.iqoption.dto.entity.position.Position.isLong(r8);
            if (r0 == 0) goto L_0x0052;
        L_0x0047:
            r0 = r7.cHA;
            r0 = r0.cau;
            r1 = 2131231558; // 0x7f080346 float:1.80792E38 double:1.052968296E-314;
            r0.setImageResource(r1);
            goto L_0x005c;
        L_0x0052:
            r0 = r7.cHA;
            r0 = r0.cau;
            r1 = 2131231560; // 0x7f080348 float:1.8079204E38 double:1.052968297E-314;
            r0.setImageResource(r1);
        L_0x005c:
            r0 = r8.getCreateTime();
            r2 = r8.getCloseTime();
            r4 = com.iqoption.dialog.a.a.d.n(r0, r2);
            if (r4 == 0) goto L_0x0085;
        L_0x006a:
            r4 = r7.cHA;
            r4 = r4.caw;
            r5 = r7.cHx;
            r0 = r5.aQ(r0);
            r4.setText(r0);
            r0 = r7.cHA;
            r0 = r0.car;
            r1 = r7.cHx;
            r1 = r1.aQ(r2);
            r0.setText(r1);
            goto L_0x009f;
        L_0x0085:
            r4 = r7.cHA;
            r4 = r4.caw;
            r5 = r7.cHx;
            r0 = r5.ay(r0);
            r4.setText(r0);
            r0 = r7.cHA;
            r0 = r0.car;
            r1 = r7.cHx;
            r1 = r1.ay(r2);
            r0.setText(r1);
        L_0x009f:
            r0 = r8.getWinAmount();
            r2 = r8.getCloseInvestSum();
            r0 = r0 - r2;
            r2 = r8.getCloseInvestSum();
            r0 = r0 / r2;
            r2 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
            r0 = r0 * r2;
            r2 = -1;
            r3 = 0;
            r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
            if (r5 <= 0) goto L_0x00d3;
        L_0x00b8:
            r3 = r7.cHA;
            r3 = r3.cay;
            r0 = java.lang.Double.valueOf(r0);
            r0 = com.iqoption.core.util.af.d(r0);
            r3.setText(r0);
            r0 = r7.cHA;
            r0 = r0.cay;
            r1 = r7.cHx;
            r1 = r1.cHQ;
            r0.setTextColor(r1);
            goto L_0x0108;
        L_0x00d3:
            r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
            if (r5 >= 0) goto L_0x00f6;
        L_0x00d7:
            r3 = r7.cHA;
            r3 = r3.cay;
            r0 = java.lang.Math.abs(r0);
            r0 = java.lang.Double.valueOf(r0);
            r0 = com.iqoption.core.util.af.e(r0);
            r3.setText(r0);
            r0 = r7.cHA;
            r0 = r0.cay;
            r1 = r7.cHx;
            r1 = r1.cHP;
            r0.setTextColor(r1);
            goto L_0x0108;
        L_0x00f6:
            r0 = r7.cHA;
            r0 = r0.cay;
            r1 = com.iqoption.core.util.af.s(r3);
            r0.setText(r1);
            r0 = r7.cHA;
            r0 = r0.cay;
            r0.setTextColor(r2);
        L_0x0108:
            r0 = r8.getWin();
            r1 = 0;
            r3 = 0;
            r4 = 1;
            if (r0 == 0) goto L_0x0179;
        L_0x0111:
            r5 = r0.hashCode();
            r6 = 117724; // 0x1cbdc float:1.64966E-40 double:5.81634E-319;
            if (r5 == r6) goto L_0x012a;
        L_0x011a:
            r6 = 103157406; // 0x6260e9e float:3.123187E-35 double:5.09665304E-316;
            if (r5 == r6) goto L_0x0120;
        L_0x011f:
            goto L_0x0135;
        L_0x0120:
            r5 = "loose";
            r5 = r0.equals(r5);
            if (r5 == 0) goto L_0x0135;
        L_0x0128:
            r5 = 0;
            goto L_0x0136;
        L_0x012a:
            r5 = "win";
            r5 = r0.equals(r5);
            if (r5 == 0) goto L_0x0135;
        L_0x0133:
            r5 = 1;
            goto L_0x0136;
        L_0x0135:
            r5 = -1;
        L_0x0136:
            if (r5 == 0) goto L_0x0163;
        L_0x0138:
            if (r5 == r4) goto L_0x014d;
        L_0x013a:
            r5 = r7.cHA;
            r5 = r5.cax;
            r5.setText(r0);
            r0 = r7.cHA;
            r0 = r0.cax;
            r5 = r7.cHx;
            r5 = r5.cHN;
            r0.setTextColor(r5);
            goto L_0x0180;
        L_0x014d:
            r0 = r7.cHA;
            r0 = r0.cax;
            r5 = 2131888370; // 0x7f1208f2 float:1.9411373E38 double:1.0532928044E-314;
            r0.setText(r5);
            r0 = r7.cHA;
            r0 = r0.cax;
            r5 = r7.cHx;
            r5 = r5.cHN;
            r0.setTextColor(r5);
            goto L_0x0180;
        L_0x0163:
            r0 = r7.cHA;
            r0 = r0.cax;
            r5 = 2131888369; // 0x7f1208f1 float:1.9411371E38 double:1.053292804E-314;
            r0.setText(r5);
            r0 = r7.cHA;
            r0 = r0.cax;
            r5 = r7.cHx;
            r5 = r5.cHO;
            r0.setTextColor(r5);
            goto L_0x0180;
        L_0x0179:
            r0 = r7.cHA;
            r0 = r0.cax;
            r0.setText(r3);
        L_0x0180:
            r8 = r8.getCloseReason();
            r0 = r8.hashCode();
            switch(r0) {
                case -940242166: goto L_0x01c9;
                case -753660988: goto L_0x01bf;
                case 531759317: goto L_0x01b5;
                case 1611297260: goto L_0x01ab;
                case 1629890866: goto L_0x01a1;
                case 1629890880: goto L_0x0197;
                case 1659842812: goto L_0x018c;
                default: goto L_0x018b;
            };
        L_0x018b:
            goto L_0x01d3;
        L_0x018c:
            r0 = "take_profit";
            r8 = r8.equals(r0);
            if (r8 == 0) goto L_0x01d3;
        L_0x0195:
            r2 = 3;
            goto L_0x01d3;
        L_0x0197:
            r0 = "stop_loss";
            r8 = r8.equals(r0);
            if (r8 == 0) goto L_0x01d3;
        L_0x019f:
            r2 = 1;
            goto L_0x01d3;
        L_0x01a1:
            r0 = "stop_lose";
            r8 = r8.equals(r0);
            if (r8 == 0) goto L_0x01d3;
        L_0x01a9:
            r2 = 2;
            goto L_0x01d3;
        L_0x01ab:
            r0 = "custodial";
            r8 = r8.equals(r0);
            if (r8 == 0) goto L_0x01d3;
        L_0x01b3:
            r2 = 5;
            goto L_0x01d3;
        L_0x01b5:
            r0 = "margin_erase";
            r8 = r8.equals(r0);
            if (r8 == 0) goto L_0x01d3;
        L_0x01bd:
            r2 = 0;
            goto L_0x01d3;
        L_0x01bf:
            r0 = "overnight";
            r8 = r8.equals(r0);
            if (r8 == 0) goto L_0x01d3;
        L_0x01c7:
            r2 = 4;
            goto L_0x01d3;
        L_0x01c9:
            r0 = "withdraw";
            r8 = r8.equals(r0);
            if (r8 == 0) goto L_0x01d3;
        L_0x01d2:
            r2 = 6;
        L_0x01d3:
            switch(r2) {
                case 0: goto L_0x0215;
                case 1: goto L_0x020a;
                case 2: goto L_0x020a;
                case 3: goto L_0x01ff;
                case 4: goto L_0x01f4;
                case 5: goto L_0x01e9;
                case 6: goto L_0x01de;
                default: goto L_0x01d6;
            };
        L_0x01d6:
            r8 = r7.cHA;
            r8 = r8.caz;
            r8.setText(r3);
            goto L_0x021f;
        L_0x01de:
            r8 = r7.cHA;
            r8 = r8.caz;
            r0 = 2131888893; // 0x7f120afd float:1.9412434E38 double:1.053293063E-314;
            r8.setText(r0);
            goto L_0x021f;
        L_0x01e9:
            r8 = r7.cHA;
            r8 = r8.caz;
            r0 = 2131886677; // 0x7f120255 float:1.940794E38 double:1.053291968E-314;
            r8.setText(r0);
            goto L_0x021f;
        L_0x01f4:
            r8 = r7.cHA;
            r8 = r8.caz;
            r0 = 2131887893; // 0x7f120715 float:1.9410406E38 double:1.0532925687E-314;
            r8.setText(r0);
            goto L_0x021f;
        L_0x01ff:
            r8 = r7.cHA;
            r8 = r8.caz;
            r0 = 2131888425; // 0x7f120929 float:1.9411485E38 double:1.0532928316E-314;
            r8.setText(r0);
            goto L_0x021f;
        L_0x020a:
            r8 = r7.cHA;
            r8 = r8.caz;
            r0 = 2131888379; // 0x7f1208fb float:1.9411392E38 double:1.053292809E-314;
            r8.setText(r0);
            goto L_0x021f;
        L_0x0215:
            r8 = r7.cHA;
            r8 = r8.caz;
            r0 = 2131887419; // 0x7f12053b float:1.9409445E38 double:1.0532923345E-314;
            r8.setText(r0);
        L_0x021f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dialog.a.a$b.j(com.iqoption.dto.entity.position.Position):void");
        }
    }

    public /* synthetic */ void a(@NonNull com.iqoption.dialog.a.a.d dVar) {
        -CC.$default$a(this, dVar);
    }

    @Nullable
    public /* synthetic */ com.iqoption.dialog.a.a.d d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return -CC.$default$d(this, layoutInflater, viewGroup);
    }

    a(Context context, ImmutableList<Position> immutableList) {
        this.context = context;
        this.bwQ = immutableList;
        boolean z = false;
        this.position = (Position) immutableList.get(0);
        if (immutableList.size() > 1) {
            z = true;
        }
        this.cHw = z;
        this.anF = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(this.position.getActiveId()), this.position.getInstrumentType());
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        this.cHx = new i(context, aVar != null ? aVar.getPrecision() : 4);
    }

    @NonNull
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ew ewVar = (ew) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_closed_deals_header_cfd, viewGroup, false);
        if (this.anF != null) {
            ewVar.caf.setText(com.iqoption.core.microservices.tradingengine.response.active.d.B(this.anF));
        }
        int leverage = this.position.getLeverage();
        CharSequence ft = af.ft(leverage);
        double d = 0.0d;
        for (Position position : this.bwQ) {
            d += position.getCloseInvestSum();
            if (position.getLeverage() != leverage) {
                ft = "—";
            }
        }
        ewVar.cag.setText(this.cHx.v(d));
        ewVar.cah.setText(ft);
        RobotoTextView robotoTextView = ewVar.cai;
        i iVar = this.cHx;
        double d2 = (double) leverage;
        Double.isNaN(d2);
        robotoTextView.setText(iVar.v(d * d2));
        return ewVar.getRoot();
    }

    @NonNull
    public View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        fa faVar = (fa) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_closed_deals_header_list_cfd, viewGroup, false);
        if (this.cHw) {
            faVar.cam.setText(R.string.volume);
        } else {
            faVar.cam.setText(R.string.profit);
        }
        return faVar.getRoot();
    }

    @NonNull
    public Adapter atC() {
        j -__lambda_a_wm_hdz9wiiuhkpjttgvnx22d42g;
        LayoutInflater from = LayoutInflater.from(this.context);
        if (this.cHw) {
            -__lambda_a_wm_hdz9wiiuhkpjttgvnx22d42g = new -$$Lambda$a$WM_hdZ9wIiUHkpJTTgVnX22D42g(this, from);
        } else {
            -__lambda_a_wm_hdz9wiiuhkpjttgvnx22d42g = new -$$Lambda$a$Spx9ZwL9d7De4HYsHYlE-an361s(this, from);
        }
        return new c(-__lambda_a_wm_hdz9wiiuhkpjttgvnx22d42g, this.bwQ);
    }

    private /* synthetic */ d b(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new a((fi) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_closed_deals_item_cfd_aggregated, viewGroup, false), this.cHx);
    }
}
