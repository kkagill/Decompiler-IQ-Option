package com.iqoption.mobbtech.connect.response.options;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.base.d;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aj;
import com.iqoption.app.managers.c;
import com.iqoption.core.c.a;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.position.Position;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: OpenOptionGroup */
public class b implements Parcelable {
    public static final Creator<b> CREATOR = new Creator<b>() {
        /* renamed from: ag */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: gt */
        public b[] newArray(int i) {
            return new b[i];
        }
    };
    private static final String TAG = "com.iqoption.mobbtech.connect.response.options.b";
    public static d<b, Integer> dJg = -$$Lambda$b$q7a8YJy-Q3-NbMFOWtGIBJk_dhI.INSTANCE;
    public int activeId;
    private double bpj;
    public long bwR;
    private long created;
    public long dJh;
    public double dJi;
    private double dJj;
    private final transient com.iqoption.util.a.b<c> dJk = new com.iqoption.util.a.b(c.ORDERING);
    private volatile transient ImmutableList<c> dJl;
    private int id;
    public InstrumentType instrumentType;
    private volatile d optionKey;
    private double sum;
    private String type;

    public int describeContents() {
        return 0;
    }

    private b() {
    }

    public b(c cVar) {
        this.id = cVar.getGroupId();
        this.dJk.ct(cVar);
        this.dJi = cVar.getExpValue();
        this.dJh = cVar.getExpired();
        this.activeId = cVar.getActiveId();
        this.instrumentType = cVar.getInstrumentType();
        this.bpj = cVar.getCurrentProfitAmount();
        this.sum = cVar.getInvestSum();
        this.dJj = cVar.getTotalSum();
        this.created = cVar.getCreated();
        this.bwR = cVar.getUserBalanceId();
        this.type = cVar.getType();
    }

    public b aPY() {
        return new b(this);
    }

    private b(b bVar) {
        this.id = bVar.id;
        this.dJh = bVar.dJh;
        this.dJi = bVar.dJi;
        this.activeId = bVar.activeId;
        this.instrumentType = bVar.instrumentType;
        this.bpj = bVar.bpj;
        this.sum = bVar.sum;
        this.dJj = bVar.dJj;
        this.created = bVar.created;
        this.bwR = bVar.bwR;
        this.optionKey = bVar.optionKey;
        this.type = bVar.type;
        this.dJk.addAll(bVar.aPX());
    }

    public synchronized b bW(long j) {
        Iterator it = this.dJk.iterator();
        while (it.hasNext()) {
            c cVar = (c) ((Entry) it.next()).getKey();
            if (cVar.getExpirationPeriod() != j) {
                it.remove();
                this.sum -= Math.max(0.0d, cVar.getInvestSum());
                this.dJj -= Math.max(0.0d, cVar.getTotalSum());
                this.dJl = null;
            }
        }
        if (this.dJk.isEmpty()) {
            return null;
        }
        return this;
    }

    public synchronized b n(Position position) {
        if (this.dJk.get(position) == null) {
            return null;
        }
        this.dJk.clear();
        this.dJk.ct(position);
        this.sum = Math.max(0.0d, position.getInvestSum());
        this.dJj = Math.max(0.0d, position.getTotalSum());
        this.dJl = null;
        return this;
    }

    public synchronized void s(c cVar) {
        if (t(cVar)) {
            c cVar2 = (c) this.dJk.ct(cVar);
            if (cVar2 != null) {
                this.sum += cVar.getInvestSum() - cVar2.getInvestSum();
                this.dJj += cVar.getTotalSum() - cVar2.getTotalSum();
            } else {
                this.sum += cVar.getInvestSum();
                this.dJj += cVar.getTotalSum();
            }
            this.dJl = null;
        }
    }

    public void aPZ() {
        a.biL.execute(new -$$Lambda$b$__kJ99-7VX9TldNoRovUppLVfeY(this, ImmutableList.m(this.dJk.aXc())));
    }

    private /* synthetic */ void m(ImmutableList immutableList) {
        aj sK = immutableList.iterator();
        while (sK.hasNext()) {
            c cVar = (c) sK.next();
            if (cVar instanceof Position) {
                String createStrikeKey = ((Position) cVar).createStrikeKey();
                com.iqoption.core.microservices.tradingengine.response.a c = c.GS().c(createStrikeKey, this.instrumentType);
                if (c != null) {
                    double e = com.iqoption.core.microservices.tradingengine.response.a.e(c);
                    double f = com.iqoption.core.microservices.tradingengine.response.a.f(c);
                    boolean g = com.iqoption.core.microservices.tradingengine.response.a.g(c);
                    com.iqoption.gl.c.aIy().tabUpdateStrike(createStrikeKey, e, f, e, f, g, g);
                }
            }
        }
    }

