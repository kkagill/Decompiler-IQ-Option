package com.iqoption.a.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.aj;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.managers.a.e;
import com.iqoption.app.managers.l;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.view.timer.TimerView;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: ExpirationAdapter */
public class c extends Adapter<ViewHolder> {
    private com.iqoption.a.b.a akC;
    private a anA = new a();
    private ImmutableList<Expiration> anp = ImmutableList.sQ();
    @Nullable
    private RecyclerView ans;
    private Set<Long> any = Sets.uw();
    private final long anz;
    private final InstrumentType instrumentType;
    private Interpolator kl = com.iqoption.view.a.a.c.egR;

    /* compiled from: ExpirationAdapter */
    private static class a implements com.iqoption.view.a.b.a {
        private final WeakReference<c> anu;

        private a(c cVar) {
            this.anu = new WeakReference(cVar);
        }

        public void onTick(long j) {
            c cVar = (c) this.anu.get();
            if (cVar != null && cVar.anp.size() != 0) {
                aj sK = cVar.anp.iterator();
                while (sK.hasNext()) {
                    Expiration expiration = (Expiration) sK.next();
                    if (!expiration.isSpecial) {
                        if (expiration.expirationsInGroup != null) {
                            for (Expiration b : expiration.expirationsInGroup) {
                                b(cVar, b);
                            }
                        } else {
                            b(cVar, expiration);
                        }
                    }
                }
            }
        }

        private void b(c cVar, Expiration expiration) {
            b a = cVar.N(expiration.getStableId());
            if (a != null) {
                long longValue = expiration.expValue.longValue() - l.HZ().Ib();
                if (longValue <= cVar.anz) {
                    a.reset();
                    cVar.dataSetChanged();
                } else {
                    a.h(longValue, cVar.a(expiration));
                }
            }
        }
    }

    /* compiled from: ExpirationAdapter */
    private static class b extends ViewHolder implements OnClickListener {
        TextView anj;
        TimerView anv;
        com.iqoption.a.b.a listener;

        b(View view, com.iqoption.a.b.a aVar) {
            super(view);
            this.anv = (TimerView) view.findViewById(R.id.timerView);
            this.anj = (TextView) view.findViewById(R.id.time);
            this.itemView.setOnClickListener(this);
            this.listener = aVar;
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            com.iqoption.a.b.a aVar = this.listener;
            if (aVar != null) {
                aVar.onItemClick(view, adapterPosition);
            }
        }

        public void reset() {
            TimerView timerView = this.anv;
            if (timerView != null) {
                timerView.reset();
            }
        }

        public void h(long j, long j2) {
            TimerView timerView = this.anv;
            if (timerView != null) {
                if (timerView.getMaxValue() == 0) {
                    this.anv.setMaxValue(j2);
                }
                this.anv.cw(j);
            }
        }
    }

    /* compiled from: ExpirationAdapter */
    private static class c extends ViewHolder implements OnClickListener {
        TextView amZ;
        View anB;
        com.iqoption.a.b.a listener;

        c(View view, com.iqoption.a.b.a aVar) {
            super(view);
            this.amZ = (TextView) view.findViewById(R.id.name);
            this.anB = view.findViewById(R.id.arrow);
            this.itemView.setOnClickListener(this);
            this.listener = aVar;
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            com.iqoption.a.b.a aVar = this.listener;
            if (aVar != null) {
                aVar.onItemClick(view, adapterPosition);
            }
        }
    }

    /* compiled from: ExpirationAdapter */
    private static class d extends ViewHolder implements OnClickListener {
        TextView amZ;
        TextView anC;
        com.iqoption.a.b.a listener;

        d(View view, com.iqoption.a.b.a aVar) {
            super(view);
            this.anC = (TextView) view.findViewById(R.id.date);
            this.amZ = (TextView) view.findViewById(R.id.name);
            this.itemView.setOnClickListener(this);
            this.listener = aVar;
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            com.iqoption.a.b.a aVar = this.listener;
            if (aVar != null) {
                aVar.onItemClick(view, adapterPosition);
            }
        }
    }

