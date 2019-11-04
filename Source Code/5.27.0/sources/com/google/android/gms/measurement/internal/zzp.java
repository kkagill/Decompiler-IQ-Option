package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzbk.zza;
import com.google.android.gms.internal.measurement.zzbk.zzb;
import com.google.android.gms.internal.measurement.zzbk.zzc;
import com.google.android.gms.internal.measurement.zzbk.zzd;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbs.zze;
import com.google.android.gms.internal.measurement.zzbs.zzk;
import com.google.android.gms.internal.measurement.zzey;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class zzp extends zzjh {
    zzp(zzjg zzjg) {
        super(zzjg);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return false;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x076c  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0679  */
    @androidx.annotation.WorkerThread
    public final java.util.List<com.google.android.gms.internal.measurement.zzbs.zza> zza(java.lang.String r72, java.util.List<com.google.android.gms.internal.measurement.zzbs.zzc> r73, java.util.List<com.google.android.gms.internal.measurement.zzbs.zzk> r74) {
        /*
        r71 = this;
        r7 = r71;
        r9 = r72;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r72);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r73);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r74);
        r15 = new java.util.HashSet;
        r15.<init>();
        r13 = new androidx.collection.ArrayMap;
        r13.<init>();
        r14 = new androidx.collection.ArrayMap;
        r14.<init>();
        r11 = new androidx.collection.ArrayMap;
        r11.<init>();
        r12 = new androidx.collection.ArrayMap;
        r12.<init>();
        r10 = new androidx.collection.ArrayMap;
        r10.<init>();
        r0 = r71.zzad();
        r25 = r0.zzq(r9);
        r0 = r71.zzad();
        r1 = com.google.android.gms.measurement.internal.zzak.zziq;
        r26 = r0.zzd(r9, r1);
        r0 = r71.zzad();
        r1 = com.google.android.gms.measurement.internal.zzak.zziy;
        r27 = r0.zzd(r9, r1);
        r0 = r71.zzad();
        r1 = com.google.android.gms.measurement.internal.zzak.zziz;
        r28 = r0.zzd(r9, r1);
        if (r27 != 0) goto L_0x0055;
    L_0x0053:
        if (r28 == 0) goto L_0x007c;
    L_0x0055:
        r0 = r73.iterator();
    L_0x0059:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x007c;
    L_0x005f:
        r1 = r0.next();
        r1 = (com.google.android.gms.internal.measurement.zzbs.zzc) r1;
        r2 = r1.getName();
        r3 = "_s";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x0059;
    L_0x0071:
        r0 = r1.getTimestampMillis();
        r0 = java.lang.Long.valueOf(r0);
        r29 = r0;
        goto L_0x007e;
    L_0x007c:
        r29 = 0;
    L_0x007e:
        r6 = 1;
        r4 = 0;
        if (r29 == 0) goto L_0x00c1;
    L_0x0082:
        if (r28 == 0) goto L_0x00c1;
    L_0x0084:
        r1 = r71.zzgy();
        r1.zzbi();
        r1.zzo();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r72);
        r0 = new android.content.ContentValues;
        r0.<init>();
        r2 = java.lang.Integer.valueOf(r4);
        r3 = "current_session_count";
        r0.put(r3, r2);
        r2 = r1.getWritableDatabase();	 Catch:{ SQLiteException -> 0x00af }
        r3 = "events";
        r5 = "app_id = ?";
        r8 = new java.lang.String[r6];	 Catch:{ SQLiteException -> 0x00af }
        r8[r4] = r9;	 Catch:{ SQLiteException -> 0x00af }
        r2.update(r3, r0, r5, r8);	 Catch:{ SQLiteException -> 0x00af }
        goto L_0x00c1;
    L_0x00af:
        r0 = move-exception;
        r1 = r1.zzab();
        r1 = r1.zzgk();
        r2 = com.google.android.gms.measurement.internal.zzef.zzam(r72);
        r3 = "Error resetting session-scoped event counts. appId";
        r1.zza(r3, r2, r0);
    L_0x00c1:
        r0 = r71.zzgy();
        r0 = r0.zzaf(r9);
        if (r0 == 0) goto L_0x0353;
    L_0x00cb:
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x0353;
    L_0x00d1:
        r1 = new java.util.HashSet;
        r2 = r0.keySet();
        r1.<init>(r2);
        if (r27 == 0) goto L_0x01d6;
    L_0x00dc:
        if (r29 == 0) goto L_0x01d6;
    L_0x00de:
        r2 = r71.zzgx();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r72);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r0);
        r3 = new androidx.collection.ArrayMap;
        r3.<init>();
        r5 = r0.isEmpty();
        if (r5 != 0) goto L_0x01d7;
    L_0x00f3:
        r5 = r2.zzgy();
        r5 = r5.zzae(r9);
        r8 = r0.keySet();
        r8 = r8.iterator();
    L_0x0103:
        r17 = r8.hasNext();
        if (r17 == 0) goto L_0x01d7;
    L_0x0109:
        r17 = r8.next();
        r17 = (java.lang.Integer) r17;
        r17 = r17.intValue();
        r6 = java.lang.Integer.valueOf(r17);
        r6 = r0.get(r6);
        r6 = (com.google.android.gms.internal.measurement.zzbs.zzi) r6;
        r4 = java.lang.Integer.valueOf(r17);
        r4 = r5.get(r4);
        r4 = (java.util.List) r4;
        if (r4 == 0) goto L_0x01bf;
    L_0x0129:
        r20 = r4.isEmpty();
        if (r20 == 0) goto L_0x0131;
    L_0x012f:
        goto L_0x01bf;
    L_0x0131:
        r20 = r5;
        r5 = r2.zzgw();
        r21 = r8;
        r8 = r6.zzpy();
        r5 = r5.zza(r8, r4);
        r8 = r5.isEmpty();
        if (r8 != 0) goto L_0x01ba;
    L_0x0147:
        r8 = r6.zzuj();
        r8 = (com.google.android.gms.internal.measurement.zzey.zza) r8;
        r8 = (com.google.android.gms.internal.measurement.zzbs.zzi.zza) r8;
        r8 = r8.zzqr();
        r5 = r8.zzo(r5);
        r8 = r2.zzgw();
        r22 = r2;
        r2 = r6.zzpv();
        r2 = r8.zza(r2, r4);
        r8 = r5.zzqq();
        r8.zzn(r2);
        r2 = 0;
    L_0x016d:
        r8 = r6.zzqc();
        if (r2 >= r8) goto L_0x018b;
    L_0x0173:
        r8 = r6.zzae(r2);
        r8 = r8.getIndex();
        r8 = java.lang.Integer.valueOf(r8);
        r8 = r4.contains(r8);
        if (r8 == 0) goto L_0x0188;
    L_0x0185:
        r5.zzaj(r2);
    L_0x0188:
        r2 = r2 + 1;
        goto L_0x016d;
    L_0x018b:
        r2 = 0;
    L_0x018c:
        r8 = r6.zzqf();
        if (r2 >= r8) goto L_0x01aa;
    L_0x0192:
        r8 = r6.zzag(r2);
        r8 = r8.getIndex();
        r8 = java.lang.Integer.valueOf(r8);
        r8 = r4.contains(r8);
        if (r8 == 0) goto L_0x01a7;
    L_0x01a4:
        r5.zzak(r2);
    L_0x01a7:
        r2 = r2 + 1;
        goto L_0x018c;
    L_0x01aa:
        r2 = java.lang.Integer.valueOf(r17);
        r4 = r5.zzug();
        r4 = (com.google.android.gms.internal.measurement.zzey) r4;
        r4 = (com.google.android.gms.internal.measurement.zzbs.zzi) r4;
        r3.put(r2, r4);
        goto L_0x01cc;
    L_0x01ba:
        r5 = r20;
        r8 = r21;
        goto L_0x01d2;
    L_0x01bf:
        r22 = r2;
        r20 = r5;
        r21 = r8;
        r2 = java.lang.Integer.valueOf(r17);
        r3.put(r2, r6);
    L_0x01cc:
        r5 = r20;
        r8 = r21;
        r2 = r22;
    L_0x01d2:
        r4 = 0;
        r6 = 1;
        goto L_0x0103;
    L_0x01d6:
        r3 = r0;
    L_0x01d7:
        r1 = r1.iterator();
    L_0x01db:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0353;
    L_0x01e1:
        r2 = r1.next();
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r4 = java.lang.Integer.valueOf(r2);
        r4 = r3.get(r4);
        r4 = (com.google.android.gms.internal.measurement.zzbs.zzi) r4;
        r5 = java.lang.Integer.valueOf(r2);
        r5 = r14.get(r5);
        r5 = (java.util.BitSet) r5;
        r6 = java.lang.Integer.valueOf(r2);
        r6 = r11.get(r6);
        r6 = (java.util.BitSet) r6;
        if (r25 == 0) goto L_0x026e;
    L_0x020b:
        r8 = new androidx.collection.ArrayMap;
        r8.<init>();
        if (r4 == 0) goto L_0x0262;
    L_0x0212:
        r17 = r4.zzqc();
        if (r17 != 0) goto L_0x0219;
    L_0x0218:
        goto L_0x0262;
    L_0x0219:
        r17 = r4.zzqb();
        r17 = r17.iterator();
    L_0x0221:
        r20 = r17.hasNext();
        if (r20 == 0) goto L_0x0262;
    L_0x0227:
        r20 = r17.next();
        r20 = (com.google.android.gms.internal.measurement.zzbs.zzb) r20;
        r21 = r20.zzme();
        if (r21 == 0) goto L_0x0259;
    L_0x0233:
        r21 = r20.getIndex();
        r22 = r1;
        r1 = java.lang.Integer.valueOf(r21);
        r21 = r20.zzmf();
        if (r21 == 0) goto L_0x0252;
    L_0x0243:
        r20 = r20.zzmg();
        r20 = java.lang.Long.valueOf(r20);
        r70 = r20;
        r20 = r3;
        r3 = r70;
        goto L_0x0255;
    L_0x0252:
        r20 = r3;
        r3 = 0;
    L_0x0255:
        r8.put(r1, r3);
        goto L_0x025d;
    L_0x0259:
        r22 = r1;
        r20 = r3;
    L_0x025d:
        r3 = r20;
        r1 = r22;
        goto L_0x0221;
    L_0x0262:
        r22 = r1;
        r20 = r3;
        r1 = java.lang.Integer.valueOf(r2);
        r12.put(r1, r8);
        goto L_0x0273;
    L_0x026e:
        r22 = r1;
        r20 = r3;
        r8 = 0;
    L_0x0273:
        if (r5 != 0) goto L_0x028d;
    L_0x0275:
        r5 = new java.util.BitSet;
        r5.<init>();
        r1 = java.lang.Integer.valueOf(r2);
        r14.put(r1, r5);
        r6 = new java.util.BitSet;
        r6.<init>();
        r1 = java.lang.Integer.valueOf(r2);
        r11.put(r1, r6);
    L_0x028d:
        if (r4 == 0) goto L_0x02ea;
    L_0x028f:
        r1 = 0;
    L_0x0290:
        r3 = r4.zzpw();
        r3 = r3 << 6;
        if (r1 >= r3) goto L_0x02ea;
    L_0x0298:
        r3 = r4.zzpv();
        r3 = com.google.android.gms.measurement.internal.zzjo.zza(r3, r1);
        if (r3 == 0) goto L_0x02cf;
    L_0x02a2:
        r3 = r71.zzab();
        r3 = r3.zzgs();
        r17 = r11;
        r11 = java.lang.Integer.valueOf(r2);
        r21 = r12;
        r12 = java.lang.Integer.valueOf(r1);
        r23 = r14;
        r14 = "Filter already evaluated. audience ID, filter ID";
        r3.zza(r14, r11, r12);
        r6.set(r1);
        r3 = r4.zzpy();
        r3 = com.google.android.gms.measurement.internal.zzjo.zza(r3, r1);
        if (r3 == 0) goto L_0x02d5;
    L_0x02ca:
        r5.set(r1);
        r3 = 1;
        goto L_0x02d6;
    L_0x02cf:
        r17 = r11;
        r21 = r12;
        r23 = r14;
    L_0x02d5:
        r3 = 0;
    L_0x02d6:
        if (r8 == 0) goto L_0x02e1;
    L_0x02d8:
        if (r3 != 0) goto L_0x02e1;
    L_0x02da:
        r3 = java.lang.Integer.valueOf(r1);
        r8.remove(r3);
    L_0x02e1:
        r1 = r1 + 1;
        r11 = r17;
        r12 = r21;
        r14 = r23;
        goto L_0x0290;
    L_0x02ea:
        r17 = r11;
        r21 = r12;
        r23 = r14;
        r1 = com.google.android.gms.internal.measurement.zzbs.zza.zzmc();
        r3 = 0;
        r1 = r1.zzk(r3);
        if (r27 == 0) goto L_0x0309;
    L_0x02fb:
        r3 = java.lang.Integer.valueOf(r2);
        r3 = r0.get(r3);
        r3 = (com.google.android.gms.internal.measurement.zzbs.zzi) r3;
        r1.zza(r3);
        goto L_0x030c;
    L_0x0309:
        r1.zza(r4);
    L_0x030c:
        r3 = com.google.android.gms.internal.measurement.zzbs.zzi.zzqh();
        r4 = com.google.android.gms.measurement.internal.zzjo.zza(r5);
        r3 = r3.zzo(r4);
        r4 = com.google.android.gms.measurement.internal.zzjo.zza(r6);
        r3 = r3.zzn(r4);
        if (r25 == 0) goto L_0x0335;
    L_0x0322:
        r4 = zza(r8);
        r3.zzp(r4);
        r4 = java.lang.Integer.valueOf(r2);
        r5 = new androidx.collection.ArrayMap;
        r5.<init>();
        r10.put(r4, r5);
    L_0x0335:
        r1.zza(r3);
        r2 = java.lang.Integer.valueOf(r2);
        r1 = r1.zzug();
        r1 = (com.google.android.gms.internal.measurement.zzey) r1;
        r1 = (com.google.android.gms.internal.measurement.zzbs.zza) r1;
        r13.put(r2, r1);
        r11 = r17;
        r3 = r20;
        r12 = r21;
        r1 = r22;
        r14 = r23;
        goto L_0x01db;
    L_0x0353:
        r17 = r11;
        r21 = r12;
        r23 = r14;
        r0 = r73.isEmpty();
        r14 = "Filter definition";
        r8 = "Skipping failed audience ID";
        r30 = "null";
        if (r0 != 0) goto L_0x09dd;
    L_0x0365:
        r6 = new androidx.collection.ArrayMap;
        r6.<init>();
        r31 = r73.iterator();
        r32 = 0;
        r2 = r32;
        r0 = 0;
        r1 = 0;
    L_0x0374:
        r4 = r31.hasNext();
        if (r4 == 0) goto L_0x09dd;
    L_0x037a:
        r4 = r31.next();
        r4 = (com.google.android.gms.internal.measurement.zzbs.zzc) r4;
        r5 = r4.getName();
        r20 = r4.zzmj();
        r71.zzgw();
        r11 = "_eid";
        r24 = com.google.android.gms.measurement.internal.zzjo.zzb(r4, r11);
        r12 = r24;
        r12 = (java.lang.Long) r12;
        if (r12 == 0) goto L_0x039a;
    L_0x0397:
        r24 = 1;
        goto L_0x039c;
    L_0x039a:
        r24 = 0;
    L_0x039c:
        if (r24 == 0) goto L_0x03aa;
    L_0x039e:
        r35 = r2;
        r2 = "_ep";
        r2 = r5.equals(r2);
        if (r2 == 0) goto L_0x03ac;
    L_0x03a8:
        r2 = 1;
        goto L_0x03ad;
    L_0x03aa:
        r35 = r2;
    L_0x03ac:
        r2 = 0;
    L_0x03ad:
        r37 = 1;
        if (r2 == 0) goto L_0x04f0;
    L_0x03b1:
        r71.zzgw();
        r2 = "_en";
        r2 = com.google.android.gms.measurement.internal.zzjo.zzb(r4, r2);
        r5 = r2;
        r5 = (java.lang.String) r5;
        r2 = android.text.TextUtils.isEmpty(r5);
        if (r2 == 0) goto L_0x03d6;
    L_0x03c3:
        r2 = r71.zzab();
        r2 = r2.zzgk();
        r3 = "Extra parameter without an event name. eventId";
        r2.zza(r3, r12);
        r41 = r6;
        r18 = r8;
        goto L_0x04e8;
    L_0x03d6:
        if (r0 == 0) goto L_0x03ed;
    L_0x03d8:
        if (r1 == 0) goto L_0x03ed;
    L_0x03da:
        r2 = r12.longValue();
        r39 = r1.longValue();
        r24 = (r2 > r39 ? 1 : (r2 == r39 ? 0 : -1));
        if (r24 == 0) goto L_0x03e7;
    L_0x03e6:
        goto L_0x03ed;
    L_0x03e7:
        r11 = r0;
        r24 = r1;
        r2 = r35;
        goto L_0x0415;
    L_0x03ed:
        r2 = r71.zzgy();
        r2 = r2.zza(r9, r12);
        if (r2 == 0) goto L_0x04d6;
    L_0x03f7:
        r3 = r2.first;
        if (r3 != 0) goto L_0x03fd;
    L_0x03fb:
        goto L_0x04d6;
    L_0x03fd:
        r0 = r2.first;
        r0 = (com.google.android.gms.internal.measurement.zzbs.zzc) r0;
        r1 = r2.second;
        r1 = (java.lang.Long) r1;
        r2 = r1.longValue();
        r71.zzgw();
        r1 = com.google.android.gms.measurement.internal.zzjo.zzb(r0, r11);
        r1 = (java.lang.Long) r1;
        r11 = r0;
        r24 = r1;
    L_0x0415:
        r35 = r2 - r37;
        r0 = (r35 > r32 ? 1 : (r35 == r32 ? 0 : -1));
        if (r0 > 0) goto L_0x045c;
    L_0x041b:
        r1 = r71.zzgy();
        r1.zzo();
        r0 = r1.zzab();
        r0 = r0.zzgs();
        r2 = "Clearing complex main event info. appId";
        r0.zza(r2, r9);
        r0 = r1.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0444 }
        r2 = "delete from main_event_params where app_id=?";
        r3 = 1;
        r12 = new java.lang.String[r3];	 Catch:{ SQLiteException -> 0x0442 }
        r18 = 0;
        r12[r18] = r9;	 Catch:{ SQLiteException -> 0x0440 }
        r0.execSQL(r2, r12);	 Catch:{ SQLiteException -> 0x0440 }
        goto L_0x0455;
    L_0x0440:
        r0 = move-exception;
        goto L_0x0448;
    L_0x0442:
        r0 = move-exception;
        goto L_0x0446;
    L_0x0444:
        r0 = move-exception;
        r3 = 1;
    L_0x0446:
        r18 = 0;
    L_0x0448:
        r1 = r1.zzab();
        r1 = r1.zzgk();
        r2 = "Error clearing complex main event";
        r1.zza(r2, r0);
    L_0x0455:
        r12 = r4;
        r41 = r6;
        r18 = r8;
        r8 = r5;
        goto L_0x0474;
    L_0x045c:
        r3 = 1;
        r18 = 0;
        r1 = r71.zzgy();
        r2 = r72;
        r19 = 1;
        r3 = r12;
        r12 = r4;
        r18 = r8;
        r8 = r5;
        r4 = r35;
        r41 = r6;
        r6 = r11;
        r1.zza(r2, r3, r4, r6);
    L_0x0474:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r11.zzmj();
        r1 = r1.iterator();
    L_0x0481:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x049e;
    L_0x0487:
        r2 = r1.next();
        r2 = (com.google.android.gms.internal.measurement.zzbs.zze) r2;
        r71.zzgw();
        r3 = r2.getName();
        r3 = com.google.android.gms.measurement.internal.zzjo.zza(r12, r3);
        if (r3 != 0) goto L_0x0481;
    L_0x049a:
        r0.add(r2);
        goto L_0x0481;
    L_0x049e:
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x04bf;
    L_0x04a4:
        r1 = r20.iterator();
    L_0x04a8:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x04b8;
    L_0x04ae:
        r2 = r1.next();
        r2 = (com.google.android.gms.internal.measurement.zzbs.zze) r2;
        r0.add(r2);
        goto L_0x04a8;
    L_0x04b8:
        r42 = r0;
        r0 = r8;
        r39 = r11;
        r11 = r12;
        goto L_0x04d2;
    L_0x04bf:
        r0 = r71.zzab();
        r0 = r0.zzgn();
        r1 = "No unique parameters in main event. eventName";
        r0.zza(r1, r8);
        r0 = r8;
        r39 = r11;
        r11 = r12;
        r42 = r20;
    L_0x04d2:
        r40 = r24;
        goto L_0x053d;
    L_0x04d6:
        r41 = r6;
        r18 = r8;
        r8 = r5;
        r2 = r71.zzab();
        r2 = r2.zzgk();
        r3 = "Extra parameter without existing main event. eventName, eventId";
        r2.zza(r3, r8, r12);
    L_0x04e8:
        r8 = r18;
        r2 = r35;
        r6 = r41;
        goto L_0x0374;
    L_0x04f0:
        r11 = r4;
        r41 = r6;
        r18 = r8;
        if (r24 == 0) goto L_0x0535;
    L_0x04f7:
        r71.zzgw();
        r0 = java.lang.Long.valueOf(r32);
        r1 = "_epc";
        r1 = com.google.android.gms.measurement.internal.zzjo.zzb(r11, r1);
        if (r1 != 0) goto L_0x0507;
    L_0x0506:
        goto L_0x0508;
    L_0x0507:
        r0 = r1;
    L_0x0508:
        r0 = (java.lang.Long) r0;
        r35 = r0.longValue();
        r0 = (r35 > r32 ? 1 : (r35 == r32 ? 0 : -1));
        if (r0 > 0) goto L_0x0521;
    L_0x0512:
        r0 = r71.zzab();
        r0 = r0.zzgn();
        r1 = "Complex event with zero extra param count. eventName";
        r0.zza(r1, r5);
        r8 = r5;
        goto L_0x052f;
    L_0x0521:
        r1 = r71.zzgy();
        r2 = r72;
        r3 = r12;
        r8 = r5;
        r4 = r35;
        r6 = r11;
        r1.zza(r2, r3, r4, r6);
    L_0x052f:
        r0 = r8;
        r39 = r11;
        r40 = r12;
        goto L_0x053b;
    L_0x0535:
        r8 = r5;
        r39 = r0;
        r40 = r1;
        r0 = r8;
    L_0x053b:
        r42 = r20;
    L_0x053d:
        r1 = r71.zzgy();
        r2 = r11.getName();
        r1 = r1.zzc(r9, r2);
        if (r1 != 0) goto L_0x05ce;
    L_0x054b:
        r1 = r71.zzab();
        r1 = r1.zzgn();
        r2 = com.google.android.gms.measurement.internal.zzef.zzam(r72);
        r3 = r71.zzy();
        r3 = r3.zzaj(r0);
        r4 = "Event aggregate wasn't created during raw event logging. appId, event";
        r1.zza(r4, r2, r3);
        if (r28 == 0) goto L_0x059a;
    L_0x0566:
        r1 = new com.google.android.gms.measurement.internal.zzae;
        r5 = r18;
        r6 = 0;
        r8 = r1;
        r2 = r11.getName();
        r4 = r10;
        r10 = r2;
        r2 = 1;
        r34 = r11;
        r43 = r17;
        r44 = r21;
        r11 = r2;
        r46 = r13;
        r48 = r14;
        r47 = r23;
        r13 = r2;
        r49 = r15;
        r15 = r2;
        r17 = r34.getTimestampMillis();
        r19 = 0;
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
        r3 = r9;
        r9 = r72;
        r8.<init>(r9, r10, r11, r13, r15, r17, r19, r21, r22, r23, r24);
        goto L_0x05cb;
    L_0x059a:
        r3 = r9;
        r4 = r10;
        r34 = r11;
        r46 = r13;
        r48 = r14;
        r49 = r15;
        r43 = r17;
        r5 = r18;
        r44 = r21;
        r47 = r23;
        r6 = 0;
        r1 = new com.google.android.gms.measurement.internal.zzae;
        r10 = r34.getName();
        r11 = 1;
        r13 = 1;
        r15 = r34.getTimestampMillis();
        r17 = 0;
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r22 = 0;
        r8 = r1;
        r9 = r72;
        r8.<init>(r9, r10, r11, r13, r15, r17, r19, r20, r21, r22);
    L_0x05cb:
        r7 = r1;
        goto L_0x0645;
    L_0x05ce:
        r3 = r9;
        r4 = r10;
        r34 = r11;
        r46 = r13;
        r48 = r14;
        r49 = r15;
        r43 = r17;
        r5 = r18;
        r44 = r21;
        r47 = r23;
        r6 = 0;
        if (r28 == 0) goto L_0x0617;
    L_0x05e3:
        r2 = new com.google.android.gms.measurement.internal.zzae;
        r50 = r2;
        r8 = r1.zzce;
        r51 = r8;
        r8 = r1.name;
        r52 = r8;
        r8 = r1.zzfg;
        r53 = r8 + r37;
        r8 = r1.zzfh;
        r55 = r8 + r37;
        r8 = r1.zzfi;
        r57 = r8 + r37;
        r8 = r1.zzfj;
        r59 = r8;
        r8 = r1.zzfk;
        r61 = r8;
        r8 = r1.zzfl;
        r63 = r8;
        r8 = r1.zzfm;
        r64 = r8;
        r8 = r1.zzfn;
        r65 = r8;
        r1 = r1.zzfo;
        r66 = r1;
        r50.<init>(r51, r52, r53, r55, r57, r59, r61, r63, r64, r65, r66);
        goto L_0x0644;
    L_0x0617:
        r2 = new com.google.android.gms.measurement.internal.zzae;
        r8 = r2;
        r9 = r1.zzce;
        r10 = r1.name;
        r11 = r1.zzfg;
        r11 = r11 + r37;
        r13 = r1.zzfh;
        r13 = r13 + r37;
        r6 = r1.zzfi;
        r15 = r6;
        r6 = r1.zzfj;
        r17 = r6;
        r6 = r1.zzfk;
        r19 = r6;
        r6 = r1.zzfl;
        r21 = r6;
        r6 = r1.zzfm;
        r22 = r6;
        r6 = r1.zzfn;
        r23 = r6;
        r1 = r1.zzfo;
        r24 = r1;
        r8.<init>(r9, r10, r11, r13, r15, r17, r19, r21, r22, r23, r24);
    L_0x0644:
        r7 = r2;
    L_0x0645:
        r1 = r71.zzgy();
        r1.zza(r7);
        r8 = r7.zzfg;
        r10 = r41;
        r1 = r10.get(r0);
        r1 = (java.util.Map) r1;
        if (r1 != 0) goto L_0x066a;
    L_0x0658:
        r1 = r71.zzgy();
        r1 = r1.zzh(r3, r0);
        if (r1 != 0) goto L_0x0667;
    L_0x0662:
        r1 = new androidx.collection.ArrayMap;
        r1.<init>();
    L_0x0667:
        r10.put(r0, r1);
    L_0x066a:
        r11 = r1;
        r1 = r11.keySet();
        r12 = r1.iterator();
    L_0x0673:
        r1 = r12.hasNext();
        if (r1 == 0) goto L_0x09c3;
    L_0x0679:
        r1 = r12.next();
        r1 = (java.lang.Integer) r1;
        r13 = r1.intValue();
        r1 = java.lang.Integer.valueOf(r13);
        r14 = r49;
        r1 = r14.contains(r1);
        if (r1 == 0) goto L_0x06a1;
    L_0x068f:
        r1 = r71.zzab();
        r1 = r1.zzgs();
        r2 = java.lang.Integer.valueOf(r13);
        r1.zza(r5, r2);
        r49 = r14;
        goto L_0x0673;
    L_0x06a1:
        r1 = java.lang.Integer.valueOf(r13);
        r15 = r47;
        r1 = r15.get(r1);
        r1 = (java.util.BitSet) r1;
        r2 = java.lang.Integer.valueOf(r13);
        r6 = r43;
        r2 = r6.get(r2);
        r2 = (java.util.BitSet) r2;
        if (r25 == 0) goto L_0x06d8;
    L_0x06bb:
        r16 = r1;
        r1 = java.lang.Integer.valueOf(r13);
        r17 = r8;
        r8 = r44;
        r1 = r8.get(r1);
        r1 = (java.util.Map) r1;
        r9 = java.lang.Integer.valueOf(r13);
        r9 = r4.get(r9);
        r9 = (java.util.Map) r9;
        r19 = r1;
        goto L_0x06e1;
    L_0x06d8:
        r16 = r1;
        r17 = r8;
        r8 = r44;
        r9 = 0;
        r19 = 0;
    L_0x06e1:
        r1 = java.lang.Integer.valueOf(r13);
        r20 = r9;
        r9 = r46;
        r1 = r9.get(r1);
        r1 = (com.google.android.gms.internal.measurement.zzbs.zza) r1;
        if (r1 != 0) goto L_0x0750;
    L_0x06f1:
        r1 = java.lang.Integer.valueOf(r13);
        r2 = com.google.android.gms.internal.measurement.zzbs.zza.zzmc();
        r41 = r10;
        r10 = 1;
        r2 = r2.zzk(r10);
        r2 = r2.zzug();
        r2 = (com.google.android.gms.internal.measurement.zzey) r2;
        r2 = (com.google.android.gms.internal.measurement.zzbs.zza) r2;
        r9.put(r1, r2);
        r1 = new java.util.BitSet;
        r1.<init>();
        r2 = java.lang.Integer.valueOf(r13);
        r15.put(r2, r1);
        r2 = new java.util.BitSet;
        r2.<init>();
        r10 = java.lang.Integer.valueOf(r13);
        r6.put(r10, r2);
        if (r25 == 0) goto L_0x074b;
    L_0x0725:
        r10 = new androidx.collection.ArrayMap;
        r10.<init>();
        r16 = r1;
        r1 = java.lang.Integer.valueOf(r13);
        r8.put(r1, r10);
        r1 = new androidx.collection.ArrayMap;
        r1.<init>();
        r21 = r2;
        r2 = java.lang.Integer.valueOf(r13);
        r4.put(r2, r1);
        r19 = r10;
        r10 = r16;
        r2 = r21;
        r16 = r12;
        r12 = r1;
        goto L_0x0758;
    L_0x074b:
        r16 = r1;
        r21 = r2;
        goto L_0x0752;
    L_0x0750:
        r41 = r10;
    L_0x0752:
        r10 = r16;
        r16 = r12;
        r12 = r20;
    L_0x0758:
        r1 = java.lang.Integer.valueOf(r13);
        r1 = r11.get(r1);
        r1 = (java.util.List) r1;
        r20 = r1.iterator();
    L_0x0766:
        r1 = r20.hasNext();
        if (r1 == 0) goto L_0x09b1;
    L_0x076c:
        r1 = r20.next();
        r1 = (com.google.android.gms.internal.measurement.zzbk.zza) r1;
        if (r28 == 0) goto L_0x0783;
    L_0x0774:
        if (r27 == 0) goto L_0x0783;
    L_0x0776:
        r21 = r1.zzki();
        if (r21 == 0) goto L_0x0783;
    L_0x077c:
        r21 = r2;
        r2 = r7.zzfi;
        r22 = r2;
        goto L_0x0787;
    L_0x0783:
        r21 = r2;
        r22 = r17;
    L_0x0787:
        r2 = r71.zzab();
        r3 = 2;
        r2 = r2.isLoggable(r3);
        if (r2 == 0) goto L_0x07e3;
    L_0x0792:
        r2 = r71.zzab();
        r2 = r2.zzgs();
        r3 = java.lang.Integer.valueOf(r13);
        r24 = r1.zzkb();
        if (r24 == 0) goto L_0x07b5;
    L_0x07a4:
        r24 = r1.getId();
        r24 = java.lang.Integer.valueOf(r24);
        r37 = r5;
        r70 = r24;
        r24 = r4;
        r4 = r70;
        goto L_0x07ba;
    L_0x07b5:
        r24 = r4;
        r37 = r5;
        r4 = 0;
    L_0x07ba:
        r5 = r71.zzy();
        r43 = r6;
        r6 = r1.zzjz();
        r5 = r5.zzaj(r6);
        r6 = "Evaluating filter. audience, filter, event";
        r2.zza(r6, r3, r4, r5);
        r2 = r71.zzab();
        r2 = r2.zzgs();
        r3 = r71.zzgw();
        r3 = r3.zza(r1);
        r5 = r48;
        r2.zza(r5, r3);
        goto L_0x07eb;
    L_0x07e3:
        r24 = r4;
        r37 = r5;
        r43 = r6;
        r5 = r48;
    L_0x07eb:
        r2 = r1.zzkb();
        if (r2 == 0) goto L_0x095b;
    L_0x07f1:
        r2 = r1.getId();
        r6 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r2 <= r6) goto L_0x07fb;
    L_0x07f9:
        goto L_0x095b;
    L_0x07fb:
        r4 = "Event filter result";
        if (r25 == 0) goto L_0x08d6;
    L_0x07ff:
        r2 = r1.zzkf();
        r38 = r1.zzkg();
        if (r27 == 0) goto L_0x0811;
    L_0x0809:
        r3 = r1.zzki();
        if (r3 == 0) goto L_0x0811;
    L_0x080f:
        r3 = 1;
        goto L_0x0812;
    L_0x0811:
        r3 = 0;
    L_0x0812:
        if (r2 != 0) goto L_0x081c;
    L_0x0814:
        if (r38 != 0) goto L_0x081c;
    L_0x0816:
        if (r3 == 0) goto L_0x0819;
    L_0x0818:
        goto L_0x081c;
    L_0x0819:
        r44 = 0;
        goto L_0x081e;
    L_0x081c:
        r44 = 1;
    L_0x081e:
        r2 = r1.getId();
        r2 = r10.get(r2);
        if (r2 == 0) goto L_0x0859;
    L_0x0828:
        if (r44 != 0) goto L_0x0859;
    L_0x082a:
        r2 = r71.zzab();
        r2 = r2.zzgs();
        r3 = java.lang.Integer.valueOf(r13);
        r4 = r1.zzkb();
        if (r4 == 0) goto L_0x0845;
    L_0x083c:
        r1 = r1.getId();
        r1 = java.lang.Integer.valueOf(r1);
        goto L_0x0846;
    L_0x0845:
        r1 = 0;
    L_0x0846:
        r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID";
        r2.zza(r4, r3, r1);
        r3 = r72;
        r48 = r5;
        r2 = r21;
        r4 = r24;
        r5 = r37;
        r6 = r43;
        goto L_0x0766;
    L_0x0859:
        r3 = r19;
        r19 = r1;
        r1 = r71;
        r45 = r7;
        r7 = r21;
        r2 = r19;
        r46 = r9;
        r21 = r11;
        r11 = r72;
        r9 = r3;
        r3 = r0;
        r67 = r24;
        r24 = r8;
        r8 = r4;
        r4 = r42;
        r69 = r5;
        r47 = r15;
        r15 = r37;
        r68 = r43;
        r5 = r22;
        r1 = r1.zza(r2, r3, r4, r5);
        r2 = r71.zzab();
        r2 = r2.zzgs();
        if (r1 != 0) goto L_0x088f;
    L_0x088c:
        r3 = r30;
        goto L_0x0890;
    L_0x088f:
        r3 = r1;
    L_0x0890:
        r2.zza(r8, r3);
        if (r1 != 0) goto L_0x089e;
    L_0x0895:
        r1 = java.lang.Integer.valueOf(r13);
        r14.add(r1);
        goto L_0x099a;
    L_0x089e:
        r2 = r19.getId();
        r7.set(r2);
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x099a;
    L_0x08ab:
        r1 = r19.getId();
        r10.set(r1);
        if (r44 == 0) goto L_0x099a;
    L_0x08b4:
        r1 = r34.zzml();
        if (r1 == 0) goto L_0x099a;
    L_0x08ba:
        if (r38 == 0) goto L_0x08c9;
    L_0x08bc:
        r1 = r19.getId();
        r2 = r34.getTimestampMillis();
        zzb(r12, r1, r2);
        goto L_0x099a;
    L_0x08c9:
        r1 = r19.getId();
        r2 = r34.getTimestampMillis();
        zza(r9, r1, r2);
        goto L_0x099a;
    L_0x08d6:
        r69 = r5;
        r45 = r7;
        r46 = r9;
        r47 = r15;
        r9 = r19;
        r7 = r21;
        r67 = r24;
        r15 = r37;
        r68 = r43;
        r19 = r1;
        r24 = r8;
        r21 = r11;
        r11 = r72;
        r8 = r4;
        r1 = r19.getId();
        r1 = r10.get(r1);
        if (r1 == 0) goto L_0x091e;
    L_0x08fb:
        r1 = r71.zzab();
        r1 = r1.zzgs();
        r2 = java.lang.Integer.valueOf(r13);
        r3 = r19.zzkb();
        if (r3 == 0) goto L_0x0916;
    L_0x090d:
        r3 = r19.getId();
        r8 = java.lang.Integer.valueOf(r3);
        goto L_0x0917;
    L_0x0916:
        r8 = 0;
    L_0x0917:
        r3 = "Event filter already evaluated true. audience ID, filter ID";
        r1.zza(r3, r2, r8);
        goto L_0x099a;
    L_0x091e:
        r1 = r71;
        r2 = r19;
        r3 = r0;
        r4 = r42;
        r5 = r22;
        r1 = r1.zza(r2, r3, r4, r5);
        r2 = r71.zzab();
        r2 = r2.zzgs();
        if (r1 != 0) goto L_0x0938;
    L_0x0935:
        r3 = r30;
        goto L_0x0939;
    L_0x0938:
        r3 = r1;
    L_0x0939:
        r2.zza(r8, r3);
        if (r1 != 0) goto L_0x0946;
    L_0x093e:
        r1 = java.lang.Integer.valueOf(r13);
        r14.add(r1);
        goto L_0x099a;
    L_0x0946:
        r2 = r19.getId();
        r7.set(r2);
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x099a;
    L_0x0953:
        r1 = r19.getId();
        r10.set(r1);
        goto L_0x099a;
    L_0x095b:
        r69 = r5;
        r45 = r7;
        r46 = r9;
        r47 = r15;
        r9 = r19;
        r7 = r21;
        r67 = r24;
        r15 = r37;
        r68 = r43;
        r19 = r1;
        r24 = r8;
        r21 = r11;
        r11 = r72;
        r1 = r71.zzab();
        r1 = r1.zzgn();
        r2 = com.google.android.gms.measurement.internal.zzef.zzam(r72);
        r3 = r19.zzkb();
        if (r3 == 0) goto L_0x0990;
    L_0x0987:
        r3 = r19.getId();
        r8 = java.lang.Integer.valueOf(r3);
        goto L_0x0991;
    L_0x0990:
        r8 = 0;
    L_0x0991:
        r3 = java.lang.String.valueOf(r8);
        r4 = "Invalid event filter ID. appId, id";
        r1.zza(r4, r2, r3);
    L_0x099a:
        r2 = r7;
        r19 = r9;
        r3 = r11;
        r5 = r15;
        r11 = r21;
        r8 = r24;
        r7 = r45;
        r9 = r46;
        r15 = r47;
        r4 = r67;
        r6 = r68;
        r48 = r69;
        goto L_0x0766;
    L_0x09b1:
        r43 = r6;
        r44 = r8;
        r46 = r9;
        r49 = r14;
        r47 = r15;
        r12 = r16;
        r8 = r17;
        r10 = r41;
        goto L_0x0673;
    L_0x09c3:
        r7 = r71;
        r9 = r3;
        r8 = r5;
        r6 = r10;
        r2 = r35;
        r0 = r39;
        r1 = r40;
        r17 = r43;
        r21 = r44;
        r13 = r46;
        r23 = r47;
        r14 = r48;
        r15 = r49;
        r10 = r4;
        goto L_0x0374;
    L_0x09dd:
        r11 = r9;
        r67 = r10;
        r46 = r13;
        r69 = r14;
        r14 = r15;
        r68 = r17;
        r24 = r21;
        r47 = r23;
        r15 = r8;
        r0 = r74.isEmpty();
        if (r0 != 0) goto L_0x0d57;
    L_0x09f2:
        r0 = new androidx.collection.ArrayMap;
        r0.<init>();
        r1 = r74.iterator();
    L_0x09fb:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0d57;
    L_0x0a01:
        r2 = r1.next();
        r2 = (com.google.android.gms.internal.measurement.zzbs.zzk) r2;
        r3 = r2.getName();
        r3 = r0.get(r3);
        r3 = (java.util.Map) r3;
        if (r3 != 0) goto L_0x0a2d;
    L_0x0a13:
        r3 = r71.zzgy();
        r4 = r2.getName();
        r3 = r3.zzi(r11, r4);
        if (r3 != 0) goto L_0x0a26;
    L_0x0a21:
        r3 = new androidx.collection.ArrayMap;
        r3.<init>();
    L_0x0a26:
        r4 = r2.getName();
        r0.put(r4, r3);
    L_0x0a2d:
        r4 = r3.keySet();
        r4 = r4.iterator();
    L_0x0a35:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0d51;
    L_0x0a3b:
        r5 = r4.next();
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        r6 = java.lang.Integer.valueOf(r5);
        r6 = r14.contains(r6);
        if (r6 == 0) goto L_0x0a5f;
    L_0x0a4f:
        r6 = r71.zzab();
        r6 = r6.zzgs();
        r5 = java.lang.Integer.valueOf(r5);
        r6.zza(r15, r5);
        goto L_0x0a35;
    L_0x0a5f:
        r6 = java.lang.Integer.valueOf(r5);
        r7 = r47;
        r6 = r7.get(r6);
        r6 = (java.util.BitSet) r6;
        r8 = java.lang.Integer.valueOf(r5);
        r9 = r68;
        r8 = r9.get(r8);
        r8 = (java.util.BitSet) r8;
        if (r25 == 0) goto L_0x0a96;
    L_0x0a79:
        r10 = java.lang.Integer.valueOf(r5);
        r12 = r24;
        r10 = r12.get(r10);
        r10 = (java.util.Map) r10;
        r13 = java.lang.Integer.valueOf(r5);
        r73 = r1;
        r1 = r67;
        r13 = r1.get(r13);
        r13 = (java.util.Map) r13;
        r16 = r0;
        goto L_0x0aa0;
    L_0x0a96:
        r73 = r1;
        r12 = r24;
        r1 = r67;
        r16 = r0;
        r10 = 0;
        r13 = 0;
    L_0x0aa0:
        r0 = java.lang.Integer.valueOf(r5);
        r74 = r4;
        r4 = r46;
        r0 = r4.get(r0);
        r0 = (com.google.android.gms.internal.measurement.zzbs.zza) r0;
        if (r0 != 0) goto L_0x0afa;
    L_0x0ab0:
        r0 = java.lang.Integer.valueOf(r5);
        r6 = com.google.android.gms.internal.measurement.zzbs.zza.zzmc();
        r8 = 1;
        r6 = r6.zzk(r8);
        r6 = r6.zzug();
        r6 = (com.google.android.gms.internal.measurement.zzey) r6;
        r6 = (com.google.android.gms.internal.measurement.zzbs.zza) r6;
        r4.put(r0, r6);
        r6 = new java.util.BitSet;
        r6.<init>();
        r0 = java.lang.Integer.valueOf(r5);
        r7.put(r0, r6);
        r8 = new java.util.BitSet;
        r8.<init>();
        r0 = java.lang.Integer.valueOf(r5);
        r9.put(r0, r8);
        if (r25 == 0) goto L_0x0afa;
    L_0x0ae2:
        r10 = new androidx.collection.ArrayMap;
        r10.<init>();
        r0 = java.lang.Integer.valueOf(r5);
        r12.put(r0, r10);
        r13 = new androidx.collection.ArrayMap;
        r13.<init>();
        r0 = java.lang.Integer.valueOf(r5);
        r1.put(r0, r13);
    L_0x0afa:
        r0 = java.lang.Integer.valueOf(r5);
        r0 = r3.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.iterator();
    L_0x0b08:
        r17 = r0.hasNext();
        if (r17 == 0) goto L_0x0d37;
    L_0x0b0e:
        r17 = r0.next();
        r18 = r0;
        r0 = r17;
        r0 = (com.google.android.gms.internal.measurement.zzbk.zzd) r0;
        r17 = r3;
        r3 = r71.zzab();
        r37 = r15;
        r15 = 2;
        r3 = r3.isLoggable(r15);
        if (r3 == 0) goto L_0x0b72;
    L_0x0b27:
        r3 = r71.zzab();
        r3 = r3.zzgs();
        r15 = java.lang.Integer.valueOf(r5);
        r19 = r0.zzkb();
        if (r19 == 0) goto L_0x0b46;
    L_0x0b39:
        r19 = r0.getId();
        r19 = java.lang.Integer.valueOf(r19);
        r67 = r1;
        r11 = r19;
        goto L_0x0b49;
    L_0x0b46:
        r67 = r1;
        r11 = 0;
    L_0x0b49:
        r1 = r71.zzy();
        r44 = r12;
        r12 = r0.getPropertyName();
        r1 = r1.zzal(r12);
        r12 = "Evaluating filter. audience, filter, property";
        r3.zza(r12, r15, r11, r1);
        r1 = r71.zzab();
        r1 = r1.zzgs();
        r3 = r71.zzgw();
        r3 = r3.zza(r0);
        r11 = r69;
        r1.zza(r11, r3);
        goto L_0x0b78;
    L_0x0b72:
        r67 = r1;
        r44 = r12;
        r11 = r69;
    L_0x0b78:
        r1 = r0.zzkb();
        if (r1 == 0) goto L_0x0cf0;
    L_0x0b7e:
        r1 = r0.getId();
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r1 <= r3) goto L_0x0b88;
    L_0x0b86:
        goto L_0x0cf0;
    L_0x0b88:
        r1 = "Property filter result";
        if (r25 == 0) goto L_0x0c79;
    L_0x0b8c:
        r12 = r0.zzkf();
        r15 = r0.zzkg();
        if (r27 == 0) goto L_0x0b9f;
    L_0x0b96:
        r19 = r0.zzki();
        if (r19 == 0) goto L_0x0b9f;
    L_0x0b9c:
        r19 = 1;
        goto L_0x0ba1;
    L_0x0b9f:
        r19 = 0;
    L_0x0ba1:
        if (r12 != 0) goto L_0x0baa;
    L_0x0ba3:
        if (r15 != 0) goto L_0x0baa;
    L_0x0ba5:
        if (r19 == 0) goto L_0x0ba8;
    L_0x0ba7:
        goto L_0x0baa;
    L_0x0ba8:
        r12 = 0;
        goto L_0x0bab;
    L_0x0baa:
        r12 = 1;
    L_0x0bab:
        r3 = r0.getId();
        r3 = r6.get(r3);
        if (r3 == 0) goto L_0x0be8;
    L_0x0bb5:
        if (r12 != 0) goto L_0x0be8;
    L_0x0bb7:
        r1 = r71.zzab();
        r1 = r1.zzgs();
        r3 = java.lang.Integer.valueOf(r5);
        r12 = r0.zzkb();
        if (r12 == 0) goto L_0x0bd2;
    L_0x0bc9:
        r0 = r0.getId();
        r0 = java.lang.Integer.valueOf(r0);
        goto L_0x0bd3;
    L_0x0bd2:
        r0 = 0;
    L_0x0bd3:
        r12 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID";
        r1.zza(r12, r3, r0);
        r69 = r11;
        r3 = r17;
        r0 = r18;
        r15 = r37;
        r12 = r44;
        r1 = r67;
        r11 = r72;
        goto L_0x0b08;
    L_0x0be8:
        r3 = r71;
        r20 = r3.zza(r0, r2);
        r21 = r71.zzab();
        r48 = r11;
        r11 = r21.zzgs();
        if (r20 != 0) goto L_0x0bff;
    L_0x0bfa:
        r43 = r9;
        r9 = r30;
        goto L_0x0c03;
    L_0x0bff:
        r43 = r9;
        r9 = r20;
    L_0x0c03:
        r11.zza(r1, r9);
        if (r20 != 0) goto L_0x0c11;
    L_0x0c08:
        r0 = java.lang.Integer.valueOf(r5);
        r14.add(r0);
        goto L_0x0caa;
    L_0x0c11:
        r1 = r0.getId();
        r8.set(r1);
        if (r27 == 0) goto L_0x0c22;
    L_0x0c1a:
        if (r19 == 0) goto L_0x0c22;
    L_0x0c1c:
        r1 = r20.booleanValue();
        if (r1 == 0) goto L_0x0caa;
    L_0x0c22:
        if (r26 == 0) goto L_0x0c40;
    L_0x0c24:
        r1 = r0.getId();
        r1 = r6.get(r1);
        if (r1 == 0) goto L_0x0c34;
    L_0x0c2e:
        r1 = r0.zzkf();
        if (r1 == 0) goto L_0x0c4b;
    L_0x0c34:
        r1 = r0.getId();
        r9 = r20.booleanValue();
        r6.set(r1, r9);
        goto L_0x0c4b;
    L_0x0c40:
        r1 = r0.getId();
        r9 = r20.booleanValue();
        r6.set(r1, r9);
    L_0x0c4b:
        r1 = r20.booleanValue();
        if (r1 == 0) goto L_0x0caa;
    L_0x0c51:
        if (r12 == 0) goto L_0x0caa;
    L_0x0c53:
        r1 = r2.zzqs();
        if (r1 == 0) goto L_0x0caa;
    L_0x0c59:
        r11 = r2.zzqt();
        if (r27 == 0) goto L_0x0c67;
    L_0x0c5f:
        if (r19 == 0) goto L_0x0c67;
    L_0x0c61:
        if (r29 == 0) goto L_0x0c67;
    L_0x0c63:
        r11 = r29.longValue();
    L_0x0c67:
        if (r15 == 0) goto L_0x0c71;
    L_0x0c69:
        r0 = r0.getId();
        zzb(r13, r0, r11);
        goto L_0x0caa;
    L_0x0c71:
        r0 = r0.getId();
        zza(r10, r0, r11);
        goto L_0x0caa;
    L_0x0c79:
        r3 = r71;
        r43 = r9;
        r48 = r11;
        r9 = r0.getId();
        r9 = r6.get(r9);
        if (r9 == 0) goto L_0x0cbc;
    L_0x0c89:
        r1 = r71.zzab();
        r1 = r1.zzgs();
        r9 = java.lang.Integer.valueOf(r5);
        r11 = r0.zzkb();
        if (r11 == 0) goto L_0x0ca4;
    L_0x0c9b:
        r0 = r0.getId();
        r0 = java.lang.Integer.valueOf(r0);
        goto L_0x0ca5;
    L_0x0ca4:
        r0 = 0;
    L_0x0ca5:
        r11 = "Property filter already evaluated true. audience ID, filter ID";
        r1.zza(r11, r9, r0);
    L_0x0caa:
        r11 = r72;
        r3 = r17;
        r0 = r18;
        r15 = r37;
        r9 = r43;
        r12 = r44;
        r69 = r48;
        r1 = r67;
        goto L_0x0b08;
    L_0x0cbc:
        r9 = r3.zza(r0, r2);
        r11 = r71.zzab();
        r11 = r11.zzgs();
        if (r9 != 0) goto L_0x0ccd;
    L_0x0cca:
        r12 = r30;
        goto L_0x0cce;
    L_0x0ccd:
        r12 = r9;
    L_0x0cce:
        r11.zza(r1, r12);
        if (r9 != 0) goto L_0x0cdb;
    L_0x0cd3:
        r0 = java.lang.Integer.valueOf(r5);
        r14.add(r0);
        goto L_0x0caa;
    L_0x0cdb:
        r1 = r0.getId();
        r8.set(r1);
        r1 = r9.booleanValue();
        if (r1 == 0) goto L_0x0caa;
    L_0x0ce8:
        r0 = r0.getId();
        r6.set(r0);
        goto L_0x0caa;
    L_0x0cf0:
        r3 = r71;
        r43 = r9;
        r48 = r11;
        r1 = r71.zzab();
        r1 = r1.zzgn();
        r6 = com.google.android.gms.measurement.internal.zzef.zzam(r72);
        r8 = r0.zzkb();
        if (r8 == 0) goto L_0x0d11;
    L_0x0d08:
        r0 = r0.getId();
        r8 = java.lang.Integer.valueOf(r0);
        goto L_0x0d12;
    L_0x0d11:
        r8 = 0;
    L_0x0d12:
        r0 = java.lang.String.valueOf(r8);
        r8 = "Invalid property filter ID. appId, id";
        r1.zza(r8, r6, r0);
        r0 = java.lang.Integer.valueOf(r5);
        r14.add(r0);
        r11 = r72;
        r1 = r73;
        r46 = r4;
        r47 = r7;
        r0 = r16;
        r3 = r17;
        r15 = r37;
        r68 = r43;
        r24 = r44;
        r69 = r48;
        goto L_0x0d4d;
    L_0x0d37:
        r17 = r3;
        r3 = r71;
        r11 = r72;
        r67 = r1;
        r46 = r4;
        r47 = r7;
        r68 = r9;
        r24 = r12;
        r0 = r16;
        r3 = r17;
        r1 = r73;
    L_0x0d4d:
        r4 = r74;
        goto L_0x0a35;
    L_0x0d51:
        r3 = r71;
        r11 = r72;
        goto L_0x09fb;
    L_0x0d57:
        r3 = r71;
        r44 = r24;
        r4 = r46;
        r7 = r47;
        r43 = r68;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0 = r7.keySet();
        r2 = r0.iterator();
    L_0x0d6e:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x1016;
    L_0x0d74:
        r0 = r2.next();
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r5 = java.lang.Integer.valueOf(r0);
        r5 = r14.contains(r5);
        if (r5 != 0) goto L_0x100c;
    L_0x0d88:
        r5 = java.lang.Integer.valueOf(r0);
        r5 = r4.get(r5);
        r5 = (com.google.android.gms.internal.measurement.zzbs.zza) r5;
        if (r5 != 0) goto L_0x0d99;
    L_0x0d94:
        r5 = com.google.android.gms.internal.measurement.zzbs.zza.zzmc();
        goto L_0x0da1;
    L_0x0d99:
        r5 = r5.zzuj();
        r5 = (com.google.android.gms.internal.measurement.zzey.zza) r5;
        r5 = (com.google.android.gms.internal.measurement.zzbs.zza.zza) r5;
    L_0x0da1:
        r5.zzi(r0);
        r6 = com.google.android.gms.internal.measurement.zzbs.zzi.zzqh();
        r8 = java.lang.Integer.valueOf(r0);
        r8 = r7.get(r8);
        r8 = (java.util.BitSet) r8;
        r8 = com.google.android.gms.measurement.internal.zzjo.zza(r8);
        r6 = r6.zzo(r8);
        r8 = java.lang.Integer.valueOf(r0);
        r9 = r43;
        r8 = r9.get(r8);
        r8 = (java.util.BitSet) r8;
        r8 = com.google.android.gms.measurement.internal.zzjo.zza(r8);
        r6 = r6.zzn(r8);
        if (r25 == 0) goto L_0x0f70;
    L_0x0dd0:
        r8 = java.lang.Integer.valueOf(r0);
        r10 = r44;
        r8 = r10.get(r8);
        r8 = (java.util.Map) r8;
        r8 = zza(r8);
        r6.zzp(r8);
        r8 = java.lang.Integer.valueOf(r0);
        r11 = r67;
        r8 = r11.get(r8);
        r8 = (java.util.Map) r8;
        if (r8 != 0) goto L_0x0dfc;
    L_0x0df1:
        r8 = java.util.Collections.emptyList();
        r73 = r2;
        r47 = r7;
        r12 = r8;
        goto L_0x0e6e;
    L_0x0dfc:
        r12 = new java.util.ArrayList;
        r13 = r8.size();
        r12.<init>(r13);
        r13 = r8.keySet();
        r13 = r13.iterator();
    L_0x0e0d:
        r15 = r13.hasNext();
        if (r15 == 0) goto L_0x0e6a;
    L_0x0e13:
        r15 = r13.next();
        r15 = (java.lang.Integer) r15;
        r73 = r2;
        r2 = com.google.android.gms.internal.measurement.zzbs.zzj.zzqo();
        r3 = r15.intValue();
        r2 = r2.zzal(r3);
        r3 = r8.get(r15);
        r3 = (java.util.List) r3;
        if (r3 == 0) goto L_0x0e52;
    L_0x0e2f:
        java.util.Collections.sort(r3);
        r3 = r3.iterator();
    L_0x0e36:
        r15 = r3.hasNext();
        if (r15 == 0) goto L_0x0e52;
    L_0x0e3c:
        r15 = r3.next();
        r15 = (java.lang.Long) r15;
        r47 = r7;
        r74 = r8;
        r7 = r15.longValue();
        r2.zzbj(r7);
        r8 = r74;
        r7 = r47;
        goto L_0x0e36;
    L_0x0e52:
        r47 = r7;
        r74 = r8;
        r2 = r2.zzug();
        r2 = (com.google.android.gms.internal.measurement.zzey) r2;
        r2 = (com.google.android.gms.internal.measurement.zzbs.zzj) r2;
        r12.add(r2);
        r3 = r71;
        r2 = r73;
        r8 = r74;
        r7 = r47;
        goto L_0x0e0d;
    L_0x0e6a:
        r73 = r2;
        r47 = r7;
    L_0x0e6e:
        if (r26 == 0) goto L_0x0e84;
    L_0x0e70:
        r2 = r5.zzlw();
        if (r2 == 0) goto L_0x0e84;
    L_0x0e76:
        r2 = r5.zzlx();
        r2 = r2.zzqe();
        r3 = r2.isEmpty();
        if (r3 == 0) goto L_0x0e87;
    L_0x0e84:
        r15 = 0;
        goto L_0x0f6c;
    L_0x0e87:
        r3 = new java.util.ArrayList;
        r3.<init>(r12);
        r7 = new androidx.collection.ArrayMap;
        r7.<init>();
        r2 = r2.iterator();
    L_0x0e95:
        r8 = r2.hasNext();
        if (r8 == 0) goto L_0x0ec9;
    L_0x0e9b:
        r8 = r2.next();
        r8 = (com.google.android.gms.internal.measurement.zzbs.zzj) r8;
        r12 = r8.zzme();
        if (r12 == 0) goto L_0x0ec7;
    L_0x0ea7:
        r12 = r8.zzql();
        if (r12 <= 0) goto L_0x0ec7;
    L_0x0ead:
        r12 = r8.getIndex();
        r12 = java.lang.Integer.valueOf(r12);
        r13 = r8.zzql();
        r15 = 1;
        r13 = r13 - r15;
        r16 = r8.zzai(r13);
        r8 = java.lang.Long.valueOf(r16);
        r7.put(r12, r8);
        goto L_0x0e95;
    L_0x0ec7:
        r15 = 1;
        goto L_0x0e95;
    L_0x0ec9:
        r15 = 1;
        r2 = 0;
    L_0x0ecb:
        r8 = r3.size();
        if (r2 >= r8) goto L_0x0f2c;
    L_0x0ed1:
        r8 = r3.get(r2);
        r8 = (com.google.android.gms.internal.measurement.zzbs.zzj) r8;
        r12 = r8.zzme();
        if (r12 == 0) goto L_0x0ee6;
    L_0x0edd:
        r12 = r8.getIndex();
        r12 = java.lang.Integer.valueOf(r12);
        goto L_0x0ee7;
    L_0x0ee6:
        r12 = 0;
    L_0x0ee7:
        r12 = r7.remove(r12);
        r12 = (java.lang.Long) r12;
        if (r12 == 0) goto L_0x0f27;
    L_0x0eef:
        r13 = new java.util.ArrayList;
        r13.<init>();
        r16 = r12.longValue();
        r15 = 0;
        r18 = r8.zzai(r15);
        r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1));
        if (r20 >= 0) goto L_0x0f04;
    L_0x0f01:
        r13.add(r12);
    L_0x0f04:
        r12 = r8.zzqk();
        r13.addAll(r12);
        r8 = r8.zzuj();
        r8 = (com.google.android.gms.internal.measurement.zzey.zza) r8;
        r8 = (com.google.android.gms.internal.measurement.zzbs.zzj.zza) r8;
        r8 = r8.zzqw();
        r8 = r8.zzr(r13);
        r8 = r8.zzug();
        r8 = (com.google.android.gms.internal.measurement.zzey) r8;
        r8 = (com.google.android.gms.internal.measurement.zzbs.zzj) r8;
        r3.set(r2, r8);
        goto L_0x0f28;
    L_0x0f27:
        r15 = 0;
    L_0x0f28:
        r2 = r2 + 1;
        r15 = 1;
        goto L_0x0ecb;
    L_0x0f2c:
        r15 = 0;
        r2 = r7.keySet();
        r2 = r2.iterator();
    L_0x0f35:
        r8 = r2.hasNext();
        if (r8 == 0) goto L_0x0f6b;
    L_0x0f3b:
        r8 = r2.next();
        r8 = (java.lang.Integer) r8;
        r12 = com.google.android.gms.internal.measurement.zzbs.zzj.zzqo();
        r13 = r8.intValue();
        r12 = r12.zzal(r13);
        r8 = r7.get(r8);
        r8 = (java.lang.Long) r8;
        r74 = r7;
        r7 = r8.longValue();
        r7 = r12.zzbj(r7);
        r7 = r7.zzug();
        r7 = (com.google.android.gms.internal.measurement.zzey) r7;
        r7 = (com.google.android.gms.internal.measurement.zzbs.zzj) r7;
        r3.add(r7);
        r7 = r74;
        goto L_0x0f35;
    L_0x0f6b:
        r12 = r3;
    L_0x0f6c:
        r6.zzq(r12);
        goto L_0x0f79;
    L_0x0f70:
        r73 = r2;
        r47 = r7;
        r10 = r44;
        r11 = r67;
        r15 = 0;
    L_0x0f79:
        r5.zza(r6);
        r2 = java.lang.Integer.valueOf(r0);
        r3 = r5.zzug();
        r3 = (com.google.android.gms.internal.measurement.zzey) r3;
        r3 = (com.google.android.gms.internal.measurement.zzbs.zza) r3;
        r4.put(r2, r3);
        r2 = r5.zzug();
        r2 = (com.google.android.gms.internal.measurement.zzey) r2;
        r2 = (com.google.android.gms.internal.measurement.zzbs.zza) r2;
        r1.add(r2);
        r2 = r71.zzgy();
        r3 = r5.zzlv();
        r2.zzbi();
        r2.zzo();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r72);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
        r3 = r3.toByteArray();
        r5 = new android.content.ContentValues;
        r5.<init>();
        r6 = "app_id";
        r7 = r72;
        r5.put(r6, r7);
        r0 = java.lang.Integer.valueOf(r0);
        r6 = "audience_id";
        r5.put(r6, r0);
        r0 = "current_results";
        r5.put(r0, r3);
        r0 = r2.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0fee }
        r3 = "audience_filter_values";
        r6 = 5;
        r8 = 0;
        r5 = r0.insertWithOnConflict(r3, r8, r5, r6);	 Catch:{ SQLiteException -> 0x0fec }
        r12 = -1;
        r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1));
        if (r0 != 0) goto L_0x1001;
    L_0x0fda:
        r0 = r2.zzab();	 Catch:{ SQLiteException -> 0x0fec }
        r0 = r0.zzgk();	 Catch:{ SQLiteException -> 0x0fec }
        r3 = "Failed to insert filter results (got -1). appId";
        r5 = com.google.android.gms.measurement.internal.zzef.zzam(r72);	 Catch:{ SQLiteException -> 0x0fec }
        r0.zza(r3, r5);	 Catch:{ SQLiteException -> 0x0fec }
        goto L_0x1001;
    L_0x0fec:
        r0 = move-exception;
        goto L_0x0ff0;
    L_0x0fee:
        r0 = move-exception;
        r8 = 0;
    L_0x0ff0:
        r2 = r2.zzab();
        r2 = r2.zzgk();
        r3 = com.google.android.gms.measurement.internal.zzef.zzam(r72);
        r5 = "Error storing filter results. appId";
        r2.zza(r5, r3, r0);
    L_0x1001:
        r3 = r71;
        r2 = r73;
        r43 = r9;
        r44 = r10;
        r67 = r11;
        goto L_0x1012;
    L_0x100c:
        r47 = r7;
        r7 = r72;
        r3 = r71;
    L_0x1012:
        r7 = r47;
        goto L_0x0d6e;
    L_0x1016:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzp.zza(java.lang.String, java.util.List, java.util.List):java.util.List");
    }

    private final Boolean zza(zza zza, String str, List<zze> list, long j) {
        boolean zzkd = zza.zzkd();
        Boolean valueOf = Boolean.valueOf(false);
        if (zzkd) {
            Boolean zza2 = zza(j, zza.zzke());
            if (zza2 == null) {
                return null;
            }
            if (!zza2.booleanValue()) {
                return valueOf;
            }
        }
        HashSet hashSet = new HashSet();
        for (zzb zzb : zza.zzkc()) {
            if (zzb.zzkr().isEmpty()) {
                zzab().zzgn().zza("null or empty param name in filter. event", zzy().zzaj(str));
                return null;
            }
            hashSet.add(zzb.zzkr());
        }
        ArrayMap arrayMap = new ArrayMap();
        for (zze zze : list) {
            if (hashSet.contains(zze.getName())) {
                if (zze.zzna()) {
                    arrayMap.put(zze.getName(), zze.zzna() ? Long.valueOf(zze.zznb()) : null);
                } else if (zze.zznd()) {
                    arrayMap.put(zze.getName(), zze.zznd() ? Double.valueOf(zze.zzne()) : null);
                } else if (zze.zzmx()) {
                    arrayMap.put(zze.getName(), zze.zzmy());
                } else {
                    zzab().zzgn().zza("Unknown value for param. event, param", zzy().zzaj(str), zzy().zzak(zze.getName()));
                    return null;
                }
            }
        }
        Iterator it = zza.zzkc().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                return Boolean.valueOf(true);
            }
            zzb zzb2 = (zzb) it.next();
            if (!(zzb2.zzkp() && zzb2.zzkq())) {
                z = false;
            }
            String zzkr = zzb2.zzkr();
            if (zzkr.isEmpty()) {
                zzab().zzgn().zza("Event has empty param name. event", zzy().zzaj(str));
                return null;
            }
            Object obj = arrayMap.get(zzkr);
            Boolean zza3;
            if (obj instanceof Long) {
                if (zzb2.zzkn()) {
                    zza3 = zza(((Long) obj).longValue(), zzb2.zzko());
                    if (zza3 == null) {
                        return null;
                    }
                    if (zza3.booleanValue() == z) {
                        return valueOf;
                    }
                } else {
                    zzab().zzgn().zza("No number filter for long param. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                    return null;
                }
            } else if (obj instanceof Double) {
                if (zzb2.zzkn()) {
                    zza3 = zza(((Double) obj).doubleValue(), zzb2.zzko());
                    if (zza3 == null) {
                        return null;
                    }
                    if (zza3.booleanValue() == z) {
                        return valueOf;
                    }
                } else {
                    zzab().zzgn().zza("No number filter for double param. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                    return null;
                }
            } else if (obj instanceof String) {
                if (zzb2.zzkl()) {
                    zza3 = zza((String) obj, zzb2.zzkm());
                } else if (zzb2.zzkn()) {
                    String str2 = (String) obj;
                    if (zzjo.zzbj(str2)) {
                        zza3 = zza(str2, zzb2.zzko());
                    } else {
                        zzab().zzgn().zza("Invalid param value for number filter. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                        return null;
                    }
                } else {
                    zzab().zzgn().zza("No filter for String param. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                    return null;
                }
                if (zza3 == null) {
                    return null;
                }
                if (zza3.booleanValue() == z) {
                    return valueOf;
                }
            } else if (obj == null) {
                zzab().zzgs().zza("Missing param for filter. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                return valueOf;
            } else {
                zzab().zzgn().zza("Unknown param type. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                return null;
            }
        }
    }

    private final Boolean zza(zzd zzd, zzk zzk) {
        zzb zzli = zzd.zzli();
        boolean zzkq = zzli.zzkq();
        if (zzk.zzna()) {
            if (zzli.zzkn()) {
                return zza(zza(zzk.zznb(), zzli.zzko()), zzkq);
            }
            zzab().zzgn().zza("No number filter for long property. property", zzy().zzal(zzk.getName()));
            return null;
        } else if (zzk.zznd()) {
            if (zzli.zzkn()) {
                return zza(zza(zzk.zzne(), zzli.zzko()), zzkq);
            }
            zzab().zzgn().zza("No number filter for double property. property", zzy().zzal(zzk.getName()));
            return null;
        } else if (!zzk.zzmx()) {
            zzab().zzgn().zza("User property has no value, property", zzy().zzal(zzk.getName()));
            return null;
        } else if (zzli.zzkl()) {
            return zza(zza(zzk.zzmy(), zzli.zzkm()), zzkq);
        } else {
            if (!zzli.zzkn()) {
                zzab().zzgn().zza("No string or number filter defined. property", zzy().zzal(zzk.getName()));
            } else if (zzjo.zzbj(zzk.zzmy())) {
                return zza(zza(zzk.zzmy(), zzli.zzko()), zzkq);
            } else {
                zzab().zzgn().zza("Invalid user property value for Numeric number filter. property, value", zzy().zzal(zzk.getName()), zzk.zzmy());
            }
            return null;
        }
    }

    @VisibleForTesting
    private static Boolean zza(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    @VisibleForTesting
    private final Boolean zza(String str, zzbk.zze zze) {
        Preconditions.checkNotNull(zze);
        if (str == null || !zze.zzlk() || zze.zzll() == zzbk.zze.zza.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        String zzln;
        List list;
        if (zze.zzll() == zzbk.zze.zza.IN_LIST) {
            if (zze.zzlr() == 0) {
                return null;
            }
        } else if (!zze.zzlm()) {
            return null;
        }
        zzbk.zze.zza zzll = zze.zzll();
        boolean zzlp = zze.zzlp();
        if (zzlp || zzll == zzbk.zze.zza.REGEXP || zzll == zzbk.zze.zza.IN_LIST) {
            zzln = zze.zzln();
        } else {
            zzln = zze.zzln().toUpperCase(Locale.ENGLISH);
        }
        String str2 = zzln;
        if (zze.zzlr() == 0) {
            list = null;
        } else {
            List unmodifiableList;
            List<String> unmodifiableList2 = zze.zzlq();
            if (!zzlp) {
                ArrayList arrayList = new ArrayList(unmodifiableList2.size());
                for (String toUpperCase : unmodifiableList2) {
                    arrayList.add(toUpperCase.toUpperCase(Locale.ENGLISH));
                }
                unmodifiableList2 = Collections.unmodifiableList(arrayList);
            }
            list = unmodifiableList2;
        }
        return zza(str, zzll, zzlp, str2, list, zzll == zzbk.zze.zza.REGEXP ? str2 : null);
    }

    private final Boolean zza(String str, zzbk.zze.zza zza, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        Object str4;
        if (zza == zzbk.zze.zza.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!(z || zza == zzbk.zze.zza.REGEXP)) {
            str4 = str4.toUpperCase(Locale.ENGLISH);
        }
        switch (zza) {
            case REGEXP:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str4).matches());
                } catch (PatternSyntaxException unused) {
                    zzab().zzgn().zza("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case BEGINS_WITH:
                return Boolean.valueOf(str4.startsWith(str2));
            case ENDS_WITH:
                return Boolean.valueOf(str4.endsWith(str2));
            case PARTIAL:
                return Boolean.valueOf(str4.contains(str2));
            case EXACT:
                return Boolean.valueOf(str4.equals(str2));
            case IN_LIST:
                return Boolean.valueOf(list.contains(str4));
            default:
                return null;
        }
    }

    private final Boolean zza(long j, zzc zzc) {
        try {
            return zza(new BigDecimal(j), zzc, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(double d, zzc zzc) {
        try {
            return zza(new BigDecimal(d), zzc, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(String str, zzc zzc) {
        if (!zzjo.zzbj(str)) {
            return null;
        }
        try {
            return zza(new BigDecimal(str), zzc, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Missing block: B:35:0x0085, code skipped:
            if (r2 != null) goto L_0x0087;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    private static java.lang.Boolean zza(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.zzbk.zzc r10, double r11) {
        /*
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r10);
        r0 = r10.zzku();
        r1 = 0;
        if (r0 == 0) goto L_0x0110;
    L_0x000a:
        r0 = r10.zzkv();
        r2 = com.google.android.gms.internal.measurement.zzbk.zzc.zzb.UNKNOWN_COMPARISON_TYPE;
        if (r0 != r2) goto L_0x0014;
    L_0x0012:
        goto L_0x0110;
    L_0x0014:
        r0 = r10.zzkv();
        r2 = com.google.android.gms.internal.measurement.zzbk.zzc.zzb.BETWEEN;
        if (r0 != r2) goto L_0x0029;
    L_0x001c:
        r0 = r10.zzla();
        if (r0 == 0) goto L_0x0028;
    L_0x0022:
        r0 = r10.zzlc();
        if (r0 != 0) goto L_0x0030;
    L_0x0028:
        return r1;
    L_0x0029:
        r0 = r10.zzky();
        if (r0 != 0) goto L_0x0030;
    L_0x002f:
        return r1;
    L_0x0030:
        r0 = r10.zzkv();
        r2 = r10.zzkv();
        r3 = com.google.android.gms.internal.measurement.zzbk.zzc.zzb.BETWEEN;
        if (r2 != r3) goto L_0x0067;
    L_0x003c:
        r2 = r10.zzlb();
        r2 = com.google.android.gms.measurement.internal.zzjo.zzbj(r2);
        if (r2 == 0) goto L_0x0066;
    L_0x0046:
        r2 = r10.zzld();
        r2 = com.google.android.gms.measurement.internal.zzjo.zzbj(r2);
        if (r2 != 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0066;
    L_0x0051:
        r2 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0066 }
        r3 = r10.zzlb();	 Catch:{ NumberFormatException -> 0x0066 }
        r2.<init>(r3);	 Catch:{ NumberFormatException -> 0x0066 }
        r3 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0066 }
        r10 = r10.zzld();	 Catch:{ NumberFormatException -> 0x0066 }
        r3.<init>(r10);	 Catch:{ NumberFormatException -> 0x0066 }
        r10 = r2;
        r2 = r1;
        goto L_0x007d;
    L_0x0066:
        return r1;
    L_0x0067:
        r2 = r10.zzkz();
        r2 = com.google.android.gms.measurement.internal.zzjo.zzbj(r2);
        if (r2 != 0) goto L_0x0072;
    L_0x0071:
        return r1;
    L_0x0072:
        r2 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0110 }
        r10 = r10.zzkz();	 Catch:{ NumberFormatException -> 0x0110 }
        r2.<init>(r10);	 Catch:{ NumberFormatException -> 0x0110 }
        r10 = r1;
        r3 = r10;
    L_0x007d:
        r4 = com.google.android.gms.internal.measurement.zzbk.zzc.zzb.BETWEEN;
        if (r0 != r4) goto L_0x0085;
    L_0x0081:
        if (r10 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x0087;
    L_0x0084:
        return r1;
    L_0x0085:
        if (r2 == 0) goto L_0x0110;
    L_0x0087:
        r4 = com.google.android.gms.measurement.internal.zzo.zzdv;
        r0 = r0.ordinal();
        r0 = r4[r0];
        r4 = -1;
        r5 = 0;
        r6 = 1;
        if (r0 == r6) goto L_0x0104;
    L_0x0094:
        r7 = 2;
        if (r0 == r7) goto L_0x00f8;
    L_0x0097:
        r8 = 3;
        if (r0 == r8) goto L_0x00b0;
    L_0x009a:
        r11 = 4;
        if (r0 == r11) goto L_0x009e;
    L_0x009d:
        goto L_0x0110;
    L_0x009e:
        r10 = r9.compareTo(r10);
        if (r10 == r4) goto L_0x00ab;
    L_0x00a4:
        r9 = r9.compareTo(r3);
        if (r9 == r6) goto L_0x00ab;
    L_0x00aa:
        r5 = 1;
    L_0x00ab:
        r9 = java.lang.Boolean.valueOf(r5);
        return r9;
    L_0x00b0:
        r0 = 0;
        r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r10 == 0) goto L_0x00ec;
    L_0x00b6:
        r10 = new java.math.BigDecimal;
        r10.<init>(r11);
        r0 = new java.math.BigDecimal;
        r0.<init>(r7);
        r10 = r10.multiply(r0);
        r10 = r2.subtract(r10);
        r10 = r9.compareTo(r10);
        if (r10 != r6) goto L_0x00e7;
    L_0x00ce:
        r10 = new java.math.BigDecimal;
        r10.<init>(r11);
        r11 = new java.math.BigDecimal;
        r11.<init>(r7);
        r10 = r10.multiply(r11);
        r10 = r2.add(r10);
        r9 = r9.compareTo(r10);
        if (r9 != r4) goto L_0x00e7;
    L_0x00e6:
        r5 = 1;
    L_0x00e7:
        r9 = java.lang.Boolean.valueOf(r5);
        return r9;
    L_0x00ec:
        r9 = r9.compareTo(r2);
        if (r9 != 0) goto L_0x00f3;
    L_0x00f2:
        r5 = 1;
    L_0x00f3:
        r9 = java.lang.Boolean.valueOf(r5);
        return r9;
    L_0x00f8:
        r9 = r9.compareTo(r2);
        if (r9 != r6) goto L_0x00ff;
    L_0x00fe:
        r5 = 1;
    L_0x00ff:
        r9 = java.lang.Boolean.valueOf(r5);
        return r9;
    L_0x0104:
        r9 = r9.compareTo(r2);
        if (r9 != r4) goto L_0x010b;
    L_0x010a:
        r5 = 1;
    L_0x010b:
        r9 = java.lang.Boolean.valueOf(r5);
        return r9;
    L_0x0110:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzp.zza(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzbk$zzc, double):java.lang.Boolean");
    }

    private static List<zzbs.zzb> zza(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Integer intValue : map.keySet()) {
            int intValue2 = intValue.intValue();
            arrayList.add((zzbs.zzb) ((zzey) zzbs.zzb.zzmh().zzk(intValue2).zzae(((Long) map.get(Integer.valueOf(intValue2))).longValue()).zzug()));
        }
        return arrayList;
    }

    private static void zza(Map<Integer, Long> map, int i, long j) {
        Long l = (Long) map.get(Integer.valueOf(i));
        j /= 1000;
        if (l == null || j > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j));
        }
    }

    private static void zzb(Map<Integer, List<Long>> map, int i, long j) {
        List list = (List) map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }
}
