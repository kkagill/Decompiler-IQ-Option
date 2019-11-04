package com.iqoption.dialog.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.i;
import com.google.common.collect.s;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.aa;
import com.iqoption.core.util.af;
import com.iqoption.core.util.b.f;
import com.iqoption.dto.Point;
import com.iqoption.e.eu;
import com.iqoption.e.ey;
import com.iqoption.e.fc;
import com.iqoption.e.fm;
import com.iqoption.e.fo;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: OptionComponentFactory */
final class e implements c {
    private static final Ordering<com.iqoption.mobbtech.connect.response.options.c> cHT = Ordering.from(-$$Lambda$e$W6GzV4Bofin5JLj85J-LZGF-x40.INSTANCE);
    private final List<com.iqoption.mobbtech.connect.response.options.c> aTU;
    private final com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private final com.iqoption.mobbtech.connect.response.options.c cHU;
    private final boolean cHV;
    private final boolean cHW;
    private com.iqoption.dialog.a.a.d.a cHX;
    private List<aa> cHY;
    private com.iqoption.dialog.a.a.d.b cHZ;
    private final boolean cHw;
    private final i cHx;
    private final Context context;

    /* compiled from: OptionComponentFactory */
    private static final class c extends Adapter<d> {
        private final List<com.iqoption.mobbtech.connect.response.options.c> aTU;
        private final j<d> cHB;

        c(j<d> jVar, List<com.iqoption.mobbtech.connect.response.options.c> list) {
            this.cHB = jVar;
            this.aTU = list;
        }

        @NonNull
        /* renamed from: A */
        public d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return (d) this.cHB.create(viewGroup, i);
        }

        /* renamed from: a */
        public void onBindViewHolder(d dVar, int i) {
            dVar.m((com.iqoption.mobbtech.connect.response.options.c) this.aTU.get(i));
        }

