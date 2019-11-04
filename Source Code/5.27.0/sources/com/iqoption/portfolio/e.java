package com.iqoption.portfolio;

import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;
import com.google.common.base.Predicates;
import com.google.common.base.d;
import com.google.common.base.f;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.i;
import com.google.common.primitives.Longs;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.util.b.b;
import java.util.Comparator;

/* compiled from: PendingPositionGroup */
public final class e {
    private static final Ordering<Order> ORDERING = new Ordering<Order>() {
        public int compare(Order order, Order order2) {
            return Longs.compare(order2.getCreateAt().longValue(), order.getCreateAt().longValue());
        }
    };
    private static final String TAG = "com.iqoption.portfolio.e";
    private static final d<Order, e> dLb = new d<Order, e>() {
        /* renamed from: p */
        public e apply(Order order) {
            if (order == null) {
                return null;
            }
            a a = com.iqoption.app.helpers.a.Gs().a(order.getInstrumentActiveId(), order.getInstrumentType());
            if (a == null) {
                return null;
            }
            return new e(a, order);
        }
    };
    private final a anF;
    private long dLi;
    private ImmutableList<Order> dLj;
    private boolean dLk;
    private final LongSparseArray<Order> dLl = new LongSparseArray();
    private final long id;

    public e(a aVar, Order order) {
        this.anF = aVar;
        this.id = (long) f.hashCode(order.getId());
        o(order);
    }

    public void o(Order order) {
        if (order != null) {
            this.dLl.put(order.getId().longValue(), order);
            long createTime = order.getCreateTime();
            if (this.dLi < createTime) {
                this.dLi = createTime;
            }
            this.dLk = true;
        }
    }

    public long getId() {
        return this.id;
    }

    @NonNull
    public a Jt() {
        return this.anF;
    }

    public ActiveType getActiveType() {
        return this.anF.getActiveType();
    }

    public long aQB() {
        return this.dLi;
    }

    public ImmutableList<Order> GR() {
        if (this.dLj == null || this.dLk) {
            this.dLj = i.b(b.a(this.dLl)).a(ORDERING);
            this.dLk = false;
        }
        return this.dLj;
    }

    public int size() {
        return this.dLl.size();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PendingPositionGroup{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", active=");
        stringBuilder.append(this.anF);
        stringBuilder.append(", orders=");
        stringBuilder.append(this.dLl);
        stringBuilder.append(", lastCreateTime=");
        stringBuilder.append(this.dLi);
        stringBuilder.append(", snapshot=");
        stringBuilder.append(this.dLj);
        stringBuilder.append(", snapshotDirty=");
        stringBuilder.append(this.dLk);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static ImmutableList<e> a(Iterable<Order> iterable, Ordering<e> ordering) {
        return i.b((Iterable) iterable).a(dLb).b(Predicates.qb()).a((Comparator) ordering);
    }
}
