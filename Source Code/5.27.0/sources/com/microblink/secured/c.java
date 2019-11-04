package com.microblink.secured;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: line */
public final class c {
    SharedPreferences evM = null;

    public c(Context context) {
        this.evM = context.getSharedPreferences("com.microblink.ping.preferences", 0);
    }

    public final long beb() {
        SharedPreferences sharedPreferences = this.evM;
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getLong("com.microblink.ping.preferences.scansCount", 0);
    }

    @SuppressLint({"CommitPrefEdits, ApplySharedPref"})
    public final void cE(long j) {
        SharedPreferences sharedPreferences = this.evM;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("com.microblink.ping.preferences.scansCount", j).commit();
        }
    }
}
