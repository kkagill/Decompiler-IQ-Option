package com.iqoption.dto;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.base.Predicates;
import com.google.common.base.d;
import com.google.common.base.j;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.i;
import com.iqoption.microservice.quotes.history.response.b;
import com.iqoption.util.g;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;

public class Point implements Parcelable {
    public static final Creator<Point> CREATOR = new Creator<Point>() {
        public Point createFromParcel(Parcel parcel) {
            return new Point(parcel, null);
        }

        public Point[] newArray(int i) {
            return new Point[i];
        }
    };
    public double rate;
    public long timestamp;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ Point(Parcel parcel, AnonymousClass1 anonymousClass1) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timestamp);
        parcel.writeDouble(this.rate);
    }

    private Point(Parcel parcel) {
        this.timestamp = parcel.readLong();
        this.rate = parcel.readDouble();
    }

    public static ArrayList<Point> parseHistoryPoints(JSONArray jSONArray, int i) {
        i = jSONArray.length();
        if (i <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(300);
        for (int i2 = 0; i2 < i; i2++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
            Point point = new Point();
            point.timestamp = jSONArray2.getLong(0);
            point.rate = jSONArray2.getDouble(1);
            arrayList.add(point);
        }
        return arrayList;
    }

    public static ImmutableList<Point> fromQuotes(Collection<b> collection) {
        if (g.isEmpty(collection)) {
            return ImmutableList.sQ();
        }
        return i.b((Iterable) collection).a(new d<b, Point>() {
            public Point apply(b bVar) {
                if (bVar == null) {
                    return null;
                }
                Point point = new Point();
                point.timestamp = bVar.getTime();
                point.rate = bVar.getValue();
                return point;
            }
        }).sC();
    }

    public static ImmutableList<Point> fromCandles(Collection<com.iqoption.core.microservices.quoteshistory.response.b> collection, j<Point> jVar) {
        if (g.isEmpty(collection)) {
            return ImmutableList.sQ();
        }
        j jVar2;
        if (jVar2 == null) {
            jVar2 = Predicates.pZ();
        }
        return i.b((Iterable) collection).a(-$$Lambda$Point$CeM69jfm-LwRGKjL55wFjxnTB8E.INSTANCE).b(jVar2).sC();
    }

    static /* synthetic */ Point lambda$fromCandles$0(com.iqoption.core.microservices.quoteshistory.response.b bVar) {
        Point point = new Point();
        point.timestamp = bVar.agU();
        point.rate = bVar.agV();
        return point;
    }
}
