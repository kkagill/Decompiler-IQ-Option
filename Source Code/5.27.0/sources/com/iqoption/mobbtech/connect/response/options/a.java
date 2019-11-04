package com.iqoption.mobbtech.connect.response.options;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.common.base.e;
import com.google.common.base.f;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import com.google.common.primitives.Longs;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.entity.result.BuybackResult;
import com.iqoption.util.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: ClosedOptionGroup */
public class a implements Parcelable {
    public static final Creator<a> CREATOR = new Creator<a>() {
        /* renamed from: af */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: gs */
        public a[] newArray(int i) {
            return new a[i];
        }
    };
    private static final String TAG = "com.iqoption.mobbtech.connect.response.options.a";
    public static final Ordering<a> dJc = new a().compound((Comparator) new b());
    @SerializedName("active_id")
    private Integer activeId;
    @SerializedName("amount")
    private Double amount;
    @SerializedName("option_type")
    private ActiveType bwz;
    @SerializedName("created")
    private Long created;
    @SerializedName("id")
    private List<Long> dJd;
    private volatile transient ImmutableList<Long> dJe;
    private TreeSet<c> dJf = Sets.d(c.ORDERING);
    @SerializedName("exp_value")
    private Double expValue;
    @SerializedName("expired")
    private Long expired;
    private InstrumentType instrumentType;
    private transient d optionKey;
    private Long userBalanceId;
    @SerializedName("win")
    private String win;
    @SerializedName("win_amount")
    private Double winAmount;

    /* compiled from: ClosedOptionGroup */
    /* renamed from: com.iqoption.mobbtech.connect.response.options.a$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$iqoption$core$data$model$InstrumentType = new int[InstrumentType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.core.data.model.InstrumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$iqoption$core$data$model$InstrumentType = r0;
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.data.model.InstrumentType.CFD_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.data.model.InstrumentType.FOREX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.core.data.model.InstrumentType.CRYPTO_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.mobbtech.connect.response.options.a$AnonymousClass2.<clinit>():void");
        }
    }

    /* compiled from: ClosedOptionGroup */
    private static class a extends Ordering<a> {
        private a() {
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: a */
        public int compare(@Nullable a aVar, @Nullable a aVar2) {
            return Longs.compare(aVar.expired.longValue(), aVar2.expired.longValue());
        }
    }

    /* compiled from: ClosedOptionGroup */
    private static class b extends Ordering<a> {
        private b() {
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: a */
        public int compare(@Nullable a aVar, @Nullable a aVar2) {
            return Longs.vf().compare(c.a((Long[]) aVar.dJd.toArray(new Long[0])), c.a((Long[]) aVar2.dJd.toArray(new Long[0])));
        }
    }

    public int describeContents() {
        return 0;
    }

    private a() {
    }

    public static a q(c cVar) {
        a aVar = new a();
        aVar.activeId = Integer.valueOf(cVar.getActiveId());
        aVar.bwz = cVar.getActiveType();
        aVar.instrumentType = cVar.getInstrumentType();
        aVar.created = Long.valueOf(cVar.getCreated());
        aVar.expired = r(cVar);
        aVar.amount = Double.valueOf(cVar.getCloseInvestSum());
        aVar.expValue = Double.valueOf(cVar.getExpValue());
        aVar.dJd = new ArrayList();
        aVar.dJd.add(cVar.getId());
        aVar.winAmount = Double.valueOf(cVar.getWinAmount());
        String str = "equal";
        aVar.win = str;
        long doubleValue = (long) (aVar.winAmount.doubleValue() * 1000.0d);
        long doubleValue2 = (long) (aVar.amount.doubleValue() * 1000.0d);
        if (doubleValue > doubleValue2) {
            str = "win";
        } else if (doubleValue < doubleValue2) {
            str = "loose";
        }
        aVar.win = str;
        aVar.dJf.add(cVar);
        return aVar;
    }

