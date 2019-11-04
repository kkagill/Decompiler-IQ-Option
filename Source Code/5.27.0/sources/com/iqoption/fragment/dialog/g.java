package com.iqoption.fragment.dialog;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import java.math.BigDecimal;

/* compiled from: OtnEmissionStatisticsDelegate */
abstract class g {
    private final h dek;

    public abstract CharSequence aBW();

    public abstract Double aBX();

    public abstract Double aBY();

    public abstract BigDecimal aBZ();

    public abstract BigDecimal aCa();

    public abstract String getEventName();

    public abstract CharSequence getTitle();

    g(@NonNull h hVar) {
        this.dek = hVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final CharSequence eA(@StringRes int i) {
        return this.dek.getString(i);
    }
}
