package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.f;
import java.util.UUID;

/* compiled from: SessionInfo */
class g {
    private Long xj;
    private Long xk;
    private int xl;
    private Long xm;
    private i xn;
    private UUID xo;

    public g(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    public g(Long l, Long l2, UUID uuid) {
        this.xj = l;
        this.xk = l2;
        this.xo = uuid;
    }

    public static g jp() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(f.getApplicationContext());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        g gVar = new g(Long.valueOf(j), Long.valueOf(j2));
        gVar.xl = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        gVar.xn = i.jz();
        gVar.xm = Long.valueOf(System.currentTimeMillis());
        gVar.xo = UUID.fromString(string);
        return gVar;
    }

    public static void jq() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(f.getApplicationContext()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        i.jA();
    }

    public Long jr() {
        return this.xk;
    }

    public void a(Long l) {
        this.xk = l;
    }

    public int js() {
        return this.xl;
    }

    public void jt() {
        this.xl++;
    }

    public long ju() {
        Long l = this.xm;
        return l == null ? 0 : l.longValue();
    }

    public UUID getSessionId() {
        return this.xo;
    }

    public long jv() {
        if (this.xj != null) {
            Long l = this.xk;
            if (l != null) {
                return l.longValue() - this.xj.longValue();
            }
        }
        return 0;
    }

    public i jw() {
        return this.xn;
    }

    public void jx() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(f.getApplicationContext()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.xj.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.xk.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.xl);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.xo.toString());
        edit.apply();
        i iVar = this.xn;
        if (iVar != null) {
            iVar.jB();
        }
    }
}
