package com.jumio.commons.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class JumioBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static JumioBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap();
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList();
    private final HashMap<String, Intent> mPendingIntents = new HashMap();
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> mReceivers = new HashMap();

    private static class BroadcastRecord {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;

        BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.intent = intent;
            this.receivers = arrayList;
        }
    }

    private static class ReceiverRecord {
        boolean broadcasting;
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
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public static JumioBroadcastManager getInstance(Context context) {
        JumioBroadcastManager jumioBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new JumioBroadcastManager(context.getApplicationContext());
            }
            jumioBroadcastManager = mInstance;
        }
        return jumioBroadcastManager;
    }

    public static synchronized void destroy() {
        synchronized (JumioBroadcastManager.class) {
            if (mInstance == null) {
                return;
            }
            if (mInstance.mActions != null) {
                mInstance.mActions.clear();
            }
            if (mInstance.mPendingIntents != null) {
                mInstance.mPendingIntents.clear();
            }
            mInstance = null;
        }
    }

    private JumioBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) {
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    JumioBroadcastManager.this.executePendingBroadcasts();
                }
            }
        };
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                if (this.mPendingIntents.containsKey(action)) {
                    arrayList2.add(action);
                }
                ArrayList arrayList3 = (ArrayList) this.mActions.get(action);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList(1);
                    this.mActions.put(action, arrayList3);
                }
                arrayList3.add(receiverRecord);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                sendBroadcast((Intent) this.mPendingIntents.get(str));
                this.mPendingIntents.remove(str);
            }
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList arrayList = (ArrayList) this.mReceivers.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList2 = (ArrayList) this.mActions.get(action);
                    if (arrayList2 != null) {
                        int i3 = 0;
                        while (i3 < arrayList2.size()) {
                            if (((ReceiverRecord) arrayList2.get(i3)).receiver == broadcastReceiver) {
                                arrayList2.remove(i3);
                                i3--;
                            }
                            i3++;
                        }
                        if (arrayList2.size() <= 0) {
                            this.mActions.remove(action);
                        }
                    }
                }
            }
        }
    }

    public boolean sendBroadcast(Intent intent) {
        return sendBroadcast(intent, false);
    }

    /* JADX WARNING: Missing block: B:59:0x0171, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:64:0x017b, code skipped:
            return false;
     */
    public boolean sendBroadcast(android.content.Intent r22, boolean r23) {
        /*
        r21 = this;
        r1 = r21;
        r0 = r22;
        r2 = r1.mReceivers;
        monitor-enter(r2);
        r10 = r22.getAction();	 Catch:{ all -> 0x017c }
        r3 = r1.mAppContext;	 Catch:{ all -> 0x017c }
        r3 = r3.getContentResolver();	 Catch:{ all -> 0x017c }
        r11 = r0.resolveTypeIfNeeded(r3);	 Catch:{ all -> 0x017c }
        r12 = r22.getData();	 Catch:{ all -> 0x017c }
        r13 = r22.getScheme();	 Catch:{ all -> 0x017c }
        r14 = r22.getCategories();	 Catch:{ all -> 0x017c }
        r3 = r22.getFlags();	 Catch:{ all -> 0x017c }
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
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x017c }
        r4.<init>();	 Catch:{ all -> 0x017c }
        r5 = "Resolving type ";
        r4.append(r5);	 Catch:{ all -> 0x017c }
        r4.append(r11);	 Catch:{ all -> 0x017c }
        r5 = " scheme ";
        r4.append(r5);	 Catch:{ all -> 0x017c }
        r4.append(r13);	 Catch:{ all -> 0x017c }
        r5 = " of intent ";
        r4.append(r5);	 Catch:{ all -> 0x017c }
        r4.append(r0);	 Catch:{ all -> 0x017c }
        r4 = r4.toString();	 Catch:{ all -> 0x017c }
        com.jumio.commons.log.Log.v(r3, r4);	 Catch:{ all -> 0x017c }
    L_0x0056:
        r3 = r1.mActions;	 Catch:{ all -> 0x017c }
        r4 = r22.getAction();	 Catch:{ all -> 0x017c }
        r3 = r3.get(r4);	 Catch:{ all -> 0x017c }
        r8 = r3;
        r8 = (java.util.ArrayList) r8;	 Catch:{ all -> 0x017c }
        if (r8 == 0) goto L_0x0172;
    L_0x0065:
        if (r16 == 0) goto L_0x007d;
    L_0x0067:
        r3 = "LocalBroadcastManager";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x017c }
        r4.<init>();	 Catch:{ all -> 0x017c }
        r5 = "Action list: ";
        r4.append(r5);	 Catch:{ all -> 0x017c }
        r4.append(r8);	 Catch:{ all -> 0x017c }
        r4 = r4.toString();	 Catch:{ all -> 0x017c }
        com.jumio.commons.log.Log.v(r3, r4);	 Catch:{ all -> 0x017c }
    L_0x007d:
        r3 = 0;
        r6 = r3;
        r7 = 0;
    L_0x0080:
        r3 = r8.size();	 Catch:{ all -> 0x017c }
        if (r7 >= r3) goto L_0x0142;
    L_0x0086:
        r3 = r8.get(r7);	 Catch:{ all -> 0x017c }
        r5 = r3;
        r5 = (com.jumio.commons.utils.JumioBroadcastManager.ReceiverRecord) r5;	 Catch:{ all -> 0x017c }
        if (r16 == 0) goto L_0x00a7;
    L_0x008f:
        r3 = "LocalBroadcastManager";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x017c }
        r4.<init>();	 Catch:{ all -> 0x017c }
        r9 = "Matching against filter ";
        r4.append(r9);	 Catch:{ all -> 0x017c }
        r9 = r5.filter;	 Catch:{ all -> 0x017c }
        r4.append(r9);	 Catch:{ all -> 0x017c }
        r4 = r4.toString();	 Catch:{ all -> 0x017c }
        com.jumio.commons.log.Log.v(r3, r4);	 Catch:{ all -> 0x017c }
    L_0x00a7:
        r3 = r5.broadcasting;	 Catch:{ all -> 0x017c }
        if (r3 == 0) goto L_0x00c0;
    L_0x00ab:
        if (r16 == 0) goto L_0x00b4;
    L_0x00ad:
        r3 = "LocalBroadcastManager";
        r4 = "  Filter's target already added";
        com.jumio.commons.log.Log.v(r3, r4);	 Catch:{ all -> 0x017c }
    L_0x00b4:
        r18 = r7;
        r19 = r8;
        r17 = r11;
        r20 = r12;
        r12 = 1;
        r11 = r6;
        goto L_0x0137;
    L_0x00c0:
        r3 = r5.filter;	 Catch:{ all -> 0x017c }
        r9 = "LocalBroadcastManager";
        r4 = r10;
        r15 = r5;
        r5 = r11;
        r17 = r11;
        r11 = r6;
        r6 = r13;
        r18 = r7;
        r7 = r12;
        r19 = r8;
        r8 = r14;
        r20 = r12;
        r12 = 1;
        r3 = r3.match(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x017c }
        if (r3 < 0) goto L_0x0105;
    L_0x00da:
        if (r16 == 0) goto L_0x00f6;
    L_0x00dc:
        r4 = "LocalBroadcastManager";
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x017c }
        r5.<init>();	 Catch:{ all -> 0x017c }
        r6 = "  Filter matched!  match=0x";
        r5.append(r6);	 Catch:{ all -> 0x017c }
        r3 = java.lang.Integer.toHexString(r3);	 Catch:{ all -> 0x017c }
        r5.append(r3);	 Catch:{ all -> 0x017c }
        r3 = r5.toString();	 Catch:{ all -> 0x017c }
        com.jumio.commons.log.Log.v(r4, r3);	 Catch:{ all -> 0x017c }
    L_0x00f6:
        if (r11 != 0) goto L_0x00fe;
    L_0x00f8:
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x017c }
        r6.<init>();	 Catch:{ all -> 0x017c }
        goto L_0x00ff;
    L_0x00fe:
        r6 = r11;
    L_0x00ff:
        r6.add(r15);	 Catch:{ all -> 0x017c }
        r15.broadcasting = r12;	 Catch:{ all -> 0x017c }
        goto L_0x0138;
    L_0x0105:
        if (r16 == 0) goto L_0x0137;
    L_0x0107:
        r4 = -4;
        if (r3 == r4) goto L_0x011f;
    L_0x010a:
        r4 = -3;
        if (r3 == r4) goto L_0x011c;
    L_0x010d:
        r4 = -2;
        if (r3 == r4) goto L_0x0119;
    L_0x0110:
        r4 = -1;
        if (r3 == r4) goto L_0x0116;
    L_0x0113:
        r3 = "unknown reason";
        goto L_0x0121;
    L_0x0116:
        r3 = "type";
        goto L_0x0121;
    L_0x0119:
        r3 = "data";
        goto L_0x0121;
    L_0x011c:
        r3 = "action";
        goto L_0x0121;
    L_0x011f:
        r3 = "category";
    L_0x0121:
        r4 = "LocalBroadcastManager";
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x017c }
        r5.<init>();	 Catch:{ all -> 0x017c }
        r6 = "  Filter did not match: ";
        r5.append(r6);	 Catch:{ all -> 0x017c }
        r5.append(r3);	 Catch:{ all -> 0x017c }
        r3 = r5.toString();	 Catch:{ all -> 0x017c }
        com.jumio.commons.log.Log.v(r4, r3);	 Catch:{ all -> 0x017c }
    L_0x0137:
        r6 = r11;
    L_0x0138:
        r7 = r18 + 1;
        r11 = r17;
        r8 = r19;
        r12 = r20;
        goto L_0x0080;
    L_0x0142:
        r11 = r6;
        r12 = 1;
        if (r11 == 0) goto L_0x0179;
    L_0x0146:
        r3 = 0;
    L_0x0147:
        r4 = r11.size();	 Catch:{ all -> 0x017c }
        if (r3 >= r4) goto L_0x0159;
    L_0x014d:
        r4 = r11.get(r3);	 Catch:{ all -> 0x017c }
        r4 = (com.jumio.commons.utils.JumioBroadcastManager.ReceiverRecord) r4;	 Catch:{ all -> 0x017c }
        r5 = 0;
        r4.broadcasting = r5;	 Catch:{ all -> 0x017c }
        r3 = r3 + 1;
        goto L_0x0147;
    L_0x0159:
        r3 = r1.mPendingBroadcasts;	 Catch:{ all -> 0x017c }
        r4 = new com.jumio.commons.utils.JumioBroadcastManager$BroadcastRecord;	 Catch:{ all -> 0x017c }
        r4.<init>(r0, r11);	 Catch:{ all -> 0x017c }
        r3.add(r4);	 Catch:{ all -> 0x017c }
        r0 = r1.mHandler;	 Catch:{ all -> 0x017c }
        r0 = r0.hasMessages(r12);	 Catch:{ all -> 0x017c }
        if (r0 != 0) goto L_0x0170;
    L_0x016b:
        r0 = r1.mHandler;	 Catch:{ all -> 0x017c }
        r0.sendEmptyMessage(r12);	 Catch:{ all -> 0x017c }
    L_0x0170:
        monitor-exit(r2);	 Catch:{ all -> 0x017c }
        return r12;
    L_0x0172:
        if (r23 == 0) goto L_0x0179;
    L_0x0174:
        r3 = r1.mPendingIntents;	 Catch:{ all -> 0x017c }
        r3.put(r10, r0);	 Catch:{ all -> 0x017c }
    L_0x0179:
        monitor-exit(r2);	 Catch:{ all -> 0x017c }
        r0 = 0;
        return r0;
    L_0x017c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x017c }
        goto L_0x0180;
    L_0x017f:
        throw r0;
    L_0x0180:
        goto L_0x017f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.commons.utils.JumioBroadcastManager.sendBroadcast(android.content.Intent, boolean):boolean");
    }

    public void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    /* JADX WARNING: Missing block: B:9:0x001a, code skipped:
            r2 = 0;
     */
    /* JADX WARNING: Missing block: B:11:0x001d, code skipped:
            if (r2 >= r1.length) goto L_0x0000;
     */
    /* JADX WARNING: Missing block: B:12:0x001f, code skipped:
            r3 = r1[r2];
            r4 = 0;
     */
    /* JADX WARNING: Missing block: B:14:0x0028, code skipped:
            if (r4 >= r3.receivers.size()) goto L_0x003e;
     */
    /* JADX WARNING: Missing block: B:15:0x002a, code skipped:
            ((com.jumio.commons.utils.JumioBroadcastManager.ReceiverRecord) r3.receivers.get(r4)).receiver.onReceive(r8.mAppContext, r3.intent);
            r4 = r4 + 1;
     */
    /* JADX WARNING: Missing block: B:16:0x003e, code skipped:
            r2 = r2 + 1;
     */
    private void executePendingBroadcasts() {
        /*
        r8 = this;
    L_0x0000:
        r0 = r8.mReceivers;
        monitor-enter(r0);
        r1 = r8.mPendingBroadcasts;	 Catch:{ all -> 0x0041 }
        r1 = r1.size();	 Catch:{ all -> 0x0041 }
        if (r1 > 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        return;
    L_0x000d:
        r1 = new com.jumio.commons.utils.JumioBroadcastManager.BroadcastRecord[r1];	 Catch:{ all -> 0x0041 }
        r2 = r8.mPendingBroadcasts;	 Catch:{ all -> 0x0041 }
        r2.toArray(r1);	 Catch:{ all -> 0x0041 }
        r2 = r8.mPendingBroadcasts;	 Catch:{ all -> 0x0041 }
        r2.clear();	 Catch:{ all -> 0x0041 }
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        r0 = 0;
        r2 = 0;
    L_0x001c:
        r3 = r1.length;
        if (r2 >= r3) goto L_0x0000;
    L_0x001f:
        r3 = r1[r2];
        r4 = 0;
    L_0x0022:
        r5 = r3.receivers;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x003e;
    L_0x002a:
        r5 = r3.receivers;
        r5 = r5.get(r4);
        r5 = (com.jumio.commons.utils.JumioBroadcastManager.ReceiverRecord) r5;
        r5 = r5.receiver;
        r6 = r8.mAppContext;
        r7 = r3.intent;
        r5.onReceive(r6, r7);
        r4 = r4 + 1;
        goto L_0x0022;
    L_0x003e:
        r2 = r2 + 1;
        goto L_0x001c;
    L_0x0041:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        goto L_0x0045;
    L_0x0044:
        throw r1;
    L_0x0045:
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.commons.utils.JumioBroadcastManager.executePendingBroadcasts():void");
    }
}
