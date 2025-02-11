package androidx.work.impl.model;

import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkInfo.State;

public class WorkTypeConverters {

    /* renamed from: androidx.work.impl.model.WorkTypeConverters$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$work$BackoffPolicy = new int[BackoffPolicy.values().length];
        static final /* synthetic */ int[] $SwitchMap$androidx$work$NetworkType = new int[NetworkType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0098 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        static {
            /*
            r0 = androidx.work.NetworkType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$androidx$work$NetworkType = r0;
            r0 = 1;
            r1 = $SwitchMap$androidx$work$NetworkType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = androidx.work.NetworkType.NOT_REQUIRED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = $SwitchMap$androidx$work$NetworkType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = androidx.work.NetworkType.CONNECTED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = $SwitchMap$androidx$work$NetworkType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = androidx.work.NetworkType.UNMETERED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = $SwitchMap$androidx$work$NetworkType;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = androidx.work.NetworkType.NOT_ROAMING;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = $SwitchMap$androidx$work$NetworkType;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = androidx.work.NetworkType.METERED;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = androidx.work.BackoffPolicy.values();
            r5 = r5.length;
            r5 = new int[r5];
            $SwitchMap$androidx$work$BackoffPolicy = r5;
            r5 = $SwitchMap$androidx$work$BackoffPolicy;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r6 = androidx.work.BackoffPolicy.EXPONENTIAL;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0053 }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            r5 = $SwitchMap$androidx$work$BackoffPolicy;	 Catch:{ NoSuchFieldError -> 0x005d }
            r6 = androidx.work.BackoffPolicy.LINEAR;	 Catch:{ NoSuchFieldError -> 0x005d }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x005d }
            r5[r6] = r1;	 Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            r5 = androidx.work.WorkInfo.State.values();
            r5 = r5.length;
            r5 = new int[r5];
            $SwitchMap$androidx$work$WorkInfo$State = r5;
            r5 = $SwitchMap$androidx$work$WorkInfo$State;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r6 = androidx.work.WorkInfo.State.ENQUEUED;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0070 }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x0070 }
        L_0x0070:
            r0 = $SwitchMap$androidx$work$WorkInfo$State;	 Catch:{ NoSuchFieldError -> 0x007a }
            r5 = androidx.work.WorkInfo.State.RUNNING;	 Catch:{ NoSuchFieldError -> 0x007a }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r0[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r0 = $SwitchMap$androidx$work$WorkInfo$State;	 Catch:{ NoSuchFieldError -> 0x0084 }
            r1 = androidx.work.WorkInfo.State.SUCCEEDED;	 Catch:{ NoSuchFieldError -> 0x0084 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0084 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0084 }
        L_0x0084:
            r0 = $SwitchMap$androidx$work$WorkInfo$State;	 Catch:{ NoSuchFieldError -> 0x008e }
            r1 = androidx.work.WorkInfo.State.FAILED;	 Catch:{ NoSuchFieldError -> 0x008e }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x008e }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x008e }
        L_0x008e:
            r0 = $SwitchMap$androidx$work$WorkInfo$State;	 Catch:{ NoSuchFieldError -> 0x0098 }
            r1 = androidx.work.WorkInfo.State.BLOCKED;	 Catch:{ NoSuchFieldError -> 0x0098 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0098 }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x0098 }
        L_0x0098:
            r0 = $SwitchMap$androidx$work$WorkInfo$State;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r1 = androidx.work.WorkInfo.State.CANCELLED;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00a3 }
        L_0x00a3:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkTypeConverters$AnonymousClass1.<clinit>():void");
        }
    }

    public interface BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final int LINEAR = 1;
    }

    public interface NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int UNMETERED = 2;
    }

    public interface StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;
    }

    @TypeConverter
    public static int stateToInt(State state) {
        switch (state) {
            case ENQUEUED:
                return 0;
            case RUNNING:
                return 1;
            case SUCCEEDED:
                return 2;
            case FAILED:
                return 3;
            case BLOCKED:
                return 4;
            case CANCELLED:
                return 5;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not convert ");
                stringBuilder.append(state);
                stringBuilder.append(" to int");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    @TypeConverter
    public static State intToState(int i) {
        if (i == 0) {
            return State.ENQUEUED;
        }
        if (i == 1) {
            return State.RUNNING;
        }
        if (i == 2) {
            return State.SUCCEEDED;
        }
        if (i == 3) {
            return State.FAILED;
        }
        if (i == 4) {
            return State.BLOCKED;
        }
        if (i == 5) {
            return State.CANCELLED;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not convert ");
        stringBuilder.append(i);
        stringBuilder.append(" to State");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @TypeConverter
    public static int backoffPolicyToInt(BackoffPolicy backoffPolicy) {
        int i = AnonymousClass1.$SwitchMap$androidx$work$BackoffPolicy[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not convert ");
        stringBuilder.append(backoffPolicy);
        stringBuilder.append(" to int");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @TypeConverter
    public static BackoffPolicy intToBackoffPolicy(int i) {
        if (i == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i == 1) {
            return BackoffPolicy.LINEAR;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not convert ");
        stringBuilder.append(i);
        stringBuilder.append(" to BackoffPolicy");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @TypeConverter
    public static int networkTypeToInt(NetworkType networkType) {
        int i = AnonymousClass1.$SwitchMap$androidx$work$NetworkType[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not convert ");
        stringBuilder.append(networkType);
        stringBuilder.append(" to int");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @TypeConverter
    public static NetworkType intToNetworkType(int i) {
        if (i == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i == 1) {
            return NetworkType.CONNECTED;
        }
        if (i == 2) {
            return NetworkType.UNMETERED;
        }
        if (i == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i == 4) {
            return NetworkType.METERED;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not convert ");
        stringBuilder.append(i);
        stringBuilder.append(" to NetworkType");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0062=Splitter:B:31:0x0062, B:16:0x0048=Splitter:B:16:0x0048} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071 A:{SYNTHETIC, Splitter:B:38:0x0071} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A:{SYNTHETIC, Splitter:B:27:0x005a} */
    @androidx.room.TypeConverter
    public static byte[] contentUriTriggersToByteArray(androidx.work.ContentUriTriggers r4) {
        /*
        r0 = r4.size();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r2 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x0054 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0054 }
        r1 = r4.size();	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        r2.writeInt(r1);	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        r4 = r4.getTriggers();	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        r4 = r4.iterator();	 Catch:{ IOException -> 0x004e, all -> 0x004c }
    L_0x0021:
        r1 = r4.hasNext();	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        if (r1 == 0) goto L_0x0040;
    L_0x0027:
        r1 = r4.next();	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        r1 = (androidx.work.ContentUriTriggers.Trigger) r1;	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        r3 = r1.getUri();	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        r3 = r3.toString();	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        r2.writeUTF(r3);	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        r1 = r1.shouldTriggerForDescendants();	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        r2.writeBoolean(r1);	 Catch:{ IOException -> 0x004e, all -> 0x004c }
        goto L_0x0021;
    L_0x0040:
        r2.close();	 Catch:{ IOException -> 0x0044 }
        goto L_0x0048;
    L_0x0044:
        r4 = move-exception;
        r4.printStackTrace();
    L_0x0048:
        r0.close();	 Catch:{ IOException -> 0x0066 }
        goto L_0x006a;
    L_0x004c:
        r4 = move-exception;
        goto L_0x006f;
    L_0x004e:
        r4 = move-exception;
        r1 = r2;
        goto L_0x0055;
    L_0x0051:
        r4 = move-exception;
        r2 = r1;
        goto L_0x006f;
    L_0x0054:
        r4 = move-exception;
    L_0x0055:
        r4.printStackTrace();	 Catch:{ all -> 0x0051 }
        if (r1 == 0) goto L_0x0062;
    L_0x005a:
        r1.close();	 Catch:{ IOException -> 0x005e }
        goto L_0x0062;
    L_0x005e:
        r4 = move-exception;
        r4.printStackTrace();
    L_0x0062:
        r0.close();	 Catch:{ IOException -> 0x0066 }
        goto L_0x006a;
    L_0x0066:
        r4 = move-exception;
        r4.printStackTrace();
    L_0x006a:
        r4 = r0.toByteArray();
        return r4;
    L_0x006f:
        if (r2 == 0) goto L_0x0079;
    L_0x0071:
        r2.close();	 Catch:{ IOException -> 0x0075 }
        goto L_0x0079;
    L_0x0075:
        r1 = move-exception;
        r1.printStackTrace();
    L_0x0079:
        r0.close();	 Catch:{ IOException -> 0x007d }
        goto L_0x0081;
    L_0x007d:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x0081:
        goto L_0x0083;
    L_0x0082:
        throw r4;
    L_0x0083:
        goto L_0x0082;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkTypeConverters.contentUriTriggersToByteArray(androidx.work.ContentUriTriggers):byte[]");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0033=Splitter:B:15:0x0033, B:29:0x004e=Splitter:B:29:0x004e} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A:{SYNTHETIC, Splitter:B:25:0x0046} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a A:{SYNTHETIC, Splitter:B:36:0x005a} */
    @androidx.room.TypeConverter
    public static androidx.work.ContentUriTriggers byteArrayToContentUriTriggers(byte[] r6) {
        /*
        r0 = new androidx.work.ContentUriTriggers;
        r0.<init>();
        if (r6 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = new java.io.ByteArrayInputStream;
        r1.<init>(r6);
        r6 = 0;
        r2 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x003d, all -> 0x0039 }
        r2.<init>(r1);	 Catch:{ IOException -> 0x003d, all -> 0x0039 }
        r6 = r2.readInt();	 Catch:{ IOException -> 0x0037 }
    L_0x0017:
        if (r6 <= 0) goto L_0x002b;
    L_0x0019:
        r3 = r2.readUTF();	 Catch:{ IOException -> 0x0037 }
        r3 = android.net.Uri.parse(r3);	 Catch:{ IOException -> 0x0037 }
        r4 = r2.readBoolean();	 Catch:{ IOException -> 0x0037 }
        r0.add(r3, r4);	 Catch:{ IOException -> 0x0037 }
        r6 = r6 + -1;
        goto L_0x0017;
    L_0x002b:
        r2.close();	 Catch:{ IOException -> 0x002f }
        goto L_0x0033;
    L_0x002f:
        r6 = move-exception;
        r6.printStackTrace();
    L_0x0033:
        r1.close();	 Catch:{ IOException -> 0x0052 }
        goto L_0x0056;
    L_0x0037:
        r6 = move-exception;
        goto L_0x0041;
    L_0x0039:
        r0 = move-exception;
        r2 = r6;
        r6 = r0;
        goto L_0x0058;
    L_0x003d:
        r2 = move-exception;
        r5 = r2;
        r2 = r6;
        r6 = r5;
    L_0x0041:
        r6.printStackTrace();	 Catch:{ all -> 0x0057 }
        if (r2 == 0) goto L_0x004e;
    L_0x0046:
        r2.close();	 Catch:{ IOException -> 0x004a }
        goto L_0x004e;
    L_0x004a:
        r6 = move-exception;
        r6.printStackTrace();
    L_0x004e:
        r1.close();	 Catch:{ IOException -> 0x0052 }
        goto L_0x0056;
    L_0x0052:
        r6 = move-exception;
        r6.printStackTrace();
    L_0x0056:
        return r0;
    L_0x0057:
        r6 = move-exception;
    L_0x0058:
        if (r2 == 0) goto L_0x0062;
    L_0x005a:
        r2.close();	 Catch:{ IOException -> 0x005e }
        goto L_0x0062;
    L_0x005e:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x0062:
        r1.close();	 Catch:{ IOException -> 0x0066 }
        goto L_0x006a;
    L_0x0066:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x006a:
        goto L_0x006c;
    L_0x006b:
        throw r6;
    L_0x006c:
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(byte[]):androidx.work.ContentUriTriggers");
    }

    private WorkTypeConverters() {
    }
}
