package com.iqoption.a.a;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.aj;
import com.google.common.util.concurrent.p;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.app.managers.tab.TabHelper.i;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.af;
import com.iqoption.e.of;
import com.iqoption.e.zb;
import com.iqoption.util.j;
import com.iqoption.x.R;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: StrikeAdapter */
public class e extends Adapter<ViewHolder> {
    private static com.iqoption.core.ui.widget.recyclerview.adapter.b anK = new com.iqoption.core.ui.widget.recyclerview.adapter.b();
    private final com.iqoption.a.b.a akC;
    @ColorInt
    private final int aml;
    private com.iqoption.core.microservices.tradingengine.response.active.a anF;
    @ColorInt
    private final int anL;
    private final b anM;
    private com.iqoption.p.a.a anN;
    private ImmutableList<com.iqoption.core.microservices.tradingengine.response.instrument.e> anO = ImmutableList.sQ();
    private InstrumentType instrumentType;

    /* compiled from: StrikeAdapter */
    public interface b {
        void onDataSet();
    }

    /* compiled from: StrikeAdapter */
    public class a extends ViewHolder implements OnClickListener {
        final of anP;
        final com.iqoption.a.b.a listener;

        a(of ofVar, com.iqoption.a.b.a aVar) {
            super(ofVar.getRoot());
            this.anP = ofVar;
            this.itemView.setOnClickListener(this);
            this.listener = aVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void b(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar) {
            String format = e.this.anN.format(eVar.getValue());
            SpannableString spannableString = new SpannableString(format);
            spannableString.setSpan(new ForegroundColorSpan(e.this.anL), 0, format.length() - 3, 33);
            spannableString.setSpan(new ForegroundColorSpan(e.this.aml), format.length() - 3, format.length(), 33);
            this.anP.clc.setText(spannableString);
            com.iqoption.core.microservices.tradingengine.response.a c = com.iqoption.app.managers.c.GS().c(eVar.aiA().getId(), eVar.getInstrumentType());
            String str = "";
            if (!eVar.aiA().isEnabled() || c == null || c.getAskPrice() == 0.0d) {
                this.anP.ckZ.setVisibility(4);
                this.anP.ckZ.setText(str);
            } else {
                this.anP.ckZ.setVisibility(0);
                this.anP.ckZ.setText(e.this.anN.format(c.getAskPrice()));
            }
            c = com.iqoption.app.managers.c.GS().c(eVar.aiB().getId(), eVar.getInstrumentType());
            if (!eVar.aiB().isEnabled() || c == null || c.getAskPrice() == 0.0d) {
                this.anP.clb.setVisibility(4);
                this.anP.clb.setText(str);
            } else {
                this.anP.clb.setVisibility(0);
                this.anP.clb.setText(e.this.anN.format(c.getAskPrice()));
            }
            com.iqoption.core.microservices.tradingengine.response.instrument.e Jb = TabHelper.IM().Jb();
            if (Jb == null || !eVar.equals(Jb)) {
                this.itemView.setSelected(false);
            } else {
                this.itemView.setSelected(true);
            }
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            com.iqoption.a.b.a aVar = this.listener;
            if (aVar != null) {
                aVar.onItemClick(view, adapterPosition);
            }
        }
    }

    /* compiled from: StrikeAdapter */
    public static class d extends ViewHolder implements OnClickListener {
        final zb anR;
        final com.iqoption.a.b.a listener;

