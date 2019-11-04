package com.iqoption.a;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.base.f;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonObject;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.iqbus.SignalLegacy;
import com.iqoption.e.wl;
import com.iqoption.e.wn;
import com.iqoption.e.wp;
import com.iqoption.e.wr;
import com.iqoption.util.ab;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PriceMovementsAdapter */
public class e extends Adapter<ViewHolder> {
    private static final int amn = Math.min(1000, 5000);
    @Nullable
    private RecyclerView alz;
    private final c amo;
    private ArrayList<b> amp;
    @Nullable
    private a amq;

    /* compiled from: PriceMovementsAdapter */
    private static class a implements Runnable {
        private final WeakReference<View> ams;

        public a(View view) {
            this.ams = new WeakReference(view);
        }

        public void run() {
            View view = (View) this.ams.get();
            if (view != null && ViewCompat.isAttachedToWindow(view)) {
                view.setVisibility(8);
            }
        }
    }

    /* compiled from: PriceMovementsAdapter */
    public static class b {
        public int activeId;
        public String amA;
        public String amB;
        public String amC;
        public String amD;
        public String amE;
        public int amF;
        public long amG;
        public long amH;
        public SignalLegacy amI;
        public int amt;
        public int[] amu;
        public boolean amv;
        public long amw;
        public long amx;
        public long amy;
        public long amz;
        public int filter;
        public InstrumentType instrumentType;
        public int level;
        public long startTime;
        public int type;
        public double value;

        public static int dt(int i) {
            return (i == 0 || i == 1 || i == 10) ? 0 : 1;
        }

        public b(Context context, SignalLegacy signalLegacy) {
            this.amI = signalLegacy;
            int intValue = signalLegacy.type.intValue();
            this.amA = ds(intValue);
            this.startTime = signalLegacy.start_time.longValue();
            this.amw = signalLegacy.finish_time.longValue();
            this.activeId = signalLegacy.active_id.intValue();
            this.amx = signalLegacy.start_value.longValue();
            this.amy = signalLegacy.finish_value.longValue();
            this.amv = signalLegacy.finish_value.longValue() > signalLegacy.start_value.longValue();
            this.instrumentType = signalLegacy.getOptionType();
            this.amD = a(context, signalLegacy);
            this.amH = signalLegacy.id.longValue();
            this.amG = signalLegacy.created.longValue();
            this.level = signalLegacy.level == null ? 0 : signalLegacy.level.intValue();
            Date date = new Date(TimeUnit.SECONDS.toMillis(this.amG));
            this.amC = TimeUtil.bRq.format(date);
            this.amE = TimeUtil.bRz.format(date);
            this.filter = 0;
            this.type = dt(intValue);
            switch (intValue) {
                case 0:
                    this.filter = 1;
                    break;
                case 1:
                    this.filter = 2;
                    break;
                case 4:
                    this.filter = 3;
                    break;
                case 5:
                    this.filter = 4;
                    break;
                case 8:
                    this.filter = 5;
                    break;
                case 9:
                    this.filter = 6;
                    break;
            }
            e b = e.b(signalLegacy);
            this.amt = b.amt;
            this.amF = b.amF;
            this.amB = b.amB;
            this.value = b.value;
            this.amu = b.amu;
        }

        public static String ds(int i) {
            return (i < 0 || i >= com.iqoption.fragment.d.b.dqo.length) ? "" : com.iqoption.fragment.d.b.dqo[i];
        }

        public static String a(Context context, SignalLegacy signalLegacy) {
            com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(signalLegacy.active_id, signalLegacy.getOptionType());
            if (a == null) {
                return "";
            }
            return com.iqoption.core.microservices.tradingengine.response.active.d.B(a);
        }
    }

    /* compiled from: PriceMovementsAdapter */
    public interface c {
        void N(View view);
    }

    /* compiled from: PriceMovementsAdapter */
    public static class e {
        public String amB = "";
        public int amF = -1;
        @DrawableRes
        public int amt = 0;
        @DrawableRes
        public int[] amu;
        double value;
    }

    /* compiled from: PriceMovementsAdapter */
    public class d extends d<wn> implements OnClickListener {
        public b amJ;

        /* synthetic */ d(e eVar, wn wnVar, int i, AnonymousClass1 anonymousClass1) {
            this(wnVar, i);
        }

        private d(wn wnVar, int i) {
            super(wnVar, i);
            wnVar.getRoot().setOnClickListener(this);
        }

