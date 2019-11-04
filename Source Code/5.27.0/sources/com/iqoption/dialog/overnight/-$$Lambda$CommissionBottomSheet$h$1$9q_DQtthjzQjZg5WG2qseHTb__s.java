package com.iqoption.dialog.overnight;

import com.iqoption.dto.entity.OvernightHistory;
import java.util.Comparator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$CommissionBottomSheet$h$1$9q_DQtthjzQjZg5WG2qseHTb__s implements Comparator {
    public static final /* synthetic */ -$$Lambda$CommissionBottomSheet$h$1$9q_DQtthjzQjZg5WG2qseHTb__s INSTANCE = new -$$Lambda$CommissionBottomSheet$h$1$9q_DQtthjzQjZg5WG2qseHTb__s();

    private /* synthetic */ -$$Lambda$CommissionBottomSheet$h$1$9q_DQtthjzQjZg5WG2qseHTb__s() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((OvernightHistory) obj2).filledAt, ((OvernightHistory) obj).filledAt);
    }
}
