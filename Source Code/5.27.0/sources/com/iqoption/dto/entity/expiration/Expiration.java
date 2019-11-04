package com.iqoption.dto.entity.expiration;

import com.google.common.base.f;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Longs;
import com.iqoption.core.util.TimeUtil;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

public class Expiration {
    public static final long DIGITAL_EXPIRATION_TYPE_1M = 60;
    private static final String FORMAT_GROUP = "%02d:00-%02d:00";
    public static Ordering<Expiration> ORDERING = orderingType.compound(orderingValue);
    private static final DateFormat expirationFullSpinnerFormat = TimeUtil.bRz;
    private static final DateFormat expirationSpinnerFormat = TimeUtil.bRq;
    public static final Expiration ignoredExpiration = new Expiration(Long.valueOf(-1));
    public static final Expiration notInitilizedDigitalExpiration = new Expiration(0, 60000);
    public static final Expiration notInitilizedExpiration = new Expiration(Long.valueOf(0));
    private static final Ordering<Expiration> orderingType = new Ordering<Expiration>() {
        public int compare(Expiration expiration, Expiration expiration2) {
            return Ordering.natural().compare(expiration.expInterval, expiration2.expInterval);
        }
    };
    public static final Ordering<Expiration> orderingValue = new Ordering<Expiration>() {
        public int compare(Expiration expiration, Expiration expiration2) {
            return Longs.compare(expiration.expValue.longValue(), expiration2.expValue.longValue());
        }
    };
    public String date;
    public Long deadTime;
    public Long expInterval;
    public Long expValue;
    public List<Expiration> expirationsInGroup;
    public boolean isSpecial = false;
    public String title;

    private Expiration() {
    }

    private Expiration(Long l) {
        this.expValue = l;
    }

    public static Expiration createTempObj(long j, long j2) {
        Expiration expiration = new Expiration(Long.valueOf(j));
        expiration.expInterval = Long.valueOf(j2);
        return expiration;
    }

    public Expiration(long j, long j2, long j3) {
        this.expValue = Long.valueOf(j);
        this.date = formatExpiration(j);
        this.title = this.date;
        this.expInterval = Long.valueOf(j2);
        this.deadTime = Long.valueOf(j3);
    }

    public static Expiration createCfdExpiration(long j, long j2) {
        Expiration expiration = new Expiration();
        expiration.expValue = Long.valueOf(j);
        expiration.date = TimeUtil.bRC.format(Long.valueOf(j));
        expiration.title = expiration.date;
        expiration.deadTime = Long.valueOf(j2);
        return expiration;
    }

    public Expiration(long j, long j2) {
        this.expValue = Long.valueOf(j);
        this.expInterval = Long.valueOf(j2);
        this.date = formatExpiration(j);
        this.title = this.date;
    }

    public static Expiration createGroupExpiration(long j, long j2) {
        Expiration expiration = new Expiration();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(11);
        expiration.expirationsInGroup = new ArrayList();
        expiration.expValue = Long.valueOf(j);
        expiration.expInterval = Long.valueOf(j2);
        expiration.title = String.format(Locale.US, FORMAT_GROUP, new Object[]{Integer.valueOf(i), Integer.valueOf(i + 1)});
        return expiration;
    }

    public static Expiration special2expiration(long j, long j2, String str) {
        Expiration expiration = new Expiration();
        expiration.expValue = Long.valueOf(j * 1000);
        expiration.expInterval = Long.valueOf(j2);
        expiration.title = str;
        expiration.date = formatFullExpiration(expiration.expValue.longValue());
        expiration.isSpecial = true;
        return expiration;
    }

    public long getDigitalExpirationPeriod() {
        Long l = this.expInterval;
        return l == null ? 0 : l.longValue() / 1000;
    }

    private static String formatExpiration(long j) {
        return expirationSpinnerFormat.format(new Date(j));
    }

    private static String formatFullExpiration(long j) {
        return expirationFullSpinnerFormat.format(new Date(j));
    }

    public String toString() {
        return this.title;
    }

    public String toStringFullLog() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expiration{expValue=");
        stringBuilder.append(this.expValue);
        stringBuilder.append(", expInterval=");
        stringBuilder.append(this.expInterval);
        stringBuilder.append(", title='");
        stringBuilder.append(this.title);
        stringBuilder.append('\'');
        stringBuilder.append(", date='");
        stringBuilder.append(this.date);
        stringBuilder.append('\'');
        stringBuilder.append(", isSpecial=");
        stringBuilder.append(this.isSpecial);
        stringBuilder.append(", deadTime=");
        stringBuilder.append(this.deadTime);
        stringBuilder.append(", expirationsInGroup=");
        stringBuilder.append(this.expirationsInGroup);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Expiration expiration = (Expiration) obj;
        Long l = this.expValue;
        if (!l == null ? l.equals(expiration.expValue) : expiration.expValue == null) {
            return false;
        }
        l = this.expInterval;
        if (l != null) {
            z = l.equals(expiration.expInterval);
        } else if (expiration.expInterval != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Long l = this.expValue;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.title;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l2 = this.expInterval;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public long getStableId() {
        int hashCode;
        if (this.expInterval != null) {
            hashCode = f.hashCode(this.expInterval, this.expValue);
        } else if (this.expirationsInGroup != null) {
            hashCode = f.hashCode(this.title, this.expValue);
        } else {
            Long l = this.expValue;
            return (long) (l != null ? l.hashCode() : hashCode());
        }
        return (long) hashCode;
    }

    public static List<Expiration> findGroupExp(TreeSet<Expiration> treeSet, Expiration expiration) {
        Calendar instance = Calendar.getInstance();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Expiration expiration2 = (Expiration) it.next();
            if (expiration2.expirationsInGroup != null) {
                instance.setTimeInMillis(expiration2.expValue.longValue());
                int i = instance.get(11);
                instance.setTimeInMillis(expiration.expValue.longValue());
                if (i == instance.get(11)) {
                    return expiration2.expirationsInGroup;
                }
            }
        }
        return null;
    }
}
