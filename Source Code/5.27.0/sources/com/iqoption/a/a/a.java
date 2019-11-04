package com.iqoption.a.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aj;
import com.google.common.util.concurrent.p;
import com.iqoption.app.managers.a.e;
import com.iqoption.app.managers.l;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.view.timer.TimerView;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

/* compiled from: CfdExpirationAdapter */
public class a extends Adapter<c> {
    private com.iqoption.a.b.a akC;
    protected ImmutableList<Expiration> anp = ImmutableList.sQ();
    private b anq = new b(this);
    private volatile boolean anr = false;
    @Nullable
    private RecyclerView ans;
    private a ant = new a();

    /* compiled from: CfdExpirationAdapter */
    private static class a implements com.iqoption.view.a.b.a {
        private final WeakReference<a> anu;

        private a(a aVar) {
            this.anu = new WeakReference(aVar);
        }

        public void onTick(long j) {
            a aVar = (a) this.anu.get();
            if (aVar != null && aVar.anp.size() != 0) {
                aj sK = aVar.anp.iterator();
                while (sK.hasNext()) {
                    b(aVar, (Expiration) sK.next());
                }
            }
        }

        private void b(a aVar, Expiration expiration) {
            c a = aVar.M(expiration.getStableId());
            if (a != null) {
                a.h(expiration.expValue.longValue() - l.HZ().Ib(), aVar.a(expiration));
            }
        }
    }

    /* compiled from: CfdExpirationAdapter */
    protected static class c extends ViewHolder implements OnClickListener {
        TextView anj;
        TimerView anv;
        com.iqoption.a.b.a listener;

        c(View view, com.iqoption.a.b.a aVar) {
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

    /* compiled from: CfdExpirationAdapter */
    private static class b extends com.iqoption.system.c.b<a, ImmutableList<Expiration>> {
        public b(a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void v(a aVar, ImmutableList<Expiration> immutableList) {
            aVar.anp = immutableList;
            aVar.anr = false;
            aVar.notifyDataSetChanged();
        }

        /* renamed from: a */
        public void c(@NonNull a aVar, Throwable th) {
            aVar.anr = false;
        }
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public a(com.iqoption.a.b.a aVar) {
        this.akC = aVar;
        setHasStableIds(true);
        dataSetChanged();
    }

    private void d(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        if (aVar != null && !this.anr) {
            this.anr = true;
            p.a(e.Ig().m(aVar), this.anq, com.iqoption.core.c.a.biN);
        }
    }

    public void dataSetChanged() {
        i Jh = TabHelper.IM().Jh();
        if (Jh != null) {
            d(Jh.Js());
        }
    }

    public void onStart() {
        notifyDataSetChanged();
        AQ();
    }

    public void onStop() {
        AR();
    }

    private void AQ() {
        com.iqoption.view.a.b.aYv().a(this.ant);
    }

    private void AR() {
        com.iqoption.view.a.b.aYv().b(this.ant);
    }

    public int getItemCount() {
        return this.anp.size();
    }

    public long getItemId(int i) {
        return dw(i).getStableId();
    }

    public Expiration dw(int i) {
        return (Expiration) this.anp.get(i);
    }

    /* renamed from: c */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cfd_expiration_item, viewGroup, false), this.akC);
    }

    /* renamed from: a */
    public void onBindViewHolder(c cVar, int i) {
        a(dw(i), cVar);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.ans = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.ans = null;
    }

    @Nullable
    private c M(long j) {
        RecyclerView recyclerView = this.ans;
        if (recyclerView != null) {
            ViewHolder findViewHolderForItemId = recyclerView.findViewHolderForItemId(j);
            if (findViewHolderForItemId instanceof c) {
                return (c) findViewHolderForItemId;
            }
        }
        return null;
    }

    private void a(Expiration expiration, c cVar) {
        cVar.anj.setText(expiration.title);
        cVar.h(expiration.expValue.longValue() - l.HZ().Ib(), a(expiration));
        if (expiration.expValue.longValue() == TabHelper.IM().Je()) {
            cVar.itemView.setSelected(true);
        } else {
            cVar.itemView.setSelected(false);
        }
    }

    private long a(Expiration expiration) {
        ImmutableList immutableList = this.anp;
        return (immutableList == null || immutableList.size() < 2) ? 0 : ((expiration.expValue.longValue() - ((Expiration) this.anp.get(0)).expValue.longValue()) + ((Expiration) this.anp.get(1)).expValue.longValue()) - ((Expiration) this.anp.get(0)).expValue.longValue();
    }
}