    public static a l(Position position) {
        a aVar = new a();
        aVar.activeId = Integer.valueOf(position.getActiveId());
        aVar.created = Long.valueOf(position.getCreated());
        aVar.expired = r(position);
        aVar.bwz = position.getActiveType();
        aVar.instrumentType = position.getInstrumentType();
        aVar.amount = Double.valueOf(position.getCloseInvestSum());
        aVar.expValue = Double.valueOf(position.getExpValue());
        aVar.dJd = new ArrayList();
        aVar.dJd.add(position.getId());
        aVar.winAmount = Double.valueOf(position.getWinAmount());
        String str = "equal";
        aVar.win = str;
        long doubleValue = (long) (aVar.winAmount.doubleValue() * 1000.0d);
        long doubleValue2 = (long) (aVar.amount.doubleValue() * 1000.0d);
        if (doubleValue > doubleValue2) {
            str = "win";
        } else if (doubleValue < doubleValue2) {
            str = "loose";
        }
        aVar.win = str;
        aVar.dJf.add(position);
        return aVar;
    }

    private static Long r(c cVar) {
        com.iqoption.core.microservices.tradingengine.response.active.a b = com.iqoption.app.helpers.a.Gs().b(Integer.valueOf(cVar.getActiveId()), cVar.getInstrumentType());
        if (b != null) {
            return Long.valueOf(b.isExpired() ? cVar.getExpired() : cVar.getClosed());
        }
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[cVar.getInstrumentType().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return Long.valueOf(cVar.getClosed());
        }
        return Long.valueOf(cVar.getExpired());
    }

