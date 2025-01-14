package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;

public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap();
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList();
    private final HashMap<BroadcastReceiver, ArrayList<ReceiverRecord>> mReceivers = new HashMap();

    private static final class BroadcastRecord {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;

        BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.intent = intent;
            this.receivers = arrayList;
        }
    }

    private static final class ReceiverRecord {
        boolean broadcasting;
        boolean dead;
        final IntentFilter filter;
        final BroadcastReceiver receiver;

        ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.filter = intentFilter;
            this.receiver = broadcastReceiver;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(128);
            stringBuilder.append("Receiver{");
            stringBuilder.append(this.receiver);
            stringBuilder.append(" filter=");
            stringBuilder.append(this.filter);
            if (this.dead) {
                stringBuilder.append(" DEAD");
            }
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    @NonNull
    public static LocalBroadcastManager getInstance(@NonNull Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = mInstance;
        }
        return localBroadcastManager;
    }

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) {
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    LocalBroadcastManager.this.executePendingBroadcasts();
                }
            }
        };
    }

    public void registerReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(receiverRecord);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.mActions.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.mActions.put(action, arrayList2);
                }
                arrayList2.add(receiverRecord);
            }
        }
    }

    public void unregisterReceiver(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList arrayList = (ArrayList) this.mReceivers.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ReceiverRecord receiverRecord = (ReceiverRecord) arrayList.get(size);
                receiverRecord.dead = true;
                for (int i = 0; i < receiverRecord.filter.countActions(); i++) {
                    String action = receiverRecord.filter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.mActions.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ReceiverRecord receiverRecord2 = (ReceiverRecord) arrayList2.get(size2);
                            if (receiverRecord2.receiver == broadcastReceiver) {
                                receiverRecord2.dead = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.mActions.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:59:0x0173, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:62:0x0176, code skipped:
            return false;
     */
    public boolean sendBroadcast(@androidx.annotation.NonNull android.content.Intent r22) {
        /*
        r21 = this;
        r1 = r21;
        r0 = r22;
        r2 = r1.mReceivers;
        monitor-enter(r2);
        r10 = r22.getAction();	 Catch:{ all -> 0x0177 }
        r3 = r1.mAppContext;	 Catch:{ all -> 0x0177 }
        r3 = r3.getContentResolver();	 Catch:{ all -> 0x0177 }
        r11 = r0.resolveTypeIfNeeded(r3);	 Catch:{ all -> 0x0177 }
        r12 = r22.getData();	 Catch:{ all -> 0x0177 }
        r13 = r22.getScheme();	 Catch:{ all -> 0x0177 }
        r14 = r22.getCategories();	 Catch:{ all -> 0x0177 }
        r3 = r22.getFlags();	 Catch:{ all -> 0x0177 }
        r3 = r3 & 8;
        if (r3 == 0) goto L_0x002c;
    L_0x0029:
        r16 = 1;
        goto L_0x002e;
    L_0x002c:
        r16 = 0;
    L_0x002e:
        if (r16 == 0) goto L_0x0056;
    L_0x0030:
        r3 = "LocalBroadcastManager";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0177 }
        r4.<init>();	 Catch:{ all -> 0x0177 }
        r5 = "Resolving type ";
        r4.append(r5);	 Catch:{ all -> 0x0177 }
        r4.append(r11);	 Catch:{ all -> 0x0177 }
        r5 = " scheme ";
        r4.append(r5);	 Catch:{ all -> 0x0177 }
        r4.append(r13);	 Catch:{ all -> 0x0177 }
        r5 = " of intent ";
        r4.append(r5);	 Catch:{ all -> 0x0177 }
        r4.append(r0);	 Catch:{ all -> 0x0177 }
        r4 = r4.toString();	 Catch:{ all -> 0x0177 }
        android.util.Log.v(r3, r4);	 Catch:{ all -> 0x0177 }
    L_0x0056:
        r3 = r1.mActions;	 Catch:{ all -> 0x0177 }
        r4 = r22.getAction();	 Catch:{ all -> 0x0177 }
        r3 = r3.get(r4);	 Catch:{ all -> 0x0177 }
        r8 = r3;
        r8 = (java.util.ArrayList) r8;	 Catch:{ all -> 0x0177 }
        if (r8 == 0) goto L_0x0174;
    L_0x0065:
        if (r16 == 0) goto L_0x007d;
    L_0x0067:
        r3 = "LocalBroadcastManager";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0177 }
        r4.<init>();	 Catch:{ all -> 0x0177 }
        r5 = "Action list: ";
        r4.append(r5);	 Catch:{ all -> 0x0177 }
        r4.append(r8);	 Catch:{ all -> 0x0177 }
        r4 = r4.toString();	 Catch:{ all -> 0x0177 }
        android.util.Log.v(r3, r4);	 Catch:{ all -> 0x0177 }
    L_0x007d:
        r3 = 0;
        r6 = r3;
        r7 = 0;
    L_0x0080:
        r3 = r8.size();	 Catch:{ all -> 0x0177 }
        if (r7 >= r3) goto L_0x0144;
    L_0x0086:
        r3 = r8.get(r7);	 Catch:{ all -> 0x0177 }
        r5 = r3;
        r5 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r5;	 Catch:{ all -> 0x0177 }
        if (r16 == 0) goto L_0x00a7;
    L_0x008f:
        r3 = "LocalBroadcastManager";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0177 }
        r4.<init>();	 Catch:{ all -> 0x0177 }
        r9 = "Matching against filter ";
        r4.append(r9);	 Catch:{ all -> 0x0177 }
        r9 = r5.filter;	 Catch:{ all -> 0x0177 }
        r4.append(r9);	 Catch:{ all -> 0x0177 }
        r4 = r4.toString();	 Catch:{ all -> 0x0177 }
        android.util.Log.v(r3, r4);	 Catch:{ all -> 0x0177 }
    L_0x00a7:
        r3 = r5.broadcasting;	 Catch:{ all -> 0x0177 }
        if (r3 == 0) goto L_0x00c0;
    L_0x00ab:
        if (r16 == 0) goto L_0x00b4;
    L_0x00ad:
        r3 = "LocalBroadcastManager";
        r4 = "  Filter's target already added";
        android.util.Log.v(r3, r4);	 Catch:{ all -> 0x0177 }
    L_0x00b4:
        r18 = r7;
        r19 = r8;
        r17 = r10;
        r20 = r11;
        r11 = 1;
        r10 = r6;
        goto L_0x0139;
    L_0x00c0:
        r3 = r5.filter;	 Catch:{ all -> 0x0177 }
        r9 = "LocalBroadcastManager";
        r4 = r10;
        r15 = r5;
        r5 = r11;
        r17 = r10;
        r10 = r6;
        r6 = r13;
        r18 = r7;
        r7 = r12;
        r19 = r8;
        r8 = r14;
        r20 = r11;
        r11 = 1;
        r3 = r3.match(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0177 }
        if (r3 < 0) goto L_0x0105;
    L_0x00da:
        if (r16 == 0) goto L_0x00f6;
    L_0x00dc:
        r4 = "LocalBroadcastManager";
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0177 }
        r5.<init>();	 Catch:{ all -> 0x0177 }
        r6 = "  Filter matched!  match=0x";
        r5.append(r6);	 Catch:{ all -> 0x0177 }
        r3 = java.lang.Integer.toHexString(r3);	 Catch:{ all -> 0x0177 }
        r5.append(r3);	 Catch:{ all -> 0x0177 }
        r3 = r5.toString();	 Catch:{ all -> 0x0177 }
        android.util.Log.v(r4, r3);	 Catch:{ all -> 0x0177 }
    L_0x00f6:
        if (r10 != 0) goto L_0x00fe;
    L_0x00f8:
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x0177 }
        r6.<init>();	 Catch:{ all -> 0x0177 }
        goto L_0x00ff;
    L_0x00fe:
        r6 = r10;
    L_0x00ff:
        r6.add(r15);	 Catch:{ all -> 0x0177 }
        r15.broadcasting = r11;	 Catch:{ all -> 0x0177 }
        goto L_0x013a;
    L_0x0105:
        if (r16 == 0) goto L_0x0139;
    L_0x0107:
        r4 = -4;
        if (r3 == r4) goto L_0x0121;
    L_0x010a:
        r4 = -3;
        if (r3 == r4) goto L_0x011e;
    L_0x010d:
        r4 = -2;
        if (r3 == r4) goto L_0x011b;
    L_0x0110:
        r4 = -1;
        if (r3 == r4) goto L_0x0117;
    L_0x0113:
        r3 = "unknown reason";
        goto L_0x0123;
    L_0x0117:
        r3 = "type";
        goto L_0x0123;
    L_0x011b:
        r3 = "data";
        goto L_0x0123;
    L_0x011e:
        r3 = "action";
        goto L_0x0123;
    L_0x0121:
        r3 = "category";
    L_0x0123:
        r4 = "LocalBroadcastManager";
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0177 }
        r5.<init>();	 Catch:{ all -> 0x0177 }
        r6 = "  Filter did not match: ";
        r5.append(r6);	 Catch:{ all -> 0x0177 }
        r5.append(r3);	 Catch:{ all -> 0x0177 }
        r3 = r5.toString();	 Catch:{ all -> 0x0177 }
        android.util.Log.v(r4, r3);	 Catch:{ all -> 0x0177 }
    L_0x0139:
        r6 = r10;
    L_0x013a:
        r7 = r18 + 1;
        r10 = r17;
        r8 = r19;
        r11 = r20;
        goto L_0x0080;
    L_0x0144:
        r10 = r6;
        r11 = 1;
        if (r10 == 0) goto L_0x0174;
    L_0x0148:
        r3 = 0;
    L_0x0149:
        r4 = r10.size();	 Catch:{ all -> 0x0177 }
        if (r3 >= r4) goto L_0x015b;
    L_0x014f:
        r4 = r10.get(r3);	 Catch:{ all -> 0x0177 }
        r4 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r4;	 Catch:{ all -> 0x0177 }
        r5 = 0;
        r4.broadcasting = r5;	 Catch:{ all -> 0x0177 }
        r3 = r3 + 1;
        goto L_0x0149;
    L_0x015b:
        r3 = r1.mPendingBroadcasts;	 Catch:{ all -> 0x0177 }
        r4 = new androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord;	 Catch:{ all -> 0x0177 }
        r4.<init>(r0, r10);	 Catch:{ all -> 0x0177 }
        r3.add(r4);	 Catch:{ all -> 0x0177 }
        r0 = r1.mHandler;	 Catch:{ all -> 0x0177 }
        r0 = r0.hasMessages(r11);	 Catch:{ all -> 0x0177 }
        if (r0 != 0) goto L_0x0172;
    L_0x016d:
        r0 = r1.mHandler;	 Catch:{ all -> 0x0177 }
        r0.sendEmptyMessage(r11);	 Catch:{ all -> 0x0177 }
    L_0x0172:
        monitor-exit(r2);	 Catch:{ all -> 0x0177 }
        return r11;
    L_0x0174:
        monitor-exit(r2);	 Catch:{ all -> 0x0177 }
        r0 = 0;
        return r0;
    L_0x0177:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0177 }
        goto L_0x017b;
    L_0x017a:
        throw r0;
    L_0x017b:
        goto L_0x017a;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.localbroadcastmanager.content.LocalBroadcastManager.sendBroadcast(android.content.Intent):boolean");
    }

    public void sendBroadcastSync(@NonNull Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:9:0x001a, code skipped:
            r2 = 0;
     */
    /* JADX WARNING: Missing block: B:11:0x001d, code skipped:
            if (r2 >= r1.length) goto L_0x0000;
     */
    /* JADX WARNING: Missing block: B:12:0x001f, code skipped:
            r3 = r1[r2];
            r4 = r3.receivers.size();
            r5 = 0;
     */
    /* JADX WARNING: Missing block: B:13:0x0028, code skipped:
            if (r5 >= r4) goto L_0x0042;
     */
    /* JADX WARNING: Missing block: B:14:0x002a, code skipped:
            r6 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r3.receivers.get(r5);
     */
    /* JADX WARNING: Missing block: B:15:0x0034, code skipped:
            if (r6.dead != false) goto L_0x003f;
     */
    /* JADX WARNING: Missing block: B:16:0x0036, code skipped:
            r6.receiver.onReceive(r9.mAppContext, r3.intent);
     */
    /* JADX WARNING: Missing block: B:17:0x003f, code skipped:
            r5 = r5 + 1;
     */
    /* JADX WARNING: Missing block: B:18:0x0042, code skipped:
            r2 = r2 + 1;
     */
    public void executePendingBroadcasts() {
        /*
        r9 = this;
    L_0x0000:
        r0 = r9.mReceivers;
        monitor-enter(r0);
        r1 = r9.mPendingBroadcasts;	 Catch:{ all -> 0x0045 }
        r1 = r1.size();	 Catch:{ all -> 0x0045 }
        if (r1 > 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        return;
    L_0x000d:
        r1 = new androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord[r1];	 Catch:{ all -> 0x0045 }
        r2 = r9.mPendingBroadcasts;	 Catch:{ all -> 0x0045 }
        r2.toArray(r1);	 Catch:{ all -> 0x0045 }
        r2 = r9.mPendingBroadcasts;	 Catch:{ all -> 0x0045 }
        r2.clear();	 Catch:{ all -> 0x0045 }
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        r0 = 0;
        r2 = 0;
    L_0x001c:
        r3 = r1.length;
        if (r2 >= r3) goto L_0x0000;
    L_0x001f:
        r3 = r1[r2];
        r4 = r3.receivers;
        r4 = r4.size();
        r5 = 0;
    L_0x0028:
        if (r5 >= r4) goto L_0x0042;
    L_0x002a:
        r6 = r3.receivers;
        r6 = r6.get(r5);
        r6 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r6;
        r7 = r6.dead;
        if (r7 != 0) goto L_0x003f;
    L_0x0036:
        r6 = r6.receiver;
        r7 = r9.mAppContext;
        r8 = r3.intent;
        r6.onReceive(r7, r8);
    L_0x003f:
        r5 = r5 + 1;
        goto L_0x0028;
    L_0x0042:
        r2 = r2 + 1;
        goto L_0x001c;
    L_0x0045:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        goto L_0x0049;
    L_0x0048:
        throw r1;
    L_0x0049:
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.localbroadcastmanager.content.LocalBroadcastManager.executePendingBroadcasts():void");
    }
}
