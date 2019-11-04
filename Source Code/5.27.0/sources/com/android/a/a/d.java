package com.android.a.a;

import android.os.Bundle;

/* compiled from: ReferrerDetails */
public class d {
    private final Bundle kF;

    public d(Bundle bundle) {
        this.kF = bundle;
    }

    public String cZ() {
        return this.kF.getString("install_referrer");
    }

    public long da() {
        return this.kF.getLong("referrer_click_timestamp_seconds");
    }

    public long db() {
        return this.kF.getLong("install_begin_timestamp_seconds");
    }
}
