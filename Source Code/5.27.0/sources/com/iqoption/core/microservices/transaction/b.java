package com.iqoption.core.microservices.transaction;

import com.iqoption.config.Platform;
import com.iqoption.core.connect.j;
import com.iqoption.core.d;
import com.iqoption.core.microservices.transaction.Transaction.Type;
import com.iqoption.dto.entity.position.Order;
import io.reactivex.b.g;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JU\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0002\u0010\u0018J:\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u00102\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/core/microservices/transaction/TransactionRequests;", "", "()V", "DATE_PARAM_MAX", "", "DATE_PARAM_MIN", "DEFAULT_LIMIT", "", "GET_TRANSACTIONS", "OPERATION_PARAM", "PARAM_TYPES", "STATUS_PARAM", "SUPPORTED_TYPES", "", "Lcom/iqoption/core/microservices/transaction/Transaction$Type;", "getHistory", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/transaction/Transaction;", "types", "statuses", "startTimestamp", "", "endTimestamp", "offset", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;I)Lio/reactivex/Single;", "paramMap", "", "limit", "supportedTypeNames", "core_release"})
/* compiled from: TransactionRequests.kt */
public final class b {
    private static final List<Type> bCU = m.listOf(Type.DEPOSIT, Type.WITHDRAWAL, Type.TOURNAMENT_REBUY, Type.TOURNAMENT_REWARD);
    public static final b bCV = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/transaction/Transaction;", "result", "Lcom/iqoption/core/microservices/transaction/TransactionHistory;", "apply"})
    /* compiled from: TransactionRequests.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a bCW = new a();

        a() {
        }

        /* renamed from: a */
        public final List<Transaction> apply(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "result");
            Collection arrayList = new ArrayList();
            for (Object next : aVar.getItems()) {
                if (u.b((Iterable) b.bCU, (Object) ((Transaction) next).aiX())) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    private b() {
    }

    public static /* synthetic */ p a(b bVar, Map map, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 100;
        }
        return bVar.a(map, i, i2);
    }

    public final p<List<Transaction>> a(Map<String, ? extends Object> map, int i, int i2) {
        kotlin.jvm.internal.i.f(map, "paramMap");
        j fp = d.EV().a("get-transactions", a.class).fp("1.0");
        fp.k("platforms", Platform.Companion.getPLATFORMS_IQ());
        fp.k("offset", Integer.valueOf(i));
        fp.k(Order.LIMIT, Integer.valueOf(i2));
        for (Entry entry : map.entrySet()) {
            fp.k((String) entry.getKey(), entry.getValue());
        }
        String str = "types";
        if (!map.containsKey(str)) {
            fp.k(str, aja());
        }
        p t = fp.UB().t(a.bCW);
        kotlin.jvm.internal.i.e(t, "builder.exec()\n         …pe in SUPPORTED_TYPES } }");
        return t;
    }

    private final List<String> aja() {
        Iterable<Type> iterable = bCU;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Type serverValue : iterable) {
            arrayList.add(serverValue.getServerValue());
        }
        return (List) arrayList;
    }
}
