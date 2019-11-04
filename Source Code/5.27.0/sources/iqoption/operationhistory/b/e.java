package iqoption.operationhistory.b;

import com.iqoption.core.microservices.transaction.Transaction;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, bng = {"Liqoption/operationhistory/result/TransactionItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "transaction", "Lcom/iqoption/core/microservices/transaction/Transaction;", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "(Lcom/iqoption/core/microservices/transaction/Transaction;Lcom/iqoption/core/microservices/configuration/response/Currency;)V", "getCurrency", "()Lcom/iqoption/core/microservices/configuration/response/Currency;", "id", "getId", "()Ljava/lang/Long;", "getTransaction", "()Lcom/iqoption/core/microservices/transaction/Transaction;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "operationhistory_release"})
/* compiled from: TransactionItem.kt */
public final class e implements d<Long> {
    private final com.iqoption.core.microservices.configuration.a.d bcN;
    private final Transaction eVo;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bcN, r3.bcN) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof iqoption.operationhistory.b.e;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (iqoption.operationhistory.b.e) r3;
        r0 = r2.eVo;
        r1 = r3.eVo;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bcN;
        r3 = r3.bcN;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: iqoption.operationhistory.b.e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Transaction transaction = this.eVo;
        int i = 0;
        int hashCode = (transaction != null ? transaction.hashCode() : 0) * 31;
        com.iqoption.core.microservices.configuration.a.d dVar = this.bcN;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransactionItem(transaction=");
        stringBuilder.append(this.eVo);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.bcN);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(Transaction transaction, com.iqoption.core.microservices.configuration.a.d dVar) {
        kotlin.jvm.internal.i.f(transaction, "transaction");
        kotlin.jvm.internal.i.f(dVar, "currency");
        this.eVo = transaction;
        this.bcN = dVar;
    }

    public final Transaction bnc() {
        return this.eVo;
    }

    public final com.iqoption.core.microservices.configuration.a.d VM() {
        return this.bcN;
    }

    public Long getId() {
        return Long.valueOf(this.eVo.getId());
    }
}
