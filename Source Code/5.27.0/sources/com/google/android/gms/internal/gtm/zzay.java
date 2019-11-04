package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class zzay extends zzan implements Closeable {
    private static final String zzxj;
    private static final String zzxk;
    private final zzaz zzxl;
    private final zzcv zzxm = new zzcv(zzcn());
    private final zzcv zzxn = new zzcv(zzcn());

    zzay(zzap zzap) {
        super(zzap);
        this.zzxl = new zzaz(this, zzap.getContext(), "google_analytics_v4.db");
    }

    private static String zzdt() {
        return "google_analytics_v4.db";
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
    }

    public final void beginTransaction() {
        zzdb();
        getWritableDatabase().beginTransaction();
    }

    public final void setTransactionSuccessful() {
        zzdb();
        getWritableDatabase().setTransactionSuccessful();
    }

    public final void endTransaction() {
        zzdb();
        getWritableDatabase().endTransaction();
    }

    public final void zzc(zzcd zzcd) {
        Preconditions.checkNotNull(zzcd);
        zzk.zzav();
        zzdb();
        Preconditions.checkNotNull(zzcd);
        Builder builder = new Builder();
        for (Entry entry : zzcd.zzdm().entrySet()) {
            String str = (String) entry.getKey();
            if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str))) {
                builder.appendQueryParameter(str, (String) entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = "";
        }
        if (encodedQuery.length() > 8192) {
            zzco().zza(zzcd, "Hit length exceeds the maximum allowed size");
            return;
        }
        int intValue = ((Integer) zzby.zzze.get()).intValue();
        long zzdl = zzdl();
        if (zzdl > ((long) (intValue - 1))) {
            List zzc = zzc((zzdl - ((long) intValue)) + 1);
            zzd("Store full, deleting hits to make room, count", Integer.valueOf(zzc.size()));
            zza(zzc);
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", encodedQuery);
        contentValues.put("hit_time", Long.valueOf(zzcd.zzfh()));
        contentValues.put("hit_app_id", Integer.valueOf(zzcd.zzff()));
        if (zzcd.zzfj()) {
            encodedQuery = zzbq.zzet();
        } else {
            encodedQuery = zzbq.zzeu();
        }
        contentValues.put("hit_url", encodedQuery);
        try {
            long insert = writableDatabase.insert("hits2", null, contentValues);
            if (insert == -1) {
                zzu("Failed to insert a hit (got -1)");
            } else {
                zzb("Hit saved to database. db-id, hit", Long.valueOf(insert), zzcd);
            }
        } catch (SQLiteException e) {
            zze("Error storing a hit", e);
        }
    }

    private final long zzdl() {
        zzk.zzav();
        zzdb();
        return zza("SELECT COUNT(*) FROM hits2", null);
    }

    /* Access modifiers changed, original: final */
    public final boolean isEmpty() {
        return zzdl() == 0;
    }

    private final List<Long> zzc(long j) {
        String str = "hit_id";
        zzk.zzav();
        zzdb();
        if (j <= 0) {
            return Collections.emptyList();
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = writableDatabase.query("hits2", new String[]{str}, null, null, null, null, String.format("%s ASC", new Object[]{str}), Long.toString(j));
            if (cursor.moveToFirst()) {
                do {
                    arrayList.add(Long.valueOf(cursor.getLong(0)));
                } while (cursor.moveToNext());
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (SQLiteException e) {
            zzd("Error selecting hit ids", e);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    public final List<zzcd> zzd(long j) {
        String str = "hit_id";
        Preconditions.checkArgument(j >= 0);
        zzk.zzav();
        zzdb();
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().query("hits2", new String[]{str, "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", new Object[]{str}), Long.toString(j));
            ArrayList arrayList = new ArrayList();
            if (cursor.moveToFirst()) {
                do {
                    long j2 = cursor.getLong(0);
                    arrayList.add(new zzcd(this, zzv(cursor.getString(2)), cursor.getLong(1), zzcz.zzaj(cursor.getString(3)), j2, cursor.getInt(4)));
                } while (cursor.moveToNext());
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            zze("Error loading hits from the database", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final void zza(List<Long> list) {
        Preconditions.checkNotNull(list);
        zzk.zzav();
        zzdb();
        if (!list.isEmpty()) {
            int i;
            StringBuilder stringBuilder = new StringBuilder("hit_id");
            stringBuilder.append(" in (");
            for (i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(l);
            }
            stringBuilder.append(")");
            String stringBuilder2 = stringBuilder.toString();
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                zza("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                i = writableDatabase.delete("hits2", stringBuilder2, null);
                if (i != list.size()) {
                    zzb("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(i), stringBuilder2);
                }
            } catch (SQLiteException e) {
                zze("Error deleting hits", e);
                throw e;
            }
        }
    }

    public final void zze(long j) {
        zzk.zzav();
        zzdb();
        List arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        zza("Deleting hit, id", Long.valueOf(j));
        zza(arrayList);
    }

    public final int zzdr() {
        zzk.zzav();
        zzdb();
        if (!this.zzxm.zzj(86400000)) {
            return 0;
        }
        this.zzxm.start();
        zzq("Deleting stale hits (if any)");
        int delete = getWritableDatabase().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzcn().currentTimeMillis() - 2592000000L)});
        zza("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    public final long zzds() {
        zzk.zzav();
        zzdb();
        return zza(zzxk, null, 0);
    }

    public final long zza(long j, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzdb();
        zzk.zzav();
        return zza("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2}, 0);
    }

    public final List<zzas> zzf(long j) {
        zzdb();
        zzk.zzav();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor cursor = null;
        try {
            String[] strArr = new String[]{"cid", "tid", "adid", "hits_count", "params"};
            int intValue = ((Integer) zzby.zzzg.get()).intValue();
            cursor = writableDatabase.query("properties", strArr, "app_uid=?", new String[]{"0"}, null, null, null, String.valueOf(intValue));
            ArrayList arrayList = new ArrayList();
            if (cursor.moveToFirst()) {
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    boolean z = cursor.getInt(2) != 0;
                    long j2 = (long) cursor.getInt(3);
                    Map zzw = zzw(cursor.getString(4));
                    if (!TextUtils.isEmpty(string)) {
                        if (!TextUtils.isEmpty(string2)) {
                            arrayList.add(new zzas(0, string, string2, z, j2, zzw));
                        }
                    }
                    zzc("Read property with empty client id or tracker id", string, string2);
                } while (cursor.moveToNext());
            }
            if (arrayList.size() >= intValue) {
                zzt("Sending hits to too many properties. Campaign report might be incorrect");
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            zze("Error loading hits from the database", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final void close() {
        try {
            this.zzxl.close();
        } catch (SQLiteException e) {
            zze("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            zze("Error closing database", e2);
        }
    }

    private final long zza(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery(str, null);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            zzd("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j2;
            }
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (SQLiteException e) {
            zzd("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @VisibleForTesting
    private final Map<String, String> zzv(String str) {
        String str2 = "?";
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith(str2)) {
                str = String.valueOf(str);
                str = str.length() != 0 ? str2.concat(str) : new String(str2);
            }
            return HttpUtils.parse(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            zze("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    @VisibleForTesting
    private final Map<String, String> zzw(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String str2 = "?";
            str = String.valueOf(str);
            return HttpUtils.parse(new URI(str.length() != 0 ? str2.concat(str) : new String(str2)), "UTF-8");
        } catch (URISyntaxException e) {
            zze("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return this.zzxl.getWritableDatabase();
        } catch (SQLiteException e) {
            zzd("Error opening database", e);
            throw e;
        }
    }

    static {
        r0 = new Object[6];
        r0[0] = "hits2";
        r0[1] = "hit_id";
        r0[2] = "hit_time";
        r0[3] = "hit_url";
        r0[4] = "hit_string";
        r0[5] = "hit_app_id";
        zzxj = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", r0);
        zzxk = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{r4, "hits2"});
    }
}
