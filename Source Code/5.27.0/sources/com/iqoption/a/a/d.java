package com.iqoption.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.aj;
import com.iqoption.app.managers.a.e;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.util.v;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* compiled from: FxExpirationAdapter */
public class d extends Adapter<d> implements com.iqoption.view.stickyheadersrecyclerview.c<c> {
    private com.iqoption.a.b.a akC;
    private final Ordering<com.iqoption.core.microservices.f.a.a.a> akc = new Ordering<com.iqoption.core.microservices.f.a.a.a>() {
        /* renamed from: a */
        public int compare(com.iqoption.core.microservices.f.a.a.a aVar, com.iqoption.core.microservices.f.a.a.a aVar2) {
            long j;
            Long a = com.iqoption.core.microservices.f.a.a.a.a(aVar);
            Long a2 = com.iqoption.core.microservices.f.a.a.a.a(aVar2);
            long j2 = 0;
            if (a == null) {
                j = 0;
            } else {
                j = a.longValue();
            }
            if (a2 != null) {
                j2 = a2.longValue();
            }
            return Long.compare(j, j2);
        }
    };
    private b anD = new b(this);
    private ImmutableList<a> anp = ImmutableList.sQ();
    private volatile boolean anr = false;

    /* compiled from: FxExpirationAdapter */
    public static class a {
        public final com.iqoption.core.microservices.tradingengine.response.active.a anF;
        public final boolean anG;
        public final Expiration anH;
        public final String anI;

        a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, boolean z, Expiration expiration, String str) {
            this.anF = aVar;
            this.anG = z;
            this.anH = expiration;
            this.anI = str;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.anF.getActiveId()), Boolean.valueOf(this.anG), this.anI});
        }

        public int AS() {
            return this.anG ^ 1;
        }
    }

    /* compiled from: FxExpirationAdapter */
    static class c extends ViewHolder {
        public TextView anx;

        c(View view) {
            super(view);
            this.anx = (TextView) view;
        }
    }

    /* compiled from: FxExpirationAdapter */
    static class d extends ViewHolder implements OnClickListener {
        ImageView akZ;
        TextView anJ;
        TextView anj;
        com.iqoption.a.b.a listener;

        d(View view, com.iqoption.a.b.a aVar) {
            super(view);
            this.listener = aVar;
            this.itemView.setOnClickListener(this);
            this.anj = (TextView) view.findViewById(R.id.time);
            this.anJ = (TextView) view.findViewById(R.id.activeName);
            this.akZ = (ImageView) view.findViewById(R.id.activeIcon);
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            com.iqoption.a.b.a aVar = this.listener;
            if (aVar != null) {
                aVar.onItemClick(view, adapterPosition);
            }
        }
    }

    /* compiled from: FxExpirationAdapter */
    private static class b extends com.iqoption.system.c.b<d, ImmutableList<Expiration>> {
        com.iqoption.core.microservices.tradingengine.response.active.a anF;

        public b(d dVar) {
            super(dVar);
        }

        /* renamed from: a */
        public void v(d dVar, ImmutableList<Expiration> immutableList) {
            dVar.anr = false;
            dVar.a(this.anF, (ImmutableList) immutableList);
        }

        /* renamed from: a */
        public void c(@NonNull d dVar, Throwable th) {
            dVar.anr = false;
        }

        public void e(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.anF = aVar;
        }
    }

    public int aJ(Context context) {
        return 0;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public d(com.iqoption.a.b.a aVar) {
        this.akC = aVar;
        setHasStableIds(true);
        dataSetChanged();
    }

    private void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, ImmutableList<Expiration> immutableList) {
        com.google.common.collect.ImmutableList.a sT = ImmutableList.sT();
        aj sK = immutableList.iterator();
        while (sK.hasNext()) {
            Expiration expiration = (Expiration) sK.next();
            sT.aI(new a(aVar, true, expiration, expiration.title));
        }
        com.iqoption.app.helpers.a Gs = com.iqoption.app.helpers.a.Gs();
        ArrayList arrayList = new ArrayList(Gs.e(InstrumentType.FX_INSTRUMENT).values());
        Collections.sort(arrayList, this.akc);
        int i = 0;
        int i2 = 0;
        while (i < 2 && i2 < arrayList.size()) {
            com.iqoption.core.microservices.f.a.a.a aVar2 = (com.iqoption.core.microservices.f.a.a.a) arrayList.get(i2);
            Long a = com.iqoption.core.microservices.f.a.a.a.a(aVar2);
            com.iqoption.core.microservices.tradingengine.response.active.a a2 = Gs.a(Integer.valueOf(aVar2.getActiveId()), InstrumentType.FX_INSTRUMENT);
            if (!(a == null || a2 == null || aVar.getActiveId() == a2.getActiveId() || a2.isSuspended() || !com.iqoption.util.c.a.z(a2))) {
                sT.aI(new a(a2, false, null, TimeUtil.bRq.format(a)));
                i++;
            }
            i2++;
        }
        this.anp = sT.sU();
        notifyDataSetChanged();
    }

    public void dataSetChanged() {
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
        if (IZ != null && !this.anr) {
            this.anr = true;
            this.anD.e(IZ);
            v.a(e.Ig().m(IZ), this.anD);
        }
    }

    public int getItemCount() {
        return this.anp.size();
    }

    public long getItemId(int i) {
        return (long) dy(i).hashCode();
    }

    public a dy(int i) {
        return (a) this.anp.get(i);
    }

    @NonNull
    /* renamed from: e */
    public d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fx_expiration_item, viewGroup, false), this.akC);
    }

    /* renamed from: a */
    public void onBindViewHolder(@NonNull d dVar, int i) {
        a(dy(i), dVar);
    }

    private void a(a aVar, d dVar) {
        Context context = dVar.itemView.getContext();
        com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = aVar.anF;
        if (aVar2 != null) {
            String image = aVar2.getImage();
            if (!TextUtils.isEmpty(image)) {
                Picasso.with(context).load(image).into(dVar.akZ);
            }
            dVar.anJ.setText(com.iqoption.core.microservices.tradingengine.response.active.d.B(aVar2));
        }
        i Jh = TabHelper.IM().Jh();
        if (Jh == null || aVar.anH == null || aVar.anH.expValue.longValue() != Jh.getExpiration() || aVar.anH.getDigitalExpirationPeriod() != Jh.Jy()) {
            dVar.itemView.setSelected(false);
        } else {
            dVar.itemView.setSelected(true);
        }
        dVar.anj.setText(aVar.anI);
    }

    public long dx(int i) {
        return (long) dy(i).AS();
    }

    /* renamed from: g */
    public c f(ViewGroup viewGroup) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_digital_item, viewGroup, false));
    }

    public void a(c cVar, int i) {
        Context context = cVar.itemView.getContext();
        i = dy(i).AS();
        if (i == 0) {
            cVar.anx.setText(context.getString(R.string.current));
        } else if (i == 1) {
            cVar.anx.setText(context.getString(R.string.nearest));
        }
    }
}
