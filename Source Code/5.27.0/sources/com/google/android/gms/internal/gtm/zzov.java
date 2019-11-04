package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@VisibleForTesting
public final class zzov {
    private final String version;
    private final List<zzox> zzatq;
    private final Map<String, List<zzot>> zzatr;
    private final int zzpw;

    private zzov(List<zzox> list, Map<String, List<zzot>> map, String str, int i) {
        this.zzatq = Collections.unmodifiableList(list);
        this.zzatr = Collections.unmodifiableMap(map);
        this.version = str;
        this.zzpw = i;
    }

    public static zzow zzmn() {
        return new zzow();
    }

    public final List<zzox> zzls() {
        return this.zzatq;
    }

    public final String getVersion() {
        return this.version;
    }

    public final Map<String, List<zzot>> zzmo() {
        return this.zzatr;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzatq);
        String valueOf2 = String.valueOf(this.zzatr);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 17) + String.valueOf(valueOf2).length());
        stringBuilder.append("Rules: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("  Macros: ");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }

    /* synthetic */ zzov(List list, Map map, String str, int i, zzos zzos) {
        this(list, map, str, i);
    }
}
