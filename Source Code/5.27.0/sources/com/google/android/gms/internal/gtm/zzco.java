package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.UUID;

public final class zzco {
    private final String name;
    private final long zzabz;
    private final /* synthetic */ zzcm zzaca;

    private zzco(zzcm zzcm, String str, long j) {
        this.zzaca = zzcm;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.name = str;
        this.zzabz = j;
    }

    private final void zzgb() {
        long currentTimeMillis = this.zzaca.zzcn().currentTimeMillis();
        Editor edit = this.zzaca.zzabv.edit();
        edit.remove(zzgf());
        edit.remove(zzgg());
        edit.putLong(zzge(), currentTimeMillis);
        edit.commit();
    }

    public final void zzae(String str) {
        if (zzgd() == 0) {
            zzgb();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            long j = this.zzaca.zzabv.getLong(zzgf(), 0);
            if (j <= 0) {
                Editor edit = this.zzaca.zzabv.edit();
                edit.putString(zzgg(), str);
                edit.putLong(zzgf(), 1);
                edit.apply();
                return;
            }
            j++;
            Object obj = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j ? 1 : null;
            Editor edit2 = this.zzaca.zzabv.edit();
            if (obj != null) {
                edit2.putString(zzgg(), str);
            }
            edit2.putLong(zzgf(), j);
            edit2.apply();
        }
    }

    public final Pair<String, Long> zzgc() {
        long zzgd = zzgd();
        if (zzgd == 0) {
            zzgd = 0;
        } else {
            zzgd = Math.abs(zzgd - this.zzaca.zzcn().currentTimeMillis());
        }
        long j = this.zzabz;
        if (zzgd < j) {
            return null;
        }
        if (zzgd > (j << 1)) {
            zzgb();
            return null;
        }
        String string = this.zzaca.zzabv.getString(zzgg(), null);
        j = this.zzaca.zzabv.getLong(zzgf(), 0);
        zzgb();
        if (string == null || j <= 0) {
            return null;
        }
        return new Pair(string, Long.valueOf(j));
    }

    private final long zzgd() {
        return this.zzaca.zzabv.getLong(zzge(), 0);
    }

    private final String zzge() {
        return String.valueOf(this.name).concat(":start");
    }

    private final String zzgf() {
        return String.valueOf(this.name).concat(":count");
    }

    @VisibleForTesting
    private final String zzgg() {
        return String.valueOf(this.name).concat(":value");
    }
}
