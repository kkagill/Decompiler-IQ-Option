package com.iqoption.dialog.overnight;

import com.iqoption.core.microservices.tradingengine.response.custodial.CustordialHistory;
import java.util.Comparator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$CommissionBottomSheet$a$1$znNqt4OLDJVgk2B467RdjWLxIZQ implements Comparator {
    public static final /* synthetic */ -$$Lambda$CommissionBottomSheet$a$1$znNqt4OLDJVgk2B467RdjWLxIZQ INSTANCE = new -$$Lambda$CommissionBottomSheet$a$1$znNqt4OLDJVgk2B467RdjWLxIZQ();

    private /* synthetic */ -$$Lambda$CommissionBottomSheet$a$1$znNqt4OLDJVgk2B467RdjWLxIZQ() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((CustordialHistory) obj2).aiw(), ((CustordialHistory) obj).aiw());
    }
}