    private boolean t(c cVar) {
        c cVar2 = (c) this.dJk.get(cVar);
        boolean z = true;
        if (cVar2 == null) {
            return true;
        }
        if (cVar2.getIndex() > cVar.getIndex()) {
            z = false;
        }
        return z;
    }

    public long getClosed() {
        aj sK = aPX().iterator();
        long j = 0;
        while (sK.hasNext()) {
            j = Math.max(((c) sK.next()).getClosed(), j);
        }
        return j;
    }

    public c aQa() {
        return (c) aPX().get(0);
    }

    public ImmutableList<c> aPX() {
        if (this.dJl == null) {
            aPV();
        }
        return this.dJl;
    }

    public synchronized void aPV() {
        if (this.dJl == null) {
            this.dJl = ImmutableList.m(this.dJk.aXc());
        }
    }

    public synchronized int getSize() {
        return this.dJk.size();
    }

    public synchronized boolean isEmpty() {
        return this.dJk.isEmpty();
    }

    /* JADX WARNING: Missing block: B:10:0x005d, code skipped:
            return null;
     */
    @androidx.annotation.Nullable
    public synchronized com.iqoption.mobbtech.connect.response.options.c bX(long r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.dJk;	 Catch:{ all -> 0x005e }
        r0 = r0.aXc();	 Catch:{ all -> 0x005e }
        r0 = com.google.common.collect.i.b(r0);	 Catch:{ all -> 0x005e }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x005e }
        r8 = com.google.common.base.Predicates.ao(r8);	 Catch:{ all -> 0x005e }
        r9 = com.iqoption.mobbtech.connect.response.options.c.getId;	 Catch:{ all -> 0x005e }
        r8 = com.google.common.base.Predicates.a(r8, r9);	 Catch:{ all -> 0x005e }
        r8 = r0.d(r8);	 Catch:{ all -> 0x005e }
        r9 = r8.isPresent();	 Catch:{ all -> 0x005e }
        r0 = 0;
        if (r9 == 0) goto L_0x005c;
    L_0x0024:
        r9 = r7.dJk;	 Catch:{ all -> 0x005e }
        r1 = r8.get();	 Catch:{ all -> 0x005e }
        r9 = r9.remove(r1);	 Catch:{ all -> 0x005e }
        if (r9 == 0) goto L_0x005c;
    L_0x0030:
        r9 = r8.get();	 Catch:{ all -> 0x005e }
        r9 = (com.iqoption.mobbtech.connect.response.options.c) r9;	 Catch:{ all -> 0x005e }
        r1 = r7.sum;	 Catch:{ all -> 0x005e }
        r3 = r9.getInvestSum();	 Catch:{ all -> 0x005e }
        r5 = 0;
        r3 = java.lang.Math.max(r5, r3);	 Catch:{ all -> 0x005e }
        r1 = r1 - r3;
        r7.sum = r1;	 Catch:{ all -> 0x005e }
        r1 = r7.dJj;	 Catch:{ all -> 0x005e }
        r3 = r9.getTotalSum();	 Catch:{ all -> 0x005e }
        r3 = java.lang.Math.max(r5, r3);	 Catch:{ all -> 0x005e }
        r1 = r1 - r3;
        r7.dJj = r1;	 Catch:{ all -> 0x005e }
        r7.dJl = r0;	 Catch:{ all -> 0x005e }
        r8 = r8.get();	 Catch:{ all -> 0x005e }
        r8 = (com.iqoption.mobbtech.connect.response.options.c) r8;	 Catch:{ all -> 0x005e }
        monitor-exit(r7);
        return r8;
    L_0x005c:
        monitor-exit(r7);
        return r0;
    L_0x005e:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.mobbtech.connect.response.options.b.bX(long):com.iqoption.mobbtech.connect.response.options.c");
    }

    public double getWinAmount() {
        double d = 0.0d;
        for (c winAmount : this.dJk.aXc()) {
            d += winAmount.getWinAmount();
        }
        return d;
    }

    public double getProfitIfWin() {
        double d = 0.0d;
        for (c profitIfWin : this.dJk.aXc()) {
            d += profitIfWin.getProfitIfWin();
        }
        return d;
    }

    public d getOptionKey() {
        if (this.optionKey == null) {
            synchronized (this) {
                if (this.optionKey == null) {
                    this.optionKey = e(this);
                }
            }
        }
        return this.optionKey;
    }

    public synchronized Double aQb() {
        Double valueOf = Double.valueOf(0.0d);
        for (c currentProfitAmount : this.dJk.aXc()) {
            valueOf = Double.valueOf(valueOf.doubleValue() + currentProfitAmount.getCurrentProfitAmount());
        }
        this.bpj = valueOf.doubleValue();
        return Double.valueOf(this.bpj);
    }

    public synchronized double getInvestSum() {
        return this.sum;
    }

    public synchronized long getCreated() {
        return this.created;
    }

    public synchronized long getCancelTimeLeft(long j) {
        return this.dJk.isEmpty() ? 0 : ((c) this.dJk.first()).getCancelTimeLeft(j);
    }

    public synchronized boolean isCancelable(long j) {
        for (c isCancelable : this.dJk.aXc()) {
            if (!isCancelable.isCancelable(j)) {
                return false;
            }
        }
        return true;
    }

    public synchronized Double calculateBuybackAmountWithCancelable(long j) {
        Double d;
        d = null;
        for (c calculateBuybackAmountWithCancelable : this.dJk.aXc()) {
            Double calculateBuybackAmountWithCancelable2 = calculateBuybackAmountWithCancelable.calculateBuybackAmountWithCancelable(j);
            if (calculateBuybackAmountWithCancelable2 != null) {
                d = Double.valueOf(d == null ? calculateBuybackAmountWithCancelable2.doubleValue() : d.doubleValue() + calculateBuybackAmountWithCancelable2.doubleValue());
            }
        }
        return d;
    }

    public synchronized double aQc() {
        double d;
        d = 0.0d;
        for (c selfMarginCall : this.dJk.aXc()) {
            d += selfMarginCall.getSelfMarginCall();
        }
        return d;
    }

    public synchronized double getSellPnl() {
        double d;
        d = 0.0d;
        for (c sellPnl : this.dJk.aXc()) {
            d += sellPnl.getSellPnl();
        }
        return d;
    }

    public synchronized int size() {
        return this.dJk.size();
    }

    public int hashCode() {
        return this.id;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).id == this.id;
    }

    public synchronized void A(Collection<c> collection) {
        this.dJk.clear();
        if (collection != null) {
            this.dJk.addAll(collection);
        }
    }

    public static d e(b bVar) {
        return new d(Long.valueOf(bVar.dJh), Integer.valueOf(bVar.activeId), bVar.instrumentType);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeValue(Long.valueOf(this.bwR));
        parcel.writeValue(Integer.valueOf(this.activeId));
        parcel.writeValue(Long.valueOf(this.dJh));
        parcel.writeValue(Double.valueOf(this.dJi));
        parcel.writeString(InstrumentType.serverValue(this.instrumentType));
        parcel.writeValue(Double.valueOf(this.bpj));
        parcel.writeValue(Double.valueOf(this.sum));
        parcel.writeValue(Double.valueOf(this.dJj));
        parcel.writeValue(Long.valueOf(this.created));
        int size = this.dJk.size();
        parcel.writeInt(size);
        if (size > 0) {
            for (c writeParcelable : this.dJk.aXc()) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeParcelable(this.optionKey, i);
        parcel.writeString(this.type);
    }

    protected b(Parcel parcel) {
        this.id = parcel.readInt();
        this.bwR = ((Long) parcel.readValue(Long.class.getClassLoader())).longValue();
        this.activeId = ((Integer) parcel.readValue(Integer.class.getClassLoader())).intValue();
        this.dJh = ((Long) parcel.readValue(Long.class.getClassLoader())).longValue();
        this.dJi = ((Double) parcel.readValue(Double.class.getClassLoader())).doubleValue();
        this.instrumentType = InstrumentType.fromServerValueNullable(parcel.readString());
        this.bpj = ((Double) parcel.readValue(Double.class.getClassLoader())).doubleValue();
        this.sum = ((Double) parcel.readValue(Double.class.getClassLoader())).doubleValue();
        this.dJj = ((Double) parcel.readValue(Double.class.getClassLoader())).doubleValue();
        this.created = ((Long) parcel.readValue(Long.class.getClassLoader())).longValue();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            for (int i = 0; i < readInt; i++) {
                this.dJk.ct(parcel.readParcelable(c.class.getClassLoader()));
            }
        }
        this.optionKey = (d) parcel.readParcelable(d.class.getClassLoader());
        this.type = parcel.readString();
    }
}