        public void onClick(View view) {
            e.a(this.amJ.amI, view.getRootView());
            if (e.this.amo != null) {
                e.this.amo.N(view);
            }
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.alz = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.alz = null;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            wr wrVar = (wr) DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.price_movements_tittle_item, viewGroup, false);
            wrVar.cqz.setText(R.string.move_right_now);
            return new d(wrVar, 0);
        } else if (i == 1) {
            return new d((wl) DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.price_movements_high_frequency_layout, viewGroup, false), 1);
        } else {
            if (i == 2) {
                return new d(this, (wn) DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.price_movements_item, viewGroup, false), 2, null);
            }
            if (i != 3) {
                return null;
            }
            return new d((wp) DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.price_movements_progress, viewGroup, false), 3);
        }
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        d dVar = (d) viewHolder;
        int i2 = dVar.type;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            wl wlVar = (wl) dVar.amm;
            ImmutableList b = com.iqoption.fragment.d.b.aIa().b(true, 10);
            if (wlVar.cqn.getAdapter() == null) {
                wlVar.cqn.setAdapter(new f(new com.iqoption.a.f.a() {
                    public void b(SignalLegacy signalLegacy, View view) {
                        e.a(signalLegacy, view.getRootView());
                        if (e.this.amo != null) {
                            e.this.amo.N(null);
                        }
                    }
                }, b));
                a(wlVar, b);
                wlVar.cqn.addItemDecoration(new com.iqoption.widget.c(wlVar.getRoot().getContext().getResources().getDimensionPixelOffset(R.dimen.dp10), true, false));
                return;
            }
            ((f) wlVar.cqn.getAdapter()).a(b);
            a(wlVar, b);
        } else if (i2 == 2) {
            d dVar2 = (d) viewHolder;
            wn wnVar = (wn) dVar2.amm;
            i2 = i - 2;
            b bVar = (b) this.amp.get(i2);
            dVar2.amJ = bVar;
            wnVar.cqp.setImageResource(bVar.amt);
            wnVar.cqv.setText(bVar.amA);
            wnVar.cqw.setTextColor(bVar.amF);
            int indexOf = bVar.amB.indexOf(37);
            if (indexOf == -1) {
                wnVar.cqw.setText(bVar.amB);
            } else {
                SpannableString spannableString = new SpannableString(bVar.amB);
                spannableString.setSpan(new StyleSpan(1), indexOf, indexOf + 1, 33);
                wnVar.cqw.setText(spannableString);
            }
            wnVar.cqk.setText(bVar.amD);
            wnVar.cqu.setText(bVar.amC);
            wnVar.cqo.setText(bVar.amC);
            if (bVar.amu != null) {
                wnVar.cqr.setImageResource(bVar.amu[0]);
                wnVar.cqs.setImageResource(bVar.amu[1]);
                wnVar.cqt.setImageResource(bVar.amu[2]);
                wnVar.cqq.setVisibility(0);
            } else {
                wnVar.cqq.setVisibility(8);
            }
            if (i <= 2 || bVar.amz != ((b) this.amp.get(i2 - 1)).amz) {
                wnVar.cqo.setText(TimeUtil.bq(bVar.amG * 1000));
                wnVar.cqo.setVisibility(0);
            } else {
                wnVar.cqo.setVisibility(8);
            }
            wnVar.getRoot().setAlpha(bVar.amI.isActiveAvailable() ? 1.0f : 0.5f);
        } else if (i2 == 3) {
            wp wpVar = (wp) dVar.amm;
            wpVar.cqx.setVisibility(0);
            if (this.amq != null) {
                wpVar.cqx.removeCallbacks(this.amq);
            }
            this.amq = new a(wpVar.cqx);
            wpVar.cqx.postDelayed(this.amq, 10000);
        }
    }

    public static void a(SignalLegacy signalLegacy, View view) {
        SignalLegacy signalLegacy2 = signalLegacy;
        View view2 = view;
        InstrumentType optionType = signalLegacy.getOptionType();
        if (optionType != null) {
            int dt = b.dt(signalLegacy2.type.intValue());
            String a = b.a(IQApp.Eu().getApplicationContext(), signalLegacy2);
            String ds = b.ds(signalLegacy2.type.intValue());
            e b = b(signalLegacy);
            boolean equal = f.equal(signalLegacy2.type, Integer.valueOf(10));
            Context applicationContext = IQApp.Eu().getApplicationContext();
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, equal ? "signals_show-signal-move-now" : "signals_show-signal-today").setValue(Double.valueOf(signalLegacy2.id.doubleValue())).setParameters(a(signalLegacy)).build());
            Context context = applicationContext;
            com.iqoption.gl.c.aIy().tabShowSignal(dt, signalLegacy2.active_id.intValue(), signalLegacy2.start_time.longValue(), signalLegacy2.finish_time.longValue(), (double) (((float) signalLegacy2.start_value.longValue()) / 1000000.0f), (double) (((float) signalLegacy2.finish_value.longValue()) / 1000000.0f), a, ds, b.amB, true, signalLegacy2.id.longValue(), optionType.getOptionActiveOrInstrumentValue());
            EventManager.BS().a(Event.Builder(Event.CATEGORY_POPUP_SERVED, "left-bar_new-tab-signals-history").setValue(Double.valueOf((double) TabHelper.IM().getTabsCount())).setParameters(u.anp().o("instrument_type", optionType).anr()).build());
            if (view2 != null) {
                com.iqoption.fragment.d.a.aHX().a(context, view2, 800);
            }
        }
    }

    private static JsonObject a(SignalLegacy signalLegacy) {
        return u.anp().o("type", signalLegacy.type).o("created", signalLegacy.created).o("active_id", signalLegacy.active_id).o("start_time", signalLegacy.start_time).o("finish_time", signalLegacy.finish_time).o("start_value", signalLegacy.start_value).o("finish_value", signalLegacy.finish_value).o("level", signalLegacy.level).anr();
    }

    private void a(wl wlVar, ImmutableList<SignalLegacy> immutableList) {
        if (immutableList.isEmpty()) {
            wlVar.cqm.setVisibility(0);
            wlVar.cqn.setVisibility(8);
            return;
        }
        wlVar.cqn.setVisibility(0);
        wlVar.cqm.setVisibility(8);
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return dr(i) ? 3 : 2;
    }

    public long getItemId(int i) {
        if (i <= 2) {
            return (long) ((-i) - 2);
        }
        if (dr(i)) {
            return -4;
        }
        i -= 2;
        return i < this.amp.size() ? ((b) this.amp.get(i)).amH : -1;
    }

    private boolean dr(int i) {
        return i >= this.amp.size() + 2;
    }

    public int getItemCount() {
        return (this.amp.size() + 2) + 1;
    }

    public static e b(SignalLegacy signalLegacy) {
        e eVar = new e();
        Context applicationContext = IQApp.Eu().getApplicationContext();
        if (signalLegacy.type.intValue() < 2 || signalLegacy.type.intValue() == 10) {
            int intValue;
            if (signalLegacy.finish_value.longValue() > signalLegacy.start_value.longValue()) {
                eVar.amt = R.drawable.ic_bull_white_24dp;
                eVar.amF = ContextCompat.getColor(applicationContext, R.color.green);
                eVar.amB = "+";
                intValue = signalLegacy.level.intValue();
                if (intValue == 1) {
                    eVar.amu = new int[]{R.drawable.ic_signal_dot_green1, R.drawable.ic_signal_dot_green2, R.drawable.ic_signal_dot_green2};
                } else if (intValue == 2) {
                    eVar.amu = new int[]{R.drawable.ic_signal_dot_green1, R.drawable.ic_signal_dot_green1, R.drawable.ic_signal_dot_green2};
                } else if (intValue == 3) {
                    eVar.amu = new int[]{R.drawable.ic_signal_dot_green1, R.drawable.ic_signal_dot_green1, R.drawable.ic_signal_dot_green1};
                }
            } else {
                eVar.amt = R.drawable.ic_bear_white_24dp;
                eVar.amF = ContextCompat.getColor(applicationContext, R.color.red);
                eVar.amB = "";
                intValue = signalLegacy.level.intValue();
                if (intValue == 1) {
                    eVar.amu = new int[]{R.drawable.ic_signal_dot_red1, R.drawable.ic_signal_dot_red2, R.drawable.ic_signal_dot_red2};
                } else if (intValue == 2) {
                    eVar.amu = new int[]{R.drawable.ic_signal_dot_red1, R.drawable.ic_signal_dot_red1, R.drawable.ic_signal_dot_red2};
                } else if (intValue == 3) {
                    eVar.amu = new int[]{R.drawable.ic_signal_dot_red1, R.drawable.ic_signal_dot_red1, R.drawable.ic_signal_dot_red1};
                }
            }
            float longValue = signalLegacy.start_value.longValue() != 0 ? ((((float) signalLegacy.finish_value.longValue()) / ((float) signalLegacy.start_value.longValue())) - 1.0f) * 100.0f : 0.0f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(eVar.amB);
            stringBuilder.append(String.format(Locale.US, "%.2f%%", new Object[]{Float.valueOf(longValue)}));
            eVar.amB = stringBuilder.toString();
            if (signalLegacy.type.intValue() == 1 || signalLegacy.type.intValue() == 10) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(eVar.amB);
                stringBuilder2.append(" in ");
                stringBuilder2.append(TimeUtil.formatElapsedTime(signalLegacy.finish_time.longValue() - signalLegacy.start_time.longValue()));
                eVar.amB = stringBuilder2.toString();
            }
            double longValue2 = (double) (signalLegacy.finish_value.longValue() - signalLegacy.start_value.longValue());
            double longValue3 = (double) signalLegacy.start_value.longValue();
            Double.isNaN(longValue2);
            Double.isNaN(longValue3);
            eVar.value = longValue2 / longValue3;
        } else {
            if (signalLegacy.type.intValue() % 2 == 0) {
                eVar.amt = R.drawable.ic_signals_hi;
                eVar.amF = ContextCompat.getColor(applicationContext, R.color.green);
            } else {
                eVar.amt = R.drawable.ic_signals_lo;
                eVar.amF = ContextCompat.getColor(applicationContext, R.color.red);
            }
            eVar.amB = String.format(Locale.US, "%.6f", new Object[]{Double.valueOf(ab.g((double) (((float) signalLegacy.finish_value.longValue()) / 1000000.0f), 6))});
            eVar.value = (double) signalLegacy.finish_value.longValue();
        }
        return eVar;
    }
}
