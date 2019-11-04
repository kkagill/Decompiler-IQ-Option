package com.iqoption.dto.entity;

import java.util.Comparator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$OvernightHistory$ZqduTqQLfzmknCgSpcWbxCtZEaI implements Comparator {
    public static final /* synthetic */ -$$Lambda$OvernightHistory$ZqduTqQLfzmknCgSpcWbxCtZEaI INSTANCE = new -$$Lambda$OvernightHistory$ZqduTqQLfzmknCgSpcWbxCtZEaI();

    private /* synthetic */ -$$Lambda$OvernightHistory$ZqduTqQLfzmknCgSpcWbxCtZEaI() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((OvernightHistory) obj2).filledAt, ((OvernightHistory) obj).filledAt);
    }
}