    public c(InstrumentType instrumentType, long j, com.iqoption.a.b.a aVar) {
        this.instrumentType = instrumentType;
        this.anz = j;
        d(com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(TabHelper.IM().IX()), this.instrumentType));
        if (this.instrumentType != InstrumentType.TURBO_INSTRUMENT) {
            long Je = TabHelper.IM().Je();
            aj sK = this.anp.iterator();
            while (sK.hasNext()) {
                Expiration expiration = (Expiration) sK.next();
                if (expiration.expirationsInGroup != null) {
                    for (Expiration expiration2 : expiration.expirationsInGroup) {
                        if (expiration2.expValue.equals(Long.valueOf(Je))) {
                            this.any.add(Long.valueOf(expiration.getStableId()));
                            break;
                        }
                    }
                }
            }
        }
        this.akC = aVar;
    }

    private void d(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        if (aVar != null) {
            try {
                this.anp = ImmutableList.m((Collection) e.Ig().m(aVar).get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public void dataSetChanged() {
        d(com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(TabHelper.IM().IX()), this.instrumentType));
        notifyDataSetChanged();
    }

    public void b(Expiration expiration) {
        double d;
        long stableId = expiration.getStableId();
        if (this.any.contains(Long.valueOf(stableId))) {
            this.any.remove(Long.valueOf(stableId));
            d = 0.0d;
        } else {
            this.any.add(Long.valueOf(stableId));
            d = 1.0d;
        }
        String str = "instrument_type";
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "expiration-time_open-set").setValue(Double.valueOf(d)).setParameters(u.anp().o("line_type", expiration.title).o(str, TabHelper.IM().IY()).anr()).build());
        notifyDataSetChanged();
    }

    public int getItemCount() {
        int size = this.anp.size();
        aj sK = this.anp.iterator();
        while (sK.hasNext()) {
            Expiration expiration = (Expiration) sK.next();
            if (expiration.expirationsInGroup != null && this.any.contains(Long.valueOf(expiration.getStableId()))) {
                size += expiration.expirationsInGroup.size();
            }
        }
        return size;
    }

    public int getItemViewType(int i) {
        Expiration dw = dw(i);
        if (dw.expirationsInGroup != null) {
            return 3;
        }
        return dw.isSpecial ? 2 : 1;
    }

    public long getItemId(int i) {
        return dw(i).getStableId();
    }

    public Expiration dw(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.anp.size(); i3++) {
            Expiration expiration = (Expiration) this.anp.get(i3);
            if (i2 == i) {
                return expiration;
            }
            if (!this.any.contains(Long.valueOf(expiration.getStableId())) || expiration.expirationsInGroup == null) {
                i2++;
            } else if (expiration.expirationsInGroup.size() + i2 >= i) {
                return (Expiration) expiration.expirationsInGroup.get((i - i2) - 1);
            } else {
                i2 += expiration.expirationsInGroup.size() + 1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("item not found for pos ");
        stringBuilder.append(i);
        stringBuilder.append(" of ");
        stringBuilder.append(getItemCount());
        throw new RuntimeException(stringBuilder.toString());
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.special_expiration_item, viewGroup, false), this.akC);
        }
        if (i == 3) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_expiration_item, viewGroup, false), this.akC);
        }
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.default_expiration_item, viewGroup, false), this.akC);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Expiration dw = dw(i);
        i = getItemViewType(i);
        if (i == 1) {
            a(dw, (b) viewHolder);
        } else if (i == 2) {
            a(dw, (d) viewHolder);
        } else if (i == 3) {
            a(dw, (c) viewHolder);
        }
    }

    private void a(Expiration expiration, b bVar) {
        bVar.anj.setText(expiration.title);
        bVar.h(expiration.expValue.longValue() - l.HZ().Ib(), a(expiration));
        if (expiration.expValue.longValue() == TabHelper.IM().Je() && TabHelper.IM().IY().equals(this.instrumentType)) {
            bVar.itemView.setSelected(true);
        } else {
            bVar.itemView.setSelected(false);
        }
    }

    private void a(Expiration expiration, d dVar) {
        dVar.amZ.setText(expiration.title);
        dVar.anC.setText(expiration.date);
        if (expiration.expValue.longValue() == TabHelper.IM().Je() && TabHelper.IM().IY().equals(this.instrumentType)) {
            dVar.itemView.setSelected(true);
        } else {
            dVar.itemView.setSelected(false);
        }
        dVar.amZ.setSelected(false);
    }

    private void a(Expiration expiration, c cVar) {
        cVar.amZ.setText(expiration.title);
        if (this.any.contains(Long.valueOf(expiration.getStableId()))) {
            cVar.itemView.setSelected(true);
            cVar.anB.animate().rotation(270.0f).setInterpolator(this.kl).start();
            return;
        }
        cVar.itemView.setSelected(false);
        cVar.anB.animate().rotation(90.0f).setInterpolator(this.kl).start();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.ans = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.ans = null;
    }

    public void onStart() {
        notifyDataSetChanged();
        AQ();
    }

    public void onStop() {
        AR();
    }

    private void AQ() {
        com.iqoption.view.a.b.aYv().a(this.anA);
    }

    private void AR() {
        com.iqoption.view.a.b.aYv().b(this.anA);
    }

    private long a(Expiration expiration) {
        ImmutableList immutableList = this.anp;
        return (immutableList == null || immutableList.size() == 0) ? 0 : ((expiration.expValue.longValue() - ((Expiration) this.anp.get(0)).expValue.longValue()) + expiration.expInterval.longValue()) + this.anz;
    }

    @Nullable
    private b N(long j) {
        RecyclerView recyclerView = this.ans;
        if (recyclerView != null) {
            ViewHolder findViewHolderForItemId = recyclerView.findViewHolderForItemId(j);
            if (findViewHolderForItemId instanceof b) {
                return (b) findViewHolderForItemId;
            }
        }
        return null;
    }
}
