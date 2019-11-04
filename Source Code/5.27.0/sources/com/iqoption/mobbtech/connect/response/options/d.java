package com.iqoption.mobbtech.connect.response.options;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.core.util.Pools.SynchronizedPool;
import com.google.common.base.f;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Longs;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.mobbtech.connect.response.c;

/* compiled from: OptionKey */
public class d implements Parcelable {
    public static final Creator<d> CREATOR = new Creator<d>() {
        /* renamed from: ai */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: gv */
        public d[] newArray(int i) {
            return new d[i];
        }
    };
    private static final SynchronizedPool<d> bzJ = new SynchronizedPool(50);
    public static Ordering<d> dJA = dJx.compound(dJy).compound(dJz).compound(orderingById);
    public static Ordering<d> dJB = dJx.reverse().compound(dJy.reverse()).compound(dJz).compound(orderingById);
    public static Ordering<d> dJx = new Ordering<d>() {
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return Longs.compare(dVar.dJC.longValue(), dVar2.dJC.longValue());
        }
    };
    public static Ordering<d> dJy = new Ordering<d>() {
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return Longs.compare((long) dVar.activeId.intValue(), (long) dVar2.activeId.intValue());
        }
    };
    public static Ordering<d> dJz = new Ordering<d>() {
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return String.CASE_INSENSITIVE_ORDER.compare(dVar.instrumentType.getServerValue(), dVar2.instrumentType.getServerValue());
        }
    };
    public static Ordering<d> orderingById = new Ordering<d>() {
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return Longs.compare(dVar.id, dVar2.id);
        }
    };
    private Integer activeId;
    private Long dJC;
    private long id;
    private InstrumentType instrumentType;

    public int describeContents() {
        return 0;
    }

    public Long aQd() {
        return this.dJC;
    }

    public Integer aiq() {
        return this.activeId;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public d(Long l, Integer num, InstrumentType instrumentType) {
        this.dJC = l;
        this.activeId = num;
        this.instrumentType = instrumentType;
        this.id = (long) f.hashCode(l, num, instrumentType);
    }

    public d(Long l, Long l2, Integer num, InstrumentType instrumentType) {
        long hashCode;
        this.dJC = l2;
        this.activeId = num;
        this.instrumentType = instrumentType;
        if (l == null) {
            hashCode = (long) f.hashCode(l2, num, instrumentType);
        } else {
            hashCode = l.longValue();
        }
        this.id = hashCode;
    }

    private d c(Long l, Integer num, InstrumentType instrumentType) {
        this.dJC = l;
        this.activeId = num;
        this.instrumentType = instrumentType;
        this.id = (long) f.hashCode(l, num, instrumentType);
        return this;
    }

    public static d b(c cVar) {
        return a(cVar.activeId, a.eZ(cVar.optionTypeId.intValue()), cVar.dIM);
    }

    public static d a(Integer num, InstrumentType instrumentType, Long l) {
        d dVar = (d) bzJ.acquire();
        return dVar != null ? dVar.c(l, num, instrumentType) : new d(l, num, instrumentType);
    }

    public void recycle() {
        bzJ.release(this);
    }

    /* JADX WARNING: Missing block: B:10:0x002c, code skipped:
            if (com.google.common.base.f.equal(r5.instrumentType, r6.instrumentType) != false) goto L_0x0031;
     */
    public boolean equals(java.lang.Object r6) {
        /*
        r5 = this;
        if (r6 == r5) goto L_0x0031;
    L_0x0002:
        r0 = r6 instanceof com.iqoption.mobbtech.connect.response.options.d;
        if (r0 == 0) goto L_0x002f;
    L_0x0006:
        r0 = r5.id;
        r6 = (com.iqoption.mobbtech.connect.response.options.d) r6;
        r2 = r6.id;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x002f;
    L_0x0010:
        r0 = r5.activeId;
        r1 = r6.activeId;
        r0 = com.google.common.base.f.equal(r0, r1);
        if (r0 == 0) goto L_0x002f;
    L_0x001a:
        r0 = r5.dJC;
        r1 = r6.dJC;
        r0 = com.google.common.base.f.equal(r0, r1);
        if (r0 == 0) goto L_0x002f;
    L_0x0024:
        r0 = r5.instrumentType;
        r6 = r6.instrumentType;
        r6 = com.google.common.base.f.equal(r0, r6);
        if (r6 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0031;
    L_0x002f:
        r6 = 0;
        goto L_0x0032;
    L_0x0031:
        r6 = 1;
    L_0x0032:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.mobbtech.connect.response.options.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return f.hashCode(Long.valueOf(this.id), this.activeId, this.dJC, this.instrumentType);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.dJC);
        parcel.writeValue(this.activeId);
        parcel.writeString(InstrumentType.serverValue(this.instrumentType));
    }

    protected d(Parcel parcel) {
        this.dJC = (Long) parcel.readValue(Long.class.getClassLoader());
        this.activeId = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.instrumentType = InstrumentType.fromServerValueNullable(parcel.readString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OptionKey{expiredTime=");
        stringBuilder.append(this.dJC);
        stringBuilder.append(", activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", instrumentType='");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append('\'');
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
