package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class Data {
    public static final Data EMPTY = new Builder().build();
    public static final int MAX_DATA_BYTES = 10240;
    private static final String TAG = Logger.tagWithPrefix("Data");
    Map<String, Object> mValues;

    public static final class Builder {
        private Map<String, Object> mValues = new HashMap();

        @NonNull
        public Builder putBoolean(@NonNull String str, boolean z) {
            this.mValues.put(str, Boolean.valueOf(z));
            return this;
        }

        @NonNull
        public Builder putBooleanArray(@NonNull String str, @NonNull boolean[] zArr) {
            this.mValues.put(str, Data.convertPrimitiveBooleanArray(zArr));
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String str, int i) {
            this.mValues.put(str, Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder putIntArray(@NonNull String str, @NonNull int[] iArr) {
            this.mValues.put(str, Data.convertPrimitiveIntArray(iArr));
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String str, long j) {
            this.mValues.put(str, Long.valueOf(j));
            return this;
        }

        @NonNull
        public Builder putLongArray(@NonNull String str, @NonNull long[] jArr) {
            this.mValues.put(str, Data.convertPrimitiveLongArray(jArr));
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String str, float f) {
            this.mValues.put(str, Float.valueOf(f));
            return this;
        }

        @NonNull
        public Builder putFloatArray(@NonNull String str, @NonNull float[] fArr) {
            this.mValues.put(str, Data.convertPrimitiveFloatArray(fArr));
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String str, double d) {
            this.mValues.put(str, Double.valueOf(d));
            return this;
        }

        @NonNull
        public Builder putDoubleArray(@NonNull String str, @NonNull double[] dArr) {
            this.mValues.put(str, Data.convertPrimitiveDoubleArray(dArr));
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String str, @Nullable String str2) {
            this.mValues.put(str, str2);
            return this;
        }

        @NonNull
        public Builder putStringArray(@NonNull String str, @NonNull String[] strArr) {
            this.mValues.put(str, strArr);
            return this;
        }

        @NonNull
        public Builder putAll(@NonNull Data data) {
            putAll(data.mValues);
            return this;
        }

        @NonNull
        public Builder putAll(@NonNull Map<String, Object> map) {
            for (Entry entry : map.entrySet()) {
                put((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP})
        public Builder put(@NonNull String str, @Nullable Object obj) {
            if (obj == null) {
                this.mValues.put(str, null);
            } else {
                Class cls = obj.getClass();
                if (cls == Boolean.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.mValues.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.mValues.put(str, Data.convertPrimitiveBooleanArray((boolean[]) obj));
                } else if (cls == int[].class) {
                    this.mValues.put(str, Data.convertPrimitiveIntArray((int[]) obj));
                } else if (cls == long[].class) {
                    this.mValues.put(str, Data.convertPrimitiveLongArray((long[]) obj));
                } else if (cls == float[].class) {
                    this.mValues.put(str, Data.convertPrimitiveFloatArray((float[]) obj));
                } else if (cls == double[].class) {
                    this.mValues.put(str, Data.convertPrimitiveDoubleArray((double[]) obj));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                }
            }
            return this;
        }

        @NonNull
        public Data build() {
            Data data = new Data(this.mValues);
            Data.toByteArray(data);
            return data;
        }
    }

    Data() {
    }

    public Data(@NonNull Data data) {
        this.mValues = new HashMap(data.mValues);
    }

    Data(@NonNull Map<String, ?> map) {
        this.mValues = new HashMap(map);
    }

    public boolean getBoolean(@NonNull String str, boolean z) {
        Object obj = this.mValues.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    @Nullable
    public boolean[] getBooleanArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (!(obj instanceof Boolean[])) {
            return null;
        }
        Boolean[] boolArr = (Boolean[]) obj;
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            zArr[i] = boolArr[i].booleanValue();
        }
        return zArr;
    }

    public int getInt(@NonNull String str, int i) {
        Object obj = this.mValues.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    @Nullable
    public int[] getIntArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (!(obj instanceof Integer[])) {
            return null;
        }
        Integer[] numArr = (Integer[]) obj;
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public long getLong(@NonNull String str, long j) {
        Object obj = this.mValues.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    @Nullable
    public long[] getLongArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (!(obj instanceof Long[])) {
            return null;
        }
        Long[] lArr = (Long[]) obj;
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    public float getFloat(@NonNull String str, float f) {
        Object obj = this.mValues.get(str);
        return obj instanceof Float ? ((Float) obj).floatValue() : f;
    }

    @Nullable
    public float[] getFloatArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (!(obj instanceof Float[])) {
            return null;
        }
        Float[] fArr = (Float[]) obj;
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    public double getDouble(@NonNull String str, double d) {
        Object obj = this.mValues.get(str);
        return obj instanceof Double ? ((Double) obj).doubleValue() : d;
    }

    @Nullable
    public double[] getDoubleArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (!(obj instanceof Double[])) {
            return null;
        }
        Double[] dArr = (Double[]) obj;
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = dArr[i].doubleValue();
        }
        return dArr2;
    }

    @Nullable
    public String getString(@NonNull String str) {
        Object obj = this.mValues.get(str);
        return obj instanceof String ? (String) obj : null;
    }

    @Nullable
    public String[] getStringArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        return obj instanceof String[] ? (String[]) obj : null;
    }

    @NonNull
    public Map<String, Object> getKeyValueMap() {
        return Collections.unmodifiableMap(this.mValues);
    }

    @VisibleForTesting
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int size() {
        return this.mValues.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A:{SYNTHETIC, Splitter:B:32:0x0078} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008f A:{SYNTHETIC, Splitter:B:42:0x008f} */
    @androidx.room.TypeConverter
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] toByteArray(@androidx.annotation.NonNull androidx.work.Data r5) {
        /*
        r0 = "Error in Data#toByteArray: ";
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r2 = 0;
        r3 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x006c }
        r3.<init>(r1);	 Catch:{ IOException -> 0x006c }
        r2 = r5.size();	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        r3.writeInt(r2);	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        r5 = r5.mValues;	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        r5 = r5.entrySet();	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        r5 = r5.iterator();	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
    L_0x001e:
        r2 = r5.hasNext();	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        if (r2 == 0) goto L_0x003b;
    L_0x0024:
        r2 = r5.next();	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        r4 = r2.getKey();	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        r4 = (java.lang.String) r4;	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        r3.writeUTF(r4);	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        r2 = r2.getValue();	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        r3.writeObject(r2);	 Catch:{ IOException -> 0x0066, all -> 0x0064 }
        goto L_0x001e;
    L_0x003b:
        r3.close();	 Catch:{ IOException -> 0x003f }
        goto L_0x0045;
    L_0x003f:
        r5 = move-exception;
        r2 = TAG;
        android.util.Log.e(r2, r0, r5);
    L_0x0045:
        r1.close();	 Catch:{ IOException -> 0x0049 }
        goto L_0x004f;
    L_0x0049:
        r5 = move-exception;
        r2 = TAG;
        android.util.Log.e(r2, r0, r5);
    L_0x004f:
        r5 = r1.size();
        r0 = 10240; // 0x2800 float:1.4349E-41 double:5.059E-320;
        if (r5 > r0) goto L_0x005c;
    L_0x0057:
        r5 = r1.toByteArray();
        return r5;
    L_0x005c:
        r5 = new java.lang.IllegalStateException;
        r0 = "Data cannot occupy more than 10240 bytes when serialized";
        r5.<init>(r0);
        throw r5;
    L_0x0064:
        r5 = move-exception;
        goto L_0x008d;
    L_0x0066:
        r5 = move-exception;
        r2 = r3;
        goto L_0x006d;
    L_0x0069:
        r5 = move-exception;
        r3 = r2;
        goto L_0x008d;
    L_0x006c:
        r5 = move-exception;
    L_0x006d:
        r3 = TAG;	 Catch:{ all -> 0x0069 }
        android.util.Log.e(r3, r0, r5);	 Catch:{ all -> 0x0069 }
        r5 = r1.toByteArray();	 Catch:{ all -> 0x0069 }
        if (r2 == 0) goto L_0x0082;
    L_0x0078:
        r2.close();	 Catch:{ IOException -> 0x007c }
        goto L_0x0082;
    L_0x007c:
        r2 = move-exception;
        r3 = TAG;
        android.util.Log.e(r3, r0, r2);
    L_0x0082:
        r1.close();	 Catch:{ IOException -> 0x0086 }
        goto L_0x008c;
    L_0x0086:
        r1 = move-exception;
        r2 = TAG;
        android.util.Log.e(r2, r0, r1);
    L_0x008c:
        return r5;
    L_0x008d:
        if (r3 == 0) goto L_0x0099;
    L_0x008f:
        r3.close();	 Catch:{ IOException -> 0x0093 }
        goto L_0x0099;
    L_0x0093:
        r2 = move-exception;
        r3 = TAG;
        android.util.Log.e(r3, r0, r2);
    L_0x0099:
        r1.close();	 Catch:{ IOException -> 0x009d }
        goto L_0x00a3;
    L_0x009d:
        r1 = move-exception;
        r2 = TAG;
        android.util.Log.e(r2, r0, r1);
    L_0x00a3:
        goto L_0x00a5;
    L_0x00a4:
        throw r5;
    L_0x00a5:
        goto L_0x00a4;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.toByteArray(androidx.work.Data):byte[]");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0035=Splitter:B:14:0x0035, B:28:0x0058=Splitter:B:28:0x0058} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b A:{SYNTHETIC, Splitter:B:36:0x006b} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A:{SYNTHETIC, Splitter:B:24:0x004e} */
    @androidx.room.TypeConverter
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static androidx.work.Data fromByteArray(@androidx.annotation.NonNull byte[] r7) {
        /*
        r0 = "Error in Data#fromByteArray: ";
        r1 = r7.length;
        r2 = 10240; // 0x2800 float:1.4349E-41 double:5.059E-320;
        if (r1 > r2) goto L_0x0080;
    L_0x0007:
        r1 = new java.util.HashMap;
        r1.<init>();
        r2 = new java.io.ByteArrayInputStream;
        r2.<init>(r7);
        r7 = 0;
        r3 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x0043, IOException | ClassNotFoundException -> 0x0041, all -> 0x003d }
        r3.<init>(r2);	 Catch:{ IOException -> 0x0043, IOException | ClassNotFoundException -> 0x0041, all -> 0x003d }
        r7 = r3.readInt();	 Catch:{ IOException -> 0x003b, IOException | ClassNotFoundException -> 0x0039 }
    L_0x001b:
        if (r7 <= 0) goto L_0x002b;
    L_0x001d:
        r4 = r3.readUTF();	 Catch:{ IOException -> 0x003b, IOException | ClassNotFoundException -> 0x0039 }
        r5 = r3.readObject();	 Catch:{ IOException -> 0x003b, IOException | ClassNotFoundException -> 0x0039 }
        r1.put(r4, r5);	 Catch:{ IOException -> 0x003b, IOException | ClassNotFoundException -> 0x0039 }
        r7 = r7 + -1;
        goto L_0x001b;
    L_0x002b:
        r3.close();	 Catch:{ IOException -> 0x002f }
        goto L_0x0035;
    L_0x002f:
        r7 = move-exception;
        r3 = TAG;
        android.util.Log.e(r3, r0, r7);
    L_0x0035:
        r2.close();	 Catch:{ IOException -> 0x005c }
        goto L_0x0062;
    L_0x0039:
        r7 = move-exception;
        goto L_0x0047;
    L_0x003b:
        r7 = move-exception;
        goto L_0x0047;
    L_0x003d:
        r1 = move-exception;
        r3 = r7;
        r7 = r1;
        goto L_0x0069;
    L_0x0041:
        r3 = move-exception;
        goto L_0x0044;
    L_0x0043:
        r3 = move-exception;
    L_0x0044:
        r6 = r3;
        r3 = r7;
        r7 = r6;
    L_0x0047:
        r4 = TAG;	 Catch:{ all -> 0x0068 }
        android.util.Log.e(r4, r0, r7);	 Catch:{ all -> 0x0068 }
        if (r3 == 0) goto L_0x0058;
    L_0x004e:
        r3.close();	 Catch:{ IOException -> 0x0052 }
        goto L_0x0058;
    L_0x0052:
        r7 = move-exception;
        r3 = TAG;
        android.util.Log.e(r3, r0, r7);
    L_0x0058:
        r2.close();	 Catch:{ IOException -> 0x005c }
        goto L_0x0062;
    L_0x005c:
        r7 = move-exception;
        r2 = TAG;
        android.util.Log.e(r2, r0, r7);
    L_0x0062:
        r7 = new androidx.work.Data;
        r7.<init>(r1);
        return r7;
    L_0x0068:
        r7 = move-exception;
    L_0x0069:
        if (r3 == 0) goto L_0x0075;
    L_0x006b:
        r3.close();	 Catch:{ IOException -> 0x006f }
        goto L_0x0075;
    L_0x006f:
        r1 = move-exception;
        r3 = TAG;
        android.util.Log.e(r3, r0, r1);
    L_0x0075:
        r2.close();	 Catch:{ IOException -> 0x0079 }
        goto L_0x007f;
    L_0x0079:
        r1 = move-exception;
        r2 = TAG;
        android.util.Log.e(r2, r0, r1);
    L_0x007f:
        throw r7;
    L_0x0080:
        r7 = new java.lang.IllegalStateException;
        r0 = "Data cannot occupy more than 10240 bytes when serialized";
        r7.<init>(r0);
        goto L_0x0089;
    L_0x0088:
        throw r7;
    L_0x0089:
        goto L_0x0088;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.fromByteArray(byte[]):androidx.work.Data");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mValues.equals(((Data) obj).mValues);
    }

    public int hashCode() {
        return this.mValues.hashCode() * 31;
    }

    @NonNull
    static Boolean[] convertPrimitiveBooleanArray(@NonNull boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @NonNull
    static Integer[] convertPrimitiveIntArray(@NonNull int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @NonNull
    static Long[] convertPrimitiveLongArray(@NonNull long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @NonNull
    static Float[] convertPrimitiveFloatArray(@NonNull float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @NonNull
    static Double[] convertPrimitiveDoubleArray(@NonNull double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }
}