    public static a b(BuybackResult buybackResult) {
        a aVar = new a();
        aVar.activeId = buybackResult.activeId;
        aVar.created = buybackResult.created;
        aVar.expired = buybackResult.expired;
        aVar.bwz = buybackResult.typeName;
        aVar.instrumentType = buybackResult.typeName.toInstrumentType();
        aVar.amount = buybackResult.sum;
        double longValue = (double) buybackResult.expValue.longValue();
        Double.isNaN(longValue);
        aVar.expValue = Double.valueOf(longValue * 1.0E-6d);
        aVar.dJd = new ArrayList();
        aVar.dJd.add(buybackResult.optionId);
        aVar.winAmount = buybackResult.winAmount;
        aVar.win = buybackResult.win;
        return aVar;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (com.google.common.base.f.equal(r2.bwz, r3.bwz) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r3 == r2) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.mobbtech.connect.response.options.a;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r0 = r2.activeId;
        r3 = (com.iqoption.mobbtech.connect.response.options.a) r3;
        r1 = r3.activeId;
        r0 = com.google.common.base.f.equal(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.expired;
        r1 = r3.expired;
        r0 = com.google.common.base.f.equal(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.bwz;
        r3 = r3.bwz;
        r3 = com.google.common.base.f.equal(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        goto L_0x002a;
    L_0x0029:
        r3 = 1;
    L_0x002a:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.mobbtech.connect.response.options.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return f.hashCode(this.activeId, this.expired, this.bwz);
    }

    public synchronized Double getWinAmount() {
        return this.winAmount;
    }

    public synchronized Double aPS() {
        return this.amount;
    }

    public ActiveType getActiveType() {
        return this.bwz;
    }

    public InstrumentType getInstrumentType() {
        InstrumentType instrumentType = this.instrumentType;
        return instrumentType != null ? instrumentType : this.bwz.toInstrumentType();
    }

    public Long aPT() {
        return this.expired;
    }

    public synchronized String getWin() {
        long doubleValue = (long) (this.winAmount.doubleValue() * 1000.0d);
        long doubleValue2 = (long) (this.amount.doubleValue() * 1000.0d);
        String str = doubleValue > doubleValue2 ? "win" : doubleValue < doubleValue2 ? "loose" : "equal";
        this.win = str;
        return this.win;
    }

    public String toString() {
        String str = "amount";
        str = "created";
        str = "expValue";
        com.google.common.base.e.a d = e.aj(this).d("activeId", this.activeId).d(str, this.amount).d(str, this.created).d(str, this.expValue);
        return d.d(Position.CLOSE_REASON_EXPIRED, this.expired).d("ids", this.dJd).d("type", this.bwz).d("win", this.win).d("winAmount", this.winAmount).toString();
    }

    public ImmutableList<Long> aPU() {
        if (this.dJe == null) {
            aPV();
        }
        return this.dJe;
    }

    public synchronized void aPV() {
        if (this.dJe == null) {
            this.dJe = ImmutableList.m(this.dJd);
        }
    }

    public synchronized void s(c cVar) {
        this.created = Long.valueOf(Math.min(this.created.longValue(), cVar.getCreated()));
        this.amount = Double.valueOf(this.amount.doubleValue() + cVar.getCloseInvestSum());
        this.dJd.add(cVar.getId());
        Collections.sort(this.dJd);
        this.dJe = null;
        this.winAmount = Double.valueOf(this.winAmount.doubleValue() + cVar.getWinAmount());
        this.win = getWin();
        this.dJf.add(cVar);
    }

    public synchronized void m(Position position) {
        this.created = Long.valueOf(Math.min(this.created.longValue(), position.getCreated()));
        this.amount = Double.valueOf(this.amount.doubleValue() + position.getCloseInvestSum());
        this.dJd.add(position.getId());
        Collections.sort(this.dJd);
        this.dJe = null;
        this.winAmount = Double.valueOf(this.winAmount.doubleValue() + position.getWinAmount());
        this.win = getWin();
        this.dJf.add(position);
    }

    public synchronized void c(BuybackResult buybackResult) {
        this.created = Long.valueOf(Math.min(this.created.longValue(), buybackResult.created.longValue()));
        this.amount = Double.valueOf(this.amount.doubleValue() + buybackResult.sum.doubleValue());
        this.dJd.add(buybackResult.optionId);
        Collections.sort(this.dJd);
        this.dJe = null;
        this.winAmount = Double.valueOf(this.winAmount.doubleValue() + buybackResult.winAmount.doubleValue());
        this.win = getWin();
    }

    public synchronized Long aPW() {
        return this.created;
    }

    public Integer aiq() {
        return this.activeId;
    }

    public synchronized boolean B(Long l) {
        return this.dJd.contains(l);
    }

    public synchronized int size() {
        return this.dJd.size();
    }

    public ImmutableList<c> aPX() {
        return ImmutableList.m(this.dJf);
    }

    public d getOptionKey() {
        if (this.optionKey == null) {
            this.optionKey = b(this);
        }
        return this.optionKey;
    }

    public static d b(a aVar) {
        return new d(aVar.expired, aVar.activeId, aVar.getInstrumentType());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.activeId);
        parcel.writeValue(this.amount);
        parcel.writeValue(this.created);
        parcel.writeValue(this.expValue);
        parcel.writeValue(this.expired);
        parcel.writeList(this.dJd);
        parcel.writeString(ActiveType.serverValue(this.bwz));
        parcel.writeString(InstrumentType.serverValue(this.instrumentType));
        parcel.writeString(this.win);
        parcel.writeValue(this.winAmount);
        parcel.writeValue(this.userBalanceId);
        int size = this.dJf.size();
        parcel.writeInt(size);
        if (size > 0) {
            Iterator it = this.dJf.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((c) it.next(), i);
            }
        }
    }

    protected a(Parcel parcel) {
        this.activeId = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.amount = (Double) parcel.readValue(Double.class.getClassLoader());
        this.created = (Long) parcel.readValue(Long.class.getClassLoader());
        this.expValue = (Double) parcel.readValue(Double.class.getClassLoader());
        this.expired = (Long) parcel.readValue(Long.class.getClassLoader());
        this.dJd = new ArrayList();
        parcel.readList(this.dJd, Long.class.getClassLoader());
        this.bwz = ActiveType.fromServerValueNullable(parcel.readString());
        this.instrumentType = InstrumentType.fromServerValueNullable(parcel.readString());
        this.win = parcel.readString();
        this.winAmount = (Double) parcel.readValue(Double.class.getClassLoader());
        this.userBalanceId = (Long) parcel.readValue(Long.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            for (int i = 0; i < readInt; i++) {
                this.dJf.add(parcel.readParcelable(c.class.getClassLoader()));
            }
        }
    }
}
