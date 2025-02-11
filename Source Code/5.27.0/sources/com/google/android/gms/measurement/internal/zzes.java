package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzes {
    private final /* synthetic */ zzeo zzmj;
    @VisibleForTesting
    private final String zzmk;
    private final String zzml;
    private final String zzmm;
    private final long zzmn;

    private zzes(zzeo zzeo, String str, long j) {
        this.zzmj = zzeo;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.zzmk = String.valueOf(str).concat(":start");
        this.zzml = String.valueOf(str).concat(":count");
        this.zzmm = String.valueOf(str).concat(":value");
        this.zzmn = j;
    }

    @WorkerThread
    private final void zzhk() {
        this.zzmj.zzo();
        long currentTimeMillis = this.zzmj.zzx().currentTimeMillis();
        Editor edit = this.zzmj.zzhb().edit();
        edit.remove(this.zzml);
        edit.remove(this.zzmm);
        edit.putLong(this.zzmk, currentTimeMillis);
        edit.apply();
    }

    @WorkerThread
    public final void zzc(String str, long j) {
        this.zzmj.zzo();
        if (zzhm() == 0) {
            zzhk();
        }
        if (str == null) {
            str = "";
        }
        j = this.zzmj.zzhb().getLong(this.zzml, 0);
        if (j <= 0) {
            Editor edit = this.zzmj.zzhb().edit();
            edit.putString(this.zzmm, str);
            edit.putLong(this.zzml, 1);
            edit.apply();
            return;
        }
        j++;
        Object obj = (this.zzmj.zzz().zzjw().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j ? 1 : null;
        Editor edit2 = this.zzmj.zzhb().edit();
        if (obj != null) {
            edit2.putString(this.zzmm, str);
        }
        edit2.putLong(this.zzml, j);
        edit2.apply();
    }

    @WorkerThread
    public final Pair<String, Long> zzhl() {
        this.zzmj.zzo();
        this.zzmj.zzo();
        long zzhm = zzhm();
        if (zzhm == 0) {
            zzhk();
            zzhm = 0;
        } else {
            zzhm = Math.abs(zzhm - this.zzmj.zzx().currentTimeMillis());
        }
        long j = this.zzmn;
        if (zzhm < j) {
            return null;
        }
        if (zzhm > (j << 1)) {
            zzhk();
            return null;
        }
        String string = this.zzmj.zzhb().getString(this.zzmm, null);
        j = this.zzmj.zzhb().getLong(this.zzml, 0);
        zzhk();
        if (string == null || j <= 0) {
            return zzeo.zzlg;
        }
        return new Pair(string, Long.valueOf(j));
    }

    @WorkerThread
    private final long zzhm() {
        return this.zzmj.zzhb().getLong(this.zzmk, 0);
    }

    /* synthetic */ zzes(zzeo zzeo, String str, long j, zzer zzer) {
        this(zzeo, str, j);
    }
}