        d(zb zbVar, com.iqoption.a.b.a aVar) {
            super(zbVar.getRoot());
            this.anR = zbVar;
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

    /* compiled from: StrikeAdapter */
    private static class c extends com.iqoption.system.c.b<e, ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e>> {
        public c(e eVar) {
            super(eVar);
        }

        /* renamed from: a */
        public void v(e eVar, ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e> concurrentHashMap) {
            TreeSet d = Sets.d(com.iqoption.core.microservices.tradingengine.response.instrument.e.ORDERING.reverse());
            d.addAll(concurrentHashMap.values());
            eVar.anO = ImmutableList.m(d);
            eVar.notifyDataSetChanged();
            eVar.anM.onDataSet();
        }

        public void l(Throwable th) {
            super.l(th);
        }
    }

    public e(com.iqoption.a.b.a aVar, b bVar) {
        this.akC = aVar;
        this.anM = bVar;
        this.anF = TabHelper.IM().IZ();
        this.anL = ContextCompat.getColor(IQApp.Eu(), R.color.grey_blur_70);
        this.aml = ContextCompat.getColor(IQApp.Eu(), R.color.white_70);
        com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = this.anF;
        this.anN = new com.iqoption.p.a.a(aVar2 == null ? 6 : aVar2.getPrecision());
        setHasStableIds(true);
    }

    public void dataSetChanged() {
        i Jh = TabHelper.IM().Jh();
        this.anF = TabHelper.IM().IZ();
        if (this.anF != null && Jh != null) {
            this.anO = ImmutableList.sQ();
            this.instrumentType = this.anF.getInstrumentType();
            dz(this.anF.getPrecision());
            notifyDataSetChanged();
            com.iqoption.app.managers.a.c h = com.iqoption.app.managers.a.e.Ig().h(this.instrumentType);
            if (h != null) {
                p.a(h.a(Integer.valueOf(this.anF.getActiveId()), this.anF.getInstrumentType(), this.anF.agB(), Long.valueOf(Jh.getExpiration()), Long.valueOf(Jh.Jy()), false), new c(this), com.iqoption.core.c.a.biN);
            }
        }
    }

    private void dz(int i) {
        this.anN.ht(i);
    }

    public int a(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar) {
        ImmutableList immutableList = this.anO;
        if (!(immutableList == null || eVar == null)) {
            int i = 0;
            aj sK = immutableList.iterator();
            while (sK.hasNext()) {
                if (((com.iqoption.core.microservices.tradingengine.response.instrument.e) sK.next()).equals(eVar)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public void e(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        this.anF = aVar;
    }

    public int getItemCount() {
        return this.anO.size();
    }

    public long getItemId(int i) {
        return anK.de(dA(i).aiy());
    }

    public com.iqoption.core.microservices.tradingengine.response.instrument.e dA(int i) {
        return (com.iqoption.core.microservices.tradingengine.response.instrument.e) this.anO.get(i);
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (this.instrumentType == InstrumentType.FX_INSTRUMENT) {
            return new a((of) DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.fx_strike_item, viewGroup, false), this.akC);
        }
        return new d((zb) DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.strike_item, viewGroup, false), this.akC);
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        com.iqoption.core.microservices.tradingengine.response.instrument.e dA = dA(i);
        if (this.instrumentType == InstrumentType.FX_INSTRUMENT) {
            ((a) viewHolder).b(dA);
        } else {
            a(dA, (d) viewHolder);
        }
    }

    private void a(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar, d dVar) {
        String format = this.anN.format(eVar.getValue());
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new ForegroundColorSpan(this.anL), 0, format.length() - 3, 33);
        spannableString.setSpan(new ForegroundColorSpan(this.aml), format.length() - 3, format.length(), 33);
        dVar.anR.clc.setText(spannableString);
        format = j.DO();
        Double aWI = j.aWI();
        com.iqoption.core.microservices.tradingengine.response.a c = com.iqoption.app.managers.c.GS().c(eVar.aiA().getId(), eVar.getInstrumentType());
        String str = "";
        if (!eVar.aiA().isEnabled() || c == null || c.getAskPrice() == 0.0d) {
            dVar.anR.ckZ.setVisibility(4);
            dVar.anR.ckZ.setText(str);
            dVar.anR.cug.setText(str);
        } else {
            dVar.anR.ckZ.setVisibility(0);
            dVar.anR.cug.setText(j.a(aWI, format, Double.valueOf(c.getAskPrice())));
            dVar.anR.ckZ.setText(af.s(c.ahJ()));
        }
        c = com.iqoption.app.managers.c.GS().c(eVar.aiB().getId(), eVar.getInstrumentType());
        if (!eVar.aiB().isEnabled() || c == null || c.getAskPrice() == 0.0d) {
            dVar.anR.clb.setVisibility(4);
            dVar.anR.clb.setText(str);
            dVar.anR.cuh.setText(str);
        } else {
            dVar.anR.clb.setVisibility(0);
            dVar.anR.cuh.setText(j.a(aWI, format, Double.valueOf(c.getAskPrice())));
            dVar.anR.clb.setText(af.s(c.ahJ()));
        }
        com.iqoption.core.microservices.tradingengine.response.instrument.e Jb = TabHelper.IM().Jb();
        if (Jb == null || !eVar.equals(Jb)) {
            dVar.itemView.setSelected(false);
        } else {
            dVar.itemView.setSelected(true);
        }
    }
}
