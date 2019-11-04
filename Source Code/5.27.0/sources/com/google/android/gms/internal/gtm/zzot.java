package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.Map;

public final class zzot {
    private final zzl zzakg;
    private final Map<String, zzl> zzats;

    private zzot(Map<String, zzl> map, zzl zzl) {
        this.zzats = map;
        this.zzakg = zzl;
    }

    public static zzou zzml() {
        return new zzou();
    }

    public final void zza(String str, zzl zzl) {
        this.zzats.put(str, zzl);
    }

    public final Map<String, zzl> zzlu() {
        return Collections.unmodifiableMap(this.zzats);
    }

    public final zzl zzji() {
        return this.zzakg;
    }

    public final String toString() {
        String valueOf = String.valueOf(Collections.unmodifiableMap(this.zzats));
        String valueOf2 = String.valueOf(this.zzakg);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length());
        stringBuilder.append("Properties: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" pushAfterEvaluate: ");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }

    /* synthetic */ zzot(Map map, zzl zzl, zzos zzos) {
        this(map, zzl);
    }
}
