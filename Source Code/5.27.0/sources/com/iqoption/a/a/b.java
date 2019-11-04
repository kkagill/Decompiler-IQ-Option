package com.iqoption.a.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.iqoption.app.managers.a.e;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.util.v;
import com.iqoption.x.R;

/* compiled from: DigitalExpirationAdapter */
public class b extends Adapter<c> implements com.iqoption.view.stickyheadersrecyclerview.c<b> {
    private com.iqoption.a.b.a akC;
    private ImmutableList<Expiration> anp = ImmutableList.sQ();
    private volatile boolean anr = false;
    private a anw = new a(this);

    /* compiled from: DigitalExpirationAdapter */
    static class b extends ViewHolder {
        public TextView anx;

        b(View view) {
            super(view);
            this.anx = (TextView) view;
        }
    }

    /* compiled from: DigitalExpirationAdapter */
    static class c extends ViewHolder implements OnClickListener {
        TextView anj;
        com.iqoption.a.b.a listener;

        c(View view, com.iqoption.a.b.a aVar) {
            super(view);
            this.anj = (TextView) view;
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

    /* compiled from: DigitalExpirationAdapter */
    private static class a extends com.iqoption.system.c.b<b, ImmutableList<Expiration>> {
        public a(b bVar) {
            super(bVar);
        }

        /* renamed from: b */
        public void v(b bVar, ImmutableList<Expiration> immutableList) {
            bVar.anp = immutableList;
            bVar.anr = false;
            bVar.notifyDataSetChanged();
        }

        /* renamed from: a */
        public void c(@NonNull b bVar, Throwable th) {
            bVar.anr = false;
        }
    }

    public int aJ(Context context) {
        return 0;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public b(com.iqoption.a.b.a aVar) {
        this.akC = aVar;
        setHasStableIds(true);
        dataSetChanged();
    }

    private void d(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        if (aVar != null && !this.anr) {
            this.anr = true;
            v.a(e.Ig().m(aVar), this.anw);
        }
    }

    public void dataSetChanged() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar;
        i Jh = TabHelper.IM().Jh();
        if (Jh == null) {
            aVar = null;
        } else {
            aVar = Jh.Js();
        }
        if (aVar != null) {
            d(aVar);
        }
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

    /* renamed from: d */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.digital_expiration_item, viewGroup, false), this.akC);
    }

    /* renamed from: a */
    public void onBindViewHolder(c cVar, int i) {
        a(dw(i), cVar);
    }

    private void a(Expiration expiration, c cVar) {
        i Jh = TabHelper.IM().Jh();
        if (Jh != null && expiration.expValue.longValue() == Jh.getExpiration() && expiration.getDigitalExpirationPeriod() == Jh.Jy()) {
            cVar.itemView.setSelected(true);
        } else {
            cVar.itemView.setSelected(false);
        }
        cVar.anj.setText(expiration.title);
    }

    public long dx(int i) {
        return (long) dw(i).expInterval.hashCode();
    }

    /* renamed from: e */
    public b f(ViewGroup viewGroup) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_digital_item, viewGroup, false));
    }

    public void a(b bVar, int i) {
        bVar.anx.setText(TimeUtil.bo(dw(i).getDigitalExpirationPeriod()));
    }
}
