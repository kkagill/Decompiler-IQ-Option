package com.iqoption.tradinghistory.materialcalendar;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Date;

/* compiled from: CalendarDay */
public final class b implements Parcelable {
    public static final Creator<b> CREATOR = new Creator<b>() {
        /* renamed from: al */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: hg */
        public b[] newArray(int i) {
            return new b[i];
        }
    };
    private transient Calendar dZb;
    private transient Date dZc;
    private final int day;
    private final int month;
    private final int year;

    private static int u(int i, int i2, int i3) {
        return ((i * 10000) + (i2 * 100)) + i3;
    }

    public int describeContents() {
        return 0;
    }

    @NonNull
    public static b aWk() {
        return b(f.getInstance());
    }

    @NonNull
    public static b t(int i, int i2, int i3) {
        return new b(i, i2, i3);
    }

    public static b b(@Nullable Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return t(f.e(calendar), f.f(calendar), f.g(calendar));
    }

    public static b b(@Nullable Date date) {
        return date == null ? null : b(f.c(date));
    }

    @Deprecated
    public b() {
        this(f.getInstance());
    }

    @Deprecated
    public b(Calendar calendar) {
        this(f.e(calendar), f.f(calendar), f.g(calendar));
    }

    @Deprecated
    public b(int i, int i2, int i3) {
        this.year = i;
        this.month = i2;
        this.day = i3;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    @NonNull
    public Date getDate() {
        if (this.dZc == null) {
            this.dZc = getCalendar().getTime();
        }
        return this.dZc;
    }

    @NonNull
    public Calendar getCalendar() {
        if (this.dZb == null) {
            this.dZb = f.getInstance();
            c(this.dZb);
        }
        return this.dZb;
    }

    public void c(@NonNull Calendar calendar) {
        calendar.clear();
        calendar.set(this.year, this.month, this.day);
    }

    public boolean a(@Nullable b bVar, @Nullable b bVar2) {
        return (bVar == null || !bVar.b(this)) && (bVar2 == null || !bVar2.a(this));
    }

    public boolean a(@NonNull b bVar) {
        if (bVar != null) {
            int i = this.year;
            int i2 = bVar.year;
            boolean z = true;
            if (i == i2) {
                i = this.month;
                i2 = bVar.month;
                if (i != i2 ? i >= i2 : this.day >= bVar.day) {
                    z = false;
                }
                return z;
            }
            if (i >= i2) {
                z = false;
            }
            return z;
        }
        throw new IllegalArgumentException("other cannot be null");
    }

    public boolean b(@NonNull b bVar) {
        if (bVar != null) {
            int i = this.year;
            int i2 = bVar.year;
            boolean z = true;
            if (i == i2) {
                i = this.month;
                i2 = bVar.month;
                if (i != i2 ? i <= i2 : this.day <= bVar.day) {
                    z = false;
                }
                return z;
            }
            if (i <= i2) {
                z = false;
            }
            return z;
        }
        throw new IllegalArgumentException("other cannot be null");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!(this.day == bVar.day && this.month == bVar.month && this.year == bVar.year)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return u(this.year, this.month, this.day);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CalendarDay{");
        stringBuilder.append(this.year);
        String str = "-";
        stringBuilder.append(str);
        stringBuilder.append(this.month);
        stringBuilder.append(str);
        stringBuilder.append(this.day);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public b(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
        parcel.writeInt(this.day);
    }
}