        public int getItemCount() {
            return this.aTU.size();
        }
    }

    /* compiled from: OptionComponentFactory */
    private static abstract class d extends ViewHolder {
        final boolean cHV;
        final i cHx;

        public abstract void m(com.iqoption.mobbtech.connect.response.options.c cVar);

        d(View view, i iVar, boolean z) {
            super(view);
            this.cHx = iVar;
            this.cHV = z;
        }

        static boolean n(long j, long j2) {
            return j / 86400000 == j2 / 86400000;
        }

        public String bx(long j) {
            if ((j % 1000 > 0 ? 1 : null) == null || !this.cHV) {
                return this.cHx.aQ(j);
            }
            return this.cHx.bA(j);
        }

        public String by(long j) {
            if ((j % 1000 > 0 ? 1 : null) == null || !this.cHV) {
                return this.cHx.ay(j);
            }
            return this.cHx.bz(j);
        }
    }

    /* compiled from: OptionComponentFactory */
    private static class a extends d {
        private final fm cIa;

        a(fm fmVar, i iVar, boolean z) {
            super(fmVar.getRoot(), iVar, z);
            this.cIa = fmVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void m(com.iqoption.mobbtech.connect.response.options.c cVar) {
            Double valueOf = Double.valueOf(cVar.getValue());
            String str = "—";
            if (valueOf != null) {
                this.cIa.cav.setText(this.cHx.u(valueOf.doubleValue()));
            } else {
                this.cIa.cav.setText(str);
            }
            InstrumentType instrumentType = cVar.getInstrumentType();
            if (instrumentType == InstrumentType.DIGITAL_INSTRUMENT || instrumentType == InstrumentType.FX_INSTRUMENT) {
                this.cIa.caA.setText(R.string.strike);
            } else {
                this.cIa.caA.setText(R.string.open_price);
            }
            valueOf = Double.valueOf(cVar.getExpValue());
            if (valueOf != null) {
                this.cIa.caq.setText(this.cHx.u(valueOf.doubleValue()));
            } else {
                this.cIa.caq.setText(str);
            }
            if (cVar.isCall()) {
                this.cIa.cau.setImageResource(R.drawable.ic_indicator_call_10dp);
            } else {
                this.cIa.cau.setImageResource(R.drawable.ic_indicator_put_10dp);
            }
            long createTime = cVar.getCreateTime();
            long closeTime = cVar.getCloseTime();
            if (d.n(createTime, closeTime)) {
                this.cIa.caw.setText(bx(createTime));
                this.cIa.car.setText(this.cHx.aQ(closeTime));
            } else {
                this.cIa.caw.setText(by(createTime));
                this.cIa.car.setText(this.cHx.ay(closeTime));
            }
            double closeInvestSum = cVar.getCloseInvestSum();
            this.cIa.cag.setText(this.cHx.v(closeInvestSum));
            double sellPnl = cVar.getSellPnl();
            double d = sellPnl + closeInvestSum;
            closeInvestSum = (sellPnl / closeInvestSum) * 100.0d;
            if (sellPnl > 0.0d) {
                this.cIa.cay.setText(this.cHx.v(d));
                this.cIa.bZm.setText(af.hu(this.cHx.v(sellPnl)));
                this.cIa.bZm.setTextColor(this.cHx.cHQ);
                this.cIa.cat.setText(af.d(Double.valueOf(closeInvestSum)));
                this.cIa.cat.setTextColor(this.cHx.cHQ);
            } else if (sellPnl < 0.0d) {
                this.cIa.cay.setText(this.cHx.v(Math.abs(d)));
                this.cIa.bZm.setText(af.hv(this.cHx.v(Math.abs(sellPnl))));
                this.cIa.bZm.setTextColor(this.cHx.cHP);
                this.cIa.cat.setText(af.e(Double.valueOf(Math.abs(closeInvestSum))));
                this.cIa.cat.setTextColor(this.cHx.cHP);
            } else {
                this.cIa.cay.setText(this.cHx.v(d));
                this.cIa.bZm.setText(this.cHx.v(0.0d));
                this.cIa.bZm.setTextColor(this.cHx.cHN);
                this.cIa.cat.setText(af.s(0.0d));
                this.cIa.cat.setTextColor(this.cHx.cHN);
            }
            String win = cVar.getWin();
            if (win != null) {
                int i = -1;
                int hashCode = win.hashCode();
                if (hashCode != 117724) {
                    if (hashCode == 103157406 && win.equals("loose")) {
                        i = 0;
                    }
                } else if (win.equals("win")) {
                    i = 1;
                }
                if (i == 0) {
                    this.cIa.cax.setText(R.string.status_lose);
                    this.cIa.cax.setTextColor(this.cHx.cHO);
                    return;
                } else if (i != 1) {
                    this.cIa.cax.setText(win);
                    this.cIa.cax.setTextColor(this.cHx.cHN);
                    return;
                } else {
                    this.cIa.cax.setText(R.string.status_profit);
                    this.cIa.cax.setTextColor(this.cHx.cHN);
                    return;
                }
            }
            this.cIa.cax.setText(null);
        }
    }

    /* compiled from: OptionComponentFactory */
    private static final class b extends d {
        private final fo cIb;

        b(fo foVar, i iVar, boolean z) {
            super(foVar.getRoot(), iVar, z);
            this.cIb = foVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void m(com.iqoption.mobbtech.connect.response.options.c cVar) {
            Double valueOf = Double.valueOf(cVar.getValue());
            if (valueOf != null) {
                this.cIb.cav.setText(this.cHx.u(valueOf.doubleValue()));
            } else {
                this.cIb.cav.setText(null);
            }
            InstrumentType instrumentType = cVar.getInstrumentType();
            if (instrumentType == InstrumentType.DIGITAL_INSTRUMENT || instrumentType == InstrumentType.FX_INSTRUMENT) {
                this.cIb.caA.setText(R.string.strike);
            } else {
                this.cIb.caA.setText(R.string.open_price);
            }
            valueOf = Double.valueOf(cVar.getExpValue());
            if (valueOf != null) {
                this.cIb.caq.setText(this.cHx.u(valueOf.doubleValue()));
            } else {
                this.cIb.caq.setText("—");
            }
            if (cVar.isCall()) {
                this.cIb.cau.setImageResource(R.drawable.ic_indicator_call_10dp);
            } else {
                this.cIb.cau.setImageResource(R.drawable.ic_indicator_put_10dp);
            }
            long createTime = cVar.getCreateTime();
            long closeTime = cVar.getCloseTime();
            if (d.n(createTime, closeTime)) {
                this.cIb.caw.setText(bx(createTime));
                this.cIb.car.setText(this.cHx.aQ(closeTime));
            } else {
                this.cIb.caw.setText(by(createTime));
                this.cIb.car.setText(this.cHx.ay(closeTime));
            }
            double sellPnl = (cVar.getSellPnl() / cVar.getCloseInvestSum()) * 100.0d;
            int i = -1;
            if (sellPnl > 0.0d) {
                this.cIb.cay.setText(af.d(Double.valueOf(sellPnl)));
                this.cIb.cay.setTextColor(this.cHx.cHQ);
            } else if (sellPnl < 0.0d) {
                this.cIb.cay.setText(af.e(Double.valueOf(Math.abs(sellPnl))));
                this.cIb.cay.setTextColor(this.cHx.cHP);
            } else {
                this.cIb.cay.setText(af.s(0.0d));
                this.cIb.cay.setTextColor(-1);
            }
            String win = cVar.getWin();
            if (win != null) {
                int hashCode = win.hashCode();
                if (hashCode != 117724) {
                    if (hashCode == 103157406 && win.equals("loose")) {
                        i = 0;
                    }
                } else if (win.equals("win")) {
                    i = 1;
                }
                if (i == 0) {
                    this.cIb.cax.setText(R.string.status_lose);
                    this.cIb.cax.setTextColor(this.cHx.cHO);
                    return;
                } else if (i != 1) {
                    this.cIb.cax.setText(win);
                    this.cIb.cax.setTextColor(this.cHx.cHN);
                    return;
                } else {
                    this.cIb.cax.setText(R.string.status_profit);
                    this.cIb.cax.setTextColor(this.cHx.cHN);
                    return;
                }
            }
            this.cIb.cax.setText(null);
        }
    }

    e(Context context, ImmutableList<com.iqoption.mobbtech.connect.response.options.c> immutableList) {
        this.context = context;
        this.aTU = immutableList;
        boolean z = false;
        this.cHU = (com.iqoption.mobbtech.connect.response.options.c) immutableList.get(0);
        this.cHw = immutableList.size() > 1;
        this.anF = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(this.cHU.getActiveId()), this.cHU.getInstrumentType());
        if (this.cHU.getInstrumentType() == InstrumentType.DIGITAL_INSTRUMENT) {
            z = true;
        }
        this.cHW = z;
        this.cHV = this.cHU.getInstrumentType().isBinary();
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        int precision = aVar != null ? aVar.getPrecision() : 4;
        this.cHx = new i(context, precision);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("%.");
        stringBuilder.append(precision);
        stringBuilder.append("f");
        String stringBuilder2 = stringBuilder.toString();
        if (this.cHW) {
            this.cHZ = new com.iqoption.dialog.a.a.b.a(context, stringBuilder2);
        } else {
            this.cHZ = new com.iqoption.dialog.a.a.a.a(context, stringBuilder2);
        }
    }

    @NonNull
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        ey eyVar = (ey) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_closed_deals_header_do, viewGroup, false);
        if (this.anF != null) {
            eyVar.caf.setText(com.iqoption.core.microservices.tradingengine.response.active.d.B(this.anF));
        }
        double d = 0.0d;
        for (com.iqoption.mobbtech.connect.response.options.c investSum : this.aTU) {
            d += investSum.getInvestSum();
        }
        eyVar.cal.setText(this.cHx.v(d));
        eyVar.caj.setText(TimeUtil.c(this.cHU.getExpired(), 1));
        eyVar.cak.setText(String.valueOf(this.aTU.size()));
        if (this.cHW) {
            ak.setDrawableLeft(eyVar.caj, AppCompatResources.getDrawable(context, R.drawable.ic_flag_new));
        }
        return eyVar.getRoot();
    }

    @NonNull
    public View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        fc fcVar = (fc) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_closed_deals_header_list_do, viewGroup, false);
        if (this.cHw) {
            fcVar.cam.setText(R.string.volume);
        } else {
            fcVar.cam.setText(R.string.profit);
        }
        return fcVar.getRoot();
    }

    @NonNull
    public Adapter atC() {
        j -__lambda_e_sq6ietkyjpjjhtefv2xps0iymzq;
        LayoutInflater from = LayoutInflater.from(this.context);
        if (this.cHw) {
            -__lambda_e_sq6ietkyjpjjhtefv2xps0iymzq = new -$$Lambda$e$SQ6iEtKyJPJJhtefv2Xps0IyMZQ(this, from);
        } else {
            -__lambda_e_sq6ietkyjpjjhtefv2xps0iymzq = new -$$Lambda$e$WpIzUOxVL6KGohKIPAnpV4aMlww(this, from);
        }
        return new c(-__lambda_e_sq6ietkyjpjjhtefv2xps0iymzq, this.aTU);
    }

    private /* synthetic */ d d(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new a((fm) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_closed_deals_item_do_aggregated, viewGroup, false), this.cHx, this.cHV);
    }

    private /* synthetic */ d c(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new b((fo) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_closed_deals_item_do, viewGroup, false), this.cHx, this.cHV);
    }

    @NonNull
    public com.iqoption.dialog.a.a.d d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        com.iqoption.dialog.a.a.d dVar = new com.iqoption.dialog.a.a.d(this.context);
        dVar.setLayoutParams(new LayoutParams(-1, fA(R.dimen.dp200)));
        dVar.setPadding(0, fA(R.dimen.dp28), 0, fA(R.dimen.dp58));
        dVar.setDecorDrawer(this.cHZ);
        return dVar;
    }

    private int fA(@DimenRes int i) {
        return this.context.getResources().getDimensionPixelSize(i);
    }

    public void a(@NonNull ImmutableList<Point> immutableList, float f, float f2) {
        double d;
        aa aaVar;
        ImmutableList immutableList2 = immutableList;
        float f3 = f;
        this.cHY = new ArrayList(immutableList.size());
        aa[] aaVarArr = new aa[this.aTU.size()];
        ImmutableList a = i.b(this.aTU).a(cHT);
        this.cHX = new com.iqoption.dialog.a.a.d.a();
        this.cHX.n(f3, f2);
        long j = ((Point) immutableList2.get(0)).timestamp;
        int size = immutableList.size();
        int i = 0;
        int i2 = 0;
        Point point = null;
        while (i < size) {
            long j2;
            ImmutableList<Point> immutableList3;
            Point point2 = (Point) immutableList2.get(i);
            int i3 = i;
            long j3 = j;
            d = (double) ((float) (point2.timestamp - j));
            int i4 = size;
            aa aaVar2 = new aa(d, (double) ((float) point2.rate));
            this.cHY.add(aaVar2);
            this.cHX.a(aaVar2);
            while (i2 < aaVarArr.length) {
                com.iqoption.mobbtech.connect.response.options.c cVar = (com.iqoption.mobbtech.connect.response.options.c) a.get(i2);
                if (cVar.getCreated() > point2.timestamp) {
                    break;
                }
                Point point3;
                int i5;
                Point point4;
                int i6;
                long j4;
                Point point5;
                j = cVar.getCreated();
                if (point2.timestamp == j) {
                    aaVar = aaVar2;
                    point3 = point;
                    i5 = i3;
                    j2 = j3;
                    point4 = point2;
                    i6 = i4;
                    j4 = j2;
                } else if (point2.timestamp <= j || point == null || point.timestamp >= j) {
                    size = i4;
                    i5 = i3;
                    j4 = j3;
                    i6 = size;
                    if (point2.timestamp <= j || point != null) {
                        point3 = point;
                        point4 = point2;
                        aaVar = null;
                    } else {
                        point3 = point;
                        point4 = point2;
                        aaVar = new aa((double) (((float) j) - ((float) j4)), (double) ((float) cVar.getOpenUnderlyingPrice()));
                        this.cHY.add(i5, aaVar);
                    }
                } else {
                    size = i4;
                    i5 = i3;
                    aaVar = new aa((double) (((float) j) - ((float) j3)), (double) ((float) cVar.getOpenUnderlyingPrice()));
                    this.cHY.add(i5, aaVar);
                    j4 = j3;
                    i6 = size;
                    point3 = point;
                    point4 = point2;
                }
                if (aaVar != null) {
                    aaVarArr[i2] = aaVar;
                    if (this.cHW) {
                        point5 = point3;
                        this.cHX.a(new aa(aaVar.x, (double) ((float) cVar.getValue())));
                    } else {
                        point5 = point3;
                        this.cHX.a(aaVar);
                    }
                    i2++;
                } else {
                    point5 = point3;
                }
                point2 = point4;
                point = point5;
                int i7 = i5;
                immutableList3 = immutableList;
                long j5 = j4;
                i3 = i7;
                i4 = i6;
                j3 = j5;
            }
            j2 = j3;
            i = i3 + 1;
            immutableList3 = immutableList;
            j = j2;
            size = i4;
            point = point2;
        }
        if (i2 >= aaVarArr.length) {
            float atM;
            if (this.cHW) {
                ((com.iqoption.dialog.a.a.b.a) this.cHZ).a(a, (Point) s.r(immutableList), aaVarArr);
            } else {
                ((com.iqoption.dialog.a.a.a.a) this.cHZ).a(a, (Point) s.r(immutableList), aaVarArr);
            }
            int i8;
            if (aaVarArr.length > 0) {
                atM = this.cHZ.atM();
                i8 = 0;
                aaVar = aaVarArr[0];
            } else {
                i8 = 0;
                atM = 0.0f;
                aaVar = null;
            }
            if (!(aaVar == null || atM == 0.0f || this.cHX.w(aaVar.x) - this.cHX.w(((aa) this.cHY.get(i8)).x) >= atM)) {
                double atK = this.cHX.atK();
                d = this.cHX.atL();
                double d2 = (double) f3;
                Double.isNaN(d2);
                d2 *= atK;
                atK = (double) atM;
                Double.isNaN(atK);
                d2 -= atK * d;
                double d3 = (double) (f3 - atM);
                Double.isNaN(d3);
                aa aaVar3 = new aa(d2 / d3, aaVar.y);
                this.cHY.add(0, aaVar3);
                this.cHX.a(aaVar3);
            }
            this.cHX.atJ();
        }
    }

    public void a(@NonNull com.iqoption.dialog.a.a.d dVar) {
        com.iqoption.dialog.a.a.d.a aVar = this.cHX;
        if (aVar == null) {
            throw new IllegalStateException("Graph data is not initialized: bounds is null");
        } else if (this.cHY != null) {
            dVar.setBounds(aVar);
            dVar.setGraphPoints(this.cHY);
        } else {
            throw new IllegalStateException("Graph data is not initialized: points is null");
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
        Object obj = null;
        for (com.iqoption.mobbtech.connect.response.options.c createTime : this.aTU) {
            if (createTime.getCreateTime() % 1000 > 0) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        if (obj == null || !this.cHV || !com.iqoption.core.d.EH().ej("tick-deals")) {
            return null;
        }
        eu i = eu.i(layoutInflater, viewGroup, false);
        com.iqoption.core.util.b.a aVar = new com.iqoption.core.util.b.a(this.context.getString(R.string.following_this_link), f.a(this.context, this.anF.getActiveId(), this.cHU.getCreateTime()));
        String string = this.context.getString(R.string.executed_tick_by_tick_n1, new Object[]{aVar.getText()});
        com.iqoption.core.util.b.d.a(new com.iqoption.core.util.b.e(new com.iqoption.core.util.b.a[]{aVar}, i.cae, string));
        return i.getRoot();
    }
}
