package com.iqoption.app.db;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;
import com.iqoption.dto.Event;
import com.iqoption.i.b;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: EventDbHelper */
public class a extends SQLiteOpenHelper {
    private static final String TAG = "a";

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public a(Context context) {
        super(context, "com.iqoption.db.event", null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table events (_id integer primary key autoincrement, category text not null, name text not null, value real,time integer, duration integer, technical_logs integer, parameters text, platform_id integer, app_version text);");
    }

    @WorkerThread
    public long c(Event event) {
        return d(event);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079 A:{Catch:{ all -> 0x009f, Throwable -> 0x00a4 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x006f */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    private long d(com.iqoption.dto.Event r8) {
        /*
        r7 = this;
        r0 = r7.getWritableDatabase();	 Catch:{ Throwable -> 0x00a4 }
        r0.beginTransaction();	 Catch:{ Throwable -> 0x00a4 }
        r1 = new android.content.ContentValues;	 Catch:{ all -> 0x009f }
        r1.<init>();	 Catch:{ all -> 0x009f }
        r2 = "category";
        r3 = r8.category;	 Catch:{ all -> 0x009f }
        r1.put(r2, r3);	 Catch:{ all -> 0x009f }
        r2 = "name";
        r3 = r8.name;	 Catch:{ all -> 0x009f }
        r1.put(r2, r3);	 Catch:{ all -> 0x009f }
        r2 = "value";
        r3 = r8.value;	 Catch:{ all -> 0x009f }
        r1.put(r2, r3);	 Catch:{ all -> 0x009f }
        r2 = "time";
        r3 = r8.time;	 Catch:{ all -> 0x009f }
        r1.put(r2, r3);	 Catch:{ all -> 0x009f }
        r2 = "duration";
        r3 = r8.duration;	 Catch:{ all -> 0x009f }
        r1.put(r2, r3);	 Catch:{ all -> 0x009f }
        r2 = "technical_logs";
        r3 = r8.technical_logs;	 Catch:{ all -> 0x009f }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x009f }
        if (r3 == 0) goto L_0x003e;
    L_0x003c:
        r3 = 1;
        goto L_0x003f;
    L_0x003e:
        r3 = 0;
    L_0x003f:
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x009f }
        r1.put(r2, r3);	 Catch:{ all -> 0x009f }
        r2 = r8.parameters;	 Catch:{ all -> 0x009f }
        if (r2 == 0) goto L_0x0055;
    L_0x004a:
        r2 = "parameters";
        r3 = r8.parameters;	 Catch:{ all -> 0x009f }
        r3 = r3.toString();	 Catch:{ all -> 0x009f }
        r1.put(r2, r3);	 Catch:{ all -> 0x009f }
    L_0x0055:
        r2 = "platform_id";
        r3 = r8.platform_id;	 Catch:{ all -> 0x009f }
        r1.put(r2, r3);	 Catch:{ all -> 0x009f }
        r2 = "app_version";
        r8 = r8.app_version;	 Catch:{ all -> 0x009f }
        r1.put(r2, r8);	 Catch:{ all -> 0x009f }
        r8 = "events";
        r2 = 0;
        r0.insert(r8, r2, r1);	 Catch:{ all -> 0x009f }
        r0.setTransactionSuccessful();	 Catch:{ all -> 0x009f }
        r0.endTransaction();	 Catch:{ SQLiteDiskIOException -> 0x006f }
    L_0x006f:
        r0 = r7.a(r0);	 Catch:{ Throwable -> 0x00a4 }
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r8 <= 0) goto L_0x009e;
    L_0x0079:
        r8 = r7.Gr();	 Catch:{ Throwable -> 0x00a4 }
        r2 = new com.iqoption.dto.Event;	 Catch:{ Throwable -> 0x00a4 }
        r3 = "system";
        r4 = "error_reached_limits_stored_events";
        r2.<init>(r3, r4);	 Catch:{ Throwable -> 0x00a4 }
        r8 = r8.time;	 Catch:{ Throwable -> 0x00a4 }
        r3 = r8.longValue();	 Catch:{ Throwable -> 0x00a4 }
        r5 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Throwable -> 0x00a4 }
        r3 = r3 - r5;
        r8 = java.lang.Long.valueOf(r3);	 Catch:{ Throwable -> 0x00a4 }
        r2.duration = r8;	 Catch:{ Throwable -> 0x00a4 }
        r7.eq();	 Catch:{ Throwable -> 0x00a4 }
        r7.c(r2);	 Catch:{ Throwable -> 0x00a4 }
    L_0x009e:
        return r0;
    L_0x009f:
        r8 = move-exception;
        r0.endTransaction();	 Catch:{ SQLiteDiskIOException -> 0x00a3 }
    L_0x00a3:
        throw r8;	 Catch:{ Throwable -> 0x00a4 }
    L_0x00a4:
        r8 = move-exception;
        r0 = new java.lang.RuntimeException;
        r1 = "Error during inserting events";
        r0.<init>(r1, r8);
        com.iqoption.i.b.N(r0);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.db.a.d(com.iqoption.dto.Event):long");
    }

    private long a(SQLiteDatabase sQLiteDatabase) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "events");
    }

    @WorkerThread
    public Long BV() {
        return Long.valueOf(a(getReadableDatabase()));
    }

    private void eq() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            writableDatabase.delete("events", null, null);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            b.N(new RuntimeException("Error during deleting all events", th));
        }
    }

    @WorkerThread
    public void f(ArrayList<Event> arrayList) {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Event event = (Event) it.next();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("_id='");
                stringBuilder.append(event.id);
                stringBuilder.append("'");
                writableDatabase.delete("events", stringBuilder.toString(), null);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            b.N(new RuntimeException("Error during deleting events", th));
        }
    }

    @WorkerThread
    public Event Gr() {
        ArrayList X = X("1", null);
        if (X.isEmpty()) {
            return null;
        }
        return (Event) X.get(0);
    }

    @WorkerThread
    public ArrayList<Event> aA(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("technical_logs='");
        stringBuilder.append(z);
        stringBuilder.append("'");
        return X("100", stringBuilder.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    @androidx.annotation.WorkerThread
    private java.util.ArrayList<com.iqoption.dto.Event> X(java.lang.String r16, java.lang.String r17) {
        /*
        r15 = this;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = 0;
        r3 = r15.getReadableDatabase();	 Catch:{ Throwable -> 0x0100 }
        r4 = "_id";
        r5 = "category";
        r6 = "name";
        r7 = "value";
        r8 = "time";
        r9 = "duration";
        r10 = "technical_logs";
        r11 = "parameters";
        r12 = "platform_id";
        r13 = "app_version";
        r5 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13};	 Catch:{ Throwable -> 0x0100 }
        r4 = "events";
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r6 = r17;
        r11 = r16;
        r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ Throwable -> 0x0100 }
        if (r3 == 0) goto L_0x00f7;
    L_0x0035:
        r0 = r3.moveToLast();	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        if (r0 != 0) goto L_0x0044;
    L_0x003b:
        r3.close();	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        if (r3 == 0) goto L_0x0043;
    L_0x0040:
        r3.close();
    L_0x0043:
        return r1;
    L_0x0044:
        r0 = 2;
        r4 = r3.getString(r0);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r5 = new com.iqoption.dto.Event;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r0 = 0;
        r6 = r3.getLong(r0);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r7 = 1;
        r8 = r3.getString(r7);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r5.<init>(r6, r8, r4);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r6 = 3;
        r8 = r3.getDouble(r6);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r6 = java.lang.Double.valueOf(r8);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r5.value = r6;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r6 = 4;
        r8 = r3.getLong(r6);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r6 = java.lang.Long.valueOf(r8);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r5.time = r6;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r6 = 5;
        r8 = r3.getLong(r6);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r6 = java.lang.Long.valueOf(r8);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r5.duration = r6;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r6 = 6;
        r6 = r3.getInt(r6);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        if (r6 != r7) goto L_0x0085;
    L_0x0084:
        r0 = 1;
    L_0x0085:
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r5.technical_logs = r0;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r0 = 7;
        r6 = r3.getString(r0);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        if (r6 == 0) goto L_0x00c9;
    L_0x0092:
        r0 = com.iqoption.util.w.aWN();	 Catch:{ Exception -> 0x009d }
        r0 = r0.parse(r6);	 Catch:{ Exception -> 0x009d }
        r5.parameters = r0;	 Catch:{ Exception -> 0x009d }
        goto L_0x00c9;
    L_0x009d:
        r0 = move-exception;
        if (r2 != 0) goto L_0x00a6;
    L_0x00a0:
        r7 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r7.<init>();	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r2 = r7;
    L_0x00a6:
        r7 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r7.<init>();	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r8 = "unable to parse event ";
        r7.append(r8);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r7.append(r4);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r4 = ", params=";
        r7.append(r4);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r7.append(r6);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r4 = r7.toString();	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        com.iqoption.util.i.ag(r4);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        com.iqoption.util.i.d(r0);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r2.add(r5);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
    L_0x00c9:
        r0 = 8;
        r0 = r3.getInt(r0);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r5.platform_id = r0;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r0 = 9;
        r0 = r3.getString(r0);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r5.app_version = r0;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r0 = r5.app_version;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        if (r0 != 0) goto L_0x00e5;
    L_0x00e1:
        r0 = "5.27.0";
        r5.app_version = r0;	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
    L_0x00e5:
        r1.add(r5);	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        r0 = r3.moveToPrevious();	 Catch:{ Throwable -> 0x00f2, all -> 0x00ef }
        if (r0 != 0) goto L_0x0044;
    L_0x00ee:
        goto L_0x00f7;
    L_0x00ef:
        r0 = move-exception;
        r2 = r3;
        goto L_0x00fe;
    L_0x00f2:
        r0 = move-exception;
        r14 = r3;
        r3 = r2;
        r2 = r14;
        goto L_0x0102;
    L_0x00f7:
        if (r3 == 0) goto L_0x0112;
    L_0x00f9:
        r3.close();
        goto L_0x0112;
    L_0x00fd:
        r0 = move-exception;
    L_0x00fe:
        r3 = r15;
        goto L_0x011b;
    L_0x0100:
        r0 = move-exception;
        r3 = r2;
    L_0x0102:
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x00fd }
        r5 = "Error during getting events";
        r4.<init>(r5, r0);	 Catch:{ all -> 0x00fd }
        com.iqoption.i.b.N(r4);	 Catch:{ all -> 0x00fd }
        if (r2 == 0) goto L_0x0111;
    L_0x010e:
        r2.close();
    L_0x0111:
        r2 = r3;
    L_0x0112:
        if (r2 == 0) goto L_0x0119;
    L_0x0114:
        r3 = r15;
        r15.f(r2);
        goto L_0x011a;
    L_0x0119:
        r3 = r15;
    L_0x011a:
        return r1;
    L_0x011b:
        if (r2 == 0) goto L_0x0120;
    L_0x011d:
        r2.close();
    L_0x0120:
        goto L_0x0122;
    L_0x0121:
        throw r0;
    L_0x0122:
        goto L_0x0121;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.db.a.X(java.lang.String, java.lang.String):java.util.ArrayList");
    }
}
