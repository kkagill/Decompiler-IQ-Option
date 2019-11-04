package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzca implements zzce {
    @GuardedBy("ConfigurationContentLoader.class")
    static final Map<Uri, zzca> zzaah = new ArrayMap();
    private static final String[] zzaam = new String[]{"key", ConditionalUserProperty.VALUE};
    private final Uri uri;
    private final ContentResolver zzaai;
    private final Object zzaaj = new Object();
    private volatile Map<String, String> zzaak;
    @GuardedBy("this")
    private final List<zzcf> zzaal = new ArrayList();

    private zzca(ContentResolver contentResolver, Uri uri) {
        this.zzaai = contentResolver;
        this.uri = uri;
        this.zzaai.registerContentObserver(uri, false, new zzcc(this, null));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    public static com.google.android.gms.internal.measurement.zzca zza(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
        r0 = com.google.android.gms.internal.measurement.zzca.class;
        monitor-enter(r0);
        r1 = zzaah;	 Catch:{ all -> 0x001a }
        r1 = r1.get(r4);	 Catch:{ all -> 0x001a }
        r1 = (com.google.android.gms.internal.measurement.zzca) r1;	 Catch:{ all -> 0x001a }
        if (r1 != 0) goto L_0x0018;
    L_0x000d:
        r2 = new com.google.android.gms.internal.measurement.zzca;	 Catch:{ SecurityException -> 0x0018 }
        r2.<init>(r3, r4);	 Catch:{ SecurityException -> 0x0018 }
        r3 = zzaah;	 Catch:{ SecurityException -> 0x0017 }
        r3.put(r4, r2);	 Catch:{ SecurityException -> 0x0017 }
    L_0x0017:
        r1 = r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r1;
    L_0x001a:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzca.zza(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.zzca");
    }

    public final Map<String, String> zzre() {
        Map<String, String> map = this.zzaak;
        if (map == null) {
            synchronized (this.zzaaj) {
                map = this.zzaak;
                if (map == null) {
                    map = zzrg();
                    this.zzaak = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    public final void zzrf() {
        synchronized (this.zzaaj) {
            this.zzaak = null;
            zzcm.zzrl();
        }
        synchronized (this) {
            for (zzcf zzrk : this.zzaal) {
                zzrk.zzrk();
            }
        }
    }

    private final Map<String, String> zzrg() {
        try {
            return (Map) zzch.zza(new zzcd(this));
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    public final /* synthetic */ Object zzdd(String str) {
        return (String) zzre().get(str);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Map zzrh() {
        Cursor query = this.zzaai.query(this.uri, zzaam, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                return emptyMap;
            }
            Map arrayMap;
            if (count <= 256) {
                arrayMap = new ArrayMap(count);
            } else {
                arrayMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                arrayMap.put(query.getString(0), query.getString(1));
            }
            query.close();
            return arrayMap;
        } finally {
            query.close();
        }
    }
}
